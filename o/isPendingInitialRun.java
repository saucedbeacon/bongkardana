package o;

import com.zoloz.wire.WireType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class isPendingInitialRun {
    public Map<Integer, List<setMin>> fieldMap;

    public static abstract class setMin {
        private final int tag;
        private final WireType wireType;

        public abstract int getSerializedSize();

        public abstract void write(int i, onAnimation onanimation) throws IOException;

        public setMin(int i, WireType wireType2) {
            this.tag = i;
            this.wireType = wireType2;
        }

        public static getMin varint(int i, Long l) {
            return new getMin(i, l);
        }

        public static getMax fixed32(int i, Integer num) {
            return new getMax(i, num);
        }

        public static setMax fixed64(int i, Long l) {
            return new setMax(i, l);
        }

        public static length lengthDelimited(int i, printConnMonitorLog printconnmonitorlog) {
            return new length(i, printconnmonitorlog);
        }

        public int getTag() {
            return this.tag;
        }

        public WireType getWireType() {
            return this.wireType;
        }

        public Integer getAsInteger() {
            throw new IllegalStateException();
        }

        public Long getAsLong() {
            throw new IllegalStateException();
        }

        public printConnMonitorLog getAsBytes() {
            throw new IllegalStateException();
        }
    }

    static final class getMin extends setMin {
        private final Long value;

        public getMin(int i, Long l) {
            super(i, WireType.VARINT);
            this.value = l;
        }

        public final int getSerializedSize() {
            return onAnimation.varint64Size(this.value.longValue());
        }

        public final void write(int i, onAnimation onanimation) throws IOException {
            onanimation.writeTag(i, WireType.VARINT);
            onanimation.writeVarint64(this.value.longValue());
        }

        public final Long getAsLong() {
            return this.value;
        }
    }

    static final class getMax extends setMin {
        private final Integer value;

        public final int getSerializedSize() {
            return 4;
        }

        public getMax(int i, Integer num) {
            super(i, WireType.FIXED32);
            this.value = num;
        }

        public final void write(int i, onAnimation onanimation) throws IOException {
            onanimation.writeTag(i, WireType.FIXED32);
            onanimation.writeFixed32(this.value.intValue());
        }

        public final Integer getAsInteger() {
            return this.value;
        }
    }

    static final class setMax extends setMin {
        private final Long value;

        public final int getSerializedSize() {
            return 8;
        }

        public setMax(int i, Long l) {
            super(i, WireType.FIXED64);
            this.value = l;
        }

        public final void write(int i, onAnimation onanimation) throws IOException {
            onanimation.writeTag(i, WireType.FIXED64);
            onanimation.writeFixed64(this.value.longValue());
        }

        public final Long getAsLong() {
            return this.value;
        }
    }

    static final class length extends setMin {
        private final printConnMonitorLog value;

        public length(int i, printConnMonitorLog printconnmonitorlog) {
            super(i, WireType.LENGTH_DELIMITED);
            this.value = printconnmonitorlog;
        }

        public final int getSerializedSize() {
            return onAnimation.varint32Size(this.value.size()) + this.value.size();
        }

        public final void write(int i, onAnimation onanimation) throws IOException {
            onanimation.writeTag(i, WireType.LENGTH_DELIMITED);
            onanimation.writeVarint32(this.value.size());
            onanimation.writeRawBytes(this.value.toByteArray());
        }

        public final printConnMonitorLog getAsBytes() {
            return this.value;
        }
    }

    public isPendingInitialRun() {
    }

    public isPendingInitialRun(isPendingInitialRun ispendinginitialrun) {
        if (ispendinginitialrun.fieldMap != null) {
            ensureFieldMap().putAll(ispendinginitialrun.fieldMap);
        }
    }

    public final void addVarint(int i, Long l) throws IOException {
        addElement(ensureFieldMap(), i, l, WireType.VARINT);
    }

    public final void addFixed32(int i, Integer num) throws IOException {
        addElement(ensureFieldMap(), i, num, WireType.FIXED32);
    }

    public final void addFixed64(int i, Long l) throws IOException {
        addElement(ensureFieldMap(), i, l, WireType.FIXED64);
    }

    public final void addLengthDelimited(int i, printConnMonitorLog printconnmonitorlog) throws IOException {
        addElement(ensureFieldMap(), i, printconnmonitorlog, WireType.LENGTH_DELIMITED);
    }

    private Map<Integer, List<setMin>> ensureFieldMap() {
        if (this.fieldMap == null) {
            this.fieldMap = new TreeMap();
        }
        return this.fieldMap;
    }

    private <T> void addElement(Map<Integer, List<setMin>> map, int i, T t, WireType wireType) throws IOException {
        setMin setmin;
        List list = map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        int i2 = AnonymousClass4.$SwitchMap$com$squareup$wire$WireType[wireType.ordinal()];
        if (i2 == 1) {
            setmin = setMin.varint(i, (Long) t);
        } else if (i2 == 2) {
            setmin = setMin.fixed32(i, (Integer) t);
        } else if (i2 == 3) {
            setmin = setMin.fixed64(i, (Long) t);
        } else if (i2 == 4) {
            setmin = setMin.lengthDelimited(i, (printConnMonitorLog) t);
        } else {
            throw new IllegalArgumentException("Unsupported wireType = ".concat(String.valueOf(wireType)));
        }
        if (list.size() <= 0 || ((setMin) list.get(0)).getWireType() == setmin.getWireType()) {
            list.add(setmin);
        } else {
            throw new IOException(String.format("Wire type %s differs from previous type %s for tag %s", new Object[]{setmin.getWireType(), ((setMin) list.get(0)).getWireType(), Integer.valueOf(i)}));
        }
    }

    /* renamed from: o.isPendingInitialRun$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$wire$WireType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.zoloz.wire.WireType[] r0 = com.zoloz.wire.WireType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$squareup$wire$WireType = r0
                com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.VARINT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.zoloz.wire.WireType r1 = com.zoloz.wire.WireType.LENGTH_DELIMITED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isPendingInitialRun.AnonymousClass4.<clinit>():void");
        }
    }

    public final int getSerializedSize() {
        Map<Integer, List<setMin>> map = this.fieldMap;
        int i = 0;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                for (setMin serializedSize : (List) next.getValue()) {
                    i = i + onAnimation.varintTagSize(((Integer) next.getKey()).intValue()) + serializedSize.getSerializedSize();
                }
            }
        }
        return i;
    }

    public final void write(onAnimation onanimation) throws IOException {
        Map<Integer, List<setMin>> map = this.fieldMap;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                int intValue = ((Integer) next.getKey()).intValue();
                for (setMin write : (List) next.getValue()) {
                    write.write(intValue, onanimation);
                }
            }
        }
    }
}
