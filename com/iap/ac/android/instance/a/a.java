package com.iap.ac.android.instance.a;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import java.nio.ByteBuffer;

public class a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public static String f9718a;

    @NonNull
    public static String a(@NonNull byte[] bArr) {
        ACLog.d("InstanceIdImpl", "will generateInstanceIdInternal");
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int random = (int) (Math.random() * 1000.0d);
        ByteBuffer allocate = ByteBuffer.allocate(32);
        allocate.putInt(currentTimeMillis);
        allocate.putInt(random);
        if (bArr.length >= 23) {
            allocate.put(bArr, 0, 23);
        } else {
            allocate.put(bArr);
            allocate.put(new byte[(23 - bArr.length)]);
        }
        byte[] array = allocate.array();
        com.iap.ac.android.instance.b.a aVar = new com.iap.ac.android.instance.b.a();
        aVar.update(array, 0, 31);
        array[31] = (byte) ((int) aVar.getValue());
        return Base64.encodeToString(array, 2);
    }
}
