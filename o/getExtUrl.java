package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.PluginModel;
import o.TitleBarRightButtonView;

@Singleton
public class getExtUrl implements setRequireVersion {
    private final setExtUrl userEmailAddressApi;

    @Inject
    public getExtUrl(setExtUrl setexturl) {
        this.userEmailAddressApi = setexturl;
    }

    public TitleBarRightButtonView.AnonymousClass1<getExtModel> getEmailAddress(String str) {
        return this.userEmailAddressApi.getEmailAddress(str).map(PluginModel.AnonymousClass1.length).flatMap(new removeAllUpdateListeners());
    }
}
