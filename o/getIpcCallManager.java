package o;

public class getIpcCallManager extends setSpeed<UsePermission, resourceTypeMonitor> {
    /* access modifiers changed from: protected */
    public resourceTypeMonitor map(UsePermission usePermission) {
        resourceTypeMonitor resourcetypemonitor = new resourceTypeMonitor();
        if (usePermission != null && !usePermission.getListOfCategorizedPromo().isEmpty()) {
            AutoCallback autoCallback = usePermission.getListOfCategorizedPromo().get(0);
            resourcetypemonitor.setHasMore(autoCallback.isHasMore());
            resourcetypemonitor.setPromoList(setLocalCallManager.toPromos(autoCallback.getListOfPromo()));
            resourcetypemonitor.setId(autoCallback.getCategoryId());
        }
        return resourcetypemonitor;
    }
}
