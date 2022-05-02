package id.dana.nearbyme.merchantdetail.mediaviewer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.nearbyme.di.module.PhotoGalleryModule;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerDialog;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerModel;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.utils.GridAutofitLayoutManager;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverScreenOrientationProxyImpl;
import o.PrepareException;
import o.WheelView;
import o.dispatchOnCancelled;
import o.negativeListener;
import o.negativeTextColor;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\f\u0010\u001e\u001a\u00020\u0017*\u00020\u001fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lid/dana/nearbyme/merchantdetail/mediaviewer/MerchantPhotoGalleryActivity;", "Lid/dana/base/BaseActivity;", "()V", "merchantId", "", "getMerchantId", "()Ljava/lang/String;", "merchantId$delegate", "Lkotlin/Lazy;", "merchantName", "getMerchantName", "merchantName$delegate", "photoAdapter", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryAdapter;", "presenter", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$Presenter;", "getPresenter", "()Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$Presenter;", "setPresenter", "(Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$Presenter;)V", "getLayout", "", "init", "", "initBackButtonNavigation", "initBackToTopButton", "initRecyclerview", "injectDagger", "openMerchantPhotoViewer", "defaultPosition", "initScrollListener", "Landroidx/recyclerview/widget/RecyclerView;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantPhotoGalleryActivity extends BaseActivity {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    @NotNull
    public static final String EXTRA_MERCHANT_ID = "EXTRA_MERCHANT_ID";
    @NotNull
    public static final String EXTRA_MERCHANT_NAME = "EXTRA_MERCHANT_NAME";
    @NotNull
    public static final String EXTRA_SHOP_ID = "EXTRA_SHOP_ID";
    private HashMap equals;
    /* access modifiers changed from: private */
    public final negativeTextColor getMax = new negativeTextColor(new IsOverlapping(this));
    private final Lazy getMin = LazyKt.lazy(new isInside(this));
    @Inject
    public negativeListener.getMax presenter;
    private final Lazy setMax = LazyKt.lazy(new equals(this));

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_merchant_photo_gallery;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ MerchantPhotoGalleryActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(MerchantPhotoGalleryActivity merchantPhotoGalleryActivity) {
            super(1);
            this.this$0 = merchantPhotoGalleryActivity;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            MerchantPhotoGalleryActivity.access$openMerchantPhotoViewer(this.this$0, i);
        }
    }

    @NotNull
    public final negativeListener.getMax getPresenter() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1515564934 == (max = dispatchOnCancelled.getMax(applicationContext, 1515564934)))) {
            onCanceled oncanceled = new onCanceled(1515564934, max, 512);
            onCancelLoad.setMax(1515564934, oncanceled);
            onCancelLoad.getMin(1515564934, oncanceled);
        }
        negativeListener.getMax getmax = this.presenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmax;
    }

    public final void setPresenter(@NotNull negativeListener.getMax getmax) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1500671634 == (max = dispatchOnCancelled.getMax(applicationContext, 1500671634)))) {
            onCanceled oncanceled = new onCanceled(1500671634, max, 512);
            onCancelLoad.setMax(1500671634, oncanceled);
            onCancelLoad.getMin(1500671634, oncanceled);
        }
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.presenter = getmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<String> {
        final /* synthetic */ MerchantPhotoGalleryActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(MerchantPhotoGalleryActivity merchantPhotoGalleryActivity) {
            super(0);
            this.this$0 = merchantPhotoGalleryActivity;
        }

        @NotNull
        public final String invoke() {
            Intent intent = this.this$0.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            String string = extras != null ? extras.getString(MerchantPhotoGalleryActivity.EXTRA_MERCHANT_NAME) : null;
            return string == null ? "" : string;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function0<String> {
        final /* synthetic */ MerchantPhotoGalleryActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(MerchantPhotoGalleryActivity merchantPhotoGalleryActivity) {
            super(0);
            this.this$0 = merchantPhotoGalleryActivity;
        }

        @NotNull
        public final String invoke() {
            Intent intent = this.this$0.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            String string = extras != null ? extras.getString("EXTRA_MERCHANT_ID") : null;
            return string == null ? "" : string;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ MerchantPhotoGalleryActivity length;

        setMax(MerchantPhotoGalleryActivity merchantPhotoGalleryActivity) {
            this.length = merchantPhotoGalleryActivity;
        }

        public final void onClick(View view) {
            this.length.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ MerchantPhotoGalleryActivity setMax;

        length(MerchantPhotoGalleryActivity merchantPhotoGalleryActivity) {
            this.setMax = merchantPhotoGalleryActivity;
        }

        public final void onClick(View view) {
            ((RecyclerView) this.setMax._$_findCachedViewById(resetInternal.setMax.setTextClassifier)).smoothScrollToPosition(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"id/dana/nearbyme/merchantdetail/mediaviewer/MerchantPhotoGalleryActivity$initScrollListener$1", "Lid/dana/utils/LazyLoadScrollListener$LazyLoadInteraction;", "onScrollingBottom", "", "onScrollingTop", "onTouchBottom", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements WheelView.AnonymousClass1.length {
        final /* synthetic */ MerchantPhotoGalleryActivity getMin;

        getMax(MerchantPhotoGalleryActivity merchantPhotoGalleryActivity) {
            this.getMin = merchantPhotoGalleryActivity;
        }

        public final void getMin() {
            this.getMin.getPresenter().length();
        }

        public final void length() {
            CardView cardView = (CardView) this.getMin._$_findCachedViewById(resetInternal.setMax.CallSuper);
            Intrinsics.checkNotNullExpressionValue(cardView, "cv_back_to_top");
            cardView.setVisibility(0);
        }

        public final void setMin() {
            CardView cardView = (CardView) this.getMin._$_findCachedViewById(resetInternal.setMax.CallSuper);
            Intrinsics.checkNotNullExpressionValue(cardView, "cv_back_to_top");
            cardView.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/nearbyme/merchantdetail/mediaviewer/MerchantPhotoGalleryActivity$injectDagger$1", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$View;", "onMerchantImageLoaded", "", "merchantImages", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements negativeListener.length {
        final /* synthetic */ MerchantPhotoGalleryActivity setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMin(@NotNull List<MerchantImageModel> list, @NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(list, "merchantImages");
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMin(MerchantPhotoGalleryActivity merchantPhotoGalleryActivity) {
            this.setMax = merchantPhotoGalleryActivity;
        }

        public final void getMin(@NotNull List<MerchantImageModel> list) {
            Intrinsics.checkNotNullParameter(list, "merchantImages");
            this.setMax.getMax.getMin(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/nearbyme/merchantdetail/mediaviewer/MerchantPhotoGalleryActivity$Companion;", "", "()V", "EXTRA_MERCHANT_ID", "", "EXTRA_MERCHANT_NAME", "EXTRA_SHOP_ID", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "merchantId", "shopId", "merchantName", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }

        @NotNull
        public static Intent setMax(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            Intrinsics.checkNotNullParameter(str3, BranchLinkConstant.OauthParams.MERCHANT_NAME);
            Intent intent = new Intent(context, MerchantPhotoGalleryActivity.class);
            intent.putExtra("EXTRA_MERCHANT_ID", str);
            intent.putExtra("EXTRA_SHOP_ID", str2);
            intent.putExtra(MerchantPhotoGalleryActivity.EXTRA_MERCHANT_NAME, str3);
            return intent;
        }
    }

    public final void init() {
        int max;
        int length2;
        int min;
        int length3;
        int min2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length3)))) {
            onCanceled oncanceled = new onCanceled(length3, min2, 32);
            onCancelLoad.setMax(1700525187, oncanceled);
            onCancelLoad.getMin(1700525187, oncanceled);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setTextClassifier);
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(361729827, oncanceled2);
            onCancelLoad.getMin(361729827, oncanceled2);
        }
        recyclerView.addOnScrollListener(new RecyclerView.toIntRange(new getMax(this)) {
            private final length setMax;
            private final int setMin = 0;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/utils/LazyLoadScrollListener$LazyLoadInteraction;", "", "onScrollingBottom", "", "onScrollingTop", "onTouchBottom", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.WheelView$1$length */
            public interface length {
                void getMin();

                void length();

                void setMin();
            }

            {
                Intrinsics.checkNotNullParameter(r2, "interaction");
                this.setMax = r2;
            }

            public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                boolean min = setMin(recyclerView);
                if (i2 >= 0 || min) {
                    this.setMax.setMin();
                } else {
                    this.setMax.length();
                }
            }

            public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                if (!recyclerView.canScrollVertically(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) {
                    this.setMax.getMin();
                }
            }

            private final boolean setMin(RecyclerView recyclerView) {
                int i;
                RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
                int i2 = -1;
                if (layoutManager instanceof LinearLayoutManager) {
                    i2 = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    int[] iArr = new int[1];
                    for (int i3 = 0; i3 <= 0; i3++) {
                        iArr[0] = -1;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    if (1 >= staggeredGridLayoutManager.setMax) {
                        for (int i4 = 0; i4 < staggeredGridLayoutManager.setMax; i4++) {
                            StaggeredGridLayoutManager.getMax getmax = staggeredGridLayoutManager.setMin[i4];
                            if (StaggeredGridLayoutManager.this.getMax) {
                                i = getmax.length(getmax.length.size() - 1, -1);
                            } else {
                                i = getmax.length(0, getmax.length.size());
                            }
                            iArr[i4] = i;
                        }
                        i2 = ArraysKt.first(iArr);
                    } else {
                        StringBuilder sb = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
                        sb.append(staggeredGridLayoutManager.setMax);
                        sb.append(", array size:1");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                return i2 == this.setMin;
            }
        });
        Context applicationContext2 = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
        recyclerView.setLayoutManager(new GridAutofitLayoutManager(applicationContext2, DisplayUtil.dip2px(getApplicationContext(), 110.0f)));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.getMax);
        Context baseContext2 = getBaseContext();
        Context applicationContext3 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = applicationContext3.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext3, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1288190488, oncanceled3);
            onCancelLoad.getMin(-1288190488, oncanceled3);
        }
        ((CardView) _$_findCachedViewById(resetInternal.setMax.CallSuper)).setOnClickListener(new length(this));
        ((Toolbar) _$_findCachedViewById(resetInternal.setMax.AppCompatToggleButton)).setNavigationOnClickListener(new setMax(this));
        Context baseContext3 = getBaseContext();
        Context applicationContext4 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext4 == null || -515058908 == (max = dispatchOnCancelled.getMax(applicationContext4, -515058908)))) {
            onCanceled oncanceled4 = new onCanceled(-515058908, max, 512);
            onCancelLoad.setMax(-515058908, oncanceled4);
            onCancelLoad.getMin(-515058908, oncanceled4);
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("EXTRA_SHOP_ID") : null;
        if (string == null) {
            string = "";
        }
        GriverScreenOrientationProxyImpl.getMin getmin = new GriverScreenOrientationProxyImpl.getMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmin.setMax = applicationComponent;
            getmin.length = new PhotoGalleryModule((String) this.setMax.getValue(), string, new getMin(this));
            stopIgnoring.setMin(getmin.length, PhotoGalleryModule.class);
            stopIgnoring.setMin(getmin.setMax, PrepareException.AnonymousClass1.class);
            new GriverScreenOrientationProxyImpl(getmin.length, getmin.setMax, (byte) 0).length(this);
            negativeListener.getMax getmax = this.presenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmax.length();
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$openMerchantPhotoViewer(MerchantPhotoGalleryActivity merchantPhotoGalleryActivity, int i) {
        MerchantPhotoViewerDialog.length length2 = MerchantPhotoViewerDialog.length;
        FragmentManager supportFragmentManager = merchantPhotoGalleryActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        String str = (String) merchantPhotoGalleryActivity.getMin.getValue();
        String str2 = (String) merchantPhotoGalleryActivity.setMax.getValue();
        negativeListener.getMax getmax = merchantPhotoGalleryActivity.presenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        int min = getmax.setMin();
        List max = merchantPhotoGalleryActivity.getMax.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "photoAdapter.items");
        MerchantPhotoViewerDialog.length.getMin(supportFragmentManager, new MerchantPhotoViewerModel(str, str2, new MediaViewerModel(i, 50, min, max)));
    }
}
