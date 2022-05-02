package id.dana.statement.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001b\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0014H\u0002R\u001a\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011¨\u0006!"}, d2 = {"Lid/dana/statement/view/StatementOnBoardingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttribute", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attrs", "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "layoutHeight", "getLayoutHeight", "()I", "setLayoutHeight", "(I)V", "onClickListener", "Lkotlin/Function0;", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickListener", "(Lkotlin/jvm/functions/Function0;)V", "overlayColor", "getOverlayColor", "setOverlayColor", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Landroid/graphics/Paint;", "setupLayout", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StatementOnBoardingView extends FrameLayout {
    @NotNull
    private Function0<Unit> getMax;
    @ColorRes
    private int length;
    private HashMap setMax;
    private int setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @JvmOverloads
    public StatementOnBoardingView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public StatementOnBoardingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatementOnBoardingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StatementOnBoardingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = R.color.f18312131099702;
        this.getMax = setMax.INSTANCE;
        getMin();
        setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ StatementOnBoardingView length;

            {
                this.length = r1;
            }

            public final void onClick(View view) {
                this.length.getOnClickListener().invoke();
            }
        });
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public StatementOnBoardingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = R.color.f18312131099702;
        this.getMax = setMax.INSTANCE;
        getMin();
        setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ StatementOnBoardingView length;

            {
                this.length = r1;
            }

            public final void onClick(View view) {
                this.length.getOnClickListener().invoke();
            }
        });
    }

    public final int getLayoutHeight() {
        return this.setMin;
    }

    public final void setLayoutHeight(int i) {
        this.setMin = i;
    }

    public final int getOverlayColor() {
        return this.length;
    }

    public final void setOverlayColor(int i) {
        this.length = i;
    }

    @NotNull
    public final Function0<Unit> getOnClickListener() {
        return this.getMax;
    }

    public final void setOnClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.getMax = function0;
    }

    private final void getMin() {
        bringToFront();
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
        setFitsSystemWindows(true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View.inflate(getContext(), R.layout.layout_statement_swipe_lottie, this);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(@Nullable Canvas canvas) {
        if (canvas != null) {
            float width = (float) getWidth();
            float f = (float) this.setMin;
            Paint paint = new Paint();
            paint.setColor(IntRange.setMax(getContext(), this.length));
            canvas.drawRect(0.0f, 0.0f, width, f, paint);
        }
    }
}
