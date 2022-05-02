package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

public final class showPopup extends RecyclerView.valueOf {
    private showPopup(@NonNull FrameLayout frameLayout) {
        super(frameLayout);
    }

    @NonNull
    static showPopup getMin(@NonNull ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.getMin());
        frameLayout.setSaveEnabled(false);
        return new showPopup(frameLayout);
    }
}
