package o;

import java.util.List;
import kotlin.Metadata;
import o.SnapshotBridgeExtension;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/contract/oauth/OauthGrantContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface dispatchOnPageScrolled {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0018\u0010\b\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0006H&J\u001c\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H&J&\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H&J\u001a\u0010\u001a\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lid/dana/contract/oauth/OauthGrantContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "dismissConfirmProgress", "", "onConfirmOauthScopeSuccess", "mobileAuthCode", "", "serverAuthCode", "onGetBindingBenefitsSuccess", "bindingBenefitModelList", "", "Lid/dana/oauth/model/BindingBenefitModel;", "onGetGnAuthCodeRiskFailed", "securityId", "onGetGnAuthCodeSuccess", "gnAuthCode", "state", "onGetOauthScopeSuccess", "oauthInitModel", "Lid/dana/oauth/model/OauthInitModel;", "onGetPhoneNumberSuccess", "phoneNumber", "onOauthError", "description", "errorCode", "errorPath", "showAlipayConnectBrand", "showAlipayConnectBrandConfig", "Lid/dana/domain/featureconfig/model/ShowAlipayConnectBrandConfig;", "showConfirmProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax extends parentColumns.getMax {
        void dismissConfirmProgress();

        void onConfirmOauthScopeSuccess(@Nullable String str, @Nullable String str2);

        void onGetBindingBenefitsSuccess(@Nullable List<SnapshotBridgeExtension.AnonymousClass2> list);

        void onGetGnAuthCodeRiskFailed(@Nullable String str);

        void onGetGnAuthCodeSuccess(@Nullable String str, @Nullable String str2);

        void onGetOauthScopeSuccess(@Nullable captureNXView capturenxview);

        void onGetPhoneNumberSuccess(@Nullable String str);

        void onOauthError(@Nullable String str, @Nullable String str2, @Nullable String str3);

        void showAlipayConnectBrand(@Nullable captureNXView capturenxview, @NotNull shouldOverrideUrlLoading shouldoverrideurlloading);

        void showConfirmProgress();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&JT\u0010\r\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H&J>\u0010\u0012\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&JJ\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H&JT\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lid/dana/contract/oauth/OauthGrantContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "confirmScope", "", "codeChallenge", "", "clientId", "scopeIds", "", "redirectUrl", "needMobileToken", "", "getBindingBenefits", "getGnAuthAgreement", "netAuthId", "subMerchantId", "signature", "refferingLink", "getOauthScope", "getPhoneNumber", "getShowAlipayConnectBrandConfig", "oauthInitModel", "Lid/dana/oauth/model/OauthInitModel;", "submitGnAuthApply", "state", "securityId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.setMin {
        void getMin();

        void getMin(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6);

        void setMax(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable String str5);

        void setMax(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, boolean z);

        void setMax(@Nullable String str, @Nullable List<String> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6);

        void setMax(@Nullable captureNXView capturenxview);

        void setMin();

        void setMin(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, boolean z);
    }
}
