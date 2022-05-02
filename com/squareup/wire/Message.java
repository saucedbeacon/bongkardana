package com.squareup.wire;

import com.squareup.wire.MessageAdapter;
import com.squareup.wire.UnknownFieldMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.printConnMonitorLog;

public abstract class Message {
    /* access modifiers changed from: private */
    public static final Wire WIRE = new Wire((Class<?>[]) new Class[0]);
    private transient int cachedSerializedSize;
    protected transient int hashCode = 0;
    private transient boolean haveCachedSerializedSize;
    /* access modifiers changed from: private */
    public transient UnknownFieldMap unknownFields;

    public enum Datatype {
        INT32(1),
        INT64(2),
        UINT32(3),
        UINT64(4),
        SINT32(5),
        SINT64(6),
        BOOL(7),
        ENUM(8),
        STRING(9),
        BYTES(10),
        MESSAGE(11),
        FIXED32(12),
        SFIXED32(13),
        FIXED64(14),
        SFIXED64(15),
        FLOAT(16),
        DOUBLE(17);
        
        public static final Comparator<Datatype> ORDER_BY_NAME = null;
        private static final Map<String, Datatype> TYPES_BY_NAME = null;
        private final int value;

        static {
            ORDER_BY_NAME = new Comparator<Datatype>() {
                public final int compare(Datatype datatype, Datatype datatype2) {
                    return datatype.name().compareTo(datatype2.name());
                }
            };
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TYPES_BY_NAME = linkedHashMap;
            linkedHashMap.put("int32", INT32);
            TYPES_BY_NAME.put("int64", INT64);
            TYPES_BY_NAME.put("uint32", UINT32);
            TYPES_BY_NAME.put("uint64", UINT64);
            TYPES_BY_NAME.put("sint32", SINT32);
            TYPES_BY_NAME.put("sint64", SINT64);
            TYPES_BY_NAME.put("bool", BOOL);
            TYPES_BY_NAME.put("enum", ENUM);
            TYPES_BY_NAME.put("string", STRING);
            TYPES_BY_NAME.put("bytes", BYTES);
            TYPES_BY_NAME.put("message", MESSAGE);
            TYPES_BY_NAME.put("fixed32", FIXED32);
            TYPES_BY_NAME.put("sfixed32", SFIXED32);
            TYPES_BY_NAME.put("fixed64", FIXED64);
            TYPES_BY_NAME.put("sfixed64", SFIXED64);
            TYPES_BY_NAME.put("float", FLOAT);
            TYPES_BY_NAME.put("double", DOUBLE);
        }

        private Datatype(int i) {
            this.value = i;
        }

        public final int value() {
            return this.value;
        }

        public final WireType wireType() {
            switch (AnonymousClass1.$SwitchMap$com$squareup$wire$Message$Datatype[ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return WireType.VARINT;
                case 9:
                case 10:
                case 11:
                    return WireType.FIXED32;
                case 12:
                case 13:
                case 14:
                    return WireType.FIXED64;
                case 15:
                case 16:
                case 17:
                    return WireType.LENGTH_DELIMITED;
                default:
                    throw new AssertionError("No wiretype for datatype ".concat(String.valueOf(this)));
            }
        }

        public static Datatype of(String str) {
            return TYPES_BY_NAME.get(str);
        }
    }

    /* renamed from: com.squareup.wire.Message$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$wire$Message$Datatype;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.wire.Message$Datatype[] r0 = com.squareup.wire.Message.Datatype.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$squareup$wire$Message$Datatype = r0
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.INT32     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.INT64     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.UINT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.SINT64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.BOOL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.ENUM     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x006c }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.FIXED32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.FLOAT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.FIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x009c }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.SFIXED64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.DOUBLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.BYTES     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.Message.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Label {
        REQUIRED(32),
        OPTIONAL(64),
        REPEATED(128),
        PACKED(256);
        
        public static final Comparator<Label> ORDER_BY_NAME = null;
        private final int value;

        static {
            ORDER_BY_NAME = new Comparator<Label>() {
                public final int compare(Label label, Label label2) {
                    return label.name().compareTo(label2.name());
                }
            };
        }

        private Label(int i) {
            this.value = i;
        }

        public final int value() {
            return this.value;
        }

        public final boolean isRepeated() {
            return this == REPEATED || this == PACKED;
        }

        public final boolean isPacked() {
            return this == PACKED;
        }
    }

    public Message(Message message) {
        if (message != null && message.unknownFields != null) {
            this.unknownFields = new UnknownFieldMap(message.unknownFields);
        }
    }

    public Message() {
    }

    /* access modifiers changed from: protected */
    public void setBuilder(Builder builder) {
        if (builder.unknownFieldMap != null) {
            this.unknownFields = new UnknownFieldMap(builder.unknownFieldMap);
        }
    }

    /* access modifiers changed from: protected */
    public Collection<List<UnknownFieldMap.FieldValue>> unknownFields() {
        UnknownFieldMap unknownFieldMap = this.unknownFields;
        return unknownFieldMap == null ? Collections.emptySet() : unknownFieldMap.fieldMap.values();
    }

