package com.google.firebase.ml.vision.automl.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzc extends IInterface {
    IOnDeviceAutoMLImageLabeler newOnDeviceAutoMLImageLabeler(IObjectWrapper iObjectWrapper, OnDeviceAutoMLImageLabelerOptionsParcel onDeviceAutoMLImageLabelerOptionsParcel) throws RemoteException;
}
