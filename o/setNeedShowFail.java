package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.AutoCompleteBankModule;
import id.dana.richview.bank.AutoCompleteBankView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {AutoCompleteBankModule.class})
public interface setNeedShowFail {
    void getMax(AutoCompleteBankView autoCompleteBankView);
}
