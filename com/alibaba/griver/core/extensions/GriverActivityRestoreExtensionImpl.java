package com.alibaba.griver.core.extensions;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.griver.api.activity.GriverActivityRestoreExtension;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.alibaba.griver.core.R;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GriverActivityRestoreExtensionImpl implements GriverActivityRestoreExtension {
    public void restore(Context context, String str, Bundle bundle) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-2115784433, oncanceled);
            onCancelLoad.getMin(-2115784433, oncanceled);
        }
        ToastUtils.showToast(context, context.getString(R.string.griver_core_system_reboot), 0);
    }
}
