package id.dana.promocenter.views;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.common.view.CheckboxView;
import id.dana.dialog.DialogPermission;
import id.dana.richview.category.model.CategoryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.GriverProgressBar;
import o.GriverSessionDataPoint;
import o.RedDotDrawable;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.appendAppLog;
import o.from;
import o.isLayoutRtlSupport;
import o.preInstallH5Auto;
import o.resetInternal;
import o.setContentType;
import o.setStateOn;
import o.uploadCoreByStartService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010$\u001a\u00020\u0019H\u0002J\u0016\u0010%\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\fH\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u0007H\u0016J\b\u0010,\u001a\u00020\u0018H\u0002J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00100\u001a\u00020\u00182\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\b\u00102\u001a\u00020\u0019H\u0002J\u0006\u00103\u001a\u00020\u0019J\u0012\u00104\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u00105\u001a\u00020\u0018H\u0002J\b\u00106\u001a\u00020\u0019H\u0002J \u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020;H\u0002J\u0018\u0010<\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00072\u0006\u0010:\u001a\u00020;H\u0002J\u0012\u0010=\u001a\u00020\u00192\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J+\u0010@\u001a\u00020\u00192\u0006\u0010A\u001a\u00020\u00072\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170C2\u0006\u0010D\u001a\u00020E¢\u0006\u0002\u0010FJ\u0010\u0010G\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/H\u0002J\u0006\u0010H\u001a\u00020\u0019J\u0010\u0010I\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010/J\u0018\u0010J\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u0018H\u0002J\b\u0010M\u001a\u00020\u0019H\u0016J\b\u0010N\u001a\u00020\u0019H\u0002J\u0006\u0010O\u001a\u00020\u0019J\b\u0010P\u001a\u00020\u0019H\u0002J\b\u0010Q\u001a\u00020\u0019H\u0002J\b\u0010R\u001a\u00020\u0019H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R,\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u000e\u0010!\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R*\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b#\u0010\u0010¨\u0006S"}, d2 = {"Lid/dana/promocenter/views/PromoCenterBottomMenuView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dialogLocationPermission", "Lid/dana/dialog/DialogPermission;", "value", "", "Lid/dana/common/model/OptionModel;", "filterOptions", "setFilterOptions", "(Ljava/util/List;)V", "locationPermission", "Lid/dana/utils/permission/Permission;", "locationSettingsObserver", "Lio/reactivex/disposables/Disposable;", "onSubmitFilterClicked", "Lkotlin/Function2;", "", "", "", "getOnSubmitFilterClicked", "()Lkotlin/jvm/functions/Function2;", "setOnSubmitFilterClicked", "(Lkotlin/jvm/functions/Function2;)V", "onSubmitSortClicked", "getOnSubmitSortClicked", "setOnSubmitSortClicked", "selectedSortIndex", "sortOptions", "setSortOptions", "checkLocationPermission", "checkLocationPermissionResult", "permissionReports", "Lid/dana/utils/permission/Permission$PermissionReport;", "checkLocationService", "createLocationPermission", "disposeLocationSettingsObserver", "getLayout", "hasLocationPermission", "hasOptions", "categoryModel", "Lid/dana/richview/category/model/CategoryModel;", "hasValue", "list", "hideFilterRedDot", "hideMenu", "isFilterNeedLocation", "isLocationEnable", "onFilterChange", "onFilterChecked", "checkedFilterIndex", "checked", "bottomSheetFilter", "Lid/dana/promocenter/views/BottomSheetFilter;", "onFilterNeedSpecialService", "onLocationSettingNext", "locationSettingsResult", "Lcom/google/android/gms/location/LocationSettingsResult;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onShowMenu", "setDefault", "setOnCategoryChange", "setSelectedSortByIndex", "selectedIndex", "needRefresh", "setup", "showFilterBottomSheet", "showMenu", "showPopUpLocationPermission", "showSettingLocationPermission", "showSortBottomSheet", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PromoCenterBottomMenuView extends BaseRichView {
    private HashMap IsOverlapping;
    @NotNull
    private Function2<? super String, ? super Boolean, Unit> equals;
    private List<isLayoutRtlSupport> getMax;
    /* access modifiers changed from: private */
    public DialogPermission getMin;
    private GriverProgressBar.UpdateRunnable length;
    /* access modifiers changed from: private */
    public List<isLayoutRtlSupport> setMax;
    private int setMin;
    private setStateOn toFloatRange;
    @NotNull
    private Function2<? super String, ? super Boolean, Unit> toIntRange;

    @JvmOverloads
    public PromoCenterBottomMenuView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public PromoCenterBottomMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_promocenter_bottom_menu;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "selectedIndex", "", "invoke", "id/dana/promocenter/views/PromoCenterBottomMenuView$showSortBottomSheet$1$1"}, k = 3, mv = {1, 4, 2})
    static final class hashCode extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ setContentType $this_run;
        final /* synthetic */ PromoCenterBottomMenuView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        hashCode(setContentType setcontenttype, PromoCenterBottomMenuView promoCenterBottomMenuView) {
            super(1);
            this.$this_run = setcontenttype;
            this.this$0 = promoCenterBottomMenuView;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            if (i >= 0) {
                this.this$0.getMin(i, true);
                this.$this_run.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lcom/google/android/gms/location/LocationSettingsResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class length extends FunctionReferenceImpl implements Function1<LocationSettingsResult, Unit> {
        length(PromoCenterBottomMenuView promoCenterBottomMenuView) {
            super(1, promoCenterBottomMenuView, PromoCenterBottomMenuView.class, "onLocationSettingNext", "onLocationSettingNext(Lcom/google/android/gms/location/LocationSettingsResult;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LocationSettingsResult) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable LocationSettingsResult locationSettingsResult) {
            PromoCenterBottomMenuView.access$onLocationSettingNext((PromoCenterBottomMenuView) this.receiver, locationSettingsResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "position", "", "checked", "", "invoke", "id/dana/promocenter/views/PromoCenterBottomMenuView$showFilterBottomSheet$1$1"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function2<Integer, Boolean, Unit> {
        final /* synthetic */ preInstallH5Auto $this_run;
        final /* synthetic */ PromoCenterBottomMenuView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(preInstallH5Auto preinstallh5auto, PromoCenterBottomMenuView promoCenterBottomMenuView) {
            super(2);
            this.$this_run = preinstallh5auto;
            this.this$0 = promoCenterBottomMenuView;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, boolean z) {
            if (this.this$0.setMax.size() > i) {
                PromoCenterBottomMenuView.access$onFilterChecked(this.this$0, i, z, this.$this_run);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function2<String, Boolean, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(2);
        }

        public final void invoke(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function2<String, Boolean, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(2);
        }

        public final void invoke(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PromoCenterBottomMenuView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PromoCenterBottomMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = -1;
        this.getMax = CollectionsKt.emptyList();
        this.setMax = CollectionsKt.emptyList();
        this.toIntRange = setMin.INSTANCE;
        this.equals = getMin.INSTANCE;
    }

    /* access modifiers changed from: private */
    public final void setMin(List<isLayoutRtlSupport> list) {
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (!TextUtils.isEmpty(((isLayoutRtlSupport) next).setMax)) {
                arrayList.add(next);
            }
        }
        List<isLayoutRtlSupport> list2 = (List) arrayList;
        for (isLayoutRtlSupport islayoutrtlsupport : list2) {
            islayoutrtlsupport.getMax = false;
        }
        this.setMax = list2;
    }

    @NotNull
    public final Function2<String, Boolean, Unit> getOnSubmitSortClicked() {
        return this.toIntRange;
    }

    public final void setOnSubmitSortClicked(@NotNull Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.toIntRange = function2;
    }

    @NotNull
    public final Function2<String, Boolean, Unit> getOnSubmitFilterClicked() {
        return this.equals;
    }

    public final void setOnSubmitFilterClicked(@NotNull Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.equals = function2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ PromoCenterBottomMenuView setMax;

        setMax(PromoCenterBottomMenuView promoCenterBottomMenuView) {
            this.setMax = promoCenterBottomMenuView;
        }

        public final void onClick(View view) {
            PromoCenterBottomMenuView.access$showSortBottomSheet(this.setMax);
        }
    }

    public final void setup() {
        ((LinearLayout) _$_findCachedViewById(resetInternal.setMax.findGroupIndex)).setOnClickListener(new setMax(this));
        ((LinearLayout) _$_findCachedViewById(resetInternal.setMax.hasVisibleItems)).setOnClickListener(new IsOverlapping(this));
        setStateOn.getMin getmin = new setStateOn.getMin((Activity) getBaseActivity());
        getmin.length.add("android.permission.ACCESS_FINE_LOCATION");
        getmin.getMin = new getMax(this);
        this.toFloatRange = new setStateOn(getmin, (byte) 0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ PromoCenterBottomMenuView getMin;

        IsOverlapping(PromoCenterBottomMenuView promoCenterBottomMenuView) {
            this.getMin = promoCenterBottomMenuView;
        }

        public final void onClick(View view) {
            PromoCenterBottomMenuView.access$showFilterBottomSheet(this.getMin);
        }
    }

    private static boolean setMin(String str) {
        if (TextUtils.isEmpty(str) || !StringsKt.equals("NEAREST_LOCATION", str, true)) {
            return false;
        }
        return true;
    }

    private final boolean getMin() {
        return WheelView.ScrollerTask.getMax(getContext());
    }

    private final boolean setMin() {
        return WheelView.ScrollerTask.length(getContext());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/promocenter/views/PromoCenterBottomMenuView$showFilterBottomSheet$1$2"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<Unit> {
        final /* synthetic */ preInstallH5Auto $this_run;
        final /* synthetic */ PromoCenterBottomMenuView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(preInstallH5Auto preinstallh5auto, PromoCenterBottomMenuView promoCenterBottomMenuView) {
            super(0);
            this.$this_run = preinstallh5auto;
            this.this$0 = promoCenterBottomMenuView;
        }

        public final void invoke() {
            String str = "";
            int i = 0;
            for (Object next : this.this$0.setMax) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                isLayoutRtlSupport islayoutrtlsupport = (isLayoutRtlSupport) next;
                if (islayoutrtlsupport.setMin()) {
                    if (i > 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(",");
                        str = sb.toString();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(islayoutrtlsupport.setMin);
                    str = sb2.toString();
                }
                i = i2;
            }
            PromoCenterBottomMenuView.access$onFilterChange(this.this$0);
            this.this$0.getOnSubmitFilterClicked().invoke(str, Boolean.TRUE);
            this.$this_run.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/promocenter/views/PromoCenterBottomMenuView$showFilterBottomSheet$1$3"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function0<Unit> {
        final /* synthetic */ preInstallH5Auto $this_run;
        final /* synthetic */ PromoCenterBottomMenuView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(preInstallH5Auto preinstallh5auto, PromoCenterBottomMenuView promoCenterBottomMenuView) {
            super(0);
            this.$this_run = preinstallh5auto;
            this.this$0 = promoCenterBottomMenuView;
        }

        public final void invoke() {
            for (isLayoutRtlSupport islayoutrtlsupport : this.this$0.setMax) {
                islayoutrtlsupport.getMax = false;
            }
            PromoCenterBottomMenuView.access$hideFilterRedDot(this.this$0);
            ((CheckboxView) this.$this_run.getMin(resetInternal.setMax.ChecksSdkIntAtLeast)).notifyAdapter();
        }
    }

    /* access modifiers changed from: private */
    public final void getMin(int i, boolean z) {
        PromoCenterBottomMenuView promoCenterBottomMenuView = i >= 0 && this.getMax.size() > i ? this : null;
        if (promoCenterBottomMenuView != null) {
            promoCenterBottomMenuView.setMin = i;
            promoCenterBottomMenuView.toIntRange.invoke(promoCenterBottomMenuView.getMax.get(i).setMin, Boolean.valueOf(z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/utils/permission/Permission$PermissionReport;", "kotlin.jvm.PlatformType", "", "onPermissionsChecked"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements setStateOn.getMax {
        final /* synthetic */ PromoCenterBottomMenuView setMin;

        getMax(PromoCenterBottomMenuView promoCenterBottomMenuView) {
            this.setMin = promoCenterBottomMenuView;
        }

        public final void setMax(List<setStateOn.setMin> list) {
            PromoCenterBottomMenuView promoCenterBottomMenuView = this.setMin;
            Intrinsics.checkNotNullExpressionValue(list, "it");
            PromoCenterBottomMenuView.access$checkLocationPermissionResult(promoCenterBottomMenuView, list);
        }
    }

    public final void showMenu() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getAnimatedVisibility);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mainRoot");
        constraintLayout.setVisibility(((this.getMax.isEmpty() ^ true) || (this.setMax.isEmpty() ^ true)) ? 0 : 8);
    }

    public final void hideMenu() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getAnimatedVisibility);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mainRoot");
        constraintLayout.setVisibility(8);
    }

    private static boolean setMax(List<isLayoutRtlSupport> list) {
        return list != null && (list.isEmpty() ^ true);
    }

    private final void length() {
        if (!setMin()) {
            GriverProgressBar.UpdateRunnable updateRunnable = this.length;
            if (updateRunnable != null) {
                updateRunnable.dispose();
            }
            this.length = null;
            WheelView.ScrollerTask.getMax getmax = new WheelView.ScrollerTask.getMax(getContext());
            getmax.setMin.setAlwaysShow(true);
            LocationSettingsRequest.Builder builder = getmax.setMin;
            LocationRequest create = LocationRequest.create();
            create.setPriority(100);
            create.setInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            create.setFastestInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            builder.addLocationRequest(create);
            uploadCoreByStartService uploadcorebystartservice = getmax.getMax;
            LocationSettingsRequest build = getmax.setMin.build();
            GriverProgressBar.UpdateRunnable subscribe = appendAppLog.setMax(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax, LocationServices.API).flatMap(new RedDotDrawable<GoogleApiClient, TitleBarRightButtonView.AnonymousClass1<LocationSettingsResult>>(build) {
                final /* synthetic */ LocationSettingsRequest getMin;

                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
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
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
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
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final /* synthetic */ java.lang.Object apply(
/*
Method generation error in method: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }).subscribe(new GriverSessionDataPoint(new length(this)));
            this.length = subscribe;
            addDisposable(subscribe);
        }
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        setStateOn setstateon = this.toFloatRange;
        if (setstateon != null) {
            setstateon.getMin(i, strArr, iArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements DialogInterface.OnDismissListener {
        final /* synthetic */ PromoCenterBottomMenuView getMax;

        isInside(PromoCenterBottomMenuView promoCenterBottomMenuView) {
            this.getMax = promoCenterBottomMenuView;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.getMax.getMin = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"id/dana/promocenter/views/PromoCenterBottomMenuView$showPopUpLocationPermission$2", "Lid/dana/dialog/DialogPermission$DialogListener;", "onDialogDismissed", "", "onNegativeButtonClicked", "onPositiveButtonClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange implements DialogPermission.length {
        final /* synthetic */ PromoCenterBottomMenuView setMax;

        public final void onDialogDismissed() {
        }

        toDoubleRange(PromoCenterBottomMenuView promoCenterBottomMenuView) {
            this.setMax = promoCenterBottomMenuView;
        }

        public final void onPositiveButtonClicked() {
            PromoCenterBottomMenuView.access$checkLocationPermission(this.setMax);
            DialogPermission access$getDialogLocationPermission$p = this.setMax.getMin;
            if (access$getDialogLocationPermission$p != null) {
                access$getDialogLocationPermission$p.setMax();
            }
        }

        public final void onNegativeButtonClicked() {
            DialogPermission access$getDialogLocationPermission$p = this.setMax.getMin;
            if (access$getDialogLocationPermission$p != null) {
                access$getDialogLocationPermission$p.setMax();
            }
        }
    }

    public final void setOnCategoryChange(@Nullable CategoryModel categoryModel) {
        if (categoryModel != null) {
            setMin(categoryModel.length);
            Collection arrayList = new ArrayList();
            for (Object next : categoryModel.equals) {
                if (!TextUtils.isEmpty(((isLayoutRtlSupport) next).setMax)) {
                    arrayList.add(next);
                }
            }
            List<isLayoutRtlSupport> list = (List) arrayList;
            int i = 0;
            for (Object next2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((isLayoutRtlSupport) next2).setMin()) {
                    this.setMin = i;
                }
                i = i2;
            }
            this.getMax = list;
            getMin(this.setMin, false);
        }
        if (categoryModel == null || !getMax(categoryModel)) {
            hideMenu();
            return;
        }
        showMenu();
        if (setMax(categoryModel.length) && setMax(categoryModel.equals)) {
            View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.maxSize);
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getAnimatedVisibility);
            from from = new from();
            from.setMax(constraintLayout);
            from.length(_$_findCachedViewById.getId(), 7, 0, 7, 0);
            from.setMin(constraintLayout);
            View _$_findCachedViewById2 = _$_findCachedViewById(resetInternal.setMax.maxSize);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getAnimatedVisibility);
            from from2 = new from();
            from2.setMax(constraintLayout2);
            from2.length(_$_findCachedViewById2.getId(), 6, 0, 6, 0);
            from2.setMin(constraintLayout2);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.hasVisibleItems);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llFilter");
            linearLayout.setVisibility(0);
            View _$_findCachedViewById3 = _$_findCachedViewById(resetInternal.setMax.maxSize);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "viewDivider");
            _$_findCachedViewById3.setVisibility(0);
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.findGroupIndex);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llSort");
            linearLayout2.setVisibility(0);
        } else if (setMax(categoryModel.length)) {
            LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.findGroupIndex);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "llSort");
            linearLayout3.setVisibility(8);
            View _$_findCachedViewById4 = _$_findCachedViewById(resetInternal.setMax.maxSize);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "viewDivider");
            _$_findCachedViewById4.setVisibility(8);
            View _$_findCachedViewById5 = _$_findCachedViewById(resetInternal.setMax.maxSize);
            ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getAnimatedVisibility);
            from from3 = new from();
            from3.setMax(constraintLayout3);
            from3.setMax(_$_findCachedViewById5.getId(), 7);
            from3.setMin(constraintLayout3);
            LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.hasVisibleItems);
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "llFilter");
            linearLayout4.setVisibility(0);
        } else {
            View _$_findCachedViewById6 = _$_findCachedViewById(resetInternal.setMax.maxSize);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById6, "viewDivider");
            _$_findCachedViewById6.setVisibility(8);
            LinearLayout linearLayout5 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.hasVisibleItems);
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "llFilter");
            linearLayout5.setVisibility(8);
            View _$_findCachedViewById7 = _$_findCachedViewById(resetInternal.setMax.maxSize);
            ConstraintLayout constraintLayout4 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getAnimatedVisibility);
            from from4 = new from();
            from4.setMax(constraintLayout4);
            from4.setMax(_$_findCachedViewById7.getId(), 6);
            from4.setMin(constraintLayout4);
            LinearLayout linearLayout6 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.findGroupIndex);
            Intrinsics.checkNotNullExpressionValue(linearLayout6, "llSort");
            linearLayout6.setVisibility(0);
        }
    }

    private static boolean getMax(CategoryModel categoryModel) {
        return !setMax(categoryModel.length) || setMax(categoryModel.equals);
    }

    public final void setDefault() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.supportNavigateUpTo);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivRedDot");
        appCompatImageView.setVisibility(8);
        for (isLayoutRtlSupport islayoutrtlsupport : this.setMax) {
            islayoutrtlsupport.getMax = false;
        }
        for (isLayoutRtlSupport islayoutrtlsupport2 : this.getMax) {
            islayoutrtlsupport2.getMax = false;
        }
        this.setMin = -1;
    }

    public static final /* synthetic */ void access$showSortBottomSheet(PromoCenterBottomMenuView promoCenterBottomMenuView) {
        BaseActivity baseActivity = promoCenterBottomMenuView.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "baseActivity.supportFragmentManager");
        setContentType setcontenttype = new setContentType(supportFragmentManager, promoCenterBottomMenuView.getMax);
        setcontenttype.equals = promoCenterBottomMenuView.setMin;
        Function1<? super Integer, Unit> hashcode = new hashCode(setcontenttype, promoCenterBottomMenuView);
        Intrinsics.checkNotNullParameter(hashcode, "<set-?>");
        setcontenttype.getMax = hashcode;
        setcontenttype.show(setcontenttype.getMin, "Radio Button Bottom Sheet");
    }

    public static final /* synthetic */ void access$showFilterBottomSheet(PromoCenterBottomMenuView promoCenterBottomMenuView) {
        BaseActivity baseActivity = promoCenterBottomMenuView.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "baseActivity.supportFragmentManager");
        preInstallH5Auto preinstallh5auto = new preInstallH5Auto(supportFragmentManager, promoCenterBottomMenuView.setMax);
        Function2<? super Integer, ? super Boolean, Unit> tointrange = new toIntRange(preinstallh5auto, promoCenterBottomMenuView);
        Intrinsics.checkNotNullParameter(tointrange, "<set-?>");
        preinstallh5auto.isInside = tointrange;
        Function0<Unit> tofloatrange = new toFloatRange(preinstallh5auto, promoCenterBottomMenuView);
        Intrinsics.checkNotNullParameter(tofloatrange, "<set-?>");
        preinstallh5auto.getMin = tofloatrange;
        Function0<Unit> equals2 = new equals(preinstallh5auto, promoCenterBottomMenuView);
        Intrinsics.checkNotNullParameter(equals2, "<set-?>");
        preinstallh5auto.getMax = equals2;
        preinstallh5auto.show(preinstallh5auto.equals, "Filter Bottom Sheet");
    }

    public static final /* synthetic */ void access$onFilterChecked(PromoCenterBottomMenuView promoCenterBottomMenuView, int i, boolean z, preInstallH5Auto preinstallh5auto) {
        if (!setMin(promoCenterBottomMenuView.setMax.get(i).setMin) || !z) {
            promoCenterBottomMenuView.setMax.get(i).getMax = z;
        } else if (!promoCenterBottomMenuView.getMin() || !promoCenterBottomMenuView.setMin()) {
            DialogPermission.setMin setmin = new DialogPermission.setMin(promoCenterBottomMenuView.getBaseActivity(), new isInside(promoCenterBottomMenuView));
            setmin.setMin = R.drawable.ic_location_graphic;
            setmin.getMax = promoCenterBottomMenuView.getContext().getString(R.string.popup_location_desc);
            setmin.length = promoCenterBottomMenuView.getContext().getString(R.string.popup_location_title);
            setmin.IsOverlapping = promoCenterBottomMenuView.getContext().getString(R.string.popup_location_positive_button);
            setmin.isInside = promoCenterBottomMenuView.getContext().getString(R.string.popup_location_negative_button);
            setmin.FastBitmap$CoordinateSystem = new toDoubleRange(promoCenterBottomMenuView);
            DialogPermission dialogPermission = new DialogPermission(setmin.getMin, setmin.setMax, setmin, (byte) 0);
            promoCenterBottomMenuView.getMin = dialogPermission;
            if (dialogPermission != null) {
                dialogPermission.setMin();
            }
            preinstallh5auto.dismiss();
        } else {
            promoCenterBottomMenuView.setMax.get(i).getMax = true;
        }
    }

    public static final /* synthetic */ void access$onFilterChange(PromoCenterBottomMenuView promoCenterBottomMenuView) {
        Collection arrayList = new ArrayList();
        for (Object next : promoCenterBottomMenuView.setMax) {
            if (((isLayoutRtlSupport) next).setMin()) {
                arrayList.add(next);
            }
        }
        if (!((List) arrayList).isEmpty()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) promoCenterBottomMenuView._$_findCachedViewById(resetInternal.setMax.supportNavigateUpTo);
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivRedDot");
            appCompatImageView.setVisibility(0);
            return;
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) promoCenterBottomMenuView._$_findCachedViewById(resetInternal.setMax.supportNavigateUpTo);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "ivRedDot");
        appCompatImageView2.setVisibility(8);
    }

    public static final /* synthetic */ void access$hideFilterRedDot(PromoCenterBottomMenuView promoCenterBottomMenuView) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) promoCenterBottomMenuView._$_findCachedViewById(resetInternal.setMax.supportNavigateUpTo);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivRedDot");
        appCompatImageView.setVisibility(8);
    }

    public static final /* synthetic */ void access$checkLocationPermissionResult(PromoCenterBottomMenuView promoCenterBottomMenuView, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            setStateOn.setMin setmin = (setStateOn.setMin) it.next();
            if (Intrinsics.areEqual((Object) "android.permission.ACCESS_FINE_LOCATION", (Object) setmin.getMin) && setmin.setMax()) {
                promoCenterBottomMenuView.length();
            }
        }
    }

    public static final /* synthetic */ void access$onLocationSettingNext(PromoCenterBottomMenuView promoCenterBottomMenuView, LocationSettingsResult locationSettingsResult) {
        if (locationSettingsResult == null || locationSettingsResult.getStatus() == null) {
            promoCenterBottomMenuView.getContext().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } else {
            Status status = locationSettingsResult.getStatus();
            Intrinsics.checkNotNullExpressionValue(status, "status");
            int statusCode = status.getStatusCode();
            if (statusCode == 6) {
                PendingIntent resolution = status.getResolution();
                if ((resolution != null ? resolution.getIntentSender() : null) != null) {
                    BaseActivity baseActivity = promoCenterBottomMenuView.getBaseActivity();
                    PendingIntent resolution2 = status.getResolution();
                    try {
                        baseActivity.startIntentSenderForResult(resolution2 != null ? resolution2.getIntentSender() : null, 100, (Intent) null, 0, 0, 0, (Bundle) null);
                    } catch (IntentSender.SendIntentException unused) {
                    }
                } else {
                    promoCenterBottomMenuView.getContext().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                }
            } else if (statusCode != 8502) {
                promoCenterBottomMenuView.getContext().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        }
        GriverProgressBar.UpdateRunnable updateRunnable = promoCenterBottomMenuView.length;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        promoCenterBottomMenuView.length = null;
    }

    public static final /* synthetic */ void access$checkLocationPermission(PromoCenterBottomMenuView promoCenterBottomMenuView) {
        if (!promoCenterBottomMenuView.getMin()) {
            setStateOn setstateon = promoCenterBottomMenuView.toFloatRange;
            if (setstateon != null) {
                setstateon.setMin();
                return;
            }
            return;
        }
        promoCenterBottomMenuView.length();
    }
}
