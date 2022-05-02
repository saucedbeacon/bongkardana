package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001J\u000e\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u001a\u0010\u0019\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\r¨\u0006&"}, d2 = {"Lid/dana/richview/LoadingLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "introMaxFrame", "getIntroMaxFrame", "()I", "setIntroMaxFrame", "(I)V", "introMinFrame", "getIntroMinFrame", "setIntroMinFrame", "isLoopFinished", "", "()Z", "setLoopFinished", "(Z)V", "loopMaxFrame", "getLoopMaxFrame", "setLoopMaxFrame", "loopMinFrame", "getLoopMinFrame", "setLoopMinFrame", "outroMaxFrame", "getOutroMaxFrame", "setOutroMaxFrame", "outroMinFrame", "getOutroMinFrame", "setOutroMinFrame", "setupIntroMinMaxFrame", "", "lavLottieAnimationView", "setupLoopMinMaxFrame", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class LoadingLottieAnimationView extends LottieAnimationView {
    private int getMax;
    private int getMin;
    private boolean isInside;
    private int length;
    private int setMax;
    private int setMin;
    private int toFloatRange;
    private HashMap toIntRange;

    @JvmOverloads
    public LoadingLottieAnimationView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public LoadingLottieAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingLottieAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoadingLottieAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, resetInternal.getMin.isCaptioningEnabled, 0, 0);
        this.length = obtainStyledAttributes.getInteger(1, 0);
        this.getMin = obtainStyledAttributes.getInteger(0, 0);
        this.getMax = obtainStyledAttributes.getInteger(3, 0);
        this.setMin = obtainStyledAttributes.getInteger(2, 0);
        this.setMax = obtainStyledAttributes.getInteger(5, 0);
        this.toFloatRange = obtainStyledAttributes.getInteger(4, 0);
        obtainStyledAttributes.recycle();
    }

    public final int getIntroMinFrame() {
        return this.length;
    }

    public final void setIntroMinFrame(int i) {
        this.length = i;
    }

    public final int getIntroMaxFrame() {
        return this.getMin;
    }

    public final void setIntroMaxFrame(int i) {
        this.getMin = i;
    }

    public final int getLoopMinFrame() {
        return this.getMax;
    }

    public final void setLoopMinFrame(int i) {
        this.getMax = i;
    }

    public final int getLoopMaxFrame() {
        return this.setMin;
    }

    public final void setLoopMaxFrame(int i) {
        this.setMin = i;
    }

    public final int getOutroMinFrame() {
        return this.setMax;
    }

    public final void setOutroMinFrame(int i) {
        this.setMax = i;
    }

    public final int getOutroMaxFrame() {
        return this.toFloatRange;
    }

    public final void setOutroMaxFrame(int i) {
        this.toFloatRange = i;
    }

    public final boolean isLoopFinished() {
        return this.isInside;
    }

    public final void setLoopFinished(boolean z) {
        this.isInside = z;
    }

    public final void setupIntroMinMaxFrame(@NotNull LottieAnimationView lottieAnimationView) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "lavLottieAnimationView");
        lottieAnimationView.setMinFrame(this.length);
        lottieAnimationView.setMaxFrame(this.getMin);
    }

    public final void setupLoopMinMaxFrame(@NotNull LottieAnimationView lottieAnimationView) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "lavLottieAnimationView");
        lottieAnimationView.setMinFrame(this.getMax);
        lottieAnimationView.setMaxFrame(this.setMin);
    }
}
