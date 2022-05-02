package id.dana.utils;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

public class CustomLinearLayoutManager extends LinearLayoutManager {
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public CustomLinearLayoutManager(Context context) {
        super(context);
    }
}
