package o;

import android.content.Context;
import android.webkit.URLUtil;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.WindowBridgeExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/downloadfile/base/AbstractDownloadFileManager;", "", "context", "Landroid/content/Context;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "listener", "Lid/dana/lib/gcontainer/app/bridge/downloadfile/IDownloadListener;", "(Landroid/content/Context;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;Lid/dana/lib/gcontainer/app/bridge/downloadfile/IDownloadListener;)V", "onDownloadSuccess", "", "imageFile", "Ljava/io/File;", "mimeType", "", "processDownload", "fileUrl", "fileName", "fileFormat", "processEvent", "sendGeneralError", "Lcom/alibaba/fastjson/JSONObject;", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public abstract class datePicker {
    @NotNull
    public static final setMin getMax = new setMin((byte) 0);
    /* access modifiers changed from: private */
    public static final String getMin;
    /* access modifiers changed from: private */
    public final BridgeCallback length;
    private final Context setMax;
    private final WindowBridgeExtension.AnonymousClass2 setMin;

    public abstract void setMin(@NotNull File file, @NotNull String str);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0015\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/RxJavaExtKt$subscribeWithAutoDispose$1", "Lio/reactivex/observers/DisposableObserver;", "onComplete", "", "onError", "e", "", "onNext", "t", "(Ljava/lang/Object;)V", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends setGlobalUserData<File> {
        final /* synthetic */ String getMin;
        final /* synthetic */ datePicker setMin;

        public getMax(datePicker datepicker, String str) {
            this.setMin = datepicker;
            this.getMin = str;
        }

        public final void onComplete() {
            dispose();
        }

        public final void onNext(File file) {
            File file2 = file;
            datePicker datepicker = this.setMin;
            Intrinsics.checkNotNullExpressionValue(file2, "it");
            datepicker.setMin(file2, this.getMin);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            LocationBridgeExtension.setMin(datePicker.getMin, "processDownload", th);
            this.setMin.length.sendJSONResponse(datePicker.getMin());
            dispose();
        }
    }

    public datePicker(@NotNull Context context, @NotNull BridgeCallback bridgeCallback, @NotNull WindowBridgeExtension.AnonymousClass2 r4) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(r4, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.setMax = context;
        this.length = bridgeCallback;
        this.setMin = r4;
    }

    public final void setMin(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "fileUrl");
        Intrinsics.checkNotNullParameter(str2, "fileName");
        Intrinsics.checkNotNullParameter(str3, "fileFormat");
        Intrinsics.checkNotNullParameter(str4, "mimeType");
        if (setLeftSelectedIndex.length() <= 100) {
            getMin();
        } else {
            length(str, str2, str3, str4);
        }
    }

    private final void length(String str, String str2, String str3, String str4) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1235384473, oncanceled);
            onCancelLoad.getMin(-1235384473, oncanceled);
        }
        File min = setLeftSelectedIndex.setMin(this.setMax);
        if (!min.exists()) {
            min.mkdirs();
        }
        try {
            Context context = this.setMax;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str3);
            File min2 = setLeftSelectedIndex.setMin(context, sb.toString());
            if (!URLUtil.isValidUrl(str)) {
                setMin(new File(str), str4);
                return;
            }
            WindowBridgeExtension.AnonymousClass2 r7 = this.setMin;
            Intrinsics.checkNotNullExpressionValue(min2, "imageFile");
            String path = min2.getPath();
            if (path != null) {
                TitleBarRightButtonView.AnonymousClass1<File> download = r7.download(str, path, str4);
                Intrinsics.checkNotNullExpressionValue(download, "listener.download(\n     …n, mimeType\n            )");
                download.subscribe((GriverProgressBar<? super File>) new getMax(this, str4));
            }
        } catch (IllegalStateException e) {
            LocationBridgeExtension.setMin(getMin, "processDownload", (Throwable) e);
            this.length.sendJSONResponse(getMin());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/downloadfile/base/AbstractDownloadFileManager$Companion;", "", "()V", "MINIMUM_STORAGE_AVAILABLE", "", "TAG", "", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    static {
        String simpleName = datePicker.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "AbstractDownloadFileManager::class.java.simpleName");
        getMin = simpleName;
    }

    /* access modifiers changed from: private */
    public static JSONObject getMin() {
        JSONObject jSONObject = new JSONObject();
        Map map = jSONObject;
        map.put("success", Boolean.FALSE);
        map.put("error", "001");
        return jSONObject;
    }
}
