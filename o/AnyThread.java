package o;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnyThread extends ConstraintWidget implements AttrRes {
    public ConstraintWidget[] onPlaybackStateChanged = new ConstraintWidget[4];
    public int onSessionDestroyed = 0;

    public void IsOverlapping() {
    }

    public final void length(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i = this.onSessionDestroyed + 1;
            ConstraintWidget[] constraintWidgetArr = this.onPlaybackStateChanged;
            if (i > constraintWidgetArr.length) {
                this.onPlaybackStateChanged = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.onPlaybackStateChanged;
            int i2 = this.onSessionDestroyed;
            constraintWidgetArr2[i2] = constraintWidget;
            this.onSessionDestroyed = i2 + 1;
        }
    }

    public void setMax(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.setMax(constraintWidget, hashMap);
        AnyThread anyThread = (AnyThread) constraintWidget;
        this.onSessionDestroyed = 0;
        int i = anyThread.onSessionDestroyed;
        for (int i2 = 0; i2 < i; i2++) {
            length(hashMap.get(anyThread.onPlaybackStateChanged[i2]));
        }
    }

    public final void toIntRange() {
        this.onSessionDestroyed = 0;
        Arrays.fill(this.onPlaybackStateChanged, (Object) null);
    }

    public final void getMax(ArrayList<Dimension> arrayList, int i, Dimension dimension) {
        for (int i2 = 0; i2 < this.onSessionDestroyed; i2++) {
            dimension.setMax(this.onPlaybackStateChanged[i2]);
        }
        for (int i3 = 0; i3 < this.onSessionDestroyed; i3++) {
            codename.getMin(this.onPlaybackStateChanged[i3], i, arrayList, dimension);
        }
    }

    public final int toDoubleRange(int i) {
        for (int i2 = 0; i2 < this.onSessionDestroyed; i2++) {
            ConstraintWidget constraintWidget = this.onPlaybackStateChanged[i2];
            if (i == 0 && constraintWidget.MediaBrowserCompat$MediaItem$Flags != -1) {
                return constraintWidget.MediaBrowserCompat$MediaItem$Flags;
            }
            if (i == 1 && constraintWidget.MediaDescriptionCompat != -1) {
                return constraintWidget.MediaDescriptionCompat;
            }
        }
        return -1;
    }
}
