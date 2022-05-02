package o;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import id.dana.data.userconfig.UserConfigBizTypeConstant;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppModel;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

@Singleton
public class setLaunchParams {
    public static final String CONTENT = "_CONTENT";
    public static final String ETAG = "_ETAG";
    public static final String LAST_UPDATED_TIME = "_LAST_UPDATED_TIME";
    private static final String USER_CONFIG_PREFERENCE = "UserConfigPreferenceproduction";
    private final onSingleFailed preferenceFacade;
    private final BackKeyDownPoint securityGuardFacade;

    @Inject
    public setLaunchParams(Context context) {
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(USER_CONFIG_PREFERENCE)).createData("local");
        this.securityGuardFacade = new BackKeyDownPoint(context);
    }

    public AppModel.AnonymousClass1 getUserConfig(@NotNull String str) {
        AppModel.AnonymousClass1 fromPreference = AppModel.AnonymousClass1.fromPreference(this.preferenceFacade, str);
        if (!UserConfigBizTypeConstant.CONFIG_SECURE_RECENT_TRANSACTION.equals(str)) {
            return fromPreference;
        }
        if (!this.preferenceFacade.getBoolean(RVResourceUtils.KEY_SECURED, false).booleanValue()) {
            saveUserConfig(fromPreference.config);
            return fromPreference;
        }
        try {
            fromPreference.config.setContent(this.securityGuardFacade.decryptString(fromPreference.config.getContent()));
            return fromPreference;
        } catch (SecException unused) {
            return null;
        }
    }

    public boolean saveUserConfig(setValidDomains setvaliddomains) {
        String bizType = setvaliddomains.getBizType();
        if (UserConfigBizTypeConstant.CONFIG_SECURE_RECENT_TRANSACTION.equals(bizType)) {
            try {
                onSingleFailed onsinglefailed = this.preferenceFacade;
                StringBuilder sb = new StringBuilder();
                sb.append(bizType);
                sb.append(CONTENT);
                onsinglefailed.saveData(sb.toString(), this.securityGuardFacade.encryptString(setvaliddomains.getContent()));
                this.preferenceFacade.saveData(RVResourceUtils.KEY_SECURED, Boolean.TRUE);
            } catch (SecException unused) {
                onSingleFailed onsinglefailed2 = this.preferenceFacade;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(bizType);
                sb2.append(CONTENT);
                onsinglefailed2.saveData(sb2.toString(), setvaliddomains.getContent());
            }
        } else {
            onSingleFailed onsinglefailed3 = this.preferenceFacade;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(bizType);
            sb3.append(CONTENT);
            onsinglefailed3.saveData(sb3.toString(), setvaliddomains.getContent());
        }
        onSingleFailed onsinglefailed4 = this.preferenceFacade;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(bizType);
        sb4.append(LAST_UPDATED_TIME);
        onsinglefailed4.saveData(sb4.toString(), Long.valueOf(setvaliddomains.getLastUpdatedTime()));
        return true;
    }

    public boolean saveEtag(String str, String str2) {
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(ETAG);
        onsinglefailed.saveData(sb.toString(), str2);
        return true;
    }

    public String getEtag(String str) {
        onSingleFailed onsinglefailed = this.preferenceFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(ETAG);
        String string = onsinglefailed.getString(sb.toString());
        return string == null ? "" : string;
    }

    public void clearAll() {
        this.preferenceFacade.clearAllData();
    }
}
