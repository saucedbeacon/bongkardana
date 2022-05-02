package o;

import android.view.View;
import id.dana.richview.CommonInputFieldView;

public final class onTap implements View.OnClickListener {
    private final CommonInputFieldView setMin;

    public onTap(CommonInputFieldView commonInputFieldView) {
        this.setMin = commonInputFieldView;
    }

    public final void onClick(View view) {
        this.setMin.selectedEt.setText("");
    }
}
