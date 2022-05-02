package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.SplitBillDetailModule;
import id.dana.di.modules.SplitBillModule;
import id.dana.splitbill.view.SplitBillSummaryActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SplitBillModule.class, SplitBillDetailModule.class})
public interface endStructure {
    void setMin(SplitBillSummaryActivity splitBillSummaryActivity);
}
