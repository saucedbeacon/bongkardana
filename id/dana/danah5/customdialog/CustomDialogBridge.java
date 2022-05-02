package id.dana.danah5.customdialog;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.fastjson.JSONObject;
import id.dana.R;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.dialog.CommonDialog;
import id.dana.dialog.DialogPermission;
import id.dana.dialog.DialogWithImage;
import id.dana.dialog.TwoButtonWithImageDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0003J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/danah5/customdialog/CustomDialogBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "activity", "Landroid/app/Activity;", "commonDialog", "Lid/dana/dialog/CommonDialog;", "dialogPermission", "Lid/dana/dialog/DialogPermission;", "customDialog", "", "eventName", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "page", "Lcom/alibaba/ariver/app/api/Page;", "getPermissionDialogType", "", "btnOrientation", "renderCommonDialog", "renderHorizontalImageDialog", "renderLocationDialog", "renderVerticalImageDialog", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CustomDialogBridge extends SimpleBridgeExtension {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private static final String HORIZONTAL = "horizontal";
    private static final String VERTICAL = "vertical";
    private Activity activity;
    /* access modifiers changed from: private */
    public CommonDialog commonDialog;
    /* access modifiers changed from: private */
    public DialogPermission dialogPermission;

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void customDialog(@NotNull @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1307095622, oncanceled);
            onCancelLoad.getMin(-1307095622, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity2 = pageContext != null ? pageContext.getActivity() : null;
        if (activity2 != null) {
            this.activity = activity2;
            switch (str.hashCode()) {
                case -1605063445:
                    if (str.equals("overlay-dialog-illustration-vertical")) {
                        renderVerticalImageDialog(jSONObject, bridgeCallback);
                        return;
                    }
                    return;
                case -1354814997:
                    if (str.equals("common")) {
                        renderCommonDialog(jSONObject, bridgeCallback);
                        return;
                    }
                    return;
                case 609372249:
                    if (str.equals("overlay-dialog-illustration-horizontal")) {
                        renderHorizontalImageDialog(jSONObject, bridgeCallback);
                        return;
                    }
                    return;
                case 1901043637:
                    if (str.equals("location")) {
                        renderLocationDialog(jSONObject, bridgeCallback);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private final void renderVerticalImageDialog(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        DialogWithImage.getMin max = new DialogWithImage.getMin().getMax(true);
        Boolean bool = jSONObject.getBoolean("cancelOutside");
        Intrinsics.checkNotNullExpressionValue(bool, "info.getBoolean(\"cancelOutside\")");
        DialogWithImage.getMin max2 = max.setMax(bool.booleanValue());
        max2.isInside = jSONObject.getString("topImage");
        max2.getMax = jSONObject.getString("title");
        max2.setMin = jSONObject.getString("description");
        max2.getMin = jSONObject.getString("positiveButtonText");
        max2.equals = jSONObject.getString("negativeButtonText");
        max2.length = new isInside(bridgeCallback);
        Activity activity2 = this.activity;
        if (activity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
        }
        new DialogWithImage(activity2, max2.setMax, max2, (byte) 0).setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements DialogInterface.OnClickListener {
        final /* synthetic */ BridgeCallback $bridgeCallback;

        isInside(BridgeCallback bridgeCallback) {
            this.$bridgeCallback = bridgeCallback;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (-1 == i) {
                BridgeCallback bridgeCallback = this.$bridgeCallback;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("positiveClick", (Object) Boolean.TRUE);
                Unit unit = Unit.INSTANCE;
                bridgeCallback.sendJSONResponse(jSONObject);
            } else {
                BridgeCallback bridgeCallback2 = this.$bridgeCallback;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("positiveClick", (Object) Boolean.FALSE);
                Unit unit2 = Unit.INSTANCE;
                bridgeCallback2.sendJSONResponse(jSONObject2);
            }
            dialogInterface.dismiss();
        }
    }

    private final void renderHorizontalImageDialog(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean z = false;
        booleanRef.element = false;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String str = null;
        objectRef.element = null;
        Activity activity2 = this.activity;
        if (activity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
        }
        TwoButtonWithImageDialog.setMax setmax = new TwoButtonWithImageDialog.setMax(activity2);
        setmax.setMin = jSONObject.getString("title");
        setmax.length = jSONObject.getString("description");
        setmax.getMin = jSONObject.getString("topImage");
        TwoButtonWithImageDialog.setMax max = setmax.setMax(true);
        Boolean bool = jSONObject.getBoolean("cancelOutside");
        Intrinsics.checkNotNullExpressionValue(bool, "info.getBoolean(\"cancelOutside\")");
        TwoButtonWithImageDialog.setMax max2 = max.getMax(bool.booleanValue());
        max2.values = jSONObject.getString("positiveButtonText");
        max2.toString = new equals(bridgeCallback, booleanRef, objectRef);
        max2.FastBitmap$CoordinateSystem = jSONObject.getString("negativeButtonText");
        max2.hashCode = new IsOverlapping(bridgeCallback, booleanRef, objectRef);
        String string = jSONObject.getString("checkboxText");
        CharSequence charSequence = string;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!z) {
            str = string;
        }
        if (str != null) {
            max2.Mean$Arithmetic = str;
            max2.invoke = new getMax(max2, booleanRef);
        }
        T min = max2.getMin();
        min.setMin();
        Unit unit = Unit.INSTANCE;
        objectRef.element = min;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ BridgeCallback $bridgeCallback;
        final /* synthetic */ Ref.ObjectRef $horizontalImageDialog;
        final /* synthetic */ Ref.BooleanRef $isChecked;

        equals(BridgeCallback bridgeCallback, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef) {
            this.$bridgeCallback = bridgeCallback;
            this.$isChecked = booleanRef;
            this.$horizontalImageDialog = objectRef;
        }

        public final void onClick(View view) {
            BridgeCallback bridgeCallback = this.$bridgeCallback;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("positiveClick", (Object) Boolean.TRUE);
            jSONObject.put("isChecked", (Object) Boolean.valueOf(this.$isChecked.element));
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
            TwoButtonWithImageDialog twoButtonWithImageDialog = (TwoButtonWithImageDialog) this.$horizontalImageDialog.element;
            if (twoButtonWithImageDialog != null) {
                twoButtonWithImageDialog.setMax();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ BridgeCallback $bridgeCallback;
        final /* synthetic */ Ref.ObjectRef $horizontalImageDialog;
        final /* synthetic */ Ref.BooleanRef $isChecked;

        IsOverlapping(BridgeCallback bridgeCallback, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef) {
            this.$bridgeCallback = bridgeCallback;
            this.$isChecked = booleanRef;
            this.$horizontalImageDialog = objectRef;
        }

        public final void onClick(View view) {
            BridgeCallback bridgeCallback = this.$bridgeCallback;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("positiveClick", (Object) Boolean.FALSE);
            jSONObject.put("isChecked", (Object) Boolean.valueOf(this.$isChecked.element));
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
            TwoButtonWithImageDialog twoButtonWithImageDialog = (TwoButtonWithImageDialog) this.$horizontalImageDialog.element;
            if (twoButtonWithImageDialog != null) {
                twoButtonWithImageDialog.setMax();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged", "id/dana/danah5/customdialog/CustomDialogBridge$renderHorizontalImageDialog$2$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ TwoButtonWithImageDialog.setMax $horizontalImageDialogBuilder$inlined;
        final /* synthetic */ Ref.BooleanRef $isChecked$inlined;

        getMax(TwoButtonWithImageDialog.setMax setmax, Ref.BooleanRef booleanRef) {
            this.$horizontalImageDialogBuilder$inlined = setmax;
            this.$isChecked$inlined = booleanRef;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.$isChecked$inlined.element = z;
        }
    }

    private final void renderLocationDialog(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        if (this.dialogPermission == null) {
            String string = jSONObject.getString("btnOrientation");
            if (string == null) {
                string = VERTICAL;
            }
            Activity activity2 = this.activity;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
            }
            DialogPermission.setMin setmin = new DialogPermission.setMin(activity2, new toIntRange(this));
            setmin.hashCode = getPermissionDialogType(string);
            setmin.setMin = R.drawable.ic_request_location;
            setmin.length = jSONObject.getString("title");
            setmin.getMax = jSONObject.getString("message");
            Boolean bool = jSONObject.getBoolean("cancelOutside");
            Intrinsics.checkNotNullExpressionValue(bool, "info.getBoolean(\"cancelOutside\")");
            DialogPermission.setMin min = setmin.getMin(bool.booleanValue());
            Activity activity3 = this.activity;
            if (activity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
            }
            min.IsOverlapping = activity3.getString(R.string.allow_permission_services);
            min.FastBitmap$CoordinateSystem = new toFloatRange(this, bridgeCallback);
            this.dialogPermission = new DialogPermission(min.getMin, min.setMax, min, (byte) 0);
        }
        DialogPermission dialogPermission2 = this.dialogPermission;
        if (dialogPermission2 != null) {
            dialogPermission2.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements DialogInterface.OnDismissListener {
        final /* synthetic */ CustomDialogBridge this$0;

        toIntRange(CustomDialogBridge customDialogBridge) {
            this.this$0 = customDialogBridge;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.this$0.dialogPermission = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"id/dana/danah5/customdialog/CustomDialogBridge$renderLocationDialog$2", "Lid/dana/dialog/DialogPermission$DialogListener;", "onDialogDismissed", "", "onNegativeButtonClicked", "onPositiveButtonClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements DialogPermission.length {
        final /* synthetic */ BridgeCallback $bridgeCallback;
        final /* synthetic */ CustomDialogBridge this$0;

        public final void onDialogDismissed() {
        }

        toFloatRange(CustomDialogBridge customDialogBridge, BridgeCallback bridgeCallback) {
            this.this$0 = customDialogBridge;
            this.$bridgeCallback = bridgeCallback;
        }

        public final void onPositiveButtonClicked() {
            BridgeCallback bridgeCallback = this.$bridgeCallback;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("checkPermission", (Object) Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
            DialogPermission access$getDialogPermission$p = this.this$0.dialogPermission;
            if (access$getDialogPermission$p != null) {
                access$getDialogPermission$p.setMax();
            }
        }

        public final void onNegativeButtonClicked() {
            BridgeCallback bridgeCallback = this.$bridgeCallback;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("checkPermission", (Object) Boolean.FALSE);
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
            DialogPermission access$getDialogPermission$p = this.this$0.dialogPermission;
            if (access$getDialogPermission$p != null) {
                access$getDialogPermission$p.setMax();
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    private final int getPermissionDialogType(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1984141450) {
                if (hashCode == 1387629604 && lowerCase.equals(HORIZONTAL)) {
                    return 1;
                }
            } else if (lowerCase.equals(VERTICAL)) {
            }
            return 0;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @SuppressLint({"DefaultLocale"})
    private final void renderCommonDialog(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        if (this.commonDialog == null) {
            Activity activity2 = this.activity;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
            }
            CommonDialog.getMax getmax = new CommonDialog.getMax(activity2);
            getmax.setMin = new setMin(this);
            getmax.equals = jSONObject.getString("title");
            getmax.toFloatRange = jSONObject.getString("message");
            Activity activity3 = this.activity;
            if (activity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
            }
            String string = activity3.getString(R.string.dialog_positive);
            Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.string.dialog_positive)");
            if (string != null) {
                String upperCase = string.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
                getmax.isInside = upperCase;
                getmax.toDoubleRange = new length(bridgeCallback);
                Activity activity4 = this.activity;
                if (activity4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
                }
                String string2 = activity4.getString(R.string.dialog_negative);
                Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(R.string.dialog_negative)");
                if (string2 != null) {
                    String upperCase2 = string2.toUpperCase();
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase()");
                    getmax.IsOverlapping = upperCase2;
                    getmax.toIntRange = new getMin(bridgeCallback);
                    Boolean bool = jSONObject.getBoolean("autoDismiss");
                    Intrinsics.checkNotNullExpressionValue(bool, "info.getBoolean(\"autoDismiss\")");
                    getmax.length = bool.booleanValue();
                    getmax.getMin = jSONObject.getInteger("delay").intValue();
                    Boolean bool2 = jSONObject.getBoolean("cancelOutside");
                    Intrinsics.checkNotNullExpressionValue(bool2, "info.getBoolean(\"cancelOutside\")");
                    CommonDialog.getMax max = getmax.getMax(bool2.booleanValue());
                    this.commonDialog = new CommonDialog(max.getMax, max.setMin, max.setMax, max, (byte) 0);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        CommonDialog commonDialog2 = this.commonDialog;
        if (commonDialog2 != null) {
            commonDialog2.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements DialogInterface.OnDismissListener {
        final /* synthetic */ CustomDialogBridge this$0;

        setMin(CustomDialogBridge customDialogBridge) {
            this.this$0 = customDialogBridge;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.this$0.commonDialog = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ BridgeCallback $bridgeCallback;

        length(BridgeCallback bridgeCallback) {
            this.$bridgeCallback = bridgeCallback;
        }

        public final void onClick(View view) {
            BridgeCallback bridgeCallback = this.$bridgeCallback;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("positiveClick", (Object) Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ BridgeCallback $bridgeCallback;

        getMin(BridgeCallback bridgeCallback) {
            this.$bridgeCallback = bridgeCallback;
        }

        public final void onClick(View view) {
            BridgeCallback bridgeCallback = this.$bridgeCallback;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("positiveClick", (Object) Boolean.FALSE);
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/danah5/customdialog/CustomDialogBridge$Companion;", "", "()V", "HORIZONTAL", "", "VERTICAL", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
