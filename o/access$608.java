package o;

import o.b;

public final class access$608 implements getAdapterPosition<AccelerometerForH5SensorService> {
    private final b.C0007b<Embedded> getMin;
    private final b.C0007b<setDomStorageEnabled> length;

    private access$608(b.C0007b<setDomStorageEnabled> bVar, b.C0007b<Embedded> bVar2) {
        this.length = bVar;
        this.getMin = bVar2;
    }

    public static access$608 getMin(b.C0007b<setDomStorageEnabled> bVar, b.C0007b<Embedded> bVar2) {
        return new access$608(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new AccelerometerForH5SensorService(this.length.get(), this.getMin.get());
    }
}
