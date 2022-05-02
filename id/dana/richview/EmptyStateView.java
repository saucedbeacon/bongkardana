package id.dana.richview;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.button.MaterialButton;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010#\u001a\u00020\u0007H\u0016J\u001c\u0010$\u001a\u00020%2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u000e\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(J\b\u0010)\u001a\u00020%H\u0016R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u0006*"}, d2 = {"Lid/dana/richview/EmptyStateView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "action", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "desc", "getDesc", "setDesc", "", "hasAction", "getHasAction", "()Z", "setHasAction", "(Z)V", "icon", "getIcon", "()I", "setIcon", "(I)V", "title", "getTitle", "setTitle", "getLayout", "parseAttrs", "", "setOnActionClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class EmptyStateView extends BaseRichView {
    private int getMax;
    @NotNull
    private String getMin;
    @NotNull
    private String length;
    private boolean setMax;
    @NotNull
    private String setMin;
    private HashMap toFloatRange;

    @JvmOverloads
    public EmptyStateView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public EmptyStateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_empty_state_small_btn;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmptyStateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmptyStateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = R.drawable.ic_general_empty_state;
        this.length = "";
        this.setMin = "";
        this.getMin = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public EmptyStateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = R.drawable.ic_general_empty_state;
        this.length = "";
        this.setMin = "";
        this.getMin = "";
    }

    public final int getIcon() {
        return this.getMax;
    }

    public final void setIcon(int i) {
        this.getMax = i;
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setSupportProgressBarVisibility);
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(IntRange.length(getContext(), i));
        }
    }

    @NotNull
    public final String getTitle() {
        return this.length;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.length = str;
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.launchQuerySearch);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
    }

    @NotNull
    public final String getDesc() {
        return this.setMin;
    }

    public final void setDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.setMin = str;
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.forceUniformWidth);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
    }

    @NotNull
    public final String getAction() {
        return this.getMin;
    }

    public final void setAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.getMin = str;
        MaterialButton materialButton = (MaterialButton) _$_findCachedViewById(resetInternal.setMax.toIntRange);
        if (materialButton != null) {
            materialButton.setText(str);
        }
    }

    public final boolean getHasAction() {
        return this.setMax;
    }

    public final void setHasAction(boolean z) {
        this.setMax = z;
        MaterialButton materialButton = (MaterialButton) _$_findCachedViewById(resetInternal.setMax.toIntRange);
        Intrinsics.checkNotNullExpressionValue(materialButton, "btnAction");
        materialButton.setVisibility(z ? 0 : 8);
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            setStyledAttributes(context, attributeSet, resetInternal.getMin.MediaBrowserCompat$MediaItem$Flags);
            try {
                setIcon(getStyledAttributes().getResourceId(2, R.drawable.ic_general_empty_state));
                String string = getStyledAttributes().getString(3);
                String str = "";
                if (string == null) {
                    string = str;
                }
                setTitle(string);
                String string2 = getStyledAttributes().getString(1);
                if (string2 == null) {
                    string2 = str;
                }
                setDesc(string2);
                String string3 = getStyledAttributes().getString(0);
                if (string3 != null) {
                    str = string3;
                }
                setAction(str);
                setHasAction(getStyledAttributes().getBoolean(4, false));
            } finally {
                getStyledAttributes().recycle();
            }
        }
    }

    public final void setOnActionClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        MaterialButton materialButton = (MaterialButton) _$_findCachedViewById(resetInternal.setMax.toIntRange);
        if (materialButton != null) {
            materialButton.setOnClickListener(onClickListener);
        }
    }
}
