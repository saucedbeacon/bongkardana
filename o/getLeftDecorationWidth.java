package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import o.onRequestChildFocus;

public final class getLeftDecorationWidth {
    public static Bitmap length(@NonNull Bitmap bitmap, @NonNull Matrix matrix) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(createBitmap) ? createBitmap : bitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    public static int setMax(@NonNull BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            while (true) {
                if (i3 / i5 <= i2 && i4 / i5 <= i) {
                    break;
                }
                i5 *= 2;
            }
        }
        return i5;
    }

    public static int length(@NonNull Context context, @NonNull Uri uri) {
        int i;
        int i2 = 0;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            onRequestChildFocus onrequestchildfocus = new onRequestChildFocus(openInputStream);
            if (onRequestChildFocus.setMin(onrequestchildfocus.setMax.setMax())) {
                while (true) {
                    if (onrequestchildfocus.setMax.setMin() != 255) {
                        break;
                    }
                    short min = onrequestchildfocus.setMax.setMin();
                    if (min != 218) {
                        if (min != 217) {
                            i = onrequestchildfocus.setMax.setMax() - 2;
                            if (min == 225) {
                                break;
                            }
                            long j = (long) i;
                            if (onrequestchildfocus.setMax.setMax(j) != j) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i = -1;
                if (i != -1) {
                    byte[] bArr = new byte[i];
                    if (onrequestchildfocus.setMax.setMax(bArr, i) == i && onRequestChildFocus.setMin(bArr, i)) {
                        i2 = onRequestChildFocus.getMin(new onRequestChildFocus.setMin(bArr, i));
                        if (openInputStream != null && (openInputStream instanceof Closeable)) {
                            openInputStream.close();
                        }
                        return i2;
                    }
                }
            }
            i2 = -1;
            openInputStream.close();
            return i2;
        } catch (IOException unused) {
        }
    }
}
