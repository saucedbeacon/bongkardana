package id.dana.social.fragment;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.DanaApplication;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.OauthModule;
import id.dana.model.ThirdPartyService;
import id.dana.richview.LoadingLottieAnimationView;
import id.dana.social.di.module.MyFeedsModule;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import id.dana.social.view.activity.SocialProfileActivity;
import id.dana.tracker.TrackerKey;
import java.util.Collection;
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
import o.AUPopSupportPreemption;
import o.GriverRpcUtils;
import o.WebSocketBridgeCallback;
import o.access$1702;
import o.getBackButton;
import o.getContextMenuInfo;
import o.initContent;
import o.initStyleByTheme;
import o.onDelete;
import o.sendSocketMessage;
import o.setEmptyView;
import o.setFocusableInTouchMode;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0019\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001cH\u0014J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\nH\u0016J\b\u0010%\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u001cH\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J\b\u0010+\u001a\u00020\u001cH\u0016J\b\u0010,\u001a\u00020\u001cH\u0016J\b\u0010-\u001a\u00020\u001cH\u0016J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u00061"}, d2 = {"Lid/dana/social/fragment/MyFeedsFragment;", "Lid/dana/social/fragment/BaseFeedTimelineFragment;", "()V", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "highlightEnable", "", "myFeedHighlightAdapter", "Lid/dana/social/adapter/MyFeedHighlightAdapter;", "getMyFeedHighlightAdapter", "()Lid/dana/social/adapter/MyFeedHighlightAdapter;", "myFeedHighlightAdapter$delegate", "Lkotlin/Lazy;", "myFeedSessionStarted", "presenter", "Lid/dana/social/contract/MyFeedsContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/MyFeedsContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/MyFeedsContract$Presenter;)V", "socialFeedListener", "id/dana/social/fragment/MyFeedsFragment$socialFeedListener$1", "Lid/dana/social/fragment/MyFeedsFragment$socialFeedListener$1;", "fetchFeed", "", "getAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "getHighlight", "getSocialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "init", "inject", "isCurrentUserFeedPage", "isHasMore", "onFeedClicked", "feedViewModel", "Lid/dana/social/model/FeedViewHolderModel;", "onHeaderClicked", "onRefresh", "onSelected", "onTouchBottom", "onUnSelected", "resetAdapter", "showEmptyState", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MyFeedsFragment extends BaseFeedTimelineFragment {
    @NotNull
    public static final setMax toIntRange = new setMax((byte) 0);
    private final Lazy IsOverlapping = LazyKt.lazy(new getMax(this));
    /* access modifiers changed from: private */
    public boolean equals;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    @Inject
    public getBackButton.length presenter;
    private boolean toFloatRange;
    private HashMap toString;
    private final setMin values = new setMin(this);

    public final boolean FastBitmap$CoordinateSystem() {
        return true;
    }

    public final void ICustomTabsCallback$Default() {
        HashMap hashMap = this.toString;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View getMin(int i) {
        if (this.toString == null) {
            this.toString = new HashMap();
        }
        View view = (View) this.toString.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toString.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/social/adapter/MyFeedHighlightAdapter;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<sendSocketMessage> {
        final /* synthetic */ MyFeedsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(MyFeedsFragment myFeedsFragment) {
            super(0);
            this.this$0 = myFeedsFragment;
        }

        @NotNull
        public final sendSocketMessage invoke() {
            return new sendSocketMessage(new WebSocketBridgeCallback(this) {
                final /* synthetic */ getMax setMax;

                {
                    this.setMax = r1;
                }

                public final void setMin(@NotNull getContextMenuInfo getcontextmenuinfo) {
                    Intrinsics.checkNotNullParameter(getcontextmenuinfo, "feedHighlightModel");
                    AUHorizontalListView.SelectionNotifier selectionNotifier = this.setMax.this$0.friendshipAnalyticTracker;
                    if (selectionNotifier == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
                    }
                    selectionNotifier.setMin(getcontextmenuinfo);
                    getBackButton.length length = this.setMax.this$0.presenter;
                    if (length == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    }
                    HashMap<String, String> hashMap = getcontextmenuinfo.getMin;
                    if (hashMap != null) {
                        length.getMax(hashMap);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String?>");
                }

                public final void length(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "maxId");
                    getBackButton.length length = this.setMax.this$0.presenter;
                    if (length == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    }
                    length.setMax(str);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/fragment/MyFeedsFragment$socialFeedListener$1", "Lid/dana/social/adapter/BaseSocialFeedInteraction;", "onFeedAvatarImageClicked", "", "itemPosition", "", "onItemClicked", "onProfileHeaderNameSectionClicked", "onSocialFeedSpanClicked", "content", "Lid/dana/social/utils/Content;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverRpcUtils.AnonymousClass1 {
        final /* synthetic */ MyFeedsFragment getMin;

        public final void getMin(int i) {
        }

        setMin(MyFeedsFragment myFeedsFragment) {
            this.getMin = myFeedsFragment;
        }

        public final void getMax() {
            String str;
            FeedModel feedModel = this.getMin.setMin.setMax;
            String str2 = null;
            String str3 = feedModel != null ? feedModel.setMin : null;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = feedModel != null ? feedModel.getMax : null;
            if (str4 == null) {
                str4 = "";
            }
            if (feedModel != null) {
                str2 = feedModel.equals;
            }
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
            RelationshipItemModel relationshipItemModel = new RelationshipItemModel(str3, "", str4, "SELF", str, (String) null, 96);
            Context context = this.getMin.getContext();
            if (context != null) {
                SocialProfileActivity.getMin getmin = SocialProfileActivity.Companion;
                Intrinsics.checkNotNullExpressionValue(context, "this");
                SocialProfileActivity.getMin.setMin(context, relationshipItemModel);
            }
        }

        public final void setMax(@NotNull AUHorizontalListView.SavedState.AnonymousClass1 r3) {
            Intrinsics.checkNotNullParameter(r3, "content");
            AUHorizontalListView.SelectionNotifier selectionNotifier = this.getMin.friendshipAnalyticTracker;
            if (selectionNotifier == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
            }
            selectionNotifier.length(r3, TrackerKey.Event.NOTIFICATION_INBOX_READ);
            getBackButton.length length = this.getMin.presenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            String str = r3.getMin;
            if (str == null) {
                str = "";
            }
            length.getMin(str);
        }

        public final void setMax(int i) {
            setEmptyView setemptyview = (setEmptyView) this.getMin.setMax.setMin(i);
            if (setemptyview != null) {
                if (5 == setemptyview.getMin) {
                    MyFeedsFragment.setMax(this.getMin, setemptyview);
                }
                FeedModel feedModel = setemptyview.setMax;
                if (feedModel != null) {
                    AUHorizontalListView.SelectionNotifier selectionNotifier = this.getMin.friendshipAnalyticTracker;
                    if (selectionNotifier == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
                    }
                    selectionNotifier.length(feedModel);
                    HashMap<String, String> hashMap = feedModel.IsOverlapping;
                    if (hashMap != null) {
                        getBackButton.length length = this.getMin.presenter;
                        if (length == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("presenter");
                        }
                        length.getMax(hashMap);
                    }
                }
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
            MyFeedsModule myFeedsModule = new MyFeedsModule(new getMin(this));
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            max.getMax = this.getMax;
            max.length = TrackerKey.SourceType.FRIENDSHIP_MY_FEED;
            DeepLinkModule deepLinkModule = new DeepLinkModule(max, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(deepLinkModule, "DeepLinkModule.builder()…IENDSHIP_MY_FEED).build()");
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
            socialCommonComponent.length(myFeedsModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, new ServicesModule((style.getMin) new length())).length(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        getBackButton.length length3 = this.presenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getminArr[0] = length3;
        getMin(getminArr);
        asBinder();
        this.setMax.getMin(onRelationshipValidationResult());
        access$1702.setMax setmax = access$1702.getMin;
        ((sendSocketMessage) this.IsOverlapping.getValue()).getMin(access$1702.setMax.setMin());
        getBackButton.length length4 = this.presenter;
        if (length4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length4.length();
        getBackButton.length length5 = this.presenter;
        if (length5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length5.getMin();
    }

    public final boolean asInterface() {
        getBackButton.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length2.getMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"id/dana/social/fragment/MyFeedsFragment$inject$1", "Lid/dana/social/contract/MyFeedsContract$View;", "onGetFeedHighlightEnableSuccess", "", "enable", "", "onGetMyFeedsError", "onGetMyFeedsSuccess", "feeds", "", "Lid/dana/social/model/FeedViewHolderModel;", "onGlobalNotifications", "feedHighlightModel", "Lid/dana/social/model/MyFeedHighlightModel;", "onMarkNotificationAsRead", "feedViewModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements getBackButton.getMin {
        final /* synthetic */ MyFeedsFragment getMin;

        getMin(MyFeedsFragment myFeedsFragment) {
            this.getMin = myFeedsFragment;
        }

        public final void setMin(@NotNull setEmptyView setemptyview) {
            String str;
            String str2;
            String str3;
            Intrinsics.checkNotNullParameter(setemptyview, "feedViewModel");
            initStyleByTheme initstylebytheme = this.getMin.setMax;
            Intrinsics.checkNotNullParameter(setemptyview, "feedModel");
            if (initstylebytheme.getMax() != null) {
                FeedModel feedModel = setemptyview.setMax;
                if (feedModel != null) {
                    str = feedModel.setMin;
                } else {
                    str = null;
                }
                if (str != null) {
                    List max = initstylebytheme.getMax();
                    Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
                    int size = max.size();
                    for (int i = 0; i < size; i++) {
                        FeedModel feedModel2 = ((setEmptyView) initstylebytheme.getMax().get(i)).setMax;
                        if (feedModel2 != null) {
                            str2 = feedModel2.setMin;
                        } else {
                            str2 = null;
                        }
                        FeedModel feedModel3 = setemptyview.setMax;
                        if (feedModel3 != null) {
                            str3 = feedModel3.setMin;
                        } else {
                            str3 = null;
                        }
                        if (Intrinsics.areEqual((Object) str2, (Object) str3)) {
                            initstylebytheme.getMax().set(i, setemptyview);
                            initstylebytheme.notifyItemChanged(i);
                            return;
                        }
                    }
                }
            }
        }

        public final void setMax(@NotNull access$1702 access_1702) {
            Intrinsics.checkNotNullParameter(access_1702, "feedHighlightModel");
            MyFeedsFragment.getMin(this.getMin).getMin(CollectionsKt.listOf(access_1702));
        }

        public final void setMax(boolean z) {
            this.getMin.equals = z;
            this.getMin.getDefaultImpl();
        }

        public final void getMin() {
            LoadingLottieAnimationView loadingLottieAnimationView = this.getMin.getMin;
            if (loadingLottieAnimationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
            }
            loadingLottieAnimationView.cancelAnimation();
            this.getMin.create();
            this.getMin.onMessageChannelReady();
        }

        public final void getMin(@Nullable List<setEmptyView> list) {
            this.getMin.create();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                this.getMin.setMax.getMin(CollectionsKt.listOf(new setEmptyView(10, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 30)));
            } else {
                this.getMin.setMax.setMax(list);
            }
            LoadingLottieAnimationView loadingLottieAnimationView = this.getMin.getMin;
            if (loadingLottieAnimationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
            }
            loadingLottieAnimationView.cancelAnimation();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/social/fragment/MyFeedsFragment$inject$2", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements style.getMin {
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

        length() {
        }
    }

    public final void valueOf() {
        getBackButton.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.getMin("https://link.dana.id/setting-more");
    }

    public final void onMessageChannelReady() {
        setEmptyView setemptyview = new setEmptyView(10, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28);
        Intrinsics.checkNotNullParameter(setemptyview, "<set-?>");
        this.setMin = setemptyview;
        onTransact();
    }

    /* access modifiers changed from: private */
    public final void getDefaultImpl() {
        if (this.equals) {
            ((sendSocketMessage) this.IsOverlapping.getValue()).setMax();
            getBackButton.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length2.setMax("");
            return;
        }
        access$1702.setMax setmax = access$1702.getMin;
        ((sendSocketMessage) this.IsOverlapping.getValue()).getMin(access$1702.setMax.setMin());
    }

    public final void extraCallbackWithResult() {
        if (onPostMessage() && !values() && this.presenter != null) {
            invokeSuspend();
            b();
            getBackButton.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length2.getMin();
        }
    }

    @NotNull
    public final initContent equals() {
        return this.values;
    }

    public final void o_() {
        super.o_();
        if (!this.toFloatRange) {
            ICustomTabsCallback$Stub();
            this.toFloatRange = true;
        }
    }

    public final void IsOverlapping() {
        super.IsOverlapping();
        this.toFloatRange = false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/social/fragment/MyFeedsFragment$Companion;", "", "()V", "DISABLED_LOAD_MORE_DURATION", "", "SETTING_MORE_PAY_LOAD", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final /* synthetic */ RecyclerView.Adapter invoke() {
        super.invoke();
        return new ConcatAdapter((sendSocketMessage) this.IsOverlapping.getValue(), this.setMax);
    }

    public final void ICustomTabsCallback$Stub() {
        if (this.presenter != null) {
            this.setMax.getMin(onRelationshipValidationResult());
            getDefaultImpl();
            getBackButton.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length2.setMin();
        }
    }

    public static final /* synthetic */ sendSocketMessage getMin(MyFeedsFragment myFeedsFragment) {
        return (sendSocketMessage) myFeedsFragment.IsOverlapping.getValue();
    }

    public static final /* synthetic */ void setMax(MyFeedsFragment myFeedsFragment, setEmptyView setemptyview) {
        getBackButton.length length2 = myFeedsFragment.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.length(setemptyview);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toString;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
