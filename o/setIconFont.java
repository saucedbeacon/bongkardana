package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.social.model.FeedModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BeaconService;
import o.DetectionTracker;
import o.H5SplitCompatUtils;
import o.access$1702;
import o.access$3600;
import o.getBackButton;
import o.reclaimScrapViews;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u001e\u0010\u001c\u001a\u00020\u001a2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001eH\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0004\u001a\u00020\u001aH\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\b\u0010&\u001a\u00020\u001aH\u0016J\u0018\u0010'\u001a\u00020\u001a2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lid/dana/social/contract/MyFeedsPresenter;", "Lid/dana/social/contract/MyFeedsContract$Presenter;", "view", "Lid/dana/social/contract/MyFeedsContract$View;", "getMyFeeds", "Lid/dana/domain/social/interactor/GetMyFeeds;", "feedMapper", "Lid/dana/social/model/mapper/FeedMapper;", "feedsContentAction", "Lid/dana/social/utils/FeedsContentAction;", "markNotificationAsRead", "Lid/dana/domain/notificationcenter/interactor/MarkNotificationAsRead;", "getGlobalNotification", "Lid/dana/domain/social/interactor/GetGlobalNotification;", "checkFeedHighlight", "Lid/dana/domain/featureconfig/interactor/CheckFeedHighlight;", "(Lid/dana/social/contract/MyFeedsContract$View;Lid/dana/domain/social/interactor/GetMyFeeds;Lid/dana/social/model/mapper/FeedMapper;Lid/dana/social/utils/FeedsContentAction;Lid/dana/domain/notificationcenter/interactor/MarkNotificationAsRead;Lid/dana/domain/social/interactor/GetGlobalNotification;Lid/dana/domain/featureconfig/interactor/CheckFeedHighlight;)V", "feedsObserver", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "hasMore", "", "maxId", "", "minId", "checkFeedHighlightEnable", "", "disposeFeedsObserver", "doFeedsContentAction", "redirectValue", "Ljava/util/HashMap;", "getFeedsObserver", "getGlobalNotifications", "isHasMore", "markAsRead", "feedViewModel", "Lid/dana/social/model/FeedViewHolderModel;", "onDestroy", "refreshFeeds", "setMinId", "activities", "", "Lid/dana/domain/social/model/ActivityResponse;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setIconFont implements getBackButton.length {
    @NotNull
    public static final getMin setMax = new getMin((byte) 0);
    private final H5SplitCompatUtils IsOverlapping;
    /* access modifiers changed from: private */
    public final getBackButton.getMin equals;
    private String getMax;
    /* access modifiers changed from: private */
    public boolean getMin = true;
    private final getDomStorageEnabled hashCode;
    /* access modifiers changed from: private */
    public final access$3600 isInside;
    /* access modifiers changed from: private */
    public String length;
    private GriverAppVirtualHostProxy<getScanCallbackIntent> setMin;
    private final BeaconService.IncomingHandler toDoubleRange;
    private final DetectionTracker toFloatRange;
    private final AUIconDrawable toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMin extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        setMin(getBackButton.getMin getmin) {
            super(1, getmin, getBackButton.getMin.class, "onGetFeedHighlightEnableSuccess", "onGetFeedHighlightEnableSuccess(Z)V", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((getBackButton.getMin) this.receiver).setMax(z);
        }
    }

    @Inject
    public setIconFont(@NotNull getBackButton.getMin getmin, @NotNull DetectionTracker detectionTracker, @NotNull access$3600 access_3600, @NotNull AUIconDrawable aUIconDrawable, @NotNull H5SplitCompatUtils h5SplitCompatUtils, @NotNull BeaconService.IncomingHandler incomingHandler, @NotNull getDomStorageEnabled getdomstorageenabled) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(detectionTracker, "getMyFeeds");
        Intrinsics.checkNotNullParameter(access_3600, "feedMapper");
        Intrinsics.checkNotNullParameter(aUIconDrawable, "feedsContentAction");
        Intrinsics.checkNotNullParameter(h5SplitCompatUtils, "markNotificationAsRead");
        Intrinsics.checkNotNullParameter(incomingHandler, "getGlobalNotification");
        Intrinsics.checkNotNullParameter(getdomstorageenabled, "checkFeedHighlight");
        this.equals = getmin;
        this.toFloatRange = detectionTracker;
        this.isInside = access_3600;
        this.toIntRange = aUIconDrawable;
        this.IsOverlapping = h5SplitCompatUtils;
        this.toDoubleRange = incomingHandler;
        this.hashCode = getdomstorageenabled;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/contract/MyFeedsPresenter$markAsRead$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/notificationcenter/model/MarkNotificationResponse;", "onError", "", "e", "", "onNext", "markNotificationResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<bytesToHexString> {
        final /* synthetic */ setIconFont getMax;
        final /* synthetic */ setEmptyView length;

        toFloatRange(setIconFont seticonfont, setEmptyView setemptyview) {
            this.getMax = seticonfont;
            this.length = setemptyview;
        }

        public final /* synthetic */ void onNext(Object obj) {
            bytesToHexString bytestohexstring = (bytesToHexString) obj;
            Intrinsics.checkNotNullParameter(bytestohexstring, "markNotificationResponse");
            if (bytestohexstring.isSuccess()) {
                FeedModel feedModel = this.length.setMax;
                if (feedModel != null) {
                    feedModel.isInside = true;
                }
                this.getMax.equals.setMin(this.length);
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
        }
    }

    public final void length(@NotNull setEmptyView setemptyview) {
        String str;
        Intrinsics.checkNotNullParameter(setemptyview, "feedViewModel");
        H5SplitCompatUtils h5SplitCompatUtils = this.IsOverlapping;
        setGlobalUserData tofloatrange = new toFloatRange(this, setemptyview);
        FeedModel feedModel = setemptyview.setMax;
        if (feedModel != null) {
            str = feedModel.setMin;
        } else {
            str = null;
        }
        h5SplitCompatUtils.execute(tofloatrange, H5SplitCompatUtils.getMin.forMarkNotificationAsRead(str));
    }

    public final void length() {
        this.hashCode.execute(onReceivedIcon.INSTANCE, new setMin(this.equals), length.INSTANCE);
    }

    public final void getMax(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "redirectValue");
        this.toIntRange.getMax(hashMap);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/contract/MyFeedsPresenter$getGlobalNotifications$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
        final /* synthetic */ setIconFont setMax;

        setMax(setIconFont seticonfont) {
            this.setMax = seticonfont;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
            Intrinsics.checkNotNullParameter(getscancallbackintent, "data");
            getBackButton.getMin min = this.setMax.equals;
            access$1702.setMax setmax = access$1702.getMin;
            Intrinsics.checkNotNullParameter(getscancallbackintent, "socialFeed");
            access$1702.setMax setmax2 = access$1702.getMin;
            min.setMax(new access$1702(new reclaimScrapViews.setMax(access$1702.setMax.setMin(getscancallbackintent.getActivities())), getscancallbackintent.getHasMore(), getscancallbackintent.getMaxId(), (Function0) null, 24));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
            this.setMax.equals.setMax(new access$1702(reclaimScrapViews.getMin.setMin, false, (String) null, (Function0) null, 30));
        }
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "maxId");
        this.toDoubleRange.execute(new setMax(this), new BeaconService.IncomingHandler.getMax(10, str, ""));
    }

    public final void setMin() {
        this.length = null;
        this.getMax = null;
        this.getMin = true;
        this.isInside.getMax = -1;
        getMin();
    }

    public final void getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "redirectValue");
        this.toIntRange.getMax(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/contract/MyFeedsPresenter$getFeedsObserver$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "response", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
        final /* synthetic */ setIconFont getMin;

        getMax(setIconFont seticonfont) {
            this.getMin = seticonfont;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
            Intrinsics.checkNotNullParameter(getscancallbackintent, "response");
            this.getMin.getMin = getscancallbackintent.getHasMore();
            if (getscancallbackintent.getHasMore() || this.getMin.length == null) {
                this.getMin.length = getscancallbackintent.getMaxId();
            }
            setIconFont.setMax(this.getMin, getscancallbackintent.getActivities());
            getBackButton.getMin min = this.getMin.equals;
            access$3600 min2 = this.getMin.isInside;
            List<RssiFilter> activities = getscancallbackintent.getActivities();
            Intrinsics.checkNotNullParameter(activities, "oldItem");
            min.getMin(min2.getMax(activities, 5, (Function1<? super RssiFilter, Boolean>) access$3600.setMin.INSTANCE));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString());
            this.getMin.equals.getMin();
        }
    }

    public final boolean getMax() {
        return this.getMin;
    }

    public final void setMax() {
        this.toIntRange.setMin.dispose();
        this.toFloatRange.dispose();
        this.IsOverlapping.dispose();
        this.toDoubleRange.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/social/contract/MyFeedsPresenter$Companion;", "", "()V", "GLOBAL_NOTIFICATION_PAGE_SIZE", "", "ON_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void getMin() {
        GriverAppVirtualHostProxy<getScanCallbackIntent> griverAppVirtualHostProxy = this.setMin;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
        }
        this.setMin = null;
        DetectionTracker detectionTracker = this.toFloatRange;
        GriverAppVirtualHostProxy<getScanCallbackIntent> getmax = new getMax(this);
        this.setMin = getmax;
        detectionTracker.execute(getmax, new DetectionTracker.length(50, this.length, (String) null));
    }

    public static final /* synthetic */ void setMax(setIconFont seticonfont, List list) {
        if (seticonfont.getMax == null && list != null && (!list.isEmpty())) {
            seticonfont.getMax = ((RssiFilter) list.get(0)).getId();
        }
    }
}
