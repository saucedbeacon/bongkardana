package id.dana.merchantmanagement.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.challenge.ChallengeControl;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.MerchantManagementModule;
import id.dana.dialog.TwoButtonWithImageDialog;
import id.dana.home.HomeTabActivity;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import id.dana.merchantmanagement.view.richview.ErrorLinkedMerchantListView;
import id.dana.model.CdpContentModel;
import id.dana.tracker.TrackerKey;
import id.dana.usereducation.constant.BottomSheetType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.ConfirmPopup;
import o.ConstraintAttribute$AttributeType;
import o.DialogBridgeExtension;
import o.IntRange;
import o.PrepareException;
import o.SystemInfoBridgeExtension;
import o.TabBarDataStorage;
import o.alert;
import o.click;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.ensureNavButtonView;
import o.evaluate;
import o.genTextSelector;
import o.getCurrentContentInsetEnd;
import o.getScrimColor;
import o.getShortName;
import o.getTopSortedChildren;
import o.layoutChildLeft;
import o.layoutChildRight;
import o.measureChildCollapseMargins;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.onFinished;
import o.prompt;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.setFirstVerticalBias;
import o.setScaleX;
import o.stopIgnoring;
import o.updateCornerMarking;
import o.updateMessageMenuItem;
import o.updatePostLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0001zB\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u000fH\u0002J\u0012\u0010\"\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010#\u001a\u00020\u001eH\u0014J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020)H\u0002J\n\u0010*\u001a\u0004\u0018\u00010+H\u0002J(\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000f2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u000100H\u0002J\b\u00102\u001a\u00020\rH\u0016J\b\u00103\u001a\u00020\u001eH\u0002J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u001eH\u0002J\u001a\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010?\u001a\u00020\u001eH\u0002J\b\u0010@\u001a\u00020\u001eH\u0002J\b\u0010A\u001a\u00020\u001eH\u0002J\b\u0010B\u001a\u00020\u001eH\u0002J\b\u0010C\u001a\u00020\u001eH\u0016J\b\u0010D\u001a\u00020\u001eH\u0002J\b\u0010E\u001a\u00020\u001eH\u0002J\"\u0010F\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020\r2\u0006\u0010:\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\u0012\u0010H\u001a\u00020\u001e2\b\u0010I\u001a\u0004\u0018\u000100H\u0016J\b\u0010J\u001a\u00020\u001eH\u0016J\b\u0010K\u001a\u00020\u001eH\u0016J\b\u0010L\u001a\u00020\u001eH\u0016J\b\u0010M\u001a\u00020\u001eH\u0016J\u0016\u0010N\u001a\u00020\u001e2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0PH\u0016J\u001e\u0010R\u001a\u00020\u001e2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020T0P2\u0006\u0010\u001c\u001a\u00020\rH\u0016J\u001e\u0010U\u001a\u00020\u001e2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020T0P2\u0006\u0010\u001c\u001a\u00020\rH\u0016J\u0010\u0010V\u001a\u00020\u001e2\u0006\u0010W\u001a\u00020XH\u0016J\b\u0010Y\u001a\u00020\u001eH\u0002J\u0010\u0010Z\u001a\u00020\u001e2\u0006\u0010[\u001a\u00020\rH\u0002J\b\u0010\\\u001a\u00020\u001eH\u0002J\b\u0010]\u001a\u00020\u001eH\u0002J\b\u0010^\u001a\u00020\u001eH\u0002J\b\u0010_\u001a\u00020\u001eH\u0002J\u0018\u0010`\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020\r2\u0006\u0010b\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\u001eH\u0002J\b\u0010c\u001a\u00020\u001eH\u0002J@\u0010d\u001a\u00020\u001e2\u0006\u0010e\u001a\u00020\r2\u0006\u0010f\u001a\u00020\r2\u0006\u0010g\u001a\u00020\r2\u0006\u0010h\u001a\u00020\r2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\r2\u0006\u0010l\u001a\u00020\rH\u0002J\u0010\u0010m\u001a\u00020\u001e2\u0006\u0010f\u001a\u000200H\u0002J\b\u0010n\u001a\u00020\u001eH\u0016J\u0010\u0010o\u001a\u00020\u001e2\u0006\u0010p\u001a\u00020TH\u0002J\b\u0010q\u001a\u00020\u001eH\u0016J\b\u0010r\u001a\u00020\u001eH\u0002J\u0010\u0010s\u001a\u00020\u001e2\u0006\u0010t\u001a\u000200H\u0002J\b\u0010u\u001a\u00020\u001eH\u0002J\u001c\u0010v\u001a\u00020\u001e2\u0006\u0010w\u001a\u00020\r2\n\b\u0002\u0010f\u001a\u0004\u0018\u000100H\u0002J\u0010\u0010x\u001a\u00020\u001e2\u0006\u0010t\u001a\u000200H\u0002J\b\u0010y\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006{"}, d2 = {"Lid/dana/merchantmanagement/view/MerchantManagementActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/merchantmanagement/MerchantManagementContract$View;", "()V", "adapter", "Lid/dana/merchantmanagement/adapter/MerchantManagementAdapter;", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "getDynamicUrlWrapper", "()Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "setDynamicUrlWrapper", "(Lid/dana/data/dynamicurl/DynamicUrlWrapper;)V", "itemPositionSelected", "", "loading", "", "pageNumber", "phonePermission", "Lcom/anggrayudi/storage/permission/ActivityPermissionRequest;", "presenter", "Lid/dana/merchantmanagement/MerchantManagementContract$Presenter;", "getPresenter", "()Lid/dana/merchantmanagement/MerchantManagementContract$Presenter;", "setPresenter", "(Lid/dana/merchantmanagement/MerchantManagementContract$Presenter;)V", "showArrowSeeMore", "skeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "totalPageNumber", "animationSlideDownView", "", "view", "Landroid/view/View;", "slideDown", "animationSlideUpView", "configToolbar", "dismissProgress", "dismissShimmerItem", "doLogicShowHideButtonArrow", "doRemoveMerchant", "getAdapterListener", "Lid/dana/merchantmanagement/adapter/LinkedMerchantClickListener;", "getBannerViewHolder", "Lid/dana/merchantmanagement/view/viewholder/BannerViewHolder;", "getEventTrackerModel", "Lid/dana/tracker/EventTrackerModel;", "success", "trackerKey", "", "reason", "getLayout", "getLoadMoreLogic", "getOnScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getOnTryAgainClickListener", "Lid/dana/merchantmanagement/view/richview/ErrorLinkedMerchantListView$OnTryAgainClickListener;", "goToHome", "handleInputPinResult", "resultCode", "data", "Landroid/content/Intent;", "handlePendingInputPin", "handlePendingOrForgotInputPin", "handleSuccessInputPin", "hideCustomSnackbar", "hideSeeMore", "hideSkeleton", "init", "initInject", "initPermission", "onActivityResult", "requestCode", "onError", "errorMessage", "onErrorGetMerchantList", "onErrorGetMoreMerchantList", "onErrorUnbindConsult", "onLinkedMerchantEmpty", "onSuccessGetBannerList", "list", "", "Lid/dana/model/CdpContentModel;", "onSuccessGetMerchantList", "linkedMerchants", "Lid/dana/merchantmanagement/model/LinkedMerchantModel;", "onSuccessGetMoreMerchantList", "onSuccessUnbindConsult", "unbindConsultModel", "Lid/dana/merchantmanagement/model/UnbindConsultModel;", "openTransactionHistory", "renderPage", "pageState", "setViewListener", "setupAdapter", "setupRecyclerView", "setupView", "shouldLoadMore", "totalItemCount", "lastVisibleItemPosition", "showCallCsDialog", "showCustomDialog", "title", "message", "buttonMessage", "logo", "positiveClickListener", "Landroid/view/View$OnClickListener;", "width", "height", "showCustomSnackbar", "showProgress", "showRemoveConfirmationDialog", "item", "showShimmerItem", "showSkeleton", "showSuccessUnbindNotification", "merchantName", "showTransactionPageDialog", "trackEvent", "eventState", "trackLinkedMerchantRequests", "trackLinkedMerchantsOpen", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantManagementActivity extends BaseActivity implements SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMin {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    public static final int SHIMMER_DURATION = 1500;
    /* access modifiers changed from: private */
    public boolean IsOverlapping;
    @Inject
    public getShortName dynamicUrlWrapper;
    private boolean equals;
    /* access modifiers changed from: private */
    public getCurrentContentInsetEnd getMax;
    private onDetachedFromLayoutParams getMin;
    private int isInside;
    @Inject
    public SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax presenter;
    private DialogBridgeExtension setMax;
    /* access modifiers changed from: private */
    public int toFloatRange;
    /* access modifiers changed from: private */
    public int toIntRange = 1;
    private HashMap values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        public static final equals length = new equals();

        equals() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toString implements View.OnClickListener {
        public static final toString setMin = new toString();

        toString() {
        }

        public final void onClick(View view) {
        }
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.values;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(840405136, oncanceled);
            onCancelLoad.getMin(840405136, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(840405136, oncanceled2);
            onCancelLoad.getMin(840405136, oncanceled2);
        }
        if (this.values == null) {
            this.values = new HashMap();
        }
        View view = (View) this.values.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.values.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_merchant_management;
    }

    public final void onError(@Nullable String str) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"id/dana/base/callback/DanaH5CallbackKt$withDanaH5Callback$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerCreated", "", "bundle", "Landroid/os/Bundle;", "onContainerDestroyed", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements setCancelOnTouchOutside$core {
        final /* synthetic */ MerchantManagementActivity getMin;

        public final void onContainerCreated(@Nullable Bundle bundle) {
        }

        public toIntRange(MerchantManagementActivity merchantManagementActivity) {
            this.getMin = merchantManagementActivity;
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
            MerchantManagementActivity.access$goToHome(this.getMin);
        }
    }

    public static final /* synthetic */ getCurrentContentInsetEnd access$getPhonePermission$p(MerchantManagementActivity merchantManagementActivity) {
        getCurrentContentInsetEnd getcurrentcontentinsetend = merchantManagementActivity.getMax;
        if (getcurrentcontentinsetend == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phonePermission");
        }
        return getcurrentcontentinsetend;
    }

    public static final /* synthetic */ void access$goToHome(MerchantManagementActivity merchantManagementActivity) {
        int length2;
        int min;
        int max;
        Context baseContext = merchantManagementActivity.getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 809188273 == (max = dispatchOnCancelled.getMax(applicationContext, 809188273)))) {
            onCanceled oncanceled = new onCanceled(809188273, max, 512);
            onCancelLoad.setMax(809188273, oncanceled);
            onCancelLoad.getMin(809188273, oncanceled);
        }
        Context baseContext2 = merchantManagementActivity.getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(809188273, oncanceled2);
            onCancelLoad.getMin(809188273, oncanceled2);
        }
        Intent intent = new Intent(merchantManagementActivity, HomeTabActivity.class);
        intent.setFlags(67108864);
        merchantManagementActivity.startActivity(intent);
        merchantManagementActivity.finish();
    }

    public static final /* synthetic */ void access$openTransactionHistory(MerchantManagementActivity merchantManagementActivity) {
        int length2;
        Context baseContext = merchantManagementActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1006267647, oncanceled);
            onCancelLoad.getMin(-1006267647, oncanceled);
        }
        getShortName getshortname = merchantManagementActivity.dynamicUrlWrapper;
        if (getshortname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
        }
        String transactionCompletedUrl = getshortname.getTransactionCompletedUrl();
        Intrinsics.checkNotNullExpressionValue(transactionCompletedUrl, "dynamicUrlWrapper.transactionCompletedUrl");
        DanaH5.startContainerFullUrl(transactionCompletedUrl, new toIntRange(merchantManagementActivity));
    }

    public static final /* synthetic */ void access$showRemoveConfirmationDialog(MerchantManagementActivity merchantManagementActivity, alert alert) {
        String str;
        String str2;
        int length2;
        Context baseContext = merchantManagementActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1784611959, oncanceled);
            onCancelLoad.getMin(1784611959, oncanceled);
        }
        Context context = merchantManagementActivity;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (alert.getMin()) {
            str = context.getString(R.string.unbind_lazada_dialog_confirmation_title);
            Intrinsics.checkNotNullExpressionValue(str, "getString(R.string.unbin…ialog_confirmation_title)");
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = context.getString(R.string.unbind_dialog_confirmation_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.unbin…ialog_confirmation_title)");
            str = String.format(string, Arrays.copyOf(new Object[]{alert.length}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        }
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (alert.getMin()) {
            str2 = context.getString(R.string.unbind_lazada_dialog_confirmation_message);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(R.string.unbin…log_confirmation_message)");
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = context.getString(R.string.unbind_dialog_confirmation_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.unbin…log_confirmation_message)");
            str2 = String.format(string2, Arrays.copyOf(new Object[]{alert.length}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        }
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(context);
        setmax.setMin = str;
        setmax.length = str2;
        TwoButtonWithImageDialog.setMax max = setmax.setMax(false).getMax(false);
        max.values = merchantManagementActivity.getString(R.string.remove_label);
        max.toString = new hashCode(merchantManagementActivity, alert);
        max.FastBitmap$CoordinateSystem = merchantManagementActivity.getString(R.string.option_cancel);
        max.hashCode = toString.setMin;
        max.IsOverlapping = true;
        TwoButtonWithImageDialog min = max.getMin();
        Button max2 = min.getMax(-2);
        Intrinsics.checkNotNullExpressionValue(max2, "dialog.getButton(BUTTON_NEGATIVE)");
        max2.setContentDescription(merchantManagementActivity.getString(R.string.btnCancelPopup));
        Button max3 = min.getMax(-1);
        Intrinsics.checkNotNullExpressionValue(max3, "dialog.getButton(BUTTON_POSITIVE)");
        max3.setContentDescription(merchantManagementActivity.getString(R.string.btnRemovePopup));
        min.setMin();
    }

    @NotNull
    public final SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax getPresenter() {
        SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax getmax = this.presenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmax;
    }

    public final void setPresenter(@NotNull SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.presenter = getmax;
    }

    @NotNull
    public final getShortName getDynamicUrlWrapper() {
        getShortName getshortname = this.dynamicUrlWrapper;
        if (getshortname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
        }
        return getshortname;
    }

    public final void setDynamicUrlWrapper(@NotNull getShortName getshortname) {
        Intrinsics.checkNotNullParameter(getshortname, "<set-?>");
        this.dynamicUrlWrapper = getshortname;
    }

    public final void init() {
        int length2;
        int min;
        int length3;
        int min2;
        Context baseContext = getBaseContext();
        RecyclerView.IsOverlapping isOverlapping = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length3)))) {
            onCanceled oncanceled = new onCanceled(length3, min2, 32);
            onCancelLoad.setMax(-567178200, oncanceled);
            onCancelLoad.getMin(-567178200, oncanceled);
        }
        TabBarDataStorage.getMax getmax = new TabBarDataStorage.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmax.setMax = applicationComponent;
            getmax.setMin = new MerchantManagementModule(this);
            stopIgnoring.setMin(getmax.setMin, MerchantManagementModule.class);
            stopIgnoring.setMin(getmax.setMax, PrepareException.AnonymousClass1.class);
            new TabBarDataStorage(getmax.setMin, getmax.setMax, (byte) 0).getMin(this);
            getCurrentContentInsetEnd.setMax setmax = new getCurrentContentInsetEnd.setMax(this);
            String[] strArr = {"android.permission.CALL_PHONE"};
            Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
            getCurrentContentInsetEnd.setMax setmax2 = setmax;
            setmax2.getMin = ArraysKt.toSet((T[]) strArr);
            measureChildCollapseMargins length4 = new length(this);
            Intrinsics.checkNotNullParameter(length4, "callback");
            getCurrentContentInsetEnd.setMax setmax3 = setmax2;
            setmax3.setMin = length4;
            this.getMax = setmax3.setMin();
            DialogBridgeExtension dialogBridgeExtension = new DialogBridgeExtension();
            this.setMax = dialogBridgeExtension;
            if (dialogBridgeExtension == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            prompt getmax2 = new getMax(this);
            Intrinsics.checkNotNullParameter(getmax2, "<set-?>");
            dialogBridgeExtension.setMin = getmax2;
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setProvider);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setHasFixedSize(false);
                recyclerView.setFocusable(false);
                Context baseContext2 = getBaseContext();
                Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
                if (!(applicationContext2 == null || (length2 = applicationContext2.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext2, length2)))) {
                    onCanceled oncanceled2 = new onCanceled(length2, min, 32);
                    onCancelLoad.setMax(1799639736, oncanceled2);
                    onCancelLoad.getMin(1799639736, oncanceled2);
                }
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setProvider);
                if (recyclerView2 != null) {
                    isOverlapping = recyclerView2.getLayoutManager();
                }
                if (isOverlapping != null) {
                    recyclerView.addOnScrollListener(new getMin(this, (LinearLayoutManager) isOverlapping));
                    recyclerView.setAdapter(recyclerView.getAdapter());
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
            }
            ErrorLinkedMerchantListView errorLinkedMerchantListView = (ErrorLinkedMerchantListView) _$_findCachedViewById(resetInternal.setMax.IdRes);
            if (errorLinkedMerchantListView != null) {
                errorLinkedMerchantListView.setOnTryAgainClickListener(new setMin(this));
            }
            convertDipToPx.length length5 = new convertDipToPx.length(this);
            length5.getMax = TrackerKey.Event.LINKED_ACCOUNTS_OPEN;
            convertDipToPx.length max = length5.setMax(TrackerKey.MerchantManagementProperties.APP_NAME, TrackerKey.DanaBalanceRecipientTypeProperty.DANA);
            max.setMin();
            genTextSelector.getMax(new convertDipToPx(max, (byte) 0));
            SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax getmax3 = this.presenter;
            if (getmax3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmax3.getMin(this.toIntRange);
            return;
        }
        throw null;
    }

    public final void configToolbar() {
        setCenterTitle(getString(R.string.merchant_management_title));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    public final void onSuccessGetMerchantList(@NotNull List<alert> list, int i) {
        Intrinsics.checkNotNullParameter(list, "linkedMerchants");
        setMax(1);
        this.isInside = i;
        List arrayList = new ArrayList();
        DialogBridgeExtension dialogBridgeExtension = this.setMax;
        if (dialogBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        if (dialogBridgeExtension.getItemCount() == 0) {
            arrayList.add(new alert((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 3, 127));
        }
        arrayList.addAll(list);
        DialogBridgeExtension dialogBridgeExtension2 = this.setMax;
        if (dialogBridgeExtension2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        dialogBridgeExtension2.getMax(arrayList);
        SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax getmax = this.presenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmax.length();
        new Handler(Looper.getMainLooper()).postDelayed(new isInside(this), 300);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements Runnable {
        final /* synthetic */ MerchantManagementActivity setMax;

        isInside(MerchantManagementActivity merchantManagementActivity) {
            this.setMax = merchantManagementActivity;
        }

        public final void run() {
            MerchantManagementActivity.getMax(this.setMax._$_findCachedViewById(resetInternal.setMax.hitCount), false);
            MerchantManagementActivity.access$doLogicShowHideButtonArrow(this.setMax);
        }
    }

    public final void onSuccessGetMoreMerchantList(@NotNull List<alert> list, int i) {
        Intrinsics.checkNotNullParameter(list, "linkedMerchants");
        this.isInside = i;
        DialogBridgeExtension dialogBridgeExtension = this.setMax;
        if (dialogBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        dialogBridgeExtension.getMax(list);
        setMax();
    }

    public final void onErrorGetMerchantList() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-247752972, oncanceled);
            onCancelLoad.getMin(-247752972, oncanceled);
        }
        setMax(2);
    }

    public final void onErrorGetMoreMerchantList() {
        this.toIntRange--;
        showWarningDialog(getString(R.string.home_error));
    }

    public final void onLinkedMerchantEmpty() {
        setMax(3);
    }

    public final void onSuccessUnbindConsult(@NotNull onFinished onfinished) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(222695624, oncanceled);
            onCancelLoad.getMin(222695624, oncanceled);
        }
        Intrinsics.checkNotNullParameter(onfinished, "unbindConsultModel");
        ChallengeControl.length length3 = new ChallengeControl.length((BaseActivity) this);
        length3.getMin = "unbind_merchant";
        ChallengeControl.length length4 = length3;
        length4.setMax = "unbind_merchant";
        Intrinsics.checkNotNullParameter(onfinished, "unbindConsultModel");
        ChallengeControl.length length5 = length4;
        length5.invoke = onfinished.getMin;
        length5.Grayscale$Algorithm = onfinished.getMax;
        length5.invokeSuspend = onfinished.setMin;
        length5.IsOverlapping = onfinished.setMax;
        length5.setMin = onfinished.length;
        new ChallengeControl(length5, (byte) 0).getMin();
    }

    public final void onErrorUnbindConsult() {
        showWarningDialog(getString(R.string.home_error));
    }

    public final void onSuccessGetBannerList(@NotNull List<? extends CdpContentModel> list) {
        int i;
        List<? extends CdpContentModel> list2 = list;
        Intrinsics.checkNotNullParameter(list2, BottomSheetType.LIST);
        DialogBridgeExtension dialogBridgeExtension = this.setMax;
        if (dialogBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        if (dialogBridgeExtension.setMax()) {
            List max = dialogBridgeExtension.getMax();
            if (max != null) {
                alert alert = r5;
                alert alert2 = new alert((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 4, 127);
                i = 1;
                max.add(1, alert);
            } else {
                i = 1;
            }
            dialogBridgeExtension.notifyItemInserted(i);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new toFloatRange(this, list2), 250);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements Runnable {
        final /* synthetic */ MerchantManagementActivity getMax;
        final /* synthetic */ List length;

        toFloatRange(MerchantManagementActivity merchantManagementActivity, List list) {
            this.getMax = merchantManagementActivity;
            this.length = list;
        }

        public final void run() {
            DialogBridgeExtension.AnonymousClass1 access$getBannerViewHolder = MerchantManagementActivity.access$getBannerViewHolder(this.getMax);
            if (access$getBannerViewHolder != null) {
                List list = this.length;
                Intrinsics.checkNotNullParameter(list, "listBanner");
                if (!list.isEmpty()) {
                    String str = ((CdpContentModel) CollectionsKt.first(list)).setMax;
                    Intrinsics.checkNotNullExpressionValue(str, "listBanner.first().contentValue");
                    Intrinsics.checkNotNullParameter(str, "url");
                    ImageView imageView = access$getBannerViewHolder.getMax;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("promotionImage");
                    }
                    updateMessageMenuItem<Bitmap> max = ((updateCornerMarking) Glide.setMin((View) imageView)).equals().length(str).setMax(evaluate.getMax);
                    Intrinsics.checkNotNullExpressionValue(max, "GlideApp\n            .wi…gy(DiskCacheStrategy.ALL)");
                    Context context = access$getBannerViewHolder.length;
                    Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                    float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.f26342131165288);
                    getTopSortedChildren max2 = max.setMax((updatePostLayout<Bitmap>) new setScaleX(new ConstraintAttribute$AttributeType(dimensionPixelSize, dimensionPixelSize)));
                    Intrinsics.checkNotNullExpressionValue(max2, "request.transform(\n     …ansformation())\n        )");
                    setFirstVerticalBias setfirstverticalbias = (setFirstVerticalBias) max2;
                    ImageView imageView2 = access$getBannerViewHolder.getMax;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("promotionImage");
                    }
                    setfirstverticalbias.length(imageView2);
                }
            }
        }
    }

    public final void showShimmerItem() {
        this.equals = true;
        DialogBridgeExtension dialogBridgeExtension = this.setMax;
        if (dialogBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        dialogBridgeExtension.getMax().add(new alert((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, 255));
        dialogBridgeExtension.notifyDataSetChanged();
    }

    public final void dismissShimmerItem() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1634285777, oncanceled);
            onCancelLoad.getMin(1634285777, oncanceled);
        }
        DialogBridgeExtension dialogBridgeExtension = this.setMax;
        if (dialogBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        dialogBridgeExtension.getMax(dialogBridgeExtension.getMax().size() - 1);
        dialogBridgeExtension.notifyDataSetChanged();
        this.equals = false;
    }

    public final void showProgress() {
        int length2;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 365362351 == (max = dispatchOnCancelled.getMax(applicationContext, 365362351)))) {
            onCanceled oncanceled = new onCanceled(365362351, max, 512);
            onCancelLoad.setMax(365362351, oncanceled);
            onCancelLoad.getMin(365362351, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(960467159, oncanceled2);
            onCancelLoad.getMin(960467159, oncanceled2);
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams == null) {
            getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) _$_findCachedViewById(resetInternal.setMax.setProvider));
            DialogBridgeExtension dialogBridgeExtension = this.setMax;
            if (dialogBridgeExtension == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            getmax.length = dialogBridgeExtension;
            getmax.getMax = R.layout.view_merchant_skeleton;
            getmax.IsOverlapping = 1500;
            getmax.setMin = 10;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.toIntRange = 0;
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            this.getMin = getscrimcolor;
        } else if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-944387111, oncanceled);
            onCancelLoad.getMin(-944387111, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1003) {
            length(i2, intent);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0052, code lost:
        if (r0.equals(id.dana.constants.ErrorCode.SHOULD_CALL_CS_4) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        if (r0.equals(id.dana.constants.ErrorCode.SHOULD_CALL_CS_3) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        if (r0.equals(id.dana.constants.ErrorCode.SHOULD_CALL_CS_2) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006d, code lost:
        if (r0.equals(id.dana.constants.ErrorCode.SHOULD_CALL_CS_1) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        r0 = r12;
        getMin(id.dana.R.string.title_call_cs, id.dana.R.string.description_call_cs, id.dana.R.string.button_call_cs, id.dana.R.drawable.ic_call_cs, new id.dana.merchantmanagement.view.MerchantManagementActivity.IsOverlapping(r12), o.isLineVisible.length(r0, 128.0f), o.isLineVisible.length(r0, 128.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        if (r0.equals(id.dana.constants.ErrorCode.SHOULD_CALL_CS_5) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void getMax(android.content.Intent r13) {
        /*
            r12 = this;
            java.lang.String r0 = "errorCode"
            java.lang.String r0 = r13.getStringExtra(r0)
            java.lang.String r1 = "message"
            if (r0 != 0) goto L_0x000c
            goto L_0x0093
        L_0x000c:
            int r2 = r0.hashCode()
            r3 = 1124073472(0x43000000, float:128.0)
            switch(r2) {
                case 100204731: goto L_0x0067;
                case 100205848: goto L_0x005e;
                case 100205849: goto L_0x0055;
                case 100205938: goto L_0x004c;
                case 408588460: goto L_0x0043;
                case 995396396: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0093
        L_0x0017:
            java.lang.String r2 = "AE13101858018202"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0093
            r5 = 2131889109(0x7f120bd5, float:1.9412872E38)
            r6 = 2131886816(0x7f1202e0, float:1.9408222E38)
            r7 = 2131886554(0x7f1201da, float:1.940769E38)
            r8 = 2131232192(0x7f0805c0, float:1.8080486E38)
            id.dana.merchantmanagement.view.MerchantManagementActivity$toDoubleRange r0 = new id.dana.merchantmanagement.view.MerchantManagementActivity$toDoubleRange
            r0.<init>(r12)
            r9 = r0
            android.view.View$OnClickListener r9 = (android.view.View.OnClickListener) r9
            r0 = r12
            android.app.Activity r0 = (android.app.Activity) r0
            int r10 = o.isLineVisible.length(r0, r3)
            int r11 = o.isLineVisible.length(r0, r3)
            r4 = r12
            r4.getMin(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x009d
        L_0x0043:
            java.lang.String r2 = "AE15101858018002"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0093
            goto L_0x006f
        L_0x004c:
            java.lang.String r2 = "AE11112060005182"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0093
            goto L_0x006f
        L_0x0055:
            java.lang.String r2 = "AE11112060005156"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0093
            goto L_0x006f
        L_0x005e:
            java.lang.String r2 = "AE11112060005155"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0093
            goto L_0x006f
        L_0x0067:
            java.lang.String r2 = "AE11112060005004"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0093
        L_0x006f:
            r5 = 2131889098(0x7f120bca, float:1.941285E38)
            r6 = 2131886815(0x7f1202df, float:1.940822E38)
            r7 = 2131886551(0x7f1201d7, float:1.9407684E38)
            r8 = 2131231772(0x7f08041c, float:1.8079634E38)
            id.dana.merchantmanagement.view.MerchantManagementActivity$IsOverlapping r0 = new id.dana.merchantmanagement.view.MerchantManagementActivity$IsOverlapping
            r0.<init>(r12)
            r9 = r0
            android.view.View$OnClickListener r9 = (android.view.View.OnClickListener) r9
            r0 = r12
            android.app.Activity r0 = (android.app.Activity) r0
            int r10 = o.isLineVisible.length(r0, r3)
            int r11 = o.isLineVisible.length(r0, r3)
            r4 = r12
            r4.getMin(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x009d
        L_0x0093:
            java.lang.String r0 = r13.getStringExtra(r1)
            if (r0 != 0) goto L_0x009a
            return
        L_0x009a:
            r12.showWarningDialog(r0)
        L_0x009d:
            r0 = 2
            java.lang.String r13 = r13.getStringExtra(r1)
            r12.getMin((int) r0, (java.lang.String) r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.merchantmanagement.view.MerchantManagementActivity.getMax(android.content.Intent):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange implements View.OnClickListener {
        final /* synthetic */ MerchantManagementActivity setMin;

        toDoubleRange(MerchantManagementActivity merchantManagementActivity) {
            this.setMin = merchantManagementActivity;
        }

        public final void onClick(View view) {
            MerchantManagementActivity.access$openTransactionHistory(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ MerchantManagementActivity getMax;

        IsOverlapping(MerchantManagementActivity merchantManagementActivity) {
            this.getMax = merchantManagementActivity;
        }

        public final void onClick(View view) {
            MerchantManagementActivity.access$getPhonePermission$p(this.getMax).setMax();
        }
    }

    private final void setMax(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        int i2 = 8;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1999191479, oncanceled);
            onCancelLoad.getMin(-1999191479, oncanceled);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(1 == i ? 0 : 8);
        }
        ErrorLinkedMerchantListView errorLinkedMerchantListView = (ErrorLinkedMerchantListView) _$_findCachedViewById(resetInternal.setMax.IdRes);
        if (errorLinkedMerchantListView != null) {
            errorLinkedMerchantListView.setVisibility(2 == i ? 0 : 8);
        }
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.fillInStackTrace);
        if (_$_findCachedViewById != null) {
            if (3 == i) {
                i2 = 0;
            }
            _$_findCachedViewById.setVisibility(i2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¨\u0006\u000f"}, d2 = {"id/dana/merchantmanagement/view/MerchantManagementActivity$initPermission$1", "Lcom/anggrayudi/storage/permission/PermissionCallback;", "onDisplayConsentDialog", "", "request", "Lcom/anggrayudi/storage/permission/PermissionRequest;", "onPermissionsChecked", "result", "Lcom/anggrayudi/storage/permission/PermissionResult;", "fromSystemDialog", "", "onShouldRedirectToSystemSettings", "blockedPermissions", "", "Lcom/anggrayudi/storage/permission/PermissionReport;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements measureChildCollapseMargins {
        final /* synthetic */ MerchantManagementActivity getMin;

        public final void onShouldRedirectToSystemSettings(@NotNull List<ensureNavButtonView> list) {
            Intrinsics.checkNotNullParameter(list, "blockedPermissions");
        }

        length(MerchantManagementActivity merchantManagementActivity) {
            this.getMin = merchantManagementActivity;
        }

        public final void onPermissionsChecked(@NotNull layoutChildRight layoutchildright, boolean z) {
            Intrinsics.checkNotNullParameter(layoutchildright, "result");
            boolean max = layoutchildright.getMax();
            if (max) {
                click.getMin(this.getMin, "1500445", max);
            }
        }

        public final void onDisplayConsentDialog(@NotNull layoutChildLeft layoutchildleft) {
            Intrinsics.checkNotNullParameter(layoutchildleft, RequestPermissionsEvent.REQUEST);
            layoutchildleft.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/merchantmanagement/view/MerchantManagementActivity$getAdapterListener$1", "Lid/dana/merchantmanagement/adapter/LinkedMerchantClickListener;", "onButtonRemoveClicked", "", "item", "Lid/dana/merchantmanagement/model/LinkedMerchantModel;", "itemPosition", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements prompt {
        final /* synthetic */ MerchantManagementActivity getMax;

        getMax(MerchantManagementActivity merchantManagementActivity) {
            this.getMax = merchantManagementActivity;
        }

        public final void getMin(@NotNull alert alert, int i) {
            Intrinsics.checkNotNullParameter(alert, "item");
            this.getMax.toFloatRange = i;
            MerchantManagementActivity.access$showRemoveConfirmationDialog(this.getMax, alert);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"id/dana/merchantmanagement/view/MerchantManagementActivity$getOnScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends RecyclerView.toIntRange {
        final /* synthetic */ LinearLayoutManager getMax;
        final /* synthetic */ MerchantManagementActivity getMin;

        getMin(MerchantManagementActivity merchantManagementActivity, LinearLayoutManager linearLayoutManager) {
            this.getMin = merchantManagementActivity;
            this.getMax = linearLayoutManager;
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i == 0) {
                MerchantManagementActivity.access$doLogicShowHideButtonArrow(this.getMin);
            } else if (i == 1) {
                this.getMin.getMax();
            }
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            int itemCount = this.getMax.getItemCount();
            int findLastVisibleItemPosition = this.getMax.findLastVisibleItemPosition();
            this.getMin.IsOverlapping = findLastVisibleItemPosition < itemCount + -1;
            if (this.getMin.getMin(itemCount, findLastVisibleItemPosition)) {
                MerchantManagementActivity.access$getLoadMoreLogic(this.getMin);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean getMin(int i, int i2) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(856493981, oncanceled);
            onCancelLoad.getMin(856493981, oncanceled);
        }
        return !this.equals && (i <= i2 + 3);
    }

    static /* synthetic */ void trackEvent$default(MerchantManagementActivity merchantManagementActivity, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        merchantManagementActivity.getMin(i, str);
    }

    private final void getMin(int i, String str) {
        int length2;
        Context baseContext = getBaseContext();
        convertDipToPx convertdiptopx = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1579525119, oncanceled);
            onCancelLoad.getMin(1579525119, oncanceled);
        }
        if (i == 1) {
            convertdiptopx = getMax(true, "Date", ConfirmPopup.AnonymousClass1.setMax("yyyy-MM-dd HH:mm:ss"));
        } else if (i == 2) {
            convertdiptopx = getMax(false, TrackerKey.Property.FAIL_REASON, str);
        }
        if (convertdiptopx != null) {
            List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        }
    }

    static /* synthetic */ convertDipToPx getEventTrackerModel$default(MerchantManagementActivity merchantManagementActivity, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return merchantManagementActivity.getMax(z, str, str2);
    }

    private final convertDipToPx getMax(boolean z, String str, String str2) {
        convertDipToPx.length length2 = new convertDipToPx.length(getApplicationContext());
        length2.getMax = TrackerKey.Event.LINKED_ACCOUNTS_RESULT;
        convertDipToPx.length max = length2.setMin("Success", z).setMax(str, str2).setMax();
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        Intrinsics.checkNotNullExpressionValue(convertdiptopx, "EventTrackerModel.Builde…pe()\n            .build()");
        return convertdiptopx;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements View.OnClickListener {
        final /* synthetic */ MerchantManagementActivity length;
        final /* synthetic */ alert setMin;

        hashCode(MerchantManagementActivity merchantManagementActivity, alert alert) {
            this.length = merchantManagementActivity;
            this.setMin = alert;
        }

        public final void onClick(View view) {
            MerchantManagementActivity.access$trackLinkedMerchantRequests(this.length, this.setMin.length);
            this.length.getPresenter().length(this.setMin.IsOverlapping, this.setMin.setMax, this.setMin.setMin);
        }
    }

    private final void getMin(int i, int i2, int i3, int i4, View.OnClickListener onClickListener, int i5, int i6) {
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(this);
        setmax.setMin = getString(i);
        setmax.length = getString(i2);
        setmax.equals = i4;
        setmax.isInside = i5;
        setmax.toFloatRange = i6;
        TwoButtonWithImageDialog.setMax max = setmax.setMax(false).getMax(false);
        max.values = getString(i3);
        max.toString = onClickListener;
        max.FastBitmap$CoordinateSystem = getString(R.string.option_cancel);
        max.hashCode = equals.length;
        max.getMin().setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/merchantmanagement/view/MerchantManagementActivity$getOnTryAgainClickListener$1", "Lid/dana/merchantmanagement/view/richview/ErrorLinkedMerchantListView$OnTryAgainClickListener;", "onTryAgainClick", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements ErrorLinkedMerchantListView.setMax {
        final /* synthetic */ MerchantManagementActivity setMin;

        setMin(MerchantManagementActivity merchantManagementActivity) {
            this.setMin = merchantManagementActivity;
        }

        public final void length() {
            this.setMin.toIntRange = 1;
            this.setMin.getPresenter().getMin(this.setMin.toIntRange);
        }
    }

    private final void setMax() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(685250929, oncanceled);
            onCancelLoad.getMin(685250929, oncanceled);
        }
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.getCardElevation);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(0);
            _$_findCachedViewById.animate().translationY(0.0f);
        }
    }

    /* access modifiers changed from: private */
    public final void getMax() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1988280315 == (max = dispatchOnCancelled.getMax(applicationContext, 1988280315)))) {
            onCanceled oncanceled = new onCanceled(1988280315, max, 512);
            onCancelLoad.setMax(1988280315, oncanceled);
            onCancelLoad.getMin(1988280315, oncanceled);
        }
        getMax(_$_findCachedViewById(resetInternal.setMax.getCardElevation), true);
    }

    /* access modifiers changed from: private */
    public static void getMax(View view, boolean z) {
        if (view != null) {
            view.animate().translationY(((float) view.getHeight()) * 2.0f * ((float) (z ? 1 : -1)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rXT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/merchantmanagement/view/MerchantManagementActivity$Companion;", "", "()V", "ANIMATING_START_POSITION", "", "DATE_FORMAT", "", "EMPTY_GET_MERCHANTS_STATE", "", "ERROR_GET_MERCHANTS_STATE", "EVENT_UNBIND_MERCHANT_ERROR", "EVENT_UNBIND_MERCHANT_SUCCESS", "LENGTH_SHORT_DURATION", "", "LOAD_MORE_THRESHOLD", "PAGE_SIZE", "SHIMMER_DURATION", "SUCCESS_GET_MERCHANTS_STATE", "TIME_DELAY_AFTER_ADD_BANNER", "TIME_DELAY_AFTER_ADD_LINKED_MERCHANTS", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    private final void length(int i, Intent intent) {
        String str;
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(1747309527, oncanceled);
            onCancelLoad.getMin(1747309527, oncanceled);
        }
        if (i == -1) {
            DialogBridgeExtension dialogBridgeExtension = this.setMax;
            if (dialogBridgeExtension == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            alert alert = (alert) dialogBridgeExtension.setMin(this.toFloatRange);
            if (alert == null || (str = alert.length) == null) {
                str = getString(R.string.merchant_management_title);
                Intrinsics.checkNotNullExpressionValue(str, "getString(\n             …ement_title\n            )");
            }
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
                onCanceled oncanceled2 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(-853528804, oncanceled2);
                onCancelLoad.getMin(-853528804, oncanceled2);
            }
            String string = getString(R.string.success_unbind_notification_message, new Object[]{str});
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.succe…on_message, merchantName)");
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled3 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(570474858, oncanceled3);
                onCancelLoad.getMin(570474858, oncanceled3);
            }
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getThumbTintMode);
            if (textView != null) {
                textView.setText(string);
            }
            View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.hitCount);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
                _$_findCachedViewById.animate().translationY(0.0f);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new MerchantManagementActivity$FastBitmap$CoordinateSystem(this), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            DialogBridgeExtension dialogBridgeExtension2 = this.setMax;
            if (dialogBridgeExtension2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            dialogBridgeExtension2.getMax(this.toFloatRange);
            DialogBridgeExtension dialogBridgeExtension3 = this.setMax;
            if (dialogBridgeExtension3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            if (dialogBridgeExtension3.setMin()) {
                setMax(3);
            }
            trackEvent$default(this, 1, (String) null, 2, (Object) null);
        } else if (i == 0 && intent != null) {
            String stringExtra = intent.getStringExtra(ChallengeControl.Key.CANCEL_REASON);
            if (stringExtra != null && stringExtra.hashCode() == -305104263 && stringExtra.equals("forgot_pin")) {
                getCurrentContentInsetEnd getcurrentcontentinsetend = this.getMax;
                if (getcurrentcontentinsetend == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("phonePermission");
                }
                getcurrentcontentinsetend.setMax();
                return;
            }
            getMax(intent);
        }
    }

    public static final /* synthetic */ void access$doLogicShowHideButtonArrow(MerchantManagementActivity merchantManagementActivity) {
        if (merchantManagementActivity.IsOverlapping) {
            merchantManagementActivity.setMax();
        } else {
            merchantManagementActivity.getMax();
        }
    }

    public static final /* synthetic */ DialogBridgeExtension.AnonymousClass1 access$getBannerViewHolder(MerchantManagementActivity merchantManagementActivity) {
        DialogBridgeExtension dialogBridgeExtension = merchantManagementActivity.setMax;
        if (dialogBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        List max = dialogBridgeExtension.getMax();
        int i = -1;
        if (max != null) {
            Iterator it = max.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((alert) it.next()).equals == 4) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        RecyclerView.valueOf findViewHolderForLayoutPosition = ((RecyclerView) merchantManagementActivity._$_findCachedViewById(resetInternal.setMax.setProvider)).findViewHolderForLayoutPosition(i);
        if (!(findViewHolderForLayoutPosition instanceof DialogBridgeExtension.AnonymousClass1)) {
            findViewHolderForLayoutPosition = null;
        }
        return (DialogBridgeExtension.AnonymousClass1) findViewHolderForLayoutPosition;
    }

    public static final /* synthetic */ void access$getLoadMoreLogic(MerchantManagementActivity merchantManagementActivity) {
        int i = merchantManagementActivity.isInside;
        int i2 = merchantManagementActivity.toIntRange;
        if (1 <= i2 && i > i2) {
            SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax getmax = merchantManagementActivity.presenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            int i3 = merchantManagementActivity.toIntRange + 1;
            merchantManagementActivity.toIntRange = i3;
            getmax.length(i3);
        }
    }

    public static final /* synthetic */ void access$trackLinkedMerchantRequests(MerchantManagementActivity merchantManagementActivity, String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(merchantManagementActivity);
        length2.getMax = TrackerKey.Event.LINKED_ACCOUNTS_REQUEST;
        convertDipToPx.length max = length2.setMax("Merchant Name", str);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }
}
