package com.google.firebase.ml.vision.barcode;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzro;
import com.google.android.gms.internal.firebase_ml.zztf;
import com.google.android.gms.internal.firebase_ml.zzux;
import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirebaseVisionBarcodeDetectorOptions {
    @SuppressLint({"UseSparseArrays"})
    private static final Map<Integer, zztf> zzbfz;
    private final int zzbfy;

    private FirebaseVisionBarcodeDetectorOptions(int i) {
        this.zzbfy = i;
    }

    public static class Builder {
        private int zzbga = 0;

        @NonNull
        public Builder setBarcodeFormats(@FirebaseVisionBarcode.BarcodeFormat int i, @FirebaseVisionBarcode.BarcodeFormat @NonNull int... iArr) {
            this.zzbga = i;
            if (iArr != null) {
                for (int i2 : iArr) {
                    this.zzbga = i2 | this.zzbga;
                }
            }
            return this;
        }

        @NonNull
        public FirebaseVisionBarcodeDetectorOptions build() {
            return new FirebaseVisionBarcodeDetectorOptions(this.zzbga);
        }
    }

    public final int zzoz() {
        return this.zzbfy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FirebaseVisionBarcodeDetectorOptions) && this.zzbfy == ((FirebaseVisionBarcodeDetectorOptions) obj).zzbfy;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzbfy));
    }

    public final zzro.zza zzpa() {
        ArrayList arrayList = new ArrayList();
        if (this.zzbfy == 0) {
            arrayList.addAll(zzbfz.values());
        } else {
            for (Map.Entry next : zzbfz.entrySet()) {
                if ((this.zzbfy & ((Integer) next.getKey()).intValue()) != 0) {
                    arrayList.add((zztf) next.getValue());
                }
            }
        }
        return (zzro.zza) ((zzux) zzro.zza.zzqg().zzz(arrayList).zzte());
    }

    static {
        HashMap hashMap = new HashMap();
        zzbfz = hashMap;
        hashMap.put(1, zztf.CODE_128);
        zzbfz.put(2, zztf.CODE_39);
        zzbfz.put(4, zztf.CODE_93);
        zzbfz.put(8, zztf.CODABAR);
        zzbfz.put(16, zztf.DATA_MATRIX);
        zzbfz.put(32, zztf.EAN_13);
        zzbfz.put(64, zztf.EAN_8);
        zzbfz.put(128, zztf.ITF);
        zzbfz.put(256, zztf.QR_CODE);
        zzbfz.put(512, zztf.UPC_A);
        zzbfz.put(1024, zztf.UPC_E);
        zzbfz.put(2048, zztf.PDF417);
        zzbfz.put(4096, zztf.AZTEC);
    }
}
