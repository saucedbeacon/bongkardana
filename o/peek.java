package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.SplitBillIntroductionModule;
import id.dana.splitbill.view.SplitBillIntroductionActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SplitBillIntroductionModule.class, BottomSheetOnBoardingModule.class})
public interface peek {
    void getMax(SplitBillIntroductionActivity splitBillIntroductionActivity);
}
