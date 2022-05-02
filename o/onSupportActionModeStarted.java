package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

public final class onSupportActionModeStarted extends ClickableSpan {
    private final int getMax;
    private final int length;
    private final onSupportActionModeFinished setMax;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public onSupportActionModeStarted(int i, onSupportActionModeFinished onsupportactionmodefinished, int i2) {
        this.length = i;
        this.setMax = onsupportactionmodefinished;
        this.getMax = i2;
    }

    public final void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.length);
        this.setMax.length(this.getMax, bundle);
    }
}
