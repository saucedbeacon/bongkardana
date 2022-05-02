package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.di.modules.MerchantLatestReviewModule;
import id.dana.nearbyme.merchantdetail.mediaviewer.MediaViewerModel;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerDialog;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverTransActivity;
import o.OptionMenuRecyclerAdapter;
import o.PrepareException;
import o.containsFavoriteMenuItem;
import o.getMsg;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.onGetData;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u001d\u001a\u00020\u0007H\u0016J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001fH\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\u0012\u0010&\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u000eJ\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0016J\u0016\u0010-\u001a\u00020$2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\"0\u001fH\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantLatestReviewView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "adapter", "Lid/dana/nearbyme/merchantdetail/adapter/MerchantLatestReviewAdapter;", "currentShopModel", "Lid/dana/nearbyme/model/ShopModel;", "pageSource", "", "getPageSource", "()Ljava/lang/String;", "setPageSource", "(Ljava/lang/String;)V", "presenter", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantLatestReviewContract$Presenter;", "getPresenter", "()Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantLatestReviewContract$Presenter;", "setPresenter", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantLatestReviewContract$Presenter;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getLayout", "getListReview", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "list", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "hideLatestReviewSection", "", "initRecyclerView", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "loadLatestReview", "shopModel", "loadSkeletonView", "setup", "setupMerchantReviewList", "reviews", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantLatestReviewView extends BaseRichView {
    private HashMap getMax;
    private GriverTransActivity.Lite2 getMin;
    @NotNull
    private String length;
    @Inject
    public getMsg.length presenter;
    /* access modifiers changed from: private */
    public ShopModel setMax;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams setMin;

    @JvmOverloads
    public MerchantLatestReviewView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantLatestReviewView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_latest_review;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mediaViewerModel", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<MediaViewerModel, Unit> {
        final /* synthetic */ MerchantLatestReviewView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(MerchantLatestReviewView merchantLatestReviewView) {
            super(1);
            this.this$0 = merchantLatestReviewView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MediaViewerModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull MediaViewerModel mediaViewerModel) {
            Intrinsics.checkNotNullParameter(mediaViewerModel, "mediaViewerModel");
            String str = this.this$0.setMax.invoke;
            Intrinsics.checkNotNullExpressionValue(str, "currentShopModel.mainName");
            String str2 = this.this$0.setMax.Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str2, "currentShopModel.merchantId");
            MerchantPhotoViewerModel merchantPhotoViewerModel = new MerchantPhotoViewerModel(str, str2, mediaViewerModel);
            MerchantPhotoViewerDialog.length length = MerchantPhotoViewerDialog.length;
            BaseActivity baseActivity = this.this$0.getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "baseActivity.supportFragmentManager");
            MerchantPhotoViewerDialog.length.getMin(supportFragmentManager, merchantPhotoViewerModel);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantLatestReviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantLatestReviewView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = new ShopModel();
        this.length = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantLatestReviewView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = new ShopModel();
        this.length = "";
    }

    @NotNull
    public final getMsg.length getPresenter() {
        getMsg.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length2;
    }

    public final void setPresenter(@NotNull getMsg.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.presenter = length2;
    }

    @NotNull
    public final String getPageSource() {
        return this.length;
    }

    public final void setPageSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.length = str;
    }

    public final void loadLatestReview(@NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        this.setMax = shopModel;
        GriverTransActivity.Lite2 lite2 = new GriverTransActivity.Lite2(this.setMax, new setMax(this));
        this.getMin = lite2;
        if (lite2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        String str = this.length;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        lite2.getMax = str;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportCompoundDrawablesTintMode);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_latest_review");
        GriverTransActivity.Lite2 lite22 = this.getMin;
        if (lite22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView.setAdapter(lite22);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportCompoundDrawablesTintMode);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv_latest_review");
        recyclerView2.setNestedScrollingEnabled(false);
        ShopModel shopModel2 = this.setMax;
        getMsg.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        String str2 = shopModel2.Grayscale$Algorithm;
        Intrinsics.checkNotNullExpressionValue(str2, "merchantId");
        String str3 = shopModel2.b;
        Intrinsics.checkNotNullExpressionValue(str3, FeatureParams.SHOP_ID);
        length2.getMax(str2, str3);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/nearbyme/merchantdetail/viewcomponent/MerchantLatestReviewView$injectComponent$1", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantLatestReviewContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onFinishGetReview", "reviews", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements getMsg.getMax {
        final /* synthetic */ MerchantLatestReviewView getMin;

        getMax(MerchantLatestReviewView merchantLatestReviewView) {
            this.getMin = merchantLatestReviewView;
        }

        public final void setMin(@NotNull List<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "reviews");
            dismissProgress();
            if (list.isEmpty()) {
                MerchantLatestReviewView.access$hideLatestReviewSection(this.getMin);
            } else {
                MerchantLatestReviewView.access$setupMerchantReviewList(this.getMin, list);
            }
        }

        public final void dismissProgress() {
            onDetachedFromLayoutParams access$getSkeletonScreen$p = this.getMin.setMin;
            if (access$getSkeletonScreen$p != null) {
                access$getSkeletonScreen$p.length();
            }
        }

        public final void onError(@Nullable String str) {
            dismissProgress();
            MerchantLatestReviewView.access$hideLatestReviewSection(this.getMin);
        }

        public final void showProgress() {
            onDetachedFromLayoutParams access$getSkeletonScreen$p = this.getMin.setMin;
            if (access$getSkeletonScreen$p != null) {
                access$getSkeletonScreen$p.getMin();
            }
        }
    }

    public final void setup() {
        if (this.setMin == null) {
            this.setMin = containsFavoriteMenuItem.getMin((RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportCompoundDrawablesTintMode), R.layout.view_skeleton_merchant_latest_view);
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        onGetData.setMax setmax = new onGetData.setMax((byte) 0);
        if (r4 != null) {
            setmax.setMax = r4;
            setmax.getMax = new MerchantLatestReviewModule(new getMax(this));
            stopIgnoring.setMin(setmax.getMax, MerchantLatestReviewModule.class);
            stopIgnoring.setMin(setmax.setMax, PrepareException.AnonymousClass1.class);
            new onGetData(setmax.getMax, setmax.setMax, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            getMsg.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = length2;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$hideLatestReviewSection(MerchantLatestReviewView merchantLatestReviewView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) merchantLatestReviewView._$_findCachedViewById(resetInternal.setMax.onCreate);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "cl_merchant_latest_review");
        constraintLayout.setVisibility(8);
    }

    public static final /* synthetic */ void access$setupMerchantReviewList(MerchantLatestReviewView merchantLatestReviewView, List list) {
        boolean z;
        Iterable iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r1 = (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1) it.next();
            OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.length length2 = OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.equals;
            Intrinsics.checkNotNullParameter(r1, "data");
            arrayList.add(new OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3(0, r1));
        }
        List list2 = (List) arrayList;
        GriverTransActivity.Lite2 lite2 = merchantLatestReviewView.getMin;
        if (lite2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        if (list2.size() > 3) {
            z = true;
        }
        lite2.setMin = z;
        GriverTransActivity.Lite2 lite22 = merchantLatestReviewView.getMin;
        if (lite22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        lite22.getMin(CollectionsKt.take(list2, 3));
    }
}
