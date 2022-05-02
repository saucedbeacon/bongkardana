package com.alibaba.griver.api.h5.file;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverChooseFileExtension extends GriverExtension {
    boolean onShowFileChooser(Page page, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

    void openFileChooser(Page page, ValueCallback<Uri> valueCallback, String str, String str2);
}
