package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/twilio/interactor/UpdateTwilioChallenge;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/twilio/interactor/UpdateTwilioChallenge$Param;", "twilioSdkRepository", "Lid/dana/domain/twilio/TwilioSdkRepository;", "(Lid/dana/domain/twilio/TwilioSdkRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setUpdateNotifier extends APWebChromeClient<Boolean, getMin> {
    private final isPacketDistinct twilioSdkRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setUpdateNotifier(@NotNull isPacketDistinct ispacketdistinct) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ispacketdistinct, "twilioSdkRepository");
        this.twilioSdkRepository = ispacketdistinct;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull getMin getmin) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> r4;
        Intrinsics.checkNotNullParameter(getmin, "params");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> updateChallenge = this.twilioSdkRepository.updateChallenge(getmin.getFactorSid(), getmin.getChallengeSid(), getmin.getNewStatus());
        if (updateChallenge instanceof getSecondFloorView) {
            r4 = ((getSecondFloorView) updateChallenge).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(updateChallenge);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r4 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        Intrinsics.checkNotNullExpressionValue(r4, "twilioSdkRepository.upda…newStatus).toObservable()");
        return r4;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/twilio/interactor/UpdateTwilioChallenge$Param;", "", "factorSid", "", "challengeSid", "newStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChallengeSid", "()Ljava/lang/String;", "getFactorSid", "getNewStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        private final String challengeSid;
        @NotNull
        private final String factorSid;
        @NotNull
        private final String newStatus;

        public static /* synthetic */ getMin copy$default(getMin getmin, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmin.factorSid;
            }
            if ((i & 2) != 0) {
                str2 = getmin.challengeSid;
            }
            if ((i & 4) != 0) {
                str3 = getmin.newStatus;
            }
            return getmin.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.factorSid;
        }

        @NotNull
        public final String component2() {
            return this.challengeSid;
        }

        @NotNull
        public final String component3() {
            return this.newStatus;
        }

        @NotNull
        public final getMin copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "factorSid");
            Intrinsics.checkNotNullParameter(str2, "challengeSid");
            Intrinsics.checkNotNullParameter(str3, "newStatus");
            return new getMin(str, str2, str3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Intrinsics.areEqual((Object) this.factorSid, (Object) getmin.factorSid) && Intrinsics.areEqual((Object) this.challengeSid, (Object) getmin.challengeSid) && Intrinsics.areEqual((Object) this.newStatus, (Object) getmin.newStatus);
        }

        public final int hashCode() {
            String str = this.factorSid;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.challengeSid;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.newStatus;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(factorSid=");
            sb.append(this.factorSid);
            sb.append(", challengeSid=");
            sb.append(this.challengeSid);
            sb.append(", newStatus=");
            sb.append(this.newStatus);
            sb.append(")");
            return sb.toString();
        }

        public getMin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "factorSid");
            Intrinsics.checkNotNullParameter(str2, "challengeSid");
            Intrinsics.checkNotNullParameter(str3, "newStatus");
            this.factorSid = str;
            this.challengeSid = str2;
            this.newStatus = str3;
        }

        @NotNull
        public final String getChallengeSid() {
            return this.challengeSid;
        }

        @NotNull
        public final String getFactorSid() {
            return this.factorSid;
        }

        @NotNull
        public final String getNewStatus() {
            return this.newStatus;
        }
    }
}
