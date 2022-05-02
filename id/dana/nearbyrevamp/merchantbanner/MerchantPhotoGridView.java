package id.dana.nearbyrevamp.merchantbanner;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.nearbyme.merchantdetail.mediaviewer.MerchantPhotoGalleryActivity;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.containsFavoriteMenuItem;
import o.dispatchOnCancelled;
import o.k;
import o.negativeTextColor;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\u0006\u0010\u001e\u001a\u00020\u0013J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lid/dana/nearbyrevamp/merchantbanner/MerchantPhotoGridView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "photoGalleryAdapter", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryAdapter;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getLayout", "hideShimmer", "", "openGallery", "openMerchantViewerDialog", "position", "setImages", "merchantImages", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "setSpanCount", "spanCount", "setup", "showInitialState", "showShimmer", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantPhotoGridView extends BaseRichView {
    @NotNull
    public static final length Companion = new length((byte) 0);
    private HashMap getMax;
    private ShopModel getMin;
    /* access modifiers changed from: private */
    public negativeTextColor length;
    private onDetachedFromLayoutParams setMax;

    @JvmOverloads
    public MerchantPhotoGridView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantPhotoGridView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_merchant_photo_grid;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ MerchantPhotoGridView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(MerchantPhotoGridView merchantPhotoGridView) {
            super(1);
            this.this$0 = merchantPhotoGridView;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-234269805, oncanceled);
                onCancelLoad.getMin(-234269805, oncanceled);
            }
            int i2 = ((MerchantImageModel) MerchantPhotoGridView.access$getPhotoGalleryAdapter$p(this.this$0).getMax().get(i)).getMin;
            if (i2 == 1) {
                MerchantPhotoGridView.access$openMerchantViewerDialog(this.this$0, i);
            } else if (i2 == 2) {
                MerchantPhotoGridView.access$openGallery(this.this$0);
            }
        }
    }

    public static final /* synthetic */ negativeTextColor access$getPhotoGalleryAdapter$p(MerchantPhotoGridView merchantPhotoGridView) {
        negativeTextColor negativetextcolor = merchantPhotoGridView.length;
        if (negativetextcolor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("photoGalleryAdapter");
        }
        return negativetextcolor;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantPhotoGridView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantPhotoGridView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantPhotoGridView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void setup() {
        this.length = new negativeTextColor(new getMin(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.onAttachedToWindow);
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
            negativeTextColor negativetextcolor = this.length;
            if (negativetextcolor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("photoGalleryAdapter");
            }
            recyclerView.setAdapter(negativetextcolor);
        }
        showInitialState();
    }

    public final void showInitialState() {
        negativeTextColor negativetextcolor = this.length;
        if (negativetextcolor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("photoGalleryAdapter");
        }
        List arrayList = new ArrayList();
        for (int i = 0; i <= 2; i++) {
            arrayList.add(new MerchantImageModel((String) null, (String) null, (String) null, (String) null, 1, 15));
        }
        Unit unit = Unit.INSTANCE;
        negativetextcolor.getMin(arrayList);
        setMax(3);
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
            return;
        }
        MerchantPhotoGridView merchantPhotoGridView = this;
        merchantPhotoGridView.setMax = containsFavoriteMenuItem.getMin((RecyclerView) merchantPhotoGridView._$_findCachedViewById(resetInternal.setMax.onAttachedToWindow), R.layout.item_photo_preview_skeleton);
    }

    private final void setMax(int i) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.onAttachedToWindow);
        RecyclerView.IsOverlapping layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager != null) {
            ((GridLayoutManager) layoutManager).length(i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    public final void setImages(@NotNull ShopModel shopModel, @NotNull List<MerchantImageModel> list) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Intrinsics.checkNotNullParameter(list, "merchantImages");
        this.getMin = shopModel;
        List arrayList = new ArrayList();
        if (list.size() < 3) {
            arrayList.addAll(CollectionsKt.take(list, 1));
        } else {
            arrayList.addAll(CollectionsKt.take(list, 3));
        }
        if (arrayList.size() == 3) {
            arrayList.set(2, MerchantImageModel.setMax((MerchantImageModel) CollectionsKt.last(arrayList)));
        }
        setMax(arrayList.size());
        negativeTextColor negativetextcolor = this.length;
        if (negativetextcolor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("photoGalleryAdapter");
        }
        negativetextcolor.getMin(arrayList);
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyrevamp/merchantbanner/MerchantPhotoGridView$Companion;", "", "()V", "MAX_PREVIEW_SPAN_COUNT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void access$openGallery(MerchantPhotoGridView merchantPhotoGridView) {
        ShopModel shopModel = merchantPhotoGridView.getMin;
        if (shopModel != null) {
            MerchantPhotoGalleryActivity.setMin setmin = MerchantPhotoGalleryActivity.Companion;
            Context context = merchantPhotoGridView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            String str = shopModel.Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str, "merchantId");
            String str2 = shopModel.b;
            Intrinsics.checkNotNullExpressionValue(str2, FeatureParams.SHOP_ID);
            String str3 = shopModel.invoke;
            if (str3 == null) {
                str3 = "";
            }
            merchantPhotoGridView.getContext().startActivity(MerchantPhotoGalleryActivity.setMin.setMax(context, str, str2, str3));
        }
    }

    public static final /* synthetic */ void access$openMerchantViewerDialog(MerchantPhotoGridView merchantPhotoGridView, int i) {
        BaseActivity baseActivity;
        if (merchantPhotoGridView.getMin != null && (baseActivity = merchantPhotoGridView.getBaseActivity()) != null) {
            ShopModel shopModel = merchantPhotoGridView.getMin;
            Intrinsics.checkNotNull(shopModel);
            ShopModel shopModel2 = merchantPhotoGridView.getMin;
            Intrinsics.checkNotNull(shopModel2);
            List<MerchantImageModel> list = shopModel2.getDefaultImpl;
            Intrinsics.checkNotNullExpressionValue(list, "shopModel!!.previewPhotos");
            k.AnonymousClass3.getMax(baseActivity, shopModel, i, list);
        }
    }
}
