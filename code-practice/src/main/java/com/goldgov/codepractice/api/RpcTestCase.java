/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.goldgov.codepractice.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-20")
public class RpcTestCase implements org.apache.thrift.TBase<RpcTestCase, RpcTestCase._Fields>, java.io.Serializable, Cloneable, Comparable<RpcTestCase> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RpcTestCase");

  private static final org.apache.thrift.protocol.TField TEST_CASE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("testCaseID", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PARAM_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("paramValues", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RETURN_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("returnValue", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RpcTestCaseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RpcTestCaseTupleSchemeFactory();

  private int testCaseID; // required
  private java.lang.String paramValues; // required
  private java.lang.String returnValue; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEST_CASE_ID((short)1, "testCaseID"),
    PARAM_VALUES((short)2, "paramValues"),
    RETURN_VALUE((short)3, "returnValue");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TEST_CASE_ID
          return TEST_CASE_ID;
        case 2: // PARAM_VALUES
          return PARAM_VALUES;
        case 3: // RETURN_VALUE
          return RETURN_VALUE;
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
  private static final int __TESTCASEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TEST_CASE_ID, new org.apache.thrift.meta_data.FieldMetaData("testCaseID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PARAM_VALUES, new org.apache.thrift.meta_data.FieldMetaData("paramValues", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RETURN_VALUE, new org.apache.thrift.meta_data.FieldMetaData("returnValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RpcTestCase.class, metaDataMap);
  }

  public RpcTestCase() {
  }

  public RpcTestCase(
    int testCaseID,
    java.lang.String paramValues,
    java.lang.String returnValue)
  {
    this();
    this.testCaseID = testCaseID;
    setTestCaseIDIsSet(true);
    this.paramValues = paramValues;
    this.returnValue = returnValue;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RpcTestCase(RpcTestCase other) {
    __isset_bitfield = other.__isset_bitfield;
    this.testCaseID = other.testCaseID;
    if (other.isSetParamValues()) {
      this.paramValues = other.paramValues;
    }
    if (other.isSetReturnValue()) {
      this.returnValue = other.returnValue;
    }
  }

  public RpcTestCase deepCopy() {
    return new RpcTestCase(this);
  }

  @Override
  public void clear() {
    setTestCaseIDIsSet(false);
    this.testCaseID = 0;
    this.paramValues = null;
    this.returnValue = null;
  }

  public int getTestCaseID() {
    return this.testCaseID;
  }

  public void setTestCaseID(int testCaseID) {
    this.testCaseID = testCaseID;
    setTestCaseIDIsSet(true);
  }

  public void unsetTestCaseID() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TESTCASEID_ISSET_ID);
  }

  /** Returns true if field testCaseID is set (has been assigned a value) and false otherwise */
  public boolean isSetTestCaseID() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TESTCASEID_ISSET_ID);
  }

  public void setTestCaseIDIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TESTCASEID_ISSET_ID, value);
  }

  public java.lang.String getParamValues() {
    return this.paramValues;
  }

  public void setParamValues(java.lang.String paramValues) {
    this.paramValues = paramValues;
  }

  public void unsetParamValues() {
    this.paramValues = null;
  }

  /** Returns true if field paramValues is set (has been assigned a value) and false otherwise */
  public boolean isSetParamValues() {
    return this.paramValues != null;
  }

  public void setParamValuesIsSet(boolean value) {
    if (!value) {
      this.paramValues = null;
    }
  }

  public java.lang.String getReturnValue() {
    return this.returnValue;
  }

  public void setReturnValue(java.lang.String returnValue) {
    this.returnValue = returnValue;
  }

  public void unsetReturnValue() {
    this.returnValue = null;
  }

  /** Returns true if field returnValue is set (has been assigned a value) and false otherwise */
  public boolean isSetReturnValue() {
    return this.returnValue != null;
  }

  public void setReturnValueIsSet(boolean value) {
    if (!value) {
      this.returnValue = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TEST_CASE_ID:
      if (value == null) {
        unsetTestCaseID();
      } else {
        setTestCaseID((java.lang.Integer)value);
      }
      break;

    case PARAM_VALUES:
      if (value == null) {
        unsetParamValues();
      } else {
        setParamValues((java.lang.String)value);
      }
      break;

    case RETURN_VALUE:
      if (value == null) {
        unsetReturnValue();
      } else {
        setReturnValue((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TEST_CASE_ID:
      return getTestCaseID();

    case PARAM_VALUES:
      return getParamValues();

    case RETURN_VALUE:
      return getReturnValue();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TEST_CASE_ID:
      return isSetTestCaseID();
    case PARAM_VALUES:
      return isSetParamValues();
    case RETURN_VALUE:
      return isSetReturnValue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RpcTestCase)
      return this.equals((RpcTestCase)that);
    return false;
  }

  public boolean equals(RpcTestCase that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_testCaseID = true;
    boolean that_present_testCaseID = true;
    if (this_present_testCaseID || that_present_testCaseID) {
      if (!(this_present_testCaseID && that_present_testCaseID))
        return false;
      if (this.testCaseID != that.testCaseID)
        return false;
    }

    boolean this_present_paramValues = true && this.isSetParamValues();
    boolean that_present_paramValues = true && that.isSetParamValues();
    if (this_present_paramValues || that_present_paramValues) {
      if (!(this_present_paramValues && that_present_paramValues))
        return false;
      if (!this.paramValues.equals(that.paramValues))
        return false;
    }

    boolean this_present_returnValue = true && this.isSetReturnValue();
    boolean that_present_returnValue = true && that.isSetReturnValue();
    if (this_present_returnValue || that_present_returnValue) {
      if (!(this_present_returnValue && that_present_returnValue))
        return false;
      if (!this.returnValue.equals(that.returnValue))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + testCaseID;

    hashCode = hashCode * 8191 + ((isSetParamValues()) ? 131071 : 524287);
    if (isSetParamValues())
      hashCode = hashCode * 8191 + paramValues.hashCode();

    hashCode = hashCode * 8191 + ((isSetReturnValue()) ? 131071 : 524287);
    if (isSetReturnValue())
      hashCode = hashCode * 8191 + returnValue.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RpcTestCase other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTestCaseID()).compareTo(other.isSetTestCaseID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTestCaseID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.testCaseID, other.testCaseID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetParamValues()).compareTo(other.isSetParamValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParamValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paramValues, other.paramValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReturnValue()).compareTo(other.isSetReturnValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReturnValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.returnValue, other.returnValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RpcTestCase(");
    boolean first = true;

    sb.append("testCaseID:");
    sb.append(this.testCaseID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("paramValues:");
    if (this.paramValues == null) {
      sb.append("null");
    } else {
      sb.append(this.paramValues);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("returnValue:");
    if (this.returnValue == null) {
      sb.append("null");
    } else {
      sb.append(this.returnValue);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RpcTestCaseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RpcTestCaseStandardScheme getScheme() {
      return new RpcTestCaseStandardScheme();
    }
  }

  private static class RpcTestCaseStandardScheme extends org.apache.thrift.scheme.StandardScheme<RpcTestCase> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RpcTestCase struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEST_CASE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.testCaseID = iprot.readI32();
              struct.setTestCaseIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAM_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.paramValues = iprot.readString();
              struct.setParamValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RETURN_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.returnValue = iprot.readString();
              struct.setReturnValueIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RpcTestCase struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TEST_CASE_ID_FIELD_DESC);
      oprot.writeI32(struct.testCaseID);
      oprot.writeFieldEnd();
      if (struct.paramValues != null) {
        oprot.writeFieldBegin(PARAM_VALUES_FIELD_DESC);
        oprot.writeString(struct.paramValues);
        oprot.writeFieldEnd();
      }
      if (struct.returnValue != null) {
        oprot.writeFieldBegin(RETURN_VALUE_FIELD_DESC);
        oprot.writeString(struct.returnValue);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RpcTestCaseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RpcTestCaseTupleScheme getScheme() {
      return new RpcTestCaseTupleScheme();
    }
  }

  private static class RpcTestCaseTupleScheme extends org.apache.thrift.scheme.TupleScheme<RpcTestCase> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RpcTestCase struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTestCaseID()) {
        optionals.set(0);
      }
      if (struct.isSetParamValues()) {
        optionals.set(1);
      }
      if (struct.isSetReturnValue()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTestCaseID()) {
        oprot.writeI32(struct.testCaseID);
      }
      if (struct.isSetParamValues()) {
        oprot.writeString(struct.paramValues);
      }
      if (struct.isSetReturnValue()) {
        oprot.writeString(struct.returnValue);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RpcTestCase struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.testCaseID = iprot.readI32();
        struct.setTestCaseIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.paramValues = iprot.readString();
        struct.setParamValuesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.returnValue = iprot.readString();
        struct.setReturnValueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
