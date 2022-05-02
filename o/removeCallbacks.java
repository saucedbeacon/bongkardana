package o;

import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.models.ChallengeStatus;
import id.dana.domain.foundation.logger.PerformanceConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J>\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0017J@\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/twilio/verify/domain/challenge/PushChallengeProcessor;", "", "challengeProvider", "Lcom/twilio/verify/domain/challenge/ChallengeProvider;", "jwtGenerator", "Lcom/twilio/verify/data/jwt/JwtGenerator;", "(Lcom/twilio/verify/domain/challenge/ChallengeProvider;Lcom/twilio/verify/data/jwt/JwtGenerator;)V", "generateSignature", "", "signatureFields", "", "response", "Lorg/json/JSONObject;", "status", "Lcom/twilio/verify/models/ChallengeStatus;", "signerTemplate", "Lcom/twilio/security/crypto/key/template/SignerTemplate;", "get", "", "sid", "factor", "Lcom/twilio/verify/domain/factor/models/PushFactor;", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Challenge;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "update", "Lkotlin/Function0;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class removeCallbacks {
    /* access modifiers changed from: private */
    public final isItemPrefetchEnabled length;
    private final setMeasuredDimension setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/twilio/verify/models/Challenge;", "Lkotlin/ParameterName;", "name", "challenge", "invoke"}, k = 3, mv = {1, 1, 16})
    static final /* synthetic */ class getMax extends FunctionReference implements Function1<detachAndScrapViewAt, Unit> {
        final /* synthetic */ setMax $updateChallenge$1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(setMax setmax) {
            super(1);
            this.$updateChallenge$1 = setmax;
        }

        public final String getName() {
            return "updateChallenge";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lcom/twilio/verify/models/Challenge;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((detachAndScrapViewAt) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull detachAndScrapViewAt detachandscrapviewat) {
            Intrinsics.checkParameterIsNotNull(detachandscrapviewat, "p1");
            this.$updateChallenge$1.invoke(detachandscrapviewat);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "exception", "Lcom/twilio/verify/TwilioVerifyException;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMin extends Lambda implements Function1<TwilioVerifyException, Unit> {
        final /* synthetic */ Function1 $error;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(Function1 function1) {
            super(1);
            this.$error = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TwilioVerifyException) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
            Intrinsics.checkParameterIsNotNull(twilioVerifyException, "exception");
            this.$error.invoke(twilioVerifyException);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"updateChallenge", "", "challenge", "Lcom/twilio/verify/models/Challenge;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMax extends Lambda implements Function1<detachAndScrapViewAt, Unit> {
        final /* synthetic */ Function1 $error;
        final /* synthetic */ detachView $factor;
        final /* synthetic */ ChallengeStatus $status;
        final /* synthetic */ Function0 $success;
        final /* synthetic */ removeCallbacks this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(removeCallbacks removecallbacks, detachView detachview, ChallengeStatus challengeStatus, Function0 function0, Function1 function1) {
            super(1);
            this.this$0 = removecallbacks;
            this.$factor = detachview;
            this.$status = challengeStatus;
            this.$success = function0;
            this.$error = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((detachAndScrapViewAt) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull detachAndScrapViewAt detachandscrapviewat) {
            String str;
            Intrinsics.checkParameterIsNotNull(detachandscrapviewat, PerformanceConstant.PAGE_CHALLENGE);
            try {
                JSONObject jSONObject = null;
                isSmoothScrolling issmoothscrolling = (isSmoothScrolling) (!(detachandscrapviewat instanceof isSmoothScrolling) ? null : detachandscrapviewat);
                if (issmoothscrolling != null) {
                    if (((isSmoothScrolling) detachandscrapviewat).getMax != null && (((isSmoothScrolling) detachandscrapviewat).getMax instanceof detachView)) {
                        getHeight getheight = ((isSmoothScrolling) detachandscrapviewat).getMax;
                        if (getheight != null) {
                            str = getheight.getMin();
                        } else {
                            str = null;
                        }
                        if (!(!Intrinsics.areEqual((Object) str, (Object) this.$factor.getMin))) {
                            String str2 = this.$factor.length;
                            if (str2 != null) {
                                if (!(!StringsKt.isBlank(str2))) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    List<String> list = issmoothscrolling.length;
                                    if (list != null) {
                                        if (!(!list.isEmpty())) {
                                            list = null;
                                        }
                                        if (list != null) {
                                            JSONObject jSONObject2 = issmoothscrolling.setMax;
                                            if (jSONObject2 != null) {
                                                if (jSONObject2.length() > 0) {
                                                    jSONObject = jSONObject2;
                                                }
                                                if (jSONObject != null) {
                                                    removeCallbacks removecallbacks = this.this$0;
                                                    ChallengeStatus challengeStatus = this.$status;
                                                    Intrinsics.checkParameterIsNotNull(str2, "alias");
                                                    this.this$0.length.getMax(detachandscrapviewat, removecallbacks.getMax(list, jSONObject, challengeStatus, new notifyDataSetChanged(str2, true)), new Function1<detachAndScrapViewAt, Unit>(this) {
                                                        final /* synthetic */ setMax this$0;

                                                        {
                                                            this.this$0 = r1;
                                                        }

                                                        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                            invoke((detachAndScrapViewAt) obj);
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(@NotNull detachAndScrapViewAt detachandscrapviewat) {
                                                            Intrinsics.checkParameterIsNotNull(detachandscrapviewat, "updatedChallenge");
                                                            if (!(detachandscrapviewat.length() == this.this$0.$status)) {
                                                                detachandscrapviewat = null;
                                                            }
                                                            if (detachandscrapviewat != null) {
                                                                this.this$0.$success.invoke();
                                                            } else {
                                                                this.this$0.$error.invoke(new TwilioVerifyException(new IllegalStateException("Challenge was not updated"), TwilioVerifyException.ErrorCode.InputError));
                                                            }
                                                        }
                                                    }, this.$error);
                                                    return;
                                                }
                                            }
                                            throw new TwilioVerifyException(new IllegalStateException("Challenge response not set"), TwilioVerifyException.ErrorCode.InputError);
                                        }
                                    }
                                    throw new TwilioVerifyException(new IllegalStateException("Signature fields not set"), TwilioVerifyException.ErrorCode.InputError);
                                }
                            }
                            throw new TwilioVerifyException(new IllegalStateException("Key pair not set"), TwilioVerifyException.ErrorCode.KeyStorageError);
                        }
                    }
                    throw new TwilioVerifyException(new IllegalArgumentException("Wrong factor for challenge"), TwilioVerifyException.ErrorCode.InputError);
                }
                throw new TwilioVerifyException(new IllegalArgumentException("Invalid challenge"), TwilioVerifyException.ErrorCode.InputError);
            } catch (TwilioVerifyException e) {
                this.$error.invoke(e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "challenge", "Lcom/twilio/verify/models/Challenge;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMin extends Lambda implements Function1<detachAndScrapViewAt, Unit> {
        final /* synthetic */ Function1 $success;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(Function1 function1) {
            super(1);
            this.$success = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((detachAndScrapViewAt) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull detachAndScrapViewAt detachandscrapviewat) {
            Intrinsics.checkParameterIsNotNull(detachandscrapviewat, PerformanceConstant.PAGE_CHALLENGE);
            this.$success.invoke(detachandscrapviewat);
        }
    }

    public removeCallbacks(@NotNull isItemPrefetchEnabled isitemprefetchenabled, @NotNull setMeasuredDimension setmeasureddimension) {
        Intrinsics.checkParameterIsNotNull(isitemprefetchenabled, "challengeProvider");
        Intrinsics.checkParameterIsNotNull(setmeasureddimension, "jwtGenerator");
        this.length = isitemprefetchenabled;
        this.setMax = setmeasureddimension;
    }

    public final void setMax(@NotNull String str, @NotNull detachView detachview, @NotNull Function1<? super detachAndScrapViewAt, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "sid");
        Intrinsics.checkParameterIsNotNull(detachview, "factor");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        this.length.getMin(str, detachview, new setMin(function1), new getMin(function12));
    }

    /* access modifiers changed from: private */
    public final String getMax(List<String> list, JSONObject jSONObject, ChallengeStatus challengeStatus, onDetachedFromRecyclerView ondetachedfromrecyclerview) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (String str : list) {
                jSONObject2.put(str, jSONObject.get(str));
            }
            jSONObject2.put("status", challengeStatus.getValue());
            return this.setMax.getMax(ondetachedfromrecyclerview, new JSONObject(), jSONObject2);
        } catch (Exception e) {
            throw new TwilioVerifyException(e, TwilioVerifyException.ErrorCode.InputError);
        }
    }
}
