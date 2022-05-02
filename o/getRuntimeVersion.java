package o;

import com.twilio.verify.TwilioVerifyException;
import com.twilio.verify.models.ChallengeStatus;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0019\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eH\u0002J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0018\u001a\u00020\fH\u0016J*\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001a0\b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001a0\b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0002J\u0010\u0010\u001e\u001a\n \u000f*\u0004\u0018\u00010\f0\fH\u0002J&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0016J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\"\u001a\u00020\fH\u0016J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0%0\b2\u0006\u0010&\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lid/dana/data/twilio/TwilioSdkEntityRepository;", "Lid/dana/domain/twilio/TwilioSdkRepository;", "twilioVerify", "Lcom/twilio/verify/TwilioVerify;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "(Lcom/twilio/verify/TwilioVerify;Lid/dana/data/account/repository/source/AccountEntityDataFactory;)V", "checkEnrollmentStatus", "Lio/reactivex/Single;", "", "checkFactorSid", "factorSid", "", "createAccountData", "Lid/dana/data/account/repository/source/AccountEntityData;", "kotlin.jvm.PlatformType", "createFactor", "serviceSid", "identity", "pushToken", "accessToken", "deleteFactor", "deleteLocalFactor", "getChallenge", "challengeSid", "getChallengeDetails", "", "getChallengeHiddenDetails", "getChallengeStatus", "getFactorSid", "getPhoneNumber", "updateChallenge", "newStatus", "updateFactor", "token", "updatePushToken", "verifyFactor", "", "sid", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getRuntimeVersion implements isPacketDistinct {
    @NotNull
    public static final setMin length = new setMin((byte) 0);
    private final DialogLayout setMax;
    /* access modifiers changed from: private */
    public final RecyclerView$Adapter$StateRestorationPolicy setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<String, setMinDuration<? extends Boolean>> {
        final /* synthetic */ getRuntimeVersion getMax;

        getMax(getRuntimeVersion getruntimeversion) {
            this.getMax = getruntimeversion;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "it");
            return getRuntimeVersion.getMin(this.getMax, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange<T, R> implements RedDotDrawable<String, setMinDuration<? extends Boolean>> {
        final /* synthetic */ getRuntimeVersion getMin;
        final /* synthetic */ String length;

        toDoubleRange(getRuntimeVersion getruntimeversion, String str) {
            this.getMin = getruntimeversion;
            this.length = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "it");
            getRuntimeVersion getruntimeversion = this.getMin;
            String str2 = this.length;
            Intrinsics.checkNotNullParameter(str, "factorSid");
            Intrinsics.checkNotNullParameter(str2, "token");
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new hashCode(getruntimeversion, str, str2));
            Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …nSuccess(false)\n        }");
            return min;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<Throwable, Boolean> {
        public static final toFloatRange setMax = new toFloatRange();

        toFloatRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            return Boolean.FALSE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/account/AccountEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toString<T, R> implements RedDotDrawable<attach, String> {
        public static final toString setMin = new toString();

        toString() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            attach attach = (attach) obj;
            Intrinsics.checkNotNullParameter(attach, "it");
            return attach.getPhoneNumber();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<String, setMinDuration<? extends String>> {
        final /* synthetic */ getRuntimeVersion getMax;
        final /* synthetic */ String setMin;

        IsOverlapping(getRuntimeVersion getruntimeversion, String str) {
            this.getMax = getruntimeversion;
            this.setMin = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "it");
            return getRuntimeVersion.getMin(this.getMax, this.setMin, str);
        }
    }

    @Inject
    public getRuntimeVersion(@Nullable RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy, @NotNull DialogLayout dialogLayout) {
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        this.setMin = recyclerView$Adapter$StateRestorationPolicy;
        this.setMax = dialogLayout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T> implements updateProgress<Boolean> {
        final /* synthetic */ getRuntimeVersion setMin;

        getMin(getRuntimeVersion getruntimeversion) {
            this.setMin = getruntimeversion;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<Boolean> r4) {
            Intrinsics.checkNotNullParameter(r4, "emitter");
            RecyclerView$Adapter$StateRestorationPolicy max = this.setMin.setMin;
            if (max != null) {
                max.length(new Function1<List<? extends getHeight>, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((List<? extends getHeight>) (List) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull List<? extends getHeight> list) {
                        Intrinsics.checkNotNullParameter(list, "it");
                        if (!list.isEmpty()) {
                            r4.onSuccess(Boolean.TRUE);
                        } else {
                            r4.onSuccess(Boolean.FALSE);
                        }
                    }
                }, new Function1<TwilioVerifyException, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TwilioVerifyException) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
                        Intrinsics.checkNotNullParameter(twilioVerifyException, "it");
                        r4.onSuccess(Boolean.FALSE);
                    }
                });
            } else {
                r4.onSuccess(Boolean.FALSE);
            }
        }
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> checkEnrollmentStatus() {
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …nSuccess(false)\n        }");
        return min;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class length<T> implements updateProgress<String> {
        final /* synthetic */ String getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;
        final /* synthetic */ getRuntimeVersion setMin;

        length(getRuntimeVersion getruntimeversion, String str, String str2, String str3, String str4) {
            this.setMin = getruntimeversion;
            this.setMax = str;
            this.length = str2;
            this.getMin = str3;
            this.getMax = str4;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<String> r9) {
            Intrinsics.checkNotNullParameter(r9, "emitter");
            RecyclerView$Adapter$StateRestorationPolicy max = this.setMin.setMin;
            if (max != null) {
                String min = getRuntimeVersion.setMin(this.setMin);
                Intrinsics.checkNotNullExpressionValue(min, "getPhoneNumber()");
                max.length(new getWidthMode(min, this.setMax, this.length, this.getMin, this.getMax), new Function1<getHeight, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((getHeight) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull getHeight getheight) {
                        Intrinsics.checkNotNullParameter(getheight, "it");
                        if (getheight.getMin().length() > 0) {
                            r9.onSuccess(getheight.getMin());
                        } else {
                            r9.onSuccess("");
                        }
                    }
                }, new Function1<TwilioVerifyException, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TwilioVerifyException) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
                        Intrinsics.checkNotNullParameter(twilioVerifyException, "it");
                        r9.onSuccess("");
                    }
                });
                return;
            }
            r9.onSuccess("");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<String> createFactor(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "serviceSid");
        Intrinsics.checkNotNullParameter(str2, "identity");
        Intrinsics.checkNotNullParameter(str3, "pushToken");
        Intrinsics.checkNotNullParameter(str4, "accessToken");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<String> min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new length(this, str, str2, str3, str4));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …r.onSuccess(\"\")\n        }");
        return min;
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<List<String>> verifyFactor(@NotNull String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(1997729318, oncanceled);
            onCancelLoad.getMin(1997729318, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "sid");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<List<String>> min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getRuntimeVersion$Mean$Arithmetic(this, str));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …ss(emptyList())\n        }");
        return min;
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> updateChallenge(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        ChallengeStatus challengeStatus;
        Intrinsics.checkNotNullParameter(str, "factorSid");
        Intrinsics.checkNotNullParameter(str2, "challengeSid");
        Intrinsics.checkNotNullParameter(str3, "newStatus");
        if (Intrinsics.areEqual((Object) str3, (Object) "approved")) {
            challengeStatus = ChallengeStatus.Approved;
        } else {
            challengeStatus = ChallengeStatus.Denied;
        }
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new values(this, new getPaddingBottom(str, str2, challengeStatus)));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …Success(false)\n\n        }");
        return min;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class values<T> implements updateProgress<Boolean> {
        final /* synthetic */ getPaddingBottom length;
        final /* synthetic */ getRuntimeVersion setMin;

        values(getRuntimeVersion getruntimeversion, getPaddingBottom getpaddingbottom) {
            this.setMin = getruntimeversion;
            this.length = getpaddingbottom;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<Boolean> r5) {
            Intrinsics.checkNotNullParameter(r5, "emitter");
            RecyclerView$Adapter$StateRestorationPolicy max = this.setMin.setMin;
            if (max != null) {
                max.setMax(this.length, new Function0<Unit>() {
                    public final void invoke() {
                        r5.onSuccess(Boolean.TRUE);
                    }
                }, new Function1<TwilioVerifyException, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TwilioVerifyException) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
                        Intrinsics.checkNotNullParameter(twilioVerifyException, "it");
                        r5.onSuccess(Boolean.FALSE);
                    }
                });
            } else {
                r5.onSuccess(Boolean.FALSE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T> implements updateProgress<Map<String, ? extends String>> {
        final /* synthetic */ getRuntimeVersion getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ String setMin;

        toIntRange(getRuntimeVersion getruntimeversion, String str, String str2) {
            this.getMax = getruntimeversion;
            this.setMin = str;
            this.getMin = str2;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<Map<String, String>> r6) {
            Intrinsics.checkNotNullParameter(r6, "emitter");
            RecyclerView$Adapter$StateRestorationPolicy max = this.getMax.setMin;
            if (max != null) {
                max.setMax(this.setMin, this.getMin, new Function1<detachAndScrapViewAt, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((detachAndScrapViewAt) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull detachAndScrapViewAt detachandscrapviewat) {
                        Intrinsics.checkNotNullParameter(detachandscrapviewat, "it");
                        Map<String, String> max = detachandscrapviewat.getMax();
                        if (max != null) {
                            r6.onSuccess(max);
                        }
                    }
                }, new Function1<TwilioVerifyException, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TwilioVerifyException) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
                        Intrinsics.checkNotNullParameter(twilioVerifyException, "it");
                        r6.onSuccess(MapsKt.emptyMap());
                    }
                });
            } else {
                r6.onSuccess(MapsKt.emptyMap());
            }
        }
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Map<String, String>> getChallengeHiddenDetails(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "challengeSid");
        Intrinsics.checkNotNullParameter(str2, "factorSid");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Map<String, String>> min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new toIntRange(this, str, str2));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …ccess(mapOf())\n\n        }");
        return min;
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Map<String, String>> getChallengeDetails(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "challengeSid");
        Intrinsics.checkNotNullParameter(str2, "factorSid");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Map<String, String>> min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new isInside(this, str, str2, new LinkedHashMap()));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …ccess(mapOf())\n\n        }");
        return min;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T> implements updateProgress<Map<String, ? extends String>> {
        final /* synthetic */ getRuntimeVersion getMin;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;
        final /* synthetic */ Map setMin;

        isInside(getRuntimeVersion getruntimeversion, String str, String str2, Map map) {
            this.getMin = getruntimeversion;
            this.length = str;
            this.setMax = str2;
            this.setMin = map;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<Map<String, String>> r6) {
            Intrinsics.checkNotNullParameter(r6, "emitter");
            RecyclerView$Adapter$StateRestorationPolicy max = this.getMin.setMin;
            if (max != null) {
                max.setMax(this.length, this.setMax, new Function1<detachAndScrapViewAt, Unit>(this) {
                    final /* synthetic */ isInside this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((detachAndScrapViewAt) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull detachAndScrapViewAt detachandscrapviewat) {
                        Intrinsics.checkNotNullParameter(detachandscrapviewat, "it");
                        for (getHeightMode getheightmode : detachandscrapviewat.getMin().length) {
                            this.this$0.setMin.put(getheightmode.setMin, getheightmode.setMax);
                        }
                        r6.onSuccess(this.this$0.setMin);
                    }
                }, new Function1<TwilioVerifyException, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TwilioVerifyException) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
                        Intrinsics.checkNotNullParameter(twilioVerifyException, "it");
                        r6.onSuccess(MapsKt.emptyMap());
                    }
                });
            } else {
                r6.onSuccess(MapsKt.emptyMap());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements updateProgress<Boolean> {
        final /* synthetic */ getRuntimeVersion setMin;

        setMax(getRuntimeVersion getruntimeversion) {
            this.setMin = getruntimeversion;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<Boolean> r3) {
            Intrinsics.checkNotNullParameter(r3, "emitter");
            RecyclerView$Adapter$StateRestorationPolicy max = this.setMin.setMin;
            if (max != null) {
                max.getMax(new Function0<Unit>() {
                    public final void invoke() {
                        r3.onSuccess(Boolean.TRUE);
                    }
                });
            } else {
                r3.onSuccess(Boolean.FALSE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class hashCode<T> implements updateProgress<Boolean> {
        final /* synthetic */ String getMin;
        final /* synthetic */ getRuntimeVersion length;
        final /* synthetic */ String setMin;

        hashCode(getRuntimeVersion getruntimeversion, String str, String str2) {
            this.length = getruntimeversion;
            this.setMin = str;
            this.getMin = str2;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<Boolean> r5) {
            Intrinsics.checkNotNullParameter(r5, "emitter");
            RecyclerView$Adapter$StateRestorationPolicy max = this.length.setMin;
            if (max != null) {
                max.setMin((getPaddingLeft) new getPaddingRight(this.setMin, this.getMin), (Function1<? super getHeight, Unit>) new Function1<getHeight, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((getHeight) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull getHeight getheight) {
                        Intrinsics.checkNotNullParameter(getheight, "it");
                        r5.onSuccess(Boolean.TRUE);
                    }
                }, (Function1<? super TwilioVerifyException, Unit>) new Function1<TwilioVerifyException, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TwilioVerifyException) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
                        Intrinsics.checkNotNullParameter(twilioVerifyException, "it");
                        r5.onSuccess(Boolean.FALSE);
                    }
                });
            } else {
                r5.onSuccess(Boolean.FALSE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class equals<T> implements updateProgress<String> {
        final /* synthetic */ String getMax;
        final /* synthetic */ getRuntimeVersion length;
        final /* synthetic */ String setMax;

        equals(getRuntimeVersion getruntimeversion, String str, String str2) {
            this.length = getruntimeversion;
            this.setMax = str;
            this.getMax = str2;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<String> r6) {
            Intrinsics.checkNotNullParameter(r6, "emitter");
            RecyclerView$Adapter$StateRestorationPolicy max = this.length.setMin;
            if (max != null) {
                max.setMax(this.setMax, this.getMax, new Function1<detachAndScrapViewAt, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((detachAndScrapViewAt) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull detachAndScrapViewAt detachandscrapviewat) {
                        Intrinsics.checkNotNullParameter(detachandscrapviewat, "it");
                        r6.onSuccess(detachandscrapviewat.length().getValue());
                    }
                }, new Function1<TwilioVerifyException, Unit>() {
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TwilioVerifyException) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TwilioVerifyException twilioVerifyException) {
                        Intrinsics.checkNotNullParameter(twilioVerifyException, "it");
                        r6.onSuccess("");
                    }
                });
            } else {
                r6.onSuccess("");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/twilio/TwilioSdkEntityRepository$Companion;", "", "()V", "APPROVED", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> deleteLocalFactor() {
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getRuntimeVersion$FastBitmap$CoordinateSystem(this));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …r.onSuccess(\"\")\n        }");
        RedDotDrawable getmax = new getMax(this);
        setRefreshAnimation.getMax(getmax, "mapper is null");
        setMinDuration switchtobluetheme = new switchToBlueTheme(min, getmax);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            switchtobluetheme = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, switchtobluetheme);
        }
        RedDotDrawable redDotDrawable2 = toFloatRange.setMax;
        setRefreshAnimation.getMax(redDotDrawable2, "resumeFunction is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> setoptionmenucolor = new setOptionMenuColor<>(switchtobluetheme, redDotDrawable2, null);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable3 = SecuritySignature.toString;
        if (redDotDrawable3 != null) {
            setoptionmenucolor = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, setoptionmenucolor);
        }
        Intrinsics.checkNotNullExpressionValue(setoptionmenucolor, "getFactorSid()\n         … .onErrorReturn { false }");
        return setoptionmenucolor;
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> updatePushToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getRuntimeVersion$FastBitmap$CoordinateSystem(this));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …r.onSuccess(\"\")\n        }");
        RedDotDrawable todoublerange = new toDoubleRange(this, str);
        setRefreshAnimation.getMax(todoublerange, "mapper is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> switchtobluetheme = new switchToBlueTheme<>(min, todoublerange);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            switchtobluetheme = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, switchtobluetheme);
        }
        Intrinsics.checkNotNullExpressionValue(switchtobluetheme, "getFactorSid().flatMap { updateFactor(it, token) }");
        return switchtobluetheme;
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<String> getChallenge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "challengeSid");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getRuntimeVersion$FastBitmap$CoordinateSystem(this));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …r.onSuccess(\"\")\n        }");
        RedDotDrawable isOverlapping = new IsOverlapping(this, str);
        setRefreshAnimation.getMax(isOverlapping, "mapper is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<String> switchtobluetheme = new switchToBlueTheme<>(min, isOverlapping);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            switchtobluetheme = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, switchtobluetheme);
        }
        Intrinsics.checkNotNullExpressionValue(switchtobluetheme, "getFactorSid().flatMap {…tatus(challengeSid, it) }");
        return switchtobluetheme;
    }

    public static final /* synthetic */ String setMin(getRuntimeVersion getruntimeversion) {
        setDrawDivider createData = getruntimeversion.setMax.createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "createAccountData()");
        return (String) createData.getAccount().map(toString.setMin).blockingFirst();
    }

    public static final /* synthetic */ TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 getMin(getRuntimeVersion getruntimeversion, String str) {
        if (str.length() == 0) {
            TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 max = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.getMax(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(max, "Single.just(true)");
            return max;
        }
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new setMax(getruntimeversion));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …nSuccess(false)\n        }");
        return min;
    }

    public static final /* synthetic */ TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 getMin(getRuntimeVersion getruntimeversion, String str, String str2) {
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new equals(getruntimeversion, str, str2));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create { emitter …r.onSuccess(\"\")\n        }");
        return min;
    }
}
