package com.alibaba.griver.image.framework.decode;

import android.graphics.Bitmap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BitmapLock {

    /* renamed from: a  reason: collision with root package name */
    private static Lock f10469a = new ReentrantLock();
    private static boolean b = false;

    public interface ImageHandler {
        Bitmap handle();
    }

    private BitmapLock() {
    }

    public static Bitmap handleBitmap(ImageHandler imageHandler) {
        if (imageHandler == null) {
            return null;
        }
        if (!b) {
            return imageHandler.handle();
        }
        f10469a.lock();
        try {
            return imageHandler.handle();
        } finally {
            f10469a.unlock();
        }
    }
}
