package com.google.firebase.ml.vision.objects.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzc extends IInterface {
    IObjectDetector newObjectDetector(IObjectWrapper iObjectWrapper, ObjectDetectorOptionsParcel objectDetectorOptionsParcel) throws RemoteException;
}
