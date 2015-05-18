/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cic.thrift;
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

public class ad_ret implements org.apache.thrift.TBase<ad_ret, ad_ret._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ad_ret");

  private static final org.apache.thrift.protocol.TField KEYWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("keyword", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BID_FIELD_DESC = new org.apache.thrift.protocol.TField("bid", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField ADID_FIELD_DESC = new org.apache.thrift.protocol.TField("adid", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ad_retStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ad_retTupleSchemeFactory());
  }

  public String keyword; // required
  public double bid; // required
  public int adid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEYWORD((short)1, "keyword"),
    BID((short)2, "bid"),
    ADID((short)3, "adid");

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
        case 1: // KEYWORD
          return KEYWORD;
        case 2: // BID
          return BID;
        case 3: // ADID
          return ADID;
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
  private static final int __BID_ISSET_ID = 0;
  private static final int __ADID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEYWORD, new org.apache.thrift.meta_data.FieldMetaData("keyword", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BID, new org.apache.thrift.meta_data.FieldMetaData("bid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.ADID, new org.apache.thrift.meta_data.FieldMetaData("adid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ad_ret.class, metaDataMap);
  }

  public ad_ret() {
  }

  public ad_ret(
    String keyword,
    double bid,
    int adid)
  {
    this();
    this.keyword = keyword;
    this.bid = bid;
    setBidIsSet(true);
    this.adid = adid;
    setAdidIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ad_ret(ad_ret other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetKeyword()) {
      this.keyword = other.keyword;
    }
    this.bid = other.bid;
    this.adid = other.adid;
  }

  public ad_ret deepCopy() {
    return new ad_ret(this);
  }

  @Override
  public void clear() {
    this.keyword = null;
    setBidIsSet(false);
    this.bid = 0.0;
    setAdidIsSet(false);
    this.adid = 0;
  }

  public String getKeyword() {
    return this.keyword;
  }

  public ad_ret setKeyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  public void unsetKeyword() {
    this.keyword = null;
  }

  /** Returns true if field keyword is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyword() {
    return this.keyword != null;
  }

  public void setKeywordIsSet(boolean value) {
    if (!value) {
      this.keyword = null;
    }
  }

  public double getBid() {
    return this.bid;
  }

  public ad_ret setBid(double bid) {
    this.bid = bid;
    setBidIsSet(true);
    return this;
  }

  public void unsetBid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BID_ISSET_ID);
  }

  /** Returns true if field bid is set (has been assigned a value) and false otherwise */
  public boolean isSetBid() {
    return EncodingUtils.testBit(__isset_bitfield, __BID_ISSET_ID);
  }

  public void setBidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BID_ISSET_ID, value);
  }

  public int getAdid() {
    return this.adid;
  }

  public ad_ret setAdid(int adid) {
    this.adid = adid;
    setAdidIsSet(true);
    return this;
  }

  public void unsetAdid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ADID_ISSET_ID);
  }

  /** Returns true if field adid is set (has been assigned a value) and false otherwise */
  public boolean isSetAdid() {
    return EncodingUtils.testBit(__isset_bitfield, __ADID_ISSET_ID);
  }

  public void setAdidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ADID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEYWORD:
      if (value == null) {
        unsetKeyword();
      } else {
        setKeyword((String)value);
      }
      break;

    case BID:
      if (value == null) {
        unsetBid();
      } else {
        setBid((Double)value);
      }
      break;

    case ADID:
      if (value == null) {
        unsetAdid();
      } else {
        setAdid((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEYWORD:
      return getKeyword();

    case BID:
      return Double.valueOf(getBid());

    case ADID:
      return Integer.valueOf(getAdid());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEYWORD:
      return isSetKeyword();
    case BID:
      return isSetBid();
    case ADID:
      return isSetAdid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ad_ret)
      return this.equals((ad_ret)that);
    return false;
  }

  public boolean equals(ad_ret that) {
    if (that == null)
      return false;

    boolean this_present_keyword = true && this.isSetKeyword();
    boolean that_present_keyword = true && that.isSetKeyword();
    if (this_present_keyword || that_present_keyword) {
      if (!(this_present_keyword && that_present_keyword))
        return false;
      if (!this.keyword.equals(that.keyword))
        return false;
    }

    boolean this_present_bid = true;
    boolean that_present_bid = true;
    if (this_present_bid || that_present_bid) {
      if (!(this_present_bid && that_present_bid))
        return false;
      if (this.bid != that.bid)
        return false;
    }

    boolean this_present_adid = true;
    boolean that_present_adid = true;
    if (this_present_adid || that_present_adid) {
      if (!(this_present_adid && that_present_adid))
        return false;
      if (this.adid != that.adid)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ad_ret other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ad_ret typedOther = (ad_ret)other;

    lastComparison = Boolean.valueOf(isSetKeyword()).compareTo(typedOther.isSetKeyword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyword, typedOther.keyword);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBid()).compareTo(typedOther.isSetBid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bid, typedOther.bid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdid()).compareTo(typedOther.isSetAdid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adid, typedOther.adid);
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
    StringBuilder sb = new StringBuilder("ad_ret(");
    boolean first = true;

    sb.append("keyword:");
    if (this.keyword == null) {
      sb.append("null");
    } else {
      sb.append(this.keyword);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bid:");
    sb.append(this.bid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("adid:");
    sb.append(this.adid);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ad_retStandardSchemeFactory implements SchemeFactory {
    public ad_retStandardScheme getScheme() {
      return new ad_retStandardScheme();
    }
  }

  private static class ad_retStandardScheme extends StandardScheme<ad_ret> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ad_ret struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEYWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.keyword = iprot.readString();
              struct.setKeywordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BID
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.bid = iprot.readDouble();
              struct.setBidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.adid = iprot.readI32();
              struct.setAdidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ad_ret struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.keyword != null) {
        oprot.writeFieldBegin(KEYWORD_FIELD_DESC);
        oprot.writeString(struct.keyword);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(BID_FIELD_DESC);
      oprot.writeDouble(struct.bid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ADID_FIELD_DESC);
      oprot.writeI32(struct.adid);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ad_retTupleSchemeFactory implements SchemeFactory {
    public ad_retTupleScheme getScheme() {
      return new ad_retTupleScheme();
    }
  }

  private static class ad_retTupleScheme extends TupleScheme<ad_ret> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ad_ret struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetKeyword()) {
        optionals.set(0);
      }
      if (struct.isSetBid()) {
        optionals.set(1);
      }
      if (struct.isSetAdid()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetKeyword()) {
        oprot.writeString(struct.keyword);
      }
      if (struct.isSetBid()) {
        oprot.writeDouble(struct.bid);
      }
      if (struct.isSetAdid()) {
        oprot.writeI32(struct.adid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ad_ret struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.keyword = iprot.readString();
        struct.setKeywordIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bid = iprot.readDouble();
        struct.setBidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.adid = iprot.readI32();
        struct.setAdidIsSet(true);
      }
    }
  }

}
