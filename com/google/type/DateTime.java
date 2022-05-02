package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.type.TimeZone;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class DateTime extends GeneratedMessageLite<DateTime, Builder> implements DateTimeOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final DateTime DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile Parser<DateTime> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    private DateTime() {
    }

    public enum TimeOffsetCase {
        UTC_OFFSET(8),
        TIME_ZONE(9),
        TIMEOFFSET_NOT_SET(0);
        
        private final int value;

        private TimeOffsetCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static TimeOffsetCase valueOf(int i) {
            return forNumber(i);
        }

        public static TimeOffsetCase forNumber(int i) {
            if (i == 0) {
                return TIMEOFFSET_NOT_SET;
            }
            if (i == 8) {
                return UTC_OFFSET;
            }
            if (i != 9) {
                return null;
            }
            return TIME_ZONE;
        }

        public final int getNumber() {
            return this.value;
        }
    }

    public final TimeOffsetCase getTimeOffsetCase() {
        return TimeOffsetCase.forNumber(this.timeOffsetCase_);
    }

    /* access modifiers changed from: private */
    public void clearTimeOffset() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    public final int getYear() {
        return this.year_;
    }

    /* access modifiers changed from: private */
    public void setYear(int i) {
        this.year_ = i;
    }

    /* access modifiers changed from: private */
    public void clearYear() {
        this.year_ = 0;
    }

    public final int getMonth() {
        return this.month_;
    }

    /* access modifiers changed from: private */
    public void setMonth(int i) {
        this.month_ = i;
    }

    /* access modifiers changed from: private */
    public void clearMonth() {
        this.month_ = 0;
    }

    public final int getDay() {
        return this.day_;
    }

    /* access modifiers changed from: private */
    public void setDay(int i) {
        this.day_ = i;
    }

    /* access modifiers changed from: private */
    public void clearDay() {
        this.day_ = 0;
    }

    public final int getHours() {
        return this.hours_;
    }

    /* access modifiers changed from: private */
    public void setHours(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1218472430, oncanceled);
            onCancelLoad.getMin(1218472430, oncanceled);
        }
        this.hours_ = i;
    }

    /* access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = 0;
    }

    public final int getMinutes() {
        return this.minutes_;
    }

    /* access modifiers changed from: private */
    public void setMinutes(int i) {
        this.minutes_ = i;
    }

    /* access modifiers changed from: private */
    public void clearMinutes() {
        this.minutes_ = 0;
    }

    public final int getSeconds() {
        return this.seconds_;
    }

    /* access modifiers changed from: private */
    public void setSeconds(int i) {
        this.seconds_ = i;
    }

    /* access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    public final int getNanos() {
        return this.nanos_;
    }

    /* access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    public final boolean hasUtcOffset() {
        return this.timeOffsetCase_ == 8;
    }

    public final Duration getUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            return (Duration) this.timeOffset_;
        }
        return Duration.getDefaultInstance();
    }

    /* access modifiers changed from: private */
    public void setUtcOffset(Duration duration) {
        this.timeOffset_ = duration;
        this.timeOffsetCase_ = 8;
    }

    /* access modifiers changed from: private */
    public void mergeUtcOffset(Duration duration) {
        if (this.timeOffsetCase_ != 8 || this.timeOffset_ == Duration.getDefaultInstance()) {
            this.timeOffset_ = duration;
        } else {
            this.timeOffset_ = ((Duration.Builder) Duration.newBuilder((Duration) this.timeOffset_).mergeFrom(duration)).buildPartial();
        }
        this.timeOffsetCase_ = 8;
    }

    /* access modifiers changed from: private */
    public void clearUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    public final boolean hasTimeZone() {
        return this.timeOffsetCase_ == 9;
    }

    public final TimeZone getTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            return (TimeZone) this.timeOffset_;
        }
        return TimeZone.getDefaultInstance();
    }

    /* access modifiers changed from: private */
    public void setTimeZone(TimeZone timeZone) {
        this.timeOffset_ = timeZone;
        this.timeOffsetCase_ = 9;
    }

    /* access modifiers changed from: private */
    public void mergeTimeZone(TimeZone timeZone) {
        if (this.timeOffsetCase_ != 9 || this.timeOffset_ == TimeZone.getDefaultInstance()) {
            this.timeOffset_ = timeZone;
        } else {
            this.timeOffset_ = ((TimeZone.Builder) TimeZone.newBuilder((TimeZone) this.timeOffset_).mergeFrom(timeZone)).buildPartial();
        }
        this.timeOffsetCase_ = 9;
    }

    /* access modifiers changed from: private */
    public void clearTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DateTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DateTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DateTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DateTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DateTime parseFrom(InputStream inputStream) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DateTime) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTime) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DateTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DateTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DateTime dateTime) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(dateTime);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DateTime, Builder> implements DateTimeOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        private Builder() {
            super(DateTime.DEFAULT_INSTANCE);
        }

        public final TimeOffsetCase getTimeOffsetCase() {
            return ((DateTime) this.instance).getTimeOffsetCase();
        }

        public final Builder clearTimeOffset() {
            copyOnWrite();
            ((DateTime) this.instance).clearTimeOffset();
            return this;
        }

        public final int getYear() {
            return ((DateTime) this.instance).getYear();
        }

        public final Builder setYear(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setYear(i);
            return this;
        }

        public final Builder clearYear() {
            copyOnWrite();
            ((DateTime) this.instance).clearYear();
            return this;
        }

        public final int getMonth() {
            return ((DateTime) this.instance).getMonth();
        }

        public final Builder setMonth(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setMonth(i);
            return this;
        }

        public final Builder clearMonth() {
            copyOnWrite();
            ((DateTime) this.instance).clearMonth();
            return this;
        }

        public final int getDay() {
            return ((DateTime) this.instance).getDay();
        }

        public final Builder setDay(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setDay(i);
            return this;
        }

        public final Builder clearDay() {
            copyOnWrite();
            ((DateTime) this.instance).clearDay();
            return this;
        }

        public final int getHours() {
            return ((DateTime) this.instance).getHours();
        }

        public final Builder setHours(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setHours(i);
            return this;
        }

        public final Builder clearHours() {
            copyOnWrite();
            ((DateTime) this.instance).clearHours();
            return this;
        }

        public final int getMinutes() {
            return ((DateTime) this.instance).getMinutes();
        }

        public final Builder setMinutes(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setMinutes(i);
            return this;
        }

        public final Builder clearMinutes() {
            copyOnWrite();
            ((DateTime) this.instance).clearMinutes();
            return this;
        }

        public final int getSeconds() {
            return ((DateTime) this.instance).getSeconds();
        }

        public final Builder setSeconds(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setSeconds(i);
            return this;
        }

        public final Builder clearSeconds() {
            copyOnWrite();
            ((DateTime) this.instance).clearSeconds();
            return this;
        }

        public final int getNanos() {
            return ((DateTime) this.instance).getNanos();
        }

        public final Builder setNanos(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setNanos(i);
            return this;
        }

        public final Builder clearNanos() {
            copyOnWrite();
            ((DateTime) this.instance).clearNanos();
            return this;
        }

        public final boolean hasUtcOffset() {
            return ((DateTime) this.instance).hasUtcOffset();
        }

        public final Duration getUtcOffset() {
            return ((DateTime) this.instance).getUtcOffset();
        }

        public final Builder setUtcOffset(Duration duration) {
            copyOnWrite();
            ((DateTime) this.instance).setUtcOffset(duration);
            return this;
        }

        public final Builder setUtcOffset(Duration.Builder builder) {
            copyOnWrite();
            ((DateTime) this.instance).setUtcOffset((Duration) builder.build());
            return this;
        }

        public final Builder mergeUtcOffset(Duration duration) {
            copyOnWrite();
            ((DateTime) this.instance).mergeUtcOffset(duration);
            return this;
        }

        public final Builder clearUtcOffset() {
            copyOnWrite();
            ((DateTime) this.instance).clearUtcOffset();
            return this;
        }

        public final boolean hasTimeZone() {
            return ((DateTime) this.instance).hasTimeZone();
        }

        public final TimeZone getTimeZone() {
            return ((DateTime) this.instance).getTimeZone();
        }

        public final Builder setTimeZone(TimeZone timeZone) {
            copyOnWrite();
            ((DateTime) this.instance).setTimeZone(timeZone);
            return this;
        }

        public final Builder setTimeZone(TimeZone.Builder builder) {
            copyOnWrite();
            ((DateTime) this.instance).setTimeZone((TimeZone) builder.build());
            return this;
        }

        public final Builder mergeTimeZone(TimeZone timeZone) {
            copyOnWrite();
            ((DateTime) this.instance).mergeTimeZone(timeZone);
            return this;
        }

        public final Builder clearTimeZone() {
            copyOnWrite();
            ((DateTime) this.instance).clearTimeZone();
            return this;
        }
    }

    /* renamed from: com.google.type.DateTime$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.type.DateTime.AnonymousClass1.<clinit>():void");
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new DateTime();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", AnalyticsContext.KEY_MONTH, "day_", "hours_", "minutes_", "seconds_", "nanos_", Duration.class, TimeZone.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DateTime> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (DateTime.class) {
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
        DateTime dateTime = new DateTime();
        DEFAULT_INSTANCE = dateTime;
        GeneratedMessageLite.registerDefaultInstance(DateTime.class, dateTime);
    }

    public static DateTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<DateTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
