package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.SplitBillHistoryModule;
import id.dana.splitbill.view.SplitBillHistoryView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SplitBillHistoryModule.class})
public interface readObject {
    void getMin(SplitBillHistoryView splitBillHistoryView);
}
