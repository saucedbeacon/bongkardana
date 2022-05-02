package o;

import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lid/dana/data/otp/mapper/OtpMapper;", "", "()V", "transform", "Lid/dana/domain/otp/model/SendOtpResponse;", "result", "Lid/dana/data/otp/repository/source/network/result/SendOtpResult;", "Lid/dana/domain/otp/model/VerifyOtpResponse;", "Lid/dana/data/otp/repository/source/network/result/VerifyOtpResult;", "Lid/dana/data/twilio/repository/source/network/result/VerifySecurityProductResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ParamBinder {
    @Nullable
    public final canSendRequest transform(@Nullable getAppxVersionInWorker getappxversioninworker) {
        canSendRequest cansendrequest = null;
        if (getappxversioninworker != null) {
            canSendRequest cansendrequest2 = new canSendRequest(0, 0, 3, (DefaultConstructorMarker) null);
            cansendrequest2.setFailedCount(getappxversioninworker.failedCount);
            cansendrequest2.setMaxFailedCount(getappxversioninworker.maxFailedCount);
            cansendrequest = cansendrequest2;
        }
        uncheckAllItems.transform(cansendrequest, getappxversioninworker);
        return cansendrequest;
    }

    @Nullable
    public final canSendRequest transform(@Nullable needWaitForSetup needwaitforsetup) {
        canSendRequest cansendrequest = null;
        if (needwaitforsetup != null) {
            canSendRequest cansendrequest2 = new canSendRequest(0, 0, 3, (DefaultConstructorMarker) null);
            cansendrequest2.setFailedCount(needwaitforsetup.getIdentFailedCount());
            cansendrequest2.setMaxFailedCount(needwaitforsetup.getMaxFailedLimit());
            cansendrequest = cansendrequest2;
        }
        uncheckAllItems.transform(cansendrequest, needwaitforsetup);
        return cansendrequest;
    }

    @Nullable
    public final positivePermissionsResult transform(@Nullable getJsApiDetail4TinyWithT2 getjsapidetail4tinywitht2) {
        positivePermissionsResult positivepermissionsresult;
        if (getjsapidetail4tinywitht2 != null) {
            positivepermissionsresult = new positivePermissionsResult();
            positivepermissionsresult.setExpirySeconds(getjsapidetail4tinywitht2.expirySeconds);
            positivepermissionsresult.setOtpCodeLength(getjsapidetail4tinywitht2.otpCodeLength);
            positivepermissionsresult.setRetrySendSeconds(getjsapidetail4tinywitht2.retrySendSeconds);
        } else {
            positivepermissionsresult = null;
        }
        uncheckAllItems.transform(positivepermissionsresult, getjsapidetail4tinywitht2);
        return positivepermissionsresult;
    }
}
