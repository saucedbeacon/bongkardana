package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

public final class setShadowResourceLeft extends findItemsWithShortcutForKey {
    public setShadowResourceLeft(Context context) {
        super(context, 0);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        super.getItemOffsets(rect, view, recyclerView, recyclerView$Mean$Arithmetic);
        if (view.getVisibility() == 8) {
            rect.set(0, 0, 0, 0);
        }
    }
}
