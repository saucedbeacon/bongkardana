package id.dana.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.isDimmed;
import o.isLayoutRtlSupport;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\b\u0010\u0019\u001a\u00020\u000eH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R,\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lid/dana/common/view/CheckboxView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lid/dana/common/adapter/CheckboxAdapter;", "onCheckBoxClicked", "Lkotlin/Function2;", "", "", "getOnCheckBoxClicked", "()Lkotlin/jvm/functions/Function2;", "setOnCheckBoxClicked", "(Lkotlin/jvm/functions/Function2;)V", "getLayout", "notifyAdapter", "setItems", "options", "", "Lid/dana/common/model/OptionModel;", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CheckboxView extends BaseRichView {
    private HashMap getMax;
    private final isDimmed length;
    @NotNull
    private Function2<? super Integer, ? super Boolean, Unit> setMax;

    @JvmOverloads
    public CheckboxView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public CheckboxView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_checkbox;
    }

    public final void setup() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "index", "", "checked", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function2<Integer, Boolean, Unit> {
        final /* synthetic */ CheckboxView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(CheckboxView checkboxView) {
            super(2);
            this.this$0 = checkboxView;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, boolean z) {
            this.this$0.getOnCheckBoxClicked().invoke(Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function2<Integer, Boolean, Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(2);
        }

        public final void invoke(int i, boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckboxView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = setMax.INSTANCE;
        this.length = new isDimmed(new length(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckboxView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public final Function2<Integer, Boolean, Unit> getOnCheckBoxClicked() {
        return this.setMax;
    }

    public final void setOnCheckBoxClicked(@NotNull Function2<? super Integer, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.setMax = function2;
    }

    public final void setItems(@NotNull List<isLayoutRtlSupport> list) {
        Intrinsics.checkNotNullParameter(list, SecurityConstants.KEY_OPTIONS);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.ActivityChooserView);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvCheckBox");
        recyclerView.setAdapter(this.length);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.ActivityChooserView);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvCheckBox");
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        this.length.getMin(list);
    }

    public final void notifyAdapter() {
        this.length.notifyDataSetChanged();
    }
}
