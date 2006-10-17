/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.talend.core.model.properties.PropertiesPackage
 * @generated
 */
public interface PropertiesFactory extends EFactory {

    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    PropertiesFactory eINSTANCE = org.talend.core.model.properties.impl.PropertiesFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Status</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Status</em>'.
     * @generated
     */
    Status createStatus();

    /**
     * Returns a new object of class '<em>Project</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Project</em>'.
     * @generated
     */
    Project createProject();

    /**
     * Returns a new object of class '<em>Property</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns a new object of class '<em>Business Process Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Business Process Item</em>'.
     * @generated
     */
    BusinessProcessItem createBusinessProcessItem();

    /**
     * Returns a new object of class '<em>Item State</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Item State</em>'.
     * @generated
     */
    ItemState createItemState();

    /**
     * Returns a new object of class '<em>Documentation Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Documentation Item</em>'.
     * @generated
     */
    DocumentationItem createDocumentationItem();

    /**
     * Returns a new object of class '<em>Routine Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Routine Item</em>'.
     * @generated
     */
    RoutineItem createRoutineItem();

    /**
     * Returns a new object of class '<em>Byte Array</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Byte Array</em>'.
     * @generated
     */
    ByteArray createByteArray();

    /**
     * Returns a new object of class '<em>Connection Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Connection Item</em>'.
     * @generated
     */
    ConnectionItem createConnectionItem();

    /**
     * Returns a new object of class '<em>Delimited File Connection Item</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Delimited File Connection Item</em>'.
     * @generated
     */
    DelimitedFileConnectionItem createDelimitedFileConnectionItem();

    /**
     * Returns a new object of class '<em>Positional File Connection Item</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Positional File Connection Item</em>'.
     * @generated
     */
    PositionalFileConnectionItem createPositionalFileConnectionItem();

    /**
     * Returns a new object of class '<em>Reg Ex File Connection Item</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Reg Ex File Connection Item</em>'.
     * @generated
     */
    RegExFileConnectionItem createRegExFileConnectionItem();

    /**
     * Returns a new object of class '<em>CSV File Connection Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return a new object of class '<em>CSV File Connection Item</em>'.
     * @generated
     */
    CSVFileConnectionItem createCSVFileConnectionItem();

    /**
     * Returns a new object of class '<em>Database Connection Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return a new object of class '<em>Database Connection Item</em>'.
     * @generated
     */
    DatabaseConnectionItem createDatabaseConnectionItem();

    /**
     * Returns a new object of class '<em>Process Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Process Item</em>'.
     * @generated
     */
    ProcessItem createProcessItem();

    /**
     * Returns a new object of class '<em>User</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>User</em>'.
     * @generated
     */
    User createUser();

    /**
     * Returns a new object of class '<em>Folder Item</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Folder Item</em>'.
     * @generated
     */
    FolderItem createFolderItem();

    /**
     * Returns a new object of class '<em>Component</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Component</em>'.
     * @generated
     */
    Component createComponent();

    /**
     * Returns a new object of class '<em>Notation Holder</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Notation Holder</em>'.
     * @generated
     */
    NotationHolder createNotationHolder();

    /**
     * Returns a new object of class '<em>User Role</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>User Role</em>'.
     * @generated
     */
    UserRole createUserRole();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    PropertiesPackage getPropertiesPackage();

} // PropertiesFactory
