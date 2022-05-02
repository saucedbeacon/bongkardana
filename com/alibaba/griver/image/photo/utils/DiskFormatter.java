package com.alibaba.griver.image.photo.utils;

import com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper;
import java.text.DecimalFormat;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class DiskFormatter {
    public static final String B = "B";
    public static final String FORMAT = "#.00";
    public static final String GB = "G";
    public static final String KB = "K";
    public static final String MB = "M";
    public static final String TB = "T";
    public static final int UNIT = 1024;

    /* renamed from: a  reason: collision with root package name */
    private double f10503a;
    private double b;
    private double c;
    private double d;
    private String e = FORMAT;
    private int f = 1024;

    public DiskFormatter() {
        a();
    }

    public void setUnit(int i) {
        if (i > 0) {
            this.f = i;
            a();
        }
    }

    private void a() {
        int i = this.f;
        double d2 = (double) i;
        this.f10503a = d2;
        double d3 = (double) i;
        Double.isNaN(d3);
        Double.isNaN(d2);
        double d4 = d3 * d2;
        this.b = d4;
        double d5 = (double) i;
        Double.isNaN(d5);
        double d6 = d5 * d4;
        this.c = d6;
        double d7 = (double) i;
        Double.isNaN(d7);
        this.d = d7 * d6;
    }

    public void setFormat(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1798233354, oncanceled);
            onCancelLoad.getMin(1798233354, oncanceled);
        }
        this.e = str;
    }

    public String format(double d2) {
        if (d2 < 0.0d) {
            return null;
        }
        if (d2 < this.f10503a) {
            StringBuilder sb = new StringBuilder();
            sb.append(d2);
            sb.append(B);
            return sb.toString();
        } else if (d2 < this.b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a(d2, this.f10503a));
            sb2.append("KB");
            return sb2.toString();
        } else if (d2 < this.c) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a(d2, this.b));
            sb3.append("MB");
            return sb3.toString();
        } else if (d2 < this.d) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a(d2, this.c));
            sb4.append("GB");
            return sb4.toString();
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(a(d2, this.d));
            sb5.append(RVOpenAuthHelper.PLATFORM_TB);
            return sb5.toString();
        }
    }

    private String a(double d2, double d3) {
        return new DecimalFormat(this.e).format(d2 / d3);
    }
}
