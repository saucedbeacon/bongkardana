package com.alipay.mobile.security.bio.workspace;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.alipay.mobile.security.bio.exception.BioObjectNotInitialException;
import com.alipay.mobile.security.bio.service.BioServiceManager;

public class BioFragment extends Fragment {
    protected BioFragmentCallBack mBioFragmentCallBack;
    protected BioServiceManager mBioServiceManager;

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        this.mBioServiceManager = currentInstance;
        if (currentInstance == null) {
            new RuntimeException("null == BioServiceManager.getCurrentInstance()");
            ((BioFragmentContainer) activity).sendResponse(206);
            finish();
            return;
        }
        try {
            this.mBioFragmentCallBack = (BioFragmentCallBack) activity;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(activity.toString());
            sb.append(" must BioFragmentService");
            throw new ClassCastException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public <T> T getSystemService(Class<T> cls) {
        BioServiceManager bioServiceManager = this.mBioServiceManager;
        if (bioServiceManager != null) {
            return bioServiceManager.getBioService(cls);
        }
        throw new BioObjectNotInitialException("");
    }

    /* access modifiers changed from: protected */
    public <T> T getExtService(Class<T> cls) {
        BioServiceManager bioServiceManager = this.mBioServiceManager;
        if (bioServiceManager != null) {
            return bioServiceManager.getBioService(cls);
        }
        throw new BioObjectNotInitialException("");
    }

    public void backward() {
        BioFragmentCallBack bioFragmentCallBack = this.mBioFragmentCallBack;
        if (bioFragmentCallBack != null) {
            bioFragmentCallBack.backward((Bundle) null);
        }
    }

    public void forward(BioFragment bioFragment) {
        BioFragmentCallBack bioFragmentCallBack = this.mBioFragmentCallBack;
        if (bioFragmentCallBack != null) {
            bioFragmentCallBack.forward((Bundle) null, bioFragment);
        }
    }

    /* access modifiers changed from: protected */
    public void finish() {
        BioFragmentCallBack bioFragmentCallBack = this.mBioFragmentCallBack;
        if (bioFragmentCallBack != null) {
            bioFragmentCallBack.finish((Bundle) null);
        }
    }
}
