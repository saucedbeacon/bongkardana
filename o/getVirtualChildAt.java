package o;

import android.content.DialogInterface;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a*\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00050\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\"\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005\u001a\"\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005\u001a\"\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005\u001a\"\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005¨\u0006\f"}, d2 = {"invokeAll", "", "", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/afollestad/materialdialogs/DialogCallback;", "dialog", "onCancel", "callback", "onDismiss", "onPreShow", "onShow", "core"}, k = 2, mv = {1, 1, 16})
public final class getVirtualChildAt {
    @NotNull
    public static final isBaselineAligned onPreShow(@NotNull isBaselineAligned isbaselinealigned, @NotNull Function1<? super isBaselineAligned, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$onPreShow");
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        isbaselinealigned.getPreShowListeners$core().add(function1);
        return isbaselinealigned;
    }

    @NotNull
    public static final isBaselineAligned onShow(@NotNull isBaselineAligned isbaselinealigned, @NotNull Function1<? super isBaselineAligned, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$onShow");
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        isbaselinealigned.getShowListeners$core().add(function1);
        if (isbaselinealigned.isShowing()) {
            invokeAll(isbaselinealigned.getShowListeners$core(), isbaselinealigned);
        }
        isbaselinealigned.setOnShowListener(new setMin(isbaselinealigned));
        return isbaselinealigned;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 1, 16})
    static final class setMin implements DialogInterface.OnShowListener {
        final /* synthetic */ isBaselineAligned $this_onShow;

        setMin(isBaselineAligned isbaselinealigned) {
            this.$this_onShow = isbaselinealigned;
        }

        public final void onShow(DialogInterface dialogInterface) {
            getVirtualChildAt.invokeAll(this.$this_onShow.getShowListeners$core(), this.$this_onShow);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 16})
    static final class setMax implements DialogInterface.OnDismissListener {
        final /* synthetic */ isBaselineAligned $this_onDismiss;

        setMax(isBaselineAligned isbaselinealigned) {
            this.$this_onDismiss = isbaselinealigned;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            getVirtualChildAt.invokeAll(this.$this_onDismiss.getDismissListeners$core(), this.$this_onDismiss);
        }
    }

    @NotNull
    public static final isBaselineAligned onDismiss(@NotNull isBaselineAligned isbaselinealigned, @NotNull Function1<? super isBaselineAligned, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$onDismiss");
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        isbaselinealigned.getDismissListeners$core().add(function1);
        isbaselinealigned.setOnDismissListener(new setMax(isbaselinealigned));
        return isbaselinealigned;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, k = 3, mv = {1, 1, 16})
    static final class getMin implements DialogInterface.OnCancelListener {
        final /* synthetic */ isBaselineAligned $this_onCancel;

        getMin(isBaselineAligned isbaselinealigned) {
            this.$this_onCancel = isbaselinealigned;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            getVirtualChildAt.invokeAll(this.$this_onCancel.getCancelListeners$core(), this.$this_onCancel);
        }
    }

    @NotNull
    public static final isBaselineAligned onCancel(@NotNull isBaselineAligned isbaselinealigned, @NotNull Function1<? super isBaselineAligned, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$onCancel");
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        isbaselinealigned.getCancelListeners$core().add(function1);
        isbaselinealigned.setOnCancelListener(new getMin(isbaselinealigned));
        return isbaselinealigned;
    }

    public static final void invokeAll(@NotNull List<Function1<isBaselineAligned, Unit>> list, @NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(list, "$this$invokeAll");
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, ImagePickerEvent.DIALOG);
        for (Function1<isBaselineAligned, Unit> invoke : list) {
            invoke.invoke(isbaselinealigned);
        }
    }
}
