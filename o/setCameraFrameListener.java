package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.CaptureBtn;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0003¨\u0006\u0005"}, d2 = {"toListSavingBenefitModels", "", "Lid/dana/savings/model/SavingBenefitModel;", "Lid/dana/domain/saving/model/SavingBenefit;", "toSavingBenefitModel", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setCameraFrameListener {
    @NotNull
    public static final List<CaptureBtn.AnonymousClass1> length(@NotNull List<BeaconDataNotifier> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toListSavingBenefitModels");
        Iterable<BeaconDataNotifier> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (BeaconDataNotifier beaconDataNotifier : iterable) {
            Intrinsics.checkNotNullParameter(beaconDataNotifier, "$this$toSavingBenefitModel");
            arrayList.add(new CaptureBtn.AnonymousClass1(beaconDataNotifier.getIcon(), beaconDataNotifier.getTitle(), beaconDataNotifier.getSubtitle()));
        }
        return (List) arrayList;
    }
}
