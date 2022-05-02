package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.setCloseButtonOnLongClickListener;

public final class showOptionMenuRedDot implements setFavoriteButtonClickListener {
    private final setFavoriteStatus regexCache = new setFavoriteStatus(100);

    public static setFavoriteButtonClickListener create() {
        return new showOptionMenuRedDot();
    }

    private showOptionMenuRedDot() {
    }

    public final boolean matchNationalNumber(CharSequence charSequence, setCloseButtonOnLongClickListener.getMax getmax, boolean z) {
        String nationalNumberPattern = getmax.getNationalNumberPattern();
        if (nationalNumberPattern.length() == 0) {
            return false;
        }
        return match(charSequence, this.regexCache.getPatternForRegex(nationalNumberPattern), z);
    }

    private static boolean match(CharSequence charSequence, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            return true;
        }
        return z;
    }
}
