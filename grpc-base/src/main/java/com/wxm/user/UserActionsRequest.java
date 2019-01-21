// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userAction.proto

package com.wxm.user;

/**
 * Protobuf type {@code UserActionsRequest}
 */
public  final class UserActionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UserActionsRequest)
    UserActionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserActionsRequest.newBuilder() to construct.
  private UserActionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserActionsRequest() {
    user_ = "";
    itemSetId_ = "";
    itemIds_ = "";
    action_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserActionsRequest(
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

            user_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            itemSetId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            itemIds_ = s;
            break;
          }
          case 32: {

            action_ = input.readInt32();
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
    return com.wxm.user.UserActionProto.internal_static_UserActionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wxm.user.UserActionProto.internal_static_UserActionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wxm.user.UserActionsRequest.class, com.wxm.user.UserActionsRequest.Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private volatile java.lang.Object user_;
  /**
   * <code>string user = 1;</code>
   */
  public java.lang.String getUser() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      user_ = s;
      return s;
    }
  }
  /**
   * <code>string user = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserBytes() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      user_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEMSETID_FIELD_NUMBER = 2;
  private volatile java.lang.Object itemSetId_;
  /**
   * <code>string itemSetId = 2;</code>
   */
  public java.lang.String getItemSetId() {
    java.lang.Object ref = itemSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemSetId_ = s;
      return s;
    }
  }
  /**
   * <code>string itemSetId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getItemSetIdBytes() {
    java.lang.Object ref = itemSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemSetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEMIDS_FIELD_NUMBER = 3;
  private volatile java.lang.Object itemIds_;
  /**
   * <code>string itemIds = 3;</code>
   */
  public java.lang.String getItemIds() {
    java.lang.Object ref = itemIds_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemIds_ = s;
      return s;
    }
  }
  /**
   * <code>string itemIds = 3;</code>
   */
  public com.google.protobuf.ByteString
      getItemIdsBytes() {
    java.lang.Object ref = itemIds_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemIds_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 4;
  private int action_;
  /**
   * <code>int32 action = 4;</code>
   */
  public int getAction() {
    return action_;
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
    if (!getUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, user_);
    }
    if (!getItemSetIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, itemSetId_);
    }
    if (!getItemIdsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, itemIds_);
    }
    if (action_ != 0) {
      output.writeInt32(4, action_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, user_);
    }
    if (!getItemSetIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, itemSetId_);
    }
    if (!getItemIdsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, itemIds_);
    }
    if (action_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, action_);
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
    if (!(obj instanceof com.wxm.user.UserActionsRequest)) {
      return super.equals(obj);
    }
    com.wxm.user.UserActionsRequest other = (com.wxm.user.UserActionsRequest) obj;

    boolean result = true;
    result = result && getUser()
        .equals(other.getUser());
    result = result && getItemSetId()
        .equals(other.getItemSetId());
    result = result && getItemIds()
        .equals(other.getItemIds());
    result = result && (getAction()
        == other.getAction());
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
    hash = (37 * hash) + USER_FIELD_NUMBER;
    hash = (53 * hash) + getUser().hashCode();
    hash = (37 * hash) + ITEMSETID_FIELD_NUMBER;
    hash = (53 * hash) + getItemSetId().hashCode();
    hash = (37 * hash) + ITEMIDS_FIELD_NUMBER;
    hash = (53 * hash) + getItemIds().hashCode();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wxm.user.UserActionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wxm.user.UserActionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wxm.user.UserActionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wxm.user.UserActionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wxm.user.UserActionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wxm.user.UserActionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wxm.user.UserActionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wxm.user.UserActionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wxm.user.UserActionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wxm.user.UserActionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wxm.user.UserActionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wxm.user.UserActionsRequest parseFrom(
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
  public static Builder newBuilder(com.wxm.user.UserActionsRequest prototype) {
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
   * Protobuf type {@code UserActionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UserActionsRequest)
      com.wxm.user.UserActionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wxm.user.UserActionProto.internal_static_UserActionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wxm.user.UserActionProto.internal_static_UserActionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wxm.user.UserActionsRequest.class, com.wxm.user.UserActionsRequest.Builder.class);
    }

    // Construct using com.wxm.user.UserActionsRequest.newBuilder()
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
      user_ = "";

      itemSetId_ = "";

      itemIds_ = "";

      action_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wxm.user.UserActionProto.internal_static_UserActionsRequest_descriptor;
    }

    @java.lang.Override
    public com.wxm.user.UserActionsRequest getDefaultInstanceForType() {
      return com.wxm.user.UserActionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wxm.user.UserActionsRequest build() {
      com.wxm.user.UserActionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wxm.user.UserActionsRequest buildPartial() {
      com.wxm.user.UserActionsRequest result = new com.wxm.user.UserActionsRequest(this);
      result.user_ = user_;
      result.itemSetId_ = itemSetId_;
      result.itemIds_ = itemIds_;
      result.action_ = action_;
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
      if (other instanceof com.wxm.user.UserActionsRequest) {
        return mergeFrom((com.wxm.user.UserActionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wxm.user.UserActionsRequest other) {
      if (other == com.wxm.user.UserActionsRequest.getDefaultInstance()) return this;
      if (!other.getUser().isEmpty()) {
        user_ = other.user_;
        onChanged();
      }
      if (!other.getItemSetId().isEmpty()) {
        itemSetId_ = other.itemSetId_;
        onChanged();
      }
      if (!other.getItemIds().isEmpty()) {
        itemIds_ = other.itemIds_;
        onChanged();
      }
      if (other.getAction() != 0) {
        setAction(other.getAction());
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
      com.wxm.user.UserActionsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wxm.user.UserActionsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object user_ = "";
    /**
     * <code>string user = 1;</code>
     */
    public java.lang.String getUser() {
      java.lang.Object ref = user_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        user_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserBytes() {
      java.lang.Object ref = user_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        user_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder setUser(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      user_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder clearUser() {
      
      user_ = getDefaultInstance().getUser();
      onChanged();
      return this;
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder setUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      user_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object itemSetId_ = "";
    /**
     * <code>string itemSetId = 2;</code>
     */
    public java.lang.String getItemSetId() {
      java.lang.Object ref = itemSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemSetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string itemSetId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getItemSetIdBytes() {
      java.lang.Object ref = itemSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string itemSetId = 2;</code>
     */
    public Builder setItemSetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemSetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string itemSetId = 2;</code>
     */
    public Builder clearItemSetId() {
      
      itemSetId_ = getDefaultInstance().getItemSetId();
      onChanged();
      return this;
    }
    /**
     * <code>string itemSetId = 2;</code>
     */
    public Builder setItemSetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemSetId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object itemIds_ = "";
    /**
     * <code>string itemIds = 3;</code>
     */
    public java.lang.String getItemIds() {
      java.lang.Object ref = itemIds_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemIds_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string itemIds = 3;</code>
     */
    public com.google.protobuf.ByteString
        getItemIdsBytes() {
      java.lang.Object ref = itemIds_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemIds_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string itemIds = 3;</code>
     */
    public Builder setItemIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemIds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string itemIds = 3;</code>
     */
    public Builder clearItemIds() {
      
      itemIds_ = getDefaultInstance().getItemIds();
      onChanged();
      return this;
    }
    /**
     * <code>string itemIds = 3;</code>
     */
    public Builder setItemIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemIds_ = value;
      onChanged();
      return this;
    }

    private int action_ ;
    /**
     * <code>int32 action = 4;</code>
     */
    public int getAction() {
      return action_;
    }
    /**
     * <code>int32 action = 4;</code>
     */
    public Builder setAction(int value) {
      
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 action = 4;</code>
     */
    public Builder clearAction() {
      
      action_ = 0;
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


    // @@protoc_insertion_point(builder_scope:UserActionsRequest)
  }

  // @@protoc_insertion_point(class_scope:UserActionsRequest)
  private static final com.wxm.user.UserActionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wxm.user.UserActionsRequest();
  }

  public static com.wxm.user.UserActionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserActionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<UserActionsRequest>() {
    @java.lang.Override
    public UserActionsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserActionsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserActionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserActionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wxm.user.UserActionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

