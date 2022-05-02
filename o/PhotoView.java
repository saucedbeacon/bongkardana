package o;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.model.ThirdPartyService;
import id.dana.showcase.view.PointerView;
import id.dana.showcase.view.SimpleContentView;
import id.dana.showcase.view.SkipShowCaseView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PhotoView extends IMultiInstanceInvalidationCallback.Stub<Ignore<ThirdPartyService>, ThirdPartyService> {
    private boolean getMax;
    public setMin getMin;
    public boolean length = false;
    public length setMax;

    final class DragDetector implements DragListener {
        private final getValidShowingPhoto setMax;

        public DragDetector(getValidShowingPhoto getvalidshowingphoto) {
            this.setMax = getvalidshowingphoto;
        }

        public final void length() {
            getValidShowingPhoto.length(this.setMax);
        }
    }

    public interface DragListener {
        void length();
    }

    public interface FlingRunnable {
        void onFinished(int i);

        void onStarted();

        void onTargetSelected(int i);
    }

    public interface PhotoInter {
        PhotoInter getMax();

        void setMax();
    }

    final class ScaleListener implements SimpleContentView.length {
        private final getRect getMin;

        public ScaleListener(getRect getrect) {
            this.getMin = getrect;
        }

        public final void setMin() {
            PhotoView.super.setMin(2);
        }
    }

    public interface length {
        void setMin();
    }

    public interface setMin {
        int setMin(ThirdPartyService thirdPartyService);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lid/dana/showcase/SkipShowCaseBuilder;", "Lid/dana/showcase/SimpleShowcaseBuilder;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "show", "Lid/dana/showcase/Showcase;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class SimpleDragListener extends initRect {
        public SimpleDragListener(@Nullable Activity activity) {
            super(activity);
        }

        @NotNull
        public final PhotoInter length() {
            setUseAmcsLite setuseamcslite = this.toString;
            Intrinsics.checkNotNullExpressionValue(setuseamcslite, "target");
            PhotoInter max = new TransRunnable(getMin(), (Activity) this.setMax.get(), setuseamcslite, this.isInside).getMax();
            Intrinsics.checkNotNullExpressionValue(max, "SkipShowCase(params, act…caseStateListener).show()");
            return max;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0002\u0010\u0012R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lid/dana/showcase/SectionParams;", "Lid/dana/showcase/Params;", "duration", "", "interpolator", "Landroid/animation/TimeInterpolator;", "overlayColor", "", "dismissOnTouchOutside", "", "paddingLeft", "paddingRight", "containerPadding", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "position", "isAutoscroll", "(JLandroid/animation/TimeInterpolator;IZIIFLandroidx/recyclerview/widget/RecyclerView;IZ)V", "()Z", "getPosition", "()I", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class GestureListener extends onLongPress {
        @Nullable
        final RecyclerView IsOverlapping;
        final int equals;
        private final boolean isInside;

        public final boolean setMax() {
            return this.isInside;
        }

        public GestureListener(long j, @Nullable TimeInterpolator timeInterpolator, int i, boolean z, int i2, int i3, float f, @Nullable RecyclerView recyclerView, int i4, boolean z2) {
            super(j, timeInterpolator, i, z, i2, i3, f);
            this.IsOverlapping = recyclerView;
            this.equals = i4;
            this.isInside = z2;
        }
    }

    public final class GridDetector extends postRotate<GridDetector> {
        private boolean toString = true;
        public List<? extends setUseAmcsLite> values;

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ postRotate getMax() {
            return this;
        }

        public final /* bridge */ /* synthetic */ postRotate length(int i) {
            return super.length(i);
        }

        public final /* bridge */ /* synthetic */ postRotate length(boolean z) {
            return super.length(z);
        }

        public final /* bridge */ /* synthetic */ postRotate setMax(int i) {
            return super.setMax(i);
        }

        public final /* bridge */ /* synthetic */ postRotate setMax(TimeInterpolator timeInterpolator) {
            return super.setMax(timeInterpolator);
        }

        public final /* bridge */ /* synthetic */ postRotate setMin(float f) {
            return super.setMin(f);
        }

        public final /* bridge */ /* synthetic */ postRotate setMin(int i) {
            return super.setMin(i);
        }

        public final /* bridge */ /* synthetic */ postRotate setMin(FlingRunnable flingRunnable) {
            return super.setMin(flingRunnable);
        }

        public GridDetector(Activity activity) {
            super(activity);
        }

        /* access modifiers changed from: protected */
        @NotNull
        public final onLongPress getMin() {
            return new onDragEnd(this.toFloatRange, this.toString, this.IsOverlapping, this.equals, this.getMin, this.length, this.setMin, this.toIntRange);
        }

        public final PhotoInter setMin() {
            return new onDragBegin(this.values, (Activity) this.setMax.get(), getMin(), this.isInside).getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\r"}, d2 = {"Lid/dana/showcase/SkipShowCase;", "Lid/dana/showcase/SimpleShowcase;", "params", "Lid/dana/showcase/Params;", "activity", "Landroid/app/Activity;", "target", "Lid/dana/showcase/target/Target;", "showCaseListener", "Lid/dana/showcase/OnShowcaseStateListener;", "(Lid/dana/showcase/Params;Landroid/app/Activity;Lid/dana/showcase/target/Target;Lid/dana/showcase/OnShowcaseStateListener;)V", "getContentView", "Landroid/view/View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class TransRunnable extends getRect {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TransRunnable(@Nullable onLongPress onlongpress, @Nullable Activity activity, @NotNull setUseAmcsLite setuseamcslite, @Nullable FlingRunnable flingRunnable) {
            super(onlongpress, activity, setuseamcslite, flingRunnable, false, true);
            Intrinsics.checkNotNullParameter(setuseamcslite, "target");
        }

        /* access modifiers changed from: protected */
        @NotNull
        public final View getMin() {
            Activity activity = this.setMax.get();
            Intrinsics.checkNotNullExpressionValue(activity, HummerConstants.CONTEXT);
            return new SkipShowCaseView(activity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
    }

    public final class ScaleRunnable extends State {
        public final float getMin() {
            return 0.0f;
        }

        public ScaleRunnable(ImageView imageView, PointerView pointerView, setUseAmcsLite setuseamcslite) {
            super(imageView, pointerView, setuseamcslite);
        }

        public final float getMax() {
            return this.getMax.setMin.y + (this.getMax.getMin.setMax() * 0.4f) + this.setMax.getContainerPadding();
        }

        public final float length() {
            return ((float) this.setMin.getHeight()) * 0.4f;
        }
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        Ignore ignore = (Ignore) valueof;
        if (ignore instanceof applyCrop) {
            ((applyCrop) ignore).setMax = this.getMax;
        }
        super.onBindViewHolder(ignore, i);
    }

    public /* synthetic */ void onViewAttachedToWindow(@NonNull RecyclerView.valueOf valueof) {
        length length2;
        Ignore ignore = (Ignore) valueof;
        super.onViewAttachedToWindow(ignore);
        if (ignore.getItemViewType() == 4 && (length2 = this.setMax) != null && this.length) {
            length2.setMin();
            this.length = false;
        }
    }

    public abstract class State {
        public final setUseAmcsLite getMax;
        public final float length;
        public final PointerView setMax;
        public final ImageView setMin;

        public abstract float getMax();

        public abstract float getMin();

        public abstract float length();

        State(ImageView imageView, PointerView pointerView, setUseAmcsLite setuseamcslite) {
            this.setMin = imageView;
            this.setMax = pointerView;
            this.getMax = setuseamcslite;
            this.length = ((float) imageView.getWidth()) * 0.5f;
        }
    }

    public int getItemViewType(int i) {
        if (i < 0 || i >= getMax().size() || setMin(i) == null) {
            return 0;
        }
        int i2 = ((ThirdPartyService) setMin(i)).values;
        if (i2 == 3) {
            return 1;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 != 5) {
            return i2 != 6 ? 2 : 5;
        }
        return 4;
    }

    public final void getMax(Ignore<ThirdPartyService> ignore, int i) {
        if (ignore instanceof applyCrop) {
            ((applyCrop) ignore).setMax = this.getMax;
        }
        super.onBindViewHolder(ignore, i);
    }

    public final boolean setMax(ThirdPartyService thirdPartyService) {
        if (getMax() == null || getMax().isEmpty()) {
            return false;
        }
        return getMax().contains(thirdPartyService);
    }

    public final void setMin(boolean z) {
        if (this.getMax != z) {
            this.getMax = z;
            length(z);
        }
    }

    /* access modifiers changed from: protected */
    public void length(boolean z) {
        if (z) {
            ArrayList<ThirdPartyService> arrayList = new ArrayList<>(getMax());
            ArrayList arrayList2 = new ArrayList(getMax());
            for (ThirdPartyService thirdPartyService : arrayList) {
                if (thirdPartyService.length()) {
                    arrayList2.remove(thirdPartyService);
                }
            }
            getMin(arrayList2);
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new isPhotoUpTop(viewGroup);
        }
        if (i == 3) {
            return new setOnClickListener(viewGroup);
        }
        if (i != 4) {
            return i != 5 ? new setEnableCrop(viewGroup, this.getMin) : new getEnableCrop(viewGroup);
        }
        return new isPhotoScaled(viewGroup, this.getMin);
    }
}
