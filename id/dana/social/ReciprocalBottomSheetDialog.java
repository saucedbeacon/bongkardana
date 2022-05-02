package id.dana.social;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.services.ServicesModule;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.model.ThirdPartyService;
import id.dana.richview.SearchView;
import id.dana.social.di.module.RelationshipBottomSheetModule;
import id.dana.social.model.RelationshipItemModel;
import id.dana.social.view.activity.SocialProfileActivity;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.AUPopSupportPreemption;
import o.IComponent;
import o.IntRange;
import o.SwipeRefreshLayout;
import o.getAuthCodeForSecurityGuard;
import o.getOpenId;
import o.getTitleText;
import o.onDelete;
import o.order;
import o.resetInternal;
import o.setAP;
import o.setOnWheelViewListener;
import o.setShadowResourceRight;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020\nH\u0014J\b\u0010'\u001a\u00020(H\u0014J\b\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0014J\u0018\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020*H\u0014J\b\u00100\u001a\u00020$H\u0002J\b\u00101\u001a\u00020$H\u0002J\b\u00102\u001a\u00020$H\u0002J\b\u00103\u001a\u00020$H\u0002J\b\u00104\u001a\u00020$H\u0002J\u0016\u00105\u001a\u00020$2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\"07H\u0002J\u0018\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010=\u001a\u00020$H\u0014J\b\u0010>\u001a\u00020$H\u0016J\b\u0010?\u001a\u00020$H\u0014J\b\u0010@\u001a\u00020$H\u0016J\u0017\u0010A\u001a\u0004\u0018\u00010$2\u0006\u0010B\u001a\u00020\"H\u0002¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020$H\u0002J\b\u0010E\u001a\u00020$H\u0002J\b\u0010F\u001a\u00020$H\u0002J\b\u0010G\u001a\u00020$H\u0002J\u0010\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020$2\u0006\u0010I\u001a\u00020JH\u0002J\b\u0010L\u001a\u00020$H\u0002J\u0018\u0010M\u001a\u00020$2\u0006\u00109\u001a\u00020\"2\u0006\u0010N\u001a\u00020JH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lid/dana/social/ReciprocalBottomSheetDialog;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "clFriendlist", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getClFriendlist", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "setClFriendlist", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "cvFriendlist", "Landroid/widget/FrameLayout;", "getCvFriendlist", "()Landroid/widget/FrameLayout;", "setCvFriendlist", "(Landroid/widget/FrameLayout;)V", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "presenter", "Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;)V", "reciprocalFriendListAdapter", "Lid/dana/social/adapter/ReciprocalFriendListAdapter;", "getReciprocalFriendListAdapter", "()Lid/dana/social/adapter/ReciprocalFriendListAdapter;", "setReciprocalFriendListAdapter", "(Lid/dana/social/adapter/ReciprocalFriendListAdapter;)V", "selectedRelationshipItemModel", "Lid/dana/social/model/RelationshipItemModel;", "forceFullscrenDialog", "", "getActiveReciprocal", "getBottomSheet", "getDimAmount", "", "getLayout", "", "goToRestrictedContactActivity", "init", "initBottomSheet", "peekHeight", "bottomSheetState", "initFetchingReciprocalProcess", "initInjection", "initRestrictedContactSettingButton", "initSearchListener", "initSearchView", "initiateFriendlistItems", "relationshipItemModelList", "", "modifyRelationship", "relationshipItemModel", "operationType", "Lid/dana/domain/social/ModifyRelationOperationType;", "modifyRelationshipCompleted", "onDismiss", "onResume", "onShow", "onStart", "openProfileActivity", "data", "(Lid/dana/social/model/RelationshipItemModel;)Lkotlin/Unit;", "setupAdapter", "setupBottomSheet", "setupReyclerView", "showErrorModifyRelationship", "showNegativeToast", "description", "", "showPositiveToast", "startLoading", "updateRelationshipStatus", "newStatus", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ReciprocalBottomSheetDialog extends order {
    @BindView(2131362436)
    public CoordinatorLayout clFriendlist;
    @BindView(2131362646)
    public FrameLayout cvFriendlist;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    public setAP getMax;
    /* access modifiers changed from: private */
    public RelationshipItemModel getMin = new RelationshipItemModel((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127);
    @Inject
    public getTitleText.getMin presenter;
    private HashMap toFloatRange;

    public final int getMin() {
        return R.layout.bottom_sheet_all_friend_list_coordinator;
    }

    public final float length() {
        return 0.0f;
    }

    public final View setMin(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    @NotNull
    public final FrameLayout getMax() {
        CoordinatorLayout coordinatorLayout = this.clFriendlist;
        if (coordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clFriendlist");
        }
        View findViewById = coordinatorLayout.findViewById(R.id.f41592131362646);
        Intrinsics.checkNotNullExpressionValue(findViewById, "clFriendlist.findViewById(R.id.cv_friend_list)");
        return (FrameLayout) findViewById;
    }

    public final void setMin() {
        super.setMin();
        setMin(9999, 3);
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
            view.post(new length(view, this, findViewById));
        }
    }

    public final void onResume() {
        super.onResume();
        getTitleText.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.getMin();
    }

    public final void IsOverlapping() {
        super.IsOverlapping();
        dismiss();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "id/dana/social/ReciprocalBottomSheetDialog$forceFullscrenDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements Runnable {
        final /* synthetic */ View getMax;
        final /* synthetic */ ReciprocalBottomSheetDialog setMax;
        final /* synthetic */ View setMin;

        length(View view, ReciprocalBottomSheetDialog reciprocalBottomSheetDialog, View view2) {
            this.setMin = view;
            this.setMax = reciprocalBottomSheetDialog;
            this.getMax = view2;
        }

        public final void run() {
            ViewParent parent = this.setMin.getParent();
            if (parent != null) {
                ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
                if (layoutParams != null) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.length) layoutParams).setMin;
                    if (behavior != null) {
                        ((BottomSheetBehavior) behavior).setPeekHeight(this.setMin.getMeasuredHeight());
                        View view = this.getMax;
                        ViewParent parent2 = view != null ? view.getParent() : null;
                        if (parent2 != null) {
                            ((View) parent2).setBackgroundColor(0);
                            CoordinatorLayout coordinatorLayout = this.setMax.clFriendlist;
                            if (coordinatorLayout == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("clFriendlist");
                            }
                            coordinatorLayout.setOnClickListener(new View.OnClickListener(this) {
                                final /* synthetic */ length length;

                                {
                                    this.length = r1;
                                }

                                public final void onClick(View view) {
                                    this.length.setMax.dismiss();
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

    public final void setMax() {
        EditText editText;
        super.setMax();
        BaseActivity baseActivity = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            RelationshipBottomSheetModule relationshipBottomSheetModule = new RelationshipBottomSheetModule(new getMax(this));
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            max.getMax = getActivity();
            Intrinsics.checkNotNullExpressionValue(new DeepLinkModule(max, (byte) 0), "DeepLinkModule.builder()…ctivity(activity).build()");
            new ServicesModule((style.getMin) new setMin());
            socialCommonComponent.getMax(relationshipBottomSheetModule).getMax(this);
        }
        BaseActivity baseActivity2 = this.setMax;
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        getTitleText.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getminArr[0] = getmin;
        baseActivity2.registerPresenter(getminArr);
        TypedValue typedValue = new TypedValue();
        BaseActivity baseActivity3 = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity3, "baseActivity");
        baseActivity3.getTheme().resolveAttribute(16843499, typedValue, true);
        int dimensionPixelSize = getResources().getDimensionPixelSize(typedValue.resourceId);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        BaseActivity baseActivity4 = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity4, "baseActivity");
        WindowManager windowManager = baseActivity4.getWindowManager();
        Intrinsics.checkNotNullExpressionValue(windowManager, "baseActivity.windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        FrameLayout frameLayout = this.cvFriendlist;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cvFriendlist");
        }
        frameLayout.getLayoutParams().height = i - dimensionPixelSize;
        FrameLayout frameLayout2 = this.cvFriendlist;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cvFriendlist");
        }
        frameLayout2.requestLayout();
        TextView textView = (TextView) setMin(resetInternal.setMax.BrowserActionsIntent$BrowserActionsItemId);
        if (textView != null) {
            textView.setOnClickListener(new getMin(this));
        }
        this.getMax = new setAP(new isInside(this));
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.getAutoSizeStepGranularity);
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            setAP setap = this.getMax;
            if (setap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reciprocalFriendListAdapter");
            }
            recyclerView.setAdapter(setap);
            recyclerView.addItemDecoration(new setShadowResourceRight(recyclerView.getContext(), IntRange.setMax(recyclerView.getContext(), R.color.f20352131099947), (float) ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)), (byte) 0));
        }
        getTitleText.getMin getmin2 = this.presenter;
        if (getmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin2.length();
        ConstraintLayout constraintLayout = (ConstraintLayout) setMin(resetInternal.setMax.setHeaderView);
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        SearchView searchView = (SearchView) setMin(resetInternal.setMax.consumeTextFutureAndSetBlocking);
        if (searchView != null) {
            searchView.setSearchHint(getString(R.string.search_reciprocal));
        }
        getTitleText.getMin getmin3 = this.presenter;
        if (getmin3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        SearchView searchView2 = (SearchView) setMin(resetInternal.setMax.consumeTextFutureAndSetBlocking);
        Intrinsics.checkNotNullExpressionValue(searchView2, "sv_friend_list_search");
        IComponent<String> keyword = searchView2.getKeyword();
        Intrinsics.checkNotNullExpressionValue(keyword, "sv_friend_list_search.keyword");
        getmin3.getMax(keyword);
        SearchView searchView3 = (SearchView) setMin(resetInternal.setMax.consumeTextFutureAndSetBlocking);
        if (searchView3 != null && (editText = searchView3.getEditText()) != null) {
            editText.setOnFocusChangeListener(new setMax(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u0010"}, d2 = {"id/dana/social/ReciprocalBottomSheetDialog$initInjection$1", "Lid/dana/social/contract/RelationshipBottomSheetContract$View;", "onGetProfileSettingModelFail", "", "onGetProfileSettingModelSuccess", "setting", "Lid/dana/domain/profilemenu/model/SettingModel;", "onGetReciprocalItem", "relationshipItemModelList", "", "Lid/dana/social/model/RelationshipItemModel;", "onModifyRelationshipFailed", "onModifyRelationshipSuccess", "operationType", "Lid/dana/domain/social/ModifyRelationOperationType;", "updateReciprocalList", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements getTitleText.length {
        final /* synthetic */ ReciprocalBottomSheetDialog getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void setMin(boolean z) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog) {
            this.getMax = reciprocalBottomSheetDialog;
        }

        public final void getMax(@NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(settingModel, "setting");
            ReciprocalBottomSheetDialog.getMin(this.getMax);
        }

        public final void getMin() {
            Toast.makeText(this.getMax.getActivity(), this.getMax.setMax.getString(R.string.general_error_msg), 0).show();
        }

        public final void getMin(@NotNull List<RelationshipItemModel> list) {
            Intrinsics.checkNotNullParameter(list, "relationshipItemModelList");
            ReciprocalBottomSheetDialog.setMax(this.getMax, list);
        }

        public final void length(@NotNull List<RelationshipItemModel> list) {
            Intrinsics.checkNotNullParameter(list, "relationshipItemModelList");
            setAP setap = this.getMax.getMax;
            if (setap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reciprocalFriendListAdapter");
            }
            setap.getMin(list);
        }

        public final void length(@NotNull ModifyRelationOperationType modifyRelationOperationType) {
            Intrinsics.checkNotNullParameter(modifyRelationOperationType, "operationType");
            ReciprocalBottomSheetDialog.length(this.getMax, modifyRelationOperationType);
        }

        public final void setMin() {
            ReciprocalBottomSheetDialog.length(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/social/ReciprocalBottomSheetDialog$initInjection$2", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000f"}, d2 = {"id/dana/social/ReciprocalBottomSheetDialog$setupAdapter$1", "Lid/dana/social/adapter/FriendshipListInteraction;", "activeButtonText", "", "getActiveButtonText", "()Ljava/lang/String;", "inactiveButtonText", "getInactiveButtonText", "onFriendInfoClick", "", "position", "", "onModifyRelationshipPopUpClick", "operationType", "Lid/dana/domain/social/ModifyRelationOperationType;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements getAuthCodeForSecurityGuard {
        final /* synthetic */ ReciprocalBottomSheetDialog getMax;
        @NotNull
        private final String getMin = "";
        @NotNull
        private final String length = "";

        public final void getMin(int i) {
        }

        isInside(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog) {
            this.getMax = reciprocalBottomSheetDialog;
        }

        @NotNull
        public final String length() {
            return this.getMin;
        }

        @NotNull
        public final String getMax() {
            return this.length;
        }

        public final void getMax(int i) {
            setAP setap = this.getMax.getMax;
            if (setap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reciprocalFriendListAdapter");
            }
            RelationshipItemModel relationshipItemModel = (RelationshipItemModel) setap.setMin(i);
            if (relationshipItemModel != null) {
                ReciprocalBottomSheetDialog.getMax(this.getMax, relationshipItemModel);
            }
        }

        public final void getMin(int i, @NotNull ModifyRelationOperationType modifyRelationOperationType) {
            Intrinsics.checkNotNullParameter(modifyRelationOperationType, "operationType");
            setAP setap = this.getMax.getMax;
            if (setap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reciprocalFriendListAdapter");
            }
            RelationshipItemModel relationshipItemModel = (RelationshipItemModel) setap.setMin(i);
            ReciprocalBottomSheetDialog reciprocalBottomSheetDialog = this.getMax;
            Intrinsics.checkNotNullExpressionValue(relationshipItemModel, "relationshipItemModel");
            reciprocalBottomSheetDialog.getMin = relationshipItemModel;
            ReciprocalBottomSheetDialog.setMax(this.getMax, relationshipItemModel, modifyRelationOperationType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ ReciprocalBottomSheetDialog setMin;

        getMin(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog) {
            this.setMin = reciprocalBottomSheetDialog;
        }

        public final void onClick(View view) {
            getTitleText.getMin getmin = this.setMin.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin.getMax(MyProfileMenuAction.SETTING_RESTRICTED_CONTACT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnFocusChangeListener {
        final /* synthetic */ ReciprocalBottomSheetDialog length;

        setMax(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog) {
            this.length = reciprocalBottomSheetDialog;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                LinearLayout linearLayout = (LinearLayout) this.length.setMin(resetInternal.setMax.onItemsChanged);
                if (linearLayout != null) {
                    View view2 = linearLayout;
                    Intrinsics.checkNotNullParameter(view2, "<this>");
                    view2.setVisibility(0);
                    return;
                }
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) this.length.setMin(resetInternal.setMax.onItemsChanged);
            if (linearLayout2 != null) {
                View view3 = linearLayout2;
                Intrinsics.checkNotNullParameter(view3, "<this>");
                view3.setVisibility(8);
            }
            setOnWheelViewListener.getMax((Activity) this.length.setMax);
        }
    }

    public static final /* synthetic */ void getMin(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog) {
        Context context = reciprocalBottomSheetDialog.getContext();
        if (context != null) {
            reciprocalBottomSheetDialog.startActivity(new Intent(context, RestrictedContactActivity.class));
        }
    }

    public static final /* synthetic */ void setMax(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog, List list) {
        if (!list.isEmpty()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) reciprocalBottomSheetDialog.setMin(resetInternal.setMax.setHeaderView);
            if (constraintLayout != null) {
                View view = constraintLayout;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(8);
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) reciprocalBottomSheetDialog.setMin(resetInternal.setMax.setHeaderView);
            if (constraintLayout2 != null) {
                View view2 = constraintLayout2;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(8);
            }
            RecyclerView recyclerView = (RecyclerView) reciprocalBottomSheetDialog.setMin(resetInternal.setMax.getAutoSizeStepGranularity);
            if (recyclerView != null) {
                View view3 = recyclerView;
                Intrinsics.checkNotNullParameter(view3, "<this>");
                view3.setVisibility(0);
            }
            setAP setap = reciprocalBottomSheetDialog.getMax;
            if (setap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reciprocalFriendListAdapter");
            }
            setap.getMin(list);
        }
    }

    public static final /* synthetic */ void length(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog, ModifyRelationOperationType modifyRelationOperationType) {
        int i = getOpenId.length[modifyRelationOperationType.ordinal()];
        if (i == 1) {
            String string = reciprocalBottomSheetDialog.getString(R.string.friendship_block, reciprocalBottomSheetDialog.getMin.getMin);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.frien…onshipItemModel.nickName)");
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
            BaseActivity baseActivity = reciprocalBottomSheetDialog.setMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            SwipeRefreshLayout.length(baseActivity, R.drawable.ic_warning_24_yellow50, R.drawable.bg_rounded_border_yellow_50, string);
            RelationshipItemModel relationshipItemModel = reciprocalBottomSheetDialog.getMin;
            setAP setap = reciprocalBottomSheetDialog.getMax;
            if (setap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reciprocalFriendListAdapter");
            }
            setap.length(relationshipItemModel, "BLOCKING");
            AUHorizontalListView.SelectionNotifier selectionNotifier = reciprocalBottomSheetDialog.friendshipAnalyticTracker;
            if (selectionNotifier == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
            }
            selectionNotifier.getMin("INACTIVE");
        } else if (i != 2) {
            AUHorizontalListView.SelectionNotifier selectionNotifier2 = reciprocalBottomSheetDialog.friendshipAnalyticTracker;
            if (selectionNotifier2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
            }
            selectionNotifier2.getMax("ACTIVE");
            String string2 = reciprocalBottomSheetDialog.getString(R.string.friendship_unmute, reciprocalBottomSheetDialog.getMin.getMin);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.frien…onshipItemModel.nickName)");
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.setMax;
            BaseActivity baseActivity2 = reciprocalBottomSheetDialog.setMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
            SwipeRefreshLayout.length(baseActivity2, R.drawable.ic_check_24_green50_filled_circle, R.drawable.bg_rounded_border_green_50, string2);
        } else {
            AUHorizontalListView.SelectionNotifier selectionNotifier3 = reciprocalBottomSheetDialog.friendshipAnalyticTracker;
            if (selectionNotifier3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
            }
            selectionNotifier3.getMax("INACTIVE");
            String string3 = reciprocalBottomSheetDialog.getString(R.string.friendship_mute, reciprocalBottomSheetDialog.getMin.getMin);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.frien…onshipItemModel.nickName)");
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.setMax;
            BaseActivity baseActivity3 = reciprocalBottomSheetDialog.setMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity3, "baseActivity");
            SwipeRefreshLayout.length(baseActivity3, R.drawable.ic_warning_24_yellow50, R.drawable.bg_rounded_border_yellow_50, string3);
        }
    }

    public static final /* synthetic */ void length(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog) {
        SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
        BaseActivity baseActivity = reciprocalBottomSheetDialog.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        String string = reciprocalBottomSheetDialog.getString(R.string.modify_relationship_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.modify_relationship_error)");
        SwipeRefreshLayout.length(baseActivity, R.drawable.ic_close_red, R.drawable.bg_rounded_border_red_50, string);
    }

    public static final /* synthetic */ Unit getMax(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog, RelationshipItemModel relationshipItemModel) {
        Context context = reciprocalBottomSheetDialog.getContext();
        if (context == null) {
            return null;
        }
        SocialProfileActivity.getMin getmin = SocialProfileActivity.Companion;
        Intrinsics.checkNotNullExpressionValue(context, "it");
        SocialProfileActivity.getMin.setMin(context, relationshipItemModel);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void setMax(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog, RelationshipItemModel relationshipItemModel, ModifyRelationOperationType modifyRelationOperationType) {
        if (modifyRelationOperationType == ModifyRelationOperationType.MUTE) {
            setAP setap = reciprocalBottomSheetDialog.getMax;
            if (setap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reciprocalFriendListAdapter");
            }
            setap.length(relationshipItemModel, "MUTE");
        } else if (modifyRelationOperationType == ModifyRelationOperationType.UNMUTE) {
            setAP setap2 = reciprocalBottomSheetDialog.getMax;
            if (setap2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reciprocalFriendListAdapter");
            }
            setap2.length(relationshipItemModel, "ACTIVE");
        }
        getTitleText.getMin getmin = reciprocalBottomSheetDialog.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.setMax(relationshipItemModel.length, modifyRelationOperationType);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
