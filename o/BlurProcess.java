package o;

import android.content.Context;
import android.location.Location;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.tracker.TrackerDataKey;
import id.dana.model.CdpContentModel;
import id.dana.richview.CurrencyTextView;
import id.dana.tracker.TrackerKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o.Blur;
import o.LogContextImpl;
import o.WheelView;
import o.convertDipToPx;
import org.json.JSONException;
import org.json.JSONObject;

public final class BlurProcess {
    private static BlurProcess getMax = null;
    private static String getMin = null;
    static String setMax = "";
    private DistinctPacketDetector length;
    private getPerformanceTracker setMin;

    private BlurProcess(DistinctPacketDetector distinctPacketDetector, getPerformanceTracker getperformancetracker) {
        this.length = distinctPacketDetector;
        this.setMin = getperformancetracker;
    }

    public static void setMax(DistinctPacketDetector distinctPacketDetector, getPerformanceTracker getperformancetracker) {
        if (getMax == null) {
            getMax = new BlurProcess(distinctPacketDetector, getperformancetracker);
        }
    }

    public static void getMax(Blur blur) {
        DistinctPacketDetector distinctPacketDetector = getMax.length;
        if (distinctPacketDetector != null) {
            distinctPacketDetector.track(blur.setMax(), blur.isInside());
        }
    }

    public static void length(Context context, String str, String str2, String str3, NetworkException networkException) {
        convertDipToPx.length length2 = new convertDipToPx.length(context);
        length2.getMax = "Network Error";
        convertDipToPx.length max = length2.setMax(TrackerDataKey.Property.OPERATION_TYPE, str).setMax(TrackerDataKey.Property.ERROR_CODE, networkException.getErrorCode()).setMax(TrackerDataKey.Property.ERROR_MESSAGE, networkException.getMessage()).setMax(TrackerDataKey.Property.DISPLAYED_MESSAGE, str2).setMax("Source", str3);
        max.setMin();
        genTextSelector.getMax(new convertDipToPx(max, (byte) 0));
    }

    public static void getMin(Context context, String str, String str2, String str3, String str4) {
        convertDipToPx.length length2 = new convertDipToPx.length(context);
        length2.getMax = TrackerDataKey.Event.DISPLAYED_ERROR;
        convertDipToPx.length max = length2.setMax(TrackerDataKey.Property.OPERATION_TYPE, str).setMax(TrackerDataKey.Property.ERROR_MESSAGE, str2).setMax(TrackerDataKey.Property.DISPLAYED_MESSAGE, str3).setMax("Source", str4);
        max.setMin();
        genTextSelector.getMax(new convertDipToPx(max, (byte) 0));
    }

