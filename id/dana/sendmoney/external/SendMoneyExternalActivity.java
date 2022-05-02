package id.dana.sendmoney.external;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.UrlTag;
import id.dana.di.modules.SendMoneyExternalModule;
import id.dana.sendmoney.external.outlet.AddOutletReceiverActivity;
import id.dana.sendmoney.model.ExternalWithdrawChannelModel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ChooseImageBridgeExtension;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.IntRange;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.getParseContext;
import o.getProgressViewStartOffset;
import o.getScrimColor;
import o.notifyFail;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.order;
import o.resetInternal;
import o.setH5OptionMenuTextFlag;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0017H\u0002J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0017H\u0002J\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020*H\u0002J\u0018\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\bH\u0002J\u0010\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u000fH\u0002J\u0010\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\bH\u0002J\b\u00107\u001a\u00020\u0017H\u0002J\b\u00108\u001a\u00020\u0017H\u0002J\b\u00109\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006;"}, d2 = {"Lid/dana/sendmoney/external/SendMoneyExternalActivity;", "Lid/dana/base/BaseActivity;", "()V", "atmAdapter", "Lid/dana/sendmoney/external/SendMoneyExternalOutletAdapter;", "atmSkeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "isPeerToCashEnabled", "", "isUserKyc", "outletAdapter", "outletOptionBottomSheetDialog", "Lid/dana/sendmoney/external/SendMoneyOutletOptionBottomSheetDialog;", "outletSkeletonScreen", "selectedOutlet", "Lid/dana/sendmoney/model/ExternalWithdrawChannelModel;", "sendMoneyExternalPresenter", "Lid/dana/sendmoney/external/SendMoneyExternalContract$Presenter;", "getSendMoneyExternalPresenter", "()Lid/dana/sendmoney/external/SendMoneyExternalContract$Presenter;", "setSendMoneyExternalPresenter", "(Lid/dana/sendmoney/external/SendMoneyExternalContract$Presenter;)V", "checkSendMoneyPeerToCash", "", "configToolbar", "getAtmWithdrawOption", "getLayout", "", "getOutletWithdrawOption", "getPeerToCashSupportedOutlet", "getUserKycStatus", "hideAtmSkeleton", "hideOutletSkeleton", "init", "initAtmAdapter", "initAtmRecyclerView", "initOutletAdapter", "initOutletRecyclerView", "injectComponent", "isNeedToShowOnboarding", "isOutletSupportPeerToCash", "instId", "", "onClickLeftMenuButton", "view", "Landroid/view/View;", "openH5Container", "url", "openOutletOptionBottomSheet", "outlet", "isSendEnabled", "openWithdrawalDenomPage", "channelModel", "saveOnboardingDialog", "isShow", "showAtmSkeleton", "showOnboardingDialog", "showOutletSkeleton", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SendMoneyExternalActivity extends BaseActivity {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    private HashMap FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public ExternalWithdrawChannelModel IsOverlapping;
    private onDetachedFromLayoutParams equals;
    private ChooseImageBridgeExtension.AnonymousClass4 getMax;
    /* access modifiers changed from: private */
    public ChooseImageBridgeExtension.AnonymousClass2 getMin;
    /* access modifiers changed from: private */
    public boolean isInside;
    @Inject
    public notifyFail.getMin sendMoneyExternalPresenter;
    /* access modifiers changed from: private */
    public ChooseImageBridgeExtension.AnonymousClass2 setMax;
    private onDetachedFromLayoutParams toFloatRange;
    /* access modifiers changed from: private */
    public boolean toIntRange;

    public final void _$_clearFindViewByIdCache() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(842078243, oncanceled);
            onCancelLoad.getMin(842078243, oncanceled);
        }
        HashMap hashMap = this.FastBitmap$CoordinateSystem;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.FastBitmap$CoordinateSystem == null) {
            this.FastBitmap$CoordinateSystem = new HashMap();
        }
        View view = (View) this.FastBitmap$CoordinateSystem.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.FastBitmap$CoordinateSystem.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_send_money_external;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ SendMoneyExternalActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(SendMoneyExternalActivity sendMoneyExternalActivity) {
            super(1);
            this.this$0 = sendMoneyExternalActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            SendMoneyExternalActivity.access$saveOnboardingDialog(this.this$0, false);
        }
    }

    public static final /* synthetic */ void access$checkSendMoneyPeerToCash(SendMoneyExternalActivity sendMoneyExternalActivity) {
        int length2;
        Context baseContext = sendMoneyExternalActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1850471880, oncanceled);
            onCancelLoad.getMin(1850471880, oncanceled);
        }
        notifyFail.getMin getmin = sendMoneyExternalActivity.sendMoneyExternalPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendMoneyExternalPresenter");
        }
        getmin.length();
    }

    public static final /* synthetic */ ChooseImageBridgeExtension.AnonymousClass2 access$getAtmAdapter$p(SendMoneyExternalActivity sendMoneyExternalActivity) {
        ChooseImageBridgeExtension.AnonymousClass2 r1 = sendMoneyExternalActivity.setMax;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atmAdapter");
        }
        return r1;
    }

    public static final /* synthetic */ ChooseImageBridgeExtension.AnonymousClass2 access$getOutletAdapter$p(SendMoneyExternalActivity sendMoneyExternalActivity) {
        ChooseImageBridgeExtension.AnonymousClass2 r1 = sendMoneyExternalActivity.getMin;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outletAdapter");
        }
        return r1;
    }

    public static final /* synthetic */ ExternalWithdrawChannelModel access$getSelectedOutlet$p(SendMoneyExternalActivity sendMoneyExternalActivity) {
        ExternalWithdrawChannelModel externalWithdrawChannelModel = sendMoneyExternalActivity.IsOverlapping;
        if (externalWithdrawChannelModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedOutlet");
        }
        return externalWithdrawChannelModel;
    }

    public static final /* synthetic */ void access$showAtmSkeleton(SendMoneyExternalActivity sendMoneyExternalActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1178288234, oncanceled);
            onCancelLoad.getMin(1178288234, oncanceled);
        }
        getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) sendMoneyExternalActivity._$_findCachedViewById(resetInternal.setMax.setSupportBackgroundTintMode));
        getmax.getMax = R.layout.view_skeleton_atm_outlet;
        ChooseImageBridgeExtension.AnonymousClass2 r1 = sendMoneyExternalActivity.setMax;
        if (r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atmAdapter");
        }
        getmax.length = r1;
        getmax.IsOverlapping = 1500;
        getmax.getMin = true;
        getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
        getmax.toIntRange = 0;
        getmax.setMin = 2;
        getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
        getscrimcolor.getMin();
        Intrinsics.checkNotNullExpressionValue(getscrimcolor, "Skeleton.bind(rvViaAtm)\n…nt(2)\n            .show()");
        sendMoneyExternalActivity.toFloatRange = getscrimcolor;
    }

    @NotNull
    public final notifyFail.getMin getSendMoneyExternalPresenter() {
        notifyFail.getMin getmin = this.sendMoneyExternalPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendMoneyExternalPresenter");
        }
        return getmin;
    }

    public final void setSendMoneyExternalPresenter(@NotNull notifyFail.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.sendMoneyExternalPresenter = getmin;
    }

    public final void configToolbar() {
        setCenterTitle(getString(R.string.sendmoney_send_and_withdraw_cash));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016¨\u0006\u0016"}, d2 = {"id/dana/sendmoney/external/SendMoneyExternalActivity$injectComponent$1", "Lid/dana/sendmoney/external/SendMoneyExternalContract$View;", "dismissAtmProgress", "", "dismissOutletProgress", "onCheckSendMoneyPeerToCash", "isEnabled", "", "onError", "errorMessage", "", "onGetAtmWithdrawOption", "channelModels", "", "Lid/dana/sendmoney/model/ExternalWithdrawChannelModel;", "onGetOutletWithdrawOption", "onGetUserKycStatus", "isKyc", "onShowOnboardingDialog", "isShow", "showAtmProgress", "showOutletProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements notifyFail.length {
        final /* synthetic */ SendMoneyExternalActivity getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(SendMoneyExternalActivity sendMoneyExternalActivity) {
            this.getMax = sendMoneyExternalActivity;
        }

        public final void length(@NotNull List<ExternalWithdrawChannelModel> list) {
            Intrinsics.checkNotNullParameter(list, "channelModels");
            SendMoneyExternalActivity.access$getAtmAdapter$p(this.getMax).getMin(list);
            TextView textView = (TextView) this.getMax._$_findCachedViewById(resetInternal.setMax.getDividerWidth);
            if (textView != null) {
                View view = textView;
                List max = SendMoneyExternalActivity.access$getAtmAdapter$p(this.getMax).getMax();
                Intrinsics.checkNotNullExpressionValue(max, "atmAdapter.items");
                boolean z = !max.isEmpty();
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(z ? 0 : 8);
            }
        }

        public final void setMax(@NotNull List<ExternalWithdrawChannelModel> list) {
            Intrinsics.checkNotNullParameter(list, "channelModels");
            SendMoneyExternalActivity.access$getOutletAdapter$p(this.getMax).getMin(list);
            TextView textView = (TextView) this.getMax._$_findCachedViewById(resetInternal.setMax.setOnQueryTextFocusChangeListener);
            if (textView != null) {
                View view = textView;
                List max = SendMoneyExternalActivity.access$getOutletAdapter$p(this.getMax).getMax();
                Intrinsics.checkNotNullExpressionValue(max, "outletAdapter.items");
                boolean z = !max.isEmpty();
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(z ? 0 : 8);
            }
        }

        public final void setMax(boolean z) {
            if (z) {
                SendMoneyExternalActivity.access$showOnboardingDialog(this.getMax);
            }
        }

        public final void getMax(boolean z) {
            this.getMax.toIntRange = z;
            SendMoneyExternalActivity.access$getAtmWithdrawOption(this.getMax);
            SendMoneyExternalActivity.access$getOutletWithdrawOption(this.getMax);
        }

        public final void getMin(boolean z) {
            this.getMax.isInside = z;
            SendMoneyExternalActivity.access$checkSendMoneyPeerToCash(this.getMax);
        }

        public final void setMin() {
            SendMoneyExternalActivity.access$showAtmSkeleton(this.getMax);
        }

        public final void length() {
            SendMoneyExternalActivity.access$showOutletSkeleton(this.getMax);
        }

        public final void getMin() {
            SendMoneyExternalActivity.access$hideAtmSkeleton(this.getMax);
        }

        public final void setMax() {
            SendMoneyExternalActivity.access$hideOutletSkeleton(this.getMax);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
        static final class getMin implements DialogInterface.OnDismissListener {
            final /* synthetic */ getMax getMin;

            getMin(getMax getmax) {
                this.getMin = getmax;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                this.getMin.getMax.finish();
            }
        }

        public final void onError(@Nullable String str) {
            this.getMax.showWarningDialog(str, (DialogInterface.OnDismissListener) new getMin(this), 3000);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onItemClick", "id/dana/sendmoney/external/SendMoneyExternalActivity$initAtmAdapter$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements Ignore.setMin {
        final /* synthetic */ ChooseImageBridgeExtension.AnonymousClass2 length;
        final /* synthetic */ SendMoneyExternalActivity setMin;

        getMin(ChooseImageBridgeExtension.AnonymousClass2 r1, SendMoneyExternalActivity sendMoneyExternalActivity) {
            this.length = r1;
            this.setMin = sendMoneyExternalActivity;
        }

        public final void length(int i) {
            Boolean bool;
            ExternalWithdrawChannelModel externalWithdrawChannelModel = (ExternalWithdrawChannelModel) this.length.setMin(i);
            if (externalWithdrawChannelModel != null && (bool = externalWithdrawChannelModel.equals) != null && !bool.booleanValue()) {
                SendMoneyExternalActivity sendMoneyExternalActivity = this.setMin;
                Object min = this.length.setMin(i);
                Intrinsics.checkNotNullExpressionValue(min, "getItem(it)");
                SendMoneyExternalActivity.access$openWithdrawalDenomPage(sendMoneyExternalActivity, (ExternalWithdrawChannelModel) min);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onItemClick", "id/dana/sendmoney/external/SendMoneyExternalActivity$initOutletAdapter$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements Ignore.setMin {
        final /* synthetic */ SendMoneyExternalActivity length;
        final /* synthetic */ ChooseImageBridgeExtension.AnonymousClass2 setMin;

        length(ChooseImageBridgeExtension.AnonymousClass2 r1, SendMoneyExternalActivity sendMoneyExternalActivity) {
            this.setMin = r1;
            this.length = sendMoneyExternalActivity;
        }

        public final void length(int i) {
            Boolean bool;
            ExternalWithdrawChannelModel externalWithdrawChannelModel = (ExternalWithdrawChannelModel) this.setMin.setMin(i);
            if (externalWithdrawChannelModel != null && (bool = externalWithdrawChannelModel.equals) != null) {
                boolean booleanValue = bool.booleanValue();
                if (this.length.isFinishing()) {
                    return;
                }
                if (!booleanValue || externalWithdrawChannelModel.length()) {
                    this.length.IsOverlapping = externalWithdrawChannelModel;
                    SendMoneyExternalActivity sendMoneyExternalActivity = this.length;
                    ExternalWithdrawChannelModel access$getSelectedOutlet$p = SendMoneyExternalActivity.access$getSelectedOutlet$p(sendMoneyExternalActivity);
                    boolean access$isPeerToCashEnabled$p = this.length.toIntRange;
                    SendMoneyExternalActivity sendMoneyExternalActivity2 = this.length;
                    SendMoneyExternalActivity.access$openOutletOptionBottomSheet(sendMoneyExternalActivity, access$getSelectedOutlet$p, access$isPeerToCashEnabled$p & sendMoneyExternalActivity2.setMax(String.valueOf(SendMoneyExternalActivity.access$getSelectedOutlet$p(sendMoneyExternalActivity2).getMin)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean setMax(String str) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1576023840, oncanceled);
            onCancelLoad.getMin(1576023840, oncanceled);
        }
        notifyFail.getMin getmin = this.sendMoneyExternalPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendMoneyExternalPresenter");
        }
        return getmin.length(str);
    }

    public final void onClickLeftMenuButton(@Nullable View view) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1835065241, oncanceled);
            onCancelLoad.getMin(1835065241, oncanceled);
        }
        onBackPressed();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/sendmoney/external/SendMoneyExternalActivity$Companion;", "", "()V", "SHIMMERING_ANGLE", "", "SHIMMERING_COLOR", "SHIMMERING_DURATION", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void init() {
        int max;
        int length2;
        ChooseImageBridgeExtension.AnonymousClass2 r0 = new IMultiInstanceInvalidationCallback.Stub<ChooseImageBridgeExtension.AnonymousClass1, ExternalWithdrawChannelModel>() {
            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                return new Ignore<ExternalWithdrawChannelModel>(viewGroup) {
                    @NotNull
                    public static final getMax getMax = new getMax((byte) 0);

                    public final /* synthetic */ void setMax(Object obj) {
                        ExternalWithdrawChannelModel externalWithdrawChannelModel = (ExternalWithdrawChannelModel) obj;
                        if (externalWithdrawChannelModel != null) {
                            Boolean bool = externalWithdrawChannelModel.equals;
                            String str = null;
                            if (bool != null) {
                                if (!bool.booleanValue() || externalWithdrawChannelModel.length()) {
                                    View view = this.itemView;
                                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                                    TextView textView = (TextView) view.findViewById(resetInternal.setMax.setThumbDrawable);
                                    if (textView != null) {
                                        textView.setText(externalWithdrawChannelModel.setMin);
                                    }
                                } else {
                                    View view2 = this.itemView;
                                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                                    TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.setThumbResource);
                                    if (textView2 != null) {
                                        textView2.setText(externalWithdrawChannelModel.setMin);
                                    }
                                    View view3 = this.itemView;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view3.findViewById(resetInternal.setMax.MediaSessionCompat$ResultReceiverWrapper);
                                    if (constraintLayout != null) {
                                        constraintLayout.setBackground(IntRange.length(constraintLayout.getContext(), (int) R.color.f20332131099945));
                                        constraintLayout.setClickable(false);
                                        constraintLayout.setFocusable(false);
                                        if (Build.VERSION.SDK_INT >= 23) {
                                            constraintLayout.setForeground((Drawable) null);
                                        }
                                    }
                                    TextView textView3 = (TextView) view3.findViewById(resetInternal.setMax.setThumbDrawable);
                                    if (textView3 != null) {
                                        View view4 = textView3;
                                        Intrinsics.checkNotNullParameter(view4, "<this>");
                                        view4.setVisibility(8);
                                    }
                                    TextView textView4 = (TextView) view3.findViewById(resetInternal.setMax.setThumbResource);
                                    if (textView4 != null) {
                                        View view5 = textView4;
                                        Intrinsics.checkNotNullParameter(view5, "<this>");
                                        view5.setVisibility(0);
                                    }
                                    CircleImageView circleImageView = (CircleImageView) view3.findViewById(resetInternal.setMax.getMetadata);
                                    if (circleImageView != null) {
                                        View view6 = circleImageView;
                                        Intrinsics.checkNotNullParameter(view6, "<this>");
                                        view6.setVisibility(0);
                                    }
                                }
                            }
                            updateCornerMarking updatecornermarking = (updateCornerMarking) Glide.getMax(this.length);
                            String str2 = externalWithdrawChannelModel.length;
                            if (str2 != null) {
                                int hashCode = str2.hashCode();
                                if (hashCode != -346123323) {
                                    if (hashCode == -346109879 && str2.equals("WITHDRAW_OTC")) {
                                        String valueOf = String.valueOf(externalWithdrawChannelModel.getMin);
                                        StringBuilder sb = new StringBuilder("https://a.m.dana.id/resource/icons/");
                                        if (valueOf != null) {
                                            String lowerCase = valueOf.toLowerCase();
                                            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                                            sb.append(lowerCase);
                                            sb.append(".png");
                                            str = sb.toString();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                        }
                                    }
                                } else if (str2.equals("WITHDRAW_ATM")) {
                                    String valueOf2 = String.valueOf(externalWithdrawChannelModel.getMin);
                                    StringBuilder sb2 = new StringBuilder("https://a.m.dana.id/resource/imgs/skywalker/bankicons/");
                                    if (valueOf2 != null) {
                                        String lowerCase2 = valueOf2.toLowerCase();
                                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                                        sb2.append(lowerCase2);
                                        sb2.append(".png");
                                        str = sb2.toString();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }
                                }
                            }
                            updateMessageMenuItem<Drawable> max = updatecornermarking.setMax(str).setMax((int) R.drawable.ic_bank_placeholder).setMin((int) R.drawable.ic_bank_placeholder).setMax(evaluate.setMin);
                            View view7 = this.itemView;
                            Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                            max.length((ImageView) view7.findViewById(resetInternal.setMax.getFlags));
                        }
                    }

                    {
                        Intrinsics.checkNotNullParameter(r3, "parent");
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/sendmoney/external/SendMoneyExternalOutletViewHolder$Companion;", "", "()V", "BANK_LOGO_URL", "", "OUTLET_LOGO_URL", "PAY_METHOD_ATM", "PAY_METHOD_OTC", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                    /* renamed from: o.ChooseImageBridgeExtension$1$getMax */
                    public static final class getMax {
                        private getMax() {
                        }

                        public /* synthetic */ getMax(byte b) {
                            this();
                        }
                    }
                };
            }
        };
        this.setMax = r0;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atmAdapter");
        }
        r0.getMax((Ignore.setMin) new getMin(r0, this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportBackgroundTintMode);
        if (recyclerView != null) {
            ChooseImageBridgeExtension.AnonymousClass2 r2 = this.setMax;
            if (r2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("atmAdapter");
            }
            recyclerView.setAdapter(r2);
        }
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(972814004, oncanceled);
            onCancelLoad.getMin(972814004, oncanceled);
        }
        ChooseImageBridgeExtension.AnonymousClass2 r02 = new IMultiInstanceInvalidationCallback.Stub<ChooseImageBridgeExtension.AnonymousClass1, ExternalWithdrawChannelModel>() {
            public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                return new Ignore<ExternalWithdrawChannelModel>(viewGroup) {
                    @NotNull
                    public static final getMax getMax = new getMax((byte) 0);

                    public final /* synthetic */ void setMax(Object obj) {
                        ExternalWithdrawChannelModel externalWithdrawChannelModel = (ExternalWithdrawChannelModel) obj;
                        if (externalWithdrawChannelModel != null) {
                            Boolean bool = externalWithdrawChannelModel.equals;
                            String str = null;
                            if (bool != null) {
                                if (!bool.booleanValue() || externalWithdrawChannelModel.length()) {
                                    View view = this.itemView;
                                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                                    TextView textView = (TextView) view.findViewById(resetInternal.setMax.setThumbDrawable);
                                    if (textView != null) {
                                        textView.setText(externalWithdrawChannelModel.setMin);
                                    }
                                } else {
                                    View view2 = this.itemView;
                                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                                    TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.setThumbResource);
                                    if (textView2 != null) {
                                        textView2.setText(externalWithdrawChannelModel.setMin);
                                    }
                                    View view3 = this.itemView;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view3.findViewById(resetInternal.setMax.MediaSessionCompat$ResultReceiverWrapper);
                                    if (constraintLayout != null) {
                                        constraintLayout.setBackground(IntRange.length(constraintLayout.getContext(), (int) R.color.f20332131099945));
                                        constraintLayout.setClickable(false);
                                        constraintLayout.setFocusable(false);
                                        if (Build.VERSION.SDK_INT >= 23) {
                                            constraintLayout.setForeground((Drawable) null);
                                        }
                                    }
                                    TextView textView3 = (TextView) view3.findViewById(resetInternal.setMax.setThumbDrawable);
                                    if (textView3 != null) {
                                        View view4 = textView3;
                                        Intrinsics.checkNotNullParameter(view4, "<this>");
                                        view4.setVisibility(8);
                                    }
                                    TextView textView4 = (TextView) view3.findViewById(resetInternal.setMax.setThumbResource);
                                    if (textView4 != null) {
                                        View view5 = textView4;
                                        Intrinsics.checkNotNullParameter(view5, "<this>");
                                        view5.setVisibility(0);
                                    }
                                    CircleImageView circleImageView = (CircleImageView) view3.findViewById(resetInternal.setMax.getMetadata);
                                    if (circleImageView != null) {
                                        View view6 = circleImageView;
                                        Intrinsics.checkNotNullParameter(view6, "<this>");
                                        view6.setVisibility(0);
                                    }
                                }
                            }
                            updateCornerMarking updatecornermarking = (updateCornerMarking) Glide.getMax(this.length);
                            String str2 = externalWithdrawChannelModel.length;
                            if (str2 != null) {
                                int hashCode = str2.hashCode();
                                if (hashCode != -346123323) {
                                    if (hashCode == -346109879 && str2.equals("WITHDRAW_OTC")) {
                                        String valueOf = String.valueOf(externalWithdrawChannelModel.getMin);
                                        StringBuilder sb = new StringBuilder("https://a.m.dana.id/resource/icons/");
                                        if (valueOf != null) {
                                            String lowerCase = valueOf.toLowerCase();
                                            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                                            sb.append(lowerCase);
                                            sb.append(".png");
                                            str = sb.toString();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                        }
                                    }
                                } else if (str2.equals("WITHDRAW_ATM")) {
                                    String valueOf2 = String.valueOf(externalWithdrawChannelModel.getMin);
                                    StringBuilder sb2 = new StringBuilder("https://a.m.dana.id/resource/imgs/skywalker/bankicons/");
                                    if (valueOf2 != null) {
                                        String lowerCase2 = valueOf2.toLowerCase();
                                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                                        sb2.append(lowerCase2);
                                        sb2.append(".png");
                                        str = sb2.toString();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }
                                }
                            }
                            updateMessageMenuItem<Drawable> max = updatecornermarking.setMax(str).setMax((int) R.drawable.ic_bank_placeholder).setMin((int) R.drawable.ic_bank_placeholder).setMax(evaluate.setMin);
                            View view7 = this.itemView;
                            Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                            max.length((ImageView) view7.findViewById(resetInternal.setMax.getFlags));
                        }
                    }

                    {
                        Intrinsics.checkNotNullParameter(r3, "parent");
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/sendmoney/external/SendMoneyExternalOutletViewHolder$Companion;", "", "()V", "BANK_LOGO_URL", "", "OUTLET_LOGO_URL", "PAY_METHOD_ATM", "PAY_METHOD_OTC", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                    /* renamed from: o.ChooseImageBridgeExtension$1$getMax */
                    public static final class getMax {
                        private getMax() {
                        }

                        public /* synthetic */ getMax(byte b) {
                            this();
                        }
                    }
                };
            }
        };
        this.getMin = r02;
        if (r02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outletAdapter");
        }
        r02.getMax((Ignore.setMin) new length(r02, this));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportBackgroundTintList);
        if (recyclerView2 != null) {
            ChooseImageBridgeExtension.AnonymousClass2 r4 = this.getMin;
            if (r4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("outletAdapter");
            }
            recyclerView2.setAdapter(r4);
        }
        getParseContext.getMax getmax = new getParseContext.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmax.getMin = applicationComponent;
            getmax.getMax = new SendMoneyExternalModule(new getMax(this));
            stopIgnoring.setMin(getmax.getMax, SendMoneyExternalModule.class);
            stopIgnoring.setMin(getmax.getMin, PrepareException.AnonymousClass1.class);
            new getParseContext(getmax.getMax, getmax.getMin, (byte) 0).setMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            notifyFail.getMin getmin = this.sendMoneyExternalPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendMoneyExternalPresenter");
            }
            getminArr[0] = getmin;
            registerPresenter(getminArr);
            notifyFail.getMin getmin2 = this.sendMoneyExternalPresenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendMoneyExternalPresenter");
            }
            getmin2.isInside();
            Context baseContext2 = getBaseContext();
            if (baseContext2 != null) {
                context = baseContext2.getApplicationContext();
            }
            if (!(context == null || -39328609 == (max = dispatchOnCancelled.getMax(context, -39328609)))) {
                onCanceled oncanceled2 = new onCanceled(-39328609, max, 512);
                onCancelLoad.setMax(-39328609, oncanceled2);
                onCancelLoad.getMin(-39328609, oncanceled2);
            }
            notifyFail.getMin getmin3 = this.sendMoneyExternalPresenter;
            if (getmin3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendMoneyExternalPresenter");
            }
            getmin3.equals();
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled3 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(-1420969405, oncanceled3);
                onCancelLoad.getMin(-1420969405, oncanceled3);
            }
            notifyFail.getMin getmin4 = this.sendMoneyExternalPresenter;
            if (getmin4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendMoneyExternalPresenter");
            }
            getmin4.getMax();
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$showOnboardingDialog(SendMoneyExternalActivity sendMoneyExternalActivity) {
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(sendMoneyExternalActivity);
        getmax.toFloatRange = sendMoneyExternalActivity.getString(R.string.sendmoney_external_onboardingdialog_title);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = sendMoneyExternalActivity.getString(R.string.sendmoney_external_onboardingdialog_body);
        getProgressViewStartOffset.getMax getmax3 = getmax2;
        getmax3.setMax = R.drawable.ic_sendmoney_external_onboarding_dialog;
        getProgressViewStartOffset.getMax max = getmax3.IsOverlapping().setMax(false);
        max.toIntRange = 0;
        max.setMin(sendMoneyExternalActivity.getString(R.string.sendmoney_external_onboardingdialog_button), new setMax(sendMoneyExternalActivity)).equals();
    }

    public static final /* synthetic */ void access$getAtmWithdrawOption(SendMoneyExternalActivity sendMoneyExternalActivity) {
        notifyFail.getMin getmin = sendMoneyExternalActivity.sendMoneyExternalPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendMoneyExternalPresenter");
        }
        getmin.getMin();
    }

    public static final /* synthetic */ void access$getOutletWithdrawOption(SendMoneyExternalActivity sendMoneyExternalActivity) {
        notifyFail.getMin getmin = sendMoneyExternalActivity.sendMoneyExternalPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendMoneyExternalPresenter");
        }
        getmin.setMin();
    }

    public static final /* synthetic */ void access$showOutletSkeleton(SendMoneyExternalActivity sendMoneyExternalActivity) {
        getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) sendMoneyExternalActivity._$_findCachedViewById(resetInternal.setMax.setSupportBackgroundTintList));
        getmax.getMax = R.layout.view_skeleton_atm_outlet;
        ChooseImageBridgeExtension.AnonymousClass2 r0 = sendMoneyExternalActivity.getMin;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outletAdapter");
        }
        getmax.length = r0;
        getmax.IsOverlapping = 1500;
        getmax.getMin = true;
        getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
        getmax.toIntRange = 0;
        getmax.setMin = 2;
        getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
        getscrimcolor.getMin();
        Intrinsics.checkNotNullExpressionValue(getscrimcolor, "Skeleton.bind(rvViaOutle…nt(2)\n            .show()");
        sendMoneyExternalActivity.equals = getscrimcolor;
    }

    public static final /* synthetic */ void access$hideAtmSkeleton(SendMoneyExternalActivity sendMoneyExternalActivity) {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = sendMoneyExternalActivity.toFloatRange;
        if (ondetachedfromlayoutparams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atmSkeletonScreen");
        }
        ondetachedfromlayoutparams.length();
    }

    public static final /* synthetic */ void access$hideOutletSkeleton(SendMoneyExternalActivity sendMoneyExternalActivity) {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = sendMoneyExternalActivity.equals;
        if (ondetachedfromlayoutparams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outletSkeletonScreen");
        }
        ondetachedfromlayoutparams.length();
    }

    public static final /* synthetic */ void access$openWithdrawalDenomPage(SendMoneyExternalActivity sendMoneyExternalActivity, ExternalWithdrawChannelModel externalWithdrawChannelModel) {
        String max = setH5OptionMenuTextFlag.setMin("https://m.dana.id/m/cashout-atm?withdrawPayOption={withdrawPayOption}&withdrawInstId={withdrawInstId}&withdrawInstLocalName={withdrawInstLocalName}").getMin("withdrawPayOption", externalWithdrawChannelModel.getMax).getMin("withdrawInstId", externalWithdrawChannelModel.getMin).getMin("withdrawInstLocalName", externalWithdrawChannelModel.setMax).getMax();
        Intrinsics.checkNotNullExpressionValue(max, "TagFormat.from(DanaUrl.B…me)\n            .format()");
        DanaH5.startContainerFullUrl(max);
    }

    public static final /* synthetic */ void access$openOutletOptionBottomSheet(SendMoneyExternalActivity sendMoneyExternalActivity, ExternalWithdrawChannelModel externalWithdrawChannelModel, boolean z) {
        ChooseImageBridgeExtension.AnonymousClass4.length length2 = ChooseImageBridgeExtension.AnonymousClass4.getMax;
        boolean z2 = sendMoneyExternalActivity.isInside;
        Intrinsics.checkNotNullParameter(externalWithdrawChannelModel, "outletModel");
        ChooseImageBridgeExtension.AnonymousClass4 r2 = new order() {
            @NotNull
            public static final length getMax = new length((byte) 0);
            private HashMap IsOverlapping;
            private boolean equals;
            private boolean getMin;
            /* access modifiers changed from: private */
            public ExternalWithdrawChannelModel toFloatRange;

            private View setMax(int i) {
                if (this.IsOverlapping == null) {
                    this.IsOverlapping = new HashMap();
                }
                View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
                if (view != null) {
                    return view;
                }
                View view2 = getView();
                if (view2 == null) {
                    return null;
                }
                View findViewById = view2.findViewById(i);
                this.IsOverlapping.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }

            public final int getMin() {
                return R.layout.bottom_sheet_outlet_option_coordinator;
            }

            public final float length() {
                return 0.5f;
            }

            @NotNull
            public final FrameLayout getMax() {
                FrameLayout frameLayout = (FrameLayout) setMax(resetInternal.setMax.anyOf);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "fl_container");
                return frameLayout;
            }

            public final void setMax() {
                String str;
                super.setMax();
                Bundle arguments = getArguments();
                if (arguments != null) {
                    this.getMin = arguments.getBoolean("isUserKyc");
                    this.equals = arguments.getBoolean("isSendEnabled");
                    this.toFloatRange = (ExternalWithdrawChannelModel) arguments.getParcelable("outletModel");
                }
                TextView textView = (TextView) setMax(resetInternal.setMax.launchQuerySearch);
                int i = 0;
                if (textView != null) {
                    String string = getString(R.string.sendmoney_outlet_bottomsheet_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sendm…outlet_bottomsheet_title)");
                    Object[] objArr = new Object[1];
                    ExternalWithdrawChannelModel externalWithdrawChannelModel = this.toFloatRange;
                    if (externalWithdrawChannelModel != null) {
                        str = externalWithdrawChannelModel.setMin;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    String format = String.format(string, Arrays.copyOf(objArr, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
                    textView.setText(format);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) setMax(resetInternal.setMax.setView);
                if (appCompatImageView != null) {
                    appCompatImageView.setOnClickListener(new setMin(this));
                }
                DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) setMax(resetInternal.setMax.Mean$Arithmetic);
                if (danaButtonSecondaryView != null) {
                    danaButtonSecondaryView.setOnClickListener(new getMin(this));
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) setMax(resetInternal.setMax.setHeaderTitleInt);
                if (constraintLayout != null) {
                    View view = constraintLayout;
                    if (!this.equals) {
                        i = 8;
                    }
                    view.setVisibility(i);
                    constraintLayout.setOnClickListener(new setMax(this));
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) setMax(resetInternal.setMax.getHeaderIcon);
                if (constraintLayout2 != null) {
                    constraintLayout2.setOnClickListener(new getMax(this));
                }
            }

            public final void setMin() {
                super.setMin();
                setMin(setMin(getDialog()), 3);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.ChooseImageBridgeExtension$4$setMin */
            static final class setMin implements View.OnClickListener {
                final /* synthetic */ AnonymousClass4 setMax;

                setMin(AnonymousClass4 r1) {
                    this.setMax = r1;
                }

                public final void onClick(View view) {
                    this.setMax.dismiss();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.ChooseImageBridgeExtension$4$getMin */
            static final class getMin implements View.OnClickListener {
                final /* synthetic */ AnonymousClass4 getMin;

                getMin(AnonymousClass4 r1) {
                    this.getMin = r1;
                }

                public final void onClick(View view) {
                    this.getMin.dismiss();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/sendmoney/external/SendMoneyOutletOptionBottomSheetDialog$initViews$3$1"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.ChooseImageBridgeExtension$4$setMax */
            static final class setMax implements View.OnClickListener {
                final /* synthetic */ AnonymousClass4 getMin;

                setMax(AnonymousClass4 r1) {
                    this.getMin = r1;
                }

                public final void onClick(View view) {
                    AnonymousClass4.length(this.getMin);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.ChooseImageBridgeExtension$4$getMax */
            static final class getMax implements View.OnClickListener {
                final /* synthetic */ AnonymousClass4 length;

                getMax(AnonymousClass4 r1) {
                    this.length = r1;
                }

                public final void onClick(View view) {
                    ExternalWithdrawChannelModel max = this.length.toFloatRange;
                    if (max != null) {
                        AnonymousClass4.getMin(this.length, max);
                    }
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/sendmoney/external/SendMoneyOutletOptionBottomSheetDialog$Companion;", "", "()V", "IS_SEND_ENABLED", "", "IS_USER_KYC", "OUTLET_MODEL", "TAG", "create", "Lid/dana/sendmoney/external/SendMoneyOutletOptionBottomSheetDialog;", "outletModel", "Lid/dana/sendmoney/model/ExternalWithdrawChannelModel;", "isSendEnabled", "", "isUserKyc", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.ChooseImageBridgeExtension$4$length */
            public static final class length {
                private length() {
                }

                public /* synthetic */ length(byte b) {
                    this();
                }
            }

            public static final /* synthetic */ void length(AnonymousClass4 r1) {
                AddOutletReceiverActivity.setMin setmin = AddOutletReceiverActivity.Companion;
                AddOutletReceiverActivity.setMin.getMin(r1.getActivity());
            }

            public static final /* synthetic */ void getMin(AnonymousClass4 r3, ExternalWithdrawChannelModel externalWithdrawChannelModel) {
                String max = setH5OptionMenuTextFlag.setMin("https://m.dana.id/m/withdraw/otctoken?instId={instId}&errCode={errCode}&KYCStatus={KYCStatus}").getMin(UrlTag.INSTID, externalWithdrawChannelModel.getMin).getMin("errCode", externalWithdrawChannelModel.isInside).getMin("KYCStatus", r3.getMin ? "KYC1" : "KYC0").getMax();
                Intrinsics.checkNotNullExpressionValue(max, "TagFormat.from(DanaUrl.B…())\n            .format()");
                DanaH5.startContainerFullUrl(max);
            }

            public final /* synthetic */ void onDestroyView() {
                super.onDestroyView();
                HashMap hashMap = this.IsOverlapping;
                if (hashMap != null) {
                    hashMap.clear();
                }
            }
        };
        Bundle bundle = new Bundle();
        bundle.putBoolean("isUserKyc", z2);
        bundle.putBoolean("isSendEnabled", z);
        bundle.putParcelable("outletModel", externalWithdrawChannelModel);
        Unit unit = Unit.INSTANCE;
        r2.setArguments(bundle);
        sendMoneyExternalActivity.getMax = r2;
        if (r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outletOptionBottomSheetDialog");
        }
        r2.show(sendMoneyExternalActivity.getSupportFragmentManager(), "SendMoneyOutletOptionBottomSheetDialog");
    }

    public static final /* synthetic */ void access$saveOnboardingDialog(SendMoneyExternalActivity sendMoneyExternalActivity, boolean z) {
        notifyFail.getMin getmin = sendMoneyExternalActivity.sendMoneyExternalPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendMoneyExternalPresenter");
        }
        getmin.length(z);
    }
}
