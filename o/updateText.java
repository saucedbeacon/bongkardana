package o;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.nearbyme.model.ShopModel;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.DeviceManifest;
import o.RVFileAbilityProxy;
import o.TitleBarRightButtonView;
import o.a;
import o.getFileSHA1;
import o.isEmbeddedApp;
import o.isFile;
import o.k;
import o.setGriverAppVirtualHostProxy;
import o.setTextColor;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 J2\u00020\u0001:\u0001JB_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020*H\u0016J\u0010\u00105\u001a\u0002022\u0006\u00106\u001a\u00020*H\u0016J\b\u0010\u0014\u001a\u000202H\u0016J\u0010\u0010\u000e\u001a\u0002022\u0006\u00107\u001a\u000208H\u0016J\u0016\u00109\u001a\u0002022\f\u0010:\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\b\u0010;\u001a\u000202H\u0016J\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020%2\u0006\u00106\u001a\u00020*H\u0007J\b\u0010?\u001a\u000202H\u0016J\b\u0010@\u001a\u000202H\u0016J\u0018\u0010A\u001a\u0002022\u0006\u00106\u001a\u00020*2\u0006\u0010B\u001a\u000208H\u0016J \u0010C\u001a\u0002022\u0006\u00106\u001a\u00020*2\u0006\u0010B\u001a\u0002082\u0006\u0010D\u001a\u00020\u001aH\u0016J\u0016\u0010E\u001a\u0002022\f\u0010F\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J\u0016\u0010G\u001a\u0002022\f\u0010F\u001a\b\u0012\u0004\u0012\u00020%0HH\u0002J\b\u0010I\u001a\u000202H\u0016R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#X.¢\u0006\u0002\n\u0000R(\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020% (*\n\u0012\u0004\u0012\u00020%\u0018\u00010$0$0'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R$\u0010)\u001a\u00020*8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchPresenter;", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$Presenter;", "view", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$View;", "getListNearbyLocation", "Lid/dana/domain/nearbyplaces/interactor/GetListNearbyLocation;", "getLocationDetail", "Lid/dana/domain/nearbyplaces/interactor/GetLocationDetail;", "getNearbyShopsWithPagination", "Lid/dana/domain/nearbyme/interactor/GetNearbyShopsWithPagination;", "getNearbyShopsPromo", "Lid/dana/domain/nearbyme/interactor/GetNearbyShopsPromo;", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "getReverseGeocodeByLocation", "Lid/dana/domain/miniprogram/interactor/GetReverseGeocodeByLocation;", "nearbyShopsModelMapper", "Lid/dana/nearbyme/mapper/NearbyShopsModelMapper;", "promoShopsModelMapper", "Lid/dana/nearbyme/NearbyPromoModelMapper;", "getNearbyRankingConfig", "Lid/dana/domain/nearbyme/interactor/GetNearbyRankingConfig;", "shopRankingCalculator", "Lid/dana/nearbyrevamp/ShopRankingCalculator;", "(Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$View;Lid/dana/domain/nearbyplaces/interactor/GetListNearbyLocation;Lid/dana/domain/nearbyplaces/interactor/GetLocationDetail;Lid/dana/domain/nearbyme/interactor/GetNearbyShopsWithPagination;Lid/dana/domain/nearbyme/interactor/GetNearbyShopsPromo;Lid/dana/data/config/DeviceInformationProvider;Lid/dana/domain/miniprogram/interactor/GetReverseGeocodeByLocation;Lid/dana/nearbyme/mapper/NearbyShopsModelMapper;Lid/dana/nearbyme/NearbyPromoModelMapper;Lid/dana/domain/nearbyme/interactor/GetNearbyRankingConfig;Lid/dana/nearbyrevamp/ShopRankingCalculator;)V", "currentMerchantSearchPage", "", "getCurrentMerchantSearchPage", "()I", "setCurrentMerchantSearchPage", "(I)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "promoDisposable", "shop", "Lio/reactivex/Observable;", "", "Lid/dana/nearbyme/model/ShopModel;", "shopObservables", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "uuid", "", "getUuid$annotations", "()V", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "getDetailLocation", "", "placeId", "locationName", "getNearbyMerchantList", "keyword", "location", "Landroid/location/Location;", "getShopsPromo", "shops", "initUuid", "isMatchKeyword", "", "shopModel", "onDestroy", "resetSearchMerchant", "searchListNearbyLocations", "currentLocation", "searchListShop", "lastShopRanking", "setPublishSubject", "shopModels", "sortShops", "", "subscribeToPublishSubject", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class updateText implements setTextColor.length {
    @NotNull
    public static final length equals = new length((byte) 0);
    private final isEmbeddedApp FastBitmap$CoordinateSystem;
    private final installPathValid Grayscale$Algorithm;
    private final IRedDotManager IsOverlapping = new IRedDotManager();
    /* access modifiers changed from: private */
    public final setUserId Mean$Arithmetic;
    public final IRedDotManager getMax = new IRedDotManager();
    public final getPerformanceTracker getMin;
    /* access modifiers changed from: private */
    public final fetchAppList hashCode;
    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<List<ShopModel>> isInside;
    @NotNull
    public String length = "";
    public final IComponent<List<ShopModel>> setMax;
    int setMin = 1;
    private final RVFileAbilityProxy toDoubleRange;
    /* access modifiers changed from: private */
    public final setTextColor.getMin toFloatRange;
    private final isFile toIntRange;
    private final setGriverAppVirtualHostProxy toString;
    /* access modifiers changed from: private */
    public final DeviceManifest.AnonymousClass2 valueOf;
    private final getFileSHA1 values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "shops", "", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "", "accept"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T> implements RedDotManager<List<ShopModel>> {
        final /* synthetic */ updateText getMin;

        getMax(updateText updatetext) {
            this.getMin = updatetext;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            setTextColor.getMin max = this.getMin.toFloatRange;
            Intrinsics.checkNotNullExpressionValue(list, "shops");
            max.getMin(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a,\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "", "searchKey", "", "shops", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T1, T2, R> implements removeNode<String, List<? extends ShopModel>, TitleBarRightButtonView.AnonymousClass1<List<ShopModel>>> {
        final /* synthetic */ updateText length;

        getMin(updateText updatetext) {
            this.length = updatetext;
        }

        public final /* synthetic */ Object setMax(Object obj, Object obj2) {
            final String str = (String) obj;
            List list = (List) obj2;
            Intrinsics.checkNotNullParameter(str, "searchKey");
            Intrinsics.checkNotNullParameter(list, "shops");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list2 = TitleBarRightButtonView.AnonymousClass1.fromIterable(list).filter(new getChildren<ShopModel>(this) {
                final /* synthetic */ getMin setMin;

                {
                    this.setMin = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: length */
                public boolean test(@NotNull ShopModel shopModel) {
                    Intrinsics.checkNotNullParameter(shopModel, "shopModel");
                    return updateText.setMin(shopModel, str);
                }
            }).toList();
            if (list2 instanceof getSecondFloorView) {
                return ((getSecondFloorView) list2).setMax();
            }
            setTitleLoading settitleloading = new setTitleLoading(list2);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002 \u0004*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002\u0018\u00010\u00010\u000120\u0010\u0006\u001a,\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "", "shopsObservable", "Lio/reactivex/Observable;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<TitleBarRightButtonView.AnonymousClass1<List<ShopModel>>, TitleBarRightButtonView.AnonymousClass4<? extends List<ShopModel>>> {
        public static final setMin length = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r2 = (TitleBarRightButtonView.AnonymousClass1) obj;
            Intrinsics.checkNotNullParameter(r2, "shopsObservable");
            return r2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "firstShop", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "secondShop", "compare"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange<T> implements Comparator<ShopModel> {
        final /* synthetic */ updateText getMin;

        toDoubleRange(updateText updatetext) {
            this.getMin = updatetext;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ShopModel shopModel = (ShopModel) obj;
            ShopModel shopModel2 = (ShopModel) obj2;
            DeviceManifest.AnonymousClass2 max = this.getMin.valueOf;
            Intrinsics.checkNotNullExpressionValue(shopModel2, "secondShop");
            double max2 = max.getMax(shopModel2);
            DeviceManifest.AnonymousClass2 max3 = this.getMin.valueOf;
            Intrinsics.checkNotNullExpressionValue(shopModel, "firstShop");
            return Double.compare(max2, max3.getMax(shopModel));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    public static final class values<T> implements RedDotManager<List<? extends ShopModel>> {
        final /* synthetic */ updateText length;

        public values(updateText updatetext) {
            this.length = updatetext;
        }

        public final /* synthetic */ void accept(Object obj) {
            updateText updatetext = this.length;
            TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just((List) obj);
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(it)");
            updatetext.isInside = just;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/miniprogram/model/Address;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<processFacade, Unit> {
        final /* synthetic */ updateText this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(updateText updatetext) {
            super(1);
            this.this$0 = updatetext;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((processFacade) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull processFacade processfacade) {
            Intrinsics.checkNotNullParameter(processfacade, "it");
            this.this$0.toFloatRange.onSuccessGetReverseGeocodeByLocation(processfacade);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ updateText this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(updateText updatetext) {
            super(1);
            this.this$0 = updatetext;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            StringBuilder sb = new StringBuilder();
            sb.append(this.this$0.getClass().getName());
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.GEOCODE, sb.toString(), th);
        }
    }

    @Inject
    public updateText(@NotNull setTextColor.getMin getmin, @NotNull isFile isfile, @NotNull getFileSHA1 getfilesha1, @NotNull setGriverAppVirtualHostProxy setgriverappvirtualhostproxy, @NotNull isEmbeddedApp isembeddedapp, @NotNull getPerformanceTracker getperformancetracker, @NotNull RVFileAbilityProxy rVFileAbilityProxy, @NotNull fetchAppList fetchapplist, @NotNull setUserId setuserid, @NotNull installPathValid installpathvalid, @NotNull DeviceManifest.AnonymousClass2 r12) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(isfile, "getListNearbyLocation");
        Intrinsics.checkNotNullParameter(getfilesha1, "getLocationDetail");
        Intrinsics.checkNotNullParameter(setgriverappvirtualhostproxy, "getNearbyShopsWithPagination");
        Intrinsics.checkNotNullParameter(isembeddedapp, "getNearbyShopsPromo");
        Intrinsics.checkNotNullParameter(getperformancetracker, "deviceInformationProvider");
        Intrinsics.checkNotNullParameter(rVFileAbilityProxy, "getReverseGeocodeByLocation");
        Intrinsics.checkNotNullParameter(fetchapplist, "nearbyShopsModelMapper");
        Intrinsics.checkNotNullParameter(setuserid, "promoShopsModelMapper");
        Intrinsics.checkNotNullParameter(installpathvalid, "getNearbyRankingConfig");
        Intrinsics.checkNotNullParameter(r12, "shopRankingCalculator");
        this.toFloatRange = getmin;
        this.toIntRange = isfile;
        this.values = getfilesha1;
        this.toString = setgriverappvirtualhostproxy;
        this.FastBitmap$CoordinateSystem = isembeddedapp;
        this.getMin = getperformancetracker;
        this.toDoubleRange = rVFileAbilityProxy;
        this.hashCode = fetchapplist;
        this.Mean$Arithmetic = setuserid;
        this.Grayscale$Algorithm = installpathvalid;
        this.valueOf = r12;
        IComponent<List<ShopModel>> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create<List<ShopModel>>()");
        this.setMax = max;
    }

    public final int setMin() {
        return this.setMin;
    }

    public final void length() {
        String deviceUUID = this.getMin.getDeviceUUID();
        Intrinsics.checkNotNullExpressionValue(deviceUUID, "deviceInformationProvider.deviceUUID");
        this.length = deviceUUID;
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(str);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(keyword)");
        if (this.isInside != null) {
            TitleBarRightButtonView.AnonymousClass4 r3 = just;
            TitleBarRightButtonView.AnonymousClass1<List<ShopModel>> r0 = this.isInside;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shop");
            }
            this.getMax.getMin(TitleBarRightButtonView.AnonymousClass1.combineLatest(r3, r0, new getMin(this)).flatMap(setMin.length).subscribe(new getMax(this)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/contract/nearbyme/NearbyMerchantLocationSearchPresenter$searchListNearbyLocations$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "onError", "", "e", "", "onNext", "nearbyLocations", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends GriverAppVirtualHostProxy<List<? extends getCreateTime>> {
        final /* synthetic */ updateText length;

        toIntRange(updateText updatetext) {
            this.length = updatetext;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "nearbyLocations");
            this.length.toFloatRange.onSuccessGetListLocations(list);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.NEARBY_LOCATION, sb.toString(), th);
            this.length.toFloatRange.onErrorGetListLocations();
        }
    }

    public final void length(@NotNull String str, @NotNull Location location) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        Intrinsics.checkNotNullParameter(location, "currentLocation");
        this.toIntRange.execute(new toIntRange(this), isFile.length.Companion.forListNearbyLocations(this.length, str, location));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/nearbyme/NearbyMerchantLocationSearchPresenter$searchListShop$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/nearbyme/model/ShopsPage;", "onError", "", "e", "", "onNext", "shopsPage", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverAppVirtualHostProxy<H5FileUtil> {
        final /* synthetic */ updateText getMax;
        final /* synthetic */ int setMax;

        IsOverlapping(updateText updatetext, int i) {
            this.getMax = updatetext;
            this.setMax = i;
        }

        public final /* synthetic */ void onNext(Object obj) {
            H5FileUtil h5FileUtil = (H5FileUtil) obj;
            Intrinsics.checkNotNullParameter(h5FileUtil, "shopsPage");
            Object apply = this.getMax.hashCode.apply(h5FileUtil);
            Intrinsics.checkNotNullExpressionValue(apply, "nearbyShopsModelMapper.apply(shopsPage)");
            List<ShopModel> list = ((a.C0056a) apply).getMax;
            Intrinsics.checkNotNullExpressionValue(list, "nearbyShopsModelMapper.apply(shopsPage).shops");
            List mutableList = CollectionsKt.toMutableList(list);
            updateText.getMin(this.getMax, mutableList);
            List<ShopModel> max = k.AnonymousClass2.setMax(mutableList, this.setMax);
            if (this.getMax.setMin == 1) {
                this.getMax.toFloatRange.getMin(h5FileUtil.getHasMore(), max);
            } else {
                this.getMax.toFloatRange.setMin(h5FileUtil.getHasMore(), max);
            }
            updateText.getMax(this.getMax, (List) max);
            this.getMax.setMin++;
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.NEARBY_MERCHANT_SEARCH, sb.toString(), th);
            this.getMax.toFloatRange.setMax();
        }
    }

    public final void setMin(@NotNull String str, @NotNull Location location, int i) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        Intrinsics.checkNotNullParameter(location, "currentLocation");
        this.toString.execute(new IsOverlapping(this, i), new setGriverAppVirtualHostProxy.length(location.getLatitude(), location.getLongitude(), this.setMin, 20, str, true, FirebaseAnalytics.Event.SEARCH));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"id/dana/contract/nearbyme/NearbyMerchantLocationSearchPresenter$getShopsPromo$1$observer$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/domain/nearbyme/model/NearbyShopsPromo;", "onError", "", "e", "", "onNext", "nearbyShopsPromo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends GriverAppVirtualHostProxy<List<getTempPath>> {
        final /* synthetic */ updateText length;
        final /* synthetic */ List setMin;

        isInside(updateText updatetext, List list) {
            this.length = updatetext;
            this.setMin = list;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "nearbyShopsPromo");
            setTextColor.getMin max = this.length.toFloatRange;
            List<ShopModel> max2 = this.length.Mean$Arithmetic.setMax(this.setMin, list);
            Intrinsics.checkNotNullExpressionValue(max2, "promoShopsModelMapper.tr…(shops, nearbyShopsPromo)");
            max.setMin(max2);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.NEARBY_MERCHANT_SEARCH, sb.toString(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/nearbyme/NearbyMerchantLocationSearchPresenter$getDetailLocation$1", "Lid/dana/domain/DefaultObserver;", "Landroid/location/Location;", "onError", "", "e", "", "onNext", "nearbyLocation", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<Location> {
        final /* synthetic */ updateText getMin;

        setMax(updateText updatetext) {
            this.getMin = updatetext;
        }

        public final /* synthetic */ void onNext(Object obj) {
            Location location = (Location) obj;
            Intrinsics.checkNotNullParameter(location, "nearbyLocation");
            this.getMin.toFloatRange.onSuccessGetDetailLocation(location);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.NEARBY_LOCATION, sb.toString(), th);
            this.getMin.toFloatRange.onErrorGetDetailLocation();
        }
    }

    public final void setMin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "placeId");
        Intrinsics.checkNotNullParameter(str2, "locationName");
        this.values.execute(new setMax(this), getFileSHA1.getMax.Companion.forLocationDetail(str2, str, this.length));
    }

    public final void getMin(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.toDoubleRange.execute(RVFileAbilityProxy.setMin.Companion.create(location), new equals(this), new toFloatRange(this));
    }

    @VisibleForTesting
    public static boolean setMin(@NotNull ShopModel shopModel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            return true;
        }
        if (!TextUtils.isEmpty(shopModel.invoke)) {
            String str2 = shopModel.invoke;
            Intrinsics.checkNotNullExpressionValue(str2, "shopModel.mainName");
            if (str2 != null) {
                String lowerCase = str2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (StringsKt.contains$default((CharSequence) lowerCase, charSequence, false, 2, (Object) null)) {
                    return true;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    public final void getMin(@NotNull List<? extends ShopModel> list) {
        Intrinsics.checkNotNullParameter(list, "shopModels");
        this.setMax.onNext(list);
    }

    public final void getMin() {
        this.getMax.getMin(this.setMax.subscribe(new values(this)));
    }

    public final void setMax() {
        this.toIntRange.dispose();
        this.toString.dispose();
        this.FastBitmap$CoordinateSystem.dispose();
        this.values.dispose();
        this.Grayscale$Algorithm.dispose();
        this.getMax.dispose();
        this.IsOverlapping.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchPresenter$Companion;", "", "()V", "MERCHANT_SEARCH_PAGE_SIZE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void getMax() {
        this.setMin = 1;
        this.toString.dispose();
    }

    public static final /* synthetic */ void getMin(updateText updatetext, List list) {
        updatetext.valueOf.setMin = true;
        CollectionsKt.sortWith(list, new toDoubleRange(updatetext));
    }

    public static final /* synthetic */ void getMax(updateText updatetext, List list) {
        for (List max : CollectionsKt.chunked(list, 5)) {
            isInside isinside = new isInside(updatetext, list);
            updatetext.FastBitmap$CoordinateSystem.execute(isinside, new isEmbeddedApp.getMax(k.AnonymousClass2.getMax(max)));
            updatetext.IsOverlapping.getMin(isinside);
        }
    }
}