    public static void getMin(Context context, CdpContentModel cdpContentModel, String str, @Nullable String str2) {
        String str3;
        convertDipToPx.length max = new convertDipToPx.length(context).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_ID, cdpContentModel.getMin).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_TYPE, cdpContentModel.setMin).setMax(TrackerKey.PromotionProperty.PROMOTION_CONTENT_NAME, cdpContentModel.getMax);
        Date date = cdpContentModel.isInside;
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        Locale locale = WheelView.OnWheelViewListener.getMax;
        if (date == null) {
            str3 = null;
        } else {
            str3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale).format(date);
        }
        convertDipToPx.length max2 = max.setMax(TrackerKey.PromotionProperty.PROMOTION_EXPIRY_DATE, str3);
        if (str2 == null) {
            str2 = "";
        }
        convertDipToPx.length max3 = max2.setMax(TrackerKey.PromotionProperty.PROMOTION_SPACE_CODE, str2);
        max3.getMax = str;
        max3.setMin();
        genTextSelector.getMax(new convertDipToPx(max3, (byte) 0));
    }

    public static void getMin(Context context, boolean z) {
        final JSONObject jSONObject = new JSONObject();
        Object valueOf = Boolean.valueOf(z);
        if (valueOf == null) {
            valueOf = "";
        }
        try {
            jSONObject.put(TrackerKey.PeopleProperty.USER_LOCATION_PERMISSION, valueOf);
        } catch (JSONException e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
        }
        BlurProcess blurProcess = getMax;
        uploadCoreByStartService uploadcorebystartservice = new WheelView.ScrollerTask.getMax(context).getMax;
        LogContextImpl.AnonymousClass1.setMax(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax).subscribe(new GriverAppVirtualHostProxy<Location>(true) {
            private Location length = null;

            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                this.length = (Location) obj;
            }

            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder("on Get Last Known Location Error: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, sb.toString());
                BlurProcess.getMin(BlurProcess.this, r0, this.length, false);
                dispose();
            }

            public final void onComplete() {
                BlurProcess.getMin(BlurProcess.this, r0, this.length, false);
                dispose();
            }
        });
    }

    public static void getMax(boolean z) {
        if (z) {
            DistinctPacketDetector distinctPacketDetector = getMax.length;
            if (distinctPacketDetector != null) {
                distinctPacketDetector.optInTracking();
                return;
            }
            return;
        }
        DistinctPacketDetector distinctPacketDetector2 = getMax.length;
        if (distinctPacketDetector2 != null) {
            distinctPacketDetector2.optOutTracking();
        }
    }

    public static void length(String str) {
        getMin = str;
    }

    public static void getMax() {
        BlurProcess blurProcess = getMax;
        if (blurProcess != null && blurProcess.length != null) {
            JSONObject jSONObject = new JSONObject();
            getPerformanceTracker getperformancetracker = getMax.setMin;
            String str = "";
            String deviceUtdId = getperformancetracker == null ? str : getperformancetracker.getDeviceUtdId();
            if (deviceUtdId != null) {
                str = deviceUtdId;
            }
            try {
                jSONObject.put("UTDID", str);
            } catch (JSONException e) {
                updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
            }
            getMax.length.registerSuperProperties(jSONObject);
        }
    }

    public static String setMin() {
        return getMin;
    }

    public static String setMax() {
        return getMax.length.getDistinctId();
    }

    public static boolean length() {
        return getMax.length.isAliasExist();
    }

    static void getMin() {
        getMax.length.reset();
    }

    static void toIntRange() {
        getMax.length.saveAliasExist(true);
    }

    @VisibleForTesting(otherwise = 3)
    public static void setMax(String str) {
        getMax.length.setAlias(str, false);
    }

    static void setMin(Context context) {
        final JSONObject jSONObject = new JSONObject();
        Boolean valueOf = Boolean.valueOf(setStateOn.getMin(context, "android.permission.ACCESS_FINE_LOCATION"));
        String str = "";
        if (valueOf == null) {
            valueOf = str;
        }
        try {
            jSONObject.put(TrackerKey.PeopleProperty.USER_LOCATION_PERMISSION, valueOf);
        } catch (JSONException e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
        }
        String mixpanelSource = getMax.length.getMixpanelSource();
        if (mixpanelSource == null) {
            mixpanelSource = str;
        }
        try {
            jSONObject.put(TrackerDataKey.SuperProperties.MIXPANEL_SOURCE, mixpanelSource);
        } catch (JSONException e2) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e2);
        }
        BlurProcess blurProcess = getMax;
        uploadCoreByStartService uploadcorebystartservice = new WheelView.ScrollerTask.getMax(context).getMax;
        LogContextImpl.AnonymousClass1.setMax(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax).subscribe(new GriverAppVirtualHostProxy<Location>(false) {
            private Location length = null;

            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                this.length = (Location) obj;
            }

            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder("on Get Last Known Location Error: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, sb.toString());
                BlurProcess.getMin(BlurProcess.this, jSONObject, this.length, false);
                dispose();
            }

            public final void onComplete() {
                BlurProcess.getMin(BlurProcess.this, jSONObject, this.length, false);
                dispose();
            }
        });
        try {
            jSONObject.put(TrackerKey.SuperProperties.ENVIRONMENT, "production");
        } catch (JSONException e3) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e3);
        }
        getPerformanceTracker getperformancetracker = getMax.setMin;
        String deviceUtdId = getperformancetracker == null ? str : getperformancetracker.getDeviceUtdId();
        if (deviceUtdId != null) {
            str = deviceUtdId;
        }
        try {
            jSONObject.put("UTDID", str);
        } catch (JSONException e4) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e4);
        }
        getMax.length.registerSuperProperties(jSONObject);
    }

    public static void setMax(Blur blur) {
        final JSONObject jSONObject = new JSONObject();
        String min = blur.setMin();
        String str = "";
        if (min == null) {
            min = str;
        }
        try {
            jSONObject.put("$user_id", min);
        } catch (JSONException e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
        }
        String max = blur.getMax();
        if (max == null) {
            max = str;
        }
        try {
            jSONObject.put("KYC Level", max);
        } catch (JSONException e2) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e2);
        }
        Object valueOf = Boolean.valueOf(setStateOn.getMin(blur.getMin(), "android.permission.ACCESS_FINE_LOCATION"));
        if (valueOf == null) {
            valueOf = str;
        }
        try {
            jSONObject.put(TrackerKey.PeopleProperty.USER_LOCATION_PERMISSION, valueOf);
        } catch (JSONException e3) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e3);
        }
        getPerformanceTracker getperformancetracker = getMax.setMin;
        String deviceUtdId = getperformancetracker == null ? str : getperformancetracker.getDeviceUtdId();
        if (deviceUtdId == null) {
            deviceUtdId = str;
        }
        try {
            jSONObject.put("UTDID", deviceUtdId);
        } catch (JSONException e4) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e4);
        }
        String str2 = getMin;
        if (str2 != null) {
            str = str2;
        }
        try {
            jSONObject.put(TrackerKey.Property.MEDIA_SOURCE, str);
        } catch (JSONException e5) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e5);
        }
        BlurProcess blurProcess = getMax;
        uploadCoreByStartService uploadcorebystartservice = new WheelView.ScrollerTask.getMax(blur.getMin()).getMax;
        LogContextImpl.AnonymousClass1.setMax(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax).subscribe(new GriverAppVirtualHostProxy<Location>(false) {
            private Location length = null;

            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                this.length = (Location) obj;
            }

            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder("on Get Last Known Location Error: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, sb.toString());
                BlurProcess.getMin(BlurProcess.this, jSONObject, this.length, false);
                dispose();
            }

            public final void onComplete() {
                BlurProcess.getMin(BlurProcess.this, jSONObject, this.length, false);
                dispose();
            }
        });
        getMax.length.setPeople(jSONObject);
    }

    public static void setMin(JSONObject jSONObject) {
        getMax.length.setPeopleOnce(jSONObject);
    }

    public static void length(JSONObject jSONObject) {
        getMax.length.setPeople(jSONObject);
    }

    public static void length(Blur blur) {
        String min = blur.setMin();
        setMax = min;
        getMax.length.setIdentify(min, true);
    }

    public static void getMin(String str) {
        DistinctPacketDetector distinctPacketDetector = getMax.length;
        if (distinctPacketDetector != null) {
            distinctPacketDetector.startTimer(str);
        }
    }

    @VisibleForTesting(otherwise = 3)
    public static void getMin(Context context, String str, String str2) {
        Blur.getMax getmax = new Blur.getMax(context);
        getmax.length = str;
        getmax.getMin = str2;
        Blur blur = new Blur(getmax, (byte) 0);
        setMin(blur.getMin());
        String min = blur.setMin();
        setMax = min;
        getMax.length.setIdentify(min, true);
        setMax(blur);
    }

    static /* synthetic */ void getMin(BlurProcess blurProcess, JSONObject jSONObject, Location location, boolean z) {
        String str;
        String str2 = "";
        String d = location == null ? str2 : Double.toString(location.getLatitude());
        if (location == null) {
            str = str2;
        } else {
            str = Double.toString(location.getLongitude());
        }
        try {
            jSONObject.put(TrackerKey.SuperProperties.LATITUDE, d == null ? str2 : d);
        } catch (JSONException e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
        }
        try {
            jSONObject.put(TrackerKey.SuperProperties.LONGITUDE, str == null ? str2 : str);
        } catch (JSONException e2) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e2);
        }
        if (d == null) {
            d = str2;
        }
        try {
            jSONObject.put(TrackerKey.SuperProperties.MIXPANEL_LATITUDE, d);
        } catch (JSONException e3) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e3);
        }
        if (str != null) {
            str2 = str;
        }
        try {
            jSONObject.put(TrackerKey.SuperProperties.MIXPANEL_LONGITUDE, str2);
        } catch (JSONException e4) {
            updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e4);
        }
        DistinctPacketDetector distinctPacketDetector = blurProcess.length;
        if (distinctPacketDetector != null) {
            distinctPacketDetector.setPeople(jSONObject);
            blurProcess.length.registerSuperProperties(jSONObject);
            if (z) {
                blurProcess.length.track(TrackerKey.Event.LOCATION_PERMISSION, jSONObject);
            }
        }
    }
}
