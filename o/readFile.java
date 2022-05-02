package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.InputNameModule;
import id.dana.oauth.activity.InputNameActivity;
import o.PrepareException;
import o.ScreenShotObserver;
import o.getScreenBrightness;

public final class readFile implements ResourceContextManager {
    private final PrepareException.AnonymousClass1 length;
    private final InputNameModule setMin;

    public /* synthetic */ readFile(InputNameModule inputNameModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(inputNameModule, r2);
    }

    private readFile(InputNameModule inputNameModule, PrepareException.AnonymousClass1 r2) {
        this.length = r2;
        this.setMin = inputNameModule;
    }

    public static final class setMax {
        public PrepareException.AnonymousClass1 getMin;
        public InputNameModule length;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    public final void length(InputNameActivity inputNameActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.length.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(inputNameActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.length.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.length.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.length.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.length.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(inputNameActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            InputNameModule inputNameModule = this.setMin;
                            getScreenBrightness.getMax min2 = toBytes.getMin(this.setMin);
                            onNotifyCharacteristicValue asInterface = this.length.asInterface();
                            if (asInterface != null) {
                                onReadData onreaddata = new onReadData(asInterface);
                                appxLoadFailed length3 = this.length.length();
                                if (length3 != null) {
                                    appxLoadFailed appxloadfailed2 = length3;
                                    getScheme min3 = this.length.getMin();
                                    if (min3 != null) {
                                        getScheme getscheme2 = min3;
                                        onDescriptorWrite doubleRange = this.length.toDoubleRange();
                                        if (doubleRange != null) {
                                            notifyCharacteristicValue notifycharacteristicvalue = new notifyCharacteristicValue(appxloadfailed2, getscheme2, doubleRange);
                                            setDefaultFontSize updateVisuals2 = this.length.updateVisuals();
                                            if (updateVisuals2 != null) {
                                                ScreenShotObserver.AnonymousClass1.length(inputNameActivity, writeTo.getMin(inputNameModule, new DeviceOrientationBridgeExtension(min2, onreaddata, notifycharacteristicvalue, new onSendData(updateVisuals2))));
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
}
