package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class IEmbedPerformanceReporter extends setRepeatCount<onEmbedViewVisibilityChanged> implements handleCollectedApi {
    private final getPerformanceTracker deviceInformationProvider;

    @Inject
    public IEmbedPerformanceReporter(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, getPerformanceTracker getperformancetracker) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        this.deviceInformationProvider = getperformancetracker;
    }

    public Class<onEmbedViewVisibilityChanged> getFacadeClass() {
        return onEmbedViewVisibilityChanged.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<ResourceResponseInfo> reportDevice(String str, String str2, String str3, String str4) {
        IEmbedViewManager iEmbedViewManager = new IEmbedViewManager();
        iEmbedViewManager.setDeliveryToken(this.deviceInformationProvider.getDeviceUtdId());
        iEmbedViewManager.setImei(str3);
        iEmbedViewManager.setImsi(str2);
        iEmbedViewManager.setConnectType(str4);
        iEmbedViewManager.setThirdChannelDeviceToken(str);
        return wrapper(new IEmbedView(iEmbedViewManager));
    }

    public TitleBarRightButtonView.AnonymousClass1<onSurfaceAvailable> bindApp(String str) {
        onWebViewPause onwebviewpause = new onWebViewPause();
        onwebviewpause.setDeliveryToken(this.deviceInformationProvider.getDeviceUtdId());
        onwebviewpause.setUserId(str);
        return TitleBarRightButtonView.AnonymousClass1.just(((onEmbedViewVisibilityChanged) getCastedFacade()).bindApp(onwebviewpause));
    }

    public TitleBarRightButtonView.AnonymousClass1<ReceivedHeaderPoint> unBindApp(String str) {
        onSurfaceSizeChanged onsurfacesizechanged = new onSurfaceSizeChanged();
        onsurfacesizechanged.setDeliveryToken(this.deviceInformationProvider.getDeviceUtdId());
        onsurfacesizechanged.setUserId(str);
        return TitleBarRightButtonView.AnonymousClass1.just(((onEmbedViewVisibilityChanged) getCastedFacade()).unBindApp(onsurfacesizechanged));
    }
}
