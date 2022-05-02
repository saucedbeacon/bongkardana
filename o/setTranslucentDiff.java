package o;

import io.split.android.client.Evaluator;
import io.split.android.client.events.ISplitEventsManager;
import io.split.android.client.events.SplitEvent;
import io.split.android.client.impressions.ImpressionListener;
import io.split.android.client.validators.KeyValidator;
import io.split.android.client.validators.SplitValidator;
import io.split.android.client.validators.TreatmentManager;
import io.split.android.client.validators.ValidationMessageLogger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.b;

public final class setTranslucentDiff implements TreatmentManager {
    private final String CLIENT_DESTROYED_MESSAGE = "Client has already been destroyed - no calls possible";
    private final String SDK_READY_NOT_FIRED = "No listeners for SDK Readiness detected. Incorrect control treatments could be logged if you call getTreatment while the SDK is not yet ready";
    private final String mBucketingKey;
    private final Evaluator mEvaluator;
    private final ISplitEventsManager mEventsManager;
    private final ImpressionListener mImpressionListener;
    private final KeyValidator mKeyValidator;
    private final String mMatchingKey;
    private final b.a mMetrics;
    private final getPackageValidityCheckComp mSplitClientConfig;
    private final SplitValidator mSplitValidator;
    private final ValidationMessageLogger mValidationLogger;

    public setTranslucentDiff(String str, String str2, Evaluator evaluator, KeyValidator keyValidator, SplitValidator splitValidator, b.a aVar, ImpressionListener impressionListener, getPackageValidityCheckComp getpackagevaliditycheckcomp, ISplitEventsManager iSplitEventsManager) {
        this.mEvaluator = evaluator;
        this.mKeyValidator = keyValidator;
        this.mSplitValidator = splitValidator;
        this.mMetrics = aVar;
        this.mMatchingKey = str;
        this.mBucketingKey = str2;
        this.mImpressionListener = impressionListener;
        this.mSplitClientConfig = getpackagevaliditycheckcomp;
        this.mEventsManager = iSplitEventsManager;
        this.mValidationLogger = new setTranslucent();
    }

