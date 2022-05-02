package o;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class getSuggestionsAdapter {
    public final String getMin;
    public final String length;
    private final float setMax;
    public final String setMin;

    public getSuggestionsAdapter(String str, String str2, String str3, float f) {
        this.length = str;
        this.setMin = str2;
        this.getMin = str3;
        this.setMax = f;
    }
}
