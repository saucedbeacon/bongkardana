package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BeaconService;
import o.TitleBarRightButtonView;
import o.access$3500;
import o.addSubTitleView;
import o.warningLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Y2\u00020\u0001:\u0001YBo\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\u000e\u0010B\u001a\b\u0012\u0004\u0012\u0002070>H\u0002J\b\u0010C\u001a\u00020DH\u0016J\u0012\u0010E\u001a\u00020D2\b\u0010F\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010G\u001a\u00020DH\u0002J\b\u0010H\u001a\u00020DH\u0002J\b\u0010I\u001a\u00020DH\u0016J\b\u0010J\u001a\u00020DH\u0016J\u0006\u0010K\u001a\u00020DJ\u0006\u0010L\u001a\u00020DJ\u0010\u0010M\u001a\u00020(2\u0006\u00101\u001a\u00020\u001eH\u0002J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020P0O2\u0006\u0010Q\u001a\u00020RH\u0002J\b\u0010S\u001a\u00020DH\u0002J\b\u0010T\u001a\u00020DH\u0016J\b\u0010U\u001a\u00020DH\u0016J\b\u0010V\u001a\u00020DH\u0016J\u0010\u0010W\u001a\u00020D2\u0006\u0010X\u001a\u00020 H\u0002R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 @GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010\u001e0\u001e0&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R$\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020(@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020(@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R$\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R0\u00108\u001a\b\u0012\u0004\u0012\u000207062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020706@GX.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u0002070>8BX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001e0>X\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lid/dana/social/presenter/NewSocialWidgetPresenter;", "Lid/dana/social/presenter/SocialWidgetPresenter;", "context", "Landroid/content/Context;", "getSocialFeatureConfig", "Lid/dana/domain/social/interactor/GetSocialFeatureConfig;", "getTimeline", "Lid/dana/domain/social/interactor/GetTimeline;", "getFriendsFeedWithInitFeedAndFeatureCheck", "Lid/dana/domain/social/interactor/GetFriendsFeedWithInitFeedAndFeatureCheck;", "saveShareFeedConsent", "Lid/dana/domain/social/interactor/SaveShareFeedConsent;", "getShareFeedConsent", "Lid/dana/domain/social/interactor/GetShareFeedConsent;", "observeInitFeed", "Lid/dana/domain/social/ObserveInitFeed;", "initFeedPeriodically", "Lid/dana/domain/social/interactor/InitFeedPeriodically;", "view", "Lid/dana/social/contract/SocialWidgetContract$View;", "feedMapper", "Lid/dana/social/model/mapper/FeedMapper;", "groupedFeedMapper", "Lid/dana/social/model/mapper/GroupedFeedMapper;", "getFeedHomeConfig", "Lid/dana/domain/social/interactor/GetFeedHomeConfig;", "getCachedTimeline", "Lid/dana/domain/social/interactor/GetCachedTimeline;", "(Landroid/content/Context;Lid/dana/domain/social/interactor/GetSocialFeatureConfig;Lid/dana/domain/social/interactor/GetTimeline;Lid/dana/domain/social/interactor/GetFriendsFeedWithInitFeedAndFeatureCheck;Lid/dana/domain/social/interactor/SaveShareFeedConsent;Lid/dana/domain/social/interactor/GetShareFeedConsent;Lid/dana/domain/social/ObserveInitFeed;Lid/dana/domain/social/interactor/InitFeedPeriodically;Lid/dana/social/contract/SocialWidgetContract$View;Lid/dana/social/model/mapper/FeedMapper;Lid/dana/social/model/mapper/GroupedFeedMapper;Lid/dana/domain/social/interactor/GetFeedHomeConfig;Lid/dana/domain/social/interactor/GetCachedTimeline;)V", "cachedMinId", "", "<set-?>", "Lid/dana/domain/social/model/FeedHomeConfig;", "feedHomeConfig", "()Lid/dana/domain/social/model/FeedHomeConfig;", "setFeedHomeConfig", "(Lid/dana/domain/social/model/FeedHomeConfig;)V", "fetchTimelinePublishSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "", "intervalSubscribed", "getIntervalSubscribed", "()Z", "setIntervalSubscribed", "(Z)V", "loadingFeed", "getLoadingFeed", "setLoadingFeed", "minId", "getMinId", "()Ljava/lang/String;", "setMinId", "(Ljava/lang/String;)V", "Lio/reactivex/Observable;", "", "observableInterval", "getObservableInterval", "()Lio/reactivex/Observable;", "setObservableInterval", "(Lio/reactivex/Observable;)V", "timelineIntervalObserver", "Lid/dana/domain/DefaultObserver;", "getTimelineIntervalObserver", "()Lid/dana/domain/DefaultObserver;", "timelinePublishSubjectObserver", "createTimelineObserver", "disposeTimelineObserver", "", "doFetchTimeline", "nextMinId", "doGetHomeConfigSocialConfig", "doGetHomeConfigWidgetTimelineInInterval", "getLatestWidgetTimeline", "getSocialConfig", "getWidgetTimelineFirstTime", "getWidgetTimelinePeriodically", "isMinIdTheSameAsFetchedBefore", "mapFeedModelsBasedOnFeedVersion", "", "Lid/dana/social/model/FeedViewHolderModel;", "socialFeed", "Lid/dana/domain/social/model/SocialFeed;", "observeWidgetTimelineInInterval", "onDestroy", "refreshWidgetTimeline", "setToInactive", "subscribeTimelineInterval", "config", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setViewTypeCount extends getScrapView {
    @NotNull
    public static final getMin equals = new getMin((byte) 0);
    private final access$3500 Mean$Arithmetic;
    public TitleBarRightButtonView.AnonymousClass1<Long> getMax;
    @Nullable
    getMonitoringStatus getMin;
    private final access$3600 invoke;
    private final warningLogger invokeSuspend;
    public boolean length;
    public final IComponent<String> setMax;
    @NotNull
    public String setMin = "";
    boolean toFloatRange;
    private GriverAppVirtualHostProxy<String> toString = new IsOverlapping(this);
    private final WarningAndroidLogger valueOf;
    /* access modifiers changed from: private */
    public String values = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setViewTypeCount this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(setViewTypeCount setviewtypecount) {
            super(1);
            this.this$0 = setviewtypecount;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(updateMonitoringStatusTime.class, this.this$0.getClass(), String.valueOf(new Exception(th).getCause())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/FeedHomeConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<getMonitoringStatus, Unit> {
        final /* synthetic */ setViewTypeCount this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(setViewTypeCount setviewtypecount) {
            super(1);
            this.this$0 = setviewtypecount;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getMonitoringStatus) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getMonitoringStatus getmonitoringstatus) {
            Intrinsics.checkNotNullParameter(getmonitoringstatus, "it");
            this.this$0.getMin = getmonitoringstatus;
            this.this$0.hashCode.getMax(getmonitoringstatus.isFeedWidgetEnabled());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setViewTypeCount this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(setViewTypeCount setviewtypecount) {
            super(1);
            this.this$0 = setviewtypecount;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(updateMonitoringStatusTime.class, this.this$0.getClass(), String.valueOf(new Exception(th).getCause())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/FeedHomeConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<getMonitoringStatus, Unit> {
        final /* synthetic */ setViewTypeCount this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(setViewTypeCount setviewtypecount) {
            super(1);
            this.this$0 = setviewtypecount;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getMonitoringStatus) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getMonitoringStatus getmonitoringstatus) {
            Intrinsics.checkNotNullParameter(getmonitoringstatus, "it");
            this.this$0.getMin = getmonitoringstatus;
            this.this$0.getMin(getmonitoringstatus);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setViewTypeCount(@NotNull Context context, @NotNull updateMonitoringStatusTime updatemonitoringstatustime, @NotNull stateOf stateof, @NotNull BeaconService.BeaconBinder beaconBinder, @NotNull getBeacons getbeacons, @NotNull MonitoringStatus monitoringStatus, @NotNull getModel getmodel, @NotNull isStatePreservationOn isstatepreservationon, @NotNull addSubTitleView.length length2, @NotNull access$3600 access_3600, @NotNull access$3500 access_3500, @NotNull WarningAndroidLogger warningAndroidLogger, @NotNull warningLogger warninglogger) {
        super(context, updatemonitoringstatustime, stateof, beaconBinder, getbeacons, monitoringStatus, getmodel, isstatepreservationon, length2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(updatemonitoringstatustime, "getSocialFeatureConfig");
        Intrinsics.checkNotNullParameter(stateof, "getTimeline");
        Intrinsics.checkNotNullParameter(beaconBinder, "getFriendsFeedWithInitFeedAndFeatureCheck");
        Intrinsics.checkNotNullParameter(getbeacons, "saveShareFeedConsent");
        Intrinsics.checkNotNullParameter(monitoringStatus, "getShareFeedConsent");
        Intrinsics.checkNotNullParameter(getmodel, "observeInitFeed");
        Intrinsics.checkNotNullParameter(isstatepreservationon, "initFeedPeriodically");
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(access_3600, "feedMapper");
        Intrinsics.checkNotNullParameter(access_3500, "groupedFeedMapper");
        Intrinsics.checkNotNullParameter(warningAndroidLogger, "getFeedHomeConfig");
        Intrinsics.checkNotNullParameter(warninglogger, "getCachedTimeline");
        this.invoke = access_3600;
        this.Mean$Arithmetic = access_3500;
        this.valueOf = warningAndroidLogger;
        this.invokeSuspend = warninglogger;
        IComponent<String> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create<String>()");
        this.setMax = max;
        this.setMax.debounce(1, TimeUnit.SECONDS).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).filter(new getChildren<String>(this) {
            final /* synthetic */ setViewTypeCount setMax;

            {
                this.setMax = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: setMin */
            public boolean test(@NotNull String str) {
                boolean z;
                Intrinsics.checkNotNullParameter(str, "it");
                getMonitoringStatus getmonitoringstatus = this.setMax.getMin;
                if (getmonitoringstatus != null) {
                    z = getmonitoringstatus.isFeedEnabled();
                } else {
                    z = false;
                }
                return z && this.setMax.IsOverlapping.isFinished();
            }
        }).subscribe(this.toString);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/presenter/NewSocialWidgetPresenter$timelinePublishSubjectObserver$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "minId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ setViewTypeCount getMax;

        IsOverlapping(setViewTypeCount setviewtypecount) {
            this.getMax = setviewtypecount;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "minId");
            setViewTypeCount.getMax(this.getMax, str);
        }
    }

    public final void toIntRange() {
        super.toIntRange();
        this.setMin = "";
    }

    public final void setMin() {
        getMonitoringStatus getmonitoringstatus = this.getMin;
        if (getmonitoringstatus != null) {
            this.hashCode.getMax(getmonitoringstatus.isFeedWidgetEnabled());
        } else {
            this.valueOf.execute(onReceivedIcon.INSTANCE, new getMax(this), new length(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/presenter/NewSocialWidgetPresenter$createTimelineObserver$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<Long> {
        final /* synthetic */ setViewTypeCount setMin;

        public setMax(setViewTypeCount setviewtypecount) {
            this.setMin = setviewtypecount;
        }

        public final /* synthetic */ void onNext(Object obj) {
            this.setMin.setMax.onNext(this.setMin.setMin);
        }
    }

    public final void IsOverlapping() {
        if (!this.length) {
            this.length = true;
            getMonitoringStatus getmonitoringstatus = this.getMin;
            if (getmonitoringstatus != null) {
                getMin(getmonitoringstatus);
            } else {
                this.valueOf.execute(onReceivedIcon.INSTANCE, new toIntRange(this), new equals(this));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/NewSocialWidgetPresenter$getWidgetTimelineFirstTime$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "result", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
        final /* synthetic */ setViewTypeCount getMin;

        isInside(setViewTypeCount setviewtypecount) {
            this.getMin = setviewtypecount;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
            Intrinsics.checkNotNullParameter(getscancallbackintent, "result");
            if (getscancallbackintent.getFromCache()) {
                this.getMin.values = getscancallbackintent.getMinId();
            }
            setViewTypeCount setviewtypecount = this.getMin;
            String minId = getscancallbackintent.getMinId();
            Intrinsics.checkNotNullParameter(minId, "<set-?>");
            setviewtypecount.setMin = minId;
            addSubTitleView.length length = this.getMin.hashCode;
            Iterable<setEmptyView> length2 = setViewTypeCount.length(this.getMin, getscancallbackintent);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(length2, 10));
            for (setEmptyView length3 : length2) {
                arrayList.add(length3.length());
            }
            length.getMin(new access$2202((List) arrayList, getscancallbackintent.getFromCache()));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(warningLogger.class, this.getMin.getClass(), String.valueOf(new Exception(th).getCause())));
            this.getMin.hashCode.setMax();
        }
    }

    public final void toFloatRange() {
        this.invokeSuspend.execute(new isInside(this), new warningLogger.getMax(3, (String) null, this.setMin, (String) null, 3, true, 8, (DefaultConstructorMarker) null));
    }

    public final void equals() {
        this.setMax.onNext(this.setMin);
    }

    /* access modifiers changed from: private */
    public final void getMin(getMonitoringStatus getmonitoringstatus) {
        if (getmonitoringstatus.isRealtimeFeedEnabled()) {
            if (this.getMax == null) {
                TitleBarRightButtonView.AnonymousClass1<Long> interval = TitleBarRightButtonView.AnonymousClass1.interval((long) getmonitoringstatus.getInterval(), TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(interval, "Observable.interval(\n   …SECONDS\n                )");
                this.getMax = interval;
            }
            TitleBarRightButtonView.AnonymousClass1<Long> r3 = this.getMax;
            if (r3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("observableInterval");
            }
            r3.subscribe((GriverProgressBar<? super Long>) new setMax(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/NewSocialWidgetPresenter$doFetchTimeline$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "result", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
        final /* synthetic */ setViewTypeCount setMin;

        setMin(setViewTypeCount setviewtypecount) {
            this.setMin = setviewtypecount;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
            Intrinsics.checkNotNullParameter(getscancallbackintent, "result");
            if (this.setMin.length(getscancallbackintent.getMinId())) {
                setViewTypeCount setviewtypecount = this.setMin;
                String minId = getscancallbackintent.getMinId();
                Intrinsics.checkNotNullParameter(minId, "<set-?>");
                setviewtypecount.setMin = minId;
                addSubTitleView.length length = this.setMin.hashCode;
                Iterable<setEmptyView> length2 = setViewTypeCount.length(this.setMin, getscancallbackintent);
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(length2, 10));
                for (setEmptyView length3 : length2) {
                    arrayList.add(length3.length());
                }
                length.getMax(new access$2202((List) arrayList, getscancallbackintent.getFromCache()));
            }
            this.setMin.toFloatRange = false;
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(warningLogger.class, this.setMin.getClass(), String.valueOf(new Exception(th).getCause())));
            this.setMin.hashCode.setMax();
            this.setMin.toFloatRange = false;
        }
    }

    /* access modifiers changed from: private */
    public final boolean length(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(613640387, oncanceled);
            onCancelLoad.getMin(613640387, oncanceled);
        }
        return (str.length() > 0) && (Intrinsics.areEqual((Object) str, (Object) this.setMin) ^ true);
    }

    public final void length() {
        toFloatRange();
    }

    public final void setMax() {
        super.setMax();
        this.valueOf.dispose();
        new setMax(this).dispose();
        this.toString.dispose();
        this.length = false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/social/presenter/NewSocialWidgetPresenter$Companion;", "", "()V", "DEBOUNCE_TIME", "", "DEFAULT_PAGE_SIZE", "", "FEED_VERSION", "FIRST_TIME_FETCH_PAGE_SIZE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ List length(setViewTypeCount setviewtypecount, getScanCallbackIntent getscancallbackintent) {
        List<setEmptyView> list;
        if (getscancallbackintent.isFeedNotVersionTwo()) {
            list = getscancallbackintent.getFromCache() ? setviewtypecount.Mean$Arithmetic.length(new Date(), getscancallbackintent.getGroupedActivities(), access$3500.length.INSTANCE) : setviewtypecount.Mean$Arithmetic.setMin(new Date(), getscancallbackintent.getGroupedActivities(), setviewtypecount.values);
        } else if (getscancallbackintent.getFromCache()) {
            list = (List) setviewtypecount.invoke.apply(getscancallbackintent.getActivities());
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
        } else {
            list = setviewtypecount.invoke.setMin(getscancallbackintent.getActivities(), setviewtypecount.values);
        }
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            boolean z = true;
            if (((setEmptyView) next).getMin == 1) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public static final /* synthetic */ void getMax(setViewTypeCount setviewtypecount, String str) {
        if (!setviewtypecount.toFloatRange) {
            setviewtypecount.toFloatRange = true;
            setviewtypecount.invokeSuspend.execute(new setMin(setviewtypecount), new warningLogger.getMax(10, (String) null, str, (String) null, 3, false, 8, (DefaultConstructorMarker) null));
        }
    }
}
