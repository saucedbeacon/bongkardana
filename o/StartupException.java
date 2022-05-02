package o;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u001dR\u0010\u0010\u0007\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/component/BaseMaterialDialog;", "E", "", "context", "Landroid/content/Context;", "layoutRes", "", "builder", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "(Landroid/content/Context;ILjava/lang/Object;Landroid/content/DialogInterface$OnDismissListener;)V", "Ljava/lang/Object;", "getContext", "()Landroid/content/Context;", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "dialogView", "Landroid/view/View;", "getDialogView", "()Landroid/view/View;", "setDialogView", "(Landroid/view/View;)V", "isShowing", "", "()Z", "build", "dismissDialog", "", "setup", "(Landroid/view/View;Ljava/lang/Object;)V", "Cancellation", "design_release"}, k = 1, mv = {1, 4, 2})
public abstract class StartupException<E> {
    @NotNull
    public final Context getMax;
    protected View getMin;
    private final E length;
    private final int setMax;
    public isBaselineAligned setMin;
    private final DialogInterface.OnDismissListener toIntRange;

    /* access modifiers changed from: protected */
    public abstract void getMin(@NotNull View view, E e);

    public StartupException(@NotNull Context context, @LayoutRes int i, E e, @Nullable DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = context;
        this.setMax = i;
        this.length = e;
        this.toIntRange = onDismissListener;
    }

    @NotNull
    public final View getMax() {
        View view = this.getMin;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
        }
        return view;
    }

    @NotNull
    public final isBaselineAligned getMin() {
        View inflate = View.inflate(this.getMax, this.setMax, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "View.inflate(context, layoutRes, null)");
        this.getMin = inflate;
        isBaselineAligned isbaselinealigned = new isBaselineAligned(this.getMax, (drawHorizontalDivider) null, 2, (DefaultConstructorMarker) null);
        E e = this.length;
        boolean z = true;
        isBaselineAligned cancelable = isbaselinealigned.cancelable((e instanceof getMin) && ((getMin) e).length());
        E e2 = this.length;
        if (!(e2 instanceof getMin) || !((getMin) e2).getMin()) {
            z = false;
        }
        isBaselineAligned cornerRadius$default = isBaselineAligned.cornerRadius$default(cancelable.cancelOnTouchOutside(z), Float.valueOf(8.0f), (Integer) null, 2, (Object) null);
        View view = this.getMin;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
        }
        isBaselineAligned customView$default = setBaselineAlignedChildIndex.customView$default(cornerRadius$default, (Integer) null, view, false, false, false, false, 61, (Object) null);
        customView$default.setOnDismissListener(this.toIntRange);
        Unit unit = Unit.INSTANCE;
        this.setMin = customView$default;
        View view2 = this.getMin;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
        }
        getMin(view2, this.length);
        isBaselineAligned isbaselinealigned2 = this.setMin;
        Intrinsics.checkNotNull(isbaselinealigned2);
        return isbaselinealigned2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lid/dana/component/BaseMaterialDialog$Cancellation;", "", "()V", "cancelOutside", "", "getCancelOutside$design_release", "()Z", "setCancelOutside$design_release", "(Z)V", "cancelable", "getCancelable$design_release", "setCancelable$design_release", "setCancelOutside", "setCancelable", "design_release"}, k = 1, mv = {1, 4, 2})
    public static class getMin {
        private boolean getMax = true;
        private boolean setMax = true;

        public final boolean getMin() {
            return this.getMax;
        }

        public final boolean length() {
            return this.setMax;
        }

        @NotNull
        public getMin getMax(boolean z) {
            getMin getmin = this;
            getmin.getMax = z;
            return getmin;
        }

        @NotNull
        public getMin getMin(boolean z) {
            getMin getmin = this;
            getmin.setMax = z;
            return getmin;
        }
    }
}
