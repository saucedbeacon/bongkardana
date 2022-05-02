package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.OauthGrantModule;
import id.dana.oauth.activity.OauthGrantActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {OauthGrantModule.class, DeepLinkModule.class})
public interface getErrMsg {
    void getMax(OauthGrantActivity oauthGrantActivity);
}
