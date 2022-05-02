package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.ITrustedWebActivityCallback;
import o.getFlags;
import o.getShuffleMode;

public class AppCompatSeekBar extends SeekBar {
    private final getFlags setMax;

    public AppCompatSeekBar(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSeekBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.ICustomTabsService);
    }

    public AppCompatSeekBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getShuffleMode.getMax(getContext());
        getFlags getflags = new getFlags(this);
        this.setMax = getflags;
        getflags.getMax(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.setMax.setMax(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.setMax.setMax();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.setMax.length();
    }
}
