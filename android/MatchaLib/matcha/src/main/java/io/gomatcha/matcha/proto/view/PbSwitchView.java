// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gomatcha.io/matcha/proto/view/switchview.proto

package io.gomatcha.matcha.proto.view;

public final class PbSwitchView {
  private PbSwitchView() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SwitchViewOrBuilder extends
      // @@protoc_insertion_point(interface_extends:matcha.view.SwitchView)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool value = 1;</code>
     */
    boolean getValue();

    /**
     * <code>bool enabled = 2;</code>
     */
    boolean getEnabled();
  }
  /**
   * Protobuf type {@code matcha.view.SwitchView}
   */
  public  static final class SwitchView extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:matcha.view.SwitchView)
      SwitchViewOrBuilder {
    // Use SwitchView.newBuilder() to construct.
    private SwitchView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SwitchView() {
      value_ = false;
      enabled_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SwitchView(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              value_ = input.readBool();
              break;
            }
            case 16: {

              enabled_ = input.readBool();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.gomatcha.matcha.proto.view.PbSwitchView.internal_static_matcha_view_SwitchView_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.gomatcha.matcha.proto.view.PbSwitchView.internal_static_matcha_view_SwitchView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView.class, io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;
    /**
     * <code>bool value = 1;</code>
     */
    public boolean getValue() {
      return value_;
    }

    public static final int ENABLED_FIELD_NUMBER = 2;
    private boolean enabled_;
    /**
     * <code>bool enabled = 2;</code>
     */
    public boolean getEnabled() {
      return enabled_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (value_ != false) {
        output.writeBool(1, value_);
      }
      if (enabled_ != false) {
        output.writeBool(2, enabled_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, value_);
      }
      if (enabled_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, enabled_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView)) {
        return super.equals(obj);
      }
      io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView other = (io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView) obj;

      boolean result = true;
      result = result && (getValue()
          == other.getValue());
      result = result && (getEnabled()
          == other.getEnabled());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getValue());
      hash = (37 * hash) + ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEnabled());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code matcha.view.SwitchView}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:matcha.view.SwitchView)
        io.gomatcha.matcha.proto.view.PbSwitchView.SwitchViewOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.gomatcha.matcha.proto.view.PbSwitchView.internal_static_matcha_view_SwitchView_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.gomatcha.matcha.proto.view.PbSwitchView.internal_static_matcha_view_SwitchView_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView.class, io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView.Builder.class);
      }

      // Construct using io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView.newBuilder()
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
      public Builder clear() {
        super.clear();
        value_ = false;

        enabled_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.gomatcha.matcha.proto.view.PbSwitchView.internal_static_matcha_view_SwitchView_descriptor;
      }

      public io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView getDefaultInstanceForType() {
        return io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView.getDefaultInstance();
      }

      public io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView build() {
        io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView buildPartial() {
        io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView result = new io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView(this);
        result.value_ = value_;
        result.enabled_ = enabled_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView) {
          return mergeFrom((io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView other) {
        if (other == io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView.getDefaultInstance()) return this;
        if (other.getValue() != false) {
          setValue(other.getValue());
        }
        if (other.getEnabled() != false) {
          setEnabled(other.getEnabled());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean value_ ;
      /**
       * <code>bool value = 1;</code>
       */
      public boolean getValue() {
        return value_;
      }
      /**
       * <code>bool value = 1;</code>
       */
      public Builder setValue(boolean value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool value = 1;</code>
       */
      public Builder clearValue() {
        
        value_ = false;
        onChanged();
        return this;
      }

      private boolean enabled_ ;
      /**
       * <code>bool enabled = 2;</code>
       */
      public boolean getEnabled() {
        return enabled_;
      }
      /**
       * <code>bool enabled = 2;</code>
       */
      public Builder setEnabled(boolean value) {
        
        enabled_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool enabled = 2;</code>
       */
      public Builder clearEnabled() {
        
        enabled_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:matcha.view.SwitchView)
    }

    // @@protoc_insertion_point(class_scope:matcha.view.SwitchView)
    private static final io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView();
    }

    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SwitchView>
        PARSER = new com.google.protobuf.AbstractParser<SwitchView>() {
      public SwitchView parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SwitchView(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SwitchView> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SwitchView> getParserForType() {
      return PARSER;
    }

    public io.gomatcha.matcha.proto.view.PbSwitchView.SwitchView getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SwitchEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:matcha.view.SwitchEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool value = 1;</code>
     */
    boolean getValue();
  }
  /**
   * Protobuf type {@code matcha.view.SwitchEvent}
   */
  public  static final class SwitchEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:matcha.view.SwitchEvent)
      SwitchEventOrBuilder {
    // Use SwitchEvent.newBuilder() to construct.
    private SwitchEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SwitchEvent() {
      value_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SwitchEvent(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              value_ = input.readBool();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.gomatcha.matcha.proto.view.PbSwitchView.internal_static_matcha_view_SwitchEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.gomatcha.matcha.proto.view.PbSwitchView.internal_static_matcha_view_SwitchEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent.class, io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;
    /**
     * <code>bool value = 1;</code>
     */
    public boolean getValue() {
      return value_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (value_ != false) {
        output.writeBool(1, value_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, value_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent)) {
        return super.equals(obj);
      }
      io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent other = (io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent) obj;

      boolean result = true;
      result = result && (getValue()
          == other.getValue());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getValue());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code matcha.view.SwitchEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:matcha.view.SwitchEvent)
        io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.gomatcha.matcha.proto.view.PbSwitchView.internal_static_matcha_view_SwitchEvent_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.gomatcha.matcha.proto.view.PbSwitchView.internal_static_matcha_view_SwitchEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent.class, io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent.Builder.class);
      }

      // Construct using io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent.newBuilder()
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
      public Builder clear() {
        super.clear();
        value_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.gomatcha.matcha.proto.view.PbSwitchView.internal_static_matcha_view_SwitchEvent_descriptor;
      }

      public io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent getDefaultInstanceForType() {
        return io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent.getDefaultInstance();
      }

      public io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent build() {
        io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent buildPartial() {
        io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent result = new io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent(this);
        result.value_ = value_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent) {
          return mergeFrom((io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent other) {
        if (other == io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent.getDefaultInstance()) return this;
        if (other.getValue() != false) {
          setValue(other.getValue());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean value_ ;
      /**
       * <code>bool value = 1;</code>
       */
      public boolean getValue() {
        return value_;
      }
      /**
       * <code>bool value = 1;</code>
       */
      public Builder setValue(boolean value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool value = 1;</code>
       */
      public Builder clearValue() {
        
        value_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:matcha.view.SwitchEvent)
    }

    // @@protoc_insertion_point(class_scope:matcha.view.SwitchEvent)
    private static final io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent();
    }

    public static io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SwitchEvent>
        PARSER = new com.google.protobuf.AbstractParser<SwitchEvent>() {
      public SwitchEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SwitchEvent(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SwitchEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SwitchEvent> getParserForType() {
      return PARSER;
    }

    public io.gomatcha.matcha.proto.view.PbSwitchView.SwitchEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_matcha_view_SwitchView_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_matcha_view_SwitchView_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_matcha_view_SwitchEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_matcha_view_SwitchEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.gomatcha.io/matcha/proto/view/switchvi" +
      "ew.proto\022\013matcha.view\",\n\nSwitchView\022\r\n\005v" +
      "alue\030\001 \001(\010\022\017\n\007enabled\030\002 \001(\010\"\034\n\013SwitchEve" +
      "nt\022\r\n\005value\030\001 \001(\010BB\n\035io.gomatcha.matcha." +
      "proto.viewB\014PbSwitchViewZ\004view\242\002\014MatchaV" +
      "iewPbb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_matcha_view_SwitchView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_matcha_view_SwitchView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_matcha_view_SwitchView_descriptor,
        new java.lang.String[] { "Value", "Enabled", });
    internal_static_matcha_view_SwitchEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_matcha_view_SwitchEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_matcha_view_SwitchEvent_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
