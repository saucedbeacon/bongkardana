package id.dana.globalsearch.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.globalsearch.view.SeeAllActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fJ \u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u0011J\b\u0010\u001a\u001a\u00020\u0011H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/globalsearch/view/widget/CategoryHeaderView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "categoryName", "", "hasSeeAll", "", "getLayout", "parseAttrs", "", "setCategory", "setCategoryName", "setHasSeeAll", "isSeeAllClickListener", "Lkotlin/Function0;", "setOnCLickSeeAll", "category", "setVisibilityHeader", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CategoryHeaderView extends BaseRichView {
    private HashMap getMax;
    private String length;
    private boolean setMin;

    @JvmOverloads
    public CategoryHeaderView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public CategoryHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_category_header;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CategoryHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public CategoryHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = "";
    }

    public final void setup() {
        setCategory(this.length, this.setMin);
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.ICustomTabsCallback$Stub$Proxy);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "getContext().obtainStyle…eable.CategoryHeaderView)");
            try {
                String string = obtainStyledAttributes.getString(1);
                if (string == null) {
                    string = "";
                }
                this.length = string;
                this.setMin = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public static /* synthetic */ void setCategory$default(CategoryHeaderView categoryHeaderView, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        categoryHeaderView.setCategory(str, z);
    }

    public final void setCategory(@NotNull String str, boolean z) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(70293166, oncanceled);
            onCancelLoad.getMin(70293166, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "categoryName");
        setCategoryName(str);
        setHasSeeAll$default(this, z, (Function0) null, 2, (Object) null);
        setOnCLickSeeAll(str, z);
    }

    public final void setCategoryName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "categoryName");
        this.length = str;
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getVirtualChildCount);
        if (textView != null) {
            textView.setText(str);
        }
        setVisibilityHeader();
    }

    public static /* synthetic */ void setHasSeeAll$default(CategoryHeaderView categoryHeaderView, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        categoryHeaderView.setHasSeeAll(z, function0);
    }

    public final void setHasSeeAll(boolean z, @Nullable Function0<Unit> function0) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onSuggestionsKey);
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
            textView.setOnClickListener(new length(z, function0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/globalsearch/view/widget/CategoryHeaderView$setHasSeeAll$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ boolean getMin;
        final /* synthetic */ Function0 setMax;

        length(boolean z, Function0 function0) {
            this.getMin = z;
            this.setMax = function0;
        }

        public final void onClick(View view) {
            Function0 function0 = this.setMax;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void setVisibilityHeader() {
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(resetInternal.setMax.generateOverflowButtonLayoutParams);
        if (relativeLayout != null) {
            int i = 0;
            if (this.length.length() == 0) {
                i = 8;
            }
            relativeLayout.setVisibility(i);
        }
    }

    public final void setOnCLickSeeAll(@Nullable String str, boolean z) {
        TextView textView;
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0) && z && (textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onSuggestionsKey)) != null) {
            textView.setOnClickListener(new getMin(this, str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ String length;
        final /* synthetic */ CategoryHeaderView setMax;

        getMin(CategoryHeaderView categoryHeaderView, String str) {
            this.setMax = categoryHeaderView;
            this.length = str;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.setMax.getContext(), SeeAllActivity.class);
            intent.putExtra(SeeAllActivity.GLOBAL_SEARCH_CATEGORY, this.length);
            this.setMax.getContext().startActivity(intent);
        }
    }
}
