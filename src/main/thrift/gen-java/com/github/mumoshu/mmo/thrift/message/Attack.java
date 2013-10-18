/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.github.mumoshu.mmo.thrift.message;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Attack implements org.apache.thrift.TBase<Attack, Attack._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Attack");

  private static final org.apache.thrift.protocol.TField ATTACKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("attackerId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("targetId", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AttackStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AttackTupleSchemeFactory());
  }

  public String attackerId; // required
  public String targetId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ATTACKER_ID((short)1, "attackerId"),
    TARGET_ID((short)2, "targetId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ATTACKER_ID
          return ATTACKER_ID;
        case 2: // TARGET_ID
          return TARGET_ID;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ATTACKER_ID, new org.apache.thrift.meta_data.FieldMetaData("attackerId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TARGET_ID, new org.apache.thrift.meta_data.FieldMetaData("targetId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Attack.class, metaDataMap);
  }

  public Attack() {
  }

  public Attack(
    String attackerId,
    String targetId)
  {
    this();
    this.attackerId = attackerId;
    this.targetId = targetId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Attack(Attack other) {
    if (other.isSetAttackerId()) {
      this.attackerId = other.attackerId;
    }
    if (other.isSetTargetId()) {
      this.targetId = other.targetId;
    }
  }

  public Attack deepCopy() {
    return new Attack(this);
  }

  @Override
  public void clear() {
    this.attackerId = null;
    this.targetId = null;
  }

  public String getAttackerId() {
    return this.attackerId;
  }

  public Attack setAttackerId(String attackerId) {
    this.attackerId = attackerId;
    return this;
  }

  public void unsetAttackerId() {
    this.attackerId = null;
  }

  /** Returns true if field attackerId is set (has been assigned a value) and false otherwise */
  public boolean isSetAttackerId() {
    return this.attackerId != null;
  }

  public void setAttackerIdIsSet(boolean value) {
    if (!value) {
      this.attackerId = null;
    }
  }

  public String getTargetId() {
    return this.targetId;
  }

  public Attack setTargetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  public void unsetTargetId() {
    this.targetId = null;
  }

  /** Returns true if field targetId is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetId() {
    return this.targetId != null;
  }

  public void setTargetIdIsSet(boolean value) {
    if (!value) {
      this.targetId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ATTACKER_ID:
      if (value == null) {
        unsetAttackerId();
      } else {
        setAttackerId((String)value);
      }
      break;

    case TARGET_ID:
      if (value == null) {
        unsetTargetId();
      } else {
        setTargetId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ATTACKER_ID:
      return getAttackerId();

    case TARGET_ID:
      return getTargetId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ATTACKER_ID:
      return isSetAttackerId();
    case TARGET_ID:
      return isSetTargetId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Attack)
      return this.equals((Attack)that);
    return false;
  }

  public boolean equals(Attack that) {
    if (that == null)
      return false;

    boolean this_present_attackerId = true && this.isSetAttackerId();
    boolean that_present_attackerId = true && that.isSetAttackerId();
    if (this_present_attackerId || that_present_attackerId) {
      if (!(this_present_attackerId && that_present_attackerId))
        return false;
      if (!this.attackerId.equals(that.attackerId))
        return false;
    }

    boolean this_present_targetId = true && this.isSetTargetId();
    boolean that_present_targetId = true && that.isSetTargetId();
    if (this_present_targetId || that_present_targetId) {
      if (!(this_present_targetId && that_present_targetId))
        return false;
      if (!this.targetId.equals(that.targetId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Attack other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Attack typedOther = (Attack)other;

    lastComparison = Boolean.valueOf(isSetAttackerId()).compareTo(typedOther.isSetAttackerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttackerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attackerId, typedOther.attackerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTargetId()).compareTo(typedOther.isSetTargetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetId, typedOther.targetId);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Attack(");
    boolean first = true;

    sb.append("attackerId:");
    if (this.attackerId == null) {
      sb.append("null");
    } else {
      sb.append(this.attackerId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("targetId:");
    if (this.targetId == null) {
      sb.append("null");
    } else {
      sb.append(this.targetId);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AttackStandardSchemeFactory implements SchemeFactory {
    public AttackStandardScheme getScheme() {
      return new AttackStandardScheme();
    }
  }

  private static class AttackStandardScheme extends StandardScheme<Attack> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Attack struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ATTACKER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.attackerId = iprot.readString();
              struct.setAttackerIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.targetId = iprot.readString();
              struct.setTargetIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Attack struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.attackerId != null) {
        oprot.writeFieldBegin(ATTACKER_ID_FIELD_DESC);
        oprot.writeString(struct.attackerId);
        oprot.writeFieldEnd();
      }
      if (struct.targetId != null) {
        oprot.writeFieldBegin(TARGET_ID_FIELD_DESC);
        oprot.writeString(struct.targetId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AttackTupleSchemeFactory implements SchemeFactory {
    public AttackTupleScheme getScheme() {
      return new AttackTupleScheme();
    }
  }

  private static class AttackTupleScheme extends TupleScheme<Attack> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Attack struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAttackerId()) {
        optionals.set(0);
      }
      if (struct.isSetTargetId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAttackerId()) {
        oprot.writeString(struct.attackerId);
      }
      if (struct.isSetTargetId()) {
        oprot.writeString(struct.targetId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Attack struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.attackerId = iprot.readString();
        struct.setAttackerIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.targetId = iprot.readString();
        struct.setTargetIdIsSet(true);
      }
    }
  }

}

