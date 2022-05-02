package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zay extends RemoteCreator<zak> {
    private static final zay zaa = new zay();

    private zay() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        return zaa.zab(context, i, i2);
    }

    private final View zab(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-49889287, oncanceled);
            onCancelLoad.getMin(-49889287, oncanceled);
        }
        try {
            return (View) ObjectWrapper.unwrap(((zak) getRemoteCreatorInstance(context)).zaa(ObjectWrapper.wrap(context), new zaw(i, i2, (Scope[]) null)));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e);
        }
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof zak) {
            return (zak) queryLocalInterface;
        }
        return new zam(iBinder);
    }
}
