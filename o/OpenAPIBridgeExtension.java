package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class OpenAPIBridgeExtension extends parseFailed<AnonymousClass2, getMin> {
    private GriverSwtich referralRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lid/dana/domain/referral/model/ReferralEngagementDialogConfig;", "", "enable", "", "dialogTitleId", "", "dialogTitleEn", "dialogDescriptionId", "dialogDescriptionEn", "timerDuration", "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getDialogDescriptionEn", "()Ljava/lang/String;", "getDialogDescriptionId", "getDialogTitleEn", "getDialogTitleId", "getEnable", "()Z", "getTimerDuration", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.OpenAPIBridgeExtension$1  reason: invalid class name */
    public final class AnonymousClass1 {
        @NotNull
        private final String dialogDescriptionEn;
        @NotNull
        private final String dialogDescriptionId;
        @NotNull
        private final String dialogTitleEn;
        @NotNull
        private final String dialogTitleId;
        private final boolean enable;
        private final long timerDuration;

        /* renamed from: o.OpenAPIBridgeExtension$1$1  reason: invalid class name and collision with other inner class name */
        public interface C00041 {
            TitleBarRightButtonView.AnonymousClass1<ScanBridgeExtension> getReferralHomeConfig();

            TitleBarRightButtonView.AnonymousClass1<ScanBridgeExtension> getReferralSendMoneyConfig();
        }

        public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r5, boolean z, String str, String str2, String str3, String str4, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                z = r5.enable;
            }
            if ((i & 2) != 0) {
                str = r5.dialogTitleId;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = r5.dialogTitleEn;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = r5.dialogDescriptionId;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = r5.dialogDescriptionEn;
            }
            String str8 = str4;
            if ((i & 32) != 0) {
                j = r5.timerDuration;
            }
            return r5.copy(z, str5, str6, str7, str8, j);
        }

        public final boolean component1() {
            return this.enable;
        }

        @NotNull
        public final String component2() {
            return this.dialogTitleId;
        }

        @NotNull
        public final String component3() {
            return this.dialogTitleEn;
        }

        @NotNull
        public final String component4() {
            return this.dialogDescriptionId;
        }

        @NotNull
        public final String component5() {
            return this.dialogDescriptionEn;
        }

        public final long component6() {
            return this.timerDuration;
        }

        @NotNull
        public final AnonymousClass1 copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
            Intrinsics.checkNotNullParameter(str, "dialogTitleId");
            Intrinsics.checkNotNullParameter(str2, "dialogTitleEn");
            Intrinsics.checkNotNullParameter(str3, "dialogDescriptionId");
            Intrinsics.checkNotNullParameter(str4, "dialogDescriptionEn");
            return new AnonymousClass1(z, str, str2, str3, str4, j);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass1)) {
                return false;
            }
            AnonymousClass1 r5 = (AnonymousClass1) obj;
            return this.enable == r5.enable && Intrinsics.areEqual((Object) this.dialogTitleId, (Object) r5.dialogTitleId) && Intrinsics.areEqual((Object) this.dialogTitleEn, (Object) r5.dialogTitleEn) && Intrinsics.areEqual((Object) this.dialogDescriptionId, (Object) r5.dialogDescriptionId) && Intrinsics.areEqual((Object) this.dialogDescriptionEn, (Object) r5.dialogDescriptionEn) && this.timerDuration == r5.timerDuration;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ReferralEngagementDialogConfig(enable=");
            sb.append(this.enable);
            sb.append(", dialogTitleId=");
            sb.append(this.dialogTitleId);
            sb.append(", dialogTitleEn=");
            sb.append(this.dialogTitleEn);
            sb.append(", dialogDescriptionId=");
            sb.append(this.dialogDescriptionId);
            sb.append(", dialogDescriptionEn=");
            sb.append(this.dialogDescriptionEn);
            sb.append(", timerDuration=");
            sb.append(this.timerDuration);
            sb.append(")");
            return sb.toString();
        }

        {
            Intrinsics.checkNotNullParameter(r3, "dialogTitleId");
            Intrinsics.checkNotNullParameter(r4, "dialogTitleEn");
            Intrinsics.checkNotNullParameter(r5, "dialogDescriptionId");
            Intrinsics.checkNotNullParameter(r6, "dialogDescriptionEn");
            this.enable = r2;
            this.dialogTitleId = r3;
            this.dialogTitleEn = r4;
            this.dialogDescriptionId = r5;
            this.dialogDescriptionEn = r6;
            this.timerDuration = r7;
        }

        @NotNull
        public final String getDialogTitleId() {
            return this.dialogTitleId;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        @NotNull
        public final String getDialogTitleEn() {
            return this.dialogTitleEn;
        }

        @NotNull
        public final String getDialogDescriptionId() {
            return this.dialogDescriptionId;
        }

        @NotNull
        public final String getDialogDescriptionEn() {
            return this.dialogDescriptionEn;
        }

        public final long getTimerDuration() {
            return this.timerDuration;
        }

        public final int hashCode() {
            boolean z = this.enable;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.dialogTitleId;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.dialogTitleEn;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.dialogDescriptionId;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.dialogDescriptionEn;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return ((hashCode3 + i2) * 31) + Long.valueOf(this.timerDuration).hashCode();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lid/dana/domain/referral/model/ReferralEngagementDialogCache;", "", "scenario", "", "showHomeReferralPopup", "", "showPopUpTimerSeed", "", "(Ljava/lang/String;ZJ)V", "getScenario", "()Ljava/lang/String;", "getShowHomeReferralPopup", "()Z", "getShowPopUpTimerSeed", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.OpenAPIBridgeExtension$3  reason: invalid class name */
    public final class AnonymousClass3 {
        @NotNull
        private final String scenario;
        private final boolean showHomeReferralPopup;
        private final long showPopUpTimerSeed;

        public static /* synthetic */ AnonymousClass3 copy$default(AnonymousClass3 r0, String str, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.scenario;
            }
            if ((i & 2) != 0) {
                z = r0.showHomeReferralPopup;
            }
            if ((i & 4) != 0) {
                j = r0.showPopUpTimerSeed;
            }
            return r0.copy(str, z, j);
        }

        @NotNull
        public final String component1() {
            return this.scenario;
        }

        public final boolean component2() {
            return this.showHomeReferralPopup;
        }

        public final long component3() {
            return this.showPopUpTimerSeed;
        }

        @NotNull
        public final AnonymousClass3 copy(@NotNull String str, boolean z, long j) {
            Intrinsics.checkNotNullParameter(str, "scenario");
            return new AnonymousClass3(str, z, j);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass3)) {
                return false;
            }
            AnonymousClass3 r5 = (AnonymousClass3) obj;
            return Intrinsics.areEqual((Object) this.scenario, (Object) r5.scenario) && this.showHomeReferralPopup == r5.showHomeReferralPopup && this.showPopUpTimerSeed == r5.showPopUpTimerSeed;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ReferralEngagementDialogCache(scenario=");
            sb.append(this.scenario);
            sb.append(", showHomeReferralPopup=");
            sb.append(this.showHomeReferralPopup);
            sb.append(", showPopUpTimerSeed=");
            sb.append(this.showPopUpTimerSeed);
            sb.append(")");
            return sb.toString();
        }

        {
            Intrinsics.checkNotNullParameter(r2, "scenario");
            this.scenario = r2;
            this.showHomeReferralPopup = r3;
            this.showPopUpTimerSeed = r4;
        }

        @NotNull
        public final String getScenario() {
            return this.scenario;
        }

        public final boolean getShowHomeReferralPopup() {
            return this.showHomeReferralPopup;
        }

        public final long getShowPopUpTimerSeed() {
            return this.showPopUpTimerSeed;
        }

        public final int hashCode() {
            String str = this.scenario;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.showHomeReferralPopup;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + Long.valueOf(this.showPopUpTimerSeed).hashCode();
        }
    }

    @Inject
    public OpenAPIBridgeExtension(appxLoadFailed appxloadfailed, getScheme getscheme, GriverSwtich griverSwtich) {
        super(appxloadfailed, getscheme);
        this.referralRepository = griverSwtich;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<AnonymousClass2> buildUseCaseObservable(getMin getmin) {
        return this.referralRepository.verify(getmin.referralCode);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public String referralCode;

        private getMin(String str) {
            this.referralCode = str;
        }

        public static getMin forReferralVerify(String str) {
            return new getMin(str);
        }
    }
}
