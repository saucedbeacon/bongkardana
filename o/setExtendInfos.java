package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class setExtendInfos implements extractScene {
    private final setLaunchParams userConfigPreference;

    @Inject
    public setExtendInfos(setLaunchParams setlaunchparams) {
        this.userConfigPreference = setlaunchparams;
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getEtag(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(this.userConfigPreference.getEtag(str));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveEtag(String str, String str2) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.userConfigPreference.saveEtag(str, str2)));
    }
}
