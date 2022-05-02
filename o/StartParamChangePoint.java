package o;

import java.net.MalformedURLException;
import java.net.URL;
import o.TitleBarRightButtonView;
import o.UtdidDeviceIdProvider;
import o.checkAlloc;
import o.generateKey;

public final class StartParamChangePoint implements SnapshotPoint {
    String pathString = "";
    private ActionSheetPoint retrofitService;

    public final void init(String str) throws MalformedURLException {
        URL url = new URL(str);
        StringBuilder sb = new StringBuilder();
        sb.append(url.getProtocol());
        sb.append("://");
        sb.append(url.getHost());
        sb.append("/");
        this.pathString = url.getPath();
        UtdidDeviceIdProvider.getMin max = new UtdidDeviceIdProvider.getMin().setMax(sb.toString());
        max.setMin = (checkAlloc.getMin) ProcessInfoImpl.getMin((checkAlloc.getMin) ProcessInfoImpl.getMin(new generateKey(new generateKey.getMax()), "client == null"), "factory == null");
        max.getMax.add(ProcessInfoImpl.getMin(new getLogCategory(), "factory == null"));
        this.retrofitService = (ActionSheetPoint) max.getMax().setMin(ActionSheetPoint.class);
    }

    public final TitleBarRightButtonView.AnonymousClass1<getAppenderManager<NotSendableException>> downloadImage() {
        return this.retrofitService.downloadFile(this.pathString);
    }
}
