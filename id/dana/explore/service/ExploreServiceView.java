package id.dana.explore.service;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.ExploreServiceModule;
import id.dana.di.modules.OauthModule;
import id.dana.model.ThirdPartyService;
import id.dana.service.ServicesActivity;
import id.dana.tracker.TrackerKey;
import id.dana.usereducation.constant.BottomSheetType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.BluetoothLeUtils;
import o.ISnapshotProxy;
import o.Ignore;
import o.IntRange;
import o.MyBeacon;
import o.PrepareException;
import o.getBluetoothAdapterState;
import o.getDuration;
import o.getTxPowerLevel;
import o.getUUIDFromString;
import o.onBeaconUpdate;
import o.onDelete;
import o.resetInternal;
import o.stopIgnoring;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010\"\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0$H\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\b\u0010&\u001a\u00020\u001aH\u0002J\b\u0010'\u001a\u00020\u001aH\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lid/dana/explore/service/ExploreServiceView;", "Lid/dana/base/BaseRichView;", "Lid/dana/explore/service/ExploreServiceContract$View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "presenter", "Lid/dana/explore/service/ExploreServiceContract$Presenter;", "getPresenter", "()Lid/dana/explore/service/ExploreServiceContract$Presenter;", "setPresenter", "(Lid/dana/explore/service/ExploreServiceContract$Presenter;)V", "readDeepLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadDeepLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadDeepLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "serviceAdapter", "Lid/dana/explore/adapter/ExploreServiceAdapter;", "getLayout", "initServiceList", "", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "navigateToMaintenance", "item", "Lid/dana/explore/service/model/ExploreServiceModel;", "navigateToService", "onGetExploreService", "list", "", "setup", "setupAllServiceButton", "setupViewElevation", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ExploreServiceView extends BaseRichView implements BluetoothLeUtils.setMax {
    private HashMap getMax;
    @Inject
    public BluetoothLeUtils.setMin presenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    private getTxPowerLevel setMax;

    @JvmOverloads
    public ExploreServiceView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ExploreServiceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @JvmDefault
    public final void dismissProgress() {
    }

    public final int getLayout() {
        return R.layout.view_explore_service;
    }

    @JvmDefault
    public final void onError(@Nullable String str) {
    }

    @JvmDefault
    public final void showProgress() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExploreServiceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExploreServiceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final getDuration.length getReadDeepLinkPropertiesPresenter() {
        getDuration.length length2 = this.readDeepLinkPropertiesPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
        }
        return length2;
    }

    public final void setReadDeepLinkPropertiesPresenter(@NotNull getDuration.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.readDeepLinkPropertiesPresenter = length2;
    }

    @NotNull
    public final BluetoothLeUtils.setMin getPresenter() {
        BluetoothLeUtils.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return setmin;
    }

    public final void setPresenter(@NotNull BluetoothLeUtils.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.presenter = setmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ ExploreServiceView getMin;

        getMin(ExploreServiceView exploreServiceView) {
            this.getMin = exploreServiceView;
        }

        public final void onClick(View view) {
            this.getMin.getContext().startActivity(new Intent(this.getMin.getContext(), ServicesActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/explore/service/ExploreServiceView$injectComponent$1", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onItemClick", "id/dana/explore/service/ExploreServiceView$initServiceList$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements Ignore.setMin {
        final /* synthetic */ ExploreServiceView setMax;
        final /* synthetic */ getTxPowerLevel setMin;

        length(getTxPowerLevel gettxpowerlevel, ExploreServiceView exploreServiceView) {
            this.setMin = gettxpowerlevel;
            this.setMax = exploreServiceView;
        }

        public final void length(int i) {
            if (((getUUIDFromString) this.setMin.setMin(i)).setMin.setMin()) {
                ExploreServiceView.access$navigateToService(this.setMax, ((getUUIDFromString) this.setMin.setMin(i)).setMin);
            } else {
                ExploreServiceView.access$navigateToMaintenance(this.setMax, ((getUUIDFromString) this.setMin.setMin(i)).setMin);
            }
        }
    }

    public final void onGetExploreService(@NotNull List<MyBeacon> list) {
        Intrinsics.checkNotNullParameter(list, BottomSheetType.LIST);
        getTxPowerLevel gettxpowerlevel = this.setMax;
        if (gettxpowerlevel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        List max = gettxpowerlevel.getMax();
        Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
        CollectionsKt.removeAll(max, getTxPowerLevel.setMin.INSTANCE);
        gettxpowerlevel.notifyDataSetChanged();
        if (list.isEmpty()) {
            setVisibility(8);
            return;
        }
        getTxPowerLevel gettxpowerlevel2 = this.setMax;
        if (gettxpowerlevel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MyBeacon myBeacon = (MyBeacon) next;
            boolean z = true;
            if (i != list.size() - 1) {
                z = false;
            }
            arrayList.add(new getUUIDFromString(0, myBeacon, z));
            i = i2;
        }
        Iterable iterable2 = (List) arrayList;
        int i3 = 3;
        if (list.size() <= 3) {
            i3 = list.size();
        }
        gettxpowerlevel2.getMin(CollectionsKt.take(iterable2, i3));
    }

    public final void setup() {
        getTxPowerLevel gettxpowerlevel = new getTxPowerLevel();
        gettxpowerlevel.getMax((Ignore.setMin) new length(gettxpowerlevel, this));
        Unit unit = Unit.INSTANCE;
        this.setMax = gettxpowerlevel;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatMultiAutoCompleteTextView);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            getTxPowerLevel gettxpowerlevel2 = this.setMax;
            if (gettxpowerlevel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
            }
            recyclerView.setAdapter(gettxpowerlevel2);
        }
        getTxPowerLevel gettxpowerlevel3 = this.setMax;
        if (gettxpowerlevel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceAdapter");
        }
        gettxpowerlevel3.getMax().add(new getUUIDFromString(1, new MyBeacon((String) null, (String) null, (String) null, (String) null, false, 31), false));
        gettxpowerlevel3.notifyDataSetChanged();
        if (Build.VERSION.SDK_INT >= 28) {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$CustomAction);
            if (constraintLayout != null) {
                constraintLayout.setElevation(constraintLayout.getResources().getDimension(R.dimen.f26252131165272));
                constraintLayout.setOutlineAmbientShadowColor(IntRange.setMax(constraintLayout.getContext(), R.color.f21822131100099));
                constraintLayout.setOutlineSpotShadowColor(IntRange.setMax(constraintLayout.getContext(), R.color.f21822131100099));
            }
        } else {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$CustomAction);
            if (constraintLayout2 != null) {
                View view = constraintLayout2;
                Intrinsics.checkNotNullParameter(view, "$this$elevate");
                Resources system = Resources.getSystem();
                Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
                getBluetoothAdapterState.getMin(view, (int) TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            }
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchTypefaceByIndex);
        if (textView != null) {
            textView.setOnClickListener(new getMin(this));
        }
        BluetoothLeUtils.setMin setmin = this.presenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmin.length();
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r14) {
        ISnapshotProxy.length length2 = new ISnapshotProxy.length((byte) 0);
        if (r14 != null) {
            length2.isInside = r14;
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            max.getMax = getBaseActivity();
            max.length = TrackerKey.SourceType.SERVICES;
            length2.setMax = new DeepLinkModule(max, (byte) 0);
            length2.IsOverlapping = new ServicesModule((style.getMin) new setMax());
            ScanQrModule.setMin max2 = ScanQrModule.getMax();
            max2.setMin = getBaseActivity();
            length2.length = new ScanQrModule(max2, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = getBaseActivity();
            length2.getMin = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length3 = FeatureModule.length();
            length3.setMax = getBaseActivity();
            length2.setMin = new FeatureModule(length3, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = getBaseActivity();
            length2.getMax = new OauthModule(min2, (byte) 0);
            length2.toIntRange = new ExploreServiceModule(this);
            stopIgnoring.setMin(length2.setMax, DeepLinkModule.class);
            stopIgnoring.setMin(length2.length, ScanQrModule.class);
            stopIgnoring.setMin(length2.getMin, RestoreUrlModule.class);
            stopIgnoring.setMin(length2.setMin, FeatureModule.class);
            stopIgnoring.setMin(length2.getMax, OauthModule.class);
            if (length2.IsOverlapping == null) {
                length2.IsOverlapping = new ServicesModule();
            }
            stopIgnoring.setMin(length2.toIntRange, ExploreServiceModule.class);
            stopIgnoring.setMin(length2.isInside, PrepareException.AnonymousClass1.class);
            new ISnapshotProxy(length2.setMax, length2.length, length2.getMin, length2.setMin, length2.getMax, length2.IsOverlapping, length2.toIntRange, length2.isInside, (byte) 0).getMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            BluetoothLeUtils.setMin setmin = this.presenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = setmin;
            getDuration.length length4 = this.readDeepLinkPropertiesPresenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
            }
            getminArr[1] = length4;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$navigateToService(ExploreServiceView exploreServiceView, MyBeacon myBeacon) {
        getDuration.length length2 = exploreServiceView.readDeepLinkPropertiesPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
        }
        onBeaconUpdate onbeaconupdate = onBeaconUpdate.setMax;
        length2.setMax(onBeaconUpdate.getMin(myBeacon.getMax));
    }

    public static final /* synthetic */ void access$navigateToMaintenance(ExploreServiceView exploreServiceView, MyBeacon myBeacon) {
        StringBuilder sb = new StringBuilder("https://m.dana.id");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("/i/biller-app/maintenance?serviceName=%s", Arrays.copyOf(new Object[]{myBeacon.setMax}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        DanaH5.startContainerFullUrl(sb.toString());
    }
}
