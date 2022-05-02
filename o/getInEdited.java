package o;

import android.widget.RadioGroup;
import id.dana.sendmoney.view.ExpireTimeView;

public final class getInEdited implements RadioGroup.OnCheckedChangeListener {
    private final ExpireTimeView length;

    public getInEdited(ExpireTimeView expireTimeView) {
        this.length = expireTimeView;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.length.doneChangeExpiry();
    }
}
