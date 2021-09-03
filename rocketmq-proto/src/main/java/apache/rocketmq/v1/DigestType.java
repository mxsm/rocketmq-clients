// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/definition.proto

package apache.rocketmq.v1;

/**
 * Protobuf enum {@code apache.rocketmq.v1.DigestType}
 */
public enum DigestType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * CRC algorithm achieves goal of detecting random data error with lowest computation overhead.
   * </pre>
   *
   * <code>CRC32 = 0;</code>
   */
  CRC32(0),
  /**
   * <pre>
   * MD5 algorithm achieves good balance between collision rate and computation overhead.
   * </pre>
   *
   * <code>MD5 = 1;</code>
   */
  MD5(1),
  /**
   * <pre>
   * SHA-family has substantially fewer collision with fair amount of computation.
   * </pre>
   *
   * <code>SHA1 = 2;</code>
   */
  SHA1(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * CRC algorithm achieves goal of detecting random data error with lowest computation overhead.
   * </pre>
   *
   * <code>CRC32 = 0;</code>
   */
  public static final int CRC32_VALUE = 0;
  /**
   * <pre>
   * MD5 algorithm achieves good balance between collision rate and computation overhead.
   * </pre>
   *
   * <code>MD5 = 1;</code>
   */
  public static final int MD5_VALUE = 1;
  /**
   * <pre>
   * SHA-family has substantially fewer collision with fair amount of computation.
   * </pre>
   *
   * <code>SHA1 = 2;</code>
   */
  public static final int SHA1_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DigestType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DigestType forNumber(int value) {
    switch (value) {
      case 0: return CRC32;
      case 1: return MD5;
      case 2: return SHA1;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DigestType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DigestType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DigestType>() {
          public DigestType findValueByNumber(int number) {
            return DigestType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return apache.rocketmq.v1.MQDomain.getDescriptor().getEnumTypes().get(6);
  }

  private static final DigestType[] VALUES = values();

  public static DigestType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DigestType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:apache.rocketmq.v1.DigestType)
}

