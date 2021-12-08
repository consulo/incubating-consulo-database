/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package consulo.database.jdbc.rt.shared;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class JdbcColum implements org.apache.thrift.TBase<JdbcColum, JdbcColum._Fields>, java.io.Serializable, Cloneable, Comparable<JdbcColum> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JdbcColum");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField JDBC_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("jdbcType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField NULLABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("nullable", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField AUTO_GENERATED_FIELD_DESC = new org.apache.thrift.protocol.TField("autoGenerated", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField AUTO_INCREMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("autoIncrement", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField DEFAULT_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("defaultValue", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("size", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new JdbcColumStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new JdbcColumTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String type; // required
  public int jdbcType; // required
  public boolean nullable; // required
  public boolean autoGenerated; // required
  public boolean autoIncrement; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String defaultValue; // required
  public int size; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    TYPE((short)2, "type"),
    JDBC_TYPE((short)3, "jdbcType"),
    NULLABLE((short)4, "nullable"),
    AUTO_GENERATED((short)5, "autoGenerated"),
    AUTO_INCREMENT((short)6, "autoIncrement"),
    DEFAULT_VALUE((short)7, "defaultValue"),
    SIZE((short)8, "size");

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
        case 2: // TYPE
          return TYPE;
        case 3: // JDBC_TYPE
          return JDBC_TYPE;
        case 4: // NULLABLE
          return NULLABLE;
        case 5: // AUTO_GENERATED
          return AUTO_GENERATED;
        case 6: // AUTO_INCREMENT
          return AUTO_INCREMENT;
        case 7: // DEFAULT_VALUE
          return DEFAULT_VALUE;
        case 8: // SIZE
          return SIZE;
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
  private static final int __JDBCTYPE_ISSET_ID = 0;
  private static final int __NULLABLE_ISSET_ID = 1;
  private static final int __AUTOGENERATED_ISSET_ID = 2;
  private static final int __AUTOINCREMENT_ISSET_ID = 3;
  private static final int __SIZE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JDBC_TYPE, new org.apache.thrift.meta_data.FieldMetaData("jdbcType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NULLABLE, new org.apache.thrift.meta_data.FieldMetaData("nullable", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.AUTO_GENERATED, new org.apache.thrift.meta_data.FieldMetaData("autoGenerated", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.AUTO_INCREMENT, new org.apache.thrift.meta_data.FieldMetaData("autoIncrement", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DEFAULT_VALUE, new org.apache.thrift.meta_data.FieldMetaData("defaultValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SIZE, new org.apache.thrift.meta_data.FieldMetaData("size", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JdbcColum.class, metaDataMap);
  }

  public JdbcColum() {
  }

  public JdbcColum(
    java.lang.String name,
    java.lang.String type,
    int jdbcType,
    boolean nullable,
    boolean autoGenerated,
    boolean autoIncrement,
    java.lang.String defaultValue,
    int size)
  {
    this();
    this.name = name;
    this.type = type;
    this.jdbcType = jdbcType;
    setJdbcTypeIsSet(true);
    this.nullable = nullable;
    setNullableIsSet(true);
    this.autoGenerated = autoGenerated;
    setAutoGeneratedIsSet(true);
    this.autoIncrement = autoIncrement;
    setAutoIncrementIsSet(true);
    this.defaultValue = defaultValue;
    this.size = size;
    setSizeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JdbcColum(JdbcColum other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.jdbcType = other.jdbcType;
    this.nullable = other.nullable;
    this.autoGenerated = other.autoGenerated;
    this.autoIncrement = other.autoIncrement;
    if (other.isSetDefaultValue()) {
      this.defaultValue = other.defaultValue;
    }
    this.size = other.size;
  }

  public JdbcColum deepCopy() {
    return new JdbcColum(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.type = null;
    setJdbcTypeIsSet(false);
    this.jdbcType = 0;
    setNullableIsSet(false);
    this.nullable = false;
    setAutoGeneratedIsSet(false);
    this.autoGenerated = false;
    setAutoIncrementIsSet(false);
    this.autoIncrement = false;
    this.defaultValue = null;
    setSizeIsSet(false);
    this.size = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public JdbcColum setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getType() {
    return this.type;
  }

  public JdbcColum setType(@org.apache.thrift.annotation.Nullable java.lang.String type) {
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

  public int getJdbcType() {
    return this.jdbcType;
  }

  public JdbcColum setJdbcType(int jdbcType) {
    this.jdbcType = jdbcType;
    setJdbcTypeIsSet(true);
    return this;
  }

  public void unsetJdbcType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JDBCTYPE_ISSET_ID);
  }

  /** Returns true if field jdbcType is set (has been assigned a value) and false otherwise */
  public boolean isSetJdbcType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JDBCTYPE_ISSET_ID);
  }

  public void setJdbcTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JDBCTYPE_ISSET_ID, value);
  }

  public boolean isNullable() {
    return this.nullable;
  }

  public JdbcColum setNullable(boolean nullable) {
    this.nullable = nullable;
    setNullableIsSet(true);
    return this;
  }

  public void unsetNullable() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NULLABLE_ISSET_ID);
  }

  /** Returns true if field nullable is set (has been assigned a value) and false otherwise */
  public boolean isSetNullable() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NULLABLE_ISSET_ID);
  }

  public void setNullableIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NULLABLE_ISSET_ID, value);
  }

  public boolean isAutoGenerated() {
    return this.autoGenerated;
  }

  public JdbcColum setAutoGenerated(boolean autoGenerated) {
    this.autoGenerated = autoGenerated;
    setAutoGeneratedIsSet(true);
    return this;
  }

  public void unsetAutoGenerated() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AUTOGENERATED_ISSET_ID);
  }

  /** Returns true if field autoGenerated is set (has been assigned a value) and false otherwise */
  public boolean isSetAutoGenerated() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AUTOGENERATED_ISSET_ID);
  }

  public void setAutoGeneratedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AUTOGENERATED_ISSET_ID, value);
  }

  public boolean isAutoIncrement() {
    return this.autoIncrement;
  }

  public JdbcColum setAutoIncrement(boolean autoIncrement) {
    this.autoIncrement = autoIncrement;
    setAutoIncrementIsSet(true);
    return this;
  }

  public void unsetAutoIncrement() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AUTOINCREMENT_ISSET_ID);
  }

  /** Returns true if field autoIncrement is set (has been assigned a value) and false otherwise */
  public boolean isSetAutoIncrement() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AUTOINCREMENT_ISSET_ID);
  }

  public void setAutoIncrementIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AUTOINCREMENT_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDefaultValue() {
    return this.defaultValue;
  }

  public JdbcColum setDefaultValue(@org.apache.thrift.annotation.Nullable java.lang.String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public void unsetDefaultValue() {
    this.defaultValue = null;
  }

  /** Returns true if field defaultValue is set (has been assigned a value) and false otherwise */
  public boolean isSetDefaultValue() {
    return this.defaultValue != null;
  }

  public void setDefaultValueIsSet(boolean value) {
    if (!value) {
      this.defaultValue = null;
    }
  }

  public int getSize() {
    return this.size;
  }

  public JdbcColum setSize(int size) {
    this.size = size;
    setSizeIsSet(true);
    return this;
  }

  public void unsetSize() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SIZE_ISSET_ID);
  }

  /** Returns true if field size is set (has been assigned a value) and false otherwise */
  public boolean isSetSize() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SIZE_ISSET_ID);
  }

  public void setSizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SIZE_ISSET_ID, value);
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

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.String)value);
      }
      break;

    case JDBC_TYPE:
      if (value == null) {
        unsetJdbcType();
      } else {
        setJdbcType((java.lang.Integer)value);
      }
      break;

    case NULLABLE:
      if (value == null) {
        unsetNullable();
      } else {
        setNullable((java.lang.Boolean)value);
      }
      break;

    case AUTO_GENERATED:
      if (value == null) {
        unsetAutoGenerated();
      } else {
        setAutoGenerated((java.lang.Boolean)value);
      }
      break;

    case AUTO_INCREMENT:
      if (value == null) {
        unsetAutoIncrement();
      } else {
        setAutoIncrement((java.lang.Boolean)value);
      }
      break;

    case DEFAULT_VALUE:
      if (value == null) {
        unsetDefaultValue();
      } else {
        setDefaultValue((java.lang.String)value);
      }
      break;

    case SIZE:
      if (value == null) {
        unsetSize();
      } else {
        setSize((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case TYPE:
      return getType();

    case JDBC_TYPE:
      return getJdbcType();

    case NULLABLE:
      return isNullable();

    case AUTO_GENERATED:
      return isAutoGenerated();

    case AUTO_INCREMENT:
      return isAutoIncrement();

    case DEFAULT_VALUE:
      return getDefaultValue();

    case SIZE:
      return getSize();

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
    case TYPE:
      return isSetType();
    case JDBC_TYPE:
      return isSetJdbcType();
    case NULLABLE:
      return isSetNullable();
    case AUTO_GENERATED:
      return isSetAutoGenerated();
    case AUTO_INCREMENT:
      return isSetAutoIncrement();
    case DEFAULT_VALUE:
      return isSetDefaultValue();
    case SIZE:
      return isSetSize();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof JdbcColum)
      return this.equals((JdbcColum)that);
    return false;
  }

  public boolean equals(JdbcColum that) {
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

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_jdbcType = true;
    boolean that_present_jdbcType = true;
    if (this_present_jdbcType || that_present_jdbcType) {
      if (!(this_present_jdbcType && that_present_jdbcType))
        return false;
      if (this.jdbcType != that.jdbcType)
        return false;
    }

    boolean this_present_nullable = true;
    boolean that_present_nullable = true;
    if (this_present_nullable || that_present_nullable) {
      if (!(this_present_nullable && that_present_nullable))
        return false;
      if (this.nullable != that.nullable)
        return false;
    }

    boolean this_present_autoGenerated = true;
    boolean that_present_autoGenerated = true;
    if (this_present_autoGenerated || that_present_autoGenerated) {
      if (!(this_present_autoGenerated && that_present_autoGenerated))
        return false;
      if (this.autoGenerated != that.autoGenerated)
        return false;
    }

    boolean this_present_autoIncrement = true;
    boolean that_present_autoIncrement = true;
    if (this_present_autoIncrement || that_present_autoIncrement) {
      if (!(this_present_autoIncrement && that_present_autoIncrement))
        return false;
      if (this.autoIncrement != that.autoIncrement)
        return false;
    }

    boolean this_present_defaultValue = true && this.isSetDefaultValue();
    boolean that_present_defaultValue = true && that.isSetDefaultValue();
    if (this_present_defaultValue || that_present_defaultValue) {
      if (!(this_present_defaultValue && that_present_defaultValue))
        return false;
      if (!this.defaultValue.equals(that.defaultValue))
        return false;
    }

    boolean this_present_size = true;
    boolean that_present_size = true;
    if (this_present_size || that_present_size) {
      if (!(this_present_size && that_present_size))
        return false;
      if (this.size != that.size)
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

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.hashCode();

    hashCode = hashCode * 8191 + jdbcType;

    hashCode = hashCode * 8191 + ((nullable) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((autoGenerated) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((autoIncrement) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetDefaultValue()) ? 131071 : 524287);
    if (isSetDefaultValue())
      hashCode = hashCode * 8191 + defaultValue.hashCode();

    hashCode = hashCode * 8191 + size;

    return hashCode;
  }

  @Override
  public int compareTo(JdbcColum other) {
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
    lastComparison = java.lang.Boolean.compare(isSetJdbcType(), other.isSetJdbcType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJdbcType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jdbcType, other.jdbcType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNullable(), other.isSetNullable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNullable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nullable, other.nullable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAutoGenerated(), other.isSetAutoGenerated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAutoGenerated()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.autoGenerated, other.autoGenerated);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAutoIncrement(), other.isSetAutoIncrement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAutoIncrement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.autoIncrement, other.autoIncrement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDefaultValue(), other.isSetDefaultValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefaultValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.defaultValue, other.defaultValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSize(), other.isSetSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.size, other.size);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("JdbcColum(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
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
    sb.append("jdbcType:");
    sb.append(this.jdbcType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nullable:");
    sb.append(this.nullable);
    first = false;
    if (!first) sb.append(", ");
    sb.append("autoGenerated:");
    sb.append(this.autoGenerated);
    first = false;
    if (!first) sb.append(", ");
    sb.append("autoIncrement:");
    sb.append(this.autoIncrement);
    first = false;
    if (!first) sb.append(", ");
    sb.append("defaultValue:");
    if (this.defaultValue == null) {
      sb.append("null");
    } else {
      sb.append(this.defaultValue);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("size:");
    sb.append(this.size);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JdbcColumStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JdbcColumStandardScheme getScheme() {
      return new JdbcColumStandardScheme();
    }
  }

  private static class JdbcColumStandardScheme extends org.apache.thrift.scheme.StandardScheme<JdbcColum> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JdbcColum struct) throws org.apache.thrift.TException {
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
          case 2: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // JDBC_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jdbcType = iprot.readI32();
              struct.setJdbcTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NULLABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.nullable = iprot.readBool();
              struct.setNullableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AUTO_GENERATED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.autoGenerated = iprot.readBool();
              struct.setAutoGeneratedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // AUTO_INCREMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.autoIncrement = iprot.readBool();
              struct.setAutoIncrementIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DEFAULT_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.defaultValue = iprot.readString();
              struct.setDefaultValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.size = iprot.readI32();
              struct.setSizeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JdbcColum struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeString(struct.type);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(JDBC_TYPE_FIELD_DESC);
      oprot.writeI32(struct.jdbcType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NULLABLE_FIELD_DESC);
      oprot.writeBool(struct.nullable);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AUTO_GENERATED_FIELD_DESC);
      oprot.writeBool(struct.autoGenerated);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AUTO_INCREMENT_FIELD_DESC);
      oprot.writeBool(struct.autoIncrement);
      oprot.writeFieldEnd();
      if (struct.defaultValue != null) {
        oprot.writeFieldBegin(DEFAULT_VALUE_FIELD_DESC);
        oprot.writeString(struct.defaultValue);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SIZE_FIELD_DESC);
      oprot.writeI32(struct.size);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JdbcColumTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JdbcColumTupleScheme getScheme() {
      return new JdbcColumTupleScheme();
    }
  }

  private static class JdbcColumTupleScheme extends org.apache.thrift.scheme.TupleScheme<JdbcColum> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JdbcColum struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      if (struct.isSetJdbcType()) {
        optionals.set(2);
      }
      if (struct.isSetNullable()) {
        optionals.set(3);
      }
      if (struct.isSetAutoGenerated()) {
        optionals.set(4);
      }
      if (struct.isSetAutoIncrement()) {
        optionals.set(5);
      }
      if (struct.isSetDefaultValue()) {
        optionals.set(6);
      }
      if (struct.isSetSize()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetJdbcType()) {
        oprot.writeI32(struct.jdbcType);
      }
      if (struct.isSetNullable()) {
        oprot.writeBool(struct.nullable);
      }
      if (struct.isSetAutoGenerated()) {
        oprot.writeBool(struct.autoGenerated);
      }
      if (struct.isSetAutoIncrement()) {
        oprot.writeBool(struct.autoIncrement);
      }
      if (struct.isSetDefaultValue()) {
        oprot.writeString(struct.defaultValue);
      }
      if (struct.isSetSize()) {
        oprot.writeI32(struct.size);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JdbcColum struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.jdbcType = iprot.readI32();
        struct.setJdbcTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.nullable = iprot.readBool();
        struct.setNullableIsSet(true);
      }
      if (incoming.get(4)) {
        struct.autoGenerated = iprot.readBool();
        struct.setAutoGeneratedIsSet(true);
      }
      if (incoming.get(5)) {
        struct.autoIncrement = iprot.readBool();
        struct.setAutoIncrementIsSet(true);
      }
      if (incoming.get(6)) {
        struct.defaultValue = iprot.readString();
        struct.setDefaultValueIsSet(true);
      }
      if (incoming.get(7)) {
        struct.size = iprot.readI32();
        struct.setSizeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

