package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.WhichButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o.isMeasureWithLargestChildEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012Y\u0012\u0004\u0012\u00020\u0004\u0012O\u0012M\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e0\u0003B\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012Q\u0010\u0015\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e¢\u0006\u0002\u0010\u0016J\b\u0010 \u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0012H\u0016J\b\u0010$\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010&\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\nH\u0016J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\nH\u0016J\b\u0010.\u001a\u00020\rH\u0016Ji\u0010/\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102Q\u00100\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000eH\u0016J\b\u00101\u001a\u00020\rH\u0016J\u0010\u00102\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\rH\u0016J\u0010\u00104\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0012H\u0016R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bRe\u0010\u0015\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;", "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;", "", "Lkotlin/Function3;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lkotlin/ParameterName;", "name", "dialog", "", "index", "text", "", "Lcom/afollestad/materialdialogs/list/ItemListener;", "items", "", "disabledItems", "", "waitForPositiveButton", "", "selection", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[IZLkotlin/jvm/functions/Function3;)V", "disabledIndices", "getItems$core", "()Ljava/util/List;", "setItems$core", "(Ljava/util/List;)V", "getSelection$core", "()Lkotlin/jvm/functions/Function3;", "setSelection$core", "(Lkotlin/jvm/functions/Function3;)V", "checkAllItems", "checkItems", "indices", "disableItems", "getItemCount", "isItemChecked", "itemClicked", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "positiveButtonClicked", "replaceItems", "listener", "toggleAllChecked", "toggleItems", "uncheckAllItems", "uncheckItems", "core"}, k = 1, mv = {1, 1, 16})
public final class measureVertical extends RecyclerView.Adapter<measureHorizontal> implements hasDividerBeforeChildAt<CharSequence, Function3<? super isBaselineAligned, ? super Integer, ? super CharSequence, ? extends Unit>> {
    private isBaselineAligned dialog;
    private int[] disabledIndices;
    @NotNull
    private List<? extends CharSequence> items;
    @Nullable
    private Function3<? super isBaselineAligned, ? super Integer, ? super CharSequence, Unit> selection;
    private boolean waitForPositiveButton;

    public final void checkAllItems() {
    }

    public final void checkItems(@NotNull int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "indices");
    }

    public final boolean isItemChecked(int i) {
        return false;
    }

    public final void toggleAllChecked() {
    }

    public final void toggleItems(@NotNull int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "indices");
    }

    public final void uncheckAllItems() {
    }

    public final void uncheckItems(@NotNull int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "indices");
    }

    @NotNull
    public final List<CharSequence> getItems$core() {
        return this.items;
    }

    public final void setItems$core(@NotNull List<? extends CharSequence> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.items = list;
    }

    @Nullable
    public final Function3<isBaselineAligned, Integer, CharSequence, Unit> getSelection$core() {
        return this.selection;
    }

    public final void setSelection$core(@Nullable Function3<? super isBaselineAligned, ? super Integer, ? super CharSequence, Unit> function3) {
        this.selection = function3;
    }

    public measureVertical(@NotNull isBaselineAligned isbaselinealigned, @NotNull List<? extends CharSequence> list, @Nullable int[] iArr, boolean z, @Nullable Function3<? super isBaselineAligned, ? super Integer, ? super CharSequence, Unit> function3) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, ImagePickerEvent.DIALOG);
        Intrinsics.checkParameterIsNotNull(list, FirebaseAnalytics.Param.ITEMS);
        this.dialog = isbaselinealigned;
        this.items = list;
        this.waitForPositiveButton = z;
        this.selection = function3;
        this.disabledIndices = iArr == null ? new int[0] : iArr;
    }

    public final void itemClicked(int i) {
        if (!this.waitForPositiveButton || !getBaselineAlignedChildIndex.hasActionButton(this.dialog, WhichButton.POSITIVE)) {
            Function3<? super isBaselineAligned, ? super Integer, ? super CharSequence, Unit> function3 = this.selection;
            if (function3 != null) {
                function3.invoke(this.dialog, Integer.valueOf(i), this.items.get(i));
            }
            if (this.dialog.getAutoDismissEnabled() && !getBaselineAlignedChildIndex.hasActionButtons(this.dialog)) {
                this.dialog.dismiss();
                return;
            }
            return;
        }
        Object obj = this.dialog.getConfig().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        this.dialog.getConfig().put("activated_index", Integer.valueOf(i));
        if (num != null) {
            notifyItemChanged(num.intValue());
        }
        notifyItemChanged(i);
    }

    @NotNull
    public final measureHorizontal onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        measureHorizontal measurehorizontal = new measureHorizontal(layoutVertical.INSTANCE.inflate(viewGroup, this.dialog.getWindowContext(), isMeasureWithLargestChildEnabled.setMin.md_listitem), this);
        layoutVertical.maybeSetTextColor$default(layoutVertical.INSTANCE, measurehorizontal.getTitleView(), this.dialog.getWindowContext(), Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_color_content), (Integer) null, 4, (Object) null);
        return measurehorizontal;
    }

    public final int getItemCount() {
        return this.items.size();
    }

    public final void onBindViewHolder(@NotNull measureHorizontal measurehorizontal, int i) {
        Intrinsics.checkParameterIsNotNull(measurehorizontal, "holder");
        View view = measurehorizontal.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        boolean z = true;
        view.setEnabled(!ArraysKt.contains(this.disabledIndices, i));
        measurehorizontal.getTitleView().setText((CharSequence) this.items.get(i));
        View view2 = measurehorizontal.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        view2.setBackground(forceUniformWidth.getItemSelector(this.dialog));
        Object obj = this.dialog.getConfig().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        View view3 = measurehorizontal.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
        if (num == null || num.intValue() != i) {
            z = false;
        }
        view3.setActivated(z);
        if (this.dialog.getBodyFont() != null) {
            measurehorizontal.getTitleView().setTypeface(this.dialog.getBodyFont());
        }
    }

    public final void positiveButtonClicked() {
        Object obj = this.dialog.getConfig().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            Function3<? super isBaselineAligned, ? super Integer, ? super CharSequence, Unit> function3 = this.selection;
            if (function3 != null) {
                function3.invoke(this.dialog, num, this.items.get(num.intValue()));
            }
            this.dialog.getConfig().remove("activated_index");
        }
    }

    public final void replaceItems(@NotNull List<? extends CharSequence> list, @Nullable Function3<? super isBaselineAligned, ? super Integer, ? super CharSequence, Unit> function3) {
        Intrinsics.checkParameterIsNotNull(list, FirebaseAnalytics.Param.ITEMS);
        this.items = list;
        if (function3 != null) {
            this.selection = function3;
        }
        notifyDataSetChanged();
    }

    public final void disableItems(@NotNull int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "indices");
        this.disabledIndices = iArr;
        notifyDataSetChanged();
    }
}
