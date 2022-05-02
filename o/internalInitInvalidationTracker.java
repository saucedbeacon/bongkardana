package o;

import android.content.Context;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.tracker.TrackerDataKey;
import id.dana.di.PerActivity;
import id.dana.domain.otp.model.OtpChannel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.calculateDistance;
import o.classExist;
import o.endTransaction;
import o.getFieldValue;

@PerActivity
public final class internalInitInvalidationTracker implements endTransaction.setMax {
    private final PermissionUtils IsOverlapping;
    /* access modifiers changed from: private */
    public boolean equals;
    private final classExist getMax;
    /* access modifiers changed from: private */
    public final endTransaction.length getMin;
    /* access modifiers changed from: private */
    public int hashCode = 1;
    private final setCacheMode isInside;
    private final getFieldValue length;
    private final Context setMax;
    private final calculateDistance setMin;
    /* access modifiers changed from: private */
    public AUBubbleView toFloatRange;
    private GriverAppVirtualHostProxy<String> toIntRange;

    @Inject
    internalInitInvalidationTracker(Context context, endTransaction.length length2, classExist classexist, getFieldValue getfieldvalue, calculateDistance calculatedistance, PermissionUtils permissionUtils, setCacheMode setcachemode) {
        this.setMax = context;
        this.getMin = length2;
        this.getMax = classexist;
        this.length = getfieldvalue;
        this.setMin = calculatedistance;
        this.IsOverlapping = permissionUtils;
        this.isInside = setcachemode;
        this.toFloatRange = new AUBubbleView(context, "Registration");
    }

    public final void getMax() {
        if (!this.equals) {
            this.equals = true;
            convertDipToPx min = this.toFloatRange.setMin();
            List length2 = min.length != null ? min.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        }
    }

    public final void length(String str, String str2, String str3, String str4) {
        this.getMin.showProgress();
        this.getMax.execute(new GriverAppVirtualHostProxy<canSendRequest>() {
            public final /* synthetic */ void onNext(Object obj) {
                canSendRequest cansendrequest = (canSendRequest) obj;
                internalInitInvalidationTracker.this.getMin.dismissProgress();
                if (cansendrequest.isSuccess()) {
                    internalInitInvalidationTracker.this.getMin.getMin();
                } else {
                    internalInitInvalidationTracker.this.getMin.onError(cansendrequest.getErrorMessage());
                    StringBuilder sb = new StringBuilder("[OtpRegister] input OTP: errorCode = ");
                    sb.append(cansendrequest.getErrorCode());
                    sb.append(", errorMessage = ");
                    sb.append(cansendrequest.getErrorMessage());
                    setStateOff.getMax(DanaLogConstants.TAG.REGISTER_TAG, sb.toString());
                }
                genTextSelector.getMax(internalInitInvalidationTracker.this.toFloatRange.setMax(cansendrequest.isSuccess(), cansendrequest.getFailedCount(), internalInitInvalidationTracker.this.hashCode));
            }

            public final void onError(Throwable th) {
                internalInitInvalidationTracker.this.getMin.dismissProgress();
                if (th instanceof NetworkException) {
                    NetworkException networkException = (NetworkException) th;
                    internalInitInvalidationTracker.this.getMin.length(networkException.getErrorCode(), networkException.getMessage(), networkException.getLeftTimes().intValue(), (String) null);
                    BlurProcess.length(internalInitInvalidationTracker.this.setMax, TrackerDataKey.NetworkErrorOperationTypeProperty.VERIFY_OTP, networkException.getMessage(), "Registration", networkException);
                    return;
                }
                internalInitInvalidationTracker.this.getMin.onError(th.getMessage());
                internalInitInvalidationTracker.getMax(internalInitInvalidationTracker.this, TrackerDataKey.NetworkErrorOperationTypeProperty.VERIFY_OTP, th.getMessage(), th);
                setStateOff.length(DanaLogConstants.TAG.REGISTER_TAG, "[OtpRegister] input OTP error: ".concat(String.valueOf(th)), th);
            }
        }, classExist.length.forVerifyOtp(str));
    }

    public final void getMin(String str, String str2, String str3) {
        this.getMin.showProgress();
        this.length.execute(new GriverAppVirtualHostProxy<filterBundle>() {
            public final /* synthetic */ void onNext(Object obj) {
                filterBundle filterbundle = (filterBundle) obj;
                internalInitInvalidationTracker.this.getMin.dismissProgress();
                if (filterbundle.getSuccess()) {
                    internalInitInvalidationTracker.this.getMin.getMin();
                    return;
                }
                internalInitInvalidationTracker.this.getMin.onError(filterbundle.getErrorMessage());
                StringBuilder sb = new StringBuilder("[OtpRegister] input OTP: errorCode = ");
                sb.append(filterbundle.getErrorCode());
                sb.append(", errorMessage = ");
                sb.append(filterbundle.getErrorMessage());
                setStateOff.getMax(DanaLogConstants.TAG.REGISTER_TAG, sb.toString());
            }

            public final void onError(Throwable th) {
                internalInitInvalidationTracker.this.getMin.dismissProgress();
                if (th instanceof NetworkException) {
                    NetworkException networkException = (NetworkException) th;
                    internalInitInvalidationTracker.this.getMin.length(networkException.getErrorCode(), networkException.getMessage(), networkException.getLeftTimes().intValue(), (String) null);
                    BlurProcess.length(internalInitInvalidationTracker.this.setMax, TrackerDataKey.NetworkErrorOperationTypeProperty.VERIFY_OTP_RISK, networkException.getMessage(), "Registration", networkException);
                    return;
                }
                internalInitInvalidationTracker.this.getMin.onError(th.getMessage());
                internalInitInvalidationTracker.getMax(internalInitInvalidationTracker.this, TrackerDataKey.NetworkErrorOperationTypeProperty.VERIFY_OTP_RISK, th.getMessage(), th);
                setStateOff.length(DanaLogConstants.TAG.REGISTER_TAG, "[OtpRegister] input OTP error: ".concat(String.valueOf(th)), th);
            }
        }, getFieldValue.length.forVerifyOtp(str, str2, str3));
    }

