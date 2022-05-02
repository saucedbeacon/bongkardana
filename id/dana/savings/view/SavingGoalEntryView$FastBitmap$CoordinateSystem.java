package id.dana.savings.view;

import id.dana.component.edittextcomponent.DanaTextBoxView;
import kotlin.Metadata;
import o.TouchInterceptFrameLayout;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/savings/view/SavingGoalEntryView$showMonthlyAutoTopupBottomSheet$1", "Lid/dana/savings/view/MonthlyAutoTopUpBottomSheet$MonthlyAutoTopUpListener;", "onClickSelect", "", "date", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SavingGoalEntryView$FastBitmap$CoordinateSystem implements TouchInterceptFrameLayout.getMin {
    final /* synthetic */ SavingGoalEntryView length;

    SavingGoalEntryView$FastBitmap$CoordinateSystem(SavingGoalEntryView savingGoalEntryView) {
        this.length = savingGoalEntryView;
    }

    public final void getMin(int i) {
        this.length.setMin = i;
        DanaTextBoxView danaTextBoxView = (DanaTextBoxView) this.length._$_findCachedViewById(resetInternal.setMax.InspectableProperty$FlagEntry);
        if (danaTextBoxView != null) {
            danaTextBoxView.setText(String.valueOf(i));
        }
    }
}
