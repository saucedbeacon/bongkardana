package o;

import o.Ignore;

public abstract class projection implements Ignore.setMin {
    private final autoGenerate setMax;

    public abstract void getMax(int i);

    public projection(autoGenerate autogenerate) {
        this.setMax = autogenerate;
    }

    public final void length(int i) {
        autoGenerate autogenerate = this.setMax;
        if (autogenerate != null && autogenerate.isClickable()) {
            this.setMax.disableClick();
            getMax(i);
        } else if (this.setMax == null) {
            getMax(i);
        }
    }
}
