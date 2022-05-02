package o;

import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.models.ChallengeStatus;
import id.dana.domain.foundation.logger.PerformanceConstant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import o.onChanged;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ@\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010H\u0016JT\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0002J@\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/twilio/verify/domain/challenge/ChallengeRepository;", "Lcom/twilio/verify/domain/challenge/ChallengeProvider;", "apiClient", "Lcom/twilio/verify/api/ChallengeAPIClient;", "challengeMapper", "Lcom/twilio/verify/domain/challenge/ChallengeMapper;", "challengeListMapper", "Lcom/twilio/verify/domain/challenge/ChallengeListMapper;", "(Lcom/twilio/verify/api/ChallengeAPIClient;Lcom/twilio/verify/domain/challenge/ChallengeMapper;Lcom/twilio/verify/domain/challenge/ChallengeListMapper;)V", "get", "", "sid", "", "factor", "Lcom/twilio/verify/models/Factor;", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/models/Challenge;", "error", "Lcom/twilio/verify/TwilioVerifyException;", "getAll", "status", "Lcom/twilio/verify/models/ChallengeStatus;", "pageSize", "", "pageToken", "Lcom/twilio/verify/models/ChallengeList;", "toFactorChallenge", "Lcom/twilio/verify/domain/challenge/models/FactorChallenge;", "challenge", "update", "authPayload", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class dispatchAttachedToWindow implements isItemPrefetchEnabled {
    /* access modifiers changed from: private */
    public final setAutoMeasureEnabled getMin;
    private final setItemPrefetchEnabled length;
    private final onChanged setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"toChallenge", "", "response", "Lorg/json/JSONObject;", "signatureFieldsHeader", "", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMin extends Lambda implements Function2<JSONObject, String, Unit> {
        final /* synthetic */ Function1 $error;
        final /* synthetic */ getHeight $factor;
        final /* synthetic */ Function1 $success;
        final /* synthetic */ dispatchAttachedToWindow this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(dispatchAttachedToWindow dispatchattachedtowindow, getHeight getheight, Function1 function1, Function1 function12) {
            super(2);
            this.this$0 = dispatchattachedtowindow;
            this.$factor = getheight;
            this.$success = function1;
            this.$error = function12;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((JSONObject) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull JSONObject jSONObject, @Nullable String str) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "response");
            try {
                setAutoMeasureEnabled unused = this.this$0.getMin;
                detachAndScrapViewAt max = setAutoMeasureEnabled.setMax(jSONObject, str);
                if (!(!Intrinsics.areEqual((Object) max.setMax(), (Object) this.$factor.getMin()))) {
                    dispatchAttachedToWindow.length(max).getMax = this.$factor;
                    this.$success.invoke(max);
                    return;
                }
                throw new TwilioVerifyException(new IllegalArgumentException("Wrong factor for challenge"), TwilioVerifyException.ErrorCode.InputError);
            } catch (TwilioVerifyException e) {
                this.$error.invoke(e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0017\u0010\u0007\u001a\u0013\u0018\u00010\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "p1", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "response", "p2", "", "signatureFieldsHeader", "invoke"}, k = 3, mv = {1, 1, 16})
    static final /* synthetic */ class length extends FunctionReference implements Function2<JSONObject, String, Unit> {
        final /* synthetic */ getMin $toChallenge$1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getMin getmin) {
            super(2);
            this.$toChallenge$1 = getmin;
        }

        public final String getName() {
            return "toChallenge";
        }

        public final KDeclarationContainer getOwner() {
            return null;
        }

        public final String getSignature() {
            return "invoke(Lorg/json/JSONObject;Ljava/lang/String;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((JSONObject) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull JSONObject jSONObject, @Nullable String str) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "p1");
            this.$toChallenge$1.invoke(jSONObject, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"getChallenge", "", "factorChallenge", "Lcom/twilio/verify/domain/challenge/models/FactorChallenge;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMin extends Lambda implements Function1<isSmoothScrolling, Unit> {
        final /* synthetic */ Function1 $error;
        final /* synthetic */ Function1 $success;
        final /* synthetic */ dispatchAttachedToWindow this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(dispatchAttachedToWindow dispatchattachedtowindow, Function1 function1, Function1 function12) {
            super(1);
            this.this$0 = dispatchattachedtowindow;
            this.$success = function1;
            this.$error = function12;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((isSmoothScrolling) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull isSmoothScrolling issmoothscrolling) {
            Intrinsics.checkParameterIsNotNull(issmoothscrolling, "factorChallenge");
            getHeight getheight = issmoothscrolling.getMax;
            if (getheight != null) {
                this.this$0.getMin(issmoothscrolling.getMin, getheight, this.$success, this.$error);
            } else {
                this.$error.invoke(new TwilioVerifyException(new IllegalArgumentException("Invalid factor"), TwilioVerifyException.ErrorCode.InputError));
            }
        }
    }

    private dispatchAttachedToWindow(@NotNull onChanged onchanged, @NotNull setAutoMeasureEnabled setautomeasureenabled, @NotNull setItemPrefetchEnabled setitemprefetchenabled) {
        Intrinsics.checkParameterIsNotNull(onchanged, "apiClient");
        Intrinsics.checkParameterIsNotNull(setautomeasureenabled, "challengeMapper");
        Intrinsics.checkParameterIsNotNull(setitemprefetchenabled, "challengeListMapper");
        this.setMin = onchanged;
        this.getMin = setautomeasureenabled;
        this.length = setitemprefetchenabled;
    }

    public /* synthetic */ dispatchAttachedToWindow(onChanged onchanged) {
        this(onchanged, new setAutoMeasureEnabled(), new setItemPrefetchEnabled((byte) 0));
    }

    public final void getMin(@NotNull String str, @NotNull getHeight getheight, @NotNull Function1<? super detachAndScrapViewAt, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "sid");
        Intrinsics.checkParameterIsNotNull(getheight, "factor");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        getMin getmin = new getMin(this, getheight, function1, function12);
        onChanged onchanged = this.setMin;
        Function2 length2 = new length(getmin);
        Intrinsics.checkParameterIsNotNull(str, "sid");
        Intrinsics.checkParameterIsNotNull(getheight, "factor");
        Intrinsics.checkParameterIsNotNull(length2, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        onChanged.getMin.invoke$default(new onChanged.getMin(onchanged, getheight, str, length2, function12), 0, 1, (Object) null);
    }

    public final void getMax(@NotNull detachAndScrapViewAt detachandscrapviewat, @NotNull String str, @NotNull Function1<? super detachAndScrapViewAt, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
        String str2 = str;
        Function1<? super detachAndScrapViewAt, Unit> function13 = function1;
        Function1<? super TwilioVerifyException, Unit> function14 = function12;
        Intrinsics.checkParameterIsNotNull(detachandscrapviewat, PerformanceConstant.PAGE_CHALLENGE);
        Intrinsics.checkParameterIsNotNull(str2, "authPayload");
        Intrinsics.checkParameterIsNotNull(function13, "success");
        Intrinsics.checkParameterIsNotNull(function14, "error");
        setMin setmin = new setMin(this, function13, function14);
        try {
            if (detachandscrapviewat.length() == ChallengeStatus.Pending) {
                isSmoothScrolling length2 = length(detachandscrapviewat);
                onChanged onchanged = this.setMin;
                Function0 setmax = new setMax(length2, this, str, setmin, function12);
                Intrinsics.checkParameterIsNotNull(length2, PerformanceConstant.PAGE_CHALLENGE);
                Intrinsics.checkParameterIsNotNull(str2, "authPayload");
                Intrinsics.checkParameterIsNotNull(setmax, "success");
                Intrinsics.checkParameterIsNotNull(function14, "error");
                onChanged.getMax.invoke$default(new onChanged.getMax(onchanged, length2, str, setmax, function12), 0, 1, (Object) null);
                return;
            }
            throw new TwilioVerifyException(new IllegalArgumentException("Responded or expired challenge can not be updated"), TwilioVerifyException.ErrorCode.InputError);
        } catch (TwilioVerifyException e) {
            function14.invoke(e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/twilio/verify/domain/challenge/ChallengeRepository$update$2$1"}, k = 3, mv = {1, 1, 16})
    static final class setMax extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $authPayload$inlined;
        final /* synthetic */ Function1 $error$inlined;
        final /* synthetic */ isSmoothScrolling $factorChallenge;
        final /* synthetic */ setMin $getChallenge$1$inlined;
        final /* synthetic */ dispatchAttachedToWindow this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(isSmoothScrolling issmoothscrolling, dispatchAttachedToWindow dispatchattachedtowindow, String str, setMin setmin, Function1 function1) {
            super(0);
            this.$factorChallenge = issmoothscrolling;
            this.this$0 = dispatchattachedtowindow;
            this.$authPayload$inlined = str;
            this.$getChallenge$1$inlined = setmin;
            this.$error$inlined = function1;
        }

        public final void invoke() {
            this.$getChallenge$1$inlined.invoke(this.$factorChallenge);
        }
    }

    /* access modifiers changed from: private */
    public static isSmoothScrolling length(detachAndScrapViewAt detachandscrapviewat) {
        if (!(detachandscrapviewat instanceof isSmoothScrolling)) {
            detachandscrapviewat = null;
        }
        isSmoothScrolling issmoothscrolling = (isSmoothScrolling) detachandscrapviewat;
        if (issmoothscrolling != null) {
            return issmoothscrolling;
        }
        throw new TwilioVerifyException(new IllegalArgumentException("Invalid challenge"), TwilioVerifyException.ErrorCode.InputError);
    }
}
