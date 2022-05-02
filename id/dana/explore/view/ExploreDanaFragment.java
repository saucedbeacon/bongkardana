package id.dana.explore.view;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.contract.globalsearch.GlobalSearchModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.OauthModule;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.explore.popularplaces.PopularPlacesModule;
import id.dana.explore.popularplaces.PopularPlacesView;
import id.dana.globalsearch.model.RecentAutoComplete;
import id.dana.globalsearch.model.SearchResultModel;
import id.dana.globalsearch.model.TrackerGlobalSearchOpen;
import id.dana.globalsearch.view.GlobalSearchActivity;
import id.dana.home.HomeTabActivity;
import id.dana.model.ThirdPartyService;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.APWebViewClient;
import o.FtsOptions$Order;
import o.GriverInnerAmcsLiteConfig;
import o.GriverManifest;
import o.Ignore;
import o.IntRange;
import o.PrepareException;
import o.createWebMessageChannel;
import o.dispatchOnCancelled;
import o.getAlpha;
import o.getDuration;
import o.getEventManifests;
import o.getInputStream;
import o.hexStringToBytes;
import o.onCancelLoad;
import o.onCanceled;
import o.openBluetooth;
import o.resetInternal;
import o.safeParseInt;
import o.setPublishStatus;
import o.stopIgnoring;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 B2\u00020\u0001:\u0002BCB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u000200H\u0002J\b\u00102\u001a\u000200H\u0002J\u0010\u00103\u001a\u0002002\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000200H\u0002J\u0010\u00107\u001a\u0002002\u0006\u00108\u001a\u00020,H\u0002J\u0010\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u000200H\u0002J\u0018\u0010=\u001a\u0002002\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0?H\u0002J\u0006\u0010A\u001a\u000200R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lid/dana/explore/view/ExploreDanaFragment;", "Lid/dana/base/BaseFragment;", "()V", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "getDanaLoadingDialog", "()Lid/dana/dialog/DanaLoadingDialog;", "danaLoadingDialog$delegate", "Lkotlin/Lazy;", "globalSearchAnalyticTracker", "Lid/dana/globalsearch/tracker/GlobalSearchAnalyticTracker;", "getGlobalSearchAnalyticTracker", "()Lid/dana/globalsearch/tracker/GlobalSearchAnalyticTracker;", "setGlobalSearchAnalyticTracker", "(Lid/dana/globalsearch/tracker/GlobalSearchAnalyticTracker;)V", "globalSearchPresenter", "Lid/dana/contract/globalsearch/GlobalSearchContract$Presenter;", "getGlobalSearchPresenter", "()Lid/dana/contract/globalsearch/GlobalSearchContract$Presenter;", "setGlobalSearchPresenter", "(Lid/dana/contract/globalsearch/GlobalSearchContract$Presenter;)V", "listener", "Lid/dana/explore/view/ExploreDanaFragment$ExploreDanaFragmentListener;", "popularPlacesPresenter", "Lid/dana/explore/popularplaces/PopularPlacesContract$Presenter;", "getPopularPlacesPresenter", "()Lid/dana/explore/popularplaces/PopularPlacesContract$Presenter;", "setPopularPlacesPresenter", "(Lid/dana/explore/popularplaces/PopularPlacesContract$Presenter;)V", "popularSearchAdapter", "Lid/dana/globalsearch/adapter/PopularSearchAdapter;", "readDeepLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadDeepLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadDeepLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "swipeDelegateListener", "Lid/dana/home/SwipeDelegateListener;", "getGlobalSearchView", "Lid/dana/contract/globalsearch/GlobalSearchModule;", "getHomeTabActivity", "Lid/dana/home/HomeTabActivity;", "getLayout", "", "getPopularPlacesView", "Lid/dana/explore/popularplaces/PopularPlacesModule;", "init", "", "initExploreDanaListener", "initPopularReyclerView", "initToolbar", "withCloseButton", "", "injectComponent", "onItemClickedPopularSearch", "position", "orderWidget", "globalSearchConfig", "Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "setCloseButtonMargin", "toDefaultExploreProductModel", "skuAttrList", "", "Lid/dana/domain/homeinfo/SkuAttribute;", "trackExploreDanaOpen", "Companion", "ExploreDanaFragmentListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ExploreDanaFragment extends FtsOptions$Order {
    @NotNull
    public static final getMin setMax = new getMin((byte) 0);
    private final Lazy getMin = LazyKt.lazy(new setMax(this));
    @Inject
    public GriverManifest.AnonymousClass11 globalSearchAnalyticTracker;
    @Inject
    public getAlpha.length globalSearchPresenter;
    private setMin isInside;
    @Inject
    public hexStringToBytes.setMax popularPlacesPresenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    private getEventManifests setMin;
    private HashMap toFloatRange;
    private GriverManifest.AnonymousClass53 toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/explore/view/ExploreDanaFragment$ExploreDanaFragmentListener;", "", "onNavigateToPrepaid", "", "it", "", "onNavigateToService", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void getMax(@NotNull String str);

        void length(@NotNull String str);
    }

    public final View getMax(int i) {
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

    public final int setMin() {
        return R.layout.fragment_explore_dana;
    }

    public static final /* synthetic */ getEventManifests getMin(ExploreDanaFragment exploreDanaFragment) {
        getEventManifests geteventmanifests = exploreDanaFragment.setMin;
        if (geteventmanifests == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popularSearchAdapter");
        }
        return geteventmanifests;
    }

    public static final /* synthetic */ void setMin(ExploreDanaFragment exploreDanaFragment, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-543927243, oncanceled);
            onCancelLoad.getMin(-543927243, oncanceled);
        }
        Intent intent = new Intent(exploreDanaFragment.getContext(), GlobalSearchActivity.class);
        getEventManifests geteventmanifests = exploreDanaFragment.setMin;
        if (geteventmanifests == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popularSearchAdapter");
        }
        Intent putExtra = intent.putExtra("SEARCH_PARAMS", (String) geteventmanifests.setMin(i)).putExtra("IS_FROM_POPULAR_SEARCH_EXPLORE", true);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, GlobalSe…ULAR_SEARCH_PARAMS, true)");
        TrackerGlobalSearchOpen.setGlobalSearchOpen(TrackerKey.SourceType.EXPLORE);
        exploreDanaFragment.startActivity(putExtra);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/DanaLoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<setPublishStatus> {
        final /* synthetic */ ExploreDanaFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(ExploreDanaFragment exploreDanaFragment) {
            super(0);
            this.this$0 = exploreDanaFragment;
        }

        @NotNull
        public final setPublishStatus invoke() {
            return new setPublishStatus(this.this$0.requireActivity());
        }
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r3;
        Bundle arguments = getArguments();
        boolean z = arguments != null && arguments.getBoolean("NAV_BAR_INSTANCE", false);
        ConstraintLayout constraintLayout = (ConstraintLayout) getMax(resetInternal.setMax.startActivityForResult);
        if (constraintLayout != null) {
            constraintLayout.requestFocus();
        }
        EditText editText = (EditText) getMax(resetInternal.setMax.open);
        if (editText != null) {
            editText.setOnClickListener(new equals(this));
        }
        TextView textView = (TextView) getMax(resetInternal.setMax.hasWindowFocus);
        if (textView != null) {
            textView.setText(getString(R.string.explore_fragment_title));
        }
        if (z) {
            TextView textView2 = (TextView) getMax(resetInternal.setMax.getOverflowIcon);
            if (textView2 != null) {
                textView2.setBackground(IntRange.length(requireContext(), (int) R.drawable.ic_close));
            }
            TextView textView3 = (TextView) getMax(resetInternal.setMax.getOverflowIcon);
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = (TextView) getMax(resetInternal.setMax.getOverflowIcon);
            if (textView4 != null) {
                textView4.setOnClickListener(new IsOverlapping(this));
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) getMax(resetInternal.setMax.hasSupportDividerBeforeChildAt);
        ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, (int) (Resources.getSystem().getDisplayMetrics().density * 10.0f), marginLayoutParams.bottomMargin);
            RelativeLayout relativeLayout2 = (RelativeLayout) getMax(resetInternal.setMax.hasSupportDividerBeforeChildAt);
            if (relativeLayout2 != null) {
                relativeLayout2.setLayoutParams(marginLayoutParams);
            }
            getInputStream.length length2 = new getInputStream.length((byte) 0);
            if (this.getMax != null) {
                r3 = this.getMax.getApplicationComponent();
            } else {
                r3 = null;
            }
            if (r3 != null) {
                length2.IsOverlapping = r3;
                DeepLinkModule.setMin max = DeepLinkModule.getMax();
                max.getMax = this.getMax;
                max.length = TrackerKey.SourceType.SERVICES;
                length2.setMax = new DeepLinkModule(max, (byte) 0);
                length2.isInside = new ServicesModule((style.getMin) new toIntRange());
                ScanQrModule.setMin max2 = ScanQrModule.getMax();
                max2.setMin = this.getMax;
                length2.getMin = new ScanQrModule(max2, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = this.getMax;
                length2.length = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length3 = FeatureModule.length();
                length3.setMax = this.getMax;
                length2.getMax = new FeatureModule(length3, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = this.getMax;
                length2.setMin = new OauthModule(min2, (byte) 0);
                length2.toIntRange = new GlobalSearchModule(new length(this));
                length2.toFloatRange = new PopularPlacesModule(new getMax(this));
                stopIgnoring.setMin(length2.setMax, DeepLinkModule.class);
                stopIgnoring.setMin(length2.getMin, ScanQrModule.class);
                stopIgnoring.setMin(length2.length, RestoreUrlModule.class);
                stopIgnoring.setMin(length2.getMax, FeatureModule.class);
                stopIgnoring.setMin(length2.setMin, OauthModule.class);
                if (length2.isInside == null) {
                    length2.isInside = new ServicesModule();
                }
                stopIgnoring.setMin(length2.toIntRange, GlobalSearchModule.class);
                stopIgnoring.setMin(length2.toFloatRange, PopularPlacesModule.class);
                stopIgnoring.setMin(length2.IsOverlapping, PrepareException.AnonymousClass1.class);
                new getInputStream(length2.setMax, length2.getMin, length2.length, length2.getMax, length2.setMin, length2.isInside, length2.toIntRange, length2.toFloatRange, length2.IsOverlapping, (byte) 0).setMax(this);
                getEventManifests geteventmanifests = new getEventManifests();
                geteventmanifests.getMax((Ignore.setMin) new toFloatRange(this));
                Unit unit = Unit.INSTANCE;
                this.setMin = geteventmanifests;
                RecyclerView recyclerView = (RecyclerView) getMax(resetInternal.setMax.onTextContextMenuItem);
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new FlexboxLayoutManager(recyclerView.getContext(), 0));
                    getEventManifests geteventmanifests2 = this.setMin;
                    if (geteventmanifests2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("popularSearchAdapter");
                    }
                    recyclerView.setAdapter(geteventmanifests2);
                }
                this.isInside = new isInside(this);
                ExploreProductView exploreProductView = (ExploreProductView) getMax(resetInternal.setMax.OptIn);
                if (exploreProductView != null) {
                    setMin setmin = this.isInside;
                    if (setmin == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    }
                    exploreProductView.setupExploreDanaListener(setmin);
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    this.toIntRange = ((HomeTabActivity) activity).getSwipeDelegateListener();
                    getAlpha.length length4 = this.globalSearchPresenter;
                    if (length4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("globalSearchPresenter");
                    }
                    length4.length();
                    getAlpha.length length5 = this.globalSearchPresenter;
                    if (length5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("globalSearchPresenter");
                    }
                    length5.toIntRange();
                    hexStringToBytes.setMax setmax = this.popularPlacesPresenter;
                    if (setmax == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("popularPlacesPresenter");
                    }
                    setmax.setMin();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type id.dana.home.HomeTabActivity");
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"id/dana/explore/view/ExploreDanaFragment$initExploreDanaListener$1", "Lid/dana/explore/view/ExploreDanaFragment$ExploreDanaFragmentListener;", "onNavigateToPrepaid", "", "it", "", "onNavigateToService", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements setMin {
        final /* synthetic */ ExploreDanaFragment getMax;

        isInside(ExploreDanaFragment exploreDanaFragment) {
            this.getMax = exploreDanaFragment;
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            getDuration.length length = this.getMax.readDeepLinkPropertiesPresenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
            }
            length.setMax(str);
        }

        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            getAlpha.length length = this.getMax.globalSearchPresenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("globalSearchPresenter");
            }
            length.length(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class toString<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((createWebMessageChannel) t).getOrderId()), Integer.valueOf(((createWebMessageChannel) t2).getOrderId()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/explore/view/ExploreDanaFragment$injectComponent$1", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements style.getMin {
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

        toIntRange() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"id/dana/explore/view/ExploreDanaFragment$getGlobalSearchView$1", "Lid/dana/contract/globalsearch/GlobalSearchContract$View;", "dismissProgress", "", "onGetGlobalSearchConfig", "globalSearchConfig", "Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "onGetPrepaidCheckoutUrl", "result", "", "onGetSkuServices", "defaultSkuList", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "showPopularSearch", "populars", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements getAlpha.setMax {
        final /* synthetic */ ExploreDanaFragment setMin;

        @JvmDefault
        public final void equals(@NotNull SearchResultModel searchResultModel) {
            Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        }

        @JvmDefault
        public final void getMax() {
        }

        @JvmDefault
        public final void getMax(@NotNull SearchResultModel searchResultModel) {
            Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        }

        @JvmDefault
        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "popularSearchPlaceholder");
        }

        @JvmDefault
        public final void getMax(@NotNull List<RecentAutoComplete> list) {
            Intrinsics.checkNotNullParameter(list, "recentAutoCompleteList");
        }

        @JvmDefault
        public final void getMax(boolean z, boolean z2) {
        }

        @JvmDefault
        public final void getMin() {
        }

        @JvmDefault
        public final void getMin(@NotNull SearchResultModel searchResultModel) {
            Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        }

        @JvmDefault
        public final void isInside() {
        }

        @JvmDefault
        public final void length() {
        }

        @JvmDefault
        public final void length(@NotNull SearchResultModel searchResultModel) {
            Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMax(@NotNull SearchResultModel searchResultModel) {
            Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        }

        @JvmDefault
        public final void setMax(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "recents");
        }

        @JvmDefault
        public final void setMin(@NotNull ThirdPartyServiceResponse thirdPartyServiceResponse, @NotNull String str) {
            Intrinsics.checkNotNullParameter(thirdPartyServiceResponse, "thirdPartyService");
            Intrinsics.checkNotNullParameter(str, "url");
        }

        @JvmDefault
        public final void setMin(@NotNull ThirdPartyServiceResponse thirdPartyServiceResponse, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(thirdPartyServiceResponse, "thirdPartyService");
            Intrinsics.checkNotNullParameter(str, "url");
            Intrinsics.checkNotNullParameter(str2, "authCode");
        }

        @JvmDefault
        public final void setMin(@NotNull SearchResultModel searchResultModel) {
            Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        }

        @JvmDefault
        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        }

        length(ExploreDanaFragment exploreDanaFragment) {
            this.setMin = exploreDanaFragment;
        }

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "result");
            DanaH5.startContainerFullUrl(str);
        }

        public final void setMin(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "populars");
            if (!list.isEmpty()) {
                ExploreDanaFragment.getMin(this.setMin).getMin(list);
                LinearLayout linearLayout = (LinearLayout) this.setMin.getMax(resetInternal.setMax.setShortcutsVisibleInner);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    return;
                }
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) this.setMin.getMax(resetInternal.setMax.setShortcutsVisibleInner);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }

        public final void showProgress() {
            setPublishStatus max = ExploreDanaFragment.getMax(this.setMin);
            if (!max.length.isShowing()) {
                max.length.show();
                max.getMax.startRefresh();
            }
        }

        public final void dismissProgress() {
            ExploreDanaFragment.getMax(this.setMin).getMax();
        }

        public final void setMax(@NotNull APWebViewClient aPWebViewClient) {
            Intrinsics.checkNotNullParameter(aPWebViewClient, "globalSearchConfig");
            ExploreDanaFragment.length(this.setMin, aPWebViewClient);
        }

        public final void getMin(@NotNull List<ThirdPartyServiceResponse> list) {
            Intrinsics.checkNotNullParameter(list, "defaultSkuList");
            ExploreProductView exploreProductView = (ExploreProductView) this.setMin.getMax(resetInternal.setMax.OptIn);
            if (exploreProductView != null) {
                getAlpha.length length = this.setMin.globalSearchPresenter;
                if (length == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("globalSearchPresenter");
                }
                exploreProductView.setPostPaidProfileKey(length.getMax(list));
            }
            ExploreDanaFragment exploreDanaFragment = this.setMin;
            Iterable<ThirdPartyServiceResponse> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (ThirdPartyServiceResponse thirdPartyServiceResponse : iterable) {
                GriverInnerAmcsLiteConfig skuAttr = thirdPartyServiceResponse.getSkuAttr();
                if (skuAttr != null) {
                    skuAttr.setAppId(thirdPartyServiceResponse.getAppId());
                } else {
                    skuAttr = null;
                }
                arrayList.add(skuAttr);
            }
            ExploreDanaFragment.setMin(exploreDanaFragment, (List) arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "id/dana/explore/view/ExploreDanaFragment$orderWidget$1$1$1", "id/dana/explore/view/ExploreDanaFragment$$special$$inlined$forEach$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange implements Runnable {
        final /* synthetic */ List getMax;
        final /* synthetic */ APWebViewClient getMin;
        final /* synthetic */ LinearLayout setMax;
        final /* synthetic */ List setMin;

        toDoubleRange(LinearLayout linearLayout, List list, List list2, APWebViewClient aPWebViewClient) {
            this.setMax = linearLayout;
            this.getMax = list;
            this.setMin = list2;
            this.getMin = aPWebViewClient;
        }

        public final void run() {
            this.setMax.addView((View) this.getMax.get(0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "id/dana/explore/view/ExploreDanaFragment$orderWidget$1$1$2", "id/dana/explore/view/ExploreDanaFragment$$special$$inlined$forEach$lambda$2"}, k = 3, mv = {1, 4, 2})
    static final class values implements Runnable {
        final /* synthetic */ List getMin;
        final /* synthetic */ List length;
        final /* synthetic */ APWebViewClient setMax;
        final /* synthetic */ LinearLayout setMin;

        values(LinearLayout linearLayout, List list, List list2, APWebViewClient aPWebViewClient) {
            this.setMin = linearLayout;
            this.getMin = list;
            this.length = list2;
            this.setMax = aPWebViewClient;
        }

        public final void run() {
            this.setMin.addView((View) this.getMin.get(1));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"id/dana/explore/view/ExploreDanaFragment$getPopularPlacesView$1", "Lid/dana/explore/popularplaces/PopularPlacesContract$View;", "onFailedGetPopularPlaces", "", "onGetPopularPlaces", "onSuccessGetPopularPlaces", "popularPlacesList", "", "Lid/dana/explore/popularplaces/model/ExplorePopularPlacesConfigModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements hexStringToBytes.getMax {
        final /* synthetic */ ExploreDanaFragment length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(ExploreDanaFragment exploreDanaFragment) {
            this.length = exploreDanaFragment;
        }

        public final void setMin() {
            PopularPlacesView popularPlacesView = (PopularPlacesView) this.length.getMax(resetInternal.setMax.setHasNonEmbeddedTabs);
            if (popularPlacesView != null) {
                popularPlacesView.showShimmer();
            }
        }

        public final void length(@NotNull List<safeParseInt> list) {
            Intrinsics.checkNotNullParameter(list, "popularPlacesList");
            PopularPlacesView popularPlacesView = (PopularPlacesView) this.length.getMax(resetInternal.setMax.setHasNonEmbeddedTabs);
            if (popularPlacesView != null) {
                popularPlacesView.hideShimmer();
                popularPlacesView.loadData(list);
            }
        }

        public final void getMin() {
            PopularPlacesView popularPlacesView = (PopularPlacesView) this.length.getMax(resetInternal.setMax.setHasNonEmbeddedTabs);
            if (popularPlacesView != null) {
                popularPlacesView.hideShimmer();
                popularPlacesView.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ ExploreDanaFragment getMax;

        equals(ExploreDanaFragment exploreDanaFragment) {
            this.getMax = exploreDanaFragment;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.getMax.getContext(), GlobalSearchActivity.class);
            TrackerGlobalSearchOpen.setGlobalSearchOpen(TrackerKey.SourceType.EXPLORE);
            this.getMax.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ ExploreDanaFragment getMax;

        IsOverlapping(ExploreDanaFragment exploreDanaFragment) {
            this.getMax = exploreDanaFragment;
        }

        public final void onClick(View view) {
            this.getMax.requireActivity().onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onItemClick", "id/dana/explore/view/ExploreDanaFragment$initPopularReyclerView$1$1"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements Ignore.setMin {
        final /* synthetic */ ExploreDanaFragment setMin;

        toFloatRange(ExploreDanaFragment exploreDanaFragment) {
            this.setMin = exploreDanaFragment;
        }

        public final void length(int i) {
            ExploreDanaFragment.setMin(this.setMin, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/explore/view/ExploreDanaFragment$Companion;", "", "()V", "NAV_BAR_INSTANCE", "", "newInstance", "Lid/dana/explore/view/ExploreDanaFragment;", "newInstanceWithData", "instanceFromNavBar", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ setPublishStatus getMax(ExploreDanaFragment exploreDanaFragment) {
        return (setPublishStatus) exploreDanaFragment.getMin.getValue();
    }

    public static final /* synthetic */ void length(ExploreDanaFragment exploreDanaFragment, APWebViewClient aPWebViewClient) {
        List<createWebMessageChannel> sortedWith = CollectionsKt.sortedWith(aPWebViewClient.getWidgetOrder(), new toString());
        List arrayList = new ArrayList();
        LinearLayout linearLayout = (LinearLayout) exploreDanaFragment.getMax(resetInternal.setMax.setCurrentMenuInfo);
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = linearLayout.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "layoutWidget.getChildAt(i)");
                arrayList.add(childAt);
            }
            linearLayout.removeAllViews();
            for (createWebMessageChannel name : sortedWith) {
                String name2 = name.getName();
                int hashCode = name2.hashCode();
                if (hashCode != 113949) {
                    if (hashCode != 929744334) {
                        if (hashCode == 1074011130 && name2.equals("recommendedservice")) {
                            linearLayout.post(new values(linearLayout, arrayList, sortedWith, aPWebViewClient));
                        }
                    } else if (name2.equals("popularplace")) {
                        linearLayout.post(new toDoubleRange(linearLayout, arrayList, sortedWith, aPWebViewClient));
                    }
                } else if (name2.equals("sku") && aPWebViewClient.getExploreSkuWidget()) {
                    linearLayout.post(new ExploreDanaFragment$FastBitmap$CoordinateSystem(linearLayout, arrayList, sortedWith, aPWebViewClient));
                }
            }
        }
        hexStringToBytes.setMax setmax = exploreDanaFragment.popularPlacesPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popularPlacesPresenter");
        }
        setmax.setMin();
    }

    public static final /* synthetic */ void setMin(ExploreDanaFragment exploreDanaFragment, List list) {
        List arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GriverInnerAmcsLiteConfig griverInnerAmcsLiteConfig = (GriverInnerAmcsLiteConfig) it.next();
            if (griverInnerAmcsLiteConfig != null) {
                openBluetooth.getMax getmax = openBluetooth.values;
                Intrinsics.checkNotNullParameter(griverInnerAmcsLiteConfig, "skuAttr");
                arrayList.add(new openBluetooth(griverInnerAmcsLiteConfig.getServiceKey(), griverInnerAmcsLiteConfig.getPrepaidKey(), griverInnerAmcsLiteConfig.getPostpaidKey(), griverInnerAmcsLiteConfig.getBackgroundColor(), griverInnerAmcsLiteConfig.getTitle(), griverInnerAmcsLiteConfig.getIcon(), griverInnerAmcsLiteConfig.getButtonDescription(), griverInnerAmcsLiteConfig.getServiceName(), griverInnerAmcsLiteConfig.getProductBizId(), griverInnerAmcsLiteConfig.getKey(), griverInnerAmcsLiteConfig.getLink(), griverInnerAmcsLiteConfig.getAppId(), 1536));
            }
        }
        ((ExploreProductView) exploreDanaFragment.getMax(resetInternal.setMax.OptIn)).setItems(arrayList);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @JvmStatic
    @NotNull
    public static final ExploreDanaFragment setMin(boolean z) {
        ExploreDanaFragment exploreDanaFragment = new ExploreDanaFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("NAV_BAR_INSTANCE", z);
        exploreDanaFragment.setArguments(bundle);
        return exploreDanaFragment;
    }
}
