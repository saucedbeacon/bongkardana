package o;

import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.getTitleBarRelative;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0002\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000fH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/social/contract/PrivacySettingPresenter;", "Lid/dana/social/contract/PrivacySettingContract$Presenter;", "getShareFeedConsent", "Lid/dana/domain/social/interactor/GetShareFeedConsent;", "setDeviceFeedFeatureSwitch", "Lid/dana/domain/social/SetDeviceFeedFeatureSwitch;", "saveShareFeedConsent", "Lid/dana/domain/social/interactor/SaveShareFeedConsent;", "view", "Lid/dana/social/contract/PrivacySettingContract$View;", "(Lid/dana/domain/social/interactor/GetShareFeedConsent;Lid/dana/domain/social/SetDeviceFeedFeatureSwitch;Lid/dana/domain/social/interactor/SaveShareFeedConsent;Lid/dana/social/contract/PrivacySettingContract$View;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "toggleShareFeedSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "", "observeShareFeedSubject", "onDestroy", "registerShareFeedConsentChange", "consent", "setFeedFeatureSwitch", "active", "toggleShareFeedConsent", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getRightButton implements getTitleBarRelative.setMin {
    @NotNull
    public static final length setMax = new length((byte) 0);
    /* access modifiers changed from: private */
    public final getTitleBarRelative.getMin IsOverlapping;
    private final IComponent<Boolean> getMax;
    private final DistanceCalculator getMin;
    private final IRedDotManager length;
    private final MonitoringStatus setMin;
    private final getBeacons toFloatRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ boolean $consent;
        final /* synthetic */ getRightButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(getRightButton getrightbutton, boolean z) {
            super(1);
            this.this$0 = getrightbutton;
            this.$consent = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            this.this$0.IsOverlapping.dismissProgress();
            this.this$0.IsOverlapping.getMin(this.$consent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ getRightButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(getRightButton getrightbutton) {
            super(1);
            this.this$0 = getrightbutton;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.IsOverlapping.getMax(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ getRightButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getRightButton getrightbutton) {
            super(1);
            this.this$0 = getrightbutton;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            this.this$0.IsOverlapping.getMax(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ boolean $active;
        final /* synthetic */ getRightButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(getRightButton getrightbutton, boolean z) {
            super(1);
            this.this$0 = getrightbutton;
            this.$active = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            this.this$0.IsOverlapping.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ getRightButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(getRightButton getrightbutton) {
            super(1);
            this.this$0 = getrightbutton;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.IsOverlapping.setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "consent", "", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements RedDotManager<Boolean> {
        final /* synthetic */ getRightButton length;

        setMin(getRightButton getrightbutton) {
            this.length = getrightbutton;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                getRightButton.length(this.length, bool.booleanValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Unit, Unit> {
        final /* synthetic */ boolean $consent;
        final /* synthetic */ getRightButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(getRightButton getrightbutton, boolean z) {
            super(1);
            this.this$0 = getrightbutton;
            this.$consent = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Unit) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "it");
            this.this$0.IsOverlapping.dismissProgress();
            this.this$0.IsOverlapping.length(this.$consent);
        }
    }

    @Inject
    public getRightButton(@NotNull MonitoringStatus monitoringStatus, @NotNull DistanceCalculator distanceCalculator, @NotNull getBeacons getbeacons, @NotNull getTitleBarRelative.getMin getmin) {
        Intrinsics.checkNotNullParameter(monitoringStatus, "getShareFeedConsent");
        Intrinsics.checkNotNullParameter(distanceCalculator, "setDeviceFeedFeatureSwitch");
        Intrinsics.checkNotNullParameter(getbeacons, "saveShareFeedConsent");
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.setMin = monitoringStatus;
        this.getMin = distanceCalculator;
        this.toFloatRange = getbeacons;
        this.IsOverlapping = getmin;
        IComponent<Boolean> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create<Boolean>()");
        this.getMax = max;
        IRedDotManager iRedDotManager = new IRedDotManager();
        this.length = iRedDotManager;
        iRedDotManager.getMin(this.getMax.debounce(300, TimeUnit.MILLISECONDS).observeOn(hideProgress.length()).subscribe(new setMin(this)));
    }

    public final void getMin() {
        this.setMin.execute(Unit.INSTANCE, new getMax(this), new getMin(this));
    }

    public final void getMax(boolean z) {
        this.getMax.onNext(Boolean.valueOf(z));
    }

    public final void getMax() {
        this.getMin.execute(Boolean.FALSE, new setMax(this), new isInside(this, false));
    }

    public final void setMax() {
        this.length.dispose();
        this.toFloatRange.dispose();
        this.getMin.dispose();
        this.setMin.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/social/contract/PrivacySettingPresenter$Companion;", "", "()V", "SHARE_FEED_BOUNCE_TIME", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void length(getRightButton getrightbutton, boolean z) {
        getrightbutton.IsOverlapping.showProgress();
        getrightbutton.toFloatRange.execute(Boolean.valueOf(z), new toIntRange(getrightbutton, z), new IsOverlapping(getrightbutton, z));
    }
}
