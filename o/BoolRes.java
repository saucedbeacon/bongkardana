package o;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import o.ComponentActivity;

public class BoolRes extends ConstraintWidget {
    public ArrayList<ConstraintWidget> onVolumeInfoChanged = new ArrayList<>();

    public void valueOf() {
        this.onVolumeInfoChanged.clear();
        super.valueOf();
    }

    public final void setMin(ConstraintWidget constraintWidget) {
        this.onVolumeInfoChanged.add(constraintWidget);
        if (constraintWidget.requestPostMessageChannel != null) {
            ((BoolRes) constraintWidget.requestPostMessageChannel).onVolumeInfoChanged.remove(constraintWidget);
            constraintWidget.valueOf();
        }
        constraintWidget.requestPostMessageChannel = this;
    }

    public void asInterface() {
        ArrayList<ConstraintWidget> arrayList = this.onVolumeInfoChanged;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.onVolumeInfoChanged.get(i);
                if (constraintWidget instanceof BoolRes) {
                    ((BoolRes) constraintWidget).asInterface();
                }
            }
        }
    }

    public final void setMin(ComponentActivity.AnonymousClass3 r4) {
        super.setMin(r4);
        int size = this.onVolumeInfoChanged.size();
        for (int i = 0; i < size; i++) {
            this.onVolumeInfoChanged.get(i).setMin(r4);
        }
    }
}
