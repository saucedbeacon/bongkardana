package com.ta.audid.f;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ta.audid.c.a;
import com.ta.audid.e.b;
import com.ta.audid.e.c;
import com.ta.audid.e.d;
import com.ta.audid.e.e;
import com.ta.audid.g.f;
import com.ta.audid.g.m;
import java.util.List;
import kotlin.text.Typography;
import o.onActivityPreStopped;

public class g implements Runnable {
    private static int getMin = 1;
    private static volatile boolean h = false;
    private static char[] length;
    private static int setMax;
    private static char setMin;
    private Context mContext = null;

    static void setMax() {
        setMin = 3;
        length = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    static {
        setMax();
        int i = setMax + 91;
        getMin = i % 128;
        int i2 = i % 2;
    }

    public g(Context context) {
        this.mContext = context;
    }

    public void run() {
        int i = getMin + 123;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            f();
            int i3 = setMax + 47;
            getMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            m.e("", th, new Object[0]);
        }
    }

    private void f() {
        m.d();
        if (com.ta.audid.g.g.isConnectInternet(this.mContext)) {
            try {
                if (!h) {
                    int i = setMax + 39;
                    getMin = i % 128;
                    boolean z = true;
                    if (i % 2 == 0) {
                        h = false;
                    } else {
                        h = true;
                    }
                    try {
                        if (!f.d()) {
                            m.d("", "Other Process is Uploading");
                            h = false;
                            f.i();
                            int i2 = getMin + 111;
                            setMax = i2 % 128;
                            if ((i2 % 2 != 0 ? '\\' : 19) != 19) {
                                int i3 = 37 / 0;
                                return;
                            }
                            return;
                        }
                        int i4 = 0;
                        while (true) {
                            if ((i4 <= 0 ? '[' : 'Z') == 'Z') {
                                break;
                            }
                            try {
                                if (c()) {
                                    int i5 = setMax + 123;
                                    getMin = i5 % 128;
                                    int i6 = i5 % 2;
                                    break;
                                }
                                Thread.sleep(1000);
                                i4++;
                                int i7 = getMin + 21;
                                setMax = i7 % 128;
                                int i8 = i7 % 2;
                            } catch (Throwable unused) {
                            }
                        }
                        h = false;
                        f.i();
                        int i9 = setMax + 103;
                        getMin = i9 % 128;
                        if (i9 % 2 != 0) {
                            z = false;
                        }
                        if (z) {
                            Object[] objArr = null;
                            int length2 = objArr.length;
                        }
                    } catch (Throwable unused2) {
                        h = false;
                        f.i();
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }

    private boolean c() {
        try {
            int i = getMin + 33;
            setMax = i % 128;
            int i2 = i % 2;
            m.d();
            List<b> list = d.a().get(4);
            if ((list != null ? Typography.amp : 'b') == 'b' || list.size() == 0) {
                m.d("log is empty", new Object[0]);
                int i3 = setMax + 27;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            String a2 = a(list);
            if (!TextUtils.isEmpty(a2)) {
                if (a(a2)) {
                    d.a().delete(list);
                    m.d("", "upload success");
                } else {
                    m.d("", "upload fail");
                }
                return false;
            }
            int i5 = setMax + 11;
            getMin = i5 % 128;
            int i6 = i5 % 2;
            m.d("postData is empty", new Object[0]);
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    private boolean a(String str) {
        String str2 = "";
        b a2 = c.a("https://audid-api.taobao.com/v2.0/a/audid/req/", str, true);
        try {
            String str3 = new String(a2.data, length(new char[]{1, 2, 0, 5, '9'}, (ViewConfiguration.getLongPressTimeout() >> 16) + 5, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 1)).intern());
            int i = setMax + 99;
            getMin = i % 128;
            int i2 = i % 2;
            str2 = str3;
        } catch (Exception e) {
            m.d(str2, e);
        }
        if (!b.a(str2, a2.h)) {
            return false;
        }
        boolean a3 = a.a(a.a(str2).f9839a);
        int i3 = getMin + 23;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return a3;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String] */
    private String a(List<b> list) {
        ? r3 = 0;
        if (!(list == null)) {
            if ((list.size() == 0 ? 6 : ':') == ':') {
                String E = a.a().E();
                if ((TextUtils.isEmpty(E) ? 'a' : '#') != '#') {
                    int i = setMax + 125;
                    getMin = i % 128;
                    if ((i % 2 == 0 ? '^' : '#') == '#') {
                        return r3;
                    }
                    int length2 = r3.length;
                    return r3;
                }
                String b = c.b(E);
                StringBuilder sb = new StringBuilder();
                sb.append(b);
                int i2 = setMax + 15;
                getMin = i2 % 128;
                int i3 = i2 % 2;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    String H = list.get(i4).H();
                    sb.append("\n");
                    sb.append(H);
                }
                if (m.isDebug()) {
                    int i5 = setMax + 125;
                    getMin = i5 % 128;
                    if (i5 % 2 == 0) {
                        Object[] objArr = new Object[0];
                        objArr[0] = sb.toString();
                        m.a("", objArr);
                    } else {
                        m.a("", sb.toString());
                    }
                }
                return e.e(sb.toString());
            }
        }
        try {
            int i6 = getMin + 61;
            setMax = i6 % 128;
            int i7 = i6 % 2;
            return r3;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String length(char[] cArr, int i, byte b) {
        char[] cArr2 = length;
        char c = setMin;
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i--;
            cArr3[i] = (char) (cArr[i] - b);
        }
        if (i > 1) {
            try {
                int i2 = getMin + 47;
                setMax = i2 % 128;
                int i3 = i2 % 2;
                for (int i4 = 0; i4 < i; i4 += 2) {
                    char c2 = cArr[i4];
                    int i5 = i4 + 1;
                    char c3 = cArr[i5];
                    if (c2 == c3) {
                        try {
                            int i6 = setMax + 17;
                            getMin = i6 % 128;
                            int i7 = i6 % 2;
                            cArr3[i4] = (char) (c2 - b);
                            cArr3[i5] = (char) (c3 - b);
                            int i8 = setMax + 79;
                            getMin = i8 % 128;
                            int i9 = i8 % 2;
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        int min = onActivityPreStopped.setMin(c2, c);
                        int length2 = onActivityPreStopped.length(c2, c);
                        int min2 = onActivityPreStopped.setMin(c3, c);
                        int length3 = onActivityPreStopped.length(c3, c);
                        if ((length2 == length3 ? '^' : 'X') != '^') {
                            if ((min == min2 ? ',' : 16) != 16) {
                                int max = onActivityPreStopped.setMax(length2, c);
                                int max2 = onActivityPreStopped.setMax(length3, c);
                                int max3 = onActivityPreStopped.getMax(min, max, c);
                                int max4 = onActivityPreStopped.getMax(min2, max2, c);
                                cArr3[i4] = cArr2[max3];
                                cArr3[i5] = cArr2[max4];
                            } else {
                                int max5 = onActivityPreStopped.getMax(min, length3, c);
                                int max6 = onActivityPreStopped.getMax(min2, length2, c);
                                cArr3[i4] = cArr2[max5];
                                cArr3[i5] = cArr2[max6];
                            }
                        } else {
                            int i10 = setMax + 11;
                            getMin = i10 % 128;
                            int i11 = i10 % 2;
                            int max7 = onActivityPreStopped.setMax(min, c);
                            int max8 = onActivityPreStopped.setMax(min2, c);
                            int max9 = onActivityPreStopped.getMax(max7, length2, c);
                            int max10 = onActivityPreStopped.getMax(max8, length3, c);
                            cArr3[i4] = cArr2[max9];
                            cArr3[i5] = cArr2[max10];
                        }
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return new String(cArr3);
    }
}
