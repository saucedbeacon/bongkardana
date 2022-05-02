package o;

import id.dana.sendmoney.model.RecipientViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u000b"}, d2 = {"Lid/dana/sendmoney/mapper/RecentRecipientToRecipientViewModelMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/sendmoney/model/RecentRecipientModel;", "Lid/dana/sendmoney/model/RecipientViewModel;", "()V", "map", "", "oldItems", "mapRecipientModel", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setEnableStepScan extends setSpeed<List<? extends increaseCount>, List<? extends RecipientViewModel>> {
    public final /* synthetic */ Object map(Object obj) {
        List<increaseCount> list = (List) obj;
        Intrinsics.checkNotNullParameter(list, "oldItems");
        List arrayList = new ArrayList();
        for (increaseCount increasecount : list) {
            RecipientViewModel recipientViewModel = null;
            if (increasecount != null) {
                if (increasecount.values == 4) {
                    recipientViewModel = new RecipientViewModel(24);
                } else {
                    recipientViewModel = new RecipientViewModel(3);
                }
                recipientViewModel.setMin = increasecount.setMin;
                recipientViewModel.getMax = increasecount.getMin();
                recipientViewModel.getMin = increasecount.getMax();
                recipientViewModel.length = increasecount.length;
                recipientViewModel.setMax = increasecount.setMax;
                recipientViewModel.IsOverlapping = increasecount.length();
                recipientViewModel.isInside = increasecount.isInside;
                recipientViewModel.getMax(increasecount.setMax());
                recipientViewModel.equals = increasecount.equals;
                recipientViewModel.toIntRange = increasecount.toIntRange;
                recipientViewModel.toFloatRange = increasecount.toFloatRange;
                recipientViewModel.length(increasecount.setMin());
                recipientViewModel.setMax(increasecount.toIntRange());
                Unit unit = Unit.INSTANCE;
            }
            if (recipientViewModel != null) {
                arrayList.add(recipientViewModel);
            }
        }
        return arrayList;
    }
}
