// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NumberService.proto

package org.example.grpc;

public final class NumberServiceOuterClass {
  private NumberServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.example.grpc.Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 firstValue = 1;</code>
     */
    int getFirstValue();

    /**
     * <code>int32 lastValue = 2;</code>
     */
    int getLastValue();
  }
  /**
   * Protobuf type {@code org.example.grpc.Request}
   */
  public  static final class Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.example.grpc.Request)
      RequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Request.newBuilder() to construct.
    private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Request() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Request();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Request(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              firstValue_ = input.readInt32();
              break;
            }
            case 16: {

              lastValue_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return org.example.grpc.NumberServiceOuterClass.internal_static_org_example_grpc_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.grpc.NumberServiceOuterClass.internal_static_org_example_grpc_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.grpc.NumberServiceOuterClass.Request.class, org.example.grpc.NumberServiceOuterClass.Request.Builder.class);
    }

    public static final int FIRSTVALUE_FIELD_NUMBER = 1;
    private int firstValue_;
    /**
     * <code>int32 firstValue = 1;</code>
     */
    public int getFirstValue() {
      return firstValue_;
    }

    public static final int LASTVALUE_FIELD_NUMBER = 2;
    private int lastValue_;
    /**
     * <code>int32 lastValue = 2;</code>
     */
    public int getLastValue() {
      return lastValue_;
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
      if (firstValue_ != 0) {
        output.writeInt32(1, firstValue_);
      }
      if (lastValue_ != 0) {
        output.writeInt32(2, lastValue_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (firstValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, firstValue_);
      }
      if (lastValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, lastValue_);
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
      if (!(obj instanceof org.example.grpc.NumberServiceOuterClass.Request)) {
        return super.equals(obj);
      }
      org.example.grpc.NumberServiceOuterClass.Request other = (org.example.grpc.NumberServiceOuterClass.Request) obj;

      if (getFirstValue()
          != other.getFirstValue()) return false;
      if (getLastValue()
          != other.getLastValue()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FIRSTVALUE_FIELD_NUMBER;
      hash = (53 * hash) + getFirstValue();
      hash = (37 * hash) + LASTVALUE_FIELD_NUMBER;
      hash = (53 * hash) + getLastValue();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.example.grpc.NumberServiceOuterClass.Request parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.grpc.NumberServiceOuterClass.Request parseFrom(
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
    public static Builder newBuilder(org.example.grpc.NumberServiceOuterClass.Request prototype) {
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
     * Protobuf type {@code org.example.grpc.Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.example.grpc.Request)
        org.example.grpc.NumberServiceOuterClass.RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.example.grpc.NumberServiceOuterClass.internal_static_org_example_grpc_Request_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.example.grpc.NumberServiceOuterClass.internal_static_org_example_grpc_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.example.grpc.NumberServiceOuterClass.Request.class, org.example.grpc.NumberServiceOuterClass.Request.Builder.class);
      }

      // Construct using org.example.grpc.NumberServiceOuterClass.Request.newBuilder()
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
        firstValue_ = 0;

        lastValue_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.example.grpc.NumberServiceOuterClass.internal_static_org_example_grpc_Request_descriptor;
      }

      @java.lang.Override
      public org.example.grpc.NumberServiceOuterClass.Request getDefaultInstanceForType() {
        return org.example.grpc.NumberServiceOuterClass.Request.getDefaultInstance();
      }

      @java.lang.Override
      public org.example.grpc.NumberServiceOuterClass.Request build() {
        org.example.grpc.NumberServiceOuterClass.Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.example.grpc.NumberServiceOuterClass.Request buildPartial() {
        org.example.grpc.NumberServiceOuterClass.Request result = new org.example.grpc.NumberServiceOuterClass.Request(this);
        result.firstValue_ = firstValue_;
        result.lastValue_ = lastValue_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.example.grpc.NumberServiceOuterClass.Request) {
          return mergeFrom((org.example.grpc.NumberServiceOuterClass.Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.example.grpc.NumberServiceOuterClass.Request other) {
        if (other == org.example.grpc.NumberServiceOuterClass.Request.getDefaultInstance()) return this;
        if (other.getFirstValue() != 0) {
          setFirstValue(other.getFirstValue());
        }
        if (other.getLastValue() != 0) {
          setLastValue(other.getLastValue());
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
        org.example.grpc.NumberServiceOuterClass.Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.example.grpc.NumberServiceOuterClass.Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int firstValue_ ;
      /**
       * <code>int32 firstValue = 1;</code>
       */
      public int getFirstValue() {
        return firstValue_;
      }
      /**
       * <code>int32 firstValue = 1;</code>
       */
      public Builder setFirstValue(int value) {
        
        firstValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 firstValue = 1;</code>
       */
      public Builder clearFirstValue() {
        
        firstValue_ = 0;
        onChanged();
        return this;
      }

      private int lastValue_ ;
      /**
       * <code>int32 lastValue = 2;</code>
       */
      public int getLastValue() {
        return lastValue_;
      }
      /**
       * <code>int32 lastValue = 2;</code>
       */
      public Builder setLastValue(int value) {
        
        lastValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 lastValue = 2;</code>
       */
      public Builder clearLastValue() {
        
        lastValue_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.example.grpc.Request)
    }

    // @@protoc_insertion_point(class_scope:org.example.grpc.Request)
    private static final org.example.grpc.NumberServiceOuterClass.Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.example.grpc.NumberServiceOuterClass.Request();
    }

    public static org.example.grpc.NumberServiceOuterClass.Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Request>
        PARSER = new com.google.protobuf.AbstractParser<Request>() {
      @java.lang.Override
      public Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Request> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.example.grpc.NumberServiceOuterClass.Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.example.grpc.Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 generateValue = 1;</code>
     */
    int getGenerateValue();
  }
  /**
   * Protobuf type {@code org.example.grpc.Response}
   */
  public  static final class Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.example.grpc.Response)
      ResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Response() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Response();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Response(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              generateValue_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return org.example.grpc.NumberServiceOuterClass.internal_static_org_example_grpc_Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.grpc.NumberServiceOuterClass.internal_static_org_example_grpc_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.grpc.NumberServiceOuterClass.Response.class, org.example.grpc.NumberServiceOuterClass.Response.Builder.class);
    }

    public static final int GENERATEVALUE_FIELD_NUMBER = 1;
    private int generateValue_;
    /**
     * <code>int32 generateValue = 1;</code>
     */
    public int getGenerateValue() {
      return generateValue_;
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
      if (generateValue_ != 0) {
        output.writeInt32(1, generateValue_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (generateValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, generateValue_);
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
      if (!(obj instanceof org.example.grpc.NumberServiceOuterClass.Response)) {
        return super.equals(obj);
      }
      org.example.grpc.NumberServiceOuterClass.Response other = (org.example.grpc.NumberServiceOuterClass.Response) obj;

      if (getGenerateValue()
          != other.getGenerateValue()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GENERATEVALUE_FIELD_NUMBER;
      hash = (53 * hash) + getGenerateValue();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.example.grpc.NumberServiceOuterClass.Response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.grpc.NumberServiceOuterClass.Response parseFrom(
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
    public static Builder newBuilder(org.example.grpc.NumberServiceOuterClass.Response prototype) {
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
     * Protobuf type {@code org.example.grpc.Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.example.grpc.Response)
        org.example.grpc.NumberServiceOuterClass.ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.example.grpc.NumberServiceOuterClass.internal_static_org_example_grpc_Response_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.example.grpc.NumberServiceOuterClass.internal_static_org_example_grpc_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.example.grpc.NumberServiceOuterClass.Response.class, org.example.grpc.NumberServiceOuterClass.Response.Builder.class);
      }

      // Construct using org.example.grpc.NumberServiceOuterClass.Response.newBuilder()
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
        generateValue_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.example.grpc.NumberServiceOuterClass.internal_static_org_example_grpc_Response_descriptor;
      }

      @java.lang.Override
      public org.example.grpc.NumberServiceOuterClass.Response getDefaultInstanceForType() {
        return org.example.grpc.NumberServiceOuterClass.Response.getDefaultInstance();
      }

      @java.lang.Override
      public org.example.grpc.NumberServiceOuterClass.Response build() {
        org.example.grpc.NumberServiceOuterClass.Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.example.grpc.NumberServiceOuterClass.Response buildPartial() {
        org.example.grpc.NumberServiceOuterClass.Response result = new org.example.grpc.NumberServiceOuterClass.Response(this);
        result.generateValue_ = generateValue_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.example.grpc.NumberServiceOuterClass.Response) {
          return mergeFrom((org.example.grpc.NumberServiceOuterClass.Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.example.grpc.NumberServiceOuterClass.Response other) {
        if (other == org.example.grpc.NumberServiceOuterClass.Response.getDefaultInstance()) return this;
        if (other.getGenerateValue() != 0) {
          setGenerateValue(other.getGenerateValue());
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
        org.example.grpc.NumberServiceOuterClass.Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.example.grpc.NumberServiceOuterClass.Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int generateValue_ ;
      /**
       * <code>int32 generateValue = 1;</code>
       */
      public int getGenerateValue() {
        return generateValue_;
      }
      /**
       * <code>int32 generateValue = 1;</code>
       */
      public Builder setGenerateValue(int value) {
        
        generateValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 generateValue = 1;</code>
       */
      public Builder clearGenerateValue() {
        
        generateValue_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.example.grpc.Response)
    }

    // @@protoc_insertion_point(class_scope:org.example.grpc.Response)
    private static final org.example.grpc.NumberServiceOuterClass.Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.example.grpc.NumberServiceOuterClass.Response();
    }

    public static org.example.grpc.NumberServiceOuterClass.Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Response>
        PARSER = new com.google.protobuf.AbstractParser<Response>() {
      @java.lang.Override
      public Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Response> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.example.grpc.NumberServiceOuterClass.Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_grpc_Request_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_grpc_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_grpc_Response_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_grpc_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023NumberService.proto\022\020org.example.grpc\"" +
      "0\n\007Request\022\022\n\nfirstValue\030\001 \001(\005\022\021\n\tlastVa" +
      "lue\030\002 \001(\005\"!\n\010Response\022\025\n\rgenerateValue\030\001" +
      " \001(\0052[\n\rNumberService\022J\n\017generateNumbers" +
      "\022\031.org.example.grpc.Request\032\032.org.exampl" +
      "e.grpc.Response0\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_example_grpc_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_grpc_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_grpc_Request_descriptor,
        new java.lang.String[] { "FirstValue", "LastValue", });
    internal_static_org_example_grpc_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_example_grpc_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_grpc_Response_descriptor,
        new java.lang.String[] { "GenerateValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}