package o;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import id.dana.DanaApplication;
import id.dana.constants.AnalyticEventConstant;
import java.util.Map;

public final class getColorByValue implements getTypeface {
    private final getTypefaceByCat setMin;

    public final void setMin() {
    }

    public getColorByValue(getTypefaceByCat gettypefacebycat) {
        this.setMin = gettypefacebycat;
    }

    public final void getMax() {
        getTypefaceByCat gettypefacebycat = this.setMin;
        if (gettypefacebycat != null && gettypefacebycat.setMax.getMax != null) {
            AppsFlyerLib.getInstance().setDebugLog(false);
            AppsFlyerLib.getInstance().setCollectIMEI(false);
            AppsFlyerLib.getInstance().setCollectAndroidID(false);
            if (!this.setMin.length() && TextUtils.isEmpty(this.setMin.setMax.setMin)) {
                String str = this.setMin.setMax.setMax;
                if (!TextUtils.isEmpty(str)) {
                    AppsFlyerLib.getInstance().setCustomerUserId(str);
                }
            }
            AppsFlyerLib.getInstance().startTracking((DanaApplication) this.setMin.setMax.getMax, "p7FuAXgaYGTPu8TczjQqGa");
            AppsFlyerLib.getInstance().registerConversionListener(this.setMin.setMax.getMax, new AppsFlyerConversionListener() {
                public final void onAppOpenAttribution(Map<String, String> map) {
                }

                public final void onAttributionFailure(String str) {
                }

                public final void onConversionDataFail(String str) {
                }

                public final void onConversionDataSuccess(Map<String, Object> map) {
                    String str = (String) map.get(AnalyticEventConstant.AE_MEDIA_SOURCE);
                    String str2 = (String) map.get(AnalyticEventConstant.AE_AF_STATUS);
                    if (str == null) {
                        str = str2;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        BlurProcess.length(str);
                    }
                    BlurProcess.getMax();
                }
            });
        }
    }

    public final void setMax() {
        if (getMin()) {
            AppsFlyerLib instance = AppsFlyerLib.getInstance();
            String str = this.setMin.setMax.setMin;
            if (TextUtils.isEmpty(str)) {
                str = this.setMin.setMax.setMax;
            }
            instance.setCustomerUserId(str);
        }
    }

    public final void length() {
        if (getMin()) {
            AppsFlyerLib instance = AppsFlyerLib.getInstance();
            String str = this.setMin.setMax.setMin;
            if (TextUtils.isEmpty(str)) {
                str = this.setMin.setMax.setMax;
            }
            instance.setCustomerUserId(str);
        }
    }

    private boolean getMin() {
        getTypefaceByCat gettypefacebycat = this.setMin;
        return gettypefacebycat != null && !TextUtils.isEmpty(gettypefacebycat.setMax.setMin);
    }
}
