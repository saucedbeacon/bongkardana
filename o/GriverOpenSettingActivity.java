package o;

import android.content.Context;
import o.CompassSensorService;
import o.b;

public final class GriverOpenSettingActivity implements getAdapterPosition<sendSensorResult> {
    private final b.C0007b<onLocationResult> IsOverlapping;
    private final b.C0007b<onPageError> equals;
    private final b.C0007b<CompassSensorService.getMin> getMax;
    private final b.C0007b<setPageCacheCapacity> getMin;
    private final b.C0007b<calculateDistance> isInside;
    private final b.C0007b<AccelerometerForH5SensorService> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<fromScanData> setMin;
    private final b.C0007b<Boolean> toFloatRange;
    private final b.C0007b<setWebMessageCallback> toIntRange;
    private final b.C0007b<APDownloadListener> toString;
    private final b.C0007b<APHitTestResult> values;

    private GriverOpenSettingActivity(b.C0007b<Context> bVar, b.C0007b<CompassSensorService.getMin> bVar2, b.C0007b<fromScanData> bVar3, b.C0007b<setPageCacheCapacity> bVar4, b.C0007b<AccelerometerForH5SensorService> bVar5, b.C0007b<onLocationResult> bVar6, b.C0007b<setWebMessageCallback> bVar7, b.C0007b<Boolean> bVar8, b.C0007b<calculateDistance> bVar9, b.C0007b<onPageError> bVar10, b.C0007b<APDownloadListener> bVar11, b.C0007b<APHitTestResult> bVar12) {
        this.setMax = bVar;
        this.getMax = bVar2;
        this.setMin = bVar3;
        this.getMin = bVar4;
        this.length = bVar5;
        this.IsOverlapping = bVar6;
        this.toIntRange = bVar7;
        this.toFloatRange = bVar8;
        this.isInside = bVar9;
        this.equals = bVar10;
        this.toString = bVar11;
        this.values = bVar12;
    }

    public static GriverOpenSettingActivity getMax(b.C0007b<Context> bVar, b.C0007b<CompassSensorService.getMin> bVar2, b.C0007b<fromScanData> bVar3, b.C0007b<setPageCacheCapacity> bVar4, b.C0007b<AccelerometerForH5SensorService> bVar5, b.C0007b<onLocationResult> bVar6, b.C0007b<setWebMessageCallback> bVar7, b.C0007b<Boolean> bVar8, b.C0007b<calculateDistance> bVar9, b.C0007b<onPageError> bVar10, b.C0007b<APDownloadListener> bVar11, b.C0007b<APHitTestResult> bVar12) {
        return new GriverOpenSettingActivity(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12);
    }

    public final /* synthetic */ Object get() {
        return new sendSensorResult(this.setMax.get(), this.getMax.get(), this.setMin.get(), this.getMin.get(), this.length.get(), this.IsOverlapping.get(), this.toIntRange.get(), this.toFloatRange.get().booleanValue(), this.isInside.get(), this.equals.get(), this.toString.get(), this.values.get());
    }
}
