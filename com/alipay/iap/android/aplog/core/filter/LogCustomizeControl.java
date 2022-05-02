package com.alipay.iap.android.aplog.core.filter;

public interface LogCustomizeControl {
    UploadResultInfo isLogUpload(LogUploadInfo logUploadInfo);

    boolean isLogWrite(LogWriteInfo logWriteInfo);

    boolean shouldQueryStrategy();
}
