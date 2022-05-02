package id.dana.component.edittextcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.OptIn;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.setBackgroundColorRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\"\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0003J\b\u0010\u001a\u001a\u00020\u000eH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/component/edittextcomponent/DanaTextBoxView;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "leftIcon", "Landroid/graphics/drawable/Drawable;", "init", "", "initiateCompoundDrawable", "onFocusChanged", "focused", "", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "setError", "error", "", "setOnIconTouchListener", "setTextChangedListener", "Companion", "design_release"}, k = 1, mv = {1, 4, 2})
public final class DanaTextBoxView extends AppCompatEditText {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    /* access modifiers changed from: private */
    public Drawable getMax;
    private HashMap getMin;

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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DanaTextBoxView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        setMax(context, (AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DanaTextBoxView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        setMax(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DanaTextBoxView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        setMax(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    private final void setMax(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.MediaBrowserCompat$MediaItem, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(setBackgroundColorRes.IsOverlapping.MediaBrowserCompat$SearchResultReceiver);
                obtainStyledAttributes.recycle();
                this.getMax = drawable;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 10.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 8.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 10.0f));
        setBackground(OptIn.getMax(getResources(), setBackgroundColorRes.getMin.bg_rounded_grey_20, (Resources.Theme) null));
        setCompoundDrawablesWithIntrinsicBounds(this.getMax, (Drawable) null, (Drawable) null, (Drawable) null);
        addTextChangedListener(new getMin(this));
        setOnTouchListener(new setMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"id/dana/component/edittextcomponent/DanaTextBoxView$setTextChangedListener$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "design_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements TextWatcher {
        final /* synthetic */ DanaTextBoxView length;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1393968312, oncanceled);
                onCancelLoad.getMin(-1393968312, oncanceled);
            }
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        getMin(DanaTextBoxView danaTextBoxView) {
            this.length = danaTextBoxView;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            DanaTextBoxView danaTextBoxView = this.length;
            danaTextBoxView.setCompoundDrawablesWithIntrinsicBounds(danaTextBoxView.getMax, (Drawable) null, ((editable != null ? editable.length() : 0) <= 0 || !this.length.isClickable() || !this.length.isEnabled()) ? null : OptIn.getMax(this.length.getResources(), setBackgroundColorRes.getMin.ic_clear, (Resources.Theme) null), (Drawable) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnTouchListener {
        final /* synthetic */ DanaTextBoxView getMax;

        setMin(DanaTextBoxView danaTextBoxView) {
            this.getMax = danaTextBoxView;
        }

        public final boolean onTouch(@Nullable View view, @NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "event");
            if (this.getMax.getCompoundDrawables()[2] == null || motionEvent.getAction() != 1) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            int right = this.getMax.getRight();
            Drawable drawable = this.getMax.getCompoundDrawables()[2];
            Intrinsics.checkNotNullExpressionValue(drawable, "compoundDrawables[DRAWABLE_RIGHT]");
            if (rawX < ((float) (right - drawable.getBounds().width())) || this.getMax.getText() == null) {
                return false;
            }
            Editable text = this.getMax.getText();
            if (text != null) {
                text.clear();
            }
            return true;
        }
    }

    public final void setError(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "error");
        setBackground(OptIn.getMax(getResources(), setBackgroundColorRes.getMin.bg_rounded_red_50, (Resources.Theme) null));
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setBackground(OptIn.getMax(getResources(), setBackgroundColorRes.getMin.bg_rounded_yellow_50, (Resources.Theme) null));
        } else {
            setBackground(OptIn.getMax(getResources(), setBackgroundColorRes.getMin.bg_rounded_grey_20, (Resources.Theme) null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/component/edittextcomponent/DanaTextBoxView$Companion;", "", "()V", "DRAWABLE_RIGHT", "", "design_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
