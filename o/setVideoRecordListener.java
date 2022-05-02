package o;

import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.savings.model.SavingModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0003¨\u0006\u0005"}, d2 = {"toListSavingModels", "", "Lid/dana/savings/model/SavingModel;", "Lid/dana/domain/saving/model/SavingGoalView;", "toSavingModel", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setVideoRecordListener {
    @NotNull
    public static final List<SavingModel> setMax(@NotNull List<BeaconManager> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toListSavingModels");
        Iterable<BeaconManager> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (BeaconManager max : iterable) {
            arrayList.add(getMax(max));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final SavingModel getMax(@NotNull BeaconManager beaconManager) {
        Intrinsics.checkNotNullParameter(beaconManager, "$this$toSavingModel");
        String savingId = beaconManager.getSavingId();
        String title = beaconManager.getTitle();
        String categoryCode = beaconManager.getCategoryCode();
        MoneyViewModel.length length = MoneyViewModel.length;
        MoneyViewModel length2 = MoneyViewModel.length.length(beaconManager.getCurrentAmount());
        MoneyViewModel.length length3 = MoneyViewModel.length;
        MoneyViewModel length4 = MoneyViewModel.length.length(beaconManager.getTargetAmount());
        String orderStatus = beaconManager.getOrderStatus();
        String orderSubStatus = beaconManager.getOrderSubStatus();
        String createdTime = beaconManager.getCreatedTime();
        String achievedTime = beaconManager.getAchievedTime();
        String completedTime = beaconManager.getCompletedTime();
        setDebug savingCategory = beaconManager.getSavingCategory();
        return new SavingModel(savingId, title, categoryCode, length2, length4, orderStatus, orderSubStatus, createdTime, achievedTime, completedTime, savingCategory != null ? CustomBgImageView.setMax(savingCategory) : null, beaconManager.getExtendInfo());
    }
}
