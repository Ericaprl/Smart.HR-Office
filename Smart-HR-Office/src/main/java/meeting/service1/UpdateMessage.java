// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smart_Schedule_meeting1.proto

package meeting.service1;

/**
 * Protobuf type {@code Smart.HR_Office.UpdateMessage}
 */
public  final class UpdateMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Smart.HR_Office.UpdateMessage)
    UpdateMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateMessage.newBuilder() to construct.
  private UpdateMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateMessage() {
    sessionId_ = "";
    updates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sessionId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              updates_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            updates_.add(s);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        updates_ = updates_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return meeting.service1.Service1_Impl.internal_static_Smart_HR_Office_UpdateMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return meeting.service1.Service1_Impl.internal_static_Smart_HR_Office_UpdateMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            meeting.service1.UpdateMessage.class, meeting.service1.UpdateMessage.Builder.class);
  }

  private int bitField0_;
  public static final int SESSION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object sessionId_;
  /**
   * <code>string session_id = 1;</code>
   */
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>string session_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPDATES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList updates_;
  /**
   * <pre>
   * kind of array
   * </pre>
   *
   * <code>repeated string updates = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getUpdatesList() {
    return updates_;
  }
  /**
   * <pre>
   * kind of array
   * </pre>
   *
   * <code>repeated string updates = 2;</code>
   */
  public int getUpdatesCount() {
    return updates_.size();
  }
  /**
   * <pre>
   * kind of array
   * </pre>
   *
   * <code>repeated string updates = 2;</code>
   */
  public java.lang.String getUpdates(int index) {
    return updates_.get(index);
  }
  /**
   * <pre>
   * kind of array
   * </pre>
   *
   * <code>repeated string updates = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUpdatesBytes(int index) {
    return updates_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSessionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionId_);
    }
    for (int i = 0; i < updates_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, updates_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSessionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < updates_.size(); i++) {
        dataSize += computeStringSizeNoTag(updates_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUpdatesList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof meeting.service1.UpdateMessage)) {
      return super.equals(obj);
    }
    meeting.service1.UpdateMessage other = (meeting.service1.UpdateMessage) obj;

    boolean result = true;
    result = result && getSessionId()
        .equals(other.getSessionId());
    result = result && getUpdatesList()
        .equals(other.getUpdatesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    if (getUpdatesCount() > 0) {
      hash = (37 * hash) + UPDATES_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static meeting.service1.UpdateMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static meeting.service1.UpdateMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static meeting.service1.UpdateMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static meeting.service1.UpdateMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static meeting.service1.UpdateMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static meeting.service1.UpdateMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static meeting.service1.UpdateMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static meeting.service1.UpdateMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static meeting.service1.UpdateMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static meeting.service1.UpdateMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static meeting.service1.UpdateMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static meeting.service1.UpdateMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(meeting.service1.UpdateMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Smart.HR_Office.UpdateMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Smart.HR_Office.UpdateMessage)
      meeting.service1.UpdateMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return meeting.service1.Service1_Impl.internal_static_Smart_HR_Office_UpdateMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return meeting.service1.Service1_Impl.internal_static_Smart_HR_Office_UpdateMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              meeting.service1.UpdateMessage.class, meeting.service1.UpdateMessage.Builder.class);
    }

    // Construct using meeting.service1.UpdateMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sessionId_ = "";

      updates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return meeting.service1.Service1_Impl.internal_static_Smart_HR_Office_UpdateMessage_descriptor;
    }

    @java.lang.Override
    public meeting.service1.UpdateMessage getDefaultInstanceForType() {
      return meeting.service1.UpdateMessage.getDefaultInstance();
    }

    @java.lang.Override
    public meeting.service1.UpdateMessage build() {
      meeting.service1.UpdateMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public meeting.service1.UpdateMessage buildPartial() {
      meeting.service1.UpdateMessage result = new meeting.service1.UpdateMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.sessionId_ = sessionId_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        updates_ = updates_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.updates_ = updates_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof meeting.service1.UpdateMessage) {
        return mergeFrom((meeting.service1.UpdateMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(meeting.service1.UpdateMessage other) {
      if (other == meeting.service1.UpdateMessage.getDefaultInstance()) return this;
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        onChanged();
      }
      if (!other.updates_.isEmpty()) {
        if (updates_.isEmpty()) {
          updates_ = other.updates_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureUpdatesIsMutable();
          updates_.addAll(other.updates_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      meeting.service1.UpdateMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (meeting.service1.UpdateMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object sessionId_ = "";
    /**
     * <code>string session_id = 1;</code>
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string session_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string session_id = 1;</code>
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string session_id = 1;</code>
     */
    public Builder clearSessionId() {
      
      sessionId_ = getDefaultInstance().getSessionId();
      onChanged();
      return this;
    }
    /**
     * <code>string session_id = 1;</code>
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList updates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureUpdatesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        updates_ = new com.google.protobuf.LazyStringArrayList(updates_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * kind of array
     * </pre>
     *
     * <code>repeated string updates = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getUpdatesList() {
      return updates_.getUnmodifiableView();
    }
    /**
     * <pre>
     * kind of array
     * </pre>
     *
     * <code>repeated string updates = 2;</code>
     */
    public int getUpdatesCount() {
      return updates_.size();
    }
    /**
     * <pre>
     * kind of array
     * </pre>
     *
     * <code>repeated string updates = 2;</code>
     */
    public java.lang.String getUpdates(int index) {
      return updates_.get(index);
    }
    /**
     * <pre>
     * kind of array
     * </pre>
     *
     * <code>repeated string updates = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUpdatesBytes(int index) {
      return updates_.getByteString(index);
    }
    /**
     * <pre>
     * kind of array
     * </pre>
     *
     * <code>repeated string updates = 2;</code>
     */
    public Builder setUpdates(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureUpdatesIsMutable();
      updates_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * kind of array
     * </pre>
     *
     * <code>repeated string updates = 2;</code>
     */
    public Builder addUpdates(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureUpdatesIsMutable();
      updates_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * kind of array
     * </pre>
     *
     * <code>repeated string updates = 2;</code>
     */
    public Builder addAllUpdates(
        java.lang.Iterable<java.lang.String> values) {
      ensureUpdatesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, updates_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * kind of array
     * </pre>
     *
     * <code>repeated string updates = 2;</code>
     */
    public Builder clearUpdates() {
      updates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * kind of array
     * </pre>
     *
     * <code>repeated string updates = 2;</code>
     */
    public Builder addUpdatesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureUpdatesIsMutable();
      updates_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Smart.HR_Office.UpdateMessage)
  }

  // @@protoc_insertion_point(class_scope:Smart.HR_Office.UpdateMessage)
  private static final meeting.service1.UpdateMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new meeting.service1.UpdateMessage();
  }

  public static meeting.service1.UpdateMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateMessage>
      PARSER = new com.google.protobuf.AbstractParser<UpdateMessage>() {
    @java.lang.Override
    public UpdateMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public meeting.service1.UpdateMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
