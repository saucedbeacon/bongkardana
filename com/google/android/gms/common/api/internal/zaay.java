package com.google.android.gms.common.api.internal;

abstract class zaay {
    private final zaaw zaa;

    protected zaay(zaaw zaaw) {
        this.zaa = zaaw;
    }

    /* access modifiers changed from: protected */
    public abstract void zaa();

    public final void zaa(zaaz zaaz) {
        zaaz.zaf.lock();
        try {
            if (zaaz.zan == this.zaa) {
                zaa();
                zaaz.zaf.unlock();
            }
        } finally {
            zaaz.zaf.unlock();
        }
    }
}
