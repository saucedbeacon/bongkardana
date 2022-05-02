package o;

import dagger.Component;
import id.dana.contract.feeds.UserFeedsModule;
import id.dana.di.PerActivity;
import id.dana.feeds.views.UserFeedsActivity;
import id.dana.service.favorites.FavoriteServicesModule;
import id.dana.service.favorites.FavoriteServicesView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {UserFeedsModule.class})
public interface UpdateStep {

    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {FavoriteServicesModule.class})
    /* renamed from: o.UpdateStep$1  reason: invalid class name */
    public interface AnonymousClass1 {
        void getMax(FavoriteServicesView favoriteServicesView);
    }

    void length(UserFeedsActivity userFeedsActivity);
}
