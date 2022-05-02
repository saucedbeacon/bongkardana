package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import o.getChildrenSkipCount;
import o.isBaselineAligned;
import o.isMeasureWithLargestChildEnabled;
import o.layoutHorizontal;
import o.layoutVertical;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(H\u0002J9\u0010,\u001a\u00020\b2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u000e2\b\u0010.\u001a\u0004\u0018\u00010\b2\u0006\u0010/\u001a\u00020(2\u0006\u0010+\u001a\u00020(2\u0006\u00100\u001a\u00020(¢\u0006\u0002\u00101J$\u00102\u001a\u00020*2\u0006\u00103\u001a\u0002042\n\u00105\u001a\u0006\u0012\u0002\b\u0003062\b\u00107\u001a\u0004\u0018\u000108J\u0006\u00109\u001a\u00020(J\u001a\u0010:\u001a\u00020*2\b\b\u0002\u0010;\u001a\u00020\u000e2\b\b\u0002\u0010<\u001a\u00020\u000eJ\u001a\u0010=\u001a\u00020*2\b\b\u0002\u0010;\u001a\u00020\u000e2\b\b\u0002\u0010<\u001a\u00020\u000eJ0\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000eH\u0014J\u0018\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u000eH\u0014JN\u0010E\u001a\u00020*2\u0006\u00103\u001a\u0002042\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u000e2\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010I2\u0019\u0010J\u001a\u0015\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020*\u0018\u00010K¢\u0006\u0002\bM¢\u0006\u0002\u0010NR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "customView", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "frameHorizontalMargin", "", "getFrameHorizontalMargin", "()I", "frameHorizontalMargin$delegate", "Lkotlin/Lazy;", "messageTextView", "Landroid/widget/TextView;", "recyclerView", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "getRecyclerView", "()Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "setRecyclerView", "(Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;)V", "rootLayout", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "scrollFrame", "Landroid/view/ViewGroup;", "scrollView", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "getScrollView", "()Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "setScrollView", "(Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;)V", "useHorizontalPadding", "", "addContentScrollView", "", "noVerticalPadding", "addCustomView", "res", "view", "scrollable", "horizontalPadding", "(Ljava/lang/Integer;Landroid/view/View;ZZZ)Landroid/view/View;", "addRecyclerView", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "haveMoreThanOneChild", "modifyFirstAndLastPadding", "top", "bottom", "modifyScrollViewPadding", "onLayout", "changed", "left", "right", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setMessage", "text", "", "typeface", "Landroid/graphics/Typeface;", "applySettings", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/message/DialogMessageSettings;", "Lkotlin/ExtensionFunctionType;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/CharSequence;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;)V", "core"}, k = 1, mv = {1, 1, 16})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogContentLayout extends FrameLayout {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DialogContentLayout.class), "frameHorizontalMargin", "getFrameHorizontalMargin()I"))};
    @Nullable
    private View customView;
    private final Lazy frameHorizontalMargin$delegate;
    private TextView messageTextView;
    @Nullable
    private DialogRecyclerView recyclerView;
    private ViewGroup scrollFrame;
    @Nullable
    private DialogScrollView scrollView;
    private boolean useHorizontalPadding;

    private final int getFrameHorizontalMargin() {
        return ((Number) this.frameHorizontalMargin$delegate.getValue()).intValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogContentLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogContentLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        this.frameHorizontalMargin$delegate = LazyKt.lazy(new setMin(this));
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class setMin extends Lambda implements Function0<Integer> {
        final /* synthetic */ DialogContentLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(DialogContentLayout dialogContentLayout) {
            super(0);
            this.this$0 = dialogContentLayout;
        }

        public final int invoke() {
            return this.this$0.getResources().getDimensionPixelSize(isMeasureWithLargestChildEnabled.setMax.md_dialog_frame_margin_horizontal);
        }
    }

    @Nullable
    public final DialogScrollView getScrollView() {
        return this.scrollView;
    }

    public final void setScrollView(@Nullable DialogScrollView dialogScrollView) {
        this.scrollView = dialogScrollView;
    }

    @Nullable
    public final DialogRecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final void setRecyclerView(@Nullable DialogRecyclerView dialogRecyclerView) {
        this.recyclerView = dialogRecyclerView;
    }

    @Nullable
    public final View getCustomView() {
        return this.customView;
    }

    public final void setCustomView(@Nullable View view) {
        this.customView = view;
    }

    public final void setMessage(@NotNull isBaselineAligned isbaselinealigned, @Nullable @StringRes Integer num, @Nullable CharSequence charSequence, @Nullable Typeface typeface, @Nullable Function1<? super getChildrenSkipCount, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, ImagePickerEvent.DIALOG);
        addContentScrollView(false);
        if (this.messageTextView == null) {
            int i = isMeasureWithLargestChildEnabled.setMin.md_dialog_stub_message;
            ViewGroup viewGroup = this.scrollFrame;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            TextView textView = (TextView) layoutHorizontal.inflate((ViewGroup) this, i, viewGroup);
            ViewGroup viewGroup2 = this.scrollFrame;
            if (viewGroup2 == null) {
                Intrinsics.throwNpe();
            }
            viewGroup2.addView(textView);
            this.messageTextView = textView;
        }
        TextView textView2 = this.messageTextView;
        if (textView2 == null) {
            Intrinsics.throwNpe();
        }
        getChildrenSkipCount getchildrenskipcount = new getChildrenSkipCount(isbaselinealigned, textView2);
        if (function1 != null) {
            function1.invoke(getchildrenskipcount);
        }
        TextView textView3 = this.messageTextView;
        if (textView3 != null) {
            if (typeface != null) {
                textView3.setTypeface(typeface);
            }
            layoutVertical.maybeSetTextColor$default(layoutVertical.INSTANCE, textView3, isbaselinealigned.getWindowContext(), Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_color_content), (Integer) null, 4, (Object) null);
            getchildrenskipcount.setText$core(num, charSequence);
        }
    }

    public final void addRecyclerView(@NotNull isBaselineAligned isbaselinealigned, @NotNull RecyclerView.Adapter<?> adapter, @Nullable RecyclerView.IsOverlapping isOverlapping) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, ImagePickerEvent.DIALOG);
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        if (this.recyclerView == null) {
            DialogRecyclerView dialogRecyclerView = (DialogRecyclerView) layoutHorizontal.inflate$default((ViewGroup) this, isMeasureWithLargestChildEnabled.setMin.md_dialog_stub_recyclerview, (ViewGroup) null, 2, (Object) null);
            dialogRecyclerView.attach(isbaselinealigned);
            if (isOverlapping == null) {
                isOverlapping = new LinearLayoutManager(isbaselinealigned.getWindowContext());
            }
            dialogRecyclerView.setLayoutManager(isOverlapping);
            this.recyclerView = dialogRecyclerView;
            addView(dialogRecyclerView);
        }
        DialogRecyclerView dialogRecyclerView2 = this.recyclerView;
        if (dialogRecyclerView2 != null) {
            dialogRecyclerView2.setAdapter(adapter);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View addCustomView(@org.jetbrains.annotations.Nullable @androidx.annotation.LayoutRes java.lang.Integer r10, @org.jetbrains.annotations.Nullable android.view.View r11, boolean r12, boolean r13, boolean r14) {
        /*
            r9 = this;
            android.view.View r0 = r9.customView
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            if (r0 == 0) goto L_0x0087
            r0 = 0
            if (r11 == 0) goto L_0x0023
            android.view.ViewParent r2 = r11.getParent()
            if (r2 == 0) goto L_0x0023
            android.view.ViewParent r2 = r11.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 != 0) goto L_0x001c
            r2 = r0
        L_0x001c:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x0023
            r2.removeView(r11)
        L_0x0023:
            if (r12 == 0) goto L_0x0065
            r9.useHorizontalPadding = r1
            r9.addContentScrollView(r13)
            if (r11 != 0) goto L_0x003e
            if (r10 != 0) goto L_0x0031
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0031:
            int r10 = r10.intValue()
            android.view.ViewGroup r11 = r9.scrollFrame
            java.lang.Object r10 = o.layoutHorizontal.inflate((android.view.ViewGroup) r9, (int) r10, (android.view.ViewGroup) r11)
            r11 = r10
            android.view.View r11 = (android.view.View) r11
        L_0x003e:
            r9.customView = r11
            android.view.ViewGroup r10 = r9.scrollFrame
            if (r10 != 0) goto L_0x0047
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0047:
            android.view.View r11 = r9.customView
            if (r11 == 0) goto L_0x0061
            if (r14 == 0) goto L_0x0060
            o.layoutVertical r1 = o.layoutVertical.INSTANCE
            int r3 = r9.getFrameHorizontalMargin()
            r4 = 0
            int r5 = r9.getFrameHorizontalMargin()
            r6 = 0
            r7 = 10
            r8 = 0
            r2 = r11
            o.layoutVertical.updatePadding$default(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0060:
            r0 = r11
        L_0x0061:
            r10.addView(r0)
            goto L_0x007f
        L_0x0065:
            r9.useHorizontalPadding = r14
            if (r11 != 0) goto L_0x007a
            if (r10 != 0) goto L_0x006e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x006e:
            int r10 = r10.intValue()
            r11 = 2
            java.lang.Object r10 = o.layoutHorizontal.inflate$default((android.view.ViewGroup) r9, (int) r10, (android.view.ViewGroup) r0, (int) r11, (java.lang.Object) r0)
            r11 = r10
            android.view.View r11 = (android.view.View) r11
        L_0x007a:
            r9.customView = r11
            r9.addView(r11)
        L_0x007f:
            android.view.View r10 = r9.customView
            if (r10 != 0) goto L_0x0086
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0086:
            return r10
        L_0x0087:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Custom view already set."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.message.DialogContentLayout.addCustomView(java.lang.Integer, android.view.View, boolean, boolean, boolean):android.view.View");
    }

    public final boolean haveMoreThanOneChild() {
        return getChildCount() > 1;
    }

    public static /* synthetic */ void modifyFirstAndLastPadding$default(DialogContentLayout dialogContentLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        dialogContentLayout.modifyFirstAndLastPadding(i, i2);
    }

    public final void modifyFirstAndLastPadding(int i, int i2) {
        if (i != -1) {
            layoutVertical.updatePadding$default(layoutVertical.INSTANCE, getChildAt(0), 0, i, 0, 0, 13, (Object) null);
        }
        if (i2 != -1) {
            layoutVertical.updatePadding$default(layoutVertical.INSTANCE, getChildAt(getChildCount() - 1), 0, 0, 0, i2, 7, (Object) null);
        }
    }

    public static /* synthetic */ void modifyScrollViewPadding$default(DialogContentLayout dialogContentLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        dialogContentLayout.modifyScrollViewPadding(i, i2);
    }

    public final void modifyScrollViewPadding(int i, int i2) {
        ViewGroup viewGroup = this.scrollView;
        if (viewGroup == null) {
            viewGroup = this.recyclerView;
        }
        ViewGroup viewGroup2 = viewGroup;
        if (i != -1) {
            layoutVertical.updatePadding$default(layoutVertical.INSTANCE, viewGroup2, 0, i, 0, 0, 13, (Object) null);
        }
        if (i2 != -1) {
            layoutVertical.updatePadding$default(layoutVertical.INSTANCE, viewGroup2, 0, 0, 0, i2, 7, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        DialogScrollView dialogScrollView = this.scrollView;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.scrollView;
        int measuredHeight = dialogScrollView2 != null ? dialogScrollView2.getMeasuredHeight() : 0;
        int i4 = size2 - measuredHeight;
        int childCount = this.scrollView != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, measuredHeight);
            return;
        }
        int i5 = i4 / childCount;
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt = getChildAt(i6);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "currentChild");
            int id2 = childAt.getId();
            DialogScrollView dialogScrollView3 = this.scrollView;
            if (dialogScrollView3 == null || id2 != dialogScrollView3.getId()) {
                if (!Intrinsics.areEqual((Object) childAt, (Object) this.customView) || !this.useHorizontalPadding) {
                    i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                } else {
                    i3 = View.MeasureSpec.makeMeasureSpec(size - (getFrameHorizontalMargin() * 2), 1073741824);
                }
                childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                measuredHeight += childAt.getMeasuredHeight();
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "currentChild");
            int measuredHeight = childAt.getMeasuredHeight() + i8;
            if (!Intrinsics.areEqual((Object) childAt, (Object) this.customView) || !this.useHorizontalPadding) {
                i5 = getMeasuredWidth();
                i6 = 0;
            } else {
                i6 = getFrameHorizontalMargin();
                i5 = getMeasuredWidth() - getFrameHorizontalMargin();
            }
            childAt.layout(i6, i8, i5, measuredHeight);
            i7++;
            i8 = measuredHeight;
        }
    }

    private final void addContentScrollView(boolean z) {
        if (this.scrollView == null) {
            DialogScrollView dialogScrollView = (DialogScrollView) layoutHorizontal.inflate$default((ViewGroup) this, isMeasureWithLargestChildEnabled.setMin.md_dialog_stub_scrollview, (ViewGroup) null, 2, (Object) null);
            dialogScrollView.setRootView(getRootLayout());
            View childAt = dialogScrollView.getChildAt(0);
            if (childAt != null) {
                this.scrollFrame = (ViewGroup) childAt;
                if (!z) {
                    View view = dialogScrollView;
                    layoutVertical.updatePadding$default(layoutVertical.INSTANCE, view, 0, 0, 0, layoutVertical.INSTANCE.dimenPx(view, isMeasureWithLargestChildEnabled.setMax.md_dialog_frame_margin_vertical), 7, (Object) null);
                }
                this.scrollView = dialogScrollView;
                addView(dialogScrollView);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }
}
