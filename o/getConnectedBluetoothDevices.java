package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fHÆ\u0003J_\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fHÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lid/dana/domain/twilio/model/VerifySecurityInfo;", "", "identFailedCount", "", "maxFailedLimit", "lockedExpireMins", "success", "", "errorCode", "", "errorMessage", "extendInfo", "", "(IIIZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "getExtendInfo", "()Ljava/util/Map;", "getIdentFailedCount", "()I", "getLockedExpireMins", "getMaxFailedLimit", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getConnectedBluetoothDevices {
    @Nullable
    private final String errorCode;
    @Nullable
    private final String errorMessage;
    @NotNull
    private final Map<String, String> extendInfo;
    private final int identFailedCount;
    private final int lockedExpireMins;
    private final int maxFailedLimit;
    private final boolean success;

    public getConnectedBluetoothDevices() {
        this(0, 0, 0, false, (String) null, (String) null, (Map) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getConnectedBluetoothDevices copy$default(getConnectedBluetoothDevices getconnectedbluetoothdevices, int i, int i2, int i3, boolean z, String str, String str2, Map<String, String> map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = getconnectedbluetoothdevices.identFailedCount;
        }
        if ((i4 & 2) != 0) {
            i2 = getconnectedbluetoothdevices.maxFailedLimit;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = getconnectedbluetoothdevices.lockedExpireMins;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            z = getconnectedbluetoothdevices.success;
        }
        boolean z2 = z;
        if ((i4 & 16) != 0) {
            str = getconnectedbluetoothdevices.errorCode;
        }
        String str3 = str;
        if ((i4 & 32) != 0) {
            str2 = getconnectedbluetoothdevices.errorMessage;
        }
        String str4 = str2;
        if ((i4 & 64) != 0) {
            map = getconnectedbluetoothdevices.extendInfo;
        }
        return getconnectedbluetoothdevices.copy(i, i5, i6, z2, str3, str4, map);
    }

    public final int component1() {
        return this.identFailedCount;
    }

    public final int component2() {
        return this.maxFailedLimit;
    }

    public final int component3() {
        return this.lockedExpireMins;
    }

    public final boolean component4() {
        return this.success;
    }

    @Nullable
    public final String component5() {
        return this.errorCode;
    }

    @Nullable
    public final String component6() {
        return this.errorMessage;
    }

    @NotNull
    public final Map<String, String> component7() {
        return this.extendInfo;
    }

    @NotNull
    public final getConnectedBluetoothDevices copy(int i, int i2, int i3, boolean z, @Nullable String str, @Nullable String str2, @NotNull Map<String, String> map) {
        Map<String, String> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "extendInfo");
        return new getConnectedBluetoothDevices(i, i2, i3, z, str, str2, map2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getConnectedBluetoothDevices)) {
            return false;
        }
        getConnectedBluetoothDevices getconnectedbluetoothdevices = (getConnectedBluetoothDevices) obj;
        return this.identFailedCount == getconnectedbluetoothdevices.identFailedCount && this.maxFailedLimit == getconnectedbluetoothdevices.maxFailedLimit && this.lockedExpireMins == getconnectedbluetoothdevices.lockedExpireMins && this.success == getconnectedbluetoothdevices.success && Intrinsics.areEqual((Object) this.errorCode, (Object) getconnectedbluetoothdevices.errorCode) && Intrinsics.areEqual((Object) this.errorMessage, (Object) getconnectedbluetoothdevices.errorMessage) && Intrinsics.areEqual((Object) this.extendInfo, (Object) getconnectedbluetoothdevices.extendInfo);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifySecurityInfo(identFailedCount=");
        sb.append(this.identFailedCount);
        sb.append(", maxFailedLimit=");
        sb.append(this.maxFailedLimit);
        sb.append(", lockedExpireMins=");
        sb.append(this.lockedExpireMins);
        sb.append(", success=");
        sb.append(this.success);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(")");
        return sb.toString();
    }

    public getConnectedBluetoothDevices(int i, int i2, int i3, boolean z, @Nullable String str, @Nullable String str2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        this.identFailedCount = i;
        this.maxFailedLimit = i2;
        this.lockedExpireMins = i3;
        this.success = z;
        this.errorCode = str;
        this.errorMessage = str2;
        this.extendInfo = map;
    }

    public final int getIdentFailedCount() {
        return this.identFailedCount;
    }

    public final int getMaxFailedLimit() {
        return this.maxFailedLimit;
    }

    public final int getLockedExpireMins() {
        return this.lockedExpireMins;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getConnectedBluetoothDevices(int r6, int r7, int r8, boolean r9, java.lang.String r10, java.lang.String r11, java.util.Map r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
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
            if (r6 == 0) goto L_0x0015
            r2 = 0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r9
        L_0x001c:
            r6 = r13 & 16
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0024
            r3 = r7
            goto L_0x0025
        L_0x0024:
            r3 = r10
        L_0x0025:
            r6 = r13 & 32
            if (r6 == 0) goto L_0x002b
            r4 = r7
            goto L_0x002c
        L_0x002b:
            r4 = r11
        L_0x002c:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0034
            java.util.Map r12 = kotlin.collections.MapsKt.emptyMap()
        L_0x0034:
            r13 = r12
            r6 = r5
            r7 = r14
            r8 = r1
            r9 = r2
            r10 = r0
            r11 = r3
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getConnectedBluetoothDevices.<init>(int, int, int, boolean, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    public final int hashCode() {
        int hashCode = ((((Integer.valueOf(this.identFailedCount).hashCode() * 31) + Integer.valueOf(this.maxFailedLimit).hashCode()) * 31) + Integer.valueOf(this.lockedExpireMins).hashCode()) * 31;
        boolean z = this.success;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.errorCode;
        int i2 = 0;
        int hashCode2 = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.errorMessage;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.extendInfo;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode3 + i2;
    }
}
