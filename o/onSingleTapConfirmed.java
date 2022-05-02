package o;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.showcase.view.EmptyContentView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PhotoView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\tH\u0014J\n\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0014J\t\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0014J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lid/dana/showcase/SectionShowcase;", "Lid/dana/showcase/BaseShowcase;", "params", "Lid/dana/showcase/Params;", "showcaseListener", "Lid/dana/showcase/OnShowcaseStateListener;", "activity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "(Lid/dana/showcase/Params;Lid/dana/showcase/OnShowcaseStateListener;Landroid/app/Activity;Landroid/view/View;)V", "target", "Lid/dana/showcase/target/Target;", "createListener", "", "sectionParams", "Lid/dana/showcase/SectionParams;", "createTooltip", "getContentView", "getCurrentTarget", "next", "notSafeToGo", "", "prev", "setupShowcase", "showFirstTarget", "showTargetAt", "position", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onSingleTapConfirmed extends getValidShowingPhoto {
    private View equals;
    private final Activity isInside;
    private setUseAmcsLite setMin;

    public onSingleTapConfirmed(@Nullable onLongPress onlongpress, @Nullable PhotoView.FlingRunnable flingRunnable, @Nullable Activity activity, @Nullable View view) {
        super(onlongpress, activity, flingRunnable, (byte) 0);
        this.isInside = activity;
        this.equals = view;
        onLongPress onlongpress2 = this.length;
        if (onlongpress2 != null) {
            PhotoView.GestureListener gestureListener = (PhotoView.GestureListener) onlongpress2;
            isInside();
            if (gestureListener.setMax()) {
                RecyclerView recyclerView = gestureListener.IsOverlapping;
                if (recyclerView != null) {
                    recyclerView.smoothScrollToPosition(gestureListener.equals);
                }
                RecyclerView recyclerView2 = gestureListener.IsOverlapping;
                if (recyclerView2 != null) {
                    recyclerView2.addOnScrollListener(new setMin(this));
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.showcase.SectionParams");
    }

    /* access modifiers changed from: protected */
    public final boolean IsOverlapping() {
        return super.IsOverlapping() || this.setMin == null;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final setUseAmcsLite length() {
        return this.setMin;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final View getMin() {
        Activity activity = this.setMax.get();
        Intrinsics.checkNotNullExpressionValue(activity, HummerConstants.CONTEXT);
        return new EmptyContentView(activity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    public final void setMin() {
        setUseAmcsLite setuseamcslite = this.setMin;
        if (setuseamcslite != null) {
            length(setuseamcslite);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"id/dana/showcase/SectionShowcase$createListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "scrollY", "", "getScrollY", "()I", "setScrollY", "(I)V", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "onScrolled", "dx", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends RecyclerView.toIntRange {
        private int getMin;
        final /* synthetic */ onSingleTapConfirmed length;

        setMin(onSingleTapConfirmed onsingletapconfirmed) {
            this.length = onsingletapconfirmed;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.getMin += i2;
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.getMin > 0) {
                this.length.isInside();
                recyclerView.clearOnScrollListeners();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void isInside() {
        View view = this.equals;
        if (view != null) {
            this.setMin = ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(this.isInside).getMax(view)).setMin(new getUseAmcsLite(view, 0.0f, 0.0f))).getMin();
        }
    }
}
