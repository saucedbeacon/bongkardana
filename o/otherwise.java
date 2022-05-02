package o;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(24)
final class otherwise implements VisibleForTesting {
    private final LocaleList setMax;

    otherwise(LocaleList localeList) {
        this.setMax = localeList;
    }

    public final Object getMin() {
        return this.setMax;
    }

    public final Locale setMin(int i) {
        return this.setMax.get(i);
    }

    public final int length() {
        return this.setMax.size();
    }

    public final boolean equals(Object obj) {
        return this.setMax.equals(((VisibleForTesting) obj).getMin());
    }

    public final int hashCode() {
        return this.setMax.hashCode();
    }

    public final String toString() {
        return this.setMax.toString();
    }

    public final String setMin() {
        return this.setMax.toLanguageTags();
    }
}
