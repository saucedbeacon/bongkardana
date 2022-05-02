package o;

import android.content.Context;
import o.TitleBarRightButtonView;

public final class createEmbedView extends setRepeatCount<onDetachedToWebView> implements checkDslErrorAndExit {
    public createEmbedView(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public final Class<onDetachedToWebView> getFacadeClass() {
        return onDetachedToWebView.class;
    }

    public final TitleBarRightButtonView.AnonymousClass1<getSnapshot> fetchInbox(int i, String str, String str2) {
        onParamChanged onparamchanged = new onParamChanged();
        onparamchanged.envInfo = generateMobileEnvInfo();
        onparamchanged.setPageSize(i);
        onparamchanged.setMaxId(str);
        onparamchanged.setMinId(str2);
        return wrapper(new IEmbedCallback(onparamchanged));
    }

    public final TitleBarRightButtonView.AnonymousClass1<ResourceResponsePoint> hasNew() {
        onAttachedToWebView onattachedtowebview = new onAttachedToWebView();
        onattachedtowebview.envInfo = generateMobileEnvInfo();
        return wrapper(new onWebViewResume(onattachedtowebview));
    }

    public final TitleBarRightButtonView.AnonymousClass1<CreateWorkerPoint> markAsRead(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(628100888, oncanceled);
            onCancelLoad.getMin(628100888, oncanceled);
        }
        onSurfaceDestroyed onsurfacedestroyed = new onSurfaceDestroyed();
        onsurfacedestroyed.envInfo = generateMobileEnvInfo();
        onsurfacedestroyed.setId(str);
        return wrapper(new onReceivedRender(onsurfacedestroyed));
    }
}
