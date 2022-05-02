package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.easteregg.EasterEggsEventHandler;
import id.dana.danah5.extension.DanaGriverAppLanguageExtension;
import o.b;

public final class positiveButton implements getAdapterPosition<DanaGriverAppLanguageExtension> {
    public final DanaGriverAppLanguageExtension get() {
        return newInstance();
    }

    /* renamed from: o.positiveButton$default  reason: invalid class name */
    public final class Cdefault implements getBindingAdapter<EasterEggsEventHandler> {
        private final b.C0007b<getPerformanceTracker> deviceInformationProvider;

        public Cdefault(b.C0007b<getPerformanceTracker> bVar) {
            this.deviceInformationProvider = bVar;
        }

        public static getBindingAdapter<EasterEggsEventHandler> create(b.C0007b<getPerformanceTracker> bVar) {
            return new Cdefault(bVar);
        }

        public final void injectMembers(EasterEggsEventHandler easterEggsEventHandler) {
            injectDeviceInformationProvider(easterEggsEventHandler, this.deviceInformationProvider.get());
        }

        @InjectedFieldSignature("id.dana.danah5.easteregg.EasterEggsEventHandler.deviceInformationProvider")
        public static void injectDeviceInformationProvider(EasterEggsEventHandler easterEggsEventHandler, getPerformanceTracker getperformancetracker) {
            easterEggsEventHandler.deviceInformationProvider = getperformancetracker;
        }
    }

    public static positiveButton create() {
        return getMin.INSTANCE;
    }

    public static DanaGriverAppLanguageExtension newInstance() {
        return new DanaGriverAppLanguageExtension();
    }

    static final class getMin {
        /* access modifiers changed from: private */
        public static final positiveButton INSTANCE = new positiveButton();

        private getMin() {
        }
    }
}
