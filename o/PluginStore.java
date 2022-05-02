package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.LazadaModule;
import id.dana.lazada.LazadaGuideActivity;
import o.GriverExecutors;
import o.GriverSessionDataExtension;
import o.PrepareException;
import o.ResourceLoadExtension;

public final class PluginStore implements ResourceLoadExtension.AnonymousClass3 {
    private final LazadaModule getMin;
    private final PrepareException.AnonymousClass1 setMin;

    public /* synthetic */ PluginStore(LazadaModule lazadaModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(lazadaModule, r2);
    }

    private PluginStore(LazadaModule lazadaModule, PrepareException.AnonymousClass1 r2) {
        this.setMin = r2;
        this.getMin = lazadaModule;
    }

    public static final class setMax {
        public LazadaModule getMax;
        public PrepareException.AnonymousClass1 getMin;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    public final void getMax(LazadaGuideActivity lazadaGuideActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(lazadaGuideActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.setMin.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length = this.setMin.length();
                if (length != null) {
                    appxLoadFailed appxloadfailed = length;
                    getScheme min = this.setMin.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.setMin.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(lazadaGuideActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            LazadaModule lazadaModule = this.getMin;
                            GriverSessionDataExtension.length min2 = writeKeyWithSingleQuoteIfHasSpecial.setMin(this.getMin);
                            appxLoadFailed length2 = this.setMin.length();
                            if (length2 != null) {
                                appxLoadFailed appxloadfailed2 = length2;
                                getScheme min3 = this.setMin.getMin();
                                if (min3 != null) {
                                    getScheme getscheme2 = min3;
                                    GriverExecutors.H5SingleThreadFactory.AnonymousClass1 INotificationSideChannel$Default = this.setMin.INotificationSideChannel$Default();
                                    if (INotificationSideChannel$Default != null) {
                                        GriverRVInnerAppProxyImpl griverRVInnerAppProxyImpl = new GriverRVInnerAppProxyImpl(appxloadfailed2, getscheme2, INotificationSideChannel$Default);
                                        appxLoadFailed length3 = this.setMin.length();
                                        if (length3 != null) {
                                            appxLoadFailed appxloadfailed3 = length3;
                                            getScheme min4 = this.setMin.getMin();
                                            if (min4 != null) {
                                                getScheme getscheme3 = min4;
                                                GriverExecutors.H5SingleThreadFactory.AnonymousClass1 INotificationSideChannel$Default2 = this.setMin.INotificationSideChannel$Default();
                                                if (INotificationSideChannel$Default2 != null) {
                                                    GriverLogcatLogger griverLogcatLogger = new GriverLogcatLogger(appxloadfailed3, getscheme3, INotificationSideChannel$Default2);
                                                    appxLoadFailed length4 = this.setMin.length();
                                                    if (length4 != null) {
                                                        appxLoadFailed appxloadfailed4 = length4;
                                                        getScheme min5 = this.setMin.getMin();
                                                        if (min5 != null) {
                                                            getScheme getscheme4 = min5;
                                                            GriverExecutors.H5SingleThreadFactory.AnonymousClass1 INotificationSideChannel$Default3 = this.setMin.INotificationSideChannel$Default();
                                                            if (INotificationSideChannel$Default3 != null) {
                                                                WorkerManagerExtension.getMin(lazadaGuideActivity, getMaxLevel.getMax(lazadaModule, new getResultFailedResponse(min2, griverRVInnerAppProxyImpl, griverLogcatLogger, new setLogger(appxloadfailed4, getscheme4, INotificationSideChannel$Default3))));
                                                                return;
                                                            }
                                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                        }
                                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                    }
                                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                }
                                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                            }
                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                        }
                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                    }
                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
