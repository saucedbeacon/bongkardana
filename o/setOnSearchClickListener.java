package o;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

public final class setOnSearchClickListener {
    public final List<setInputType<Integer, Integer>> getMin;
    public final List<Mask> setMax;
    public final List<setInputType<enoughToFilter, Path>> setMin;

    public setOnSearchClickListener(List<Mask> list) {
        this.setMax = list;
        this.setMin = new ArrayList(list.size());
        this.getMin = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.setMin.add(new setQueryHint(list.get(i).getMax.setMin));
            this.getMin.add(new setOnQueryTextFocusChangeListener(list.get(i).setMin.setMin));
        }
    }
}
