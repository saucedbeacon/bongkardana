package id.dana.utils;

import android.content.Context;
import id.dana.R;
import id.dana.richview.CurrencyTextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import o.WheelView;
import o.startH5OpenAuth;

public final class SimpleTimeConversion {
    private String getMax;
    private Context length;
    private long setMin;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
        public static final String COMPLETE = "1";
        public static final String SIMPLE = "0";
    }

    public SimpleTimeConversion(Context context, long j, String str) {
        this.length = context;
        this.setMin = j;
        this.getMax = str;
    }

    private static long getMax(long j) {
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", WheelView.OnWheelViewListener.getMax);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = new Date(j);
        try {
            date = simpleDateFormat.parse(simpleDateFormat.format(date));
        } catch (ParseException unused) {
        }
        return date.getTime();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String length() {
        /*
            r4 = this;
            java.lang.String r0 = r4.getMax
            int r1 = r0.hashCode()
            r2 = 48
            r3 = 1
            if (r1 == r2) goto L_0x001a
            r2 = 49
            if (r1 == r2) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = -1
        L_0x0025:
            if (r0 == 0) goto L_0x0031
            if (r0 == r3) goto L_0x002c
            java.lang.String r0 = ""
            return r0
        L_0x002c:
            java.lang.String r0 = r4.setMin()
            return r0
        L_0x0031:
            java.lang.String r0 = r4.getMin()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.utils.SimpleTimeConversion.length():java.lang.String");
    }

    private String setMin() {
        Locale locale;
        if (Locale.getDefault().getLanguage().equals(new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE).getLanguage())) {
            locale = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE);
        } else {
            locale = new Locale(startH5OpenAuth.KEY_EN);
        }
        int round = Math.round((float) ((new Date().getTime() - getMax(this.setMin)) / 1000));
        String string = this.length.getString(R.string.complete_second);
        String str = "";
        if (round >= 60) {
            string = this.length.getString(R.string.complete_minute);
            String valueOf = String.valueOf(Math.round((float) (round / 60)));
            if (round > 3600) {
                string = this.length.getString(R.string.complete_hours);
                valueOf = String.valueOf(Math.round((float) (round / 3600)));
                if (round > 86400) {
                    Date date = new Date(this.setMin);
                    if (round / 86400 == 1) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.length.getString(R.string.complete_yesterday));
                        sb.append(" ");
                        sb.append(simpleDateFormat.format(date));
                        string = sb.toString();
                    } else {
                        string = round > 31104000 ? new SimpleDateFormat("dd MMMM yyyy, hh:mm a", locale).format(date) : new SimpleDateFormat("dd MMMM, hh:mm a", locale).format(date);
                    }
                }
            }
            str = valueOf;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        sb2.append(string);
        return sb2.toString();
    }

    private String getMin() {
        int round = Math.round((float) ((new Date().getTime() - getMax(this.setMin)) / 1000));
        String string = this.length.getString(R.string.mini_second);
        if (round >= 60) {
            string = this.length.getString(R.string.mini_minute);
            int round2 = Math.round((float) (round / 60));
            if (round > 3600) {
                string = this.length.getString(R.string.mini_hours);
                round2 = Math.round((float) (round / 3600));
                if (round > 86400) {
                    string = this.length.getString(R.string.mini_day);
                    round2 = round / 86400;
                    if (round > 2592000) {
                        string = this.length.getString(R.string.mini_month);
                        round2 = round / 2592000;
                        if (round > 31104000) {
                            string = this.length.getString(R.string.mini_year);
                            round /= 31104000;
                        }
                    }
                }
            }
            round = round2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(round));
        sb.append(string);
        return sb.toString();
    }
}
