package id.dana.richview.widgetcard;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.OnClick;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.richview.widgetcard.adapter.WidgetAdapter;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.onItemsChanged;
import o.releaseCamera;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0014\u0010\u001f\u001a\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\b\u0010!\u001a\u00020\u0014H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lid/dana/richview/widgetcard/WidgetCardView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "actionButtonListener", "Landroid/view/View$OnClickListener;", "widgetAdapter", "Lid/dana/richview/widgetcard/adapter/WidgetAdapter;", "widgets", "", "Lid/dana/richview/widgetcard/WidgetItem;", "getLayout", "initAdapter", "", "onViewAllClicked", "view", "Landroid/view/View;", "setActionButtonListener", "clickListener", "setOnItemClickListener", "clickItemListener", "Lid/dana/richview/widgetcard/WidgetCardView$OnItemClickListener;", "setVisibility", "visibility", "setWidgets", "widgetList", "setup", "OnItemClickListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class WidgetCardView extends BaseRichView {
    private HashMap getMax;
    private WidgetAdapter getMin;
    private View.OnClickListener setMax;
    /* access modifiers changed from: private */
    public List<releaseCamera> setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/richview/widgetcard/WidgetCardView$OnItemClickListener;", "", "onItemClick", "", "position", "", "widgetItem", "Lid/dana/richview/widgetcard/WidgetItem;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void getMin(int i, @NotNull releaseCamera releasecamera);
    }

    @JvmOverloads
    public WidgetCardView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public WidgetCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_widget;
    }

    public static final /* synthetic */ List access$getWidgets$p(WidgetCardView widgetCardView) {
        List<releaseCamera> list = widgetCardView.setMin;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgets");
        }
        return list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WidgetCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WidgetCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public WidgetCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void setActionButtonListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "clickListener");
        this.setMax = onClickListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements Ignore.setMin {
        final /* synthetic */ setMin getMin;
        final /* synthetic */ WidgetCardView setMax;

        getMin(WidgetCardView widgetCardView, setMin setmin) {
            this.setMax = widgetCardView;
            this.getMin = setmin;
        }

        public final void length(int i) {
            this.getMin.getMin(i, (releaseCamera) WidgetCardView.access$getWidgets$p(this.setMax).get(i));
        }
    }

    public final void setOnItemClickListener(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "clickItemListener");
        WidgetAdapter widgetAdapter = this.getMin;
        if (widgetAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetAdapter");
        }
        widgetAdapter.getMax((Ignore.setMin) new getMin(this, setmin));
    }

    public final void setVisibility(int i) {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.peekMenu);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "rl_widget_container");
        constraintLayout.setVisibility(i);
    }

    public final void setWidgets(@NotNull List<releaseCamera> list) {
        Intrinsics.checkNotNullParameter(list, "widgetList");
        this.setMin = list;
        WidgetAdapter widgetAdapter = this.getMin;
        if (widgetAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetAdapter");
        }
        widgetAdapter.getMin(list);
        WidgetAdapter widgetAdapter2 = this.getMin;
        if (widgetAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetAdapter");
        }
        widgetAdapter2.notifyDataSetChanged();
    }

    @OnClick({2131362163})
    public final void onViewAllClicked(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View.OnClickListener onClickListener = this.setMax;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void setup() {
        new onItemsChanged().setMax((RecyclerView) _$_findCachedViewById(resetInternal.setMax.getPopupContext));
        this.getMin = new WidgetAdapter();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getPopupContext);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setClipToPadding(false);
        WidgetAdapter widgetAdapter = this.getMin;
        if (widgetAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetAdapter");
        }
        recyclerView.setAdapter(widgetAdapter);
    }
}
