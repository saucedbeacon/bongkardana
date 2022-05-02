package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.bottomsheet.BottomSheetBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class title implements getBindingAdapter<BottomSheetBridge> {
    private final b.C0007b<getCancelListeners$core> servicesBottomSheetManagerProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/danah5/chrome/CustomTabEngine;", "", "packageName", "", "priority", "", "(Ljava/lang/String;I)V", "getPackageName", "()Ljava/lang/String;", "getPriority", "()I", "setPriority", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.title$default  reason: invalid class name */
    public final class Cdefault {
        @NotNull
        public static final length Companion = new length((DefaultConstructorMarker) null);
        public static final int UNKNOWN_PRIORITY = 10;
        @NotNull
        private final String packageName;
        private int priority;

        public static /* synthetic */ Cdefault copy$default(Cdefault defaultR, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = defaultR.packageName;
            }
            if ((i2 & 2) != 0) {
                i = defaultR.priority;
            }
            return defaultR.copy(str, i);
        }

        @NotNull
        public final String component1() {
            return this.packageName;
        }

        public final int component2() {
            return this.priority;
        }

        @NotNull
        public final Cdefault copy(@NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            return new Cdefault(str, i);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CustomTabEngine(packageName=");
            sb.append(this.packageName);
            sb.append(", priority=");
            sb.append(this.priority);
            sb.append(")");
            return sb.toString();
        }

        public Cdefault(@NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            this.packageName = str;
            this.priority = i;
        }

        @NotNull
        public final String getPackageName() {
            return this.packageName;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Cdefault(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 10 : i);
        }

        public final int getPriority() {
            return this.priority;
        }

        public final void setPriority(int i) {
            this.priority = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof Cdefault) && Intrinsics.areEqual((Object) this.packageName, (Object) ((Cdefault) obj).packageName);
            }
            return true;
        }

        public final int hashCode() {
            return this.packageName.hashCode();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lid/dana/danah5/chrome/CustomTabEngine$Companion;", "", "()V", "UNKNOWN_PRIORITY", "", "chromeApps", "", "Lid/dana/danah5/chrome/CustomTabEngine;", "getChromeApps", "()[Lid/dana/danah5/chrome/CustomTabEngine;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.title$default$length */
        public static final class length {
            private length() {
            }

            public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Cdefault[] getChromeApps() {
                return new Cdefault[]{new Cdefault("com.android.chrome", 0), new Cdefault("com.brave.browser", 0), new Cdefault("com.brave.browser_nightly", 0), new Cdefault("com.chrome.beta", 1), new Cdefault("com.brave.browser_beta", 2), new Cdefault("com.chrome.dev", 3)};
            }
        }
    }

    public title(b.C0007b<getCancelListeners$core> bVar) {
        this.servicesBottomSheetManagerProvider = bVar;
    }

    public static getBindingAdapter<BottomSheetBridge> create(b.C0007b<getCancelListeners$core> bVar) {
        return new title(bVar);
    }

    public final void injectMembers(BottomSheetBridge bottomSheetBridge) {
        injectServicesBottomSheetManager(bottomSheetBridge, this.servicesBottomSheetManagerProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.bottomsheet.BottomSheetBridge.servicesBottomSheetManager")
    public static void injectServicesBottomSheetManager(BottomSheetBridge bottomSheetBridge, getCancelListeners$core getcancellisteners_core) {
        bottomSheetBridge.servicesBottomSheetManager = getcancellisteners_core;
    }
}
