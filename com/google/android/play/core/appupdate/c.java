package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.i;

final class c extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f10831a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(Handler handler, i iVar) {
        super(handler);
        this.f10831a = iVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        i iVar;
        int i2 = 1;
        if (i == 1) {
            iVar = this.f10831a;
            i2 = -1;
        } else if (i != 2) {
            iVar = this.f10831a;
        } else {
            iVar = this.f10831a;
            i2 = 0;
        }
        iVar.b(Integer.valueOf(i2));
    }
}
