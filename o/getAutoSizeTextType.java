package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import o.onCreateInputConnection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class getAutoSizeTextType implements onCreateInputConnection {
    private final CascadingMenuPopup$HorizPosition<onCreateInputConnection.length> length = new CascadingMenuPopup$HorizPosition<>();
    private final setAttachListener<onCreateInputConnection.length.setMin> setMax = setAttachListener.length();

    public getAutoSizeTextType() {
        setMin(onCreateInputConnection.setMin);
    }

    public final void setMin(@NonNull onCreateInputConnection.length length2) {
        this.length.setMax(length2);
        if (length2 instanceof onCreateInputConnection.length.setMin) {
            this.setMax.getMax((onCreateInputConnection.length.setMin) length2);
        } else if (length2 instanceof onCreateInputConnection.length.getMax) {
            this.setMax.getMin(((onCreateInputConnection.length.getMax) length2).length);
        }
    }
}
