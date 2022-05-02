package com.google.android.play.core.splitinstall;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SplitInstallRequest {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f10959a;
    private final List<Locale> b;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f10960a = new ArrayList();
        /* access modifiers changed from: private */
        public final List<Locale> b = new ArrayList();

        private Builder() {
        }

        /* synthetic */ Builder(byte[] bArr) {
        }

        @NonNull
        public Builder addLanguage(@Nullable Locale locale) {
            this.b.add(locale);
            return this;
        }

        public Builder addModule(String str) {
            this.f10960a.add(str);
            return this;
        }

        @NonNull
        public SplitInstallRequest build() {
            return new SplitInstallRequest(this);
        }
    }

    /* synthetic */ SplitInstallRequest(Builder builder) {
        this.f10959a = new ArrayList(builder.f10960a);
        this.b = new ArrayList(builder.b);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder((byte[]) null);
    }

    public List<Locale> getLanguages() {
        return this.b;
    }

    public List<String> getModuleNames() {
        return this.f10959a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.f10959a, this.b});
    }
}
