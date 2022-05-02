package o;

import o.AppPreDownloadManager;
import o.NetworkUtils;
import o.ViewPager2;
import o.b;
import o.isUserInputEnabled;

public final class onPageSelected implements getAdapterPosition<onPageScrollStateChanged> {
    private final b.C0007b<uploadMonitorEvent> FastBitmap$CoordinateSystem;
    private final b.C0007b<AppPreDownloadManager.AnonymousClass2> IsOverlapping;
    private final b.C0007b<AppPreDownloadManager.AnonymousClass1> equals;
    private final b.C0007b<isUserInputEnabled.length> getMax;
    private final b.C0007b<NetworkUtils.NetworkDetailCallback> getMin;
    private final b.C0007b<isAppIdInPreDownloadConfig> isInside;
    private final b.C0007b<syncJsApi> length;
    private final b.C0007b<getDelay> setMax;
    private final b.C0007b<appConfigIsEnable> setMin;
    private final b.C0007b<setRetryCount> toFloatRange;
    private final b.C0007b<getAppPreDownloadCacheManager> toIntRange;
    private final b.C0007b<copyBackForwardList> values;

    private onPageSelected(b.C0007b<isUserInputEnabled.length> bVar, b.C0007b<NetworkUtils.NetworkDetailCallback> bVar2, b.C0007b<getDelay> bVar3, b.C0007b<appConfigIsEnable> bVar4, b.C0007b<syncJsApi> bVar5, b.C0007b<setRetryCount> bVar6, b.C0007b<getAppPreDownloadCacheManager> bVar7, b.C0007b<AppPreDownloadManager.AnonymousClass2> bVar8, b.C0007b<AppPreDownloadManager.AnonymousClass1> bVar9, b.C0007b<isAppIdInPreDownloadConfig> bVar10, b.C0007b<uploadMonitorEvent> bVar11, b.C0007b<copyBackForwardList> bVar12) {
        this.getMax = bVar;
        this.getMin = bVar2;
        this.setMax = bVar3;
        this.setMin = bVar4;
        this.length = bVar5;
        this.toFloatRange = bVar6;
        this.toIntRange = bVar7;
        this.IsOverlapping = bVar8;
        this.equals = bVar9;
        this.isInside = bVar10;
        this.FastBitmap$CoordinateSystem = bVar11;
        this.values = bVar12;
    }

    public static onPageSelected setMin(b.C0007b<isUserInputEnabled.length> bVar, b.C0007b<NetworkUtils.NetworkDetailCallback> bVar2, b.C0007b<getDelay> bVar3, b.C0007b<appConfigIsEnable> bVar4, b.C0007b<syncJsApi> bVar5, b.C0007b<setRetryCount> bVar6, b.C0007b<getAppPreDownloadCacheManager> bVar7, b.C0007b<AppPreDownloadManager.AnonymousClass2> bVar8, b.C0007b<AppPreDownloadManager.AnonymousClass1> bVar9, b.C0007b<isAppIdInPreDownloadConfig> bVar10, b.C0007b<uploadMonitorEvent> bVar11, b.C0007b<copyBackForwardList> bVar12) {
        return new onPageSelected(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12);
    }

    public final /* synthetic */ Object get() {
        onPageScrollStateChanged onpagescrollstatechanged = new onPageScrollStateChanged(this.getMax.get(), this.getMin.get(), this.setMax.get(), this.setMin.get());
        ViewPager2.Orientation.setMin(onpagescrollstatechanged, this.length.get(), this.toFloatRange.get(), this.toIntRange.get());
        ViewPager2.Orientation.getMax(onpagescrollstatechanged, this.IsOverlapping.get(), this.equals.get(), this.isInside.get(), this.FastBitmap$CoordinateSystem.get(), this.values.get());
        return onpagescrollstatechanged;
    }
}
