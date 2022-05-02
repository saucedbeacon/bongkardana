package o;

import id.dana.domain.profilemenu.model.SettingModel;
import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getApplicationDir extends parseFailed<List<SettingModel>, getMin> {
    private final H5Utils settingRepository;

    @Inject
    public getApplicationDir(appxLoadFailed appxloadfailed, getScheme getscheme, H5Utils h5Utils) {
        super(appxloadfailed, getscheme);
        this.settingRepository = h5Utils;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<SettingModel>> buildUseCaseObservable(getMin getmin) {
        return this.settingRepository.getSettings(getmin.configurations, getmin.collectionName, getmin.settingJsonMapper);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public final String collectionName;
        /* access modifiers changed from: private */
        public final List<sendUcReceiver> configurations;
        /* access modifiers changed from: private */
        public final notNeedInitUc settingJsonMapper;

        public getMin(String str, List<sendUcReceiver> list, notNeedInitUc notneedinituc) {
            this.collectionName = str;
            this.configurations = list;
            this.settingJsonMapper = notneedinituc;
        }

        public static getMin forGetSettingCollection(String str, List<sendUcReceiver> list, notNeedInitUc notneedinituc) {
            return new getMin(str, list, notneedinituc);
        }
    }
}
