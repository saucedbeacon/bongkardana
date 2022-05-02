package o;

import id.dana.di.PerActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.Constants;
import o.MemoryWarningBridgeExtension;
import o.WheelView;
import o.setFullScreen;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/onboarding/referral/ReferralDialogPresenter;", "Lid/dana/onboarding/referral/ReferralDialogContract$Presenter;", "view", "Lid/dana/onboarding/referral/ReferralDialogContract$View;", "getReferralEngagementDialog", "Lid/dana/domain/referral/interactor/GetReferralEngagementDialog;", "saveReferralEngagementDialogCache", "Lid/dana/domain/referral/interactor/SaveReferralEngagementDialogCache;", "(Lid/dana/onboarding/referral/ReferralDialogContract$View;Lid/dana/domain/referral/interactor/GetReferralEngagementDialog;Lid/dana/domain/referral/interactor/SaveReferralEngagementDialogCache;)V", "getDialog", "", "currentUnixEpochTime", "", "onDestroy", "scenario", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class isSystemRoot implements MemoryWarningBridgeExtension.AnonymousClass1.setMax {
    private final Constants getMax;
    /* access modifiers changed from: private */
    public final MemoryWarningBridgeExtension.AnonymousClass1.getMin getMin;
    private final setFullScreen length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/referral/model/ReferralEngagementDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<getComponentAuth, Unit> {
        final /* synthetic */ isSystemRoot this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(isSystemRoot issystemroot) {
            super(1);
            this.this$0 = issystemroot;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getComponentAuth) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getComponentAuth getcomponentauth) {
            Intrinsics.checkNotNullParameter(getcomponentauth, "it");
            MemoryWarningBridgeExtension.AnonymousClass1.getMin max = this.this$0.getMin;
            Intrinsics.checkNotNullParameter(getcomponentauth, "$this$toReferralEngagementDialogModel");
            max.setMax(new vibrateLong(getcomponentauth.getShowDialog(), WheelView.OnWheelViewListener.getMin() ? getcomponentauth.getDialogTitleId() : getcomponentauth.getDialogTitleEn(), WheelView.OnWheelViewListener.getMin() ? getcomponentauth.getDialogDescriptionId() : getcomponentauth.getDialogDescriptionEn(), getcomponentauth.getTimerDuration(), getcomponentauth.getScenario()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Boolean, Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            String simpleName = SendUPDMessageExtension.class.getSimpleName();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            LocationBridgeExtension.setMin(simpleName, message, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ isSystemRoot this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(isSystemRoot issystemroot) {
            super(1);
            this.this$0 = issystemroot;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            String simpleName = SendUPDMessageExtension.class.getSimpleName();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            LocationBridgeExtension.setMin(simpleName, message, th);
            this.this$0.getMin.getMax();
        }
    }

    @Inject
    public isSystemRoot(@NotNull MemoryWarningBridgeExtension.AnonymousClass1.getMin getmin, @NotNull setFullScreen setfullscreen, @NotNull Constants constants) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(setfullscreen, "getReferralEngagementDialog");
        Intrinsics.checkNotNullParameter(constants, "saveReferralEngagementDialogCache");
        this.getMin = getmin;
        this.length = setfullscreen;
        this.getMax = constants;
    }

    public final void length(long j) {
        this.length.execute(new setFullScreen.length(j), new getMax(this), new setMin(this));
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "scenario");
        this.getMax.execute(new Constants.getMax(str, false, 0), length.INSTANCE, setMax.INSTANCE);
    }

    public final void setMax() {
        this.length.dispose();
        this.getMax.dispose();
    }
}
