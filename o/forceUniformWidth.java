package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.ArrayRes;
import androidx.annotation.CheckResult;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o.isMeasureWithLargestChildEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u001a\u0012\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u00020\u0001H\u0007\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0001H\u0007\u001a\u0001\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142S\b\u0002\u0010\u0015\u001aM\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0016j\u0002`\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a\u0001\u0010\u001f\u001a\u00020\u0001*\u00020\u00012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122S\b\u0002\u0010\u0015\u001aM\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0016j\u0002`\u001d¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"customListAdapter", "Lcom/afollestad/materialdialogs/MaterialDialog;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getItemSelector", "Landroid/graphics/drawable/Drawable;", "getListAdapter", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "listItems", "res", "", "items", "", "", "disabledIndices", "", "waitForPositiveButton", "", "selection", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "dialog", "index", "text", "", "Lcom/afollestad/materialdialogs/list/ItemListener;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[IZLkotlin/jvm/functions/Function3;)Lcom/afollestad/materialdialogs/MaterialDialog;", "updateListItems", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[ILkotlin/jvm/functions/Function3;)Lcom/afollestad/materialdialogs/MaterialDialog;", "core"}, k = 2, mv = {1, 1, 16})
public final class forceUniformWidth {
    @CheckResult
    @NotNull
    public static final RecyclerView getRecyclerView(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$getRecyclerView");
        DialogRecyclerView recyclerView = isbaselinealigned.getView().getContentLayout().getRecyclerView();
        if (recyclerView != null) {
            return recyclerView;
        }
        throw new IllegalStateException("This dialog is not a list dialog.");
    }

    @CheckResult
    @Nullable
    public static final RecyclerView.Adapter<?> getListAdapter(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$getListAdapter");
        DialogRecyclerView recyclerView = isbaselinealigned.getView().getContentLayout().getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getAdapter();
        }
        return null;
    }

    public static /* synthetic */ isBaselineAligned customListAdapter$default(isBaselineAligned isbaselinealigned, RecyclerView.Adapter adapter, RecyclerView.IsOverlapping isOverlapping, int i, Object obj) {
        if ((i & 2) != 0) {
            isOverlapping = null;
        }
        return customListAdapter(isbaselinealigned, adapter, isOverlapping);
    }

    @NotNull
    public static final isBaselineAligned customListAdapter(@NotNull isBaselineAligned isbaselinealigned, @NotNull RecyclerView.Adapter<?> adapter, @Nullable RecyclerView.IsOverlapping isOverlapping) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$customListAdapter");
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        isbaselinealigned.getView().getContentLayout().addRecyclerView(isbaselinealigned, adapter, isOverlapping);
        return isbaselinealigned;
    }

    public static /* synthetic */ isBaselineAligned listItems$default(isBaselineAligned isbaselinealigned, Integer num, List list, int[] iArr, boolean z, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            iArr = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            function3 = null;
        }
        return listItems(isbaselinealigned, num, list, iArr, z, function3);
    }

    @CheckResult
    @NotNull
    public static final isBaselineAligned listItems(@NotNull isBaselineAligned isbaselinealigned, @Nullable @ArrayRes Integer num, @Nullable List<? extends CharSequence> list, @Nullable int[] iArr, boolean z, @Nullable Function3<? super isBaselineAligned, ? super Integer, ? super CharSequence, Unit> function3) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$listItems");
        layoutVertical.INSTANCE.assertOneSet("listItems", list, num);
        List<? extends CharSequence> list2 = list == null ? ArraysKt.toList((T[]) layoutVertical.INSTANCE.getStringArray(isbaselinealigned.getWindowContext(), num)) : list;
        if (getListAdapter(isbaselinealigned) != null) {
            return updateListItems(isbaselinealigned, num, list, iArr, function3);
        }
        return customListAdapter$default(isbaselinealigned, new measureVertical(isbaselinealigned, list2, iArr, z, function3), (RecyclerView.IsOverlapping) null, 2, (Object) null);
    }

    public static /* synthetic */ isBaselineAligned updateListItems$default(isBaselineAligned isbaselinealigned, Integer num, List list, int[] iArr, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            iArr = null;
        }
        if ((i & 8) != 0) {
            function3 = null;
        }
        return updateListItems(isbaselinealigned, num, list, iArr, function3);
    }

    @NotNull
    public static final isBaselineAligned updateListItems(@NotNull isBaselineAligned isbaselinealigned, @Nullable @ArrayRes Integer num, @Nullable List<? extends CharSequence> list, @Nullable int[] iArr, @Nullable Function3<? super isBaselineAligned, ? super Integer, ? super CharSequence, Unit> function3) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$updateListItems");
        layoutVertical.INSTANCE.assertOneSet("updateListItems", list, num);
        if (list == null) {
            list = ArraysKt.toList((T[]) layoutVertical.INSTANCE.getStringArray(isbaselinealigned.getWindowContext(), num));
        }
        RecyclerView.Adapter<?> listAdapter = getListAdapter(isbaselinealigned);
        if (listAdapter instanceof measureVertical) {
            measureVertical measurevertical = (measureVertical) listAdapter;
            measurevertical.replaceItems(list, function3);
            if (iArr != null) {
                measurevertical.disableItems(iArr);
            }
            return isbaselinealigned;
        }
        throw new IllegalStateException("updateListItems(...) can't be used before you've created a plain list dialog.".toString());
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Drawable getItemSelector(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$getItemSelector");
        layoutVertical layoutvertical = layoutVertical.INSTANCE;
        Context context = isbaselinealigned.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, HummerConstants.CONTEXT);
        Drawable resolveDrawable$default = layoutVertical.resolveDrawable$default(layoutvertical, context, (Integer) null, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_item_selector), (Drawable) null, 10, (Object) null);
        if (Build.VERSION.SDK_INT >= 21 && (resolveDrawable$default instanceof RippleDrawable)) {
            layoutVertical layoutvertical2 = layoutVertical.INSTANCE;
            int resolveColor$default = getLocationOffset.resolveColor$default(isbaselinealigned, (Integer) null, Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_ripple_color), (Function0) null, 5, (Object) null);
            if (resolveColor$default != 0) {
                ((RippleDrawable) resolveDrawable$default).setColor(ColorStateList.valueOf(resolveColor$default));
            }
        }
        return resolveDrawable$default;
    }
}
