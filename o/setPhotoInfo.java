package o;

import android.view.View;
import id.dana.sendmoney.paymethod.ChangePayMethodView;

public final class setPhotoInfo implements View.OnClickListener {
    private final ChangePayMethodView setMin;

    public setPhotoInfo(ChangePayMethodView changePayMethodView) {
        this.setMin = changePayMethodView;
    }

    public final void onClick(View view) {
        ChangePayMethodView.setMax(this.setMin);
    }
}
