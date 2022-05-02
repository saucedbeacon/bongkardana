package o;

import id.dana.twilio.onboarding.TwilioIntroductionModule;
import kotlin.Metadata;
import o.b;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

public final class TitleBarExtension implements getAdapterPosition<AnonymousClass1.getMin> {
    private final TwilioIntroductionModule setMax;
    private final b.C0007b<showBackHome> setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/twilio/onboarding/TwilioIntroductionContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.TitleBarExtension$1  reason: invalid class name */
    public interface AnonymousClass1 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/twilio/onboarding/TwilioIntroductionContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "consultEnrollmentTwilio", "", "source", "", "submitEnroll", "securityId", "pushToken", "trackTwilioEnrollFailed", "failReason", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.TitleBarExtension$1$getMin */
        public interface getMin extends parentColumns.setMin {
            void getMax(@NotNull String str, @NotNull String str2);

            void getMax(@NotNull String str, @NotNull String str2, @NotNull String str3);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/twilio/onboarding/TwilioIntroductionContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onFailedEnroll", "", "onShowChallenge", "securityId", "", "source", "challenge", "onSubmitEnroll", "onSuccessEnroll", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.TitleBarExtension$1$length */
        public interface length extends parentColumns.getMax {
            void getMax();

            void getMax(@NotNull String str, @NotNull String str2);

            void getMax(@NotNull String str, @NotNull String str2, @NotNull String str3);

            void getMin();
        }
    }

    public final class SegControlCheckCallback implements getAdapterPosition<AnonymousClass1.length> {
        private final TwilioIntroductionModule setMax;

        private SegControlCheckCallback(TwilioIntroductionModule twilioIntroductionModule) {
            this.setMax = twilioIntroductionModule;
        }

        public static SegControlCheckCallback setMin(TwilioIntroductionModule twilioIntroductionModule) {
            return new SegControlCheckCallback(twilioIntroductionModule);
        }

        public final /* synthetic */ Object get() {
            AnonymousClass1.length min = this.setMax.setMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    private TitleBarExtension(TwilioIntroductionModule twilioIntroductionModule, b.C0007b<showBackHome> bVar) {
        this.setMax = twilioIntroductionModule;
        this.setMin = bVar;
    }

    public static TitleBarExtension setMax(TwilioIntroductionModule twilioIntroductionModule, b.C0007b<showBackHome> bVar) {
        return new TitleBarExtension(twilioIntroductionModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AnonymousClass1.getMin length = this.setMax.length(this.setMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
