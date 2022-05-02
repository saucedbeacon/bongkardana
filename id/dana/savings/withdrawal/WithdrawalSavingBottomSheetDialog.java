package id.dana.savings.withdrawal;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.WithdrawSavingModule;
import id.dana.dialog.TwoButtonWithImageDialog;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.savings.model.SavingModel;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.DownloadStep;
import o.PrepareException;
import o.afterReopen;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getInstanceForApplication;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onFrameData;
import o.onReceivedIcon;
import o.order;
import o.resetInternal;
import o.setH5OptionMenuTextFlag;
import o.setProgressViewOffset;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 A2\u00020\u0001:\u0002ABB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020&H\u0002J\n\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u000202H\u0014J\b\u00103\u001a\u00020*H\u0002J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\u0006H\u0002J\b\u00106\u001a\u00020*H\u0014J\b\u00107\u001a\u00020*H\u0002J\b\u00108\u001a\u00020*H\u0002J\b\u00109\u001a\u00020\u0006H\u0002J\b\u0010:\u001a\u00020*H\u0002J\u0010\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020\u0006H\u0002J\b\u0010=\u001a\u00020*H\u0014J\b\u0010>\u001a\u00020*H\u0016J\b\u0010?\u001a\u00020*H\u0002J\b\u0010@\u001a\u00020*H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R#\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006C"}, d2 = {"Lid/dana/savings/withdrawal/WithdrawalSavingBottomSheetDialog;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "customSnackBar", "Lid/dana/component/customsnackbarcomponent/CustomSnackbar;", "postToFeed", "", "getPostToFeed", "()Z", "setPostToFeed", "(Z)V", "presenter", "Lid/dana/savings/WithdrawSavingPresenter;", "getPresenter", "()Lid/dana/savings/WithdrawSavingPresenter;", "setPresenter", "(Lid/dana/savings/WithdrawSavingPresenter;)V", "savingModel", "Lid/dana/savings/model/SavingModel;", "getSavingModel", "()Lid/dana/savings/model/SavingModel;", "setSavingModel", "(Lid/dana/savings/model/SavingModel;)V", "userKycDialog", "Lid/dana/dialog/TwoButtonWithImageDialog;", "kotlin.jvm.PlatformType", "getUserKycDialog", "()Lid/dana/dialog/TwoButtonWithImageDialog;", "userKycDialog$delegate", "Lkotlin/Lazy;", "withdrawListener", "Lid/dana/savings/withdrawal/WithdrawalSavingBottomSheetDialog$WithdrawListener;", "getWithdrawListener", "()Lid/dana/savings/withdrawal/WithdrawalSavingBottomSheetDialog$WithdrawListener;", "setWithdrawListener", "(Lid/dana/savings/withdrawal/WithdrawalSavingBottomSheetDialog$WithdrawListener;)V", "withdrawOptions", "", "", "getWithdrawOptions", "()Ljava/util/List;", "checkSavingTargetAmount", "", "constructTargetWithdrawUrl", "withdrawType", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "getSavingWithdrawOption", "handleBankAccountWithdrawal", "amountValid", "init", "initComponent", "initViews", "isWithdrawBankExist", "onClickWithdrawToBalance", "onClickWithdrawToBank", "isKyc", "onShow", "onStart", "openKycContainer", "trackWithdraw", "Companion", "WithdrawListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class WithdrawalSavingBottomSheetDialog extends order {
    @NotNull
    public static final setMax isInside = new setMax((byte) 0);
    /* access modifiers changed from: private */
    public setProgressViewOffset IsOverlapping;
    @NotNull
    final List<String> equals = new ArrayList();
    public length getMax;
    public SavingModel getMin;
    @Inject
    public afterReopen presenter;
    private HashMap toDoubleRange;
    public boolean toFloatRange;
    private final Lazy toIntRange = LazyKt.lazy(new equals(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/savings/withdrawal/WithdrawalSavingBottomSheetDialog$WithdrawListener;", "", "onClickWithdraw", "", "redirectUrl", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
        void length(@NotNull String str);
    }

    public final View getMax(int i) {
        if (this.toDoubleRange == null) {
            this.toDoubleRange = new HashMap();
        }
        View view = (View) this.toDoubleRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toDoubleRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMin() {
        return R.layout.view_coordinator_withdrawal_destination;
    }

    public final float length() {
        return 0.48f;
    }

    public static final /* synthetic */ setProgressViewOffset setMin(WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog) {
        setProgressViewOffset setprogressviewoffset = withdrawalSavingBottomSheetDialog.IsOverlapping;
        if (setprogressviewoffset == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customSnackBar");
        }
        return setprogressviewoffset;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/dialog/TwoButtonWithImageDialog;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function0<TwoButtonWithImageDialog> {
        final /* synthetic */ WithdrawalSavingBottomSheetDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog) {
            super(0);
            this.this$0 = withdrawalSavingBottomSheetDialog;
        }

        public final TwoButtonWithImageDialog invoke() {
            TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(this.this$0.getContext());
            setmax.setMin = this.this$0.getString(R.string.saving_withdrawal_title_dialog);
            setmax.length = this.this$0.getString(R.string.saving_withdrawal_message_dialog);
            setmax.equals = R.drawable.ic_premium_feature;
            TwoButtonWithImageDialog.setMax max = setmax.setMax(false).getMax(false);
            max.FastBitmap$CoordinateSystem = this.this$0.getString(R.string.saving_withdrawal_negative_dialog);
            max.hashCode = AnonymousClass2.setMin;
            max.values = this.this$0.getString(R.string.upgrade);
            max.toString = new View.OnClickListener(this) {
                final /* synthetic */ equals setMax;

                {
                    this.setMax = r1;
                }

                public final void onClick(View view) {
                    WithdrawalSavingBottomSheetDialog.equals();
                }
            };
            max.toDoubleRange = 0;
            return max.getMin();
        }
    }

    @Nullable
    public final FrameLayout getMax() {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getMax(resetInternal.setMax.registerForActivityResult);
        if (coordinatorLayout != null) {
            return (FrameLayout) coordinatorLayout.findViewById(R.id.f35372131361983);
        }
        return null;
    }

    public final void onStart() {
        super.onStart();
        getMax(getDialog());
        length(getDialog());
    }

    public final void setMin() {
        super.setMin();
        DownloadStep.MyPackageDownloadCallback.setMin setmin = new DownloadStep.MyPackageDownloadCallback.setMin((byte) 0);
        BaseActivity baseActivity = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        PrepareException.AnonymousClass1 applicationComponent = baseActivity.getApplicationComponent();
        if (applicationComponent != null) {
            setmin.length = applicationComponent;
            setmin.getMin = new WithdrawSavingModule(new getMin(this));
            stopIgnoring.setMin(setmin.getMin, WithdrawSavingModule.class);
            stopIgnoring.setMin(setmin.length, PrepareException.AnonymousClass1.class);
            new DownloadStep.MyPackageDownloadCallback(setmin.getMin, setmin.length, (byte) 0).length(this);
            BaseActivity baseActivity2 = this.setMax;
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            afterReopen afterreopen = this.presenter;
            if (afterreopen == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = afterreopen;
            baseActivity2.registerPresenter(getminArr);
            afterReopen afterreopen2 = this.presenter;
            if (afterreopen2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            afterreopen2.getMin.execute(new afterReopen.setMax(afterreopen2));
            afterReopen afterreopen3 = this.presenter;
            if (afterreopen3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            afterreopen3.setMax.execute(onReceivedIcon.INSTANCE, new afterReopen.getMax(afterreopen3), new afterReopen.setMin(afterreopen3));
            setMin(setMin(getDialog()), 3);
            return;
        }
        throw null;
    }

    public final void setMax() {
        super.setMax();
        ConstraintLayout constraintLayout = (ConstraintLayout) getMax(resetInternal.setMax.IResultReceiver);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new getMax(this));
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) getMax(resetInternal.setMax.postMessage);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(new setMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ WithdrawalSavingBottomSheetDialog setMin;

        getMax(WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog) {
            this.setMin = withdrawalSavingBottomSheetDialog;
        }

        public final void onClick(View view) {
            WithdrawalSavingBottomSheetDialog.length(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ WithdrawalSavingBottomSheetDialog length;

        setMin(WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog) {
            this.length = withdrawalSavingBottomSheetDialog;
        }

        public final void onClick(View view) {
            this.length.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"id/dana/savings/withdrawal/WithdrawalSavingBottomSheetDialog$initComponent$1", "Lid/dana/savings/contract/WithdrawSavingContract$View;", "onError", "", "errorMessage", "", "onGetKycStatus", "isKyc", "", "onGetSavingWithdrawOption", "withdrawOptions", "", "onInitSavingWithdraw", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements onFrameData.getMin {
        final /* synthetic */ WithdrawalSavingBottomSheetDialog setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMin(WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog) {
            this.setMax = withdrawalSavingBottomSheetDialog;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
        static final class length implements View.OnClickListener {
            final /* synthetic */ boolean getMax;
            final /* synthetic */ getMin setMin;

            length(getMin getmin, boolean z) {
                this.setMin = getmin;
                this.getMax = z;
            }

            public final void onClick(View view) {
                WithdrawalSavingBottomSheetDialog.getMax(this.setMin.setMax, this.getMax);
            }
        }

        public final void getMin(boolean z) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.setMax.getMax(resetInternal.setMax.startIntentSenderForResult);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new length(this, z));
            }
        }

        public final void setMin(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "withdrawOptions");
            this.setMax.equals.addAll(list);
            WithdrawalSavingBottomSheetDialog.getMin(this.setMax);
        }

        public final void getMax() {
            length length2 = this.setMax.getMax;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("withdrawListener");
            }
            String min = isShowMenu.setMin(this.setMax.getMax("balance"));
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(cons…rgetWithdrawUrl(BALANCE))");
            length2.length(min);
            this.setMax.FastBitmap$CoordinateSystem();
            this.setMax.dismiss();
        }

        public final void onError(@Nullable String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(-1676107087, oncanceled);
                onCancelLoad.getMin(-1676107087, oncanceled);
            }
            this.setMax.dismiss();
            WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog = this.setMax;
            BaseActivity baseActivity = this.setMax.setMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            Window window = baseActivity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "baseActivity.window");
            View findViewById = window.getDecorView().findViewById(16908290);
            Intrinsics.checkNotNullExpressionValue(findViewById, "baseActivity.window.deco…yId(android.R.id.content)");
            setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax((ViewGroup) findViewById);
            setmax.getMax = str;
            setmax.setMax = this.setMax.getString(R.string.pop_up_positive_button_saving_limit_info);
            setmax.toIntRange = 0;
            setmax.setMin = R.drawable.ic_warning_orange;
            setmax.getMin = R.drawable.bg_rectangle_tangerine;
            setmax.length = new setMin(this);
            withdrawalSavingBottomSheetDialog.IsOverlapping = setmax.getMax();
            WithdrawalSavingBottomSheetDialog.setMin(this.setMax).show();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
        static final class setMin implements View.OnClickListener {
            final /* synthetic */ getMin setMin;

            setMin(getMin getmin) {
                this.setMin = getmin;
            }

            public final void onClick(View view) {
                WithdrawalSavingBottomSheetDialog.setMin(this.setMin.setMax).dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    public final String getMax(String str) {
        setH5OptionMenuTextFlag max = setH5OptionMenuTextFlag.setMin("/m/saving/withdraw/{withdrawType}?savingId={savingId}&share={share}").setMax("withdrawType", str);
        SavingModel savingModel = this.getMin;
        if (savingModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingModel");
        }
        String max2 = max.setMax("savingId", savingModel.getMax).setMax("share", String.valueOf(this.toFloatRange)).getMax();
        Intrinsics.checkNotNullExpressionValue(max2, "TagFormat.from(DanaUrl.S…())\n            .format()");
        return max2;
    }

    /* access modifiers changed from: private */
    public final void FastBitmap$CoordinateSystem() {
        convertDipToPx.length length2 = new convertDipToPx.length(getContext());
        length2.getMax = TrackerKey.Event.GOAL_SAVINGS_WITHDRAW_CREATION;
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    private final boolean values() {
        for (String areEqual : this.equals) {
            if (Intrinsics.areEqual((Object) areEqual, (Object) "withdraw_bank")) {
                return true;
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/savings/withdrawal/WithdrawalSavingBottomSheetDialog$Companion;", "", "()V", "BALANCE", "", "BANK", "DIM_AMOUNT_OVERLAY", "", "TAG", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void length(WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog) {
        afterReopen afterreopen = withdrawalSavingBottomSheetDialog.presenter;
        if (afterreopen == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        SavingModel savingModel = withdrawalSavingBottomSheetDialog.getMin;
        if (savingModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingModel");
        }
        String str = savingModel.getMax;
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter("BALANCE", "withdrawMethod");
        afterreopen.length.execute(new getInstanceForApplication(str, "BALANCE"), new afterReopen.length(afterreopen, "BALANCE"), new afterReopen.getMin(afterreopen));
    }

    public static final /* synthetic */ void getMax(WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog, boolean z) {
        if (z) {
            length length2 = withdrawalSavingBottomSheetDialog.getMax;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("withdrawListener");
            }
            String min = isShowMenu.setMin(withdrawalSavingBottomSheetDialog.getMax("bank"));
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(cons…tTargetWithdrawUrl(BANK))");
            length2.length(min);
            withdrawalSavingBottomSheetDialog.FastBitmap$CoordinateSystem();
            return;
        }
        TwoButtonWithImageDialog twoButtonWithImageDialog = (TwoButtonWithImageDialog) withdrawalSavingBottomSheetDialog.toIntRange.getValue();
        if (twoButtonWithImageDialog != null) {
            twoButtonWithImageDialog.setMin();
        }
    }

    public static final /* synthetic */ void getMin(WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog) {
        SavingModel savingModel = withdrawalSavingBottomSheetDialog.getMin;
        if (savingModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingModel");
        }
        boolean max = savingModel.setMax.getMax(new MoneyViewModel("10000", "Rp", (String) null, 4));
        SavingWithdrawalDestinationView savingWithdrawalDestinationView = (SavingWithdrawalDestinationView) withdrawalSavingBottomSheetDialog.getMax(resetInternal.setMax.getProgress);
        if (!withdrawalSavingBottomSheetDialog.values()) {
            savingWithdrawalDestinationView.enableBankAccountWithdrawal(false, false);
        } else {
            savingWithdrawalDestinationView.enableBankAccountWithdrawal(max, true);
        }
    }

    public static final /* synthetic */ void equals() {
        String min = isShowMenu.setMin("/m/kyc/landingPage?entryPoint=goalSaving");
        Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(DanaUrl.KYC_FROM_GOAL_SAVING)");
        DanaH5.startContainerFullUrl(min);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toDoubleRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
