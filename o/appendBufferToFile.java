package o;

import android.text.SpannableStringBuilder;

final class appendBufferToFile extends SpannableStringBuilder implements cleanExcessFiles {
    appendBufferToFile(CharSequence charSequence) {
        super(charSequence);
    }
}
