package o;

import dagger.Component;
import id.dana.contract.services.ServiceCategoryModule;
import id.dana.di.PerActivity;
import id.dana.richview.servicescard.ServiceCategoryView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {ServiceCategoryModule.class})
public interface JSONObject {
    void getMin(ServiceCategoryView serviceCategoryView);
}
