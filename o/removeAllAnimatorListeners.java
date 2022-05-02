package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.login.source.VerificationErrorCode;
import id.dana.data.tracker.TrackerDataKey;
import java.util.NoSuchElementException;
import o.TitleBarRightButtonView;
import org.json.JSONException;
import org.json.JSONObject;

public class removeAllAnimatorListeners<T extends BaseRpcResult> implements RedDotDrawable<T, TitleBarRightButtonView.AnonymousClass1<T>> {
    private Context context;
    private String operationType;

    public TitleBarRightButtonView.AnonymousClass1<T> apply(T t) throws Exception {
        if (t == null) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NoSuchElementException());
        }
        if (t.success) {
            return TitleBarRightButtonView.AnonymousClass1.just(t);
        }
        trackNetworkError(t);
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NetworkException((BaseRpcResult) t));
    }

    /* access modifiers changed from: protected */
    public void trackNetworkError(T t) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TrackerDataKey.Property.OPERATION_TYPE, getOperationType());
            jSONObject.put(TrackerDataKey.Property.ERROR_CODE, t.errorCode);
            jSONObject.put(TrackerDataKey.Property.ERROR_MESSAGE, t.errorMessage);
        } catch (JSONException unused) {
            updateActionSheetContent.e("Mixpanel", DanaLogConstants.ExceptionType.MIXPANEL_MESSAGE_EXCEPTION);
        }
        if (getContext() != null && !t.errorCode.equals(VerificationErrorCode.RETRY_VERIFY) && !t.errorCode.equals(VerificationErrorCode.BOKU_FAILED)) {
            setExtras.track(getContext(), "Network Error", jSONObject);
        }
    }

    public String getOperationType() {
        return this.operationType;
    }

    public void setOperationType(String str) {
        this.operationType = str;
    }

    public Context getContext() {
        return this.context;
    }

    public void setContext(Context context2) {
        this.context = context2;
    }
}
