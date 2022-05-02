package id.dana.domain.authcode.interactor;

import id.dana.data.constant.BranchLinkConstant;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APWebChromeClient;
import o.SplashEntryInfo;
import o.TitleBarRightButtonView;
import o.enableBackButton;
import o.hasCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\f\rB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016J4\u0010\n\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00020\u0002 \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/authcode/interactor/GetAuthCode;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/authcode/AuthCodeResult;", "Lid/dana/domain/authcode/interactor/GetAuthCode$Params;", "repository", "Lid/dana/domain/authcode/repository/AuthRepository;", "(Lid/dana/domain/authcode/repository/AuthRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "fetchAuthCode", "kotlin.jvm.PlatformType", "MissingRequiredUserInfoException", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GetAuthCode extends APWebChromeClient<SplashEntryInfo, length> {
    private final enableBackButton repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GetAuthCode(@NotNull enableBackButton enablebackbutton) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(enablebackbutton, "repository");
        this.repository = enablebackbutton;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> buildUseCase(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> fetchAuthCode = fetchAuthCode(length2);
        Intrinsics.checkNotNullExpressionValue(fetchAuthCode, "fetchAuthCode(params)");
        return fetchAuthCode;
    }

    private final TitleBarRightButtonView.AnonymousClass1<SplashEntryInfo> fetchAuthCode(length length2) {
        return this.repository.getAuthCode(length2.getRedirectUrl$domain_release(), length2.getClientId$domain_release(), length2.getScopes$domain_release(), length2.getAgreed$domain_release(), length2.getRequestSourceType$domain_release(), length2.getSubMerchantId$domain_release(), length2.getFromMiniProgram$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0016"}, d2 = {"Lid/dana/domain/authcode/interactor/GetAuthCode$Params;", "", "redirectUrl", "", "clientId", "scopes", "agreed", "", "requestSourceType", "subMerchantId", "fromMiniProgram", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "getAgreed$domain_release", "()Z", "getClientId$domain_release", "()Ljava/lang/String;", "getFromMiniProgram$domain_release", "getRedirectUrl$domain_release", "getRequestSourceType$domain_release", "getScopes$domain_release", "getSubMerchantId$domain_release", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
        private final boolean agreed;
        @NotNull
        private final String clientId;
        private final boolean fromMiniProgram;
        @NotNull
        private final String redirectUrl;
        @Nullable
        private final String requestSourceType;
        @NotNull
        private final String scopes;
        @Nullable
        private final String subMerchantId;

        @JvmStatic
        @NotNull
        public static final length forGetAuthCode(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            return Companion.forGetAuthCode(str, str2, str3, z);
        }

        @JvmStatic
        @NotNull
        public static final length forGetAuthCodeMpAgreements(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4) {
            return Companion.forGetAuthCodeMpAgreements(str, str2, str3, z, str4);
        }

        @JvmStatic
        @NotNull
        public static final length forGetGnAuthCode(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4) {
            return Companion.forGetGnAuthCode(str, str2, str3, z, str4);
        }

        public length(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4, @Nullable String str5, boolean z2) {
            Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
            Intrinsics.checkNotNullParameter(str2, "clientId");
            Intrinsics.checkNotNullParameter(str3, BranchLinkConstant.OauthParams.SCOPES);
            this.redirectUrl = str;
            this.clientId = str2;
            this.scopes = str3;
            this.agreed = z;
            this.requestSourceType = str4;
            this.subMerchantId = str5;
            this.fromMiniProgram = z2;
        }

        @NotNull
        public final String getRedirectUrl$domain_release() {
            return this.redirectUrl;
        }

        @NotNull
        public final String getClientId$domain_release() {
            return this.clientId;
        }

        @NotNull
        public final String getScopes$domain_release() {
            return this.scopes;
        }

        public final boolean getAgreed$domain_release() {
            return this.agreed;
        }

        @Nullable
        public final String getRequestSourceType$domain_release() {
            return this.requestSourceType;
        }

        @Nullable
        public final String getSubMerchantId$domain_release() {
            return this.subMerchantId;
        }

        public final boolean getFromMiniProgram$domain_release() {
            return this.fromMiniProgram;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007J2\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007J2\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lid/dana/domain/authcode/interactor/GetAuthCode$Params$Companion;", "", "()V", "forGetAuthCode", "Lid/dana/domain/authcode/interactor/GetAuthCode$Params;", "redirectUrl", "", "clientId", "scopes", "agreed", "", "forGetAuthCodeMpAgreements", "subMerchantId", "forGetGnAuthCode", "requestSourceType", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final length forGetAuthCode(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
                Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
                Intrinsics.checkNotNullParameter(str2, "clientId");
                Intrinsics.checkNotNullParameter(str3, BranchLinkConstant.OauthParams.SCOPES);
                return new length(str, str2, str3, z, "", "", false);
            }

            @JvmStatic
            @NotNull
            public final length forGetAuthCodeMpAgreements(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4) {
                Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
                Intrinsics.checkNotNullParameter(str2, "clientId");
                Intrinsics.checkNotNullParameter(str3, BranchLinkConstant.OauthParams.SCOPES);
                return new length(str, str2, str3, z, "", str4, true);
            }

            @JvmStatic
            @NotNull
            public final length forGetGnAuthCode(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4) {
                Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
                Intrinsics.checkNotNullParameter(str2, "clientId");
                Intrinsics.checkNotNullParameter(str3, BranchLinkConstant.OauthParams.SCOPES);
                return new length(str, str2, str3, z, str4, "", false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lid/dana/domain/authcode/interactor/GetAuthCode$MissingRequiredUserInfoException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "missingUserData", "", "", "(Ljava/util/List;)V", "getMissingUserData", "()Ljava/util/List;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class MissingRequiredUserInfoException extends Exception {
        @NotNull
        private final List<String> missingUserData;

        public MissingRequiredUserInfoException(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "missingUserData");
            this.missingUserData = list;
        }

        @NotNull
        public final List<String> getMissingUserData() {
            return this.missingUserData;
        }
    }
}
