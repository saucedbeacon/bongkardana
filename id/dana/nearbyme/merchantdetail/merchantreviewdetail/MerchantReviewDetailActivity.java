package id.dana.nearbyme.merchantdetail.merchantreviewdetail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.di.modules.MerchantDetailReviewModule;
import id.dana.nearbyme.merchantdetail.mediaviewer.MediaViewerModel;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerDialog;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerModel;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantAverageRatingView;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverTransActivity;
import o.OptionMenuRecyclerAdapter;
import o.PrepareException;
import o.ShareMenu;
import o.UniformOptionMenuPanelExtensionImpl;
import o.containsFavoriteMenuItem;
import o.dispatchOnCancelled;
import o.hasData;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0)H\u0002J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0016J\b\u0010/\u001a\u00020$H\u0002J\b\u00100\u001a\u00020$H\u0002J\b\u00101\u001a\u00020$H\u0002J\b\u00102\u001a\u00020$H\u0002J\u0010\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020$H\u0002J\b\u00107\u001a\u00020$H\u0002J\u0012\u00108\u001a\u00020$2\b\u00109\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010:\u001a\u00020$H\u0002J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020$2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020\u000bH\u0002J\u0018\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020'H\u0002J\b\u0010D\u001a\u00020$H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006F"}, d2 = {"Lid/dana/nearbyme/merchantdetail/merchantreviewdetail/MerchantReviewDetailActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$View;", "()V", "currentShopModel", "Lid/dana/nearbyme/model/ShopModel;", "getCurrentShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "currentShopModel$delegate", "Lkotlin/Lazy;", "firstPage", "", "hasMore", "loading", "pageSource", "", "getPageSource", "()Ljava/lang/String;", "pageSource$delegate", "reviewAdapter", "Lid/dana/nearbyme/merchantdetail/adapter/MerchantLatestReviewAdapter;", "reviewPresenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$Presenter;", "getReviewPresenter", "()Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$Presenter;", "setReviewPresenter", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$Presenter;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "tracker", "Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "getTracker", "()Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "setTracker", "(Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;)V", "configToolbar", "", "dismissProgress", "getLayout", "", "getListReview", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "list", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "getLoadMoreLogic", "init", "initBackToTopButton", "initInject", "initPageTracking", "initRecycleView", "isFirstItemVisible", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "loadMerchantRating", "loadReviewForFirstTime", "onError", "errorMessage", "onRvReviewScrolled", "onSuccessGetReviewList", "merchantReviewsModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewResultModel;", "onSuccessLoadMoreReview", "setCvBackToTopVisibility", "visible", "shouldLoadMore", "totalItemCount", "lastVisibleItemPosition", "showProgress", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantReviewDetailActivity extends BaseActivity implements UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.length {
    @NotNull
    public static final length Companion = new length((byte) 0);
    @NotNull
    public static final String EXTRA_SHOP_MODEL = "EXTRA_SHOP_MODEL";
    @NotNull
    public static final String EXTRA_SOURCE = "EXTRA_SOURCE";
    public static final int FIRST_POSITION = 0;
    public static final int PAGE_SIZE = 10;
    private onDetachedFromLayoutParams IsOverlapping;
    private boolean equals = true;
    private GriverTransActivity.Lite2 getMax;
    private boolean getMin;
    private final Lazy isInside = LazyKt.lazy(new isInside(this));
    @Inject
    public UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin reviewPresenter;
    private boolean setMax;
    private HashMap toFloatRange;
    private final Lazy toIntRange = LazyKt.lazy(new setMin(this));
    @Inject
    public ShareMenu.AnonymousClass1 tracker;

    /* access modifiers changed from: private */
    public final ShopModel setMin() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-463553876, oncanceled);
            onCancelLoad.getMin(-463553876, oncanceled);
        }
        return (ShopModel) this.toIntRange.getValue();
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(892385650, oncanceled);
            onCancelLoad.getMin(892385650, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled2 = new onCanceled(i, max, 16);
            onCancelLoad.setMax(892385650, oncanceled2);
            onCancelLoad.getMin(892385650, oncanceled2);
        }
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_merchant_review_detail;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mediaViewerModel", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<MediaViewerModel, Unit> {
        final /* synthetic */ MerchantReviewDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(MerchantReviewDetailActivity merchantReviewDetailActivity) {
            super(1);
            this.this$0 = merchantReviewDetailActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MediaViewerModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull MediaViewerModel mediaViewerModel) {
            Intrinsics.checkNotNullParameter(mediaViewerModel, "mediaViewerModel");
            String str = this.this$0.setMin().invoke;
            Intrinsics.checkNotNullExpressionValue(str, "currentShopModel.mainName");
            String str2 = this.this$0.setMin().Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str2, "currentShopModel.merchantId");
            MerchantPhotoViewerModel merchantPhotoViewerModel = new MerchantPhotoViewerModel(str, str2, mediaViewerModel);
            MerchantPhotoViewerDialog.length length = MerchantPhotoViewerDialog.length;
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            MerchantPhotoViewerDialog.length.getMin(supportFragmentManager, merchantPhotoViewerModel);
        }
    }

    @NotNull
    public final ShareMenu.AnonymousClass1 getTracker() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 399030910 == (max = dispatchOnCancelled.getMax(applicationContext, 399030910)))) {
            onCanceled oncanceled = new onCanceled(399030910, max, 512);
            onCancelLoad.setMax(399030910, oncanceled);
            onCancelLoad.getMin(399030910, oncanceled);
        }
        ShareMenu.AnonymousClass1 r0 = this.tracker;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tracker");
        }
        return r0;
    }

    public final void setTracker(@NotNull ShareMenu.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.tracker = r2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/nearbyme/model/ShopModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<ShopModel> {
        final /* synthetic */ MerchantReviewDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(MerchantReviewDetailActivity merchantReviewDetailActivity) {
            super(0);
            this.this$0 = merchantReviewDetailActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r0 = r0.getExtras();
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final id.dana.nearbyme.model.ShopModel invoke() {
            /*
                r3 = this;
                id.dana.nearbyme.merchantdetail.merchantreviewdetail.MerchantReviewDetailActivity r0 = r3.this$0
                android.content.Intent r0 = r0.getIntent()
                r1 = 0
                if (r0 == 0) goto L_0x0018
                android.os.Bundle r0 = r0.getExtras()
                if (r0 == 0) goto L_0x0018
                java.lang.String r2 = "EXTRA_SHOP_MODEL"
                android.os.Parcelable r0 = r0.getParcelable(r2)
                id.dana.nearbyme.model.ShopModel r0 = (id.dana.nearbyme.model.ShopModel) r0
                goto L_0x0019
            L_0x0018:
                r0 = r1
            L_0x0019:
                boolean r2 = r0 instanceof id.dana.nearbyme.model.ShopModel
                if (r2 != 0) goto L_0x001e
                goto L_0x001f
            L_0x001e:
                r1 = r0
            L_0x001f:
                if (r1 != 0) goto L_0x0026
                id.dana.nearbyme.model.ShopModel r1 = new id.dana.nearbyme.model.ShopModel
                r1.<init>()
            L_0x0026:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.merchantdetail.merchantreviewdetail.MerchantReviewDetailActivity.setMin.invoke():id.dana.nearbyme.model.ShopModel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<String> {
        final /* synthetic */ MerchantReviewDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(MerchantReviewDetailActivity merchantReviewDetailActivity) {
            super(0);
            this.this$0 = merchantReviewDetailActivity;
        }

        @NotNull
        public final String invoke() {
            Intent intent = this.this$0.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            String string = extras != null ? extras.getString("EXTRA_SOURCE") : null;
            return string == null ? "" : string;
        }
    }

    @NotNull
    public final UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin getReviewPresenter() {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin = this.reviewPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewPresenter");
        }
        return setmin;
    }

    public final void setReviewPresenter(@NotNull UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.reviewPresenter = setmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ MerchantReviewDetailActivity length;

        getMin(MerchantReviewDetailActivity merchantReviewDetailActivity) {
            this.length = merchantReviewDetailActivity;
        }

        public final void onClick(View view) {
            ((RecyclerView) this.length._$_findCachedViewById(resetInternal.setMax.getSupportImageTintMode)).smoothScrollToPosition(0);
        }
    }

    public final void configToolbar() {
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        setCenterTitle(getResources().getString(R.string.merchant_rating_title));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"id/dana/nearbyme/merchantdetail/merchantreviewdetail/MerchantReviewDetailActivity$onRvReviewScrolled$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends RecyclerView.toIntRange {
        final /* synthetic */ MerchantReviewDetailActivity getMax;
        @NotNull
        private LinearLayoutManager setMax;

        getMax(MerchantReviewDetailActivity merchantReviewDetailActivity) {
            this.getMax = merchantReviewDetailActivity;
            RecyclerView recyclerView = (RecyclerView) merchantReviewDetailActivity._$_findCachedViewById(resetInternal.setMax.getSupportImageTintMode);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_review");
            RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                this.setMax = (LinearLayoutManager) layoutManager;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            MerchantReviewDetailActivity.access$setCvBackToTopVisibility(this.getMax, i2 < 0 && !MerchantReviewDetailActivity.setMin(this.setMax));
            if (this.getMax.setMax(this.setMax.getItemCount(), this.setMax.findLastVisibleItemPosition())) {
                MerchantReviewDetailActivity.access$getLoadMoreLogic(this.getMax);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean setMax(int i, int i2) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-984002813, oncanceled);
            onCancelLoad.getMin(-984002813, oncanceled);
        }
        return this.getMin && !this.equals && !this.setMax && i <= i2 + 1;
    }

    /* access modifiers changed from: private */
    public static boolean setMin(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
    }

    public final void onSuccessGetReviewList(@NotNull OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass2 r3) {
        Intrinsics.checkNotNullParameter(r3, "merchantReviewsModel");
        dismissProgress();
        GriverTransActivity.Lite2 lite2 = this.getMax;
        if (lite2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewAdapter");
        }
        lite2.length(setMax(r3.getMax));
        this.equals = false;
        this.getMin = r3.setMax();
    }

    public final void onSuccessLoadMoreReview(@NotNull OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass2 r4) {
        Intrinsics.checkNotNullParameter(r4, "merchantReviewsModel");
        GriverTransActivity.Lite2 lite2 = this.getMax;
        if (lite2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewAdapter");
        }
        lite2.getMax(false);
        GriverTransActivity.Lite2 lite22 = this.getMax;
        if (lite22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewAdapter");
        }
        lite22.length(setMax(r4.getMax));
        this.getMin = r4.setMax();
        this.setMax = false;
    }

    public final void onError(@Nullable String str) {
        this.getMin = true;
        GriverTransActivity.Lite2 lite2 = this.getMax;
        if (lite2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewAdapter");
        }
        lite2.getMax(false);
        this.setMax = false;
    }

    public final void showProgress() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1942089685, oncanceled);
            onCancelLoad.getMin(1942089685, oncanceled);
        }
        this.IsOverlapping = containsFavoriteMenuItem.getMin((RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportImageTintMode), R.layout.view_skeleton_merchant_latest_view);
    }

    public final void dismissProgress() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1366035214 == (max = dispatchOnCancelled.getMax(applicationContext, -1366035214)))) {
            onCanceled oncanceled = new onCanceled(-1366035214, max, 512);
            onCancelLoad.setMax(-1366035214, oncanceled);
            onCancelLoad.getMin(-1366035214, oncanceled);
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.IsOverlapping;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    private static List<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3> setMax(List<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1> list) {
        Iterable<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r1 : iterable) {
            OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.length length2 = OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.equals;
            Intrinsics.checkNotNullParameter(r1, "data");
            arrayList.add(new OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3(1, r1));
        }
        return (List) arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/nearbyme/merchantdetail/merchantreviewdetail/MerchantReviewDetailActivity$Companion;", "", "()V", "EXTRA_SHOP_MODEL", "", "EXTRA_SOURCE", "FIRST_POSITION", "", "PAGE_SIZE", "openActivity", "", "context", "Landroid/content/Context;", "source", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        public static void length(@NotNull Context context, @NotNull String str, @NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, "source");
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            Intent putExtra = new Intent(context, MerchantReviewDetailActivity.class).putExtra("EXTRA_SOURCE", str).putExtra("EXTRA_SHOP_MODEL", shopModel);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, Merchant…RA_SHOP_MODEL, shopModel)");
            context.startActivity(putExtra);
        }
    }

    public final void init() {
        String str;
        int length2;
        int length3;
        int min;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length3)))) {
            onCanceled oncanceled = new onCanceled(length3, min, 32);
            onCancelLoad.setMax(95568469, oncanceled);
            onCancelLoad.getMin(95568469, oncanceled);
        }
        hasData.setMin setmin = new hasData.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmin.length = applicationComponent;
            setmin.setMax = new MerchantDetailReviewModule(this);
            stopIgnoring.setMin(setmin.setMax, MerchantDetailReviewModule.class);
            stopIgnoring.setMin(setmin.length, PrepareException.AnonymousClass1.class);
            new hasData(setmin.setMax, setmin.length, (byte) 0).getMax(this);
            Context baseContext2 = getBaseContext();
            if (baseContext2 != null) {
                context = baseContext2.getApplicationContext();
            }
            if (!(context == null || (length2 = dispatchOnCancelled.length(context, 0)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(0, length2, 4);
                onCancelLoad.setMax(-107952649, oncanceled2);
                onCancelLoad.getMin(-107952649, oncanceled2);
            }
            ShareMenu.AnonymousClass1 r0 = this.tracker;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tracker");
            }
            String str2 = (String) this.isInside.getValue();
            String str3 = setMin().setMax;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            String str5 = setMin().invoke;
            if (str5 == null) {
                str5 = str4;
            }
            ShopModel min2 = setMin();
            if (min2.extraCallbackWithResult == null || min2.extraCallbackWithResult.isEmpty()) {
                str = str4;
            } else {
                str = min2.getMin(true, " ");
            }
            if (str != null) {
                str4 = str;
            }
            r0.getMax(str2, str3, str5, str4);
            this.getMax = new GriverTransActivity.Lite2(setMin(), new setMax(this));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportImageTintMode);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            GriverTransActivity.Lite2 lite2 = this.getMax;
            if (lite2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reviewAdapter");
            }
            recyclerView.setAdapter(lite2);
            ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportImageTintMode)).addOnScrollListener(new getMax(this));
            ((CardView) _$_findCachedViewById(resetInternal.setMax.CallSuper)).setOnClickListener(new getMin(this));
            MerchantAverageRatingView merchantAverageRatingView = (MerchantAverageRatingView) _$_findCachedViewById(resetInternal.setMax.dismissPopupMenus);
            if (merchantAverageRatingView != null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                merchantAverageRatingView.loadAverageRating(supportFragmentManager, setMin(), true, false);
            }
            showProgress();
            UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin2 = this.reviewPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reviewPresenter");
            }
            String str6 = setMin().Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str6, "currentShopModel.merchantId");
            String str7 = setMin().b;
            Intrinsics.checkNotNullExpressionValue(str7, "currentShopModel.shopId");
            setmin2.length(str6, str7);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$setCvBackToTopVisibility(MerchantReviewDetailActivity merchantReviewDetailActivity, boolean z) {
        CardView cardView = (CardView) merchantReviewDetailActivity._$_findCachedViewById(resetInternal.setMax.CallSuper);
        Intrinsics.checkNotNullExpressionValue(cardView, "cv_back_to_top");
        cardView.setVisibility(z ? 0 : 8);
    }

    public static final /* synthetic */ void access$getLoadMoreLogic(MerchantReviewDetailActivity merchantReviewDetailActivity) {
        merchantReviewDetailActivity.setMax = true;
        GriverTransActivity.Lite2 lite2 = merchantReviewDetailActivity.getMax;
        if (lite2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewAdapter");
        }
        lite2.getMax(true);
        UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin setmin = merchantReviewDetailActivity.reviewPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewPresenter");
        }
        String str = merchantReviewDetailActivity.setMin().Grayscale$Algorithm;
        Intrinsics.checkNotNullExpressionValue(str, "currentShopModel.merchantId");
        String str2 = merchantReviewDetailActivity.setMin().b;
        Intrinsics.checkNotNullExpressionValue(str2, "currentShopModel.shopId");
        setmin.length(str, str2);
    }
}
