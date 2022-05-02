package o;

import android.os.Build;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class themifyContext {
    public int getMax = 0;
    public int getMin = Integer.MAX_VALUE;
    public final length setMax;

    public themifyContext(@NonNull EditText editText) {
        length length2;
        if (Build.VERSION.SDK_INT >= 19) {
            length2 = new setMax(editText);
        } else {
            length2 = new length();
        }
        this.setMax = length2;
    }

    public static class length {
        public InputConnection length(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection;
        }

        public void length(int i) {
        }

        public KeyListener setMax(@NonNull KeyListener keyListener) {
            return keyListener;
        }

        public void setMin(int i) {
        }

        length() {
        }
    }

    @RequiresApi(19)
    static class setMax extends length {
        private final draw getMin;
        private final EditText setMax;

        setMax(@NonNull EditText editText) {
            this.setMax = editText;
            draw draw = new draw(editText);
            this.getMin = draw;
            this.setMax.addTextChangedListener(draw);
            this.setMax.setEditableFactory(checkOnClickListener.setMin());
        }

        /* access modifiers changed from: package-private */
        public void length(int i) {
            this.getMin.getMin(i);
        }

        /* access modifiers changed from: package-private */
        public void setMin(int i) {
            this.getMin.getMax(i);
        }

        /* access modifiers changed from: package-private */
        public KeyListener setMax(@NonNull KeyListener keyListener) {
            if (keyListener instanceof setChangingConfigurations) {
                return keyListener;
            }
            return new setChangingConfigurations(keyListener);
        }

        /* access modifiers changed from: package-private */
        public InputConnection length(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            if (inputConnection instanceof createViewByPrefix) {
                return inputConnection;
            }
            return new createViewByPrefix(this.setMax, inputConnection, editorInfo);
        }
    }
}
