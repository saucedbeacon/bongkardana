package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import o.ActivityChooserView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface hasOverlappingRendering {
    void getMax(@NonNull String str, @NonNull ActivityChooserView.InnerLayout innerLayout);

    void length(@NonNull String str);
}
