/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.User;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.PropertyImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.PropertyImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.PropertyImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.PropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.PropertyImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.PropertyImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.PropertyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.PropertyImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.PropertyImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.PropertyImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected static final String PURPOSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected String purpose = PURPOSE_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreationDate()
     * @generated
     * @ordered
     */
    protected static final Date CREATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreationDate()
     * @generated
     * @ordered
     */
    protected Date creationDate = CREATION_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getModificationDate() <em>Modification Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getModificationDate()
     * @generated
     * @ordered
     */
    protected static final Date MODIFICATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModificationDate() <em>Modification Date</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getModificationDate()
     * @generated
     * @ordered
     */
    protected Date modificationDate = MODIFICATION_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getStatusCode() <em>Status Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatusCode()
     * @generated
     * @ordered
     */
    protected static final String STATUS_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatusCode() <em>Status Code</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getStatusCode()
     * @generated
     * @ordered
     */
    protected String statusCode = STATUS_CODE_EDEFAULT;

    /**
     * The cached value of the '{@link #getItem() <em>Item</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getItem()
     * @generated
     * @ordered
     */
    protected Item item = null;

    /**
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected User author = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.PROPERTY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPurpose(String newPurpose) {
        String oldPurpose = purpose;
        purpose = newPurpose;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__PURPOSE, oldPurpose, purpose));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCreationDate(Date newCreationDate) {
        Date oldCreationDate = creationDate;
        creationDate = newCreationDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__CREATION_DATE, oldCreationDate, creationDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Date getModificationDate() {
        return modificationDate;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setModificationDate(Date newModificationDate) {
        Date oldModificationDate = modificationDate;
        modificationDate = newModificationDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__MODIFICATION_DATE, oldModificationDate, modificationDate));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public User getAuthor() {
        if (author != null && author.eIsProxy()) {
            InternalEObject oldAuthor = (InternalEObject)author;
            author = (User)eResolveProxy(oldAuthor);
            if (author != oldAuthor) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROPERTY__AUTHOR, oldAuthor, author));
            }
        }
        return author;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public User basicGetAuthor() {
        return author;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAuthor(User newAuthor) {
        User oldAuthor = author;
        author = newAuthor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__AUTHOR, oldAuthor, author));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setStatusCode(String newStatusCode) {
        String oldStatusCode = statusCode;
        statusCode = newStatusCode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__STATUS_CODE, oldStatusCode, statusCode));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Item getItem() {
        if (item != null && item.eIsProxy()) {
            InternalEObject oldItem = (InternalEObject)item;
            item = (Item)eResolveProxy(oldItem);
            if (item != oldItem) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.PROPERTY__ITEM, oldItem, item));
            }
        }
        return item;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Item basicGetItem() {
        return item;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetItem(Item newItem, NotificationChain msgs) {
        Item oldItem = item;
        item = newItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__ITEM, oldItem, newItem);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setItem(Item newItem) {
        if (newItem != item) {
            NotificationChain msgs = null;
            if (item != null)
                msgs = ((InternalEObject)item).eInverseRemove(this, PropertiesPackage.ITEM__PROPERTY, Item.class, msgs);
            if (newItem != null)
                msgs = ((InternalEObject)newItem).eInverseAdd(this, PropertiesPackage.ITEM__PROPERTY, Item.class, msgs);
            msgs = basicSetItem(newItem, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.PROPERTY__ITEM, newItem, newItem));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.PROPERTY__ITEM:
                if (item != null)
                    msgs = ((InternalEObject)item).eInverseRemove(this, PropertiesPackage.ITEM__PROPERTY, Item.class, msgs);
                return basicSetItem((Item)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.PROPERTY__ITEM:
                return basicSetItem(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.PROPERTY__ID:
                return getId();
            case PropertiesPackage.PROPERTY__LABEL:
                return getLabel();
            case PropertiesPackage.PROPERTY__PURPOSE:
                return getPurpose();
            case PropertiesPackage.PROPERTY__DESCRIPTION:
                return getDescription();
            case PropertiesPackage.PROPERTY__CREATION_DATE:
                return getCreationDate();
            case PropertiesPackage.PROPERTY__MODIFICATION_DATE:
                return getModificationDate();
            case PropertiesPackage.PROPERTY__VERSION:
                return getVersion();
            case PropertiesPackage.PROPERTY__STATUS_CODE:
                return getStatusCode();
            case PropertiesPackage.PROPERTY__ITEM:
                if (resolve) return getItem();
                return basicGetItem();
            case PropertiesPackage.PROPERTY__AUTHOR:
                if (resolve) return getAuthor();
                return basicGetAuthor();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.PROPERTY__ID:
                setId((String)newValue);
                return;
            case PropertiesPackage.PROPERTY__LABEL:
                setLabel((String)newValue);
                return;
            case PropertiesPackage.PROPERTY__PURPOSE:
                setPurpose((String)newValue);
                return;
            case PropertiesPackage.PROPERTY__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case PropertiesPackage.PROPERTY__CREATION_DATE:
                setCreationDate((Date)newValue);
                return;
            case PropertiesPackage.PROPERTY__MODIFICATION_DATE:
                setModificationDate((Date)newValue);
                return;
            case PropertiesPackage.PROPERTY__VERSION:
                setVersion((String)newValue);
                return;
            case PropertiesPackage.PROPERTY__STATUS_CODE:
                setStatusCode((String)newValue);
                return;
            case PropertiesPackage.PROPERTY__ITEM:
                setItem((Item)newValue);
                return;
            case PropertiesPackage.PROPERTY__AUTHOR:
                setAuthor((User)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case PropertiesPackage.PROPERTY__ID:
                setId(ID_EDEFAULT);
                return;
            case PropertiesPackage.PROPERTY__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case PropertiesPackage.PROPERTY__PURPOSE:
                setPurpose(PURPOSE_EDEFAULT);
                return;
            case PropertiesPackage.PROPERTY__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case PropertiesPackage.PROPERTY__CREATION_DATE:
                setCreationDate(CREATION_DATE_EDEFAULT);
                return;
            case PropertiesPackage.PROPERTY__MODIFICATION_DATE:
                setModificationDate(MODIFICATION_DATE_EDEFAULT);
                return;
            case PropertiesPackage.PROPERTY__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case PropertiesPackage.PROPERTY__STATUS_CODE:
                setStatusCode(STATUS_CODE_EDEFAULT);
                return;
            case PropertiesPackage.PROPERTY__ITEM:
                setItem((Item)null);
                return;
            case PropertiesPackage.PROPERTY__AUTHOR:
                setAuthor((User)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PropertiesPackage.PROPERTY__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case PropertiesPackage.PROPERTY__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case PropertiesPackage.PROPERTY__PURPOSE:
                return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
            case PropertiesPackage.PROPERTY__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case PropertiesPackage.PROPERTY__CREATION_DATE:
                return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
            case PropertiesPackage.PROPERTY__MODIFICATION_DATE:
                return MODIFICATION_DATE_EDEFAULT == null ? modificationDate != null : !MODIFICATION_DATE_EDEFAULT.equals(modificationDate);
            case PropertiesPackage.PROPERTY__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
            case PropertiesPackage.PROPERTY__STATUS_CODE:
                return STATUS_CODE_EDEFAULT == null ? statusCode != null : !STATUS_CODE_EDEFAULT.equals(statusCode);
            case PropertiesPackage.PROPERTY__ITEM:
                return item != null;
            case PropertiesPackage.PROPERTY__AUTHOR:
                return author != null;
        }
        return super.eIsSet(featureID);
    }

    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer();
        result.append("(id: "); //$NON-NLS-1$
        result.append(id);
        result.append(", label: "); //$NON-NLS-1$
        result.append(label);
        result.append(')');
        return result.toString();
    }

} // PropertyImpl
