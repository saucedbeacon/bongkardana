package id.dana.social.view.activity;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import butterknife.OnClick;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.model.ThirdPartyService;
import id.dana.myprofile.MyProfileBundleKey;
import id.dana.myprofile.SettingMoreProfileActivity;
import id.dana.social.di.module.SocialProfileModule;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import id.dana.social.view.activity.detail.SocialActivityDetail;
import id.dana.tracker.TrackerKey;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUBasicDialog;
import o.AUHorizontalListView;
import o.AUPopSupportPreemption;
import o.GriverRpcUtils;
import o.SwipeRefreshLayout;
import o.access$1602;
import o.dispatchOnCancelled;
import o.getMsgText;
import o.getRightButtonIconView;
import o.initContent;
import o.initStyleByTheme;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.registerOnLoadCanceledListener;
import o.resetInternal;
import o.setBuildNumber;
import o.setEmptyView;
import o.setFocusableInTouchMode;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f*\u0001\u0013\u0018\u0000 n2\u00020\u0001:\u0001nB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0002J\b\u0010*\u001a\u00020'H\u0002J\b\u0010+\u001a\u00020'H\u0002J\b\u0010,\u001a\u00020'H\u0007J\b\u0010-\u001a\u00020'H\u0002J\b\u0010.\u001a\u00020\u0004H\u0002J\u0010\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020\fH\u0002J\b\u00101\u001a\u00020'H\u0014J\b\u00102\u001a\u00020'H\u0002J\u0010\u00103\u001a\u00020'2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\fH\u0002J\b\u00107\u001a\u000205H\u0002J\b\u00108\u001a\u000205H\u0016J\u0016\u00109\u001a\u00020'2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020'0;H\u0002J\u0010\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020'H\u0002J\b\u0010@\u001a\u00020'H\u0002J\b\u0010A\u001a\u00020'H\u0016J\u0006\u0010B\u001a\u00020'J\b\u0010C\u001a\u00020'H\u0002J\b\u0010D\u001a\u00020'H\u0002J\b\u0010E\u001a\u00020'H\u0002J\b\u0010F\u001a\u00020'H\u0002J\b\u0010G\u001a\u00020\u0004H\u0002J\b\u0010H\u001a\u00020\u0004H\u0002J\b\u0010I\u001a\u00020\u0004H\u0002J\b\u0010J\u001a\u00020\u0004H\u0002J\b\u0010K\u001a\u00020\u0004H\u0002J\b\u0010L\u001a\u00020'H\u0002J\u0010\u0010M\u001a\u00020'2\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020'H\u0002J\u0012\u0010Q\u001a\u00020'2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0012\u0010T\u001a\u00020'2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\b\u0010W\u001a\u00020'H\u0002J\b\u0010X\u001a\u00020'H\u0002J\b\u0010Y\u001a\u00020'H\u0002J\b\u0010Z\u001a\u00020'H\u0002J\u0010\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020\u0004H\u0002J\b\u0010]\u001a\u00020'H\u0002J\u0010\u0010^\u001a\u00020'2\u0006\u0010_\u001a\u00020`H\u0002J\b\u0010a\u001a\u00020'H\u0002J\b\u0010b\u001a\u00020'H\u0002J\b\u0010c\u001a\u00020'H\u0002J\b\u0010d\u001a\u00020'H\u0002J\b\u0010e\u001a\u00020'H\u0002J\b\u0010f\u001a\u00020'H\u0002J\b\u0010g\u001a\u00020'H\u0002J\u0010\u0010h\u001a\u00020'2\u0006\u0010i\u001a\u00020`H\u0002J\u0010\u0010j\u001a\u00020'2\u0006\u0010i\u001a\u00020`H\u0002J\b\u0010k\u001a\u00020'H\u0002J\b\u0010l\u001a\u00020'H\u0002J\b\u0010m\u001a\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006o"}, d2 = {"Lid/dana/social/view/activity/SocialProfileActivity;", "Lid/dana/base/BaseActivity;", "()V", "fetchingFeeds", "", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "headerFeedModel", "Lid/dana/social/model/FeedViewHolderModel;", "lavLoadingAnimation", "Lcom/airbnb/lottie/LottieAnimationView;", "relationshipItemModel", "Lid/dana/social/model/RelationshipItemModel;", "showCommentButton", "socialFeedListener", "id/dana/social/view/activity/SocialProfileActivity$socialFeedListener$1", "Lid/dana/social/view/activity/SocialProfileActivity$socialFeedListener$1;", "socialFeeds", "", "socialFeedsAdapter", "Lid/dana/social/adapter/SocialFeedsAdapter;", "socialModifyRelationBotttomSheetDialog", "Lid/dana/social/view/fragment/SocialModifyRelationBotttomSheetDialog;", "getSocialModifyRelationBotttomSheetDialog", "()Lid/dana/social/view/fragment/SocialModifyRelationBotttomSheetDialog;", "socialModifyRelationBotttomSheetDialog$delegate", "Lkotlin/Lazy;", "socialProfilePresenter", "Lid/dana/social/contract/SocialProfileContract$Presenter;", "getSocialProfilePresenter", "()Lid/dana/social/contract/SocialProfileContract$Presenter;", "setSocialProfilePresenter", "(Lid/dana/social/contract/SocialProfileContract$Presenter;)V", "stopRefreshAnimationOnRepeat", "addInitialFeedListWithProfileItem", "", "feedViewModelList", "", "appendLoadMore", "appendLoading", "backToTop", "blockFriend", "canScrollToLoadMore", "checkProfileNameIntegrity", "firstItem", "configToolbar", "doDelayDisableLoadMore", "doSmoothScroll", "position", "", "getFetchingFeedViewModel", "getLastItemPosition", "getLayout", "getTimelineWithStatusChecking", "onStatusActive", "Lkotlin/Function0;", "goToProfileActivity", "setting", "Lid/dana/domain/profilemenu/model/SettingModel;", "handleRelationshipItemBundleData", "hideEmptyState", "init", "initComponent", "initPullToRefreshComponent", "initPullToRefreshHeaderView", "initRecylerView", "initScrollListener", "isFeedsAdapterEmpty", "isFirstItemVisible", "isLastItemFeed", "isLastItemLoadMore", "isLoadingAnimationInitialized", "loadUserProfileHeader", "modifyRelationshipCompleted", "operationType", "Lid/dana/domain/social/ModifyRelationOperationType;", "muteFriend", "onClickRightMenuButton", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRefresh", "onStatusNotActive", "onTouchBottom", "removeFetchingDataView", "setCvBackToTopVisibility", "visible", "setFetchingFeedsFalse", "setRightMenuButtonTextBasedOnRelationshipStatus", "status", "", "setupSettingRightMenuButton", "setupUnblockButton", "showEmptyState", "showEmptyStateActive", "showEmptyStateBlocked", "showEmptyStateNonReciprocal", "showErrorModifyRelationship", "showNegativeToast", "description", "showPositiveToast", "stopRefresh", "unBlockFriend", "unMuteFriend", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SocialProfileActivity extends BaseActivity {
    @NotNull
    public static final String BUNDLE_RELATIONSHIP_DATA = "bundle_relationship_data";
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    public static final byte[] getMax = {70, -125, 69, 86, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int getMin = 37;
    private HashMap FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public boolean IsOverlapping;
    /* access modifiers changed from: private */
    public LottieAnimationView equals;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    private final hashCode hashCode = new hashCode(this);
    private List<setEmptyView> isInside = new ArrayList();
    /* access modifiers changed from: private */
    public RelationshipItemModel setMax;
    @Inject
    public getRightButtonIconView.setMax socialProfilePresenter;
    /* access modifiers changed from: private */
    public boolean toDoubleRange;
    /* access modifiers changed from: private */
    public final initStyleByTheme toFloatRange = new initStyleByTheme();
    private setEmptyView toIntRange;
    private final Lazy toString = LazyKt.lazy(new SocialProfileActivity$FastBitmap$CoordinateSystem(this));
    /* access modifiers changed from: private */
    public boolean values;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(short r6, int r7, int r8) {
        /*
            int r6 = r6 * 165
            int r6 = r6 + 11
            int r8 = r8 * 45
            int r8 = 101 - r8
            byte[] r0 = getMax
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r8 = r7
            r4 = r8
            r3 = 0
            r7 = r6
            goto L_0x002e
        L_0x0018:
            r3 = 0
        L_0x0019:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L_0x0026
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0026:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x002e:
            int r6 = r6 + r4
            int r6 = r6 + -2
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.view.activity.SocialProfileActivity.getMin(short, int, int):java.lang.String");
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.FastBitmap$CoordinateSystem;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.FastBitmap$CoordinateSystem == null) {
            this.FastBitmap$CoordinateSystem = new HashMap();
        }
        View view = (View) this.FastBitmap$CoordinateSystem.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.FastBitmap$CoordinateSystem.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_social_detail;
    }

    public static final /* synthetic */ void access$appendLoadMore(SocialProfileActivity socialProfileActivity) {
        int max;
        Context baseContext = socialProfileActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -285797143 == (max = dispatchOnCancelled.getMax(applicationContext, -285797143)))) {
            onCanceled oncanceled = new onCanceled(-285797143, max, 512);
            onCancelLoad.setMax(-285797143, oncanceled);
            onCancelLoad.getMin(-285797143, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-285797143, oncanceled2);
            onCancelLoad.getMin(-285797143, oncanceled2);
        }
        if (!socialProfileActivity.toFloatRange() && socialProfileActivity.isInside() && !socialProfileActivity.equals()) {
            socialProfileActivity.toFloatRange.getMax(new setEmptyView(7, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
        }
    }

    public static final /* synthetic */ void access$blockFriend(SocialProfileActivity socialProfileActivity) {
        int length2;
        int min;
        Context baseContext = socialProfileActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1767178533, oncanceled);
            onCancelLoad.getMin(-1767178533, oncanceled);
        }
        getRightButtonIconView.setMax setmax = socialProfileActivity.socialProfilePresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialProfilePresenter");
        }
        RelationshipItemModel relationshipItemModel = socialProfileActivity.setMax;
        if (relationshipItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        setmax.getMax(relationshipItemModel.length, ModifyRelationOperationType.BLOCK);
    }

    public static final /* synthetic */ void access$checkProfileNameIntegrity(SocialProfileActivity socialProfileActivity, setEmptyView setemptyview) {
        RelationshipItemModel relationshipItemModel;
        String str;
        boolean z = false;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1272431575, oncanceled);
            onCancelLoad.getMin(1272431575, oncanceled);
        }
        if (socialProfileActivity.toIntRange != null) {
            initStyleByTheme initstylebytheme = socialProfileActivity.toFloatRange;
            RelationshipItemModel relationshipItemModel2 = socialProfileActivity.setMax;
            if (relationshipItemModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            boolean areEqual = Intrinsics.areEqual((Object) relationshipItemModel2.getMax, (Object) "SELF");
            Intrinsics.checkNotNullParameter(setemptyview, "firstItem");
            List max2 = initstylebytheme.getMax();
            Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
            Iterator it = max2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((setEmptyView) it.next()).getMin == 8) {
                    break;
                }
                i++;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() >= 0) {
                z = true;
            }
            String str2 = null;
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                setEmptyView setemptyview2 = (setEmptyView) initstylebytheme.getMax().get(intValue);
                RelationshipItemModel relationshipItemModel3 = setemptyview2.setMin;
                String str3 = "";
                if (relationshipItemModel3 != null) {
                    FeedModel feedModel = setemptyview.setMax;
                    if (feedModel != null) {
                        str = feedModel.setMax();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = str3;
                    }
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    relationshipItemModel3.isInside = str;
                }
                if (!areEqual && (relationshipItemModel = setemptyview2.setMin) != null) {
                    FeedModel feedModel2 = setemptyview.setMax;
                    if (feedModel2 != null) {
                        HashMap<String, String> hashMap = feedModel2.IsOverlapping;
                        if (hashMap != null) {
                            str2 = setBuildNumber.getHeaderName(hashMap);
                        }
                        if (str2 == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    Intrinsics.checkNotNullParameter(str3, "<set-?>");
                    relationshipItemModel.getMin = str3;
                }
                initstylebytheme.notifyItemChanged(intValue);
            }
        }
    }

    public static final /* synthetic */ LottieAnimationView access$getLavLoadingAnimation$p(SocialProfileActivity socialProfileActivity) {
        LottieAnimationView lottieAnimationView = socialProfileActivity.equals;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        return lottieAnimationView;
    }

    public static final /* synthetic */ RelationshipItemModel access$getRelationshipItemModel$p(SocialProfileActivity socialProfileActivity) {
        RelationshipItemModel relationshipItemModel = socialProfileActivity.setMax;
        if (relationshipItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        return relationshipItemModel;
    }

    public static final /* synthetic */ void access$hideEmptyState(SocialProfileActivity socialProfileActivity) {
        int length2;
        Context baseContext = socialProfileActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-39582188, oncanceled);
            onCancelLoad.getMin(-39582188, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-39582188, oncanceled2);
            onCancelLoad.getMin(-39582188, oncanceled2);
        }
        View _$_findCachedViewById = socialProfileActivity._$_findCachedViewById(resetInternal.setMax.put);
        if (_$_findCachedViewById != null) {
            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
            _$_findCachedViewById.setVisibility(8);
        }
    }

    public static final /* synthetic */ void access$loadUserProfileHeader(SocialProfileActivity socialProfileActivity) {
        SocialProfileActivity socialProfileActivity2 = socialProfileActivity;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-96489273, oncanceled);
            onCancelLoad.getMin(-96489273, oncanceled);
        }
        FeedModel.setMax setmax = FeedModel.Grayscale$Algorithm;
        RelationshipItemModel relationshipItemModel = socialProfileActivity2.setMax;
        if (relationshipItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        Intrinsics.checkNotNullParameter(relationshipItemModel, "profileData");
        setEmptyView setemptyview = new setEmptyView(8, new FeedModel((String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, false, (HashMap) null, (String) null, (String) null, false, 0, (List) null, (List) null, (String) null, (String) null, 65535), (setFocusableInTouchMode) null, (List) null, relationshipItemModel, 12);
        socialProfileActivity2.isInside.add(setemptyview);
        socialProfileActivity2.toIntRange = setemptyview;
        initStyleByTheme initstylebytheme = socialProfileActivity2.toFloatRange;
        initstylebytheme.getMin(socialProfileActivity2.isInside);
        initstylebytheme.getMax().addAll(initStyleByTheme.setMax());
        initstylebytheme.notifyDataSetChanged();
    }

    public static final /* synthetic */ void access$onTouchBottom(SocialProfileActivity socialProfileActivity) {
        boolean z = false;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(536587081, oncanceled);
            onCancelLoad.getMin(536587081, oncanceled);
        }
        if (socialProfileActivity.IsOverlapping()) {
            socialProfileActivity.toDoubleRange = true;
            if (socialProfileActivity.isInside()) {
                socialProfileActivity.toFloatRange.getMax(new setEmptyView(6, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
            }
            if (socialProfileActivity.setMax != null) {
                RelationshipItemModel relationshipItemModel = socialProfileActivity.setMax;
                if (relationshipItemModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
                }
                if (relationshipItemModel.length.length() > 0) {
                    z = true;
                }
                if (z) {
                    socialProfileActivity.getMax(new toFloatRange(socialProfileActivity));
                }
            }
        }
    }

    @NotNull
    public final getRightButtonIconView.setMax getSocialProfilePresenter() {
        getRightButtonIconView.setMax setmax = this.socialProfilePresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialProfilePresenter");
        }
        return setmax;
    }

    public final void setSocialProfilePresenter(@NotNull getRightButtonIconView.setMax setmax) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1743847269, oncanceled);
            onCancelLoad.getMin(-1743847269, oncanceled);
        }
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.socialProfilePresenter = setmax;
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
        Intrinsics.checkNotNullParameter(selectionNotifier, "<set-?>");
        this.friendshipAnalyticTracker = selectionNotifier;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/social/view/activity/SocialProfileActivity$socialFeedListener$1", "Lid/dana/social/adapter/BaseSocialFeedInteraction;", "onItemClicked", "", "itemPosition", "", "onSocialFeedSpanClicked", "content", "Lid/dana/social/utils/Content;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class hashCode extends GriverRpcUtils.AnonymousClass1 {
        final /* synthetic */ SocialProfileActivity setMin;

        hashCode(SocialProfileActivity socialProfileActivity) {
            this.setMin = socialProfileActivity;
        }

        public final void setMax(int i) {
            setEmptyView setemptyview;
            FeedModel feedModel;
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-226658648, oncanceled);
                onCancelLoad.getMin(-226658648, oncanceled);
            }
            if (this.setMin.values && (setemptyview = (setEmptyView) this.setMin.toFloatRange.setMin(i)) != null && (feedModel = setemptyview.setMax) != null) {
                SocialActivityDetail.setMax setmax = SocialActivityDetail.Companion;
                SocialActivityDetail.setMax.setMax(this.setMin, feedModel);
            }
        }

        public final void setMax(@NotNull AUHorizontalListView.SavedState.AnonymousClass1 r4) {
            Intrinsics.checkNotNullParameter(r4, "content");
            String str = r4.getMin;
            if (str != null) {
                this.setMin.getFriendshipAnalyticTracker().length(r4, TrackerKey.Event.FRIENDSHIP_FEEDS_READ);
                this.setMin.getSocialProfilePresenter().getMax(str);
            }
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        RelationshipItemModel relationshipItemModel;
        int length2;
        int min;
        int max;
        byte[] bArr = getMax;
        String min2 = getMin((byte) bArr[85], (short) bArr[96], (byte) bArr[8]);
        byte[] bArr2 = getMax;
        byte b = (byte) bArr2[8];
        String min3 = getMin(b, (short) (b | 174), (byte) bArr2[85]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(1902126197, oncanceled);
            onCancelLoad.getMin(1902126197, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1902126197 == (max = dispatchOnCancelled.getMax(applicationContext2, 1902126197)))) {
            onCanceled oncanceled2 = new onCanceled(1902126197, max, 512);
            onCancelLoad.setMax(1902126197, oncanceled2);
            onCancelLoad.getMin(1902126197, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(1902126197, oncanceled3);
            onCancelLoad.getMin(1902126197, oncanceled3);
        }
        super.onCreate(bundle);
        initComponent();
        getRightButtonIconView.setMax setmax = this.socialProfilePresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialProfilePresenter");
        }
        setmax.setMin();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.updateAppearance);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            initStyleByTheme initstylebytheme = this.toFloatRange;
            initstylebytheme.getMin(new ArrayList());
            initContent initcontent = this.hashCode;
            Intrinsics.checkNotNullParameter(initcontent, "<set-?>");
            initstylebytheme.setMin = initcontent;
            initstylebytheme.getMax = true;
            Unit unit = Unit.INSTANCE;
            recyclerView.setAdapter(initstylebytheme);
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent.getExtras();
        if (extras == null || (relationshipItemModel = (RelationshipItemModel) extras.getParcelable(BUNDLE_RELATIONSHIP_DATA)) == null) {
            length();
        } else {
            Intrinsics.checkNotNullExpressionValue(relationshipItemModel, "it");
            this.setMax = relationshipItemModel;
            getRightButtonIconView.setMax setmax2 = this.socialProfilePresenter;
            if (setmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socialProfilePresenter");
            }
            setmax2.getMin(relationshipItemModel.length);
        }
        AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
        if (selectionNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
        }
        selectionNotifier.setMax();
    }

    public final void onClickRightMenuButton(@Nullable View view) {
        RelationshipItemModel relationshipItemModel = this.setMax;
        if (relationshipItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        String str = relationshipItemModel.getMax;
        if (str.hashCode() == 2541388 && str.equals("SELF")) {
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled = new onCanceled(0, max, 16);
                onCancelLoad.setMax(-1787042384, oncanceled);
                onCancelLoad.getMin(-1787042384, oncanceled);
            }
            getRightButtonIconView.setMax setmax = this.socialProfilePresenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("socialProfilePresenter");
            }
            setmax.length();
            return;
        }
        getMsgText getmsgtext = (getMsgText) this.toString.getValue();
        RelationshipItemModel relationshipItemModel2 = this.setMax;
        if (relationshipItemModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        String str2 = relationshipItemModel2.getMax;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Intrinsics.checkNotNullParameter(str2, "relationshipStatus");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter("", "tag");
        getmsgtext.getMax = str2;
        getmsgtext.show(supportFragmentManager, "");
    }

    /* access modifiers changed from: private */
    public final void length() {
        if (this.toFloatRange.getItemCount() > 1) {
            initStyleByTheme initstylebytheme = this.toFloatRange;
            initstylebytheme.getMin(CollectionsKt.listOf(initstylebytheme.getMax().get(0)));
        }
        RelationshipItemModel relationshipItemModel = this.setMax;
        if (relationshipItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        if (relationshipItemModel.getMax()) {
            getMin();
        } else {
            RelationshipItemModel relationshipItemModel2 = this.setMax;
            if (relationshipItemModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            if (!Intrinsics.areEqual((Object) relationshipItemModel2.getMax, (Object) "BLOCKING")) {
                RelationshipItemModel relationshipItemModel3 = this.setMax;
                if (relationshipItemModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
                }
                if (!Intrinsics.areEqual((Object) relationshipItemModel3.getMax, (Object) "INACTIVE")) {
                    setMin();
                }
            }
            setMax();
        }
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.put);
        if (_$_findCachedViewById != null) {
            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
            _$_findCachedViewById.setVisibility(0);
        }
    }

    private final void getMin() {
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.put);
        if (_$_findCachedViewById != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.createRadioButton);
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(R.drawable.social_feeds_empty_state_non_reciprocal);
            }
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsService$Result);
            if (textView != null) {
                textView.setText(_$_findCachedViewById.getContext().getString(R.string.profile_empty_title_non_reciprocal));
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.setTextOn);
            if (textView2 != null) {
                textView2.setText(_$_findCachedViewById.getContext().getString(R.string.profile_empty_desc_non_reciprocal));
            }
        }
    }

    private final void setMax() {
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.put);
        if (_$_findCachedViewById != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.createRadioButton);
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(R.drawable.social_feeds_empty_state_blocked);
            }
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsService$Result);
            if (textView != null) {
                textView.setText(_$_findCachedViewById.getContext().getString(R.string.profile_empty_title_blocked));
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.setTextOn);
            if (textView2 != null) {
                textView2.setText(_$_findCachedViewById.getContext().getString(R.string.profile_empty_desc_blocked));
            }
        }
    }

    private final void setMin() {
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.put);
        if (_$_findCachedViewById != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.createRadioButton);
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(R.drawable.social_feeds_empty_state);
            }
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsService$Result);
            if (textView != null) {
                textView.setText(_$_findCachedViewById.getContext().getString(R.string.profile_empty_title));
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.setTextOn);
            if (textView2 != null) {
                textView2.setText(_$_findCachedViewById.getContext().getString(R.string.profile_empty_desc));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0016\u0010\u001b\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016¨\u0006\u001f"}, d2 = {"id/dana/social/view/activity/SocialProfileActivity$initComponent$1", "Lid/dana/social/contract/SocialProfileContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetFeedCommentEnableSuccess", "isEnable", "", "onGetProfileSettingModelFail", "onGetProfileSettingModelSuccess", "settingModel", "Lid/dana/domain/profilemenu/model/SettingModel;", "onGetUserProfileHeaderFail", "onGetUserProfileHeaderSuccess", "data", "Lid/dana/social/model/RelationshipItemModel;", "onGetUserTimelineFeedFail", "onGetUserTimelineFeedSuccess", "feedViewModelList", "", "Lid/dana/social/model/FeedViewHolderModel;", "onModifyRelationshipComplete", "operationType", "Lid/dana/domain/social/ModifyRelationOperationType;", "onModifyRelationshipFailed", "onRefreshTimeline", "onStatusChange", "status", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements getRightButtonIconView.length {
        final /* synthetic */ SocialProfileActivity getMin;

        public final void dismissProgress() {
        }

        public final void onError(@Nullable String str) {
        }

        public final void showProgress() {
        }

        setMin(SocialProfileActivity socialProfileActivity) {
            this.getMin = socialProfileActivity;
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "status");
            this.getMin.setMin(str);
        }

        public final void getMax(@NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(settingModel, MyProfileBundleKey.SETTING_MODEL);
            SocialProfileActivity.access$goToProfileActivity(this.getMin, settingModel);
        }

        public final void length() {
            SocialProfileActivity socialProfileActivity = this.getMin;
            Toast.makeText(socialProfileActivity, socialProfileActivity.getString(R.string.general_error_msg), 0).show();
        }

        public final void length(boolean z) {
            this.getMin.values = z;
            this.getMin.toFloatRange.getMin = z;
        }

        public final void length(@NotNull RelationshipItemModel relationshipItemModel) {
            Intrinsics.checkNotNullParameter(relationshipItemModel, "data");
            this.getMin.setMax = relationshipItemModel;
            this.getMin.setMin(relationshipItemModel.getMax);
            SocialProfileActivity.access$loadUserProfileHeader(this.getMin);
            if (relationshipItemModel.getMax()) {
                this.getMin.length();
            } else {
                this.getMin.getMax(new C0051setMin(this));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
        /* renamed from: id.dana.social.view.activity.SocialProfileActivity$setMin$setMin  reason: collision with other inner class name */
        static final class C0051setMin extends Lambda implements Function0<Unit> {
            final /* synthetic */ setMin this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0051setMin(setMin setmin) {
                super(0);
                this.this$0 = setmin;
            }

            public final void invoke() {
                this.this$0.getMin.getSocialProfilePresenter().setMin(SocialProfileActivity.access$getRelationshipItemModel$p(this.this$0.getMin).length);
            }
        }

        public final void setMax() {
            SocialProfileActivity.access$getRelationshipItemModel$p(this.getMin).toIntRange = true;
            this.getMin.setMenuRightButton("");
            SocialProfileActivity.access$loadUserProfileHeader(this.getMin);
            this.getMin.length();
        }

        public final void getMax(@NotNull List<setEmptyView> list) {
            boolean z;
            Intrinsics.checkNotNullParameter(list, "feedViewModelList");
            SocialProfileActivity.access$hideEmptyState(this.getMin);
            this.getMin.getMax();
            this.getMin.IsOverlapping = true;
            initStyleByTheme access$getSocialFeedsAdapter$p = this.getMin.toFloatRange;
            List max = access$getSocialFeedsAdapter$p.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            if (CollectionsKt.removeAll(max, initStyleByTheme.setMin.INSTANCE)) {
                access$getSocialFeedsAdapter$p.notifyDataSetChanged();
            }
            if (list.isEmpty()) {
                this.getMin.length();
                return;
            }
            this.getMin.toFloatRange.setMax(list);
            for (setEmptyView setemptyview : list) {
                if (setemptyview.getMin == 9 || setemptyview.getMin == 5) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    SocialProfileActivity.access$checkProfileNameIntegrity(this.getMin, setemptyview);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        public final void length(@NotNull List<setEmptyView> list) {
            Intrinsics.checkNotNullParameter(list, "feedViewModelList");
            this.getMin.getMax();
            this.getMin.IsOverlapping = true;
            SocialProfileActivity.access$hideEmptyState(this.getMin);
            initStyleByTheme access$getSocialFeedsAdapter$p = this.getMin.toFloatRange;
            List max = access$getSocialFeedsAdapter$p.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            if (CollectionsKt.removeAll(max, initStyleByTheme.setMin.INSTANCE)) {
                access$getSocialFeedsAdapter$p.notifyDataSetChanged();
            }
            if (list.isEmpty()) {
                this.getMin.length();
            } else {
                SocialProfileActivity.access$addInitialFeedListWithProfileItem(this.getMin, list);
            }
        }

        public final void setMin() {
            this.getMin.getMax();
            SocialProfileActivity.access$appendLoadMore(this.getMin);
            this.getMin.IsOverlapping = true;
            initStyleByTheme access$getSocialFeedsAdapter$p = this.getMin.toFloatRange;
            List max = access$getSocialFeedsAdapter$p.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            if (CollectionsKt.removeAll(max, initStyleByTheme.setMin.INSTANCE)) {
                access$getSocialFeedsAdapter$p.notifyDataSetChanged();
            }
            this.getMin.length();
        }

        public final void setMin(@NotNull ModifyRelationOperationType modifyRelationOperationType) {
            Intrinsics.checkNotNullParameter(modifyRelationOperationType, "operationType");
            SocialProfileActivity.access$modifyRelationshipCompleted(this.getMin, modifyRelationOperationType);
        }

        public final void getMin() {
            SocialProfileActivity.access$showErrorModifyRelationship(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/social/view/activity/SocialProfileActivity$initComponent$2", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements style.getMin {
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

        getMax() {
        }
    }

    public final void initComponent() {
        DanaApplication danaApplication = getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            SocialProfileModule socialProfileModule = new SocialProfileModule(new setMin(this));
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            Activity activity = this;
            max.getMax = activity;
            max.length = "AA";
            DeepLinkModule deepLinkModule = new DeepLinkModule(max, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(deepLinkModule, "DeepLinkModule.builder()…    .source(\"AA\").build()");
            ScanQrModule.setMin max2 = ScanQrModule.getMax();
            max2.setMin = activity;
            ScanQrModule scanQrModule = new ScanQrModule(max2, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(scanQrModule, "ScanQrModule.builder()\n …\n                .build()");
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = activity;
            RestoreUrlModule restoreUrlModule = new RestoreUrlModule(min, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(restoreUrlModule, "RestoreUrlModule.builder…\n                .build()");
            FeatureModule.length length2 = FeatureModule.length();
            length2.setMax = activity;
            FeatureModule featureModule = new FeatureModule(length2, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(featureModule, "FeatureModule.builder()\n…\n                .build()");
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = activity;
            OauthModule oauthModule = new OauthModule(min2, (byte) 0);
            Intrinsics.checkNotNullExpressionValue(oauthModule, "OauthModule.builder()\n  …\n                .build()");
            socialCommonComponent.setMax(socialProfileModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, new ServicesModule((style.getMin) new getMax())).getMax(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        getRightButtonIconView.setMax setmax = this.socialProfilePresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialProfilePresenter");
        }
        getminArr[0] = setmax;
        registerPresenter(getminArr);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [o.setFavoriteBtnVisibility] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax() {
        /*
            r7 = this;
            boolean r0 = r7.toFloatRange()
            if (r0 != 0) goto L_0x0020
            o.initStyleByTheme r0 = r7.toFloatRange
            int r1 = r7.toIntRange()
            java.lang.Object r0 = r0.setMin((int) r1)
            o.setEmptyView r0 = (o.setEmptyView) r0
            int r0 = r0.getMin
            r1 = 6
            if (r0 != r1) goto L_0x0020
            o.initStyleByTheme r0 = r7.toFloatRange
            int r1 = r7.toIntRange()
            r0.getMax((int) r1)
        L_0x0020:
            id.dana.social.view.activity.SocialProfileActivity$length r0 = new id.dana.social.view.activity.SocialProfileActivity$length
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
            if (r1 == 0) goto L_0x004d
            java.lang.Object r0 = o.SecuritySignature.getMax(r1, r0)
            o.setFavoriteBtnVisibility r0 = (o.setFavoriteBtnVisibility) r0
        L_0x004d:
            o.GriverProgressBar$UpdateRunnable r0 = r0.v_()
            r7.addDisposable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.view.activity.SocialProfileActivity.getMax():void");
    }

    private final boolean equals() {
        return !toFloatRange() && ((setEmptyView) this.toFloatRange.setMin(toIntRange())).getMin == 7;
    }

    /* access modifiers changed from: private */
    public final void getMax(Function0<Unit> function0) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1423135606 == (max = dispatchOnCancelled.getMax(applicationContext, 1423135606)))) {
            onCanceled oncanceled = new onCanceled(1423135606, max, 512);
            onCancelLoad.setMax(1423135606, oncanceled);
            onCancelLoad.getMin(1423135606, oncanceled);
        }
        RelationshipItemModel relationshipItemModel = this.setMax;
        if (relationshipItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        String str = relationshipItemModel.getMax;
        int hashCode2 = str.hashCode();
        if (hashCode2 == -1134023652 ? !str.equals("SUSPEND") : hashCode2 == 118053941 ? !str.equals("BLOCKING") : hashCode2 != 807292011 || !str.equals("INACTIVE")) {
            RelationshipItemModel relationshipItemModel2 = this.setMax;
            if (relationshipItemModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            if (relationshipItemModel2.getMax()) {
                getMax();
                this.IsOverlapping = true;
                initStyleByTheme initstylebytheme = this.toFloatRange;
                List max2 = initstylebytheme.getMax();
                Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
                if (CollectionsKt.removeAll(max2, initStyleByTheme.setMin.INSTANCE)) {
                    initstylebytheme.notifyDataSetChanged();
                }
                length();
                return;
            }
            function0.invoke();
            return;
        }
        getMax();
        this.IsOverlapping = true;
        initStyleByTheme initstylebytheme2 = this.toFloatRange;
        List max3 = initstylebytheme2.getMax();
        Intrinsics.checkNotNullExpressionValue(max3, FirebaseAnalytics.Param.ITEMS);
        if (CollectionsKt.removeAll(max3, initStyleByTheme.setMin.INSTANCE)) {
            initstylebytheme2.notifyDataSetChanged();
        }
        length();
    }

    @OnClick({2131362639})
    public final void backToTop() {
        int length2;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1043751107 == (max = dispatchOnCancelled.getMax(applicationContext, 1043751107)))) {
            onCanceled oncanceled = new onCanceled(1043751107, max, 512);
            onCancelLoad.setMax(1043751107, oncanceled);
            onCancelLoad.getMin(1043751107, oncanceled);
        }
        if (!toFloatRange()) {
            Context baseContext2 = getBaseContext();
            if (baseContext2 != null) {
                context = baseContext2.getApplicationContext();
            }
            if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
                onCanceled oncanceled2 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(1013335473, oncanceled2);
                onCancelLoad.getMin(1013335473, oncanceled2);
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.updateAppearance);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rvSocialProfile");
            RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.smoothScrollToPosition((RecyclerView) _$_findCachedViewById(resetInternal.setMax.updateAppearance), new RecyclerView$Mean$Arithmetic(), 0);
            }
        }
        CardView cardView = (CardView) _$_findCachedViewById(resetInternal.setMax.CallSuper);
        Intrinsics.checkNotNullExpressionValue(cardView, "cv_back_to_top");
        cardView.setVisibility(8);
    }

    public final void configToolbar() {
        setCenterTitle(getString(R.string.social_profile));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ SocialProfileActivity getMax;

        toIntRange(SocialProfileActivity socialProfileActivity) {
            this.getMax = socialProfileActivity;
        }

        public final void onClick(View view) {
            SocialProfileActivity.access$unBlockFriend(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/view/activity/SocialProfileActivity$initScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends RecyclerView.toIntRange {
        final /* synthetic */ SocialProfileActivity setMin;

        equals(SocialProfileActivity socialProfileActivity) {
            this.setMin = socialProfileActivity;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            boolean access$isFirstItemVisible = this.setMin.values();
            SocialProfileActivity.access$setCvBackToTopVisibility(this.setMin, i2 < 0 && !access$isFirstItemVisible);
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) this.setMin._$_findCachedViewById(resetInternal.setMax.onWindowSystemUiVisibilityChanged);
            Intrinsics.checkNotNullExpressionValue(ptrClassicFrameLayout, "ptr_feeds");
            ptrClassicFrameLayout.setEnabled(access$isFirstItemVisible);
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (!recyclerView.canScrollVertically(TsExtractor.TS_STREAM_TYPE_HDMV_DTS) && this.setMin.getSocialProfilePresenter().getMin()) {
                SocialProfileActivity.access$onTouchBottom(this.setMin);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<Unit> {
        final /* synthetic */ SocialProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(SocialProfileActivity socialProfileActivity) {
            super(0);
            this.this$0 = socialProfileActivity;
        }

        public final void invoke() {
            this.this$0.getSocialProfilePresenter().setMin(SocialProfileActivity.access$getRelationshipItemModel$p(this.this$0).length);
        }
    }

    private final boolean IsOverlapping() {
        return !toFloatRange() && !this.toDoubleRange && isInside();
    }

    private final boolean isInside() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-922241437, oncanceled);
            onCancelLoad.getMin(-922241437, oncanceled);
        }
        if (((setEmptyView) this.toFloatRange.setMin(toIntRange())).getMin == 5 || ((setEmptyView) this.toFloatRange.setMin(toIntRange())).getMin == 9) {
            return true;
        }
        return false;
    }

    private final boolean toFloatRange() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(66758451, oncanceled);
            onCancelLoad.getMin(66758451, oncanceled);
        }
        return this.toFloatRange.getItemCount() <= 0;
    }

    private final int toIntRange() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1347152867, oncanceled);
            onCancelLoad.getMin(-1347152867, oncanceled);
        }
        return this.toFloatRange.getItemCount() - 1;
    }

    /* access modifiers changed from: private */
    public final boolean values() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.updateAppearance);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvSocialProfile");
        RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/view/activity/SocialProfileActivity$initPullToRefreshComponent$1", "Lin/srain/cube/views/ptr/PtrHandler;", "checkCanDoRefresh", "", "frame", "Lin/srain/cube/views/ptr/PtrFrameLayout;", "content", "Landroid/view/View;", "header", "onRefreshBegin", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements access$1602 {
        final /* synthetic */ SocialProfileActivity setMax;

        setMax(SocialProfileActivity socialProfileActivity) {
            this.setMax = socialProfileActivity;
        }

        public final void getMax() {
            if (this.setMax.toDoubleRange()) {
                SocialProfileActivity.access$getLavLoadingAnimation$p(this.setMax).playAnimation();
            }
            this.setMax.getMax(new IsOverlapping(this.setMax));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<Unit> {
        final /* synthetic */ SocialProfileActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(SocialProfileActivity socialProfileActivity) {
            super(0);
            this.this$0 = socialProfileActivity;
        }

        public final void invoke() {
            this.this$0.getSocialProfilePresenter().length(SocialProfileActivity.access$getRelationshipItemModel$p(this.this$0).length);
        }
    }

    /* access modifiers changed from: private */
    public final boolean toDoubleRange() {
        return this.equals != null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"id/dana/social/view/activity/SocialProfileActivity$initPullToRefreshHeaderView$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements Animator.AnimatorListener {
        final /* synthetic */ SocialProfileActivity length;

        public final void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        public final void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        isInside(SocialProfileActivity socialProfileActivity) {
            this.length = socialProfileActivity;
        }

        public final void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) this.length._$_findCachedViewById(resetInternal.setMax.onWindowSystemUiVisibilityChanged);
            if (ptrClassicFrameLayout != null) {
                ptrClassicFrameLayout.refreshComplete();
                this.length.IsOverlapping = false;
            }
        }

        public final void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            if (this.length.IsOverlapping && this.length.toDoubleRange()) {
                SocialProfileActivity.access$getLavLoadingAnimation$p(this.length).cancelAnimation();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r5.equals("INACTIVE") != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r5.equals("BLOCKING") != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        setMenuRightButton("");
        r5 = (id.dana.component.buttoncomponent.DanaButtonSecondaryView) _$_findCachedViewById(o.resetInternal.setMax.MediaMetadataCompat$RatingKey);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r5 = r5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "<this>");
        r5.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        r5 = r4.setMax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (r5 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r5.getMax() == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        setMenuRightButton("");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        setMenuRightButton((int) id.dana.R.drawable.ic_vertical_three_dots);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        r5 = (id.dana.component.buttoncomponent.DanaButtonSecondaryView) _$_findCachedViewById(o.resetInternal.setMax.MediaMetadataCompat$RatingKey);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0095, code lost:
        r5 = r5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "<this>");
        r5.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(java.lang.String r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getBaseContext()
            if (r0 == 0) goto L_0x000b
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r1 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = o.dispatchOnCancelled.length(r0, r1)
            if (r0 == 0) goto L_0x0024
            o.onCanceled r2 = new o.onCanceled
            r3 = 4
            r2.<init>(r1, r0, r3)
            r0 = 1934921692(0x73548fdc, float:1.6840893E31)
            o.onCancelLoad.setMax(r0, r2)
            o.onCancelLoad.getMin(r0, r2)
        L_0x0024:
            int r0 = r5.hashCode()
            java.lang.String r2 = "<this>"
            java.lang.String r3 = ""
            switch(r0) {
                case -1134023652: goto L_0x0066;
                case 2541388: goto L_0x0057;
                case 118053941: goto L_0x0039;
                case 807292011: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0072
        L_0x0030:
            java.lang.String r0 = "INACTIVE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0072
            goto L_0x0041
        L_0x0039:
            java.lang.String r0 = "BLOCKING"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0072
        L_0x0041:
            r4.setMenuRightButton((java.lang.String) r3)
            int r5 = o.resetInternal.setMax.MediaMetadataCompat$RatingKey
            android.view.View r5 = r4._$_findCachedViewById(r5)
            id.dana.component.buttoncomponent.DanaButtonSecondaryView r5 = (id.dana.component.buttoncomponent.DanaButtonSecondaryView) r5
            if (r5 == 0) goto L_0x0056
            android.view.View r5 = (android.view.View) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            r5.setVisibility(r1)
        L_0x0056:
            return
        L_0x0057:
            java.lang.String r0 = "SELF"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0072
            r5 = 2131232298(0x7f08062a, float:1.8080701E38)
            r4.setMenuRightButton((int) r5)
            return
        L_0x0066:
            java.lang.String r0 = "SUSPEND"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0072
            r4.setMenuRightButton((java.lang.String) r3)
            return
        L_0x0072:
            id.dana.social.model.RelationshipItemModel r5 = r4.setMax
            if (r5 != 0) goto L_0x007b
            java.lang.String r0 = "relationshipItemModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x007b:
            boolean r5 = r5.getMax()
            if (r5 == 0) goto L_0x0085
            r4.setMenuRightButton((java.lang.String) r3)
            goto L_0x008b
        L_0x0085:
            r5 = 2131232384(0x7f080680, float:1.8080876E38)
            r4.setMenuRightButton((int) r5)
        L_0x008b:
            int r5 = o.resetInternal.setMax.MediaMetadataCompat$RatingKey
            android.view.View r5 = r4._$_findCachedViewById(r5)
            id.dana.component.buttoncomponent.DanaButtonSecondaryView r5 = (id.dana.component.buttoncomponent.DanaButtonSecondaryView) r5
            if (r5 == 0) goto L_0x009f
            android.view.View r5 = (android.view.View) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            r0 = 8
            r5.setVisibility(r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.view.activity.SocialProfileActivity.setMin(java.lang.String):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/social/view/activity/SocialProfileActivity$Companion;", "", "()V", "BUNDLE_RELATIONSHIP_DATA", "", "openProfileActivity", "", "context", "Landroid/content/Context;", "data", "Lid/dana/social/model/RelationshipItemModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        public static void setMin(@NotNull Context context, @NotNull RelationshipItemModel relationshipItemModel) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(relationshipItemModel, "data");
            Intent intent = new Intent(context, SocialProfileActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(SocialProfileActivity.BUNDLE_RELATIONSHIP_DATA, relationshipItemModel);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 4, 2})
    static final class length<V> implements Callable<Object> {
        final /* synthetic */ SocialProfileActivity setMin;

        length(SocialProfileActivity socialProfileActivity) {
            this.setMin = socialProfileActivity;
        }

        public final /* synthetic */ Object call() {
            this.setMin.toDoubleRange = false;
            return Unit.INSTANCE;
        }
    }

    public final void init() {
        ((PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onWindowSystemUiVisibilityChanged)).setPtrHandler(new setMax(this));
        ((PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onWindowSystemUiVisibilityChanged)).disableWhenHorizontalMove(true);
        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onWindowSystemUiVisibilityChanged);
        Intrinsics.checkNotNullExpressionValue(ptrClassicFrameLayout, "ptr_feeds");
        ptrClassicFrameLayout.setHeaderView(getLayoutInflater().inflate(R.layout.view_pull_to_refresh_header, (ViewGroup) null));
        PtrClassicFrameLayout ptrClassicFrameLayout2 = (PtrClassicFrameLayout) _$_findCachedViewById(resetInternal.setMax.onWindowSystemUiVisibilityChanged);
        Intrinsics.checkNotNullExpressionValue(ptrClassicFrameLayout2, "ptr_feeds");
        View findViewById = ptrClassicFrameLayout2.getHeaderView().findViewById(R.id.f51622131363718);
        Intrinsics.checkNotNullExpressionValue(findViewById, "ptr_feeds.headerView.fin…id.lav_loading_animation)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        this.equals = lottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        lottieAnimationView.addAnimatorListener(new isInside(this));
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1742234981, oncanceled);
            onCancelLoad.getMin(-1742234981, oncanceled);
        }
        ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.updateAppearance)).addOnScrollListener(new equals(this));
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.MediaMetadataCompat$RatingKey);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(new toIntRange(this));
        }
    }

    public static final /* synthetic */ void access$goToProfileActivity(SocialProfileActivity socialProfileActivity, SettingModel settingModel) {
        Intent intent = new Intent(socialProfileActivity, SettingMoreProfileActivity.class);
        intent.putExtra(MyProfileBundleKey.SETTING_MODEL, settingModel);
        socialProfileActivity.startActivity(intent);
    }

    public static final /* synthetic */ void access$addInitialFeedListWithProfileItem(SocialProfileActivity socialProfileActivity, List list) {
        initStyleByTheme initstylebytheme = socialProfileActivity.toFloatRange;
        List mutableListOf = CollectionsKt.mutableListOf(socialProfileActivity.toIntRange);
        mutableListOf.addAll(list);
        Unit unit = Unit.INSTANCE;
        initstylebytheme.getMin(mutableListOf);
    }

    public static final /* synthetic */ void access$modifyRelationshipCompleted(SocialProfileActivity socialProfileActivity, ModifyRelationOperationType modifyRelationOperationType) {
        int i = AUBasicDialog.AnonymousClass1.length[modifyRelationOperationType.ordinal()];
        if (i == 1) {
            RelationshipItemModel relationshipItemModel = socialProfileActivity.setMax;
            if (relationshipItemModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            Intrinsics.checkNotNullParameter("BLOCKING", "<set-?>");
            relationshipItemModel.getMax = "BLOCKING";
            Object[] objArr = new Object[1];
            RelationshipItemModel relationshipItemModel2 = socialProfileActivity.setMax;
            if (relationshipItemModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            objArr[0] = relationshipItemModel2.getMin;
            String string = socialProfileActivity.getString(R.string.friendship_block, objArr);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.frien…onshipItemModel.nickName)");
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
            SwipeRefreshLayout.length(socialProfileActivity, R.drawable.ic_warning_24_yellow50, R.drawable.bg_rounded_border_yellow_50, string);
            socialProfileActivity.getMax(new IsOverlapping(socialProfileActivity));
        } else if (i == 2) {
            RelationshipItemModel relationshipItemModel3 = socialProfileActivity.setMax;
            if (relationshipItemModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            Intrinsics.checkNotNullParameter("ACTIVE", "<set-?>");
            relationshipItemModel3.getMax = "ACTIVE";
            Object[] objArr2 = new Object[1];
            RelationshipItemModel relationshipItemModel4 = socialProfileActivity.setMax;
            if (relationshipItemModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            objArr2[0] = relationshipItemModel4.getMin;
            String string2 = socialProfileActivity.getString(R.string.friendship_unblock, objArr2);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.frien…onshipItemModel.nickName)");
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.setMax;
            SwipeRefreshLayout.length(socialProfileActivity, R.drawable.ic_check_24_green50_filled_circle, R.drawable.bg_rounded_border_green_50, string2);
            socialProfileActivity.getMax(new IsOverlapping(socialProfileActivity));
        } else if (i == 3) {
            RelationshipItemModel relationshipItemModel5 = socialProfileActivity.setMax;
            if (relationshipItemModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            Intrinsics.checkNotNullParameter("MUTE", "<set-?>");
            relationshipItemModel5.getMax = "MUTE";
            Object[] objArr3 = new Object[1];
            RelationshipItemModel relationshipItemModel6 = socialProfileActivity.setMax;
            if (relationshipItemModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            objArr3[0] = relationshipItemModel6.getMin;
            String string3 = socialProfileActivity.getString(R.string.friendship_mute, objArr3);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.frien…onshipItemModel.nickName)");
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.setMax;
            SwipeRefreshLayout.length(socialProfileActivity, R.drawable.ic_warning_24_yellow50, R.drawable.bg_rounded_border_yellow_50, string3);
        } else if (i == 4) {
            RelationshipItemModel relationshipItemModel7 = socialProfileActivity.setMax;
            if (relationshipItemModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            Intrinsics.checkNotNullParameter("ACTIVE", "<set-?>");
            relationshipItemModel7.getMax = "ACTIVE";
            Object[] objArr4 = new Object[1];
            RelationshipItemModel relationshipItemModel8 = socialProfileActivity.setMax;
            if (relationshipItemModel8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
            }
            objArr4[0] = relationshipItemModel8.getMin;
            String string4 = socialProfileActivity.getString(R.string.friendship_unmute, objArr4);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.frien…onshipItemModel.nickName)");
            SwipeRefreshLayout swipeRefreshLayout4 = SwipeRefreshLayout.setMax;
            SwipeRefreshLayout.length(socialProfileActivity, R.drawable.ic_check_24_green50_filled_circle, R.drawable.bg_rounded_border_green_50, string4);
        }
        RelationshipItemModel relationshipItemModel9 = socialProfileActivity.setMax;
        if (relationshipItemModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        socialProfileActivity.setMin(relationshipItemModel9.getMax);
    }

    public static final /* synthetic */ void access$showErrorModifyRelationship(SocialProfileActivity socialProfileActivity) {
        SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
        String string = socialProfileActivity.getString(R.string.modify_relationship_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.modify_relationship_error)");
        SwipeRefreshLayout.length(socialProfileActivity, R.drawable.ic_close_red, R.drawable.bg_rounded_border_red_50, string);
    }

    public static final /* synthetic */ void access$unBlockFriend(SocialProfileActivity socialProfileActivity) {
        getRightButtonIconView.setMax setmax = socialProfileActivity.socialProfilePresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialProfilePresenter");
        }
        RelationshipItemModel relationshipItemModel = socialProfileActivity.setMax;
        if (relationshipItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        setmax.getMax(relationshipItemModel.length, ModifyRelationOperationType.UNBLOCK);
    }

    public static final /* synthetic */ void access$setCvBackToTopVisibility(SocialProfileActivity socialProfileActivity, boolean z) {
        CardView cardView = (CardView) socialProfileActivity._$_findCachedViewById(resetInternal.setMax.CallSuper);
        Intrinsics.checkNotNullExpressionValue(cardView, "cv_back_to_top");
        cardView.setVisibility(z ? 0 : 8);
    }

    public static final /* synthetic */ void access$muteFriend(SocialProfileActivity socialProfileActivity) {
        getRightButtonIconView.setMax setmax = socialProfileActivity.socialProfilePresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialProfilePresenter");
        }
        RelationshipItemModel relationshipItemModel = socialProfileActivity.setMax;
        if (relationshipItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        setmax.getMin(relationshipItemModel.length, ModifyRelationOperationType.MUTE);
    }

    public static final /* synthetic */ void access$unMuteFriend(SocialProfileActivity socialProfileActivity) {
        getRightButtonIconView.setMax setmax = socialProfileActivity.socialProfilePresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialProfilePresenter");
        }
        RelationshipItemModel relationshipItemModel = socialProfileActivity.setMax;
        if (relationshipItemModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relationshipItemModel");
        }
        setmax.getMin(relationshipItemModel.length, ModifyRelationOperationType.UNMUTE);
    }
}
