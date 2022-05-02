package o;

import android.content.Intent;
import dagger.internal.InjectedFieldSignature;
import id.dana.base.BaseKey;
import id.dana.base.KeyBaseActivity;
import id.dana.home.HomeTabActivity;
import id.dana.onboarding.confirmpin.ConfirmPinFragment;
import id.dana.onboarding.createpin.CreatePinKey;
import id.dana.onboarding.verify.VerifyNumberKey;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ToolUtils;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ2\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eJ*\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u0014\u001a\u00020\nJ\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\n¨\u0006\u001b"}, d2 = {"Lid/dana/onboarding/OnboardingNavigationManager;", "Lid/dana/base/OnActivityNavigationManager;", "keyBaseActivity", "Lid/dana/base/KeyBaseActivity;", "backstackDelegate", "Lcom/zhuinden/simplestack/BackstackDelegate;", "menuItemFacade", "Lid/dana/base/MenuItemFacade;", "(Lid/dana/base/KeyBaseActivity;Lcom/zhuinden/simplestack/BackstackDelegate;Lid/dana/base/MenuItemFacade;)V", "backToVerify", "", "completeOnboarding", "goToConfirmPin", "phoneNumber", "", "nickname", "avatarUri", "pin", "referralCode", "goToCreatePin", "goToPageReferralError", "goToProfile", "refferalCode", "goToReferral", "prizeName", "goToWelcomePage", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SensorBridgeExtension extends ProvidedTypeConverter {
    @NotNull
    public static final getMax isInside = new getMax((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/onboarding/confirmpin/ConfirmPinContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.SensorBridgeExtension$4  reason: invalid class name */
    public interface AnonymousClass4 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/onboarding/confirmpin/ConfirmPinContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onRegisterSuccess", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.SensorBridgeExtension$4$getMax */
        public interface getMax extends parentColumns.getMax {
            void getMin();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/onboarding/confirmpin/ConfirmPinContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "register", "", "phoneNumber", "", "nickname", "avatarFile", "Ljava/io/File;", "pin", "referralCode", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.SensorBridgeExtension$4$length */
        public interface length extends parentColumns.setMin {
            void length(@Nullable String str, @Nullable String str2, @Nullable File file, @Nullable String str3, @Nullable String str4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SensorBridgeExtension(@NotNull KeyBaseActivity<?> keyBaseActivity, @NotNull getSelectionModeForAccessibility getselectionmodeforaccessibility, @NotNull parentColumn parentcolumn) {
        super(keyBaseActivity, getselectionmodeforaccessibility, parentcolumn);
        Intrinsics.checkNotNullParameter(keyBaseActivity, "keyBaseActivity");
        Intrinsics.checkNotNullParameter(getselectionmodeforaccessibility, "backstackDelegate");
        Intrinsics.checkNotNullParameter(parentcolumn, "menuItemFacade");
    }

    /* renamed from: o.SensorBridgeExtension$3  reason: invalid class name */
    public final class AnonymousClass3 implements getBindingAdapter<ConfirmPinFragment> {
        @InjectedFieldSignature("id.dana.onboarding.confirmpin.ConfirmPinFragment.presenter")
        public static void getMax(ConfirmPinFragment confirmPinFragment, AnonymousClass4.length length) {
            confirmPinFragment.presenter = length;
        }

        @InjectedFieldSignature("id.dana.onboarding.confirmpin.ConfirmPinFragment.tncSummaryPresenter")
        public static void length(ConfirmPinFragment confirmPinFragment, ToolUtils.setMin setmin) {
            confirmPinFragment.tncSummaryPresenter = setmin;
        }
    }

    public final void setMax(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, "nickname");
        CreatePinKey.length length = CreatePinKey.getMin;
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, "nickname");
        BaseKey createPinKey = new CreatePinKey(str, str2, str3, str4);
        Intrinsics.checkNotNullParameter(createPinKey, "key");
        this.getMin.getBackstack().goTo(createPinKey);
    }

    public final void setMin() {
        VerifyNumberKey.length length = VerifyNumberKey.setMax;
        VerifyNumberKey.setMin setmin = new VerifyNumberKey.setMin();
        setmin.length = "";
        Boolean bool = Boolean.TRUE;
        setmin.getMax = bool != null ? bool.booleanValue() : false;
        setmin.setMin = "";
        Boolean bool2 = Boolean.FALSE;
        setmin.getMin = bool2 != null ? bool2.booleanValue() : false;
        BaseKey verifyNumberKey = new VerifyNumberKey(setmin.length, setmin.getMax, setmin.setMin, setmin.getMin);
        Intrinsics.checkNotNullParameter(verifyNumberKey, "rootKey");
        this.getMin.getBackstack().setHistory(performAccessibilityActionForItem.single(verifyNumberKey), 0);
    }

    public final void getMin() {
        Intent intent = new Intent(this.getMax, HomeTabActivity.class);
        Intent intent2 = this.getMax.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getActivity().intent");
        Intent data = intent.setData(intent2.getData());
        Intrinsics.checkNotNullExpressionValue(data, "Intent(getActivity(), Ho…etActivity().intent.data)");
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (ScreenBrightnessBridgeExtension.setMin()) {
            data.putExtra("fromGoogle", true);
        }
        this.getMax.startActivity(data);
        this.getMax.finish();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/onboarding/OnboardingNavigationManager$Companion;", "", "()V", "AVATAR_URI", "", "FROM_GOOGLE", "IS_EDITABLE_PHONE_NUMBER", "NICKNAME", "PHONE_NUMBER", "PIN", "REFERRAL_CODE", "REFERRAL_NAME", "SOURCE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
