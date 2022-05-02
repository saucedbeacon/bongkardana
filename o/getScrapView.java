package o;

import android.content.Context;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.userconfig.BiztypeNotFoundException;
import id.dana.domain.social.InitStatus;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BeaconService;
import o.TitleBarRightButtonView;
import o.addSubTitleView;
import o.stateOf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FBO\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000e\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020\u001bJ\b\u00106\u001a\u00020&H\u0016J\b\u00107\u001a\u00020,H\u0016J\b\u00108\u001a\u00020&H\u0016J\b\u0010\r\u001a\u00020&H\u0016J\b\u00109\u001a\u00020&H\u0016J\b\u0010\u0011\u001a\u00020&H\u0016J\u001d\u0010:\u001a\u00020&\"\u0006\b\u0000\u0010;\u0018\u00012\n\u0010<\u001a\u00060=j\u0002`>H\bJ\u0010\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020,H\u0016J\b\u0010A\u001a\u00020&H\u0016J\u0014\u0010B\u001a\u00020&2\n\u0010<\u001a\u00060=j\u0002`>H\u0002J\b\u0010C\u001a\u00020&H\u0016J\b\u0010D\u001a\u00020&H\u0002J\b\u0010E\u001a\u00020&H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@WX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\"8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010#R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R \u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006G"}, d2 = {"Lid/dana/social/presenter/SocialWidgetPresenter;", "Lid/dana/base/BasePresenter;", "Lid/dana/social/contract/SocialWidgetContract$Presenter;", "context", "Landroid/content/Context;", "getSocialFeatureConfig", "Lid/dana/domain/social/interactor/GetSocialFeatureConfig;", "getTimeline", "Lid/dana/domain/social/interactor/GetTimeline;", "getFriendsFeedWithInitFeedAndFeatureCheck", "Lid/dana/domain/social/interactor/GetFriendsFeedWithInitFeedAndFeatureCheck;", "saveShareFeedConsent", "Lid/dana/domain/social/interactor/SaveShareFeedConsent;", "getShareFeedConsent", "Lid/dana/domain/social/interactor/GetShareFeedConsent;", "getInitFeedObservable", "Lid/dana/domain/social/ObserveInitFeed;", "initFeedPeriodically", "Lid/dana/domain/social/interactor/InitFeedPeriodically;", "view", "Lid/dana/social/contract/SocialWidgetContract$View;", "(Landroid/content/Context;Lid/dana/domain/social/interactor/GetSocialFeatureConfig;Lid/dana/domain/social/interactor/GetTimeline;Lid/dana/domain/social/interactor/GetFriendsFeedWithInitFeedAndFeatureCheck;Lid/dana/domain/social/interactor/SaveShareFeedConsent;Lid/dana/domain/social/interactor/GetShareFeedConsent;Lid/dana/domain/social/ObserveInitFeed;Lid/dana/domain/social/interactor/InitFeedPeriodically;Lid/dana/social/contract/SocialWidgetContract$View;)V", "getContext", "()Landroid/content/Context;", "getGetTimeline", "()Lid/dana/domain/social/interactor/GetTimeline;", "<set-?>", "Lid/dana/domain/social/model/InitFeed;", "initFeed", "getInitFeed", "()Lid/dana/domain/social/model/InitFeed;", "setInitFeed", "(Lid/dana/domain/social/model/InitFeed;)V", "initFeedObservable", "Lid/dana/domain/DefaultObserver;", "()Lid/dana/domain/DefaultObserver;", "onFeedInitializing", "Lkotlin/Function0;", "", "getOnFeedInitializing", "()Lkotlin/jvm/functions/Function0;", "setOnFeedInitializing", "(Lkotlin/jvm/functions/Function0;)V", "socialEnable", "", "getSocialEnable", "()Ljava/lang/Boolean;", "setSocialEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getView", "()Lid/dana/social/contract/SocialWidgetContract$View;", "checkInitFeedStatus", "result", "disposeTimelineObserver", "getInitFeedIsObserved", "getLatestWidgetTimeline", "getSocialConfig", "logError", "T", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "observeInitFeed", "getCurrentInitFeedStatusIfObserved", "onDestroy", "onInitFeedError", "refreshWidgetTimeline", "setShareFeedConfigToTrue", "setToInactive", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class getScrapView extends registerCallback implements addSubTitleView.getMin {
    @NotNull
    public static final setMax toDoubleRange = new setMax((byte) 0);
    public final MonitoringStatus FastBitmap$CoordinateSystem;
    @NotNull
    setBeaconParsers IsOverlapping = new setBeaconParsers(InitStatus.NOT_ACTIVATED, 0, (Exception) null, false, 14, (DefaultConstructorMarker) null);
    private final isStatePreservationOn equals;
    private final BeaconService.BeaconBinder getMax;
    @NotNull
    private Function0<Unit> getMin = toFloatRange.INSTANCE;
    @NotNull
    final addSubTitleView.length hashCode;
    @Nullable
    Boolean isInside;
    @NotNull
    private final stateOf length;
    private final getBeacons setMax;
    private final updateMonitoringStatusTime setMin;
    private final getModel toFloatRange;
    @NotNull
    final Context toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<Unit> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public void toIntRange() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ getScrapView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(getScrapView getscrapview) {
            super(1);
            this.this$0 = getscrapview;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(isStatePreservationOn.class, this.this$0.getClass(), String.valueOf(exc.getCause())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMin extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ getScrapView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(getScrapView getscrapview) {
            super(1);
            this.this$0 = getscrapview;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "exception");
            if (exc.getCause() instanceof BiztypeNotFoundException) {
                buildModelMapWithLock.execute$default(this.this$0.setMax, Boolean.TRUE, (Function1) null, new values(this.this$0), 2, (Object) null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ getScrapView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(getScrapView getscrapview) {
            super(1);
            this.this$0 = getscrapview;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            this.this$0.length(exc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/InitFeed;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<TitleBarRightButtonView.AnonymousClass1<setBeaconParsers>, Unit> {
        final /* synthetic */ getScrapView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(getScrapView getscrapview) {
            super(1);
            this.this$0 = getscrapview;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TitleBarRightButtonView.AnonymousClass1<setBeaconParsers>) (TitleBarRightButtonView.AnonymousClass1) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull TitleBarRightButtonView.AnonymousClass1<setBeaconParsers> r2) {
            Intrinsics.checkNotNullParameter(r2, "it");
            r2.subscribe((GriverProgressBar<? super setBeaconParsers>) getScrapView.setMax(this.this$0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ getScrapView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(getScrapView getscrapview) {
            super(1);
            this.this$0 = getscrapview;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(getBeacons.class, this.this$0.getClass(), String.valueOf(exc.getCause())));
        }
    }

    @Inject
    public getScrapView(@NotNull Context context, @NotNull updateMonitoringStatusTime updatemonitoringstatustime, @NotNull stateOf stateof, @NotNull BeaconService.BeaconBinder beaconBinder, @NotNull getBeacons getbeacons, @NotNull MonitoringStatus monitoringStatus, @NotNull getModel getmodel, @NotNull isStatePreservationOn isstatepreservationon, @NotNull addSubTitleView.length length2) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(updatemonitoringstatustime, "getSocialFeatureConfig");
        Intrinsics.checkNotNullParameter(stateof, "getTimeline");
        Intrinsics.checkNotNullParameter(beaconBinder, "getFriendsFeedWithInitFeedAndFeatureCheck");
        Intrinsics.checkNotNullParameter(getbeacons, "saveShareFeedConsent");
        Intrinsics.checkNotNullParameter(monitoringStatus, "getShareFeedConsent");
        Intrinsics.checkNotNullParameter(getmodel, "getInitFeedObservable");
        Intrinsics.checkNotNullParameter(isstatepreservationon, "initFeedPeriodically");
        Intrinsics.checkNotNullParameter(length2, "view");
        this.toIntRange = context;
        this.setMin = updatemonitoringstatustime;
        this.length = stateof;
        this.getMax = beaconBinder;
        this.setMax = getbeacons;
        this.FastBitmap$CoordinateSystem = monitoringStatus;
        this.toFloatRange = getmodel;
        this.equals = isstatepreservationon;
        this.hashCode = length2;
    }

    public final void getMax(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.getMin = function0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/SocialWidgetPresenter$initFeedObservable$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/InitFeed;", "onError", "", "e", "", "onNext", "result", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<setBeaconParsers> {
        final /* synthetic */ getScrapView setMin;

        getMax(getScrapView getscrapview) {
            this.setMin = getscrapview;
        }

        public final /* synthetic */ void onNext(Object obj) {
            setBeaconParsers setbeaconparsers = (setBeaconParsers) obj;
            Intrinsics.checkNotNullParameter(setbeaconparsers, "result");
            this.setMin.length(setbeaconparsers);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMin.length(new Exception(th));
        }
    }

    public void setMin() {
        Boolean bool = this.isInside;
        if (bool != null) {
            this.hashCode.getMax(bool.booleanValue());
            return;
        }
        this.setMin.execute(new setMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/SocialWidgetPresenter$getSocialConfig$2", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "enable", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ getScrapView getMin;

        setMin(getScrapView getscrapview) {
            this.getMin = getscrapview;
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.getMin.isInside = Boolean.valueOf(booleanValue);
            this.getMin.hashCode.getMax(booleanValue);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(updateMonitoringStatusTime.class, this.getMin.getClass(), String.valueOf(new Exception(th).getCause())));
        }
    }

    public final void getMax(boolean z) {
        if (!this.toFloatRange.isObserved()) {
            this.toFloatRange.execute(Unit.INSTANCE, new toIntRange(this), new isInside(this));
        }
        if (this.toFloatRange.isObserved() && z) {
            length(this.IsOverlapping);
        }
    }

    public final void getMin() {
        buildModelMapWithLock.execute$default(this.equals, Unit.INSTANCE, (Function1) null, new IsOverlapping(this), 2, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/SocialWidgetPresenter$getLatestWidgetTimeline$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
        final /* synthetic */ getScrapView length;

        length(getScrapView getscrapview) {
            this.length = getscrapview;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
            Intrinsics.checkNotNullParameter(getscancallbackintent, SecurityConstants.KEY_TEXT);
            this.length.hashCode.getMax(new access$2202(getSelectedView.getMax(getscancallbackintent.getActivities(), this.length.toIntRange), getscancallbackintent.getFromCache()));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(stateOf.class, this.length.getClass(), String.valueOf(new Exception(th).getCause())));
            this.length.hashCode.setMax();
        }
    }

    public void equals() {
        this.length.execute(new length(this), new stateOf.setMin(3, (String) null, (String) null, 2, CollectionsKt.emptyList()));
    }

    public final void getMax() {
        buildModelMapWithLock.execute$default(this.FastBitmap$CoordinateSystem, Unit.INSTANCE, (Function1) null, new getMin(this), 2, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/SocialWidgetPresenter$refreshWidgetTimeline$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
        final /* synthetic */ getScrapView getMax;

        equals(getScrapView getscrapview) {
            this.getMax = getscrapview;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
            Intrinsics.checkNotNullParameter(getscancallbackintent, SecurityConstants.KEY_TEXT);
            this.getMax.hashCode.getMax(new access$2202(getSelectedView.getMax(getscancallbackintent.getActivities(), this.getMax.toIntRange), getscancallbackintent.getFromCache()));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(BeaconService.BeaconBinder.class, this.getMax.getClass(), String.valueOf(new Exception(th).getCause())));
        }
    }

    public void length() {
        this.getMax.execute(new equals(this));
    }

    /* access modifiers changed from: private */
    public final void length(Exception exc) {
        setBeaconParsers setbeaconparsers = new setBeaconParsers(InitStatus.ERROR, 0, (Exception) null, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setbeaconparsers, "<set-?>");
        this.IsOverlapping = setbeaconparsers;
        this.toFloatRange.dispose();
        this.hashCode.length();
        updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(startStatusPreservation.class, getClass(), String.valueOf(exc.getCause())));
    }

    public final void length(@NotNull setBeaconParsers setbeaconparsers) {
        Intrinsics.checkNotNullParameter(setbeaconparsers, "result");
        Intrinsics.checkNotNullParameter(setbeaconparsers, "<set-?>");
        this.IsOverlapping = setbeaconparsers;
        int i = getTransientStateView.getMin[setbeaconparsers.getStatus().ordinal()];
        if (i == 1) {
            this.getMin.invoke();
            this.hashCode.getMax();
        } else if (i == 2) {
            length(setbeaconparsers.getError());
        } else if (i == 3) {
            this.hashCode.getMin();
        } else if (i == 4) {
            this.hashCode.setMin();
        }
    }

    public void setMax() {
        this.setMin.dispose();
        this.length.dispose();
        this.setMax.dispose();
        this.FastBitmap$CoordinateSystem.dispose();
        this.toFloatRange.dispose();
        this.equals.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/social/presenter/SocialWidgetPresenter$Companion;", "", "()V", "DEFAULT_FEED_VERSION", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ GriverAppVirtualHostProxy setMax(getScrapView getscrapview) {
        return new getMax(getscrapview);
    }
}
