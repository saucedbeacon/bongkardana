package com.alibaba.ariver.resource.template;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.network.RVTransportService;
import com.alibaba.ariver.kernel.common.network.download.RVDownloadCallback;
import com.alibaba.ariver.kernel.common.network.download.RVDownloadRequest;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.ariver.resource.api.models.TemplateExtModel;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class a implements Future<TemplateExtModel> {

    /* renamed from: a  reason: collision with root package name */
    private AppModel f10212a;
    private TemplateConfigModel b;
    /* access modifiers changed from: private */
    public TemplateExtModel c;

    public boolean cancel(boolean z) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public a(AppModel appModel) {
        this.f10212a = appModel;
        this.b = appModel.getAppInfoModel().getTemplateConfig();
    }

    private TemplateExtModel b() {
        if (!this.b.isTemplateValid()) {
            return null;
        }
        if (!TextUtils.isEmpty(this.b.getExtUrl())) {
            File extDirectory = RVResourceUtils.getExtDirectory(this.f10212a, true);
            if (extDirectory == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder("template_ext_");
            sb.append(FileUtils.getMD5(this.b.getExtUrl()));
            String obj = sb.toString();
            final String combinePath = FileUtils.combinePath(extDirectory.getAbsolutePath(), obj);
            if (FileUtils.exists(combinePath)) {
                String read = IOUtils.read(combinePath);
                if (read == null) {
                    FileUtils.delete(combinePath);
                } else {
                    this.c = (TemplateExtModel) JSONUtils.parseObject(read.getBytes(), TemplateExtModel.class);
                    StringBuilder sb2 = new StringBuilder("got downloaded template from ");
                    sb2.append(combinePath);
                    sb2.append(", value: ");
                    sb2.append(this.c);
                    RVLogger.d("AriverRes:TemplateExtLoader", sb2.toString());
                    TemplateExtModel templateExtModel = this.c;
                    if (templateExtModel != null) {
                        return templateExtModel;
                    }
                }
            }
            RVDownloadRequest rVDownloadRequest = new RVDownloadRequest();
            rVDownloadRequest.setDownloadDir(extDirectory.getAbsolutePath());
            rVDownloadRequest.setDownloadFileName(obj);
            rVDownloadRequest.setDownloadUrl(this.b.getExtUrl());
            rVDownloadRequest.setIsUrgentResource(true);
            RVLogger.d("AriverRes:TemplateExtLoader", "begin download template config to ".concat(String.valueOf(combinePath)));
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            ((RVTransportService) RVProxy.get(RVTransportService.class)).addDownload(rVDownloadRequest, new RVDownloadCallback() {
                public void onPrepare(String str) {
                }

                public void onProgress(String str, int i) {
                }

                public void onCancel(String str) {
                    RVLogger.w("AriverRes:TemplateExtLoader", "download onCancel");
                    FileUtils.delete(combinePath);
                    countDownLatch.countDown();
                }

                public void onFinish(@Nullable String str) {
                    int length = str != null ? str.length() : 0;
                    int max = dispatchOnCancelled.setMax(length);
                    if (length != max) {
                        onCanceled oncanceled = new onCanceled(length, max, 1);
                        onCancelLoad.setMax(-220457559, oncanceled);
                        onCancelLoad.getMin(-220457559, oncanceled);
                    }
                    String read = IOUtils.read(combinePath);
                    if (read == null) {
                        onFailed(str, 0, "extObject read exception!");
                        return;
                    }
                    TemplateExtModel unused = a.this.c = (TemplateExtModel) JSONUtils.parseObject(read.getBytes(), TemplateExtModel.class);
                    if (a.this.c == null) {
                        onFailed(str, 0, "extObject parse fail!");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("download onFinish extObject: ");
                    sb.append(a.this.c);
                    RVLogger.d("AriverRes:TemplateExtLoader", sb.toString());
                    countDownLatch.countDown();
                }

                public void onFailed(String str, int i, String str2) {
                    StringBuilder sb = new StringBuilder("download onFailed: ");
                    sb.append(i);
                    sb.append(" ");
                    sb.append(str2);
                    RVLogger.e("AriverRes:TemplateExtLoader", sb.toString());
                    FileUtils.delete(combinePath);
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                RVLogger.e("AriverRes:TemplateExtLoader", "await exception!", e);
                return null;
            }
        } else {
            this.c = this.b.getExtModel();
        }
        return this.c;
    }

    public boolean isDone() {
        return this.c != null;
    }

    /* renamed from: a */
    public TemplateExtModel get() {
        return b();
    }

    /* renamed from: a */
    public TemplateExtModel get(long j, @NonNull TimeUnit timeUnit) {
        return b();
    }
}
