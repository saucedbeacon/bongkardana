package ru.noties.markwon.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;
import o.maybeForceBuilderInitialization;

public class LinkSpan extends URLSpan {
    private final maybeForceBuilderInitialization getMax;
    private final getMax length;
    private final String setMax;

    public interface getMax {
        void setMin(View view, @NonNull String str);
    }

    public LinkSpan(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, @NonNull String str, @NonNull getMax getmax) {
        super(str);
        this.getMax = maybeforcebuilderinitialization;
        this.setMax = str;
        this.length = getmax;
    }

    public void onClick(View view) {
        this.length.setMin(view, this.setMax);
    }

    public void updateDrawState(TextPaint textPaint) {
        this.getMax.setMax(textPaint);
    }
}
