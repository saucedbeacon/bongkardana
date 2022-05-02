package id.dana.globalsearch.sku;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.globalsearch.sku.model.SKUModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.makeHeaderView;
import o.onInitializeFailed;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/globalsearch/sku/SKUItemView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "skuItemAdapter", "Lid/dana/globalsearch/sku/adapter/SKUItemAdapter;", "getEdgeDecorator", "Lid/dana/utils/EdgeDecorator;", "getHorizontalLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayout", "setData", "", "skuModels", "", "Lid/dana/globalsearch/sku/model/SKUModel;", "setup", "setupAdapter", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SKUItemView extends BaseRichView {
    private HashMap getMin;
    private onInitializeFailed length;

    @JvmOverloads
    public SKUItemView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public SKUItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_service;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SKUItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SKUItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public SKUItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void setData(@NotNull List<SKUModel> list) {
        Intrinsics.checkNotNullParameter(list, "skuModels");
        onInitializeFailed oninitializefailed = this.length;
        if (oninitializefailed == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skuItemAdapter");
        }
        oninitializefailed.getMin(list);
        onInitializeFailed oninitializefailed2 = this.length;
        if (oninitializefailed2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skuItemAdapter");
        }
        oninitializefailed2.notifyDataSetChanged();
    }

    public final void setup() {
        this.length = new onInitializeFailed();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setExpandActivityOverflowButtonDrawable);
        if (recyclerView != null) {
            onInitializeFailed oninitializefailed = this.length;
            if (oninitializefailed == null) {
                Intrinsics.throwUninitializedPropertyAccessException("skuItemAdapter");
            }
            recyclerView.setAdapter(oninitializefailed);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            recyclerView.addItemDecoration(new makeHeaderView(getResources().getDimensionPixelOffset(R.dimen.f26372131165291), getResources().getDimensionPixelOffset(R.dimen.f26362131165290), getResources().getDimensionPixelOffset(R.dimen.f26362131165290)));
        }
    }
}
