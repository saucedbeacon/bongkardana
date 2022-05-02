package o;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import id.dana.R;

public final class setH5MenuList {
    public static String getMin(String str, int i) {
        String substring = str.substring(i);
        String substring2 = str.substring(0, i);
        String str2 = "";
        for (int i2 = 0; i2 < 4; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".");
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(substring2.replaceAll(str2, "$0 "));
        sb2.append(substring);
        return sb2.toString();
    }

    public static void getMin(TextView textView, ClickableSpan clickableSpan, @ColorInt int i, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        setH5ShowOptionMenuFlag seth5showoptionmenuflag = new setH5ShowOptionMenuFlag();
        seth5showoptionmenuflag.getMin = str;
        seth5showoptionmenuflag.setMax = str2;
        int i2 = seth5showoptionmenuflag.getMax().getMax;
        setH5ShowOptionMenuFlag max = seth5showoptionmenuflag.getMax();
        int length = max.getMax + max.setMax.length();
        spannableStringBuilder.setSpan(clickableSpan, i2, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), i2, length, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder);
        textView.setHighlightColor(0);
    }

    public static boolean length(Editable editable, int i) {
        boolean z;
        boolean z2 = editable.length() <= i;
        for (int i2 = 0; i2 < editable.length(); i2++) {
            if (i2 <= 0 || (i2 + 1) % 5 != 0) {
                z = Character.isDigit(editable.charAt(i2));
            } else {
                z = ' ' == editable.charAt(i2);
            }
            z2 &= z;
        }
        return z2;
    }

    public static SpannableStringBuilder getMin(String str, String str2) {
        setH5ShowOptionMenuFlag seth5showoptionmenuflag = new setH5ShowOptionMenuFlag();
        seth5showoptionmenuflag.getMin = str;
        seth5showoptionmenuflag.setMax = str2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        StyleSpan styleSpan = new StyleSpan(1);
        int i = seth5showoptionmenuflag.getMax().getMax;
        setH5ShowOptionMenuFlag max = seth5showoptionmenuflag.getMax();
        spannableStringBuilder.setSpan(styleSpan, i, max.getMax + max.setMax.length(), 33);
        return spannableStringBuilder;
    }

    public static String length(Context context, double d) {
        if (d >= 1.0d) {
            return context.getString(R.string.km_away, new Object[]{Double.valueOf(d)});
        }
        return context.getString(R.string.m_away, new Object[]{Double.valueOf(d * 1000.0d)});
    }

    public static String getMax(Context context, double d) {
        if (d >= 1.0d) {
            return context.getString(R.string.km_away_with_dot, new Object[]{Double.valueOf(d)});
        }
        return context.getString(R.string.m_away_with_dot, new Object[]{Double.valueOf(d * 1000.0d)});
    }

    public static String setMax(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String concat = "scene=".concat(String.valueOf(str2));
        Uri parse = Uri.parse(str);
        if (!TextUtils.isEmpty(parse.getQueryParameter("params"))) {
            StringBuilder sb = new StringBuilder();
            String[] split = str.split("\\[", 2);
            sb.append(split[0]);
            sb.append("[scene=");
            sb.append(str2);
            sb.append(",");
            sb.append(split[1]);
            return sb.toString();
        }
        Uri.Builder buildUpon = parse.buildUpon();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(concat);
        sb2.append("]");
        buildUpon.appendQueryParameter("params", sb2.toString());
        return buildUpon.toString();
    }
}
