package o;

import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.twilio.trusteddevice.TrustedDeviceModule;
import kotlin.Metadata;
import o.PickerBridgeExtension;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

public final class MultilevelSelectActivity implements getAdapterPosition<PickerBridgeExtension.AnonymousClass4.setMin> {
    private final TrustedDeviceModule getMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/twilio/twiliodialog/TwilioDialogContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.MultilevelSelectActivity$1  reason: invalid class name */
    public interface AnonymousClass1 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/twilio/twiliodialog/TwilioDialogContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "checkTwilioEnrollmentFeature", "", "getProfileSettingModel", "saveDontShowAgain", "neverShow", "", "saveMaybeLaterClick", "saveTwilioFailedTimestamp", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.MultilevelSelectActivity$1$length */
        public interface length extends parentColumns.setMin {
            void getMax();

            void getMin();

            void length();

            void setMin();

            void setMin(boolean z);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/twilio/twiliodialog/TwilioDialogContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetProfileSettingModelFail", "", "onGetProfileSettingModelSuccess", "setting", "Lid/dana/domain/profilemenu/model/SettingModel;", "onShowTwilioDialog", "showCheckBox", "", "securityId", "", "onSkipTwilioDialog", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.MultilevelSelectActivity$1$setMin */
        public interface setMin extends parentColumns.getMax {
            void getMax(@NotNull SettingModel settingModel);

            void getMax(boolean z, @NotNull String str);

            void setMax();
        }
    }

    private MultilevelSelectActivity(TrustedDeviceModule trustedDeviceModule) {
        this.getMin = trustedDeviceModule;
    }

    public static MultilevelSelectActivity length(TrustedDeviceModule trustedDeviceModule) {
        return new MultilevelSelectActivity(trustedDeviceModule);
    }

    public final /* synthetic */ Object get() {
        PickerBridgeExtension.AnonymousClass4.setMin max = this.getMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
