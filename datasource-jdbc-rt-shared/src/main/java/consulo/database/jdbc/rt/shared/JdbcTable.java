/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package consulo.database.jdbc.rt.shared;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class JdbcTable implements org.apache.thrift.TBase<JdbcTable, JdbcTable._Fields>, java.io.Serializable, Cloneable, Comparable<JdbcTable> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JdbcTable");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMS_FIELD_DESC = new org.apache.thrift.protocol.TField("colums", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SCHEME_FIELD_DESC = new org.apache.thrift.protocol.TField("scheme", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PRIMARY_KEYS_FIELD_DESC = new org.apache.thrift.protocol.TField("primaryKeys", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new JdbcTableStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new JdbcTableTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<JdbcColum> colums; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String type; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String scheme; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<JdbcTablePrimaryKey> primaryKeys; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    COLUMS((short)2, "colums"),
    TYPE((short)3, "type"),
    SCHEME((short)4, "scheme"),
    PRIMARY_KEYS((short)5, "primaryKeys");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // COLUMS
          return COLUMS;
        case 3: // TYPE
          return TYPE;
        case 4: // SCHEME
          return SCHEME;
        case 5: // PRIMARY_KEYS
          return PRIMARY_KEYS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLUMS, new org.apache.thrift.meta_data.FieldMetaData("colums", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "JdbcColum"))));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SCHEME, new org.apache.thrift.meta_data.FieldMetaData("scheme", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRIMARY_KEYS, new org.apache.thrift.meta_data.FieldMetaData("primaryKeys", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "JdbcTablePrimaryKey"))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JdbcTable.class, metaDataMap);
  }

  public JdbcTable() {
  }

  public JdbcTable(
    java.lang.String name,
    java.util.List<JdbcColum> colums,
    java.lang.String type,
    java.lang.String scheme,
    java.util.List<JdbcTablePrimaryKey> primaryKeys)
  {
    this();
    this.name = name;
    this.colums = colums;
    this.type = type;
    this.scheme = scheme;
    this.primaryKeys = primaryKeys;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JdbcTable(JdbcTable other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetColums()) {
      java.util.List<JdbcColum> __this__colums = new java.util.ArrayList<JdbcColum>(other.colums.size());
      for (JdbcColum other_element : other.colums) {
        __this__colums.add(new JdbcColum(other_element));
      }
      this.colums = __this__colums;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetScheme()) {
      this.scheme = other.scheme;
    }
    if (other.isSetPrimaryKeys()) {
      java.util.List<JdbcTablePrimaryKey> __this__primaryKeys = new java.util.ArrayList<JdbcTablePrimaryKey>(other.primaryKeys.size());
      for (JdbcTablePrimaryKey other_element : other.primaryKeys) {
        __this__primaryKeys.add(new JdbcTablePrimaryKey(other_element));
      }
      this.primaryKeys = __this__primaryKeys;
    }
  }

  public JdbcTable deepCopy() {
    return new JdbcTable(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.colums = null;
    this.type = null;
    this.scheme = null;
    this.primaryKeys = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public JdbcTable setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getColumsSize() {
    return (this.colums == null) ? 0 : this.colums.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<JdbcColum> getColumsIterator() {
    return (this.colums == null) ? null : this.colums.iterator();
  }

  public void addToColums(JdbcColum elem) {
    if (this.colums == null) {
      this.colums = new java.util.ArrayList<JdbcColum>();
    }
    this.colums.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<JdbcColum> getColums() {
    return this.colums;
  }

  public JdbcTable setColums(@org.apache.thrift.annotation.Nullable java.util.List<JdbcColum> colums) {
    this.colums = colums;
    return this;
  }

  public void unsetColums() {
    this.colums = null;
  }

  /** Returns true if field colums is set (has been assigned a value) and false otherwise */
  public boolean isSetColums() {
    return this.colums != null;
  }

  public void setColumsIsSet(boolean value) {
    if (!value) {
      this.colums = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getType() {
    return this.type;
  }

  public JdbcTable setType(@org.apache.thrift.annotation.Nullable java.lang.String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getScheme() {
    return this.scheme;
  }

  public JdbcTable setScheme(@org.apache.thrift.annotation.Nullable java.lang.String scheme) {
    this.scheme = scheme;
    return this;
  }

  public void unsetScheme() {
    this.scheme = null;
  }

  /** Returns true if field scheme is set (has been assigned a value) and false otherwise */
  public boolean isSetScheme() {
    return this.scheme != null;
  }

  public void setSchemeIsSet(boolean value) {
    if (!value) {
      this.scheme = null;
    }
  }

  public int getPrimaryKeysSize() {
    return (this.primaryKeys == null) ? 0 : this.primaryKeys.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<JdbcTablePrimaryKey> getPrimaryKeysIterator() {
    return (this.primaryKeys == null) ? null : this.primaryKeys.iterator();
  }

  public void addToPrimaryKeys(JdbcTablePrimaryKey elem) {
    if (this.primaryKeys == null) {
      this.primaryKeys = new java.util.ArrayList<JdbcTablePrimaryKey>();
    }
    this.primaryKeys.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<JdbcTablePrimaryKey> getPrimaryKeys() {
    return this.primaryKeys;
  }

  public JdbcTable setPrimaryKeys(@org.apache.thrift.annotation.Nullable java.util.List<JdbcTablePrimaryKey> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }

  public void unsetPrimaryKeys() {
    this.primaryKeys = null;
  }

  /** Returns true if field primaryKeys is set (has been assigned a value) and false otherwise */
  public boolean isSetPrimaryKeys() {
    return this.primaryKeys != null;
  }

  public void setPrimaryKeysIsSet(boolean value) {
    if (!value) {
      this.primaryKeys = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case COLUMS:
      if (value == null) {
        unsetColums();
      } else {
        setColums((java.util.List<JdbcColum>)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.String)value);
      }
      break;

    case SCHEME:
      if (value == null) {
        unsetScheme();
      } else {
        setScheme((java.lang.String)value);
      }
      break;

    case PRIMARY_KEYS:
      if (value == null) {
        unsetPrimaryKeys();
      } else {
        setPrimaryKeys((java.util.List<JdbcTablePrimaryKey>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case COLUMS:
      return getColums();

    case TYPE:
      return getType();

    case SCHEME:
      return getScheme();

    case PRIMARY_KEYS:
      return getPrimaryKeys();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case COLUMS:
      return isSetColums();
    case TYPE:
      return isSetType();
    case SCHEME:
      return isSetScheme();
    case PRIMARY_KEYS:
      return isSetPrimaryKeys();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof JdbcTable)
      return this.equals((JdbcTable)that);
    return false;
  }

  public boolean equals(JdbcTable that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_colums = true && this.isSetColums();
    boolean that_present_colums = true && that.isSetColums();
    if (this_present_colums || that_present_colums) {
      if (!(this_present_colums && that_present_colums))
        return false;
      if (!this.colums.equals(that.colums))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_scheme = true && this.isSetScheme();
    boolean that_present_scheme = true && that.isSetScheme();
    if (this_present_scheme || that_present_scheme) {
      if (!(this_present_scheme && that_present_scheme))
        return false;
      if (!this.scheme.equals(that.scheme))
        return false;
    }

    boolean this_present_primaryKeys = true && this.isSetPrimaryKeys();
    boolean that_present_primaryKeys = true && that.isSetPrimaryKeys();
    if (this_present_primaryKeys || that_present_primaryKeys) {
      if (!(this_present_primaryKeys && that_present_primaryKeys))
        return false;
      if (!this.primaryKeys.equals(that.primaryKeys))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetColums()) ? 131071 : 524287);
    if (isSetColums())
      hashCode = hashCode * 8191 + colums.hashCode();

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.hashCode();

    hashCode = hashCode * 8191 + ((isSetScheme()) ? 131071 : 524287);
    if (isSetScheme())
      hashCode = hashCode * 8191 + scheme.hashCode();

    hashCode = hashCode * 8191 + ((isSetPrimaryKeys()) ? 131071 : 524287);
    if (isSetPrimaryKeys())
      hashCode = hashCode * 8191 + primaryKeys.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(JdbcTable other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColums(), other.isSetColums());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColums()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colums, other.colums);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetScheme(), other.isSetScheme());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScheme()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scheme, other.scheme);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPrimaryKeys(), other.isSetPrimaryKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrimaryKeys()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.primaryKeys, other.primaryKeys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("JdbcTable(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("colums:");
    if (this.colums == null) {
      sb.append("null");
    } else {
      sb.append(this.colums);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("scheme:");
    if (this.scheme == null) {
      sb.append("null");
    } else {
      sb.append(this.scheme);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("primaryKeys:");
    if (this.primaryKeys == null) {
      sb.append("null");
    } else {
      sb.append(this.primaryKeys);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JdbcTableStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JdbcTableStandardScheme getScheme() {
      return new JdbcTableStandardScheme();
    }
  }

  private static class JdbcTableStandardScheme extends org.apache.thrift.scheme.StandardScheme<JdbcTable> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JdbcTable struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.colums = new java.util.ArrayList<JdbcColum>(_list0.size);
                @org.apache.thrift.annotation.Nullable JdbcColum _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new JdbcColum();
                  _elem1.read(iprot);
                  struct.colums.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setColumsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SCHEME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.scheme = iprot.readString();
              struct.setSchemeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PRIMARY_KEYS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.primaryKeys = new java.util.ArrayList<JdbcTablePrimaryKey>(_list3.size);
                @org.apache.thrift.annotation.Nullable JdbcTablePrimaryKey _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new JdbcTablePrimaryKey();
                  _elem4.read(iprot);
                  struct.primaryKeys.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setPrimaryKeysIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JdbcTable struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.colums != null) {
        oprot.writeFieldBegin(COLUMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.colums.size()));
          for (JdbcColum _iter6 : struct.colums)
          {
            _iter6.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeString(struct.type);
        oprot.writeFieldEnd();
      }
      if (struct.scheme != null) {
        oprot.writeFieldBegin(SCHEME_FIELD_DESC);
        oprot.writeString(struct.scheme);
        oprot.writeFieldEnd();
      }
      if (struct.primaryKeys != null) {
        oprot.writeFieldBegin(PRIMARY_KEYS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.primaryKeys.size()));
          for (JdbcTablePrimaryKey _iter7 : struct.primaryKeys)
          {
            _iter7.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JdbcTableTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JdbcTableTupleScheme getScheme() {
      return new JdbcTableTupleScheme();
    }
  }

  private static class JdbcTableTupleScheme extends org.apache.thrift.scheme.TupleScheme<JdbcTable> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JdbcTable struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetColums()) {
        optionals.set(1);
      }
      if (struct.isSetType()) {
        optionals.set(2);
      }
      if (struct.isSetScheme()) {
        optionals.set(3);
      }
      if (struct.isSetPrimaryKeys()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetColums()) {
        {
          oprot.writeI32(struct.colums.size());
          for (JdbcColum _iter8 : struct.colums)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetScheme()) {
        oprot.writeString(struct.scheme);
      }
      if (struct.isSetPrimaryKeys()) {
        {
          oprot.writeI32(struct.primaryKeys.size());
          for (JdbcTablePrimaryKey _iter9 : struct.primaryKeys)
          {
            _iter9.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JdbcTable struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list10 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.colums = new java.util.ArrayList<JdbcColum>(_list10.size);
          @org.apache.thrift.annotation.Nullable JdbcColum _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = new JdbcColum();
            _elem11.read(iprot);
            struct.colums.add(_elem11);
          }
        }
        struct.setColumsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.scheme = iprot.readString();
        struct.setSchemeIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list13 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.primaryKeys = new java.util.ArrayList<JdbcTablePrimaryKey>(_list13.size);
          @org.apache.thrift.annotation.Nullable JdbcTablePrimaryKey _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new JdbcTablePrimaryKey();
            _elem14.read(iprot);
            struct.primaryKeys.add(_elem14);
          }
        }
        struct.setPrimaryKeysIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

