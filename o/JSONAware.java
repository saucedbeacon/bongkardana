package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.model.SelectedPayerModule;
import id.dana.richview.splitbill.SelectedPayerView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SelectedPayerModule.class})
public interface JSONAware {
    void length(SelectedPayerView selectedPayerView);
}
