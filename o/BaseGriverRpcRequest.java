package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/miniprogram/model/MiniProgramVersionRequirements;", "", "minAppVersion", "Lid/dana/domain/version/SemanticVersion;", "minOsVersion", "(Lid/dana/domain/version/SemanticVersion;Lid/dana/domain/version/SemanticVersion;)V", "getMinAppVersion", "()Lid/dana/domain/version/SemanticVersion;", "getMinOsVersion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class BaseGriverRpcRequest {
    @NotNull
    private final ErrorConstants minAppVersion;
    @NotNull
    private final ErrorConstants minOsVersion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0013\"\u0004\b\u0016\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006,"}, d2 = {"Lid/dana/domain/miniprogram/model/MiniProgram;", "", "appId", "", "title", "description", "logo", "isEnabled", "", "isFavorite", "lastOpen", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJ)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getDescription", "setDescription", "()Z", "setEnabled", "(Z)V", "setFavorite", "getLastOpen", "()J", "setLastOpen", "(J)V", "getLogo", "setLogo", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class DeviceInfo {
        @NotNull
        private String appId;
        @NotNull
        private String description;
        private boolean isEnabled;
        private boolean isFavorite;
        private long lastOpen;
        @NotNull
        private String logo;
        @NotNull
        private String title;

        public DeviceInfo() {
            this((String) null, (String) null, (String) null, (String) null, false, false, 0, 127, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, boolean z, boolean z2, long j, int i, Object obj) {
            DeviceInfo deviceInfo2 = deviceInfo;
            return deviceInfo.copy((i & 1) != 0 ? deviceInfo2.appId : str, (i & 2) != 0 ? deviceInfo2.title : str2, (i & 4) != 0 ? deviceInfo2.description : str3, (i & 8) != 0 ? deviceInfo2.logo : str4, (i & 16) != 0 ? deviceInfo2.isEnabled : z, (i & 32) != 0 ? deviceInfo2.isFavorite : z2, (i & 64) != 0 ? deviceInfo2.lastOpen : j);
        }

        @NotNull
        public final String component1() {
            return this.appId;
        }

        @NotNull
        public final String component2() {
            return this.title;
        }

        @NotNull
        public final String component3() {
            return this.description;
        }

        @NotNull
        public final String component4() {
            return this.logo;
        }

        public final boolean component5() {
            return this.isEnabled;
        }

        public final boolean component6() {
            return this.isFavorite;
        }

        public final long component7() {
            return this.lastOpen;
        }

        @NotNull
        public final DeviceInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, long j) {
            Intrinsics.checkNotNullParameter(str, "appId");
            Intrinsics.checkNotNullParameter(str2, "title");
            Intrinsics.checkNotNullParameter(str3, "description");
            Intrinsics.checkNotNullParameter(str4, "logo");
            return new DeviceInfo(str, str2, str3, str4, z, z2, j);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            return Intrinsics.areEqual((Object) this.appId, (Object) deviceInfo.appId) && Intrinsics.areEqual((Object) this.title, (Object) deviceInfo.title) && Intrinsics.areEqual((Object) this.description, (Object) deviceInfo.description) && Intrinsics.areEqual((Object) this.logo, (Object) deviceInfo.logo) && this.isEnabled == deviceInfo.isEnabled && this.isFavorite == deviceInfo.isFavorite && this.lastOpen == deviceInfo.lastOpen;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("MiniProgram(appId=");
            sb.append(this.appId);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", logo=");
            sb.append(this.logo);
            sb.append(", isEnabled=");
            sb.append(this.isEnabled);
            sb.append(", isFavorite=");
            sb.append(this.isFavorite);
            sb.append(", lastOpen=");
            sb.append(this.lastOpen);
            sb.append(")");
            return sb.toString();
        }

        public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, long j) {
            Intrinsics.checkNotNullParameter(str, "appId");
            Intrinsics.checkNotNullParameter(str2, "title");
            Intrinsics.checkNotNullParameter(str3, "description");
            Intrinsics.checkNotNullParameter(str4, "logo");
            this.appId = str;
            this.title = str2;
            this.description = str3;
            this.logo = str4;
            this.isEnabled = z;
            this.isFavorite = z2;
            this.lastOpen = j;
        }

        @NotNull
        public final String getAppId() {
            return this.appId;
        }

        public final void setAppId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.appId = str;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final void setTitle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.title = str;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final void setDescription(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.description = str;
        }

        @NotNull
        public final String getLogo() {
            return this.logo;
        }

        public final void setLogo(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.logo = str;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final void setEnabled(boolean z) {
            this.isEnabled = z;
        }

        public final boolean isFavorite() {
            return this.isFavorite;
        }

        public final void setFavorite(boolean z) {
            this.isFavorite = z;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ DeviceInfo(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11, long r12, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r5 = this;
                r15 = r14 & 1
                java.lang.String r0 = ""
                if (r15 == 0) goto L_0x0008
                r15 = r0
                goto L_0x0009
            L_0x0008:
                r15 = r6
            L_0x0009:
                r6 = r14 & 2
                if (r6 == 0) goto L_0x000f
                r1 = r0
                goto L_0x0010
            L_0x000f:
                r1 = r7
            L_0x0010:
                r6 = r14 & 4
                if (r6 == 0) goto L_0x0016
                r2 = r0
                goto L_0x0017
            L_0x0016:
                r2 = r8
            L_0x0017:
                r6 = r14 & 8
                if (r6 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r0 = r9
            L_0x001d:
                r6 = r14 & 16
                r7 = 0
                if (r6 == 0) goto L_0x0024
                r3 = 0
                goto L_0x0025
            L_0x0024:
                r3 = r10
            L_0x0025:
                r6 = r14 & 32
                if (r6 == 0) goto L_0x002b
                r4 = 0
                goto L_0x002c
            L_0x002b:
                r4 = r11
            L_0x002c:
                r6 = r14 & 64
                if (r6 == 0) goto L_0x0032
                r12 = 0
            L_0x0032:
                r13 = r12
                r6 = r5
                r7 = r15
                r8 = r1
                r9 = r2
                r10 = r0
                r11 = r3
                r12 = r4
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BaseGriverRpcRequest.DeviceInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final long getLastOpen() {
            return this.lastOpen;
        }

        public final void setLastOpen(long j) {
            this.lastOpen = j;
        }

        public final int hashCode() {
            String str = this.appId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.title;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.description;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.logo;
            if (str4 != null) {
                i = str4.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z = this.isEnabled;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.isFavorite;
            if (!z3) {
                z2 = z3;
            }
            return ((i3 + (z2 ? 1 : 0)) * 31) + Long.valueOf(this.lastOpen).hashCode();
        }
    }

    public BaseGriverRpcRequest(@NotNull ErrorConstants errorConstants, @NotNull ErrorConstants errorConstants2) {
        Intrinsics.checkNotNullParameter(errorConstants, "minAppVersion");
        Intrinsics.checkNotNullParameter(errorConstants2, "minOsVersion");
        this.minAppVersion = errorConstants;
        this.minOsVersion = errorConstants2;
    }

    @NotNull
    public final ErrorConstants getMinAppVersion() {
        return this.minAppVersion;
    }

    @NotNull
    public final ErrorConstants getMinOsVersion() {
        return this.minOsVersion;
    }
}
