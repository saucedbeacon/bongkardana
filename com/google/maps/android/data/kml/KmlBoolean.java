package com.google.maps.android.data.kml;

import id.dana.sendmoney.summary.SummaryActivity;

public class KmlBoolean {
    public static boolean parseBoolean(String str) {
        return "1".equals(str) || SummaryActivity.CHECKED.equals(str);
    }
}
