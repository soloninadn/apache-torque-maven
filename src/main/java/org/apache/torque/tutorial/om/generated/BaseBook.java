package org.apache.torque.tutorial.om.generated;

import java.io.Serializable;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.torque.TorqueException;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.om.ColumnAccessByName;
import org.apache.torque.util.Transaction;
import org.apache.commons.lang.ObjectUtils;


/**
 * Book Table
 *
 * This class was autogenerated by Torque on:
 *
 * [Mon Apr 25 22:12:23 AZT 2022]
 *
 * You should not use this class directly.  It should not even be
 * extended; all references should be to Book
 */
public abstract class BaseBook 
    implements Persistent, Serializable, ColumnAccessByName
{
    /** Serial version */
    private static final long serialVersionUID = 1650910343438L;



    /** Book Id */
    private int bookId = 0;

    /** Book Title */
    private String title = null;

    /** ISBN Number */
    private String iSBN = null;

    /** Foreign Key Publisher */
    private int publisherId = 0;

    /** Foreign Key Author */
    private int authorId = 0;

    /** Whether this object was modified after loading or after last save. */
    private boolean modified = true;

    /** 
     * Whether this object was loaded from the database or already saved 
     * (false) or whether it is not yet in the database(true).
     */
    private boolean isNew = true;

    /** Flag which indicates whether this object is currently saving. */
    private boolean saving = false;

    /** 
     * Flag which indicates whether this object is currently loaded
     * from the database. 
     */
    private boolean loading = false;

    /** 
     * Flag which indicates whether this object was deleted from the database.
     * Note that this flags does not always display the current database state,
     * there is no magical connection between this flag and the database.
     */
    private boolean deleted = false;

    /** Defines the aPublisher field. */
    private Publisher aPublisher = null;

    /** Defines the aAuthor field. */
    private Author aAuthor = null;





    /**
     * Get the value of bookId.
     * The field is described as follows: 
     * Book Id
     *
     * @return int
     */
    public int getBookId() 
    {
        
        return bookId;
    }

    /**
     * Set the value of bookId.
     * The field is described as follows: 
     * Book Id
     *
     * @param v new value
     */
    public void setBookId(int v)
    {
        if (this.bookId != v)
        {
            setModified(true);
        }

        this.bookId = v;


    }
    
    /**
     * Get the value of title.
     * The field is described as follows: 
     * Book Title
     *
     * @return String
     */
    public String getTitle() 
    {
        
        return title;
    }

    /**
     * Set the value of title.
     * The field is described as follows: 
     * Book Title
     *
     * @param v new value
     */
    public void setTitle(String v)
    {
        if (!ObjectUtils.equals(this.title, v))
        {
            setModified(true);
        }

        this.title = v;


    }
    
    /**
     * Get the value of iSBN.
     * The field is described as follows: 
     * ISBN Number
     *
     * @return String
     */
    public String getISBN() 
    {
        
        return iSBN;
    }

    /**
     * Set the value of iSBN.
     * The field is described as follows: 
     * ISBN Number
     *
     * @param v new value
     */
    public void setISBN(String v)
    {
        if (!ObjectUtils.equals(this.iSBN, v))
        {
            setModified(true);
        }

        this.iSBN = v;


    }
    
    /**
     * Get the value of publisherId.
     * The field is described as follows: 
     * Foreign Key Publisher
     *
     * @return int
     */
    public int getPublisherId() 
    {
        
        return publisherId;
    }

    /**
     * Set the value of publisherId.
     * The field is described as follows: 
     * Foreign Key Publisher
     *
     * @param v new value
     */
    public void setPublisherId(int v)
    {
        if (this.publisherId != v)
        {
            setModified(true);
        }

        this.publisherId = v;
        if (aPublisher != null && aPublisher.getPublisherId() != v)
        {
            aPublisher = null;
        }


    }
    
    /**
     * Get the value of authorId.
     * The field is described as follows: 
     * Foreign Key Author
     *
     * @return int
     */
    public int getAuthorId() 
    {
        
        return authorId;
    }

    /**
     * Set the value of authorId.
     * The field is described as follows: 
     * Foreign Key Author
     *
     * @param v new value
     */
    public void setAuthorId(int v)
    {
        if (this.authorId != v)
        {
            setModified(true);
        }

        this.authorId = v;
        if (aAuthor != null && aAuthor.getAuthorId() != v)
        {
            aAuthor = null;
        }


    }
    

    /**
     * Returns whether the object has ever been saved.  This will
     * be false, if the object was retrieved from storage or was created
     * and then saved.
     *
     * @return true, if the object has never been persisted.
     */
    public boolean isNew()
    {
        return isNew;
    }

    /**
     * Sets whether the object has ever been saved.
     *
     * @param isNew true if the object has never been saved, false otherwise.
     */
    public void setNew(boolean isNew)
    {
        this.isNew = isNew;
    }

    /**
     * Returns whether the object has been modified.
     *
     * @return True if the object has been modified.
     */
    public boolean isModified()
    {
        return modified;
    }

    /**
     * Sets whether the object has been modified.
     *
     * @param modified true if the object has been modified, false otherwise.
     */
    public void setModified(boolean modified)
    {
        this.modified = modified;
    }

    /**
     * Sets the modified state for the object to be false.
     */
    public void resetModified()
    {
        modified = false;
    }


    /**
     * Returns whether this object is currently saving.
     *
     * @return true if this object is currently saving, false otherwise.
     */
    public boolean isSaving()
    {
        return saving;
    }

    /**
     * Sets whether this object is currently saving.
     *
     * @param saving true if this object is currently saving, false otherwise.
     */
    public void setSaving(boolean saving)
    {
        this.saving = saving;
    }


    /**
     * Returns whether this object is currently being loaded from the database.
     *
     * @return true if this object is currently loading, false otherwise.
     */
    public boolean isLoading()
    {
        return loading;
    }

    /**
     * Sets whether this object is currently being loaded from the database.
     *
     * @param loading true if this object is currently loading, false otherwise.
     */
    public void setLoading(boolean loading)
    {
        this.loading = loading;
    }


    /**
     * Returns whether this object was deleted from the database.
     * Note that this getter does not automatically reflect database state,
     * it will be set to true by Torque if doDelete() was called with this 
     * object. Bulk deletes and deletes via primary key do not change
     * this flag. Also, if doDelete() was called on an object which does
     * not exist in the database, the deleted flag is set to true even if
     * it was not deleted.
     *
     * @return true if this object was deleted, false otherwise.
     */
    public boolean isDeleted()
    {
        return deleted;
    }

    /**
     * Sets whether this object was deleted from the database.
     *
     * @param deleted true if this object was deleted, false otherwise.
     */
    public void setDeleted(boolean deleted)
    {
        this.deleted = deleted;
    }


    /**
     * Returns the associated Publisher object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated Publisher object
     * @throws TorqueException when reading from the database fails.
     */
    public Publisher getPublisher()
        throws TorqueException
    {
        if (aPublisher == null && this.publisherId != 0)
        {
            aPublisher = PublisherPeer.retrieveByPK(SimpleKey.keyFor(this.publisherId));
        }
        return aPublisher;
    }

    /**
     * Return the associated Publisher object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Publisher object
     * @throws TorqueException
     */
    public Publisher getPublisher(Connection connection)
        throws TorqueException
    {
        if (aPublisher == null && this.publisherId != 0)
        {
            aPublisher = PublisherPeer.retrieveByPK(SimpleKey.keyFor(this.publisherId), connection);
        }
        return aPublisher;
    }


    /**
     * Declares an association between this object and a Publisher object
     *
     * @param v Publisher
     */
    public void setPublisher(Publisher v)
    {
        if (v == null)
        {
            setPublisherId(0);
        }
        else
        {
            setPublisherId(v.getPublisherId());
        }
        aPublisher = v;
    }
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setPublisherKey(ObjectKey key) throws TorqueException
    {
       
        setPublisherId(((NumberKey) key).intValue());
     }

    /**
     * Returns the associated Author object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated Author object
     * @throws TorqueException when reading from the database fails.
     */
    public Author getAuthor()
        throws TorqueException
    {
        if (aAuthor == null && this.authorId != 0)
        {
            aAuthor = AuthorPeer.retrieveByPK(SimpleKey.keyFor(this.authorId));
        }
        return aAuthor;
    }

    /**
     * Return the associated Author object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated Author object
     * @throws TorqueException
     */
    public Author getAuthor(Connection connection)
        throws TorqueException
    {
        if (aAuthor == null && this.authorId != 0)
        {
            aAuthor = AuthorPeer.retrieveByPK(SimpleKey.keyFor(this.authorId), connection);
        }
        return aAuthor;
    }


    /**
     * Declares an association between this object and a Author object
     *
     * @param v Author
     */
    public void setAuthor(Author v)
    {
        if (v == null)
        {
            setAuthorId(0);
        }
        else
        {
            setAuthorId(v.getAuthorId());
        }
        aAuthor = v;
    }
    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setAuthorKey(ObjectKey key) throws TorqueException
    {
       
        setAuthorId(((NumberKey) key).intValue());
     }






    private static final List<String> FIELD_NAMES;

    static
    {
        List<String> fieldNames
                = new ArrayList<String>();
        fieldNames.add("BookId");
        fieldNames.add("Title");
        fieldNames.add("ISBN");
        fieldNames.add("PublisherId");
        fieldNames.add("AuthorId");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static List<String> getFieldNames()
    {
        return FIELD_NAMES;
    }

    /**
     * Retrieves a field from the object by field (Java) name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
        if (name.equals("BookId"))
        {
            return new Integer(getBookId());
        }
        if (name.equals("Title"))
        {
            return getTitle();
        }
        if (name.equals("ISBN"))
        {
            return getISBN();
        }
        if (name.equals("PublisherId"))
        {
            return new Integer(getPublisherId());
        }
        if (name.equals("AuthorId"))
        {
            return new Integer(getAuthorId());
        }
        return null;
    }

    /**
     * Set a field in the object by field (Java) name.
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (name.equals("BookId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setBookId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Title"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setTitle((String) value);
            return true;
        }
        if (name.equals("ISBN"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setISBN((String) value);
            return true;
        }
        if (name.equals("PublisherId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setPublisherId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("AuthorId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setAuthorId(((Integer) value).intValue());
            return true;
        }
        return false;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
        if (name.equals(BookPeer.BOOK_ID))
        {
            return new Integer(getBookId());
        }
        if (name.equals(BookPeer.TITLE))
        {
            return getTitle();
        }
        if (name.equals(BookPeer.ISBN))
        {
            return getISBN();
        }
        if (name.equals(BookPeer.PUBLISHER_ID))
        {
            return new Integer(getPublisherId());
        }
        if (name.equals(BookPeer.AUTHOR_ID))
        {
            return new Integer(getAuthorId());
        }
        return null;
    }

    /**
     * Set field values by Peer Field Name
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPeerName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (BookPeer.BOOK_ID.getSqlExpression().equals(name))
        {
            return setByName("BookId", value);
        }
        if (BookPeer.TITLE.getSqlExpression().equals(name))
        {
            return setByName("Title", value);
        }
        if (BookPeer.ISBN.getSqlExpression().equals(name))
        {
            return setByName("ISBN", value);
        }
        if (BookPeer.PUBLISHER_ID.getSqlExpression().equals(name))
        {
            return setByName("PublisherId", value);
        }
        if (BookPeer.AUTHOR_ID.getSqlExpression().equals(name))
        {
            return setByName("AuthorId", value);
        }
        return false;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
        if (pos == 0)
        {
            return new Integer(getBookId());
        }
        if (pos == 1)
        {
            return getTitle();
        }
        if (pos == 2)
        {
            return getISBN();
        }
        if (pos == 3)
        {
            return new Integer(getPublisherId());
        }
        if (pos == 4)
        {
            return new Integer(getAuthorId());
        }
        return null;
    }

    /**
     * Set field values by its position (zero based) in the XML schema.
     *
     * @param position The field position
     * @param value field value
     * @return True if value was set, false if not (invalid position / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPosition(int position, Object value)
        throws TorqueException, IllegalArgumentException
    {
        if (position == 0)
        {
            return setByName("BookId", value);
        }
        if (position == 1)
        {
            return setByName("Title", value);
        }
        if (position == 2)
        {
            return setByName("ISBN", value);
        }
        if (position == 3)
        {
            return setByName("PublisherId", value);
        }
        if (position == 4)
        {
            return setByName("AuthorId", value);
        }
        return false;
    }



    /**
     * Stores an object in the database.  If the object is new,
     * it is inserted; otherwise an update is performed.
     *
     * @param toSave the object to be saved, not null.
     *
     * @throws TorqueException if an error occurs during saving.
     */
    public void save() throws TorqueException
    {
        save(BookPeer.DATABASE_NAME);
    }

    /**
     * Stores an object in the database.  If the object is new,
     * it is inserted; otherwise an update is performed.
     *
     * @param toSave the object to be saved, not null.
     * @param dbName the name of the database to which the object
     *        should be saved.
     *
     * @throws TorqueException if an error occurs during saving.
     */
    public void save(String dbName) 
            throws TorqueException
    {
        Connection con = null;
        try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
    }

    /**
     * Stores an object in the database.  If the object is new,
     * it is inserted; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally.
     *
     * @param toSave the object to be saved, not null.
     * @param con the connection to use for saving the object, not null.
     *
     * @throws TorqueException if an error occurs during saving.
     */
    public void save(Connection con) 
            throws TorqueException
    {
        if (isSaving())
        {
            return;
        }
        try
        {
            setSaving(true);
            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    BookPeer.doInsert((Book) this, con);
                    setNew(false);
                }
                else
                {
                    BookPeer.doUpdate((Book) this, con);
                }
            }

        }
        finally
        {
            setSaving(false);
        }
    }




    /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key bookId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
        setBookId(((NumberKey) key).intValue());
    }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
        setBookId(Integer.parseInt(key));
    }


    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
        return SimpleKey.keyFor(getBookId());
    }


    /**
     * Returns an id that differentiates the referenced Publisher object
     * from all other Publisher objects.
     *
     * @return an ObjectKey.
     */
    public ObjectKey getForeignKeyForPublisher()
    {
        int foreignKey = getPublisherId();
        if (foreignKey == 0)
        {
            return SimpleKey.keyFor((Number) null);
        }
        return SimpleKey.keyFor(foreignKey);
    }
    /**
     * Returns an id that differentiates the referenced Author object
     * from all other Author objects.
     *
     * @return an ObjectKey.
     */
    public ObjectKey getForeignKeyForAuthor()
    {
        int foreignKey = getAuthorId();
        if (foreignKey == 0)
        {
            return SimpleKey.keyFor((Number) null);
        }
        return SimpleKey.keyFor(foreignKey);
    }

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     */
    public Book copy() throws TorqueException
    {
        return copy(true);
    }

    /**
     * Makes a copy of this object using a connection.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     *
     * @param con the database connection to read associated objects.
     */
    public Book copy(Connection con) throws TorqueException
    {
        return copy(true, con);
    }

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     */
    public Book copy(boolean deepcopy) throws TorqueException
    {
        Book book = new Book();

        return copyInto(book, deepcopy);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     * @param con the database connection to read associated objects.
     */
    public Book copy(boolean deepcopy, Connection con) throws TorqueException
    {
        Book book = new Book();

        return copyInto(book, deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    public Book copyInto(Book copyObj) throws TorqueException
    {
        return copyInto(copyObj, true);
    }

    /**
     * Fills the copyObj with the contents of this object using connection.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param con the database connection to read associated objects.
     */
    public Book copyInto(Book copyObj, Connection con) throws TorqueException
    {
        return copyInto(copyObj, true, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     */
    protected Book copyInto(Book copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setBookId(0);
        copyObj.setTitle(title);
        copyObj.setISBN(iSBN);
        copyObj.setPublisherId(publisherId);
        copyObj.setAuthorId(authorId);

        if (deepcopy)
        {
        }
        return copyObj;
    }
        
    
    /**
     * Fills the copyObj with the contents of this object using connection.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     * @param con the database connection to read associated objects.
     */
    public Book copyInto(Book copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setBookId(0);
        copyObj.setTitle(title);
        copyObj.setISBN(iSBN);
        copyObj.setPublisherId(publisherId);
        copyObj.setAuthorId(authorId);

        if (deepcopy)
        {
        }
        return copyObj;
    }

    /** The Peer class */
    private static final BookPeer peer
            = new BookPeer();

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public BookPeer getPeer()
    {
        return peer;
    }

    /**
     * Retrieves the TableMap object related to this Table data without
     * compiler warnings of using getPeer().getTableMap().
     *
     * @return The associated TableMap object.
     */
    public TableMap getTableMap() throws TorqueException
    {
        return BookPeer.getTableMap();
    }



    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Book:\n");
        str.append("bookId = ")
           .append(getBookId())
           .append("\n");
        str.append("title = ")
           .append(getTitle())
           .append("\n");
        str.append("iSBN = ")
           .append(getISBN())
           .append("\n");
        str.append("publisherId = ")
           .append(getPublisherId())
           .append("\n");
        str.append("authorId = ")
           .append(getAuthorId())
           .append("\n");
        return(str.toString());
    }

    /**
     * Compares the primary key of this instance with the key of another.
     *
     * @param toCompare The object to compare to.
     * @return Whether the primary keys are equal and the object have the
     *         same class.
     */
    public boolean equals(Object toCompare)
    {
        if (toCompare == null)
        {
            return false;
        }
        if (this == toCompare)
        {
            return true;
        }
        if (!getClass().equals(toCompare.getClass()))
        {
            return false;
        }
        Book other = (Book) toCompare;
        if (getPrimaryKey() == null || other.getPrimaryKey() == null)
        {
            return false;
        }
        return getPrimaryKey().equals(other.getPrimaryKey());
    }

    /**
     * If the primary key is not <code>null</code>, return the hashcode of the
     * primary key.  Otherwise calls <code>Object.hashCode()</code>.
     *
     * @return an <code>int</code> value
     */
    public int hashCode()
    {
        ObjectKey ok = getPrimaryKey();
        if (ok == null)
        {
            return super.hashCode();
        }

        return ok.hashCode();
    }



    /**
     * Compares the content of this object to another object
     *
     * @param toCompare The object to compare to.
     * @return true if all of the columns in the other object have 
     *         the same value as the objects in this class.
     */
    public boolean valueEquals(Book toCompare)
    {
        if (toCompare == null)
        {
            return false;
        }
        if (this == toCompare)
        {
            return true;
        }
        if (this.bookId != toCompare.getBookId())
        {
            return false;
        }
        if (!ObjectUtils.equals(this.title, toCompare.getTitle()))
        {
            return false;
        }
        if (!ObjectUtils.equals(this.iSBN, toCompare.getISBN()))
        {
            return false;
        }
        if (this.publisherId != toCompare.getPublisherId())
        {
            return false;
        }
        if (this.authorId != toCompare.getAuthorId())
        {
            return false;
        }
        return true;
    }



}
