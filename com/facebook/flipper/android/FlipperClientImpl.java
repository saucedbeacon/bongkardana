package com.facebook.flipper.android;

import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperStateUpdateListener;
import com.facebook.flipper.core.StateSummary;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.HashMap;
import java.util.Map;
import o.getViewVerticalDragRange;
import o.putExtraData;

@DoNotStrip
public class FlipperClientImpl implements putExtraData {
    private final Map<Class<?>, String> getMin = new HashMap(8);
    private final HybridData mHybridData;

    public static native FlipperClientImpl getInstance();

    public static native void init(EventBase eventBase, EventBase eventBase2, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public native void addPluginNative(FlipperPlugin flipperPlugin);

    @Deprecated
    public native <T extends FlipperPlugin> T getPlugin(String str);

    public native String getState();

    public native StateSummary getStateSummary();

    public native void removePluginNative(FlipperPlugin flipperPlugin);

    public native void start();

    public native void stop();

    public native void subscribeForUpdates(FlipperStateUpdateListener flipperStateUpdateListener);

    public native void unsubscribe();

    static {
        getViewVerticalDragRange.setMin("flipper");
    }

    private FlipperClientImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final void setMin(FlipperPlugin flipperPlugin) {
        this.getMin.put(flipperPlugin.getClass(), flipperPlugin.getId());
        addPluginNative(flipperPlugin);
    }

    public final void getMax(FlipperPlugin flipperPlugin) {
        this.getMin.remove(flipperPlugin.getClass());
        removePluginNative(flipperPlugin);
    }
}
