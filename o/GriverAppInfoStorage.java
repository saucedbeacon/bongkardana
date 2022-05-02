package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jg\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u0006."}, d2 = {"Lid/dana/domain/promoquest/model/Quest;", "", "id", "", "name", "status", "description", "actionType", "isPriceStatus", "", "redirectType", "redirectValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getActionType", "()Ljava/lang/String;", "setActionType", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getId", "setId", "()Z", "setPriceStatus", "(Z)V", "getName", "setName", "getRedirectType", "setRedirectType", "getRedirectValue", "setRedirectValue", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverAppInfoStorage {
    @Nullable
    private String actionType;
    @Nullable
    private String description;
    @Nullable

    /* renamed from: id  reason: collision with root package name */
    private String f9910id;
    private boolean isPriceStatus;
    @Nullable
    private String name;
    @Nullable
    private String redirectType;
    @Nullable
    private String redirectValue;
    @Nullable
    private String status;

    public GriverAppInfoStorage() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GriverAppInfoStorage copy$default(GriverAppInfoStorage griverAppInfoStorage, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i, Object obj) {
        GriverAppInfoStorage griverAppInfoStorage2 = griverAppInfoStorage;
        int i2 = i;
        return griverAppInfoStorage.copy((i2 & 1) != 0 ? griverAppInfoStorage2.f9910id : str, (i2 & 2) != 0 ? griverAppInfoStorage2.name : str2, (i2 & 4) != 0 ? griverAppInfoStorage2.status : str3, (i2 & 8) != 0 ? griverAppInfoStorage2.description : str4, (i2 & 16) != 0 ? griverAppInfoStorage2.actionType : str5, (i2 & 32) != 0 ? griverAppInfoStorage2.isPriceStatus : z, (i2 & 64) != 0 ? griverAppInfoStorage2.redirectType : str6, (i2 & 128) != 0 ? griverAppInfoStorage2.redirectValue : str7);
    }

    @Nullable
    public final String component1() {
        return this.f9910id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.status;
    }

    @Nullable
    public final String component4() {
        return this.description;
    }

    @Nullable
    public final String component5() {
        return this.actionType;
    }

    public final boolean component6() {
        return this.isPriceStatus;
    }

    @Nullable
    public final String component7() {
        return this.redirectType;
    }

    @Nullable
    public final String component8() {
        return this.redirectValue;
    }

    @NotNull
    public final GriverAppInfoStorage copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z, @Nullable String str6, @Nullable String str7) {
        return new GriverAppInfoStorage(str, str2, str3, str4, str5, z, str6, str7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverAppInfoStorage)) {
            return false;
        }
        GriverAppInfoStorage griverAppInfoStorage = (GriverAppInfoStorage) obj;
        return Intrinsics.areEqual((Object) this.f9910id, (Object) griverAppInfoStorage.f9910id) && Intrinsics.areEqual((Object) this.name, (Object) griverAppInfoStorage.name) && Intrinsics.areEqual((Object) this.status, (Object) griverAppInfoStorage.status) && Intrinsics.areEqual((Object) this.description, (Object) griverAppInfoStorage.description) && Intrinsics.areEqual((Object) this.actionType, (Object) griverAppInfoStorage.actionType) && this.isPriceStatus == griverAppInfoStorage.isPriceStatus && Intrinsics.areEqual((Object) this.redirectType, (Object) griverAppInfoStorage.redirectType) && Intrinsics.areEqual((Object) this.redirectValue, (Object) griverAppInfoStorage.redirectValue);
    }

    public final int hashCode() {
        String str = this.f9910id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.status;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.actionType;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.isPriceStatus;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str6 = this.redirectType;
        int hashCode6 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.redirectValue;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Quest(id=");
        sb.append(this.f9910id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", actionType=");
        sb.append(this.actionType);
        sb.append(", isPriceStatus=");
        sb.append(this.isPriceStatus);
        sb.append(", redirectType=");
        sb.append(this.redirectType);
        sb.append(", redirectValue=");
        sb.append(this.redirectValue);
        sb.append(")");
        return sb.toString();
    }

    public GriverAppInfoStorage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z, @Nullable String str6, @Nullable String str7) {
        this.f9910id = str;
        this.name = str2;
        this.status = str3;
        this.description = str4;
        this.actionType = str5;
        this.isPriceStatus = z;
        this.redirectType = str6;
        this.redirectValue = str7;
    }

    @Nullable
    public final String getId() {
        return this.f9910id;
    }

    public final void setId(@Nullable String str) {
        this.f9910id = str;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    @Nullable
    public final String getActionType() {
        return this.actionType;
    }

    public final void setActionType(@Nullable String str) {
        this.actionType = str;
    }

    public final boolean isPriceStatus() {
        return this.isPriceStatus;
    }

    public final void setPriceStatus(boolean z) {
        this.isPriceStatus = z;
    }

    @Nullable
    public final String getRedirectType() {
        return this.redirectType;
    }

    public final void setRedirectType(@Nullable String str) {
        this.redirectType = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GriverAppInfoStorage(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = 0
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverAppInfoStorage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getRedirectValue() {
        return this.redirectValue;
    }

    public final void setRedirectValue(@Nullable String str) {
        this.redirectValue = str;
    }
}
