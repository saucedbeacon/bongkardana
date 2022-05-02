package com.google.firebase.ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import java.io.File;

final class zzad implements zzi {
    private final FirebaseApp firebaseApp;
    private final String zzazz;

    zzad(@NonNull FirebaseApp firebaseApp2, @NonNull String str) {
        this.firebaseApp = firebaseApp2;
        this.zzazz = str;
    }

    @Nullable
    public final File zza(File file) throws FirebaseMLException {
        File zzc = new zzh(this.firebaseApp).zzc(this.zzazz, zzp.CUSTOM);
        File file2 = new File(zzc, String.valueOf(zzh.zzb(zzc) + 1));
        if (file.renameTo(file2)) {
            zzab.zzayb.d("RemoteModelFileManager", "Rename to serving model successfully");
            file2.setExecutable(false);
            file2.setWritable(false);
            return file2;
        }
        zzab.zzayb.d("RemoteModelFileManager", "Rename to serving model failed, remove the temp file.");
        if (file.delete()) {
            return null;
        }
        GmsLogger zznd = zzab.zzayb;
        String valueOf = String.valueOf(file.getAbsolutePath());
        zznd.d("RemoteModelFileManager", valueOf.length() != 0 ? "Failed to delete the temp file: ".concat(valueOf) : new String("Failed to delete the temp file: "));
        return null;
    }
}
