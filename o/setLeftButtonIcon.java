package o;

import androidx.work.WorkInfo;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.social.InitStatus;
import io.reactivex.internal.functions.Functions;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import o.access$3500;
import o.setFocusable;
import o.setLeftButtonText;
import o.stateOf;
import o.updateNewlyOutside;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 l2\u00020\u0001:\u0001lBw\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u0010\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020'H\u0002J\b\u0010F\u001a\u00020=H\u0016J\b\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020=H\u0002J\b\u0010J\u001a\u00020=H\u0002J\u001e\u0010K\u001a\u00020=2\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 0MH\u0016J\u0010\u0010K\u001a\u00020=2\u0006\u0010L\u001a\u00020 H\u0016J\b\u0010N\u001a\u00020=H\u0016J\b\u0010O\u001a\u00020 H\u0016J\b\u0010\u0014\u001a\u00020=H\u0016J\b\u0010P\u001a\u00020=H\u0016J\b\u0010\u0018\u001a\u00020=H\u0016J4\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0R2\u001e\u0010U\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0R\u0012\u0004\u0012\u00020=0VH\u0016J\u0010\u0010W\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-H\u0002J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020#0-H\u0002J\b\u0010Y\u001a\u00020=H\u0016J\b\u0010\u0004\u001a\u00020=H\u0016J\u0010\u0010Z\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010-H\u0002J\u0010\u0010[\u001a\u00020=2\u0006\u0010\\\u001a\u00020%H\u0016J\b\u0010\u001a\u001a\u00020=H\u0016J\b\u0010\u0010\u001a\u00020=H\u0016J\b\u0010]\u001a\u00020%H\u0016J\u001d\u0010^\u001a\u00020=\"\u0006\b\u0000\u0010_\u0018\u00012\n\u0010E\u001a\u00060`j\u0002`aH\bJ\u0016\u0010b\u001a\b\u0012\u0004\u0012\u00020c0S2\u0006\u0010d\u001a\u00020CH\u0002J\b\u0010e\u001a\u00020=H\u0002J\b\u0010f\u001a\u00020=H\u0016J\b\u0010g\u001a\u00020=H\u0016J\u0014\u0010h\u001a\u00020=2\n\u0010E\u001a\u00060`j\u0002`aH\u0002J\b\u0010i\u001a\u00020=H\u0016J\b\u0010j\u001a\u00020=H\u0002J\b\u0010k\u001a\u00020=H\u0016R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020'0-8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010.R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R \u00107\u001a\b\u0012\u0004\u0012\u00020#0-X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010.\"\u0004\b9\u0010:R \u0010;\u001a\b\u0012\u0004\u0012\u00020=0<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006m"}, d2 = {"Lid/dana/social/contract/friendsfeeds/FriendsFeedsPresenter;", "Lid/dana/social/contract/friendsfeeds/FriendFeedsContract$Presenter;", "view", "Lid/dana/social/contract/friendsfeeds/FriendFeedsContract$View;", "getTimeline", "Lid/dana/domain/social/interactor/GetTimeline;", "getTimelineWithTopFriends", "Lid/dana/domain/social/interactor/GetTimelineWithTopFriends;", "feedMapper", "Lid/dana/social/model/mapper/FeedMapper;", "groupedFeedMapper", "Lid/dana/social/model/mapper/GroupedFeedMapper;", "feedsContentAction", "Lid/dana/social/utils/FeedsContentAction;", "getInitFeedObservable", "Lid/dana/domain/social/ObserveInitFeed;", "initFeedPeriodically", "Lid/dana/domain/social/interactor/InitFeedPeriodically;", "getMyFeedsHeaderInfo", "Lid/dana/domain/social/interactor/GetMyFeedsHeaderInfo;", "getFeedCommentEnable", "Lid/dana/domain/social/interactor/GetFeedCommentEnable;", "fetchFeedNotificationCount", "Lid/dana/domain/social/interactor/FetchFeedNotificationCount;", "getFeedNotificationEnable", "Lid/dana/domain/social/interactor/GetFeedNotificationEnable;", "getUserInfo", "Lid/dana/domain/user/interactor/GetUserInfo;", "getFeedConfig", "Lid/dana/domain/social/interactor/GetFeedConfig;", "(Lid/dana/social/contract/friendsfeeds/FriendFeedsContract$View;Lid/dana/domain/social/interactor/GetTimeline;Lid/dana/domain/social/interactor/GetTimelineWithTopFriends;Lid/dana/social/model/mapper/FeedMapper;Lid/dana/social/model/mapper/GroupedFeedMapper;Lid/dana/social/utils/FeedsContentAction;Lid/dana/domain/social/ObserveInitFeed;Lid/dana/domain/social/interactor/InitFeedPeriodically;Lid/dana/domain/social/interactor/GetMyFeedsHeaderInfo;Lid/dana/domain/social/interactor/GetFeedCommentEnable;Lid/dana/domain/social/interactor/FetchFeedNotificationCount;Lid/dana/domain/social/interactor/GetFeedNotificationEnable;Lid/dana/domain/user/interactor/GetUserInfo;Lid/dana/domain/social/interactor/GetFeedConfig;)V", "currentUserId", "", "fetchNotificationCountObserver", "Lio/reactivex/subjects/PublishSubject;", "Lid/dana/domain/core/usecase/NoParams;", "hasMore", "", "initFeed", "Lid/dana/domain/social/model/InitFeed;", "getInitFeed", "()Lid/dana/domain/social/model/InitFeed;", "setInitFeed", "(Lid/dana/domain/social/model/InitFeed;)V", "initFeedObservable", "Lid/dana/domain/DefaultObserver;", "()Lid/dana/domain/DefaultObserver;", "isFetchingFeed", "()Z", "setFetchingFeed", "(Z)V", "loadCache", "maxId", "myHeaderInfoObserver", "Lid/dana/domain/social/model/MyFeedsHeaderInfo;", "notificationCountPublishSubjectObserver", "getNotificationCountPublishSubjectObserver$app_productionRelease", "setNotificationCountPublishSubjectObserver$app_productionRelease", "(Lid/dana/domain/DefaultObserver;)V", "onFeedInitializing", "Lkotlin/Function0;", "", "getOnFeedInitializing", "()Lkotlin/jvm/functions/Function0;", "setOnFeedInitializing", "(Lkotlin/jvm/functions/Function0;)V", "timelineObserver", "Lid/dana/domain/social/model/SocialFeed;", "checkInitFeedStatus", "it", "checkUsername", "createTimelineParams", "Lid/dana/domain/social/interactor/GetTimeline$Params;", "disposeHeaderInfoObserver", "disposeTimelineObserver", "doFeedsContentAction", "redirectValue", "Ljava/util/HashMap;", "fetchFeedWithBackPressure", "getCurrentUserId", "getFeedNotificationCount", "getFullSyncObserver", "Landroidx/lifecycle/Observer;", "", "Landroidx/work/WorkInfo;", "removeObserver", "Lkotlin/Function1;", "getMyHeaderInfoObserver", "getNotificationCountObserver", "getReciprocalRelationshipEnable", "getTimelineObserver", "getTopFriendsWithTimeline", "observeSyncIfEmpty", "isHasMore", "logError", "T", "Ljava/lang/Exception;", "Lkotlin/Exception;", "mapFeedModelsBasedOnFeedVersion", "Lid/dana/social/model/FeedViewHolderModel;", "socialFeed", "observeFetchNotificationCount", "observeInitFeed", "onDestroy", "onInitFeedError", "refreshFeeds", "resetPresenter", "waitToFetchNotificationCount", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setLeftButtonIcon implements setLeftButtonText.length {
    @NotNull
    public static final setMax setMax = new setMax((byte) 0);
    @NotNull
    private Function0<Unit> FastBitmap$CoordinateSystem = create.INSTANCE;
    private final access$3500 Grayscale$Algorithm;
    private final isStatePreservationOn ICustomTabsCallback;
    /* access modifiers changed from: private */
    public boolean IsOverlapping = true;
    private final getModel Mean$Arithmetic;
    private final empty b;
    private final setDEFAULT_ARMA_SPEED create;
    private GriverAppVirtualHostProxy<getScanCallbackIntent> equals;
    private final sendData getCause;
    final InfoAndroidLogger getMax;
    public GriverAppVirtualHostProxy<onReceivedIcon> getMin;
    private GriverAppVirtualHostProxy<setMonitoringStatus> hashCode;
    private final AUIconDrawable invoke;
    private final updateNewlyOutside invokeSuspend;
    /* access modifiers changed from: private */
    public boolean isInside;
    private IComponent<onReceivedIcon> length;
    private final ArmaRssiFilter onMessageChannelReady;
    private final fromBundle onNavigationEvent;
    boolean setMin;
    /* access modifiers changed from: private */
    public final setLeftButtonText.getMax toDoubleRange;
    /* access modifiers changed from: private */
    public String toFloatRange;
    /* access modifiers changed from: private */
    public String toIntRange = "";
    private final stateOf toString;
    /* access modifiers changed from: private */
    public final access$3600 valueOf;
    @NotNull
    private setBeaconParsers values = new setBeaconParsers(InitStatus.NOT_ACTIVATED, 0, (Exception) null, false, 14, (DefaultConstructorMarker) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class create extends Lambda implements Function0<Unit> {
        public static final create INSTANCE = new create();

        create() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ setLeftButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(setLeftButtonIcon setleftbuttonicon) {
            super(1);
            this.this$0 = setleftbuttonicon;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.this$0.toDoubleRange.setMax(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ setLeftButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(setLeftButtonIcon setleftbuttonicon) {
            super(1);
            this.this$0 = setleftbuttonicon;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.toDoubleRange.length(z);
            if (z) {
                setLeftButtonIcon setleftbuttonicon = this.this$0;
                setleftbuttonicon.getMax.execute(onReceivedIcon.INSTANCE, new IsOverlapping(setleftbuttonicon), toFloatRange.INSTANCE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ setLeftButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(setLeftButtonIcon setleftbuttonicon) {
            super(1);
            this.this$0 = setleftbuttonicon;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.toDoubleRange.getMin(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/InitFeed;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invoke extends Lambda implements Function1<TitleBarRightButtonView.AnonymousClass1<setBeaconParsers>, Unit> {
        final /* synthetic */ setLeftButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invoke(setLeftButtonIcon setleftbuttonicon) {
            super(1);
            this.this$0 = setleftbuttonicon;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TitleBarRightButtonView.AnonymousClass1<setBeaconParsers>) (TitleBarRightButtonView.AnonymousClass1) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull TitleBarRightButtonView.AnonymousClass1<setBeaconParsers> r2) {
            Intrinsics.checkNotNullParameter(r2, "it");
            r2.subscribe((GriverProgressBar<? super setBeaconParsers>) setLeftButtonIcon.getMax(this.this$0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ setLeftButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invokeSuspend(setLeftButtonIcon setleftbuttonicon) {
            super(1);
            this.this$0 = setleftbuttonicon;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            this.this$0.getMax(exc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Throwable, Unit> {
        public static final isInside INSTANCE = new isInside();

        isInside() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            StringBuilder sb = new StringBuilder("[FeedNotification] onError:  ");
            sb.append(th.getLocalizedMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.FEED_NOTIFICATION, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.FEED_COMMENT, "Error fetching feature_comment", th);
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
            StringBuilder sb = new StringBuilder("[FeedNotification] onError:  ");
            sb.append(th.getLocalizedMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.FEED_NOTIFICATION, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function1<Throwable, Unit> {
        public static final toString INSTANCE = new toString();

        toString() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            StringBuilder sb = new StringBuilder("[FeedReciprocalRelationship] onError:  ");
            sb.append(th.getLocalizedMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.FEED_RECIPROCAL_RELATIONSHIP, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/FeedHomeConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function1<getMonitoringStatus, Unit> {
        final /* synthetic */ setLeftButtonIcon this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(setLeftButtonIcon setleftbuttonicon) {
            super(1);
            this.this$0 = setleftbuttonicon;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getMonitoringStatus) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getMonitoringStatus getmonitoringstatus) {
            Intrinsics.checkNotNullParameter(getmonitoringstatus, "it");
            this.this$0.toDoubleRange.setMin(getmonitoringstatus.isReciprocalFeedEnabled());
        }
    }

    @Inject
    public setLeftButtonIcon(@NotNull setLeftButtonText.getMax getmax, @NotNull stateOf stateof, @NotNull updateNewlyOutside updatenewlyoutside, @NotNull access$3600 access_3600, @NotNull access$3500 access_3500, @NotNull AUIconDrawable aUIconDrawable, @NotNull getModel getmodel, @NotNull isStatePreservationOn isstatepreservationon, @NotNull fromBundle frombundle, @NotNull empty empty, @NotNull InfoAndroidLogger infoAndroidLogger, @NotNull setDEFAULT_ARMA_SPEED setdefault_arma_speed, @NotNull sendData senddata, @NotNull ArmaRssiFilter armaRssiFilter) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(stateof, "getTimeline");
        Intrinsics.checkNotNullParameter(updatenewlyoutside, "getTimelineWithTopFriends");
        Intrinsics.checkNotNullParameter(access_3600, "feedMapper");
        Intrinsics.checkNotNullParameter(access_3500, "groupedFeedMapper");
        Intrinsics.checkNotNullParameter(aUIconDrawable, "feedsContentAction");
        Intrinsics.checkNotNullParameter(getmodel, "getInitFeedObservable");
        Intrinsics.checkNotNullParameter(isstatepreservationon, "initFeedPeriodically");
        Intrinsics.checkNotNullParameter(frombundle, "getMyFeedsHeaderInfo");
        Intrinsics.checkNotNullParameter(empty, "getFeedCommentEnable");
        Intrinsics.checkNotNullParameter(infoAndroidLogger, "fetchFeedNotificationCount");
        Intrinsics.checkNotNullParameter(setdefault_arma_speed, "getFeedNotificationEnable");
        Intrinsics.checkNotNullParameter(senddata, "getUserInfo");
        Intrinsics.checkNotNullParameter(armaRssiFilter, "getFeedConfig");
        this.toDoubleRange = getmax;
        this.toString = stateof;
        this.invokeSuspend = updatenewlyoutside;
        this.valueOf = access_3600;
        this.Grayscale$Algorithm = access_3500;
        this.invoke = aUIconDrawable;
        this.Mean$Arithmetic = getmodel;
        this.ICustomTabsCallback = isstatepreservationon;
        this.onNavigationEvent = frombundle;
        this.b = empty;
        this.getMax = infoAndroidLogger;
        this.create = setdefault_arma_speed;
        this.getCause = senddata;
        this.onMessageChannelReady = armaRssiFilter;
        IComponent<onReceivedIcon> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create()");
        this.length = max;
        if (max == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fetchNotificationCountObserver");
        }
        TitleBarRightButtonView.AnonymousClass1<onReceivedIcon> observeOn = max.debounce(1000, TimeUnit.MILLISECONDS).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length());
        GriverAppVirtualHostProxy<onReceivedIcon> todoublerange = new toDoubleRange(this);
        this.getMin = todoublerange;
        if (todoublerange == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationCountPublishSubjectObserver");
        }
        observeOn.subscribe((GriverProgressBar<? super onReceivedIcon>) todoublerange);
    }

    public final void getMax(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.FastBitmap$CoordinateSystem = function0;
    }

    @NotNull
    public final setBeaconParsers toDoubleRange() {
        return this.values;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/contract/friendsfeeds/FriendsFeedsPresenter$initFeedObservable$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/InitFeed;", "onError", "", "e", "", "onNext", "result", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class valueOf extends GriverAppVirtualHostProxy<setBeaconParsers> {
        final /* synthetic */ setLeftButtonIcon getMin;

        valueOf(setLeftButtonIcon setleftbuttonicon) {
            this.getMin = setleftbuttonicon;
        }

        public final /* synthetic */ void onNext(Object obj) {
            setBeaconParsers setbeaconparsers = (setBeaconParsers) obj;
            Intrinsics.checkNotNullParameter(setbeaconparsers, "result");
            setLeftButtonIcon.getMax(this.getMin, setbeaconparsers);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMin.getMax(new Exception(th));
        }
    }

    public final void getMin() {
        if (!this.setMin) {
            this.setMin = true;
            setMin(false);
            RedDotManager length2 = Functions.length();
            RedDotManager length3 = Functions.length();
            removeStateDidChangeHandler removestatedidchangehandler = Functions.length;
            setFavoriteBtnVisibility max = setFavoriteBtnVisibility.length(3000, TimeUnit.MILLISECONDS).getMax(length2, length3, new getMin(this), removestatedidchangehandler, removestatedidchangehandler, Functions.length);
            hasCornerMarking length4 = hideProgress.length();
            setRefreshAnimation.getMax(length4, "scheduler is null");
            setFavoriteBtnVisibility setheaderviewheight = new setHeaderViewHeight(max, length4);
            RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable = SecuritySignature.valueOf;
            if (redDotDrawable != null) {
                setheaderviewheight = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable, setheaderviewheight);
            }
            setheaderviewheight.v_();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements removeStateDidChangeHandler {
        final /* synthetic */ setLeftButtonIcon length;

        getMin(setLeftButtonIcon setleftbuttonicon) {
            this.length = setleftbuttonicon;
        }

        public final void getMax() {
            this.length.setMin = false;
        }
    }

    public final void equals() {
        if (!this.Mean$Arithmetic.isObserved()) {
            this.Mean$Arithmetic.execute(Unit.INSTANCE, new invoke(this), new invokeSuspend(this));
        }
    }

    public final void IsOverlapping() {
        buildModelMapWithLock.execute$default(this.ICustomTabsCallback, Unit.INSTANCE, (Function1) null, new setLeftButtonIcon$Mean$Arithmetic(this), 2, (Object) null);
    }

    public final void toIntRange() {
        this.toIntRange = "";
        this.IsOverlapping = true;
        this.isInside = false;
        this.valueOf.getMax = -1;
        setMin(true);
        this.getCause.execute(new length(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"id/dana/social/contract/friendsfeeds/FriendsFeedsPresenter$getFullSyncObserver$1", "Landroidx/lifecycle/Observer;", "", "Landroidx/work/WorkInfo;", "onChanged", "", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements onMeasure<List<? extends WorkInfo>> {
        final /* synthetic */ setLeftButtonIcon getMax;
        final /* synthetic */ Function1 getMin;

        toIntRange(setLeftButtonIcon setleftbuttonicon, Function1 function1) {
            this.getMax = setleftbuttonicon;
            this.getMin = function1;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                try {
                    WorkInfo workInfo = (WorkInfo) CollectionsKt.firstOrNull(list);
                    if (workInfo == null) {
                        return;
                    }
                    if (workInfo.getMax.getMin("All_CONTACT_SYNCHED")) {
                        this.getMin.invoke(this);
                        this.getMax.setMin(false);
                        return;
                    }
                    int i = setBackBtnInfo.getMin[workInfo.getMin.ordinal()];
                    if (i == 1 || i == 2 || i == 3) {
                        this.getMax.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.setMax.length);
                    } else if (i == 4 || i == 5) {
                        this.getMin.invoke(this);
                        this.getMax.setMin(false);
                    }
                } catch (Exception unused) {
                    this.getMax.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.getMin.setMax);
                }
            }
        }
    }

    @NotNull
    public final onMeasure<List<WorkInfo>> setMax(@NotNull Function1<? super onMeasure<List<WorkInfo>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "removeObserver");
        return new toIntRange(this, function1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/contract/friendsfeeds/FriendsFeedsPresenter$checkUsername$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/UserInfoResponse;", "onError", "", "e", "", "onNext", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<disconnect> {
        final /* synthetic */ setLeftButtonIcon getMin;

        length(setLeftButtonIcon setleftbuttonicon) {
            this.getMin = setleftbuttonicon;
        }

        public final /* synthetic */ void onNext(Object obj) {
            disconnect disconnect = (disconnect) obj;
            Intrinsics.checkNotNullParameter(disconnect, "data");
            if (disconnect.getUsername().length() == 0) {
                this.getMin.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.hashCode.length);
            } else {
                this.getMin.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.toString.getMax);
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, message, th);
        }
    }

    public final void values() {
        this.getCause.execute(new length(this));
    }

    public final void toFloatRange() {
        this.b.execute(onReceivedIcon.INSTANCE, new getMax(this), setMin.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/contract/friendsfeeds/FriendsFeedsPresenter$getNotificationCountObserver$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/core/usecase/NoParams;", "onError", "", "throwable", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange extends GriverAppVirtualHostProxy<onReceivedIcon> {
        final /* synthetic */ setLeftButtonIcon setMin;

        toDoubleRange(setLeftButtonIcon setleftbuttonicon) {
            this.setMin = setleftbuttonicon;
        }

        public final /* synthetic */ void onNext(Object obj) {
            Intrinsics.checkNotNullParameter((onReceivedIcon) obj, SecurityConstants.KEY_TEXT);
            setLeftButtonIcon setleftbuttonicon = this.setMin;
            setleftbuttonicon.getMax.execute(onReceivedIcon.INSTANCE, new IsOverlapping(setleftbuttonicon), toFloatRange.INSTANCE);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            StringBuilder sb = new StringBuilder("[FeedNotification] onError:  ");
            sb.append(th.getLocalizedMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.FEED_NOTIFICATION, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/contract/friendsfeeds/FriendsFeedsPresenter$getMyHeaderInfoObserver$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/MyFeedsHeaderInfo;", "onError", "", "e", "", "onNext", "myFeedsHeaderInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class hashCode extends GriverAppVirtualHostProxy<setMonitoringStatus> {
        final /* synthetic */ setLeftButtonIcon getMin;

        hashCode(setLeftButtonIcon setleftbuttonicon) {
            this.getMin = setleftbuttonicon;
        }

        public final /* synthetic */ void onNext(Object obj) {
            setMonitoringStatus setmonitoringstatus = (setMonitoringStatus) obj;
            Intrinsics.checkNotNullParameter(setmonitoringstatus, "myFeedsHeaderInfo");
            setLeftButtonText.getMax length = this.getMin.toDoubleRange;
            setFocusable.setMax setmax = setFocusable.setMin;
            length.getMin(setFocusable.setMax.setMin(setmonitoringstatus));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public final void getMax(Exception exc) {
        setBeaconParsers setbeaconparsers = new setBeaconParsers(InitStatus.ERROR, 0, (Exception) null, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setbeaconparsers, "<set-?>");
        this.values = setbeaconparsers;
        this.Mean$Arithmetic.dispose();
        this.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.length.setMax);
        updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(getModel.class, getClass(), String.valueOf(exc.getCause())));
    }

    @NotNull
    public final String length() {
        String str = this.toFloatRange;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentUserId");
        }
        return str;
    }

    public final void setMin(boolean z) {
        this.isInside = false;
        GriverAppVirtualHostProxy<getScanCallbackIntent> griverAppVirtualHostProxy = this.equals;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
        }
        this.equals = null;
        this.toIntRange = "";
        this.IsOverlapping = true;
        this.valueOf.getMax = -1;
        this.invokeSuspend.execute(new setLeftButtonIcon$Grayscale$Algorithm(this, z), new updateNewlyOutside.setMax(50));
    }

    public final void getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "redirectValue");
        this.invoke.getMax(str);
    }

    public final void getMax(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "redirectValue");
        this.invoke.getMax(hashMap);
    }

    public final boolean getMax() {
        return this.IsOverlapping;
    }

    public final void FastBitmap$CoordinateSystem() {
        IComponent<onReceivedIcon> iComponent = this.length;
        if (iComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fetchNotificationCountObserver");
        }
        iComponent.onNext(onReceivedIcon.INSTANCE);
    }

    public final void invoke() {
        this.create.execute(onReceivedIcon.INSTANCE, new equals(this), isInside.INSTANCE);
    }

    public final void invokeSuspend() {
        this.onMessageChannelReady.execute(onReceivedIcon.INSTANCE, new values(this), toString.INSTANCE);
    }

    public final void setMax() {
        this.Mean$Arithmetic.dispose();
        this.ICustomTabsCallback.dispose();
        this.invoke.setMin.dispose();
        this.toString.dispose();
        this.onNavigationEvent.dispose();
        this.getMax.dispose();
        GriverAppVirtualHostProxy<onReceivedIcon> griverAppVirtualHostProxy = this.getMin;
        if (griverAppVirtualHostProxy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationCountPublishSubjectObserver");
        }
        griverAppVirtualHostProxy.dispose();
        this.create.dispose();
        this.getCause.dispose();
        this.onMessageChannelReady.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/social/contract/friendsfeeds/FriendsFeedsPresenter$Companion;", "", "()V", "DEFAULT_DEBOUNCE_TIME", "", "ON_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void setMin() {
        GriverAppVirtualHostProxy<setMonitoringStatus> griverAppVirtualHostProxy = this.hashCode;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
        }
        this.hashCode = null;
        fromBundle frombundle = this.onNavigationEvent;
        GriverAppVirtualHostProxy<setMonitoringStatus> hashcode = new hashCode(this);
        this.hashCode = hashcode;
        frombundle.execute(hashcode);
    }

    public final void isInside() {
        GriverAppVirtualHostProxy<getScanCallbackIntent> griverAppVirtualHostProxy = this.equals;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
        }
        this.equals = null;
        stateOf stateof = this.toString;
        GriverAppVirtualHostProxy<getScanCallbackIntent> setleftbuttonicon_fastbitmap_coordinatesystem = new setLeftButtonIcon$FastBitmap$CoordinateSystem(this);
        this.equals = setleftbuttonicon_fastbitmap_coordinatesystem;
        stateof.execute(setleftbuttonicon_fastbitmap_coordinatesystem, new stateOf.setMin(50, this.toIntRange, (String) null, (Integer) null, CollectionsKt.emptyList()));
    }

    public static final /* synthetic */ void getMax(setLeftButtonIcon setleftbuttonicon, setBeaconParsers setbeaconparsers) {
        Intrinsics.checkNotNullParameter(setbeaconparsers, "<set-?>");
        setleftbuttonicon.values = setbeaconparsers;
        int i = setBackBtnInfo.length[setbeaconparsers.getStatus().ordinal()];
        if (i == 1) {
            setleftbuttonicon.FastBitmap$CoordinateSystem.invoke();
            setleftbuttonicon.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.getMax.getMin);
        } else if (i == 2) {
            setleftbuttonicon.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.C0066setMin.getMax);
        } else if (i != 3) {
            setleftbuttonicon.getMax(setbeaconparsers.getError());
        } else {
            setleftbuttonicon.toDoubleRange.length((setLeftButtonText.setMin) setLeftButtonText.setMin.IsOverlapping.getMax);
        }
    }

    public static final /* synthetic */ GriverAppVirtualHostProxy getMax(setLeftButtonIcon setleftbuttonicon) {
        return new valueOf(setleftbuttonicon);
    }

    public static final /* synthetic */ List setMax(setLeftButtonIcon setleftbuttonicon, getScanCallbackIntent getscancallbackintent) {
        if (getscancallbackintent.isFeedNotVersionTwo()) {
            return setleftbuttonicon.Grayscale$Algorithm.length(new Date(), getscancallbackintent.getGroupedActivities(), access$3500.length.INSTANCE);
        }
        List list = (List) setleftbuttonicon.valueOf.apply(getscancallbackintent.getActivities());
        return list == null ? CollectionsKt.emptyList() : list;
    }
}
