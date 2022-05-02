package o;

import androidx.annotation.NonNull;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class setTrackResource {
    @NonNull
    private final setSwitchMinWidth setMin;

    public setTrackResource(@NonNull setSwitchMinWidth setswitchminwidth) {
        this.setMin = setswitchminwidth;
    }

    /* access modifiers changed from: package-private */
    public final File setMax(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(getMin(), setMax(str, fileExtension, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final File getMin() {
        File max = this.setMin.getMax();
        if (max.isFile()) {
            max.delete();
        }
        if (!max.exists()) {
            max.mkdirs();
        }
        return max;
    }

    static String setMax(String str, FileExtension fileExtension, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? fileExtension.tempExtension() : fileExtension.extension);
        return sb.toString();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @androidx.annotation.WorkerThread
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.airbnb.lottie.network.FileExtension, java.io.InputStream> setMin(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0054 }
            java.io.File r2 = r5.getMin()     // Catch:{ FileNotFoundException -> 0x0054 }
            com.airbnb.lottie.network.FileExtension r3 = com.airbnb.lottie.network.FileExtension.JSON     // Catch:{ FileNotFoundException -> 0x0054 }
            r4 = 0
            java.lang.String r3 = setMax((java.lang.String) r6, (com.airbnb.lottie.network.FileExtension) r3, (boolean) r4)     // Catch:{ FileNotFoundException -> 0x0054 }
            r1.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x0054 }
            boolean r2 = r1.exists()     // Catch:{ FileNotFoundException -> 0x0054 }
            if (r2 == 0) goto L_0x0018
            goto L_0x002f
        L_0x0018:
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0054 }
            java.io.File r2 = r5.getMin()     // Catch:{ FileNotFoundException -> 0x0054 }
            com.airbnb.lottie.network.FileExtension r3 = com.airbnb.lottie.network.FileExtension.ZIP     // Catch:{ FileNotFoundException -> 0x0054 }
            java.lang.String r6 = setMax((java.lang.String) r6, (com.airbnb.lottie.network.FileExtension) r3, (boolean) r4)     // Catch:{ FileNotFoundException -> 0x0054 }
            r1.<init>(r2, r6)     // Catch:{ FileNotFoundException -> 0x0054 }
            boolean r6 = r1.exists()     // Catch:{ FileNotFoundException -> 0x0054 }
            if (r6 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = r0
        L_0x002f:
            if (r1 != 0) goto L_0x0032
            return r0
        L_0x0032:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{  }
            r6.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r2 = ".zip"
            boolean r0 = r0.endsWith(r2)
            if (r0 == 0) goto L_0x0046
            com.airbnb.lottie.network.FileExtension r0 = com.airbnb.lottie.network.FileExtension.ZIP
            goto L_0x0048
        L_0x0046:
            com.airbnb.lottie.network.FileExtension r0 = com.airbnb.lottie.network.FileExtension.JSON
        L_0x0048:
            r1.getAbsolutePath()
            o.setTitleMargin.getMin()
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r6)
            return r1
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTrackResource.setMin(java.lang.String):android.util.Pair");
    }
}
