package id.dana.social.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.social.InitStatus;
import id.dana.model.ThirdPartyService;
import id.dana.richview.LoadingLottieAnimationView;
import id.dana.social.ContentGroupingDetailActivity;
import id.dana.social.ReciprocalBottomSheetDialog;
import id.dana.social.RelationshipBottomSheetDialog;
import id.dana.social.di.module.FriendsFeedsModule;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import id.dana.social.onboarding.FeedOnboardingView;
import id.dana.social.view.FeedsMeHeaderView;
import id.dana.social.view.activity.SocialProfileActivity;
import id.dana.social.view.activity.detail.SocialActivityDetail;
import id.dana.social.view.activity.notification.FeedNotificationActivity;
import id.dana.tracker.TrackerKey;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUHorizontalListView;
import o.AUPopSupportPreemption;
import o.AUSegment;
import o.GriverRpcUtils;
import o.MyBeaconService;
import o.adjustLinePosition;
import o.dispatchOnCancelled;
import o.getHorizonPadding;
import o.initContent;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setBuildNumber;
import o.setButtonStyle;
import o.setChecked;
import o.setEmptyView;
import o.setFocusable;
import o.setFocusableInTouchMode;
import o.setLeftButtonText;
import o.setLoadingText;
import o.setNextSelectedPositionInt;
import o.setStateOn;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000±\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001#\u0018\u0000 |2\u00020\u0001:\u0002|}B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0002J\b\u00103\u001a\u000200H\u0002J\b\u00104\u001a\u000200H\u0002J\b\u00105\u001a\u000200H\u0002J&\u00106\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`92\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002J\b\u0010=\u001a\u00020>H\u0014J\b\u0010?\u001a\u00020@H\u0014J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u000200H\u0002J\b\u0010D\u001a\u00020\u0019H\u0002J\b\u0010E\u001a\u000200H\u0014J\b\u0010F\u001a\u00020\u001bH\u0002J\b\u0010G\u001a\u000200H\u0002J\u0010\u0010H\u001a\u00020\u00192\u0006\u0010I\u001a\u00020<H\u0002J\b\u0010J\u001a\u00020\u0019H\u0016J\b\u0010K\u001a\u00020\u0019H\u0016J\b\u0010L\u001a\u00020\u0019H\u0002J\u0010\u0010M\u001a\u0002002\u0006\u0010N\u001a\u000202H\u0002J\b\u0010O\u001a\u000200H\u0002J\b\u0010P\u001a\u000200H\u0016J-\u0010Q\u001a\u0002002\u0006\u0010R\u001a\u00020@2\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u0002080T2\u0006\u0010U\u001a\u00020VH\u0016¢\u0006\u0002\u0010WJ\b\u0010X\u001a\u000200H\u0016J\b\u0010Y\u001a\u000200H\u0016J\b\u0010Z\u001a\u000200H\u0016J\u0010\u0010[\u001a\u0002002\u0006\u0010\\\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u0002002\u0006\u0010I\u001a\u00020<H\u0002J\u0010\u0010_\u001a\u0002002\u0006\u0010I\u001a\u00020<H\u0002J\b\u0010`\u001a\u000200H\u0002J\b\u0010a\u001a\u000200H\u0002J\b\u0010b\u001a\u000200H\u0002J\b\u0010c\u001a\u000200H\u0002J\b\u0010d\u001a\u000200H\u0002J\b\u0010e\u001a\u000200H\u0002J\b\u0010f\u001a\u000200H\u0002J\u0010\u0010g\u001a\u0002002\u0006\u0010h\u001a\u00020\u0019H\u0002J\u0016\u0010i\u001a\u0002002\f\u0010j\u001a\b\u0012\u0004\u0012\u00020k0;H\u0002J\b\u0010l\u001a\u000200H\u0002J\u0016\u0010m\u001a\u0002002\f\u0010n\u001a\b\u0012\u0004\u0012\u00020o0;H\u0002J\b\u0010p\u001a\u000200H\u0002J\b\u0010q\u001a\u000200H\u0002J\b\u0010r\u001a\u000200H\u0002J\u0012\u0010s\u001a\u0002002\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010t\u001a\u000200H\u0016J\b\u0010u\u001a\u000200H\u0002J\u0010\u0010v\u001a\u0002002\u0006\u0010w\u001a\u00020@H\u0002J\b\u0010x\u001a\u000200H\u0002J\b\u0010y\u001a\u000200H\u0002J\f\u0010z\u001a\u000200*\u00020kH\u0002J\f\u0010{\u001a\u000200*\u00020kH\u0002R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u00020#X\u0004¢\u0006\u0004\n\u0002\u0010$R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b,\u0010-¨\u0006~"}, d2 = {"Lid/dana/social/fragment/FriendsFeedsFragment;", "Lid/dana/social/fragment/BaseFeedTimelineFragment;", "()V", "interaction", "Lid/dana/social/fragment/FriendsFeedsFragment$Interaction;", "(Lid/dana/social/fragment/FriendsFeedsFragment$Interaction;)V", "contactPermission", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "getContactPermission", "()Lid/dana/utils/permission/Permission;", "contactPermission$delegate", "Lkotlin/Lazy;", "contactPermissionBottomSheetDialogFragment", "Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment;", "getContactPermissionBottomSheetDialogFragment", "()Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment;", "contactPermissionBottomSheetDialogFragment$delegate", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "isFeedNotificationEnable", "", "presenter", "Lid/dana/social/contract/friendsfeeds/FriendFeedsContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/friendsfeeds/FriendFeedsContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/friendsfeeds/FriendFeedsContract$Presenter;)V", "showCommentButton", "showReciprocalRelationshipList", "socialFeedListener", "id/dana/social/fragment/FriendsFeedsFragment$socialFeedListener$1", "Lid/dana/social/fragment/FriendsFeedsFragment$socialFeedListener$1;", "topFriendsAdapter", "Lid/dana/social/adapter/TopFriendsAdapter;", "getTopFriendsAdapter", "()Lid/dana/social/adapter/TopFriendsAdapter;", "topFriendsAdapter$delegate", "usernameBannerAdapter", "Lid/dana/social/adapter/UsernameBannerAdapter;", "getUsernameBannerAdapter", "()Lid/dana/social/adapter/UsernameBannerAdapter;", "usernameBannerAdapter$delegate", "bindMyFeedsHeaderData", "", "data", "Lid/dana/social/model/MyFeedHeaderModel;", "disableRefreshWhenTopFriendsHorizontalScrollActive", "doFetchFeedOnLoadMore", "fetchFeed", "getActivityIdsFromFeedModels", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "feedModels", "", "Lid/dana/social/model/FeedModel;", "getAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "getLayout", "", "getSocialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "getUserInfo", "hasContactPermission", "init", "initFeed", "inject", "isCurrentUser", "feedModel", "isCurrentUserFeedPage", "isHasMore", "isInitFeedFinished", "myFeedsHeaderOnClick", "myFeedHeaderModel", "observerSynchingState", "onRefresh", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSelected", "onTouchBottom", "openProfileActivity", "it", "Lid/dana/social/model/RelationshipItemModel;", "openSelfProfileActivity", "openSocialFeedDetailActivity", "renderErrorInitFeedState", "renderFeedView", "renderInitFeedFinished", "renderLoadingInitFeedState", "renderMyFeedsHeaderLoadingState", "renderOnboardingState", "renderSyncState", "renderTimelineError", "withCache", "renderTimelineSuccess", "feedViewModels", "Lid/dana/social/model/FeedViewHolderModel;", "renderTopFriendError", "renderTopFriendSuccess", "topFriendModels", "Lid/dana/social/model/FriendModel;", "setupAdapter", "setupFeedOnboardingView", "setupInitFeed", "showContactPermissionBottomSheet", "showEmptyState", "showFeeds", "showState", "feedType", "showSyncingState", "startObservingInitFeed", "handleAvatarClick", "handleBubbleClick", "Companion", "Interaction", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FriendsFeedsFragment extends BaseFeedTimelineFragment {
    @NotNull
    public static final length IsOverlapping = new length((byte) 0);
    /* access modifiers changed from: private */
    public boolean FastBitmap$CoordinateSystem;
    private HashMap Grayscale$Algorithm;
    private final Lazy equals;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    private final Lazy hashCode;
    /* access modifiers changed from: private */
    public final getMin invokeSuspend;
    @Inject
    public setLeftButtonText.length presenter;
    private final toDoubleRange toDoubleRange;
    /* access modifiers changed from: private */
    public boolean toFloatRange;
    private final Lazy toIntRange;
    private final Lazy toString;
    /* access modifiers changed from: private */
    public boolean values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/social/fragment/FriendsFeedsFragment$Interaction;", "", "onUsernameBannerClick", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void getMax();
    }

    public final boolean FastBitmap$CoordinateSystem() {
        return false;
    }

    public final void ICustomTabsCallback$Default() {
        HashMap hashMap = this.Grayscale$Algorithm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View getMin(int i) {
        if (this.Grayscale$Algorithm == null) {
            this.Grayscale$Algorithm = new HashMap();
        }
        View view = (View) this.Grayscale$Algorithm.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.Grayscale$Algorithm.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int setMin() {
        return R.layout.fragment_friend_feed;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ FriendsFeedsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(FriendsFeedsFragment friendsFeedsFragment) {
            super(1);
            this.this$0 = friendsFeedsFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) this.this$0.getMin(resetInternal.setMax.onWindowSystemUiVisibilityChanged);
            if (ptrClassicFrameLayout != null) {
                ptrClassicFrameLayout.setEnabled(z);
            }
        }
    }

    public FriendsFeedsFragment(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "interaction");
        this.invokeSuspend = getmin;
        this.equals = LazyKt.lazy(FriendsFeedsFragment$Grayscale$Algorithm.INSTANCE);
        this.toIntRange = LazyKt.lazy(new invokeSuspend(this));
        Function0 setmax = new setMax(this);
        Function0 setmin = new setMin(this);
        Intrinsics.checkNotNullParameter(this, "$this$permission");
        Intrinsics.checkNotNullParameter("android.permission.READ_CONTACTS", "permission");
        Intrinsics.checkNotNullParameter(setmax, "onPermissionGranted");
        Intrinsics.checkNotNullParameter(setmin, "onPermissionDenied");
        this.toString = LazyKt.lazy(new MyBeaconService.setMax(this, "android.permission.READ_CONTACTS", setmax, setmin));
        this.hashCode = LazyKt.lazy(getMax.INSTANCE);
        this.toDoubleRange = new toDoubleRange(this);
    }

    public FriendsFeedsFragment() {
        this(new getMin() {
            public final void getMax() {
            }
        });
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/social/adapter/UsernameBannerAdapter;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend extends Lambda implements Function0<adjustLinePosition> {
        final /* synthetic */ FriendsFeedsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invokeSuspend(FriendsFeedsFragment friendsFeedsFragment) {
            super(0);
            this.this$0 = friendsFeedsFragment;
        }

        @NotNull
        public final adjustLinePosition invoke() {
            return new adjustLinePosition(new Function0<Unit>(this.this$0.invokeSuspend) {
                public final void invoke() {
                    ((getMin) this.receiver).getMax();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMax extends FunctionReferenceImpl implements Function0<Unit> {
        setMax(FriendsFeedsFragment friendsFeedsFragment) {
            super(0, friendsFeedsFragment, FriendsFeedsFragment.class, "renderSyncState", "renderSyncState()V", 0);
        }

        public final void invoke() {
            FriendsFeedsFragment.setMax((FriendsFeedsFragment) this.receiver);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<Unit> {
        final /* synthetic */ FriendsFeedsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(FriendsFeedsFragment friendsFeedsFragment) {
            super(0);
            this.this$0 = friendsFeedsFragment;
        }

        public final void invoke() {
            FeedOnboardingView feedOnboardingView = (FeedOnboardingView) this.this$0.getMin(resetInternal.setMax.setHorizontalAlign);
            if (feedOnboardingView != null) {
                feedOnboardingView.renderButtonEnabled();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<getHorizonPadding> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(0);
        }

        @NotNull
        public final getHorizonPadding invoke() {
            return new getHorizonPadding();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"id/dana/social/fragment/FriendsFeedsFragment$socialFeedListener$1", "Lid/dana/social/adapter/BaseSocialFeedInteraction;", "onActivateFeed", "", "onFeedAvatarImageClicked", "itemPosition", "", "onGroupedContentClicked", "onItemClicked", "onSeeAllButtonClick", "onSocialFeedSpanClicked", "content", "Lid/dana/social/utils/Content;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange extends GriverRpcUtils.AnonymousClass1 {
        final /* synthetic */ FriendsFeedsFragment setMax;

        toDoubleRange(FriendsFeedsFragment friendsFeedsFragment) {
            this.setMax = friendsFeedsFragment;
        }

        public final void getMax(int i) {
            setFocusableInTouchMode setfocusableintouchmode;
            List<FeedModel> list;
            Context context;
            Context context2;
            int max;
            setEmptyView setemptyview = (setEmptyView) this.setMax.setMax.setMin(i);
            if (setemptyview != null && (setfocusableintouchmode = setemptyview.getMax) != null && (list = setfocusableintouchmode.setMin) != null && (context = this.setMax.getContext()) != null) {
                ContentGroupingDetailActivity.length length = ContentGroupingDetailActivity.Companion;
                Intrinsics.checkNotNullExpressionValue(context, "it");
                ArrayList min = FriendsFeedsFragment.setMin((List) list);
                boolean FastBitmap$CoordinateSystem = this.setMax.toFloatRange;
                if (context != null) {
                    context2 = context.getApplicationContext();
                } else {
                    context2 = null;
                }
                if (!(context2 == null || (max = dispatchOnCancelled.setMax(context2, 0, 0)) == 0)) {
                    onCanceled oncanceled = new onCanceled(0, max, 2);
                    onCancelLoad.setMax(-1875912501, oncanceled);
                    onCancelLoad.getMin(-1875912501, oncanceled);
                }
                Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
                Intrinsics.checkNotNullParameter(min, "activityIds");
                Intent intent = new Intent(context, ContentGroupingDetailActivity.class);
                intent.putStringArrayListExtra("bundled_activity_ids", min);
                intent.putExtra("bundled_show_comment_button", FastBitmap$CoordinateSystem);
                context.startActivity(intent);
            }
        }

        public final void setMax(@NotNull AUHorizontalListView.SavedState.AnonymousClass1 r3) {
            Intrinsics.checkNotNullParameter(r3, "content");
            AUHorizontalListView.SelectionNotifier selectionNotifier = this.setMax.friendshipAnalyticTracker;
            if (selectionNotifier == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
            }
            selectionNotifier.length(r3, TrackerKey.Event.FRIENDSHIP_FEEDS_READ);
            setLeftButtonText.length length = this.setMax.presenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            String str = r3.getMin;
            if (str == null) {
                str = "";
            }
            length.getMin(str);
        }

        public final void getMin(int i) {
            setEmptyView setemptyview = (setEmptyView) this.setMax.setMax.setMin(i);
            if (setemptyview != null) {
                FriendsFeedsFragment.setMax(this.setMax, setemptyview);
            }
        }

        public final void setMax() {
            if (this.setMax.values) {
                ReciprocalBottomSheetDialog reciprocalBottomSheetDialog = new ReciprocalBottomSheetDialog();
                BaseActivity baseActivity = this.setMax.getMax;
                Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
                reciprocalBottomSheetDialog.show(baseActivity.getSupportFragmentManager(), "");
                return;
            }
            RelationshipBottomSheetDialog relationshipBottomSheetDialog = new RelationshipBottomSheetDialog();
            BaseActivity baseActivity2 = this.setMax.getMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
            relationshipBottomSheetDialog.show(baseActivity2.getSupportFragmentManager(), "");
        }

        public final void setMax(int i) {
            setEmptyView setemptyview;
            if (this.setMax.toFloatRange && (setemptyview = (setEmptyView) this.setMax.setMax.setMin(i)) != null) {
                FriendsFeedsFragment.length(this.setMax, setemptyview);
            }
        }
    }

    public final void setMax() {
        super.setMax();
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            FriendsFeedsModule friendsFeedsModule = new FriendsFeedsModule(new toFloatRange(this));
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            max.getMax = this.getMax;
            max.length = TrackerKey.SourceType.FRIENDSHIP_FRIENDS_FEED;
            DeepLinkModule deepLinkModule = new DeepLinkModule(max, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(deepLinkModule, "DeepLinkModule.builder()…HIP_FRIENDS_FEED).build()");
            ScanQrModule.setMin max2 = ScanQrModule.getMax();
            max2.setMin = this.getMax;
            ScanQrModule scanQrModule = new ScanQrModule(max2, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(scanQrModule, "ScanQrModule.builder()\n …\n                .build()");
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = this.getMax;
            RestoreUrlModule restoreUrlModule = new RestoreUrlModule(min, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(restoreUrlModule, "RestoreUrlModule.builder…\n                .build()");
            FeatureModule.length length2 = FeatureModule.length();
            length2.setMax = this.getMax;
            FeatureModule featureModule = new FeatureModule(length2, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(featureModule, "FeatureModule.builder()\n…\n                .build()");
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = this.getMax;
            OauthModule oauthModule = new OauthModule(min2, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(oauthModule, "OauthModule.builder()\n  …\n                .build()");
            socialCommonComponent.getMin(friendsFeedsModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, new ServicesModule((style.getMin) new isInside())).getMax(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        setLeftButtonText.length length3 = this.presenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getminArr[0] = length3;
        getMin(getminArr);
        FeedOnboardingView feedOnboardingView = (FeedOnboardingView) getMin(resetInternal.setMax.setHorizontalAlign);
        if (feedOnboardingView != null) {
            feedOnboardingView.setListener(new toString(this));
        }
        if (getDefaultImpl()) {
            setLeftButtonText.length length4 = this.presenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length4.toFloatRange();
            setLeftButtonText.length length5 = this.presenter;
            if (length5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length5.invoke();
            setLeftButtonText.length length6 = this.presenter;
            if (length6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length6.invokeSuspend();
            ICustomTabsCallback$Stub$Proxy();
            asBinder();
            if (getInterfaceDescriptor()) {
                setLeftButtonText.length length7 = this.presenter;
                if (length7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length7.setMin(false);
                setLeftButtonText.length length8 = this.presenter;
                if (length8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length8.values();
            } else {
                setMax(false);
                setLeftButtonText.length length9 = this.presenter;
                if (length9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length9.equals();
            }
        } else {
            setDefaultImpl();
        }
        if (this.presenter != null) {
            setLeftButtonText.length length10 = this.presenter;
            if (length10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length10.setMin();
        }
        this.setMax.getMax = true;
        Function1<? super Boolean, Unit> equals2 = new equals(this);
        Intrinsics.checkNotNullParameter(equals2, "<set-?>");
        ((setLoadingText) this.equals.getValue()).getMin = equals2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/social/fragment/FriendsFeedsFragment$setupFeedOnboardingView$1", "Lid/dana/social/common/FeedOnboardingListener;", "onActivateClick", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toString implements AUSegment.AnonymousClass5 {
        final /* synthetic */ FriendsFeedsFragment setMin;

        toString(FriendsFeedsFragment friendsFeedsFragment) {
            this.setMin = friendsFeedsFragment;
        }

        public final void setMax() {
            setLeftButtonText.length length = this.setMin.presenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length.invoke();
            setLeftButtonText.length length2 = this.setMin.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length2.toFloatRange();
            setLeftButtonText.length length3 = this.setMin.presenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length3.invokeSuspend();
            if (this.setMin.getDefaultImpl()) {
                FriendsFeedsFragment.setMax(this.setMin);
                return;
            }
            FriendsFeedsFragment friendsFeedsFragment = this.setMin;
            FriendsFeedsFragment.setMax(friendsFeedsFragment, FriendsFeedsFragment.setMin(friendsFeedsFragment));
        }
    }

    /* access modifiers changed from: private */
    public final void ICustomTabsService() {
        setMax(false);
        FeedOnboardingView feedOnboardingView = (FeedOnboardingView) getMin(resetInternal.setMax.setHorizontalAlign);
        if (feedOnboardingView != null) {
            feedOnboardingView.setVisibility(0);
        }
        FeedOnboardingView feedOnboardingView2 = (FeedOnboardingView) getMin(resetInternal.setMax.setHorizontalAlign);
        if (feedOnboardingView2 != null) {
            feedOnboardingView2.renderButtonDisabled();
        }
        View min = getMin(resetInternal.setMax.onTransitionCompleted);
        if (min != null) {
            min.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final void setDefaultImpl() {
        FeedOnboardingView feedOnboardingView = (FeedOnboardingView) getMin(resetInternal.setMax.setHorizontalAlign);
        if (feedOnboardingView != null) {
            feedOnboardingView.setVisibility(0);
        }
        FeedOnboardingView feedOnboardingView2 = (FeedOnboardingView) getMin(resetInternal.setMax.setHorizontalAlign);
        if (feedOnboardingView2 != null) {
            feedOnboardingView2.renderButtonEnabled();
        }
        View min = getMin(resetInternal.setMax.onTransitionCompleted);
        if (min != null) {
            min.setVisibility(8);
        }
    }

    private final void ICustomTabsCallback$Stub$Proxy() {
        View min = getMin(resetInternal.setMax.onTransitionCompleted);
        if (min != null) {
            min.setVisibility(0);
        }
        FeedOnboardingView feedOnboardingView = (FeedOnboardingView) getMin(resetInternal.setMax.setHorizontalAlign);
        if (feedOnboardingView != null) {
            feedOnboardingView.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/social/fragment/FriendsFeedsFragment$initFeed$1$1"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function0<Unit> {
        final /* synthetic */ FriendsFeedsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(FriendsFeedsFragment friendsFeedsFragment) {
            super(0);
            this.this$0 = friendsFeedsFragment;
        }

        public final void invoke() {
            Context context = this.this$0.getContext();
            if (context != null) {
                Intrinsics.checkNotNullExpressionValue(context, "it");
                Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
                setButtonStyle.getMax(context, ExistingWorkPolicy.KEEP, 0, TimeUnit.SECONDS);
                setButtonStyle.getMin(context, 0, TimeUnit.SECONDS);
            }
        }
    }

    private final boolean getInterfaceDescriptor() {
        setLeftButtonText.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length2.toDoubleRange().getStatus() == InitStatus.FINISH;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"id/dana/social/fragment/FriendsFeedsFragment$inject$1", "Lid/dana/social/contract/friendsfeeds/FriendFeedsContract$View;", "onGetFeedCommentEnableSuccess", "", "isEnable", "", "onGetFeedNotificationCount", "notificationCount", "", "onGetFeedNotificationEnable", "onGetFeedReciprocalRelationshipEnable", "onGetUserInfo", "myFeedHeader", "Lid/dana/social/model/MyFeedHeaderModel;", "render", "state", "Lid/dana/social/contract/friendsfeeds/FriendFeedsContract$State;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements setLeftButtonText.getMax {
        final /* synthetic */ FriendsFeedsFragment setMax;

        toFloatRange(FriendsFeedsFragment friendsFeedsFragment) {
            this.setMax = friendsFeedsFragment;
        }

        public final void length(@NotNull setLeftButtonText.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "state");
            if (setmin instanceof setLeftButtonText.setMin.values) {
                FriendsFeedsFragment.getMin(this.setMax, (List) ((setLeftButtonText.setMin.values) setmin).getMax);
            } else if (setmin instanceof setLeftButtonText.setMin.equals) {
                FriendsFeedsFragment.getMax(this.setMax);
            } else if (setmin instanceof setLeftButtonText.setMin.hashCode) {
                FriendsFeedsFragment.getMin(this.setMax).getMin(CollectionsKt.listOf(Boolean.TRUE));
            } else if (setmin instanceof setLeftButtonText.setMin.toString) {
                FriendsFeedsFragment.getMin(this.setMax).getMin(CollectionsKt.emptyList());
            } else if (setmin instanceof setLeftButtonText.setMin.isInside) {
                FriendsFeedsFragment.length(this.setMax, ((setLeftButtonText.setMin.isInside) setmin).getMin());
            } else if (setmin instanceof setLeftButtonText.setMin.toIntRange) {
                FriendsFeedsFragment.getMax(this.setMax, (List) ((setLeftButtonText.setMin.toIntRange) setmin).getMin);
            } else if (setmin instanceof setLeftButtonText.setMin.C0066setMin) {
                this.setMax.ICustomTabsService();
            } else if (setmin instanceof setLeftButtonText.setMin.getMax) {
                FriendsFeedsFragment.equals(this.setMax);
            } else if (setmin instanceof setLeftButtonText.setMin.length) {
                FriendsFeedsFragment.toIntRange(this.setMax);
            } else if (setmin instanceof setLeftButtonText.setMin.IsOverlapping) {
                this.setMax.setDefaultImpl();
            } else if (setmin instanceof setLeftButtonText.setMin.getMin) {
                this.setMax.onMessageChannelReady();
            } else if (setmin instanceof setLeftButtonText.setMin.setMax) {
                FriendsFeedsFragment.toFloatRange(this.setMax);
            } else if (setmin instanceof setLeftButtonText.setMin.toFloatRange) {
                FriendsFeedsFragment.toString(this.setMax);
            }
        }

        public final void getMin(boolean z) {
            this.setMax.toFloatRange = z;
            this.setMax.setMax.getMin = z && !this.setMax.FastBitmap$CoordinateSystem();
        }

        public final void setMax(int i) {
            FeedsMeHeaderView feedsMeHeaderView = (FeedsMeHeaderView) this.setMax.getMin(resetInternal.setMax.updatePreDraw);
            if (feedsMeHeaderView != null) {
                feedsMeHeaderView.setFeedNotificationCount(i);
            }
        }

        public final void length(boolean z) {
            this.setMax.FastBitmap$CoordinateSystem = z;
            FeedsMeHeaderView feedsMeHeaderView = (FeedsMeHeaderView) this.setMax.getMin(resetInternal.setMax.updatePreDraw);
            if (feedsMeHeaderView != null) {
                feedsMeHeaderView.renderNotificationIcon(z);
            }
        }

        public final void setMin(boolean z) {
            this.setMax.values = z;
            FriendsFeedsFragment.hashCode(this.setMax).setMax = z;
        }

        public final void getMin(@NotNull setFocusable setfocusable) {
            Intrinsics.checkNotNullParameter(setfocusable, "myFeedHeader");
            LoadingLottieAnimationView loadingLottieAnimationView = this.setMax.getMin;
            if (loadingLottieAnimationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
            }
            loadingLottieAnimationView.cancelAnimation();
            FriendsFeedsFragment.getMax(this.setMax, setfocusable);
            FriendsFeedsFragment.setMin(this.setMax, setfocusable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/social/fragment/FriendsFeedsFragment$inject$2", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements style.getMin {
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

        isInside() {
        }
    }

    public final void onMessageChannelReady() {
        setMax(true);
        setEmptyView setemptyview = new setEmptyView(4, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28);
        Intrinsics.checkNotNullParameter(setemptyview, "<set-?>");
        this.setMin = setemptyview;
        if (this.setMax.getMax().isEmpty()) {
            getMax().add(new setEmptyView(4, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 30));
        }
        onTransact();
    }

    public final void extraCallbackWithResult() {
        if (onPostMessage() && !values()) {
            invokeSuspend();
            if (this.presenter != null && getDefaultImpl() && getInterfaceDescriptor()) {
                b();
                setLeftButtonText.length length2 = this.presenter;
                if (length2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length2.isInside();
            }
            ICustomTabsCallback();
        }
    }

    public final void ICustomTabsCallback$Stub() {
        super.ICustomTabsCallback$Stub();
        if (getDefaultImpl() && getInterfaceDescriptor()) {
            setLeftButtonText.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length2.toFloatRange();
            setLeftButtonText.length length3 = this.presenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length3.invoke();
            setLeftButtonText.length length4 = this.presenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length4.invokeSuspend();
            FeedsMeHeaderView feedsMeHeaderView = (FeedsMeHeaderView) getMin(resetInternal.setMax.updatePreDraw);
            if (feedsMeHeaderView != null) {
                feedsMeHeaderView.setProfileName("%fetching%");
                feedsMeHeaderView.setProfileAvatar("");
                feedsMeHeaderView.setPrivacy(false);
                feedsMeHeaderView.showKycVerified(false);
            }
            ((setLoadingText) this.equals.getValue()).getMin(CollectionsKt.emptyList());
            ((adjustLinePosition) this.toIntRange.getValue()).getMin(CollectionsKt.emptyList());
            extraCallback();
            asBinder();
            Context context = getContext();
            if (context != null) {
                Intrinsics.checkNotNullExpressionValue(context, "it");
                Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
                setButtonStyle.getMax(context, ExistingWorkPolicy.KEEP, 0, TimeUnit.SECONDS);
                setButtonStyle.getMin(context, 0, TimeUnit.SECONDS);
            }
            setLeftButtonText.length length5 = this.presenter;
            if (length5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length5.setMin();
            setLeftButtonText.length length6 = this.presenter;
            if (length6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length6.setMin(false);
            setLeftButtonText.length length7 = this.presenter;
            if (length7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length7.values();
        }
    }

    @NotNull
    public final initContent equals() {
        return this.toDoubleRange;
    }

    public final boolean asInterface() {
        setLeftButtonText.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length2.getMax();
    }

    public final void onResume() {
        super.onResume();
        if (getDefaultImpl()) {
            if (getInterfaceDescriptor()) {
                if (this.presenter != null) {
                    setLeftButtonText.length length2 = this.presenter;
                    if (length2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    }
                    length2.setMin();
                }
                setLeftButtonText.length length3 = this.presenter;
                if (length3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length3.values();
                setLeftButtonText.length length4 = this.presenter;
                if (length4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length4.getMin();
            } else {
                setMax(false);
                setLeftButtonText.length length5 = this.presenter;
                if (length5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length5.equals();
            }
            if (this.FastBitmap$CoordinateSystem) {
                setLeftButtonText.length length6 = this.presenter;
                if (length6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length6.FastBitmap$CoordinateSystem();
            }
        }
    }

    public final void o_() {
        super.o_();
        if (this.presenter != null && getDefaultImpl() && this.FastBitmap$CoordinateSystem) {
            setLeftButtonText.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length2.FastBitmap$CoordinateSystem();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"id/dana/social/fragment/FriendsFeedsFragment$showContactPermissionBottomSheet$1$1", "Lid/dana/social/view/fragment/ContactPermissionBottomSheetDialogFragment$BottomSheetListener;", "onBottomSheetDismissed", "", "onNegativeButtonClicked", "onPositiveButtonClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class values implements getHorizonPadding.getMax {
        final /* synthetic */ getHorizonPadding getMax;
        final /* synthetic */ FriendsFeedsFragment setMax;

        values(getHorizonPadding gethorizonpadding, FriendsFeedsFragment friendsFeedsFragment) {
            this.getMax = gethorizonpadding;
            this.setMax = friendsFeedsFragment;
        }

        public final void getMin() {
            this.getMax.dismiss();
            FriendsFeedsFragment.toDoubleRange(this.setMax).setMin();
        }

        public final void length() {
            this.getMax.dismiss();
            FeedOnboardingView feedOnboardingView = (FeedOnboardingView) this.getMax.setMin(resetInternal.setMax.setHorizontalAlign);
            if (feedOnboardingView != null) {
                feedOnboardingView.renderButtonEnabled();
            }
        }

        public final void getMax() {
            FeedOnboardingView feedOnboardingView = (FeedOnboardingView) this.getMax.setMin(resetInternal.setMax.setHorizontalAlign);
            if (feedOnboardingView != null) {
                feedOnboardingView.renderButtonEnabled();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/fragment/FriendsFeedsFragment$myFeedsHeaderOnClick$1$1"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ FeedsMeHeaderView getMax;
        final /* synthetic */ setFocusable setMax;
        final /* synthetic */ FriendsFeedsFragment setMin;

        IsOverlapping(FeedsMeHeaderView feedsMeHeaderView, FriendsFeedsFragment friendsFeedsFragment, setFocusable setfocusable) {
            this.getMax = feedsMeHeaderView;
            this.setMin = friendsFeedsFragment;
            this.setMax = setfocusable;
        }

        public final void onClick(View view) {
            Context context = this.getMax.getContext();
            if (context != null) {
                SocialProfileActivity.getMin getmin = SocialProfileActivity.Companion;
                SocialProfileActivity.getMin.setMin(context, new RelationshipItemModel(this.setMax.getMin, "", this.setMax.length, "SELF", this.setMax.getMax, this.setMax.setMax, 64));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/social/fragment/FriendsFeedsFragment$myFeedsHeaderOnClick$1$2"}, k = 3, mv = {1, 4, 2})
    static final class hashCode extends Lambda implements Function0<Unit> {
        final /* synthetic */ setFocusable $myFeedHeaderModel$inlined;
        final /* synthetic */ FeedsMeHeaderView $this_run;
        final /* synthetic */ FriendsFeedsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        hashCode(FeedsMeHeaderView feedsMeHeaderView, FriendsFeedsFragment friendsFeedsFragment, setFocusable setfocusable) {
            super(0);
            this.$this_run = feedsMeHeaderView;
            this.this$0 = friendsFeedsFragment;
            this.$myFeedHeaderModel$inlined = setfocusable;
        }

        public final void invoke() {
            AUHorizontalListView.SelectionNotifier selectionNotifier = this.this$0.friendshipAnalyticTracker;
            if (selectionNotifier == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
            }
            selectionNotifier.getMax();
            Context context = this.$this_run.getContext();
            if (context != null) {
                FeedNotificationActivity.length length = FeedNotificationActivity.Companion;
                FeedNotificationActivity.length.getMax(context, this.this$0.toFloatRange);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/social/fragment/FriendsFeedsFragment$Companion;", "", "()V", "DELAY_FETCH_FEED_ON_RESUME", "", "DISABLED_LOAD_MORE_DURATION", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final boolean getDefaultImpl() {
        return setStateOn.getMin(this.getMax, "android.permission.READ_CONTACTS");
    }

    private final boolean length(FeedModel feedModel) {
        HashMap<String, String> hashMap = feedModel.IsOverlapping;
        String userId = hashMap != null ? setBuildNumber.getUserId(hashMap) : null;
        setLeftButtonText.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return Intrinsics.areEqual((Object) userId, (Object) length2.length());
    }

    public final /* synthetic */ RecyclerView.Adapter invoke() {
        super.invoke();
        return new ConcatAdapter((setLoadingText) this.equals.getValue(), (adjustLinePosition) this.toIntRange.getValue(), this.setMax);
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        if (!((setStateOn) this.toString.getValue()).getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public static final /* synthetic */ void setMax(FriendsFeedsFragment friendsFeedsFragment) {
        friendsFeedsFragment.ICustomTabsService();
        setLeftButtonText.length length2 = friendsFeedsFragment.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.getMax(new toIntRange(friendsFeedsFragment));
        if (!friendsFeedsFragment.getInterfaceDescriptor()) {
            setLeftButtonText.length length3 = friendsFeedsFragment.presenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length3.equals();
            length3.IsOverlapping();
        }
    }

    public static final /* synthetic */ void setMax(FriendsFeedsFragment friendsFeedsFragment, getHorizonPadding gethorizonpadding) {
        if (gethorizonpadding != null) {
            BaseActivity baseActivity = friendsFeedsFragment.getMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            gethorizonpadding.show(baseActivity.getSupportFragmentManager(), "");
        }
        if (gethorizonpadding != null) {
            gethorizonpadding.getMin = new values(gethorizonpadding, friendsFeedsFragment);
        }
    }

    public static final /* synthetic */ getHorizonPadding setMin(FriendsFeedsFragment friendsFeedsFragment) {
        return (getHorizonPadding) friendsFeedsFragment.hashCode.getValue();
    }

    public static final /* synthetic */ void getMin(FriendsFeedsFragment friendsFeedsFragment, List list) {
        FriendsFeedsFragment friendsFeedsFragment2 = friendsFeedsFragment;
        friendsFeedsFragment2.setMax(true);
        LoadingLottieAnimationView loadingLottieAnimationView = friendsFeedsFragment2.getMin;
        if (loadingLottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        loadingLottieAnimationView.cancelAnimation();
        friendsFeedsFragment.create();
        RecyclerView recyclerView = friendsFeedsFragment2.rvFeeds;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvFeeds");
        }
        recyclerView.setVisibility(0);
        FeedModel.setMax setmax = FeedModel.Grayscale$Algorithm;
        List list2 = list;
        Intrinsics.checkNotNullParameter(list2, "topFriendModels");
        ((setLoadingText) friendsFeedsFragment2.equals.getValue()).getMin(CollectionsKt.listOf(new setEmptyView(3, new FeedModel((String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, false, (HashMap) null, (String) null, (String) null, false, 0, (List) null, (List) null, (String) null, (String) null, 65535), (setFocusableInTouchMode) null, list2, (RelationshipItemModel) null, 20)));
        friendsFeedsFragment.getMax().clear();
        friendsFeedsFragment.onTransact();
    }

    public static final /* synthetic */ void getMax(FriendsFeedsFragment friendsFeedsFragment) {
        friendsFeedsFragment.setMax(true);
        friendsFeedsFragment.onMessageChannelReady();
        LoadingLottieAnimationView loadingLottieAnimationView = friendsFeedsFragment.getMin;
        if (loadingLottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        loadingLottieAnimationView.cancelAnimation();
    }

    public static final /* synthetic */ adjustLinePosition getMin(FriendsFeedsFragment friendsFeedsFragment) {
        return (adjustLinePosition) friendsFeedsFragment.toIntRange.getValue();
    }

    public static final /* synthetic */ void length(FriendsFeedsFragment friendsFeedsFragment, boolean z) {
        friendsFeedsFragment.setMax(true);
        LoadingLottieAnimationView loadingLottieAnimationView = friendsFeedsFragment.getMin;
        if (loadingLottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        loadingLottieAnimationView.cancelAnimation();
        friendsFeedsFragment.create();
        if (!z) {
            friendsFeedsFragment.getCause();
        }
    }

    public static final /* synthetic */ void getMax(FriendsFeedsFragment friendsFeedsFragment, List list) {
        friendsFeedsFragment.setMax(true);
        LoadingLottieAnimationView loadingLottieAnimationView = friendsFeedsFragment.getMin;
        if (loadingLottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        loadingLottieAnimationView.cancelAnimation();
        friendsFeedsFragment.create();
        RecyclerView recyclerView = friendsFeedsFragment.rvFeeds;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvFeeds");
        }
        recyclerView.setVisibility(0);
        friendsFeedsFragment.getMax().addAll(list);
        friendsFeedsFragment.setMax.length(list);
    }

    public static final /* synthetic */ void equals(FriendsFeedsFragment friendsFeedsFragment) {
        friendsFeedsFragment.setMax(true);
        setLeftButtonText.length length2 = friendsFeedsFragment.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.toIntRange();
        friendsFeedsFragment.ICustomTabsCallback$Stub$Proxy();
    }

    public static final /* synthetic */ void toIntRange(FriendsFeedsFragment friendsFeedsFragment) {
        FeedOnboardingView feedOnboardingView = (FeedOnboardingView) friendsFeedsFragment.getMin(resetInternal.setMax.setHorizontalAlign);
        if (feedOnboardingView != null) {
            feedOnboardingView.setVisibility(0);
        }
        FeedOnboardingView feedOnboardingView2 = (FeedOnboardingView) friendsFeedsFragment.getMin(resetInternal.setMax.setHorizontalAlign);
        if (feedOnboardingView2 != null) {
            feedOnboardingView2.renderButtonError();
        }
        View min = friendsFeedsFragment.getMin(resetInternal.setMax.onTransitionCompleted);
        if (min != null) {
            min.setVisibility(8);
        }
    }

    public static final /* synthetic */ void toFloatRange(FriendsFeedsFragment friendsFeedsFragment) {
        friendsFeedsFragment.setMax(false);
        setEmptyView setemptyview = new setEmptyView(12, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28);
        Intrinsics.checkNotNullParameter(setemptyview, "<set-?>");
        friendsFeedsFragment.setMin = setemptyview;
        friendsFeedsFragment.onTransact();
    }

    public static final /* synthetic */ void toString(FriendsFeedsFragment friendsFeedsFragment) {
        Context context = friendsFeedsFragment.getContext();
        if (context != null) {
            Intrinsics.checkNotNullExpressionValue(context, "it");
            LiveData<List<WorkInfo>> max = setButtonStyle.getMax(context);
            setChecked setchecked = friendsFeedsFragment;
            setLeftButtonText.length length2 = friendsFeedsFragment.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            max.getMax(setchecked, length2.setMax(new FriendsFeedsFragment$FastBitmap$CoordinateSystem(max)));
        }
    }

    public static final /* synthetic */ setLoadingText hashCode(FriendsFeedsFragment friendsFeedsFragment) {
        return (setLoadingText) friendsFeedsFragment.equals.getValue();
    }

    public static final /* synthetic */ void getMax(FriendsFeedsFragment friendsFeedsFragment, setFocusable setfocusable) {
        FeedsMeHeaderView feedsMeHeaderView;
        if (setfocusable != null && (feedsMeHeaderView = (FeedsMeHeaderView) friendsFeedsFragment.getMin(resetInternal.setMax.updatePreDraw)) != null) {
            feedsMeHeaderView.setProfileName(setfocusable.length);
            feedsMeHeaderView.setProfileAvatar(setfocusable.getMax);
            feedsMeHeaderView.setPrivacy(setfocusable.length());
            feedsMeHeaderView.showKycVerified(setfocusable.setMax());
            feedsMeHeaderView.setUsername(setfocusable.setMax);
        }
    }

    public static final /* synthetic */ void setMin(FriendsFeedsFragment friendsFeedsFragment, setFocusable setfocusable) {
        FeedsMeHeaderView feedsMeHeaderView = (FeedsMeHeaderView) friendsFeedsFragment.getMin(resetInternal.setMax.updatePreDraw);
        if (feedsMeHeaderView != null) {
            feedsMeHeaderView.setOnProfileNameSectionClicked(new IsOverlapping(feedsMeHeaderView, friendsFeedsFragment, setfocusable));
            feedsMeHeaderView.setOnFeedNotificationClicked(new hashCode(feedsMeHeaderView, friendsFeedsFragment, setfocusable));
        }
    }

    public static final /* synthetic */ setStateOn toDoubleRange(FriendsFeedsFragment friendsFeedsFragment) {
        return (setStateOn) friendsFeedsFragment.toString.getValue();
    }

    public static final /* synthetic */ ArrayList setMin(List list) {
        Iterable<FeedModel> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (FeedModel feedModel : iterable) {
            arrayList.add(feedModel.setMin);
        }
        return new ArrayList((List) arrayList);
    }

    public static final /* synthetic */ void setMax(FriendsFeedsFragment friendsFeedsFragment, setEmptyView setemptyview) {
        FeedModel feedModel = setemptyview.setMax;
        if (feedModel == null) {
            return;
        }
        if (friendsFeedsFragment.length(feedModel)) {
            RelationshipItemModel max = setNextSelectedPositionInt.setMax(feedModel);
            Intrinsics.checkNotNullParameter("SELF", "<set-?>");
            max.getMax = "SELF";
            Context context = friendsFeedsFragment.getContext();
            if (context != null) {
                SocialProfileActivity.getMin getmin = SocialProfileActivity.Companion;
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                SocialProfileActivity.getMin.setMin(context, max);
                return;
            }
            return;
        }
        RelationshipItemModel max2 = setNextSelectedPositionInt.setMax(feedModel);
        Context context2 = friendsFeedsFragment.getContext();
        if (context2 != null) {
            SocialProfileActivity.getMin getmin2 = SocialProfileActivity.Companion;
            Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
            SocialProfileActivity.getMin.setMin(context2, max2);
        }
    }

    public static final /* synthetic */ void length(FriendsFeedsFragment friendsFeedsFragment, setEmptyView setemptyview) {
        Context context;
        FeedModel feedModel = setemptyview.setMax;
        if (feedModel != null && (context = friendsFeedsFragment.getContext()) != null) {
            SocialActivityDetail.setMax setmax = SocialActivityDetail.Companion;
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            SocialActivityDetail.setMax.setMax(context, feedModel);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.Grayscale$Algorithm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
