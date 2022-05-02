package com.alibaba.ariver.integration.resource;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.integration.RVMain;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.integration.proxy.RVClientStarter;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.resource.api.prepare.PrepareCallbackParam;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;

public class b extends a {
    private Fragment d;
    private RVMain.Callback e;

    public b(RVAppRecord rVAppRecord, PrepareContext prepareContext, RVMain.Callback callback) {
        super(rVAppRecord, prepareContext);
        this.e = callback;
    }

    public void startApp(PrepareCallbackParam prepareCallbackParam) {
        if (!this.b || this.d == null) {
            this.b = true;
            Intent intent = new Intent();
            intent.putExtra(RVConstants.EXTRA_ARIVER_START_BUNDLE, a(prepareCallbackParam));
            this.d = ((RVClientStarter) RVProxy.get(RVClientStarter.class)).createFragment(this.c.getStartContext(), this.f8997a, intent.getExtras());
            this.f8997a.setActivityClz(this.c.getStartContext().getClass());
            RVMain.Callback callback = this.e;
            if (callback != null) {
                callback.onFragmentCreate(this.d);
            }
        }
    }
}
