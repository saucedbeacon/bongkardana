package o;

import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.f;
import o.isRAndAbove;
import o.negativeListener;
import o.onDelete;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\b\u0010\n\u001a\u00020\u0003H\u0017J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantDetailInteraction;", "", "dismissLoadingDialog", "", "onImageLoaded", "images", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "provideShopModel", "Lid/dana/nearbyme/model/ShopModel;", "showLoadingDialog", "updatePromoBadge", "shopModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface GriverBaseFragment {
    @JvmDefault
    void dismissLoadingDialog();

    @JvmDefault
    void onImageLoaded(@NotNull List<MerchantImageModel> list);

    @JvmDefault
    void showLoadingDialog();

    @JvmDefault
    void updatePromoBadge(@NotNull ShopModel shopModel);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0016R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u00020\u00038\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryPresenter;", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$Presenter;", "merchantPhotoGalleryModel", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MerchantPhotoGalleryModel;", "view", "Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$View;", "getMerchantImage", "Lid/dana/domain/nearbyme/interactor/GetMerchantImage;", "(Lid/dana/nearbyme/merchantdetail/mediaviewer/MerchantPhotoGalleryModel;Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryContract$View;Lid/dana/domain/nearbyme/interactor/GetMerchantImage;)V", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "isLoadingImage", "", "()Z", "setLoadingImage", "(Z)V", "merchantImages", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "getMerchantPhotoGalleryModel", "()Lid/dana/nearbyme/merchantdetail/mediaviewer/MerchantPhotoGalleryModel;", "setMerchantPhotoGalleryModel", "(Lid/dana/nearbyme/merchantdetail/mediaviewer/MerchantPhotoGalleryModel;)V", "disposeGetMerchantImage", "", "loadMerchantImage", "loadPreviewImages", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "onDestroy", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Main implements negativeListener.getMax {
        @NotNull
        public static final length getMin = new length((byte) 0);
        private final isRAndAbove IsOverlapping;
        int getMax = 1;
        /* access modifiers changed from: private */
        public final negativeListener.length isInside;
        boolean length;
        /* access modifiers changed from: private */
        public final List<MerchantImageModel> setMax = new ArrayList();
        @NotNull
        private negativeString setMin;

        /* renamed from: o.GriverBaseFragment$Main$1  reason: invalid class name */
        public interface AnonymousClass1 extends onDelete.getMin {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<Exception, Unit> {
            final /* synthetic */ Main this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(Main main) {
                super(1);
                this.this$0 = main;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Exception) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "it");
                this.this$0.length = false;
                updateActionSheetContent.e(DanaLogConstants.ExceptionType.NEARBY_EXCEPTION, exc.getMessage(), exc);
                this.this$0.isInside.onError(exc.getMessage());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<Exception, Unit> {
            final /* synthetic */ ShopModel $shopModel;
            final /* synthetic */ Main this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(Main main, ShopModel shopModel) {
                super(1);
                this.this$0 = main;
                this.$shopModel = shopModel;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Exception) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "it");
                this.this$0.isInside.setMin(CollectionsKt.emptyList(), this.$shopModel);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/nearbyme/model/MerchantImage;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function1<List<? extends getUtdid>, Unit> {
            final /* synthetic */ Main this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(Main main) {
                super(1);
                this.this$0 = main;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<getUtdid>) (List) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull List<getUtdid> list) {
                Intrinsics.checkNotNullParameter(list, "it");
                this.this$0.getMax++;
                this.this$0.length = false;
                this.this$0.setMax.addAll(f.AnonymousClass5.setMax(list, 0));
                this.this$0.isInside.getMin(this.this$0.setMax);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/nearbyme/model/MerchantImage;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<List<? extends getUtdid>, Unit> {
            final /* synthetic */ ShopModel $shopModel;
            final /* synthetic */ Main this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(Main main, ShopModel shopModel) {
                super(1);
                this.this$0 = main;
                this.$shopModel = shopModel;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<getUtdid>) (List) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull List<getUtdid> list) {
                Intrinsics.checkNotNullParameter(list, "it");
                this.this$0.isInside.setMin(f.AnonymousClass5.setMax(list, 1), this.$shopModel);
            }
        }

        @Inject
        public Main(@NotNull negativeString negativestring, @NotNull negativeListener.length length2, @NotNull isRAndAbove israndabove) {
            Intrinsics.checkNotNullParameter(negativestring, "merchantPhotoGalleryModel");
            Intrinsics.checkNotNullParameter(length2, "view");
            Intrinsics.checkNotNullParameter(israndabove, "getMerchantImage");
            this.setMin = negativestring;
            this.isInside = length2;
            this.IsOverlapping = israndabove;
        }

        public final int setMin() {
            return this.getMax;
        }

        public final void length() {
            if (!this.length) {
                this.length = true;
                this.IsOverlapping.invoke(new isRAndAbove.getMin(this.setMin.length, this.setMin.getMax, this.getMax, 50, true), new setMax(this), new getMax(this));
            }
        }

        public final void setMax() {
            this.IsOverlapping.dispose();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyme/merchantdetail/mediaviewer/PhotoGalleryPresenter$Companion;", "", "()V", "MERCHANT_PHOTO_SIZE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            private length() {
            }

            public /* synthetic */ length(byte b) {
                this();
            }
        }

        public final void length(@NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            this.IsOverlapping.cancelChildren();
            List<MerchantImageModel> list = shopModel.getDefaultImpl;
            Intrinsics.checkNotNullExpressionValue(list, "shopModel.previewPhotos");
            if ((!list.isEmpty()) || shopModel.getCause()) {
                negativeListener.length length2 = this.isInside;
                List<MerchantImageModel> list2 = shopModel.getDefaultImpl;
                Intrinsics.checkNotNullExpressionValue(list2, "shopModel.previewPhotos");
                length2.setMin(list2, shopModel);
                return;
            }
            String str = shopModel.Grayscale$Algorithm;
            Intrinsics.checkNotNullExpressionValue(str, "shopModel.merchantId");
            String str2 = shopModel.b;
            Intrinsics.checkNotNullExpressionValue(str2, "shopModel.shopId");
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            negativeString negativestring = new negativeString(str, str2);
            this.setMin = negativestring;
            this.IsOverlapping.invoke(new isRAndAbove.getMin(negativestring.length, this.setMin.getMax, 1, 5, true), new setMin(this, shopModel), new getMin(this, shopModel));
        }
    }
}
