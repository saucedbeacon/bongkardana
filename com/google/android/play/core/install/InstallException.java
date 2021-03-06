package com.google.android.play.core.install;

import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.a;
import com.google.android.play.core.tasks.j;

public class InstallException extends j {
    @InstallErrorCode

    /* renamed from: a  reason: collision with root package name */
    private final int f9567a;

    public InstallException(@InstallErrorCode int i) {
        super(String.format("Install Error(%d): %s", new Object[]{Integer.valueOf(i), a.a(i)}));
        if (i != 0) {
            this.f9567a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @InstallErrorCode
    public int getErrorCode() {
        return this.f9567a;
    }
}
