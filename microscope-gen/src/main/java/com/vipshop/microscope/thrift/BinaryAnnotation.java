/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vipshop.microscope.thrift;

import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

public class BinaryAnnotation implements org.apache.thrift.TBase<BinaryAnnotation, BinaryAnnotation._Fields>, java.io.Serializable, Cloneable {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BinaryAnnotation");

	private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short) 1);
	private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short) 2);
	private static final org.apache.thrift.protocol.TField ANNOTATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("annotation_type", org.apache.thrift.protocol.TType.I32, (short) 3);
	private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRUCT, (short) 4);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
	static {
		schemes.put(StandardScheme.class, new BinaryAnnotationStandardSchemeFactory());
		schemes.put(TupleScheme.class, new BinaryAnnotationTupleSchemeFactory());
	}

	private String key; // required
	private ByteBuffer value; // required
	private AnnotationType annotation_type; // required
	private Endpoint host; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		KEY((short) 1, "key"), VALUE((short) 2, "value"),
		/**
		 * 
		 * @see AnnotationType
		 */
		ANNOTATION_TYPE((short) 3, "annotation_type"), HOST((short) 4, "host");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not
		 * found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
			case 1: // KEY
				return KEY;
			case 2: // VALUE
				return VALUE;
			case 3: // ANNOTATION_TYPE
				return ANNOTATION_TYPE;
			case 4: // HOST
				return HOST;
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
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not
		 * found.
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
	private _Fields optionals[] = { _Fields.HOST };
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
		tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(
				org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(
				org.apache.thrift.protocol.TType.STRING, true)));
		tmpMap.put(_Fields.ANNOTATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("annotation_type", org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, AnnotationType.class)));
		tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.StructMetaData(
				org.apache.thrift.protocol.TType.STRUCT, Endpoint.class)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BinaryAnnotation.class, metaDataMap);
	}

	public BinaryAnnotation() {
	}

	public BinaryAnnotation(String key, ByteBuffer value, AnnotationType annotation_type) {
		this();
		this.key = key;
		this.value = value;
		this.annotation_type = annotation_type;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public BinaryAnnotation(BinaryAnnotation other) {
		if (other.isSetKey()) {
			this.key = other.key;
		}
		if (other.isSetValue()) {
			this.value = org.apache.thrift.TBaseHelper.copyBinary(other.value);
			;
		}
		if (other.isSetAnnotation_type()) {
			this.annotation_type = other.annotation_type;
		}
		if (other.isSetHost()) {
			this.host = new Endpoint(other.host);
		}
	}

	public BinaryAnnotation deepCopy() {
		return new BinaryAnnotation(this);
	}

	@Override
	public void clear() {
		this.key = null;
		this.value = null;
		this.annotation_type = null;
		this.host = null;
	}

	public String getKey() {
		return this.key;
	}

	public BinaryAnnotation setKey(String key) {
		this.key = key;
		return this;
	}

	public void unsetKey() {
		this.key = null;
	}

	/**
	 * Returns true if field key is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetKey() {
		return this.key != null;
	}

	public void setKeyIsSet(boolean value) {
		if (!value) {
			this.key = null;
		}
	}

	public byte[] getValue() {
		setValue(org.apache.thrift.TBaseHelper.rightSize(value));
		return value == null ? null : value.array();
	}

	public ByteBuffer bufferForValue() {
		return value;
	}

	public BinaryAnnotation setValue(byte[] value) {
		setValue(value == null ? (ByteBuffer) null : ByteBuffer.wrap(value));
		return this;
	}

	public BinaryAnnotation setValue(ByteBuffer value) {
		this.value = value;
		return this;
	}

	public void unsetValue() {
		this.value = null;
	}

	/**
	 * Returns true if field value is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetValue() {
		return this.value != null;
	}

	public void setValueIsSet(boolean value) {
		if (!value) {
			this.value = null;
		}
	}

	/**
	 * 
	 * @see AnnotationType
	 */
	public AnnotationType getAnnotation_type() {
		return this.annotation_type;
	}

	/**
	 * 
	 * @see AnnotationType
	 */
	public BinaryAnnotation setAnnotation_type(AnnotationType annotation_type) {
		this.annotation_type = annotation_type;
		return this;
	}

	public void unsetAnnotation_type() {
		this.annotation_type = null;
	}

	/**
	 * Returns true if field annotation_type is set (has been assigned a value)
	 * and false otherwise
	 */
	public boolean isSetAnnotation_type() {
		return this.annotation_type != null;
	}

	public void setAnnotation_typeIsSet(boolean value) {
		if (!value) {
			this.annotation_type = null;
		}
	}

	public Endpoint getHost() {
		return this.host;
	}

	public BinaryAnnotation setHost(Endpoint host) {
		this.host = host;
		return this;
	}

	public void unsetHost() {
		this.host = null;
	}

	/**
	 * Returns true if field host is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetHost() {
		return this.host != null;
	}

	public void setHostIsSet(boolean value) {
		if (!value) {
			this.host = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case KEY:
			if (value == null) {
				unsetKey();
			} else {
				setKey((String) value);
			}
			break;

		case VALUE:
			if (value == null) {
				unsetValue();
			} else {
				setValue((ByteBuffer) value);
			}
			break;

		case ANNOTATION_TYPE:
			if (value == null) {
				unsetAnnotation_type();
			} else {
				setAnnotation_type((AnnotationType) value);
			}
			break;

		case HOST:
			if (value == null) {
				unsetHost();
			} else {
				setHost((Endpoint) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case KEY:
			return getKey();

		case VALUE:
			return getValue();

		case ANNOTATION_TYPE:
			return getAnnotation_type();

		case HOST:
			return getHost();

		}
		throw new IllegalStateException();
	}

	/**
	 * Returns true if field corresponding to fieldID is set (has been assigned
	 * a value) and false otherwise
	 */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case KEY:
			return isSetKey();
		case VALUE:
			return isSetValue();
		case ANNOTATION_TYPE:
			return isSetAnnotation_type();
		case HOST:
			return isSetHost();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof BinaryAnnotation)
			return this.equals((BinaryAnnotation) that);
		return false;
	}

	public boolean equals(BinaryAnnotation that) {
		if (that == null)
			return false;

		boolean this_present_key = true && this.isSetKey();
		boolean that_present_key = true && that.isSetKey();
		if (this_present_key || that_present_key) {
			if (!(this_present_key && that_present_key))
				return false;
			if (!this.key.equals(that.key))
				return false;
		}

		boolean this_present_value = true && this.isSetValue();
		boolean that_present_value = true && that.isSetValue();
		if (this_present_value || that_present_value) {
			if (!(this_present_value && that_present_value))
				return false;
			if (!this.value.equals(that.value))
				return false;
		}

		boolean this_present_annotation_type = true && this.isSetAnnotation_type();
		boolean that_present_annotation_type = true && that.isSetAnnotation_type();
		if (this_present_annotation_type || that_present_annotation_type) {
			if (!(this_present_annotation_type && that_present_annotation_type))
				return false;
			if (!this.annotation_type.equals(that.annotation_type))
				return false;
		}

		boolean this_present_host = true && this.isSetHost();
		boolean that_present_host = true && that.isSetHost();
		if (this_present_host || that_present_host) {
			if (!(this_present_host && that_present_host))
				return false;
			if (!this.host.equals(that.host))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();

		boolean present_key = true && (isSetKey());
		builder.append(present_key);
		if (present_key)
			builder.append(key);

		boolean present_value = true && (isSetValue());
		builder.append(present_value);
		if (present_value)
			builder.append(value);

		boolean present_annotation_type = true && (isSetAnnotation_type());
		builder.append(present_annotation_type);
		if (present_annotation_type)
			builder.append(annotation_type.getValue());

		boolean present_host = true && (isSetHost());
		builder.append(present_host);
		if (present_host)
			builder.append(host);

		return builder.toHashCode();
	}

	public int compareTo(BinaryAnnotation other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;
		BinaryAnnotation typedOther = (BinaryAnnotation) other;

		lastComparison = Boolean.valueOf(isSetKey()).compareTo(typedOther.isSetKey());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetKey()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, typedOther.key);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetValue()).compareTo(typedOther.isSetValue());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetValue()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, typedOther.value);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetAnnotation_type()).compareTo(typedOther.isSetAnnotation_type());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAnnotation_type()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.annotation_type, typedOther.annotation_type);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetHost()).compareTo(typedOther.isSetHost());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetHost()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host, typedOther.host);
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
		StringBuilder sb = new StringBuilder("BinaryAnnotation(");
		boolean first = true;

		sb.append("key:");
		if (this.key == null) {
			sb.append("null");
		} else {
			sb.append(this.key);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("value:");
		if (this.value == null) {
			sb.append("null");
		} else {
			org.apache.thrift.TBaseHelper.toString(this.value, sb);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("annotation_type:");
		if (this.annotation_type == null) {
			sb.append("null");
		} else {
			sb.append(this.annotation_type);
		}
		first = false;
		if (isSetHost()) {
			if (!first)
				sb.append(", ");
			sb.append("host:");
			if (this.host == null) {
				sb.append("null");
			} else {
				sb.append(this.host);
			}
			first = false;
		}
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		// check for sub-struct validity
		if (host != null) {
			host.validate();
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
			read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class BinaryAnnotationStandardSchemeFactory implements SchemeFactory {
		public BinaryAnnotationStandardScheme getScheme() {
			return new BinaryAnnotationStandardScheme();
		}
	}

	private static class BinaryAnnotationStandardScheme extends StandardScheme<BinaryAnnotation> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, BinaryAnnotation struct) throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // KEY
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.key = iprot.readString();
						struct.setKeyIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // VALUE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.value = iprot.readBinary();
						struct.setValueIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // ANNOTATION_TYPE
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.annotation_type = AnnotationType.findByValue(iprot.readI32());
						struct.setAnnotation_typeIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 4: // HOST
					if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
						struct.host = new Endpoint();
						struct.host.read(iprot);
						struct.setHostIsSet(true);
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

			// check for required fields of primitive type, which can't be
			// checked in the validate method
			struct.validate();
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot, BinaryAnnotation struct) throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.key != null) {
				oprot.writeFieldBegin(KEY_FIELD_DESC);
				oprot.writeString(struct.key);
				oprot.writeFieldEnd();
			}
			if (struct.value != null) {
				oprot.writeFieldBegin(VALUE_FIELD_DESC);
				oprot.writeBinary(struct.value);
				oprot.writeFieldEnd();
			}
			if (struct.annotation_type != null) {
				oprot.writeFieldBegin(ANNOTATION_TYPE_FIELD_DESC);
				oprot.writeI32(struct.annotation_type.getValue());
				oprot.writeFieldEnd();
			}
			if (struct.host != null) {
				if (struct.isSetHost()) {
					oprot.writeFieldBegin(HOST_FIELD_DESC);
					struct.host.write(oprot);
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class BinaryAnnotationTupleSchemeFactory implements SchemeFactory {
		public BinaryAnnotationTupleScheme getScheme() {
			return new BinaryAnnotationTupleScheme();
		}
	}

	private static class BinaryAnnotationTupleScheme extends TupleScheme<BinaryAnnotation> {

		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, BinaryAnnotation struct) throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			BitSet optionals = new BitSet();
			if (struct.isSetKey()) {
				optionals.set(0);
			}
			if (struct.isSetValue()) {
				optionals.set(1);
			}
			if (struct.isSetAnnotation_type()) {
				optionals.set(2);
			}
			if (struct.isSetHost()) {
				optionals.set(3);
			}
			oprot.writeBitSet(optionals, 4);
			if (struct.isSetKey()) {
				oprot.writeString(struct.key);
			}
			if (struct.isSetValue()) {
				oprot.writeBinary(struct.value);
			}
			if (struct.isSetAnnotation_type()) {
				oprot.writeI32(struct.annotation_type.getValue());
			}
			if (struct.isSetHost()) {
				struct.host.write(oprot);
			}
		}

		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, BinaryAnnotation struct) throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			BitSet incoming = iprot.readBitSet(4);
			if (incoming.get(0)) {
				struct.key = iprot.readString();
				struct.setKeyIsSet(true);
			}
			if (incoming.get(1)) {
				struct.value = iprot.readBinary();
				struct.setValueIsSet(true);
			}
			if (incoming.get(2)) {
				struct.annotation_type = AnnotationType.findByValue(iprot.readI32());
				struct.setAnnotation_typeIsSet(true);
			}
			if (incoming.get(3)) {
				struct.host = new Endpoint();
				struct.host.read(iprot);
				struct.setHostIsSet(true);
			}
		}
	}

}
