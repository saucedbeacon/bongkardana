package id.dana.nearbyme.merchantdetail.merchantphoto;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.OnClick;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.component.MerchantPhotoModule;
import id.dana.nearbyme.merchantdetail.mediaviewer.MediaViewerModel;
import id.dana.nearbyme.merchantdetail.mediaviewer.MerchantPhotoGalleryActivity;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerDialog;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.FeedbackMenu;
import o.GriverBaseFragment;
import o.GriverPageLoadingExtension;
import o.PrepareException;
import o.canHotUpdate;
import o.cancelListener;
import o.containsFavoriteMenuItem;
import o.isRAndAbove;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\u0012\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0006\u0010(\u001a\u00020#J\b\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020#H\u0007J\b\u0010+\u001a\u00020#H\u0002J\u0016\u0010,\u001a\u00020#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\b\u00100\u001a\u00020#H\u0016R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotosView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoAdapter;", "merchantPhotosPresenter", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotosPresenter;", "getMerchantPhotosPresenter", "()Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotosPresenter;", "setMerchantPhotosPresenter", "(Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotosPresenter;)V", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "setShopModel", "(Lid/dana/nearbyme/model/ShopModel;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "createMediaViewerModel", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "selectedPosition", "createMerchantPhotoViewerModel", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoViewerModel;", "mediaViewerModel", "getLayout", "hideView", "", "initRecyclerView", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "loadImages", "loadSkeletonView", "onClick", "openMerchantPhotoGallery", "provideHeaderImageToDetailActivity", "images", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantPhotosView extends BaseRichView {
    /* access modifiers changed from: private */
    public cancelListener getMax;
    @Nullable
    private ShopModel getMin;
    private HashMap length;
    @Inject
    public FeedbackMenu.AnonymousClass1 merchantPhotosPresenter;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams setMax;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_photos;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ MerchantPhotosView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(MerchantPhotosView merchantPhotosView) {
            super(1);
            this.this$0 = merchantPhotosView;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            MerchantPhotoViewerModel access$createMerchantPhotoViewerModel = MerchantPhotosView.access$createMerchantPhotoViewerModel(this.this$0, MerchantPhotosView.access$createMediaViewerModel(this.this$0, i));
            MerchantPhotoViewerDialog.length length = MerchantPhotoViewerDialog.length;
            BaseActivity baseActivity = this.this$0.getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "baseActivity.supportFragmentManager");
            MerchantPhotoViewerDialog.length.getMin(supportFragmentManager, access$createMerchantPhotoViewerModel);
        }
    }

    public static final /* synthetic */ cancelListener access$getAdapter$p(MerchantPhotosView merchantPhotosView) {
        cancelListener cancellistener = merchantPhotosView.getMax;
        if (cancellistener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return cancellistener;
    }

    @NotNull
    public final FeedbackMenu.AnonymousClass1 getMerchantPhotosPresenter() {
        FeedbackMenu.AnonymousClass1 r0 = this.merchantPhotosPresenter;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantPhotosPresenter");
        }
        return r0;
    }

    public final void setMerchantPhotosPresenter(@NotNull FeedbackMenu.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.merchantPhotosPresenter = r2;
    }

    @Nullable
    public final ShopModel getShopModel() {
        return this.getMin;
    }

    public final void setShopModel(@Nullable ShopModel shopModel) {
        this.getMin = shopModel;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantPhotosView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantPhotosView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantPhotosView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void loadImages() {
        ShopModel shopModel = this.getMin;
        if (shopModel != null) {
            FeedbackMenu.AnonymousClass1 r1 = this.merchantPhotosPresenter;
            if (r1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantPhotosPresenter");
            }
            String str = shopModel.Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str, "it.merchantId");
            String str2 = shopModel.b;
            Intrinsics.checkNotNullExpressionValue(str2, "it.shopId");
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            r1.length.showProgress();
            r1.getMax.invoke(new isRAndAbove.getMin(str, str2, 1, 10, false, 16, (DefaultConstructorMarker) null), new FeedbackMenu.AnonymousClass1.getMax(r1), FeedbackMenu.AnonymousClass1.setMax.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotosView$injectComponent$1", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onMerchantImageLoaded", "merchantImages", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements GriverPageLoadingExtension.setMin {
        final /* synthetic */ MerchantPhotosView getMax;

        setMin(MerchantPhotosView merchantPhotosView) {
            this.getMax = merchantPhotosView;
        }

        public final void length(@NotNull List<MerchantImageModel> list) {
            Intrinsics.checkNotNullParameter(list, "merchantImages");
            dismissProgress();
            if (!list.isEmpty()) {
                MerchantPhotosView.access$getAdapter$p(this.getMax).getMin(list);
                this.getMax.setVisibility(0);
            }
            MerchantPhotosView.access$provideHeaderImageToDetailActivity(this.getMax, list);
        }

        public final void dismissProgress() {
            onDetachedFromLayoutParams access$getSkeletonScreen$p = this.getMax.setMax;
            if (access$getSkeletonScreen$p != null) {
                access$getSkeletonScreen$p.length();
            }
        }

        public final void onError(@Nullable String str) {
            dismissProgress();
            MerchantPhotosView.access$provideHeaderImageToDetailActivity(this.getMax, new ArrayList());
            this.getMax.setVisibility(8);
        }

        public final void showProgress() {
            onDetachedFromLayoutParams access$getSkeletonScreen$p = this.getMax.setMax;
            if (access$getSkeletonScreen$p != null) {
                access$getSkeletonScreen$p.getMin();
            }
        }
    }

    @OnClick({2131365542})
    public final void onClick() {
        String str;
        String str2;
        Context context = getContext();
        Intent intent = new Intent(getContext(), MerchantPhotoGalleryActivity.class);
        ShopModel shopModel = this.getMin;
        String str3 = null;
        if (shopModel != null) {
            str = shopModel.invoke;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        intent.putExtra(MerchantPhotoGalleryActivity.EXTRA_MERCHANT_NAME, str);
        ShopModel shopModel2 = this.getMin;
        if (shopModel2 != null) {
            str2 = shopModel2.Grayscale$Algorithm;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str4;
        }
        intent.putExtra("EXTRA_MERCHANT_ID", str2);
        ShopModel shopModel3 = this.getMin;
        if (shopModel3 != null) {
            str3 = shopModel3.b;
        }
        if (str3 != null) {
            str4 = str3;
        }
        intent.putExtra("EXTRA_SHOP_ID", str4);
        Unit unit = Unit.INSTANCE;
        context.startActivity(intent);
    }

    public final void setup() {
        this.getMax = new cancelListener(new getMax(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportButtonTintList);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_merchant_photos");
        cancelListener cancellistener = this.getMax;
        if (cancellistener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView.setAdapter(cancellistener);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportButtonTintList);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv_merchant_photos");
        recyclerView2.setNestedScrollingEnabled(false);
        if (this.setMax == null) {
            this.setMax = containsFavoriteMenuItem.getMin((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.ComponentActivity), R.layout.view_merchant_photos_skeleton);
        }
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        canHotUpdate.setMax setmax = new canHotUpdate.setMax((byte) 0);
        if (r4 != null) {
            setmax.getMin = r4;
            setmax.getMax = new MerchantPhotoModule(new setMin(this));
            stopIgnoring.setMin(setmax.getMax, MerchantPhotoModule.class);
            stopIgnoring.setMin(setmax.getMin, PrepareException.AnonymousClass1.class);
            new canHotUpdate(setmax.getMax, setmax.getMin, (byte) 0).setMax(this);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ MediaViewerModel access$createMediaViewerModel(MerchantPhotosView merchantPhotosView, int i) {
        cancelListener cancellistener = merchantPhotosView.getMax;
        if (cancellistener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        List max = cancellistener.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "adapter.items");
        return new MediaViewerModel(i, 50, 0, 0, false, max);
    }

    public static final /* synthetic */ MerchantPhotoViewerModel access$createMerchantPhotoViewerModel(MerchantPhotosView merchantPhotosView, MediaViewerModel mediaViewerModel) {
        String str;
        ShopModel shopModel = merchantPhotosView.getMin;
        String str2 = null;
        if (shopModel != null) {
            str = shopModel.invoke;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        ShopModel shopModel2 = merchantPhotosView.getMin;
        if (shopModel2 != null) {
            str2 = shopModel2.Grayscale$Algorithm;
        }
        if (str2 != null) {
            str3 = str2;
        }
        return new MerchantPhotoViewerModel(str, str3, mediaViewerModel);
    }

    public static final /* synthetic */ void access$provideHeaderImageToDetailActivity(MerchantPhotosView merchantPhotosView, List list) {
        for (Context context = merchantPhotosView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof GriverBaseFragment) {
                ((GriverBaseFragment) context).onImageLoaded(list);
            }
        }
        updateActionSheetContent.e(DanaLogConstants.ExceptionType.NEARBY_EXCEPTION, "Parent must implement MerchantDetailInteraction");
    }
}
