package com.alibaba.griver.ui.splash;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension;
import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.H5SplitCompatUtils;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.ui.R;
import java.util.HashMap;

public class SplashFragment extends GriverSplashFragmentExtension.AbstractSplashFragment {
    public static final String FRAGMENT_TAG = "SplashViewImpl";

    /* renamed from: a  reason: collision with root package name */
    private boolean f10620a = false;
    /* access modifiers changed from: private */
    public LoadingView b;
    private FrameLayout c;

    public void onCreate(@Nullable Bundle bundle) {
        RVLogger.d("SplashFragment", "SplashFragment.onCreate");
        super.onCreate(bundle);
        if (getArguments() != null) {
            getArguments().setClassLoader(SplashFragment.class.getClassLoader());
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        RVLogger.d("SplashFragment", "SplashFragment.onCreateLoadingView");
        H5SplitCompatUtils.doInstall(getActivity());
        if (this.c == null) {
            this.c = new FrameLayout(getActivity());
        }
        if (this.b == null) {
            this.b = new SplashLoadingView(getActivity());
        }
        this.b.setHostActivity(getActivity());
        if (StatusBarUtils.isSupport() && StatusBarUtils.isConfigSupport()) {
            this.c.setPadding(0, StatusBarUtils.getStatusBarHeight(getActivity()), 0, 0);
        }
        this.c.addView(this.b);
        return this.c;
    }

    public void onResume() {
        LoadingView loadingView;
        RVLogger.d("SplashFragment", "SplashFragment.onResume");
        super.onResume();
        if (this.f10620a && (loadingView = this.b) != null) {
            loadingView.onStart();
        }
    }

    public void onStop() {
        RVLogger.d("SplashFragment", "SplashFragment.onStop");
        super.onStop();
        LoadingView loadingView = this.b;
        if (loadingView != null) {
            this.f10620a = true;
            loadingView.onStop();
        }
    }

    public void onDestroy() {
        RVLogger.d("SplashFragment", "SplashFragment.onDestroy");
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.c = null;
        this.b = null;
    }

    public void showError(String str, String str2) {
        LoadingView loadingView = this.b;
        if (loadingView != null) {
            loadingView.onStop();
            HashMap hashMap = new HashMap();
            hashMap.put(SplashLoadingView.DATA_UPDATE_APPEARANCE_LOADING_TEXT, getString(R.string.griver_prepare_app_failed, str));
            hashMap.put(SplashLoadingView.DATA_UPDATE_APPEARANCE_LOADING_BOTTOM_TIP, "");
            this.b.sendMessage(SplashLoadingView.MSG_UPDATE_APPEARANCE, hashMap);
        }
    }

    public void exit() {
        LoadingView loadingView = this.b;
        if (loadingView != null) {
            loadingView.performAnimation(SplashLoadingView.ANIMATION_STOP_LOADING_PREPARE, new Animator.AnimatorListener() {
                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                    RVLogger.d("SplashFragment", "onAnimationStart");
                }

                public void onAnimationEnd(Animator animator) {
                    RVLogger.d("SplashFragment", "onAnimationEnd");
                }

                public void onAnimationCancel(Animator animator) {
                    RVLogger.d("SplashFragment", "onAnimationCancel");
                }
            });
        }
    }

    public void updateLoadingInfo(SplashEntryInfo splashEntryInfo) {
        LoadingView loadingView = this.b;
        if (loadingView != null && splashEntryInfo != null) {
            loadingView.onStart();
            StringBuilder sb = new StringBuilder("update loading info: ");
            sb.append(splashEntryInfo.toString());
            GriverLogger.d("SplashFragment", sb.toString());
            HashMap hashMap = new HashMap();
            hashMap.put(SplashLoadingView.DATA_UPDATE_APPEARANCE_LOADING_TEXT, splashEntryInfo.appName);
            hashMap.put(SplashLoadingView.DATA_UPDATE_APPEARANCE_LOADING_BOTTOM_TIP, splashEntryInfo.slogan);
            this.b.sendMessage(SplashLoadingView.MSG_UPDATE_APPEARANCE, hashMap);
            if (!TextUtils.isEmpty(splashEntryInfo.iconUrl)) {
                ImageUtils.loadImage(splashEntryInfo.iconUrl, new ImageListener() {
                    public void onImage(Bitmap bitmap) {
                        RVLogger.d("SplashFragment", "onBitmapLoaded!");
                        HashMap hashMap = new HashMap();
                        hashMap.put(SplashLoadingView.DATA_UPDATE_APPEARANCE_LOADING_ICON, new BitmapDrawable(bitmap));
                        if (SplashFragment.this.b != null) {
                            SplashFragment.this.b.sendMessage(SplashLoadingView.MSG_UPDATE_APPEARANCE, hashMap);
                        }
                    }
                });
            }
        }
    }
}
