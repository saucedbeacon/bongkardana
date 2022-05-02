package o;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import id.dana.data.constant.BranchLinkConstant;
import java.util.HashMap;
import java.util.Map;
import kotlin.random.Random;
import o.AutoTransition;
import o.CornerMarkingDataProvider;
import o.LocationBridgeExtension;
import org.json.JSONObject;

public class PatternPathMotion extends GriverAppVirtualHostProxy<getRequestHeaders> {
    private static final String getMin = PatternPathMotion.class.getSimpleName();
    private final AutoTransition.setMax getMax;
    private String isInside;
    private final LocationBridgeExtension.AnonymousClass2 length;
    private final boolean setMax;
    private final String setMin;
    private Intent toFloatRange;

    public /* synthetic */ void onNext(@NonNull Object obj) {
        getRequestHeaders getrequestheaders = (getRequestHeaders) obj;
        if (!setMin(getrequestheaders)) {
            this.getMax.dismissProgress();
        }
        if (this.setMax || TextUtils.isEmpty(getrequestheaders.getPath())) {
            this.getMax.setMax((showSoftInput) this.length.apply(getrequestheaders));
            return;
        }
        String path = getrequestheaders.getPath();
        char c = 65535;
        switch (path.hashCode()) {
            case -1335717394:
                if (path.equals(BranchLinkConstant.PathTarget.DECODE)) {
                    c = 1;
                    break;
                }
                break;
            case -1289167206:
                if (path.equals(BranchLinkConstant.PathTarget.EXPAND)) {
                    c = 2;
                    break;
                }
                break;
            case -1178183502:
                if (path.equals(BranchLinkConstant.PathTarget.ITUNES)) {
                    c = 6;
                    break;
                }
                break;
            case -979207434:
                if (path.equals(BranchLinkConstant.PathTarget.FEATURE)) {
                    c = 3;
                    break;
                }
                break;
            case -707675571:
                if (path.equals(BranchLinkConstant.PathTarget.MINI_PROGRAM)) {
                    c = 4;
                    break;
                }
                break;
            case -410956671:
                if (path.equals(BranchLinkConstant.PathTarget.CONTAINER)) {
                    c = 0;
                    break;
                }
                break;
            case 105516695:
                if (path.equals("oauth")) {
                    c = 5;
                    break;
                }
                break;
            case 551156019:
                if (path.equals(BranchLinkConstant.PathTarget.CUSTOM_CONTAINER)) {
                    c = 7;
                    break;
                }
                break;
        }
        String str = "";
        switch (c) {
            case 0:
                if (length(getrequestheaders)) {
                    this.getMax.setMax(isShowMenu.getMax(setMax(getrequestheaders), getrequestheaders.getParams()), this.toFloatRange);
                    return;
                } else {
                    this.getMax.onError(BranchLinkConstant.DeepLinkErrorCodeView.PHONE_NUMBER_NOT_EQUALS);
                    return;
                }
            case 1:
                String str2 = getrequestheaders.getParams().get("scene");
                AutoTransition.setMax setmax = this.getMax;
                String max = setMax(getrequestheaders);
                Map<String, String> params = getrequestheaders.getParams();
                String str3 = params != null ? params.get("source") : str;
                if (TextUtils.isEmpty(str3) && (str3 = this.setMin) == null) {
                    str3 = str;
                }
                if (str2 != null) {
                    str = str2;
                }
                setmax.getMax(max, str3, str);
                return;
            case 2:
                this.getMax.getMax(getrequestheaders.getShortCode());
                return;
            case 3:
                String constructCashierUrl = getrequestheaders.getConstructCashierUrl();
                if (constructCashierUrl != null) {
                    getStartDelay IsOverlapping = getStartDelay.IsOverlapping();
                    IsOverlapping.isInside = Integer.valueOf(Random.Default.nextInt());
                    IsOverlapping.getMin = constructCashierUrl;
                }
                AutoTransition.setMax setmax2 = this.getMax;
                String action = getrequestheaders.getAction() != null ? getrequestheaders.getAction() : str;
                Map<String, String> max2 = setMax(getrequestheaders.getParams());
                if (getrequestheaders.getPromoCode() != null) {
                    str = getrequestheaders.getPromoCode();
                }
                setmax2.getMax(action, max2, str);
                return;
            case 4:
                AutoTransition.setMax setmax3 = this.getMax;
                String action2 = getrequestheaders.getAction();
                Map<String, String> max3 = setMax(getrequestheaders.getParams());
                JSONObject extendedInfo = getrequestheaders.getExtendedInfo();
                String destinationPath = getrequestheaders.getDestinationPath();
                getrequestheaders.getOrderId();
                setmax3.setMax(action2, max3, extendedInfo, destinationPath);
                return;
            case 5:
                this.getMax.getMax(getrequestheaders.getOauthParams());
                return;
            case 6:
                this.getMax.setMin(setMax(getrequestheaders.getParams()));
                return;
            case 7:
                this.getMax.setMin(setMax(getrequestheaders));
                return;
            default:
                String str4 = getMin;
                StringBuilder sb = new StringBuilder("Unhandled deeplink path: ");
                sb.append(getrequestheaders.getPath());
                LocationBridgeExtension.length(str4, sb.toString());
                return;
        }
    }

