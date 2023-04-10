// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smart_Onboarding3.proto

package onboarding.service3;

/**
 * Protobuf type {@code Smart.HR_Office.OnboardingRequest}
 */
public  final class OnboardingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Smart.HR_Office.OnboardingRequest)
    OnboardingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OnboardingRequest.newBuilder() to construct.
  private OnboardingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OnboardingRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OnboardingRequest(
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
            onboarding.service3.Employee.Builder subBuilder = null;
            if (employee_ != null) {
              subBuilder = employee_.toBuilder();
            }
            employee_ = input.readMessage(onboarding.service3.Employee.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(employee_);
              employee_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return onboarding.service3.Service3_Impl.internal_static_Smart_HR_Office_OnboardingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return onboarding.service3.Service3_Impl.internal_static_Smart_HR_Office_OnboardingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            onboarding.service3.OnboardingRequest.class, onboarding.service3.OnboardingRequest.Builder.class);
  }

  public static final int EMPLOYEE_FIELD_NUMBER = 1;
  private onboarding.service3.Employee employee_;
  /**
   * <code>.Smart.HR_Office.Employee employee = 1;</code>
   */
  public boolean hasEmployee() {
    return employee_ != null;
  }
  /**
   * <code>.Smart.HR_Office.Employee employee = 1;</code>
   */
  public onboarding.service3.Employee getEmployee() {
    return employee_ == null ? onboarding.service3.Employee.getDefaultInstance() : employee_;
  }
  /**
   * <code>.Smart.HR_Office.Employee employee = 1;</code>
   */
  public onboarding.service3.EmployeeOrBuilder getEmployeeOrBuilder() {
    return getEmployee();
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
    if (employee_ != null) {
      output.writeMessage(1, getEmployee());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (employee_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEmployee());
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
    if (!(obj instanceof onboarding.service3.OnboardingRequest)) {
      return super.equals(obj);
    }
    onboarding.service3.OnboardingRequest other = (onboarding.service3.OnboardingRequest) obj;

    boolean result = true;
    result = result && (hasEmployee() == other.hasEmployee());
    if (hasEmployee()) {
      result = result && getEmployee()
          .equals(other.getEmployee());
    }
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
    if (hasEmployee()) {
      hash = (37 * hash) + EMPLOYEE_FIELD_NUMBER;
      hash = (53 * hash) + getEmployee().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static onboarding.service3.OnboardingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static onboarding.service3.OnboardingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static onboarding.service3.OnboardingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static onboarding.service3.OnboardingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static onboarding.service3.OnboardingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static onboarding.service3.OnboardingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static onboarding.service3.OnboardingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static onboarding.service3.OnboardingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static onboarding.service3.OnboardingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static onboarding.service3.OnboardingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static onboarding.service3.OnboardingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static onboarding.service3.OnboardingRequest parseFrom(
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
  public static Builder newBuilder(onboarding.service3.OnboardingRequest prototype) {
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
   * Protobuf type {@code Smart.HR_Office.OnboardingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Smart.HR_Office.OnboardingRequest)
      onboarding.service3.OnboardingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return onboarding.service3.Service3_Impl.internal_static_Smart_HR_Office_OnboardingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return onboarding.service3.Service3_Impl.internal_static_Smart_HR_Office_OnboardingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              onboarding.service3.OnboardingRequest.class, onboarding.service3.OnboardingRequest.Builder.class);
    }

    // Construct using onboarding.service3.OnboardingRequest.newBuilder()
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
      if (employeeBuilder_ == null) {
        employee_ = null;
      } else {
        employee_ = null;
        employeeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return onboarding.service3.Service3_Impl.internal_static_Smart_HR_Office_OnboardingRequest_descriptor;
    }

    @java.lang.Override
    public onboarding.service3.OnboardingRequest getDefaultInstanceForType() {
      return onboarding.service3.OnboardingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public onboarding.service3.OnboardingRequest build() {
      onboarding.service3.OnboardingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public onboarding.service3.OnboardingRequest buildPartial() {
      onboarding.service3.OnboardingRequest result = new onboarding.service3.OnboardingRequest(this);
      if (employeeBuilder_ == null) {
        result.employee_ = employee_;
      } else {
        result.employee_ = employeeBuilder_.build();
      }
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
      if (other instanceof onboarding.service3.OnboardingRequest) {
        return mergeFrom((onboarding.service3.OnboardingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(onboarding.service3.OnboardingRequest other) {
      if (other == onboarding.service3.OnboardingRequest.getDefaultInstance()) return this;
      if (other.hasEmployee()) {
        mergeEmployee(other.getEmployee());
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
      onboarding.service3.OnboardingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (onboarding.service3.OnboardingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private onboarding.service3.Employee employee_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        onboarding.service3.Employee, onboarding.service3.Employee.Builder, onboarding.service3.EmployeeOrBuilder> employeeBuilder_;
    /**
     * <code>.Smart.HR_Office.Employee employee = 1;</code>
     */
    public boolean hasEmployee() {
      return employeeBuilder_ != null || employee_ != null;
    }
    /**
     * <code>.Smart.HR_Office.Employee employee = 1;</code>
     */
    public onboarding.service3.Employee getEmployee() {
      if (employeeBuilder_ == null) {
        return employee_ == null ? onboarding.service3.Employee.getDefaultInstance() : employee_;
      } else {
        return employeeBuilder_.getMessage();
      }
    }
    /**
     * <code>.Smart.HR_Office.Employee employee = 1;</code>
     */
    public Builder setEmployee(onboarding.service3.Employee value) {
      if (employeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        employee_ = value;
        onChanged();
      } else {
        employeeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Smart.HR_Office.Employee employee = 1;</code>
     */
    public Builder setEmployee(
        onboarding.service3.Employee.Builder builderForValue) {
      if (employeeBuilder_ == null) {
        employee_ = builderForValue.build();
        onChanged();
      } else {
        employeeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Smart.HR_Office.Employee employee = 1;</code>
     */
    public Builder mergeEmployee(onboarding.service3.Employee value) {
      if (employeeBuilder_ == null) {
        if (employee_ != null) {
          employee_ =
            onboarding.service3.Employee.newBuilder(employee_).mergeFrom(value).buildPartial();
        } else {
          employee_ = value;
        }
        onChanged();
      } else {
        employeeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Smart.HR_Office.Employee employee = 1;</code>
     */
    public Builder clearEmployee() {
      if (employeeBuilder_ == null) {
        employee_ = null;
        onChanged();
      } else {
        employee_ = null;
        employeeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Smart.HR_Office.Employee employee = 1;</code>
     */
    public onboarding.service3.Employee.Builder getEmployeeBuilder() {
      
      onChanged();
      return getEmployeeFieldBuilder().getBuilder();
    }
    /**
     * <code>.Smart.HR_Office.Employee employee = 1;</code>
     */
    public onboarding.service3.EmployeeOrBuilder getEmployeeOrBuilder() {
      if (employeeBuilder_ != null) {
        return employeeBuilder_.getMessageOrBuilder();
      } else {
        return employee_ == null ?
            onboarding.service3.Employee.getDefaultInstance() : employee_;
      }
    }
    /**
     * <code>.Smart.HR_Office.Employee employee = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        onboarding.service3.Employee, onboarding.service3.Employee.Builder, onboarding.service3.EmployeeOrBuilder> 
        getEmployeeFieldBuilder() {
      if (employeeBuilder_ == null) {
        employeeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            onboarding.service3.Employee, onboarding.service3.Employee.Builder, onboarding.service3.EmployeeOrBuilder>(
                getEmployee(),
                getParentForChildren(),
                isClean());
        employee_ = null;
      }
      return employeeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Smart.HR_Office.OnboardingRequest)
  }

  // @@protoc_insertion_point(class_scope:Smart.HR_Office.OnboardingRequest)
  private static final onboarding.service3.OnboardingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new onboarding.service3.OnboardingRequest();
  }

  public static onboarding.service3.OnboardingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OnboardingRequest>
      PARSER = new com.google.protobuf.AbstractParser<OnboardingRequest>() {
    @java.lang.Override
    public OnboardingRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OnboardingRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OnboardingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnboardingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public onboarding.service3.OnboardingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

