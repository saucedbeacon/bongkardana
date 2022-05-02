package id.dana.lib.gcontainer.app.bridge.downloadfile;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.webkit.URLUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.Intrinsics;
import o.NotSendableException;
import o.RedDotDrawable;
import o.TitleBarRightButtonView;
import o.executeSerial;
import o.getAppenderManager;
import o.getSecureSignatureComp;
import o.recordMonitorOfSndMsg;
import o.showDateDialog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J*\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nJ\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0002J*\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0002J0\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001fH\u0002¨\u0006!"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/downloadfile/DownloadUtil;", "", "()V", "createTemporaryFile", "Lio/reactivex/Observable;", "Ljava/io/File;", "responseBodyResponse", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "fullFilePath", "", "decodeResponse", "Lio/reactivex/ObservableSource;", "inputStream", "Ljava/io/InputStream;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "downloadFile", "url", "fileExtension", "downloadFileFromUri", "path", "downloadImage", "fileDownloader", "Lid/dana/lib/gcontainer/app/bridge/downloadfile/network/FileDownloader;", "downloadPDF", "saveToInternalStorage", "", "bitmap", "Landroid/graphics/Bitmap;", "emitter", "Lio/reactivex/ObservableEmitter;", "ExtensionFileType", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class DownloadUtil {
    @NotNull
    public static final DownloadUtil getMin = new DownloadUtil();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0002 \u0003*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "responseBodyResponse", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<getAppenderManager<NotSendableException>, TitleBarRightButtonView.AnonymousClass4<? extends File>> {
        final /* synthetic */ String getMax;
        final /* synthetic */ Bitmap.CompressFormat setMin;

        length(String str, Bitmap.CompressFormat compressFormat) {
            this.getMax = str;
            this.setMin = compressFormat;
        }

        public final /* synthetic */ Object apply(Object obj) {
            getAppenderManager getappendermanager = (getAppenderManager) obj;
            Intrinsics.checkNotNullParameter(getappendermanager, "responseBodyResponse");
            DownloadUtil downloadUtil = DownloadUtil.getMin;
            NotSendableException notSendableException = (NotSendableException) getappendermanager.setMin;
            return DownloadUtil.setMin(notSendableException != null ? notSendableException.getMax().setMin() : null, this.getMax, this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0002 \u0003*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "responseBodyResponse", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<getAppenderManager<NotSendableException>, TitleBarRightButtonView.AnonymousClass4<? extends File>> {
        final /* synthetic */ String setMin;

        setMax(String str) {
            this.setMin = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            getAppenderManager getappendermanager = (getAppenderManager) obj;
            Intrinsics.checkNotNullParameter(getappendermanager, "responseBodyResponse");
            DownloadUtil downloadUtil = DownloadUtil.getMin;
            return DownloadUtil.length(getappendermanager, this.setMin);
        }
    }

    private DownloadUtil() {
    }

    @Nullable
    public static TitleBarRightButtonView.AnonymousClass1<File> getMax(@NotNull String str, @NotNull String str2, @NotNull String str3) throws MalformedURLException {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "fullFilePath");
        Intrinsics.checkNotNullParameter(str3, "fileExtension");
        if (URLUtil.isValidUrl(str)) {
            showDateDialog showdatedialog = new showDateDialog(str);
            int hashCode = str3.hashCode();
            if (hashCode != 1475827) {
                if (hashCode != 1481220) {
                    if (hashCode == 1481531 && str3.equals(".png")) {
                        return getMax(showdatedialog, str2, Bitmap.CompressFormat.PNG);
                    }
                } else if (str3.equals(".pdf")) {
                    return getMax(showdatedialog, str2);
                }
            } else if (str3.equals(".jpg")) {
                return getMax(showdatedialog, str2, Bitmap.CompressFormat.JPEG);
            }
            return getMax(showdatedialog, str2);
        }
        TitleBarRightButtonView.AnonymousClass1<File> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMin(str));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …           null\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Ljava/io/File;", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<File> {
        final /* synthetic */ Bitmap.CompressFormat getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ InputStream setMin;

        getMax(InputStream inputStream, String str, Bitmap.CompressFormat compressFormat) {
            this.setMin = inputStream;
            this.getMin = str;
            this.getMax = compressFormat;
        }

        public final void subscribe(@NotNull TitleBarRightButtonView.AnonymousClass2<File> r4) {
            Intrinsics.checkNotNullParameter(r4, "emitter");
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(this.setMin);
                DownloadUtil downloadUtil = DownloadUtil.getMin;
                Intrinsics.checkNotNullExpressionValue(decodeStream, "bitmap");
                DownloadUtil.getMin(decodeStream, this.getMin, this.getMax, r4);
            } catch (Exception e) {
                r4.onError(e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Ljava/io/File;", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<File> {
        final /* synthetic */ String getMax;
        final /* synthetic */ getAppenderManager setMax;

        setMin(String str, getAppenderManager getappendermanager) {
            this.getMax = str;
            this.setMax = getappendermanager;
        }

        public final void subscribe(@NotNull TitleBarRightButtonView.AnonymousClass2<File> r4) {
            Intrinsics.checkNotNullParameter(r4, "emitter");
            try {
                File file = new File(this.getMax);
                executeSerial max = recordMonitorOfSndMsg.getMax(recordMonitorOfSndMsg.getMax(file));
                Intrinsics.checkNotNullExpressionValue(max, "Okio.buffer(Okio.sink(file))");
                NotSendableException notSendableException = (NotSendableException) this.setMax.setMin;
                max.getMin(notSendableException != null ? notSendableException.getMax() : null);
                max.close();
                r4.onNext(file);
                r4.onComplete();
            } catch (IOException e) {
                r4.onError(e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/downloadfile/DownloadUtil$ExtensionFileType;", "", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionFileType {
        @NotNull
        public static final getMin Companion = getMin.getMin;
        @NotNull
        public static final String JPG = ".jpg";
        @NotNull
        public static final String PDF = ".pdf";
        @NotNull
        public static final String PNG = ".png";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/downloadfile/DownloadUtil$ExtensionFileType$Companion;", "", "()V", "JPG", "", "PDF", "PNG", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            static final /* synthetic */ getMin getMin = new getMin();

            private getMin() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMin<V> implements Callable<File> {
        final /* synthetic */ String length;

        getMin(String str) {
            this.length = str;
        }

        public final /* synthetic */ Object call() {
            File file = new File(this.length);
            if (file.exists()) {
                return file;
            }
            return null;
        }
    }

    private static TitleBarRightButtonView.AnonymousClass1<File> getMax(showDateDialog showdatedialog, String str, Bitmap.CompressFormat compressFormat) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap;
        TitleBarRightButtonView.AnonymousClass1<R> subscribeOn;
        TitleBarRightButtonView.AnonymousClass1<getAppenderManager<NotSendableException>> min = showdatedialog.getMax.setMin();
        if (min == null || (flatMap = min.flatMap(new length(str, compressFormat))) == null || (subscribeOn = flatMap.subscribeOn(getSecureSignatureComp.setMin())) == null) {
            return null;
        }
        return subscribeOn.observeOn(getSecureSignatureComp.setMin());
    }

    private static TitleBarRightButtonView.AnonymousClass1<File> getMax(showDateDialog showdatedialog, String str) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap;
        TitleBarRightButtonView.AnonymousClass1<R> subscribeOn;
        TitleBarRightButtonView.AnonymousClass1<getAppenderManager<NotSendableException>> min = showdatedialog.getMax.setMin();
        if (min == null || (flatMap = min.flatMap(new setMax(str))) == null || (subscribeOn = flatMap.subscribeOn(getSecureSignatureComp.setMin())) == null) {
            return null;
        }
        return subscribeOn.observeOn(getSecureSignatureComp.setMin());
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass4 setMin(InputStream inputStream, String str, Bitmap.CompressFormat compressFormat) {
        TitleBarRightButtonView.AnonymousClass1 create = TitleBarRightButtonView.AnonymousClass1.create(new getMax(inputStream, str, compressFormat));
        Intrinsics.checkNotNullExpressionValue(create, "Observable.create { emit…)\n            }\n        }");
        return create;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 length(getAppenderManager getappendermanager, String str) {
        TitleBarRightButtonView.AnonymousClass1 create = TitleBarRightButtonView.AnonymousClass1.create(new setMin(str, getappendermanager));
        Intrinsics.checkNotNullExpressionValue(create, "Observable.create { emit…)\n            }\n        }");
        return create;
    }

    public static final /* synthetic */ void getMin(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, TitleBarRightButtonView.AnonymousClass2 r6) {
        try {
            File file = new File(str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            r6.onNext(file);
        } catch (IOException e) {
            r6.onError(e);
        }
    }
}
