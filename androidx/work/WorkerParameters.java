package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.AppCompatButton;
import o.getMinWidthMinor;
import o.setAutoSizeTextTypeUniformWithConfiguration;
import o.setDropDownBackgroundResource;
import o.updateAppearance;

public final class WorkerParameters {
    @NonNull
    setDropDownBackgroundResource IsOverlapping;
    @NonNull
    Executor equals;
    @NonNull
    getMax getMax;
    @NonNull
    Set<String> getMin;
    @NonNull
    setAutoSizeTextTypeUniformWithConfiguration isInside;
    int length;
    @NonNull
    public updateAppearance setMax;
    @NonNull
    UUID setMin;
    @NonNull
    AppCompatButton toFloatRange;
    @NonNull
    getMinWidthMinor toIntRange;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class getMax {
        @RequiresApi(28)
        public Network getMin;
        @NonNull
        public List<Uri> setMax = Collections.emptyList();
        @NonNull
        public List<String> setMin = Collections.emptyList();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull updateAppearance updateappearance, @NonNull Collection<String> collection, @NonNull getMax getmax, @IntRange(from = 0) int i, @NonNull Executor executor, @NonNull getMinWidthMinor getminwidthminor, @NonNull setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration, @NonNull AppCompatButton appCompatButton, @NonNull setDropDownBackgroundResource setdropdownbackgroundresource) {
        this.setMin = uuid;
        this.setMax = updateappearance;
        this.getMin = new HashSet(collection);
        this.getMax = getmax;
        this.length = i;
        this.equals = executor;
        this.toIntRange = getminwidthminor;
        this.isInside = setautosizetexttypeuniformwithconfiguration;
        this.toFloatRange = appCompatButton;
        this.IsOverlapping = setdropdownbackgroundresource;
    }
}
