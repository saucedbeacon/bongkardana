package o;

import android.view.View;

public abstract class observedEntities implements View.OnClickListener {
    autoGenerate setMax;

    public abstract void getMin(View view);

    public observedEntities(autoGenerate autogenerate) {
        this.setMax = autogenerate;
    }

    public void onClick(View view) {
        autoGenerate autogenerate = this.setMax;
        if (autogenerate != null && autogenerate.isClickable()) {
            this.setMax.disableClick();
            getMin(view);
        } else if (this.setMax == null) {
            getMin(view);
        }
    }
}
