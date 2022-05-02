package id.dana.domain.version;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ErrorConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 .2\u00020\u0001:\u0002./BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0013J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015¨\u00060"}, d2 = {"Lid/dana/domain/version/Version;", "", "latestMajorVersion", "", "latestMinorVersion", "latestPatchVersion", "validMajorVersion", "validMinorVersion", "validPatchVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLatestMajorVersion", "()Ljava/lang/String;", "setLatestMajorVersion", "(Ljava/lang/String;)V", "getLatestMinorVersion", "setLatestMinorVersion", "getLatestPatchVersion", "setLatestPatchVersion", "latestVersion", "Lid/dana/domain/version/SemanticVersion;", "getLatestVersion", "()Lid/dana/domain/version/SemanticVersion;", "getValidMajorVersion", "setValidMajorVersion", "getValidMinorVersion", "setValidMinorVersion", "getValidPatchVersion", "setValidPatchVersion", "validVersion", "getValidVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "getUpdateOption", "Lid/dana/domain/version/Version$UpdateOption;", "currentVersion", "hashCode", "", "toString", "Companion", "UpdateOption", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class Version {
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    @NotNull
    public static final String LATEST_MAJOR_VERSION = "latest_major_version";
    @NotNull
    public static final String LATEST_MINOR_VERSION = "latest_minor_version";
    @NotNull
    public static final String LATEST_PATCH_VERSION = "latest_patch_version";
    @NotNull
    public static final String VALID_MAJOR_VERSION = "valid_major_version";
    @NotNull
    public static final String VALID_MINOR_VERSION = "valid_minor_version";
    @NotNull
    public static final String VALID_PATCH_VERSION = "valid_patch_version";
    @Nullable
    public String latestMajorVersion;
    @Nullable
    public String latestMinorVersion;
    @Nullable
    public String latestPatchVersion;
    @Nullable
    public String validMajorVersion;
    @Nullable
    public String validMinorVersion;
    @Nullable
    public String validPatchVersion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/domain/version/Version$UpdateOption;", "", "(Ljava/lang/String;I)V", "FORCE", "OPTIONAL", "NO_UPDATES", "domain_release"}, k = 1, mv = {1, 4, 2})
    public enum UpdateOption {
        FORCE,
        OPTIONAL,
        NO_UPDATES
    }

    public Version() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Version copy$default(Version version, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = version.latestMajorVersion;
        }
        if ((i & 2) != 0) {
            str2 = version.latestMinorVersion;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = version.latestPatchVersion;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = version.validMajorVersion;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = version.validMinorVersion;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = version.validPatchVersion;
        }
        return version.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.latestMajorVersion;
    }

    @Nullable
    public final String component2() {
        return this.latestMinorVersion;
    }

    @Nullable
    public final String component3() {
        return this.latestPatchVersion;
    }

    @Nullable
    public final String component4() {
        return this.validMajorVersion;
    }

    @Nullable
    public final String component5() {
        return this.validMinorVersion;
    }

    @Nullable
    public final String component6() {
        return this.validPatchVersion;
    }

    @NotNull
    public final Version copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new Version(str, str2, str3, str4, str5, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return Intrinsics.areEqual((Object) this.latestMajorVersion, (Object) version.latestMajorVersion) && Intrinsics.areEqual((Object) this.latestMinorVersion, (Object) version.latestMinorVersion) && Intrinsics.areEqual((Object) this.latestPatchVersion, (Object) version.latestPatchVersion) && Intrinsics.areEqual((Object) this.validMajorVersion, (Object) version.validMajorVersion) && Intrinsics.areEqual((Object) this.validMinorVersion, (Object) version.validMinorVersion) && Intrinsics.areEqual((Object) this.validPatchVersion, (Object) version.validPatchVersion);
    }

    public final int hashCode() {
        String str = this.latestMajorVersion;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.latestMinorVersion;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.latestPatchVersion;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.validMajorVersion;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.validMinorVersion;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.validPatchVersion;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Version(latestMajorVersion=");
        sb.append(this.latestMajorVersion);
        sb.append(", latestMinorVersion=");
        sb.append(this.latestMinorVersion);
        sb.append(", latestPatchVersion=");
        sb.append(this.latestPatchVersion);
        sb.append(", validMajorVersion=");
        sb.append(this.validMajorVersion);
        sb.append(", validMinorVersion=");
        sb.append(this.validMinorVersion);
        sb.append(", validPatchVersion=");
        sb.append(this.validPatchVersion);
        sb.append(")");
        return sb.toString();
    }

    public Version(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.latestMajorVersion = str;
        this.latestMinorVersion = str2;
        this.latestPatchVersion = str3;
        this.validMajorVersion = str4;
        this.validMinorVersion = str5;
        this.validPatchVersion = str6;
    }

    @Nullable
    public final String getLatestMajorVersion() {
        return this.latestMajorVersion;
    }

    public final void setLatestMajorVersion(@Nullable String str) {
        this.latestMajorVersion = str;
    }

    @Nullable
    public final String getLatestMinorVersion() {
        return this.latestMinorVersion;
    }

    public final void setLatestMinorVersion(@Nullable String str) {
        this.latestMinorVersion = str;
    }

    @Nullable
    public final String getLatestPatchVersion() {
        return this.latestPatchVersion;
    }

    public final void setLatestPatchVersion(@Nullable String str) {
        this.latestPatchVersion = str;
    }

    @Nullable
    public final String getValidMajorVersion() {
        return this.validMajorVersion;
    }

    public final void setValidMajorVersion(@Nullable String str) {
        this.validMajorVersion = str;
    }

    @Nullable
    public final String getValidMinorVersion() {
        return this.validMinorVersion;
    }

    public final void setValidMinorVersion(@Nullable String str) {
        this.validMinorVersion = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Version(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.domain.version.Version.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getValidPatchVersion() {
        return this.validPatchVersion;
    }

    public final void setValidPatchVersion(@Nullable String str) {
        this.validPatchVersion = str;
    }

    @NotNull
    public final ErrorConstants getLatestVersion() {
        return new ErrorConstants(this.latestMajorVersion, this.latestMinorVersion, this.latestPatchVersion);
    }

    @NotNull
    public final ErrorConstants getValidVersion() {
        return new ErrorConstants(this.validMajorVersion, this.validMinorVersion, this.validPatchVersion);
    }

    @NotNull
    public final UpdateOption getUpdateOption(@NotNull ErrorConstants errorConstants) {
        Intrinsics.checkNotNullParameter(errorConstants, "currentVersion");
        if (errorConstants.compareTo(getValidVersion()) < 0) {
            return UpdateOption.FORCE;
        }
        if (errorConstants.compareTo(getLatestVersion()) < 0) {
            return UpdateOption.OPTIONAL;
        }
        return UpdateOption.NO_UPDATES;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/domain/version/Version$Companion;", "", "()V", "LATEST_MAJOR_VERSION", "", "LATEST_MINOR_VERSION", "LATEST_PATCH_VERSION", "VALID_MAJOR_VERSION", "VALID_MINOR_VERSION", "VALID_PATCH_VERSION", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
