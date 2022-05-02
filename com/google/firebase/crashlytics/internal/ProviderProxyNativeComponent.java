package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import com.google.firebase.inject.Provider;
import java.io.File;

public final class ProviderProxyNativeComponent implements CrashlyticsNativeComponent {
    private static final NativeSessionFileProvider MISSING_NATIVE_SESSION_FILE_PROVIDER = new MissingNativeSessionFileProvider();
    private final Provider<CrashlyticsNativeComponent> provider;

    public ProviderProxyNativeComponent(Provider<CrashlyticsNativeComponent> provider2) {
        this.provider = provider2;
    }

    public final boolean hasCrashDataForSession(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.provider.get();
        if (crashlyticsNativeComponent != null) {
            return crashlyticsNativeComponent.hasCrashDataForSession(str);
        }
        return false;
    }

    public final boolean openSession(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.provider.get();
        if (crashlyticsNativeComponent != null) {
            return crashlyticsNativeComponent.openSession(str);
        }
        return true;
    }

    public final boolean finalizeSession(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.provider.get();
        if (crashlyticsNativeComponent != null) {
            return crashlyticsNativeComponent.finalizeSession(str);
        }
        return true;
    }

    @NonNull
    public final NativeSessionFileProvider getSessionFileProvider(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.provider.get();
        if (crashlyticsNativeComponent != null) {
            return crashlyticsNativeComponent.getSessionFileProvider(str);
        }
        return MISSING_NATIVE_SESSION_FILE_PROVIDER;
    }

    public final void writeBeginSession(@NonNull String str, @NonNull String str2, long j) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.provider.get();
        if (crashlyticsNativeComponent != null) {
            crashlyticsNativeComponent.writeBeginSession(str, str2, j);
        }
    }

    public final void writeSessionApp(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, int i, @NonNull String str6) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.provider.get();
        if (crashlyticsNativeComponent != null) {
            crashlyticsNativeComponent.writeSessionApp(str, str2, str3, str4, str5, i, str6);
        }
    }

    public final void writeSessionOs(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.provider.get();
        if (crashlyticsNativeComponent != null) {
            crashlyticsNativeComponent.writeSessionOs(str, str2, str3, z);
        }
    }

    public final void writeSessionDevice(@NonNull String str, int i, @NonNull String str2, int i2, long j, long j2, boolean z, int i3, @NonNull String str3, @NonNull String str4) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.provider.get();
        if (crashlyticsNativeComponent != null) {
            crashlyticsNativeComponent.writeSessionDevice(str, i, str2, i2, j, j2, z, i3, str3, str4);
        }
    }

    static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        public final File getAppFile() {
            return null;
        }

        public final File getBinaryImagesFile() {
            return null;
        }

        public final File getDeviceFile() {
            return null;
        }

        public final File getMetadataFile() {
            return null;
        }

        public final File getMinidumpFile() {
            return null;
        }

        public final File getOsFile() {
            return null;
        }

        public final File getSessionFile() {
            return null;
        }

        private MissingNativeSessionFileProvider() {
        }
    }
}
