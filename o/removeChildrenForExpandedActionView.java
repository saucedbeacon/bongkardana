package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class removeChildrenForExpandedActionView implements TextWatcher {
    private String getMax = "";
    private final String getMin = "#### #### #### ####";
    private boolean length;
    private EditText setMin;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public removeChildrenForExpandedActionView(EditText editText) {
        this.setMin = editText;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str = "";
        String replaceAll = charSequence.toString().replaceAll("[^0-9]*", str);
        if (this.length) {
            this.getMax = replaceAll;
            this.length = false;
            return;
        }
        int i4 = 0;
        for (char c : "#### #### #### ####".toCharArray()) {
            if ((c == '#' || replaceAll.length() <= this.getMax.length()) && (c == '#' || replaceAll.length() >= this.getMax.length() || replaceAll.length() == i4)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(replaceAll.charAt(i4));
                    str = sb.toString();
                    i4++;
                } catch (Exception unused) {
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(c);
                str = sb2.toString();
            }
        }
        this.length = true;
        this.setMin.setText(str);
        this.setMin.setSelection(str.length());
    }
}
