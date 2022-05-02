package o;

import android.app.DatePickerDialog;
import android.view.View;
import id.dana.sendmoney.bank.AddReceiverDialogFragment;

public final class APImageLoadRequest implements View.OnClickListener {
    private final AddReceiverDialogFragment getMin;
    private final DatePickerDialog length;

    public APImageLoadRequest(AddReceiverDialogFragment addReceiverDialogFragment, DatePickerDialog datePickerDialog) {
        this.getMin = addReceiverDialogFragment;
        this.length = datePickerDialog;
    }

    public final void onClick(View view) {
        AddReceiverDialogFragment.setMax(this.getMin, this.length);
    }
}