    public PatternPathMotion(AutoTransition.setMax setmax, boolean z, String str, LocationBridgeExtension.AnonymousClass2 r4) {
        this.getMax = setmax;
        this.setMax = z;
        this.setMin = str;
        this.length = r4;
    }

    public PatternPathMotion(AutoTransition.setMax setmax, String str, LocationBridgeExtension.AnonymousClass2 r4, Intent intent) {
        this(setmax, false, str, r4);
        this.toFloatRange = intent;
    }

    public PatternPathMotion(AutoTransition.setMax setmax, String str, LocationBridgeExtension.AnonymousClass2 r4, String str2) {
        this(setmax, false, str, r4);
        String str3;
        if (str2 == null) {
            str3 = null;
        } else {
            str3 = isOriginHasAppInfo.replaceIndoPhoneNumberPrefixWithZero(str2);
        }
        this.isInside = str3;
    }

    public void onError(Throwable th) {
        super.onError(th);
        this.getMax.dismissProgress();
        this.getMax.onError(th.getMessage());
    }

    private static String setMax(getRequestHeaders getrequestheaders) {
        String fullUrl = getrequestheaders.getFullUrl();
        String innerUrl = getrequestheaders.getInnerUrl();
        if (innerUrl != null && !innerUrl.equals(fullUrl)) {
            fullUrl = "https://m.dana.id".concat(String.valueOf(innerUrl));
        }
        return fullUrl != null ? fullUrl : "";
    }

    private static boolean setMin(getRequestHeaders getrequestheaders) {
        return BranchLinkConstant.PathTarget.FEATURE.equals(getrequestheaders.getPath());
    }

    private Map<String, String> setMax(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.setMin != null && !map.containsKey("source")) {
            map.put("source", this.setMin);
        }
        return map;
    }

    private boolean length(@NonNull getRequestHeaders getrequestheaders) {
        if (!TextUtils.isEmpty(getrequestheaders.getInnerUrl())) {
            if (getrequestheaders.getParams() == null || !getrequestheaders.getParams().containsKey(BranchLinkConstant.Params.LOGIN_ID)) {
                return true;
            }
            return getMin(getrequestheaders);
        } else if (getrequestheaders.getFullUrl() != null) {
            return true;
        } else {
            return false;
        }
    }

    private boolean getMin(getRequestHeaders getrequestheaders) {
        String str = getrequestheaders.getParams().get(BranchLinkConstant.Params.LOGIN_ID);
        String length2 = CornerMarkingDataProvider.AnonymousClass1.length();
        return length2 != null && this.isInside != null && !TextUtils.isEmpty(str) && isOriginHasAppInfo.replaceIndoPhoneNumberPrefixWithZero(this.isInside).equals(CornerMarkingDataProvider.AnonymousClass1.setMin(str, length2));
    }
}
