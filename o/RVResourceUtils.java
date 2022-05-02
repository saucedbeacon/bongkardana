package o;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.config.lite.ConfigCenter;

public final class RVResourceUtils extends uncheckItems<onSingleFailed> {
    public static final String DEFAULT_PREFERENCE = "id.dana.data";
    public static final String KEY_SECURED = "secured";
    private final getMax builder;

    public RVResourceUtils(@NonNull getMax getmax) {
        this.builder = getmax;
    }

    public final onSingleFailed createData(String str) {
        boolean boolConfig = ConfigCenter.getInstance().getBoolConfig("security_guard_storage", true);
        if (TextUtils.isEmpty(this.builder.password) || this.builder.useDrutherPreference || !boolConfig) {
            return this.builder.buildDruther();
        }
        return this.builder.buildSecurityGuardPreference();
    }

    public static class getMax {
        protected Context context;
        protected String password = "";
        protected String preferenceGroup;
        protected compareVersion serializerFacade;
        /* access modifiers changed from: private */
        public boolean useDrutherPreference = false;

        public getMax(Context context2) {
            this.context = context2;
        }

        public getMax setPreferenceGroup(String str) {
            this.preferenceGroup = str;
            return this;
        }

        public getMax setSerializerFacade(compareVersion compareversion) {
            this.serializerFacade = compareversion;
            return this;
        }

        public getMax setPassword(String str) {
            this.password = str;
            return this;
        }

        public getMax setUseDrutherPreference(boolean z) {
            this.useDrutherPreference = z;
            return this;
        }

        public getFilePath buildDruther() {
            return new getFilePath(implementDefaultValue());
        }

        private getMax implementDefaultValue() {
            if (this.serializerFacade == null) {
                this.serializerFacade = new PluginInstallCallback();
            }
            if (this.preferenceGroup == null) {
                this.preferenceGroup = RVResourceUtils.DEFAULT_PREFERENCE;
            }
            return this;
        }

        public needSkipPermissionCheck buildSecurityGuardPreference() {
            return new needSkipPermissionCheck(implementDefaultValue());
        }
    }
}
