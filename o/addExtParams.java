package o;

import id.dana.data.saving.model.SavingBenefitEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"toSavingBenefit", "Lid/dana/domain/saving/model/SavingBenefit;", "Lid/dana/data/saving/model/SavingBenefitEntity;", "toSavingBenefits", "", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class addExtParams {
    @NotNull
    public static final List<BeaconDataNotifier> toSavingBenefits(@NotNull List<SavingBenefitEntity> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toSavingBenefits");
        Iterable<SavingBenefitEntity> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (SavingBenefitEntity savingBenefit : iterable) {
            arrayList.add(toSavingBenefit(savingBenefit));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final BeaconDataNotifier toSavingBenefit(@NotNull SavingBenefitEntity savingBenefitEntity) {
        Intrinsics.checkNotNullParameter(savingBenefitEntity, "$this$toSavingBenefit");
        return new BeaconDataNotifier(savingBenefitEntity.getIcon(), savingBenefitEntity.getTitle(), savingBenefitEntity.getSubtitle());
    }
}
