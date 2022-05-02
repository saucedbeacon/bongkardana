package id.dana.social.view.activity.notification;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.social.di.module.FeedNotificationModule;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import id.dana.social.view.activity.detail.SocialActivityDetail;
import id.dana.tracker.TrackerKey;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.AUPopSupportPreemption;
import o.GriverRpcUtils;
import o.access$1602;
import o.dispatchOnCancelled;
import o.initContent;
import o.initStyleByTheme;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setBuildNumber;
import o.setCancelText;
import o.setEmptyView;
import o.setFocusableInTouchMode;
import o.setLeftButtonEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r*\u0001\u000f\u0018\u0000 A2\u00020\u0001:\u0001AB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0003J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\nH\u0002J\b\u0010%\u001a\u00020\nH\u0002J\b\u0010&\u001a\u00020\nH\u0002J\b\u0010'\u001a\u00020\nH\u0002J\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u0017H\u0002J\b\u0010+\u001a\u00020\u0017H\u0002J\u0012\u0010,\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u0017H\u0002J\u0010\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u0017H\u0002J\b\u00107\u001a\u00020\u0017H\u0002J\b\u00108\u001a\u00020\u0017H\u0002J\b\u00109\u001a\u00020\u0017H\u0002J\u0018\u0010:\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u001c2\u0006\u0010<\u001a\u000205H\u0002J\b\u0010=\u001a\u00020\u0017H\u0002J\u0010\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\nH\u0002J\b\u0010@\u001a\u00020\u0017H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\n\n\u0002\u0010\u0011\u0012\u0004\b\u0010\u0010\u0002R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lid/dana/social/view/activity/notification/FeedNotificationActivity;", "Lid/dana/base/BaseActivity;", "()V", "feedNotificationPresenter", "Lid/dana/social/contract/notification/FeedNotificationContract$Presenter;", "getFeedNotificationPresenter", "()Lid/dana/social/contract/notification/FeedNotificationContract$Presenter;", "setFeedNotificationPresenter", "(Lid/dana/social/contract/notification/FeedNotificationContract$Presenter;)V", "fetchingFeeds", "", "hasMoreNotification", "lavLoadingAnimation", "Lcom/airbnb/lottie/LottieAnimationView;", "notificationClickListener", "id/dana/social/view/activity/notification/FeedNotificationActivity$notificationClickListener$1", "getNotificationClickListener$annotations", "Lid/dana/social/view/activity/notification/FeedNotificationActivity$notificationClickListener$1;", "showCommentButton", "socialFeedsAdapter", "Lid/dana/social/adapter/SocialFeedsAdapter;", "stopRefreshAnimationOnRepeat", "appendLoading", "", "canScrollToLoadMore", "configToolbar", "doDelayDisableLoadMore", "getLastItemPosition", "", "getLayout", "init", "initBundleData", "initComponent", "initPullToRefreshComponent", "initPullToRefreshHeaderView", "initScrollListener", "isFeedsAdapterEmpty", "isFirstItemVisible", "isLastItemFeed", "isLoadingAnimationInitialized", "isValidFeedNotification", "itemType", "loadMoreNotification", "loadNotification", "onClickRightMenuButton", "view", "Landroid/view/View;", "onTouchBottom", "openActivityDetail", "feedModel", "Lid/dana/social/model/FeedModel;", "readSingleNotification", "notifId", "", "refreshNotification", "removeFetchingDataView", "setFetchingFeedsFalse", "setupNotificationListAdapter", "showToast", "bg", "title", "stopRefresh", "toggleEmptyStateView", "empty", "updateAllNotificationReadStatus", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FeedNotificationActivity extends BaseActivity {
    @NotNull
    public static final length Companion = new length((byte) 0);
    private final IsOverlapping IsOverlapping = new IsOverlapping(this);
    private boolean equals;
    @Inject
    public setLeftButtonEnabled.setMin feedNotificationPresenter;
    /* access modifiers changed from: private */
    public LottieAnimationView getMax;
    /* access modifiers changed from: private */
    public initStyleByTheme getMin;
    /* access modifiers changed from: private */
    public boolean isInside;
    /* access modifiers changed from: private */
    public boolean setMax;
    private HashMap toFloatRange;
    private boolean toIntRange;

    private final boolean getMin(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -798385719 == (max = dispatchOnCancelled.getMax(applicationContext, -798385719)))) {
            onCanceled oncanceled = new onCanceled(-798385719, max, 512);
            onCancelLoad.setMax(-798385719, oncanceled);
            onCancelLoad.getMin(-798385719, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(i);
        if (i != max2) {
            onCanceled oncanceled2 = new onCanceled(i, max2, 16);
            onCancelLoad.setMax(-798385719, oncanceled2);
            onCancelLoad.getMin(-798385719, oncanceled2);
        }
        return i == 14 || i == 15 || i == 13;
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2))) {
            return R.layout.activity_feed_notification;
        }
        onCanceled oncanceled = new onCanceled(length2, min, 32);
        onCancelLoad.setMax(844505796, oncanceled);
        onCancelLoad.getMin(844505796, oncanceled);
        return R.layout.activity_feed_notification;
    }

    public static final /* synthetic */ LottieAnimationView access$getLavLoadingAnimation$p(FeedNotificationActivity feedNotificationActivity) {
        LottieAnimationView lottieAnimationView = feedNotificationActivity.getMax;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        return lottieAnimationView;
    }

    public static final /* synthetic */ initStyleByTheme access$getSocialFeedsAdapter$p(FeedNotificationActivity feedNotificationActivity) {
        initStyleByTheme initstylebytheme = feedNotificationActivity.getMin;
        if (initstylebytheme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
        }
        return initstylebytheme;
    }

    public static final /* synthetic */ void access$onTouchBottom(FeedNotificationActivity feedNotificationActivity) {
        int length2;
        Context baseContext = feedNotificationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1107133182, oncanceled);
            onCancelLoad.getMin(-1107133182, oncanceled);
        }
        if (feedNotificationActivity.getMin()) {
            feedNotificationActivity.toIntRange = true;
            if (feedNotificationActivity.setMax()) {
                initStyleByTheme initstylebytheme = feedNotificationActivity.getMin;
                if (initstylebytheme == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
                }
                initstylebytheme.getMax(new setEmptyView(6, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
            }
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max, 16);
                onCancelLoad.setMax(94230945, oncanceled2);
                onCancelLoad.getMin(94230945, oncanceled2);
            }
            setLeftButtonEnabled.setMin setmin = feedNotificationActivity.feedNotificationPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedNotificationPresenter");
            }
            setmin.length();
        }
    }

    public static final /* synthetic */ void access$openActivityDetail(FeedNotificationActivity feedNotificationActivity, FeedModel feedModel) {
        String feedNotificationRelatedComment;
        String feedNotificationRelatedActivity;
        int max;
        FeedNotificationActivity feedNotificationActivity2 = feedNotificationActivity;
        FeedModel feedModel2 = feedModel;
        Context baseContext = feedNotificationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 754730884 == (max = dispatchOnCancelled.getMax(applicationContext, 754730884)))) {
            onCanceled oncanceled = new onCanceled(754730884, max, 512);
            onCancelLoad.setMax(754730884, oncanceled);
            onCancelLoad.getMin(754730884, oncanceled);
        }
        HashMap<String, String> hashMap = feedModel2.IsOverlapping;
        String str = "";
        String str2 = (hashMap == null || (feedNotificationRelatedActivity = setBuildNumber.getFeedNotificationRelatedActivity(hashMap)) == null) ? str : feedNotificationRelatedActivity;
        HashMap<String, String> hashMap2 = feedModel2.IsOverlapping;
        if (!(hashMap2 == null || (feedNotificationRelatedComment = setBuildNumber.getFeedNotificationRelatedComment(hashMap2)) == null)) {
            str = feedNotificationRelatedComment;
        }
        FeedModel feedModel3 = new FeedModel(str2, feedModel2.getMax, feedModel2.length, feedModel2.setMax, feedModel2.getMin, feedModel2.equals, feedModel.length(), feedModel2.IsOverlapping, feedModel2.toIntRange, str2, feedModel.getMax(), feedModel2.toDoubleRange, feedModel2.FastBitmap$CoordinateSystem, feedModel2.toString, (String) null, (String) null, 49152);
        SocialActivityDetail.setMax setmax = SocialActivityDetail.Companion;
        feedNotificationActivity2.startActivity(SocialActivityDetail.setMax.getMax(feedNotificationActivity2, feedModel3, TrackerKey.SourceType.FEED_NOTIFICATOIN_PAGE, str));
    }

    public static final /* synthetic */ void access$readSingleNotification(FeedNotificationActivity feedNotificationActivity, String str) {
        int max;
        Context baseContext = feedNotificationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1974117278 == (max = dispatchOnCancelled.getMax(applicationContext, -1974117278)))) {
            onCanceled oncanceled = new onCanceled(-1974117278, max, 512);
            onCancelLoad.setMax(-1974117278, oncanceled);
            onCancelLoad.getMin(-1974117278, oncanceled);
        }
        setLeftButtonEnabled.setMin setmin = feedNotificationActivity.feedNotificationPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedNotificationPresenter");
        }
        setmin.setMin(str);
    }

    public static final /* synthetic */ void access$setFetchingFeedsFalse(FeedNotificationActivity feedNotificationActivity) {
        int length2;
        int min;
        Context baseContext = feedNotificationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(580470627, oncanceled);
            onCancelLoad.getMin(580470627, oncanceled);
        }
        feedNotificationActivity.toIntRange = false;
    }

    public static final /* synthetic */ void access$showToast(FeedNotificationActivity feedNotificationActivity, int i, String str) {
        int length2;
        Context baseContext = feedNotificationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (length2 = dispatchOnCancelled.length(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, length2, 4);
            onCancelLoad.setMax(-1299495884, oncanceled);
            onCancelLoad.getMin(-1299495884, oncanceled);
        }
        setCancelText setcanceltext = setCancelText.length;
        setCancelText.setMax(feedNotificationActivity, i, str, 80, 24);
    }

    public static final /* synthetic */ void access$toggleEmptyStateView(FeedNotificationActivity feedNotificationActivity, boolean z) {
        int length2;
        int min;
        Context baseContext = feedNotificationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-90426406, oncanceled);
            onCancelLoad.getMin(-90426406, oncanceled);
        }
        RecyclerView recyclerView = (RecyclerView) feedNotificationActivity._$_findCachedViewById(resetInternal.setMax.setTextSize);
        int i = 0;
        if (recyclerView != null) {
            View view = recyclerView;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
        View _$_findCachedViewById = feedNotificationActivity._$_findCachedViewById(resetInternal.setMax.setIconAttribute);
        if (_$_findCachedViewById != null) {
            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
            if (!z) {
                i = 8;
            }
            _$_findCachedViewById.setVisibility(i);
        }
    }

    @NotNull
    public final setLeftButtonEnabled.setMin getFeedNotificationPresenter() {
        setLeftButtonEnabled.setMin setmin = this.feedNotificationPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedNotificationPresenter");
        }
        return setmin;
    }

    public final void setFeedNotificationPresenter(@NotNull setLeftButtonEnabled.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.feedNotificationPresenter = setmin;
    }

    /* access modifiers changed from: private */
    public final boolean length() {
        return this.getMax != null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/social/view/activity/notification/FeedNotificationActivity$notificationClickListener$1", "Lid/dana/social/adapter/BaseSocialFeedInteraction;", "onGroupedContentClicked", "", "itemPosition", "", "onItemClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverRpcUtils.AnonymousClass1 {
        final /* synthetic */ FeedNotificationActivity getMin;

        IsOverlapping(FeedNotificationActivity feedNotificationActivity) {
            this.getMin = feedNotificationActivity;
        }

        public final void setMax(int i) {
            String str;
            FeedModel feedModel;
            setEmptyView setemptyview = (setEmptyView) FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMin).setMin(i);
            if (!(setemptyview == null || (feedModel = setemptyview.setMax) == null)) {
                FeedNotificationActivity.access$openActivityDetail(this.getMin, feedModel);
            }
            setEmptyView setemptyview2 = (setEmptyView) FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMin).setMin(i);
            if (setemptyview2 != null) {
                FeedModel feedModel2 = setemptyview2.setMax;
                if (feedModel2 == null || !feedModel2.length()) {
                    FeedModel feedModel3 = setemptyview2.setMax;
                    if (feedModel3 != null) {
                        feedModel3.isInside = true;
                    }
                    FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMin).notifyItemChanged(i);
                    FeedModel feedModel4 = setemptyview2.setMax;
                    if (feedModel4 != null && (str = feedModel4.toFloatRange) != null) {
                        FeedNotificationActivity.access$readSingleNotification(this.getMin, str);
                    }
                }
            }
        }

        public final void getMax(int i) {
            String str;
            setFocusableInTouchMode setfocusableintouchmode;
            List<FeedModel> list;
            FeedModel feedModel;
            setEmptyView setemptyview = (setEmptyView) FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMin).setMin(i);
            if (!(setemptyview == null || (setfocusableintouchmode = setemptyview.getMax) == null || (list = setfocusableintouchmode.setMin) == null || (feedModel = (FeedModel) CollectionsKt.firstOrNull(list)) == null)) {
                FeedNotificationActivity.access$openActivityDetail(this.getMin, feedModel);
            }
            setEmptyView setemptyview2 = (setEmptyView) FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMin).setMin(i);
            if (setemptyview2 != null) {
                setFocusableInTouchMode setfocusableintouchmode2 = setemptyview2.getMax;
                if (setfocusableintouchmode2 == null || !setfocusableintouchmode2.setMax()) {
                    setFocusableInTouchMode setfocusableintouchmode3 = setemptyview2.getMax;
                    if (setfocusableintouchmode3 != null) {
                        setfocusableintouchmode3.getMin = true;
                    }
                    FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMin).notifyItemChanged(i);
                    setFocusableInTouchMode setfocusableintouchmode4 = setemptyview2.getMax;
                    if (setfocusableintouchmode4 != null && (str = setfocusableintouchmode4.getMax) != null) {
                        FeedNotificationActivity.access$readSingleNotification(this.getMin, str);
                    }
                }
            }
        }
    }

    public final void configToolbar() {
        setCenterTitle(getString(R.string.feed_notification_activity_title));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        setMenuRightButton((int) R.drawable.ic_read_all_notification_24dp);
    }

    public final void onClickRightMenuButton(@Nullable View view) {
        List<FeedModel> list;
        setLeftButtonEnabled.setMin setmin = this.feedNotificationPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedNotificationPresenter");
        }
        setmin.setMin();
        int i = 0;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1381493380, oncanceled);
            onCancelLoad.getMin(1381493380, oncanceled);
        }
        initStyleByTheme initstylebytheme = this.getMin;
        if (initstylebytheme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
        }
        List max2 = initstylebytheme.getMax();
        if (max2 != null) {
            for (Object next : max2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                setEmptyView setemptyview = (setEmptyView) next;
                if (getMin(setemptyview.getMin)) {
                    if (setemptyview.setMax == null) {
                        setFocusableInTouchMode setfocusableintouchmode = setemptyview.getMax;
                        if (!(setfocusableintouchmode == null || (list = setfocusableintouchmode.setMin) == null)) {
                            Iterable<FeedModel> iterable = list;
                            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                            for (FeedModel feedModel : iterable) {
                                feedModel.isInside = true;
                                arrayList.add(Unit.INSTANCE);
                            }
                        }
                        initStyleByTheme initstylebytheme2 = this.getMin;
                        if (initstylebytheme2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
                        }
                        initstylebytheme2.notifyItemChanged(i);
                    } else {
                        FeedModel feedModel2 = setemptyview.setMax;
                        if (feedModel2 != null) {
                            feedModel2.isInside = true;
                            initStyleByTheme initstylebytheme3 = this.getMin;
                            if (initstylebytheme3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
                            }
                            initstylebytheme3.notifyItemChanged(i);
                        }
                    }
                }
                i = i2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/view/activity/notification/FeedNotificationActivity$initScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends RecyclerView.toIntRange {
        final /* synthetic */ FeedNotificationActivity setMin;

        isInside(FeedNotificationActivity feedNotificationActivity) {
            this.setMin = feedNotificationActivity;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            boolean access$isFirstItemVisible = this.setMin.setMin();
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) this.setMin._$_findCachedViewById(resetInternal.setMax.onApplyWindowInsets);
            if (ptrClassicFrameLayout != null) {
                ptrClassicFrameLayout.setEnabled(access$isFirstItemVisible);
            }
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (!recyclerView.canScrollVertically(TsExtractor.TS_STREAM_TYPE_HDMV_DTS) && this.setMin.isInside) {
                FeedNotificationActivity.access$onTouchBottom(this.setMin);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean setMin() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setTextSize);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_feed_notification_list");
        RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    private final boolean getMax() {
        initStyleByTheme initstylebytheme = this.getMin;
        if (initstylebytheme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
        }
        return initstylebytheme.getItemCount() <= 0;
    }

    private final boolean setMax() {
        initStyleByTheme initstylebytheme = this.getMin;
        if (initstylebytheme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
        }
        initStyleByTheme initstylebytheme2 = this.getMin;
        if (initstylebytheme2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
        }
        if (((setEmptyView) initstylebytheme.setMin(initstylebytheme2.getItemCount() - 1)).getMin != 14) {
            initStyleByTheme initstylebytheme3 = this.getMin;
            if (initstylebytheme3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
            }
            initStyleByTheme initstylebytheme4 = this.getMin;
            if (initstylebytheme4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
            }
            if (((setEmptyView) initstylebytheme3.setMin(initstylebytheme4.getItemCount() - 1)).getMin != 15) {
                initStyleByTheme initstylebytheme5 = this.getMin;
                if (initstylebytheme5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
                }
                initStyleByTheme initstylebytheme6 = this.getMin;
                if (initstylebytheme6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
                }
                if (((setEmptyView) initstylebytheme5.setMin(initstylebytheme6.getItemCount() - 1)).getMin == 13) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    private final boolean getMin() {
        return !getMax() && !this.toIntRange && setMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/view/activity/notification/FeedNotificationActivity$initPullToRefreshComponent$1", "Lin/srain/cube/views/ptr/PtrHandler;", "checkCanDoRefresh", "", "frame", "Lin/srain/cube/views/ptr/PtrFrameLayout;", "content", "Landroid/view/View;", "header", "onRefreshBegin", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements access$1602 {
        final /* synthetic */ FeedNotificationActivity setMax;

        getMax(FeedNotificationActivity feedNotificationActivity) {
            this.setMax = feedNotificationActivity;
        }

        public final void getMax() {
            if (this.setMax.length()) {
                FeedNotificationActivity.access$getLavLoadingAnimation$p(this.setMax).playAnimation();
            }
            FeedNotificationActivity.access$refreshNotification(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"id/dana/social/view/activity/notification/FeedNotificationActivity$initPullToRefreshHeaderView$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements Animator.AnimatorListener {
        final /* synthetic */ FeedNotificationActivity length;

        public final void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        public final void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        setMax(FeedNotificationActivity feedNotificationActivity) {
            this.length = feedNotificationActivity;
        }

        public final void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) this.length._$_findCachedViewById(resetInternal.setMax.onApplyWindowInsets);
            if (ptrClassicFrameLayout != null) {
                ptrClassicFrameLayout.refreshComplete();
                this.length.setMax = false;
            }
        }

        public final void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            if (this.length.setMax && this.length.length()) {
                FeedNotificationActivity.access$getLavLoadingAnimation$p(this.length).cancelAnimation();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001e\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u001e\u0010\f\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"id/dana/social/view/activity/notification/FeedNotificationActivity$initComponent$1$1", "Lid/dana/social/contract/notification/FeedNotificationContract$View;", "dismissProgress", "", "onFeedNotificationsSuccess", "feedNotifications", "", "Lid/dana/social/model/FeedViewHolderModel;", "hasMoreNotification", "", "onMarkAllNotificationReadFailed", "onMarkAllNotificationReadSuccess", "onRefreshFeedNotificationsSuccess", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements setLeftButtonEnabled.length {
        final /* synthetic */ FeedNotificationActivity getMax;

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        setMin(FeedNotificationActivity feedNotificationActivity) {
            this.getMax = feedNotificationActivity;
        }

        public final void showProgress() {
            if (FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMax).getItemCount() <= 0) {
                initStyleByTheme access$getSocialFeedsAdapter$p = FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMax);
                access$getSocialFeedsAdapter$p.getMax().addAll(initStyleByTheme.setMax());
                access$getSocialFeedsAdapter$p.notifyDataSetChanged();
            }
        }

        public final void dismissProgress() {
            initStyleByTheme access$getSocialFeedsAdapter$p = FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMax);
            List max = access$getSocialFeedsAdapter$p.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            if (CollectionsKt.removeAll(max, initStyleByTheme.setMin.INSTANCE)) {
                access$getSocialFeedsAdapter$p.notifyDataSetChanged();
            }
            this.getMax.setMax = true;
        }

        public final void getMax(@NotNull List<setEmptyView> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "feedNotifications");
            this.getMax.isInside = z;
            FeedNotificationActivity.access$removeFetchingDataView(this.getMax);
            this.getMax.setMax = true;
            if (FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMax).getItemCount() <= 0) {
                FeedNotificationActivity.access$toggleEmptyStateView(this.getMax, list.isEmpty());
            }
            FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMax).setMax(list);
        }

        public final void setMin(@NotNull List<setEmptyView> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "feedNotifications");
            this.getMax.isInside = z;
            FeedNotificationActivity.access$removeFetchingDataView(this.getMax);
            this.getMax.setMax = true;
            FeedNotificationActivity.access$toggleEmptyStateView(this.getMax, list.isEmpty());
            FeedNotificationActivity.access$getSocialFeedsAdapter$p(this.getMax).getMin(list);
        }

        public final void setMin() {
            FeedNotificationActivity.access$refreshNotification(this.getMax);
            FeedNotificationActivity feedNotificationActivity = this.getMax;
            String string = feedNotificationActivity.getString(R.string.feed_notification_read_all_visible_success);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.feed_…read_all_visible_success)");
            FeedNotificationActivity.access$showToast(feedNotificationActivity, R.drawable.bg_rounded_border_green_50, string);
        }

        public final void getMin() {
            FeedNotificationActivity feedNotificationActivity = this.getMax;
            String string = feedNotificationActivity.getString(R.string.feed_notification_read_all_visible_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.feed_…n_read_all_visible_error)");
            FeedNotificationActivity.access$showToast(feedNotificationActivity, R.drawable.bg_rounded_border_red_50, string);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/social/view/activity/notification/FeedNotificationActivity$Companion;", "", "()V", "BUNDLE_SHOW_COMMENT_BUTTON", "", "DISABLE_LOAD_MORE_DELAY", "", "FIRST_POSITION", "", "openFeedNotificationActivity", "", "context", "Landroid/content/Context;", "showCommentButton", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        public static void getMax(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intent intent = new Intent(context, FeedNotificationActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("BUNDLE_SHOW_COMMENT_BUTTON", z);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMin<V> implements Callable<Object> {
        final /* synthetic */ FeedNotificationActivity setMax;

        getMin(FeedNotificationActivity feedNotificationActivity) {
            this.setMax = feedNotificationActivity;
        }

        public final /* synthetic */ Object call() {
            FeedNotificationActivity.access$setFetchingFeedsFalse(this.setMax);
            return Unit.INSTANCE;
        }
    }

    public final void init() {
        int length2;
        int min;
        int length3;
        int min2;
        DanaApplication danaApplication = getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            socialCommonComponent.getMin(new FeedNotificationModule(new setMin(this))).getMax(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        setLeftButtonEnabled.setMin setmin = this.feedNotificationPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedNotificationPresenter");
        }
        getminArr[0] = setmin;
        registerPresenter(getminArr);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length3)))) {
            onCanceled oncanceled = new onCanceled(length3, min2, 32);
            onCancelLoad.setMax(-1107796835, oncanceled);
            onCancelLoad.getMin(-1107796835, oncanceled);
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent.getExtras();
        this.equals = extras != null ? extras.getBoolean("BUNDLE_SHOW_COMMENT_BUTTON") : false;
        initStyleByTheme initstylebytheme = new initStyleByTheme();
        initstylebytheme.getMin = this.equals;
        initContent initcontent = this.IsOverlapping;
        Intrinsics.checkNotNullParameter(initcontent, "<set-?>");
        initstylebytheme.setMin = initcontent;
        Unit unit = Unit.INSTANCE;
        this.getMin = initstylebytheme;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setTextSize);
        if (recyclerView != null) {
            initStyleByTheme initstylebytheme2 = this.getMin;
            if (initstylebytheme2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socialFeedsAdapter");
            }
            recyclerView.setAdapter(initstylebytheme2);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onApplyWindowInsets);
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setPtrHandler(new getMax(this));
        }
        PtrClassicFrameLayout ptrClassicFrameLayout2 = (PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onApplyWindowInsets);
        if (ptrClassicFrameLayout2 != null) {
            ptrClassicFrameLayout2.disableWhenHorizontalMove(true);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout3 = (PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onApplyWindowInsets);
        Intrinsics.checkNotNullExpressionValue(ptrClassicFrameLayout3, "ptr_feed_notification");
        ptrClassicFrameLayout3.setHeaderView(LayoutInflater.from(getApplicationContext()).inflate(R.layout.view_pull_to_refresh_header, (ViewGroup) null));
        PtrClassicFrameLayout ptrClassicFrameLayout4 = (PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onApplyWindowInsets);
        Intrinsics.checkNotNullExpressionValue(ptrClassicFrameLayout4, "ptr_feed_notification");
        View findViewById = ptrClassicFrameLayout4.getHeaderView().findViewById(R.id.f51622131363718);
        Intrinsics.checkNotNullExpressionValue(findViewById, "ptr_feed_notification.he…id.lav_loading_animation)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        this.getMax = lottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        lottieAnimationView.addAnimatorListener(new setMax(this));
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(600504954, oncanceled2);
            onCancelLoad.getMin(600504954, oncanceled2);
        }
        setLeftButtonEnabled.setMin setmin2 = this.feedNotificationPresenter;
        if (setmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedNotificationPresenter");
        }
        setmin2.length();
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-447242546, oncanceled3);
            onCancelLoad.getMin(-447242546, oncanceled3);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setTextSize);
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new isInside(this));
        }
    }

    public static final /* synthetic */ void access$refreshNotification(FeedNotificationActivity feedNotificationActivity) {
        setLeftButtonEnabled.setMin setmin = feedNotificationActivity.feedNotificationPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedNotificationPresenter");
        }
        setmin.getMin();
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [o.setFavoriteBtnVisibility] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void access$removeFetchingDataView(id.dana.social.view.activity.notification.FeedNotificationActivity r7) {
        /*
            boolean r0 = r7.getMax()
            if (r0 != 0) goto L_0x003e
            o.initStyleByTheme r0 = r7.getMin
            java.lang.String r1 = "socialFeedsAdapter"
            if (r0 != 0) goto L_0x000f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x000f:
            o.initStyleByTheme r2 = r7.getMin
            if (r2 != 0) goto L_0x0016
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0016:
            int r2 = r2.getItemCount()
            int r2 = r2 + -1
            java.lang.Object r0 = r0.setMin((int) r2)
            o.setEmptyView r0 = (o.setEmptyView) r0
            int r0 = r0.getMin
            r2 = 6
            if (r0 != r2) goto L_0x003e
            o.initStyleByTheme r0 = r7.getMin
            if (r0 != 0) goto L_0x002e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x002e:
            o.initStyleByTheme r2 = r7.getMin
            if (r2 != 0) goto L_0x0035
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0035:
            int r1 = r2.getItemCount()
            int r1 = r1 + -1
            r0.getMax((int) r1)
        L_0x003e:
            android.content.Context r0 = r7.getBaseContext()
            if (r0 == 0) goto L_0x0049
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            r1 = 1031632852(0x3d7d77d4, float:0.061881855)
            r2 = 0
            if (r0 == 0) goto L_0x0062
            int r0 = o.dispatchOnCancelled.length(r0, r2)
            if (r0 == 0) goto L_0x0062
            o.onCanceled r3 = new o.onCanceled
            r4 = 4
            r3.<init>(r2, r0, r4)
            o.onCancelLoad.setMax(r1, r3)
            o.onCancelLoad.getMin(r1, r3)
        L_0x0062:
            int r0 = o.dispatchOnCancelled.getMax(r2)
            if (r0 == 0) goto L_0x0075
            o.onCanceled r3 = new o.onCanceled
            r4 = 16
            r3.<init>(r2, r0, r4)
            o.onCancelLoad.setMax(r1, r3)
            o.onCancelLoad.getMin(r1, r3)
        L_0x0075:
            id.dana.social.view.activity.notification.FeedNotificationActivity$getMin r0 = new id.dana.social.view.activity.notification.FeedNotificationActivity$getMin
            r0.<init>(r7)
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            o.setFavoriteBtnVisibility r2 = o.setFavoriteBtnVisibility.setMin(r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            o.hasCornerMarking r6 = o.getSecureSignatureComp.getMin()
            java.lang.String r0 = "unit is null"
            o.setRefreshAnimation.getMax(r5, (java.lang.String) r0)
            java.lang.String r0 = "scheduler is null"
            o.setRefreshAnimation.getMax(r6, (java.lang.String) r0)
            o.enableTargetOffset r0 = new o.enableTargetOffset
            r3 = 500(0x1f4, double:2.47E-321)
            r1 = r0
            r1.<init>(r2, r3, r5, r6)
            o.RedDotDrawable<? super o.setFavoriteBtnVisibility, ? extends o.setFavoriteBtnVisibility> r1 = o.SecuritySignature.valueOf
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r0 = o.SecuritySignature.getMax(r1, r0)
            o.setFavoriteBtnVisibility r0 = (o.setFavoriteBtnVisibility) r0
        L_0x00a2:
            o.GriverProgressBar$UpdateRunnable r0 = r0.v_()
            r7.addDisposable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.view.activity.notification.FeedNotificationActivity.access$removeFetchingDataView(id.dana.social.view.activity.notification.FeedNotificationActivity):void");
    }
}
