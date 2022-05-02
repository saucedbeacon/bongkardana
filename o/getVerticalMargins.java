package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class getVerticalMargins implements TextWatcher {
    private String getMin = "";
    private String[] length = {"#.###", "##.###", "###.###", "#.###.###", "##.###.###", "###.###.###", "#.###.###.###", "##.###.###.###", "###.###.###.###", "#.###.###.###.###"};
    private boolean setMax;
    private EditText setMin;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public getVerticalMargins(EditText editText) {
        this.setMin = editText;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str = "";
        String replaceAll = charSequence.toString().replaceAll("[^0-9]*", str);
        String str2 = replaceAll.length() >= 4 ? this.length[replaceAll.length() - 4] : "###";
        if (this.setMax) {
            this.getMin = replaceAll;
            this.setMax = false;
            return;
        }
        int i4 = 0;
        for (char c : str2.toCharArray()) {
            if ((c == '#' || replaceAll.length() <= this.getMin.length()) && (c == '#' || replaceAll.length() >= this.getMin.length() || replaceAll.length() == i4)) {
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
        this.setMax = true;
        this.setMin.setText(str);
        this.setMin.setSelection(str.length());
    }
}
