package o;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
import androidx.annotation.NonNull;

public final class clearSelection extends Paint {
    public final void setTextLocales(@NonNull LocaleList localeList) {
    }

    public clearSelection() {
    }

    public clearSelection(int i) {
        super(i);
    }

    public clearSelection(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public clearSelection(PorterDuff.Mode mode, byte b) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
