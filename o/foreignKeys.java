package o;

import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.sendmoney.model.BankModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.primaryKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lid/dana/bank/contract/BankListPresenter;", "Lid/dana/bank/contract/BankListContract$Presenter;", "view", "Lid/dana/bank/contract/BankListContract$View;", "getTopFeaturedBanks", "Lid/dana/domain/requestmoney/interactor/GetTopFeaturedBanks;", "getAvailableBanks", "Lid/dana/domain/withdraw/interactor/GetAvailableBanks;", "bankModelMapper", "Lid/dana/sendmoney/mapper/BankModelMapper;", "(Lid/dana/bank/contract/BankListContract$View;Lid/dana/domain/requestmoney/interactor/GetTopFeaturedBanks;Lid/dana/domain/withdraw/interactor/GetAvailableBanks;Lid/dana/sendmoney/mapper/BankModelMapper;)V", "allBanks", "Ljava/util/ArrayList;", "Lid/dana/sendmoney/model/BankModel;", "Lkotlin/collections/ArrayList;", "getView", "()Lid/dana/bank/contract/BankListContract$View;", "getAllBanks", "getFeaturedAllBanks", "", "getTopBanks", "", "onDestroy", "searchBank", "keyword", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class foreignKeys implements primaryKeys.setMin {
    /* access modifiers changed from: private */
    public final SaveImageToAlbumBridgeExtension getMax;
    @NotNull
    final primaryKeys.setMax getMin;
    /* access modifiers changed from: private */
    public final ArrayList<BankModel> length = new ArrayList<>();
    private final getIdentifiers setMax;
    private final BleGattService setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<List<? extends String>, Unit> {
        final /* synthetic */ List $allBanks;
        final /* synthetic */ foreignKeys this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(foreignKeys foreignkeys, List list) {
            super(1);
            this.this$0 = foreignkeys;
            this.$allBanks = list;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<String>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            this.this$0.getMin.length(setCount.getMin(this.$allBanks, list));
        }
    }

    @Inject
    public foreignKeys(@NotNull primaryKeys.setMax setmax, @NotNull getIdentifiers getidentifiers, @NotNull BleGattService bleGattService, @NotNull SaveImageToAlbumBridgeExtension saveImageToAlbumBridgeExtension) {
        Intrinsics.checkNotNullParameter(setmax, "view");
        Intrinsics.checkNotNullParameter(getidentifiers, "getTopFeaturedBanks");
        Intrinsics.checkNotNullParameter(bleGattService, "getAvailableBanks");
        Intrinsics.checkNotNullParameter(saveImageToAlbumBridgeExtension, "bankModelMapper");
        this.getMin = setmax;
        this.setMax = getidentifiers;
        this.setMin = bleGattService;
        this.getMax = saveImageToAlbumBridgeExtension;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/bank/contract/BankListPresenter$getFeaturedAllBanks$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/sendmoney/model/TransferInit;", "onError", "", "error", "", "onNext", "transferInit", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<getDataFieldCount> {
        final /* synthetic */ foreignKeys getMin;

        setMax(foreignKeys foreignkeys) {
            this.getMin = foreignkeys;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getDataFieldCount getdatafieldcount = (getDataFieldCount) obj;
            Intrinsics.checkNotNullParameter(getdatafieldcount, "transferInit");
            this.getMin.getMin.dismissProgress();
            List list = (List) this.getMin.getMax.apply(getdatafieldcount);
            primaryKeys.setMax setmax = this.getMin.getMin;
            Intrinsics.checkNotNullExpressionValue(list, "bankModels");
            List sortedWith = CollectionsKt.sortedWith(list, new setMin());
            this.getMin.length.addAll(sortedWith);
            Unit unit = Unit.INSTANCE;
            setmax.getMin((List<? extends BankModel>) sortedWith);
            this.getMin.setMax.execute(onReceivedIcon.INSTANCE, new setMin(this.getMin, list), getMax.INSTANCE);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            this.getMin.getMin.dismissProgress();
            primaryKeys.setMax setmax = this.getMin.getMin;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            setmax.getMin(message);
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, th.getMessage(), th);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
        public static final class setMin<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((BankModel) t).toIntRange, ((BankModel) t2).toIntRange);
            }
        }
    }

    public final void length() {
        this.getMin.showProgress();
        this.setMin.execute(new setMax(this));
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        ArrayList arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        Iterator it = this.length.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str2 = ((BankModel) next).toIntRange;
            if (str2 != null && StringsKt.contains((CharSequence) str2, (CharSequence) str, true)) {
                z = true;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        List list = (List) arrayList2;
        Collection arrayList3 = new ArrayList();
        for (Object next2 : this.length) {
            String str3 = ((BankModel) next2).setMin;
            if (str3 != null && StringsKt.contains((CharSequence) str3, (CharSequence) str, true)) {
                arrayList3.add(next2);
            }
        }
        arrayList.addAll(CollectionsKt.union(list, (List) arrayList3));
        this.getMin.setMax(arrayList);
    }

    public final void setMax() {
        this.setMax.dispose();
        this.setMin.dispose();
    }
}
