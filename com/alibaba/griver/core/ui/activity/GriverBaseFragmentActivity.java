package com.alibaba.griver.core.ui.activity;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.base.common.utils.H5SplitCompatUtils;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GriverBaseFragmentActivity extends FragmentActivity {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        H5SplitCompatUtils.doInstall(context);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(1910096578, oncanceled);
            onCancelLoad.getMin(1910096578, oncanceled);
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((RVNativePermissionRequestProxy) RVProxy.get(RVNativePermissionRequestProxy.class)).onRequestPermissionResult(i, strArr, iArr);
    }
}
