package id.dana.social;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.model.ThirdPartyService;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import id.dana.social.view.activity.SocialProfileActivity;
import id.dana.social.view.activity.detail.SocialActivityDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.APAlertDialog;
import o.AUHorizontalListView;
import o.GriverRpcUtils;
import o.dispatchOnCancelled;
import o.initStyleByTheme;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setBuildNumber;
import o.setEmptyView;
import o.setFocusableInTouchMode;
import o.setLeftButtonUnicode;
import o.setNextSelectedPositionInt;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\f\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u0011H\u0002J\b\u0010&\u001a\u00020\u0011H\u0002J\b\u0010'\u001a\u00020\u0011H\u0002J\f\u0010(\u001a\u00020\u0011*\u00020\u0016H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lid/dana/social/ContentGroupingDetailActivity;", "Lid/dana/base/BaseActivity;", "()V", "presenter", "Lid/dana/social/contract/ContentGroupingDetailContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/ContentGroupingDetailContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/ContentGroupingDetailContract$Presenter;)V", "showCommentButton", "", "socialFeedListener", "id/dana/social/ContentGroupingDetailActivity$socialFeedListener$1", "Lid/dana/social/ContentGroupingDetailActivity$socialFeedListener$1;", "socialFeedsAdapter", "Lid/dana/social/adapter/SocialFeedsAdapter;", "fetchDatas", "", "getLayout", "", "getShimmer", "", "Lid/dana/social/model/FeedViewHolderModel;", "hideShimmer", "init", "initBundleData", "initInjector", "initToolbar", "isCurrentUser", "feedModel", "Lid/dana/social/model/FeedModel;", "openProfileActivity", "it", "Lid/dana/social/model/RelationshipItemModel;", "openSelfProfileActivity", "setupAdapter", "setupRecycler", "setupTryAgainButton", "showEmptyState", "showExistState", "handleAvatarClick", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ContentGroupingDetailActivity extends BaseActivity {
    @NotNull
    public static final length Companion = new length((byte) 0);
    private final equals getMax = new equals(this);
    /* access modifiers changed from: private */
    public boolean getMin;
    private HashMap isInside;
    @Inject
    public setLeftButtonUnicode.length presenter;
    /* access modifiers changed from: private */
    public initStyleByTheme setMax = new initStyleByTheme();

    public final void _$_clearFindViewByIdCache() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(991996308, oncanceled);
            onCancelLoad.getMin(991996308, oncanceled);
        }
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_content_grouping_detail;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/social/model/FeedViewHolderModel;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<setEmptyView, Boolean> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((setEmptyView) obj));
        }

        public final boolean invoke(setEmptyView setemptyview) {
            return setemptyview.getMin == 0;
        }
    }

    public static final /* synthetic */ void access$handleAvatarClick(ContentGroupingDetailActivity contentGroupingDetailActivity, setEmptyView setemptyview) {
        int length2;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1936419138, oncanceled);
            onCancelLoad.getMin(1936419138, oncanceled);
        }
        FeedModel feedModel = setemptyview.setMax;
        if (feedModel == null) {
            return;
        }
        if (contentGroupingDetailActivity.getMax(feedModel)) {
            Context baseContext = contentGroupingDetailActivity.getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(0, length2, 4);
                onCancelLoad.setMax(-99881504, oncanceled2);
                onCancelLoad.getMin(-99881504, oncanceled2);
            }
            RelationshipItemModel max2 = setNextSelectedPositionInt.setMax(feedModel);
            Intrinsics.checkNotNullParameter("SELF", "<set-?>");
            max2.getMax = "SELF";
            Context baseContext2 = contentGroupingDetailActivity.getBaseContext();
            if (baseContext2 != null) {
                SocialProfileActivity.getMin getmin = SocialProfileActivity.Companion;
                SocialProfileActivity.getMin.setMin(baseContext2, max2);
                return;
            }
            return;
        }
        RelationshipItemModel max3 = setNextSelectedPositionInt.setMax(feedModel);
        Context baseContext3 = contentGroupingDetailActivity.getBaseContext();
        if (baseContext3 != null) {
            SocialProfileActivity.getMin getmin2 = SocialProfileActivity.Companion;
            SocialProfileActivity.getMin.setMin(baseContext3, max3);
        }
    }

    public static final /* synthetic */ void access$showExistState(ContentGroupingDetailActivity contentGroupingDetailActivity) {
        int length2;
        Context baseContext = contentGroupingDetailActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(17164042, oncanceled);
            onCancelLoad.getMin(17164042, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(17164042, oncanceled2);
            onCancelLoad.getMin(17164042, oncanceled2);
        }
        LinearLayout linearLayout = (LinearLayout) contentGroupingDetailActivity._$_findCachedViewById(resetInternal.setMax.MediaSessionCompat$QueueItem);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "cl_content_group_detail");
        linearLayout.setVisibility(0);
        View _$_findCachedViewById = contentGroupingDetailActivity._$_findCachedViewById(resetInternal.setMax.MediaSessionCompat$Token);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "cl_empty_state_wrapper");
        _$_findCachedViewById.setVisibility(8);
    }

    @NotNull
    public final setLeftButtonUnicode.length getPresenter() {
        setLeftButtonUnicode.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length2;
    }

    public final void setPresenter(@NotNull setLeftButtonUnicode.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.presenter = length2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/ContentGroupingDetailActivity$socialFeedListener$1", "Lid/dana/social/adapter/BaseSocialFeedInteraction;", "onFeedAvatarImageClicked", "", "itemPosition", "", "onItemClicked", "onLoadMoreClicked", "onSocialFeedSpanClicked", "content", "Lid/dana/social/utils/Content;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends GriverRpcUtils.AnonymousClass1 {
        final /* synthetic */ ContentGroupingDetailActivity length;

        equals(ContentGroupingDetailActivity contentGroupingDetailActivity) {
            this.length = contentGroupingDetailActivity;
        }

        public final void setMax(@NotNull AUHorizontalListView.SavedState.AnonymousClass1 r2) {
            Intrinsics.checkNotNullParameter(r2, "content");
            setLeftButtonUnicode.length presenter = this.length.getPresenter();
            String str = r2.getMin;
            if (str == null) {
                str = "";
            }
            presenter.getMin(str);
        }

        public final void getMin(int i) {
            setEmptyView setemptyview = (setEmptyView) this.length.setMax.setMin(i);
            if (setemptyview != null) {
                ContentGroupingDetailActivity.access$handleAvatarClick(this.length, setemptyview);
            }
        }

        public final void length() {
            initStyleByTheme access$getSocialFeedsAdapter$p = this.length.setMax;
            if (!access$getSocialFeedsAdapter$p.toIntRange() && access$getSocialFeedsAdapter$p.setMin()) {
                access$getSocialFeedsAdapter$p.getMax(access$getSocialFeedsAdapter$p.getItemCount() - 1);
            }
            this.length.setMin();
        }

        public final void setMax(int i) {
            setEmptyView setemptyview;
            FeedModel feedModel;
            if (this.length.getMin && (setemptyview = (setEmptyView) this.length.setMax.setMin(i)) != null && (feedModel = setemptyview.setMax) != null) {
                SocialActivityDetail.setMax setmax = SocialActivityDetail.Companion;
                SocialActivityDetail.setMax.setMax(this.length, feedModel);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d0, code lost:
        r3 = r3.getStringArrayList("bundled_activity_ids");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r11 = this;
            r0 = 0
            int r1 = o.dispatchOnCancelled.getMax(r0)
            if (r1 == 0) goto L_0x0017
            o.onCanceled r2 = new o.onCanceled
            r3 = 16
            r2.<init>(r0, r1, r3)
            r1 = 795291155(0x2f672e13, float:2.1025696E-10)
            o.onCancelLoad.setMax(r1, r2)
            o.onCancelLoad.getMin(r1, r2)
        L_0x0017:
            id.dana.DanaApplication r1 = r11.getDanaApplication()
            java.lang.String r2 = "danaApplication"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            o.AUPopSupportPreemption r3 = r1.getSocialCommonComponent()
            if (r3 == 0) goto L_0x009c
            id.dana.social.di.module.ContentGroupingDetailModule r4 = new id.dana.social.di.module.ContentGroupingDetailModule
            id.dana.social.ContentGroupingDetailActivity$setMin r1 = new id.dana.social.ContentGroupingDetailActivity$setMin
            r1.<init>(r11)
            o.setLeftButtonUnicode$setMin r1 = (o.setLeftButtonUnicode.setMin) r1
            r4.<init>(r1)
            id.dana.contract.deeplink.DeepLinkModule$setMin r1 = id.dana.contract.deeplink.DeepLinkModule.getMax()
            r2 = r11
            android.app.Activity r2 = (android.app.Activity) r2
            r1.getMax = r2
            java.lang.String r5 = "Friendship Friend Feed"
            r1.length = r5
            id.dana.contract.deeplink.DeepLinkModule r5 = new id.dana.contract.deeplink.DeepLinkModule
            r5.<init>(r1, r0)
            java.lang.String r1 = "DeepLinkModule.builder()…HIP_FRIENDS_FEED).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            id.dana.contract.staticqr.ScanQrModule$setMin r1 = id.dana.contract.staticqr.ScanQrModule.getMax()
            r1.setMin = r2
            id.dana.contract.staticqr.ScanQrModule r6 = new id.dana.contract.staticqr.ScanQrModule
            r6.<init>(r1, r0)
            java.lang.String r1 = "ScanQrModule.builder()\n …\n                .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            id.dana.contract.shortener.RestoreUrlModule$setMin r1 = id.dana.contract.shortener.RestoreUrlModule.setMin()
            r1.getMax = r2
            id.dana.contract.shortener.RestoreUrlModule r7 = new id.dana.contract.shortener.RestoreUrlModule
            r7.<init>(r1, r0)
            java.lang.String r1 = "RestoreUrlModule.builder…\n                .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            id.dana.contract.deeplink.FeatureModule$length r1 = id.dana.contract.deeplink.FeatureModule.length()
            r1.setMax = r2
            id.dana.contract.deeplink.FeatureModule r8 = new id.dana.contract.deeplink.FeatureModule
            r8.<init>(r1, r0)
            java.lang.String r1 = "FeatureModule.builder()\n…\n                .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
            id.dana.di.modules.OauthModule$getMax r1 = id.dana.di.modules.OauthModule.setMin()
            r1.setMin = r2
            id.dana.di.modules.OauthModule r9 = new id.dana.di.modules.OauthModule
            r9.<init>(r1, r0)
            java.lang.String r1 = "OauthModule.builder()\n  …\n                .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            id.dana.contract.services.ServicesModule r10 = new id.dana.contract.services.ServicesModule
            id.dana.social.ContentGroupingDetailActivity$setMax r1 = new id.dana.social.ContentGroupingDetailActivity$setMax
            r1.<init>()
            o.style$getMin r1 = (o.style.getMin) r1
            r10.<init>((o.style.getMin) r1)
            o.addButtonView r1 = r3.setMax((id.dana.social.di.module.ContentGroupingDetailModule) r4, (id.dana.contract.deeplink.DeepLinkModule) r5, (id.dana.contract.staticqr.ScanQrModule) r6, (id.dana.contract.shortener.RestoreUrlModule) r7, (id.dana.contract.deeplink.FeatureModule) r8, (id.dana.di.modules.OauthModule) r9, (id.dana.contract.services.ServicesModule) r10)
            r1.length(r11)
        L_0x009c:
            r1 = 1
            o.onDelete$getMin[] r2 = new o.onDelete.getMin[r1]
            o.setLeftButtonUnicode$length r3 = r11.presenter
            java.lang.String r4 = "presenter"
            if (r3 != 0) goto L_0x00a8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x00a8:
            o.onDelete$getMin r3 = (o.onDelete.getMin) r3
            r2[r0] = r3
            r11.registerPresenter(r2)
            r2 = 2131231316(0x7f080254, float:1.807871E38)
            r11.setMenuLeftButton((int) r2)
            java.lang.String r2 = "Feed"
            r11.setCenterTitle(r2)
            o.setLeftButtonUnicode$length r2 = r11.presenter
            if (r2 != 0) goto L_0x00c1
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x00c1:
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r4 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            android.os.Bundle r3 = r3.getExtras()
            if (r3 == 0) goto L_0x00db
            java.lang.String r5 = "bundled_activity_ids"
            java.util.ArrayList r3 = r3.getStringArrayList(r5)
            if (r3 == 0) goto L_0x00db
            java.util.List r3 = (java.util.List) r3
            goto L_0x00df
        L_0x00db:
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00df:
            r2.getMax(r3)
            android.content.Intent r2 = r11.getIntent()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            android.os.Bundle r2 = r2.getExtras()
            if (r2 == 0) goto L_0x00f6
            java.lang.String r3 = "bundled_show_comment_button"
            boolean r2 = r2.getBoolean(r3)
            goto L_0x00f7
        L_0x00f6:
            r2 = 0
        L_0x00f7:
            r11.getMin = r2
            o.initStyleByTheme r2 = r11.setMax
            id.dana.social.ContentGroupingDetailActivity$equals r3 = r11.getMax
            o.initContent r3 = (o.initContent) r3
            java.lang.String r4 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r2.setMin = r3
            o.initStyleByTheme r2 = r11.setMax
            r2.getMax = r1
            o.initStyleByTheme r2 = r11.setMax
            boolean r3 = r11.getMin
            r2.getMin = r3
            int r2 = o.resetInternal.setMax.onCreateInputConnection
            android.view.View r2 = r11._$_findCachedViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r4 = r11.getBaseContext()
            r3.<init>(r4, r1, r0)
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r3 = (androidx.recyclerview.widget.RecyclerView.IsOverlapping) r3
            r2.setLayoutManager(r3)
            o.initStyleByTheme r0 = r11.setMax
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = (androidx.recyclerview.widget.RecyclerView.Adapter) r0
            r2.setAdapter(r0)
            int r0 = o.resetInternal.setMax.onCreateInputConnection
            android.view.View r0 = r11._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            id.dana.social.ContentGroupingDetailActivity$getMax r1 = new id.dana.social.ContentGroupingDetailActivity$getMax
            int r2 = o.resetInternal.setMax.onCreateInputConnection
            android.view.View r2 = r11._$_findCachedViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            java.lang.String r3 = "rv_bubble_feeds"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>(r11, r2)
            androidx.recyclerview.widget.RecyclerView$toIntRange r1 = (androidx.recyclerview.widget.RecyclerView.toIntRange) r1
            r0.addOnScrollListener(r1)
            r11.setMin()
            int r0 = o.resetInternal.setMax.MediaBrowserCompat$MediaItem
            android.view.View r0 = r11._$_findCachedViewById(r0)
            id.dana.component.buttoncomponent.DanaButtonPrimaryView r0 = (id.dana.component.buttoncomponent.DanaButtonPrimaryView) r0
            if (r0 == 0) goto L_0x0163
            id.dana.social.ContentGroupingDetailActivity$IsOverlapping r1 = new id.dana.social.ContentGroupingDetailActivity$IsOverlapping
            r1.<init>(r11)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.ContentGroupingDetailActivity.init():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ ContentGroupingDetailActivity getMax;

        IsOverlapping(ContentGroupingDetailActivity contentGroupingDetailActivity) {
            this.getMax = contentGroupingDetailActivity;
        }

        public final void onClick(View view) {
            ContentGroupingDetailActivity.access$showExistState(this.getMax);
            initStyleByTheme access$getSocialFeedsAdapter$p = this.getMax.setMax;
            access$getSocialFeedsAdapter$p.getMax().addAll(initStyleByTheme.setMax());
            access$getSocialFeedsAdapter$p.notifyDataSetChanged();
            this.getMax.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"id/dana/social/ContentGroupingDetailActivity$initInjector$1", "Lid/dana/social/contract/ContentGroupingDetailContract$View;", "onFailLoadGroupedActivities", "", "onSuccessLoadGroupedActivities", "activities", "", "Lid/dana/social/model/FeedViewHolderModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements setLeftButtonUnicode.setMin {
        final /* synthetic */ ContentGroupingDetailActivity length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin(ContentGroupingDetailActivity contentGroupingDetailActivity) {
            this.length = contentGroupingDetailActivity;
        }

        public final void length(@NotNull List<setEmptyView> list) {
            Intrinsics.checkNotNullParameter(list, "activities");
            ContentGroupingDetailActivity.access$hideShimmer(this.length);
            if (!list.isEmpty()) {
                ContentGroupingDetailActivity.access$showExistState(this.length);
                this.length.setMax.setMax(list);
            } else if (this.length.getPresenter().toIntRange()) {
                ContentGroupingDetailActivity.access$showEmptyState(this.length);
            } else {
                initStyleByTheme access$getSocialFeedsAdapter$p = this.length.setMax;
                if (!access$getSocialFeedsAdapter$p.toIntRange() && access$getSocialFeedsAdapter$p.equals() && !access$getSocialFeedsAdapter$p.setMin()) {
                    access$getSocialFeedsAdapter$p.getMax(new setEmptyView(7, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
                }
            }
        }

        public final void setMax() {
            ContentGroupingDetailActivity.access$hideShimmer(this.length);
            ContentGroupingDetailActivity.access$showEmptyState(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/social/ContentGroupingDetailActivity$initInjector$2", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements style.getMin {
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

        setMax() {
        }
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        int length2;
        int min;
        int length3;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-1629965850, oncanceled);
            onCancelLoad.getMin(-1629965850, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1629965850, oncanceled2);
            onCancelLoad.getMin(-1629965850, oncanceled2);
        }
        this.setMax.length(getMin());
        setLeftButtonUnicode.length length4 = this.presenter;
        if (length4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length4.length();
    }

    private final List<setEmptyView> getMin() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-671595687, oncanceled);
            onCancelLoad.getMin(-671595687, oncanceled);
        }
        List<setEmptyView> arrayList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            FeedModel.setMax setmax = FeedModel.Grayscale$Algorithm;
            arrayList.add(new setEmptyView(0, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 30));
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/ContentGroupingDetailActivity$setupRecycler$2", "Lid/dana/social/utils/SocialScrollListener;", "isHasMore", "", "onTouchBottom", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends APAlertDialog.AnonymousClass1 {
        final /* synthetic */ ContentGroupingDetailActivity getMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(ContentGroupingDetailActivity contentGroupingDetailActivity, RecyclerView recyclerView) {
            new RecyclerView.toIntRange(recyclerView) {
                private final RecyclerView length;

                public void getMin(
/*
Method generation error in method: o.APAlertDialog.1.getMin():void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.APAlertDialog.1.getMin():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public void setMax(
/*
Method generation error in method: o.APAlertDialog.1.setMax(boolean):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.APAlertDialog.1.setMax(boolean):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public abstract boolean setMin();

                public void onScrolled(
/*
Method generation error in method: o.APAlertDialog.1.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.APAlertDialog.1.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public void onScrollStateChanged(
/*
Method generation error in method: o.APAlertDialog.1.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.APAlertDialog.1.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                private final boolean getMax(
/*
Method generation error in method: o.APAlertDialog.1.getMax():boolean, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.APAlertDialog.1.getMax():boolean, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            };
            this.getMin = contentGroupingDetailActivity;
        }

        public final boolean setMin() {
            return this.getMin.getPresenter().setMin();
        }

        public final void getMin() {
            if (!this.getMin.setMax.setMin()) {
                this.getMin.setMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/social/ContentGroupingDetailActivity$Companion;", "", "()V", "BUNDLED_ACTIVITY_IDS", "", "BUNDLED_SHOW_COMMENT_BUTTON", "openContentGroupingDetailActivity", "", "context", "Landroid/content/Context;", "activityIds", "Ljava/util/ArrayList;", "showCommentButton", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    private final boolean getMax(FeedModel feedModel) {
        HashMap<String, String> hashMap = feedModel.IsOverlapping;
        String userId = hashMap != null ? setBuildNumber.getUserId(hashMap) : null;
        setLeftButtonUnicode.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return Intrinsics.areEqual((Object) userId, (Object) length2.getMin());
    }

    public static final /* synthetic */ void access$hideShimmer(ContentGroupingDetailActivity contentGroupingDetailActivity) {
        List max = contentGroupingDetailActivity.setMax.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "socialFeedsAdapter.items");
        CollectionsKt.removeAll(max, getMin.INSTANCE);
        contentGroupingDetailActivity.setMax.notifyDataSetChanged();
    }

    public static final /* synthetic */ void access$showEmptyState(ContentGroupingDetailActivity contentGroupingDetailActivity) {
        LinearLayout linearLayout = (LinearLayout) contentGroupingDetailActivity._$_findCachedViewById(resetInternal.setMax.MediaSessionCompat$QueueItem);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "cl_content_group_detail");
        linearLayout.setVisibility(8);
        View _$_findCachedViewById = contentGroupingDetailActivity._$_findCachedViewById(resetInternal.setMax.MediaSessionCompat$Token);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "cl_empty_state_wrapper");
        _$_findCachedViewById.setVisibility(0);
    }
}
