package o;

import android.content.Context;
import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.models.ChallengeStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.removeCallbacks;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000eJ>\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000eJ0\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000eJ:\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/twilio/verify/domain/challenge/ChallengeFacade;", "", "pushChallengeProcessor", "Lcom/twilio/verify/domain/challenge/PushChallengeProcessor;", "factorFacade", "Lcom/twilio/verify/domain/factor/FactorFacade;", "repository", "Lcom/twilio/verify/domain/challenge/ChallengeProvider;", "(Lcom/twilio/verify/domain/challenge/PushChallengeProcessor;Lcom/twilio/verify/domain/factor/FactorFacade;Lcom/twilio/verify/domain/challenge/ChallengeProvider;)V", "getAllChallenges", "", "challengeListPayload", "Lcom/twilio/verify/models/ChallengeListPayload;", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/models/ChallengeList;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "getChallenge", "sid", "", "factorSid", "Lcom/twilio/verify/models/Challenge;", "updateChallenge", "updateChallengePayload", "Lcom/twilio/verify/models/UpdateChallengePayload;", "Lkotlin/Function0;", "updatePushChallenge", "factor", "Lcom/twilio/verify/domain/factor/models/PushFactor;", "Builder", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class dispatchDetachedFromWindow {
    private final isItemPrefetchEnabled length;
    /* access modifiers changed from: private */
    public final removeCallbacks setMax;
    /* access modifiers changed from: private */
    public final postOnAnimation setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/twilio/verify/domain/challenge/ChallengeFacade$Builder;", "", "()V", "appContext", "Landroid/content/Context;", "authentication", "Lcom/twilio/verify/networking/Authentication;", "factorProvider", "Lcom/twilio/verify/domain/factor/FactorFacade;", "generator", "Lcom/twilio/verify/data/jwt/JwtGenerator;", "networking", "Lcom/twilio/verify/networking/NetworkProvider;", "url", "", "baseUrl", "build", "Lcom/twilio/verify/domain/challenge/ChallengeFacade;", "context", "factorFacade", "jwtGenerator", "networkProvider", "setAuthentication", "verify_release"}, k = 1, mv = {1, 1, 16})
    public static final class setMax {
        public ignoreView equals;
        public postOnAnimation getMax;
        public setMeasuredDimension getMin;
        public shouldReMeasureChild length;
        public Context setMax;
        public String setMin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "onSuccess", "Lkotlin/Function0;", "Lcom/twilio/verify/threading/SafeSuccess;", "onError", "Lkotlin/Function1;", "Lcom/twilio/verify/TwilioVerifyException;", "Lcom/twilio/verify/threading/SafeError;", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class getMax extends Lambda implements Function2<Function0<? extends Unit>, Function1<? super TwilioVerifyException, ? extends Unit>, Unit> {
        final /* synthetic */ getWidth $updateChallengePayload;
        final /* synthetic */ dispatchDetachedFromWindow this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(dispatchDetachedFromWindow dispatchdetachedfromwindow, getWidth getwidth) {
            super(2);
            this.this$0 = dispatchdetachedfromwindow;
            this.$updateChallengePayload = getwidth;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Function0<Unit>) (Function0) obj, (Function1<? super TwilioVerifyException, Unit>) (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull final Function0<Unit> function0, @NotNull final Function1<? super TwilioVerifyException, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function0, "onSuccess");
            Intrinsics.checkParameterIsNotNull(function1, "onError");
            this.this$0.setMin.getMin(this.$updateChallengePayload.getMax(), new Function1<getHeight, Unit>(this) {
                final /* synthetic */ getMax this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((getHeight) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull getHeight getheight) {
                    Intrinsics.checkParameterIsNotNull(getheight, "factor");
                    if (getheight instanceof detachView) {
                        dispatchDetachedFromWindow.setMin(this.this$0.this$0, this.this$0.$updateChallengePayload, (detachView) getheight, function0, function1);
                    }
                }
            }, function1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0007`\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "onSuccess", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Challenge;", "Lcom/twilio/verify/threading/SafeSuccessResult;", "onError", "Lcom/twilio/verify/TwilioVerifyException;", "Lcom/twilio/verify/threading/SafeError;", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class length extends Lambda implements Function2<Function1<? super detachAndScrapViewAt, ? extends Unit>, Function1<? super TwilioVerifyException, ? extends Unit>, Unit> {
        final /* synthetic */ String $factorSid;
        final /* synthetic */ String $sid;
        final /* synthetic */ dispatchDetachedFromWindow this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(dispatchDetachedFromWindow dispatchdetachedfromwindow, String str, String str2) {
            super(2);
            this.this$0 = dispatchdetachedfromwindow;
            this.$factorSid = str;
            this.$sid = str2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Function1<? super detachAndScrapViewAt, Unit>) (Function1) obj, (Function1<? super TwilioVerifyException, Unit>) (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull final Function1<? super detachAndScrapViewAt, Unit> function1, @NotNull final Function1<? super TwilioVerifyException, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            Intrinsics.checkParameterIsNotNull(function12, "onError");
            this.this$0.setMin.getMin(this.$factorSid, new Function1<getHeight, Unit>(this) {
                final /* synthetic */ length this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((getHeight) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull getHeight getheight) {
                    Intrinsics.checkParameterIsNotNull(getheight, "factor");
                    if (getheight instanceof detachView) {
                        this.this$0.this$0.setMax.setMax(this.this$0.$sid, (detachView) getheight, function1, function12);
                    }
                }
            }, function12);
        }
    }

    public dispatchDetachedFromWindow(@NotNull removeCallbacks removecallbacks, @NotNull postOnAnimation postonanimation, @NotNull isItemPrefetchEnabled isitemprefetchenabled) {
        Intrinsics.checkParameterIsNotNull(removecallbacks, "pushChallengeProcessor");
        Intrinsics.checkParameterIsNotNull(postonanimation, "factorFacade");
        Intrinsics.checkParameterIsNotNull(isitemprefetchenabled, "repository");
        this.setMax = removecallbacks;
        this.setMin = postonanimation;
        this.length = isitemprefetchenabled;
    }

    public static final /* synthetic */ void setMin(dispatchDetachedFromWindow dispatchdetachedfromwindow, getWidth getwidth, detachView detachview, Function0 function0, Function1 function1) {
        ChallengeStatus challengeStatus;
        try {
            getPaddingBottom getpaddingbottom = (getPaddingBottom) (!(getwidth instanceof getPaddingBottom) ? null : getwidth);
            if (getpaddingbottom == null || (challengeStatus = getpaddingbottom.setMax) == null) {
                StringBuilder sb = new StringBuilder("Invalid update challenge input for factor ");
                sb.append(detachview.setMax);
                throw new TwilioVerifyException(new IllegalArgumentException(sb.toString()), TwilioVerifyException.ErrorCode.InputError);
            }
            removeCallbacks removecallbacks = dispatchdetachedfromwindow.setMax;
            String min = getwidth.setMin();
            Intrinsics.checkParameterIsNotNull(min, "sid");
            Intrinsics.checkParameterIsNotNull(detachview, "factor");
            Intrinsics.checkParameterIsNotNull(challengeStatus, "status");
            Intrinsics.checkParameterIsNotNull(function0, "success");
            Intrinsics.checkParameterIsNotNull(function1, "error");
            removecallbacks.setMax(min, detachview, new removeCallbacks.getMax(new removeCallbacks.setMax(removecallbacks, detachview, challengeStatus, function0, function1)), function1);
        } catch (TwilioVerifyException e) {
            function1.invoke(e);
        }
    }
}
