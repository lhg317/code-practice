/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.goldgov.codepractice.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-21")
public class RpcExamPaper implements org.apache.thrift.TBase<RpcExamPaper, RpcExamPaper._Fields>, java.io.Serializable, Cloneable, Comparable<RpcExamPaper> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RpcExamPaper");

  private static final org.apache.thrift.protocol.TField EXAM_PAPER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("examPaperID", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EXAMINEE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("examineeID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CODE_CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("codeContent", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField COMPILED_SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("compiledSuccess", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField TEST_SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("testSuccess", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField SCORE_POINT_FIELD_DESC = new org.apache.thrift.protocol.TField("scorePoint", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField EXERCISE_FIELD_DESC = new org.apache.thrift.protocol.TField("exercise", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RpcExamPaperStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RpcExamPaperTupleSchemeFactory();

  private int examPaperID; // required
  private java.lang.String examineeID; // required
  private java.lang.String codeContent; // required
  private boolean compiledSuccess; // required
  private boolean testSuccess; // required
  private int scorePoint; // required
  private com.goldgov.codepractice.api.RpcExercise exercise; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXAM_PAPER_ID((short)1, "examPaperID"),
    EXAMINEE_ID((short)2, "examineeID"),
    CODE_CONTENT((short)3, "codeContent"),
    COMPILED_SUCCESS((short)4, "compiledSuccess"),
    TEST_SUCCESS((short)5, "testSuccess"),
    SCORE_POINT((short)6, "scorePoint"),
    EXERCISE((short)7, "exercise");

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
        case 1: // EXAM_PAPER_ID
          return EXAM_PAPER_ID;
        case 2: // EXAMINEE_ID
          return EXAMINEE_ID;
        case 3: // CODE_CONTENT
          return CODE_CONTENT;
        case 4: // COMPILED_SUCCESS
          return COMPILED_SUCCESS;
        case 5: // TEST_SUCCESS
          return TEST_SUCCESS;
        case 6: // SCORE_POINT
          return SCORE_POINT;
        case 7: // EXERCISE
          return EXERCISE;
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
  private static final int __EXAMPAPERID_ISSET_ID = 0;
  private static final int __COMPILEDSUCCESS_ISSET_ID = 1;
  private static final int __TESTSUCCESS_ISSET_ID = 2;
  private static final int __SCOREPOINT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXAM_PAPER_ID, new org.apache.thrift.meta_data.FieldMetaData("examPaperID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EXAMINEE_ID, new org.apache.thrift.meta_data.FieldMetaData("examineeID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CODE_CONTENT, new org.apache.thrift.meta_data.FieldMetaData("codeContent", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMPILED_SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("compiledSuccess", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TEST_SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("testSuccess", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SCORE_POINT, new org.apache.thrift.meta_data.FieldMetaData("scorePoint", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EXERCISE, new org.apache.thrift.meta_data.FieldMetaData("exercise", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.goldgov.codepractice.api.RpcExercise.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RpcExamPaper.class, metaDataMap);
  }

  public RpcExamPaper() {
  }

  public RpcExamPaper(
    int examPaperID,
    java.lang.String examineeID,
    java.lang.String codeContent,
    boolean compiledSuccess,
    boolean testSuccess,
    int scorePoint,
    com.goldgov.codepractice.api.RpcExercise exercise)
  {
    this();
    this.examPaperID = examPaperID;
    setExamPaperIDIsSet(true);
    this.examineeID = examineeID;
    this.codeContent = codeContent;
    this.compiledSuccess = compiledSuccess;
    setCompiledSuccessIsSet(true);
    this.testSuccess = testSuccess;
    setTestSuccessIsSet(true);
    this.scorePoint = scorePoint;
    setScorePointIsSet(true);
    this.exercise = exercise;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RpcExamPaper(RpcExamPaper other) {
    __isset_bitfield = other.__isset_bitfield;
    this.examPaperID = other.examPaperID;
    if (other.isSetExamineeID()) {
      this.examineeID = other.examineeID;
    }
    if (other.isSetCodeContent()) {
      this.codeContent = other.codeContent;
    }
    this.compiledSuccess = other.compiledSuccess;
    this.testSuccess = other.testSuccess;
    this.scorePoint = other.scorePoint;
    if (other.isSetExercise()) {
      this.exercise = new com.goldgov.codepractice.api.RpcExercise(other.exercise);
    }
  }

  public RpcExamPaper deepCopy() {
    return new RpcExamPaper(this);
  }

  @Override
  public void clear() {
    setExamPaperIDIsSet(false);
    this.examPaperID = 0;
    this.examineeID = null;
    this.codeContent = null;
    setCompiledSuccessIsSet(false);
    this.compiledSuccess = false;
    setTestSuccessIsSet(false);
    this.testSuccess = false;
    setScorePointIsSet(false);
    this.scorePoint = 0;
    this.exercise = null;
  }

  public int getExamPaperID() {
    return this.examPaperID;
  }

  public void setExamPaperID(int examPaperID) {
    this.examPaperID = examPaperID;
    setExamPaperIDIsSet(true);
  }

  public void unsetExamPaperID() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXAMPAPERID_ISSET_ID);
  }

  /** Returns true if field examPaperID is set (has been assigned a value) and false otherwise */
  public boolean isSetExamPaperID() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXAMPAPERID_ISSET_ID);
  }

  public void setExamPaperIDIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXAMPAPERID_ISSET_ID, value);
  }

  public java.lang.String getExamineeID() {
    return this.examineeID;
  }

  public void setExamineeID(java.lang.String examineeID) {
    this.examineeID = examineeID;
  }

  public void unsetExamineeID() {
    this.examineeID = null;
  }

  /** Returns true if field examineeID is set (has been assigned a value) and false otherwise */
  public boolean isSetExamineeID() {
    return this.examineeID != null;
  }

  public void setExamineeIDIsSet(boolean value) {
    if (!value) {
      this.examineeID = null;
    }
  }

  public java.lang.String getCodeContent() {
    return this.codeContent;
  }

  public void setCodeContent(java.lang.String codeContent) {
    this.codeContent = codeContent;
  }

  public void unsetCodeContent() {
    this.codeContent = null;
  }

  /** Returns true if field codeContent is set (has been assigned a value) and false otherwise */
  public boolean isSetCodeContent() {
    return this.codeContent != null;
  }

  public void setCodeContentIsSet(boolean value) {
    if (!value) {
      this.codeContent = null;
    }
  }

  public boolean isCompiledSuccess() {
    return this.compiledSuccess;
  }

  public void setCompiledSuccess(boolean compiledSuccess) {
    this.compiledSuccess = compiledSuccess;
    setCompiledSuccessIsSet(true);
  }

  public void unsetCompiledSuccess() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COMPILEDSUCCESS_ISSET_ID);
  }

  /** Returns true if field compiledSuccess is set (has been assigned a value) and false otherwise */
  public boolean isSetCompiledSuccess() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COMPILEDSUCCESS_ISSET_ID);
  }

  public void setCompiledSuccessIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COMPILEDSUCCESS_ISSET_ID, value);
  }

  public boolean isTestSuccess() {
    return this.testSuccess;
  }

  public void setTestSuccess(boolean testSuccess) {
    this.testSuccess = testSuccess;
    setTestSuccessIsSet(true);
  }

  public void unsetTestSuccess() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TESTSUCCESS_ISSET_ID);
  }

  /** Returns true if field testSuccess is set (has been assigned a value) and false otherwise */
  public boolean isSetTestSuccess() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TESTSUCCESS_ISSET_ID);
  }

  public void setTestSuccessIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TESTSUCCESS_ISSET_ID, value);
  }

  public int getScorePoint() {
    return this.scorePoint;
  }

  public void setScorePoint(int scorePoint) {
    this.scorePoint = scorePoint;
    setScorePointIsSet(true);
  }

  public void unsetScorePoint() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCOREPOINT_ISSET_ID);
  }

  /** Returns true if field scorePoint is set (has been assigned a value) and false otherwise */
  public boolean isSetScorePoint() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCOREPOINT_ISSET_ID);
  }

  public void setScorePointIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCOREPOINT_ISSET_ID, value);
  }

  public com.goldgov.codepractice.api.RpcExercise getExercise() {
    return this.exercise;
  }

  public void setExercise(com.goldgov.codepractice.api.RpcExercise exercise) {
    this.exercise = exercise;
  }

  public void unsetExercise() {
    this.exercise = null;
  }

  /** Returns true if field exercise is set (has been assigned a value) and false otherwise */
  public boolean isSetExercise() {
    return this.exercise != null;
  }

  public void setExerciseIsSet(boolean value) {
    if (!value) {
      this.exercise = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case EXAM_PAPER_ID:
      if (value == null) {
        unsetExamPaperID();
      } else {
        setExamPaperID((java.lang.Integer)value);
      }
      break;

    case EXAMINEE_ID:
      if (value == null) {
        unsetExamineeID();
      } else {
        setExamineeID((java.lang.String)value);
      }
      break;

    case CODE_CONTENT:
      if (value == null) {
        unsetCodeContent();
      } else {
        setCodeContent((java.lang.String)value);
      }
      break;

    case COMPILED_SUCCESS:
      if (value == null) {
        unsetCompiledSuccess();
      } else {
        setCompiledSuccess((java.lang.Boolean)value);
      }
      break;

    case TEST_SUCCESS:
      if (value == null) {
        unsetTestSuccess();
      } else {
        setTestSuccess((java.lang.Boolean)value);
      }
      break;

    case SCORE_POINT:
      if (value == null) {
        unsetScorePoint();
      } else {
        setScorePoint((java.lang.Integer)value);
      }
      break;

    case EXERCISE:
      if (value == null) {
        unsetExercise();
      } else {
        setExercise((com.goldgov.codepractice.api.RpcExercise)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EXAM_PAPER_ID:
      return getExamPaperID();

    case EXAMINEE_ID:
      return getExamineeID();

    case CODE_CONTENT:
      return getCodeContent();

    case COMPILED_SUCCESS:
      return isCompiledSuccess();

    case TEST_SUCCESS:
      return isTestSuccess();

    case SCORE_POINT:
      return getScorePoint();

    case EXERCISE:
      return getExercise();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EXAM_PAPER_ID:
      return isSetExamPaperID();
    case EXAMINEE_ID:
      return isSetExamineeID();
    case CODE_CONTENT:
      return isSetCodeContent();
    case COMPILED_SUCCESS:
      return isSetCompiledSuccess();
    case TEST_SUCCESS:
      return isSetTestSuccess();
    case SCORE_POINT:
      return isSetScorePoint();
    case EXERCISE:
      return isSetExercise();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RpcExamPaper)
      return this.equals((RpcExamPaper)that);
    return false;
  }

  public boolean equals(RpcExamPaper that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_examPaperID = true;
    boolean that_present_examPaperID = true;
    if (this_present_examPaperID || that_present_examPaperID) {
      if (!(this_present_examPaperID && that_present_examPaperID))
        return false;
      if (this.examPaperID != that.examPaperID)
        return false;
    }

    boolean this_present_examineeID = true && this.isSetExamineeID();
    boolean that_present_examineeID = true && that.isSetExamineeID();
    if (this_present_examineeID || that_present_examineeID) {
      if (!(this_present_examineeID && that_present_examineeID))
        return false;
      if (!this.examineeID.equals(that.examineeID))
        return false;
    }

    boolean this_present_codeContent = true && this.isSetCodeContent();
    boolean that_present_codeContent = true && that.isSetCodeContent();
    if (this_present_codeContent || that_present_codeContent) {
      if (!(this_present_codeContent && that_present_codeContent))
        return false;
      if (!this.codeContent.equals(that.codeContent))
        return false;
    }

    boolean this_present_compiledSuccess = true;
    boolean that_present_compiledSuccess = true;
    if (this_present_compiledSuccess || that_present_compiledSuccess) {
      if (!(this_present_compiledSuccess && that_present_compiledSuccess))
        return false;
      if (this.compiledSuccess != that.compiledSuccess)
        return false;
    }

    boolean this_present_testSuccess = true;
    boolean that_present_testSuccess = true;
    if (this_present_testSuccess || that_present_testSuccess) {
      if (!(this_present_testSuccess && that_present_testSuccess))
        return false;
      if (this.testSuccess != that.testSuccess)
        return false;
    }

    boolean this_present_scorePoint = true;
    boolean that_present_scorePoint = true;
    if (this_present_scorePoint || that_present_scorePoint) {
      if (!(this_present_scorePoint && that_present_scorePoint))
        return false;
      if (this.scorePoint != that.scorePoint)
        return false;
    }

    boolean this_present_exercise = true && this.isSetExercise();
    boolean that_present_exercise = true && that.isSetExercise();
    if (this_present_exercise || that_present_exercise) {
      if (!(this_present_exercise && that_present_exercise))
        return false;
      if (!this.exercise.equals(that.exercise))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + examPaperID;

    hashCode = hashCode * 8191 + ((isSetExamineeID()) ? 131071 : 524287);
    if (isSetExamineeID())
      hashCode = hashCode * 8191 + examineeID.hashCode();

    hashCode = hashCode * 8191 + ((isSetCodeContent()) ? 131071 : 524287);
    if (isSetCodeContent())
      hashCode = hashCode * 8191 + codeContent.hashCode();

    hashCode = hashCode * 8191 + ((compiledSuccess) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((testSuccess) ? 131071 : 524287);

    hashCode = hashCode * 8191 + scorePoint;

    hashCode = hashCode * 8191 + ((isSetExercise()) ? 131071 : 524287);
    if (isSetExercise())
      hashCode = hashCode * 8191 + exercise.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RpcExamPaper other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetExamPaperID()).compareTo(other.isSetExamPaperID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExamPaperID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.examPaperID, other.examPaperID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExamineeID()).compareTo(other.isSetExamineeID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExamineeID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.examineeID, other.examineeID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCodeContent()).compareTo(other.isSetCodeContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCodeContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.codeContent, other.codeContent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCompiledSuccess()).compareTo(other.isSetCompiledSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompiledSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.compiledSuccess, other.compiledSuccess);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTestSuccess()).compareTo(other.isSetTestSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTestSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.testSuccess, other.testSuccess);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetScorePoint()).compareTo(other.isSetScorePoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScorePoint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scorePoint, other.scorePoint);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExercise()).compareTo(other.isSetExercise());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExercise()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exercise, other.exercise);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RpcExamPaper(");
    boolean first = true;

    sb.append("examPaperID:");
    sb.append(this.examPaperID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("examineeID:");
    if (this.examineeID == null) {
      sb.append("null");
    } else {
      sb.append(this.examineeID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("codeContent:");
    if (this.codeContent == null) {
      sb.append("null");
    } else {
      sb.append(this.codeContent);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("compiledSuccess:");
    sb.append(this.compiledSuccess);
    first = false;
    if (!first) sb.append(", ");
    sb.append("testSuccess:");
    sb.append(this.testSuccess);
    first = false;
    if (!first) sb.append(", ");
    sb.append("scorePoint:");
    sb.append(this.scorePoint);
    first = false;
    if (!first) sb.append(", ");
    sb.append("exercise:");
    if (this.exercise == null) {
      sb.append("null");
    } else {
      sb.append(this.exercise);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (exercise != null) {
      exercise.validate();
    }
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

  private static class RpcExamPaperStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RpcExamPaperStandardScheme getScheme() {
      return new RpcExamPaperStandardScheme();
    }
  }

  private static class RpcExamPaperStandardScheme extends org.apache.thrift.scheme.StandardScheme<RpcExamPaper> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RpcExamPaper struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXAM_PAPER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.examPaperID = iprot.readI32();
              struct.setExamPaperIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXAMINEE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.examineeID = iprot.readString();
              struct.setExamineeIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CODE_CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.codeContent = iprot.readString();
              struct.setCodeContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COMPILED_SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.compiledSuccess = iprot.readBool();
              struct.setCompiledSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TEST_SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.testSuccess = iprot.readBool();
              struct.setTestSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SCORE_POINT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.scorePoint = iprot.readI32();
              struct.setScorePointIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // EXERCISE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.exercise = new com.goldgov.codepractice.api.RpcExercise();
              struct.exercise.read(iprot);
              struct.setExerciseIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RpcExamPaper struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(EXAM_PAPER_ID_FIELD_DESC);
      oprot.writeI32(struct.examPaperID);
      oprot.writeFieldEnd();
      if (struct.examineeID != null) {
        oprot.writeFieldBegin(EXAMINEE_ID_FIELD_DESC);
        oprot.writeString(struct.examineeID);
        oprot.writeFieldEnd();
      }
      if (struct.codeContent != null) {
        oprot.writeFieldBegin(CODE_CONTENT_FIELD_DESC);
        oprot.writeString(struct.codeContent);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COMPILED_SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.compiledSuccess);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TEST_SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.testSuccess);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SCORE_POINT_FIELD_DESC);
      oprot.writeI32(struct.scorePoint);
      oprot.writeFieldEnd();
      if (struct.exercise != null) {
        oprot.writeFieldBegin(EXERCISE_FIELD_DESC);
        struct.exercise.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RpcExamPaperTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RpcExamPaperTupleScheme getScheme() {
      return new RpcExamPaperTupleScheme();
    }
  }

  private static class RpcExamPaperTupleScheme extends org.apache.thrift.scheme.TupleScheme<RpcExamPaper> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RpcExamPaper struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetExamPaperID()) {
        optionals.set(0);
      }
      if (struct.isSetExamineeID()) {
        optionals.set(1);
      }
      if (struct.isSetCodeContent()) {
        optionals.set(2);
      }
      if (struct.isSetCompiledSuccess()) {
        optionals.set(3);
      }
      if (struct.isSetTestSuccess()) {
        optionals.set(4);
      }
      if (struct.isSetScorePoint()) {
        optionals.set(5);
      }
      if (struct.isSetExercise()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetExamPaperID()) {
        oprot.writeI32(struct.examPaperID);
      }
      if (struct.isSetExamineeID()) {
        oprot.writeString(struct.examineeID);
      }
      if (struct.isSetCodeContent()) {
        oprot.writeString(struct.codeContent);
      }
      if (struct.isSetCompiledSuccess()) {
        oprot.writeBool(struct.compiledSuccess);
      }
      if (struct.isSetTestSuccess()) {
        oprot.writeBool(struct.testSuccess);
      }
      if (struct.isSetScorePoint()) {
        oprot.writeI32(struct.scorePoint);
      }
      if (struct.isSetExercise()) {
        struct.exercise.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RpcExamPaper struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.examPaperID = iprot.readI32();
        struct.setExamPaperIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.examineeID = iprot.readString();
        struct.setExamineeIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.codeContent = iprot.readString();
        struct.setCodeContentIsSet(true);
      }
      if (incoming.get(3)) {
        struct.compiledSuccess = iprot.readBool();
        struct.setCompiledSuccessIsSet(true);
      }
      if (incoming.get(4)) {
        struct.testSuccess = iprot.readBool();
        struct.setTestSuccessIsSet(true);
      }
      if (incoming.get(5)) {
        struct.scorePoint = iprot.readI32();
        struct.setScorePointIsSet(true);
      }
      if (incoming.get(6)) {
        struct.exercise = new com.goldgov.codepractice.api.RpcExercise();
        struct.exercise.read(iprot);
        struct.setExerciseIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
