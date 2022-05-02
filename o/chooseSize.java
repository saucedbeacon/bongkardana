package o;

import com.twilio.verify.TwilioVerifyException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchDetachedFromWindow;
import o.postOnAnimation;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J8\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0011H\u0016J2\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0011H\u0016J8\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0011H\u0016J6\u0010\u001c\u001a\u00020\n2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001d\u0012\u0004\u0012\u00020\n0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0011H\u0016J@\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0011H\u0016J2\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0011H\u0016J8\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0011H\u0016J8\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020)2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/twilio/verify/domain/TwilioVerifyManager;", "Lcom/twilio/verify/TwilioVerify;", "factorFacade", "Lcom/twilio/verify/domain/factor/FactorFacade;", "challengeFacade", "Lcom/twilio/verify/domain/challenge/ChallengeFacade;", "serviceFacade", "Lcom/twilio/verify/domain/service/ServiceFacade;", "(Lcom/twilio/verify/domain/factor/FactorFacade;Lcom/twilio/verify/domain/challenge/ChallengeFacade;Lcom/twilio/verify/domain/service/ServiceFacade;)V", "clearLocalStorage", "", "then", "Lkotlin/Function0;", "createFactor", "factorPayload", "Lcom/twilio/verify/models/FactorPayload;", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Factor;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "deleteFactor", "factorSid", "", "getAllChallenges", "challengeListPayload", "Lcom/twilio/verify/models/ChallengeListPayload;", "Lcom/twilio/verify/models/ChallengeList;", "getAllFactors", "", "getChallenge", "challengeSid", "Lcom/twilio/verify/models/Challenge;", "updateChallenge", "updateChallengePayload", "Lcom/twilio/verify/models/UpdateChallengePayload;", "updateFactor", "updateFactorPayload", "Lcom/twilio/verify/models/UpdateFactorPayload;", "verifyFactor", "verifyFactorPayload", "Lcom/twilio/verify/models/VerifyFactorPayload;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class chooseSize implements RecyclerView$Adapter$StateRestorationPolicy {
    private final moveView getMax;
    private final dispatchDetachedFromWindow getMin;
    private final postOnAnimation setMin;

    public chooseSize(@NotNull postOnAnimation postonanimation, @NotNull dispatchDetachedFromWindow dispatchdetachedfromwindow, @NotNull moveView moveview) {
        Intrinsics.checkParameterIsNotNull(postonanimation, "factorFacade");
        Intrinsics.checkParameterIsNotNull(dispatchdetachedfromwindow, "challengeFacade");
        Intrinsics.checkParameterIsNotNull(moveview, "serviceFacade");
        this.setMin = postonanimation;
        this.getMin = dispatchdetachedfromwindow;
        this.getMax = moveview;
    }

    public final void length(@NotNull getChildAt getchildat, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(getchildat, "factorPayload");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        postOnAnimation postonanimation = this.setMin;
        Intrinsics.checkParameterIsNotNull(getchildat, "factorPayload");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        getChildMeasureSpec.setMin(function1, function12, new postOnAnimation.getMin(postonanimation, getchildat));
    }

    public final void setMin(@NotNull getPaddingTop getpaddingtop, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(getpaddingtop, "verifyFactorPayload");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        postOnAnimation postonanimation = this.setMin;
        Intrinsics.checkParameterIsNotNull(getpaddingtop, "verifyFactorPayload");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        getChildMeasureSpec.setMin(function1, function12, new postOnAnimation.toIntRange(postonanimation, getpaddingtop));
    }

    public final void setMin(@NotNull getPaddingLeft getpaddingleft, @NotNull Function1<? super getHeight, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(getpaddingleft, "updateFactorPayload");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        postOnAnimation postonanimation = this.setMin;
        Intrinsics.checkParameterIsNotNull(getpaddingleft, "updateFactorPayload");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        getChildMeasureSpec.setMin(function1, function12, new postOnAnimation.length(postonanimation, getpaddingleft));
    }

    public final void length(@NotNull Function1<? super List<? extends getHeight>, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        postOnAnimation postonanimation = this.setMin;
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        try {
            function1.invoke(postonanimation.setMin.setMin());
        } catch (TwilioVerifyException e) {
            function12.invoke(e);
        }
    }

    public final void setMax(@NotNull String str, @NotNull String str2, @NotNull Function1<? super detachAndScrapViewAt, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "challengeSid");
        Intrinsics.checkParameterIsNotNull(str2, "factorSid");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        dispatchDetachedFromWindow dispatchdetachedfromwindow = this.getMin;
        Intrinsics.checkParameterIsNotNull(str, "sid");
        Intrinsics.checkParameterIsNotNull(str2, "factorSid");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        getChildMeasureSpec.setMin(function1, function12, new dispatchDetachedFromWindow.length(dispatchdetachedfromwindow, str2, str));
    }

    public final void setMax(@NotNull getWidth getwidth, @NotNull Function0<Unit> function0, @NotNull Function1<? super TwilioVerifyException, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(getwidth, "updateChallengePayload");
        Intrinsics.checkParameterIsNotNull(function0, "success");
        Intrinsics.checkParameterIsNotNull(function1, "error");
        dispatchDetachedFromWindow dispatchdetachedfromwindow = this.getMin;
        Intrinsics.checkParameterIsNotNull(getwidth, "updateChallengePayload");
        Intrinsics.checkParameterIsNotNull(function0, "success");
        Intrinsics.checkParameterIsNotNull(function1, "error");
        getChildMeasureSpec.setMin(function0, function1, (Function2<? super Function0<Unit>, ? super Function1<? super TwilioVerifyException, Unit>, Unit>) new dispatchDetachedFromWindow.getMax(dispatchdetachedfromwindow, getwidth));
    }

    public final void getMax(@NotNull Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "then");
        postOnAnimation postonanimation = this.setMin;
        Intrinsics.checkParameterIsNotNull(function0, "success");
        getChildMeasureSpec.setMin(function0, (Function1<? super TwilioVerifyException, Unit>) postOnAnimation.setMax.INSTANCE, (Function2<? super Function0<Unit>, ? super Function1<? super TwilioVerifyException, Unit>, Unit>) new postOnAnimation.getMax(postonanimation));
    }
}
