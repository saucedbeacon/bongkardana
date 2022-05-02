package o;

import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.LayoutRes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aO\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u0007*\u00020\u0003H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"CUSTOM_VIEW_NO_VERTICAL_PADDING", "", "customView", "Lcom/afollestad/materialdialogs/MaterialDialog;", "viewRes", "", "view", "Landroid/view/View;", "scrollable", "", "noVerticalPadding", "horizontalPadding", "dialogWrapContent", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Landroid/view/View;ZZZZ)Lcom/afollestad/materialdialogs/MaterialDialog;", "getCustomView", "core"}, k = 2, mv = {1, 1, 16})
public final class setBaselineAlignedChildIndex {
    @NotNull
    public static final String CUSTOM_VIEW_NO_VERTICAL_PADDING = "md.custom_view_no_vertical_padding";

    @CheckResult
    @NotNull
    public static final View getCustomView(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$getCustomView");
        View customView = isbaselinealigned.getView().getContentLayout().getCustomView();
        if (customView != null) {
            return customView;
        }
        throw new IllegalStateException("You have not setup this dialog as a customView dialog.".toString());
    }

    public static /* synthetic */ isBaselineAligned customView$default(isBaselineAligned isbaselinealigned, Integer num, View view, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            view = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        return customView(isbaselinealigned, num, view, z, z2, z3, z4);
    }

    @NotNull
    public static final isBaselineAligned customView(@NotNull isBaselineAligned isbaselinealigned, @Nullable @LayoutRes Integer num, @Nullable View view, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$customView");
        layoutVertical.INSTANCE.assertOneSet("customView", view, num);
        isbaselinealigned.getConfig().put(CUSTOM_VIEW_NO_VERTICAL_PADDING, Boolean.valueOf(z2));
        if (z4) {
            isBaselineAligned.maxWidth$default(isbaselinealigned, (Integer) null, 0, 1, (Object) null);
        }
        View addCustomView = isbaselinealigned.getView().getContentLayout().addCustomView(num, view, z, z2, z3);
        if (z4) {
            layoutVertical.INSTANCE.waitForWidth(addCustomView, new getMax(isbaselinealigned, z4));
        }
        return isbaselinealigned;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke", "com/afollestad/materialdialogs/customview/DialogCustomViewExtKt$customView$1$1"}, k = 3, mv = {1, 1, 16})
    static final class getMax extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ boolean $dialogWrapContent$inlined;
        final /* synthetic */ isBaselineAligned $this_customView$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(isBaselineAligned isbaselinealigned, boolean z) {
            super(1);
            this.$this_customView$inlined = isbaselinealigned;
            this.$dialogWrapContent$inlined = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkParameterIsNotNull(view, "$receiver");
            isBaselineAligned.maxWidth$default(this.$this_customView$inlined, (Integer) null, Integer.valueOf(view.getMeasuredWidth()), 1, (Object) null);
        }
    }
}
