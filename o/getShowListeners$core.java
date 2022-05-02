package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.iap.android.lbs.LBSLocation;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import o.TwoWheelOptionPickerDialog;
import o.setCornerRadius$core;

public final class getShowListeners$core {
    private getShowListeners$core() {
    }

    public static setCornerRadius$core assembleDeviceInfo(Context context) {
        setCornerRadius$core setcornerradius_core = new setCornerRadius$core();
        try {
            setGpsInfo(context, setcornerradius_core);
            setDeviceInfo(context, setcornerradius_core);
            setCpuInfo(setcornerradius_core);
            setSystemFeatureInfo(context, setcornerradius_core);
            setMemoryInfo(setcornerradius_core);
            setExternalStorageInfo(context, setcornerradius_core);
            setIpInfo(setcornerradius_core);
            setDisplayInfo(context, setcornerradius_core);
            setWifiInfo(context, setcornerradius_core);
            setBEInfo(setcornerradius_core);
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
        return setcornerradius_core;
    }

    private static void setGpsInfo(Context context, setCornerRadius$core setcornerradius_core) {
        try {
            setcornerradius_core.gps = new setCornerRadius$core.toFloatRange();
            LBSLocation latestLocation = handlePushWindow.getLatestLocation(context);
            setcornerradius_core.gps.latitude = String.valueOf(latestLocation.getLatitude());
            setcornerradius_core.gps.longitude = String.valueOf(latestLocation.getLongitude());
            setcornerradius_core.gps.time = latestLocation.getTime();
            setcornerradius_core.gps.error = latestLocation.getErrorCode();
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
    }

    private static void setDeviceInfo(Context context, setCornerRadius$core setcornerradius_core) {
        try {
            setcornerradius_core.device = new setCornerRadius$core.getMin();
            setcornerradius_core.device.timeLocation = new setCornerRadius$core.getMin.getMax();
            setcornerradius_core.device.buildBoard = Build.BOARD;
            setcornerradius_core.device.buildBrand = Build.BRAND;
            setcornerradius_core.device.buildDevice = Build.DEVICE;
            setcornerradius_core.device.buildManufacturer = Build.MANUFACTURER;
            setcornerradius_core.device.buildModel = Build.MODEL;
            setcornerradius_core.device.buildProduct = Build.PRODUCT;
            setcornerradius_core.device.buildBootloader = Build.BOOTLOADER;
            setcornerradius_core.device.buildSerial = "";
            setcornerradius_core.device.androidId = Settings.System.getString(context.getContentResolver(), "android_id");
            setcornerradius_core.device.fingerPrint = Build.FINGERPRINT;
            setcornerradius_core.device.isEmulator = CommonUtils.isEmulator(context);
            setcornerradius_core.device.isRooted = CommonUtils.isRooted(context);
            setcornerradius_core.device.blueMac = BluetoothAdapter.getDefaultAdapter().getAddress();
            String str = null;
            setcornerradius_core.device.timeLocation.latitude = setcornerradius_core.gps != null ? setcornerradius_core.gps.latitude : null;
            setCornerRadius$core.getMin.getMax getmax = setcornerradius_core.device.timeLocation;
            if (setcornerradius_core.gps != null) {
                str = setcornerradius_core.gps.longitude;
            }
            getmax.longitude = str;
            setcornerradius_core.device.timeLocation.timeZone = TimeZone.getDefault().getID();
            setcornerradius_core.device.networkType = String.valueOf(((TelephonyManager) context.getSystemService("phone")).getNetworkType());
            setcornerradius_core.device.osVersion = Build.VERSION.RELEASE;
            setcornerradius_core.device.osVersionInt = Build.VERSION.SDK_INT;
            setcornerradius_core.device.imei = "";
            setcornerradius_core.device.appVersion = context.getPackageName();
            setcornerradius_core.device.utdidAdvertisementId = TwoWheelOptionPickerDialog.AnonymousClass2.getMax(context);
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
    }

    private static void setCpuInfo(setCornerRadius$core setcornerradius_core) {
        try {
            setcornerradius_core.cpu = new setCornerRadius$core.setMin();
            getCpuABI(setcornerradius_core);
            setCpuFrequency(setcornerradius_core);
            setCpuMaxFrequency(setcornerradius_core);
            setCpuMinFrequency(setcornerradius_core);
            setCpuName(setcornerradius_core);
            setCpuArchitecture(setcornerradius_core);
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
    }

    private static void setSystemFeatureInfo(Context context, setCornerRadius$core setcornerradius_core) {
        try {
            setcornerradius_core.sysFeature = new setCornerRadius$core.IsOverlapping();
            PackageManager packageManager = context.getPackageManager();
            setcornerradius_core.sysFeature.bluetooth = packageManager.hasSystemFeature("android.hardware.bluetooth");
            setcornerradius_core.sysFeature.locationGPS = packageManager.hasSystemFeature("android.hardware.location");
            setcornerradius_core.sysFeature.wifi = packageManager.hasSystemFeature("android.hardware.wifi");
            setcornerradius_core.sysFeature.telephony = packageManager.hasSystemFeature("android.hardware.telephony");
            setcornerradius_core.sysFeature.nfc = packageManager.hasSystemFeature("android.hardware.nfc");
            setcornerradius_core.sysFeature.nfcHostCardEmulation = packageManager.hasSystemFeature("android.hardware.nfc.hce");
            setcornerradius_core.sysFeature.wifiDirect = packageManager.hasSystemFeature("android.hardware.wifi.direct");
            setcornerradius_core.sysFeature.usbHost = packageManager.hasSystemFeature("android.hardware.usb.host");
            setcornerradius_core.sysFeature.usbAccessory = packageManager.hasSystemFeature("android.hardware.usb.accessory");
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
    }

    private static void setMemoryInfo(setCornerRadius$core setcornerradius_core) {
        try {
            setcornerradius_core.memory = new setCornerRadius$core.toIntRange();
            setCornerRadius$core.toIntRange tointrange = setcornerradius_core.memory;
            StringBuilder sb = new StringBuilder();
            sb.append(Runtime.getRuntime().maxMemory());
            sb.append(DiskFormatter.B);
            tointrange.maxMemory = sb.toString();
            setCornerRadius$core.toIntRange tointrange2 = setcornerradius_core.memory;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Runtime.getRuntime().totalMemory());
            sb2.append(DiskFormatter.B);
            tointrange2.totalMemory = sb2.toString();
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
    }

    private static void setExternalStorageInfo(Context context, setCornerRadius$core setcornerradius_core) {
        try {
            setcornerradius_core.externalStorage = new setCornerRadius$core.length();
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = (long) statFs.getBlockSize();
            long blockCount = (long) statFs.getBlockCount();
            setcornerradius_core.externalStorage.diskTotal = Formatter.formatFileSize(context, blockCount * blockSize);
            setcornerradius_core.externalStorage.diskFree = Formatter.formatFileSize(context, ((long) statFs.getAvailableBlocks()) * blockSize);
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
    }

    private static void setIpInfo(setCornerRadius$core setcornerradius_core) {
        try {
            setcornerradius_core.ip = new setCornerRadius$core.isInside();
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if ((nextElement instanceof Inet4Address) && !nextElement.isLoopbackAddress()) {
                        setcornerradius_core.ip.ethIp = nextElement.getHostAddress();
                        setcornerradius_core.ip.trueIp = setcornerradius_core.ip.ethIp;
                    }
                }
            }
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
    }

    private static void setDisplayInfo(Context context, setCornerRadius$core setcornerradius_core) {
        try {
            setcornerradius_core.display = new setCornerRadius$core.setMax();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            setcornerradius_core.display.width = displayMetrics.widthPixels;
            setcornerradius_core.display.height = displayMetrics.heightPixels;
            setcornerradius_core.display.density = (int) displayMetrics.scaledDensity;
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
    }

    private static void setWifiInfo(Context context, setCornerRadius$core setcornerradius_core) {
        try {
            setcornerradius_core.wifi = new ArrayList();
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            String bssid = wifiManager.getConnectionInfo().getBSSID();
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (scanResults != null && !scanResults.isEmpty()) {
                int min = Math.min(scanResults.size(), 100);
                for (int i = 0; i < min; i++) {
                    setcornerradius_core.wifi.add(getWifiScanResult(bssid, scanResults.get(i)));
                }
            }
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
    }

    private static void setBEInfo(setCornerRadius$core setcornerradius_core) {
        try {
            setcornerradius_core.bluetooth = new ArrayList();
            Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
            if (bondedDevices != null && !bondedDevices.isEmpty()) {
                for (BluetoothDevice next : bondedDevices) {
                    setCornerRadius$core.getMax getmax = new setCornerRadius$core.getMax();
                    getmax.bondState = next.getBondState();
                    boolean z = true;
                    getmax.isBounded = getmax.bondState == 12;
                    if (getmax.bondState != 11) {
                        z = false;
                    }
                    getmax.isBounding = z;
                    getmax.address = next.getAddress();
                    if (Build.VERSION.SDK_INT >= 18) {
                        getmax.type = next.getType();
                    }
                    setcornerradius_core.bluetooth.add(getmax);
                }
            }
        } catch (Exception e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.AKULAKU, DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.toString());
        }
    }

    private static void getCpuABI(setCornerRadius$core setcornerradius_core) {
        setcornerradius_core.cpu.cpuABI = Build.CPU_ABI;
        setcornerradius_core.cpu.cpuABI2 = Build.CPU_ABI2;
    }

    private static void setCpuFrequency(setCornerRadius$core setcornerradius_core) {
        String readFileInfo = readFileInfo("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq", "");
        if (readFileInfo != null) {
            setcornerradius_core.cpu.cpuCurFreq = TextUtils.isEmpty(readFileInfo) ? 0 : Integer.parseInt(readFileInfo);
        }
    }

    private static void setCpuMaxFrequency(setCornerRadius$core setcornerradius_core) {
        String readFileInfo = readFileInfo("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", "");
        if (readFileInfo != null) {
            setcornerradius_core.cpu.cpuMaxFreq = TextUtils.isEmpty(readFileInfo) ? 0 : Integer.parseInt(readFileInfo);
        }
    }

    private static void setCpuMinFrequency(setCornerRadius$core setcornerradius_core) {
        String readFileInfo = readFileInfo("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq", "");
        if (readFileInfo != null) {
            setcornerradius_core.cpu.cpuMinFreq = TextUtils.isEmpty(readFileInfo) ? 0 : Integer.parseInt(readFileInfo);
        }
    }

    private static void setCpuName(setCornerRadius$core setcornerradius_core) {
        String str = "";
        String readFileInfo = readFileInfo("/proc/cpuinfo", str);
        if (readFileInfo != null) {
            setCornerRadius$core.setMin setmin = setcornerradius_core.cpu;
            if (!TextUtils.isEmpty(readFileInfo)) {
                str = readFileInfo.split(":")[1];
            }
            setmin.cpuName = str;
        }
    }

    private static void setCpuArchitecture(setCornerRadius$core setcornerradius_core) {
        String readFileInfo = readFileInfo("/proc/cpuinfo", "Hardware");
        if (readFileInfo != null) {
            setcornerradius_core.cpu.cpuArchitecture = TextUtils.isEmpty(readFileInfo) ? "" : readFileInfo.split(":")[1];
        }
    }

    private static setCornerRadius$core.equals getWifiScanResult(String str, ScanResult scanResult) {
        setCornerRadius$core.equals equals = new setCornerRadius$core.equals();
        equals.bssid = scanResult.BSSID;
        equals.ssid = scanResult.SSID;
        equals.frequency = scanResult.frequency;
        equals.level = scanResult.level;
        if (equals.bssid != null && equals.bssid.equals(str)) {
            equals.isCurrent = true;
        }
        return equals;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.io.FileReader} */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.Reader] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.io.Reader] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readFileInfo(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "dana_unknown_fail"
            java.lang.String r1 = "akulaku"
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x009e, all -> 0x009b }
            r3.<init>(r6)     // Catch:{ Exception -> 0x009e, all -> 0x009b }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0086 }
            r6.<init>(r3)     // Catch:{ all -> 0x0086 }
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x0035
            java.lang.String r7 = r6.readLine()     // Catch:{ all -> 0x0081 }
            r3.close()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            r3.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0028
        L_0x0020:
            r2 = move-exception
            java.lang.String r2 = r2.toString()
            o.updateActionSheetContent.exception(r1, r0, r2)
        L_0x0028:
            r6.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x0034
        L_0x002c:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            o.updateActionSheetContent.exception(r1, r0, r6)
        L_0x0034:
            return r7
        L_0x0035:
            java.lang.String r2 = r6.readLine()     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x005d
            boolean r4 = r2.contains(r7)     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x0035
            r3.close()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            r3.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0050
        L_0x0048:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            o.updateActionSheetContent.exception(r1, r0, r7)
        L_0x0050:
            r6.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x005c
        L_0x0054:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            o.updateActionSheetContent.exception(r1, r0, r6)
        L_0x005c:
            return r2
        L_0x005d:
            r3.close()     // Catch:{ Exception -> 0x007d, all -> 0x007b }
            r3.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x006c
        L_0x0064:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            o.updateActionSheetContent.exception(r1, r0, r7)
        L_0x006c:
            r6.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x00c5
        L_0x0071:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            o.updateActionSheetContent.exception(r1, r0, r6)
            goto L_0x00c5
        L_0x007b:
            r7 = move-exception
            goto L_0x0093
        L_0x007d:
            r7 = move-exception
            r5 = r3
            r3 = r2
            goto L_0x0099
        L_0x0081:
            r7 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
            goto L_0x0088
        L_0x0086:
            r7 = move-exception
            r6 = r2
        L_0x0088:
            r3.close()     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r4 = move-exception
            r7.addSuppressed(r4)     // Catch:{ Exception -> 0x0095, all -> 0x0091 }
        L_0x0090:
            throw r7     // Catch:{ Exception -> 0x0095, all -> 0x0091 }
        L_0x0091:
            r7 = move-exception
            r6 = r2
        L_0x0093:
            r2 = r3
            goto L_0x00c7
        L_0x0095:
            r7 = move-exception
            r5 = r3
            r3 = r6
            r6 = r2
        L_0x0099:
            r2 = r5
            goto L_0x00a1
        L_0x009b:
            r7 = move-exception
            r6 = r2
            goto L_0x00c7
        L_0x009e:
            r7 = move-exception
            r6 = r2
            r3 = r6
        L_0x00a1:
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00c6 }
            o.updateActionSheetContent.exception(r1, r0, r7)     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x00c4
            if (r6 == 0) goto L_0x00c4
            r2.close()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b8
        L_0x00b0:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            o.updateActionSheetContent.exception(r1, r0, r7)
        L_0x00b8:
            r6.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00c4
        L_0x00bc:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            o.updateActionSheetContent.exception(r1, r0, r6)
        L_0x00c4:
            r2 = r3
        L_0x00c5:
            return r2
        L_0x00c6:
            r7 = move-exception
        L_0x00c7:
            if (r2 == 0) goto L_0x00e3
            if (r6 == 0) goto L_0x00e3
            r2.close()     // Catch:{ IOException -> 0x00cf }
            goto L_0x00d7
        L_0x00cf:
            r2 = move-exception
            java.lang.String r2 = r2.toString()
            o.updateActionSheetContent.exception(r1, r0, r2)
        L_0x00d7:
            r6.close()     // Catch:{ IOException -> 0x00db }
            goto L_0x00e3
        L_0x00db:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            o.updateActionSheetContent.exception(r1, r0, r6)
        L_0x00e3:
            goto L_0x00e5
        L_0x00e4:
            throw r7
        L_0x00e5:
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getShowListeners$core.readFileInfo(java.lang.String, java.lang.String):java.lang.String");
    }
}
