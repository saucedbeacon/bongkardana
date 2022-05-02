package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.SplitBillSectionModule;
import id.dana.splitbill.view.SplitBillSectionView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SplitBillSectionModule.class})
public interface readInteger {
    void getMax(SplitBillSectionView splitBillSectionView);
}
