package o;

import dagger.Component;
import id.dana.contract.promocenter.PromoCategoryModule;
import id.dana.di.PerActivity;
import id.dana.richview.promocenter.PromoCategoryView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PromoCategoryModule.class})
public interface interceptConnectSocket {
    void getMin(PromoCategoryView promoCategoryView);
}
