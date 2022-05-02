package id.dana.social.view.activity.detail;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.OauthModule;
import id.dana.model.ThirdPartyService;
import id.dana.social.bottomsheet.ReportFeedCommentsBottomSheetDialog;
import id.dana.social.di.module.FeedCommentModule;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import id.dana.social.state.FeedCommentModelState;
import id.dana.social.view.AppBarStateChangeListener;
import id.dana.social.view.CommentListView;
import id.dana.social.view.FeedInputCommentView;
import id.dana.social.view.FeedsView;
import id.dana.social.view.ReactionSectionView;
import id.dana.social.view.activity.SocialProfileActivity;
import id.dana.tracker.TrackerKey;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUHorizontalListView;
import o.AUIconDrawable;
import o.AUPopSupportPreemption;
import o.AUSegment;
import o.CornerMarkingDataProvider;
import o.access$1602;
import o.addDividerView;
import o.confirmCheckedPositionsById;
import o.dispatchOnCancelled;
import o.fillGap;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.recycleOnMeasure;
import o.resetInternal;
import o.resurrectSelectionIfNeeded;
import o.setBuildNumber;
import o.setCancelText;
import o.setEmptyView;
import o.setMyBeaconListener;
import o.setNextSelectedPositionInt;
import o.setRightButtonStyle;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001&\u0018\u0000 K2\u00020\u0001:\u0001KB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020,H\u0014J\u0012\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020,H\u0002J\b\u00101\u001a\u00020$H\u0016J\b\u00102\u001a\u00020,H\u0002J\b\u00103\u001a\u00020,H\u0002J\b\u00104\u001a\u00020,H\u0016J\b\u00105\u001a\u00020,H\u0002J\u0006\u00106\u001a\u00020,J\b\u00107\u001a\u00020,H\u0002J\b\u00108\u001a\u00020,H\u0002J\u0010\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\fH\u0002J\b\u0010;\u001a\u00020)H\u0002J\u0010\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010@\u001a\u00020,2\u0006\u0010:\u001a\u00020\fH\u0002J\b\u0010A\u001a\u00020,H\u0002J\b\u0010B\u001a\u00020,H\u0002J\b\u0010C\u001a\u00020,H\u0002J\u0010\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020\fH\u0002J\u0018\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020&X\u0004¢\u0006\u0004\n\u0002\u0010'R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lid/dana/social/view/activity/detail/SocialActivityDetail;", "Lid/dana/base/BaseActivity;", "()V", "currentUser", "Lid/dana/social/model/ActivityReactionsUserModel;", "feedCommentPresenter", "Lid/dana/social/contract/FeedCommentContract$Presenter;", "getFeedCommentPresenter", "()Lid/dana/social/contract/FeedCommentContract$Presenter;", "setFeedCommentPresenter", "(Lid/dana/social/contract/FeedCommentContract$Presenter;)V", "feedData", "Lid/dana/social/model/FeedModel;", "feedsContentAction", "Lid/dana/social/utils/FeedsContentAction;", "getFeedsContentAction", "()Lid/dana/social/utils/FeedsContentAction;", "setFeedsContentAction", "(Lid/dana/social/utils/FeedsContentAction;)V", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "lavLoadingAnimation", "Lcom/airbnb/lottie/LottieAnimationView;", "reportFeedCommentsBottomSheetDialog", "Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog;", "getReportFeedCommentsBottomSheetDialog", "()Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog;", "reportFeedCommentsBottomSheetDialog$delegate", "Lkotlin/Lazy;", "selectedFeedCommentModel", "Lid/dana/social/model/FeedCommentModel;", "selectedFeedCommentPosition", "", "socialFeedClickListener", "id/dana/social/view/activity/detail/SocialActivityDetail$socialFeedClickListener$1", "Lid/dana/social/view/activity/detail/SocialActivityDetail$socialFeedClickListener$1;", "stopRefreshAnimationOnRepeat", "", "tempCommentId", "configToolbar", "", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "fetchDataBubble", "getLayout", "getUserInfo", "handleSocialFeedDetailBundleData", "init", "initAppBarLayout", "initComponent", "initPullToRefreshComponent", "initPullToRefreshHeaderView", "isCurrentUser", "feedModel", "isLoadingAnimationInitialized", "openProfileActivity", "it", "Lid/dana/social/model/RelationshipItemModel;", "openReportCommentBottomSheet", "openSelfProfileActivity", "refreshActivitydetail", "setupCommentList", "setupFeedInputCommentView", "showBubbleData", "data", "showToast", "bg", "title", "", "stopRefresh", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SocialActivityDetail extends BaseActivity {
    @NotNull
    public static final String BUNDLE_FEED_DATA = "bundle_feed_data";
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    /* access modifiers changed from: private */
    public static final int hashCode = CornerMarkingDataProvider.AnonymousClass2.setMax();
    /* access modifiers changed from: private */
    public boolean IsOverlapping;
    /* access modifiers changed from: private */
    public int equals;
    @Inject
    public setRightButtonStyle.getMin feedCommentPresenter;
    @Inject
    public AUIconDrawable feedsContentAction;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    /* access modifiers changed from: private */
    public int getMax;
    /* access modifiers changed from: private */
    public resurrectSelectionIfNeeded getMin;
    /* access modifiers changed from: private */
    public recycleOnMeasure isInside = new recycleOnMeasure((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127);
    private final Lazy setMax = LazyKt.lazy(isInside.INSTANCE);
    private HashMap toDoubleRange;
    /* access modifiers changed from: private */
    public final SocialActivityDetail$FastBitmap$CoordinateSystem toFloatRange = new SocialActivityDetail$FastBitmap$CoordinateSystem(this);
    /* access modifiers changed from: private */
    public FeedModel toIntRange;
    /* access modifiers changed from: private */
    public LottieAnimationView values;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toDoubleRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (length2 = dispatchOnCancelled.length(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, length2, 4);
            onCancelLoad.setMax(1858174235, oncanceled);
            onCancelLoad.getMin(1858174235, oncanceled);
        }
        if (this.toDoubleRange == null) {
            this.toDoubleRange = new HashMap();
        }
        View view = (View) this.toDoubleRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toDoubleRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || 782266663 == (max = dispatchOnCancelled.getMax(applicationContext, 782266663))) {
            return R.layout.activity_comment_detail;
        }
        onCanceled oncanceled = new onCanceled(782266663, max, 512);
        onCancelLoad.setMax(782266663, oncanceled);
        onCancelLoad.getMin(782266663, oncanceled);
        return R.layout.activity_comment_detail;
    }

    public static final /* synthetic */ LottieAnimationView access$getLavLoadingAnimation$p(SocialActivityDetail socialActivityDetail) {
        LottieAnimationView lottieAnimationView = socialActivityDetail.values;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        return lottieAnimationView;
    }

    public static final /* synthetic */ void access$showToast(SocialActivityDetail socialActivityDetail, int i, String str) {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(364286401, oncanceled);
            onCancelLoad.getMin(364286401, oncanceled);
        }
        Context baseContext = socialActivityDetail.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(364286401, oncanceled2);
            onCancelLoad.getMin(364286401, oncanceled2);
        }
        setCancelText setcanceltext = setCancelText.length;
        setCancelText.setMax(socialActivityDetail, i, str, 80, 24);
    }

    @NotNull
    public final setRightButtonStyle.getMin getFeedCommentPresenter() {
        setRightButtonStyle.getMin getmin = this.feedCommentPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedCommentPresenter");
        }
        return getmin;
    }

    public final void setFeedCommentPresenter(@NotNull setRightButtonStyle.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.feedCommentPresenter = getmin;
    }

    @NotNull
    public final AUHorizontalListView.SelectionNotifier getFriendshipAnalyticTracker() {
        AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
        if (selectionNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
        }
        return selectionNotifier;
    }

    public final void setFriendshipAnalyticTracker(@NotNull AUHorizontalListView.SelectionNotifier selectionNotifier) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1849626867, oncanceled);
            onCancelLoad.getMin(-1849626867, oncanceled);
        }
        Intrinsics.checkNotNullParameter(selectionNotifier, "<set-?>");
        this.friendshipAnalyticTracker = selectionNotifier;
    }

    @NotNull
    public final AUIconDrawable getFeedsContentAction() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(648484912, oncanceled);
            onCancelLoad.getMin(648484912, oncanceled);
        }
        AUIconDrawable aUIconDrawable = this.feedsContentAction;
        if (aUIconDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedsContentAction");
        }
        return aUIconDrawable;
    }

    public final void setFeedsContentAction(@NotNull AUIconDrawable aUIconDrawable) {
        Intrinsics.checkNotNullParameter(aUIconDrawable, "<set-?>");
        this.feedsContentAction = aUIconDrawable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<ReportFeedCommentsBottomSheetDialog> {
        public static final isInside INSTANCE = new isInside();

        isInside() {
            super(0);
        }

        @NotNull
        public final ReportFeedCommentsBottomSheetDialog invoke() {
            return new ReportFeedCommentsBottomSheetDialog();
        }
    }

    public final void configToolbar() {
        setCenterTitle(getString(R.string.feed_detail_title));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    public final void init() {
        String str;
        Bundle extras;
        int length2;
        int min;
        FeedModel feedModel;
        int length3;
        int min2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length3)))) {
            onCanceled oncanceled = new onCanceled(length3, min2, 32);
            onCancelLoad.setMax(1121298620, oncanceled);
            onCancelLoad.getMin(1121298620, oncanceled);
        }
        initComponent();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras2 = intent.getExtras();
        if (!(extras2 == null || (feedModel = (FeedModel) extras2.getParcelable(BUNDLE_FEED_DATA)) == null)) {
            this.toIntRange = feedModel;
            boolean z = false;
            if (feedModel.setMin.length() > 0) {
                setRightButtonStyle.getMin getmin = this.feedCommentPresenter;
                if (getmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("feedCommentPresenter");
                }
                getmin.length(feedModel.setMin);
            }
            CharSequence charSequence = feedModel.getMax;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (z) {
                setMax();
            } else {
                Intrinsics.checkNotNullExpressionValue(feedModel, "it");
                setMin(feedModel);
            }
        }
        FeedInputCommentView feedInputCommentView = (FeedInputCommentView) _$_findCachedViewById(resetInternal.setMax.Px);
        if (feedInputCommentView != null) {
            feedInputCommentView.setListener(new toIntRange(this));
        }
        if (this.feedCommentPresenter != null) {
            setRightButtonStyle.getMin getmin2 = this.feedCommentPresenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedCommentPresenter");
            }
            getmin2.getMax();
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onWindowVisibilityChanged);
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setPtrHandler(new getMax(this));
        }
        PtrClassicFrameLayout ptrClassicFrameLayout2 = (PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onWindowVisibilityChanged);
        if (ptrClassicFrameLayout2 != null) {
            ptrClassicFrameLayout2.disableWhenHorizontalMove(true);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = applicationContext2.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext2, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1394714509, oncanceled2);
            onCancelLoad.getMin(1394714509, oncanceled2);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout3 = (PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onWindowVisibilityChanged);
        Intrinsics.checkNotNullExpressionValue(ptrClassicFrameLayout3, "ptr_activity_detail");
        ptrClassicFrameLayout3.setHeaderView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.view_pull_to_refresh_header, (ViewGroup) null));
        PtrClassicFrameLayout ptrClassicFrameLayout4 = (PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onWindowVisibilityChanged);
        Intrinsics.checkNotNullExpressionValue(ptrClassicFrameLayout4, "ptr_activity_detail");
        View findViewById = ptrClassicFrameLayout4.getHeaderView().findViewById(R.id.f51622131363718);
        Intrinsics.checkNotNullExpressionValue(findViewById, "ptr_activity_detail.head…id.lav_loading_animation)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        this.values = lottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        lottieAnimationView.addAnimatorListener(new IsOverlapping(this));
        AppBarLayout appBarLayout = (AppBarLayout) _$_findCachedViewById(resetInternal.setMax.setMin);
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new getMin(this));
        }
        AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
        if (selectionNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
        }
        Intent intent2 = getIntent();
        if (intent2 == null || (extras = intent2.getExtras()) == null || (str = extras.getString("Source")) == null) {
            str = TrackerKey.SourceType.FRIENDS_FEED;
        }
        Intrinsics.checkNotNullExpressionValue(str, "intent?.extras?.getStrin…y.SOURCE) ?: FRIENDS_FEED");
        selectionNotifier.setMax(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0011¸\u0006\u0000"}, d2 = {"id/dana/social/view/activity/detail/SocialActivityDetail$setupCommentList$1$1", "Lid/dana/social/view/CommentListInteraction;", "deleteComment", "", "feedCommentModel", "Lid/dana/social/model/FeedCommentModel;", "getFeedComment", "isHasMore", "", "isOwnActivity", "openProfile", "relationshipItemModel", "Lid/dana/social/model/RelationshipItemModel;", "openReportCommentBottomSheet", "position", "", "submitComment", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements addDividerView {
        final /* synthetic */ SocialActivityDetail setMax;

        toFloatRange(SocialActivityDetail socialActivityDetail) {
            this.setMax = socialActivityDetail;
        }

        public final boolean setMax() {
            FeedModel access$getFeedData$p = this.setMax.toIntRange;
            if (access$getFeedData$p != null) {
                return access$getFeedData$p.getMax();
            }
            return false;
        }

        public final void getMax(@NotNull RelationshipItemModel relationshipItemModel) {
            Intrinsics.checkNotNullParameter(relationshipItemModel, "relationshipItemModel");
            SocialActivityDetail.access$openProfileActivity(this.setMax, relationshipItemModel);
        }

        public final void getMax(@NotNull resurrectSelectionIfNeeded resurrectselectionifneeded) {
            Intrinsics.checkNotNullParameter(resurrectselectionifneeded, "feedCommentModel");
            this.setMax.getFeedCommentPresenter().getMax(resurrectselectionifneeded.getMax);
        }

        public final boolean getMax() {
            return this.setMax.getFeedCommentPresenter().setMin();
        }

        public final void getMin() {
            String str;
            setRightButtonStyle.getMin feedCommentPresenter = this.setMax.getFeedCommentPresenter();
            FeedModel access$getFeedData$p = this.setMax.toIntRange;
            if (access$getFeedData$p != null) {
                str = access$getFeedData$p.toFloatRange;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            feedCommentPresenter.setMin(str);
        }

        public final void length(@NotNull resurrectSelectionIfNeeded resurrectselectionifneeded, int i) {
            Intrinsics.checkNotNullParameter(resurrectselectionifneeded, "feedCommentModel");
            this.setMax.getMin = resurrectselectionifneeded;
            this.setMax.getMax = i;
            SocialActivityDetail socialActivityDetail = this.setMax;
            SocialActivityDetail.access$openReportCommentBottomSheet(socialActivityDetail, SocialActivityDetail.access$getReportFeedCommentsBottomSheetDialog$p(socialActivityDetail));
        }

        public final void getMin(@NotNull resurrectSelectionIfNeeded resurrectselectionifneeded) {
            String str;
            Intrinsics.checkNotNullParameter(resurrectselectionifneeded, "feedCommentModel");
            setRightButtonStyle.getMin feedCommentPresenter = this.setMax.getFeedCommentPresenter();
            FeedModel access$getFeedData$p = this.setMax.toIntRange;
            if (access$getFeedData$p != null) {
                str = access$getFeedData$p.toFloatRange;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            feedCommentPresenter.setMax(resurrectselectionifneeded, str);
        }
    }

    private final void length() {
        String str;
        CommentListView commentListView = (CommentListView) _$_findCachedViewById(resetInternal.setMax.ComponentActivity$4);
        if (commentListView != null) {
            commentListView.setCommentListInteraction(new toFloatRange(this));
            commentListView.setupFeedCommentList();
            commentListView.showShimmer();
        }
        setRightButtonStyle.getMin getmin = this.feedCommentPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedCommentPresenter");
        }
        FeedModel feedModel = this.toIntRange;
        if (feedModel != null) {
            str = feedModel.toFloatRange;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        getmin.setMin(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/social/view/activity/detail/SocialActivityDetail$initAppBarLayout$1", "Lid/dana/social/view/AppBarStateChangeListener;", "onStateChanged", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "state", "Lid/dana/social/view/AppBarStateChangeListener$State;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends AppBarStateChangeListener {
        final /* synthetic */ SocialActivityDetail setMax;

        getMin(SocialActivityDetail socialActivityDetail) {
            this.setMax = socialActivityDetail;
        }

        public final void setMax(@NotNull AppBarLayout appBarLayout, @NotNull AppBarStateChangeListener.State state) {
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            Intrinsics.checkNotNullParameter(state, "state");
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) this.setMax._$_findCachedViewById(resetInternal.setMax.onWindowVisibilityChanged);
            if (ptrClassicFrameLayout != null) {
                ptrClassicFrameLayout.setEnabled(state == AppBarStateChangeListener.State.EXPANDED);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean getMax() {
        return this.values != null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/view/activity/detail/SocialActivityDetail$initPullToRefreshComponent$1", "Lin/srain/cube/views/ptr/PtrHandler;", "checkCanDoRefresh", "", "frame", "Lin/srain/cube/views/ptr/PtrFrameLayout;", "content", "Landroid/view/View;", "header", "onRefreshBegin", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements access$1602 {
        final /* synthetic */ SocialActivityDetail getMin;

        getMax(SocialActivityDetail socialActivityDetail) {
            this.getMin = socialActivityDetail;
        }

        public final void getMax() {
            if (this.getMin.getMax()) {
                SocialActivityDetail.access$getLavLoadingAnimation$p(this.getMin).playAnimation();
            }
            SocialActivityDetail.access$refreshActivitydetail(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"id/dana/social/view/activity/detail/SocialActivityDetail$initPullToRefreshHeaderView$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements Animator.AnimatorListener {
        final /* synthetic */ SocialActivityDetail getMin;

        public final void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        public final void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        IsOverlapping(SocialActivityDetail socialActivityDetail) {
            this.getMin = socialActivityDetail;
        }

        public final void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.onWindowVisibilityChanged);
            if (ptrClassicFrameLayout != null) {
                ptrClassicFrameLayout.refreshComplete();
                this.getMin.IsOverlapping = false;
            }
        }

        public final void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            if (this.getMin.IsOverlapping && this.getMin.getMax()) {
                SocialActivityDetail.access$getLavLoadingAnimation$p(this.getMin).cancelAnimation();
            }
        }
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof EditText) {
                Rect rect = new Rect();
                FeedInputCommentView feedInputCommentView = (FeedInputCommentView) _$_findCachedViewById(resetInternal.setMax.Px);
                if (feedInputCommentView != null) {
                    feedInputCommentView.getGlobalVisibleRect(rect);
                }
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    setMyBeaconListener.setMin(this, currentFocus);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void initComponent() {
        DanaApplication danaApplication = getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            FeedCommentModule feedCommentModule = new FeedCommentModule(new length(this));
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            Activity activity = this;
            max.getMax = activity;
            max.length = TrackerKey.SourceType.FRIENDSHIP_FRIENDS_FEED;
            DeepLinkModule deepLinkModule = new DeepLinkModule(max, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(deepLinkModule, "DeepLinkModule.builder()…HIP_FRIENDS_FEED).build()");
            ScanQrModule.setMin max2 = ScanQrModule.getMax();
            max2.setMin = activity;
            ScanQrModule scanQrModule = new ScanQrModule(max2, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(scanQrModule, "ScanQrModule.builder()\n …                 .build()");
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = activity;
            RestoreUrlModule restoreUrlModule = new RestoreUrlModule(min, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(restoreUrlModule, "RestoreUrlModule.builder…                 .build()");
            FeatureModule.length length2 = FeatureModule.length();
            length2.setMax = activity;
            FeatureModule featureModule = new FeatureModule(length2, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(featureModule, "FeatureModule.builder()\n…                 .build()");
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = activity;
            OauthModule oauthModule = new OauthModule(min2, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(oauthModule, "OauthModule.builder()\n  …                 .build()");
            socialCommonComponent.getMin(feedCommentModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, new ServicesModule((style.getMin) new setMin())).length(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        setRightButtonStyle.getMin getmin = this.feedCommentPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedCommentPresenter");
        }
        getminArr[0] = getmin;
        registerPresenter(getminArr);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u0019¸\u0006\u0000"}, d2 = {"id/dana/social/view/activity/detail/SocialActivityDetail$initComponent$1$1", "Lid/dana/social/contract/FeedCommentContract$View;", "onErrorGetFeedComment", "", "e", "", "onFailedDeleteComment", "onFailedReportComment", "onFailedSubmitComment", "feedCommentModel", "Lid/dana/social/model/FeedCommentModel;", "onFetchDataBubbleFailed", "onFetchDataBubbleSuccess", "feedData", "Lid/dana/social/model/FeedViewHolderModel;", "onGetFeedComment", "Lid/dana/social/model/FeedCommentResultModel;", "onGetUserInfo", "activityReactionsUserModel", "Lid/dana/social/model/ActivityReactionsUserModel;", "onSuccessDeleteComment", "onSuccessReportComment", "onSuccessSubmitCommentStatus", "addActivityCommentModel", "Lid/dana/social/model/AddActivityCommentModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements setRightButtonStyle.length {
        final /* synthetic */ SocialActivityDetail length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(SocialActivityDetail socialActivityDetail) {
            this.length = socialActivityDetail;
        }

        public final void getMin(@NotNull resurrectSelectionIfNeeded resurrectselectionifneeded, @NotNull fillGap fillgap) {
            Intrinsics.checkNotNullParameter(resurrectselectionifneeded, "feedCommentModel");
            Intrinsics.checkNotNullParameter(fillgap, "addActivityCommentModel");
            CommentListView commentListView = (CommentListView) this.length._$_findCachedViewById(resetInternal.setMax.ComponentActivity$4);
            if (commentListView != null) {
                CommentListView.updateCommentState$default(commentListView, resurrectselectionifneeded, fillgap, false, 4, (Object) null);
            }
        }

        public final void getMin(@NotNull resurrectSelectionIfNeeded resurrectselectionifneeded) {
            Intrinsics.checkNotNullParameter(resurrectselectionifneeded, "feedCommentModel");
            CommentListView commentListView = (CommentListView) this.length._$_findCachedViewById(resetInternal.setMax.ComponentActivity$4);
            if (commentListView != null) {
                CommentListView.updateCommentState$default(commentListView, resurrectselectionifneeded, (fillGap) null, false, 6, (Object) null);
            }
        }

        public final void setMin() {
            SocialActivityDetail socialActivityDetail = this.length;
            String string = socialActivityDetail.getString(R.string.feed_comment_delete_success);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.feed_comment_delete_success)");
            SocialActivityDetail.access$showToast(socialActivityDetail, R.drawable.bg_rounded_border_green_50, string);
        }

        public final void getMin() {
            SocialActivityDetail socialActivityDetail = this.length;
            String string = socialActivityDetail.getString(R.string.feed_comment_report_failed_toast_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.feed_…ort_failed_toast_message)");
            SocialActivityDetail.access$showToast(socialActivityDetail, R.drawable.bg_rounded_border_red_50, string);
        }

        public final void getMax() {
            FeedModel access$getFeedData$p = this.length.toIntRange;
            if (access$getFeedData$p != null) {
                this.length.setMin(access$getFeedData$p);
            }
        }

        public final void getMin(@NotNull confirmCheckedPositionsById confirmcheckedpositionsbyid) {
            Bundle extras;
            Intrinsics.checkNotNullParameter(confirmcheckedpositionsbyid, "feedCommentModel");
            CommentListView commentListView = (CommentListView) this.length._$_findCachedViewById(resetInternal.setMax.ComponentActivity$4);
            if (commentListView != null) {
                commentListView.onGetFeedComment(confirmcheckedpositionsbyid);
            }
            this.length.IsOverlapping = true;
            Intent intent = this.length.getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                CommentListView commentListView2 = (CommentListView) this.length._$_findCachedViewById(resetInternal.setMax.ComponentActivity$4);
                if (commentListView2 != null) {
                    String string = extras.getString("commentID");
                    if (string == null) {
                        string = "";
                    }
                    commentListView2.showDim(string);
                }
                extras.remove("commentID");
            }
        }

        public final void length(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            CommentListView commentListView = (CommentListView) this.length._$_findCachedViewById(resetInternal.setMax.ComponentActivity$4);
            if (commentListView != null) {
                commentListView.onErrorGetFeedComment();
            }
            this.length.IsOverlapping = true;
        }

        public final void setMax() {
            CommentListView commentListView = (CommentListView) this.length._$_findCachedViewById(resetInternal.setMax.ComponentActivity$4);
            if (commentListView != null) {
                commentListView.removeItem(this.length.getMax);
            }
            SocialActivityDetail.access$getReportFeedCommentsBottomSheetDialog$p(this.length).dismiss();
            SocialActivityDetail socialActivityDetail = this.length;
            String string = socialActivityDetail.getString(R.string.feed_comment_report_success_toast_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.feed_…rt_success_toast_message)");
            SocialActivityDetail.access$showToast(socialActivityDetail, R.drawable.bg_rounded_border_green_50, string);
        }

        public final void length() {
            SocialActivityDetail.access$getReportFeedCommentsBottomSheetDialog$p(this.length).dismiss();
            SocialActivityDetail socialActivityDetail = this.length;
            String string = socialActivityDetail.getString(R.string.feed_comment_report_failed_toast_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.feed_…ort_failed_toast_message)");
            SocialActivityDetail.access$showToast(socialActivityDetail, R.drawable.bg_rounded_border_red_50, string);
        }

        public final void setMin(@NotNull recycleOnMeasure recycleonmeasure) {
            Intrinsics.checkNotNullParameter(recycleonmeasure, "activityReactionsUserModel");
            this.length.isInside = recycleonmeasure;
        }

        public final void setMin(@NotNull setEmptyView setemptyview) {
            Intrinsics.checkNotNullParameter(setemptyview, "feedData");
            FeedModel feedModel = setemptyview.setMax;
            if (feedModel != null) {
                this.length.setMin(feedModel);
            }
            this.length.toIntRange = setemptyview.setMax;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/social/view/activity/detail/SocialActivityDetail$initComponent$1$2", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements style.getMin {
        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
        }

        @JvmDefault
        public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
            Intrinsics.checkNotNullParameter(str, "authCode");
        }

        @JvmDefault
        public final void getMax(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void getMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void length() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMax(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void setMax(boolean z) {
        }

        @JvmDefault
        public final void setMin() {
        }

        @JvmDefault
        public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
        }

        @JvmDefault
        public final void setMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin() {
        }
    }

    /* access modifiers changed from: private */
    public final void setMin(FeedModel feedModel) {
        this.toIntRange = feedModel;
        length();
        FeedsView feedsView = (FeedsView) _$_findCachedViewById(resetInternal.setMax.PluralsRes);
        if (feedsView != null) {
            feedsView.setProfileAvatar(setBuildNumber.getAvatar(feedModel.equals, 9, feedModel.IsOverlapping));
            FeedModel.setMax setmax = FeedModel.Grayscale$Algorithm;
            Context context = feedsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            feedsView.setDesc(FeedModel.setMax.setMin(context, feedModel, this.toFloatRange));
            feedsView.setDate(feedModel.getMin);
            feedsView.setReactionVisibility(false);
            feedsView.setShowCommentButton(false);
        }
        ReactionSectionView reactionSectionView = (ReactionSectionView) _$_findCachedViewById(resetInternal.setMax.setWindowTitle);
        if (reactionSectionView != null) {
            reactionSectionView.setupDetailActivityView(feedModel);
            ReactionSectionView.setReactionsContentView$default(reactionSectionView, feedModel, 0, 2, (Object) null);
        }
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getPlaybackState);
        if (circleImageView != null) {
            circleImageView.setOnClickListener(new hashCode(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements View.OnClickListener {
        final /* synthetic */ SocialActivityDetail getMin;

        hashCode(SocialActivityDetail socialActivityDetail) {
            this.getMin = socialActivityDetail;
        }

        public final void onClick(View view) {
            this.getMin.toFloatRange.getMin(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/view/activity/detail/SocialActivityDetail$setupFeedInputCommentView$1", "Lid/dana/social/common/FeedInputCommentListener;", "onSubmitButtonClicked", "", "content", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements AUSegment.AnonymousClass4 {
        final /* synthetic */ SocialActivityDetail setMin;

        toIntRange(SocialActivityDetail socialActivityDetail) {
            this.setMin = socialActivityDetail;
        }

        public final void setMax(@NotNull String str) {
            String str2;
            Intrinsics.checkNotNullParameter(str, "content");
            resurrectSelectionIfNeeded resurrectselectionifneeded = new resurrectSelectionIfNeeded(String.valueOf(this.setMin.equals), this.setMin.isInside, str, true, "", FeedCommentModelState.SENDING);
            CommentListView commentListView = (CommentListView) this.setMin._$_findCachedViewById(resetInternal.setMax.ComponentActivity$4);
            if (commentListView != null) {
                commentListView.insertComment(resurrectselectionifneeded);
            }
            setRightButtonStyle.getMin feedCommentPresenter = this.setMin.getFeedCommentPresenter();
            FeedModel access$getFeedData$p = this.setMin.toIntRange;
            String str3 = null;
            if (access$getFeedData$p != null) {
                str2 = access$getFeedData$p.toFloatRange;
            } else {
                str2 = null;
            }
            String str4 = "";
            if (str2 == null) {
                str2 = str4;
            }
            feedCommentPresenter.setMax(resurrectselectionifneeded, str2);
            SocialActivityDetail socialActivityDetail = this.setMin;
            socialActivityDetail.equals = socialActivityDetail.equals + 1;
            AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker = this.setMin.getFriendshipAnalyticTracker();
            FeedModel access$getFeedData$p2 = this.setMin.toIntRange;
            if (access$getFeedData$p2 != null) {
                str3 = access$getFeedData$p2.toIntRange;
            }
            if (str3 != null) {
                str4 = str3;
            }
            friendshipAnalyticTracker.toFloatRange(str4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"id/dana/social/view/activity/detail/SocialActivityDetail$openReportCommentBottomSheet$1$1", "Lid/dana/social/bottomsheet/ReportFeedCommentsBottomSheetDialog$BottomSheetListener;", "onNegativeButtonClicked", "", "submitReportComment", "reason", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements ReportFeedCommentsBottomSheetDialog.setMax {
        final /* synthetic */ ReportFeedCommentsBottomSheetDialog getMin;
        final /* synthetic */ SocialActivityDetail setMax;

        equals(ReportFeedCommentsBottomSheetDialog reportFeedCommentsBottomSheetDialog, SocialActivityDetail socialActivityDetail) {
            this.getMin = reportFeedCommentsBottomSheetDialog;
            this.setMax = socialActivityDetail;
        }

        public final void getMin() {
            this.getMin.dismiss();
        }

        public final void setMax(@NotNull String str) {
            String str2;
            Intrinsics.checkNotNullParameter(str, ZdocRecordService.REASON);
            resurrectSelectionIfNeeded access$getSelectedFeedCommentModel$p = this.setMax.getMin;
            if (access$getSelectedFeedCommentModel$p != null) {
                setRightButtonStyle.getMin feedCommentPresenter = this.setMax.getFeedCommentPresenter();
                String str3 = access$getSelectedFeedCommentModel$p.getMax;
                FeedModel access$getFeedData$p = this.setMax.toIntRange;
                if (access$getFeedData$p != null) {
                    str2 = access$getFeedData$p.toFloatRange;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                feedCommentPresenter.getMax(str3, str, str2);
            }
        }
    }

    private final void setMax() {
        String str;
        FeedModel feedModel = this.toIntRange;
        if (feedModel == null || (str = feedModel.setMin) == null) {
            str = "";
        }
        List listOf = CollectionsKt.listOf(str);
        setRightButtonStyle.getMin getmin = this.feedCommentPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedCommentPresenter");
        }
        getmin.setMin((List<String>) listOf);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ*\u0010\t\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/social/view/activity/detail/SocialActivityDetail$Companion;", "", "()V", "ACTIVITY_DETAIL_REQUEST_CODE", "", "getACTIVITY_DETAIL_REQUEST_CODE", "()I", "BUNDLE_FEED_DATA", "", "openSocialFeedDetailActivity", "", "context", "Landroid/content/Context;", "data", "Lid/dana/social/model/FeedModel;", "Landroid/content/Intent;", "source", "commentId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        public static int setMax() {
            return SocialActivityDetail.hashCode;
        }

        public static void setMax(@NotNull Context context, @NotNull FeedModel feedModel) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(feedModel, "data");
            Intent intent = new Intent(context, SocialActivityDetail.class);
            intent.addFlags(268435456);
            intent.putExtra(SocialActivityDetail.BUNDLE_FEED_DATA, feedModel);
            context.startActivity(intent);
        }

        @NotNull
        public static Intent getMax(@NotNull Context context, @NotNull FeedModel feedModel, @Nullable String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(feedModel, "data");
            Intrinsics.checkNotNullParameter(str2, "commentId");
            Intent intent = new Intent(context, SocialActivityDetail.class);
            intent.addFlags(268435456);
            intent.putExtra(SocialActivityDetail.BUNDLE_FEED_DATA, feedModel);
            intent.putExtra("commentID", str2);
            intent.putExtra("Source", str);
            return intent;
        }
    }

    /* access modifiers changed from: private */
    public final boolean getMin(FeedModel feedModel) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1595056999, oncanceled);
            onCancelLoad.getMin(-1595056999, oncanceled);
        }
        HashMap<String, String> hashMap = feedModel.IsOverlapping;
        String userId = hashMap != null ? setBuildNumber.getUserId(hashMap) : null;
        setRightButtonStyle.getMin getmin = this.feedCommentPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedCommentPresenter");
        }
        return Intrinsics.areEqual((Object) userId, (Object) getmin.getMin());
    }

    public static final /* synthetic */ void access$openProfileActivity(SocialActivityDetail socialActivityDetail, RelationshipItemModel relationshipItemModel) {
        Context baseContext = socialActivityDetail.getBaseContext();
        if (baseContext != null) {
            SocialProfileActivity.getMin getmin = SocialProfileActivity.Companion;
            SocialProfileActivity.getMin.setMin(baseContext, relationshipItemModel);
        }
    }

    public static final /* synthetic */ void access$openReportCommentBottomSheet(SocialActivityDetail socialActivityDetail, ReportFeedCommentsBottomSheetDialog reportFeedCommentsBottomSheetDialog) {
        reportFeedCommentsBottomSheetDialog.show(socialActivityDetail.getSupportFragmentManager(), "");
        reportFeedCommentsBottomSheetDialog.getMax = new equals(reportFeedCommentsBottomSheetDialog, socialActivityDetail);
    }

    public static final /* synthetic */ ReportFeedCommentsBottomSheetDialog access$getReportFeedCommentsBottomSheetDialog$p(SocialActivityDetail socialActivityDetail) {
        return (ReportFeedCommentsBottomSheetDialog) socialActivityDetail.setMax.getValue();
    }

    public static final /* synthetic */ void access$refreshActivitydetail(SocialActivityDetail socialActivityDetail) {
        CommentListView commentListView = (CommentListView) socialActivityDetail._$_findCachedViewById(resetInternal.setMax.ComponentActivity$4);
        if (commentListView != null) {
            commentListView.resetItems();
        }
        CommentListView commentListView2 = (CommentListView) socialActivityDetail._$_findCachedViewById(resetInternal.setMax.ComponentActivity$4);
        if (commentListView2 != null) {
            commentListView2.showShimmer();
        }
        setRightButtonStyle.getMin getmin = socialActivityDetail.feedCommentPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedCommentPresenter");
        }
        getmin.length();
        socialActivityDetail.setMax();
    }

    public static final /* synthetic */ void access$openSelfProfileActivity(SocialActivityDetail socialActivityDetail, FeedModel feedModel) {
        RelationshipItemModel max = setNextSelectedPositionInt.setMax(feedModel);
        Intrinsics.checkNotNullParameter("SELF", "<set-?>");
        max.getMax = "SELF";
        Context baseContext = socialActivityDetail.getBaseContext();
        if (baseContext != null) {
            SocialProfileActivity.getMin getmin = SocialProfileActivity.Companion;
            SocialProfileActivity.getMin.setMin(baseContext, max);
        }
    }
}
