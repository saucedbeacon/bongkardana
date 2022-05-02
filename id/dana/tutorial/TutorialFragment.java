package id.dana.tutorial;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.DanaTutorialModule;
import id.dana.di.modules.OauthModule;
import id.dana.model.ThirdPartyService;
import id.dana.tracker.TrackerKey;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.DefaultAppExtension;
import o.FtsOptions$Order;
import o.Ignore;
import o.IntRange;
import o.PrepareException;
import o.Timer;
import o.getDuration;
import o.getScrimColor;
import o.handleCloseEvent;
import o.isShowMenu;
import o.onDelete;
import o.onProgressBegin;
import o.onReachPullRefreshDistance;
import o.resetInternal;
import o.stopIgnoring;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0014J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lid/dana/tutorial/TutorialFragment;", "Lid/dana/base/BaseFragment;", "()V", "readDeepLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadDeepLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadDeepLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "getSkeletonScreen", "()Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "skeletonScreen$delegate", "Lkotlin/Lazy;", "tutorialAdapter", "Lid/dana/tutorial/adapter/TutorialAdapter;", "tutorialPresenter", "Lid/dana/tutorial/TutorialContract$Presenter;", "getTutorialPresenter", "()Lid/dana/tutorial/TutorialContract$Presenter;", "setTutorialPresenter", "(Lid/dana/tutorial/TutorialContract$Presenter;)V", "computeItemSizeFromScreenSize", "", "getLayout", "getOnClickListener", "", "position", "hideSkeleton", "init", "initTutorialAdapter", "openH5Container", "url", "", "setupInjection", "showSkeleton", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TutorialFragment extends FtsOptions$Order {
    private HashMap getMin;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    private final Lazy setMax = LazyKt.lazy(new getMax(this));
    private onProgressBegin setMin;
    @Inject
    public handleCloseEvent.setMax tutorialPresenter;

    public final View getMin(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int setMin() {
        return R.layout.fragment_tutorial;
    }

    public static final /* synthetic */ onProgressBegin setMin(TutorialFragment tutorialFragment) {
        onProgressBegin onprogressbegin = tutorialFragment.setMin;
        if (onprogressbegin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tutorialAdapter");
        }
        return onprogressbegin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<getScrimColor> {
        final /* synthetic */ TutorialFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(TutorialFragment tutorialFragment) {
            super(0);
            this.this$0 = tutorialFragment;
        }

        @Nullable
        public final getScrimColor invoke() {
            if (((RecyclerView) this.this$0.getMin(resetInternal.setMax.AppCompatRatingBar)) == null) {
                return null;
            }
            getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) this.this$0.getMin(resetInternal.setMax.AppCompatRatingBar));
            getmax.length = TutorialFragment.setMin(this.this$0);
            getmax.setMin = TutorialFragment.getMin(this.this$0);
            getmax.getMax = R.layout.tutorial_item_skeleton;
            getmax.IsOverlapping = 1500;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            return getscrimcolor;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements Ignore.setMin {
        final /* synthetic */ TutorialFragment getMax;

        setMax(TutorialFragment tutorialFragment) {
            this.getMax = tutorialFragment;
        }

        public final void length(int i) {
            TutorialFragment.setMin(this.getMax, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/tutorial/TutorialFragment$setupInjection$1", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"id/dana/tutorial/TutorialFragment$setupInjection$2", "Lid/dana/tutorial/TutorialContract$View;", "onGetTutorialFail", "", "onGetTutorialSuccess", "tutorials", "", "Lid/dana/tutorial/model/TutorialModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements handleCloseEvent.length {
        final /* synthetic */ TutorialFragment setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMin(TutorialFragment tutorialFragment) {
            this.setMax = tutorialFragment;
        }

        public final void getMax(@NotNull List<onReachPullRefreshDistance> list) {
            Intrinsics.checkNotNullParameter(list, "tutorials");
            TutorialFragment.getMax(this.setMax);
            TutorialFragment.setMin(this.setMax).getMin(list);
        }
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r2;
        Timer.TimeoutRunnable.getMax getmax = new Timer.TimeoutRunnable.getMax((byte) 0);
        if (this.getMax != null) {
            r2 = this.getMax.getApplicationComponent();
        } else {
            r2 = null;
        }
        if (r2 != null) {
            getmax.toFloatRange = r2;
            getmax.equals = new ServicesModule((style.getMin) new setMin());
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            max.getMax = this.getMax;
            max.length = TrackerKey.SourceType.DANA_NEWS;
            getmax.length = new DeepLinkModule(max, (byte) 0);
            ScanQrModule.setMin max2 = ScanQrModule.getMax();
            max2.setMin = this.getMax;
            getmax.getMin = new ScanQrModule(max2, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = this.getMax;
            getmax.setMin = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length = FeatureModule.length();
            length.setMax = this.getMax;
            getmax.getMax = new FeatureModule(length, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = this.getMax;
            getmax.IsOverlapping = new OauthModule(min2, (byte) 0);
            getmax.setMax = new DanaTutorialModule(new getMin(this));
            stopIgnoring.setMin(getmax.setMax, DanaTutorialModule.class);
            stopIgnoring.setMin(getmax.length, DeepLinkModule.class);
            stopIgnoring.setMin(getmax.getMin, ScanQrModule.class);
            stopIgnoring.setMin(getmax.setMin, RestoreUrlModule.class);
            stopIgnoring.setMin(getmax.getMax, FeatureModule.class);
            stopIgnoring.setMin(getmax.IsOverlapping, OauthModule.class);
            if (getmax.equals == null) {
                getmax.equals = new ServicesModule();
            }
            stopIgnoring.setMin(getmax.toFloatRange, PrepareException.AnonymousClass1.class);
            new Timer.TimeoutRunnable(getmax.setMax, getmax.length, getmax.getMin, getmax.setMin, getmax.getMax, getmax.IsOverlapping, getmax.equals, getmax.toFloatRange, (byte) 0).setMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            handleCloseEvent.setMax setmax = this.tutorialPresenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tutorialPresenter");
            }
            getminArr[0] = setmax;
            getDuration.length length2 = this.readDeepLinkPropertiesPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
            }
            getminArr[1] = length2;
            getMin(getminArr);
            this.setMin = new onProgressBegin();
            RecyclerView recyclerView = (RecyclerView) getMin(resetInternal.setMax.AppCompatRatingBar);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
            }
            RecyclerView recyclerView2 = (RecyclerView) getMin(resetInternal.setMax.AppCompatRatingBar);
            if (recyclerView2 != null) {
                recyclerView2.addItemDecoration(new DefaultAppExtension(getContext()));
            }
            onProgressBegin onprogressbegin = this.setMin;
            if (onprogressbegin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tutorialAdapter");
            }
            onprogressbegin.getMax((Ignore.setMin) new setMax(this));
            RecyclerView recyclerView3 = (RecyclerView) getMin(resetInternal.setMax.AppCompatRatingBar);
            if (recyclerView3 != null) {
                onProgressBegin onprogressbegin2 = this.setMin;
                if (onprogressbegin2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tutorialAdapter");
                }
                recyclerView3.setAdapter(onprogressbegin2);
            }
            getScrimColor getscrimcolor = (getScrimColor) this.setMax.getValue();
            if (getscrimcolor != null) {
                getscrimcolor.getMin();
            }
            handleCloseEvent.setMax setmax2 = this.tutorialPresenter;
            if (setmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tutorialPresenter");
            }
            setmax2.getMax();
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void setMin(TutorialFragment tutorialFragment, int i) {
        onProgressBegin onprogressbegin = tutorialFragment.setMin;
        if (onprogressbegin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tutorialAdapter");
        }
        String str = ((onReachPullRefreshDistance) onprogressbegin.setMin(i)).setMax;
        if (str != null) {
            String concat = "https://m.dana.id/m/standalone/news-tutorial?contentId=".concat(String.valueOf(str));
            if (isShowMenu.length(concat)) {
                getDuration.length length = tutorialFragment.readDeepLinkPropertiesPresenter;
                if (length == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
                }
                length.setMax(concat);
                return;
            }
            DanaH5.startContainerFullUrl(concat);
        }
    }

    public static final /* synthetic */ void getMax(TutorialFragment tutorialFragment) {
        getScrimColor getscrimcolor = (getScrimColor) tutorialFragment.setMax.getValue();
        if (getscrimcolor != null) {
            getscrimcolor.getMax.setAdapter(getscrimcolor.length);
        }
    }

    public static final /* synthetic */ int getMin(TutorialFragment tutorialFragment) {
        Resources resources = tutorialFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        int i = resources.getDisplayMetrics().heightPixels;
        Resources resources2 = tutorialFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "resources");
        return (i / ((int) (resources2.getDisplayMetrics().density * 184.0f))) * 2;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
