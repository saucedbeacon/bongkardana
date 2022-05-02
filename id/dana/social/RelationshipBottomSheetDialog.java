package id.dana.social;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.model.ThirdPartyService;
import id.dana.myprofile.MyProfileBundleKey;
import id.dana.myprofile.SettingMoreProfileActivity;
import id.dana.social.base.FriendshipListBaseFragment;
import id.dana.social.model.RelationshipItemModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.connectSocket;
import o.dispatchOnCancelled;
import o.getButtonItem;
import o.getTitleText;
import o.onCancelLoad;
import o.onCanceled;
import o.order;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 A2\u00020\u0001:\u0001AB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020+H\u0002J\n\u0010,\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u000200H\u0014J\u0010\u00101\u001a\u00020+2\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020+H\u0014J\u0018\u00105\u001a\u00020+2\u0006\u00106\u001a\u0002002\u0006\u00107\u001a\u000200H\u0014J\b\u00108\u001a\u00020+H\u0002J\b\u00109\u001a\u00020+H\u0002J\b\u0010:\u001a\u00020+H\u0014J\b\u0010;\u001a\u00020+H\u0014J\b\u0010<\u001a\u00020+H\u0016J\b\u0010=\u001a\u00020+H\u0002J\u0010\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020@H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006B"}, d2 = {"Lid/dana/social/RelationshipBottomSheetDialog;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "clFriendship", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getClFriendship", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "setClFriendship", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "cvFriendship", "Landroid/widget/FrameLayout;", "getCvFriendship", "()Landroid/widget/FrameLayout;", "setCvFriendship", "(Landroid/widget/FrameLayout;)V", "friendshipViewPagerAdapter", "Lid/dana/social/adapter/FriendshipViewPagerAdapter;", "modifyRelationshipSnackbar", "Lid/dana/social/view/ModifyRelationshipSnackbar;", "presenter", "Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;)V", "rbFollower", "Landroid/widget/RadioButton;", "getRbFollower", "()Landroid/widget/RadioButton;", "setRbFollower", "(Landroid/widget/RadioButton;)V", "rbFollowing", "getRbFollowing", "setRbFollowing", "vpFriendship", "Landroidx/viewpager/widget/ViewPager;", "getVpFriendship", "()Landroidx/viewpager/widget/ViewPager;", "setVpFriendship", "(Landroidx/viewpager/widget/ViewPager;)V", "createOnTapInterfaceInstance", "Lid/dana/social/base/FriendshipListBaseFragment$ShowSnackbarInterface;", "forceFullscrenDialog", "", "getBottomSheet", "getDimAmount", "", "getLayout", "", "goToProfileActivity", "setting", "Lid/dana/domain/profilemenu/model/SettingModel;", "init", "initBottomSheet", "peekHeight", "bottomSheetState", "initInjection", "initOnRestrictedContactButton", "onDismiss", "onShow", "onStart", "setupFriendshipViewPager", "showCustomSnackbar", "description", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RelationshipBottomSheetDialog extends order {
    @NotNull
    public static final length getMax = new length((byte) 0);
    private getButtonItem IsOverlapping;
    @BindView(2131362438)
    public CoordinatorLayout clFriendship;
    @BindView(2131362647)
    public FrameLayout cvFriendship;
    private connectSocket getMin;
    @Inject
    public getTitleText.getMin presenter;
    @BindView(2131364321)
    public RadioButton rbFollower;
    @BindView(2131364322)
    public RadioButton rbFollowing;
    private HashMap toFloatRange;
    @BindView(2131366003)
    public ViewPager vpFriendship;

    public final int getMin() {
        return R.layout.bottom_sheet_friend_list_coordinator;
    }

    public final float length() {
        return 0.0f;
    }

    public static final /* synthetic */ getButtonItem setMax(RelationshipBottomSheetDialog relationshipBottomSheetDialog) {
        getButtonItem getbuttonitem = relationshipBottomSheetDialog.IsOverlapping;
        if (getbuttonitem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("modifyRelationshipSnackbar");
        }
        return getbuttonitem;
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

    @Nullable
    public final FrameLayout getMax() {
        CoordinatorLayout coordinatorLayout = this.clFriendship;
        if (coordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clFriendship");
        }
        if (coordinatorLayout != null) {
            return (FrameLayout) coordinatorLayout.findViewById(R.id.f41602131362647);
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"id/dana/social/RelationshipBottomSheetDialog$setupFriendshipViewPager$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements ViewPager.setMax {
        final /* synthetic */ RelationshipBottomSheetDialog setMax;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        toIntRange(RelationshipBottomSheetDialog relationshipBottomSheetDialog) {
            this.setMax = relationshipBottomSheetDialog;
        }

        public final void onPageSelected(int i) {
            if (i == 0) {
                RadioButton radioButton = this.setMax.rbFollower;
                if (radioButton == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rbFollower");
                }
                if (radioButton.isChecked()) {
                    RadioButton radioButton2 = this.setMax.rbFollowing;
                    if (radioButton2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rbFollowing");
                    }
                    radioButton2.setChecked(true);
                    return;
                }
            }
            if (i == 1) {
                RadioButton radioButton3 = this.setMax.rbFollowing;
                if (radioButton3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rbFollowing");
                }
                if (radioButton3.isChecked()) {
                    RadioButton radioButton4 = this.setMax.rbFollower;
                    if (radioButton4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rbFollower");
                    }
                    radioButton4.setChecked(true);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "b", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ RelationshipBottomSheetDialog length;

        IsOverlapping(RelationshipBottomSheetDialog relationshipBottomSheetDialog) {
            this.length = relationshipBottomSheetDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                ViewPager viewPager = this.length.vpFriendship;
                if (viewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vpFriendship");
                }
                if (viewPager.getCurrentItem() == 1) {
                    ViewPager viewPager2 = this.length.vpFriendship;
                    if (viewPager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vpFriendship");
                    }
                    viewPager2.setCurrentItem(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "b", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ RelationshipBottomSheetDialog setMax;

        isInside(RelationshipBottomSheetDialog relationshipBottomSheetDialog) {
            this.setMax = relationshipBottomSheetDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                ViewPager viewPager = this.setMax.vpFriendship;
                if (viewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vpFriendship");
                }
                if (viewPager.getCurrentItem() == 0) {
                    ViewPager viewPager2 = this.setMax.vpFriendship;
                    if (viewPager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vpFriendship");
                    }
                    viewPager2.setCurrentItem(1);
                }
            }
        }
    }

    public final void setMin() {
        super.setMin();
        setMin(9999, 3);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        this.getMin = new connectSocket(childFragmentManager, new setMax(this));
        ViewPager viewPager = this.vpFriendship;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vpFriendship");
        }
        connectSocket connectsocket = this.getMin;
        if (connectsocket == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipViewPagerAdapter");
        }
        viewPager.setAdapter(connectsocket);
        ViewPager viewPager2 = this.vpFriendship;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vpFriendship");
        }
        viewPager2.addOnPageChangeListener(new toIntRange(this));
        RadioButton radioButton = this.rbFollowing;
        if (radioButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rbFollowing");
        }
        radioButton.setOnCheckedChangeListener(new IsOverlapping(this));
        RadioButton radioButton2 = this.rbFollower;
        if (radioButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rbFollower");
        }
        radioButton2.setOnCheckedChangeListener(new isInside(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/RelationshipBottomSheetDialog$createOnTapInterfaceInstance$1", "Lid/dana/social/base/FriendshipListBaseFragment$ShowSnackbarInterface;", "showSnackbar", "", "description", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements FriendshipListBaseFragment.getMax {
        final /* synthetic */ RelationshipBottomSheetDialog getMin;

        setMax(RelationshipBottomSheetDialog relationshipBottomSheetDialog) {
            this.getMin = relationshipBottomSheetDialog;
        }

        public final void getMax(@NotNull String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-1328930756, oncanceled);
                onCancelLoad.getMin(-1328930756, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "description");
            RelationshipBottomSheetDialog.getMax(this.getMin, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/RelationshipBottomSheetDialog$showCustomSnackbar$1$1$1", "id/dana/social/RelationshipBottomSheetDialog$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ String length;
        final /* synthetic */ RelationshipBottomSheetDialog setMin;

        equals(RelationshipBottomSheetDialog relationshipBottomSheetDialog, String str) {
            this.setMin = relationshipBottomSheetDialog;
            this.length = str;
        }

        public final void onClick(View view) {
            RelationshipBottomSheetDialog.setMax(this.setMin).dismiss();
        }
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
            view.post(new getMin(view, this, findViewById));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "id/dana/social/RelationshipBottomSheetDialog$forceFullscrenDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements Runnable {
        final /* synthetic */ RelationshipBottomSheetDialog getMax;
        final /* synthetic */ View length;
        final /* synthetic */ View setMin;

        getMin(View view, RelationshipBottomSheetDialog relationshipBottomSheetDialog, View view2) {
            this.setMin = view;
            this.getMax = relationshipBottomSheetDialog;
            this.length = view2;
        }

        public final void run() {
            ViewParent parent = this.setMin.getParent();
            if (parent != null) {
                ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
                if (layoutParams != null) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.length) layoutParams).setMin;
                    if (behavior != null) {
                        ((BottomSheetBehavior) behavior).setPeekHeight(this.setMin.getMeasuredHeight());
                        View view = this.length;
                        ViewParent parent2 = view != null ? view.getParent() : null;
                        if (parent2 != null) {
                            ((View) parent2).setBackgroundColor(0);
                            CoordinatorLayout coordinatorLayout = this.getMax.clFriendship;
                            if (coordinatorLayout == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("clFriendship");
                            }
                            if (coordinatorLayout != null) {
                                coordinatorLayout.setOnClickListener(new View.OnClickListener(this) {
                                    final /* synthetic */ getMin setMax;

                                    {
                                        this.setMax = r1;
                                    }

                                    public final void onClick(View view) {
                                        this.setMax.getMax.dismiss();
                                    }
                                });
                                return;
                            }
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

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax() {
        /*
            r7 = this;
            super.setMax()
            id.dana.base.BaseActivity r0 = r7.setMax
            java.lang.String r1 = "baseActivity"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            id.dana.DanaApplication r0 = r0.getDanaApplication()
            java.lang.String r2 = "baseActivity.danaApplication"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            o.AUPopSupportPreemption r0 = r0.getSocialCommonComponent()
            r2 = 0
            if (r0 == 0) goto L_0x004f
            id.dana.social.di.module.RelationshipBottomSheetModule r3 = new id.dana.social.di.module.RelationshipBottomSheetModule
            id.dana.social.RelationshipBottomSheetDialog$getMax r4 = new id.dana.social.RelationshipBottomSheetDialog$getMax
            r4.<init>(r7)
            o.getTitleText$length r4 = (o.getTitleText.length) r4
            r3.<init>(r4)
            id.dana.contract.deeplink.DeepLinkModule$setMin r4 = id.dana.contract.deeplink.DeepLinkModule.getMax()
            androidx.fragment.app.FragmentActivity r5 = r7.getActivity()
            android.app.Activity r5 = (android.app.Activity) r5
            r4.getMax = r5
            id.dana.contract.deeplink.DeepLinkModule r5 = new id.dana.contract.deeplink.DeepLinkModule
            r5.<init>(r4, r2)
            java.lang.String r4 = "DeepLinkModule.builder()…ctivity(activity).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            id.dana.contract.services.ServicesModule r4 = new id.dana.contract.services.ServicesModule
            id.dana.social.RelationshipBottomSheetDialog$setMin r5 = new id.dana.social.RelationshipBottomSheetDialog$setMin
            r5.<init>()
            o.style$getMin r5 = (o.style.getMin) r5
            r4.<init>((o.style.getMin) r5)
            o.dismissPop r0 = r0.getMax((id.dana.social.di.module.RelationshipBottomSheetModule) r3)
            r0.getMax((id.dana.social.RelationshipBottomSheetDialog) r7)
        L_0x004f:
            id.dana.base.BaseActivity r0 = r7.setMax
            r3 = 1
            o.onDelete$getMin[] r4 = new o.onDelete.getMin[r3]
            o.getTitleText$getMin r5 = r7.presenter
            if (r5 != 0) goto L_0x005d
            java.lang.String r6 = "presenter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x005d:
            o.onDelete$getMin r5 = (o.onDelete.getMin) r5
            r4[r2] = r5
            r0.registerPresenter(r4)
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            id.dana.base.BaseActivity r2 = r7.setMax
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r4 = 16843499(0x10102eb, float:2.3695652E-38)
            r2.resolveAttribute(r4, r0, r3)
            android.content.res.Resources r2 = r7.getResources()
            int r0 = r0.resourceId
            int r0 = r2.getDimensionPixelSize(r0)
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics
            r2.<init>()
            id.dana.base.BaseActivity r3 = r7.setMax
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            android.view.WindowManager r1 = r3.getWindowManager()
            java.lang.String r3 = "baseActivity.windowManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r2)
            int r1 = r2.heightPixels
            android.widget.FrameLayout r2 = r7.cvFriendship
            java.lang.String r3 = "cvFriendship"
            if (r2 != 0) goto L_0x00a7
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00a7:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r1 = r1 - r0
            r2.height = r1
            android.widget.FrameLayout r0 = r7.cvFriendship
            if (r0 != 0) goto L_0x00b5
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00b5:
            r0.requestLayout()
            int r0 = o.resetInternal.setMax.MediaBrowserCompat$CustomActionResultReceiver
            java.util.HashMap r1 = r7.toFloatRange
            if (r1 != 0) goto L_0x00c5
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r7.toFloatRange = r1
        L_0x00c5:
            java.util.HashMap r1 = r7.toFloatRange
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L_0x00e8
            android.view.View r1 = r7.getView()
            if (r1 != 0) goto L_0x00db
            r0 = 0
            goto L_0x00e9
        L_0x00db:
            android.view.View r1 = r1.findViewById(r0)
            java.util.HashMap r2 = r7.toFloatRange
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r0, r1)
        L_0x00e8:
            r0 = r1
        L_0x00e9:
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            if (r0 == 0) goto L_0x00f7
            id.dana.social.RelationshipBottomSheetDialog$toFloatRange r1 = new id.dana.social.RelationshipBottomSheetDialog$toFloatRange
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.RelationshipBottomSheetDialog.setMax():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"id/dana/social/RelationshipBottomSheetDialog$initInjection$1", "Lid/dana/social/contract/RelationshipBottomSheetContract$View;", "onGetFeedInboxTabEnableSuccess", "", "enable", "", "onGetProfileSettingModelFail", "onGetProfileSettingModelSuccess", "setting", "Lid/dana/domain/profilemenu/model/SettingModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements getTitleText.length {
        final /* synthetic */ RelationshipBottomSheetDialog setMax;

        @JvmDefault
        public final void dismissProgress() {
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

        public final void setMin(boolean z) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(RelationshipBottomSheetDialog relationshipBottomSheetDialog) {
            this.setMax = relationshipBottomSheetDialog;
        }

        public final void getMax(@NotNull SettingModel settingModel) {
            Intrinsics.checkNotNullParameter(settingModel, "setting");
            RelationshipBottomSheetDialog.getMax(this.setMax, settingModel);
        }

        public final void getMin() {
            Toast.makeText(this.setMax.getActivity(), this.setMax.setMax.getString(R.string.general_error_msg), 0).show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/social/RelationshipBottomSheetDialog$initInjection$2", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ RelationshipBottomSheetDialog setMin;

        toFloatRange(RelationshipBottomSheetDialog relationshipBottomSheetDialog) {
            this.setMin = relationshipBottomSheetDialog;
        }

        public final void onClick(View view) {
            getTitleText.getMin getmin = this.setMin.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin.getMax("setting_more");
        }
    }

    public final void IsOverlapping() {
        super.IsOverlapping();
        dismiss();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/social/RelationshipBottomSheetDialog$Companion;", "", "()V", "DEFAULT_SNACKBAR_DURATION", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void getMax(RelationshipBottomSheetDialog relationshipBottomSheetDialog, String str) {
        CoordinatorLayout coordinatorLayout = relationshipBottomSheetDialog.clFriendship;
        if (coordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clFriendship");
        }
        KeyEvent.Callback callback = null;
        FrameLayout frameLayout = coordinatorLayout != null ? (FrameLayout) coordinatorLayout.findViewById(R.id.f41602131362647) : null;
        KeyEvent.Callback rootView = frameLayout != null ? frameLayout.getRootView() : null;
        if (rootView instanceof ViewGroup) {
            callback = rootView;
        }
        ViewGroup viewGroup = (ViewGroup) callback;
        if (viewGroup != null) {
            getButtonItem.setMin setmin = new getButtonItem.setMin(viewGroup);
            View.OnClickListener equals2 = new equals(relationshipBottomSheetDialog, str);
            Intrinsics.checkNotNullParameter(equals2, "<set-?>");
            setmin.getMin = equals2;
            String string = relationshipBottomSheetDialog.getString(R.string.dismiss_friendship);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.dismiss_friendship)");
            Intrinsics.checkNotNullParameter(string, "<set-?>");
            setmin.setMax = string;
            setmin.equals = 5000;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            setmin.length = str;
            Unit unit = Unit.INSTANCE;
            View inflate = LayoutInflater.from(setmin.toFloatRange.getContext()).inflate(setmin.setMin, setmin.toFloatRange, false);
            ViewGroup viewGroup2 = setmin.toFloatRange;
            Intrinsics.checkNotNullExpressionValue(inflate, "content");
            getButtonItem getbuttonitem = new getButtonItem(viewGroup2, inflate, new getButtonItem.getMax(inflate), setmin, (byte) 0);
            relationshipBottomSheetDialog.IsOverlapping = getbuttonitem;
            if (getbuttonitem == null) {
                Intrinsics.throwUninitializedPropertyAccessException("modifyRelationshipSnackbar");
            }
            getbuttonitem.show();
        }
    }

    public static final /* synthetic */ void getMax(RelationshipBottomSheetDialog relationshipBottomSheetDialog, SettingModel settingModel) {
        Context context = relationshipBottomSheetDialog.getContext();
        if (context != null) {
            Intent intent = new Intent(context, SettingMoreProfileActivity.class);
            intent.putExtra(MyProfileBundleKey.SETTING_MODEL, settingModel);
            relationshipBottomSheetDialog.startActivity(intent);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
