package o;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.PhotoView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0000H\u0014J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/showcase/SectionShowcaseBuilder;", "Lid/dana/showcase/AbstractShowcaseBuilder;", "activity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;)V", "isAutoScroll", "", "position", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getParams", "Lid/dana/showcase/Params;", "self", "setAutoScroll", "setPosition", "setRecyclerView", "show", "Lid/dana/showcase/Showcase;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class cancelFling extends postRotate<cancelFling> {
    public boolean FastBitmap$CoordinateSystem;
    private final View hashCode;
    public RecyclerView toString;
    public int values;

    public final /* bridge */ /* synthetic */ postRotate getMax() {
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cancelFling(@Nullable Activity activity, @NotNull View view) {
        super(activity);
        Intrinsics.checkNotNullParameter(view, "view");
        this.hashCode = view;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final onLongPress getMin() {
        return new PhotoView.GestureListener(this.toFloatRange, this.IsOverlapping, this.equals, this.getMin, this.length, this.setMin, this.toIntRange, this.toString, this.values, this.FastBitmap$CoordinateSystem);
    }

    @NotNull
    public final PhotoView.PhotoInter length() {
        PhotoView.PhotoInter max = new onSingleTapConfirmed(getMin(), this.isInside, (Activity) this.setMax.get(), this.hashCode).getMax();
        Intrinsics.checkNotNullExpressionValue(max, "SectionShowcase(params, …rence.get(), view).show()");
        return max;
    }
}