    public final String getTreatment(String str, Map<String, Object> map, boolean z) {
        if (z) {
            createLoadingDialog.e("getTreatmentClient has already been destroyed - no calls possible");
            return "control";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String treatment = getTreatmentWithConfigWithoutMetrics(str, map, "getTreatment").treatment();
        this.mMetrics.time("sdk.getTreatment", System.currentTimeMillis() - currentTimeMillis);
        return treatment;
    }

    public final getSDKVerison getTreatmentWithConfig(String str, Map<String, Object> map, boolean z) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(91323680, oncanceled);
            onCancelLoad.getMin(91323680, oncanceled);
        }
        if (z) {
            createLoadingDialog.e("getTreatmentWithConfigClient has already been destroyed - no calls possible");
            return new getSDKVerison("control");
        }
        long currentTimeMillis = System.currentTimeMillis();
        getSDKVerison treatmentWithConfigWithoutMetrics = getTreatmentWithConfigWithoutMetrics(str, map, "getTreatmentWithConfig");
        this.mMetrics.time("sdk.getTreatmentWithConfig", System.currentTimeMillis() - currentTimeMillis);
        return treatmentWithConfigWithoutMetrics;
    }

    public final Map<String, String> getTreatments(List<String> list, Map<String, Object> map, boolean z) {
        if (list == null) {
            this.mValidationLogger.e("split_names must be a non-empty array", "getTreatments");
            return new HashMap();
        } else if (z) {
            this.mValidationLogger.e("Client has already been destroyed - no calls possible", "getTreatments");
            return controlTreatmentsForSplits(list, "getTreatments");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            Map<String, getSDKVerison> treatmentsWithConfigWithoutMetrics = getTreatmentsWithConfigWithoutMetrics(list, map, "getTreatments");
            HashMap hashMap = new HashMap();
            for (Map.Entry next : treatmentsWithConfigWithoutMetrics.entrySet()) {
                hashMap.put((String) next.getKey(), ((getSDKVerison) next.getValue()).treatment());
            }
            this.mMetrics.time("sdk.getTreatments", System.currentTimeMillis() - currentTimeMillis);
            return hashMap;
        }
    }

    public final Map<String, getSDKVerison> getTreatmentsWithConfig(List<String> list, Map<String, Object> map, boolean z) {
        if (list == null) {
            this.mValidationLogger.e("split_names must be a non-empty array", "getTreatmentsWithConfig");
            return new HashMap();
        } else if (z) {
            createLoadingDialog.e("getTreatmentsWithConfigClient has already been destroyed - no calls possible");
            return controlTreatmentsForSplitsWithConfig(list, "getTreatmentsWithConfig");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            Map<String, getSDKVerison> treatmentsWithConfigWithoutMetrics = getTreatmentsWithConfigWithoutMetrics(list, map, "getTreatmentsWithConfig");
            this.mMetrics.time("sdk.getTreatmentsWithConfig", System.currentTimeMillis() - currentTimeMillis);
            return treatmentsWithConfigWithoutMetrics;
        }
    }

    private getSDKVerison getTreatmentWithConfigWithoutMetrics(String str, Map<String, Object> map, String str2) {
        setTranslucentForCoordinatorLayout validate = this.mKeyValidator.validate(this.mMatchingKey, this.mBucketingKey);
        if (validate != null) {
            this.mValidationLogger.e(validate, str2);
            return new getSDKVerison("control");
        }
        setTranslucentForCoordinatorLayout validateName = this.mSplitValidator.validateName(str);
        if (validateName != null) {
            if (validateName.isError()) {
                this.mValidationLogger.e(validateName, str2);
                return new getSDKVerison("control");
            }
            this.mValidationLogger.w(validateName, str2);
            str = str.trim();
        }
        String str3 = str;
        getDynamicDataStoreComp evaluateIfReady = evaluateIfReady(str3, map, str2);
        getSDKVerison getsdkverison = new getSDKVerison(evaluateIfReady.getTreatment(), evaluateIfReady.getConfigurations());
        if (evaluateIfReady.getLabel().equals("definition not found")) {
            this.mValidationLogger.w(this.mSplitValidator.splitNotFoundMessage(str3), str2);
            return getsdkverison;
        }
        logImpression(this.mMatchingKey, this.mBucketingKey, str3, evaluateIfReady.getTreatment(), this.mSplitClientConfig.labelsEnabled() ? evaluateIfReady.getLabel() : null, evaluateIfReady.getChangeNumber(), map);
        return getsdkverison;
    }

    private Map<String, getSDKVerison> getTreatmentsWithConfigWithoutMetrics(List<String> list, Map<String, Object> map, String str) {
        setTranslucentForCoordinatorLayout validate = this.mKeyValidator.validate(this.mMatchingKey, this.mBucketingKey);
        if (validate != null) {
            this.mValidationLogger.log(validate, str);
            return controlTreatmentsForSplitsWithConfig(list, str);
        }
        HashMap hashMap = new HashMap();
        if (list.size() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": split_names is an empty array or has null values");
            createLoadingDialog.w(sb.toString());
            return hashMap;
        }
        for (String next : list) {
            setTranslucentForCoordinatorLayout validateName = this.mSplitValidator.validateName(next);
            if (validateName != null) {
                if (validateName.isError()) {
                    this.mValidationLogger.e(validateName, str);
                } else {
                    this.mValidationLogger.w(validateName, str);
                }
            }
            getDynamicDataStoreComp evaluateIfReady = evaluateIfReady(next.trim(), map, str);
            hashMap.put(next.trim(), new getSDKVerison(evaluateIfReady.getTreatment(), evaluateIfReady.getConfigurations()));
            if (evaluateIfReady.getLabel().equals("definition not found")) {
                this.mValidationLogger.w(this.mSplitValidator.splitNotFoundMessage(next), str);
            } else {
                logImpression(this.mMatchingKey, this.mBucketingKey, next, evaluateIfReady.getTreatment(), this.mSplitClientConfig.labelsEnabled() ? evaluateIfReady.getLabel() : null, evaluateIfReady.getChangeNumber(), map);
            }
        }
        return hashMap;
    }

    private void logImpression(String str, String str2, String str3, String str4, String str5, Long l, Map<String, Object> map) {
        try {
            this.mImpressionListener.log(new dynamicDecryptDDp(str, str2, str3, str4, System.currentTimeMillis(), str5, l, map));
        } catch (Throwable th) {
            createLoadingDialog.e(th);
        }
    }

    private Map<String, getSDKVerison> controlTreatmentsForSplitsWithConfig(List<String> list, String str) {
        HashMap hashMap = new HashMap();
        for (String next : list) {
            setTranslucentForCoordinatorLayout validateName = this.mSplitValidator.validateName(next);
            if (validateName != null) {
                if (validateName.isError()) {
                    this.mValidationLogger.e(validateName, str);
                } else {
                    this.mValidationLogger.w(validateName, str);
                }
            }
            hashMap.put(next.trim(), new getSDKVerison("control"));
        }
        return hashMap;
    }

    private Map<String, String> controlTreatmentsForSplits(List<String> list, String str) {
        HashMap hashMap = new HashMap();
        for (String next : list) {
            setTranslucentForCoordinatorLayout validateName = this.mSplitValidator.validateName(next);
            if (validateName != null) {
                if (validateName.isError()) {
                    this.mValidationLogger.e(validateName, str);
                } else {
                    this.mValidationLogger.w(validateName, str);
                }
            }
            hashMap.put(next.trim(), "control");
        }
        return hashMap;
    }

    private getDynamicDataStoreComp evaluateIfReady(String str, Map<String, Object> map, String str2) {
        if (this.mEventsManager.eventAlreadyTriggered(SplitEvent.SDK_READY) || this.mEventsManager.eventAlreadyTriggered(SplitEvent.SDK_READY_FROM_CACHE)) {
            return this.mEvaluator.getTreatment(this.mMatchingKey, this.mBucketingKey, str, map);
        }
        this.mValidationLogger.w("the SDK is not ready, results may be incorrect. Make sure to wait for SDK readiness before using this method", str2);
        return new getDynamicDataStoreComp("control", "not ready", (Long) null, (String) null);
    }
}
