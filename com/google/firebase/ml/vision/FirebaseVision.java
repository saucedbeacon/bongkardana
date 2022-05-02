package com.google.firebase.ml.vision;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzph;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetector;
import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions;
import com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.ml.vision.cloud.landmark.FirebaseVisionCloudLandmarkDetector;
import com.google.firebase.ml.vision.document.FirebaseVisionCloudDocumentRecognizerOptions;
import com.google.firebase.ml.vision.document.FirebaseVisionDocumentTextRecognizer;
import com.google.firebase.ml.vision.face.FirebaseVisionFaceDetector;
import com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions;
import com.google.firebase.ml.vision.label.FirebaseVisionCloudImageLabelerOptions;
import com.google.firebase.ml.vision.label.FirebaseVisionImageLabeler;
import com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceAutoMLImageLabelerOptions;
import com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import com.google.firebase.ml.vision.objects.FirebaseVisionObjectDetector;
import com.google.firebase.ml.vision.objects.FirebaseVisionObjectDetectorOptions;
import com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions;
import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer;

public class FirebaseVision {
    private static final FirebaseVisionCloudDetectorOptions zzbei = new FirebaseVisionCloudDetectorOptions.Builder().build();
    private static final FirebaseVisionFaceDetectorOptions zzbej = new FirebaseVisionFaceDetectorOptions.Builder().build();
    private static final FirebaseVisionBarcodeDetectorOptions zzbek = new FirebaseVisionBarcodeDetectorOptions.Builder().build();
    private static final FirebaseVisionCloudTextRecognizerOptions zzbel = new FirebaseVisionCloudTextRecognizerOptions.Builder().build();
    private static final FirebaseVisionCloudDocumentRecognizerOptions zzbem = new FirebaseVisionCloudDocumentRecognizerOptions.Builder().build();
    private static final FirebaseVisionOnDeviceImageLabelerOptions zzben = new FirebaseVisionOnDeviceImageLabelerOptions.Builder().build();
    private static final FirebaseVisionCloudImageLabelerOptions zzbeo = new FirebaseVisionCloudImageLabelerOptions.Builder().build();
    private static final FirebaseVisionObjectDetectorOptions zzbep = new FirebaseVisionObjectDetectorOptions.Builder().build();
    private final zzph zzazb;
    private final FirebaseApp zzbeq;

    @NonNull
    public static FirebaseVision getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @NonNull
    public static FirebaseVision getInstance(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp can not be null");
        return (FirebaseVision) firebaseApp.get(FirebaseVision.class);
    }

    public void setStatsCollectionEnabled(boolean z) {
        this.zzazb.zzav(z);
    }

    public boolean isStatsCollectionEnabled() {
        return this.zzazb.zzng();
    }

    @NonNull
    public FirebaseVisionFaceDetector getVisionFaceDetector(@NonNull FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "Please provide a valid FirebaseVisionFaceDetectorOptions");
        return FirebaseVisionFaceDetector.zza(this.zzbeq, firebaseVisionFaceDetectorOptions);
    }

    @NonNull
    public FirebaseVisionFaceDetector getVisionFaceDetector() {
        return FirebaseVisionFaceDetector.zza(this.zzbeq, zzbej);
    }

    @NonNull
    public FirebaseVisionTextRecognizer getOnDeviceTextRecognizer() {
        return FirebaseVisionTextRecognizer.zza(this.zzbeq, (FirebaseVisionCloudTextRecognizerOptions) null, true);
    }

    @NonNull
    public FirebaseVisionTextRecognizer getCloudTextRecognizer() {
        return FirebaseVisionTextRecognizer.zza(this.zzbeq, zzbel, false);
    }

    @NonNull
    public FirebaseVisionTextRecognizer getCloudTextRecognizer(@NonNull FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions) {
        return FirebaseVisionTextRecognizer.zza(this.zzbeq, firebaseVisionCloudTextRecognizerOptions, false);
    }

    @NonNull
    public FirebaseVisionBarcodeDetector getVisionBarcodeDetector(@NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        return FirebaseVisionBarcodeDetector.zza(this.zzbeq, (FirebaseVisionBarcodeDetectorOptions) Preconditions.checkNotNull(firebaseVisionBarcodeDetectorOptions, "Please provide a valid FirebaseVisionBarcodeDetectorOptions"));
    }

    @NonNull
    public FirebaseVisionBarcodeDetector getVisionBarcodeDetector() {
        return FirebaseVisionBarcodeDetector.zza(this.zzbeq, zzbek);
    }

    @NonNull
    public FirebaseVisionImageLabeler getOnDeviceImageLabeler(@NonNull FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        return FirebaseVisionImageLabeler.zza(this.zzbeq, (FirebaseVisionOnDeviceImageLabelerOptions) Preconditions.checkNotNull(firebaseVisionOnDeviceImageLabelerOptions, "Please provide a valid FirebaseVisionOnDeviceImageLabelerOptions"));
    }

    @NonNull
    public FirebaseVisionImageLabeler getOnDeviceImageLabeler() {
        return FirebaseVisionImageLabeler.zza(this.zzbeq, zzben);
    }

    @NonNull
    public FirebaseVisionImageLabeler getOnDeviceAutoMLImageLabeler(@NonNull FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions) throws FirebaseMLException {
        return FirebaseVisionImageLabeler.zza(this.zzbeq, (FirebaseVisionOnDeviceAutoMLImageLabelerOptions) Preconditions.checkNotNull(firebaseVisionOnDeviceAutoMLImageLabelerOptions, "Please provide a valid FirebaseVisionOnDeviceAutoMLImageLabelerOptions"));
    }

    @NonNull
    public FirebaseVisionImageLabeler getCloudImageLabeler(@NonNull FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        return FirebaseVisionImageLabeler.zza(this.zzbeq, firebaseVisionCloudImageLabelerOptions);
    }

    @NonNull
    public FirebaseVisionImageLabeler getCloudImageLabeler() {
        return FirebaseVisionImageLabeler.zza(this.zzbeq, zzbeo);
    }

    @NonNull
    public FirebaseVisionDocumentTextRecognizer getCloudDocumentTextRecognizer(@NonNull FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions) {
        return FirebaseVisionDocumentTextRecognizer.zza(this.zzbeq, firebaseVisionCloudDocumentRecognizerOptions);
    }

    @NonNull
    public FirebaseVisionDocumentTextRecognizer getCloudDocumentTextRecognizer() {
        return FirebaseVisionDocumentTextRecognizer.zza(this.zzbeq, zzbem);
    }

    @NonNull
    public FirebaseVisionCloudLandmarkDetector getVisionCloudLandmarkDetector(@NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        return FirebaseVisionCloudLandmarkDetector.zza(this.zzbeq, firebaseVisionCloudDetectorOptions);
    }

    @NonNull
    public FirebaseVisionCloudLandmarkDetector getVisionCloudLandmarkDetector() {
        return FirebaseVisionCloudLandmarkDetector.zza(this.zzbeq, zzbei);
    }

    @NonNull
    public FirebaseVisionObjectDetector getOnDeviceObjectDetector(@NonNull FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions) {
        return FirebaseVisionObjectDetector.zza(this.zzbeq, firebaseVisionObjectDetectorOptions);
    }

    @NonNull
    public FirebaseVisionObjectDetector getOnDeviceObjectDetector() {
        return FirebaseVisionObjectDetector.zza(this.zzbeq, zzbep);
    }

    FirebaseVision(FirebaseApp firebaseApp) {
        this.zzbeq = firebaseApp;
        this.zzazb = zzph.zzc(firebaseApp);
    }
}
