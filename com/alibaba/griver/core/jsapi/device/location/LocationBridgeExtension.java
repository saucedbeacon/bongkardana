package com.alibaba.griver.core.jsapi.device.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.utils.d;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import id.dana.utils.permission.ManifestPermission;
import java.util.ArrayList;
import o.restorePresenterStates;

@Keep
public class LocationBridgeExtension implements BridgeExtension {
    private static final int DEFAULT_TIME_OUT = 10;
    /* access modifiers changed from: private */
    public static int ERROR_CODE_LOCATION_ERROR = 13;
    /* access modifiers changed from: private */
    public static int ERROR_CODE_LOCATION_TIME_OUT = 14;
    private static int ERROR_CODE_NETWORK_ERROR = 12;
    /* access modifiers changed from: private */
    public static int ERROR_CODE_PERMISSION_NOT_ALLOWED = 11;
    private static int ERROR_CODE_SERVICE_CLOSED = 15;
    private static final String GMS_LOCATION_CLASS = "com.google.android.gms.location.FusedLocationProviderClient";
    private static final String LOCATION_ENABLE = "enable";
    private static final int REQUEST_COMMON_LOCATION_PERMISSION_CODE = 1001;
    private static final String TAG = "LocationBridge";
    /* access modifiers changed from: private */
    public static boolean disableGoogleLocation = false;
    /* access modifiers changed from: private */
    public static Location lastLocation;
    /* access modifiers changed from: private */
    public static long lastLocationTime;
    /* access modifiers changed from: private */
    public static LocationCallback locationCallback;
    private static String locationProvider = null;
    /* access modifiers changed from: private */
    public static boolean sPermissionChecked = false;
    protected static String[] sRequirePermissions = {ManifestPermission.ACCESS_COARSE_LOCATION, "android.permission.ACCESS_FINE_LOCATION"};

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    private static void sendStartMsg(Context context) {
        Intent intent = new Intent();
        intent.setAction("location_broadcast_start");
        restorePresenterStates.length(context).setMin(intent);
    }

