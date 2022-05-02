package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.parser.JSONLexer;
import java.security.MessageDigest;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import o.getChildVerticalGravity;
import org.apache.commons.codec.binary.Hex;

public class setPaddingRight {
    private static int getMax = 0;
    private static long length = -2636624711075254768L;
    private static int setMin = 1;

    public static String getMin(String str, String str2, String str3, String str4, String str5, String str6) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(getMin(new char[]{49603, 28550, 11714, 60191, 43313, 26343}).intern()), getTabbarModel.HASHING_ALGORITHM);
        Mac instance = Mac.getInstance(getTabbarModel.HASHING_ALGORITHM);
        instance.init(secretKeySpec);
        if (str5 == null) {
            int i = getMax + 29;
            setMin = i % 128;
            if (i % 2 == 0) {
                int i2 = 46 / 0;
            }
            str5 = "";
        }
        String replaceAll = str5.replaceAll("\\s+", "");
        MessageDigest instance2 = MessageDigest.getInstance("SHA-256");
        instance2.update(replaceAll.getBytes(getMin(new char[]{49603, 28550, 11714, 60191, 43313, 26343}).intern()));
        String lowerCase = new String(Hex.encodeHex(instance2.digest())).toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        sb.append("");
        sb.append(":");
        sb.append(str4);
        sb.append(":");
        sb.append(lowerCase);
        sb.append(":");
        sb.append(str6);
        String str7 = new String(Hex.encodeHex(instance.doFinal(sb.toString().getBytes(getMin(new char[]{49603, 28550, 11714, 60191, 43313, 26343}).intern()))));
        int i3 = getMax + 23;
        setMin = i3 % 128;
        if ((i3 % 2 == 0 ? 0 : 'N') == 'N') {
            return str7;
        }
        int i4 = 74 / 0;
        return str7;
    }

    public final String length() {
        try {
            TimeZone timeZone = TimeZone.getTimeZone("GMT+7");
            AnonymousClass2 r1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ") {
                public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
                    StringBuffer format = super.format(date, stringBuffer, fieldPosition);
                    return format.insert(format.length() - 2, ":");
                }

                public final Date parse(String str, ParsePosition parsePosition) {
                    if (str.length() > 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str.substring(0, str.length() - 3));
                        sb.append(str.substring(str.length() - 2));
                        str = sb.toString();
                    }
                    return super.parse(str, parsePosition);
                }
            };
            r1.setTimeZone(timeZone);
            String format = r1.format(new Date());
            int i = setMin + 69;
            getMax = i % 128;
            int i2 = i % 2;
            return format;
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean setMax(EditText editText) {
        try {
            if ((setMin(editText.getText().toString()) ? 'P' : 21) != 21) {
                try {
                    int i = getMax + 91;
                    try {
                        setMin = i % 128;
                        int i2 = i % 2;
                        int i3 = setMin + 21;
                        getMax = i3 % 128;
                        if ((i3 % 2 != 0 ? '(' : 31) != '(') {
                            return true;
                        }
                        Object[] objArr = null;
                        int length2 = objArr.length;
                        return true;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                editText.requestFocus();
                int i4 = setMin + 27;
                getMax = i4 % 128;
                if (!(i4 % 2 != 0)) {
                    return false;
                }
                int i5 = 7 / 0;
                return false;
            }
        } catch (Exception unused) {
            editText.requestFocus();
            return false;
        }
    }

    private static boolean setMin(String str) {
        try {
            int i = getMax + 71;
            setMin = i % 128;
            int i2 = i % 2;
            if (str == null) {
                try {
                    int i3 = setMin + 79;
                    getMax = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = getMax + 43;
                    setMin = i5 % 128;
                    if ((i5 % 2 == 0 ? 1 : ',') != 1) {
                        return true;
                    }
                    int i6 = 91 / 0;
                    return true;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                try {
                    return !(!str.equals(""));
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static boolean setMax(String str) {
        try {
            int i = getMax + 75;
            try {
                setMin = i % 128;
                if (!(i % 2 == 0)) {
                    try {
                        Double.parseDouble(str);
                        return false;
                    } catch (Exception unused) {
                        return true;
                    }
                } else {
                    Double.parseDouble(str);
                    return true;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static Bitmap getMin(Context context, float f) {
        try {
            try {
                int dimension = (int) context.getResources().getDimension(getChildVerticalGravity.getMax.setMin);
                int dimension2 = (int) context.getResources().getDimension(getChildVerticalGravity.getMax.length);
                TextView textView = new TextView(context);
                textView.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
                textView.setText("Rp");
                textView.setTextSize(0, f);
                textView.setTextColor(-16777216);
                textView.setBackgroundColor(0);
                Bitmap createBitmap = Bitmap.createBitmap(dimension, dimension2 / 2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                textView.layout(0, 0, dimension, dimension2);
                textView.draw(canvas);
                int i = getMax + 45;
                setMin = i % 128;
                if ((i % 2 == 0 ? JSONLexer.EOI : ',') != 26) {
                    return createBitmap;
                }
                Object obj = null;
                super.hashCode();
                return createBitmap;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static Typeface setMin(Context context) {
        int i = getMax + 9;
        setMin = i % 128;
        int i2 = i % 2;
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Regular.ttf");
        try {
            int i3 = setMin + 95;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            return createFromAsset;
        } catch (Exception e) {
            throw e;
        }
    }

    public static Typeface getMin(Context context) {
        try {
            int i = setMin + 123;
            getMax = i % 128;
            if ((i % 2 != 0 ? 6 : 'I') != 6) {
                return Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Bold.ttf");
            }
            try {
                int i2 = 55 / 0;
                return Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Bold.ttf");
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void getMax(TextView textView, float f) {
        int i = getMax + 97;
        setMin = i % 128;
        int i2 = i % 2;
        textView.setTextSize(0, f);
        int i3 = setMin + 29;
        getMax = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if ((r0 != null ? '\\' : '(') != '(') goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r0 != null) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setMax(android.content.Context r3) {
        /*
            int r0 = setMin
            int r0 = r0 + 67
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 96
            if (r0 == 0) goto L_0x0011
            r0 = 97
            goto L_0x0013
        L_0x0011:
            r0 = 96
        L_0x0013:
            if (r0 == r1) goto L_0x0025
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.View r0 = r0.getCurrentFocus()
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0047
            goto L_0x0037
        L_0x0023:
            r3 = move-exception
            throw r3
        L_0x0025:
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.View r0 = r0.getCurrentFocus()
            r1 = 40
            if (r0 == 0) goto L_0x0033
            r2 = 92
            goto L_0x0035
        L_0x0033:
            r2 = 40
        L_0x0035:
            if (r2 == r1) goto L_0x0047
        L_0x0037:
            java.lang.String r1 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            android.os.IBinder r0 = r0.getWindowToken()
            r1 = 0
            r3.hideSoftInputFromWindow(r0, r1)
        L_0x0047:
            int r3 = setMin
            int r3 = r3 + 37
            int r0 = r3 % 128
            getMax = r0
            int r3 = r3 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPaddingRight.setMax(android.content.Context):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r5 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r8.equals(id.dana.richview.CurrencyTextView.DEFAULT_LANGUAGE_CODE) != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r8.equals(o.startH5OpenAuth.KEY_EN) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r4.locale = new java.util.Locale(o.startH5OpenAuth.KEY_EN, "US");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r4.locale = new java.util.Locale(id.dana.richview.CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r8 = setMin + 89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        getMax = r8 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        r8 = r8 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void getMax(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "en"
            int r1 = getMax     // Catch:{ Exception -> 0x006f }
            int r1 = r1 + 121
            int r2 = r1 % 128
            setMin = r2     // Catch:{ Exception -> 0x006f }
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            java.lang.String r2 = "ID"
            java.lang.String r3 = "in"
            if (r1 == 0) goto L_0x002e
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r1 = r7.getDisplayMetrics()
            android.content.res.Configuration r4 = r7.getConfiguration()
            boolean r5 = r8.equals(r3)
            r6 = 0
            int r6 = r6.length     // Catch:{ all -> 0x002c }
            if (r5 == 0) goto L_0x0048
            goto L_0x0040
        L_0x002c:
            r7 = move-exception
            throw r7
        L_0x002e:
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r1 = r7.getDisplayMetrics()
            android.content.res.Configuration r4 = r7.getConfiguration()
            boolean r5 = r8.equals(r3)
            if (r5 == 0) goto L_0x0048
        L_0x0040:
            java.util.Locale r8 = new java.util.Locale
            r8.<init>(r3, r2)
            r4.locale = r8
            goto L_0x0069
        L_0x0048:
            boolean r8 = r8.equals(r0)     // Catch:{ Exception -> 0x006f }
            if (r8 == 0) goto L_0x0058
            java.util.Locale r8 = new java.util.Locale
            java.lang.String r2 = "US"
            r8.<init>(r0, r2)
            r4.locale = r8
            goto L_0x0069
        L_0x0058:
            java.util.Locale r8 = new java.util.Locale
            r8.<init>(r3, r2)
            r4.locale = r8
            int r8 = setMin     // Catch:{ Exception -> 0x006f }
            int r8 = r8 + 89
            int r0 = r8 % 128
            getMax = r0     // Catch:{ Exception -> 0x006d }
            int r8 = r8 % 2
        L_0x0069:
            r7.updateConfiguration(r4, r1)
            return
        L_0x006d:
            r7 = move-exception
            throw r7
        L_0x006f:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPaddingRight.getMax(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r1 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r5 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        r1 = setMin + 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        getMax = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a0, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMax(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = getMax
            int r0 = r0 + 87
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 53
            if (r0 == 0) goto L_0x0021
            r0 = 75
            int r0 = r0 / r2
            if (r5 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r1 == 0) goto L_0x0028
            goto L_0x0023
        L_0x001f:
            r5 = move-exception
            throw r5
        L_0x0021:
            if (r5 == 0) goto L_0x0028
        L_0x0023:
            android.content.Context r0 = r5.getApplicationContext()
            goto L_0x0032
        L_0x0028:
            r0 = 0
            int r1 = setMin     // Catch:{ Exception -> 0x00a0 }
            int r1 = r1 + r3
            int r4 = r1 % 128
            getMax = r4     // Catch:{ Exception -> 0x00a0 }
            int r1 = r1 % 2
        L_0x0032:
            r1 = 8
            if (r0 == 0) goto L_0x005a
            if (r6 == 0) goto L_0x0046
            int r2 = getMax
            int r2 = r2 + 73
            int r4 = r2 % 128
            setMin = r4
            int r2 = r2 % 2
            int r2 = r6.length()
        L_0x0046:
            int r0 = o.dispatchOnCancelled.setMin(r0, r2)
            if (r2 == r0) goto L_0x005a
            o.onCanceled r4 = new o.onCanceled
            r4.<init>(r2, r0, r1)
            r0 = 689202395(0x291464db, float:3.295008E-14)
            o.onCancelLoad.setMax(r0, r4)
            o.onCancelLoad.getMin(r0, r4)
        L_0x005a:
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r2 = "in"
            boolean r0 = r0.equals(r2)
            r2 = 42
            if (r0 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r1 = 42
        L_0x0075:
            if (r1 == r2) goto L_0x0082
            int r5 = getMax
            int r5 = r5 + 75
            int r7 = r5 % 128
            setMin = r7
            int r5 = r5 % 2
            return r6
        L_0x0082:
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            java.lang.String r5 = r5.getLanguage()
            java.lang.String r0 = "en"
            boolean r5 = r5.equals(r0)
            r0 = 50
            if (r5 == 0) goto L_0x009c
            r3 = 50
        L_0x009c:
            if (r3 == r0) goto L_0x009f
            return r6
        L_0x009f:
            return r7
        L_0x00a0:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPaddingRight.getMax(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    private static String getMin(char[] cArr) {
        int i;
        char[] cArr2;
        char c;
        int i2 = setMin + 67;
        getMax = i2 % 128;
        if (i2 % 2 == 0) {
            c = cArr[0];
            cArr2 = new char[(cArr.length - 1)];
            i = 1;
        } else {
            c = cArr[1];
            cArr2 = new char[(cArr.length / 1)];
            i = 0;
        }
        while (true) {
            if (!(i < cArr.length)) {
                return new String(cArr2);
            }
            int i3 = getMax + 19;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            cArr2[i - 1] = (char) ((int) (((long) (cArr[i] ^ (i * c))) ^ length));
            i++;
            int i5 = getMax + 1;
            setMin = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
