package o;

import android.view.ViewGroup;
import id.dana.R;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.UniformLocalAuthDialogExtensionImpl;
import o.getInputContent;
import o.isEmbeddedApp;
import o.isValid;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ \u0010\u0004\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoPresenter;", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoContract$Presenter;", "merchantInfoView", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoContract$View;", "getMerchantInfo", "Lid/dana/domain/nearbyme/interactor/GetMerchantInfo;", "getNearbyShopsPromo", "Lid/dana/domain/nearbyme/interactor/GetNearbyShopsPromo;", "nearbyPromoModelMapper", "Lid/dana/nearbyme/NearbyPromoModelMapper;", "mapper", "Lid/dana/nearbyme/merchantdetail/mapper/MerchantInfoMapper;", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoContract$View;Lid/dana/domain/nearbyme/interactor/GetMerchantInfo;Lid/dana/domain/nearbyme/interactor/GetNearbyShopsPromo;Lid/dana/nearbyme/NearbyPromoModelMapper;Lid/dana/nearbyme/merchantdetail/mapper/MerchantInfoMapper;)V", "", "shopId", "", "merchantId", "currentDayOfWeek", "getMerchantPromo", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class H5PromptDialog implements getInputContent.setMin {
    private final isValid getMax;
    /* access modifiers changed from: private */
    public final setUserId getMin;
    /* access modifiers changed from: private */
    public final UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.AnonymousClass3 length;
    private final isEmbeddedApp setMax;
    /* access modifiers changed from: private */
    public final getInputContent.length setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewholder/MerchantLabelQrisViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantLabelModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class OnClickNegativeListener extends Ignore<GriverAboutUrlExtensionImpl> {
        public final /* bridge */ /* synthetic */ void setMax(Object obj) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OnClickNegativeListener(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.view_merchant_label_qris, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewholder/MerchantLabelHomeShoppingViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantLabelModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class OnClickPositiveListener extends Ignore<GriverAboutUrlExtensionImpl> {
        public final /* bridge */ /* synthetic */ void setMax(Object obj) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OnClickPositiveListener(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.view_merchant_label_home_shopping, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/nearbyme/model/Shop;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<GriverConfigUtils, Unit> {
        final /* synthetic */ String $currentDayOfWeek;
        final /* synthetic */ H5PromptDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(H5PromptDialog h5PromptDialog, String str) {
            super(1);
            this.this$0 = h5PromptDialog;
            this.$currentDayOfWeek = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverConfigUtils) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverConfigUtils griverConfigUtils) {
            Intrinsics.checkNotNullParameter(griverConfigUtils, "it");
            getInputContent.length min = this.this$0.setMin;
            UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.AnonymousClass3 unused = this.this$0.length;
            min.getMin(UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.AnonymousClass3.length(griverConfigUtils, this.$currentDayOfWeek));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ H5PromptDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(H5PromptDialog h5PromptDialog) {
            super(1);
            this.this$0 = h5PromptDialog;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.NEARBY_ME_MERCHANT_DETAIL, "Error Get Merchant Info: ".concat(String.valueOf(exc)));
            this.this$0.setMin.setMin();
        }
    }

    @Inject
    public H5PromptDialog(@NotNull getInputContent.length length2, @NotNull isValid isvalid, @NotNull isEmbeddedApp isembeddedapp, @NotNull setUserId setuserid, @NotNull UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.AnonymousClass3 r6) {
        Intrinsics.checkNotNullParameter(length2, "merchantInfoView");
        Intrinsics.checkNotNullParameter(isvalid, "getMerchantInfo");
        Intrinsics.checkNotNullParameter(isembeddedapp, "getNearbyShopsPromo");
        Intrinsics.checkNotNullParameter(setuserid, "nearbyPromoModelMapper");
        Intrinsics.checkNotNullParameter(r6, "mapper");
        this.setMin = length2;
        this.getMax = isvalid;
        this.setMax = isembeddedapp;
        this.getMin = setuserid;
        this.length = r6;
    }

    public final void setMax(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        Intrinsics.checkNotNullParameter(str3, "currentDayOfWeek");
        this.getMax.execute(new isValid.getMin(str, str2, false, 4, (DefaultConstructorMarker) null), new length(this, str3), new setMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoPresenter$getMerchantPromo$observers$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/domain/nearbyme/model/NearbyShopsPromo;", "onError", "", "e", "", "onNext", "nearbyPromoResults", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<List<getTempPath>> {
        final /* synthetic */ H5PromptDialog length;
        final /* synthetic */ ShopModel setMin;

        getMax(H5PromptDialog h5PromptDialog, ShopModel shopModel) {
            this.length = h5PromptDialog;
            this.setMin = shopModel;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List<PromoInfoModel> list;
            List list2 = (List) obj;
            Intrinsics.checkNotNullParameter(list2, "nearbyPromoResults");
            getInputContent.length min = this.length.setMin;
            List<ShopModel> max = this.length.getMin.setMax(CollectionsKt.listOf(this.setMin), list2);
            Intrinsics.checkNotNullExpressionValue(max, "nearbyPromoModelMapper.t…      nearbyPromoResults)");
            ShopModel shopModel = (ShopModel) CollectionsKt.firstOrNull(max);
            if (shopModel != null) {
                list = shopModel.Mean$Arithmetic;
            } else {
                list = null;
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            min.length(list);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            updateActionSheetContent.logNetworkException(DanaLogConstants.ExceptionType.NEARBY_EXCEPTION, DanaLogConstants.Prefix.GET_NEARBY_PROMO, th);
        }
    }

    public final void getMax(@NotNull ShopModel shopModel) {
        String str;
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        isEmbeddedApp isembeddedapp = this.setMax;
        setGlobalUserData getmax = new getMax(this, shopModel);
        String str2 = shopModel.Grayscale$Algorithm;
        if (str2 != null && (str = shopModel.b) != null) {
            isembeddedapp.execute(getmax, new isEmbeddedApp.getMax(CollectionsKt.listOf(new getUtdidEncrypt(str2, str))));
        }
    }

    public final void setMax() {
        this.getMax.dispose();
        this.setMax.dispose();
    }
}
