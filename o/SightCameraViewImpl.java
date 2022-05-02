package o;

import android.content.Context;
import o.Beacon;
import o.SightCameraView;
import o.b;
import o.enableEventbus;
import o.setVideoCurTimeStamp;

public final class SightCameraViewImpl implements getAdapterPosition<SightCameraView.BufferType> {
    private final b.C0007b<Context> getMax;
    private final b.C0007b<Beacon.Builder> length;
    private final b.C0007b<getLatitude> setMax;
    private final b.C0007b<enableEventbus.setMax> setMin;

    private SightCameraViewImpl(b.C0007b<Context> bVar, b.C0007b<enableEventbus.setMax> bVar2, b.C0007b<Beacon.Builder> bVar3, b.C0007b<getLatitude> bVar4) {
        this.getMax = bVar;
        this.setMin = bVar2;
        this.length = bVar3;
        this.setMax = bVar4;
    }

    public final class GestureListener implements getAdapterPosition<setOnTapListener> {
        private final b.C0007b<setVideoCurTimeStamp.setMin> getMax;
        private final b.C0007b<notifyCharacteristicValue> getMin;
        private final b.C0007b<setBluetoothName> length;
        private final b.C0007b<setLatitude> setMax;
        private final b.C0007b<Context> setMin;

        private GestureListener(b.C0007b<Context> bVar, b.C0007b<setVideoCurTimeStamp.setMin> bVar2, b.C0007b<setBluetoothName> bVar3, b.C0007b<setLatitude> bVar4, b.C0007b<notifyCharacteristicValue> bVar5) {
            this.setMin = bVar;
            this.getMax = bVar2;
            this.length = bVar3;
            this.setMax = bVar4;
            this.getMin = bVar5;
        }

        public static GestureListener setMin(b.C0007b<Context> bVar, b.C0007b<setVideoCurTimeStamp.setMin> bVar2, b.C0007b<setBluetoothName> bVar3, b.C0007b<setLatitude> bVar4, b.C0007b<notifyCharacteristicValue> bVar5) {
            return new GestureListener(bVar, bVar2, bVar3, bVar4, bVar5);
        }

        public final /* synthetic */ Object get() {
            return new setOnTapListener(this.setMin.get(), this.getMax.get(), this.length.get(), this.setMax.get(), this.getMin.get());
        }
    }

    public static SightCameraViewImpl getMax(b.C0007b<Context> bVar, b.C0007b<enableEventbus.setMax> bVar2, b.C0007b<Beacon.Builder> bVar3, b.C0007b<getLatitude> bVar4) {
        return new SightCameraViewImpl(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new SightCameraView.BufferType(this.getMax.get(), this.setMin.get(), this.length.get(), this.setMax.get());
    }
}
