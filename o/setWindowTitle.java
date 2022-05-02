package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

class setWindowTitle extends setLogo implements hasLogo {
    setWindowTitle(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    static setWindowTitle length(ViewGroup viewGroup) {
        return (setWindowTitle) setLogo.length((View) viewGroup);
    }

    public void setMax(@NonNull View view) {
        this.length.getMax(view);
    }

    public void getMin(@NonNull View view) {
        this.length.getMin(view);
    }
}
