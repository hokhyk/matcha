// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gomatcha.io/matcha/proto/view/slider.proto

package io.gomatcha.matcha.proto.view;

public final class PbSlider {
  private PbSlider() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SliderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:matcha.view.Slider)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double value = 1;</code>
     */
    double getValue();

    /**
     * <code>double maxValue = 2;</code>
     */
    double getMaxValue();

    /**
     * <code>double minValue = 3;</code>
     */
    double getMinValue();

    /**
     * <code>bool enabled = 4;</code>
     */
    boolean getEnabled();
  }
  /**
   * Protobuf type {@code matcha.view.Slider}
   */
  public  static final class Slider extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:matcha.view.Slider)
      SliderOrBuilder {
    // Use Slider.newBuilder() to construct.
    private Slider(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Slider() {
      value_ = 0D;
      maxValue_ = 0D;
      minValue_ = 0D;
      enabled_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Slider(
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
            case 9: {

              value_ = input.readDouble();
              break;
            }
            case 17: {

              maxValue_ = input.readDouble();
              break;
            }
            case 25: {

              minValue_ = input.readDouble();
              break;
            }
            case 32: {

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
      return io.gomatcha.matcha.proto.view.PbSlider.internal_static_matcha_view_Slider_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.gomatcha.matcha.proto.view.PbSlider.internal_static_matcha_view_Slider_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.gomatcha.matcha.proto.view.PbSlider.Slider.class, io.gomatcha.matcha.proto.view.PbSlider.Slider.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;
    /**
     * <code>double value = 1;</code>
     */
    public double getValue() {
      return value_;
    }

    public static final int MAXVALUE_FIELD_NUMBER = 2;
    private double maxValue_;
    /**
     * <code>double maxValue = 2;</code>
     */
    public double getMaxValue() {
      return maxValue_;
    }

    public static final int MINVALUE_FIELD_NUMBER = 3;
    private double minValue_;
    /**
     * <code>double minValue = 3;</code>
     */
    public double getMinValue() {
      return minValue_;
    }

    public static final int ENABLED_FIELD_NUMBER = 4;
    private boolean enabled_;
    /**
     * <code>bool enabled = 4;</code>
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
      if (value_ != 0D) {
        output.writeDouble(1, value_);
      }
      if (maxValue_ != 0D) {
        output.writeDouble(2, maxValue_);
      }
      if (minValue_ != 0D) {
        output.writeDouble(3, minValue_);
      }
      if (enabled_ != false) {
        output.writeBool(4, enabled_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, value_);
      }
      if (maxValue_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, maxValue_);
      }
      if (minValue_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, minValue_);
      }
      if (enabled_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, enabled_);
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
      if (!(obj instanceof io.gomatcha.matcha.proto.view.PbSlider.Slider)) {
        return super.equals(obj);
      }
      io.gomatcha.matcha.proto.view.PbSlider.Slider other = (io.gomatcha.matcha.proto.view.PbSlider.Slider) obj;

      boolean result = true;
      result = result && (
          java.lang.Double.doubleToLongBits(getValue())
          == java.lang.Double.doubleToLongBits(
              other.getValue()));
      result = result && (
          java.lang.Double.doubleToLongBits(getMaxValue())
          == java.lang.Double.doubleToLongBits(
              other.getMaxValue()));
      result = result && (
          java.lang.Double.doubleToLongBits(getMinValue())
          == java.lang.Double.doubleToLongBits(
              other.getMinValue()));
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
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getValue()));
      hash = (37 * hash) + MAXVALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getMaxValue()));
      hash = (37 * hash) + MINVALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getMinValue()));
      hash = (37 * hash) + ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEnabled());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.Slider parseFrom(
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
    public static Builder newBuilder(io.gomatcha.matcha.proto.view.PbSlider.Slider prototype) {
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
     * Protobuf type {@code matcha.view.Slider}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:matcha.view.Slider)
        io.gomatcha.matcha.proto.view.PbSlider.SliderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.gomatcha.matcha.proto.view.PbSlider.internal_static_matcha_view_Slider_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.gomatcha.matcha.proto.view.PbSlider.internal_static_matcha_view_Slider_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.gomatcha.matcha.proto.view.PbSlider.Slider.class, io.gomatcha.matcha.proto.view.PbSlider.Slider.Builder.class);
      }

      // Construct using io.gomatcha.matcha.proto.view.PbSlider.Slider.newBuilder()
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
        value_ = 0D;

        maxValue_ = 0D;

        minValue_ = 0D;

        enabled_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.gomatcha.matcha.proto.view.PbSlider.internal_static_matcha_view_Slider_descriptor;
      }

      public io.gomatcha.matcha.proto.view.PbSlider.Slider getDefaultInstanceForType() {
        return io.gomatcha.matcha.proto.view.PbSlider.Slider.getDefaultInstance();
      }

      public io.gomatcha.matcha.proto.view.PbSlider.Slider build() {
        io.gomatcha.matcha.proto.view.PbSlider.Slider result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.gomatcha.matcha.proto.view.PbSlider.Slider buildPartial() {
        io.gomatcha.matcha.proto.view.PbSlider.Slider result = new io.gomatcha.matcha.proto.view.PbSlider.Slider(this);
        result.value_ = value_;
        result.maxValue_ = maxValue_;
        result.minValue_ = minValue_;
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
        if (other instanceof io.gomatcha.matcha.proto.view.PbSlider.Slider) {
          return mergeFrom((io.gomatcha.matcha.proto.view.PbSlider.Slider)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.gomatcha.matcha.proto.view.PbSlider.Slider other) {
        if (other == io.gomatcha.matcha.proto.view.PbSlider.Slider.getDefaultInstance()) return this;
        if (other.getValue() != 0D) {
          setValue(other.getValue());
        }
        if (other.getMaxValue() != 0D) {
          setMaxValue(other.getMaxValue());
        }
        if (other.getMinValue() != 0D) {
          setMinValue(other.getMinValue());
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
        io.gomatcha.matcha.proto.view.PbSlider.Slider parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.gomatcha.matcha.proto.view.PbSlider.Slider) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double value_ ;
      /**
       * <code>double value = 1;</code>
       */
      public double getValue() {
        return value_;
      }
      /**
       * <code>double value = 1;</code>
       */
      public Builder setValue(double value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double value = 1;</code>
       */
      public Builder clearValue() {
        
        value_ = 0D;
        onChanged();
        return this;
      }

      private double maxValue_ ;
      /**
       * <code>double maxValue = 2;</code>
       */
      public double getMaxValue() {
        return maxValue_;
      }
      /**
       * <code>double maxValue = 2;</code>
       */
      public Builder setMaxValue(double value) {
        
        maxValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double maxValue = 2;</code>
       */
      public Builder clearMaxValue() {
        
        maxValue_ = 0D;
        onChanged();
        return this;
      }

      private double minValue_ ;
      /**
       * <code>double minValue = 3;</code>
       */
      public double getMinValue() {
        return minValue_;
      }
      /**
       * <code>double minValue = 3;</code>
       */
      public Builder setMinValue(double value) {
        
        minValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double minValue = 3;</code>
       */
      public Builder clearMinValue() {
        
        minValue_ = 0D;
        onChanged();
        return this;
      }

      private boolean enabled_ ;
      /**
       * <code>bool enabled = 4;</code>
       */
      public boolean getEnabled() {
        return enabled_;
      }
      /**
       * <code>bool enabled = 4;</code>
       */
      public Builder setEnabled(boolean value) {
        
        enabled_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool enabled = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:matcha.view.Slider)
    }

    // @@protoc_insertion_point(class_scope:matcha.view.Slider)
    private static final io.gomatcha.matcha.proto.view.PbSlider.Slider DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.gomatcha.matcha.proto.view.PbSlider.Slider();
    }

    public static io.gomatcha.matcha.proto.view.PbSlider.Slider getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Slider>
        PARSER = new com.google.protobuf.AbstractParser<Slider>() {
      public Slider parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Slider(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Slider> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Slider> getParserForType() {
      return PARSER;
    }

    public io.gomatcha.matcha.proto.view.PbSlider.Slider getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SliderEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:matcha.view.SliderEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double value = 1;</code>
     */
    double getValue();
  }
  /**
   * Protobuf type {@code matcha.view.SliderEvent}
   */
  public  static final class SliderEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:matcha.view.SliderEvent)
      SliderEventOrBuilder {
    // Use SliderEvent.newBuilder() to construct.
    private SliderEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SliderEvent() {
      value_ = 0D;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SliderEvent(
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
            case 9: {

              value_ = input.readDouble();
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
      return io.gomatcha.matcha.proto.view.PbSlider.internal_static_matcha_view_SliderEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.gomatcha.matcha.proto.view.PbSlider.internal_static_matcha_view_SliderEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.gomatcha.matcha.proto.view.PbSlider.SliderEvent.class, io.gomatcha.matcha.proto.view.PbSlider.SliderEvent.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;
    /**
     * <code>double value = 1;</code>
     */
    public double getValue() {
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
      if (value_ != 0D) {
        output.writeDouble(1, value_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, value_);
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
      if (!(obj instanceof io.gomatcha.matcha.proto.view.PbSlider.SliderEvent)) {
        return super.equals(obj);
      }
      io.gomatcha.matcha.proto.view.PbSlider.SliderEvent other = (io.gomatcha.matcha.proto.view.PbSlider.SliderEvent) obj;

      boolean result = true;
      result = result && (
          java.lang.Double.doubleToLongBits(getValue())
          == java.lang.Double.doubleToLongBits(
              other.getValue()));
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
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getValue()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parseFrom(
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
    public static Builder newBuilder(io.gomatcha.matcha.proto.view.PbSlider.SliderEvent prototype) {
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
     * Protobuf type {@code matcha.view.SliderEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:matcha.view.SliderEvent)
        io.gomatcha.matcha.proto.view.PbSlider.SliderEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.gomatcha.matcha.proto.view.PbSlider.internal_static_matcha_view_SliderEvent_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.gomatcha.matcha.proto.view.PbSlider.internal_static_matcha_view_SliderEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.gomatcha.matcha.proto.view.PbSlider.SliderEvent.class, io.gomatcha.matcha.proto.view.PbSlider.SliderEvent.Builder.class);
      }

      // Construct using io.gomatcha.matcha.proto.view.PbSlider.SliderEvent.newBuilder()
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
        value_ = 0D;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.gomatcha.matcha.proto.view.PbSlider.internal_static_matcha_view_SliderEvent_descriptor;
      }

      public io.gomatcha.matcha.proto.view.PbSlider.SliderEvent getDefaultInstanceForType() {
        return io.gomatcha.matcha.proto.view.PbSlider.SliderEvent.getDefaultInstance();
      }

      public io.gomatcha.matcha.proto.view.PbSlider.SliderEvent build() {
        io.gomatcha.matcha.proto.view.PbSlider.SliderEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.gomatcha.matcha.proto.view.PbSlider.SliderEvent buildPartial() {
        io.gomatcha.matcha.proto.view.PbSlider.SliderEvent result = new io.gomatcha.matcha.proto.view.PbSlider.SliderEvent(this);
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
        if (other instanceof io.gomatcha.matcha.proto.view.PbSlider.SliderEvent) {
          return mergeFrom((io.gomatcha.matcha.proto.view.PbSlider.SliderEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.gomatcha.matcha.proto.view.PbSlider.SliderEvent other) {
        if (other == io.gomatcha.matcha.proto.view.PbSlider.SliderEvent.getDefaultInstance()) return this;
        if (other.getValue() != 0D) {
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
        io.gomatcha.matcha.proto.view.PbSlider.SliderEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.gomatcha.matcha.proto.view.PbSlider.SliderEvent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double value_ ;
      /**
       * <code>double value = 1;</code>
       */
      public double getValue() {
        return value_;
      }
      /**
       * <code>double value = 1;</code>
       */
      public Builder setValue(double value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double value = 1;</code>
       */
      public Builder clearValue() {
        
        value_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:matcha.view.SliderEvent)
    }

    // @@protoc_insertion_point(class_scope:matcha.view.SliderEvent)
    private static final io.gomatcha.matcha.proto.view.PbSlider.SliderEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.gomatcha.matcha.proto.view.PbSlider.SliderEvent();
    }

    public static io.gomatcha.matcha.proto.view.PbSlider.SliderEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SliderEvent>
        PARSER = new com.google.protobuf.AbstractParser<SliderEvent>() {
      public SliderEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SliderEvent(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SliderEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SliderEvent> getParserForType() {
      return PARSER;
    }

    public io.gomatcha.matcha.proto.view.PbSlider.SliderEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_matcha_view_Slider_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_matcha_view_Slider_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_matcha_view_SliderEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_matcha_view_SliderEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*gomatcha.io/matcha/proto/view/slider.p" +
      "roto\022\013matcha.view\"L\n\006Slider\022\r\n\005value\030\001 \001" +
      "(\001\022\020\n\010maxValue\030\002 \001(\001\022\020\n\010minValue\030\003 \001(\001\022\017" +
      "\n\007enabled\030\004 \001(\010\"\034\n\013SliderEvent\022\r\n\005value\030" +
      "\001 \001(\001B>\n\035io.gomatcha.matcha.proto.viewB\010" +
      "PbSliderZ\004view\242\002\014MatchaViewPbb\006proto3"
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
    internal_static_matcha_view_Slider_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_matcha_view_Slider_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_matcha_view_Slider_descriptor,
        new java.lang.String[] { "Value", "MaxValue", "MinValue", "Enabled", });
    internal_static_matcha_view_SliderEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_matcha_view_SliderEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_matcha_view_SliderEvent_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
