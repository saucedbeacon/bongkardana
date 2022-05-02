package o;

import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.UtdidDeviceIdProvider;
import o.checkAlloc;
import o.generateKey;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/downloadfile/network/FileDownloader;", "", "url", "", "(Ljava/lang/String;)V", "api", "Lid/dana/lib/gcontainer/app/bridge/downloadfile/network/NetworkApi;", "downloadFile", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class showDateDialog {
    public final showTimeDialog getMax;

    public showDateDialog(@Nullable String str) {
        showTimeDialog parsedate = new parseDate();
        this.getMax = parsedate;
        parseDate parsedate2 = (parseDate) parsedate;
        URL url = new URL(str);
        StringBuilder sb = new StringBuilder();
        sb.append(url.getProtocol());
        sb.append("://");
        sb.append(url.getHost());
        sb.append("/");
        String path = url.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "urlObject.path");
        parsedate2.setMax = path;
        UtdidDeviceIdProvider.getMin max = new UtdidDeviceIdProvider.getMin().setMax(sb.toString());
        max.setMin = (checkAlloc.getMin) ProcessInfoImpl.getMin((checkAlloc.getMin) ProcessInfoImpl.getMin(new generateKey(new generateKey.getMax()), "client == null"), "factory == null");
        max.getMax.add(ProcessInfoImpl.getMin(new getLogCategory(), "factory == null"));
        parsedate2.setMin = (DatePickerBridgeExtension.AnonymousClass1) max.getMax().setMin(DatePickerBridgeExtension.AnonymousClass1.class);
    }
}
