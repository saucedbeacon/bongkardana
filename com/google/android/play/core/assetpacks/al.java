package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.play.core.tasks.i;

final class al extends ak<ParcelFileDescriptor> {
    al(ar arVar, i<ParcelFileDescriptor> iVar) {
        super(arVar, iVar);
    }

    public final void b(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.b(bundle, bundle2);
        this.f10846a.b((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
