package com.alipay.imobile.magenerator.api;

import android.graphics.Bitmap;
import com.alipay.imobile.magenerator.a.ad;

public class IAPMaGenerator {

    /* renamed from: a  reason: collision with root package name */
    private static IAPMaGenerator f10716a;

    private IAPMaGenerator() {
    }

    public static IAPMaGenerator getInstance() {
        if (f10716a == null) {
            f10716a = new IAPMaGenerator();
        }
        return f10716a;
    }

    public Bitmap encodeAsBarCode(String str, int i, int i2) {
        return ad.a().a(str, i, i2);
    }

    public Bitmap encodeAsBarCode(String str, int i, int i2, int i3, int i4) {
        return ad.a().a(str, i, i2, i3, i4);
    }

    public Bitmap encodeQRAsBitmap(String str, int i) {
        return ad.a().a(str, i);
    }

    public Bitmap encodeQRAsBitmap(String str, int i, int i2, int i3) {
        return ad.a().a(str, i, i2, i3);
    }

    public Bitmap encodeQRAsBitmap(String str, Bitmap bitmap, int i, int i2, int i3) {
        return ad.a().a(str, i, i2, i3, bitmap);
    }
}
