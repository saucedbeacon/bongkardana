package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB#\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/oauth/interactor/GnAuthApply;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/authcode/AuthCodeResult;", "Lid/dana/domain/oauth/interactor/GnAuthApply$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "oauthRepository", "Lid/dana/domain/oauth/repository/OauthRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/oauth/repository/OauthRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isDomainMatch extends parseFailed<SplashEntryInfo, getMin> {
    private final getMD5Byte oauthRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isDomainMatch(@Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme, @NotNull getMD5Byte getmd5byte) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(getmd5byte, "oauthRepository");
        this.oauthRepository = getmd5byte;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> buildUseCaseObservable(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> submitGnAuthApply = this.oauthRepository.submitGnAuthApply(getmin.getState(), getmin.getClientId(), getmin.getScopes(), getmin.getRedirectUrl(), getmin.getNetAuthId(), getmin.getSubMerchantId(), getmin.getSecurityId());
        Intrinsics.checkNotNullExpressionValue(submitGnAuthApply, "oauthRepository.submitGn…antId, params.securityId)");
        return submitGnAuthApply;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006,"}, d2 = {"Lid/dana/domain/oauth/interactor/GnAuthApply$Params;", "", "state", "", "clientId", "scopes", "", "redirectUrl", "netAuthId", "subMerchantId", "securityId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "getNetAuthId", "setNetAuthId", "getRedirectUrl", "setRedirectUrl", "getScopes", "()Ljava/util/List;", "setScopes", "(Ljava/util/List;)V", "getSecurityId", "setSecurityId", "getState", "setState", "getSubMerchantId", "setSubMerchantId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @Nullable
        private String clientId;
        @Nullable
        private String netAuthId;
        @Nullable
        private String redirectUrl;
        @Nullable
        private List<String> scopes;
        @Nullable
        private String securityId;
        @Nullable
        private String state;
        @Nullable
        private String subMerchantId;

        public static /* synthetic */ getMin copy$default(getMin getmin, String str, String str2, List<String> list, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmin.state;
            }
            if ((i & 2) != 0) {
                str2 = getmin.clientId;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                list = getmin.scopes;
            }
            List<String> list2 = list;
            if ((i & 8) != 0) {
                str3 = getmin.redirectUrl;
            }
            String str8 = str3;
            if ((i & 16) != 0) {
                str4 = getmin.netAuthId;
            }
            String str9 = str4;
            if ((i & 32) != 0) {
                str5 = getmin.subMerchantId;
            }
            String str10 = str5;
            if ((i & 64) != 0) {
                str6 = getmin.securityId;
            }
            return getmin.copy(str, str7, list2, str8, str9, str10, str6);
        }

        @Nullable
        public final String component1() {
            return this.state;
        }

        @Nullable
        public final String component2() {
            return this.clientId;
        }

        @Nullable
        public final List<String> component3() {
            return this.scopes;
        }

        @Nullable
        public final String component4() {
            return this.redirectUrl;
        }

        @Nullable
        public final String component5() {
            return this.netAuthId;
        }

        @Nullable
        public final String component6() {
            return this.subMerchantId;
        }

        @Nullable
        public final String component7() {
            return this.securityId;
        }

        @NotNull
        public final getMin copy(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            return new getMin(str, str2, list, str3, str4, str5, str6);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Intrinsics.areEqual((Object) this.state, (Object) getmin.state) && Intrinsics.areEqual((Object) this.clientId, (Object) getmin.clientId) && Intrinsics.areEqual((Object) this.scopes, (Object) getmin.scopes) && Intrinsics.areEqual((Object) this.redirectUrl, (Object) getmin.redirectUrl) && Intrinsics.areEqual((Object) this.netAuthId, (Object) getmin.netAuthId) && Intrinsics.areEqual((Object) this.subMerchantId, (Object) getmin.subMerchantId) && Intrinsics.areEqual((Object) this.securityId, (Object) getmin.securityId);
        }

        public final int hashCode() {
            String str = this.state;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.clientId;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<String> list = this.scopes;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            String str3 = this.redirectUrl;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.netAuthId;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.subMerchantId;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.securityId;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return hashCode6 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(state=");
            sb.append(this.state);
            sb.append(", clientId=");
            sb.append(this.clientId);
            sb.append(", scopes=");
            sb.append(this.scopes);
            sb.append(", redirectUrl=");
            sb.append(this.redirectUrl);
            sb.append(", netAuthId=");
            sb.append(this.netAuthId);
            sb.append(", subMerchantId=");
            sb.append(this.subMerchantId);
            sb.append(", securityId=");
            sb.append(this.securityId);
            sb.append(")");
            return sb.toString();
        }

        public getMin(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.state = str;
            this.clientId = str2;
            this.scopes = list;
            this.redirectUrl = str3;
            this.netAuthId = str4;
            this.subMerchantId = str5;
            this.securityId = str6;
        }

        @Nullable
        public final String getState() {
            return this.state;
        }

        public final void setState(@Nullable String str) {
            this.state = str;
        }

        @Nullable
        public final String getClientId() {
            return this.clientId;
        }

        public final void setClientId(@Nullable String str) {
            this.clientId = str;
        }

        @Nullable
        public final List<String> getScopes() {
            return this.scopes;
        }

        public final void setScopes(@Nullable List<String> list) {
            this.scopes = list;
        }

        @Nullable
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final void setRedirectUrl(@Nullable String str) {
            this.redirectUrl = str;
        }

        @Nullable
        public final String getNetAuthId() {
            return this.netAuthId;
        }

        public final void setNetAuthId(@Nullable String str) {
            this.netAuthId = str;
        }

        @Nullable
        public final String getSubMerchantId() {
            return this.subMerchantId;
        }

        public final void setSubMerchantId(@Nullable String str) {
            this.subMerchantId = str;
        }

        @Nullable
        public final String getSecurityId() {
            return this.securityId;
        }

        public final void setSecurityId(@Nullable String str) {
            this.securityId = str;
        }
    }
}
