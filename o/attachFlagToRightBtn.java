package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.handleScrollChange;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/social/contract/share/ShareToFeedsPresenter;", "Lid/dana/base/BasePresenter;", "Lid/dana/social/contract/share/ShareToFeedsContract$Presenter;", "getShareFeedConsent", "Lid/dana/domain/social/interactor/GetShareFeedConsent;", "saveShareFeedConsent", "Lid/dana/domain/social/interactor/SaveShareFeedConsent;", "getFeedsSharingLastCheckedState", "Lid/dana/domain/social/interactor/GetFeedsSharingLastCheckedState;", "saveFeedsSharingLastCheckedState", "Lid/dana/domain/social/interactor/SaveFeedsSharingLastCheckedState;", "view", "Lid/dana/social/contract/share/ShareToFeedsContract$View;", "(Lid/dana/domain/social/interactor/GetShareFeedConsent;Lid/dana/domain/social/interactor/SaveShareFeedConsent;Lid/dana/domain/social/interactor/GetFeedsSharingLastCheckedState;Lid/dana/domain/social/interactor/SaveFeedsSharingLastCheckedState;Lid/dana/social/contract/share/ShareToFeedsContract$View;)V", "dispose", "", "getLastCheckedState", "initShareToFeeds", "onDestroy", "savePrevCheckedState", "checked", "", "setShareFeedConfigToTrue", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class attachFlagToRightBtn extends registerCallback implements handleScrollChange.getMin {
    final calculateRssi getMax;
    private final MonitoringStatus getMin;
    private final getBeacons length;
    private final isTracked setMax;
    /* access modifiers changed from: private */
    public final handleScrollChange.setMax setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ attachFlagToRightBtn this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(attachFlagToRightBtn attachflagtorightbtn) {
            super(1);
            this.this$0 = attachflagtorightbtn;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMin.dismissProgress();
            handleScrollChange.setMax unused = this.this$0.setMin;
            updateActionSheetContent.e(DanaLogConstants.TAG.SHARE_TO_FEEDS_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "feedSharingActivated", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ attachFlagToRightBtn this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(attachFlagToRightBtn attachflagtorightbtn) {
            super(1);
            this.this$0 = attachflagtorightbtn;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMin.getMax(z);
            if (z) {
                attachFlagToRightBtn attachflagtorightbtn = this.this$0;
                attachflagtorightbtn.getMax.execute(onReceivedIcon.INSTANCE, new setMin(attachflagtorightbtn), new getMin(attachflagtorightbtn));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ attachFlagToRightBtn this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(attachFlagToRightBtn attachflagtorightbtn) {
            super(1);
            this.this$0 = attachflagtorightbtn;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            this.this$0.setMin.getMax(false);
            updateActionSheetContent.e(DanaLogConstants.TAG.SHARE_TO_FEEDS_TAG, exc.getMessage(), exc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ attachFlagToRightBtn this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(attachFlagToRightBtn attachflagtorightbtn) {
            super(1);
            this.this$0 = attachflagtorightbtn;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMin.dismissProgress();
            handleScrollChange.setMax unused = this.this$0.setMin;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Unit, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final void invoke(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Unit) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ attachFlagToRightBtn this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(attachFlagToRightBtn attachflagtorightbtn) {
            super(1);
            this.this$0 = attachflagtorightbtn;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMin.dismissProgress();
            handleScrollChange.setMax unused = this.this$0.setMin;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<Throwable, Unit> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.SHARE_TO_FEEDS_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Exception, Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.SHARE_TO_FEEDS_TAG, exc.getMessage(), exc);
        }
    }

    @Inject
    public attachFlagToRightBtn(@NotNull MonitoringStatus monitoringStatus, @NotNull getBeacons getbeacons, @NotNull calculateRssi calculaterssi, @NotNull isTracked istracked, @NotNull handleScrollChange.setMax setmax) {
        Intrinsics.checkNotNullParameter(monitoringStatus, "getShareFeedConsent");
        Intrinsics.checkNotNullParameter(getbeacons, "saveShareFeedConsent");
        Intrinsics.checkNotNullParameter(calculaterssi, "getFeedsSharingLastCheckedState");
        Intrinsics.checkNotNullParameter(istracked, "saveFeedsSharingLastCheckedState");
        Intrinsics.checkNotNullParameter(setmax, "view");
        this.getMin = monitoringStatus;
        this.length = getbeacons;
        this.getMax = calculaterssi;
        this.setMax = istracked;
        this.setMin = setmax;
    }

    public final void getMax() {
        this.setMin.showProgress();
        this.getMin.execute(Unit.INSTANCE, new length(this), new setMax(this));
    }

    public final void length() {
        this.length.execute(Boolean.TRUE, IsOverlapping.INSTANCE, toIntRange.INSTANCE);
    }

    public final void setMin(boolean z) {
        this.setMax.execute(Boolean.valueOf(z), new getMax(this), toFloatRange.INSTANCE);
    }

    public final void l_() {
        super.l_();
        this.getMin.dispose();
        this.length.dispose();
        this.getMax.dispose();
        this.setMax.dispose();
    }

    public final void setMax() {
        l_();
    }
}
