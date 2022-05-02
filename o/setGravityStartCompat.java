package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015JP\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0019¨\u0006)"}, d2 = {"Lid/dana/data/autoroute/model/AutoRouteInitResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "autorouteFeatureEnable", "", "autorouteConfigEnable", "authenticationType", "", "authenticationSettingOptions", "", "Lid/dana/data/autoroute/model/AuthenticationTypeOptionResult;", "autorouteAssetExist", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "getAuthenticationSettingOptions", "()Ljava/util/List;", "setAuthenticationSettingOptions", "(Ljava/util/List;)V", "getAuthenticationType", "()Ljava/lang/String;", "setAuthenticationType", "(Ljava/lang/String;)V", "getAutorouteAssetExist", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAutorouteConfigEnable", "setAutorouteConfigEnable", "(Ljava/lang/Boolean;)V", "getAutorouteFeatureEnable", "setAutorouteFeatureEnable", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lid/dana/data/autoroute/model/AutoRouteInitResult;", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setGravityStartCompat extends BaseRpcResult {
    @Nullable
    private List<setLastWidth> authenticationSettingOptions;
    @Nullable
    private String authenticationType;
    @Nullable
    private final Boolean autorouteAssetExist;
    @Nullable
    private Boolean autorouteConfigEnable;
    @Nullable
    private Boolean autorouteFeatureEnable;

    public setGravityStartCompat() {
        this((Boolean) null, (Boolean) null, (String) null, (List) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setGravityStartCompat copy$default(setGravityStartCompat setgravitystartcompat, Boolean bool, Boolean bool2, String str, List<setLastWidth> list, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = setgravitystartcompat.autorouteFeatureEnable;
        }
        if ((i & 2) != 0) {
            bool2 = setgravitystartcompat.autorouteConfigEnable;
        }
        Boolean bool4 = bool2;
        if ((i & 4) != 0) {
            str = setgravitystartcompat.authenticationType;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list = setgravitystartcompat.authenticationSettingOptions;
        }
        List<setLastWidth> list2 = list;
        if ((i & 16) != 0) {
            bool3 = setgravitystartcompat.autorouteAssetExist;
        }
        return setgravitystartcompat.copy(bool, bool4, str2, list2, bool3);
    }

    @Nullable
    public final Boolean component1() {
        return this.autorouteFeatureEnable;
    }

    @Nullable
    public final Boolean component2() {
        return this.autorouteConfigEnable;
    }

    @Nullable
    public final String component3() {
        return this.authenticationType;
    }

    @Nullable
    public final List<setLastWidth> component4() {
        return this.authenticationSettingOptions;
    }

    @Nullable
    public final Boolean component5() {
        return this.autorouteAssetExist;
    }

    @NotNull
    public final setGravityStartCompat copy(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @Nullable List<setLastWidth> list, @Nullable Boolean bool3) {
        return new setGravityStartCompat(bool, bool2, str, list, bool3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setGravityStartCompat)) {
            return false;
        }
        setGravityStartCompat setgravitystartcompat = (setGravityStartCompat) obj;
        return Intrinsics.areEqual((Object) this.autorouteFeatureEnable, (Object) setgravitystartcompat.autorouteFeatureEnable) && Intrinsics.areEqual((Object) this.autorouteConfigEnable, (Object) setgravitystartcompat.autorouteConfigEnable) && Intrinsics.areEqual((Object) this.authenticationType, (Object) setgravitystartcompat.authenticationType) && Intrinsics.areEqual((Object) this.authenticationSettingOptions, (Object) setgravitystartcompat.authenticationSettingOptions) && Intrinsics.areEqual((Object) this.autorouteAssetExist, (Object) setgravitystartcompat.autorouteAssetExist);
    }

    public final int hashCode() {
        Boolean bool = this.autorouteFeatureEnable;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.autorouteConfigEnable;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str = this.authenticationType;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List<setLastWidth> list = this.authenticationSettingOptions;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool3 = this.autorouteAssetExist;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoRouteInitResult(autorouteFeatureEnable=");
        sb.append(this.autorouteFeatureEnable);
        sb.append(", autorouteConfigEnable=");
        sb.append(this.autorouteConfigEnable);
        sb.append(", authenticationType=");
        sb.append(this.authenticationType);
        sb.append(", authenticationSettingOptions=");
        sb.append(this.authenticationSettingOptions);
        sb.append(", autorouteAssetExist=");
        sb.append(this.autorouteAssetExist);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ setGravityStartCompat(java.lang.Boolean r4, java.lang.Boolean r5, java.lang.String r6, java.util.List r7, java.lang.Boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            r0 = 0
            if (r5 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r0 = r7
        L_0x001b:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setGravityStartCompat.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.List, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final Boolean getAutorouteFeatureEnable() {
        return this.autorouteFeatureEnable;
    }

    public final void setAutorouteFeatureEnable(@Nullable Boolean bool) {
        this.autorouteFeatureEnable = bool;
    }

    @Nullable
    public final Boolean getAutorouteConfigEnable() {
        return this.autorouteConfigEnable;
    }

    public final void setAutorouteConfigEnable(@Nullable Boolean bool) {
        this.autorouteConfigEnable = bool;
    }

    @Nullable
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    public final void setAuthenticationType(@Nullable String str) {
        this.authenticationType = str;
    }

    @Nullable
    public final List<setLastWidth> getAuthenticationSettingOptions() {
        return this.authenticationSettingOptions;
    }

    public final void setAuthenticationSettingOptions(@Nullable List<setLastWidth> list) {
        this.authenticationSettingOptions = list;
    }

    @Nullable
    public final Boolean getAutorouteAssetExist() {
        return this.autorouteAssetExist;
    }

    public setGravityStartCompat(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @Nullable List<setLastWidth> list, @Nullable Boolean bool3) {
        this.autorouteFeatureEnable = bool;
        this.autorouteConfigEnable = bool2;
        this.authenticationType = str;
        this.authenticationSettingOptions = list;
        this.autorouteAssetExist = bool3;
    }
}
