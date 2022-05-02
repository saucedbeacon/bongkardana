package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public abstract class zad implements DialogInterface.OnClickListener {
    /* access modifiers changed from: protected */
    public abstract void zaa();

    public static zad zaa(Activity activity, Intent intent, int i) {
        return new zac(intent, activity, i);
    }

    public static zad zaa(@NonNull Fragment fragment, @Nullable Intent intent, int i) {
        return new zaf(intent, fragment, i);
    }

    public static zad zaa(@NonNull LifecycleFragment lifecycleFragment, Intent intent, int i) {
        return new zae(intent, lifecycleFragment, 2);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            zaa();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