    private static void sendEndMsg(Context context) {
        Intent intent = new Intent();
        intent.setAction("location_broadcast_end");
        restorePresenterStates.length(context).setMin(intent);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public static void getLocation(final Context context, final JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        if (context == null) {
            GriverLogger.w(TAG, "get location but context is null, return directly");
            return;
        }
        sendStartMsg(context);
        if (disableGoogleLocation || !ReflectUtils.classExist(GMS_LOCATION_CLASS) || !d.a(context)) {
            GriverLogger.d(TAG, "use system location.");
            getSystemLocation(context, jSONObject, bridgeCallback);
            return;
        }
        GriverLogger.d(TAG, "use google location.");
        if (isUesCacheLocation(jSONObject)) {
            GriverLogger.d(TAG, "use last google location");
            sendLocation(context, lastLocation, bridgeCallback, ERROR_CODE_LOCATION_ERROR);
            return;
        }
        final FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        LocationRequest create = LocationRequest.create();
        create.setPriority(100);
        create.setInterval(20000);
        create.setMaxWaitTime((long) (jSONObject.getInteger(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT).intValue() * 1000));
        AnonymousClass1 r2 = new LocationCallback() {
            public final void onLocationResult(LocationResult locationResult) {
                if (locationResult == null) {
                    GriverLogger.e(LocationBridgeExtension.TAG, "Google location failed because of locationResult is null");
                    LocationBridgeExtension.sendLocation(context, (Location) null, bridgeCallback, LocationBridgeExtension.ERROR_CODE_LOCATION_ERROR);
                    MonitorMap.Builder builder = new MonitorMap.Builder();
                    builder.message("Google location failed because of locationResult is null");
                    GriverMonitor.error(GriverMonitorConstants.ERROR_GOOGLE_LOCATION_EXCEPTION, "GriverAppContainer", builder.build());
                } else if (locationResult.getLocations().size() <= 0 || locationResult.getLocations().get(0) == null) {
                    GriverLogger.e(LocationBridgeExtension.TAG, "Google location failed because of location is null");
                    LocationBridgeExtension.sendLocation(context, (Location) null, bridgeCallback, LocationBridgeExtension.ERROR_CODE_LOCATION_ERROR);
                    MonitorMap.Builder builder2 = new MonitorMap.Builder();
                    builder2.message("Google location failed because of location is null");
                    GriverMonitor.error(GriverMonitorConstants.ERROR_GOOGLE_LOCATION_EXCEPTION, "GriverAppContainer", builder2.build());
                } else {
                    LocationBridgeExtension.sendLocation(context, locationResult.getLocations().get(0), bridgeCallback, LocationBridgeExtension.ERROR_CODE_LOCATION_ERROR);
                    GriverLogger.d(LocationBridgeExtension.TAG, "Google location success");
                    Location unused = LocationBridgeExtension.lastLocation = locationResult.getLocations().get(0);
                    long unused2 = LocationBridgeExtension.lastLocationTime = System.currentTimeMillis();
                    fusedLocationProviderClient.removeLocationUpdates(LocationBridgeExtension.locationCallback);
                }
            }

            public final void onLocationAvailability(LocationAvailability locationAvailability) {
                super.onLocationAvailability(locationAvailability);
                if (!locationAvailability.isLocationAvailable()) {
                    boolean unused = LocationBridgeExtension.disableGoogleLocation = true;
                    GriverLogger.d(LocationBridgeExtension.TAG, "location again ues system location.");
                    LocationBridgeExtension.getSystemLocation(context, jSONObject, bridgeCallback);
                    MonitorMap.Builder builder = new MonitorMap.Builder();
                    builder.message("Google location failed because of unknown reason.");
                    GriverMonitor.error(GriverMonitorConstants.ERROR_GOOGLE_LOCATION_EXCEPTION, "GriverAppContainer", builder.build());
                }
            }
        };
        locationCallback = r2;
        fusedLocationProviderClient.requestLocationUpdates(create, r2, Looper.myLooper());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public static void getSystemLocation(final Context context, JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        if (isUesCacheLocation(jSONObject)) {
            GriverLogger.d(TAG, "use last system location");
            sendLocation(context, lastLocation, bridgeCallback, ERROR_CODE_LOCATION_ERROR);
            return;
        }
        final LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            GriverLogger.w(TAG, "location manager is null, can not get location, return");
            if (bridgeCallback != null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(ERROR_CODE_LOCATION_ERROR, context.getString(R.string.griver_core_location_failed)));
                return;
            }
            return;
        }
        if (locationManager.getProviders(true).contains("network")) {
            locationProvider = "network";
        } else {
            locationProvider = "gps";
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        final AnonymousClass2 r3 = new LocationListener() {
            public final void onProviderDisabled(String str) {
            }

            public final void onProviderEnabled(String str) {
            }

            public final void onStatusChanged(String str, int i, Bundle bundle) {
            }

            public final void onLocationChanged(Location location) {
                Handler handler = handler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                }
                if (location != null) {
                    Location unused = LocationBridgeExtension.lastLocation = location;
                    long unused2 = LocationBridgeExtension.lastLocationTime = System.currentTimeMillis();
                }
                LocationBridgeExtension.sendLocation(context, location, bridgeCallback, LocationBridgeExtension.ERROR_CODE_LOCATION_ERROR);
            }
        };
        handler.postDelayed(new Runnable() {
            public final void run() {
                LocationListener locationListener;
                LocationBridgeExtension.sendLocation(context, (Location) null, bridgeCallback, LocationBridgeExtension.ERROR_CODE_LOCATION_TIME_OUT);
                LocationManager locationManager = locationManager;
                if (locationManager != null && (locationListener = r3) != null) {
                    locationManager.removeUpdates(locationListener);
                }
            }
        }, (long) (jSONObject.getInteger(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT).intValue() * 1000));
        try {
            locationManager.requestSingleUpdate(locationProvider, r3, (Looper) null);
        } catch (Exception e) {
            GriverLogger.e(TAG, "request location update failed", e);
            handler.removeCallbacksAndMessages((Object) null);
            if (locationManager != null) {
                locationManager.removeUpdates(r3);
            }
            sendLocation(context, (Location) null, bridgeCallback, ERROR_CODE_LOCATION_ERROR);
        }
    }

