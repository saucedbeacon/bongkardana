package com.alibaba.griver.core.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.activity.ActivityHelper;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.ui.NebulaAppContext;

public class GriverBaseFragment extends Fragment {

    public static class Main extends GriverBaseFragment {
        protected ActivityHelper mActivityHelper;

        public void onCreate(@Nullable Bundle bundle) {
            GriverBaseFragment.super.onCreate(bundle);
            this.mActivityHelper = new ActivityHelper(getActivity()) {
                public AppContext createAppContext(App app, FragmentActivity fragmentActivity) {
                    return new NebulaAppContext(getApp(), fragmentActivity);
                }
            };
            Intent intent = new Intent();
            intent.putExtras(getArguments());
            this.mActivityHelper.setupParams(intent);
            this.mActivityHelper.onCreate();
        }

        @Nullable
        public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
            return layoutInflater.inflate(R.layout.griver_layout_base_activity, viewGroup, false);
        }

        public void onDestroy() {
            ActivityHelper activityHelper = this.mActivityHelper;
            if (activityHelper != null) {
                activityHelper.onDestroy();
            }
            GriverBaseFragment.super.onDestroy();
        }

        public void onStop() {
            GriverBaseFragment.super.onStop();
            ActivityHelper activityHelper = this.mActivityHelper;
            if (activityHelper != null) {
                activityHelper.onStop();
            }
        }

        public void onPause() {
            GriverBaseFragment.super.onPause();
            ActivityHelper activityHelper = this.mActivityHelper;
            if (activityHelper != null) {
                activityHelper.onPause();
            }
        }

        public void onResume() {
            GriverBaseFragment.super.onResume();
            ActivityHelper activityHelper = this.mActivityHelper;
            if (activityHelper != null) {
                activityHelper.onResume();
            }
        }

        public void onUserLeaveHint() {
            ActivityHelper activityHelper = this.mActivityHelper;
            if (activityHelper != null) {
                activityHelper.onUserLeaveHint();
            }
        }

        public void onUserInteraction() {
            ActivityHelper activityHelper = this.mActivityHelper;
            if (activityHelper != null) {
                activityHelper.onUserInteraction();
            }
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ActivityHelper activityHelper = this.mActivityHelper;
            if (activityHelper != null) {
                return activityHelper.onKeyDown(i, keyEvent);
            }
            return false;
        }
    }
}
