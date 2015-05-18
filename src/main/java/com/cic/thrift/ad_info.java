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

public class ad_info implements org.apache.thrift.TBase<ad_info, ad_info._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ad_info");

  private static final org.apache.thrift.protocol.TField OS_FIELD_DESC = new org.apache.thrift.protocol.TField("os", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BROWSER_FIELD_DESC = new org.apache.thrift.protocol.TField("browser", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CATEGORY_FIELD_DESC = new org.apache.thrift.protocol.TField("category", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SEARCH_WORD_FIELD_DESC = new org.apache.thrift.protocol.TField("searchWord", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ad_infoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ad_infoTupleSchemeFactory());
  }

  public String os; // required
  public String browser; // required
  public String category; // required
  public String searchWord; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OS((short)1, "os"),
    BROWSER((short)2, "browser"),
    CATEGORY((short)3, "category"),
    SEARCH_WORD((short)4, "searchWord");

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
        case 1: // OS
          return OS;
        case 2: // BROWSER
          return BROWSER;
        case 3: // CATEGORY
          return CATEGORY;
        case 4: // SEARCH_WORD
          return SEARCH_WORD;
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
    tmpMap.put(_Fields.OS, new org.apache.thrift.meta_data.FieldMetaData("os", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BROWSER, new org.apache.thrift.meta_data.FieldMetaData("browser", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CATEGORY, new org.apache.thrift.meta_data.FieldMetaData("category", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEARCH_WORD, new org.apache.thrift.meta_data.FieldMetaData("searchWord", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ad_info.class, metaDataMap);
  }

  public ad_info() {
  }

  public ad_info(
    String os,
    String browser,
    String category,
    String searchWord)
  {
    this();
    this.os = os;
    this.browser = browser;
    this.category = category;
    this.searchWord = searchWord;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ad_info(ad_info other) {
    if (other.isSetOs()) {
      this.os = other.os;
    }
    if (other.isSetBrowser()) {
      this.browser = other.browser;
    }
    if (other.isSetCategory()) {
      this.category = other.category;
    }
    if (other.isSetSearchWord()) {
      this.searchWord = other.searchWord;
    }
  }

  public ad_info deepCopy() {
    return new ad_info(this);
  }

  @Override
  public void clear() {
    this.os = null;
    this.browser = null;
    this.category = null;
    this.searchWord = null;
  }

  public String getOs() {
    return this.os;
  }

  public ad_info setOs(String os) {
    this.os = os;
    return this;
  }

  public void unsetOs() {
    this.os = null;
  }

  /** Returns true if field os is set (has been assigned a value) and false otherwise */
  public boolean isSetOs() {
    return this.os != null;
  }

  public void setOsIsSet(boolean value) {
    if (!value) {
      this.os = null;
    }
  }

  public String getBrowser() {
    return this.browser;
  }

  public ad_info setBrowser(String browser) {
    this.browser = browser;
    return this;
  }

  public void unsetBrowser() {
    this.browser = null;
  }

  /** Returns true if field browser is set (has been assigned a value) and false otherwise */
  public boolean isSetBrowser() {
    return this.browser != null;
  }

  public void setBrowserIsSet(boolean value) {
    if (!value) {
      this.browser = null;
    }
  }

  public String getCategory() {
    return this.category;
  }

  public ad_info setCategory(String category) {
    this.category = category;
    return this;
  }

  public void unsetCategory() {
    this.category = null;
  }

  /** Returns true if field category is set (has been assigned a value) and false otherwise */
  public boolean isSetCategory() {
    return this.category != null;
  }

  public void setCategoryIsSet(boolean value) {
    if (!value) {
      this.category = null;
    }
  }

  public String getSearchWord() {
    return this.searchWord;
  }

  public ad_info setSearchWord(String searchWord) {
    this.searchWord = searchWord;
    return this;
  }

  public void unsetSearchWord() {
    this.searchWord = null;
  }

  /** Returns true if field searchWord is set (has been assigned a value) and false otherwise */
  public boolean isSetSearchWord() {
    return this.searchWord != null;
  }

  public void setSearchWordIsSet(boolean value) {
    if (!value) {
      this.searchWord = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OS:
      if (value == null) {
        unsetOs();
      } else {
        setOs((String)value);
      }
      break;

    case BROWSER:
      if (value == null) {
        unsetBrowser();
      } else {
        setBrowser((String)value);
      }
      break;

    case CATEGORY:
      if (value == null) {
        unsetCategory();
      } else {
        setCategory((String)value);
      }
      break;

    case SEARCH_WORD:
      if (value == null) {
        unsetSearchWord();
      } else {
        setSearchWord((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OS:
      return getOs();

    case BROWSER:
      return getBrowser();

    case CATEGORY:
      return getCategory();

    case SEARCH_WORD:
      return getSearchWord();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OS:
      return isSetOs();
    case BROWSER:
      return isSetBrowser();
    case CATEGORY:
      return isSetCategory();
    case SEARCH_WORD:
      return isSetSearchWord();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ad_info)
      return this.equals((ad_info)that);
    return false;
  }

  public boolean equals(ad_info that) {
    if (that == null)
      return false;

    boolean this_present_os = true && this.isSetOs();
    boolean that_present_os = true && that.isSetOs();
    if (this_present_os || that_present_os) {
      if (!(this_present_os && that_present_os))
        return false;
      if (!this.os.equals(that.os))
        return false;
    }

    boolean this_present_browser = true && this.isSetBrowser();
    boolean that_present_browser = true && that.isSetBrowser();
    if (this_present_browser || that_present_browser) {
      if (!(this_present_browser && that_present_browser))
        return false;
      if (!this.browser.equals(that.browser))
        return false;
    }

    boolean this_present_category = true && this.isSetCategory();
    boolean that_present_category = true && that.isSetCategory();
    if (this_present_category || that_present_category) {
      if (!(this_present_category && that_present_category))
        return false;
      if (!this.category.equals(that.category))
        return false;
    }

    boolean this_present_searchWord = true && this.isSetSearchWord();
    boolean that_present_searchWord = true && that.isSetSearchWord();
    if (this_present_searchWord || that_present_searchWord) {
      if (!(this_present_searchWord && that_present_searchWord))
        return false;
      if (!this.searchWord.equals(that.searchWord))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ad_info other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ad_info typedOther = (ad_info)other;

    lastComparison = Boolean.valueOf(isSetOs()).compareTo(typedOther.isSetOs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.os, typedOther.os);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBrowser()).compareTo(typedOther.isSetBrowser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrowser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.browser, typedOther.browser);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCategory()).compareTo(typedOther.isSetCategory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.category, typedOther.category);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSearchWord()).compareTo(typedOther.isSetSearchWord());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSearchWord()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.searchWord, typedOther.searchWord);
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
    StringBuilder sb = new StringBuilder("ad_info(");
    boolean first = true;

    sb.append("os:");
    if (this.os == null) {
      sb.append("null");
    } else {
      sb.append(this.os);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("browser:");
    if (this.browser == null) {
      sb.append("null");
    } else {
      sb.append(this.browser);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("category:");
    if (this.category == null) {
      sb.append("null");
    } else {
      sb.append(this.category);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("searchWord:");
    if (this.searchWord == null) {
      sb.append("null");
    } else {
      sb.append(this.searchWord);
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

  private static class ad_infoStandardSchemeFactory implements SchemeFactory {
    public ad_infoStandardScheme getScheme() {
      return new ad_infoStandardScheme();
    }
  }

  private static class ad_infoStandardScheme extends StandardScheme<ad_info> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ad_info struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.os = iprot.readString();
              struct.setOsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BROWSER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.browser = iprot.readString();
              struct.setBrowserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CATEGORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.category = iprot.readString();
              struct.setCategoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SEARCH_WORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.searchWord = iprot.readString();
              struct.setSearchWordIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ad_info struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.os != null) {
        oprot.writeFieldBegin(OS_FIELD_DESC);
        oprot.writeString(struct.os);
        oprot.writeFieldEnd();
      }
      if (struct.browser != null) {
        oprot.writeFieldBegin(BROWSER_FIELD_DESC);
        oprot.writeString(struct.browser);
        oprot.writeFieldEnd();
      }
      if (struct.category != null) {
        oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
        oprot.writeString(struct.category);
        oprot.writeFieldEnd();
      }
      if (struct.searchWord != null) {
        oprot.writeFieldBegin(SEARCH_WORD_FIELD_DESC);
        oprot.writeString(struct.searchWord);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ad_infoTupleSchemeFactory implements SchemeFactory {
    public ad_infoTupleScheme getScheme() {
      return new ad_infoTupleScheme();
    }
  }

  private static class ad_infoTupleScheme extends TupleScheme<ad_info> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ad_info struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOs()) {
        optionals.set(0);
      }
      if (struct.isSetBrowser()) {
        optionals.set(1);
      }
      if (struct.isSetCategory()) {
        optionals.set(2);
      }
      if (struct.isSetSearchWord()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetOs()) {
        oprot.writeString(struct.os);
      }
      if (struct.isSetBrowser()) {
        oprot.writeString(struct.browser);
      }
      if (struct.isSetCategory()) {
        oprot.writeString(struct.category);
      }
      if (struct.isSetSearchWord()) {
        oprot.writeString(struct.searchWord);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ad_info struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.os = iprot.readString();
        struct.setOsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.browser = iprot.readString();
        struct.setBrowserIsSet(true);
      }
      if (incoming.get(2)) {
        struct.category = iprot.readString();
        struct.setCategoryIsSet(true);
      }
      if (incoming.get(3)) {
        struct.searchWord = iprot.readString();
        struct.setSearchWordIsSet(true);
      }
    }
  }

}
