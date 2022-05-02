package o;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import o.b;

public final class param implements getAdapterPosition<setParam> {
    private final b.C0007b<generateKey> getMax;
    private final b.C0007b<generateKey> getMin;
    private final b.C0007b<generateKey> setMin;

    private param(b.C0007b<generateKey> bVar, b.C0007b<generateKey> bVar2, b.C0007b<generateKey> bVar3) {
        this.setMin = bVar;
        this.getMax = bVar2;
        this.getMin = bVar3;
    }

    public static param getMin(b.C0007b<generateKey> bVar, b.C0007b<generateKey> bVar2, b.C0007b<generateKey> bVar3) {
        return new param(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        generateKey generatekey = this.setMin.get();
        generateKey generatekey2 = this.getMax.get();
        try {
            Object[] objArr = new Object[3];
            objArr[2] = this.getMin.get();
            objArr[1] = generatekey2;
            objArr[0] = generatekey;
            return ((Class) setKeep.getMin(TextUtils.indexOf("", "", 0, 0), TextUtils.getOffsetBefore("", 0) + 9, (char) (ImageFormat.getBitsPerPixel(0) + 1))).getDeclaredConstructor(new Class[]{generateKey.class, generateKey.class, generateKey.class}).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
