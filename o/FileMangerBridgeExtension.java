package o;

import android.view.View;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.pay.view.BasePayView;
import java.util.List;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FileMangerBridgeExtension implements View.OnClickListener {
    private final BasePayView setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/paymentsetting/PaymentSettingContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.FileMangerBridgeExtension$1  reason: invalid class name */
    public interface AnonymousClass1 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J.\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&J*\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lid/dana/paymentsetting/PaymentSettingContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "checkPaymentSetting", "", "getAutoRouteInitialState", "getProfileSettingModel", "actionClick", "", "initPaymentAuth", "settingModel", "Lid/dana/domain/profilemenu/model/SettingModel;", "switchAutoRouteState", "autoroute", "", "authenticationType", "securityId", "validateData", "switchPaymentAuth", "authenticationStatus", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.FileMangerBridgeExtension$1$getMax */
        public interface getMax extends parentColumns.setMin {
            void getMin();

            void getMin(@NotNull String str, @NotNull SettingModel settingModel);

            void length();

            void length(@NotNull String str);

            void length(boolean z, @Nullable String str, @NotNull String str2, @NotNull SettingModel settingModel);

            void setMin(@Nullable String str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\"\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0018\u0010\u0014\u001a\u00020\u00032\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H&J\b\u0010\u0018\u001a\u00020\u0003H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u001d\u001a\u00020\u0003H&J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H&J\b\u0010\"\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lid/dana/paymentsetting/PaymentSettingContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onAlwaysAskPin", "", "actionClick", "", "settingModel", "Lid/dana/domain/profilemenu/model/SettingModel;", "success", "", "onAlwaysAskPinChallengePassword", "paymentSecuritySwitchModel", "Lid/dana/myprofile/model/PaymentSecuritySwitchModel;", "onCheckPaymentSettingRequired", "show", "onGetProfileSettingModelFail", "onGetProfileSettingModelSuccessForAutoRoute", "setting", "onGetProfileSettingModelSuccessForPin", "onInitAutoRouteDisabled", "onInitAutoRouteStateOff", "authenticationSettingOptions", "", "Lid/dana/domain/autoroute/model/AuthenticationTypeOption;", "onInitAutoRouteStateOn", "onInitPaymentAuthError", "onInitPaymentAuthSuccess", "paymentSecurityInitModel", "Lid/dana/myprofile/model/PaymentSecurityInitModel;", "onSwitchAutoRouteFailed", "onSwitchAutoRouteNeedRisk", "isChecked", "securityId", "pubKey", "onSwitchAutoRouteSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.FileMangerBridgeExtension$1$length */
        public interface length extends parentColumns.getMax {
            void getMax();

            void getMax(@NotNull SettingModel settingModel);

            void getMax(@NotNull String str);

            void getMin();

            void getMin(@NotNull SettingModel settingModel);

            void getMin(boolean z);

            void getMin(boolean z, @NotNull String str, @NotNull String str2);

            void length(@NotNull String str, @NotNull SettingModel settingModel, boolean z);

            void length(@Nullable showTime showtime, @NotNull String str, @NotNull SettingModel settingModel);

            void setMax();

            void setMax(@Nullable PopupWindowToast popupWindowToast, @NotNull String str, @NotNull SettingModel settingModel);

            void setMin();

            void setMin(@NotNull String str, @NotNull SettingModel settingModel);

            void setMin(@Nullable List<GriverCloseButtonStyleExtension> list);
        }
    }

    public FileMangerBridgeExtension(BasePayView basePayView) {
        this.setMax = basePayView;
    }

    public final void onClick(View view) {
        BasePayView.setMax(this.setMax);
    }
}
