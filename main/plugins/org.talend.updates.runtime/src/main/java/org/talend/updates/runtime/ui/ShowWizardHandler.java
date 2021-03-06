package org.talend.updates.runtime.ui;

import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.updates.runtime.i18n.Messages;
import org.talend.updates.runtime.model.ExtraFeature;

public class ShowWizardHandler extends AbstractHandler {

    public static final String CMD_ID_ADDITIONAL_PACKAGES = "org.talend.updates.show.wizard.command"; //$NON-NLS-1$

    public static final Object showWizardLock = new Object();

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Shell activeShell = HandlerUtil.getActiveShell(event);

        String cmdId = CMD_ID_ADDITIONAL_PACKAGES;
        if (event != null) {
            Command command = event.getCommand();
            if (command != null) {
                String id = command.getId();
                if (StringUtils.isNotBlank(id)) {
                    cmdId = id;
                }
            }
        }
        switch (cmdId) {
        case CMD_ID_ADDITIONAL_PACKAGES:
            showUpdateWizard(activeShell, null);
            break;
        default:
            ExceptionHandler.process(new Exception(Messages.getString("ShowWizardHandler.exception.commandNotFound"))); //$NON-NLS-1$
            break;
        }

        return null;
    }

    /**
     * This shows the talend update wizard, this should be the only method called to show the wizard.
     * 
     * @param shell, the shell used to display the wizard
     * @param uninstalledExtraFeatures the list of features that may be installled. May be null and if that is the case
     * then the list is computed again.
     */
    public void showUpdateWizard(final Shell shell, Set<ExtraFeature> uninstalledExtraFeatures) {
        Set<ExtraFeature> extraFeatures = uninstalledExtraFeatures;
        UpdateStudioWizard updateStudioWizard = new UpdateStudioWizard(extraFeatures);
        updateStudioWizard.show(shell);
    }

}
