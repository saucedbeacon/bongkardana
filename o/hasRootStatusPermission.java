package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.merchantbanner.MerchantBannerView;
import id.dana.nearbyrevamp.model.MerchantBannerItemModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002!\"B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0006\u0010\u001f\u001a\u00020\u0017J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter$MerchantCarouselPhotoViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantBannerItemModel;", "()V", "currentSelectedPage", "", "value", "", "isPreview", "()Z", "setPreview", "(Z)V", "listener", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter$Listener;", "getListener", "()Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter$Listener;", "setListener", "(Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter$Listener;)V", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewDetachedFromWindow", "reset", "updateShopModel", "Listener", "MerchantCarouselPhotoViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class hasRootStatusPermission extends IMultiInstanceInvalidationCallback.Stub<setMin, MerchantBannerItemModel> {
    @Nullable
    public setMax getMax;
    public ShopModel getMin = new ShopModel();
    public boolean setMax = true;
    public int setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter$Listener;", "", "onCloseBanner", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void setMin();
    }

    public final int getItemCount() {
        return 1;
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setMin(viewGroup);
    }

    public final /* synthetic */ void onViewDetachedFromWindow(RecyclerView.valueOf valueof) {
        Integer num;
        setMin setmin = (setMin) valueof;
        Intrinsics.checkNotNullParameter(setmin, "holder");
        ShopModel shopModel = setmin.getMax;
        if (shopModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shopModel");
        }
        CharSequence charSequence = shopModel.b;
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            num = 0;
        } else {
            View view = setmin.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            MerchantBannerView merchantBannerView = (MerchantBannerView) view.findViewById(resetInternal.setMax.postShowOverflowMenu);
            num = merchantBannerView != null ? Integer.valueOf(merchantBannerView.getCurrentPos()) : null;
        }
        if (num != null) {
            i = num.intValue();
        }
        this.setMin = i;
        super.onViewDetachedFromWindow(setmin);
    }

    public hasRootStatusPermission() {
        getMin(CollectionsKt.mutableListOf(new MerchantBannerItemModel((byte) 0)));
    }

    public final boolean setMax() {
        return this.setMax;
    }

    /* access modifiers changed from: private */
    /* renamed from: length */
    public void onBindViewHolder(@NotNull setMin setmin, int i) {
        Intrinsics.checkNotNullParameter(setmin, "holder");
        ShopModel shopModel = this.getMin;
        Intrinsics.checkNotNullParameter(shopModel, "<set-?>");
        setmin.getMax = shopModel;
        setmin.getMin = this.setMax;
        setmin.setMin = this.getMax;
        setmin.setMax = this.setMin;
        super.onBindViewHolder(setmin, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016J\r\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010 R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter$MerchantCarouselPhotoViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantBannerItemModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "currentSelectedPage", "", "getCurrentSelectedPage", "()I", "setCurrentSelectedPage", "(I)V", "isPreview", "", "()Z", "setPreview", "(Z)V", "listener", "Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter$Listener;", "getListener", "()Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter$Listener;", "setListener", "(Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantDetailPhotoAdapter$Listener;)V", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "setShopModel", "(Lid/dana/nearbyme/model/ShopModel;)V", "bindData", "", "data", "()Ljava/lang/Integer;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends Ignore<MerchantBannerItemModel> {
        public ShopModel getMax;
        boolean getMin = true;
        int setMax;
        @Nullable
        setMax setMin;

        /* JADX WARNING: Removed duplicated region for block: B:67:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0120  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void setMax(java.lang.Object r11) {
            /*
                r10 = this;
                id.dana.nearbyrevamp.model.MerchantBannerItemModel r11 = (id.dana.nearbyrevamp.model.MerchantBannerItemModel) r11
                if (r11 != 0) goto L_0x0005
                return
            L_0x0005:
                android.view.View r0 = r10.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r2 = o.resetInternal.setMax.postShowOverflowMenu
                android.view.View r0 = r0.findViewById(r2)
                id.dana.nearbyrevamp.merchantbanner.MerchantBannerView r0 = (id.dana.nearbyrevamp.merchantbanner.MerchantBannerView) r0
                if (r0 == 0) goto L_0x0020
                o.hasRootStatusPermission$setMin$length r2 = new o.hasRootStatusPermission$setMin$length
                r2.<init>(r10)
                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                r0.setCloseListener(r2)
            L_0x0020:
                id.dana.nearbyrevamp.model.MerchantBannerItemModel$State r11 = r11.getMax
                int[] r0 = o.initView.setMin
                int r11 = r11.ordinal()
                r11 = r0[r11]
                r0 = 8
                java.lang.String r2 = "<this>"
                r3 = 1065353216(0x3f800000, float:1.0)
                r4 = 1
                r5 = 0
                if (r11 == r4) goto L_0x0142
                r6 = 2
                if (r11 == r6) goto L_0x0039
                goto L_0x01a3
            L_0x0039:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r7 = o.resetInternal.setMax.postShowOverflowMenu
                android.view.View r11 = r11.findViewById(r7)
                id.dana.nearbyrevamp.merchantbanner.MerchantBannerView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantBannerView) r11
                java.lang.String r7 = "shopModel"
                if (r11 == 0) goto L_0x0054
                id.dana.nearbyme.model.ShopModel r8 = r10.getMax
                if (r8 != 0) goto L_0x0051
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            L_0x0051:
                r11.setShopModel(r8)
            L_0x0054:
                id.dana.nearbyme.model.ShopModel r11 = r10.getMax
                if (r11 != 0) goto L_0x005b
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            L_0x005b:
                java.util.List<id.dana.nearbyme.merchantdetail.model.MerchantImageModel> r11 = r11.getDefaultImpl
                java.util.Collection r11 = (java.util.Collection) r11
                if (r11 == 0) goto L_0x006a
                boolean r11 = r11.isEmpty()
                if (r11 == 0) goto L_0x0068
                goto L_0x006a
            L_0x0068:
                r11 = 0
                goto L_0x006b
            L_0x006a:
                r11 = 1
            L_0x006b:
                if (r11 != 0) goto L_0x00b5
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r6 = o.resetInternal.setMax.setTabContainer
                android.view.View r11 = r11.findViewById(r6)
                id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView) r11
                java.lang.String r6 = "shopModel.previewPhotos"
                if (r11 == 0) goto L_0x0094
                id.dana.nearbyme.model.ShopModel r8 = r10.getMax
                if (r8 != 0) goto L_0x0085
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            L_0x0085:
                id.dana.nearbyme.model.ShopModel r9 = r10.getMax
                if (r9 != 0) goto L_0x008c
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            L_0x008c:
                java.util.List<id.dana.nearbyme.merchantdetail.model.MerchantImageModel> r9 = r9.getDefaultImpl
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
                r11.setImages(r8, r9)
            L_0x0094:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r8 = o.resetInternal.setMax.postShowOverflowMenu
                android.view.View r11 = r11.findViewById(r8)
                id.dana.nearbyrevamp.merchantbanner.MerchantBannerView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantBannerView) r11
                if (r11 == 0) goto L_0x00de
                id.dana.nearbyme.model.ShopModel r8 = r10.getMax
                if (r8 != 0) goto L_0x00aa
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            L_0x00aa:
                java.util.List<id.dana.nearbyme.merchantdetail.model.MerchantImageModel> r8 = r8.getDefaultImpl
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
                int r6 = r10.setMax
                r11.setMerchantImages(r8, r6)
                goto L_0x00de
            L_0x00b5:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r8 = o.resetInternal.setMax.setTabContainer
                android.view.View r11 = r11.findViewById(r8)
                id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView) r11
                if (r11 == 0) goto L_0x00c7
                r11.showInitialState()
            L_0x00c7:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r8 = o.resetInternal.setMax.postShowOverflowMenu
                android.view.View r11 = r11.findViewById(r8)
                id.dana.nearbyrevamp.merchantbanner.MerchantBannerView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantBannerView) r11
                if (r11 == 0) goto L_0x00de
                java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
                r9 = 0
                id.dana.nearbyrevamp.merchantbanner.MerchantBannerView.setMerchantImages$default(r11, r8, r5, r6, r9)
            L_0x00de:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r6 = o.resetInternal.setMax.setTabContainer
                android.view.View r11 = r11.findViewById(r6)
                id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView) r11
                if (r11 == 0) goto L_0x0125
                int r6 = o.resetInternal.setMax.play
                android.view.View r11 = r11._$_findCachedViewById(r6)
                androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
                if (r11 == 0) goto L_0x0125
                android.view.View r11 = (android.view.View) r11
                boolean r6 = r10.getMin
                if (r6 == 0) goto L_0x0118
                id.dana.nearbyme.model.ShopModel r6 = r10.getMax
                if (r6 != 0) goto L_0x0104
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            L_0x0104:
                java.util.List<id.dana.nearbyme.merchantdetail.model.MerchantImageModel> r6 = r6.getDefaultImpl
                java.util.Collection r6 = (java.util.Collection) r6
                if (r6 == 0) goto L_0x0113
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L_0x0111
                goto L_0x0113
            L_0x0111:
                r6 = 0
                goto L_0x0114
            L_0x0113:
                r6 = 1
            L_0x0114:
                if (r6 != 0) goto L_0x0118
                r6 = 1
                goto L_0x0119
            L_0x0118:
                r6 = 0
            L_0x0119:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
                if (r6 == 0) goto L_0x0120
                r6 = 0
                goto L_0x0122
            L_0x0120:
                r6 = 8
            L_0x0122:
                r11.setVisibility(r6)
            L_0x0125:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r6 = o.resetInternal.setMax.setTabContainer
                android.view.View r11 = r11.findViewById(r6)
                id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView) r11
                if (r11 == 0) goto L_0x01a3
                int r6 = o.resetInternal.setMax.play
                android.view.View r11 = r11._$_findCachedViewById(r6)
                androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
                if (r11 == 0) goto L_0x01a3
                r11.setAlpha(r3)
                goto L_0x01a3
            L_0x0142:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r6 = o.resetInternal.setMax.setTabContainer
                android.view.View r11 = r11.findViewById(r6)
                id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView) r11
                if (r11 == 0) goto L_0x0154
                r11.showInitialState()
            L_0x0154:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r6 = o.resetInternal.setMax.setTabContainer
                android.view.View r11 = r11.findViewById(r6)
                id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView) r11
                if (r11 == 0) goto L_0x0175
                int r6 = o.resetInternal.setMax.play
                android.view.View r11 = r11._$_findCachedViewById(r6)
                androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
                if (r11 == 0) goto L_0x0175
                android.view.View r11 = (android.view.View) r11
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
                r11.setVisibility(r0)
            L_0x0175:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r6 = o.resetInternal.setMax.setTabContainer
                android.view.View r11 = r11.findViewById(r6)
                id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantPhotoGridView) r11
                if (r11 == 0) goto L_0x0191
                int r6 = o.resetInternal.setMax.play
                android.view.View r11 = r11._$_findCachedViewById(r6)
                androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
                if (r11 == 0) goto L_0x0191
                r11.setAlpha(r3)
            L_0x0191:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r6 = o.resetInternal.setMax.postShowOverflowMenu
                android.view.View r11 = r11.findViewById(r6)
                id.dana.nearbyrevamp.merchantbanner.MerchantBannerView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantBannerView) r11
                if (r11 == 0) goto L_0x01a3
                r11.showLoading()
            L_0x01a3:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r6 = o.resetInternal.setMax.postShowOverflowMenu
                android.view.View r11 = r11.findViewById(r6)
                id.dana.nearbyrevamp.merchantbanner.MerchantBannerView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantBannerView) r11
                if (r11 == 0) goto L_0x01ca
                int r6 = o.resetInternal.setMax.play
                android.view.View r11 = r11._$_findCachedViewById(r6)
                androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
                if (r11 == 0) goto L_0x01ca
                android.view.View r11 = (android.view.View) r11
                boolean r6 = r10.getMin
                r4 = r4 ^ r6
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
                if (r4 == 0) goto L_0x01c7
                r0 = 0
            L_0x01c7:
                r11.setVisibility(r0)
            L_0x01ca:
                android.view.View r11 = r10.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r0 = o.resetInternal.setMax.postShowOverflowMenu
                android.view.View r11 = r11.findViewById(r0)
                id.dana.nearbyrevamp.merchantbanner.MerchantBannerView r11 = (id.dana.nearbyrevamp.merchantbanner.MerchantBannerView) r11
                if (r11 == 0) goto L_0x01e6
                int r0 = o.resetInternal.setMax.play
                android.view.View r11 = r11._$_findCachedViewById(r0)
                androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
                if (r11 == 0) goto L_0x01e6
                r11.setAlpha(r3)
            L_0x01e6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.hasRootStatusPermission.setMin.setMax(java.lang.Object):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.item_merchant_carousel, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function0<Unit> {
            final /* synthetic */ setMin this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(setMin setmin) {
                super(0);
                this.this$0 = setmin;
            }

            public final void invoke() {
                setMax setmax = this.this$0.setMin;
                if (setmax != null) {
                    setmax.setMin();
                }
            }
        }
    }
}
