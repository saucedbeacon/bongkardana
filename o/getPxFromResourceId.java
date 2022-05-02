package o;

import android.widget.EditText;

public final class getPxFromResourceId implements getIdStr {
    public final void getMin(EditText editText, int i) {
        String obj = editText.getText().toString();
        if (obj.length() > 0) {
            StringBuilder sb = new StringBuilder(obj);
            if (i == 0 && obj.charAt(i) == '0') {
                sb.deleteCharAt(i);
                editText.setText(sb.toString());
                editText.setSelection(i);
            }
        }
    }
}
