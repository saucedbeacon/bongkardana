package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

public interface bu extends IInterface {
    void a(String str, int i, Bundle bundle, bw bwVar) throws RemoteException;

    void a(String str, int i, bw bwVar) throws RemoteException;

    void a(String str, bw bwVar) throws RemoteException;

    void a(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException;

    void b(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException;

    void c(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException;

    void d(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException;

    void e(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException;
}
