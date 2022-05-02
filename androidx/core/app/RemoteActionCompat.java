package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import o.ActivityChooserView;

public final class RemoteActionCompat implements ActivityChooserView {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean equals;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PendingIntent getMax;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean getMin;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CharSequence length;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CharSequence setMax;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public IconCompat setMin;
}
