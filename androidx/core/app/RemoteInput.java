package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

public final class RemoteInput {
    public final CharSequence[] getMax;
    public final Bundle getMin;
    public final String length;
    public final CharSequence setMax;
    public final Set<String> setMin;
    private final boolean toFloatRange;
    private final int toIntRange;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    public final boolean getMax() {
        return this.toFloatRange;
    }

    @RequiresApi(20)
    public static android.app.RemoteInput[] getMin(RemoteInput[] remoteInputArr) {
        Set<String> set;
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            RemoteInput remoteInput = remoteInputArr[i];
            RemoteInput.Builder addExtras = new RemoteInput.Builder(remoteInput.length).setLabel(remoteInput.setMax).setChoices(remoteInput.getMax).setAllowFreeFormInput(remoteInput.getMax()).addExtras(remoteInput.getMin);
            if (Build.VERSION.SDK_INT >= 26 && (set = remoteInput.setMin) != null) {
                for (String allowDataType : set) {
                    addExtras.setAllowDataType(allowDataType, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(remoteInput.toIntRange);
            }
            remoteInputArr2[i] = addExtras.build();
        }
        return remoteInputArr2;
    }
}
