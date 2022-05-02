package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.internal.base.zai;
import java.lang.ref.WeakReference;
import net.sqlcipher.database.SQLiteDatabase;

public final class zab extends zaa {
    private WeakReference<ImageView> zac;

    public zab(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference<>(imageView);
    }

    public final int hashCode() {
        return 0;
    }

    public zab(ImageView imageView, int i) {
        super(Uri.EMPTY, i);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference<>(imageView);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zab)) {
            return false;
        }
        ImageView imageView = (ImageView) this.zac.get();
        ImageView imageView2 = (ImageView) ((zab) obj).zac.get();
        return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
    }

    /* access modifiers changed from: protected */
    public final void zaa(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageView imageView = (ImageView) this.zac.get();
        if (imageView != null) {
            int i = 0;
            boolean z4 = !z2 && !z3;
            if (z4 && (imageView instanceof zai)) {
                zai zai = (zai) imageView;
                int zaa = zai.zaa();
                if (this.zab != 0 && zaa == this.zab) {
                    return;
                }
            }
            boolean zaa2 = zaa(z, z2);
            if (zaa2) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof zaf) {
                    drawable2 = ((zaf) drawable2).zaa();
                }
                drawable = new zaf(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zai) {
                zai zai2 = (zai) imageView;
                zai.zaa(z3 ? this.zaa.zaa : Uri.EMPTY);
                if (z4) {
                    i = this.zab;
                }
                zai.zaa(i);
            }
            if (drawable != null && zaa2) {
                ((zaf) drawable).zaa(SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            }
        }
    }
}
