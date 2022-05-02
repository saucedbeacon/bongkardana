package o;

import android.content.Context;
import com.iap.ac.config.lite.ConfigCenter;
import id.dana.data.errorconfig.ErrorConfigKey;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import org.json.JSONObject;

@Singleton
public class getPageLaunchParams implements AppConfigModel {
    private final Context context;
    private boolean downloading;
    /* access modifiers changed from: private */
    public resetRenderToTop errorConfigAmcsResult;
    /* access modifiers changed from: private */
    public final setPages errorConfigPreferences;
    private final PluginInstallCallback serializer;

    @Inject
    getPageLaunchParams(Context context2, PluginInstallCallback pluginInstallCallback, AppPausePoint appPausePoint, setPages setpages) {
        this.errorConfigPreferences = setpages;
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(context2, "prod");
        }
        this.serializer = pluginInstallCallback;
        this.context = context2;
    }

    private void downloadConfig(String str, int i) {
        if (getLeftSelectedOption.getMax(this.context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            this.downloading = true;
            try {
                new registerReceiever(str).downloadFile().flatMap(new getUseDynamicPlugins(this, i)).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).doFinally(new PluginParamModel(this)).subscribe(new atlasEncryptString<File>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        ((File) obj).getAbsolutePath();
                    }

                    public final void onError(Throwable th) {
                        th.toString();
                    }

                    public final void onComplete() {
                        getPageLaunchParams.this.errorConfigPreferences.saveErrorConfigVersion(getPageLaunchParams.this.errorConfigAmcsResult.getVersion());
                    }
                });
            } catch (MalformedURLException unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$downloadConfig$1(int i, getAppenderManager getappendermanager) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.create(new setUseDynamicPlugins(this, getappendermanager, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadConfig$0(getAppenderManager getappendermanager, int i, TitleBarRightButtonView.AnonymousClass2 r3) throws Exception {
        try {
            r3.onNext(processDownloadEmitter(getappendermanager, i));
            r3.onComplete();
        } catch (IOException e) {
            r3.onError(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadConfig$2() throws Exception {
        this.downloading = false;
    }

    private File processDownloadEmitter(getAppenderManager<NotSendableException> getappendermanager, int i) throws IOException {
        File file = new File(generateFileNameWithCustomPath("/".concat(String.valueOf(ErrorConfigKey.FILE_NAME_PREFIX.concat(String.valueOf(i))))));
        executeSerial max = recordMonitorOfSndMsg.getMax(recordMonitorOfSndMsg.getMax(file));
        if (getappendermanager.setMin != null) {
            max.getMin(((NotSendableException) getappendermanager.setMin).getMax());
        }
        max.close();
        return file;
    }

    private String generateFileNameWithCustomPath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.context.getFilesDir());
        sb.append(File.separator);
        sb.append(str);
        sb.append(".json");
        return sb.toString();
    }

    public String getErrorMessageByKey(String str, resetRenderToTop resetrendertotop) {
        throw new UnsupportedOperationException();
    }

    public resetRenderToTop getErrorConfigAmcs() {
        JSONObject jSONConfig = ConfigCenter.getInstance().getJSONConfig("offline_error_config");
        if (jSONConfig == null || jSONConfig.length() == 0) {
            this.errorConfigAmcsResult = null;
        } else {
            this.errorConfigAmcsResult = (resetRenderToTop) this.serializer.deserialize(jSONConfig.toString(), resetRenderToTop.class);
            int errorConfigVersion = this.errorConfigPreferences.getErrorConfigVersion();
            resetRenderToTop resetrendertotop = this.errorConfigAmcsResult;
            if (resetrendertotop != null && errorConfigVersion < resetrendertotop.getVersion() && !this.downloading) {
                downloadConfig(this.errorConfigAmcsResult.getUrl(), this.errorConfigAmcsResult.getVersion());
            }
        }
        return this.errorConfigAmcsResult;
    }
}
