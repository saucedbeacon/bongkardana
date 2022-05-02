package o;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class getMaxCardElevation {
    private static final Pattern getMax = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private static final Pattern getMin = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private final String equals;
    private final String length;
    public final String setMax;
    private final String setMin;

    private getMaxCardElevation(String str, String str2, String str3, String str4) {
        this.setMin = str;
        this.length = str2;
        this.equals = str3;
        this.setMax = str4;
    }

    public static getMaxCardElevation length(String str) {
        Matcher matcher = getMin.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = getMax.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                String group2 = matcher2.group(2);
                if (group2 == null) {
                    group2 = matcher2.group(3);
                } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                    group2 = group2.substring(1, group2.length() - 1);
                }
                if (str2 == null || group2.equalsIgnoreCase(str2)) {
                    str2 = group2;
                } else {
                    throw new IllegalArgumentException("Multiple different charsets: ".concat(String.valueOf(str)));
                }
            }
        }
        return new getMaxCardElevation(str, lowerCase, lowerCase2, str2);
    }

    public final String toString() {
        return this.setMin;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getMaxCardElevation) && ((getMaxCardElevation) obj).setMin.equals(this.setMin);
    }

    public final int hashCode() {
        return this.setMin.hashCode();
    }
}
