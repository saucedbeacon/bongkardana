package o;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class setOverflowReserved implements setOverflowIcon {
    private final WindowId getMin;

    setOverflowReserved(@NonNull View view) {
        this.getMin = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof setOverflowReserved) && ((setOverflowReserved) obj).getMin.equals(this.getMin);
    }

    public int hashCode() {
        return this.getMin.hashCode();
    }
}
