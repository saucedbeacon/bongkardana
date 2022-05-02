package o;

import androidx.annotation.NonNull;

public interface viewNeedsUpdate {

    public interface getMax {
        void stateChangeComplete();
    }

    void handleStateChange(@NonNull isItemRemoved isitemremoved, @NonNull getMax getmax);
}
