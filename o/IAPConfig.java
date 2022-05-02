package o;

import android.widget.ImageView;
import id.dana.showcase.view.PointerView;
import o.PhotoView;

public final class IAPConfig extends PhotoView.State {
    public IAPConfig(ImageView imageView, PointerView pointerView, setUseAmcsLite setuseamcslite) {
        super(imageView, pointerView, setuseamcslite);
    }

    public final float getMax() {
        double d = (double) this.getMax.setMin.y;
        double max = (double) this.getMax.getMin.setMax();
        Double.isNaN(max);
        Double.isNaN(d);
        double d2 = d - (max * 0.5d);
        double height = (double) this.setMax.getHeight();
        Double.isNaN(height);
        double d3 = d2 - height;
        double containerPadding = (double) this.setMax.getContainerPadding();
        Double.isNaN(containerPadding);
        return (float) (d3 - containerPadding);
    }

    public final float length() {
        double height = (double) this.setMax.getHeight();
        double height2 = (double) this.setMin.getHeight();
        Double.isNaN(height2);
        Double.isNaN(height);
        return (float) (height - (height2 * 1.5d));
    }

    public final float getMin() {
        return (float) (this.setMax.getHeight() - this.setMin.getHeight());
    }
}
