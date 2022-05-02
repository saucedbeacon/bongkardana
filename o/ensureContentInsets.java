package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class ensureContentInsets implements TextWatcher {
    private final EditText length;
    private final setMax setMin;

    public interface setMax {
        void onTextChanged(EditText editText, String str);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ensureContentInsets(EditText editText, setMax setmax) {
        this.length = editText;
        this.setMin = setmax;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.setMin.onTextChanged(this.length, charSequence.toString());
    }
}
