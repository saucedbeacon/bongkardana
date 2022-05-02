package o;

import id.dana.di.modules.PreprocessingAndOcrModule;
import id.dana.di.modules.UploadSnapReceiptModule;
import id.dana.ocr.PreprocessingAndOcrContract;
import id.dana.ocr.PreprocessingAndOcrPresenter;
import id.dana.ocr.UploadSnapReceiptContract;
import id.dana.ocr.UploadSnapReceiptPresenter;
import id.dana.ocr.UploadSnapReceiptPresenter_Factory;
import id.dana.ocr.views.SnapReceiptService;
import id.dana.ocr.views.SnapReceiptService_MembersInjector;
import o.GriverMonitorAnalyticsConfigManager;
import o.MonitorMap;
import o.PrepareException;
import o.b;

public final class interceptAfter implements startObject {
    private b.C0007b<GriverMonitorAnalyticsConfigManager.AnonymousClass1> IsOverlapping;
    private b.C0007b<UploadSnapReceiptPresenter> equals;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<UploadSnapReceiptContract.View> getMin;
    private b.C0007b<UploadSnapReceiptContract.Presenter> isInside;
    private final PreprocessingAndOcrModule length;
    private b.C0007b<GriverRVMonitorImpl> setMax;
    private b.C0007b<exceedThreshold> setMin;
    private b.C0007b<MonitorManager> toFloatRange;
    private b.C0007b<getThreshold> toIntRange;

    public /* synthetic */ interceptAfter(PreprocessingAndOcrModule preprocessingAndOcrModule, UploadSnapReceiptModule uploadSnapReceiptModule, PrepareException.AnonymousClass1 r3, byte b) {
        this(preprocessingAndOcrModule, uploadSnapReceiptModule, r3);
    }

    private interceptAfter(PreprocessingAndOcrModule preprocessingAndOcrModule, UploadSnapReceiptModule uploadSnapReceiptModule, PrepareException.AnonymousClass1 r6) {
        this.length = preprocessingAndOcrModule;
        this.getMax = r6;
        this.getMin = isScrap.getMin(GriverH5UrlInterceptedProxy.getMin(uploadSnapReceiptModule));
        getMax getmax = new getMax(r6);
        this.setMax = getmax;
        this.setMin = Builder.create(getmax);
        this.toIntRange = MonitorMap.Builder.create(this.setMax);
        this.IsOverlapping = shouldNotMonitor.create(this.setMax);
        jsapiEnabled create = jsapiEnabled.create(this.setMax);
        this.toFloatRange = create;
        UploadSnapReceiptPresenter_Factory length2 = UploadSnapReceiptPresenter_Factory.length(this.getMin, this.setMin, this.toIntRange, this.IsOverlapping, create);
        this.equals = length2;
        this.isInside = isScrap.getMin(GriverOptionMenuClickPoint.setMax(uploadSnapReceiptModule, length2));
    }

    public static final class setMin {
        public PrepareException.AnonymousClass1 getMax;
        public PreprocessingAndOcrModule length;
        public UploadSnapReceiptModule setMin;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class getMax implements b.C0007b<GriverRVMonitorImpl> {
        private final PrepareException.AnonymousClass1 setMax;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverRVMonitorImpl onShuffleModeChangedRemoved = this.setMax.onShuffleModeChangedRemoved();
            if (onShuffleModeChangedRemoved != null) {
                return onShuffleModeChangedRemoved;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMax(SnapReceiptService snapReceiptService) {
        PreprocessingAndOcrModule preprocessingAndOcrModule = this.length;
        PreprocessingAndOcrContract.View max = putDefaultConfig.setMax(this.length);
        getScheme min = this.getMax.getMin();
        if (min != null) {
            getScheme getscheme = min;
            IRedDotManager max2 = ActivityRequestCodeConstants.getMax(this.length);
            appxLoadFailed length2 = this.getMax.length();
            if (length2 != null) {
                appxLoadFailed appxloadfailed = length2;
                getScheme min2 = this.getMax.getMin();
                if (min2 != null) {
                    getScheme getscheme2 = min2;
                    MetaDataUtils MediaBrowserCompat$ItemReceiver = this.getMax.MediaBrowserCompat$ItemReceiver();
                    if (MediaBrowserCompat$ItemReceiver != null) {
                        MonitorUtils monitorUtils = new MonitorUtils(appxloadfailed, getscheme2, MediaBrowserCompat$ItemReceiver);
                        shouldBeKeptAsChild MediaBrowserCompat$SearchResultReceiver = this.getMax.MediaBrowserCompat$SearchResultReceiver();
                        if (MediaBrowserCompat$SearchResultReceiver != null) {
                            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(MediaBrowserCompat$SearchResultReceiver);
                            shouldBeKeptAsChild MediaBrowserCompat$SearchResultReceiver2 = this.getMax.MediaBrowserCompat$SearchResultReceiver();
                            if (MediaBrowserCompat$SearchResultReceiver2 != null) {
                                SnapReceiptService_MembersInjector.setMin(snapReceiptService, GriverConfigProxy.getMin(preprocessingAndOcrModule, new PreprocessingAndOcrPresenter(max, getscheme, max2, monitorUtils, staggeredGridLayoutManager, new getActionButton(MediaBrowserCompat$SearchResultReceiver2))));
                                SnapReceiptService_MembersInjector.setMax(snapReceiptService, this.isInside.get());
                                getShortName ITrustedWebActivityCallback$Default = this.getMax.ITrustedWebActivityCallback$Default();
                                if (ITrustedWebActivityCallback$Default != null) {
                                    SnapReceiptService_MembersInjector.getMax(snapReceiptService, ITrustedWebActivityCallback$Default);
                                    return;
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
