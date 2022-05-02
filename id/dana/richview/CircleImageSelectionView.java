package id.dana.richview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.access$3300;
import o.dispatchOnCancelled;
import o.evaluate;
import o.getTopSortedChildren;
import o.isLineVisible;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.updateCornerMarking;

public class CircleImageSelectionView extends BaseRichView {
    private length IsOverlapping;
    private int equals;
    private ImageView getMax;
    private ImageView getMin;
    private int isInside;
    private ImageView length;
    private FrameLayout setMax;
    private ImageView setMin;
    private int toFloatRange;
    private ImageView toIntRange;
    private int values = 0;

    public interface length {
        void length();
    }

    public int getLayout() {
        return R.layout.view_circle_image_selection;
    }

    public CircleImageSelectionView(@NonNull Context context) {
        super(context);
    }

    public CircleImageSelectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleImageSelectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CircleImageSelectionView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        this.setMax = (FrameLayout) findViewById(R.id.f44242131362949);
        this.getMax = (ImageView) findViewById(R.id.f50122131363567);
        this.getMin = (ImageView) findViewById(R.id.f50132131363568);
        this.length = (ImageView) findViewById(R.id.f48282131363382);
        this.toIntRange = (ImageView) findViewById(R.id.f48292131363383);
        this.setMin = (ImageView) findViewById(R.id.f50572131363612);
        ViewGroup.LayoutParams layoutParams = this.getMax.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.getMin.getLayoutParams();
        int i = this.toFloatRange;
        if (!(i == 0 || this.isInside == 0)) {
            layoutParams2.width = i;
            layoutParams2.height = this.isInside;
            int i2 = this.toFloatRange;
            Resources system = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
            layoutParams.width = i2 - ((int) TypedValue.applyDimension(1, (float) this.values, system.getDisplayMetrics()));
            int i3 = this.isInside;
            Resources system2 = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system2, "Resources.getSystem()");
            layoutParams.height = i3 - ((int) TypedValue.applyDimension(1, (float) this.values, system2.getDisplayMetrics()));
        }
        ImageView imageView = this.length;
        int i4 = this.equals;
        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.width = i4;
            layoutParams3.height = i4;
        }
        ImageView imageView2 = this.setMin;
        int i5 = this.equals;
        ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.width = i5;
            layoutParams4.height = i5;
        }
        ImageView imageView3 = this.toIntRange;
        int i6 = this.equals;
        ViewGroup.LayoutParams layoutParams5 = imageView3.getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.width = i6;
            layoutParams5.height = i6;
        }
    }

    public void loadImage(String str) {
        loadImage(str, R.drawable.ic_avatar_grey_default);
    }

    public void loadImage(String str, int i) {
        ((updateCornerMarking) Glide.getMax(getContext())).equals().length(str).setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax(i).setMin(i).length(this.getMax);
    }

    public void useRemoveIcon(boolean z) {
        this.setMin.setVisibility(z ? 0 : 8);
        if (z) {
            this.setMax.setOnClickListener(new access$3300(this));
        }
    }

    public void setActionIcon(int i) {
        this.setMin.setImageDrawable(IntRange.length(getContext(), i));
    }

    public void setSelectedState() {
        this.length.setVisibility(0);
        this.setMax.setAlpha(0.7f);
    }

    public void setUnselectedState() {
        this.length.setVisibility(8);
        this.setMax.setAlpha(1.0f);
    }

    public void setCheckTopVisibleState() {
        this.toIntRange.setVisibility(0);
        this.getMin.setVisibility(0);
        this.getMin.setBackground(IntRange.length(getContext(), (int) R.drawable.bg_gradient_blue_circle));
    }

    public void setCheckTopInvisibleState() {
        this.toIntRange.setVisibility(8);
        this.getMin.setVisibility(4);
    }

    public void setPaddingPhoto(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1638113205, oncanceled);
            onCancelLoad.getMin(1638113205, oncanceled);
        }
        this.getMax.setPadding(i, i, i, i);
    }

    public void setPhotoCircleDisplay(boolean z) {
        this.getMin.setVisibility(z ? 0 : 8);
    }

    public void setListener(length length2) {
        this.IsOverlapping = length2;
    }

    /* JADX INFO: finally extract failed */
    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842996, 16842997});
            try {
                this.toFloatRange = obtainStyledAttributes.getDimensionPixelSize(0, -2);
                this.isInside = obtainStyledAttributes.getDimensionPixelSize(1, -2);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.ICustomTabsService);
                try {
                    float dimension = obtainStyledAttributes2.getDimension(0, 9.0f);
                    float dimension2 = obtainStyledAttributes2.getDimension(1, 0.0f);
                    this.equals = Math.round(dimension);
                    this.values = Math.round(dimension2);
                } finally {
                    obtainStyledAttributes2.recycle();
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public static /* synthetic */ void setMax(CircleImageSelectionView circleImageSelectionView) {
        length length2 = circleImageSelectionView.IsOverlapping;
        if (length2 != null) {
            length2.length();
        }
    }
}
