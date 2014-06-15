package com.braunster.chatsdk.dao;

import java.util.List;
import com.braunster.chatsdk.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
import com.braunster.chatsdk.firebase.BPath;
import java.util.List;
import java.util.Map;
// KEEP INCLUDES END
/**
 * Entity mapped to table BUSER.
 */
public class BUser extends Entity  {

    private String entityID;
    private String authentication_id;
    private String facebookID;
    private Boolean dirty;
    private String name;
    private java.util.Date lastOnline;
    private java.util.Date lastUpdated;
    private Integer fontSize;
    private String fontName;
    private String textColor;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient BUserDao myDao;

    private List<BLinkedContact> BLinkedContact;
    private List<BLinkedAccount> BLinkedAccount;
    private List<BMetadata> BMetadata;
    private List<BMessage> messages;
    private List<BThread> threads;
    private List<BThread> threadsCreated;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public BUser() {
    }

    public BUser(String entityID) {
        this.entityID = entityID;
    }

    public BUser(String entityID, String authentication_id, String facebookID, Boolean dirty, String name, java.util.Date lastOnline, java.util.Date lastUpdated, Integer fontSize, String fontName, String textColor) {
        this.entityID = entityID;
        this.authentication_id = authentication_id;
        this.facebookID = facebookID;
        this.dirty = dirty;
        this.name = name;
        this.lastOnline = lastOnline;
        this.lastUpdated = lastUpdated;
        this.fontSize = fontSize;
        this.fontName = fontName;
        this.textColor = textColor;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getBUserDao() : null;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String getAuthentication_id() {
        return authentication_id;
    }

    public void setAuthentication_id(String authentication_id) {
        this.authentication_id = authentication_id;
    }

    public String getFacebookID() {
        return facebookID;
    }

    public void setFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }

    public Boolean getDirty() {
        return dirty;
    }

    public void setDirty(Boolean dirty) {
        this.dirty = dirty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(java.util.Date lastOnline) {
        this.lastOnline = lastOnline;
    }

    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BLinkedContact> getBLinkedContact() {
        if (BLinkedContact == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BLinkedContactDao targetDao = daoSession.getBLinkedContactDao();
            List<BLinkedContact> BLinkedContactNew = targetDao._queryBUser_BLinkedContact(entityID);
            synchronized (this) {
                if(BLinkedContact == null) {
                    BLinkedContact = BLinkedContactNew;
                }
            }
        }
        return BLinkedContact;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBLinkedContact() {
        BLinkedContact = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BLinkedAccount> getBLinkedAccount() {
        if (BLinkedAccount == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BLinkedAccountDao targetDao = daoSession.getBLinkedAccountDao();
            List<BLinkedAccount> BLinkedAccountNew = targetDao._queryBUser_BLinkedAccount(entityID);
            synchronized (this) {
                if(BLinkedAccount == null) {
                    BLinkedAccount = BLinkedAccountNew;
                }
            }
        }
        return BLinkedAccount;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBLinkedAccount() {
        BLinkedAccount = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BMetadata> getBMetadata() {
        if (BMetadata == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BMetadataDao targetDao = daoSession.getBMetadataDao();
            List<BMetadata> BMetadataNew = targetDao._queryBUser_BMetadata(entityID);
            synchronized (this) {
                if(BMetadata == null) {
                    BMetadata = BMetadataNew;
                }
            }
        }
        return BMetadata;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBMetadata() {
        BMetadata = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BMessage> getMessages() {
        if (messages == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BMessageDao targetDao = daoSession.getBMessageDao();
            List<BMessage> messagesNew = targetDao._queryBUser_Messages(entityID);
            synchronized (this) {
                if(messages == null) {
                    messages = messagesNew;
                }
            }
        }
        return messages;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetMessages() {
        messages = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BThread> getThreads() {
        if (threads == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BThreadDao targetDao = daoSession.getBThreadDao();
            List<BThread> threadsNew = targetDao._queryBUser_Threads(entityID);
            synchronized (this) {
                if(threads == null) {
                    threads = threadsNew;
                }
            }
        }
        return threads;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetThreads() {
        threads = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BThread> getThreadsCreated() {
        if (threadsCreated == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BThreadDao targetDao = daoSession.getBThreadDao();
            List<BThread> threadsCreatedNew = targetDao._queryBUser_ThreadsCreated(entityID);
            synchronized (this) {
                if(threadsCreated == null) {
                    threadsCreated = threadsCreatedNew;
                }
            }
        }
        return threadsCreated;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetThreadsCreated() {
        threadsCreated = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
