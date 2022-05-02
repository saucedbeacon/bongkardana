package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.playstorereview.PlayStoreReviewActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PlayStoreReviewModules.class})
public interface JSON {
    void setMax(PlayStoreReviewActivity playStoreReviewActivity);
}
