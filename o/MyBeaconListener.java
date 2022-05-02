package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BluetoothLeUtils;
import o.NullBeaconDataFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/explore/service/presenter/ExploreServicePresenter;", "Lid/dana/explore/service/ExploreServiceContract$Presenter;", "getCategoryExploreDana", "Lid/dana/domain/exploredana/interactor/GetCategoryExploreDana;", "view", "Lid/dana/explore/service/ExploreServiceContract$View;", "(Lid/dana/domain/exploredana/interactor/GetCategoryExploreDana;Lid/dana/explore/service/ExploreServiceContract$View;)V", "getDescriptionForDefaultService", "", "service", "Lid/dana/explore/service/model/ExploreServiceModel;", "topupDesc", "", "sendMoneyDesc", "getExploreService", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MyBeaconListener implements BluetoothLeUtils.setMin {
    /* access modifiers changed from: private */
    public final BluetoothLeUtils.setMax getMax;
    private final setStandardFontFamily setMax;

    @JvmDefault
    public final void setMax() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GET_EXPLORE_SERVICE, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<List<? extends NullBeaconDataFactory.AnonymousClass1>, Unit> {
        final /* synthetic */ MyBeaconListener this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(MyBeaconListener myBeaconListener) {
            super(1);
            this.this$0 = myBeaconListener;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends NullBeaconDataFactory.AnonymousClass1>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<? extends NullBeaconDataFactory.AnonymousClass1> list) {
            String str;
            Intrinsics.checkNotNullParameter(list, "it");
            BluetoothLeUtils.setMax min = this.this$0.getMax;
            Intrinsics.checkNotNullParameter(list, "$this$toListExploreServiceModel");
            Iterable<NullBeaconDataFactory.AnonymousClass1> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (NullBeaconDataFactory.AnonymousClass1 r2 : iterable) {
                Intrinsics.checkNotNullParameter(r2, "$this$toExploreServiceModel");
                List<ThirdPartyServiceResponse> thirdPartyServices = r2.getThirdPartyServices();
                Intrinsics.checkNotNullExpressionValue(thirdPartyServices, "thirdPartyServices");
                String key = ((ThirdPartyServiceResponse) CollectionsKt.first(thirdPartyServices)).getKey();
                List<ThirdPartyServiceResponse> thirdPartyServices2 = r2.getThirdPartyServices();
                Intrinsics.checkNotNullExpressionValue(thirdPartyServices2, "thirdPartyServices");
                String name = ((ThirdPartyServiceResponse) CollectionsKt.first(thirdPartyServices2)).getName();
                String str2 = name == null ? "" : name;
                List<ThirdPartyServiceResponse> thirdPartyServices3 = r2.getThirdPartyServices();
                Intrinsics.checkNotNullExpressionValue(thirdPartyServices3, "thirdPartyServices");
                String description = ((ThirdPartyServiceResponse) CollectionsKt.first(thirdPartyServices3)).getDescription();
                if (description == null) {
                    str = "";
                } else {
                    str = description;
                }
                List<ThirdPartyServiceResponse> thirdPartyServices4 = r2.getThirdPartyServices();
                Intrinsics.checkNotNullExpressionValue(thirdPartyServices4, "thirdPartyServices");
                String icon = ((ThirdPartyServiceResponse) CollectionsKt.first(thirdPartyServices4)).getIcon();
                if (icon == null) {
                    icon = "";
                }
                arrayList.add(new MyBeacon(key, str2, str, icon, false, 16));
            }
            min.onGetExploreService((List) arrayList);
        }
    }

    @Inject
    public MyBeaconListener(@NotNull setStandardFontFamily setstandardfontfamily, @NotNull BluetoothLeUtils.setMax setmax) {
        Intrinsics.checkNotNullParameter(setstandardfontfamily, "getCategoryExploreDana");
        Intrinsics.checkNotNullParameter(setmax, "view");
        this.setMax = setstandardfontfamily;
        this.getMax = setmax;
    }

    public final void length() {
        this.setMax.execute(onReceivedIcon.INSTANCE, new setMax(this), getMin.INSTANCE);
    }
}
