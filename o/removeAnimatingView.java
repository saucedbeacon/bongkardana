package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.offset.Reference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiresApi(21)
public class removeAnimatingView extends initAdapterManager {
    private static final String length;
    private static final CameraLogger setMax;
    private final boolean equals;
    private final setEdgeEffectFactory getMax;
    private List<setLayoutManager> getMin;
    private setScrollingTouchSlop setMin;
    private final initChildrenHelper toIntRange;

    static {
        String simpleName = removeAnimatingView.class.getSimpleName();
        length = simpleName;
        setMax = CameraLogger.setMin(simpleName);
    }

    public removeAnimatingView(@NonNull initChildrenHelper initchildrenhelper, @Nullable setEdgeEffectFactory setedgeeffectfactory, boolean z) {
        this.getMax = setedgeeffectfactory;
        this.toIntRange = initchildrenhelper;
        this.equals = z;
    }

    @NonNull
    public final setScrollingTouchSlop getMax() {
        return this.setMin;
    }

    public final boolean getMin() {
        for (setLayoutManager max : this.getMin) {
            if (!max.getMax()) {
                setMax.getMax(1, "isSuccessful:", "returning false.");
                return false;
            }
        }
        setMax.getMax(1, "isSuccessful:", "returning true.");
        return true;
    }

    public final void length(@NonNull getFullClassName getfullclassname) {
        setMax.getMax(2, "onStart:", "initializing.");
        List arrayList = new ArrayList();
        if (this.getMax != null) {
            removeItemDecoration invoke = this.toIntRange.invoke();
            onEnterLayoutOrScroll create = this.toIntRange.create();
            setScrollState setscrollstate = new setScrollState(invoke, new shouldDeferAccessibilityEvent(create.toIntRange, create.IsOverlapping), this.toIntRange.getMin(Reference.VIEW), this.toIntRange.create().toIntRange(), getfullclassname.toDoubleRange(), getfullclassname.Grayscale$Algorithm());
            arrayList = this.getMax.setMin(setscrollstate).getMin(Integer.MAX_VALUE, setscrollstate);
        }
        getRecycledViewPool getrecycledviewpool = new getRecycledViewPool(arrayList, this.equals);
        addAnimatingView addanimatingview = new addAnimatingView(arrayList, this.equals);
        getScrollState getscrollstate = new getScrollState(arrayList, this.equals);
        this.getMin = Arrays.asList(new setLayoutManager[]{getrecycledviewpool, addanimatingview, getscrollstate});
        this.setMin = new addRecyclerListener(Arrays.asList(new setScrollingTouchSlop[]{getrecycledviewpool, addanimatingview, getscrollstate}));
        setMax.getMin("onStart:", "initialized.");
        super.length(getfullclassname);
    }
}
