package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.a;
import com.google.android.play.core.tasks.j;

public class SplitInstallException extends j {
    @SplitInstallErrorCode

    /* renamed from: a  reason: collision with root package name */
    private final int f10957a;

    public SplitInstallException(@SplitInstallErrorCode int i) {
        super(String.format("Split Install Error(%d): %s", new Object[]{Integer.valueOf(i), a.a(i)}));
        if (i != 0) {
            this.f10957a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @SplitInstallErrorCode
    public int getErrorCode() {
        return this.f10957a;
    }
}
