package Catalano.Imaging;

import android.graphics.Bitmap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class FastBitmap {
    private CoordinateSystem IsOverlapping;
    public int getMax;
    public int getMin;
    public Bitmap length;
    public int[] setMax;
    public boolean setMin = false;

    public enum CoordinateSystem {
        Cartesian,
        Matrix
    }

    public FastBitmap() {
    }

    public FastBitmap(FastBitmap fastBitmap) {
        this.length = fastBitmap.setMax();
        length(fastBitmap.IsOverlapping);
        setMin();
        if (fastBitmap.getMax()) {
            this.setMin = false;
        } else {
            this.setMin = true;
        }
    }

    public FastBitmap(Bitmap bitmap) {
        if (bitmap.isMutable()) {
            this.length = bitmap;
            length(CoordinateSystem.Matrix);
            setMin();
            return;
        }
        throw new IllegalArgumentException("Bitmap needs to be mutable.");
    }

    private void setMin() {
        int[] iArr = new int[(this.length.getWidth() * this.length.getHeight())];
        this.setMax = iArr;
        Bitmap bitmap = this.length;
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, this.length.getWidth(), this.length.getHeight());
    }

    private void length(CoordinateSystem coordinateSystem) {
        this.IsOverlapping = coordinateSystem;
        if (coordinateSystem == CoordinateSystem.Matrix) {
            this.getMin = this.length.getWidth();
            this.getMax = 1;
            return;
        }
        this.getMin = 1;
        this.getMax = this.length.getWidth();
    }

    public final void setMin(int i, int i2, int i3, int i4, int i5) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1292173764, oncanceled);
            onCancelLoad.getMin(-1292173764, oncanceled);
        }
        this.setMax[(i * this.getMin) + (i2 * this.getMax)] = -16777216 | (i3 << 16) | (i4 << 8) | i5;
    }

    public final void setMin(int i, int i2, int i3) {
        this.setMax[(i * this.getMin) + (i2 * this.getMax)] = (i3 << 16) | -16777216 | (i3 << 8) | i3;
    }

    public final boolean getMax() {
        return !this.setMin;
    }

    public final boolean getMin() {
        return this.setMin;
    }

    public final Bitmap setMax() {
        if (!getMax()) {
            int height = this.length.getHeight() * this.length.getWidth();
            for (int i = 0; i < height; i++) {
                int[] iArr = this.setMax;
                int i2 = iArr[i] & 255;
                iArr[i] = i2 | -16777216 | (i2 << 16) | (i2 << 8);
            }
        }
        this.length.setPixels(this.setMax, 0, Math.max(this.getMin, this.getMax), 0, 0, this.length.getWidth(), this.length.getHeight());
        return this.length;
    }
}
