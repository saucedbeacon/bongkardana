package o;

import o.b;

public final class BluetoothCrashResolver implements getAdapterPosition<StartupBroadcastReceiver> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<clearDetections> twilioDialogRepositoryProvider;

    public final class UpdateNotifier implements getAdapterPosition<setUpdateNotifier> {
        private final b.C0007b<isPacketDistinct> twilioSdkRepositoryProvider;

        public UpdateNotifier(b.C0007b<isPacketDistinct> bVar) {
            this.twilioSdkRepositoryProvider = bVar;
        }

        public final setUpdateNotifier get() {
            return newInstance(this.twilioSdkRepositoryProvider.get());
        }

        public static UpdateNotifier create(b.C0007b<isPacketDistinct> bVar) {
            return new UpdateNotifier(bVar);
        }

        public static setUpdateNotifier newInstance(isPacketDistinct ispacketdistinct) {
            return new setUpdateNotifier(ispacketdistinct);
        }
    }

    public BluetoothCrashResolver(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<clearDetections> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.twilioDialogRepositoryProvider = bVar3;
    }

    public final StartupBroadcastReceiver get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.twilioDialogRepositoryProvider.get());
    }

    public static BluetoothCrashResolver create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<clearDetections> bVar3) {
        return new BluetoothCrashResolver(bVar, bVar2, bVar3);
    }

    public static StartupBroadcastReceiver newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, clearDetections cleardetections) {
        return new StartupBroadcastReceiver(appxloadfailed, getscheme, cleardetections);
    }
}
