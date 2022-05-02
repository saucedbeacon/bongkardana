package id.dana.richview.camera;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.otaliastudios.cameraview.CameraException;
import com.otaliastudios.cameraview.CameraView;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.gesture.Gesture;
import com.otaliastudios.cameraview.gesture.GestureAction;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.richview.camera.DanaCameraAttributesHints;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RecyclerView;
import o.RedDotManager;
import o.TitleBarRightButtonView;
import o.calculateDtToFit;
import o.getEdgeEffectFactory;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.resetInternal;
import o.setStateOn;
import o.updateActionForInterimTarget;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 32\u00020\u0001:\u000234B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0007H\u0016J+\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\u0006\u0010%\u001a\u00020\u0011J\u001c\u0010&\u001a\u00020\u00142\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u0014H\u0002J\u000e\u0010+\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ\b\u0010,\u001a\u00020\u0014H\u0002J\b\u0010-\u001a\u00020\u0014H\u0016J\b\u0010.\u001a\u00020\u0014H\u0002J\u0010\u0010/\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010\u001fJ\u0006\u00101\u001a\u00020\u0014J\u0006\u00102\u001a\u00020\u0014R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lid/dana/richview/camera/DanaCameraView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "actionButtonVisibility", "danaCameraListener", "Lid/dana/richview/camera/DanaCameraView$DanaCameraListener;", "permission", "Lid/dana/utils/permission/Permission;", "pinchToZoom", "", "retry", "checkDelayTrial", "", "checkPermission", "doDelayAutoFocusActivation", "enableAutoFocus", "getFlash", "Lcom/otaliastudios/cameraview/controls/Flash;", "getLayout", "hasPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)Z", "initCameraView", "isAutoFocusSupported", "isTakingPicture", "parseAttrs", "setActionButtonVisibility", "styleAttributes", "Landroid/content/res/TypedArray;", "setAutoFocusConfig", "setDanaCameraListener", "setPinchToZoomAction", "setup", "showActionButton", "showToast", "message", "takePicture", "toggleTorch", "Companion", "DanaCameraListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaCameraView extends BaseRichView {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private setStateOn getMax;
    private boolean getMin;
    private int length;
    /* access modifiers changed from: private */
    public getMin setMax;
    private int setMin;
    private HashMap toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/richview/camera/DanaCameraView$DanaCameraListener;", "", "onCameraPermissionDenied", "", "onImageCaptured", "result", "Lcom/otaliastudios/cameraview/PictureResult;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void setMax(@NotNull calculateDtToFit calculatedttofit);

        void setMin();
    }

    @JvmOverloads
    public DanaCameraView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public DanaCameraView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_dana_camera;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DanaCameraView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DanaCameraView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public DanaCameraView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        Resources.Theme theme;
        if (attributeSet != null && context != null && (theme = context.getTheme()) != null) {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, resetInternal.getMin.cancelNotification, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(a…0,\n                    0)");
            if (obtainStyledAttributes.hasValue(0)) {
                this.setMin = obtainStyledAttributes.getInt(0, DanaCameraAttributesHints.ActionButton.SHOW.getVisibility()) == DanaCameraAttributesHints.ActionButton.SHOW.getVisibility() ? 0 : 8;
            }
            this.getMin = obtainStyledAttributes.getBoolean(1, false);
        }
    }

    public final void setup() {
        checkPermission();
    }

    public final void checkPermission() {
        if (this.getMax == null) {
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) getBaseActivity());
            Collections.addAll(getmin.length, new String[]{"android.permission.CAMERA", "android.permission.CAMERA"});
            getmin.getMin = new length(this);
            this.getMax = new setStateOn(getmin, (byte) 0);
        }
        setStateOn setstateon = this.getMax;
        if (setstateon != null) {
            setstateon.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/utils/permission/Permission$PermissionReport;", "kotlin.jvm.PlatformType", "", "onPermissionsChecked"}, k = 3, mv = {1, 4, 2})
    static final class length implements setStateOn.getMax {
        final /* synthetic */ DanaCameraView getMax;

        length(DanaCameraView danaCameraView) {
            this.getMax = danaCameraView;
        }

        public final void setMax(List<setStateOn.setMin> list) {
            if (list != null && (!list.isEmpty())) {
                setStateOn.setMin setmin = list.get(0);
                Intrinsics.checkNotNullExpressionValue(setmin, "it[0]");
                if (setmin.setMax()) {
                    DanaCameraView.access$initCameraView(this.getMax);
                    return;
                }
            }
            getMin access$getDanaCameraListener$p = this.getMax.setMax;
            if (access$getDanaCameraListener$p != null) {
                access$getDanaCameraListener$p.setMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ DanaCameraView setMin;

        setMin(DanaCameraView danaCameraView) {
            this.setMin = danaCameraView;
        }

        public final void onClick(View view) {
            ((CameraView) this.setMin._$_findCachedViewById(resetInternal.setMax.onSessionDestroyed)).takePicture();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ DanaCameraView getMax;

        toIntRange(DanaCameraView danaCameraView) {
            this.getMax = danaCameraView;
        }

        public final void onClick(View view) {
            this.getMax.toggleTorch();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/richview/camera/DanaCameraView$initCameraView$3", "Lcom/otaliastudios/cameraview/CameraListener;", "onCameraError", "", "exception", "Lcom/otaliastudios/cameraview/CameraException;", "onPictureTaken", "result", "Lcom/otaliastudios/cameraview/PictureResult;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends updateActionForInterimTarget {
        final /* synthetic */ DanaCameraView getMax;

        toFloatRange(DanaCameraView danaCameraView) {
            this.getMax = danaCameraView;
        }

        public final void setMin(@NotNull calculateDtToFit calculatedttofit) {
            Intrinsics.checkNotNullParameter(calculatedttofit, "result");
            super.setMin(calculatedttofit);
            getMin access$getDanaCameraListener$p = this.getMax.setMax;
            if (access$getDanaCameraListener$p != null) {
                access$getDanaCameraListener$p.setMax(calculatedttofit);
            }
        }

        public final void length(@NotNull CameraException cameraException) {
            Intrinsics.checkNotNullParameter(cameraException, "exception");
            super.length(cameraException);
            this.getMax.showToast(String.valueOf(cameraException.getReason()));
            updateActionSheetContent.e(DanaLogConstants.TAG.DANA_CAMERA, cameraException.getMessage());
        }
    }

    private final void length() {
        addDisposable(TitleBarRightButtonView.AnonymousClass1.timer(300, TimeUnit.MILLISECONDS, getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(new getMax(this)));
    }

    private final boolean setMax() {
        RecyclerView cameraOptions;
        CameraView cameraView = (CameraView) _$_findCachedViewById(resetInternal.setMax.onSessionDestroyed);
        if (cameraView == null || (cameraOptions = cameraView.getCameraOptions()) == null) {
            return false;
        }
        return cameraOptions.getMin();
    }

    public final void showToast(@Nullable String str) {
        Toast.makeText(getBaseActivity(), str, 0).show();
    }

    @NotNull
    public final Flash getFlash() {
        CameraView cameraView = (CameraView) _$_findCachedViewById(resetInternal.setMax.onSessionDestroyed);
        Intrinsics.checkNotNullExpressionValue(cameraView, "cameraView");
        Flash flash = cameraView.getFlash();
        Intrinsics.checkNotNullExpressionValue(flash, "cameraView.flash");
        return flash;
    }

    public final void toggleTorch() {
        Flash flash;
        CameraView cameraView = (CameraView) _$_findCachedViewById(resetInternal.setMax.onSessionDestroyed);
        Intrinsics.checkNotNullExpressionValue(cameraView, "cameraView");
        Flash flash2 = Flash.TORCH;
        CameraView cameraView2 = (CameraView) _$_findCachedViewById(resetInternal.setMax.onSessionDestroyed);
        Intrinsics.checkNotNullExpressionValue(cameraView2, "cameraView");
        if (flash2 == cameraView2.getFlash()) {
            flash = Flash.OFF;
        } else {
            flash = Flash.TORCH;
        }
        cameraView.setFlash(flash);
    }

    public final void setDanaCameraListener(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "danaCameraListener");
        this.setMax = getmin;
    }

    public final boolean hasPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        setStateOn setstateon = this.getMax;
        return setstateon != null && setstateon.getMin(i, strArr, iArr);
    }

    public final void takePicture() {
        CameraView cameraView = (CameraView) _$_findCachedViewById(resetInternal.setMax.onSessionDestroyed);
        Intrinsics.checkNotNullExpressionValue(cameraView, "cameraView");
        if (cameraView.isOpened()) {
            ((CameraView) _$_findCachedViewById(resetInternal.setMax.onSessionDestroyed)).takePicture();
        }
    }

    public final boolean isTakingPicture() {
        CameraView cameraView = (CameraView) _$_findCachedViewById(resetInternal.setMax.onSessionDestroyed);
        Intrinsics.checkNotNullExpressionValue(cameraView, "cameraView");
        return cameraView.isTakingPicture();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/richview/camera/DanaCameraView$Companion;", "", "()V", "AUTO_FOCUS_DELAY_ACTIVATION", "", "MAX_AUTO_FOCUS_ACTIVATION_RETRY", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T> implements RedDotManager<Long> {
        final /* synthetic */ DanaCameraView getMax;

        getMax(DanaCameraView danaCameraView) {
            this.getMax = danaCameraView;
        }

        public final /* synthetic */ void accept(Object obj) {
            DanaCameraView.access$enableAutoFocus(this.getMax);
        }
    }

    public static final /* synthetic */ void access$initCameraView(DanaCameraView danaCameraView) {
        ((CameraView) danaCameraView._$_findCachedViewById(resetInternal.setMax.onSessionDestroyed)).setLifecycleOwner(danaCameraView.getBaseActivity());
        ((CameraView) danaCameraView._$_findCachedViewById(resetInternal.setMax.onSessionDestroyed)).open();
        ConstraintLayout constraintLayout = (ConstraintLayout) danaCameraView._$_findCachedViewById(resetInternal.setMax.getShuffleMode);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "clCameraButton");
        constraintLayout.setVisibility(danaCameraView.setMin);
        if (danaCameraView.getMin) {
            ((CameraView) danaCameraView._$_findCachedViewById(resetInternal.setMax.onSessionDestroyed)).mapGesture(Gesture.PINCH, GestureAction.ZOOM);
        }
        ((Button) danaCameraView._$_findCachedViewById(resetInternal.setMax.onQueueTitleChanged)).setOnClickListener(new setMin(danaCameraView));
        ((ImageView) danaCameraView._$_findCachedViewById(resetInternal.setMax.hasFocus)).setOnClickListener(new toIntRange(danaCameraView));
        danaCameraView.length = 0;
        danaCameraView.length();
        ((CameraView) danaCameraView._$_findCachedViewById(resetInternal.setMax.onSessionDestroyed)).addCameraListener(new toFloatRange(danaCameraView));
    }

    public static final /* synthetic */ void access$enableAutoFocus(DanaCameraView danaCameraView) {
        if (danaCameraView.setMax()) {
            ((CameraView) danaCameraView._$_findCachedViewById(resetInternal.setMax.onSessionDestroyed)).mapGesture(Gesture.TAP, GestureAction.AUTO_FOCUS);
            ((CameraView) danaCameraView._$_findCachedViewById(resetInternal.setMax.onSessionDestroyed)).setAutoFocusMarker(new getEdgeEffectFactory());
            return;
        }
        int i = danaCameraView.length + 1;
        danaCameraView.length = i;
        if (i < 5) {
            danaCameraView.length();
        }
    }
}
