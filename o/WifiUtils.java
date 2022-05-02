package o;

import dagger.Lazy;
import dagger.internal.InjectedFieldSignature;
import id.dana.onboarding.splash.SplashActivity;
import o.AutoTransition;
import o.inTransaction;
import o.registerDataSetObserver;
import o.setMap;
import o.stopMonitorMemoryWarning;

public final class WifiUtils implements getBindingAdapter<SplashActivity> {
    @InjectedFieldSignature("id.dana.onboarding.splash.SplashActivity.deviceInformationProvider")
    public static void getMax(SplashActivity splashActivity, getPerformanceTracker getperformancetracker) {
        splashActivity.deviceInformationProvider = getperformancetracker;
    }

    @InjectedFieldSignature("id.dana.onboarding.splash.SplashActivity.holdLoginPresenter")
    public static void setMax(SplashActivity splashActivity, Lazy<registerDataSetObserver.setMax> lazy) {
        splashActivity.holdLoginPresenter = lazy;
    }

    @InjectedFieldSignature("id.dana.onboarding.splash.SplashActivity.sessionDeepLinkPresenter")
    public static void setMin(SplashActivity splashActivity, Lazy<AutoTransition.length> lazy) {
        splashActivity.sessionDeepLinkPresenter = lazy;
    }

    @InjectedFieldSignature("id.dana.onboarding.splash.SplashActivity.sessionExpiredManager")
    public static void getMin(SplashActivity splashActivity, CustomPopMenuExtension customPopMenuExtension) {
        splashActivity.sessionExpiredManager = customPopMenuExtension;
    }

    @InjectedFieldSignature("id.dana.onboarding.splash.SplashActivity.splashPresenter")
    public static void getMax(SplashActivity splashActivity, Lazy<setMap.getMax> lazy) {
        splashActivity.splashPresenter = lazy;
    }

    @InjectedFieldSignature("id.dana.onboarding.splash.SplashActivity.logoutPresenter")
    public static void getMin(SplashActivity splashActivity, Lazy<inTransaction.getMax> lazy) {
        splashActivity.logoutPresenter = lazy;
    }

    @InjectedFieldSignature("id.dana.onboarding.splash.SplashActivity.mixpanelEnablePresenter")
    public static void length(SplashActivity splashActivity, Lazy<stopMonitorMemoryWarning.getMin> lazy) {
        splashActivity.mixpanelEnablePresenter = lazy;
    }

    @InjectedFieldSignature("id.dana.onboarding.splash.SplashActivity.locationPermissionSubject")
    public static void getMax(SplashActivity splashActivity, isAlipayApp isalipayapp) {
        splashActivity.locationPermissionSubject = isalipayapp;
    }
}
