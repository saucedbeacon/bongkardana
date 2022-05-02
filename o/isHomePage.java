package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.IpgModule;
import id.dana.ipg.IpgGuideActivity;
import o.GriverNetworkPermissionExtensionImpl;
import o.GriverShouldLoadUrlExtension;
import o.PrepareException;

public final class isHomePage implements ResourceLoadExtension {
    private final IpgModule getMax;
    private final PrepareException.AnonymousClass1 getMin;

    public /* synthetic */ isHomePage(IpgModule ipgModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(ipgModule, r2);
    }

    private isHomePage(IpgModule ipgModule, PrepareException.AnonymousClass1 r2) {
        this.getMin = r2;
        this.getMax = ipgModule;
    }

    public static final class length {
        public IpgModule getMax;
        public PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    public final void setMin(IpgGuideActivity ipgGuideActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(ipgGuideActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.getMin.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.getMin.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.getMin.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.getMin.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(ipgGuideActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            IpgModule ipgModule = this.getMax;
                            GriverNetworkPermissionExtensionImpl.setMin min2 = writeFieldName.setMin(this.getMax);
                            appxLoadFailed length3 = this.getMin.length();
                            if (length3 != null) {
                                appxLoadFailed appxloadfailed2 = length3;
                                getScheme min3 = this.getMin.getMin();
                                if (min3 != null) {
                                    getScheme getscheme2 = min3;
                                    setEnvironment cancel = this.getMin.cancel();
                                    if (cancel != null) {
                                        getEnvironment getenvironment = new getEnvironment(appxloadfailed2, getscheme2, cancel);
                                        appxLoadFailed length4 = this.getMin.length();
                                        if (length4 != null) {
                                            appxLoadFailed appxloadfailed3 = length4;
                                            getScheme min4 = this.getMin.getMin();
                                            if (min4 != null) {
                                                getScheme getscheme3 = min4;
                                                setEnvironment cancel2 = this.getMin.cancel();
                                                if (cancel2 != null) {
                                                    setDebuggable setdebuggable = new setDebuggable(appxloadfailed3, getscheme3, cancel2);
                                                    appxLoadFailed length5 = this.getMin.length();
                                                    if (length5 != null) {
                                                        appxLoadFailed appxloadfailed4 = length5;
                                                        getScheme min5 = this.getMin.getMin();
                                                        if (min5 != null) {
                                                            getScheme getscheme4 = min5;
                                                            setEnvironment cancel3 = this.getMin.cancel();
                                                            if (cancel3 != null) {
                                                                GriverShouldLoadUrlExtension.AnonymousClass3.setMax(ipgGuideActivity, writeKeyWithDoubleQuoteIfHasSpecial.setMax(ipgModule, new GriverShouldLoadUrlExtension(min2, getenvironment, setdebuggable, new getDebuggable(appxloadfailed4, getscheme4, cancel3))));
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
