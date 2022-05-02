package id.dana.social;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.tabs.TabLayout;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseWithToolbarFragment;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.myprofile.MyProfileBundleKey;
import id.dana.myprofile.SettingMoreProfileActivity;
import id.dana.social.FriendshipBottomSheetHelpActivity;
import id.dana.social.di.module.RelationshipBottomSheetModule;
import id.dana.social.fragment.FriendsFeedsFragment;
import id.dana.social.fragment.MyFeedsFragment;
import id.dana.social.model.RelationshipItemModel;
import id.dana.social.view.activity.ChangeUsernameActivity;
import id.dana.tracker.TrackerKey;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.AUPopSupportPreemption;
import o.FtsOptions$Order;
import o.IntRange;
import o.LogLiteManager;
import o.getTitleText;
import o.onDelete;
import o.resetInternal;
import o.setLogUploadURL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\fH\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0016H\u0014J\u0006\u0010!\u001a\u00020\u0016J\u0012\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\b\u0010&\u001a\u00020\u0016H\u0016J\b\u0010'\u001a\u00020\u0016H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u0016H\u0016J\b\u0010*\u001a\u00020\u0016H\u0002J\b\u0010+\u001a\u00020\u0016H\u0002J\b\u0010,\u001a\u00020\u0016H\u0002J\b\u0010-\u001a\u00020\u0016H\u0002J\u0010\u0010.\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\fH\u0002J\n\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0010\u00101\u001a\u00020\u00162\b\u00102\u001a\u0004\u0018\u000103J\u0010\u00104\u001a\u00020\u00162\b\u00102\u001a\u0004\u0018\u000103J\u001a\u00105\u001a\u00020\u00162\b\u00102\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lid/dana/social/FeedsFragment;", "Lid/dana/base/BaseWithToolbarFragment;", "()V", "feedsIntroduction", "Lid/dana/social/FeedsIntroduction;", "friendshipAnalyticsTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticsTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticsTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "selected", "", "settingPresenter", "Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;", "getSettingPresenter", "()Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;", "setSettingPresenter", "(Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;)V", "tabAdapter", "Lid/dana/social/adapter/BaseTabFragmentAdapter;", "callOnResumeOnEveryTabFragment", "", "createFeedsTab", "feedInboxTab", "getCurrentSelectedFragment", "Landroidx/fragment/app/Fragment;", "getLayout", "", "goToProfileActivity", "setting", "Lid/dana/domain/profilemenu/model/SettingModel;", "init", "initComponent", "onClickLeftMenuButton", "view", "Landroid/view/View;", "onPause", "onResume", "onSelected", "onStart", "onUnSelected", "onfragmentSelected", "onfragmentUnselected", "openChangeUsernameActivity", "refreshFeeds", "setFeedAdapter", "setupSettingIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "toFriendTab", "source", "", "toMeTab", "trackOpenFeeds", "feedType", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FeedsFragment extends BaseWithToolbarFragment {
    @NotNull
    public static final getMin setMin = new getMin((byte) 0);
    private HashMap equals;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticsTracker;
    private setLogUploadURL getMin;
    public LogLiteManager setMax;
    @Inject
    public getTitleText.getMin settingPresenter;
    private boolean toFloatRange;

    public final View getMin(int i) {
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int setMin() {
        return R.layout.fragment_social_feed;
    }

    public static final /* synthetic */ setLogUploadURL length(FeedsFragment feedsFragment) {
        setLogUploadURL setloguploadurl = feedsFragment.getMin;
        if (setloguploadurl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedsIntroduction");
        }
        return setloguploadurl;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/FeedsFragment$init$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ Context getMax;
        final /* synthetic */ FeedsFragment getMin;

        length(Context context, FeedsFragment feedsFragment) {
            this.getMax = context;
            this.getMin = feedsFragment;
        }

        public final void onClick(View view) {
            setLogUploadURL length = FeedsFragment.length(this.getMin);
            Context context = this.getMax;
            Intrinsics.checkNotNullExpressionValue(context, "this");
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            FriendshipBottomSheetHelpActivity.setMin setmin = FriendshipBottomSheetHelpActivity.Companion;
            String string = context.getString(R.string.feed_introfuction_page_header_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.feed_…uction_page_header_title)");
            context.startActivity(FriendshipBottomSheetHelpActivity.setMin.getMax(context, new OnBoardingModel(string, BottomSheetType.LIST, length.getMax, BottomSheetOnBoardingScenario.FRIENDSHIP)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/FeedsFragment$setupSettingIcon$1$1"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ FeedsFragment setMax;

        isInside(FeedsFragment feedsFragment) {
            this.setMax = feedsFragment;
        }

        public final void onClick(View view) {
            getTitleText.getMin getmin = this.setMax.settingPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("settingPresenter");
            }
            getmin.getMax("setting_more");
        }
    }

    public final void o_() {
        super.o_();
        Fragment max = getMax();
        this.toFloatRange = true;
        if (max instanceof FtsOptions$Order) {
            ((FtsOptions$Order) max).o_();
        }
    }

    public final void IsOverlapping() {
        super.IsOverlapping();
        Fragment max = getMax();
        this.toFloatRange = false;
        if (max instanceof FtsOptions$Order) {
            ((FtsOptions$Order) max).IsOverlapping();
        }
    }

    public final void onStart() {
        super.onStart();
        if (getUserVisibleHint()) {
            Fragment max = getMax();
            this.toFloatRange = true;
            if (max instanceof FtsOptions$Order) {
                ((FtsOptions$Order) max).o_();
            }
        }
    }

    public final void onPause() {
        super.onPause();
        Fragment max = getMax();
        this.toFloatRange = false;
        if (max instanceof FtsOptions$Order) {
            ((FtsOptions$Order) max).IsOverlapping();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/social/FeedsFragment$initComponent$1", "Lid/dana/social/contract/RelationshipBottomSheetContract$View;", "onGetFeedInboxTabEnableSuccess", "", "enable", "", "onGetProfileSettingModelSuccess", "setting", "Lid/dana/domain/profilemenu/model/SettingModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements getTitleText.length {
        final /* synthetic */ FeedsFragment getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void getMin() {
        }

        public final void getMin(@NotNull List<RelationshipItemModel> list) {
            Intrinsics.checkNotNullParameter(list, "relationshipItemModelList");
        }

        public final void length(@NotNull ModifyRelationOperationType modifyRelationOperationType) {
            Intrinsics.checkNotNullParameter(modifyRelationOperationType, "operationType");
        }

        public final void length(@NotNull List<RelationshipItemModel> list) {
            Intrinsics.checkNotNullParameter(list, "relationshipItemModelList");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void setMin() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(FeedsFragment feedsFragment) {
            this.getMax = feedsFragment;
        }

        public final void getMax(@NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(settingModel, "setting");
            String action = settingModel.getAction();
            if (action != null && action.hashCode() == 315215690 && action.equals(MyProfileMenuAction.SETTING_USERNAME_CHANGE)) {
                FeedsFragment.getMin(this.getMax);
            } else {
                FeedsFragment.setMin(this.getMax, settingModel);
            }
        }

        public final void setMin(boolean z) {
            FeedsFragment.getMax(this.getMax, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/social/FeedsFragment$setFeedAdapter$1$1", "Lid/dana/social/fragment/FriendsFeedsFragment$Interaction;", "onUsernameBannerClick", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements FriendsFeedsFragment.getMin {
        final /* synthetic */ FeedsFragment getMin;
        final /* synthetic */ boolean length;

        getMax(FeedsFragment feedsFragment, boolean z) {
            this.getMin = feedsFragment;
            this.length = z;
        }

        public final void getMax() {
            getTitleText.getMin getmin = this.getMin.settingPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("settingPresenter");
            }
            getmin.getMax(MyProfileMenuAction.SETTING_USERNAME_CHANGE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"id/dana/social/FeedsFragment$createFeedsTab$1$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements ViewPager.setMax {
        final /* synthetic */ FeedsFragment length;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        setMin(FeedsFragment feedsFragment) {
            this.length = feedsFragment;
        }

        public final void onPageSelected(int i) {
            if (this.length.getUserVisibleHint()) {
                if (i == 0) {
                    this.length.setMax(TrackerKey.SourceType.FRIENDS_FEED, i);
                } else if (i == 1) {
                    this.length.setMax(TrackerKey.SourceType.INBOX_PAGE, i);
                }
                FeedsFragment.setMin(this.length);
            }
        }
    }

    public final Fragment getMax() {
        if (this.setMax == null) {
            return null;
        }
        LogLiteManager logLiteManager = this.setMax;
        if (logLiteManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabAdapter");
        }
        ViewPager viewPager = (ViewPager) getMin(resetInternal.setMax.setTransitionState);
        Intrinsics.checkNotNullExpressionValue(viewPager, "vp_feeds");
        return logLiteManager.getMin.get(viewPager.getCurrentItem());
    }

    public final void onResume() {
        super.onResume();
        if (this.setMax != null) {
            equals();
        }
    }

    public final void equals() {
        LogLiteManager logLiteManager = this.setMax;
        if (logLiteManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabAdapter");
        }
        int count = logLiteManager.getCount();
        for (int i = 0; i < count; i++) {
            LogLiteManager logLiteManager2 = this.setMax;
            if (logLiteManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabAdapter");
            }
            logLiteManager2.getMin.get(i).onResume();
        }
    }

    public final void setMax(String str, int i) {
        if (this.friendshipAnalyticsTracker == null) {
            return;
        }
        if (i == 0) {
            AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticsTracker;
            if (selectionNotifier == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticsTracker");
            }
            selectionNotifier.setMin(str);
        } else if (i == 1) {
            AUHorizontalListView.SelectionNotifier selectionNotifier2 = this.friendshipAnalyticsTracker;
            if (selectionNotifier2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticsTracker");
            }
            selectionNotifier2.length(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/social/FeedsFragment$Companion;", "", "()V", "TAB_FRIEND", "", "TAB_ME", "newInstance", "Lid/dana/social/FeedsFragment;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void setMax() {
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            socialCommonComponent.setMin(new RelationshipBottomSheetModule(new setMax(this))).length(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        getTitleText.getMin getmin = this.settingPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingPresenter");
        }
        getminArr[0] = getmin;
        getMin(getminArr);
        String string = getString(R.string.feeds_page_title);
        if (this.toolbarTitle != null) {
            this.toolbarTitle.setText(string);
        }
        getMax(R.drawable.arrow_left_white);
        int dimension = (int) getResources().getDimension(R.dimen.f26272131165275);
        if (this.rightButton != null) {
            this.rightButton.setBackground(IntRange.length(getContext(), (int) R.drawable.ic_tooltip_help));
            if (this.rightButton != null) {
                this.rightButton.setEnabled(true);
                this.rightButton.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.rightButton.getLayoutParams();
                layoutParams.setMargins(0, 0, dimension, 0);
                this.rightButton.setLayoutParams(layoutParams);
            }
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) getMin(resetInternal.setMax.hasText);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
            appCompatImageView.setOnClickListener(new isInside(this));
        }
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkNotNullExpressionValue(context, "this");
            this.getMin = new setLogUploadURL(context);
            View.OnClickListener length2 = new length(context, this);
            if (this.rightButton != null) {
                this.rightButton.setOnClickListener(length2);
            }
        }
        getTitleText.getMin getmin2 = this.settingPresenter;
        if (getmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingPresenter");
        }
        getmin2.setMin();
    }

    public final void onClickLeftMenuButton(@Nullable View view) {
        this.getMax.onBackPressed();
    }

    public static final /* synthetic */ void getMin(FeedsFragment feedsFragment) {
        Context context = feedsFragment.getContext();
        if (context != null) {
            feedsFragment.startActivity(new Intent(context, ChangeUsernameActivity.class));
        }
    }

    public static final /* synthetic */ void setMin(FeedsFragment feedsFragment, SettingModel settingModel) {
        Context context = feedsFragment.getContext();
        if (context != null) {
            Intent intent = new Intent(context, SettingMoreProfileActivity.class);
            intent.putExtra(MyProfileBundleKey.SETTING_MODEL, settingModel);
            feedsFragment.startActivity(intent);
        }
    }

    public static final /* synthetic */ void getMax(FeedsFragment feedsFragment, boolean z) {
        ConstraintLayout constraintLayout = (ConstraintLayout) feedsFragment.getMin(resetInternal.setMax.RestrictTo$Scope);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "fl_feeds_tab");
        constraintLayout.setVisibility(z ? 0 : 8);
        FragmentManager childFragmentManager = feedsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        LogLiteManager logLiteManager = new LogLiteManager(childFragmentManager);
        if (z) {
            String string = feedsFragment.getString(R.string.feeds_tab_only_me);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.feeds_tab_only_me)");
            logLiteManager.setMin(new MyFeedsFragment(), string);
        }
        String string2 = feedsFragment.getString(R.string.feeds_tab_friends);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.feeds_tab_friends)");
        logLiteManager.setMin(new FriendsFeedsFragment(new getMax(feedsFragment, z)), string2);
        Unit unit = Unit.INSTANCE;
        feedsFragment.setMax = logLiteManager;
        ViewPager viewPager = (ViewPager) feedsFragment.getMin(resetInternal.setMax.setTransitionState);
        LogLiteManager logLiteManager2 = feedsFragment.setMax;
        if (logLiteManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabAdapter");
        }
        viewPager.setAdapter(logLiteManager2);
        viewPager.addOnPageChangeListener(new setMin(feedsFragment));
        TabLayout tabLayout = (TabLayout) feedsFragment.getMin(resetInternal.setMax.getFixedWidthMinor);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager((ViewPager) feedsFragment.getMin(resetInternal.setMax.setTransitionState));
        }
        if (feedsFragment.toFloatRange) {
            Fragment max = feedsFragment.getMax();
            feedsFragment.toFloatRange = true;
            if (max instanceof FtsOptions$Order) {
                ((FtsOptions$Order) max).o_();
                return;
            }
            return;
        }
        Fragment max2 = feedsFragment.getMax();
        feedsFragment.toFloatRange = false;
        if (max2 instanceof FtsOptions$Order) {
            ((FtsOptions$Order) max2).IsOverlapping();
        }
    }

    public static final /* synthetic */ void setMin(FeedsFragment feedsFragment) {
        Fragment max = feedsFragment.getMax();
        feedsFragment.toFloatRange = true;
        if (max instanceof FtsOptions$Order) {
            ((FtsOptions$Order) max).o_();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @JvmStatic
    @NotNull
    public static final FeedsFragment toDoubleRange() {
        return new FeedsFragment();
    }
}
