package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iap.ac.android.acs.plugin.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001%BM\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0011\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\r¨\u0006&"}, d2 = {"Lid/dana/domain/geocode/model/IndoSubdivisions;", "", "countryCode", "", "countryName", "proviceName", "cityName", "districtName", "subdistrictName", "isMockLocation", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCityName", "()Ljava/lang/String;", "getCountryCode", "getCountryName", "getDistrictName", "isEmpty", "()Z", "setMockLocation", "(Z)V", "isThereAnyEmptyField", "getProviceName", "getSubdistrictName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Builder", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class onUpdateResult {
    @NotNull
    private final String cityName;
    @NotNull
    private final String countryCode;
    @NotNull
    private final String countryName;
    @NotNull
    private final String districtName;
    private boolean isMockLocation;
    @NotNull
    private final String proviceName;
    @NotNull
    private final String subdistrictName;

    public static /* synthetic */ onUpdateResult copy$default(onUpdateResult onupdateresult, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onupdateresult.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = onupdateresult.countryName;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = onupdateresult.proviceName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = onupdateresult.cityName;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = onupdateresult.districtName;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = onupdateresult.subdistrictName;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            z = onupdateresult.isMockLocation;
        }
        return onupdateresult.copy(str, str7, str8, str9, str10, str11, z);
    }

    @NotNull
    public final String component1() {
        return this.countryCode;
    }

    @NotNull
    public final String component2() {
        return this.countryName;
    }

    @NotNull
    public final String component3() {
        return this.proviceName;
    }

    @NotNull
    public final String component4() {
        return this.cityName;
    }

    @NotNull
    public final String component5() {
        return this.districtName;
    }

    @NotNull
    public final String component6() {
        return this.subdistrictName;
    }

    public final boolean component7() {
        return this.isMockLocation;
    }

    @NotNull
    public final onUpdateResult copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        Intrinsics.checkNotNullParameter(str2, "countryName");
        Intrinsics.checkNotNullParameter(str3, "proviceName");
        Intrinsics.checkNotNullParameter(str4, Constants.KEY_CITY_NAME);
        Intrinsics.checkNotNullParameter(str5, "districtName");
        Intrinsics.checkNotNullParameter(str6, "subdistrictName");
        return new onUpdateResult(str, str2, str3, str4, str5, str6, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onUpdateResult)) {
            return false;
        }
        onUpdateResult onupdateresult = (onUpdateResult) obj;
        return Intrinsics.areEqual((Object) this.countryCode, (Object) onupdateresult.countryCode) && Intrinsics.areEqual((Object) this.countryName, (Object) onupdateresult.countryName) && Intrinsics.areEqual((Object) this.proviceName, (Object) onupdateresult.proviceName) && Intrinsics.areEqual((Object) this.cityName, (Object) onupdateresult.cityName) && Intrinsics.areEqual((Object) this.districtName, (Object) onupdateresult.districtName) && Intrinsics.areEqual((Object) this.subdistrictName, (Object) onupdateresult.subdistrictName) && this.isMockLocation == onupdateresult.isMockLocation;
    }

    public final int hashCode() {
        String str = this.countryCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.countryName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.proviceName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.cityName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.districtName;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.subdistrictName;
        if (str6 != null) {
            i = str6.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.isMockLocation;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IndoSubdivisions(countryCode=");
        sb.append(this.countryCode);
        sb.append(", countryName=");
        sb.append(this.countryName);
        sb.append(", proviceName=");
        sb.append(this.proviceName);
        sb.append(", cityName=");
        sb.append(this.cityName);
        sb.append(", districtName=");
        sb.append(this.districtName);
        sb.append(", subdistrictName=");
        sb.append(this.subdistrictName);
        sb.append(", isMockLocation=");
        sb.append(this.isMockLocation);
        sb.append(")");
        return sb.toString();
    }

    private onUpdateResult(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.countryCode = str;
        this.countryName = str2;
        this.proviceName = str3;
        this.cityName = str4;
        this.districtName = str5;
        this.subdistrictName = str6;
        this.isMockLocation = z;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    public final String getProviceName() {
        return this.proviceName;
    }

    @NotNull
    public final String getCityName() {
        return this.cityName;
    }

    @NotNull
    public final String getDistrictName() {
        return this.districtName;
    }

    @NotNull
    public final String getSubdistrictName() {
        return this.subdistrictName;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* synthetic */ onUpdateResult(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            java.lang.String r0 = ""
            if (r14 == 0) goto L_0x0008
            r14 = r0
            goto L_0x0009
        L_0x0008:
            r14 = r6
        L_0x0009:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r7
        L_0x0010:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r8
        L_0x0017:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x001d
            r3 = r0
            goto L_0x001e
        L_0x001d:
            r3 = r9
        L_0x001e:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x0024
            r4 = r0
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
            if (r6 == 0) goto L_0x0032
            r12 = 0
            r13 = 0
            goto L_0x0033
        L_0x0032:
            r13 = r12
        L_0x0033:
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
        throw new UnsupportedOperationException("Method not decompiled: o.onUpdateResult.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isMockLocation() {
        return this.isMockLocation;
    }

    public final void setMockLocation(boolean z) {
        this.isMockLocation = z;
    }

    public final boolean isEmpty() {
        if (this.countryCode.length() == 0) {
            if (this.countryName.length() == 0) {
                if (this.proviceName.length() == 0) {
                    if (this.cityName.length() == 0) {
                        if (this.districtName.length() == 0) {
                            if (this.subdistrictName.length() == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean isThereAnyEmptyField() {
        if (!(this.countryCode.length() == 0)) {
            if (!(this.countryName.length() == 0)) {
                if (!(this.proviceName.length() == 0)) {
                    if (!(this.cityName.length() == 0)) {
                        if (!(this.districtName.length() == 0)) {
                            return this.subdistrictName.length() == 0;
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/domain/geocode/model/IndoSubdivisions$Builder;", "", "()V", "indoSubdivisions", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "(Lid/dana/domain/geocode/model/IndoSubdivisions;)V", "cityName", "", "countryCode", "countryName", "districtName", "proviceName", "subdistrictName", "create", "withCityName", "withCountryCode", "withCountryName", "withDistrictName", "withProvinceName", "withSubdistrictName", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private String cityName = "";
        private String countryCode = "";
        private String countryName = "";
        private String districtName = "";
        private String proviceName = "";
        private String subdistrictName = "";

        public length() {
        }

        public length(@NotNull onUpdateResult onupdateresult) {
            Intrinsics.checkNotNullParameter(onupdateresult, "indoSubdivisions");
            boolean z = true;
            if (onupdateresult.getCountryCode().length() > 0) {
                withCountryCode(onupdateresult.getCountryCode());
            }
            if (onupdateresult.getCountryName().length() > 0) {
                withCountryName(onupdateresult.getCountryName());
            }
            if (onupdateresult.getProviceName().length() > 0) {
                withProvinceName(onupdateresult.getProviceName());
            }
            if (onupdateresult.getCityName().length() > 0) {
                withCityName(onupdateresult.getCityName());
            }
            if (onupdateresult.getDistrictName().length() > 0) {
                withDistrictName(onupdateresult.getDistrictName());
            }
            if (onupdateresult.getSubdistrictName().length() <= 0 ? false : z) {
                withSubdistrictName(onupdateresult.getSubdistrictName());
            }
        }

        @NotNull
        public final length withCountryCode(@Nullable String str) {
            length length = this;
            if (str != null) {
                length.countryCode = str;
            }
            return length;
        }

        @NotNull
        public final length withCountryName(@Nullable String str) {
            length length = this;
            if (str != null) {
                length.countryName = str;
            }
            return length;
        }

        @NotNull
        public final length withProvinceName(@Nullable String str) {
            length length = this;
            if (str != null) {
                length.proviceName = str;
            }
            return length;
        }

        @NotNull
        public final length withCityName(@Nullable String str) {
            length length = this;
            if (str != null) {
                length.cityName = str;
            }
            return length;
        }

        @NotNull
        public final length withDistrictName(@Nullable String str) {
            length length = this;
            if (str != null) {
                length.districtName = str;
            }
            return length;
        }

        @NotNull
        public final length withSubdistrictName(@Nullable String str) {
            length length = this;
            if (str != null) {
                length.subdistrictName = str;
            }
            return length;
        }

        @NotNull
        public final onUpdateResult create() {
            return new onUpdateResult(this.countryCode, this.countryName, this.proviceName, this.cityName, this.districtName, this.subdistrictName, false, 64, (DefaultConstructorMarker) null);
        }
    }
}
