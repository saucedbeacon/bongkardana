package o;

import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import o.distanceInfluenceForSnapDuration;
import o.g;
import o.isEmbeddedApp;
import o.k;
import o.setPublishingStatus;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017H\u0002J\u0010\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0002J\u0016\u0010-\u001a\u00020&2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bH\u0016J8\u0010/\u001a\u00020&2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u0002012\u0006\u00107\u001a\u000201H\u0016J8\u00108\u001a\u00020&2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u0002012\u0006\u00107\u001a\u000201H\u0016J\u0016\u00109\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017H\u0007J\b\u0010:\u001a\u00020&H\u0016J\b\u0010;\u001a\u00020&H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0018 \u0019*\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u000e¢\u0006\u0002\n\u0000R(\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u0019*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00170\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lid/dana/contract/nearbyme/OtherStoreListPresenter;", "Lid/dana/contract/nearbyme/OtherStoreListContract$Presenter;", "getOtherStoreList", "Lid/dana/domain/nearbyme/interactor/GetOtherStoreList;", "getNearbyShopsPromo", "Lid/dana/domain/nearbyme/interactor/GetNearbyShopsPromo;", "nearbyPromoModelMapper", "Lid/dana/nearbyme/NearbyPromoModelMapper;", "view", "Lid/dana/contract/nearbyme/OtherStoreListContract$View;", "modelMapper", "Lid/dana/nearbyme/mapper/OtherStoreListResultModelMapper;", "(Lid/dana/domain/nearbyme/interactor/GetOtherStoreList;Lid/dana/domain/nearbyme/interactor/GetNearbyShopsPromo;Lid/dana/nearbyme/NearbyPromoModelMapper;Lid/dana/contract/nearbyme/OtherStoreListContract$View;Lid/dana/nearbyme/mapper/OtherStoreListResultModelMapper;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "merchantCategoriesSubject", "Lio/reactivex/subjects/PublishSubject;", "", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "kotlin.jvm.PlatformType", "otherStoreList", "", "Lid/dana/nearbyme/model/ShopModel;", "otherStoreListSubject", "pageNum", "", "getPageNum", "()I", "setPageNum", "(I)V", "promoDisposable", "addOtherStoreList", "", "shopModels", "addPromoDisposable", "disposable", "Lio/reactivex/disposables/Disposable;", "cancelGetOtherShop", "disposePromo", "filterOtherStore", "checkedCategories", "getOtherShopListAndPromo", "merchantId", "", "lat", "", "long", "pageSize", "searchKeyword", "searchType", "getShopList", "getShopsPromo", "initOtherStoreFilterObservable", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class dataSetChanged implements distanceInfluenceForSnapDuration.getMax {
    /* access modifiers changed from: private */
    public final setUserId IsOverlapping;
    private final IRedDotManager equals;
    IRedDotManager getMax;
    boolean getMin;
    /* access modifiers changed from: private */
    public final distanceInfluenceForSnapDuration.setMin hashCode;
    private final IComponent<List<ShopModel>> isInside;
    int length;
    private List<ShopModel> setMax = new ArrayList();
    final isEmbeddedApp setMin;
    private final IComponent<List<g.AnonymousClass1>> toFloatRange;
    private final setPublishingStatus toIntRange;
    /* access modifiers changed from: private */
    public final GriverBaseActivity values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T> implements RedDotManager<List<ShopModel>> {
        final /* synthetic */ dataSetChanged getMin;

        IsOverlapping(dataSetChanged datasetchanged) {
            this.getMin = datasetchanged;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            distanceInfluenceForSnapDuration.setMin max = this.getMin.hashCode;
            Intrinsics.checkNotNullExpressionValue(list, "it");
            max.getMin(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a,\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "", "merchantCategories", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "otherStore", "apply"}, k = 3, mv = {1, 4, 2})
    static final class equals<T1, T2, R> implements removeNode<List<? extends g.AnonymousClass1>, List<? extends ShopModel>, TitleBarRightButtonView.AnonymousClass1<List<ShopModel>>> {
        public static final equals setMin = new equals();

        equals() {
        }

        public final /* synthetic */ Object setMax(Object obj, Object obj2) {
            final List list = (List) obj;
            List list2 = (List) obj2;
            Intrinsics.checkNotNullParameter(list, "merchantCategories");
            Intrinsics.checkNotNullParameter(list2, "otherStore");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list3 = TitleBarRightButtonView.AnonymousClass1.fromIterable(list2).filter(new getChildren<ShopModel>() {
                /* access modifiers changed from: private */
                /* renamed from: length */
                public boolean test(@NotNull ShopModel shopModel) {
                    Intrinsics.checkNotNullParameter(shopModel, "it");
                    List list = list;
                    Intrinsics.checkNotNullExpressionValue(list, "merchantCategories");
                    return k.AnonymousClass2.getMax(shopModel, list);
                }
            }).toList();
            if (list3 instanceof getSecondFloorView) {
                return ((getSecondFloorView) list3).setMax();
            }
            setTitleLoading settitleloading = new setTitleLoading(list3);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lid/dana/domain/nearbyme/model/OtherStoreListResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<getCachePath, Unit> {
        final /* synthetic */ dataSetChanged this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(dataSetChanged datasetchanged) {
            super(1);
            this.this$0 = datasetchanged;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getCachePath) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getCachePath getcachepath) {
            Intrinsics.checkNotNullParameter(getcachepath, "result");
            this.this$0.length++;
            this.this$0.getMin = getcachepath.getHasMore();
            this.this$0.hashCode.dismissProgress();
            distanceInfluenceForSnapDuration.setMin max = this.this$0.hashCode;
            Object apply = this.this$0.values.apply(getcachepath);
            Intrinsics.checkNotNullExpressionValue(apply, "modelMapper.apply(result)");
            max.setMax((InternalApiBridgeExtension) apply);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ dataSetChanged this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(dataSetChanged datasetchanged) {
            super(1);
            this.this$0 = datasetchanged;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.hashCode.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002 \u0004*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002\u0018\u00010\u00010\u000120\u0010\u0006\u001a,\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "", "shopsObservable", "Lio/reactivex/Observable;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T, R> implements RedDotDrawable<TitleBarRightButtonView.AnonymousClass1<List<ShopModel>>, TitleBarRightButtonView.AnonymousClass4<? extends List<ShopModel>>> {
        public static final isInside getMax = new isInside();

        isInside() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r2 = (TitleBarRightButtonView.AnonymousClass1) obj;
            Intrinsics.checkNotNullParameter(r2, "shopsObservable");
            return r2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ dataSetChanged this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(dataSetChanged datasetchanged) {
            super(1);
            this.this$0 = datasetchanged;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.hashCode.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lid/dana/domain/nearbyme/model/OtherStoreListResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<getCachePath, Unit> {
        final /* synthetic */ dataSetChanged this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(dataSetChanged datasetchanged) {
            super(1);
            this.this$0 = datasetchanged;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getCachePath) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getCachePath getcachepath) {
            Intrinsics.checkNotNullParameter(getcachepath, "result");
            this.this$0.hashCode.dismissProgress();
            InternalApiBridgeExtension internalApiBridgeExtension = (InternalApiBridgeExtension) this.this$0.values.apply(getcachepath);
            dataSetChanged.length(this.this$0, internalApiBridgeExtension.getMin);
            dataSetChanged datasetchanged = this.this$0;
            List<ShopModel> list = internalApiBridgeExtension.getMin;
            Intrinsics.checkNotNullParameter(list, "shopModels");
            for (List list2 : CollectionsKt.chunked(list, 5)) {
                setMin setmin = new setMin(list2, datasetchanged);
                datasetchanged.setMin.execute(setmin, new isEmbeddedApp.getMax(k.AnonymousClass2.getMax(list2)));
                GriverProgressBar.UpdateRunnable updateRunnable = setmin;
                if (datasetchanged.getMax == null) {
                    datasetchanged.getMax = new IRedDotManager();
                }
                IRedDotManager iRedDotManager = datasetchanged.getMax;
                if (iRedDotManager != null) {
                    iRedDotManager.getMin(updateRunnable);
                }
            }
            this.this$0.length++;
            this.this$0.getMin = getcachepath.getHasMore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012(\u0010\u0005\u001a$\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<List<ShopModel>, TitleBarRightButtonView.AnonymousClass4<? extends List<ShopModel>>> {
        public static final toIntRange setMin = new toIntRange();

        toIntRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            Intrinsics.checkNotNullParameter(list, "$this$toRankedShopModelsObservable");
            TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new k.AnonymousClass2.getMin(list, 0));
            Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …opModel(lastRankedShop) }");
            return fromCallable;
        }
    }

    @Inject
    public dataSetChanged(@NotNull setPublishingStatus setpublishingstatus, @NotNull isEmbeddedApp isembeddedapp, @NotNull setUserId setuserid, @NotNull distanceInfluenceForSnapDuration.setMin setmin, @NotNull GriverBaseActivity griverBaseActivity) {
        Intrinsics.checkNotNullParameter(setpublishingstatus, "getOtherStoreList");
        Intrinsics.checkNotNullParameter(isembeddedapp, "getNearbyShopsPromo");
        Intrinsics.checkNotNullParameter(setuserid, "nearbyPromoModelMapper");
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(griverBaseActivity, "modelMapper");
        this.toIntRange = setpublishingstatus;
        this.setMin = isembeddedapp;
        this.IsOverlapping = setuserid;
        this.hashCode = setmin;
        this.values = griverBaseActivity;
        IComponent<List<ShopModel>> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create<List<ShopModel>>()");
        this.isInside = max;
        IComponent<List<g.AnonymousClass1>> max2 = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max2, "PublishSubject.create<Li…MerchantCategoryModel>>()");
        this.toFloatRange = max2;
        this.equals = new IRedDotManager();
        this.length = 1;
    }

    public final int length() {
        return this.length;
    }

    public final boolean getMax() {
        return this.getMin;
    }

    public final void setMin(@NotNull String str, double d, double d2, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        Intrinsics.checkNotNullParameter(str4, "merchantId");
        String str5 = str2;
        Intrinsics.checkNotNullParameter(str5, "searchKeyword");
        String str6 = str3;
        Intrinsics.checkNotNullParameter(str6, "searchType");
        this.toIntRange.execute(new setPublishingStatus.setMax(str4, d, d2, 10, this.length, str5, str6, false, 128, (DefaultConstructorMarker) null), new getMax(this), new getMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"id/dana/contract/nearbyme/OtherStoreListPresenter$getShopsPromo$1$observer$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/domain/nearbyme/model/NearbyShopsPromo;", "onNext", "", "nearbyShopsPromo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<List<getTempPath>> {
        final /* synthetic */ List length;
        final /* synthetic */ dataSetChanged setMin;

        setMin(List list, dataSetChanged datasetchanged) {
            this.length = list;
            this.setMin = datasetchanged;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "nearbyShopsPromo");
            distanceInfluenceForSnapDuration.setMin max = this.setMin.hashCode;
            List<ShopModel> max2 = this.setMin.IsOverlapping.setMax(this.length, list);
            Intrinsics.checkNotNullExpressionValue(max2, "nearbyPromoModelMapper.t…        nearbyShopsPromo)");
            max.setMin(max2);
        }
    }

    public final void getMin(@NotNull String str, double d, double d2, @NotNull String str2, @NotNull String str3) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1473179860, oncanceled);
            onCancelLoad.getMin(-1473179860, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "merchantId");
        String str4 = str2;
        Intrinsics.checkNotNullParameter(str4, "searchKeyword");
        String str5 = str3;
        Intrinsics.checkNotNullParameter(str5, "searchType");
        this.toIntRange.execute(new setPublishingStatus.setMax(str, d, d2, 20, this.length, str4, str5, true), new setMax(this), new length(this));
    }

    public final void setMin() {
        this.equals.getMin(TitleBarRightButtonView.AnonymousClass1.combineLatest(this.toFloatRange.startWith(CollectionsKt.emptyList()), this.isInside, equals.setMin).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).flatMap(isInside.getMax).flatMap(toIntRange.setMin).subscribe(new IsOverlapping(this)));
    }

    public final void getMin(@NotNull List<g.AnonymousClass1> list) {
        Intrinsics.checkNotNullParameter(list, "checkedCategories");
        this.toFloatRange.onNext(list);
    }

    public final void setMax() {
        this.equals.dispose();
        this.toIntRange.dispose();
        this.setMin.dispose();
        IRedDotManager iRedDotManager = this.getMax;
        if (iRedDotManager != null) {
            iRedDotManager.dispose();
        }
        this.getMax = null;
    }

    public final void getMin() {
        this.length = 1;
        this.getMin = false;
        this.setMax.clear();
        this.toIntRange.dispose();
        this.setMin.dispose();
        IRedDotManager iRedDotManager = this.getMax;
        if (iRedDotManager != null) {
            iRedDotManager.dispose();
        }
        this.getMax = null;
    }

    public static final /* synthetic */ void length(dataSetChanged datasetchanged, List list) {
        if (datasetchanged.length == 1) {
            datasetchanged.setMax = CollectionsKt.toMutableList(list);
        } else {
            datasetchanged.setMax.addAll(list);
        }
        datasetchanged.isInside.onNext(datasetchanged.setMax);
    }
}
