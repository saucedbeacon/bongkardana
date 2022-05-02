package com.google.firebase.ml.vision.barcode.internal;

import android.os.IInterface;
import android.os.RemoteException;

public interface zzi extends IInterface {
    IBarcodeDetector newBarcodeDetector(BarcodeDetectorOptionsParcel barcodeDetectorOptionsParcel) throws RemoteException;
}
