package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

public abstract class zaa {
    final zac zaa;
    protected int zab = 0;
    private int zac = 0;
    private boolean zad = false;
    private boolean zae = true;
    private boolean zaf = false;
    private boolean zag = true;

    public zaa(Uri uri, int i) {
        this.zaa = new zac(uri);
        this.zab = i;
    }

    /* access modifiers changed from: protected */
    public abstract void zaa(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: package-private */
    public final void zaa(Context context, Bitmap bitmap, boolean z) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* access modifiers changed from: package-private */
    public final void zaa(Context context, zak zak) {
        if (this.zag) {
            zaa((Drawable) null, false, true, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaa(Context context, zak zak, boolean z) {
        int i = this.zab;
        zaa(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    /* access modifiers changed from: protected */
    public final boolean zaa(boolean z, boolean z2) {
        return this.zae && !z2 && !z;
    }
}