    public final void setMax(String str, String str2) {
        this.getMin.showProgress();
        this.setMin.execute(new GriverAppVirtualHostProxy<setEncryptProxy>() {
            public final /* synthetic */ void onNext(Object obj) {
                setEncryptProxy setencryptproxy = (setEncryptProxy) obj;
                internalInitInvalidationTracker.this.getMin.dismissProgress();
                if (setencryptproxy.isSuccess()) {
                    boolean unused = internalInitInvalidationTracker.this.equals = false;
                    endTransaction.length min = internalInitInvalidationTracker.this.getMin;
                    setencryptproxy.getExpirySeconds();
                    min.getMin(setencryptproxy.getRetrySendSeconds(), setencryptproxy.getOtpCodeLength());
                    return;
                }
                StringBuilder sb = new StringBuilder("[OtpRegister] send OTP: errorCode = ");
                sb.append(setencryptproxy.getErrorCode());
                sb.append(", errorMessage = ");
                sb.append(setencryptproxy.getErrorMessage());
                setStateOff.getMax(DanaLogConstants.TAG.REGISTER_TAG, sb.toString());
            }

            public final void onError(Throwable th) {
                internalInitInvalidationTracker.this.getMin.dismissProgress();
                internalInitInvalidationTracker.this.getMin.onError(th.getMessage());
                setStateOff.length(DanaLogConstants.TAG.REGISTER_TAG, "[OtpRegister] send OTP error: ".concat(String.valueOf(th)), th);
            }
        }, calculateDistance.getMin.forResendOtp(OtpChannel.SMS));
        this.hashCode++;
        convertDipToPx min = this.toFloatRange.setMin(TinyAppActionStateListener.getMin(OtpChannel.SMS));
        List length2 = min.length != null ? min.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void getMin() {
        this.getMin.showProgress();
        this.setMin.execute(new GriverAppVirtualHostProxy<setEncryptProxy>() {
            public final /* synthetic */ void onNext(Object obj) {
                setEncryptProxy setencryptproxy = (setEncryptProxy) obj;
                internalInitInvalidationTracker.this.getMin.dismissProgress();
                if (setencryptproxy.isSuccess()) {
                    boolean unused = internalInitInvalidationTracker.this.equals = false;
                    endTransaction.length min = internalInitInvalidationTracker.this.getMin;
                    setencryptproxy.getExpirySeconds();
                    min.getMin(setencryptproxy.getRetrySendSeconds(), setencryptproxy.getOtpCodeLength());
                    return;
                }
                StringBuilder sb = new StringBuilder("[OtpRegister] send OTP: errorCode = ");
                sb.append(setencryptproxy.getErrorCode());
                sb.append(", errorMessage = ");
                sb.append(setencryptproxy.getErrorMessage());
                setStateOff.getMax(DanaLogConstants.TAG.REGISTER_TAG, sb.toString());
            }

            public final void onError(Throwable th) {
                internalInitInvalidationTracker.this.getMin.dismissProgress();
                internalInitInvalidationTracker.this.getMin.onError(th.getMessage());
                setStateOff.length(DanaLogConstants.TAG.REGISTER_TAG, "[OtpRegister] send OTP error: ".concat(String.valueOf(th)), th);
            }
        }, calculateDistance.getMin.forResendOtp(OtpChannel.WHATSAPP));
        this.hashCode++;
        convertDipToPx min = this.toFloatRange.setMin(TinyAppActionStateListener.getMin(OtpChannel.WHATSAPP));
        List length2 = min.length != null ? min.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void length() {
        this.isInside.execute(null, new setTransactionSuccessful(this), runInTransaction.setMax);
    }

    public final void setMax() {
        this.getMax.dispose();
        this.length.dispose();
        this.setMin.dispose();
        this.IsOverlapping.dispose();
        this.isInside.dispose();
    }

    public final void setMin() {
        GriverAppVirtualHostProxy<String> griverAppVirtualHostProxy = this.toIntRange;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.toIntRange = null;
        }
        PermissionUtils permissionUtils = this.IsOverlapping;
        if (this.toIntRange == null) {
            this.toIntRange = new GriverAppVirtualHostProxy<String>() {
                public final /* synthetic */ void onNext(Object obj) {
                    internalInitInvalidationTracker.this.getMin.getMax((String) obj);
                }
            };
        }
        permissionUtils.execute(this.toIntRange);
    }

    static /* synthetic */ void getMax(internalInitInvalidationTracker internalinitinvalidationtracker, String str, String str2, Throwable th) {
        String str3;
        Context context = internalinitinvalidationtracker.setMax;
        if (th instanceof NetworkException) {
            str3 = ((NetworkException) th).getMessage();
        } else {
            str3 = context.getString(R.string.general_error_msg);
        }
        BlurProcess.getMin(context, str, str2, str3, "Registration");
    }
}
