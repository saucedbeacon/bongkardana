package id.dana.social.view;

import android.app.Dialog;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji.widget.EmojiAppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.social.di.module.ReactionsModule;
import id.dana.social.model.FeedModel;
import id.dana.social.model.ReactionCountModel;
import id.dana.social.view.fragment.ActivityReactionsListFragment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.AUPopSupportPreemption;
import o.RunningAverageRssiFilter;
import o.access$2302;
import o.access$2402;
import o.order;
import o.resetInternal;
import o.setLeftButtonFont;
import o.verifyConnection;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u0010H\u0014J\b\u00104\u001a\u000205H\u0014J\u0010\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005H\u0002J\b\u00108\u001a\u000209H\u0014J\b\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u000202H\u0014J\u0018\u0010=\u001a\u0002022\u0006\u0010>\u001a\u0002092\u0006\u0010?\u001a\u000209H\u0014J\b\u0010@\u001a\u000202H\u0002J\b\u0010A\u001a\u000202H\u0014J\b\u0010B\u001a\u000202H\u0014J\b\u0010C\u001a\u000202H\u0016J\b\u0010D\u001a\u000202H\u0002J\b\u0010E\u001a\u000202H\u0002J\b\u0010F\u001a\u000202H\u0002J\b\u0010G\u001a\u000202H\u0002J\b\u0010H\u001a\u000202H\u0002J\b\u0010I\u001a\u000202H\u0002J\b\u0010J\u001a\u000202H\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006K"}, d2 = {"Lid/dana/social/view/ActivityReactionsBottomSheetDialog;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "feedModel", "Lid/dana/social/model/FeedModel;", "selectedKind", "", "(Lid/dana/social/model/FeedModel;Ljava/lang/String;)V", "activityReactionsViewPagerAdapter", "Lid/dana/social/adapter/ActivityReactionsViewPagerAdapter;", "clActivityReactions", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getClActivityReactions", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "setClActivityReactions", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "flActivityReactions", "Landroid/widget/FrameLayout;", "getFlActivityReactions", "()Landroid/widget/FrameLayout;", "setFlActivityReactions", "(Landroid/widget/FrameLayout;)V", "presenter", "Lid/dana/social/contract/reaction/ReactionsContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/reaction/ReactionsContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/reaction/ReactionsContract$Presenter;)V", "reactionModels", "", "Lid/dana/social/model/ReactionModel;", "sortedReactionCounts", "", "Lid/dana/social/model/ReactionCountModel;", "getSortedReactionCounts", "()Ljava/util/List;", "setSortedReactionCounts", "(Ljava/util/List;)V", "tabLayoutActivityReactions", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayoutActivityReactions", "()Lcom/google/android/material/tabs/TabLayout;", "setTabLayoutActivityReactions", "(Lcom/google/android/material/tabs/TabLayout;)V", "vpActivityReactions", "Landroidx/viewpager/widget/ViewPager;", "getVpActivityReactions", "()Landroidx/viewpager/widget/ViewPager;", "setVpActivityReactions", "(Landroidx/viewpager/widget/ViewPager;)V", "forceFullscrenDialog", "", "getBottomSheet", "getDimAmount", "", "getKindName", "currentKind", "getLayout", "", "getReactionModuleView", "Lid/dana/social/contract/reaction/ReactionsContract$View;", "init", "initBottomSheet", "peekHeight", "bottomSheetState", "initComponent", "onDismiss", "onShow", "onStart", "setSelectedTab", "setUpBottomSheetAdapter", "setupTabLayout", "setupTabLayoutCustomView", "setupViewPager", "setupViewPagerAdapter", "sortReactionCounts", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ActivityReactionsBottomSheetDialog extends order {
    @BindView(2131362438)
    public CoordinatorLayout clActivityReactions;
    private String equals;
    @BindView(2131362940)
    public FrameLayout flActivityReactions;
    private verifyConnection getMax;
    public List<ReactionCountModel> getMin;
    private HashMap isInside;
    @Inject
    public setLeftButtonFont.getMin presenter;
    @BindView(2131364854)
    public TabLayout tabLayoutActivityReactions;
    /* access modifiers changed from: private */
    public final List<access$2402> toFloatRange = new ArrayList();
    private final FeedModel toIntRange;
    @BindView(2131365999)
    public ViewPager vpActivityReactions;

    public final int getMin() {
        return R.layout.bottom_sheet_activity_reactions_coordinator;
    }

    public final float length() {
        return 0.0f;
    }

    public ActivityReactionsBottomSheetDialog(@NotNull FeedModel feedModel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(feedModel, "feedModel");
        Intrinsics.checkNotNullParameter(str, "selectedKind");
        this.toIntRange = feedModel;
        this.equals = str;
    }

    @NotNull
    public final FrameLayout getMax() {
        CoordinatorLayout coordinatorLayout = this.clActivityReactions;
        if (coordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clActivityReactions");
        }
        View findViewById = coordinatorLayout.findViewById(R.id.f44152131362940);
        Intrinsics.checkNotNullExpressionValue(findViewById, "clActivityReactions.find…_activity_reactions\n    )");
        return (FrameLayout) findViewById;
    }

    public final void setMin(int i, int i2) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        BaseActivity baseActivity = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        WindowManager windowManager = baseActivity.getWindowManager();
        Intrinsics.checkNotNullExpressionValue(windowManager, "baseActivity.windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        super.setMin(displayMetrics.heightPixels, 3);
    }

    public final void setMin() {
        super.setMin();
        BaseActivity baseActivity = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            socialCommonComponent.setMax(new ReactionsModule(new length(this))).setMin(this);
        }
        setLeftButtonFont.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.length();
        setMin(9999, 3);
        this.getMin = CollectionsKt.sortedWith(this.toIntRange.FastBitmap$CoordinateSystem, new getMin());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"id/dana/social/view/ActivityReactionsBottomSheetDialog$getReactionModuleView$1", "Lid/dana/social/contract/reaction/ReactionsContract$View;", "onReactionsLoadError", "", "onReactionsLoaded", "reactions", "", "Lid/dana/social/model/ReactionModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements setLeftButtonFont.setMin {
        final /* synthetic */ ActivityReactionsBottomSheetDialog getMin;

        public final void getMin(@NotNull RunningAverageRssiFilter runningAverageRssiFilter) {
            Intrinsics.checkNotNullParameter(runningAverageRssiFilter, "deleteReactionResult");
        }

        public final void length(@NotNull access$2302 access_2302) {
            Intrinsics.checkNotNullParameter(access_2302, "reactionResultModel");
        }

        length(ActivityReactionsBottomSheetDialog activityReactionsBottomSheetDialog) {
            this.getMin = activityReactionsBottomSheetDialog;
        }

        public final void setMax(@NotNull List<access$2402> list) {
            Intrinsics.checkNotNullParameter(list, "reactions");
            this.getMin.toFloatRange.addAll(CollectionsKt.toMutableList(list));
            ActivityReactionsBottomSheetDialog.getMin(this.getMin);
        }

        public final void equals() {
            ActivityReactionsBottomSheetDialog.getMin(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class getMin<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ReactionCountModel) t2).setMax), Integer.valueOf(((ReactionCountModel) t).setMax));
        }
    }

    private final String getMax(String str) {
        if (!(!this.toFloatRange.isEmpty())) {
            return str;
        }
        int i = 0;
        Iterator<access$2402> it = this.toFloatRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual((Object) it.next().setMin, (Object) str)) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0 ? this.toFloatRange.get(i).getMax : str;
    }

    public final void setMax() {
        super.setMax();
        TypedValue typedValue = new TypedValue();
        BaseActivity baseActivity = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        baseActivity.getTheme().resolveAttribute(16843499, typedValue, true);
        int dimensionPixelSize = getResources().getDimensionPixelSize(typedValue.resourceId);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        BaseActivity baseActivity2 = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
        WindowManager windowManager = baseActivity2.getWindowManager();
        Intrinsics.checkNotNullExpressionValue(windowManager, "baseActivity.windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        FrameLayout frameLayout = this.flActivityReactions;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flActivityReactions");
        }
        frameLayout.getLayoutParams().height = i - dimensionPixelSize;
        FrameLayout frameLayout2 = this.flActivityReactions;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flActivityReactions");
        }
        frameLayout2.requestLayout();
    }

    public final void onStart() {
        ViewGroup.LayoutParams layoutParams;
        super.onStart();
        Dialog dialog = getDialog();
        View findViewById = dialog != null ? dialog.findViewById(R.id.f42162131362710) : null;
        if (!(findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null)) {
            layoutParams.height = -1;
        }
        View view = getView();
        if (view != null) {
            view.post(new setMin(view, this, findViewById));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "id/dana/social/view/ActivityReactionsBottomSheetDialog$forceFullscrenDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Runnable {
        final /* synthetic */ ActivityReactionsBottomSheetDialog getMax;
        final /* synthetic */ View getMin;
        final /* synthetic */ View setMin;

        setMin(View view, ActivityReactionsBottomSheetDialog activityReactionsBottomSheetDialog, View view2) {
            this.setMin = view;
            this.getMax = activityReactionsBottomSheetDialog;
            this.getMin = view2;
        }

        public final void run() {
            ViewParent parent = this.setMin.getParent();
            if (parent != null) {
                ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
                if (layoutParams != null) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.length) layoutParams).setMin;
                    if (behavior != null) {
                        ((BottomSheetBehavior) behavior).setPeekHeight(this.setMin.getMeasuredHeight());
                        View view = this.getMin;
                        ViewParent parent2 = view != null ? view.getParent() : null;
                        if (parent2 != null) {
                            ((View) parent2).setBackgroundColor(0);
                            CoordinatorLayout coordinatorLayout = this.getMax.clActivityReactions;
                            if (coordinatorLayout == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("clActivityReactions");
                            }
                            coordinatorLayout.setOnClickListener(new View.OnClickListener(this) {
                                final /* synthetic */ setMin setMin;

                                {
                                    this.setMin = r1;
                                }

                                public final void onClick(View view) {
                                    this.setMin.getMax.dismiss();
                                }
                            });
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View!>");
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public final void IsOverlapping() {
        super.IsOverlapping();
        dismiss();
    }

    public static final /* synthetic */ void getMin(ActivityReactionsBottomSheetDialog activityReactionsBottomSheetDialog) {
        CharSequence charSequence;
        FragmentManager childFragmentManager = activityReactionsBottomSheetDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        activityReactionsBottomSheetDialog.getMax = new verifyConnection(childFragmentManager, activityReactionsBottomSheetDialog.getContext());
        List<ReactionCountModel> list = activityReactionsBottomSheetDialog.getMin;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortedReactionCounts");
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            verifyConnection verifyconnection = activityReactionsBottomSheetDialog.getMax;
            if (verifyconnection == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityReactionsViewPagerAdapter");
            }
            String str = activityReactionsBottomSheetDialog.toIntRange.setMin;
            List<ReactionCountModel> list2 = activityReactionsBottomSheetDialog.getMin;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sortedReactionCounts");
            }
            ReactionCountModel reactionCountModel = list2.get(i2);
            List<ReactionCountModel> list3 = activityReactionsBottomSheetDialog.getMin;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sortedReactionCounts");
            }
            verifyConnection.length length2 = new verifyConnection.length(str, reactionCountModel, activityReactionsBottomSheetDialog.getMax(list3.get(i2).getMin));
            Intrinsics.checkNotNullParameter(length2, "params");
            verifyconnection.getMax.add(new ActivityReactionsListFragment(length2.setMax, length2.getMin, length2.setMin));
            verifyconnection.getMin.add(length2.getMin);
        }
        ViewPager viewPager = activityReactionsBottomSheetDialog.vpActivityReactions;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vpActivityReactions");
        }
        verifyConnection verifyconnection2 = activityReactionsBottomSheetDialog.getMax;
        if (verifyconnection2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityReactionsViewPagerAdapter");
        }
        viewPager.setAdapter(verifyconnection2);
        TabLayout tabLayout = activityReactionsBottomSheetDialog.tabLayoutActivityReactions;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabLayoutActivityReactions");
        }
        tabLayout.setTabMode(0);
        ViewPager viewPager2 = activityReactionsBottomSheetDialog.vpActivityReactions;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vpActivityReactions");
        }
        tabLayout.setupWithViewPager(viewPager2);
        TabLayout tabLayout2 = activityReactionsBottomSheetDialog.tabLayoutActivityReactions;
        if (tabLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabLayoutActivityReactions");
        }
        int tabCount = tabLayout2.getTabCount();
        if (tabCount >= 0) {
            int i3 = 0;
            while (true) {
                TabLayout tabLayout3 = activityReactionsBottomSheetDialog.tabLayoutActivityReactions;
                if (tabLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabLayoutActivityReactions");
                }
                TabLayout.Tab tabAt = tabLayout3.getTabAt(i3);
                if (tabAt != null) {
                    verifyConnection verifyconnection3 = activityReactionsBottomSheetDialog.getMax;
                    if (verifyconnection3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityReactionsViewPagerAdapter");
                    }
                    ReactionCountModel reactionCountModel2 = verifyconnection3.getMin.get(i3);
                    String str2 = null;
                    View inflate = LayoutInflater.from(verifyconnection3.setMin).inflate(R.layout.activity_reactions_custom_tab_layout, (ViewGroup) null);
                    Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…_custom_tab_layout, null)");
                    EmojiAppCompatTextView emojiAppCompatTextView = (EmojiAppCompatTextView) inflate.findViewById(resetInternal.setMax.setThumbPosition);
                    if (emojiAppCompatTextView != null) {
                        AUHorizontalListView.SavedState savedState = AUHorizontalListView.SavedState.length;
                        emojiAppCompatTextView.setText(AUHorizontalListView.SavedState.getMin(reactionCountModel2.getMin));
                    }
                    TextView textView = (TextView) inflate.findViewById(resetInternal.setMax.getTargetCheckedState);
                    if (textView != null) {
                        String valueOf = String.valueOf(reactionCountModel2.setMax);
                        if (!(reactionCountModel2.setMax > 99)) {
                            str2 = valueOf;
                        }
                        if (str2 != null) {
                            charSequence = str2;
                        } else {
                            charSequence = "99+";
                        }
                        textView.setText(charSequence);
                    }
                    tabAt.setCustomView(inflate);
                }
                if (i3 == tabCount) {
                    break;
                }
                i3++;
            }
        }
        if (!Intrinsics.areEqual((Object) activityReactionsBottomSheetDialog.equals, (Object) "")) {
            List<ReactionCountModel> list4 = activityReactionsBottomSheetDialog.getMin;
            if (list4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sortedReactionCounts");
            }
            Iterator<ReactionCountModel> it = list4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual((Object) it.next().getMin, (Object) activityReactionsBottomSheetDialog.equals)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                TabLayout tabLayout4 = activityReactionsBottomSheetDialog.tabLayoutActivityReactions;
                if (tabLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabLayoutActivityReactions");
                }
                TabLayout.Tab tabAt2 = tabLayout4.getTabAt(i);
                if (tabAt2 != null) {
                    tabAt2.select();
                }
            }
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
