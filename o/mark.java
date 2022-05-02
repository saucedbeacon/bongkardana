package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import kotlin.Metadata;
import o.NetworkStream;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lid/dana/data/twilio/repository/source/network/VerifyPushFacade;", "", "bindEnrollment", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushBindEnrollmentResult;", "request", "Lid/dana/data/twilio/repository/source/network/request/VerifyPushBindEnrollmentRequest;", "consult", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushConsultResult;", "Lid/dana/data/twilio/repository/source/network/request/VerifyPushConsultRequest;", "register", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushEnrollResult;", "Lid/dana/data/twilio/repository/source/network/request/VerifyPushEnrollRequest;", "requestChallenge", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushRequestChallengeResult;", "Lid/dana/data/twilio/repository/source/network/request/VerifyPushRequestChallengeRequest;", "unregister", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushDerollResult;", "Lid/dana/data/twilio/repository/source/network/request/VerifyPushDerollRequest;", "verifySecurityProduct", "Lid/dana/data/twilio/repository/source/network/result/VerifySecurityProductResult;", "Lid/dana/data/twilio/repository/source/network/request/VerifySecurityProductRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface mark {
    @OperationType("alipayplus.mobilewallet.user.verifypush.bindEnrollment")
    @NotNull
    @SignCheck
    getBelongsPackage bindEnrollment(@NotNull NetworkStream.Listener listener);

    @OperationType("alipayplus.mobilewallet.user.verifypush.consult")
    @NotNull
    @SignCheck
    OnlineResource consult(@NotNull OfflineResource offlineResource);

    @OperationType("alipayplus.mobilewallet.user.verifypush.register")
    @NotNull
    @SignCheck
    teardown register(@NotNull onInputException oninputexception);

    @OperationType("alipayplus.mobilewallet.user.verifypush.requestChallenge")
    @NotNull
    @SignCheck
    setBelongsPackage requestChallenge(@NotNull onInputClose oninputclose);

    @OperationType("alipayplus.mobilewallet.user.verifypush.unregister")
    @NotNull
    @SignCheck
    ResourcePackage unregister(@NotNull onInputOpen oninputopen);

    @OperationType("alipayplus.mobilewallet.product.security.verify")
    @NotNull
    @SignCheck
    needWaitForSetup verifySecurityProduct(@NotNull onResourceError onresourceerror);
}
