package o;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.text.Typography;

public final class translateRegularFrame {
    private static final Pattern setMax = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private static final Pattern setMin = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private final String getMax;
    private final String getMin;
    public final String length;
    @Nullable
    private final String toIntRange;

    private translateRegularFrame(String str, String str2, String str3, @Nullable String str4) {
        this.getMax = str;
        this.length = str2;
        this.getMin = str3;
        this.toIntRange = str4;
    }

    public static translateRegularFrame getMin(String str) {
        Matcher matcher = setMin.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = setMax.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
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
                            StringBuilder sb = new StringBuilder("Multiple charsets defined: \"");
                            sb.append(str2);
                            sb.append("\" and: \"");
                            sb.append(group2);
                            sb.append("\" for: \"");
                            sb.append(str);
                            sb.append(Typography.quote);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    sb2.append(str.substring(end));
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append(Typography.quote);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            return new translateRegularFrame(str, lowerCase, lowerCase2, str2);
        }
        StringBuilder sb3 = new StringBuilder("No subtype found for: \"");
        sb3.append(str);
        sb3.append(Typography.quote);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Nullable
    public static translateRegularFrame length(String str) {
        try {
            return getMin(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public final Charset setMin(@Nullable Charset charset) {
        try {
            return this.toIntRange != null ? Charset.forName(this.toIntRange) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String toString() {
        return this.getMax;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof translateRegularFrame) && ((translateRegularFrame) obj).getMax.equals(this.getMax);
    }

    public final int hashCode() {
        return this.getMax.hashCode();
    }
}
