package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class ConfirmPopup implements TextWatcher {
    private EditText length;
    private int setMax;

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ConfirmPopup(EditText editText) {
        this.length = editText;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.setMax = this.length.getText().toString().length() - this.length.getSelectionStart();
    }

    public final void afterTextChanged(Editable editable) {
        try {
            this.length.removeTextChangedListener(this);
            String obj = this.length.getText().toString();
            String replace = String.valueOf(setMax(obj)).replace(".", "");
            StringBuilder sb = new StringBuilder(replace);
            int i = 0;
            if (replace.charAt(0) == '0') {
                sb.deleteCharAt(0);
                replace = sb.toString();
            }
            String str = "";
            int i2 = 0;
            for (int length2 = replace.length() - 1; length2 >= 0; length2--) {
                if (i2 == 3) {
                    str = ".".concat(String.valueOf(str));
                    i2 = 0;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(replace.charAt(length2));
                sb2.append(str);
                str = sb2.toString();
                i2++;
            }
            if (obj != null && !obj.equals("")) {
                if (setMax(obj).intValue() == 0) {
                    this.length.setText("");
                }
                if (!obj.equals("")) {
                    this.length.setText(str);
                }
                this.length.setSelection(str.length());
            }
            EditText editText = this.length;
            if (str.length() - this.setMax >= 0) {
                i = str.length() - this.setMax;
            }
            editText.setSelection(i);
            this.length.addTextChangedListener(this);
        } catch (Exception unused) {
            this.length.addTextChangedListener(this);
        }
    }

    private static Integer setMax(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str.replace(".", "")));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
