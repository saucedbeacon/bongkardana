package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.isMeasureWithLargestChildEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\t2\b\b\u0003\u0010\u0010\u001a\u00020\tH\u0007J?\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016J?\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182%\b\u0002\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\t\u0018\u00010\u001aH\u0007J,\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\t2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0015H\u0007J;\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0002\u0010#J$\u0010$\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007J$\u0010%\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\tH\u0007J9\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010*J9\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020,2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010-J\f\u0010.\u001a\u00020\t*\u00020/H\u0007J%\u00100\u001a\u00020\t\"\b\b\u0000\u00101*\u000202*\u0002H12\b\b\u0001\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0002\u00103J#\u00104\u001a\b\u0012\u0004\u0012\u00020\u000605*\u00020\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u00106J\u0018\u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t08*\u000209H\u0007J7\u0010:\u001a\u00020\u0004*\u0004\u0018\u00010\t2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u00040\u001aH\b¢\u0006\u0002\u0010=J/\u0010>\u001a\u0002H?\"\b\b\u0000\u0010?*\u000202*\u00020@2\b\b\u0002\u0010A\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0002\u0010BJ\u0016\u0010C\u001a\u00020)*\u00020\t2\b\b\u0002\u0010D\u001a\u00020EH\u0007J\f\u0010F\u001a\u00020)*\u00020\u000eH\u0007J3\u0010G\u001a\u00020\u0004*\u0004\u0018\u00010/2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0001\u0010H\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010JJ \u0010K\u001a\u00020\u0004*\u00020L2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040\u001aH\u0007JE\u0010N\u001a\u00020\u0004\"\b\b\u0000\u00101*\u000202*\u0004\u0018\u0001H12\b\b\u0002\u0010O\u001a\u00020\t2\b\b\u0002\u0010P\u001a\u00020\t2\b\b\u0002\u0010Q\u001a\u00020\t2\b\b\u0002\u0010R\u001a\u00020\tH\u0007¢\u0006\u0002\u0010SJ4\u0010T\u001a\u00020\u0004\"\b\b\u0000\u00101*\u000202*\u0002H12\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0002\bUH\u0007¢\u0006\u0002\u0010VJ4\u0010W\u001a\u00020\u0004\"\b\b\u0000\u00101*\u000202*\u0002H12\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0002\bUH\u0007¢\u0006\u0002\u0010V¨\u0006X"}, d2 = {"Lcom/afollestad/materialdialogs/utils/MDUtil;", "", "()V", "assertOneSet", "", "method", "", "b", "a", "", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)V", "createColorSelector", "Landroid/content/res/ColorStateList;", "context", "Landroid/content/Context;", "unchecked", "checked", "resolveColor", "res", "attr", "fallback", "Lkotlin/Function0;", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)I", "resolveColors", "", "attrs", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forAttr", "resolveDimen", "", "defaultValue", "resolveDrawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "resolveFloat", "resolveInt", "resolveString", "", "html", "", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/CharSequence;", "materialDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/CharSequence;", "additionalPaddingForFont", "Landroid/widget/TextView;", "dimenPx", "T", "Landroid/view/View;", "(Landroid/view/View;I)I", "getStringArray", "", "(Landroid/content/Context;Ljava/lang/Integer;)[Ljava/lang/String;", "getWidthAndHeight", "Lkotlin/Pair;", "Landroid/view/WindowManager;", "ifNotZero", "block", "value", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "inflate", "R", "Landroid/view/ViewGroup;", "ctxt", "(Landroid/view/ViewGroup;Landroid/content/Context;I)Landroid/view/View;", "isColorDark", "threshold", "", "isLandscape", "maybeSetTextColor", "attrRes", "hintAttrRes", "(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)V", "textChanged", "Landroid/widget/EditText;", "callback", "updatePadding", "left", "top", "right", "bottom", "(Landroid/view/View;IIII)V", "waitForHeight", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "waitForWidth", "core"}, k = 1, mv = {1, 1, 16})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class layoutVertical {
    public static final layoutVertical INSTANCE = new layoutVertical();

    private layoutVertical() {
    }

    public static /* synthetic */ CharSequence resolveString$default(layoutVertical layoutvertical, isBaselineAligned isbaselinealigned, Integer num, Integer num2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return layoutvertical.resolveString(isbaselinealigned, num, num2, z);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final CharSequence resolveString(@NotNull isBaselineAligned isbaselinealigned, @Nullable @StringRes Integer num, @Nullable @StringRes Integer num2, boolean z) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "materialDialog");
        return resolveString(isbaselinealigned.getWindowContext(), num, num2, z);
    }

    public static /* synthetic */ CharSequence resolveString$default(layoutVertical layoutvertical, Context context, Integer num, Integer num2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return layoutvertical.resolveString(context, num, num2, z);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final CharSequence resolveString(@NotNull Context context, @Nullable @StringRes Integer num, @Nullable @StringRes Integer num2, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        int intValue = num != null ? num.intValue() : num2 != null ? num2.intValue() : 0;
        if (intValue == 0) {
            return null;
        }
        CharSequence text = context.getResources().getText(intValue);
        Intrinsics.checkExpressionValueIsNotNull(text, "context.resources.getText(resourceId)");
        return z ? Html.fromHtml(text.toString()) : text;
    }

    public static /* synthetic */ Drawable resolveDrawable$default(layoutVertical layoutvertical, Context context, Integer num, Integer num2, Drawable drawable, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            drawable = null;
        }
        return layoutvertical.resolveDrawable(context, num, num2, drawable);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Drawable resolveDrawable(@NotNull Context context, @Nullable @DrawableRes Integer num, @Nullable @AttrRes Integer num2, @Nullable Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        if (num2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
                if (drawable2 != null || drawable == null) {
                    drawable = drawable2;
                }
                return drawable;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else if (num == null) {
            return drawable;
        } else {
            return IntRange.length(context, num.intValue());
        }
    }

    public static /* synthetic */ int resolveColor$default(layoutVertical layoutvertical, Context context, Integer num, Integer num2, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        return layoutvertical.resolveColor(context, num, num2, function0);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int resolveColor(@NotNull Context context, @Nullable @ColorRes Integer num, @Nullable @AttrRes Integer num2, @Nullable Function0<Integer> function0) {
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        int i = 0;
        if (num2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int color = obtainStyledAttributes.getColor(0, 0);
                if (color == 0 && function0 != null) {
                    return function0.invoke().intValue();
                }
                obtainStyledAttributes.recycle();
                return color;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            if (num != null) {
                i = num.intValue();
            }
            return IntRange.setMax(context, i);
        }
    }

    public static /* synthetic */ int[] resolveColors$default(layoutVertical layoutvertical, Context context, int[] iArr, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return layoutvertical.resolveColors(context, iArr, function1);
    }

    @NotNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] resolveColors(@NotNull Context context, @NotNull int[] iArr, @Nullable Function1<? super Integer, Integer> function1) {
        Integer invoke;
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(iArr, "attrs");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(iArr);
        try {
            Iterable indices = ArraysKt.getIndices(iArr);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices, 10));
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                int i = 0;
                int color = obtainStyledAttributes.getColor(nextInt, 0);
                if (color != 0) {
                    i = color;
                } else if (!(function1 == null || (invoke = function1.invoke(Integer.valueOf(iArr[nextInt]))) == null)) {
                    i = invoke.intValue();
                }
                arrayList.add(Integer.valueOf(i));
            }
            return CollectionsKt.toIntArray((List) arrayList);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ int resolveInt$default(layoutVertical layoutvertical, Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return layoutvertical.resolveInt(context, i, i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int resolveInt(@NotNull Context context, @AttrRes int i, int i2) {
        int min;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(2026176138, oncanceled);
            onCancelLoad.getMin(2026176138, oncanceled);
        }
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getInt(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ float resolveDimen$default(layoutVertical layoutvertical, Context context, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        return layoutvertical.resolveDimen(context, i, function0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final float resolveDimen(@NotNull Context context, @AttrRes int i, @Nullable Function0<Float> function0) {
        float f;
        int min;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-471836817, oncanceled);
            onCancelLoad.getMin(-471836817, oncanceled);
        }
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        if (function0 != null) {
            try {
                Float invoke = function0.invoke();
                if (invoke != null) {
                    f = invoke.floatValue();
                    float dimension = obtainStyledAttributes.getDimension(0, f);
                    obtainStyledAttributes.recycle();
                    return dimension;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        f = 0.0f;
        float dimension2 = obtainStyledAttributes.getDimension(0, f);
        obtainStyledAttributes.recycle();
        return dimension2;
    }

    public static /* synthetic */ float resolveFloat$default(layoutVertical layoutvertical, Context context, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        return layoutvertical.resolveFloat(context, i, f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final float resolveFloat(@NotNull Context context, @AttrRes int i, float f) {
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getFloat(0, f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ boolean isColorDark$default(layoutVertical layoutvertical, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = 0.5d;
        }
        return layoutvertical.isColorDark(i, d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isColorDark(int i, double d) {
        if (i == 0) {
            return false;
        }
        double red = (double) Color.red(i);
        Double.isNaN(red);
        double green = (double) Color.green(i);
        Double.isNaN(green);
        double d2 = (red * 0.299d) + (green * 0.587d);
        double blue = (double) Color.blue(i);
        Double.isNaN(blue);
        return 1.0d - ((d2 + (blue * 0.114d)) / 255.0d) >= d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T extends View> int dimenPx(@NotNull T t, @DimenRes int i) {
        Intrinsics.checkParameterIsNotNull(t, "$this$dimenPx");
        Context context = t.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, HummerConstants.CONTEXT);
        return context.getResources().getDimensionPixelSize(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isLandscape(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$isLandscape");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        return resources.getConfiguration().orientation == 2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/afollestad/materialdialogs/utils/MDUtil$textChanged$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "core"}, k = 1, mv = {1, 1, 16})
    public static final class getMin implements TextWatcher {
        final /* synthetic */ Function1 $callback;

        public final void afterTextChanged(@NotNull Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "s");
        }

        public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        getMin(Function1 function1) {
            this.$callback = function1;
        }

        public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
            this.$callback.invoke(charSequence);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void textChanged(@NotNull EditText editText, @NotNull Function1<? super CharSequence, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(editText, "$this$textChanged");
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        editText.addTextChangedListener(new getMin(function1));
    }

    public static /* synthetic */ void maybeSetTextColor$default(layoutVertical layoutvertical, TextView textView, Context context, Integer num, Integer num2, int i, Object obj) {
        if ((i & 4) != 0) {
            num2 = null;
        }
        layoutvertical.maybeSetTextColor(textView, context, num, num2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void maybeSetTextColor(@Nullable TextView textView, @NotNull Context context, @Nullable @AttrRes Integer num, @Nullable @AttrRes Integer num2) {
        int resolveColor$default;
        int resolveColor$default2;
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        if (textView == null) {
            return;
        }
        if (num != null || num2 != null) {
            if (!(num == null || (resolveColor$default2 = resolveColor$default(this, context, (Integer) null, num, (Function0) null, 10, (Object) null)) == 0)) {
                textView.setTextColor(resolveColor$default2);
            }
            if (num2 != null && (resolveColor$default = resolveColor$default(this, context, (Integer) null, num2, (Function0) null, 10, (Object) null)) != 0) {
                textView.setHintTextColor(resolveColor$default);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int additionalPaddingForFont(@NotNull TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$additionalPaddingForFont");
        TextPaint paint = textView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "paint");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = fontMetrics.descent - fontMetrics.ascent;
        if (f > ((float) textView.getMeasuredHeight())) {
            return (int) (f - ((float) textView.getMeasuredHeight()));
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void ifNotZero(@Nullable Integer num, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        if (num != null && num.intValue() != 0) {
            function1.invoke(num);
        }
    }

    public static /* synthetic */ ColorStateList createColorSelector$default(layoutVertical layoutvertical, Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return layoutvertical.createColorSelector(context, i, i2);
    }

    @NotNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ColorStateList createColorSelector(@NotNull Context context, @ColorInt int i, @ColorInt int i2) {
        int i3;
        int i4;
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        if (i2 == 0) {
            i3 = resolveColor$default(this, context, (Integer) null, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.colorControlActivated), (Function0) null, 10, (Object) null);
        } else {
            i3 = i2;
        }
        int[][] iArr = {new int[]{-16842912, -16842908}, new int[]{16842912}, new int[]{16842908}};
        int[] iArr2 = new int[3];
        if (i == 0) {
            i4 = resolveColor$default(this, context, (Integer) null, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.colorControlNormal), (Function0) null, 10, (Object) null);
        } else {
            i4 = i;
        }
        iArr2[0] = i4;
        iArr2[1] = i3;
        iArr2[2] = i3;
        return new ColorStateList(iArr, iArr2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T extends View> void waitForWidth(@NotNull T t, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(t, "$this$waitForWidth");
        Intrinsics.checkParameterIsNotNull(function1, "block");
        if (t.getMeasuredWidth() <= 0 || t.getMeasuredHeight() <= 0) {
            t.getViewTreeObserver().addOnGlobalLayoutListener(new setMax(t, function1));
        } else {
            function1.invoke(t);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"com/afollestad/materialdialogs/utils/MDUtil$waitForWidth$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "lastWidth", "", "getLastWidth", "()Ljava/lang/Integer;", "setLastWidth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "onGlobalLayout", "", "core"}, k = 1, mv = {1, 1, 16})
    public static final class setMax implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ Function1 $block;
        final /* synthetic */ View $this_waitForWidth;
        @Nullable
        private Integer lastWidth;

        setMax(T t, Function1 function1) {
            this.$this_waitForWidth = t;
            this.$block = function1;
        }

        @Nullable
        public final Integer getLastWidth() {
            return this.lastWidth;
        }

        public final void setLastWidth(@Nullable Integer num) {
            this.lastWidth = num;
        }

        public final void onGlobalLayout() {
            Integer num = this.lastWidth;
            if (num != null) {
                int measuredWidth = this.$this_waitForWidth.getMeasuredWidth();
                if (num != null && num.intValue() == measuredWidth) {
                    this.$this_waitForWidth.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
            }
            if (this.$this_waitForWidth.getMeasuredWidth() > 0 && this.$this_waitForWidth.getMeasuredHeight() > 0) {
                Integer num2 = this.lastWidth;
                int measuredWidth2 = this.$this_waitForWidth.getMeasuredWidth();
                if (num2 == null || num2.intValue() != measuredWidth2) {
                    this.lastWidth = Integer.valueOf(this.$this_waitForWidth.getMeasuredWidth());
                    this.$block.invoke(this.$this_waitForWidth);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T extends View> void waitForHeight(@NotNull T t, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(t, "$this$waitForHeight");
        Intrinsics.checkParameterIsNotNull(function1, "block");
        if (t.getMeasuredWidth() <= 0 || t.getMeasuredHeight() <= 0) {
            t.getViewTreeObserver().addOnGlobalLayoutListener(new getMax(t, function1));
        } else {
            function1.invoke(t);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"com/afollestad/materialdialogs/utils/MDUtil$waitForHeight$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "lastHeight", "", "getLastHeight", "()Ljava/lang/Integer;", "setLastHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "onGlobalLayout", "", "core"}, k = 1, mv = {1, 1, 16})
    public static final class getMax implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ Function1 $block;
        final /* synthetic */ View $this_waitForHeight;
        @Nullable
        private Integer lastHeight;

        getMax(T t, Function1 function1) {
            this.$this_waitForHeight = t;
            this.$block = function1;
        }

        @Nullable
        public final Integer getLastHeight() {
            return this.lastHeight;
        }

        public final void setLastHeight(@Nullable Integer num) {
            this.lastHeight = num;
        }

        public final void onGlobalLayout() {
            Integer num = this.lastHeight;
            if (num != null) {
                int measuredHeight = this.$this_waitForHeight.getMeasuredHeight();
                if (num != null && num.intValue() == measuredHeight) {
                    this.$this_waitForHeight.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
            }
            if (this.$this_waitForHeight.getMeasuredWidth() > 0 && this.$this_waitForHeight.getMeasuredHeight() > 0) {
                Integer num2 = this.lastHeight;
                int measuredHeight2 = this.$this_waitForHeight.getMeasuredHeight();
                if (num2 == null || num2.intValue() != measuredHeight2) {
                    this.lastHeight = Integer.valueOf(this.$this_waitForHeight.getMeasuredHeight());
                    this.$block.invoke(this.$this_waitForHeight);
                }
            }
        }
    }

    @NotNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Pair<Integer, Integer> getWidthAndHeight(@NotNull WindowManager windowManager) {
        Intrinsics.checkParameterIsNotNull(windowManager, "$this$getWidthAndHeight");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static /* synthetic */ void updatePadding$default(layoutVertical layoutvertical, View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view != null ? view.getPaddingLeft() : 0;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = view != null ? view.getPaddingTop() : 0;
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = view != null ? view.getPaddingRight() : 0;
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = view != null ? view.getPaddingBottom() : 0;
        }
        layoutvertical.updatePadding(view, i6, i7, i8, i4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T extends View> void updatePadding(@Nullable T t, int i, int i2, int i3, int i4) {
        if ((t == null || i != t.getPaddingLeft() || i2 != t.getPaddingTop() || i3 != t.getPaddingRight() || i4 != t.getPaddingBottom()) && t != null) {
            t.setPadding(i, i2, i3, i4);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void assertOneSet(@NotNull String str, @Nullable Object obj, @Nullable Integer num) {
        Intrinsics.checkParameterIsNotNull(str, FirebaseAnalytics.Param.METHOD);
        if (num == null && obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": You must specify a resource ID or literal value");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @NotNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String[] getStringArray(@NotNull Context context, @Nullable @ArrayRes Integer num) {
        Intrinsics.checkParameterIsNotNull(context, "$this$getStringArray");
        if (num == null) {
            return new String[0];
        }
        String[] stringArray = context.getResources().getStringArray(num.intValue());
        Intrinsics.checkExpressionValueIsNotNull(stringArray, "resources.getStringArray(res)");
        return stringArray;
    }

    public static /* synthetic */ View inflate$default(layoutVertical layoutvertical, ViewGroup viewGroup, Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, HummerConstants.CONTEXT);
        }
        return layoutvertical.inflate(viewGroup, context, i);
    }

    @NotNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <R extends View> R inflate(@NotNull ViewGroup viewGroup, @NotNull Context context, @LayoutRes int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$inflate");
        Intrinsics.checkParameterIsNotNull(context, "ctxt");
        R inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        if (inflate != null) {
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type R");
    }
}
