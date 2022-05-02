package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class Distribution extends GeneratedMessageLite<Distribution, Builder> implements DistributionOrBuilder {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Distribution DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile Parser<Distribution> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bucketCountsMemoizedSerializedSize = -1;
    private Internal.LongList bucketCounts_ = emptyLongList();
    private BucketOptions bucketOptions_;
    private long count_;
    private Internal.ProtobufList<Exemplar> exemplars_ = emptyProtobufList();
    private double mean_;
    private Range range_;
    private double sumOfSquaredDeviation_;

    public interface BucketOptionsOrBuilder extends MessageLiteOrBuilder {
        BucketOptions.Explicit getExplicitBuckets();

        BucketOptions.Exponential getExponentialBuckets();

        BucketOptions.Linear getLinearBuckets();

        BucketOptions.OptionsCase getOptionsCase();

        boolean hasExplicitBuckets();

        boolean hasExponentialBuckets();

        boolean hasLinearBuckets();
    }

    public interface ExemplarOrBuilder extends MessageLiteOrBuilder {
        Any getAttachments(int i);

        int getAttachmentsCount();

        List<Any> getAttachmentsList();

        Timestamp getTimestamp();

        double getValue();

        boolean hasTimestamp();
    }

    public interface RangeOrBuilder extends MessageLiteOrBuilder {
        double getMax();

        double getMin();
    }

    private Distribution() {
    }

    public static final class Range extends GeneratedMessageLite<Range, Builder> implements RangeOrBuilder {
        /* access modifiers changed from: private */
        public static final Range DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile Parser<Range> PARSER;
        private double max_;
        private double min_;

        private Range() {
        }

        public final double getMin() {
            return this.min_;
        }

        /* access modifiers changed from: private */
        public void setMin(double d) {
            this.min_ = d;
        }

        /* access modifiers changed from: private */
        public void clearMin() {
            this.min_ = 0.0d;
        }

        public final double getMax() {
            return this.max_;
        }

        /* access modifiers changed from: private */
        public void setMax(double d) {
            this.max_ = d;
        }

        /* access modifiers changed from: private */
        public void clearMax() {
            this.max_ = 0.0d;
        }

        public static Range parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Range parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Range parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Range parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Range parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Range parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Range parseFrom(InputStream inputStream) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Range parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Range parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Range) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Range parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Range parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Range parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Range range) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(range);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Range, Builder> implements RangeOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 r1) {
                this();
            }

            private Builder() {
                super(Range.DEFAULT_INSTANCE);
            }

            public final double getMin() {
                return ((Range) this.instance).getMin();
            }

            public final Builder setMin(double d) {
                copyOnWrite();
                ((Range) this.instance).setMin(d);
                return this;
            }

            public final Builder clearMin() {
                copyOnWrite();
                ((Range) this.instance).clearMin();
                return this;
            }

            public final double getMax() {
                return ((Range) this.instance).getMax();
            }

            public final Builder setMax(double d) {
                copyOnWrite();
                ((Range) this.instance).setMax(d);
                return this;
            }

            public final Builder clearMax() {
                copyOnWrite();
                ((Range) this.instance).clearMax();
                return this;
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Range();
                case 2:
                    return new Builder((AnonymousClass1) null);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"min_", "max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Range> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Range.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Range range = new Range();
            DEFAULT_INSTANCE = range;
            GeneratedMessageLite.registerDefaultInstance(Range.class, range);
        }

        public static Range getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Range> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.api.Distribution$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Distribution.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class BucketOptions extends GeneratedMessageLite<BucketOptions, Builder> implements BucketOptionsOrBuilder {
        /* access modifiers changed from: private */
        public static final BucketOptions DEFAULT_INSTANCE;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile Parser<BucketOptions> PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        public interface ExplicitOrBuilder extends MessageLiteOrBuilder {
            double getBounds(int i);

            int getBoundsCount();

            List<Double> getBoundsList();
        }

        public interface ExponentialOrBuilder extends MessageLiteOrBuilder {
            double getGrowthFactor();

            int getNumFiniteBuckets();

            double getScale();
        }

        public interface LinearOrBuilder extends MessageLiteOrBuilder {
            int getNumFiniteBuckets();

            double getOffset();

            double getWidth();
        }

        private BucketOptions() {
        }

        public static final class Linear extends GeneratedMessageLite<Linear, Builder> implements LinearOrBuilder {
            /* access modifiers changed from: private */
            public static final Linear DEFAULT_INSTANCE;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile Parser<Linear> PARSER = null;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            private Linear() {
            }

            public final int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            /* access modifiers changed from: private */
            public void setNumFiniteBuckets(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            public final double getWidth() {
                return this.width_;
            }

            /* access modifiers changed from: private */
            public void setWidth(double d) {
                this.width_ = d;
            }

            /* access modifiers changed from: private */
            public void clearWidth() {
                this.width_ = 0.0d;
            }

            public final double getOffset() {
                return this.offset_;
            }

            /* access modifiers changed from: private */
            public void setOffset(double d) {
                this.offset_ = d;
            }

            /* access modifiers changed from: private */
            public void clearOffset() {
                this.offset_ = 0.0d;
            }

            public static Linear parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Linear parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Linear parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Linear parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Linear parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Linear parseFrom(InputStream inputStream) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Linear parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Linear) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Linear parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Linear parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Linear linear) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(linear);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Linear, Builder> implements LinearOrBuilder {
                /* synthetic */ Builder(AnonymousClass1 r1) {
                    this();
                }

                private Builder() {
                    super(Linear.DEFAULT_INSTANCE);
                }

                public final int getNumFiniteBuckets() {
                    return ((Linear) this.instance).getNumFiniteBuckets();
                }

                public final Builder setNumFiniteBuckets(int i) {
                    copyOnWrite();
                    ((Linear) this.instance).setNumFiniteBuckets(i);
                    return this;
                }

                public final Builder clearNumFiniteBuckets() {
                    copyOnWrite();
                    ((Linear) this.instance).clearNumFiniteBuckets();
                    return this;
                }

                public final double getWidth() {
                    return ((Linear) this.instance).getWidth();
                }

                public final Builder setWidth(double d) {
                    copyOnWrite();
                    ((Linear) this.instance).setWidth(d);
                    return this;
                }

                public final Builder clearWidth() {
                    copyOnWrite();
                    ((Linear) this.instance).clearWidth();
                    return this;
                }

                public final double getOffset() {
                    return ((Linear) this.instance).getOffset();
                }

                public final Builder setOffset(double d) {
                    copyOnWrite();
                    ((Linear) this.instance).setOffset(d);
                    return this;
                }

                public final Builder clearOffset() {
                    copyOnWrite();
                    ((Linear) this.instance).clearOffset();
                    return this;
                }
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Linear();
                    case 2:
                        return new Builder((AnonymousClass1) null);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "width_", "offset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Linear> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (Linear.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                Linear linear = new Linear();
                DEFAULT_INSTANCE = linear;
                GeneratedMessageLite.registerDefaultInstance(Linear.class, linear);
            }

            public static Linear getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Linear> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Exponential extends GeneratedMessageLite<Exponential, Builder> implements ExponentialOrBuilder {
            /* access modifiers changed from: private */
            public static final Exponential DEFAULT_INSTANCE;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile Parser<Exponential> PARSER = null;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            private Exponential() {
            }

            public final int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            /* access modifiers changed from: private */
            public void setNumFiniteBuckets(int i) {
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(1854912375, oncanceled);
                    onCancelLoad.getMin(1854912375, oncanceled);
                }
                this.numFiniteBuckets_ = i;
            }

            /* access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            public final double getGrowthFactor() {
                return this.growthFactor_;
            }

            /* access modifiers changed from: private */
            public void setGrowthFactor(double d) {
                this.growthFactor_ = d;
            }

            /* access modifiers changed from: private */
            public void clearGrowthFactor() {
                this.growthFactor_ = 0.0d;
            }

            public final double getScale() {
                return this.scale_;
            }

            /* access modifiers changed from: private */
            public void setScale(double d) {
                this.scale_ = d;
            }

            /* access modifiers changed from: private */
            public void clearScale() {
                this.scale_ = 0.0d;
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Exponential parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Exponential parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Exponential parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Exponential parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Exponential parseFrom(InputStream inputStream) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Exponential parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Exponential) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Exponential parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Exponential parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Exponential exponential) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(exponential);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Exponential, Builder> implements ExponentialOrBuilder {
                /* synthetic */ Builder(AnonymousClass1 r1) {
                    this();
                }

                private Builder() {
                    super(Exponential.DEFAULT_INSTANCE);
                }

                public final int getNumFiniteBuckets() {
                    return ((Exponential) this.instance).getNumFiniteBuckets();
                }

                public final Builder setNumFiniteBuckets(int i) {
                    copyOnWrite();
                    ((Exponential) this.instance).setNumFiniteBuckets(i);
                    return this;
                }

                public final Builder clearNumFiniteBuckets() {
                    copyOnWrite();
                    ((Exponential) this.instance).clearNumFiniteBuckets();
                    return this;
                }

                public final double getGrowthFactor() {
                    return ((Exponential) this.instance).getGrowthFactor();
                }

                public final Builder setGrowthFactor(double d) {
                    copyOnWrite();
                    ((Exponential) this.instance).setGrowthFactor(d);
                    return this;
                }

                public final Builder clearGrowthFactor() {
                    copyOnWrite();
                    ((Exponential) this.instance).clearGrowthFactor();
                    return this;
                }

                public final double getScale() {
                    return ((Exponential) this.instance).getScale();
                }

                public final Builder setScale(double d) {
                    copyOnWrite();
                    ((Exponential) this.instance).setScale(d);
                    return this;
                }

                public final Builder clearScale() {
                    copyOnWrite();
                    ((Exponential) this.instance).clearScale();
                    return this;
                }
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Exponential();
                    case 2:
                        return new Builder((AnonymousClass1) null);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Exponential> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (Exponential.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                Exponential exponential = new Exponential();
                DEFAULT_INSTANCE = exponential;
                GeneratedMessageLite.registerDefaultInstance(Exponential.class, exponential);
            }

            public static Exponential getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Exponential> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Explicit extends GeneratedMessageLite<Explicit, Builder> implements ExplicitOrBuilder {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Explicit DEFAULT_INSTANCE;
            private static volatile Parser<Explicit> PARSER;
            private int boundsMemoizedSerializedSize = -1;
            private Internal.DoubleList bounds_ = emptyDoubleList();

            private Explicit() {
            }

            public final List<Double> getBoundsList() {
                return this.bounds_;
            }

            public final int getBoundsCount() {
                return this.bounds_.size();
            }

            public final double getBounds(int i) {
                return this.bounds_.getDouble(i);
            }

            private void ensureBoundsIsMutable() {
                Internal.DoubleList doubleList = this.bounds_;
                if (!doubleList.isModifiable()) {
                    this.bounds_ = GeneratedMessageLite.mutableCopy(doubleList);
                }
            }

            /* access modifiers changed from: private */
            public void setBounds(int i, double d) {
                ensureBoundsIsMutable();
                this.bounds_.setDouble(i, d);
            }

            /* access modifiers changed from: private */
            public void addBounds(double d) {
                ensureBoundsIsMutable();
                this.bounds_.addDouble(d);
            }

            /* access modifiers changed from: private */
            public void addAllBounds(Iterable<? extends Double> iterable) {
                ensureBoundsIsMutable();
                AbstractMessageLite.addAll(iterable, this.bounds_);
            }

            /* access modifiers changed from: private */
            public void clearBounds() {
                this.bounds_ = emptyDoubleList();
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Explicit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Explicit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Explicit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Explicit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Explicit parseFrom(InputStream inputStream) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Explicit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Explicit) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Explicit parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Explicit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Explicit explicit) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(explicit);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Explicit, Builder> implements ExplicitOrBuilder {
                /* synthetic */ Builder(AnonymousClass1 r1) {
                    this();
                }

                private Builder() {
                    super(Explicit.DEFAULT_INSTANCE);
                }

                public final List<Double> getBoundsList() {
                    return Collections.unmodifiableList(((Explicit) this.instance).getBoundsList());
                }

                public final int getBoundsCount() {
                    return ((Explicit) this.instance).getBoundsCount();
                }

                public final double getBounds(int i) {
                    return ((Explicit) this.instance).getBounds(i);
                }

                public final Builder setBounds(int i, double d) {
                    copyOnWrite();
                    ((Explicit) this.instance).setBounds(i, d);
                    return this;
                }

                public final Builder addBounds(double d) {
                    copyOnWrite();
                    ((Explicit) this.instance).addBounds(d);
                    return this;
                }

                public final Builder addAllBounds(Iterable<? extends Double> iterable) {
                    copyOnWrite();
                    ((Explicit) this.instance).addAllBounds(iterable);
                    return this;
                }

                public final Builder clearBounds() {
                    copyOnWrite();
                    ((Explicit) this.instance).clearBounds();
                    return this;
                }
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Explicit();
                    case 2:
                        return new Builder((AnonymousClass1) null);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"bounds_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Explicit> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (Explicit.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                Explicit explicit = new Explicit();
                DEFAULT_INSTANCE = explicit;
                GeneratedMessageLite.registerDefaultInstance(Explicit.class, explicit);
            }

            public static Explicit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Explicit> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public enum OptionsCase {
            LINEAR_BUCKETS(1),
            EXPONENTIAL_BUCKETS(2),
            EXPLICIT_BUCKETS(3),
            OPTIONS_NOT_SET(0);
            
            private final int value;

            private OptionsCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static OptionsCase valueOf(int i) {
                return forNumber(i);
            }

            public static OptionsCase forNumber(int i) {
                if (i == 0) {
                    return OPTIONS_NOT_SET;
                }
                if (i == 1) {
                    return LINEAR_BUCKETS;
                }
                if (i == 2) {
                    return EXPONENTIAL_BUCKETS;
                }
                if (i != 3) {
                    return null;
                }
                return EXPLICIT_BUCKETS;
            }

            public final int getNumber() {
                return this.value;
            }
        }

        public final OptionsCase getOptionsCase() {
            return OptionsCase.forNumber(this.optionsCase_);
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.optionsCase_ = 0;
            this.options_ = null;
        }

        public final boolean hasLinearBuckets() {
            return this.optionsCase_ == 1;
        }

        public final Linear getLinearBuckets() {
            if (this.optionsCase_ == 1) {
                return (Linear) this.options_;
            }
            return Linear.getDefaultInstance();
        }

        /* access modifiers changed from: private */
        public void setLinearBuckets(Linear linear) {
            this.options_ = linear;
            this.optionsCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeLinearBuckets(Linear linear) {
            if (this.optionsCase_ != 1 || this.options_ == Linear.getDefaultInstance()) {
                this.options_ = linear;
            } else {
                this.options_ = ((Linear.Builder) Linear.newBuilder((Linear) this.options_).mergeFrom(linear)).buildPartial();
            }
            this.optionsCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearLinearBuckets() {
            if (this.optionsCase_ == 1) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        public final boolean hasExponentialBuckets() {
            return this.optionsCase_ == 2;
        }

        public final Exponential getExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                return (Exponential) this.options_;
            }
            return Exponential.getDefaultInstance();
        }

        /* access modifiers changed from: private */
        public void setExponentialBuckets(Exponential exponential) {
            this.options_ = exponential;
            this.optionsCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeExponentialBuckets(Exponential exponential) {
            if (this.optionsCase_ != 2 || this.options_ == Exponential.getDefaultInstance()) {
                this.options_ = exponential;
            } else {
                this.options_ = ((Exponential.Builder) Exponential.newBuilder((Exponential) this.options_).mergeFrom(exponential)).buildPartial();
            }
            this.optionsCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void clearExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        public final boolean hasExplicitBuckets() {
            return this.optionsCase_ == 3;
        }

        public final Explicit getExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                return (Explicit) this.options_;
            }
            return Explicit.getDefaultInstance();
        }

        /* access modifiers changed from: private */
        public void setExplicitBuckets(Explicit explicit) {
            this.options_ = explicit;
            this.optionsCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeExplicitBuckets(Explicit explicit) {
            if (this.optionsCase_ != 3 || this.options_ == Explicit.getDefaultInstance()) {
                this.options_ = explicit;
            } else {
                this.options_ = ((Explicit.Builder) Explicit.newBuilder((Explicit) this.options_).mergeFrom(explicit)).buildPartial();
            }
            this.optionsCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void clearExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BucketOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BucketOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BucketOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BucketOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BucketOptions parseFrom(InputStream inputStream) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BucketOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BucketOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BucketOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BucketOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(BucketOptions bucketOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bucketOptions);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<BucketOptions, Builder> implements BucketOptionsOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 r1) {
                this();
            }

            private Builder() {
                super(BucketOptions.DEFAULT_INSTANCE);
            }

            public final OptionsCase getOptionsCase() {
                return ((BucketOptions) this.instance).getOptionsCase();
            }

            public final Builder clearOptions() {
                copyOnWrite();
                ((BucketOptions) this.instance).clearOptions();
                return this;
            }

            public final boolean hasLinearBuckets() {
                return ((BucketOptions) this.instance).hasLinearBuckets();
            }

            public final Linear getLinearBuckets() {
                return ((BucketOptions) this.instance).getLinearBuckets();
            }

            public final Builder setLinearBuckets(Linear linear) {
                copyOnWrite();
                ((BucketOptions) this.instance).setLinearBuckets(linear);
                return this;
            }

            public final Builder setLinearBuckets(Linear.Builder builder) {
                copyOnWrite();
                ((BucketOptions) this.instance).setLinearBuckets((Linear) builder.build());
                return this;
            }

            public final Builder mergeLinearBuckets(Linear linear) {
                copyOnWrite();
                ((BucketOptions) this.instance).mergeLinearBuckets(linear);
                return this;
            }

            public final Builder clearLinearBuckets() {
                copyOnWrite();
                ((BucketOptions) this.instance).clearLinearBuckets();
                return this;
            }

            public final boolean hasExponentialBuckets() {
                return ((BucketOptions) this.instance).hasExponentialBuckets();
            }

            public final Exponential getExponentialBuckets() {
                return ((BucketOptions) this.instance).getExponentialBuckets();
            }

            public final Builder setExponentialBuckets(Exponential exponential) {
                copyOnWrite();
                ((BucketOptions) this.instance).setExponentialBuckets(exponential);
                return this;
            }

            public final Builder setExponentialBuckets(Exponential.Builder builder) {
                copyOnWrite();
                ((BucketOptions) this.instance).setExponentialBuckets((Exponential) builder.build());
                return this;
            }

            public final Builder mergeExponentialBuckets(Exponential exponential) {
                copyOnWrite();
                ((BucketOptions) this.instance).mergeExponentialBuckets(exponential);
                return this;
            }

            public final Builder clearExponentialBuckets() {
                copyOnWrite();
                ((BucketOptions) this.instance).clearExponentialBuckets();
                return this;
            }

            public final boolean hasExplicitBuckets() {
                return ((BucketOptions) this.instance).hasExplicitBuckets();
            }

            public final Explicit getExplicitBuckets() {
                return ((BucketOptions) this.instance).getExplicitBuckets();
            }

            public final Builder setExplicitBuckets(Explicit explicit) {
                copyOnWrite();
                ((BucketOptions) this.instance).setExplicitBuckets(explicit);
                return this;
            }

            public final Builder setExplicitBuckets(Explicit.Builder builder) {
                copyOnWrite();
                ((BucketOptions) this.instance).setExplicitBuckets((Explicit) builder.build());
                return this;
            }

            public final Builder mergeExplicitBuckets(Explicit explicit) {
                copyOnWrite();
                ((BucketOptions) this.instance).mergeExplicitBuckets(explicit);
                return this;
            }

            public final Builder clearExplicitBuckets() {
                copyOnWrite();
                ((BucketOptions) this.instance).clearExplicitBuckets();
                return this;
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new BucketOptions();
                case 2:
                    return new Builder((AnonymousClass1) null);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"options_", "optionsCase_", Linear.class, Exponential.class, Explicit.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BucketOptions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (BucketOptions.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            BucketOptions bucketOptions = new BucketOptions();
            DEFAULT_INSTANCE = bucketOptions;
            GeneratedMessageLite.registerDefaultInstance(BucketOptions.class, bucketOptions);
        }

        public static BucketOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BucketOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Exemplar extends GeneratedMessageLite<Exemplar, Builder> implements ExemplarOrBuilder {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final Exemplar DEFAULT_INSTANCE;
        private static volatile Parser<Exemplar> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private Internal.ProtobufList<Any> attachments_ = emptyProtobufList();
        private Timestamp timestamp_;
        private double value_;

        private Exemplar() {
        }

        public final double getValue() {
            return this.value_;
        }

        /* access modifiers changed from: private */
        public void setValue(double d) {
            this.value_ = d;
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0.0d;
        }

        public final boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        /* access modifiers changed from: private */
        public void setTimestamp(Timestamp timestamp) {
            this.timestamp_ = timestamp;
        }

        /* access modifiers changed from: private */
        public void mergeTimestamp(Timestamp timestamp) {
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.timestamp_ = timestamp;
            } else {
                this.timestamp_ = (Timestamp) ((Timestamp.Builder) Timestamp.newBuilder(this.timestamp_).mergeFrom(timestamp)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
        }

        public final List<Any> getAttachmentsList() {
            return this.attachments_;
        }

        public final List<? extends AnyOrBuilder> getAttachmentsOrBuilderList() {
            return this.attachments_;
        }

        public final int getAttachmentsCount() {
            return this.attachments_.size();
        }

        public final Any getAttachments(int i) {
            return (Any) this.attachments_.get(i);
        }

        public final AnyOrBuilder getAttachmentsOrBuilder(int i) {
            return (AnyOrBuilder) this.attachments_.get(i);
        }

        private void ensureAttachmentsIsMutable() {
            Internal.ProtobufList<Any> protobufList = this.attachments_;
            if (!protobufList.isModifiable()) {
                this.attachments_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        /* access modifiers changed from: private */
        public void setAttachments(int i, Any any) {
            ensureAttachmentsIsMutable();
            this.attachments_.set(i, any);
        }

        /* access modifiers changed from: private */
        public void addAttachments(Any any) {
            ensureAttachmentsIsMutable();
            this.attachments_.add(any);
        }

        /* access modifiers changed from: private */
        public void addAttachments(int i, Any any) {
            ensureAttachmentsIsMutable();
            this.attachments_.add(i, any);
        }

        /* access modifiers changed from: private */
        public void addAllAttachments(Iterable<? extends Any> iterable) {
            ensureAttachmentsIsMutable();
            AbstractMessageLite.addAll(iterable, this.attachments_);
        }

        /* access modifiers changed from: private */
        public void clearAttachments() {
            this.attachments_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeAttachments(int i) {
            ensureAttachmentsIsMutable();
            this.attachments_.remove(i);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Exemplar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Exemplar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Exemplar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Exemplar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Exemplar parseFrom(InputStream inputStream) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Exemplar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Exemplar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Exemplar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Exemplar parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Exemplar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Exemplar exemplar) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exemplar);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Exemplar, Builder> implements ExemplarOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 r1) {
                this();
            }

            private Builder() {
                super(Exemplar.DEFAULT_INSTANCE);
            }

            public final double getValue() {
                return ((Exemplar) this.instance).getValue();
            }

            public final Builder setValue(double d) {
                copyOnWrite();
                ((Exemplar) this.instance).setValue(d);
                return this;
            }

            public final Builder clearValue() {
                copyOnWrite();
                ((Exemplar) this.instance).clearValue();
                return this;
            }

            public final boolean hasTimestamp() {
                return ((Exemplar) this.instance).hasTimestamp();
            }

            public final Timestamp getTimestamp() {
                return ((Exemplar) this.instance).getTimestamp();
            }

            public final Builder setTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((Exemplar) this.instance).setTimestamp(timestamp);
                return this;
            }

            public final Builder setTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                ((Exemplar) this.instance).setTimestamp((Timestamp) builder.build());
                return this;
            }

            public final Builder mergeTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((Exemplar) this.instance).mergeTimestamp(timestamp);
                return this;
            }

            public final Builder clearTimestamp() {
                copyOnWrite();
                ((Exemplar) this.instance).clearTimestamp();
                return this;
            }

            public final List<Any> getAttachmentsList() {
                return Collections.unmodifiableList(((Exemplar) this.instance).getAttachmentsList());
            }

            public final int getAttachmentsCount() {
                return ((Exemplar) this.instance).getAttachmentsCount();
            }

            public final Any getAttachments(int i) {
                return ((Exemplar) this.instance).getAttachments(i);
            }

            public final Builder setAttachments(int i, Any any) {
                copyOnWrite();
                ((Exemplar) this.instance).setAttachments(i, any);
                return this;
            }

            public final Builder setAttachments(int i, Any.Builder builder) {
                copyOnWrite();
                ((Exemplar) this.instance).setAttachments(i, (Any) builder.build());
                return this;
            }

            public final Builder addAttachments(Any any) {
                copyOnWrite();
                ((Exemplar) this.instance).addAttachments(any);
                return this;
            }

            public final Builder addAttachments(int i, Any any) {
                copyOnWrite();
                ((Exemplar) this.instance).addAttachments(i, any);
                return this;
            }

            public final Builder addAttachments(Any.Builder builder) {
                copyOnWrite();
                ((Exemplar) this.instance).addAttachments((Any) builder.build());
                return this;
            }

            public final Builder addAttachments(int i, Any.Builder builder) {
                copyOnWrite();
                ((Exemplar) this.instance).addAttachments(i, (Any) builder.build());
                return this;
            }

            public final Builder addAllAttachments(Iterable<? extends Any> iterable) {
                copyOnWrite();
                ((Exemplar) this.instance).addAllAttachments(iterable);
                return this;
            }

            public final Builder clearAttachments() {
                copyOnWrite();
                ((Exemplar) this.instance).clearAttachments();
                return this;
            }

            public final Builder removeAttachments(int i) {
                copyOnWrite();
                ((Exemplar) this.instance).removeAttachments(i);
                return this;
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Exemplar();
                case 2:
                    return new Builder((AnonymousClass1) null);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002\t\u0003\u001b", new Object[]{"value_", "timestamp_", "attachments_", Any.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Exemplar> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (Exemplar.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Exemplar exemplar = new Exemplar();
            DEFAULT_INSTANCE = exemplar;
            GeneratedMessageLite.registerDefaultInstance(Exemplar.class, exemplar);
        }

        public static Exemplar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Exemplar> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public final long getCount() {
        return this.count_;
    }

    /* access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    public final double getMean() {
        return this.mean_;
    }

    /* access modifiers changed from: private */
    public void setMean(double d) {
        this.mean_ = d;
    }

    /* access modifiers changed from: private */
    public void clearMean() {
        this.mean_ = 0.0d;
    }

    public final double getSumOfSquaredDeviation() {
        return this.sumOfSquaredDeviation_;
    }

    /* access modifiers changed from: private */
    public void setSumOfSquaredDeviation(double d) {
        this.sumOfSquaredDeviation_ = d;
    }

    /* access modifiers changed from: private */
    public void clearSumOfSquaredDeviation() {
        this.sumOfSquaredDeviation_ = 0.0d;
    }

    public final boolean hasRange() {
        return this.range_ != null;
    }

    public final Range getRange() {
        Range range = this.range_;
        return range == null ? Range.getDefaultInstance() : range;
    }

    /* access modifiers changed from: private */
    public void setRange(Range range) {
        this.range_ = range;
    }

    /* access modifiers changed from: private */
    public void mergeRange(Range range) {
        Range range2 = this.range_;
        if (range2 == null || range2 == Range.getDefaultInstance()) {
            this.range_ = range;
        } else {
            this.range_ = (Range) ((Range.Builder) Range.newBuilder(this.range_).mergeFrom(range)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearRange() {
        this.range_ = null;
    }

    public final boolean hasBucketOptions() {
        return this.bucketOptions_ != null;
    }

    public final BucketOptions getBucketOptions() {
        BucketOptions bucketOptions = this.bucketOptions_;
        return bucketOptions == null ? BucketOptions.getDefaultInstance() : bucketOptions;
    }

    /* access modifiers changed from: private */
    public void setBucketOptions(BucketOptions bucketOptions) {
        this.bucketOptions_ = bucketOptions;
    }

    /* access modifiers changed from: private */
    public void mergeBucketOptions(BucketOptions bucketOptions) {
        BucketOptions bucketOptions2 = this.bucketOptions_;
        if (bucketOptions2 == null || bucketOptions2 == BucketOptions.getDefaultInstance()) {
            this.bucketOptions_ = bucketOptions;
        } else {
            this.bucketOptions_ = (BucketOptions) ((BucketOptions.Builder) BucketOptions.newBuilder(this.bucketOptions_).mergeFrom(bucketOptions)).buildPartial();
        }
    }

    /* access modifiers changed from: private */
    public void clearBucketOptions() {
        this.bucketOptions_ = null;
    }

    public final List<Long> getBucketCountsList() {
        return this.bucketCounts_;
    }

    public final int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    public final long getBucketCounts(int i) {
        return this.bucketCounts_.getLong(i);
    }

    private void ensureBucketCountsIsMutable() {
        Internal.LongList longList = this.bucketCounts_;
        if (!longList.isModifiable()) {
            this.bucketCounts_ = GeneratedMessageLite.mutableCopy(longList);
        }
    }

    /* access modifiers changed from: private */
    public void setBucketCounts(int i, long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.setLong(i, j);
    }

    /* access modifiers changed from: private */
    public void addBucketCounts(long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.addLong(j);
    }

    /* access modifiers changed from: private */
    public void addAllBucketCounts(Iterable<? extends Long> iterable) {
        ensureBucketCountsIsMutable();
        AbstractMessageLite.addAll(iterable, this.bucketCounts_);
    }

    /* access modifiers changed from: private */
    public void clearBucketCounts() {
        this.bucketCounts_ = emptyLongList();
    }

    public final List<Exemplar> getExemplarsList() {
        return this.exemplars_;
    }

    public final List<? extends ExemplarOrBuilder> getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    public final int getExemplarsCount() {
        return this.exemplars_.size();
    }

    public final Exemplar getExemplars(int i) {
        return (Exemplar) this.exemplars_.get(i);
    }

    public final ExemplarOrBuilder getExemplarsOrBuilder(int i) {
        return (ExemplarOrBuilder) this.exemplars_.get(i);
    }

    private void ensureExemplarsIsMutable() {
        Internal.ProtobufList<Exemplar> protobufList = this.exemplars_;
        if (!protobufList.isModifiable()) {
            this.exemplars_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    /* access modifiers changed from: private */
    public void setExemplars(int i, Exemplar exemplar) {
        ensureExemplarsIsMutable();
        this.exemplars_.set(i, exemplar);
    }

    /* access modifiers changed from: private */
    public void addExemplars(Exemplar exemplar) {
        ensureExemplarsIsMutable();
        this.exemplars_.add(exemplar);
    }

    /* access modifiers changed from: private */
    public void addExemplars(int i, Exemplar exemplar) {
        ensureExemplarsIsMutable();
        this.exemplars_.add(i, exemplar);
    }

    /* access modifiers changed from: private */
    public void addAllExemplars(Iterable<? extends Exemplar> iterable) {
        ensureExemplarsIsMutable();
        AbstractMessageLite.addAll(iterable, this.exemplars_);
    }

    /* access modifiers changed from: private */
    public void clearExemplars() {
        this.exemplars_ = emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void removeExemplars(int i) {
        ensureExemplarsIsMutable();
        this.exemplars_.remove(i);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Distribution parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Distribution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Distribution parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Distribution parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Distribution parseFrom(InputStream inputStream) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Distribution) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Distribution distribution) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(distribution);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Distribution, Builder> implements DistributionOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(Distribution.DEFAULT_INSTANCE);
        }

        public final long getCount() {
            return ((Distribution) this.instance).getCount();
        }

        public final Builder setCount(long j) {
            copyOnWrite();
            ((Distribution) this.instance).setCount(j);
            return this;
        }

        public final Builder clearCount() {
            copyOnWrite();
            ((Distribution) this.instance).clearCount();
            return this;
        }

        public final double getMean() {
            return ((Distribution) this.instance).getMean();
        }

        public final Builder setMean(double d) {
            copyOnWrite();
            ((Distribution) this.instance).setMean(d);
            return this;
        }

        public final Builder clearMean() {
            copyOnWrite();
            ((Distribution) this.instance).clearMean();
            return this;
        }

        public final double getSumOfSquaredDeviation() {
            return ((Distribution) this.instance).getSumOfSquaredDeviation();
        }

        public final Builder setSumOfSquaredDeviation(double d) {
            copyOnWrite();
            ((Distribution) this.instance).setSumOfSquaredDeviation(d);
            return this;
        }

        public final Builder clearSumOfSquaredDeviation() {
            copyOnWrite();
            ((Distribution) this.instance).clearSumOfSquaredDeviation();
            return this;
        }

        public final boolean hasRange() {
            return ((Distribution) this.instance).hasRange();
        }

        public final Range getRange() {
            return ((Distribution) this.instance).getRange();
        }

        public final Builder setRange(Range range) {
            copyOnWrite();
            ((Distribution) this.instance).setRange(range);
            return this;
        }

        public final Builder setRange(Range.Builder builder) {
            copyOnWrite();
            ((Distribution) this.instance).setRange((Range) builder.build());
            return this;
        }

        public final Builder mergeRange(Range range) {
            copyOnWrite();
            ((Distribution) this.instance).mergeRange(range);
            return this;
        }

        public final Builder clearRange() {
            copyOnWrite();
            ((Distribution) this.instance).clearRange();
            return this;
        }

        public final boolean hasBucketOptions() {
            return ((Distribution) this.instance).hasBucketOptions();
        }

        public final BucketOptions getBucketOptions() {
            return ((Distribution) this.instance).getBucketOptions();
        }

        public final Builder setBucketOptions(BucketOptions bucketOptions) {
            copyOnWrite();
            ((Distribution) this.instance).setBucketOptions(bucketOptions);
            return this;
        }

        public final Builder setBucketOptions(BucketOptions.Builder builder) {
            copyOnWrite();
            ((Distribution) this.instance).setBucketOptions((BucketOptions) builder.build());
            return this;
        }

        public final Builder mergeBucketOptions(BucketOptions bucketOptions) {
            copyOnWrite();
            ((Distribution) this.instance).mergeBucketOptions(bucketOptions);
            return this;
        }

        public final Builder clearBucketOptions() {
            copyOnWrite();
            ((Distribution) this.instance).clearBucketOptions();
            return this;
        }

        public final List<Long> getBucketCountsList() {
            return Collections.unmodifiableList(((Distribution) this.instance).getBucketCountsList());
        }

        public final int getBucketCountsCount() {
            return ((Distribution) this.instance).getBucketCountsCount();
        }

        public final long getBucketCounts(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1305696545, oncanceled);
                onCancelLoad.getMin(-1305696545, oncanceled);
            }
            return ((Distribution) this.instance).getBucketCounts(i);
        }

        public final Builder setBucketCounts(int i, long j) {
            copyOnWrite();
            ((Distribution) this.instance).setBucketCounts(i, j);
            return this;
        }

        public final Builder addBucketCounts(long j) {
            copyOnWrite();
            ((Distribution) this.instance).addBucketCounts(j);
            return this;
        }

        public final Builder addAllBucketCounts(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((Distribution) this.instance).addAllBucketCounts(iterable);
            return this;
        }

        public final Builder clearBucketCounts() {
            copyOnWrite();
            ((Distribution) this.instance).clearBucketCounts();
            return this;
        }

        public final List<Exemplar> getExemplarsList() {
            return Collections.unmodifiableList(((Distribution) this.instance).getExemplarsList());
        }

        public final int getExemplarsCount() {
            return ((Distribution) this.instance).getExemplarsCount();
        }

        public final Exemplar getExemplars(int i) {
            return ((Distribution) this.instance).getExemplars(i);
        }

        public final Builder setExemplars(int i, Exemplar exemplar) {
            copyOnWrite();
            ((Distribution) this.instance).setExemplars(i, exemplar);
            return this;
        }

        public final Builder setExemplars(int i, Exemplar.Builder builder) {
            copyOnWrite();
            ((Distribution) this.instance).setExemplars(i, (Exemplar) builder.build());
            return this;
        }

        public final Builder addExemplars(Exemplar exemplar) {
            copyOnWrite();
            ((Distribution) this.instance).addExemplars(exemplar);
            return this;
        }

        public final Builder addExemplars(int i, Exemplar exemplar) {
            copyOnWrite();
            ((Distribution) this.instance).addExemplars(i, exemplar);
            return this;
        }

        public final Builder addExemplars(Exemplar.Builder builder) {
            copyOnWrite();
            ((Distribution) this.instance).addExemplars((Exemplar) builder.build());
            return this;
        }

        public final Builder addExemplars(int i, Exemplar.Builder builder) {
            copyOnWrite();
            ((Distribution) this.instance).addExemplars(i, (Exemplar) builder.build());
            return this;
        }

        public final Builder addAllExemplars(Iterable<? extends Exemplar> iterable) {
            copyOnWrite();
            ((Distribution) this.instance).addAllExemplars(iterable);
            return this;
        }

        public final Builder clearExemplars() {
            copyOnWrite();
            ((Distribution) this.instance).clearExemplars();
            return this;
        }

        public final Builder removeExemplars(int i) {
            copyOnWrite();
            ((Distribution) this.instance).removeExemplars(i);
            return this;
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Distribution();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004\t\u0006\t\u0007%\n\u001b", new Object[]{"count_", "mean_", "sumOfSquaredDeviation_", "range_", "bucketOptions_", "bucketCounts_", "exemplars_", Exemplar.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Distribution> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Distribution.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        Distribution distribution = new Distribution();
        DEFAULT_INSTANCE = distribution;
        GeneratedMessageLite.registerDefaultInstance(Distribution.class, distribution);
    }

    public static Distribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Distribution> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
