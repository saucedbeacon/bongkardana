package o;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/twilio/interactor/GetTwilioChallengeDetails;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "", "Lid/dana/domain/twilio/interactor/GetTwilioChallengeDetails$Param;", "twilioSdkRepository", "Lid/dana/domain/twilio/TwilioSdkRepository;", "(Lid/dana/domain/twilio/TwilioSdkRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setBeacons extends APWebChromeClient<Map<String, ? extends String>, getMin> {
    private final isPacketDistinct twilioSdkRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setBeacons(@NotNull isPacketDistinct ispacketdistinct) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ispacketdistinct, "twilioSdkRepository");
        this.twilioSdkRepository = ispacketdistinct;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, String>> buildUseCase(@NotNull getMin getmin) {
        TitleBarRightButtonView.AnonymousClass1<Map<String, String>> r3;
        Intrinsics.checkNotNullParameter(getmin, "params");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Map<String, String>> challengeDetails = this.twilioSdkRepository.getChallengeDetails(getmin.getChallengeSid(), getmin.getFactorSid());
        if (challengeDetails instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) challengeDetails).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(challengeDetails);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        Intrinsics.checkNotNullExpressionValue(r3, "twilioSdkRepository.getC…          .toObservable()");
        return r3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/twilio/interactor/GetTwilioChallengeDetails$Param;", "", "challengeSid", "", "factorSid", "(Ljava/lang/String;Ljava/lang/String;)V", "getChallengeSid", "()Ljava/lang/String;", "getFactorSid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        private final String challengeSid;
        @NotNull
        private final String factorSid;

        public static /* synthetic */ getMin copy$default(getMin getmin, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmin.challengeSid;
            }
            if ((i & 2) != 0) {
                str2 = getmin.factorSid;
            }
            return getmin.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.challengeSid;
        }

        @NotNull
        public final String component2() {
            return this.factorSid;
        }

        @NotNull
        public final getMin copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "challengeSid");
            Intrinsics.checkNotNullParameter(str2, "factorSid");
            return new getMin(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Intrinsics.areEqual((Object) this.challengeSid, (Object) getmin.challengeSid) && Intrinsics.areEqual((Object) this.factorSid, (Object) getmin.factorSid);
        }

        public final int hashCode() {
            String str = this.challengeSid;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.factorSid;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(challengeSid=");
            sb.append(this.challengeSid);
            sb.append(", factorSid=");
            sb.append(this.factorSid);
            sb.append(")");
            return sb.toString();
        }

        public getMin(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "challengeSid");
            Intrinsics.checkNotNullParameter(str2, "factorSid");
            this.challengeSid = str;
            this.factorSid = str2;
        }

        @NotNull
        public final String getChallengeSid() {
            return this.challengeSid;
        }

        @NotNull
        public final String getFactorSid() {
            return this.factorSid;
        }
    }
}
