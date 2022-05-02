package o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class IconCompatParcelizer {
    private boolean getMax;
    Object setMax;

    public interface getMin {
        boolean getMin(IconCompatParcelizer iconCompatParcelizer, Menu menu);

        boolean getMin(IconCompatParcelizer iconCompatParcelizer, MenuItem menuItem);

        void setMax(IconCompatParcelizer iconCompatParcelizer);

        boolean setMax(IconCompatParcelizer iconCompatParcelizer, Menu menu);
    }

    public abstract View IsOverlapping();

    public abstract CharSequence equals();

    public abstract Menu getMax();

    public abstract void getMax(int i);

    public abstract void getMin();

    public abstract void getMin(CharSequence charSequence);

    public boolean isInside() {
        return false;
    }

    public abstract void length();

    public abstract MenuInflater setMax();

    public abstract void setMin(int i);

    public abstract void setMin(View view);

    public abstract void setMin(CharSequence charSequence);

    public abstract CharSequence toIntRange();

    public void getMax(boolean z) {
        this.getMax = z;
    }

    public final boolean toFloatRange() {
        return this.getMax;
    }
}
