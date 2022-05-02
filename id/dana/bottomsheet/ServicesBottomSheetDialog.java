package id.dana.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.UrlTag;
import id.dana.di.modules.OauthModule;
import id.dana.model.ThirdPartyService;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.Ignore;
import o.IntRange;
import o.PrepareException;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.downloadApp;
import o.genTextSelector;
import o.getDuration;
import o.getPerformanceTracker;
import o.getRequiredTypeConverters;
import o.getScrimColor;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.order;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.stopIgnoring;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016*\u0001\u0006\u0018\u0000 [2\u00020\u0001:\u0002Z[B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\n\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u000200H\u0014J\u0006\u00101\u001a\u00020)J\b\u00102\u001a\u00020)H\u0014J\u0018\u00103\u001a\u00020)2\u0006\u00104\u001a\u0002002\u0006\u00105\u001a\u000200H\u0014J\u0016\u00106\u001a\u00020)2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\b\u0010:\u001a\u00020)H\u0002J\b\u0010;\u001a\u00020)H\u0002J\b\u0010<\u001a\u00020=H\u0014J\u0016\u0010>\u001a\u00020=2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002090@H\u0002J\u0016\u0010A\u001a\u00020=2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002090@H\u0002J\u0016\u0010B\u001a\u00020=2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002090@H\u0002J\b\u0010C\u001a\u00020)H\u0014J\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u000200H\u0002J\b\u0010I\u001a\u00020)H\u0014J\u0010\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u000209H\u0002J\b\u0010L\u001a\u00020)H\u0016J\u0012\u0010M\u001a\u00020)2\b\u0010N\u001a\u0004\u0018\u00010FH\u0002J.\u0010O\u001a\u00020)2\b\u0010K\u001a\u0004\u0018\u0001092\u0006\u0010P\u001a\u00020F2\b\u0010Q\u001a\u0004\u0018\u00010F2\b\u0010R\u001a\u0004\u0018\u00010FH\u0002J\u0010\u0010S\u001a\u00020)2\u0006\u0010K\u001a\u000209H\u0002J\u0010\u0010T\u001a\u00020)2\u0006\u0010U\u001a\u00020FH\u0002J\b\u0010V\u001a\u00020)H\u0002J\b\u0010W\u001a\u00020)H\u0002J\b\u0010X\u001a\u00020)H\u0002J\u0006\u0010Y\u001a\u00020)R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001d\u0010#\u001a\u0004\u0018\u00010$8BX\u0002¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b%\u0010&¨\u0006\\"}, d2 = {"Lid/dana/bottomsheet/ServicesBottomSheetDialog;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "params", "Lid/dana/bottomsheet/ServicesBottomSheetDialog$Builder;", "(Lid/dana/bottomsheet/ServicesBottomSheetDialog$Builder;)V", "bottomSheetCallback", "id/dana/bottomsheet/ServicesBottomSheetDialog$bottomSheetCallback$2$1", "getBottomSheetCallback", "()Lid/dana/bottomsheet/ServicesBottomSheetDialog$bottomSheetCallback$2$1;", "bottomSheetCallback$delegate", "Lkotlin/Lazy;", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "getDeviceInformationProvider", "()Lid/dana/data/config/DeviceInformationProvider;", "setDeviceInformationProvider", "(Lid/dana/data/config/DeviceInformationProvider;)V", "presenter", "Lid/dana/contract/services/ServicesContract$Presenter;", "getPresenter", "()Lid/dana/contract/services/ServicesContract$Presenter;", "setPresenter", "(Lid/dana/contract/services/ServicesContract$Presenter;)V", "readLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "servicesBottomSheetListAdapter", "Lid/dana/bottomsheet/ServicesBottomSheetListAdapter;", "servicesContractView", "Lid/dana/contract/services/ServicesContract$View;", "getServicesContractView", "()Lid/dana/contract/services/ServicesContract$View;", "skeletonShimmering", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "getSkeletonShimmering", "()Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "skeletonShimmering$delegate", "checkItemSize", "", "forceFullscrenDialog", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "hideShimmer", "init", "initBottomSheet", "peekHeight", "bottomSheetState", "initListView", "services", "", "Lid/dana/model/ThirdPartyService;", "initViews", "injectComponent", "isFullDialogHeightRequired", "", "isLastBlank", "thirdPartyServices", "", "isLastItemBlank", "needOpenServiceDirectly", "onDismiss", "onFailInvoke", "message", "", "onItemClicked", "position", "onShow", "onSingleItem", "thirdPartyService", "onStart", "onSucceedOpenFeature", "serviceKey", "openH5", "url", "authcode", "requestId", "openService", "setTitle", "title", "setupBottomSheet", "setupCloseButton", "setupListView", "showShimmer", "Builder", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ServicesBottomSheetDialog extends order {
    @NotNull
    public static final length getMax = new length((byte) 0);
    private final Lazy IsOverlapping = LazyKt.lazy(new getMax(this));
    @Inject
    public getPerformanceTracker deviceInformationProvider;
    /* access modifiers changed from: private */
    public final getMin equals;
    final Lazy getMin = LazyKt.lazy(new toString(this));
    private HashMap isInside;
    @Inject
    public style.length presenter;
    @Inject
    public getDuration.length readLinkPropertiesPresenter;
    private getRequiredTypeConverters toFloatRange;

    public final int getMin() {
        return R.layout.view_bottom_sheet_list;
    }

    public final float length() {
        return 0.5f;
    }

    public final View setMin(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final boolean t_() {
        return false;
    }

    public static final /* synthetic */ getRequiredTypeConverters setMax(ServicesBottomSheetDialog servicesBottomSheetDialog) {
        getRequiredTypeConverters getrequiredtypeconverters = servicesBottomSheetDialog.toFloatRange;
        if (getrequiredtypeconverters == null) {
            Intrinsics.throwUninitializedPropertyAccessException("servicesBottomSheetListAdapter");
        }
        return getrequiredtypeconverters;
    }

    public ServicesBottomSheetDialog(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        this.equals = getmin;
        AppCompatDelegate.getMin(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function0<getScrimColor> {
        final /* synthetic */ ServicesBottomSheetDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(ServicesBottomSheetDialog servicesBottomSheetDialog) {
            super(0);
            this.this$0 = servicesBottomSheetDialog;
        }

        @Nullable
        public final getScrimColor invoke() {
            RecyclerView recyclerView = (RecyclerView) this.this$0.setMin(resetInternal.setMax.setCustomSelectionActionModeCallback);
            if (recyclerView == null) {
                return null;
            }
            getScrimColor.getMax getmax = new getScrimColor.getMax(recyclerView);
            getmax.length = ServicesBottomSheetDialog.setMax(this.this$0);
            getmax.getMax = R.layout.viewholder_bottomsheet_space_item;
            getmax.IsOverlapping = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
            getmax.setMin = 8;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.toIntRange = 20;
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            return getscrimcolor;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "id/dana/bottomsheet/ServicesBottomSheetDialog$bottomSheetCallback$2$1", "invoke", "()Lid/dana/bottomsheet/ServicesBottomSheetDialog$bottomSheetCallback$2$1;"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<AnonymousClass3> {
        final /* synthetic */ ServicesBottomSheetDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(ServicesBottomSheetDialog servicesBottomSheetDialog) {
            super(0);
            this.this$0 = servicesBottomSheetDialog;
        }

        @NotNull
        public final AnonymousClass3 invoke() {
            return new BottomSheetBehavior.BottomSheetCallback(this) {
                final /* synthetic */ getMax getMin;

                public final void onSlide(@NotNull View view, float f) {
                    Intrinsics.checkNotNullParameter(view, "bottomSheet");
                }

                {
                    this.getMin = r1;
                }

                public final void onStateChanged(@NotNull View view, int i) {
                    Intrinsics.checkNotNullParameter(view, "bottomSheet");
                    if (5 == i) {
                        Function0<Unit> function0 = this.getMin.this$0.equals.setMin;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        this.getMin.this$0.dismissAllowingStateLoss();
                    }
                }
            };
        }
    }

    @Nullable
    public final FrameLayout getMax() {
        return (FrameLayout) setMin(resetInternal.setMax.RequiresPermission);
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
            view.post(new setMin(view, findViewById));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "id/dana/bottomsheet/ServicesBottomSheetDialog$forceFullscrenDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Runnable {
        final /* synthetic */ View length;
        final /* synthetic */ View setMin;

        setMin(View view, View view2) {
            this.length = view;
            this.setMin = view2;
        }

        public final void run() {
            ViewParent parent = this.length.getParent();
            if (parent != null) {
                ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
                if (layoutParams != null) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.length) layoutParams).setMin;
                    if (behavior != null) {
                        ((BottomSheetBehavior) behavior).setPeekHeight(this.length.getMeasuredHeight());
                        View view = this.setMin;
                        ViewParent parent2 = view != null ? view.getParent() : null;
                        if (parent2 != null) {
                            ((View) parent2).setBackgroundColor(0);
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
        super.setMax();
        downloadApp.getMin getmin = new downloadApp.getMin((byte) 0);
        if (PrepareException.getMin != null) {
            PrepareException.AnonymousClass1 r2 = PrepareException.getMin.setMax;
            if (r2 != null) {
                getmin.toFloatRange = r2;
                DeepLinkModule.setMin max = DeepLinkModule.getMax();
                max.getMax = requireActivity();
                max.length = TrackerKey.SourceType.SERVICES;
                getmin.getMin = new DeepLinkModule(max, (byte) 0);
                ScanQrModule.setMin max2 = ScanQrModule.getMax();
                max2.setMin = requireActivity();
                getmin.setMax = new ScanQrModule(max2, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = requireActivity();
                getmin.setMin = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length2 = FeatureModule.length();
                length2.setMax = requireActivity();
                getmin.length = new FeatureModule(length2, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = requireActivity();
                getmin.toIntRange = new OauthModule(min2, (byte) 0);
                getmin.getMax = new ServicesModule((style.getMin) new setMax(this));
                if (getmin.getMax == null) {
                    getmin.getMax = new ServicesModule();
                }
                stopIgnoring.setMin(getmin.getMin, DeepLinkModule.class);
                stopIgnoring.setMin(getmin.setMax, ScanQrModule.class);
                stopIgnoring.setMin(getmin.setMin, RestoreUrlModule.class);
                stopIgnoring.setMin(getmin.length, FeatureModule.class);
                stopIgnoring.setMin(getmin.toIntRange, OauthModule.class);
                stopIgnoring.setMin(getmin.toFloatRange, PrepareException.AnonymousClass1.class);
                new downloadApp(getmin.getMax, getmin.getMin, getmin.setMax, getmin.setMin, getmin.length, getmin.toIntRange, getmin.toFloatRange, (byte) 0).setMin(this);
                return;
            }
            throw null;
        }
        throw new IllegalStateException("Application components needs to be set in Application");
    }

    public final void setMin(int i, int i2) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        WindowManager windowManager = requireActivity.getWindowManager();
        Intrinsics.checkNotNullExpressionValue(windowManager, "requireActivity().windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        super.setMin(i, i2);
    }

    private static boolean setMax(List<ThirdPartyService> list) {
        return list.size() == 2 && getMax(list);
    }

    private static boolean getMax(List<ThirdPartyService> list) {
        CharSequence charSequence = list.get(list.size() - 1).getMin;
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    private static boolean getMin(List<ThirdPartyService> list) {
        return list.size() == 1 || setMax(list);
    }

    public final void setMin() {
        super.setMin();
        setMin(setMin(getDialog()), 3);
        BottomSheetBehavior bottomSheetBehavior = this.length;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setBottomSheetCallback((getMax.AnonymousClass3) this.IsOverlapping.getValue());
        }
        FrameLayout frameLayout = (FrameLayout) setMin(resetInternal.setMax.RequiresPermission);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new equals(this));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnCancelListener(new IsOverlapping(this));
        }
        getRequiredTypeConverters getrequiredtypeconverters = new getRequiredTypeConverters();
        getrequiredtypeconverters.getMax((Ignore.setMin) new isInside(this));
        Unit unit = Unit.INSTANCE;
        this.toFloatRange = getrequiredtypeconverters;
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.setCustomSelectionActionModeCallback);
        if (recyclerView != null) {
            recyclerView.post(new values(this));
        }
        ImageView imageView = (ImageView) setMin(resetInternal.setMax.createEditText);
        if (imageView != null) {
            imageView.post(new toIntRange(this));
        }
        String str = this.equals.setMax;
        TextView textView = (TextView) setMin(resetInternal.setMax.getMinWidthMajor);
        if (textView != null) {
            textView.post(new toFloatRange(this, str));
        }
        String str2 = this.equals.length;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != 225857941) {
                if (hashCode == 1304545364 && str2.equals("CATEGORY_SERVICE")) {
                    style.length length2 = this.presenter;
                    if (length2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    }
                    List<String> list = this.equals.getMin;
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    length2.length(list);
                }
            } else if (str2.equals("SERVICE_KEY")) {
                style.length length3 = this.presenter;
                if (length3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                List<String> list2 = this.equals.getMin;
                if (list2 == null) {
                    list2 = CollectionsKt.emptyList();
                }
                length3.getMax(list2, "key", true);
            }
        } else {
            style.length length4 = this.presenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length4.length(true);
        }
    }

    public final void IsOverlapping() {
        style.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.setMax();
        getDuration.length length3 = this.readLinkPropertiesPresenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
        }
        length3.setMax();
        DanaH5.dispose();
        super.IsOverlapping();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ ServicesBottomSheetDialog getMin;

        equals(ServicesBottomSheetDialog servicesBottomSheetDialog) {
            this.getMin = servicesBottomSheetDialog;
        }

        public final void onClick(View view) {
            Function0<Unit> function0 = this.getMin.equals.setMin;
            if (function0 != null) {
                function0.invoke();
            }
            this.getMin.dismissAllowingStateLoss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements DialogInterface.OnCancelListener {
        final /* synthetic */ ServicesBottomSheetDialog length;

        IsOverlapping(ServicesBottomSheetDialog servicesBottomSheetDialog) {
            this.length = servicesBottomSheetDialog;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Function0<Unit> function0 = this.length.equals.setMin;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onItemClick", "id/dana/bottomsheet/ServicesBottomSheetDialog$setupListView$1$1"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements Ignore.setMin {
        final /* synthetic */ ServicesBottomSheetDialog getMax;

        isInside(ServicesBottomSheetDialog servicesBottomSheetDialog) {
            this.getMax = servicesBottomSheetDialog;
        }

        public final void length(int i) {
            ServicesBottomSheetDialog.getMax(this.getMax, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class values implements Runnable {
        final /* synthetic */ ServicesBottomSheetDialog getMin;

        values(ServicesBottomSheetDialog servicesBottomSheetDialog) {
            this.getMin = servicesBottomSheetDialog;
        }

        public final void run() {
            RecyclerView recyclerView = (RecyclerView) this.getMin.setMin(resetInternal.setMax.setCustomSelectionActionModeCallback);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_bottom_sheet");
            recyclerView.setAdapter(ServicesBottomSheetDialog.setMax(this.getMin));
            RecyclerView recyclerView2 = (RecyclerView) this.getMin.setMin(resetInternal.setMax.setCustomSelectionActionModeCallback);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv_bottom_sheet");
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getMin.requireContext(), 4);
            gridLayoutManager.toIntRange = new length(gridLayoutManager, this);
            Unit unit = Unit.INSTANCE;
            recyclerView2.setLayoutManager(gridLayoutManager);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"id/dana/bottomsheet/ServicesBottomSheetDialog$setupListView$2$1$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length extends GridLayoutManager.length {
            final /* synthetic */ values getMax;
            final /* synthetic */ GridLayoutManager setMin;

            length(GridLayoutManager gridLayoutManager, values values) {
                this.setMin = gridLayoutManager;
                this.getMax = values;
            }

            public final int getMin(int i) {
                if (ServicesBottomSheetDialog.setMax(this.getMax.getMin).getItemViewType(i) != 3) {
                    return 1;
                }
                return this.setMin.setMin;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements Runnable {
        final /* synthetic */ ServicesBottomSheetDialog getMax;

        toIntRange(ServicesBottomSheetDialog servicesBottomSheetDialog) {
            this.getMax = servicesBottomSheetDialog;
        }

        public final void run() {
            ((ImageView) this.getMax.setMin(resetInternal.setMax.createEditText)).setImageDrawable(IntRange.length(this.getMax.requireContext(), (int) R.drawable.ic_close_grey));
            ((ImageView) this.getMax.setMin(resetInternal.setMax.createEditText)).setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ toIntRange getMin;

                {
                    this.getMin = r1;
                }

                public final void onClick(View view) {
                    Function0<Unit> function0 = this.getMin.getMax.equals.setMin;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, d2 = {"id/dana/bottomsheet/ServicesBottomSheetDialog$servicesContractView$1", "Lid/dana/contract/services/ServicesContract$View;", "dismissProgress", "", "onActionFailed", "message", "", "onActionGet", "thirdPartyService", "Lid/dana/model/ThirdPartyService;", "onActionPost", "authCode", "onError", "errorMessage", "onGetFilteredThirdPartyServices", "thirdPartyServices", "", "onGetThirdPartyServices", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements style.getMin {
        final /* synthetic */ ServicesBottomSheetDialog length;

        @JvmDefault
        public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
        }

        @JvmDefault
        public final void getMax(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void length() {
        }

        @JvmDefault
        public final void setMax(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void setMax(boolean z) {
        }

        setMax(ServicesBottomSheetDialog servicesBottomSheetDialog) {
            this.length = servicesBottomSheetDialog;
        }

        public final void onError(@Nullable String str) {
            ServicesBottomSheetDialog.setMax(this.length, "FAIL_FETCH_SERVICES");
        }

        public final void showProgress() {
            getScrimColor getscrimcolor = (getScrimColor) this.length.getMin.getValue();
            if (getscrimcolor != null) {
                getscrimcolor.getMin();
            }
        }

        public final void dismissProgress() {
            getScrimColor getscrimcolor = (getScrimColor) this.length.getMin.getValue();
            if (getscrimcolor != null) {
                getscrimcolor.getMax.setAdapter(getscrimcolor.length);
            }
        }

        public final void setMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
            if (list.isEmpty()) {
                ServicesBottomSheetDialog.setMax(this.length, "FAIL_EMPTY_SERVICE");
            } else {
                ServicesBottomSheetDialog.getMin(this.length, list);
            }
        }

        public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
            Intrinsics.checkNotNullParameter(str, "authCode");
            ServicesBottomSheetDialog servicesBottomSheetDialog = this.length;
            String str2 = thirdPartyService.toIntRange;
            if (str2 == null) {
                str2 = "";
            }
            getPerformanceTracker getperformancetracker = this.length.deviceInformationProvider;
            if (getperformancetracker == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceInformationProvider");
            }
            ServicesBottomSheetDialog.setMax(servicesBottomSheetDialog, thirdPartyService, str2, str, getperformancetracker.getDeviceUUID());
            ServicesBottomSheetDialog.length(this.length, thirdPartyService.setMax);
        }

        public final void setMin() {
            ServicesBottomSheetDialog.setMax(this.length, "FAIL_DO_ACTION");
        }

        public final void getMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
            if (list.isEmpty()) {
                ServicesBottomSheetDialog.setMax(this.length, "FAIL_EMPTY_SERVICE");
            } else {
                ServicesBottomSheetDialog.getMin(this.length, list);
            }
        }

        public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
            String str = thirdPartyService.setMin;
            if (str != null) {
                DanaH5.openApp$default(str, (Bundle) null, 2, (Object) null);
                return;
            }
            CharSequence charSequence = thirdPartyService.IsOverlapping;
            if (!(charSequence == null || charSequence.length() == 0)) {
                if (isShowMenu.length(thirdPartyService.IsOverlapping)) {
                    getDuration.length length2 = this.length.readLinkPropertiesPresenter;
                    if (length2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("readLinkPropertiesPresenter");
                    }
                    String str2 = thirdPartyService.IsOverlapping;
                    if (str2 == null) {
                        str2 = "";
                    }
                    length2.setMax(str2);
                } else {
                    ServicesBottomSheetDialog servicesBottomSheetDialog = this.length;
                    String min = isShowMenu.setMin(thirdPartyService.IsOverlapping);
                    Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(thirdPartyService.link)");
                    ServicesBottomSheetDialog.setMax(servicesBottomSheetDialog, thirdPartyService, min, (String) null, (String) null);
                }
                ServicesBottomSheetDialog.length(this.length, thirdPartyService.setMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements Runnable {
        final /* synthetic */ String length;
        final /* synthetic */ ServicesBottomSheetDialog setMax;

        toFloatRange(ServicesBottomSheetDialog servicesBottomSheetDialog, String str) {
            this.setMax = servicesBottomSheetDialog;
            this.length = str;
        }

        public final void run() {
            TextView textView = (TextView) this.setMax.setMin(resetInternal.setMax.getMinWidthMajor);
            Intrinsics.checkNotNullExpressionValue(textView, "title_bottom_sheet");
            textView.setText(this.length);
        }
    }

    private final void getMin(ThirdPartyService thirdPartyService) {
        Context context = getContext();
        String str = thirdPartyService.setMax;
        String str2 = thirdPartyService.getMin;
        convertDipToPx.length length2 = new convertDipToPx.length(context);
        length2.getMax = TrackerKey.Event.SERVICE_OPEN;
        convertDipToPx.length max = length2.setMax(TrackerKey.ServiceProperty.SERVICE_NAME, str).setMax(TrackerKey.ServiceProperty.SERVICE_CATEGORY, str2);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        style.length length4 = this.presenter;
        if (length4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getActivity();
        length4.getMax(thirdPartyService);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012%\b\u0002\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e\u0012%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\b\u0010(\u001a\u00020)H\u0002J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ)\u0010\u000f\u001a\u00020\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\f0\bJ)\u0010\u0007\u001a\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\f0\bJ\u000e\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,J\u001c\u0010-\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0003R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R7\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR7\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lid/dana/bottomsheet/ServicesBottomSheetDialog$Builder;", "", "title", "", "query", "values", "", "onSuccessOpenService", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "serviceKey", "", "onClickCloseOrSwipedDown", "Lkotlin/Function0;", "onFail", "cause", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "getOnClickCloseOrSwipedDown", "()Lkotlin/jvm/functions/Function0;", "setOnClickCloseOrSwipedDown", "(Lkotlin/jvm/functions/Function0;)V", "getOnFail", "()Lkotlin/jvm/functions/Function1;", "setOnFail", "(Lkotlin/jvm/functions/Function1;)V", "getOnSuccessOpenService", "setOnSuccessOpenService", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "getSource", "setSource", "getTitle", "getValues", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "build", "Lid/dana/bottomsheet/ServicesBottomSheetDialog;", "show", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "withQuery", "withSource", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @Nullable
        public Function1<? super String, Unit> IsOverlapping;
        @Nullable
        public Function1<? super String, Unit> getMax;
        @Nullable
        public List<String> getMin;
        @Nullable
        public String length;
        @NotNull
        public final String setMax;
        @Nullable
        public Function0<Unit> setMin;
        @NotNull
        public String toFloatRange;

        private getMin(@NotNull String str, @Nullable String str2, @Nullable List<String> list, @Nullable Function1<? super String, Unit> function1, @Nullable Function0<Unit> function0, @Nullable Function1<? super String, Unit> function12, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(str3, "source");
            this.setMax = str;
            this.length = str2;
            this.getMin = list;
            this.getMax = function1;
            this.setMin = function0;
            this.IsOverlapping = function12;
            this.toFloatRange = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ getMin(String str, String str2, List list, Function1 function1, Function0 function0, Function1 function12, String str3, int i) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? null : function12, (i & 64) != 0 ? "" : str3);
        }

        @NotNull
        public final getMin getMin(@NotNull String str, @NotNull List<String> list) {
            int length2 = str.length();
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(-1086866332, oncanceled);
                onCancelLoad.getMin(-1086866332, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "query");
            Intrinsics.checkNotNullParameter(list, "values");
            getMin getmin = this;
            getmin.length = str;
            getmin.getMin = list;
            return getmin;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/bottomsheet/ServicesBottomSheetDialog$Companion;", "", "()V", "DIM_AMOUNT", "", "FAIL_DO_ACTION", "", "FAIL_EMPTY_SERVICE", "FAIL_FETCH_SERVICES", "FIRST_INDEX", "", "H5_URL_QUERY_AUTH_CODE", "H5_URL_QUERY_REQUEST_ID", "ONLY_ONE", "ONLY_ONE_WITH_BLANK_ITEM", "QUERY_CATEGORY_SERVICE", "QUERY_SERVICE_KEY", "SERVICE_BOTTOM_SHEET_DIALOG", "SHIMMER_ANGLE", "SHIMMER_COUNT_ITEM", "SHIMMER_DURATION", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void getMax(ServicesBottomSheetDialog servicesBottomSheetDialog, int i) {
        getRequiredTypeConverters getrequiredtypeconverters = servicesBottomSheetDialog.toFloatRange;
        if (getrequiredtypeconverters == null) {
            Intrinsics.throwUninitializedPropertyAccessException("servicesBottomSheetListAdapter");
        }
        ThirdPartyService thirdPartyService = (ThirdPartyService) getrequiredtypeconverters.setMin(i);
        if (thirdPartyService != null) {
            servicesBottomSheetDialog.getMin(thirdPartyService);
        }
    }

    public static final /* synthetic */ void setMax(ServicesBottomSheetDialog servicesBottomSheetDialog, String str) {
        Function1<? super String, Unit> function1 = servicesBottomSheetDialog.equals.IsOverlapping;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    public static final /* synthetic */ void getMin(ServicesBottomSheetDialog servicesBottomSheetDialog, List list) {
        getRequiredTypeConverters getrequiredtypeconverters = servicesBottomSheetDialog.toFloatRange;
        if (getrequiredtypeconverters == null) {
            Intrinsics.throwUninitializedPropertyAccessException("servicesBottomSheetListAdapter");
        }
        getrequiredtypeconverters.getMin(list);
        getRequiredTypeConverters getrequiredtypeconverters2 = servicesBottomSheetDialog.toFloatRange;
        if (getrequiredtypeconverters2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("servicesBottomSheetListAdapter");
        }
        List max = getrequiredtypeconverters2.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "this");
        if (getMin((List<ThirdPartyService>) max)) {
            boolean z = false;
            Object obj = max.get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "get(FIRST_INDEX)");
            ThirdPartyService thirdPartyService = (ThirdPartyService) obj;
            CharSequence charSequence = thirdPartyService.setMax;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if ((z ^ true ? thirdPartyService : null) != null) {
                servicesBottomSheetDialog.getMin(thirdPartyService);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) servicesBottomSheetDialog.setMin(resetInternal.setMax.restoreActionViewStates);
                Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "layout_coordinator");
                coordinatorLayout.setVisibility(8);
            }
        }
    }

    public static final /* synthetic */ void setMax(ServicesBottomSheetDialog servicesBottomSheetDialog, ThirdPartyService thirdPartyService, String str, String str2, String str3) {
        String str4;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (str2 != null) {
            buildUpon.appendQueryParameter("authCode", str2);
        }
        if (str3 != null) {
            buildUpon.appendQueryParameter("requestId", str3);
        }
        if (thirdPartyService != null) {
            str4 = thirdPartyService.setMax;
        } else {
            str4 = null;
        }
        if (Intrinsics.areEqual((Object) str4, (Object) "service_akulaku")) {
            Bundle bundle = new Bundle();
            bundle.putString("url", buildUpon.appendQueryParameter(UrlTag.ENTRY_POINT, servicesBottomSheetDialog.equals.toFloatRange).build().toString());
            bundle.putString("adjustResize", "YES");
            DanaH5.startContainerFullUrlWithSendCredentials$default((String) null, (setCancelOnTouchOutside$core) null, bundle, 3, (Object) null);
            return;
        }
        DanaH5.startContainerFullUrlWithSendCredentials$default(buildUpon.build().toString(), (setCancelOnTouchOutside$core) null, (Bundle) null, 6, (Object) null);
    }

    public static final /* synthetic */ void length(ServicesBottomSheetDialog servicesBottomSheetDialog, String str) {
        Function1<? super String, Unit> function1 = servicesBottomSheetDialog.equals.getMax;
        if (function1 != null) {
            Intrinsics.checkNotNull(str);
            function1.invoke(str);
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
