package o;

import o.setStatusBar;

public abstract class OnConflictStrategy implements setStatusBar.length {
    autoGenerate getMax;

    public abstract void setMax(int i);

    public OnConflictStrategy(autoGenerate autogenerate) {
        this.getMax = autogenerate;
    }

    public final void getMin(int i) {
        autoGenerate autogenerate = this.getMax;
        if (autogenerate != null && autogenerate.isClickable()) {
            this.getMax.disableClick();
            setMax(i);
        }
    }
}
