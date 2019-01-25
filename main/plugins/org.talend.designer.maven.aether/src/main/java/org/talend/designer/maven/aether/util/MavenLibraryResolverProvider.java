// ============================================================================
//
// Copyright (C) 2006-2018 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.maven.aether.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.maven.repository.internal.MavenRepositorySystemUtils;
import org.eclipse.aether.DefaultRepositorySystemSession;
import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.connector.basic.BasicRepositoryConnectorFactory;
import org.eclipse.aether.impl.DefaultServiceLocator;
import org.eclipse.aether.repository.Authentication;
import org.eclipse.aether.repository.LocalRepository;
import org.eclipse.aether.repository.RemoteRepository;
import org.eclipse.aether.resolution.ArtifactDescriptorRequest;
import org.eclipse.aether.resolution.ArtifactDescriptorResult;
import org.eclipse.aether.resolution.ArtifactRequest;
import org.eclipse.aether.resolution.ArtifactResult;
import org.eclipse.aether.spi.connector.RepositoryConnectorFactory;
import org.eclipse.aether.spi.connector.transport.TransporterFactory;
import org.eclipse.aether.transport.file.FileTransporterFactory;
import org.eclipse.aether.transport.http.HttpTransporterFactory;
import org.eclipse.aether.util.repository.AuthenticationBuilder;
import org.eclipse.m2e.core.MavenPlugin;
import org.talend.core.nexus.ArtifactRepositoryBean;
import org.talend.core.nexus.TalendLibsServerManager;
import org.talend.core.runtime.maven.MavenArtifact;

public class MavenLibraryResolverProvider {

    private static Map<String, RemoteRepository> urlToRepositoryMap = new HashMap<String, RemoteRepository>();

    private RepositorySystem defaultRepoSystem;

    private RepositorySystemSession defaultRepoSystemSession;

    private RemoteRepository defaultRemoteRepository = null;

    private static MavenLibraryResolverProvider instance;

    public static MavenLibraryResolverProvider getInstance() {
        if (instance == null) {
            synchronized (MavenLibraryResolverProvider.class) {
                if (instance == null) {
                    instance = new MavenLibraryResolverProvider();
                }
            }
        }
        return instance;
    }

    private MavenLibraryResolverProvider() {
        defaultRepoSystem = newRepositorySystem();
        defaultRepoSystemSession = newSession(defaultRepoSystem, MavenPlugin.getMaven().getLocalRepositoryPath());
        ArtifactRepositoryBean talendServer = TalendLibsServerManager.getInstance().getTalentArtifactServer();
        if (talendServer.getUserName() == null && talendServer.getPassword() == null) {
            defaultRemoteRepository = new RemoteRepository.Builder("talend", "default", talendServer.getRepositoryURL()).build();
        } else {
            Authentication authentication = new AuthenticationBuilder().addUsername(talendServer.getUserName())
                    .addPassword(talendServer.getPassword()).build();
            defaultRemoteRepository = new RemoteRepository.Builder("talend", "default", talendServer.getRepositoryURL())
                    .setAuthentication(authentication).build();
        }
    }

    public ArtifactResult resolveArtifact(MavenArtifact aritfact) throws Exception {
        RemoteRepository remoteRepo = getRemoteRepositroy(aritfact);
        Artifact artifact = new DefaultArtifact(aritfact.getGroupId(), aritfact.getArtifactId(), aritfact.getClassifier(),
                aritfact.getType(), aritfact.getVersion());
        ArtifactRequest artifactRequest = new ArtifactRequest();
        artifactRequest.addRepository(remoteRepo);
        artifactRequest.setArtifact(artifact);
        ArtifactResult result = defaultRepoSystem.resolveArtifact(defaultRepoSystemSession, artifactRequest);
        return result;
    }

    public Map<String, Object> resolveDescProperties(MavenArtifact aritfact) throws Exception {
        RemoteRepository remoteRepo = getRemoteRepositroy(aritfact);
        Artifact artifact = new DefaultArtifact(aritfact.getGroupId(), aritfact.getArtifactId(), aritfact.getClassifier(),
                aritfact.getType(), aritfact.getVersion());
        ArtifactDescriptorRequest artifactRequest = new ArtifactDescriptorRequest();
        artifactRequest.addRepository(remoteRepo);
        artifactRequest.setArtifact(artifact);
        ArtifactDescriptorResult result = defaultRepoSystem.readArtifactDescriptor(defaultRepoSystemSession, artifactRequest);
        return result.getProperties();
    }

    public RemoteRepository getRemoteRepositroy(MavenArtifact aritfact) {
        if (aritfact != null && aritfact.getRepositoryUrl() != null) {
            if (urlToRepositoryMap.containsKey(aritfact.getRepositoryUrl())) {
                return urlToRepositoryMap.get(aritfact.getRepositoryUrl());
            }

            RemoteRepository repository = buildRemoteRepository(aritfact);
            urlToRepositoryMap.put(aritfact.getRepositoryUrl(), repository);
            return repository;
        }
        return defaultRemoteRepository;
    }

    private RemoteRepository buildRemoteRepository(MavenArtifact aritfact) {
        RemoteRepository repository = null;
        if (aritfact.getUsername() == null && aritfact.getPassword() == null) {
            repository = new RemoteRepository.Builder("talend", "default", aritfact.getRepositoryUrl()).build();
        } else {
            Authentication authentication = new AuthenticationBuilder().addUsername(aritfact.getUsername())
                    .addPassword(aritfact.getPassword()).build();
            repository = new RemoteRepository.Builder("talend", "default", aritfact.getRepositoryUrl())
                    .setAuthentication(authentication).build();
        }
        return repository;
    }

    private RepositorySystem newRepositorySystem() {
        DefaultServiceLocator locator = MavenRepositorySystemUtils.newServiceLocator();
        locator.addService(RepositoryConnectorFactory.class, BasicRepositoryConnectorFactory.class);
        locator.addService(TransporterFactory.class, FileTransporterFactory.class);
        locator.addService(TransporterFactory.class, HttpTransporterFactory.class);

        return locator.getService(RepositorySystem.class);
    }

    private RepositorySystemSession newSession(RepositorySystem system, String target) {
        DefaultRepositorySystemSession session = MavenRepositorySystemUtils.newSession();

        LocalRepository localRepo = new LocalRepository( /* "target/local-repo" */target);
        session.setLocalRepositoryManager(system.newLocalRepositoryManager(session, localRepo));

        return session;
    }
}