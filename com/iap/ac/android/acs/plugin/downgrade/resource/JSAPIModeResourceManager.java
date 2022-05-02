package com.iap.ac.android.acs.plugin.downgrade.resource;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.util.ArrayList;
import java.util.List;

public class JSAPIModeResourceManager extends BaseConfigModel<MobilePaymentJSAPIMode> {
    /* access modifiers changed from: protected */
    public String getSectionName() {
        return Constants.SECTION_KEY_RESOURCE_JSAPI_MODE;
    }

    public JSAPIModeResourceManager(Context context, @Nullable String str) {
        super(context, str);
    }

    @NonNull
    public List<String> getJSAPIWhiteList() {
        if (!isValid() || ((MobilePaymentJSAPIMode) this.mode).whiteList == null) {
            return new ArrayList();
        }
        return ((MobilePaymentJSAPIMode) this.mode).whiteList;
    }

    @NonNull
    public List<String> getJSAPIBlackList() {
        if (!isValid() || ((MobilePaymentJSAPIMode) this.mode).blackList == null) {
            return new ArrayList();
        }
        return ((MobilePaymentJSAPIMode) this.mode).blackList;
    }
}
