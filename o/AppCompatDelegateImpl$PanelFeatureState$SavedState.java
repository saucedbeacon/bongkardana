package o;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class AppCompatDelegateImpl$PanelFeatureState$SavedState extends AppCompatDelegate$NightMode {
    private int FastBitmap$CoordinateSystem;
    private int setMax;
    private LayoutInflater toString;

    @Deprecated
    public AppCompatDelegateImpl$PanelFeatureState$SavedState(Context context, int i) {
        super(context);
        this.FastBitmap$CoordinateSystem = i;
        this.setMax = i;
        this.toString = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View setMax(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.toString.inflate(this.setMax, viewGroup, false);
    }

    public final View getMin(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.toString.inflate(this.FastBitmap$CoordinateSystem, viewGroup, false);
    }
}
