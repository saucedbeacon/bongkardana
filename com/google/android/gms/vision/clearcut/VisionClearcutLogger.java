package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.internal.vision.zzct;
import com.google.android.gms.internal.vision.zzdu;
import com.google.android.gms.internal.vision.zzjt;
import com.google.android.gms.vision.L;

@Keep
public class VisionClearcutLogger {
    private final ClearcutLogger zzbw;
    private boolean zzbx = true;

    public VisionClearcutLogger(Context context) {
        this.zzbw = new ClearcutLogger(context, "VISION", (String) null);
    }

    public final void zzb(int i, zzdu zzdu) {
        int zzeq = zzdu.zzeq();
        byte[] bArr = new byte[zzeq];
        zzjt.zza(zzdu, bArr, 0, zzeq);
        if (i < 0 || i > 3) {
            L.isLoggable(4);
            return;
        }
        try {
            if (this.zzbx) {
                this.zzbw.newEvent(bArr).setEventCode(i).log();
                return;
            }
            zzdu zzdu2 = new zzdu();
            try {
                zzjt.zza(zzdu2, bArr);
                L.zzc("Would have logged:\n%s", zzdu2.toString());
            } catch (Exception e) {
                L.zza(e, "Parsing error", new Object[0]);
            }
        } catch (Exception e2) {
            zzct.zza(e2);
            L.zza(e2, "Failed to log", new Object[0]);
        }
    }
}
