package o;

import android.os.Build;
import android.text.TextUtils;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class waitForSetup implements getMediaPlaybackRequiresUserGesture {
    private final isPrepareDone unsafeDeviceWhitelistEntityDataFactory;

    @Inject
    public waitForSetup(isPrepareDone ispreparedone) {
        this.unsafeDeviceWhitelistEntityDataFactory = ispreparedone;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isWhitelistedDevice() {
        return createConfigData().getWhitelistedDevices().map(new count(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isWhitelistedDevice$0(Map map) throws Exception {
        if (TextUtils.isEmpty(Build.BRAND)) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(isWhitelistByBrand(map) || isWhitelistByDevice(map));
    }

    private boolean isWhitelistByBrand(Map<String, Boolean> map) {
        Boolean bool = map.get(Build.BRAND.toLowerCase());
        return bool != null && bool.booleanValue();
    }

    private boolean isWhitelistByDevice(Map<String, Boolean> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.BRAND);
        sb.append("-");
        sb.append(Build.MODEL);
        Boolean bool = map.get(sb.toString().replace(" ", "_").toLowerCase());
        return bool != null && bool.booleanValue();
    }

    private handleMessage createConfigData() {
        return this.unsafeDeviceWhitelistEntityDataFactory.createData("network");
    }
}
