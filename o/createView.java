package o;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class createView extends superDispatchKeyEvent {
    private Uri getMax;
    private Context setMin;

    createView(@Nullable superDispatchKeyEvent superdispatchkeyevent, Context context, Uri uri) {
        super(superdispatchkeyevent);
        this.setMin = context;
        this.getMax = uri;
    }

    public superDispatchKeyEvent getMax(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public superDispatchKeyEvent getMin(String str) {
        throw new UnsupportedOperationException();
    }

    public Uri setMin() {
        return this.getMax;
    }

    @Nullable
    public String getMin() {
        return setupDialog.getMin(this.setMin, this.getMax);
    }

    @Nullable
    public String getMax() {
        return setupDialog.setMin(this.setMin, this.getMax);
    }

    public boolean setMax() {
        return setupDialog.setMax(this.setMin, this.getMax);
    }

    public boolean toFloatRange() {
        return setupDialog.getMax(this.setMin, this.getMax);
    }

    public boolean IsOverlapping() {
        return setupDialog.length(this.setMin, this.getMax);
    }

    public boolean isInside() {
        return setupDialog.equals(this.setMin, this.getMax);
    }

    public boolean equals() {
        try {
            return DocumentsContract.deleteDocument(this.setMin.getContentResolver(), this.getMax);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean toIntRange() {
        return setupDialog.IsOverlapping(this.setMin, this.getMax);
    }

    public superDispatchKeyEvent[] FastBitmap$CoordinateSystem() {
        throw new UnsupportedOperationException();
    }

    public boolean setMax(String str) {
        throw new UnsupportedOperationException();
    }
}
