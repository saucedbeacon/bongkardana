package o;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
final class setChangingConfigurations implements KeyListener {
    private final KeyListener length;

    setChangingConfigurations(KeyListener keyListener) {
        this.length = keyListener;
    }

    public final int getInputType() {
        return this.length.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return EmojiCompat.setMin(editable, i, keyEvent) || this.length.onKeyDown(view, editable, i, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.length.onKeyUp(view, editable, i, keyEvent);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.length.onKeyOther(view, editable, keyEvent);
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.length.clearMetaKeyState(view, editable, i);
    }
}
