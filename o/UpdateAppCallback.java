package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.data.toggle.traffictype.TrafficType;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.a;
import o.isUesCacheLocation;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001J\u001a\u0010\u0010\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0012J\b\u0010\u0013\u001a\u00020\fH\u0007J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/data/toggle/SplitFacade;", "", "context", "Landroid/content/Context;", "deviceInformation", "Lid/dana/data/config/DeviceInformationProvider;", "trafficTypeDevice", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "trafficTypeUser", "Lid/dana/data/toggle/traffictype/LazyTrafficTypeFactory;", "(Landroid/content/Context;Lid/dana/data/config/DeviceInformationProvider;Lid/dana/data/toggle/traffictype/BaseTrafficType;Lid/dana/data/toggle/traffictype/LazyTrafficTypeFactory;)V", "addAttribute", "", "key", "", "value", "addAttributes", "attributes", "", "initDeviceAttributions", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "Lio/reactivex/Observable;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class UpdateAppCallback {
    private final getPerformanceTracker getMin;
    /* access modifiers changed from: private */
    public final getRequestMainPackage length;
    private final Context setMax;
    public final setForce setMin;

    @Inject
    public UpdateAppCallback(@NotNull Context context, @NotNull getPerformanceTracker getperformancetracker, @NotNull @TrafficType("Device") getRequestMainPackage getrequestmainpackage, @NotNull @TrafficType("User") setForce setforce) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getperformancetracker, "deviceInformation");
        Intrinsics.checkNotNullParameter(getrequestmainpackage, "trafficTypeDevice");
        Intrinsics.checkNotNullParameter(setforce, "trafficTypeUser");
        this.setMax = context;
        this.getMin = getperformancetracker;
        this.length = getrequestmainpackage;
        this.setMin = setforce;
        isUesCacheLocation.length length2 = new isUesCacheLocation.length();
        length2.getMax = this.setMax.getApplicationContext();
        String deviceUtdId = this.getMin.getDeviceUtdId();
        length2.IsOverlapping = deviceUtdId;
        length2.setMax.put("utdid", deviceUtdId);
        String osType = this.getMin.osType();
        length2.isInside = osType;
        length2.setMax.put("os_type", osType);
        StringBuilder sb = new StringBuilder("Add Attribute utdid, ");
        sb.append(this.getMin.getDeviceUtdId());
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb.toString());
        StringBuilder sb2 = new StringBuilder("Add Attribute os_type, ");
        sb2.append(this.getMin.osType());
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb2.toString());
        tempExtension device = this.getMin.getDevice();
        if (device != null) {
            String osVersion = device.getOsVersion();
            length2.equals = osVersion;
            length2.setMax.put("os_version", osVersion);
            String androidId = device.getAndroidId();
            length2.getMin = androidId;
            length2.setMax.put("device_id", androidId);
            length2.setMax.put("simulator", Boolean.valueOf(device.isEmulator()));
            length2.setMax.put("device_brand", device.getBuildBrand());
            length2.setMax.put("device_model", device.getBuildModel());
            length2.setMax.put("device_manufacturer", device.getBuildManufacturer());
            length2.setMax.put(MyProfileMenuAction.APP_VERSION, device.getAppVersion());
            length2.setMax.put("timezone", device.getTimeZone());
            StringBuilder sb3 = new StringBuilder("Add Attribute os_version, ");
            sb3.append(device.getOsVersion());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb3.toString());
            StringBuilder sb4 = new StringBuilder("Add Attribute device_id, ");
            sb4.append(device.getAndroidId());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb4.toString());
            StringBuilder sb5 = new StringBuilder("Add Attribute simulator, ");
            sb5.append(device.isEmulator());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb5.toString());
            StringBuilder sb6 = new StringBuilder("Add Attribute device_brand, ");
            sb6.append(device.getBuildBrand());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb6.toString());
            StringBuilder sb7 = new StringBuilder("Add Attribute device_model, ");
            sb7.append(device.getBuildModel());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb7.toString());
            StringBuilder sb8 = new StringBuilder("Add Attribute device_manufacturer, ");
            sb8.append(device.getBuildManufacturer());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb8.toString());
            StringBuilder sb9 = new StringBuilder("Add Attribute app_version, ");
            sb9.append(device.getAppVersion());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb9.toString());
            StringBuilder sb10 = new StringBuilder("Add Attribute timezone, ");
            sb10.append(device.getTimeZone());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb10.toString());
        }
        a.AnonymousClass1 gps = this.getMin.getGps();
        if (gps != null) {
            String longitude = gps.getLongitude();
            length2.toFloatRange = longitude;
            length2.setMax.put("longitude", longitude);
            String latitude = gps.getLatitude();
            length2.length = latitude;
            length2.setMax.put("latitude", latitude);
            StringBuilder sb11 = new StringBuilder("Add Attribute longitude, ");
            sb11.append(gps.getLongitude());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb11.toString());
            StringBuilder sb12 = new StringBuilder("Add Attribute latitude, ");
            sb12.append(gps.getLatitude());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb12.toString());
        }
        a display = this.getMin.getDisplay();
        if (display != null) {
            length2.setMax.put("screen_dpi", Integer.valueOf(display.getDpi()));
            length2.setMax.put("screen_width", Integer.valueOf(display.getWidth()));
            length2.setMax.put("screen_height", Integer.valueOf(display.getHeight()));
            StringBuilder sb13 = new StringBuilder("Add Attribute screen_dpi, ");
            sb13.append(display.getDpi());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb13.toString());
            StringBuilder sb14 = new StringBuilder("Add Attribute screen_width, ");
            sb14.append(display.getWidth());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb14.toString());
            StringBuilder sb15 = new StringBuilder("Add Attribute screen_height, ");
            sb15.append(display.getHeight());
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb15.toString());
        }
        length2.setMax.put("reference_utdid", this.getMin.getReferenceUtdId());
        length2.setMax.put("package_name", this.setMax.getPackageName());
        length2.setMax.put("build_type", "release");
        length2.setMax.put("code_language", "Java");
        length2.setMax.put("environment", "prod");
        length2.setMax.put("app_version_build", Integer.valueOf(Integer.parseInt("2040012")));
        length2.setMax.put("locale", Locale.getDefault().toString());
        StringBuilder sb16 = new StringBuilder("Add Attribute reference_utdid, ");
        sb16.append(this.getMin.getReferenceUtdId());
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb16.toString());
        StringBuilder sb17 = new StringBuilder("Add Attribute package_name, ");
        sb17.append(this.setMax.getPackageName());
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb17.toString());
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, "Add Attribute build_type, release");
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, "Add Attribute code_language, Java");
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, "Add Attribute environment, prod");
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, "Add Attribute app_version_build, 2040012");
        StringBuilder sb18 = new StringBuilder("Add Attribute locale, ");
        sb18.append(Locale.getDefault());
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb18.toString());
        isUesCacheLocation.length(isUesCacheLocation.getMax(), length2);
    }

    public static void getMin(@NotNull String str, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(obj, "value");
        StringBuilder sb = new StringBuilder("Add Attribute ");
        sb.append(str);
        sb.append(", ");
        sb.append(obj);
        LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb.toString());
        isUesCacheLocation.getMax().getMin.put(str, obj);
    }

    public static void getMax(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "attributes");
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            StringBuilder sb = new StringBuilder("Add Attribute ");
            sb.append((String) next.getKey());
            sb.append(", ");
            sb.append(value);
            LocationBridgeExtension.setMax(DanaLogConstants.TAG.SPLIT, sb.toString());
        }
        isUesCacheLocation.getMax().getMin.putAll(map);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    public static final class getMin<V> implements Callable<getRequestMainPackage> {
        final /* synthetic */ UpdateAppCallback setMin;

        public getMin(UpdateAppCallback updateAppCallback) {
            this.setMin = updateAppCallback;
        }

        public final /* synthetic */ Object call() {
            return this.setMin.length;
        }
    }
}
