package o;

import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.social.ModifyRelationOperationType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import o.addChooseImageCrossOrigin;
import o.getRightButtonIconView;
import o.reloadParsers;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GBW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\u001e\u00107\u001a\u0002052\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b09H\u0016J\u0010\u00107\u001a\u0002052\u0006\u00108\u001a\u00020\u001bH\u0016J\b\u0010\u0013\u001a\u000205H\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00190(H\u0002J\b\u0010;\u001a\u000205H\u0016J\u0010\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020\u001bH\u0016J\u0010\u0010>\u001a\u0002052\u0006\u0010=\u001a\u00020\u001bH\u0016J\b\u0010?\u001a\u00020\u0019H\u0016J\u0018\u0010@\u001a\u0002052\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u001eH\u0016J\u0018\u0010B\u001a\u0002052\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u001eH\u0016J\b\u0010C\u001a\u000205H\u0002J\u0010\u0010D\u001a\u0002052\u0006\u0010=\u001a\u00020\u001bH\u0002J\b\u0010E\u001a\u000205H\u0016J\u0010\u0010F\u001a\u0002052\u0006\u0010=\u001a\u00020\u001bH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R(\u0010 \u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00190\u00190!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190(X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006H"}, d2 = {"Lid/dana/social/presenter/SocialProfilePresenter;", "Lid/dana/base/BasePresenter;", "Lid/dana/social/contract/SocialProfileContract$Presenter;", "view", "Lid/dana/social/contract/SocialProfileContract$View;", "modifyFollowingRelationshipWithPublishResult", "Lid/dana/domain/social/interactor/ModifyFollowingRelationshipWithPublishResult;", "getFriendProfile", "Lid/dana/domain/social/interactor/GetFriendProfile;", "observeProfileMuteUnmuteStatus", "Lid/dana/domain/social/interactor/ObserveProfileMuteUnmuteStatus;", "getFriendTimeline", "Lid/dana/domain/social/interactor/GetFriendTimeline;", "feedMapper", "Lid/dana/social/model/mapper/FeedMapper;", "feedsContentAction", "Lid/dana/social/utils/FeedsContentAction;", "getSettingByKey", "Lid/dana/domain/profilemenu/interactor/GetSettingByKey;", "getFeedCommentEnable", "Lid/dana/domain/social/interactor/GetFeedCommentEnable;", "modifyFollowerRelationshipWithPublishResult", "Lid/dana/domain/social/interactor/ModifyFollowerRelationshipWithPublishResult;", "(Lid/dana/social/contract/SocialProfileContract$View;Lid/dana/domain/social/interactor/ModifyFollowingRelationshipWithPublishResult;Lid/dana/domain/social/interactor/GetFriendProfile;Lid/dana/domain/social/interactor/ObserveProfileMuteUnmuteStatus;Lid/dana/domain/social/interactor/GetFriendTimeline;Lid/dana/social/model/mapper/FeedMapper;Lid/dana/social/utils/FeedsContentAction;Lid/dana/domain/profilemenu/interactor/GetSettingByKey;Lid/dana/domain/social/interactor/GetFeedCommentEnable;Lid/dana/domain/social/interactor/ModifyFollowerRelationshipWithPublishResult;)V", "hasMore", "", "maxId", "", "modifyFollowerRelationshipMap", "", "Lid/dana/domain/social/ModifyRelationOperationType;", "modifyFollowingRelationshipMap", "modifyRelationshipSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "getModifyRelationshipSubject", "()Lio/reactivex/subjects/PublishSubject;", "setModifyRelationshipSubject", "(Lio/reactivex/subjects/PublishSubject;)V", "modifyRelationshipSubjectObserver", "Lid/dana/domain/DefaultObserver;", "getModifyRelationshipSubjectObserver$app_productionRelease", "()Lid/dana/domain/DefaultObserver;", "setModifyRelationshipSubjectObserver$app_productionRelease", "(Lid/dana/domain/DefaultObserver;)V", "relationshipState", "getRelationshipState", "()Ljava/lang/String;", "setRelationshipState", "(Ljava/lang/String;)V", "getView", "()Lid/dana/social/contract/SocialProfileContract$View;", "callModifyFollowerRelationship", "", "callModifyFollowingRelationship", "doFeedsContentAction", "redirectValue", "Ljava/util/HashMap;", "getModifyRelationshipObserver", "getProfileSettingModel", "getUserProfileHeaderById", "userId", "getUserTimelineFeedByUserId", "isHasMore", "modifyFollowerRelationshipAction", "status", "modifyFollowingRelationshipAction", "observeModifyRelationship", "observeProfileChanges", "onDestroy", "refreshTimeline", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class clearTransientStateViews extends registerCallback implements getRightButtonIconView.setMax {
    @NotNull
    public static final setMin setMax = new setMin((byte) 0);
    private final updateBeacon FastBitmap$CoordinateSystem;
    private final empty Grayscale$Algorithm;
    private final Map<String, ModifyRelationOperationType> IsOverlapping;
    private final addChooseImageCrossOrigin Mean$Arithmetic;
    /* access modifiers changed from: private */
    public boolean equals;
    @NotNull
    String getMax = "ACTIVE";
    @NotNull
    final getRightButtonIconView.length getMin;
    private final reloadParsers hashCode;
    private final addLocalRegion invokeSuspend;
    /* access modifiers changed from: private */
    public String isInside;
    @NotNull
    private IComponent<Boolean> length;
    public GriverAppVirtualHostProxy<Boolean> setMin;
    private final getmMessenger toDoubleRange;
    private final Map<String, ModifyRelationOperationType> toFloatRange;
    private final finalizeBeacons toIntRange;
    /* access modifiers changed from: private */
    public final access$3600 toString;
    private final AUIconDrawable values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Map $modifyFollowingRelationshipData;
        final /* synthetic */ clearTransientStateViews this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(clearTransientStateViews cleartransientstateviews, Map map) {
            super(1);
            this.this$0 = cleartransientstateviews;
            this.$modifyFollowingRelationshipData = map;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            if (!this.$modifyFollowingRelationshipData.isEmpty()) {
                this.this$0.getMin.getMin();
            }
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, String.valueOf(th.getCause()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ Map $modifyFollowingRelationshipData;
        final /* synthetic */ clearTransientStateViews this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(clearTransientStateViews cleartransientstateviews, Map map) {
            super(1);
            this.this$0 = cleartransientstateviews;
            this.$modifyFollowingRelationshipData = map;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!this.$modifyFollowingRelationshipData.isEmpty()) {
                this.this$0.getMin.setMin((ModifyRelationOperationType) CollectionsKt.first(this.$modifyFollowingRelationshipData.values()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ clearTransientStateViews this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(clearTransientStateViews cleartransientstateviews) {
            super(1);
            this.this$0 = cleartransientstateviews;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.getMin.length(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ Map $modifyFollowerRelationshipData;
        final /* synthetic */ clearTransientStateViews this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(clearTransientStateViews cleartransientstateviews, Map map) {
            super(1);
            this.this$0 = cleartransientstateviews;
            this.$modifyFollowerRelationshipData = map;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!this.$modifyFollowerRelationshipData.isEmpty()) {
                this.this$0.getMin.setMin((ModifyRelationOperationType) CollectionsKt.first(this.$modifyFollowerRelationshipData.values()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Map $modifyFollowerRelationshipData;
        final /* synthetic */ clearTransientStateViews this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(clearTransientStateViews cleartransientstateviews, Map map) {
            super(1);
            this.this$0 = cleartransientstateviews;
            this.$modifyFollowerRelationshipData = map;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            if (!this.$modifyFollowerRelationshipData.isEmpty()) {
                this.this$0.getMin.getMin();
            }
            updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, String.valueOf(th.getCause()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
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

    @Inject
    public clearTransientStateViews(@NotNull getRightButtonIconView.length length2, @NotNull finalizeBeacons finalizebeacons, @NotNull getmMessenger getmmessenger, @NotNull updateBeacon updatebeacon, @NotNull reloadParsers reloadparsers, @NotNull access$3600 access_3600, @NotNull AUIconDrawable aUIconDrawable, @NotNull addChooseImageCrossOrigin addchooseimagecrossorigin, @NotNull empty empty, @NotNull addLocalRegion addlocalregion) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(finalizebeacons, "modifyFollowingRelationshipWithPublishResult");
        Intrinsics.checkNotNullParameter(getmmessenger, "getFriendProfile");
        Intrinsics.checkNotNullParameter(updatebeacon, "observeProfileMuteUnmuteStatus");
        Intrinsics.checkNotNullParameter(reloadparsers, "getFriendTimeline");
        Intrinsics.checkNotNullParameter(access_3600, "feedMapper");
        Intrinsics.checkNotNullParameter(aUIconDrawable, "feedsContentAction");
        Intrinsics.checkNotNullParameter(addchooseimagecrossorigin, "getSettingByKey");
        Intrinsics.checkNotNullParameter(empty, "getFeedCommentEnable");
        Intrinsics.checkNotNullParameter(addlocalregion, "modifyFollowerRelationshipWithPublishResult");
        this.getMin = length2;
        this.toIntRange = finalizebeacons;
        this.toDoubleRange = getmmessenger;
        this.FastBitmap$CoordinateSystem = updatebeacon;
        this.hashCode = reloadparsers;
        this.toString = access_3600;
        this.values = aUIconDrawable;
        this.Mean$Arithmetic = addchooseimagecrossorigin;
        this.Grayscale$Algorithm = empty;
        this.invokeSuspend = addlocalregion;
        IComponent<Boolean> max = IComponent.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create<Boolean>()");
        this.length = max;
        this.IsOverlapping = new LinkedHashMap();
        this.toFloatRange = new LinkedHashMap();
        this.equals = true;
        TitleBarRightButtonView.AnonymousClass1<Boolean> debounce = this.length.observeOn(hideProgress.length()).subscribeOn(getSecureSignatureComp.setMin()).debounce(800, TimeUnit.MILLISECONDS);
        GriverAppVirtualHostProxy<Boolean> tofloatrange = new toFloatRange(this);
        this.setMin = tofloatrange;
        if (tofloatrange == null) {
            Intrinsics.throwUninitializedPropertyAccessException("modifyRelationshipSubjectObserver");
        }
        debounce.subscribe((GriverProgressBar<? super Boolean>) tofloatrange);
    }

    public final void getMin(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(modifyRelationOperationType, "status");
        this.IsOverlapping.put(str, modifyRelationOperationType);
        this.length.onNext(Boolean.TRUE);
    }

    public final void getMax(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(modifyRelationOperationType, "status");
        this.toFloatRange.put(str, modifyRelationOperationType);
        this.length.onNext(Boolean.FALSE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/SocialProfilePresenter$getUserProfileHeaderById$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/RelationshipItem;", "onError", "", "e", "", "onNext", "relationshipItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverAppVirtualHostProxy<processScanResult> {
        final /* synthetic */ String getMax;
        final /* synthetic */ clearTransientStateViews length;

        IsOverlapping(clearTransientStateViews cleartransientstateviews, String str) {
            this.length = cleartransientstateviews;
            this.getMax = str;
        }

        public final /* synthetic */ void onNext(Object obj) {
            processScanResult processscanresult = (processScanResult) obj;
            Intrinsics.checkNotNullParameter(processscanresult, "relationshipItem");
            this.length.FastBitmap$CoordinateSystem.execute(new hashCode(this.length), this.getMax);
            clearTransientStateViews cleartransientstateviews = this.length;
            String status = processscanresult.getStatus();
            Intrinsics.checkNotNullParameter(status, "<set-?>");
            cleartransientstateviews.getMax = status;
            this.length.getMin.length(canAnimate.getMin(processscanresult));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.length.getMin.setMax();
        }
    }

    public final void getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userId");
        this.toDoubleRange.execute(new IsOverlapping(this, str), str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/presenter/SocialProfilePresenter$observeProfileChanges$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/RelationshipItem;", "onNext", "", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class hashCode extends GriverAppVirtualHostProxy<processScanResult> {
        final /* synthetic */ clearTransientStateViews getMin;

        hashCode(clearTransientStateViews cleartransientstateviews) {
            this.getMin = cleartransientstateviews;
        }

        public final /* synthetic */ void onNext(Object obj) {
            processScanResult processscanresult = (processScanResult) obj;
            Intrinsics.checkNotNullParameter(processscanresult, SecurityConstants.KEY_TEXT);
            this.getMin.getMin.setMin(processscanresult.getStatus());
        }
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "redirectValue");
        this.values.getMax(str);
    }

    public final boolean getMin() {
        return this.equals;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/SocialProfilePresenter$getProfileSettingModel$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/profilemenu/model/SettingModel;", "onError", "", "e", "", "onNext", "result", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends GriverAppVirtualHostProxy<SettingModel> {
        final /* synthetic */ clearTransientStateViews setMin;

        equals(clearTransientStateViews cleartransientstateviews) {
            this.setMin = cleartransientstateviews;
        }

        public final /* synthetic */ void onNext(Object obj) {
            SettingModel settingModel = (SettingModel) obj;
            Intrinsics.checkNotNullParameter(settingModel, "result");
            this.setMin.getMin.getMax(settingModel);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.e("RelationshipBottomSheetPresenter", th.getMessage(), th);
            this.setMin.getMin.length();
        }
    }

    public final void length() {
        this.Mean$Arithmetic.execute(new equals(this), addChooseImageCrossOrigin.setMax.forSettingKey("setting_more"));
    }

    public final void setMin() {
        this.Grayscale$Algorithm.execute(onReceivedIcon.INSTANCE, new isInside(this), toIntRange.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/social/presenter/SocialProfilePresenter$getModifyRelationshipObserver$1", "Lid/dana/domain/DefaultObserver;", "", "onComplete", "", "onError", "e", "", "onNext", "isFollowing", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ clearTransientStateViews setMax;

        public final void onComplete() {
        }

        toFloatRange(clearTransientStateViews cleartransientstateviews) {
            this.setMax = cleartransientstateviews;
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.setMax.getMax();
            } else {
                this.setMax.equals();
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            String simpleName = clearTransientStateViews.class.getSimpleName();
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(simpleName, sb.toString());
        }
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userId");
        this.isInside = "";
        this.equals = true;
        this.hashCode.execute(new toDoubleRange(this), new reloadParsers.getMax(50, this.isInside, "", str, 2, CollectionsKt.emptyList()));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/SocialProfilePresenter$refreshTimeline$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "socialFeed", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
        final /* synthetic */ clearTransientStateViews setMin;

        toDoubleRange(clearTransientStateViews cleartransientstateviews) {
            this.setMin = cleartransientstateviews;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
            Intrinsics.checkNotNullParameter(getscancallbackintent, "socialFeed");
            this.setMin.isInside = getscancallbackintent.getMaxId();
            this.setMin.equals = getscancallbackintent.getHasMore();
            getRightButtonIconView.length length = this.setMin.getMin;
            Object apply = this.setMin.toString.apply(getscancallbackintent.getActivities());
            Intrinsics.checkNotNull(apply);
            length.length((List<setEmptyView>) (List) apply);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            this.setMin.getMin.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/SocialProfilePresenter$getUserTimelineFeedByUserId$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "socialFeed", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toString extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
        final /* synthetic */ clearTransientStateViews getMin;

        toString(clearTransientStateViews cleartransientstateviews) {
            this.getMin = cleartransientstateviews;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
            Intrinsics.checkNotNullParameter(getscancallbackintent, "socialFeed");
            this.getMin.isInside = getscancallbackintent.getMaxId();
            this.getMin.equals = getscancallbackintent.getHasMore();
            getRightButtonIconView.length length = this.getMin.getMin;
            List list = (List) this.getMin.toString.apply(getscancallbackintent.getActivities());
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            length.getMax((List<setEmptyView>) list);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            this.getMin.getMin.setMin();
        }
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userId");
        this.hashCode.execute(new toString(this), new reloadParsers.getMax(50, this.isInside, "", str, 2, CollectionsKt.emptyList()));
    }

    /* access modifiers changed from: private */
    public final void getMax() {
        Map<String, ModifyRelationOperationType> map = MapsKt.toMap(this.IsOverlapping);
        this.IsOverlapping.clear();
        this.toIntRange.execute(map, new getMin(this, map), new getMax(this, map));
    }

    /* access modifiers changed from: private */
    public final void equals() {
        Map<String, ModifyRelationOperationType> map = MapsKt.toMap(this.toFloatRange);
        this.toFloatRange.clear();
        this.invokeSuspend.execute(map, new length(this, map), new setMax(this, map));
    }

    public final void setMax() {
        getMax();
        equals();
        this.toDoubleRange.dispose();
        this.FastBitmap$CoordinateSystem.dispose();
        this.hashCode.dispose();
        this.Mean$Arithmetic.dispose();
        this.Grayscale$Algorithm.dispose();
        GriverAppVirtualHostProxy<Boolean> griverAppVirtualHostProxy = this.setMin;
        if (griverAppVirtualHostProxy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("modifyRelationshipSubjectObserver");
        }
        griverAppVirtualHostProxy.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/social/presenter/SocialProfilePresenter$Companion;", "", "()V", "DEFAULT_MODIFY_RELATIONSHIP_DEBOUNCE_TIME", "", "DEFAULT_TIMELINE_PAGE", "ON_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
