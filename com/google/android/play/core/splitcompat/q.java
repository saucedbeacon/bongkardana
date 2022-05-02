package com.google.android.play.core.splitcompat;

import androidx.annotation.NonNull;
import java.io.File;

final class q {

    /* renamed from: a  reason: collision with root package name */
    private final File f9618a;
    private final String b;

    q() {
    }

    q(File file, String str) {
        this();
        if (file != null) {
            this.f9618a = file;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final File a() {
        return this.f9618a;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f9618a.equals(qVar.a()) && this.b.equals(qVar.b());
        }
    }

    public final int hashCode() {
        return ((this.f9618a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9618a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
