package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.findReferenceChild;
import o.onActivityPostResumed;

@Deprecated
public class InstallReferrerReceiver extends BroadcastReceiver {
    private static int equals = 0;
    private static int[] isInside = {-646257733, 1095912248, -1744205569, 92973328, -138422391, -1718757623, -1972258889, -1370987942, -388012307, -1529640483, 2013956944, -34370489, 1958879466, -1345779694, 1789475616, -1013572961, -445576465, -1586421646};
    private static int toFloatRange = 1;
    private final Pattern getMax;
    private final Pattern getMin;
    private final Pattern length;
    private final Pattern setMax;
    private final Pattern setMin;

    public InstallReferrerReceiver() {
        try {
            this.getMin = Pattern.compile("(^|&)utm_source=([^&#=]*)([#&]|$)");
            this.setMin = Pattern.compile("(^|&)utm_medium=([^&#=]*)([#&]|$)");
            this.setMax = Pattern.compile("(^|&)utm_campaign=([^&#=]*)([#&]|$)");
            this.getMax = Pattern.compile("(^|&)utm_content=([^&#=]*)([#&]|$)");
            this.length = Pattern.compile("(^|&)utm_term=([^&#=]*)([#&]|$)");
        } catch (Exception e) {
            throw e;
        }
    }

    public void onReceive(Context context, Intent intent) {
        String string;
        Bundle extras = intent.getExtras();
        if (extras != null && (string = extras.getString("referrer")) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("referrer", string);
            String min = setMin(this.getMin.matcher(string));
            Object[] objArr = null;
            if ((min != null ? '9' : 25) != 25) {
                try {
                    int i = toFloatRange + 113;
                    try {
                        equals = i % 128;
                        int i2 = i % 2;
                        hashMap.put("utm_source", min);
                        if (i2 != 0) {
                            super.hashCode();
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            String min2 = setMin(this.setMin.matcher(string));
            if ((min2 != null ? 'H' : '7') != '7') {
                int i3 = equals + 53;
                toFloatRange = i3 % 128;
                if (i3 % 2 == 0) {
                    hashMap.put("utm_medium", min2);
                    int length2 = objArr.length;
                } else {
                    hashMap.put("utm_medium", min2);
                }
            }
            String min3 = setMin(this.setMax.matcher(string));
            if ((min3 != null ? '@' : 19) == '@') {
                int i4 = toFloatRange + 89;
                equals = i4 % 128;
                if ((i4 % 2 != 0 ? ' ' : 'I') != ' ') {
                    hashMap.put("utm_campaign", min3);
                } else {
                    hashMap.put("utm_campaign", min3);
                    int i5 = 17 / 0;
                }
            }
            String min4 = setMin(this.getMax.matcher(string));
            if ((min4 != null ? '*' : 'E') != 'E') {
                hashMap.put("utm_content", min4);
            }
            String min5 = setMin(this.length.matcher(string));
            if (min5 != null) {
                int i6 = equals + 57;
                toFloatRange = i6 % 128;
                int i7 = i6 % 2;
                hashMap.put("utm_term", min5);
            }
            findReferenceChild.getMax(context, "com.mixpanel.android.mpmetrics.ReferralInfo", hashMap);
            int i8 = toFloatRange + 73;
            equals = i8 % 128;
            if (i8 % 2 != 0) {
                int length3 = objArr.length;
            }
        }
    }

    private static String setMin(Matcher matcher) {
        int i = equals + 75;
        toFloatRange = i % 128;
        int i2 = i % 2;
        if ((matcher.find() ? (char) 24 : 7) == 24) {
            String group = matcher.group(2);
            if (!(group == null)) {
                int i3 = equals + 81;
                toFloatRange = i3 % 128;
                int i4 = i3 % 2;
                try {
                    return URLDecoder.decode(group, getMax((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5, new int[]{1653214095, 1635109555, -2088119728, 1654574157}).intern());
                } catch (UnsupportedEncodingException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                }
            }
        }
        int i5 = toFloatRange + 27;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static String getMax(int i, int[] iArr) {
        char[] cArr = new char[4];
        char[] cArr2 = new char[(iArr.length << 1)];
        int[] iArr2 = (int[]) isInside.clone();
        int i2 = 0;
        while (true) {
            if ((i2 < iArr.length ? '!' : 6) != '!') {
                return new String(cArr2, 0, i);
            }
            int i3 = equals + 101;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            cArr[0] = (char) (iArr[i2] >> 16);
            cArr[1] = (char) iArr[i2];
            int i5 = i2 + 1;
            cArr[2] = (char) (iArr[i5] >> 16);
            cArr[3] = (char) iArr[i5];
            try {
                onActivityPostResumed.getMin(cArr, iArr2, false);
                int i6 = i2 << 1;
                cArr2[i6] = cArr[0];
                cArr2[i6 + 1] = cArr[1];
                cArr2[i6 + 2] = cArr[2];
                cArr2[i6 + 3] = cArr[3];
                i2 += 2;
                int i7 = equals + 103;
                toFloatRange = i7 % 128;
                int i8 = i7 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
