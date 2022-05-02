package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import o.isBaselineAligned;
import o.layoutVertical;
import o.measureChildBeforeLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u000eJ\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001a\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0014J\b\u0010\u001c\u001a\u00020\u000eH\u0014J(\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0014RF\u0010\u0007\u001a:\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bj\u0004\u0018\u0001`\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006#"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "invalidateDividersDelegate", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "scrolledDown", "atBottom", "", "Lcom/afollestad/materialdialogs/internal/list/InvalidateDividersDelegate;", "scrollListeners", "com/afollestad/materialdialogs/internal/list/DialogRecyclerView$scrollListeners$1", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView$scrollListeners$1;", "attach", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invalidateDividers", "invalidateOverScroll", "isAtBottom", "isAtTop", "isScrollable", "onAttachedToWindow", "onDetachedFromWindow", "onScrollChanged", "left", "", "top", "oldl", "oldt", "core"}, k = 1, mv = {1, 1, 16})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogRecyclerView extends RecyclerView {
    private Function2<? super Boolean, ? super Boolean, Unit> invalidateDividersDelegate;
    private final getMax scrollListeners;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMin extends Lambda implements Function1<DialogRecyclerView, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DialogRecyclerView) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull DialogRecyclerView dialogRecyclerView) {
            Intrinsics.checkParameterIsNotNull(dialogRecyclerView, "$receiver");
            dialogRecyclerView.invalidateDividers();
            dialogRecyclerView.invalidateOverScroll();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "showTop", "p2", "showBottom", "invoke"}, k = 3, mv = {1, 1, 16})
    static final /* synthetic */ class getMin extends FunctionReference implements Function2<Boolean, Boolean, Unit> {
        getMin(isBaselineAligned isbaselinealigned) {
            super(2, isbaselinealigned);
        }

        public final String getName() {
            return "invalidateDividers";
        }

        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinPackage(measureChildBeforeLayout.class, "core");
        }

        public final String getSignature() {
            return "invalidateDividers(Lcom/afollestad/materialdialogs/MaterialDialog;ZZ)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z, boolean z2) {
            measureChildBeforeLayout.invalidateDividers((isBaselineAligned) this.receiver, z, z2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogRecyclerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        this.scrollListeners = new getMax(this);
    }

    public final void attach(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, ImagePickerEvent.DIALOG);
        this.invalidateDividersDelegate = new getMin(isbaselinealigned);
    }

    public final void invalidateDividers() {
        Function2<? super Boolean, ? super Boolean, Unit> function2;
        if (getChildCount() != 0 && getMeasuredHeight() != 0 && (function2 = this.invalidateDividersDelegate) != null) {
            function2.invoke(Boolean.valueOf(!isAtTop()), Boolean.valueOf(!isAtBottom()));
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        layoutVertical.INSTANCE.waitForWidth(this, setMin.INSTANCE);
        addOnScrollListener(this.scrollListeners);
    }

    public final void onDetachedFromWindow() {
        removeOnScrollListener(this.scrollListeners);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        invalidateDividers();
    }

    private final boolean isAtTop() {
        RecyclerView.IsOverlapping layoutManager = getLayoutManager();
        return layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0 : (layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0;
    }

    private final boolean isAtBottom() {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(adapter, "adapter!!");
        int itemCount = adapter.getItemCount() - 1;
        RecyclerView.IsOverlapping layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount) {
                return true;
            }
            return false;
        } else if (!(layoutManager instanceof GridLayoutManager) || ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() != itemCount) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean isScrollable() {
        return isAtBottom() && isAtTop();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/afollestad/materialdialogs/internal/list/DialogRecyclerView$scrollListeners$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "core"}, k = 1, mv = {1, 1, 16})
    public static final class getMax extends RecyclerView.toIntRange {
        final /* synthetic */ DialogRecyclerView this$0;

        getMax(DialogRecyclerView dialogRecyclerView) {
            this.this$0 = dialogRecyclerView;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.this$0.invalidateDividers();
        }
    }

    /* access modifiers changed from: private */
    public final void invalidateOverScroll() {
        int i = 2;
        if (!(getChildCount() == 0 || getMeasuredHeight() == 0 || isScrollable())) {
            i = 1;
        }
        setOverScrollMode(i);
    }
}
