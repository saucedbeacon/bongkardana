package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo;
import id.dana.lib.gcontainer.app.bridge.deviceinfo.ILocationListener;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.File;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 12\u00020\u0001:\u00011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0018\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\bH\u0003J\b\u0010\u001e\u001a\u00020\bH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0002J\u001a\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010)\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010*\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010+\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010,\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010/\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u00100\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInformationManager;", "", "context", "Landroid/content/Context;", "iLocationListener", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/ILocationListener;", "(Landroid/content/Context;Lid/dana/lib/gcontainer/app/bridge/deviceinfo/ILocationListener;)V", "cpuArchitecture", "", "getCpuArchitecture", "()Ljava/lang/String;", "cpuFrequency", "", "getCpuFrequency", "()I", "cpuMaxFrequency", "getCpuMaxFrequency", "cpuMinFrequency", "getCpuMinFrequency", "cpuName", "getCpuName", "assembleAllDeviceInfo", "Lcom/alibaba/fastjson/JSONObject;", "assembleLocationDeviceInfo", "getBluetoothAdapter", "getCpuABI", "", "info", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo;", "getNetworkDataType", "getNetworkType", "getWifiScanResult", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInfo$Wifi;", "currentBssid", "scanResult", "Landroid/net/wifi/ScanResult;", "readFileInfo", "fileName", "keyword", "setBEInfo", "setCpuInfo", "setDeviceInfo", "setDisplayInfo", "setExternalStorageInfo", "setGpsInfo", "setIpInfo", "setMemoryInfo", "setSystemFeatureInfo", "setWifiInfo", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class DatePickerBridgeExtension {
    private static final String getMax;
    @NotNull
    public static final getMax setMax = new getMax((byte) 0);
    public final Context getMin;
    private final ILocationListener setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/downloadfile/network/RetrofitService;", "", "downloadFile", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "fileUrl", "", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.DatePickerBridgeExtension$1  reason: invalid class name */
    public interface AnonymousClass1 {
        @Streaming
        @NotNull
        @GET
        TitleBarRightButtonView.AnonymousClass1<getAppenderManager<NotSendableException>> setMax(@Nullable @Url String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/sendevent/sendmoney/CheckoutFinishCallback;", "", "onCheckoutFinished", "", "result", "Lid/dana/lib/gcontainer/app/bridge/sendevent/sendmoney/CheckoutFinishEntity;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.DatePickerBridgeExtension$2  reason: invalid class name */
    public interface AnonymousClass2 {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002¨\u0006\f"}, d2 = {"hasActivityHandler", "", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "startActivityForResultSafely", "", "Landroid/app/Activity;", "requestCode", "", "intent", "startActivitySafely", "gcontainer_release"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.DatePickerBridgeExtension$8  reason: invalid class name */
    public final class AnonymousClass8 {
        public static final boolean length(@Nullable Intent intent, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            return (intent != null ? intent.resolveActivity(context.getPackageManager()) : null) != null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0006\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0006\u001a\u0016\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\b\u001a\u0016\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\b¨\u0006\t"}, d2 = {"toSafeFloat", "", "", "defaultValue", "", "toSafeInt", "", "toSafeLong", "", "gcontainer_release"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.DatePickerBridgeExtension$7  reason: invalid class name */
    public final class AnonymousClass7 {
        public static final int setMax(@Nullable String str, int i) {
            if (str == null) {
                return i;
            }
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return i;
            }
        }
    }

    public DatePickerBridgeExtension(@NotNull Context context, @Nullable ILocationListener iLocationListener) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = context;
        this.setMin = iLocationListener;
    }

    public final void length(Context context, DeviceInfo deviceInfo) {
        DeviceInfo.Gps latestLocation;
        ILocationListener iLocationListener = this.setMin;
        if (iLocationListener != null && (latestLocation = iLocationListener.getLatestLocation(context)) != null) {
            deviceInfo.setGps(latestLocation);
        }
    }

    public final void getMin(Context context, DeviceInfo deviceInfo) {
        String str;
        DeviceInfo.Device.TimeLocation timeLocation;
        String str2;
        try {
            DeviceInfo.Device.TimeLocation timeLocation2 = new DeviceInfo.Device.TimeLocation((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            String str3 = Build.BOARD;
            String str4 = Build.BRAND;
            String str5 = Build.DEVICE;
            String str6 = Build.MANUFACTURER;
            String str7 = Build.MODEL;
            String str8 = Build.PRODUCT;
            String str9 = Build.BOOTLOADER;
            String string = Settings.System.getString(context.getContentResolver(), "android_id");
            String str10 = Build.FINGERPRINT;
            boolean min = AnonymousClass6.getMin(context);
            boolean length = AnonymousClass6.length(context);
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            String str11 = null;
            String address = defaultAdapter != null ? defaultAdapter.getAddress() : null;
            String str12 = address == null ? "" : address;
            if (getLeftSelectedOption.getMax(this.getMin, "android.permission.READ_PHONE_STATE")) {
                str = "";
                if (!getRightSelectedOption.length()) {
                    Object systemService = this.getMin.getSystemService("phone");
                    if (systemService != null) {
                        str2 = String.valueOf(((TelephonyManager) systemService).getNetworkType());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                } else if (FontRes.length(this.getMin, "android.permission.READ_PHONE_STATE") != 0) {
                    Object systemService2 = this.getMin.getSystemService("phone");
                    if (systemService2 != null) {
                        str2 = String.valueOf(((TelephonyManager) systemService2).getDataNetworkType());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                }
                str = str2;
            } else {
                str = "";
            }
            DeviceInfo.Device device = r2;
            DeviceInfo.Device device2 = new DeviceInfo.Device(string, context.getPackageName(), str12, str3, str9, str4, str5, str6, str7, str8, "", (String) null, str10, "", min, length, str, Build.VERSION.RELEASE, Build.VERSION.SDK_INT, timeLocation2, AnonymousClass6.setMax(context), 2048, (DefaultConstructorMarker) null);
            deviceInfo.setDevice(device);
            DeviceInfo.Device device3 = deviceInfo.getDevice();
            if (device3 != null && (timeLocation = device3.getTimeLocation()) != null) {
                DeviceInfo.Gps gps = deviceInfo.getGps();
                timeLocation.setLatitude(gps != null ? gps.getLatitude() : null);
                DeviceInfo.Gps gps2 = deviceInfo.getGps();
                if (gps2 != null) {
                    str11 = gps2.getLongitude();
                }
                timeLocation.setLongitude(str11);
                TimeZone timeZone = TimeZone.getDefault();
                Intrinsics.checkNotNullExpressionValue(timeZone, "TimeZone.getDefault()");
                timeLocation.setTimeZone(timeZone.getID());
            }
        } catch (Exception e) {
            LocationBridgeExtension.setMin(getMax, "setDeviceInfo", (Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af A[Catch:{ Exception -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0 A[Catch:{ Exception -> 0x00de }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void getMax(id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo r14) {
        /*
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r1 = ""
            id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Cpu r13 = new id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Cpu     // Catch:{ Exception -> 0x00de }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 255(0xff, float:3.57E-43)
            r12 = 0
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00de }
            r14.setCpu(r13)     // Catch:{ Exception -> 0x00de }
            id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Cpu r2 = r14.getCpu()     // Catch:{ Exception -> 0x00de }
            if (r2 == 0) goto L_0x0023
            java.lang.String r3 = android.os.Build.CPU_ABI     // Catch:{ Exception -> 0x00de }
            r2.setCpuABI(r3)     // Catch:{ Exception -> 0x00de }
        L_0x0023:
            id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Cpu r2 = r14.getCpu()     // Catch:{ Exception -> 0x00de }
            if (r2 == 0) goto L_0x002e
            java.lang.String r3 = android.os.Build.CPU_ABI2     // Catch:{ Exception -> 0x00de }
            r2.setCpuABI2(r3)     // Catch:{ Exception -> 0x00de }
        L_0x002e:
            id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Cpu r14 = r14.getCpu()     // Catch:{ Exception -> 0x00de }
            if (r14 == 0) goto L_0x00dd
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            java.lang.String r2 = getMax((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x00de }
            r3 = 0
            int r2 = o.DatePickerBridgeExtension.AnonymousClass7.setMax(r2, r3)     // Catch:{ Exception -> 0x00de }
            r14.setCpuCurFreq(r2)     // Catch:{ Exception -> 0x00de }
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            java.lang.String r2 = getMax((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x00de }
            int r2 = o.DatePickerBridgeExtension.AnonymousClass7.setMax(r2, r3)     // Catch:{ Exception -> 0x00de }
            r14.setCpuMaxFreq(r2)     // Catch:{ Exception -> 0x00de }
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"
            java.lang.String r2 = getMax((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x00de }
            int r2 = o.DatePickerBridgeExtension.AnonymousClass7.setMax(r2, r3)     // Catch:{ Exception -> 0x00de }
            r14.setCpuMinFreq(r2)     // Catch:{ Exception -> 0x00de }
            java.lang.String r2 = getMax((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x00de }
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x00de }
            r5 = 1
            if (r4 == 0) goto L_0x006f
            int r4 = r4.length()     // Catch:{ Exception -> 0x00de }
            if (r4 != 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r4 = 0
            goto L_0x0070
        L_0x006f:
            r4 = 1
        L_0x0070:
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.lang.String r7 = ":"
            if (r4 == 0) goto L_0x0078
            r2 = r1
            goto L_0x0095
        L_0x0078:
            r8 = r2
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ Exception -> 0x00de }
            java.lang.String[] r9 = new java.lang.String[]{r7}     // Catch:{ Exception -> 0x00de }
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r8, (java.lang.String[]) r9, (boolean) r10, (int) r11, (int) r12, (java.lang.Object) r13)     // Catch:{ Exception -> 0x00de }
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ Exception -> 0x00de }
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00de }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ Exception -> 0x00de }
            if (r2 == 0) goto L_0x00d7
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x00de }
            r2 = r2[r5]     // Catch:{ Exception -> 0x00de }
        L_0x0095:
            r14.setCpuName(r2)     // Catch:{ Exception -> 0x00de }
            java.lang.String r2 = "Hardware"
            java.lang.String r0 = getMax((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x00de }
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x00de }
            if (r2 == 0) goto L_0x00ac
            int r2 = r2.length()     // Catch:{ Exception -> 0x00de }
            if (r2 != 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r2 = 0
            goto L_0x00ad
        L_0x00ac:
            r2 = 1
        L_0x00ad:
            if (r2 == 0) goto L_0x00b0
            goto L_0x00cd
        L_0x00b0:
            r8 = r0
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ Exception -> 0x00de }
            java.lang.String[] r9 = new java.lang.String[]{r7}     // Catch:{ Exception -> 0x00de }
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r0 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r8, (java.lang.String[]) r9, (boolean) r10, (int) r11, (int) r12, (java.lang.Object) r13)     // Catch:{ Exception -> 0x00de }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x00de }
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00de }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ Exception -> 0x00de }
            if (r0 == 0) goto L_0x00d1
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x00de }
            r1 = r0[r5]     // Catch:{ Exception -> 0x00de }
        L_0x00cd:
            r14.setCpuArchitecture(r1)     // Catch:{ Exception -> 0x00de }
            return
        L_0x00d1:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x00de }
            r14.<init>(r6)     // Catch:{ Exception -> 0x00de }
            throw r14     // Catch:{ Exception -> 0x00de }
        L_0x00d7:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x00de }
            r14.<init>(r6)     // Catch:{ Exception -> 0x00de }
            throw r14     // Catch:{ Exception -> 0x00de }
        L_0x00dd:
            return
        L_0x00de:
            r14 = move-exception
            java.lang.String r0 = getMax
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.String r1 = "setCpuInfo"
            o.LocationBridgeExtension.setMin((java.lang.String) r0, (java.lang.String) r1, (java.lang.Throwable) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DatePickerBridgeExtension.getMax(id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo):void");
    }

    public static void getMax(Context context, DeviceInfo deviceInfo) {
        try {
            PackageManager packageManager = context.getPackageManager();
            boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.bluetooth");
            boolean hasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.location");
            boolean hasSystemFeature3 = packageManager.hasSystemFeature("android.hardware.wifi");
            boolean hasSystemFeature4 = packageManager.hasSystemFeature("android.hardware.telephony");
            boolean hasSystemFeature5 = packageManager.hasSystemFeature("android.hardware.nfc");
            boolean hasSystemFeature6 = packageManager.hasSystemFeature("android.hardware.nfc.hce");
            boolean hasSystemFeature7 = packageManager.hasSystemFeature("android.hardware.wifi.direct");
            deviceInfo.setSysFeature(new DeviceInfo.SysFeature(hasSystemFeature, hasSystemFeature2, hasSystemFeature5, hasSystemFeature6, hasSystemFeature4, packageManager.hasSystemFeature("android.hardware.usb.accessory"), packageManager.hasSystemFeature("android.hardware.usb.host"), hasSystemFeature3, hasSystemFeature7));
        } catch (Exception e) {
            LocationBridgeExtension.setMin(getMax, "setSystemFeatureInfo", (Throwable) e);
        }
    }

    public static void length(DeviceInfo deviceInfo) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(Runtime.getRuntime().maxMemory()));
            sb.append(DiskFormatter.B);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf(Runtime.getRuntime().totalMemory()));
            sb2.append(DiskFormatter.B);
            deviceInfo.setMemory(new DeviceInfo.Memory(obj, sb2.toString()));
        } catch (Exception e) {
            LocationBridgeExtension.setMin(getMax, "setMemoryInfo", (Throwable) e);
        }
    }

    public static void setMax(Context context, DeviceInfo deviceInfo) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            Intrinsics.checkNotNullExpressionValue(externalStorageDirectory, "file");
            StatFs statFs = new StatFs(externalStorageDirectory.getPath());
            long blockSizeLong = statFs.getBlockSizeLong();
            long blockCountLong = statFs.getBlockCountLong();
            long availableBlocksLong = statFs.getAvailableBlocksLong();
            deviceInfo.setExternalStorage(new DeviceInfo.ExternalStorage(Formatter.formatFileSize(context, availableBlocksLong * blockSizeLong), Formatter.formatFileSize(context, blockCountLong * blockSizeLong)));
        } catch (Exception e) {
            LocationBridgeExtension.setMin(getMax, "setExternalStorageInfo", (Throwable) e);
        }
    }

    public static void setMax(DeviceInfo deviceInfo) {
        try {
            deviceInfo.setIpAddress(new DeviceInfo.IPAddress((String) null, (String) null, 3, (DefaultConstructorMarker) null));
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Intrinsics.checkNotNullExpressionValue(nextElement, "interfaces.nextElement()");
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if ((nextElement2 instanceof Inet4Address) && !nextElement2.isLoopbackAddress()) {
                        DeviceInfo.IPAddress ipAddress = deviceInfo.getIpAddress();
                        if (ipAddress != null) {
                            ipAddress.setEthIp(nextElement2.getHostAddress());
                        }
                        DeviceInfo.IPAddress ipAddress2 = deviceInfo.getIpAddress();
                        if (ipAddress2 != null) {
                            DeviceInfo.IPAddress ipAddress3 = deviceInfo.getIpAddress();
                            ipAddress2.setTrueIp(ipAddress3 != null ? ipAddress3.getEthIp() : null);
                        }
                    }
                }
            }
        } catch (Exception e) {
            LocationBridgeExtension.setMin(getMax, "setIpInfo", (Throwable) e);
        }
    }

    public static void setMin(Context context, DeviceInfo deviceInfo) {
        try {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            deviceInfo.setDisplay(new DeviceInfo.Display((int) displayMetrics.scaledDensity, displayMetrics.heightPixels, i));
        } catch (Exception e) {
            LocationBridgeExtension.setMin(getMax, "setDisplayInfo", (Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d A[Catch:{ Exception -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void toFloatRange(android.content.Context r12, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo r13) {
        /*
            android.content.Context r12 = r12.getApplicationContext()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "wifi"
            java.lang.Object r12 = r12.getSystemService(r0)     // Catch:{ Exception -> 0x0084 }
            if (r12 == 0) goto L_0x007c
            android.net.wifi.WifiManager r12 = (android.net.wifi.WifiManager) r12     // Catch:{ Exception -> 0x0084 }
            android.net.wifi.WifiInfo r0 = r12.getConnectionInfo()     // Catch:{ Exception -> 0x0084 }
            java.lang.String r1 = "wifiManager.connectionInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = r0.getBSSID()     // Catch:{ Exception -> 0x0084 }
            java.util.List r12 = r12.getScanResults()     // Catch:{ Exception -> 0x0084 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0084 }
            r1.<init>()     // Catch:{ Exception -> 0x0084 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0084 }
            r13.setWifi(r1)     // Catch:{ Exception -> 0x0084 }
            r1 = r12
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0084 }
            r2 = 0
            if (r1 == 0) goto L_0x003a
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0084 }
            if (r1 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r1 = 0
            goto L_0x003b
        L_0x003a:
            r1 = 1
        L_0x003b:
            if (r1 != 0) goto L_0x008e
            int r1 = r12.size()     // Catch:{ Exception -> 0x0084 }
            r3 = 100
            if (r1 <= r3) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            int r3 = r12.size()     // Catch:{ Exception -> 0x0084 }
        L_0x004a:
            if (r2 >= r3) goto L_0x008e
            java.util.List r1 = r13.getWifi()     // Catch:{ Exception -> 0x0084 }
            if (r1 == 0) goto L_0x0079
            java.lang.String r4 = "currentBssid"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)     // Catch:{ Exception -> 0x0084 }
            java.lang.Object r4 = r12.get(r2)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r5 = "scanWifiList[i]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch:{ Exception -> 0x0084 }
            android.net.wifi.ScanResult r4 = (android.net.wifi.ScanResult) r4     // Catch:{ Exception -> 0x0084 }
            id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Wifi r11 = new id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo$Wifi     // Catch:{ Exception -> 0x0084 }
            java.lang.String r6 = r4.BSSID     // Catch:{ Exception -> 0x0084 }
            java.lang.String r10 = r4.SSID     // Catch:{ Exception -> 0x0084 }
            int r7 = r4.frequency     // Catch:{ Exception -> 0x0084 }
            int r9 = r4.level     // Catch:{ Exception -> 0x0084 }
            java.lang.String r4 = r4.BSSID     // Catch:{ Exception -> 0x0084 }
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0084 }
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0084 }
            r1.add(r11)     // Catch:{ Exception -> 0x0084 }
        L_0x0079:
            int r2 = r2 + 1
            goto L_0x004a
        L_0x007c:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0084 }
            java.lang.String r13 = "null cannot be cast to non-null type android.net.wifi.WifiManager"
            r12.<init>(r13)     // Catch:{ Exception -> 0x0084 }
            throw r12     // Catch:{ Exception -> 0x0084 }
        L_0x0084:
            r12 = move-exception
            java.lang.String r13 = getMax
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.String r0 = "setWifiInfo"
            o.LocationBridgeExtension.setMin((java.lang.String) r13, (java.lang.String) r0, (java.lang.Throwable) r12)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DatePickerBridgeExtension.toFloatRange(android.content.Context, id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo):void");
    }

    public static void getMin(DeviceInfo deviceInfo) {
        try {
            deviceInfo.setBluetooth(new ArrayList());
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            Intrinsics.checkNotNullExpressionValue(defaultAdapter, "BluetoothAdapter.getDefaultAdapter()");
            Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
            if (bondedDevices != null) {
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    Intrinsics.checkNotNullExpressionValue(bluetoothDevice, TwilioIdentityVerificationActivity.CHALLENGE_INFO_DEVICE);
                    int bondState = bluetoothDevice.getBondState();
                    DeviceInfo.Bluetooth bluetooth = new DeviceInfo.Bluetooth(bluetoothDevice.getAddress(), bondState, bondState == 12, bondState == 11, bluetoothDevice.getType());
                    List<DeviceInfo.Bluetooth> bluetooth2 = deviceInfo.getBluetooth();
                    if (bluetooth2 != null) {
                        bluetooth2.add(bluetooth);
                    }
                }
            }
        } catch (Exception e) {
            LocationBridgeExtension.setMin(getMax, "setBEInfo", (Throwable) e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0051, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 0
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0052 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x0052 }
            r3.<init>(r7)     // Catch:{ IOException -> 0x0052 }
            java.io.Reader r3 = (java.io.Reader) r3     // Catch:{ IOException -> 0x0052 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0052 }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ IOException -> 0x0052 }
            r7 = r2
            java.io.BufferedReader r7 = (java.io.BufferedReader) r7     // Catch:{ all -> 0x004b }
            r3 = r8
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x004b }
            int r3 = r3.length()     // Catch:{ all -> 0x004b }
            if (r3 != 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 == 0) goto L_0x0029
            java.lang.String r7 = r7.readLine()     // Catch:{ all -> 0x004b }
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch:{ IOException -> 0x0052 }
            return r7
        L_0x0029:
            java.lang.String r3 = r7.readLine()     // Catch:{ all -> 0x004b }
        L_0x002d:
            if (r3 == 0) goto L_0x0045
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x004b }
            r5 = r8
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x004b }
            r6 = 2
            boolean r4 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r5, (boolean) r0, (int) r6, (java.lang.Object) r1)     // Catch:{ all -> 0x004b }
            if (r4 == 0) goto L_0x0040
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch:{ IOException -> 0x0052 }
            return r3
        L_0x0040:
            java.lang.String r3 = r7.readLine()     // Catch:{ all -> 0x004b }
            goto L_0x002d
        L_0x0045:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x004b }
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch:{ IOException -> 0x0052 }
            goto L_0x0077
        L_0x004b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x004d }
        L_0x004d:
            r8 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r7)     // Catch:{ IOException -> 0x0052 }
            throw r8     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            r7 = move-exception
            java.lang.String r8 = getMax
            java.lang.String r2 = "readFileInfo"
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x0077
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0077
            int r3 = o.LogCustomizeControl.getMin()
            if (r3 <= 0) goto L_0x0074
            o.LogCustomizeControl$getMin r3 = o.LogCustomizeControl.length(r8)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3.setMax(r7, r2, r0)
        L_0x0074:
            com.alipay.iap.android.common.log.LoggerWrapper.w(r8, r2, r7)
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DatePickerBridgeExtension.getMax(java.lang.String, java.lang.String):java.lang.String");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInformationManager$Companion;", "", "()V", "TAG", "", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    static {
        String simpleName = DatePickerBridgeExtension.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "DeviceInformationManager::class.java.simpleName");
        getMax = simpleName;
    }
}
