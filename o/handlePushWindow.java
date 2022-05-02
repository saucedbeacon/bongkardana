package o;

import android.content.Context;
import com.alipay.iap.android.lbs.LBSLocation;
import com.alipay.iap.android.lbs.LBSLocationManagerProxy;
import com.alipay.iap.android.lbs.LBSLocationRequest;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.concurrent.TimeUnit;

public final class handlePushWindow {
    public static final long DEFAULT_LBS_CACHE_PERIOD = TimeUnit.MINUTES.toMillis(15);
    public static final String TAG = "LbsFacade";

    public static LBSLocation getLatestLocation(Context context) {
        long longConfig = ConfigCenter.getInstance().getLongConfig("lbs_cache_period", DEFAULT_LBS_CACHE_PERIOD);
        LBSLocationRequest lBSLocationRequest = new LBSLocationRequest();
        lBSLocationRequest.cacheValidTime = longConfig;
        return getLatestLocation(context, lBSLocationRequest);
    }

    public static LBSLocation getLatestLocation(Context context, LBSLocationRequest lBSLocationRequest) {
        StringBuilder sb = new StringBuilder("getLatestLocation  request:  [cacheValidTime: ");
        sb.append(lBSLocationRequest.cacheValidTime);
        sb.append("\t isHighAccuracy: ");
        sb.append(lBSLocationRequest.isHighAccuracy);
        sb.append("\t timeOut: ");
        sb.append(lBSLocationRequest.timeOut);
        sb.append(" \t updateInterval:");
        sb.append(lBSLocationRequest.updateInterval);
        sb.append("\t minDistance:");
        sb.append(lBSLocationRequest.minDistance);
        sb.append("]");
        updateActionSheetContent.d(TAG, sb.toString());
        return LBSLocationManagerProxy.getInstance().getLastKnownLocation(context, lBSLocationRequest);
    }
}
