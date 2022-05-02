package o;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import id.dana.sendmoney.bank.AddReceiverDialogFragment;

public final class getStoreFilePath implements DatePickerDialog.OnDateSetListener {
    private final AddReceiverDialogFragment getMin;

    public getStoreFilePath(AddReceiverDialogFragment addReceiverDialogFragment) {
        this.getMin = addReceiverDialogFragment;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        AddReceiverDialogFragment.setMax(this.getMin, i, i2, i3);
    }
}