    protected static <T> List<T> copyOf(List<T> list) {
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    protected static <T> List<T> immutableCopyOf(List<T> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        if (list instanceof MessageAdapter.ImmutableList) {
            return list;
        }
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <E extends Enum & ProtoEnum> int intFromEnum(E e) {
        return WIRE.enumAdapter(e.getClass()).toInt((ProtoEnum) e);
    }

    public static <E extends Enum & ProtoEnum> E enumFromInt(Class<E> cls, int i) {
        return (Enum) WIRE.enumAdapter(cls).fromInt(i);
    }

    public byte[] toByteArray() {
        checkAvailability();
        return WIRE.messageAdapter(getClass()).toByteArray(this);
    }

    public void writeTo(byte[] bArr) {
        checkAvailability();
        writeTo(bArr, 0, bArr.length);
    }

    public void writeTo(byte[] bArr, int i, int i2) {
        checkAvailability();
        write(WireOutput.newInstance(bArr, i, i2));
    }

    private void write(WireOutput wireOutput) {
        try {
            WIRE.messageAdapter(getClass()).write(this, wireOutput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeUnknownFieldMap(WireOutput wireOutput) throws IOException {
        UnknownFieldMap unknownFieldMap = this.unknownFields;
        if (unknownFieldMap != null) {
            unknownFieldMap.write(wireOutput);
        }
    }

    public int getSerializedSize() {
        if (!this.haveCachedSerializedSize) {
            this.cachedSerializedSize = WIRE.messageAdapter(getClass()).getSerializedSize(this);
            this.haveCachedSerializedSize = true;
        }
        return this.cachedSerializedSize;
    }

    public int getUnknownFieldsSerializedSize() {
        UnknownFieldMap unknownFieldMap = this.unknownFields;
        if (unknownFieldMap == null) {
            return 0;
        }
        return unknownFieldMap.getSerializedSize();
    }

    /* access modifiers changed from: protected */
    public boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean equals(List<?> list, List<?> list2) {
        if (list != null && list.isEmpty()) {
            list = null;
        }
        if (list2 != null && list2.isEmpty()) {
            list2 = null;
        }
        if (list != list2) {
            return list != null && list.equals(list2);
        }
        return true;
    }

    public String toString() {
        return WIRE.messageAdapter(getClass()).toString(this);
    }

    public void addVarint(int i, long j) {
        try {
            ensureUnknownFieldMap().addVarint(i, Long.valueOf(j));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addFixed32(int i, int i2) {
        try {
            ensureUnknownFieldMap().addFixed32(i, Integer.valueOf(i2));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addFixed64(int i, long j) {
        try {
            ensureUnknownFieldMap().addFixed64(i, Long.valueOf(j));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addLengthDelimited(int i, printConnMonitorLog printconnmonitorlog) {
        try {
            ensureUnknownFieldMap().addLengthDelimited(i, printconnmonitorlog);
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public UnknownFieldMap ensureUnknownFieldMap() {
        if (this.unknownFields == null) {
            this.unknownFields = new UnknownFieldMap();
        }
        return this.unknownFields;
    }

    public void checkAvailability() {
        AvailabilityChecker<?> availabilityChecker = WIRE.availabilityChecker(getClass());
        availabilityChecker.checkRequiredFields(this);
        availabilityChecker.checkForNulls(this);
    }

    public void invalidCachedSerializedSize() {
        this.haveCachedSerializedSize = false;
    }

    public static abstract class Builder<T extends Message> {
        UnknownFieldMap unknownFieldMap;

        public abstract T build();

        public Builder() {
        }

        public Builder(Message message) {
            if (message != null && message.unknownFields != null) {
                this.unknownFieldMap = new UnknownFieldMap(message.unknownFields);
            }
        }

        public void addVarint(int i, long j) {
            try {
                ensureUnknownFieldMap().addVarint(i, Long.valueOf(j));
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public void addFixed32(int i, int i2) {
            try {
                ensureUnknownFieldMap().addFixed32(i, Integer.valueOf(i2));
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public void addFixed64(int i, long j) {
            try {
                ensureUnknownFieldMap().addFixed64(i, Long.valueOf(j));
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public void addLengthDelimited(int i, printConnMonitorLog printconnmonitorlog) {
            try {
                ensureUnknownFieldMap().addLengthDelimited(i, printconnmonitorlog);
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        /* access modifiers changed from: package-private */
        public UnknownFieldMap ensureUnknownFieldMap() {
            if (this.unknownFieldMap == null) {
                this.unknownFieldMap = new UnknownFieldMap();
            }
            return this.unknownFieldMap;
        }

        public void checkRequiredFields() {
            Message.WIRE.builderAdapter(getClass()).checkRequiredFields(this);
        }

        protected static <T> List<T> checkForNulls(List<T> list) {
            if (list != null && !list.isEmpty()) {
                int i = 0;
                int size = list.size();
                while (i < size) {
                    if (list.get(i) != null) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("Element at index ");
                        sb.append(i);
                        sb.append(" is null");
                        throw new NullPointerException(sb.toString());
                    }
                }
            }
            return list;
        }
    }
}
