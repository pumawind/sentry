/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.provider.db.service.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-02")
public class TRenamePrivilegesRequest implements org.apache.thrift.TBase<TRenamePrivilegesRequest, TRenamePrivilegesRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TRenamePrivilegesRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRenamePrivilegesRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REQUESTOR_USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("requestorUserName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField OLD_AUTHORIZABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("oldAuthorizable", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField NEW_AUTHORIZABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("newAuthorizable", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TRenamePrivilegesRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TRenamePrivilegesRequestTupleSchemeFactory());
  }

  private int protocol_version; // required
  private String requestorUserName; // required
  private TSentryAuthorizable oldAuthorizable; // required
  private TSentryAuthorizable newAuthorizable; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROTOCOL_VERSION((short)1, "protocol_version"),
    REQUESTOR_USER_NAME((short)2, "requestorUserName"),
    OLD_AUTHORIZABLE((short)3, "oldAuthorizable"),
    NEW_AUTHORIZABLE((short)4, "newAuthorizable");

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
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // REQUESTOR_USER_NAME
          return REQUESTOR_USER_NAME;
        case 3: // OLD_AUTHORIZABLE
          return OLD_AUTHORIZABLE;
        case 4: // NEW_AUTHORIZABLE
          return NEW_AUTHORIZABLE;
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
  private static final int __PROTOCOL_VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REQUESTOR_USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("requestorUserName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OLD_AUTHORIZABLE, new org.apache.thrift.meta_data.FieldMetaData("oldAuthorizable", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSentryAuthorizable.class)));
    tmpMap.put(_Fields.NEW_AUTHORIZABLE, new org.apache.thrift.meta_data.FieldMetaData("newAuthorizable", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSentryAuthorizable.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRenamePrivilegesRequest.class, metaDataMap);
  }

  public TRenamePrivilegesRequest() {
    this.protocol_version = 2;

  }

  public TRenamePrivilegesRequest(
    int protocol_version,
    String requestorUserName,
    TSentryAuthorizable oldAuthorizable,
    TSentryAuthorizable newAuthorizable)
  {
    this();
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
    this.requestorUserName = requestorUserName;
    this.oldAuthorizable = oldAuthorizable;
    this.newAuthorizable = newAuthorizable;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRenamePrivilegesRequest(TRenamePrivilegesRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.protocol_version = other.protocol_version;
    if (other.isSetRequestorUserName()) {
      this.requestorUserName = other.requestorUserName;
    }
    if (other.isSetOldAuthorizable()) {
      this.oldAuthorizable = new TSentryAuthorizable(other.oldAuthorizable);
    }
    if (other.isSetNewAuthorizable()) {
      this.newAuthorizable = new TSentryAuthorizable(other.newAuthorizable);
    }
  }

  public TRenamePrivilegesRequest deepCopy() {
    return new TRenamePrivilegesRequest(this);
  }

  @Override
  public void clear() {
    this.protocol_version = 2;

    this.requestorUserName = null;
    this.oldAuthorizable = null;
    this.newAuthorizable = null;
  }

  public int getProtocol_version() {
    return this.protocol_version;
  }

  public void setProtocol_version(int protocol_version) {
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
  }

  public void unsetProtocol_version() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol_version() {
    return EncodingUtils.testBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  public void setProtocol_versionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID, value);
  }

  public String getRequestorUserName() {
    return this.requestorUserName;
  }

  public void setRequestorUserName(String requestorUserName) {
    this.requestorUserName = requestorUserName;
  }

  public void unsetRequestorUserName() {
    this.requestorUserName = null;
  }

  /** Returns true if field requestorUserName is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestorUserName() {
    return this.requestorUserName != null;
  }

  public void setRequestorUserNameIsSet(boolean value) {
    if (!value) {
      this.requestorUserName = null;
    }
  }

  public TSentryAuthorizable getOldAuthorizable() {
    return this.oldAuthorizable;
  }

  public void setOldAuthorizable(TSentryAuthorizable oldAuthorizable) {
    this.oldAuthorizable = oldAuthorizable;
  }

  public void unsetOldAuthorizable() {
    this.oldAuthorizable = null;
  }

  /** Returns true if field oldAuthorizable is set (has been assigned a value) and false otherwise */
  public boolean isSetOldAuthorizable() {
    return this.oldAuthorizable != null;
  }

  public void setOldAuthorizableIsSet(boolean value) {
    if (!value) {
      this.oldAuthorizable = null;
    }
  }

  public TSentryAuthorizable getNewAuthorizable() {
    return this.newAuthorizable;
  }

  public void setNewAuthorizable(TSentryAuthorizable newAuthorizable) {
    this.newAuthorizable = newAuthorizable;
  }

  public void unsetNewAuthorizable() {
    this.newAuthorizable = null;
  }

  /** Returns true if field newAuthorizable is set (has been assigned a value) and false otherwise */
  public boolean isSetNewAuthorizable() {
    return this.newAuthorizable != null;
  }

  public void setNewAuthorizableIsSet(boolean value) {
    if (!value) {
      this.newAuthorizable = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((Integer)value);
      }
      break;

    case REQUESTOR_USER_NAME:
      if (value == null) {
        unsetRequestorUserName();
      } else {
        setRequestorUserName((String)value);
      }
      break;

    case OLD_AUTHORIZABLE:
      if (value == null) {
        unsetOldAuthorizable();
      } else {
        setOldAuthorizable((TSentryAuthorizable)value);
      }
      break;

    case NEW_AUTHORIZABLE:
      if (value == null) {
        unsetNewAuthorizable();
      } else {
        setNewAuthorizable((TSentryAuthorizable)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocol_version();

    case REQUESTOR_USER_NAME:
      return getRequestorUserName();

    case OLD_AUTHORIZABLE:
      return getOldAuthorizable();

    case NEW_AUTHORIZABLE:
      return getNewAuthorizable();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocol_version();
    case REQUESTOR_USER_NAME:
      return isSetRequestorUserName();
    case OLD_AUTHORIZABLE:
      return isSetOldAuthorizable();
    case NEW_AUTHORIZABLE:
      return isSetNewAuthorizable();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TRenamePrivilegesRequest)
      return this.equals((TRenamePrivilegesRequest)that);
    return false;
  }

  public boolean equals(TRenamePrivilegesRequest that) {
    if (that == null)
      return false;

    boolean this_present_protocol_version = true;
    boolean that_present_protocol_version = true;
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (this.protocol_version != that.protocol_version)
        return false;
    }

    boolean this_present_requestorUserName = true && this.isSetRequestorUserName();
    boolean that_present_requestorUserName = true && that.isSetRequestorUserName();
    if (this_present_requestorUserName || that_present_requestorUserName) {
      if (!(this_present_requestorUserName && that_present_requestorUserName))
        return false;
      if (!this.requestorUserName.equals(that.requestorUserName))
        return false;
    }

    boolean this_present_oldAuthorizable = true && this.isSetOldAuthorizable();
    boolean that_present_oldAuthorizable = true && that.isSetOldAuthorizable();
    if (this_present_oldAuthorizable || that_present_oldAuthorizable) {
      if (!(this_present_oldAuthorizable && that_present_oldAuthorizable))
        return false;
      if (!this.oldAuthorizable.equals(that.oldAuthorizable))
        return false;
    }

    boolean this_present_newAuthorizable = true && this.isSetNewAuthorizable();
    boolean that_present_newAuthorizable = true && that.isSetNewAuthorizable();
    if (this_present_newAuthorizable || that_present_newAuthorizable) {
      if (!(this_present_newAuthorizable && that_present_newAuthorizable))
        return false;
      if (!this.newAuthorizable.equals(that.newAuthorizable))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_protocol_version = true;
    list.add(present_protocol_version);
    if (present_protocol_version)
      list.add(protocol_version);

    boolean present_requestorUserName = true && (isSetRequestorUserName());
    list.add(present_requestorUserName);
    if (present_requestorUserName)
      list.add(requestorUserName);

    boolean present_oldAuthorizable = true && (isSetOldAuthorizable());
    list.add(present_oldAuthorizable);
    if (present_oldAuthorizable)
      list.add(oldAuthorizable);

    boolean present_newAuthorizable = true && (isSetNewAuthorizable());
    list.add(present_newAuthorizable);
    if (present_newAuthorizable)
      list.add(newAuthorizable);

    return list.hashCode();
  }

  @Override
  public int compareTo(TRenamePrivilegesRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProtocol_version()).compareTo(other.isSetProtocol_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, other.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestorUserName()).compareTo(other.isSetRequestorUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestorUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestorUserName, other.requestorUserName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOldAuthorizable()).compareTo(other.isSetOldAuthorizable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOldAuthorizable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oldAuthorizable, other.oldAuthorizable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNewAuthorizable()).compareTo(other.isSetNewAuthorizable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewAuthorizable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newAuthorizable, other.newAuthorizable);
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
    StringBuilder sb = new StringBuilder("TRenamePrivilegesRequest(");
    boolean first = true;

    sb.append("protocol_version:");
    sb.append(this.protocol_version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestorUserName:");
    if (this.requestorUserName == null) {
      sb.append("null");
    } else {
      sb.append(this.requestorUserName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("oldAuthorizable:");
    if (this.oldAuthorizable == null) {
      sb.append("null");
    } else {
      sb.append(this.oldAuthorizable);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("newAuthorizable:");
    if (this.newAuthorizable == null) {
      sb.append("null");
    } else {
      sb.append(this.newAuthorizable);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetProtocol_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' is unset! Struct:" + toString());
    }

    if (!isSetRequestorUserName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requestorUserName' is unset! Struct:" + toString());
    }

    if (!isSetOldAuthorizable()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'oldAuthorizable' is unset! Struct:" + toString());
    }

    if (!isSetNewAuthorizable()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'newAuthorizable' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (oldAuthorizable != null) {
      oldAuthorizable.validate();
    }
    if (newAuthorizable != null) {
      newAuthorizable.validate();
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TRenamePrivilegesRequestStandardSchemeFactory implements SchemeFactory {
    public TRenamePrivilegesRequestStandardScheme getScheme() {
      return new TRenamePrivilegesRequestStandardScheme();
    }
  }

  private static class TRenamePrivilegesRequestStandardScheme extends StandardScheme<TRenamePrivilegesRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRenamePrivilegesRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocol_version = iprot.readI32();
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUESTOR_USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestorUserName = iprot.readString();
              struct.setRequestorUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OLD_AUTHORIZABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.oldAuthorizable = new TSentryAuthorizable();
              struct.oldAuthorizable.read(iprot);
              struct.setOldAuthorizableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NEW_AUTHORIZABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.newAuthorizable = new TSentryAuthorizable();
              struct.newAuthorizable.read(iprot);
              struct.setNewAuthorizableIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRenamePrivilegesRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
      oprot.writeI32(struct.protocol_version);
      oprot.writeFieldEnd();
      if (struct.requestorUserName != null) {
        oprot.writeFieldBegin(REQUESTOR_USER_NAME_FIELD_DESC);
        oprot.writeString(struct.requestorUserName);
        oprot.writeFieldEnd();
      }
      if (struct.oldAuthorizable != null) {
        oprot.writeFieldBegin(OLD_AUTHORIZABLE_FIELD_DESC);
        struct.oldAuthorizable.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.newAuthorizable != null) {
        oprot.writeFieldBegin(NEW_AUTHORIZABLE_FIELD_DESC);
        struct.newAuthorizable.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRenamePrivilegesRequestTupleSchemeFactory implements SchemeFactory {
    public TRenamePrivilegesRequestTupleScheme getScheme() {
      return new TRenamePrivilegesRequestTupleScheme();
    }
  }

  private static class TRenamePrivilegesRequestTupleScheme extends TupleScheme<TRenamePrivilegesRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRenamePrivilegesRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version);
      oprot.writeString(struct.requestorUserName);
      struct.oldAuthorizable.write(oprot);
      struct.newAuthorizable.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRenamePrivilegesRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = iprot.readI32();
      struct.setProtocol_versionIsSet(true);
      struct.requestorUserName = iprot.readString();
      struct.setRequestorUserNameIsSet(true);
      struct.oldAuthorizable = new TSentryAuthorizable();
      struct.oldAuthorizable.read(iprot);
      struct.setOldAuthorizableIsSet(true);
      struct.newAuthorizable = new TSentryAuthorizable();
      struct.newAuthorizable.read(iprot);
      struct.setNewAuthorizableIsSet(true);
    }
  }

}

