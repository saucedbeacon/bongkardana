package id.dana.nearbyme.homeshopping.tutorial;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.nearbyme.di.module.NearbyTrackerModule;
import id.dana.nearbyme.homeshopping.model.HomeShoppingModel;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverUcServiceProxy;
import o.PrepareException;
import o.getProgressViewStartOffset;
import o.resetInternal;
import o.setSubmitText;
import o.startBeaconDiscovery;
import o.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0011J\b\u0010 \u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\n\u0010#\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006%"}, d2 = {"Lid/dana/nearbyme/homeshopping/tutorial/HomeShoppingTutorialFragment;", "Landroidx/fragment/app/Fragment;", "()V", "homeShoppingModel", "Lid/dana/nearbyme/homeshopping/model/HomeShoppingModel;", "nearbyAnalyticTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "getNearbyAnalyticTracker", "()Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "setNearbyAnalyticTracker", "(Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;)V", "animateScrollDown", "", "()Ljava/lang/Boolean;", "animateScrollUp", "", "fetchModel", "()Lkotlin/Unit;", "hidePayTutorial", "inject", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "renderOfficeNumber", "setupClickListeners", "showAboutDialog", "showPayTutorial", "togglePayTutorialVisibility", "trackButtonOrder", "updateHeight", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class HomeShoppingTutorialFragment extends Fragment {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);
    private HashMap getMax;
    @Inject
    public t nearbyAnalyticTracker;
    private HomeShoppingModel setMax;

    public final View setMin(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<View, Unit> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(1);
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ HomeShoppingModel setMax(HomeShoppingTutorialFragment homeShoppingTutorialFragment) {
        HomeShoppingModel homeShoppingModel = homeShoppingTutorialFragment.setMax;
        if (homeShoppingModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeShoppingModel");
        }
        return homeShoppingModel;
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_home_shopping_tutorial, viewGroup, false);
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        HomeShoppingModel homeShoppingModel;
        super.onActivityCreated(bundle);
        Context context = getContext();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext instanceof DanaApplication)) {
            applicationContext = null;
        }
        DanaApplication danaApplication = (DanaApplication) applicationContext;
        if (danaApplication != null) {
            GriverUcServiceProxy.getMin getmin = new GriverUcServiceProxy.getMin((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = danaApplication.getApplicationComponent();
            if (applicationComponent != null) {
                getmin.getMin = applicationComponent;
                getmin.length = new NearbyTrackerModule();
                getmin.getMin().length(this);
            } else {
                throw null;
            }
        }
        Bundle arguments = getArguments();
        if (!(arguments == null || (homeShoppingModel = (HomeShoppingModel) arguments.getParcelable("HOME_SHOPPING_TUTORIAL_DATA_KEY")) == null)) {
            Intrinsics.checkNotNullExpressionValue(homeShoppingModel, "it");
            this.setMax = homeShoppingModel;
            Unit unit = Unit.INSTANCE;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) setMin(resetInternal.setMax.getCurrentContentInsetRight);
        if (appCompatTextView != null) {
            HomeShoppingModel homeShoppingModel2 = this.setMax;
            if (homeShoppingModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeShoppingModel");
            }
            appCompatTextView.setText(setSubmitText.setMin(homeShoppingModel2.toFloatRange));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) setMin(resetInternal.setMax.getChangingConfigurations);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new getMin(this));
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) setMin(resetInternal.setMax.invokeItem);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new setMax(this));
        }
        AppCompatButton appCompatButton = (AppCompatButton) setMin(resetInternal.setMax.notify);
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(new equals(this));
        }
        View view = getView();
        if (view != null) {
            view.post(new isInside(view));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ HomeShoppingTutorialFragment getMax;

        getMin(HomeShoppingTutorialFragment homeShoppingTutorialFragment) {
            this.getMax = homeShoppingTutorialFragment;
        }

        public final void onClick(View view) {
            HomeShoppingTutorialFragment.setMin(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ HomeShoppingTutorialFragment setMax;

        setMax(HomeShoppingTutorialFragment homeShoppingTutorialFragment) {
            this.setMax = homeShoppingTutorialFragment;
        }

        public final void onClick(View view) {
            HomeShoppingTutorialFragment.getMin(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ HomeShoppingTutorialFragment getMax;

        equals(HomeShoppingTutorialFragment homeShoppingTutorialFragment) {
            this.getMax = homeShoppingTutorialFragment;
        }

        public final void onClick(View view) {
            HomeShoppingTutorialFragment.length(this.getMax);
            Context context = this.getMax.getContext();
            if (context != null) {
                startBeaconDiscovery.getMin(context, HomeShoppingTutorialFragment.setMax(this.getMax).toFloatRange, "");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements Runnable {
        final /* synthetic */ View setMax;

        isInside(View view) {
            this.setMax = view;
        }

        public final void run() {
            this.setMax.getLayoutParams().height = this.setMax.getMeasuredHeight();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class length implements Runnable {
        final /* synthetic */ HomeShoppingTutorialFragment getMin;

        length(HomeShoppingTutorialFragment homeShoppingTutorialFragment) {
            this.getMin = homeShoppingTutorialFragment;
        }

        public final void run() {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin.setMin(resetInternal.setMax.removeOnContextAvailableListener);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements Runnable {
        final /* synthetic */ HomeShoppingTutorialFragment length;

        getMax(HomeShoppingTutorialFragment homeShoppingTutorialFragment) {
            this.length = homeShoppingTutorialFragment;
        }

        public final void run() {
            NestedScrollView nestedScrollView = (NestedScrollView) this.length.setMin(resetInternal.setMax.closeMode);
            if (nestedScrollView != null) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.length.setMin(resetInternal.setMax.measureChildConstrained);
                nestedScrollView.smoothScrollTo(0, appCompatTextView != null ? appCompatTextView.getTop() : 0, 300);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyme/homeshopping/tutorial/HomeShoppingTutorialFragment$Companion;", "", "()V", "SMOOTH_SCROLL_DURATION", "", "TUTORIAL_DATA_KEY", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ Unit setMin(HomeShoppingTutorialFragment homeShoppingTutorialFragment) {
        Context context;
        FragmentActivity activity = homeShoppingTutorialFragment.getActivity();
        if (activity == null || activity.getSupportFragmentManager() == null || (context = homeShoppingTutorialFragment.getContext()) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(context);
        getmax.setMax = R.drawable.ic_qris;
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.toFloatRange = homeShoppingTutorialFragment.getString(R.string.home_shopping_about_qris_title);
        getProgressViewStartOffset.getMax getmax3 = getmax2;
        getmax3.isInside = homeShoppingTutorialFragment.getString(R.string.home_shopping_about_qris_body);
        getProgressViewStartOffset.getMax getmax4 = getmax3;
        getmax4.toIntRange = 0;
        getProgressViewStartOffset.getMax min = getmax4.setMin(homeShoppingTutorialFragment.getString(R.string.home_shopping_about_qris_button), toFloatRange.INSTANCE);
        new getProgressViewStartOffset(min.invoke, min.length, min, min.equals, (byte) 0).getMin().show();
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void getMin(HomeShoppingTutorialFragment homeShoppingTutorialFragment) {
        ConstraintLayout constraintLayout = (ConstraintLayout) homeShoppingTutorialFragment.setMin(resetInternal.setMax.removeOnContextAvailableListener);
        if (constraintLayout != null) {
            Integer valueOf = Integer.valueOf(constraintLayout.getVisibility());
            if (!(valueOf.intValue() == 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) homeShoppingTutorialFragment.setMin(resetInternal.setMax.closeMode);
                if (nestedScrollView != null) {
                    nestedScrollView.smoothScrollTo(0, 0, 300);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) homeShoppingTutorialFragment.setMin(resetInternal.setMax.invokeItem);
                if (appCompatImageView != null) {
                    appCompatImageView.setImageResource(R.drawable.ic_down_chevron);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) homeShoppingTutorialFragment.setMin(resetInternal.setMax.removeOnContextAvailableListener);
                if (constraintLayout2 != null) {
                    constraintLayout2.postDelayed(new length(homeShoppingTutorialFragment), 300);
                    return;
                }
                return;
            }
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) homeShoppingTutorialFragment.setMin(resetInternal.setMax.invokeItem);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageResource(R.drawable.ic_up_chevron);
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) homeShoppingTutorialFragment.setMin(resetInternal.setMax.removeOnContextAvailableListener);
        if (constraintLayout3 != null) {
            constraintLayout3.setVisibility(0);
        }
        ConstraintLayout constraintLayout4 = (ConstraintLayout) homeShoppingTutorialFragment.setMin(resetInternal.setMax.removeOnContextAvailableListener);
        if (constraintLayout4 != null) {
            constraintLayout4.post(new getMax(homeShoppingTutorialFragment));
        }
    }

    public static final /* synthetic */ void length(HomeShoppingTutorialFragment homeShoppingTutorialFragment) {
        t tVar = homeShoppingTutorialFragment.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        HomeShoppingModel homeShoppingModel = homeShoppingTutorialFragment.setMax;
        if (homeShoppingModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeShoppingModel");
        }
        String str = homeShoppingModel.length;
        HomeShoppingModel homeShoppingModel2 = homeShoppingTutorialFragment.setMax;
        if (homeShoppingModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeShoppingModel");
        }
        String str2 = homeShoppingModel2.getMax;
        HomeShoppingModel homeShoppingModel3 = homeShoppingTutorialFragment.setMax;
        if (homeShoppingModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeShoppingModel");
        }
        tVar.getMax(str, str2, homeShoppingModel3.toIntRange);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
