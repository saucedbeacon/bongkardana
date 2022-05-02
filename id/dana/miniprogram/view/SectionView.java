package id.dana.miniprogram.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.getBluetoothAdapterState;
import o.resetInternal;
import o.setShadowResourceRight;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0015\u001a\u00020\u00122\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017J\u0012\u0010\u0018\u001a\u00020\u00122\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lid/dana/miniprogram/view/SectionView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "title", "", "sectionTitle", "getSectionTitle", "()Ljava/lang/CharSequence;", "setSectionTitle", "(Ljava/lang/CharSequence;)V", "getLayout", "setTitleVisibility", "", "visible", "", "setupGridRecyclerView", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setupLinearRecyclerView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SectionView extends BaseRichView {
    private HashMap length;

    @JvmOverloads
    public SectionView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SectionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_mini_program_section;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SectionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SectionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @Nullable
    public final CharSequence getSectionTitle() {
        TextView textView = (TextView) findViewById(16908310);
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public final void setSectionTitle(@Nullable CharSequence charSequence) {
        TextView textView = (TextView) findViewById(16908310);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void setTitleVisibility(boolean z) {
        TextView textView = (TextView) _$_findCachedViewById(android.R.id.title);
        Intrinsics.checkNotNullExpressionValue(textView, "title");
        textView.setVisibility(z ? 0 : 8);
    }

    public final void setupGridRecyclerView(@NotNull RecyclerView.Adapter<?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "it");
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        recyclerView.setAdapter(adapter);
        Float valueOf = Float.valueOf(12.0f);
        Float valueOf2 = Float.valueOf(16.0f);
        getBluetoothAdapterState.getMin(recyclerView, (Float) null, valueOf, (Float) null, valueOf2, 5);
        getBluetoothAdapterState.getMin(this, (Float) null, (Float) null, (Float) null, Float.valueOf(8.0f), 7);
        TextView textView = (TextView) _$_findCachedViewById(android.R.id.title);
        Intrinsics.checkNotNullExpressionValue(textView, "title");
        getBluetoothAdapterState.getMax((View) textView, valueOf2, (Float) null, valueOf2, 10);
    }

    public final void setupLinearRecyclerView(@NotNull RecyclerView.Adapter<?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "it");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        Float valueOf = Float.valueOf(12.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        getBluetoothAdapterState.getMin(recyclerView, (Float) null, valueOf, (Float) null, valueOf2, 5);
        ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.setMenuPrepared)).addItemDecoration(new setShadowResourceRight(getContext(), IntRange.setMax(getContext(), R.color.f20332131099945), 1.0f));
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.resolveRtl);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "viewSeparator");
        _$_findCachedViewById.setVisibility(8);
        getBluetoothAdapterState.getMin(this, (Float) null, (Float) null, (Float) null, valueOf2, 7);
        Float valueOf3 = Float.valueOf(16.0f);
        getBluetoothAdapterState.getMax((View) this, valueOf3, (Float) null, valueOf3, 10);
    }
}
