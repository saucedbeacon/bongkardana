package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.promoquest.model.PrizeType;
import id.dana.nearbyme.merchantdetail.adapter.MerchantLabelType;
import id.dana.nearbyme.merchantdetail.mediaviewer.MediaViewerModel;
import id.dana.nearbyme.model.ContactAddressModel;
import id.dana.nearbyme.model.MerchantSubcategoryModel;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyme.model.ShopOpenHourModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.FileCache;
import o.GriverDialog;
import o.H5PromptDialog;
import o.IMultiInstanceInvalidationCallback;
import o.OptionMenuRecyclerAdapter;
import o.b;
import o.isValid;
import o.parentColumns;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final class GriverTransActivity implements RedDotManager {
    private final /* synthetic */ Function1 setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/MerchantDetailContract;", "", "bindViewState", "", "merchantDetailViewState", "Lid/dana/nearbyme/merchantdetail/model/MerchantDetailViewState;", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface Lite1 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "cancelMerchantInfo", "", "getMerchantInfo", "merchantId", "", "shopId", "useNewMerchantCategory", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface setMax extends parentColumns.setMin {
            void setMax(@NotNull String str, @NotNull String str2);

            void setMin();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onFailedFetch", "", "onSuccessFetch", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface setMin extends parentColumns.getMax {
            void getMin(@NotNull ShopModel shopModel);

            void length();
        }
    }

    public GriverTransActivity(Function1 function1) {
        this.setMax = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkNotNullExpressionValue(this.setMax.invoke(obj), "invoke(...)");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0004\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/nearbyme/merchantdetail/MerchantDetailPresenter;", "Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$Presenter;", "view", "Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$View;", "getMerchantInfo", "Lid/dana/domain/nearbyme/interactor/GetMerchantInfo;", "mapper", "Lid/dana/nearbyme/merchantdetail/mapper/MerchantDetailMapper;", "(Lid/dana/nearbyme/merchantdetail/MerchantDetailContract$View;Lid/dana/domain/nearbyme/interactor/GetMerchantInfo;Lid/dana/nearbyme/merchantdetail/mapper/MerchantDetailMapper;)V", "cancelMerchantInfo", "", "convertToDomainParam", "Lid/dana/domain/nearbyme/interactor/GetMerchantInfo$Params;", "merchantId", "", "shopId", "useNewMerchantCategory", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Main implements Lite1.setMax {
        private final isValid getMax;
        /* access modifiers changed from: private */
        public final GriverDialog.AnonymousClass1 getMin;
        /* access modifiers changed from: private */
        public final Lite1.setMin length;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/nearbyme/model/Shop;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<GriverConfigUtils, Unit> {
            final /* synthetic */ Main this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(Main main) {
                super(1);
                this.this$0 = main;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GriverConfigUtils) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GriverConfigUtils griverConfigUtils) {
                List<ContactAddressModel> list;
                List<MerchantSubcategoryModel> list2;
                Intrinsics.checkNotNullParameter(griverConfigUtils, "it");
                Lite1.setMin min = this.this$0.length;
                GriverDialog.AnonymousClass1 unused = this.this$0.getMin;
                Intrinsics.checkNotNullParameter(griverConfigUtils, "shop");
                ShopModel shopModel = new ShopModel();
                shopModel.getMin = griverConfigUtils.getBranchName();
                shopModel.setMax = griverConfigUtils.getBrandName();
                shopModel.getMax = griverConfigUtils.getCertStatus();
                List<getMacEncrypt> contactAddresses = griverConfigUtils.getContactAddresses();
                List<ShopOpenHourModel> list3 = null;
                if (contactAddresses != null) {
                    list = new ArrayList<>();
                    for (getMacEncrypt getmacencrypt : contactAddresses) {
                        Intrinsics.checkNotNullParameter(getmacencrypt, "contactAddress");
                        ContactAddressModel contactAddressModel = new ContactAddressModel();
                        contactAddressModel.setMin = getmacencrypt.getAddress1();
                        contactAddressModel.length = getmacencrypt.getAddress2();
                        contactAddressModel.setMin(getmacencrypt.getArea());
                        contactAddressModel.getMin = getmacencrypt.getCity();
                        contactAddressModel.getMax = getmacencrypt.getContactAddressId();
                        contactAddressModel.setMax = getmacencrypt.getContactAddressType();
                        contactAddressModel.isInside = getmacencrypt.getCountry();
                        contactAddressModel.equals = getmacencrypt.getExtendInfo();
                        contactAddressModel.toFloatRange = getmacencrypt.getProvince();
                        contactAddressModel.FastBitmap$CoordinateSystem = getmacencrypt.getZipcode();
                        list.add(contactAddressModel);
                    }
                } else {
                    list = null;
                }
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                shopModel.setMin = list;
                shopModel.toFloatRange = griverConfigUtils.getDistance();
                shopModel.equals = griverConfigUtils.getExtInfo();
                shopModel.toIntRange = griverConfigUtils.getExternalShopId();
                shopModel.toDoubleRange = griverConfigUtils.getInstId();
                shopModel.isInside = griverConfigUtils.getFullDay();
                shopModel.values = griverConfigUtils.getLatitude();
                shopModel.hashCode = griverConfigUtils.getLogoUrl();
                shopModel.FastBitmap$CoordinateSystem = griverConfigUtils.getLogoUrlMap();
                shopModel.toString = griverConfigUtils.getLongtitude();
                shopModel.invoke = griverConfigUtils.getMainName();
                shopModel.valueOf = griverConfigUtils.getMccCodes();
                shopModel.Grayscale$Algorithm = griverConfigUtils.getMerchantId();
                shopModel.invokeSuspend = griverConfigUtils.getMerchantSizeType();
                shopModel.IsOverlapping = griverConfigUtils.getOfficeNumbers();
                List<FileCache.AnonymousClass1> promoInfos = griverConfigUtils.getPromoInfos();
                List<PromoInfoModel> min2 = promoInfos != null ? GriverDialog.AnonymousClass1.setMin(promoInfos) : null;
                if (min2 == null) {
                    min2 = CollectionsKt.emptyList();
                }
                shopModel.length(min2);
                shopModel.create = griverConfigUtils.getRating();
                shopModel.getCause = griverConfigUtils.getRegisterSource();
                shopModel.onNavigationEvent = griverConfigUtils.getReviewNumbers();
                shopModel.ICustomTabsCallback = griverConfigUtils.getShopDesc();
                shopModel.b = griverConfigUtils.getShopId();
                List<getWebSetting> shopOpenHours = griverConfigUtils.getShopOpenHours();
                if (shopOpenHours != null) {
                    list3 = GriverDialog.AnonymousClass1.getMax(shopOpenHours);
                }
                if (list3 == null) {
                    list3 = CollectionsKt.emptyList();
                }
                shopModel.getMax(list3);
                shopModel.onRelationshipValidationResult = griverConfigUtils.getShopStatus();
                shopModel.onPostMessage = griverConfigUtils.getShopType();
                List<download> subcategories = griverConfigUtils.getSubcategories();
                if (subcategories != null) {
                    list2 = GriverDialog.AnonymousClass1.setMax(subcategories);
                } else {
                    list2 = new ArrayList<>();
                }
                shopModel.extraCallbackWithResult = list2;
                shopModel.extraCallback = griverConfigUtils.getHasMoreShop();
                shopModel.length(griverConfigUtils.getMerchantName());
                shopModel.onTransact = griverConfigUtils.getTransactionDate();
                shopModel.toFloatRange();
                min.getMin(shopModel);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<Exception, Unit> {
            final /* synthetic */ Main this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(Main main) {
                super(1);
                this.this$0 = main;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Exception) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "it");
                this.this$0.length.length();
                updateActionSheetContent.e(DanaLogConstants.TAG.NEARBY_ME_MERCHANT_DETAIL, exc.getMessage(), exc);
            }
        }

        @Inject
        public Main(@NotNull Lite1.setMin setmin, @NotNull isValid isvalid, @NotNull GriverDialog.AnonymousClass1 r4) {
            Intrinsics.checkNotNullParameter(setmin, "view");
            Intrinsics.checkNotNullParameter(isvalid, "getMerchantInfo");
            Intrinsics.checkNotNullParameter(r4, "mapper");
            this.length = setmin;
            this.getMax = isvalid;
            this.getMin = r4;
        }

        public final void setMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            this.getMax.execute(new isValid.getMin(str2, str, false), new getMax(this), new getMin(this));
        }

        public final void setMax() {
            this.getMax.dispose();
        }

        public final void setMin() {
            this.getMax.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\fR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lid/dana/nearbyme/merchantdetail/adapter/MerchantLatestReviewAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "currentShopModel", "Lid/dana/nearbyme/model/ShopModel;", "clickListener", "Lkotlin/Function1;", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "", "(Lid/dana/nearbyme/model/ShopModel;Lkotlin/jvm/functions/Function1;)V", "hasOtherReviews", "", "getHasOtherReviews", "()Z", "setHasOtherReviews", "(Z)V", "pageSource", "", "getPageSource", "()Ljava/lang/String;", "setPageSource", "(Ljava/lang/String;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showLoadMoreState", "enable", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Lite2 extends IMultiInstanceInvalidationCallback.Stub<Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3>, OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3> {
        @NotNull
        public String getMax = "";
        private final ShopModel length;
        private final Function1<MediaViewerModel, Unit> setMax;
        public boolean setMin;

        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            return new NavigationBarUtil(viewGroup, getMax().size(), this.length, this.setMax, this.setMin, this.getMax);
        }

        public Lite2(@NotNull ShopModel shopModel, @NotNull Function1<? super MediaViewerModel, Unit> function1) {
            Intrinsics.checkNotNullParameter(shopModel, "currentShopModel");
            Intrinsics.checkNotNullParameter(function1, "clickListener");
            this.length = shopModel;
            this.setMax = function1;
        }

        public final int getItemViewType(int i) {
            OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3 r1 = (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3) setMin(i);
            if (r1 != null) {
                return r1.setMax;
            }
            return 1;
        }

        public final void getMax(boolean z) {
            List max = getMax();
            if (max == null) {
                return;
            }
            if (z) {
                max.add((Object) null);
                notifyItemInserted(CollectionsKt.getLastIndex(max));
                return;
            }
            getMax(CollectionsKt.getLastIndex(max));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/nearbyme/merchantdetail/adapter/MerchantLabelAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantLabelModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Lite3 extends IMultiInstanceInvalidationCallback.Stub<Ignore<GriverAboutUrlExtensionImpl>, GriverAboutUrlExtensionImpl> {
        private final Context getMax;

        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
            Ignore ignore;
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1133772767, oncanceled);
                onCancelLoad.getMin(-1133772767, oncanceled);
            }
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            if (i == MerchantLabelType.BISNIS.getValue()) {
                ignore = new getBottomLayout(viewGroup);
            } else if (i == MerchantLabelType.ORDER_ONLINE.getValue()) {
                ignore = new H5PromptDialog.OnClickPositiveListener(viewGroup);
            } else if (i == MerchantLabelType.PROMO.getValue()) {
                ignore = new Ignore<GriverAboutUrlExtensionImpl>(viewGroup) {
                    public final /* synthetic */ void setMax(Object obj) {
                        String str;
                        CharSequence charSequence;
                        GriverAboutUrlExtensionImpl griverAboutUrlExtensionImpl = (GriverAboutUrlExtensionImpl) obj;
                        View view = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                        TextView textView = (TextView) view.findViewById(resetInternal.setMax.removeChildrenForExpandedActionView);
                        if (textView != null) {
                            if (griverAboutUrlExtensionImpl != null) {
                                str = griverAboutUrlExtensionImpl.getMin;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                int hashCode = str.hashCode();
                                if (hashCode != -1894155097) {
                                    if (hashCode != -1708077799) {
                                        if (hashCode == 807116442 && str.equals(PrizeType.CASHBACK)) {
                                            Context context = this.length;
                                            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                                            charSequence = context.getResources().getString(R.string.merchant_label_cashback, new Object[]{griverAboutUrlExtensionImpl.length});
                                            textView.setText(charSequence);
                                        }
                                    } else if (str.equals(PrizeType.CASHCOUPON)) {
                                        Context context2 = this.length;
                                        Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                                        charSequence = context2.getResources().getString(R.string.merchant_label_promo, new Object[]{griverAboutUrlExtensionImpl.length});
                                        textView.setText(charSequence);
                                    }
                                } else if (str.equals(PrizeType.DISCOUNTCOUPON)) {
                                    Context context3 = this.length;
                                    Intrinsics.checkNotNullExpressionValue(context3, HummerConstants.CONTEXT);
                                    charSequence = context3.getResources().getString(R.string.merchant_label_discount, new Object[]{griverAboutUrlExtensionImpl.length});
                                    textView.setText(charSequence);
                                }
                            }
                            textView.setText(charSequence);
                        }
                    }

                    {
                        Intrinsics.checkNotNullParameter(r3, "parent");
                    }
                };
            } else if (i == MerchantLabelType.TOP_UP.getValue()) {
                ignore = new GriverAsyncUpdateManagerImpl(viewGroup);
            } else if (i == MerchantLabelType.QRIS.getValue()) {
                ignore = new H5PromptDialog.OnClickNegativeListener(viewGroup);
            } else {
                ignore = new Ignore<GriverAboutUrlExtensionImpl>(viewGroup) {
                    public final /* synthetic */ void setMax(Object obj) {
                        String str;
                        CharSequence charSequence;
                        GriverAboutUrlExtensionImpl griverAboutUrlExtensionImpl = (GriverAboutUrlExtensionImpl) obj;
                        View view = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view, "itemView");
                        TextView textView = (TextView) view.findViewById(resetInternal.setMax.removeChildrenForExpandedActionView);
                        if (textView != null) {
                            if (griverAboutUrlExtensionImpl != null) {
                                str = griverAboutUrlExtensionImpl.getMin;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                int hashCode = str.hashCode();
                                if (hashCode != -1894155097) {
                                    if (hashCode != -1708077799) {
                                        if (hashCode == 807116442 && str.equals(PrizeType.CASHBACK)) {
                                            Context context = this.length;
                                            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                                            charSequence = context.getResources().getString(R.string.merchant_label_cashback, new Object[]{griverAboutUrlExtensionImpl.length});
                                            textView.setText(charSequence);
                                        }
                                    } else if (str.equals(PrizeType.CASHCOUPON)) {
                                        Context context2 = this.length;
                                        Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                                        charSequence = context2.getResources().getString(R.string.merchant_label_promo, new Object[]{griverAboutUrlExtensionImpl.length});
                                        textView.setText(charSequence);
                                    }
                                } else if (str.equals(PrizeType.DISCOUNTCOUPON)) {
                                    Context context3 = this.length;
                                    Intrinsics.checkNotNullExpressionValue(context3, HummerConstants.CONTEXT);
                                    charSequence = context3.getResources().getString(R.string.merchant_label_discount, new Object[]{griverAboutUrlExtensionImpl.length});
                                    textView.setText(charSequence);
                                }
                            }
                            textView.setText(charSequence);
                        }
                    }

                    {
                        Intrinsics.checkNotNullParameter(r3, "parent");
                    }
                };
            }
            return ignore;
        }

        public Lite3(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            this.getMax = context;
        }

        public final int getItemViewType(int i) {
            return ((GriverAboutUrlExtensionImpl) setMin(i)).setMin;
        }
    }

    public final class LiteBase implements getAdapterPosition<Main> {
        private final b.C0007b<GriverDialog.AnonymousClass1> getMax;
        private final b.C0007b<Lite1.setMin> getMin;
        private final b.C0007b<isValid> setMin;

        private LiteBase(b.C0007b<Lite1.setMin> bVar, b.C0007b<isValid> bVar2, b.C0007b<GriverDialog.AnonymousClass1> bVar3) {
            this.getMin = bVar;
            this.setMin = bVar2;
            this.getMax = bVar3;
        }

        public static LiteBase setMax(b.C0007b<Lite1.setMin> bVar, b.C0007b<isValid> bVar2, b.C0007b<GriverDialog.AnonymousClass1> bVar3) {
            return new LiteBase(bVar, bVar2, bVar3);
        }

        public final /* synthetic */ Object get() {
            return new Main(this.getMin.get(), this.setMin.get(), this.getMax.get());
        }
    }
}
