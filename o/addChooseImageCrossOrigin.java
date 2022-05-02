package o;

import id.dana.domain.profilemenu.model.SettingModel;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class addChooseImageCrossOrigin extends parseFailed<SettingModel, setMax> {
    private final H5Utils settingRepository;

    @Inject
    public addChooseImageCrossOrigin(appxLoadFailed appxloadfailed, getScheme getscheme, H5Utils h5Utils) {
        super(appxloadfailed, getscheme);
        this.settingRepository = h5Utils;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<SettingModel> buildUseCaseObservable(setMax setmax) {
        return this.settingRepository.getSettingByKey(setmax.key);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public String key;

        private setMax(String str) {
            this.key = str;
        }

        public static setMax forSettingKey(String str) {
            return new setMax(str);
        }
    }
}
