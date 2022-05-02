package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

final class zaal extends zaap {
    private final ArrayList<Api.Client> zaa;
    private final /* synthetic */ zaaf zab;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaal(zaaf zaaf, ArrayList<Api.Client> arrayList) {
        super(zaaf, (zaae) null);
        this.zab = zaaf;
        this.zaa = arrayList;
    }

    @WorkerThread
    public final void zaa() {
        this.zab.zaa.zad.zac = this.zab.zai();
        ArrayList arrayList = this.zaa;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Api.Client) obj).getRemoteService(this.zab.zao, this.zab.zaa.zad.zac);
        }
    }
}