    private static synchronized boolean isUesCacheLocation(JSONObject jSONObject) {
        synchronized (LocationBridgeExtension.class) {
            if (lastLocation == null) {
                return false;
            }
            if ((System.currentTimeMillis() - lastLocationTime) - ((long) (jSONObject.getInteger("cacheTimeout").intValue() * 1000)) < 0) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static synchronized void sendLocation(Context context, Location location, BridgeCallback bridgeCallback, int i) {
        synchronized (LocationBridgeExtension.class) {
            if (bridgeCallback == null) {
                GriverLogger.w(TAG, "get location callback is null, return directly");
                sendEndMsg(context);
                return;
            }
            if (location != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("latitude", (Object) Double.valueOf(location.getLatitude()));
                jSONObject.put("longitude", (Object) Double.valueOf(location.getLongitude()));
                jSONObject.put("accuracy", (Object) Float.valueOf(location.getAccuracy()));
                bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
            } else if (i == ERROR_CODE_LOCATION_TIME_OUT) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(ERROR_CODE_LOCATION_TIME_OUT, context.getString(R.string.griver_core_location_timeout)));
            } else {
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(ERROR_CODE_LOCATION_ERROR, context.getString(R.string.griver_core_location_failed)));
            }
            sendEndMsg(context);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063 A[Catch:{ Exception -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067 A[Catch:{ Exception -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0053 A[Catch:{ Exception -> 0x006b }] */
    @com.alibaba.ariver.kernel.api.annotation.ThreadType(com.alibaba.ariver.kernel.common.service.executor.ExecutorType.UI)
    @com.alibaba.ariver.kernel.api.annotation.ActionFilter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getCurrentLocation(@com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(intDefault = 30, value = {"cacheTimeout"}) int r3, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(intDefault = 0, value = {"requestType"}) int r4, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(intDefault = 10, value = {"timeout"}) int r5, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam({"bizType"}) java.lang.String r6, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode(com.alibaba.ariver.app.api.Page.class) com.alibaba.ariver.app.api.Page r7, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r8) {
        /*
            r2 = this;
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject     // Catch:{ Exception -> 0x006b }
            r0.<init>()     // Catch:{ Exception -> 0x006b }
            java.lang.String r1 = "cacheTimeout"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x006b }
            r0.put((java.lang.String) r1, (java.lang.Object) r3)     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = "requestType"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x006b }
            r0.put((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = "timeout"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x006b }
            r0.put((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = "bizType"
            r0.put((java.lang.String) r3, (java.lang.Object) r6)     // Catch:{ Exception -> 0x006b }
            com.alibaba.ariver.app.api.PageContext r3 = r7.getPageContext()     // Catch:{ Exception -> 0x006b }
            if (r3 == 0) goto L_0x003f
            com.alibaba.ariver.app.api.PageContext r3 = r7.getPageContext()     // Catch:{ Exception -> 0x006b }
            android.app.Activity r3 = r3.getActivity()     // Catch:{ Exception -> 0x006b }
            if (r3 != 0) goto L_0x0036
            goto L_0x003f
        L_0x0036:
            com.alibaba.ariver.app.api.PageContext r3 = r7.getPageContext()     // Catch:{ Exception -> 0x006b }
            android.app.Activity r3 = r3.getActivity()     // Catch:{ Exception -> 0x006b }
            goto L_0x0051
        L_0x003f:
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVEnvironmentService> r3 = com.alibaba.ariver.kernel.common.service.RVEnvironmentService.class
            java.lang.Object r3 = com.alibaba.ariver.kernel.common.RVProxy.get(r3)     // Catch:{ Exception -> 0x006b }
            com.alibaba.ariver.kernel.common.service.RVEnvironmentService r3 = (com.alibaba.ariver.kernel.common.service.RVEnvironmentService) r3     // Catch:{ Exception -> 0x006b }
            java.lang.ref.WeakReference r3 = r3.getTopActivity()     // Catch:{ Exception -> 0x006b }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x006b }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ Exception -> 0x006b }
        L_0x0051:
            if (r3 != 0) goto L_0x005f
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVEnvironmentService> r3 = com.alibaba.ariver.kernel.common.service.RVEnvironmentService.class
            java.lang.Object r3 = com.alibaba.ariver.kernel.common.RVProxy.get(r3)     // Catch:{ Exception -> 0x006b }
            com.alibaba.ariver.kernel.common.service.RVEnvironmentService r3 = (com.alibaba.ariver.kernel.common.service.RVEnvironmentService) r3     // Catch:{ Exception -> 0x006b }
            android.app.Application r3 = r3.getApplicationContext()     // Catch:{ Exception -> 0x006b }
        L_0x005f:
            boolean r4 = sPermissionChecked     // Catch:{ Exception -> 0x006b }
            if (r4 == 0) goto L_0x0067
            getLocation(r3, r0, r8)     // Catch:{ Exception -> 0x006b }
            return
        L_0x0067:
            r2.checkPermission(r3, r0, r8)     // Catch:{ Exception -> 0x006b }
            return
        L_0x006b:
            r3 = move-exception
            java.lang.String r4 = "LocationBridge"
            java.lang.String r5 = "getCurrentLocation exception:"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r4, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.jsapi.device.location.LocationBridgeExtension.getCurrentLocation(int, int, int, java.lang.String, com.alibaba.ariver.app.api.Page, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    private void checkPermission(final Context context, final JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        try {
            if (Build.VERSION.SDK_INT < 23 || context.getApplicationInfo().targetSdkVersion < 23) {
                sPermissionChecked = true;
                getLocation(context, jSONObject, bridgeCallback);
            } else if (!sPermissionChecked) {
                if (Build.VERSION.SDK_INT >= 28) {
                    LocationManager locationManager = (LocationManager) context.getSystemService("location");
                    if (locationManager != null && !locationManager.isLocationEnabled()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("error", (Object) Integer.valueOf(ERROR_CODE_SERVICE_CLOSED));
                        jSONObject2.put("errorMessage", (Object) context.getString(R.string.griver_core_service_closed));
                        bridgeCallback.sendJSONResponse(jSONObject2);
                        return;
                    }
                } else if (Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) == 0) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("error", (Object) Integer.valueOf(ERROR_CODE_SERVICE_CLOSED));
                    jSONObject3.put("errorMessage", (Object) context.getString(R.string.griver_core_service_closed));
                    bridgeCallback.sendJSONResponse(jSONObject3);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : sRequirePermissions) {
                    if (context.checkSelfPermission(str) != 0) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() > 0) {
                    GriverEnv.getTopActivity().get().requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 1001);
                    RVNativePermissionRequestProxy rVNativePermissionRequestProxy = (RVNativePermissionRequestProxy) RVProxy.get(RVNativePermissionRequestProxy.class);
                    if (rVNativePermissionRequestProxy != null) {
                        rVNativePermissionRequestProxy.addPermRequstCallback(1001, new IPermissionRequestCallback() {
                            public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
                                if (i != 1001) {
                                    return;
                                }
                                if (iArr.length <= 0 || iArr[0] != 0) {
                                    a();
                                    return;
                                }
                                boolean unused = LocationBridgeExtension.sPermissionChecked = true;
                                LocationBridgeExtension.getLocation(context, jSONObject, bridgeCallback);
                            }

                            private void a() {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("error", (Object) Integer.valueOf(LocationBridgeExtension.ERROR_CODE_PERMISSION_NOT_ALLOWED));
                                jSONObject.put("errorMessage", (Object) context.getString(R.string.griver_core_no_location_permission));
                                bridgeCallback.sendJSONResponse(jSONObject);
                            }
                        });
                        return;
                    }
                    return;
                }
                sPermissionChecked = true;
                getLocation(context, jSONObject, bridgeCallback);
            }
        } catch (Exception e) {
            GriverLogger.e(TAG, "checkPermission e:", e);
        }
    }
}
