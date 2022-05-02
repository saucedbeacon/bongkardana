package o;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.common.base.Ascii;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Layer {
    public int getMin = 0;
    public ByteBuffer length;
    public final byte[] setMax = new byte[256];
    public setVerticalGap setMin;

    public final class LayerType implements getAdapterPosition<ShapeStroke$LineJoinType> {

        static final class getMin {
            /* access modifiers changed from: private */
            public static final LayerType setMax = new LayerType();
        }

        public final ShapeStroke$LineJoinType get() {
            return newInstance();
        }

        public static LayerType create() {
            return getMin.setMax;
        }

        public static ShapeStroke$LineJoinType newInstance() {
            return new ShapeStroke$LineJoinType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001b"}, d2 = {"Lid/dana/data/config/model/Bluetooth;", "", "address", "", "bondState", "", "isBounded", "", "isBounding", "type", "(Ljava/lang/String;IZZI)V", "getAddress", "()Ljava/lang/String;", "getBondState", "()I", "()Z", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class MatteType {
        @NotNull
        private final String address;
        private final int bondState;
        private final boolean isBounded;
        private final boolean isBounding;
        private final int type;

        public static /* synthetic */ MatteType copy$default(MatteType matteType, String str, int i, boolean z, boolean z2, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = matteType.address;
            }
            if ((i3 & 2) != 0) {
                i = matteType.bondState;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                z = matteType.isBounded;
            }
            boolean z3 = z;
            if ((i3 & 8) != 0) {
                z2 = matteType.isBounding;
            }
            boolean z4 = z2;
            if ((i3 & 16) != 0) {
                i2 = matteType.type;
            }
            return matteType.copy(str, i4, z3, z4, i2);
        }

        @NotNull
        public final String component1() {
            return this.address;
        }

        public final int component2() {
            return this.bondState;
        }

        public final boolean component3() {
            return this.isBounded;
        }

        public final boolean component4() {
            return this.isBounding;
        }

        public final int component5() {
            return this.type;
        }

        @NotNull
        public final MatteType copy(@JSONField(name = "address") @NotNull String str, @JSONField(name = "bondState") int i, @JSONField(name = "isBounded") boolean z, @JSONField(name = "isBounding") boolean z2, @JSONField(name = "type") int i2) {
            Intrinsics.checkNotNullParameter(str, "address");
            return new MatteType(str, i, z, z2, i2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MatteType)) {
                return false;
            }
            MatteType matteType = (MatteType) obj;
            return Intrinsics.areEqual((Object) this.address, (Object) matteType.address) && this.bondState == matteType.bondState && this.isBounded == matteType.isBounded && this.isBounding == matteType.isBounding && this.type == matteType.type;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Bluetooth(address=");
            sb.append(this.address);
            sb.append(", bondState=");
            sb.append(this.bondState);
            sb.append(", isBounded=");
            sb.append(this.isBounded);
            sb.append(", isBounding=");
            sb.append(this.isBounding);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(")");
            return sb.toString();
        }

        public MatteType(@JSONField(name = "address") @NotNull String str, @JSONField(name = "bondState") int i, @JSONField(name = "isBounded") boolean z, @JSONField(name = "isBounding") boolean z2, @JSONField(name = "type") int i2) {
            Intrinsics.checkNotNullParameter(str, "address");
            this.address = str;
            this.bondState = i;
            this.isBounded = z;
            this.isBounding = z2;
            this.type = i2;
        }

        @NotNull
        public final String getAddress() {
            return this.address;
        }

        public final int getBondState() {
            return this.bondState;
        }

        public final boolean isBounded() {
            return this.isBounded;
        }

        public final boolean isBounding() {
            return this.isBounding;
        }

        public final int getType() {
            return this.type;
        }

        public final int hashCode() {
            String str = this.address;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.bondState).hashCode()) * 31;
            boolean z = this.isBounded;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.isBounding;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + Integer.valueOf(this.type).hashCode();
        }
    }

    public final void setMin() {
        boolean z = false;
        while (!z && !setMax() && this.setMin.length <= Integer.MAX_VALUE) {
            int floatRange = toFloatRange();
            if (floatRange == 33) {
                int floatRange2 = toFloatRange();
                if (floatRange2 == 1) {
                    getMax();
                } else if (floatRange2 == 249) {
                    this.setMin.setMax = new setRotation();
                    toFloatRange();
                    int floatRange3 = toFloatRange();
                    this.setMin.setMax.toIntRange = (floatRange3 & 28) >> 2;
                    if (this.setMin.setMax.toIntRange == 0) {
                        this.setMin.setMax.toIntRange = 1;
                    }
                    this.setMin.setMax.equals = (floatRange3 & 1) != 0;
                    short s = this.length.getShort();
                    if (s < 2) {
                        s = 10;
                    }
                    this.setMin.setMax.IsOverlapping = s * 10;
                    this.setMin.setMax.toFloatRange = toFloatRange();
                    toFloatRange();
                } else if (floatRange2 == 254) {
                    getMax();
                } else if (floatRange2 != 255) {
                    getMax();
                } else {
                    IsOverlapping();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < 11; i++) {
                        sb.append((char) this.setMax[i]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        getMin();
                    } else {
                        getMax();
                    }
                }
            } else if (floatRange == 44) {
                if (this.setMin.setMax == null) {
                    this.setMin.setMax = new setRotation();
                }
                this.setMin.setMax.getMax = this.length.getShort();
                this.setMin.setMax.setMin = this.length.getShort();
                this.setMin.setMax.length = this.length.getShort();
                this.setMin.setMax.setMax = this.length.getShort();
                int floatRange4 = toFloatRange();
                boolean z2 = (floatRange4 & 128) != 0;
                int pow = (int) Math.pow(2.0d, (double) ((floatRange4 & 7) + 1));
                this.setMin.setMax.getMin = (floatRange4 & 64) != 0;
                if (z2) {
                    this.setMin.setMax.toDoubleRange = getMax(pow);
                } else {
                    this.setMin.setMax.toDoubleRange = null;
                }
                this.setMin.setMax.isInside = this.length.position();
                toFloatRange();
                getMax();
                if (!setMax()) {
                    this.setMin.length++;
                    this.setMin.getMax.add(this.setMin.setMax);
                }
            } else if (floatRange != 59) {
                this.setMin.getMin = 1;
            } else {
                z = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMin() {
        /*
            r3 = this;
        L_0x0000:
            r3.IsOverlapping()
            byte[] r0 = r3.setMax
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            o.setVerticalGap r2 = r3.setMin
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.toDoubleRange = r0
        L_0x001b:
            int r0 = r3.getMin
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.setMax()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Layer.getMin():void");
    }

    public final void length() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < 6; i++) {
            sb.append((char) toFloatRange());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.setMin.getMin = 1;
            return;
        }
        this.setMin.isInside = this.length.getShort();
        this.setMin.toIntRange = this.length.getShort();
        int floatRange = toFloatRange();
        setVerticalGap setverticalgap = this.setMin;
        if ((floatRange & 128) != 0) {
            z = true;
        }
        setverticalgap.toFloatRange = z;
        this.setMin.equals = (int) Math.pow(2.0d, (double) ((floatRange & 7) + 1));
        this.setMin.IsOverlapping = toFloatRange();
        this.setMin.hashCode = toFloatRange();
        if (this.setMin.toFloatRange && !setMax()) {
            setVerticalGap setverticalgap2 = this.setMin;
            setverticalgap2.setMin = getMax(setverticalgap2.equals);
            setVerticalGap setverticalgap3 = this.setMin;
            setverticalgap3.toString = setverticalgap3.setMin[this.setMin.IsOverlapping];
        }
    }

    @androidx.annotation.Nullable
    private int[] getMax(int i) {
        int[] iArr;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.length.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((bArr[i3] & 255) << Ascii.DLE) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException unused) {
                    this.setMin.getMin = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException unused2) {
            iArr = null;
            this.setMin.getMin = 1;
            return iArr;
        }
        return iArr;
    }

    private void getMax() {
        int floatRange;
        do {
            floatRange = toFloatRange();
            this.length.position(Math.min(this.length.position() + floatRange, this.length.limit()));
        } while (floatRange > 0);
    }

    private void IsOverlapping() {
        int floatRange = toFloatRange();
        this.getMin = floatRange;
        if (floatRange > 0) {
            int i = 0;
            while (i < this.getMin) {
                try {
                    int i2 = this.getMin - i;
                    this.length.get(this.setMax, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    this.setMin.getMin = 1;
                    return;
                }
            }
        }
    }

    private int toFloatRange() {
        try {
            return this.length.get() & 255;
        } catch (Exception unused) {
            this.setMin.getMin = 1;
            return 0;
        }
    }

    public final boolean setMax() {
        return this.setMin.getMin != 0;
    }
}
