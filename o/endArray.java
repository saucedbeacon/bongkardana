package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.SocialShareModule;
import id.dana.richview.socialshare.SocialShareView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SocialShareModule.class})
public interface endArray {
    void setMin(SocialShareView socialShareView);
}
