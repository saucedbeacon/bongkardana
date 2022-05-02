package com.alibaba.griver.api.ui.splash;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverSplashFragmentExtension extends GriverExtension {
    AbstractSplashFragment createSplashFragment();

    public static abstract class AbstractSplashFragment extends Fragment {
        public abstract void exit();

        public abstract void showError(String str, String str2);

        public abstract void updateLoadingInfo(SplashEntryInfo splashEntryInfo);

        public void onViewCreated(View view, @Nullable Bundle bundle) {
            super.onViewCreated(view, bundle);
            boolean z = BundleUtils.getBoolean(getArguments(), "showError", false);
            String string = BundleUtils.getString(getArguments(), "errorCode", "");
            String string2 = BundleUtils.getString(getArguments(), "errorMessage", "");
            SplashEntryInfo splashEntryInfo = (SplashEntryInfo) BundleUtils.getParcelable(getArguments(), RVConstants.EXTRA_ENTRY_INFO);
            if (z) {
                showError(string, string2);
            } else if (splashEntryInfo != null) {
                updateLoadingInfo(splashEntryInfo);
            }
        }
    }
}
