package o;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public final class onItemsMoved {
    public RecyclerView.IsOverlapping length;

    public onItemsMoved(@NonNull RecyclerView.IsOverlapping isOverlapping) {
        this.length = isOverlapping;
    }
}
