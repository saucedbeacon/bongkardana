package com.google.firebase.ml.vision.face;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_ml.zzlg;
import com.google.android.gms.internal.firebase_ml.zzli;
import com.google.android.gms.vision.face.Contour;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.google.firebase.ml.vision.common.FirebaseVisionPoint;
import com.google.firebase.ml.vision.face.FirebaseVisionFaceContour;
import com.google.firebase.ml.vision.face.FirebaseVisionFaceLandmark;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.concurrent.Immutable;

@Immutable
public class FirebaseVisionFace {
    public static final int INVALID_ID = -1;
    public static final float UNCOMPUTED_PROBABILITY = -1.0f;
    private final Rect zzbhd;
    private int zzbid = -1;
    private float zzbie = -1.0f;
    private float zzbif = -1.0f;
    private float zzbig = -1.0f;
    private final float zzbih;
    private final float zzbii;
    private final SparseArray<FirebaseVisionFaceLandmark> zzbij = new SparseArray<>();
    private final SparseArray<FirebaseVisionFaceContour> zzbik = new SparseArray<>();

    private static boolean zzbv(@FirebaseVisionFaceLandmark.LandmarkType int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    @NonNull
    public Rect getBoundingBox() {
        return this.zzbhd;
    }

    public int getTrackingId() {
        return this.zzbid;
    }

    public FirebaseVisionFace(@NonNull Face face) {
        int i;
        PointF position = face.getPosition();
        this.zzbhd = new Rect((int) position.x, (int) position.y, (int) (position.x + face.getWidth()), (int) (position.y + face.getHeight()));
        this.zzbid = face.getId();
        for (Landmark next : face.getLandmarks()) {
            if (zzbv(next.getType()) && next.getPosition() != null) {
                this.zzbij.put(next.getType(), new FirebaseVisionFaceLandmark(next.getType(), new FirebaseVisionPoint(Float.valueOf(next.getPosition().x), Float.valueOf(next.getPosition().y), (Float) null)));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Contour> it = face.getContours().iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                Contour next2 = it.next();
                switch (next2.getType()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 8;
                        break;
                    case 8:
                        i = 9;
                        break;
                    case 9:
                        i = 10;
                        break;
                    case 10:
                        i = 11;
                        break;
                    case 11:
                        i = 12;
                        break;
                    case 12:
                        i = 13;
                        break;
                    case 13:
                        i = 14;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if ((i > 14 || i <= 0) ? false : z) {
                    PointF[] positions = next2.getPositions();
                    ArrayList arrayList2 = new ArrayList();
                    if (positions != null) {
                        for (PointF pointF : positions) {
                            arrayList2.add(new FirebaseVisionPoint(Float.valueOf(pointF.x), Float.valueOf(pointF.y), (Float) null));
                        }
                        this.zzbik.put(i, new FirebaseVisionFaceContour(i, arrayList2));
                        arrayList.addAll(arrayList2);
                    }
                }
            } else {
                this.zzbik.put(1, new FirebaseVisionFaceContour(1, arrayList));
                this.zzbih = face.getEulerY();
                this.zzbii = face.getEulerZ();
                this.zzbig = face.getIsSmilingProbability();
                this.zzbif = face.getIsLeftEyeOpenProbability();
                this.zzbie = face.getIsRightEyeOpenProbability();
                return;
            }
        }
    }

    public float getHeadEulerAngleY() {
        return this.zzbih;
    }

    public float getHeadEulerAngleZ() {
        return this.zzbii;
    }

    @Nullable
    public FirebaseVisionFaceLandmark getLandmark(@FirebaseVisionFaceLandmark.LandmarkType int i) {
        return this.zzbij.get(i);
    }

    @NonNull
    public FirebaseVisionFaceContour getContour(@FirebaseVisionFaceContour.ContourType int i) {
        FirebaseVisionFaceContour firebaseVisionFaceContour = this.zzbik.get(i);
        if (firebaseVisionFaceContour != null) {
            return firebaseVisionFaceContour;
        }
        return new FirebaseVisionFaceContour(i, new ArrayList());
    }

    public final SparseArray<FirebaseVisionFaceContour> zzpj() {
        return this.zzbik;
    }

    public final void zza(SparseArray<FirebaseVisionFaceContour> sparseArray) {
        this.zzbik.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            this.zzbik.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }

    public final void zzbf(int i) {
        this.zzbid = -1;
    }

    public float getSmilingProbability() {
        return this.zzbig;
    }

    public float getLeftEyeOpenProbability() {
        return this.zzbif;
    }

    public float getRightEyeOpenProbability() {
        return this.zzbie;
    }

    public String toString() {
        zzli zza = zzlg.zzaw("FirebaseVisionFace").zzh("boundingBox", this.zzbhd).zzb("trackingId", this.zzbid).zza("rightEyeOpenProbability", this.zzbie).zza("leftEyeOpenProbability", this.zzbif).zza("smileProbability", this.zzbig).zza("eulerY", this.zzbih).zza("eulerZ", this.zzbii);
        zzli zzaw = zzlg.zzaw("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (zzbv(i)) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("landmark_");
                sb.append(i);
                zzaw.zzh(sb.toString(), getLandmark(i));
            }
        }
        zza.zzh("landmarks", zzaw.toString());
        zzli zzaw2 = zzlg.zzaw("Contours");
        for (int i2 = 1; i2 <= 14; i2++) {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Contour_");
            sb2.append(i2);
            zzaw2.zzh(sb2.toString(), getContour(i2));
        }
        zza.zzh("contours", zzaw2.toString());
        return zza.toString();
    }
}
