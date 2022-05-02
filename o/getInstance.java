package o;

import kotlin.jvm.functions.Function1;

final class getInstance implements Function1 {
    private final getDataFieldCount getMax;
    private final SystemForegroundService getMin;
    private final GridAdapter setMax;

    public getInstance(SystemForegroundService systemForegroundService, GridAdapter gridAdapter, getDataFieldCount getdatafieldcount) {
        this.getMin = systemForegroundService;
        this.setMax = gridAdapter;
        this.getMax = getdatafieldcount;
    }

    public final Object invoke(Object obj) {
        return SystemForegroundService.getMax(this.getMin, this.setMax, this.getMax, (Boolean) obj);
    }
}
