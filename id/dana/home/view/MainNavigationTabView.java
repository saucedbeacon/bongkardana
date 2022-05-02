package id.dana.home.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\fH\u0002R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lid/dana/home/view/MainNavigationTabView;", "Lid/dana/home/view/NavigationTabView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "forHomeRevamp", "setForHomeRevamp", "(Z)V", "getLayout", "setSelected", "", "selected", "setupNewHomeDesign", "showOldPayTab", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MainNavigationTabView extends NavigationTabView {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public boolean getMax;
    private HashMap setMax;

    @JvmOverloads
    public MainNavigationTabView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MainNavigationTabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    @NotNull
    public static final MainNavigationTabView generate(@NotNull Context context, boolean z) {
        return getMin.setMin(context, z);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_main_nav_tab;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainNavigationTabView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MainNavigationTabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MainNavigationTabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void setSelected(boolean z) {
        super.setSelected(z);
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onInterceptTouchEvent);
        if (textView != null) {
            textView.setTextColor(IntRange.setMax(getContext(), R.color.f24762131100430));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lid/dana/home/view/MainNavigationTabView$Companion;", "", "()V", "generate", "Lid/dana/home/view/MainNavigationTabView;", "context", "Landroid/content/Context;", "forHomeRevamp", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static MainNavigationTabView setMin(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            MainNavigationTabView mainNavigationTabView = new MainNavigationTabView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            MainNavigationTabView.access$setForHomeRevamp$p(mainNavigationTabView, z);
            return mainNavigationTabView;
        }
    }

    public static final /* synthetic */ void access$setForHomeRevamp$p(MainNavigationTabView mainNavigationTabView, boolean z) {
        mainNavigationTabView.getMax = z;
        boolean z2 = !z;
        ConstraintLayout constraintLayout = (ConstraintLayout) mainNavigationTabView._$_findCachedViewById(resetInternal.setMax.entryRemoved);
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
    }
}
