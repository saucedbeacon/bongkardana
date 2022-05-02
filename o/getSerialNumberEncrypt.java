package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, d2 = {"Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "", "reserveEnabled", "", "pickupEnabled", "topupEnabled", "callEnabled", "directionEnabled", "homeShoppingEnabled", "shareEnabled", "(ZZZZZZZ)V", "getCallEnabled", "()Z", "getDirectionEnabled", "getHomeShoppingEnabled", "getPickupEnabled", "getReserveEnabled", "getShareEnabled", "getTopupEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getSerialNumberEncrypt {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private final boolean callEnabled;
    private final boolean directionEnabled;
    private final boolean homeShoppingEnabled;
    private final boolean pickupEnabled;
    private final boolean reserveEnabled;
    private final boolean shareEnabled;
    private final boolean topupEnabled;

    public getSerialNumberEncrypt() {
        this(false, false, false, false, false, false, false, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getSerialNumberEncrypt copy$default(getSerialNumberEncrypt getserialnumberencrypt, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getserialnumberencrypt.reserveEnabled;
        }
        if ((i & 2) != 0) {
            z2 = getserialnumberencrypt.pickupEnabled;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = getserialnumberencrypt.topupEnabled;
        }
        boolean z9 = z3;
        if ((i & 8) != 0) {
            z4 = getserialnumberencrypt.callEnabled;
        }
        boolean z10 = z4;
        if ((i & 16) != 0) {
            z5 = getserialnumberencrypt.directionEnabled;
        }
        boolean z11 = z5;
        if ((i & 32) != 0) {
            z6 = getserialnumberencrypt.homeShoppingEnabled;
        }
        boolean z12 = z6;
        if ((i & 64) != 0) {
            z7 = getserialnumberencrypt.shareEnabled;
        }
        return getserialnumberencrypt.copy(z, z8, z9, z10, z11, z12, z7);
    }

    public final boolean component1() {
        return this.reserveEnabled;
    }

    public final boolean component2() {
        return this.pickupEnabled;
    }

    public final boolean component3() {
        return this.topupEnabled;
    }

    public final boolean component4() {
        return this.callEnabled;
    }

    public final boolean component5() {
        return this.directionEnabled;
    }

    public final boolean component6() {
        return this.homeShoppingEnabled;
    }

    public final boolean component7() {
        return this.shareEnabled;
    }

    @NotNull
    public final getSerialNumberEncrypt copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return new getSerialNumberEncrypt(z, z2, z3, z4, z5, z6, z7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSerialNumberEncrypt)) {
            return false;
        }
        getSerialNumberEncrypt getserialnumberencrypt = (getSerialNumberEncrypt) obj;
        return this.reserveEnabled == getserialnumberencrypt.reserveEnabled && this.pickupEnabled == getserialnumberencrypt.pickupEnabled && this.topupEnabled == getserialnumberencrypt.topupEnabled && this.callEnabled == getserialnumberencrypt.callEnabled && this.directionEnabled == getserialnumberencrypt.directionEnabled && this.homeShoppingEnabled == getserialnumberencrypt.homeShoppingEnabled && this.shareEnabled == getserialnumberencrypt.shareEnabled;
    }

    public final int hashCode() {
        boolean z = this.reserveEnabled;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.pickupEnabled;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.topupEnabled;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.callEnabled;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.directionEnabled;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.homeShoppingEnabled;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.shareEnabled;
        if (!z8) {
            z2 = z8;
        }
        return i6 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantDetailConfig(reserveEnabled=");
        sb.append(this.reserveEnabled);
        sb.append(", pickupEnabled=");
        sb.append(this.pickupEnabled);
        sb.append(", topupEnabled=");
        sb.append(this.topupEnabled);
        sb.append(", callEnabled=");
        sb.append(this.callEnabled);
        sb.append(", directionEnabled=");
        sb.append(this.directionEnabled);
        sb.append(", homeShoppingEnabled=");
        sb.append(this.homeShoppingEnabled);
        sb.append(", shareEnabled=");
        sb.append(this.shareEnabled);
        sb.append(")");
        return sb.toString();
    }

    public getSerialNumberEncrypt(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.reserveEnabled = z;
        this.pickupEnabled = z2;
        this.topupEnabled = z3;
        this.callEnabled = z4;
        this.directionEnabled = z5;
        this.homeShoppingEnabled = z6;
        this.shareEnabled = z7;
    }

    public final boolean getReserveEnabled() {
        return this.reserveEnabled;
    }

    public final boolean getPickupEnabled() {
        return this.pickupEnabled;
    }

    public final boolean getTopupEnabled() {
        return this.topupEnabled;
    }

    public final boolean getCallEnabled() {
        return this.callEnabled;
    }

    public final boolean getDirectionEnabled() {
        return this.directionEnabled;
    }

    public final boolean getHomeShoppingEnabled() {
        return this.homeShoppingEnabled;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getSerialNumberEncrypt(boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0007
            r14 = 0
            goto L_0x0008
        L_0x0007:
            r14 = r6
        L_0x0008:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x000e
            r1 = 0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r13 & 4
            r7 = 1
            if (r6 == 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = r8
        L_0x0017:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x001d
            r3 = 1
            goto L_0x001e
        L_0x001d:
            r3 = r9
        L_0x001e:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = r10
        L_0x0025:
            r6 = r13 & 32
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = r11
        L_0x002b:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0031
            r13 = 1
            goto L_0x0032
        L_0x0031:
            r13 = r12
        L_0x0032:
            r6 = r5
            r7 = r14
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSerialNumberEncrypt.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean getShareEnabled() {
        return this.shareEnabled;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/domain/nearbyme/model/MerchantDetailConfig$Companion;", "", "()V", "getDefaultValue", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "fromNearbyRevamp", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final getSerialNumberEncrypt getDefaultValue(boolean z) {
            return new getSerialNumberEncrypt(false, false, false, false, z, false, false, 111, (DefaultConstructorMarker) null);
        }
    }
}
