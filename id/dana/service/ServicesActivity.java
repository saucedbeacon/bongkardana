package id.dana.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.model.ThirdPartyService;
import id.dana.richview.ToolbarSearchView;
import id.dana.richview.category.CategoryView;
import id.dana.richview.category.model.CategoryModel;
import id.dana.richview.servicescard.ServiceCategoryView;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.service.favorites.FavoriteServicesView;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.GriverManifest;
import o.Ignore;
import o.IntRange;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PhotoView;
import o.PrepareException;
import o.WindowBridgeExtension;
import o.access$1402;
import o.appendExtraSystemInfo;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dismissProgress;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.generateStepCreator;
import o.getDuration;
import o.getMaxTextureSize;
import o.getPerformanceTracker;
import o.getSelectedIndex;
import o.getUseSecurityGuard;
import o.initRect;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.setUseAmcsLite;
import o.setUseSecurityGuard;
import o.stopIgnoring;
import o.style;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 r2\u00020\u0001:\u0001rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020EH\u0002J \u0010F\u001a\u00020>2\u0006\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020C2\u0006\u0010I\u001a\u00020CH\u0002J\b\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u00020KH\u0002J\b\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u00020CH\u0016J\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020R0Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020U0TH\u0002J\b\u0010V\u001a\u00020WH\u0002J\b\u0010X\u001a\u00020KH\u0016J\b\u0010Y\u001a\u00020KH\u0002J\b\u0010Z\u001a\u00020KH\u0002J\b\u0010[\u001a\u00020KH\u0002J\b\u0010\\\u001a\u00020KH\u0016J\u0010\u0010]\u001a\u00020K2\u0006\u0010^\u001a\u00020\u0004H\u0002J,\u0010_\u001a\u00020K2\u0006\u0010`\u001a\u00020U2\u0006\u0010a\u001a\u00020R2\b\u0010b\u001a\u0004\u0018\u00010R2\b\u0010c\u001a\u0004\u0018\u00010RH\u0002J\u0016\u0010d\u001a\u00020K2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020U0TH\u0002J\u0010\u0010f\u001a\u00020K2\u0006\u0010g\u001a\u00020\u0004H\u0002J\u000e\u0010h\u001a\u00020K2\u0006\u0010i\u001a\u00020\u0004J\u0010\u0010j\u001a\u00020K2\u0006\u0010k\u001a\u00020\u0004H\u0002J\u0016\u0010l\u001a\u00020K2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020U0TH\u0002J\b\u0010m\u001a\u00020KH\u0002J\u0010\u0010n\u001a\u00020K2\u0006\u0010o\u001a\u00020\u0004H\u0002J\u0010\u0010p\u001a\u00020K2\u0006\u0010q\u001a\u00020>H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u000208X.¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X.¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u00020>8BX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006s"}, d2 = {"Lid/dana/service/ServicesActivity;", "Lid/dana/base/BaseActivity;", "()V", "checkoutH5EventSuccess", "", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "getDeviceInformationProvider", "()Lid/dana/data/config/DeviceInformationProvider;", "setDeviceInformationProvider", "(Lid/dana/data/config/DeviceInformationProvider;)V", "editFavoriteServiceView", "Landroid/view/View;", "getEditFavoriteServiceView", "()Landroid/view/View;", "editOnItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "getEditOnItemClickListener", "()Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "h5EventPresenter", "Lid/dana/h5event/CheckoutH5EventContract$Presenter;", "getH5EventPresenter", "()Lid/dana/h5event/CheckoutH5EventContract$Presenter;", "setH5EventPresenter", "(Lid/dana/h5event/CheckoutH5EventContract$Presenter;)V", "isOnEdit", "isOpenService", "normalOnItemClickListener", "getNormalOnItemClickListener", "onBoardingServicePresenter", "Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "getOnBoardingServicePresenter", "()Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "setOnBoardingServicePresenter", "(Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;)V", "onRecyclerViewItemClickListener", "getOnRecyclerViewItemClickListener", "playStoreReviewPresenter", "Lid/dana/playstorereview/PlayStoreReviewContract$Presenter;", "getPlayStoreReviewPresenter", "()Lid/dana/playstorereview/PlayStoreReviewContract$Presenter;", "setPlayStoreReviewPresenter", "(Lid/dana/playstorereview/PlayStoreReviewContract$Presenter;)V", "presenter", "Lid/dana/contract/services/ServicesContract$Presenter;", "getPresenter", "()Lid/dana/contract/services/ServicesContract$Presenter;", "setPresenter", "(Lid/dana/contract/services/ServicesContract$Presenter;)V", "readLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "serviceAdapter", "Lid/dana/service/adapter/ServiceAdapter;", "serviceItemDecorator", "Lid/dana/service/ServiceItemDecorator;", "showcase", "Lid/dana/showcase/Showcase;", "tooltipTarget", "Lid/dana/showcase/target/Target;", "getTooltipTarget", "()Lid/dana/showcase/target/Target;", "checkAndSwitchEditMode", "position", "", "createH5AppListener", "Lid/dana/danah5/DanaH5Listener;", "createTargetFrom", "targetView", "title", "description", "doOnOpenH5", "", "getBundleIntent", "getGridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "getLayout", "getListOfUniqueCategory", "", "", "thirdPartyServices", "", "Lid/dana/model/ThirdPartyService;", "getServiceModule", "Lid/dana/contract/services/ServicesModule;", "init", "initAdapter", "initComponent", "initToolbar", "onBackPressed", "onEditModeChanged", "isEditMode", "openH5", "thirdPartyService", "url", "authCode", "requestId", "removeLastEmptyHeader", "services", "setCategoryViewVisibility", "show", "setEditMode", "onEdit", "setErrorView", "isEnable", "setupServiceList", "showEmptyFilteredResult", "showSearchHeader", "isSearching", "showShowcase", "target", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ServicesActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    @NotNull
    public static final String FILTER_BY = "FILTER_BY";
    @NotNull
    public static final String FILTER_SERVICES = "FILTER_SERVICES";
    @NotNull
    public static final String OPEN_SERVICE = "OPEN_SERVICE";
    private static final int equals = ((int) (Resources.getSystem().getDisplayMetrics().density * 44.0f));
    private static final int toIntRange = ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f));
    /* access modifiers changed from: private */
    public dismissProgress IsOverlapping;
    @Inject
    public getPerformanceTracker deviceInformationProvider;
    private boolean getMax;
    /* access modifiers changed from: private */
    public boolean getMin;
    @Inject
    public GriverManifest.AnonymousClass22.getMin h5EventPresenter;
    /* access modifiers changed from: private */
    public PhotoView isInside;
    @Inject
    public getSelectedIndex.length onBoardingServicePresenter;
    @Inject
    public PdfImageSource.setMin playStoreReviewPresenter;
    @Inject
    public style.length presenter;
    @Inject
    public getDuration.length readLinkPropertiesPresenter;
    private boolean setMax;
    private HashMap toDoubleRange;
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter toFloatRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange implements Runnable {
        public static final toDoubleRange length = new toDoubleRange();

        toDoubleRange() {
        }

        public final void run() {
        }
    }

    public final void _$_clearFindViewByIdCache() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(510595801, oncanceled);
            onCancelLoad.getMin(510595801, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(510595801, oncanceled2);
            onCancelLoad.getMin(510595801, oncanceled2);
        }
        HashMap hashMap = this.toDoubleRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toDoubleRange == null) {
            this.toDoubleRange = new HashMap();
        }
        View view = (View) this.toDoubleRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toDoubleRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_service;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/model/ThirdPartyService;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function1<ThirdPartyService, Boolean> {
        public static final toString INSTANCE = new toString();

        toString() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((ThirdPartyService) obj));
        }

        public final boolean invoke(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "it");
            return thirdPartyService.length() || thirdPartyService.values == 5;
        }
    }

    public static final /* synthetic */ PhotoView access$getServiceAdapter$p(ServicesActivity servicesActivity) {
        PhotoView photoView = servicesActivity.isInside;
        if (photoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        return photoView;
    }

    public static final /* synthetic */ dismissProgress access$getServiceItemDecorator$p(ServicesActivity servicesActivity) {
        dismissProgress dismissprogress = servicesActivity.IsOverlapping;
        if (dismissprogress == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceItemDecorator");
        }
        return dismissprogress;
    }

    public static final /* synthetic */ void access$openH5(ServicesActivity servicesActivity, ThirdPartyService thirdPartyService, String str, String str2, String str3) {
        int length2;
        int min;
        Context baseContext = servicesActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(259190699, oncanceled);
            onCancelLoad.getMin(259190699, oncanceled);
        }
        WindowBridgeExtension.AnonymousClass1.length();
        if (!WindowBridgeExtension.AnonymousClass1.getMin()) {
            String max = appendExtraSystemInfo.getMax(str, str2, str3);
            if (Intrinsics.areEqual((Object) thirdPartyService.setMax, (Object) "service_akulaku")) {
                Bundle bundle = new Bundle();
                String max2 = isShowMenu.getMax(max, TrackerKey.SourceType.SERVICES);
                Intrinsics.checkNotNullExpressionValue(max2, "UrlUtil.addEntryPoint(\n …ERVICES\n                )");
                bundle.putString("url", DanaH5.correctedUrl(max2));
                bundle.putString("adjustResize", "YES");
                DanaH5.startContainerActivity(bundle, new getMax(servicesActivity));
                servicesActivity.setMin();
                return;
            }
            String str4 = thirdPartyService.setMax;
            int hashCode2 = str4.hashCode();
            if (hashCode2 != -799331944) {
                if (hashCode2 != 994706502) {
                    if (hashCode2 == 1397883715 && str4.equals("service_my_bills")) {
                        getSelectedIndex.length length3 = servicesActivity.onBoardingServicePresenter;
                        if (length3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("onBoardingServicePresenter");
                        }
                        length3.setMax(BottomSheetOnBoardingScenario.MY_BILLS, max);
                        return;
                    }
                } else if (str4.equals("service_danakaget")) {
                    getSelectedIndex.length length4 = servicesActivity.onBoardingServicePresenter;
                    if (length4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("onBoardingServicePresenter");
                    }
                    length4.setMax(BottomSheetOnBoardingScenario.DANA_KAGET, max);
                    return;
                }
            } else if (str4.equals("service_danafood")) {
                getSelectedIndex.length length5 = servicesActivity.onBoardingServicePresenter;
                if (length5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onBoardingServicePresenter");
                }
                length5.setMax(BottomSheetOnBoardingScenario.DANA_FOOD, max);
                return;
            }
            DanaH5.startContainerFullUrlWithSendCredentials$default(max, new getMax(servicesActivity), (Bundle) null, 4, (Object) null);
            servicesActivity.setMin();
        }
    }

    public static final /* synthetic */ void access$showEmptyFilteredResult(ServicesActivity servicesActivity) {
        int max;
        Context baseContext = servicesActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 881767860 == (max = dispatchOnCancelled.getMax(applicationContext, 881767860)))) {
            onCanceled oncanceled = new onCanceled(881767860, max, 512);
            onCancelLoad.setMax(881767860, oncanceled);
            onCancelLoad.getMin(881767860, oncanceled);
        }
        RecyclerView recyclerView = (RecyclerView) servicesActivity._$_findCachedViewById(resetInternal.setMax.isOverflowMenuShowing);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "menu_service_list");
        recyclerView.setVisibility(8);
        servicesActivity.getMax(true);
        TextView textView = (TextView) servicesActivity._$_findCachedViewById(resetInternal.setMax.getLayoutInflater);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_search_not_found");
        textView.setText(servicesActivity.getString(R.string.no_service_available));
        Button button = (Button) servicesActivity._$_findCachedViewById(resetInternal.setMax.MediaMetadataCompat$TextKey);
        Intrinsics.checkNotNullExpressionValue(button, "btn_try_another_keyword");
        button.setVisibility(8);
    }

    @NotNull
    public final getPerformanceTracker getDeviceInformationProvider() {
        getPerformanceTracker getperformancetracker = this.deviceInformationProvider;
        if (getperformancetracker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceInformationProvider");
        }
        return getperformancetracker;
    }

    public final void setDeviceInformationProvider(@NotNull getPerformanceTracker getperformancetracker) {
        Intrinsics.checkNotNullParameter(getperformancetracker, "<set-?>");
        this.deviceInformationProvider = getperformancetracker;
    }

    @NotNull
    public final GriverManifest.AnonymousClass22.getMin getH5EventPresenter() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(2124252668, oncanceled);
            onCancelLoad.getMin(2124252668, oncanceled);
        }
        GriverManifest.AnonymousClass22.getMin getmin = this.h5EventPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("h5EventPresenter");
        }
        return getmin;
    }

    public final void setH5EventPresenter(@NotNull GriverManifest.AnonymousClass22.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.h5EventPresenter = getmin;
    }

    @NotNull
    public final PdfImageSource.setMin getPlayStoreReviewPresenter() {
        PdfImageSource.setMin setmin = this.playStoreReviewPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playStoreReviewPresenter");
        }
        return setmin;
    }

    public final void setPlayStoreReviewPresenter(@NotNull PdfImageSource.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.playStoreReviewPresenter = setmin;
    }

    @NotNull
    public final style.length getPresenter() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-176817556, oncanceled);
            onCancelLoad.getMin(-176817556, oncanceled);
        }
        style.length length3 = this.presenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return length3;
    }

    public final void setPresenter(@NotNull style.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.presenter = length2;
    }

    @NotNull
    public final getDuration.length getReadLinkPropertiesPresenter() {
        getDuration.length length2 = this.readLinkPropertiesPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
        }
        return length2;
    }

    public final void setReadLinkPropertiesPresenter(@NotNull getDuration.length length2) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 635613906 == (max = dispatchOnCancelled.getMax(applicationContext, 635613906)))) {
            onCanceled oncanceled = new onCanceled(635613906, max, 512);
            onCancelLoad.setMax(635613906, oncanceled);
            onCancelLoad.getMin(635613906, oncanceled);
        }
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.readLinkPropertiesPresenter = length2;
    }

    @NotNull
    public final getSelectedIndex.length getOnBoardingServicePresenter() {
        getSelectedIndex.length length2 = this.onBoardingServicePresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingServicePresenter");
        }
        return length2;
    }

    public final void setOnBoardingServicePresenter(@NotNull getSelectedIndex.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.onBoardingServicePresenter = length2;
    }

    public final void init() {
        Ignore.setMin setmin;
        Bundle extras;
        Bundle extras2;
        int max;
        this.getMax = false;
        generateStepCreator.getMax getmax = new generateStepCreator.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmax.toFloatRange = applicationComponent;
            DeepLinkModule.setMin max2 = DeepLinkModule.getMax();
            Activity activity = this;
            max2.getMax = activity;
            max2.length = TrackerKey.SourceType.SERVICES;
            getmax.setMin = new DeepLinkModule(max2, (byte) 0);
            ScanQrModule.setMin max3 = ScanQrModule.getMax();
            max3.setMin = activity;
            getmax.setMax = new ScanQrModule(max3, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = activity;
            getmax.IsOverlapping = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length2 = FeatureModule.length();
            length2.setMax = activity;
            getmax.equals = new FeatureModule(length2, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = activity;
            getmax.isInside = new OauthModule(min2, (byte) 0);
            getmax.length = new CheckoutH5EventModule(new equals(this));
            getmax.getMin = new PlayStoreReviewModules(new PdfViewerActivity.PageAdapter(activity));
            getmax.toIntRange = new ServicesModule((style.getMin) new length(this));
            getmax.getMax = new BottomSheetOnBoardingModule(new toFloatRange(this));
            stopIgnoring.setMin(getmax.getMin, PlayStoreReviewModules.class);
            stopIgnoring.setMin(getmax.length, CheckoutH5EventModule.class);
            stopIgnoring.setMin(getmax.getMax, BottomSheetOnBoardingModule.class);
            stopIgnoring.setMin(getmax.setMin, DeepLinkModule.class);
            stopIgnoring.setMin(getmax.setMax, ScanQrModule.class);
            stopIgnoring.setMin(getmax.IsOverlapping, RestoreUrlModule.class);
            stopIgnoring.setMin(getmax.equals, FeatureModule.class);
            stopIgnoring.setMin(getmax.isInside, OauthModule.class);
            if (getmax.toIntRange == null) {
                getmax.toIntRange = new ServicesModule();
            }
            stopIgnoring.setMin(getmax.toFloatRange, PrepareException.AnonymousClass1.class);
            new generateStepCreator(getmax.getMin, getmax.length, getmax.getMax, getmax.setMin, getmax.setMax, getmax.IsOverlapping, getmax.equals, getmax.isInside, getmax.toIntRange, getmax.toFloatRange, (byte) 0).length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[4];
            style.length length3 = this.presenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = length3;
            PdfImageSource.setMin setmin2 = this.playStoreReviewPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playStoreReviewPresenter");
            }
            getminArr[1] = setmin2;
            GriverManifest.AnonymousClass22.getMin getmin = this.h5EventPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("h5EventPresenter");
            }
            getminArr[2] = getmin;
            getSelectedIndex.length length4 = this.onBoardingServicePresenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onBoardingServicePresenter");
            }
            getminArr[3] = length4;
            registerPresenter(getminArr);
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || -1693828765 == (max = dispatchOnCancelled.getMax(applicationContext, -1693828765)))) {
                onCanceled oncanceled = new onCanceled(-1693828765, max, 512);
                onCancelLoad.setMax(-1693828765, oncanceled);
                onCancelLoad.getMin(-1693828765, oncanceled);
            }
            PhotoView photoView = new PhotoView();
            if (this.getMax) {
                setmin = getMin();
            } else {
                setmin = setMax();
            }
            photoView.getMax(setmin);
            photoView.getMin = new IsOverlapping(this);
            photoView.length = true;
            photoView.setMax = new isInside(this);
            Unit unit = Unit.INSTANCE;
            this.isInside = photoView;
            Context context = this;
            this.IsOverlapping = new dismissProgress(context, IntRange.setMax(context, R.color.f24812131100439));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.isOverflowMenuShowing);
            dismissProgress dismissprogress = this.IsOverlapping;
            if (dismissprogress == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceItemDecorator");
            }
            recyclerView.removeItemDecoration(dismissprogress);
            dismissProgress dismissprogress2 = this.IsOverlapping;
            if (dismissprogress2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceItemDecorator");
            }
            recyclerView.addItemDecoration(dismissprogress2);
            PhotoView photoView2 = this.isInside;
            if (photoView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
            }
            recyclerView.setAdapter(photoView2);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
            gridLayoutManager.toIntRange = new setMin(gridLayoutManager, this);
            recyclerView.setLayoutManager(gridLayoutManager);
            Intent intent = getIntent();
            CharSequence string = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString(FILTER_SERVICES);
            boolean z = !(string == null || string.length() == 0);
            ToolbarSearchView toolbarSearchView = (ToolbarSearchView) _$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat);
            if (z) {
                toolbarSearchView.setTitle(getString(R.string.select_service));
            } else {
                toolbarSearchView.setMenuRightButton(R.drawable.ic_search_white);
                toolbarSearchView.setTitle(getString(R.string.all_services));
            }
            toolbarSearchView.setMenuLeftButton(R.drawable.btn_arrow_left);
            toolbarSearchView.setListener(new hashCode(this, z));
            Intent intent2 = getIntent();
            if (intent2 == null || (extras = intent2.getExtras()) == null) {
                style.length length5 = this.presenter;
                if (length5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length5.setMin();
            } else {
                String string2 = extras.getString(FILTER_SERVICES, (String) null);
                if (string2 != null) {
                    String string3 = extras.getString(FILTER_BY, (String) null);
                    if (string3 == null) {
                        string3 = "";
                    }
                    this.setMax = extras.getBoolean(OPEN_SERVICE, false);
                    style.length length6 = this.presenter;
                    if (length6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    }
                    length6.setMin(string2, string3);
                } else {
                    style.length length7 = this.presenter;
                    if (length7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    }
                    length7.setMin();
                }
            }
            style.length length8 = this.presenter;
            if (length8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length8.getMin();
            ((Button) _$_findCachedViewById(resetInternal.setMax.MediaMetadataCompat$TextKey)).setOnClickListener(new toIntRange(this));
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ ServicesActivity length;

        toIntRange(ServicesActivity servicesActivity) {
            this.length = servicesActivity;
        }

        public final void onClick(View view) {
            ((ToolbarSearchView) this.length._$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat)).clearSearch();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011¸\u0006\u0000"}, d2 = {"id/dana/service/ServicesActivity$initToolbar$1$1", "Lid/dana/richview/ToolbarSearchView$Listener;", "delay", "", "handler", "Landroid/os/Handler;", "workRunnable", "Ljava/lang/Runnable;", "getCategoryServiceByKeyword", "", "text", "", "onBackPressed", "onClickClearButton", "onClickSearchButton", "onHideToolbarSearchView", "onSearchTextChanged", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class hashCode implements ToolbarSearchView.getMin {
        final /* synthetic */ boolean getMax;
        private final long getMin = 500;
        private Runnable length = toDoubleRange.length;
        private final Handler setMax = new Handler(this.setMin.getMainLooper());
        final /* synthetic */ ServicesActivity setMin;

        hashCode(ServicesActivity servicesActivity, boolean z) {
            this.setMin = servicesActivity;
            this.getMax = z;
        }

        public final void getMax(@NotNull final CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "text");
            this.setMax.removeCallbacks(this.length);
            Runnable r0 = new Runnable(this) {
                final /* synthetic */ hashCode setMin;

                {
                    this.setMin = r1;
                }

                public final void run() {
                    hashCode.length(this.setMin, charSequence);
                }
            };
            this.length = r0;
            this.setMax.postDelayed(r0, this.getMin);
        }

        public final void setMin() {
            this.setMin.onBackPressed();
        }

        public final void setMax() {
            ServicesActivity.access$setCategoryViewVisibility(this.setMin, false);
        }

        public final void getMax() {
            this.setMin.getMax(false);
        }

        public final void length() {
            ServicesActivity.access$setCategoryViewVisibility(this.setMin, true);
            TextView textView = (TextView) this.setMin._$_findCachedViewById(resetInternal.setMax.setLayoutResource);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_search_result");
            textView.setVisibility(8);
        }

        public static final /* synthetic */ void length(hashCode hashcode, CharSequence charSequence) {
            if (ServicesActivity.access$getServiceAdapter$p(hashcode.setMin).getItemCount() > 0) {
                ServicesActivity.access$getServiceAdapter$p(hashcode.setMin).getMax().clear();
            }
            String obj = charSequence.toString();
            if (obj != null) {
                String obj2 = StringsKt.trim((CharSequence) obj).toString();
                if (obj2.length() >= 3) {
                    ServicesActivity.access$showSearchHeader(hashcode.setMin, true);
                    ServicesActivity.access$getServiceItemDecorator$p(hashcode.setMin).setMax = false;
                    hashcode.setMin.getPresenter().setMax(obj2);
                    return;
                }
                ServicesActivity.access$showSearchHeader(hashcode.setMin, false);
                ServicesActivity.access$getServiceItemDecorator$p(hashcode.setMin).setMax = true;
                ServiceCategoryView serviceCategoryView = (ServiceCategoryView) hashcode.setMin._$_findCachedViewById(resetInternal.setMax.getPopupBackground);
                Intrinsics.checkNotNullExpressionValue(serviceCategoryView, "scv_categories");
                if (!serviceCategoryView.isDefaultSelected()) {
                    ServiceCategoryView serviceCategoryView2 = (ServiceCategoryView) hashcode.setMin._$_findCachedViewById(resetInternal.setMax.getPopupBackground);
                    Intrinsics.checkNotNullExpressionValue(serviceCategoryView2, "scv_categories");
                    serviceCategoryView2.setDefaultSelected(false);
                }
                hashcode.setMin.getPresenter().length();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onGetCheckoutH5EventSuccess"}, k = 3, mv = {1, 4, 2})
    static final class equals implements GriverManifest.AnonymousClass22.length {
        final /* synthetic */ ServicesActivity setMin;

        equals(ServicesActivity servicesActivity) {
            this.setMin = servicesActivity;
        }

        public final void setMin(boolean z) {
            this.setMin.getMin = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/service/ServicesActivity$initComponent$2", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "onError", "", "errorMessage", "", "onGetBottomSheetOnBoardingAvailability", "show", "", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements getSelectedIndex.setMax {
        final /* synthetic */ ServicesActivity length;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void setMax(boolean z, @Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        toFloatRange(ServicesActivity servicesActivity) {
            this.length = servicesActivity;
        }

        public final void onGetBottomSheetOnBoardingAvailability(boolean z, @Nullable String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            if (z) {
                buildUpon.appendQueryParameter(SummaryActivity.FIRST_STATE_SHARE_FEED, SummaryActivity.CHECKED);
            }
            DanaH5.startContainerFullUrlWithSendCredentials$default(buildUpon.build().toString(), ServicesActivity.access$createH5AppListener(this.length), (Bundle) null, 4, (Object) null);
            this.length.setMin();
        }

        public final void onError(@Nullable String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append("on Error: ");
            sb.append(str);
            updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"id/dana/service/ServicesActivity$getServiceModule$1", "Lid/dana/contract/services/ServicesContract$View;", "onActionGet", "", "thirdPartyService", "Lid/dana/model/ThirdPartyService;", "onActionPost", "authCode", "", "onEmptySearchService", "onGetFilteredThirdPartyServices", "thirdPartyServices", "", "onGetInitThirdPartyServices", "onGetThirdPartyServices", "onMaintenanceAction", "onShowTooltip", "show", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements style.getMin {
        final /* synthetic */ ServicesActivity length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMax(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void setMin() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(ServicesActivity servicesActivity) {
            this.length = servicesActivity;
        }

        public final void setMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
            this.length.getMax(false);
            TextView textView = (TextView) this.length._$_findCachedViewById(resetInternal.setMax.setLayoutResource);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_search_result");
            if (textView.getVisibility() == 0) {
                ServicesActivity servicesActivity = this.length;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    if (hashSet.add(((ThirdPartyService) next).setMax)) {
                        arrayList.add(next);
                    }
                }
                ServicesActivity.access$setupServiceList(servicesActivity, CollectionsKt.toMutableList(arrayList));
                return;
            }
            ServicesActivity.access$setupServiceList(this.length, list);
        }

        public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
            Intrinsics.checkNotNullParameter(str, "authCode");
            ServicesActivity servicesActivity = this.length;
            String min = isShowMenu.setMin(thirdPartyService.toIntRange);
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(thirdPartyService.redirectUrl)");
            ServicesActivity.access$openH5(servicesActivity, thirdPartyService, min, str, this.length.getDeviceInformationProvider().getDeviceUUID());
        }

        public final void getMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
            ServicesActivity.access$setCategoryViewVisibility(this.length, false);
            if (list.isEmpty()) {
                ServicesActivity.access$showEmptyFilteredResult(this.length);
            } else {
                ServicesActivity.access$setupServiceList(this.length, list);
            }
        }

        public final void length() {
            this.length.getMax(true);
        }

        public final void getMax(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
            ((ServiceCategoryView) this.length._$_findCachedViewById(resetInternal.setMax.getPopupBackground)).onlyGetIncludedCategories(ServicesActivity.access$getListOfUniqueCategory(this.length, list));
            TextView textView = (TextView) this.length._$_findCachedViewById(resetInternal.setMax.setLayoutResource);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_search_result");
            if (textView.getVisibility() == 0) {
                ServicesActivity servicesActivity = this.length;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    if (hashSet.add(((ThirdPartyService) next).setMax)) {
                        arrayList.add(next);
                    }
                }
                ServicesActivity.access$setupServiceList(servicesActivity, CollectionsKt.toMutableList(arrayList));
                return;
            }
            ServicesActivity.access$setupServiceList(this.length, list);
        }

        public final void setMax(boolean z) {
            if (z) {
                ServicesActivity servicesActivity = this.length;
                ServicesActivity.access$showShowcase(servicesActivity, ServicesActivity.access$getTooltipTarget$p(servicesActivity));
            }
        }

        public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
            String str = thirdPartyService.IsOverlapping;
            if (str == null) {
                return;
            }
            if (isShowMenu.length(str)) {
                this.length.getReadLinkPropertiesPresenter().setMax(str);
                return;
            }
            ServicesActivity servicesActivity = this.length;
            String min = isShowMenu.setMin(str);
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(it)");
            ServicesActivity.access$openH5(servicesActivity, thirdPartyService, min, (String) null, (String) null);
        }

        public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
            if (thirdPartyService.values == 0) {
                StringBuilder sb = new StringBuilder("https://m.dana.id");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("/i/biller-app/maintenance?serviceName=%s", Arrays.copyOf(new Object[]{thirdPartyService.isInside}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                sb.append(format);
                DanaH5.startContainerFullUrl(sb.toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lid/dana/model/ThirdPartyService;", "kotlin.jvm.PlatformType", "getEditState", "id/dana/service/ServicesActivity$initAdapter$1$1"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements PhotoView.setMin {
        final /* synthetic */ ServicesActivity length;

        IsOverlapping(ServicesActivity servicesActivity) {
            this.length = servicesActivity;
        }

        public final int setMin(ThirdPartyService thirdPartyService) {
            if (((FavoriteServicesView) this.length._$_findCachedViewById(resetInternal.setMax.value)).isItemFull()) {
                return 0;
            }
            Intrinsics.checkNotNullExpressionValue(thirdPartyService, "it");
            return ((FavoriteServicesView) this.length._$_findCachedViewById(resetInternal.setMax.value)).containService(thirdPartyService) ? 0 : 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onViewHasAttached", "id/dana/service/ServicesActivity$initAdapter$1$2"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements PhotoView.length {
        final /* synthetic */ ServicesActivity getMax;

        isInside(ServicesActivity servicesActivity) {
            this.getMax = servicesActivity;
        }

        public final void setMin() {
            this.getMax.getPresenter().setMin("edit_favorite_service");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class values implements Ignore.setMin {
        final /* synthetic */ ServicesActivity length;

        values(ServicesActivity servicesActivity) {
            this.length = servicesActivity;
        }

        public final void length(int i) {
            if (!this.length.length(i)) {
                ((ToolbarSearchView) this.length._$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat)).hideKeyboard();
                ThirdPartyService thirdPartyService = (ThirdPartyService) ServicesActivity.access$getServiceAdapter$p(this.length).setMin(i);
                Context applicationContext = this.length.getApplicationContext();
                String str = thirdPartyService.setMax;
                String str2 = thirdPartyService.getMin;
                convertDipToPx.length length2 = new convertDipToPx.length(applicationContext);
                length2.getMax = TrackerKey.Event.SERVICE_OPEN;
                convertDipToPx.length max = length2.setMax(TrackerKey.ServiceProperty.SERVICE_NAME, str).setMax(TrackerKey.ServiceProperty.SERVICE_CATEGORY, str2);
                max.setMin();
                convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
                List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
                genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
                style.length presenter = this.length.getPresenter();
                Intrinsics.checkNotNullExpressionValue(thirdPartyService, FeatureParams.OPEN_SERVICE);
                presenter.getMax(thirdPartyService);
            }
        }
    }

    private final Ignore.setMin setMax() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1614952020, oncanceled);
            onCancelLoad.getMin(1614952020, oncanceled);
        }
        return new values(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements Ignore.setMin {
        final /* synthetic */ ServicesActivity getMin;

        setMax(ServicesActivity servicesActivity) {
            this.getMin = servicesActivity;
        }

        public final void length(int i) {
            ThirdPartyService thirdPartyService = (ThirdPartyService) ServicesActivity.access$getServiceAdapter$p(this.getMin).setMin(i);
            if (thirdPartyService != null && ((FavoriteServicesView) this.getMin._$_findCachedViewById(resetInternal.setMax.value)).replaceEmptyItem(thirdPartyService)) {
                ServicesActivity.access$getServiceAdapter$p(this.getMin).notifyDataSetChanged();
            }
        }
    }

    private final Ignore.setMin getMin() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1104924149, oncanceled);
            onCancelLoad.getMin(-1104924149, oncanceled);
        }
        return new setMax(this);
    }

    public final void setEditMode(boolean z) {
        Ignore.setMin setmin;
        if (this.getMax != z) {
            this.getMax = z;
            PhotoView photoView = this.isInside;
            if (photoView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
            }
            photoView.setMin(z);
            PhotoView photoView2 = this.isInside;
            if (photoView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
            }
            if (this.getMax) {
                setmin = getMin();
            } else {
                setmin = setMax();
            }
            photoView2.getMax(setmin);
            ((FavoriteServicesView) _$_findCachedViewById(resetInternal.setMax.value)).setOnEdit(z);
            dismissProgress dismissprogress = this.IsOverlapping;
            if (dismissprogress == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceItemDecorator");
            }
            dismissprogress.setMax = !z;
            ((ServiceCategoryView) _$_findCachedViewById(resetInternal.setMax.getPopupBackground)).hideFavoriteCategory(z);
            ((ToolbarSearchView) _$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat)).setSearchIconVisibility(z ? 4 : 0);
            if (z) {
                ((FavoriteServicesView) _$_findCachedViewById(resetInternal.setMax.value)).setFavoriteServiceActionListener(new ServicesActivity$FastBitmap$CoordinateSystem(this));
            } else {
                style.length length2 = this.presenter;
                if (length2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                length2.length();
            }
            ServiceCategoryView serviceCategoryView = (ServiceCategoryView) _$_findCachedViewById(resetInternal.setMax.getPopupBackground);
            Intrinsics.checkNotNullExpressionValue(serviceCategoryView, "scv_categories");
            if (!serviceCategoryView.isDefaultSelected()) {
                ServiceCategoryView serviceCategoryView2 = (ServiceCategoryView) _$_findCachedViewById(resetInternal.setMax.getPopupBackground);
                Intrinsics.checkNotNullExpressionValue(serviceCategoryView2, "scv_categories");
                serviceCategoryView2.setDefaultSelected(z);
            }
            ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.isOverflowMenuShowing)).smoothScrollToPosition(0);
        }
    }

    /* access modifiers changed from: private */
    public final boolean length(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-2064206047, oncanceled);
            onCancelLoad.getMin(-2064206047, oncanceled);
        }
        PhotoView photoView = this.isInside;
        if (photoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        if (photoView.getItemViewType(i) != 4) {
            return false;
        }
        setEditMode(!this.getMax);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"id/dana/service/ServicesActivity$getGridLayoutManager$1$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GridLayoutManager.length {
        final /* synthetic */ ServicesActivity getMax;
        final /* synthetic */ GridLayoutManager getMin;

        setMin(GridLayoutManager gridLayoutManager, ServicesActivity servicesActivity) {
            this.getMin = gridLayoutManager;
            this.getMax = servicesActivity;
        }

        public final int getMin(int i) {
            int itemViewType = ServicesActivity.access$getServiceAdapter$p(this.getMax).getItemViewType(i);
            if (itemViewType == 1 || itemViewType == 3) {
                return this.getMin.setMin;
            }
            return 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/service/ServicesActivity$createH5AppListener$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerDestroyed", "", "bundle", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements setCancelOnTouchOutside$core {
        final /* synthetic */ ServicesActivity getMin;

        @JvmDefault
        public final void onContainerCreated(@Nullable Bundle bundle) {
        }

        getMax(ServicesActivity servicesActivity) {
            this.getMin = servicesActivity;
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
            this.getMin.getH5EventPresenter().length();
            DanaH5.dispose();
            if (this.getMin.getMin) {
                this.getMin.getPlayStoreReviewPresenter().length();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -784910381 == (max = dispatchOnCancelled.getMax(applicationContext, -784910381)))) {
            onCanceled oncanceled = new onCanceled(-784910381, max, 512);
            onCancelLoad.setMax(-784910381, oncanceled);
            onCancelLoad.getMin(-784910381, oncanceled);
        }
        this.getMin = false;
        GriverManifest.AnonymousClass22.getMin getmin = this.h5EventPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("h5EventPresenter");
        }
        getmin.getMin();
    }

    /* access modifiers changed from: private */
    public final void getMax(boolean z) {
        int i = 0;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1899648339, oncanceled);
            onCancelLoad.getMin(-1899648339, oncanceled);
        }
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.isUsedOnShow);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view_search_not_found");
        _$_findCachedViewById.setVisibility(z ? 0 : 8);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.isOverflowMenuShowing);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "menu_service_list");
        if (z) {
            i = 8;
        }
        recyclerView.setVisibility(i);
    }

    public final void onBackPressed() {
        ToolbarSearchView toolbarSearchView = (ToolbarSearchView) _$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat);
        Intrinsics.checkNotNullExpressionValue(toolbarSearchView, "tsv_service");
        if (toolbarSearchView.getSearchStatus()) {
            ((ToolbarSearchView) _$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat)).hideSearchView();
        } else {
            super.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/service/ServicesActivity$showShowcase$1", "Lid/dana/showcase/AbstractOnShowcaseStateListener;", "onFinished", "", "actionType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class valueOf extends getMaxTextureSize {
        final /* synthetic */ ServicesActivity setMax;

        valueOf(ServicesActivity servicesActivity) {
            this.setMax = servicesActivity;
        }

        public final void onFinished(int i) {
            this.setMax.toFloatRange = null;
            this.setMax.getPresenter().getMin("edit_favorite_service");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/service/ServicesActivity$Companion;", "", "()V", "CONTAINER_PADDING_SIZE", "", "FILTER_BY", "", "FILTER_SERVICES", "OPEN_SERVICE", "SPOTLIGHT_SIZE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "categoryModel", "Lid/dana/richview/category/model/CategoryModel;", "kotlin.jvm.PlatformType", "isDefaultPosition", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class invoke implements CategoryView.setMin {
        final /* synthetic */ ServicesActivity length;

        invoke(ServicesActivity servicesActivity) {
            this.length = servicesActivity;
        }

        public final void setMin(CategoryModel categoryModel, boolean z) {
            if (z) {
                categoryModel.setMin = null;
            }
            style.length presenter = this.length.getPresenter();
            String str = categoryModel.setMin;
            if (str == null) {
                str = "";
            }
            presenter.length(str);
        }
    }

    public static final /* synthetic */ void access$setCategoryViewVisibility(ServicesActivity servicesActivity, boolean z) {
        ServiceCategoryView serviceCategoryView = (ServiceCategoryView) servicesActivity._$_findCachedViewById(resetInternal.setMax.getPopupBackground);
        Intrinsics.checkNotNullExpressionValue(serviceCategoryView, "scv_categories");
        serviceCategoryView.setVisibility(z ? 0 : 8);
    }

    public static final /* synthetic */ void access$showSearchHeader(ServicesActivity servicesActivity, boolean z) {
        TextView textView = (TextView) servicesActivity._$_findCachedViewById(resetInternal.setMax.setLayoutResource);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_search_result");
        textView.setVisibility(z ? 0 : 8);
    }

    public static final /* synthetic */ setCancelOnTouchOutside$core access$createH5AppListener(ServicesActivity servicesActivity) {
        return new getMax(servicesActivity);
    }

    public static final /* synthetic */ void access$setupServiceList(ServicesActivity servicesActivity, List list) {
        if (servicesActivity.getMax) {
            CollectionsKt.removeAll(list, toString.INSTANCE);
        }
        if (servicesActivity.setMax) {
            style.length length2 = servicesActivity.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length2.getMax((ThirdPartyService) list.get(0));
        }
        if ((!list.isEmpty()) && ((ThirdPartyService) list.get(list.size() - 1)).values == 4 && ((ThirdPartyService) list.get(list.size() - 2)).values == 3) {
            list.remove(list.size() - 2);
        }
        PhotoView photoView = servicesActivity.isInside;
        if (photoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        photoView.getMin(list);
        ((ServiceCategoryView) servicesActivity._$_findCachedViewById(resetInternal.setMax.getPopupBackground)).setListener(new invoke(servicesActivity));
    }

    public static final /* synthetic */ List access$getListOfUniqueCategory(ServicesActivity servicesActivity, List list) {
        Set linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((ThirdPartyService) it.next()).getMin;
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    public static final /* synthetic */ void access$showShowcase(ServicesActivity servicesActivity, setUseAmcsLite setuseamcslite) {
        if (servicesActivity.toFloatRange == null) {
            initRect initrect = new initRect(servicesActivity);
            initrect.toString = setuseamcslite;
            initRect initrect2 = (initRect) initrect.length(false);
            initrect2.values = "btnGotIt";
            servicesActivity.toFloatRange = ((initRect) ((initRect) initrect2.setMin((float) toIntRange)).setMin((PhotoView.FlingRunnable) new valueOf(servicesActivity))).length();
        }
    }

    public static final /* synthetic */ setUseAmcsLite access$getTooltipTarget$p(ServicesActivity servicesActivity) {
        View view;
        int min;
        int length2;
        View view2;
        RecyclerView.valueOf findViewHolderForLayoutPosition = ((RecyclerView) servicesActivity._$_findCachedViewById(resetInternal.setMax.isOverflowMenuShowing)).findViewHolderForLayoutPosition(8);
        if (findViewHolderForLayoutPosition == null || (view2 = findViewHolderForLayoutPosition.itemView) == null || (view = view2.findViewById(R.id.f54232131363981)) == null) {
            view = servicesActivity.findViewById(R.id.f54232131363981);
            Intrinsics.checkNotNullExpressionValue(view, "findViewById(R.id.lyt_custom_gridview)");
        }
        Context baseContext = servicesActivity.getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || R.string.text_tooltip_title_favorite_service == (length2 = dispatchOnCancelled.length(applicationContext, R.string.text_tooltip_title_favorite_service)))) {
            onCanceled oncanceled = new onCanceled(R.string.text_tooltip_title_favorite_service, length2, 4);
            onCancelLoad.setMax(-345371202, oncanceled);
            onCancelLoad.getMin(-345371202, oncanceled);
        }
        Context baseContext2 = servicesActivity.getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || R.string.text_tooltip_title_favorite_service == (min = dispatchOnCancelled.setMin(context, R.string.text_tooltip_title_favorite_service)))) {
            onCanceled oncanceled2 = new onCanceled(R.string.text_tooltip_title_favorite_service, min, 8);
            onCancelLoad.setMax(-345371202, oncanceled2);
            onCancelLoad.getMin(-345371202, oncanceled2);
        }
        int max = dispatchOnCancelled.getMax(R.string.text_tooltip_title_favorite_service);
        if (R.string.text_tooltip_title_favorite_service != max) {
            onCanceled oncanceled3 = new onCanceled(R.string.text_tooltip_title_favorite_service, max, 16);
            onCancelLoad.setMax(-345371202, oncanceled3);
            onCancelLoad.getMin(-345371202, oncanceled3);
        }
        setUseAmcsLite min2 = ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(servicesActivity).getMax(view)).setMin(new getUseSecurityGuard((float) equals))).getMin(new access$1402(servicesActivity.getString(R.string.text_tooltip_title_favorite_service), servicesActivity.getString(R.string.text_tooltip_description_favorite_service)))).getMin();
        Intrinsics.checkNotNullExpressionValue(min2, "TargetBuilder(this)\n    …n)))\n            .build()");
        return min2;
    }
}
