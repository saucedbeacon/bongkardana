package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.nearbyme.homeshopping.tnc.HomeShoppingTncFragment;
import id.dana.nearbyme.homeshopping.tutorial.HomeShoppingTutorialFragment;
import id.dana.nearbyme.merchantdetail.mediaviewer.MediaViewerModel;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerDialog;
import id.dana.nearbyme.merchantdetail.merchantphoto.MerchantPhotoViewerModel;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyme.summary.MerchantListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.RVOpenAuthHelper;
import o.TitleBarRightButtonView;
import o.g;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0012\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/data/social/repository/ActivityReactionsEntityRepository;", "Lid/dana/domain/social/ActivityReactionsRepository;", "activityReactionsDataFactory", "Lid/dana/data/social/repository/ActivityReactionsDataFactory;", "contactDeviceNameMapper", "Lid/dana/data/social/extension/ContactDeviceNameMapper;", "(Lid/dana/data/social/repository/ActivityReactionsDataFactory;Lid/dana/data/social/extension/ContactDeviceNameMapper;)V", "createNetworkActivityReactionsData", "Lid/dana/data/social/repository/ActivityReactionsData;", "getActivityReactions", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/ActivityReactions;", "activityId", "", "kind", "maxId", "mapRelationshipEntityNickNameToLocalContact", "", "", "Lid/dana/data/social/repository/source/persistence/entity/PhoneNumberToContactNameMappable;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class k implements requestBeaconData {
    private final h activityReactionsDataFactory;
    private final getPermissions contactDeviceNameMapper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/homeshopping/tnc/HomeShoppingTncContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.k$4  reason: invalid class name */
    public interface AnonymousClass4 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/homeshopping/tnc/HomeShoppingTncContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetTncError", "", "onGetTncSuccess", "tncHtmlText", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.k$4$getMax */
        public interface getMax extends parentColumns.getMax {
            void getMax();

            void setMin(@NotNull String str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/homeshopping/tnc/HomeShoppingTncContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getTnc", "", "merchantId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.k$4$setMin */
        public interface setMin extends parentColumns.setMin {
        }
    }

    public final class a implements NestedScrollView.setMax {
        private final MerchantListView getMax;

        public a(MerchantListView merchantListView) {
            this.getMax = merchantListView;
        }

        public final void setMax(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            MerchantListView.getMax(this.getMax, i2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a&\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a\u0018\u0010\t\u001a\u00020\u0004*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a\u0018\u0010\n\u001a\u00020\u0004*\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0002\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\b\u0012\u0004\u0012\u00020\u00020\u0006\u001a \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u001a4\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0014*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f0\u000f0\u0013*\b\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¨\u0006\u0015"}, d2 = {"getOpenHourType", "Lid/dana/nearbyme/model/ShopOpenHourModel$OpenHourType;", "Lid/dana/nearbyme/model/ShopModel;", "isMatchCategory", "", "merchantListCategories", "", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "merchantMapsCategories", "isMatchMerchantListCategory", "isMatchMerchantMapsCategory", "toMerchantInfo", "Lid/dana/domain/nearbyme/model/MerchantInfo;", "toMerchantInfos", "toRankedShopModel", "", "lastRankedShop", "", "toRankedShopModelsObservable", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.k$2  reason: invalid class name */
    public final class AnonymousClass2 {
        @NotNull
        public static final List<getUtdidEncrypt> getMax(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "$this$toMerchantInfos");
            Iterable<ShopModel> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (ShopModel shopModel : iterable) {
                Intrinsics.checkNotNullParameter(shopModel, "$this$toMerchantInfo");
                arrayList.add(new getUtdidEncrypt(shopModel.Grayscale$Algorithm, shopModel.b));
            }
            return (List) arrayList;
        }

        public static final boolean length(@NotNull ShopModel shopModel, @NotNull List<? extends g.AnonymousClass1> list, @NotNull List<? extends g.AnonymousClass1> list2) {
            Intrinsics.checkNotNullParameter(shopModel, "$this$isMatchCategory");
            Intrinsics.checkNotNullParameter(list, "merchantListCategories");
            Intrinsics.checkNotNullParameter(list2, "merchantMapsCategories");
            return getMax(shopModel, list) && setMin(shopModel, list2);
        }

        private static boolean setMin(@NotNull ShopModel shopModel, @NotNull List<? extends g.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(shopModel, "$this$isMatchMerchantMapsCategory");
            Intrinsics.checkNotNullParameter(list, "merchantMapsCategories");
            if (list.contains(g.AnonymousClass1.setMin)) {
                return true;
            }
            for (g.AnonymousClass1 length : list) {
                if (shopModel.length(length)) {
                    return true;
                }
            }
            return false;
        }

        public static final boolean getMax(@NotNull ShopModel shopModel, @NotNull List<? extends g.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(shopModel, "$this$isMatchMerchantListCategory");
            Intrinsics.checkNotNullParameter(list, "merchantListCategories");
            if (list.isEmpty()) {
                return true;
            }
            for (g.AnonymousClass1 length : list) {
                if (!shopModel.length(length)) {
                    return false;
                }
            }
            return true;
        }

        @NotNull
        public static final List<ShopModel> setMax(@NotNull List<ShopModel> list, int i) {
            Intrinsics.checkNotNullParameter(list, "$this$toRankedShopModel");
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ShopModel shopModel = (ShopModel) next;
                shopModel.ICustomTabsCallback$Default = false;
                shopModel.getInterfaceDescriptor = i2 + i + 1;
                i2 = i3;
            }
            return list;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.k$2$getMin */
        public static final class getMin<V> implements Callable<List<ShopModel>> {
            final /* synthetic */ int getMax;
            final /* synthetic */ List setMax;

            public getMin(List list, int i) {
                this.setMax = list;
                this.getMax = i;
            }

            public final /* synthetic */ Object call() {
                return AnonymousClass2.setMax(this.setMax, this.getMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/ActivityReactions;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/model/ActivityReactionsResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<executeAuth, markInside> {
        final /* synthetic */ k length;

        getMin(k kVar) {
            this.length = kVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            executeAuth executeauth = (executeAuth) obj;
            Intrinsics.checkNotNullParameter(executeauth, "it");
            List<getExtendDescriptionInSetting> users = executeauth.getUsers();
            if (users != null) {
                this.length.mapRelationshipEntityNickNameToLocalContact(users);
            }
            return hasPermissionModel.toActivityReactions(executeauth);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/social/model/ActivityReactionsResult;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends executeAuth>> {
        public static final setMin setMax = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "<anonymous parameter 0>");
            return TitleBarRightButtonView.AnonymousClass1.just(new executeAuth((String) null, (List) null, (String) null, false, 15, (DefaultConstructorMarker) null));
        }
    }

    @Inject
    public k(@NotNull h hVar, @NotNull getPermissions getpermissions) {
        Intrinsics.checkNotNullParameter(hVar, "activityReactionsDataFactory");
        Intrinsics.checkNotNullParameter(getpermissions, "contactDeviceNameMapper");
        this.activityReactionsDataFactory = hVar;
        this.contactDeviceNameMapper = getpermissions;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0007\u001a.\u0010\u0011\u001a\u001e\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00150\u00150\u0012*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017¨\u0006\u0018"}, d2 = {"openMerchantViewerDialogFromBanner", "", "activity", "Lid/dana/base/BaseActivity;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "position", "", "initialData", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "skeletonScreen", "Lkotlin/Lazy;", "Lcom/ethanhua/skeleton/SkeletonScreen;", "view", "Landroid/view/View;", "skeletonResId", "loadUrl", "Lcom/bumptech/glide/request/target/ViewTarget;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "Landroid/graphics/drawable/Drawable;", "url", "", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.k$3  reason: invalid class name */
    public final class AnonymousClass3 {
        @NotNull
        public static final layoutChildWithKeyline<ImageView, Drawable> length(@NotNull ImageView imageView, @NotNull String str) {
            Intrinsics.checkNotNullParameter(imageView, "$this$loadUrl");
            Intrinsics.checkNotNullParameter(str, "url");
            layoutChildWithKeyline<ImageView, Drawable> length = ((updateCornerMarking) Glide.getMax(imageView.getContext())).setMax(str).setMin((int) R.drawable.ic_merchant_logo_null).length(imageView);
            Intrinsics.checkNotNullExpressionValue(length, "GlideApp.with(this.conte…ogo_null)\n    .into(this)");
            return length;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/SkeletonScreen;", "invoke"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.k$3$getMin */
        public static final class getMin extends Lambda implements Function0<onDetachedFromLayoutParams> {
            final /* synthetic */ int $skeletonResId;
            final /* synthetic */ View $view;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMin(View view, int i) {
                super(0);
                this.$view = view;
                this.$skeletonResId = i;
            }

            @NotNull
            public final onDetachedFromLayoutParams invoke() {
                return containsFavoriteMenuItem.getMin(this.$view, this.$skeletonResId);
            }
        }

        public static final void getMax(@NotNull BaseActivity baseActivity, @NotNull ShopModel shopModel, int i, @NotNull List<MerchantImageModel> list) {
            Intrinsics.checkNotNullParameter(baseActivity, AkuEventParamsKey.KEY_ACTIVITY);
            Intrinsics.checkNotNullParameter(shopModel, "shopModel");
            Intrinsics.checkNotNullParameter(list, "initialData");
            MerchantPhotoViewerDialog.length length = MerchantPhotoViewerDialog.length;
            FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
            String str = shopModel.invoke;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = shopModel.Grayscale$Algorithm;
            if (str3 != null) {
                str2 = str3;
            }
            MerchantPhotoViewerDialog.length.getMin(supportFragmentManager, new MerchantPhotoViewerModel(str, str2, new MediaViewerModel(i, 5, 1, list)));
        }
    }

    /* renamed from: o.k$7  reason: invalid class name */
    public final class AnonymousClass7 implements getBindingAdapter<HomeShoppingTncFragment> {
        @InjectedFieldSignature("id.dana.nearbyme.homeshopping.tnc.HomeShoppingTncFragment.presenter")
        public static void getMin(HomeShoppingTncFragment homeShoppingTncFragment, AnonymousClass8 r1) {
            homeShoppingTncFragment.presenter = r1;
        }
    }

    /* renamed from: o.k$6  reason: invalid class name */
    public final class AnonymousClass6 implements getBindingAdapter<HomeShoppingTutorialFragment> {
        @InjectedFieldSignature("id.dana.nearbyme.homeshopping.tutorial.HomeShoppingTutorialFragment.nearbyAnalyticTracker")
        public static void length(HomeShoppingTutorialFragment homeShoppingTutorialFragment, t tVar) {
            homeShoppingTutorialFragment.nearbyAnalyticTracker = tVar;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<markInside> getActivityReactions(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str2, "kind");
        Intrinsics.checkNotNullParameter(str3, "maxId");
        TitleBarRightButtonView.AnonymousClass1<R> map = createNetworkActivityReactionsData().getActivityReactions(str, str2, str3).onErrorResumeNext(setMin.setMax).map(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(map, "createNetworkActivityRea…Reactions()\n            }");
        return map;
    }

    private final RVOpenAuthHelper.a.AnonymousClass1 createNetworkActivityReactionsData() {
        return this.activityReactionsDataFactory.createData("network");
    }

    /* access modifiers changed from: private */
    public final void mapRelationshipEntityNickNameToLocalContact(List<? extends getShowType> list) {
        this.contactDeviceNameMapper.mapPhoneNumberToDeviceContactNameForRelationshipItem(list);
    }
}
