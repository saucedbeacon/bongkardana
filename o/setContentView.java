package o;

import android.util.Pair;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import java.util.HashMap;

public class setContentView {
    static final HashMap<String, String> getMin = new HashMap<>();
    static final HashMap<Pair<Integer, Integer>, String> length = new HashMap<>();
    private int IsOverlapping = -1;
    private final MotionLayout getMax;
    private String setMax = null;
    private String setMin = null;
    private int toFloatRange = -1;

    public setContentView(MotionLayout motionLayout) {
        this.getMax = motionLayout;
    }

    static {
        length.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        length.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        length.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        length.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        length.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        length.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        length.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        length.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        length.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        length.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        length.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        length.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        length.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        getMin.put("layout_constraintBottom_toBottomOf", AUAttrsConstant.VIEW_MARGIN_BOTTOM);
        getMin.put("layout_constraintBottom_toTopOf", AUAttrsConstant.VIEW_MARGIN_BOTTOM);
        getMin.put("layout_constraintTop_toBottomOf", AUAttrsConstant.VIEW_MARGIN_TOP);
        getMin.put("layout_constraintTop_toTopOf", AUAttrsConstant.VIEW_MARGIN_TOP);
        getMin.put("layout_constraintStart_toStartOf", "layout_marginStart");
        getMin.put("layout_constraintStart_toEndOf", "layout_marginStart");
        getMin.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        getMin.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        getMin.put("layout_constraintLeft_toLeftOf", AUAttrsConstant.VIEW_MARGIN_LEFT);
        getMin.put("layout_constraintLeft_toRightOf", AUAttrsConstant.VIEW_MARGIN_LEFT);
        getMin.put("layout_constraintRight_toRightOf", AUAttrsConstant.VIEW_MARGIN_RIGHT);
        getMin.put("layout_constraintRight_toLeftOf", AUAttrsConstant.VIEW_MARGIN_RIGHT);
    }
}
