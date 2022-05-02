package com.alibaba.griver.file.jsapi;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.griver.base.common.utils.AOMPFileTinyAppUtils;
import com.alibaba.griver.base.common.utils.TinyAppFileUtils;
import com.alibaba.griver.image.photo.PhotoContext;

@Keep
public class OpenDocumentBridgeExtension extends SimpleBridgeExtension {
    private static final String TAG = "OpenDocumentBridgeExtension";

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0104  */
    @com.alibaba.ariver.kernel.api.annotation.ThreadType(com.alibaba.ariver.kernel.common.service.executor.ExecutorType.UI)
    @com.alibaba.ariver.kernel.api.annotation.ActionFilter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openDocument(@com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext(required = true) com.alibaba.ariver.engine.api.bridge.model.ApiContext r8, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode(com.alibaba.ariver.app.api.App.class) com.alibaba.ariver.app.api.App r9, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"filePath"}) java.lang.String r10, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"fileType"}) java.lang.String r11, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r12) {
        /*
            r7 = this;
            android.app.Activity r8 = r8.getActivity()
            if (r8 != 0) goto L_0x000c
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r8 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.UNKNOWN_ERROR
            r12.sendBridgeResponse(r8)
            return
        L_0x000c:
            java.lang.String r9 = r7.getFilePath(r10)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            r0 = 4013(0xfad, float:5.623E-42)
            r1 = 1
            r2 = 4012(0xfac, float:5.622E-42)
            r3 = 4011(0xfab, float:5.62E-42)
            r4 = 0
            if (r10 != 0) goto L_0x00d3
            java.lang.String r10 = "../"
            boolean r10 = r9.contains(r10)
            if (r10 == 0) goto L_0x0028
            goto L_0x00d3
        L_0x0028:
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x003b
            java.lang.String r10 = "."
            int r10 = r9.lastIndexOf(r10)
            if (r10 <= 0) goto L_0x003b
            int r10 = r10 + r1
            java.lang.String r11 = r9.substring(r10)
        L_0x003b:
            java.lang.String r10 = "file://"
            java.lang.String r5 = ""
            java.lang.String r9 = r9.replace(r10, r5)
            java.io.File r10 = new java.io.File
            r10.<init>(r9)
            boolean r5 = r10.exists()
            if (r5 != 0) goto L_0x0052
            r0 = 4012(0xfac, float:5.622E-42)
            goto L_0x00d5
        L_0x0052:
            com.alibaba.griver.base.common.utils.OfficeFileType r5 = com.alibaba.griver.base.common.utils.OfficeFileType.Pdf
            boolean r5 = r5.checkType(r11)
            if (r5 == 0) goto L_0x00a4
            android.content.Intent r11 = new android.content.Intent     // Catch:{ Exception -> 0x0088 }
            java.lang.String r0 = "android.intent.action.VIEW"
            r11.<init>(r0)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r0 = "android.intent.category.DEFAULT"
            r11.addCategory(r0)     // Catch:{ Exception -> 0x0088 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r11.addFlags(r0)     // Catch:{ Exception -> 0x0088 }
            r0 = 3
            r11.addFlags(r0)     // Catch:{ Exception -> 0x0088 }
            android.net.Uri r0 = android.net.Uri.fromFile(r10)     // Catch:{ Exception -> 0x0088 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0088 }
            r6 = 24
            if (r5 < r6) goto L_0x007f
            java.lang.String r0 = "com.iap.ac.android.fileprovider"
            android.net.Uri r0 = androidx.core.content.FileProvider.getUriForFile(r8, r0, r10)     // Catch:{ Exception -> 0x0088 }
        L_0x007f:
            java.lang.String r10 = "application/pdf"
            r11.setDataAndType(r0, r10)     // Catch:{ Exception -> 0x0088 }
            r8.startActivity(r11)     // Catch:{ Exception -> 0x0088 }
            goto L_0x00a2
        L_0x0088:
            r10 = move-exception
            java.lang.String r11 = "OpenDocumentBridgeExtension"
            java.lang.String r0 = "open pdf outer failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r11, r0, r10)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.Class<com.alibaba.griver.file.ui.PdfViewerActivity> r11 = com.alibaba.griver.file.ui.PdfViewerActivity.class
            r10.setClass(r8, r11)
            java.lang.String r11 = "filePath"
            r10.putExtra(r11, r9)
            r8.startActivity(r10)
        L_0x00a2:
            r0 = 0
            goto L_0x00d6
        L_0x00a4:
            com.alibaba.griver.base.common.utils.OfficeFileType r9 = com.alibaba.griver.base.common.utils.OfficeFileType.Doc
            boolean r9 = r9.checkType(r11)
            if (r9 != 0) goto L_0x00d5
            com.alibaba.griver.base.common.utils.OfficeFileType r9 = com.alibaba.griver.base.common.utils.OfficeFileType.Docx
            boolean r9 = r9.checkType(r11)
            if (r9 != 0) goto L_0x00d5
            com.alibaba.griver.base.common.utils.OfficeFileType r9 = com.alibaba.griver.base.common.utils.OfficeFileType.Xls
            boolean r9 = r9.checkType(r11)
            if (r9 != 0) goto L_0x00d5
            com.alibaba.griver.base.common.utils.OfficeFileType r9 = com.alibaba.griver.base.common.utils.OfficeFileType.Xlsx
            boolean r9 = r9.checkType(r11)
            if (r9 != 0) goto L_0x00d5
            com.alibaba.griver.base.common.utils.OfficeFileType r9 = com.alibaba.griver.base.common.utils.OfficeFileType.PPt
            boolean r9 = r9.checkType(r11)
            if (r9 != 0) goto L_0x00d5
            com.alibaba.griver.base.common.utils.OfficeFileType r9 = com.alibaba.griver.base.common.utils.OfficeFileType.PPtx
            boolean r9 = r9.checkType(r11)
            goto L_0x00d5
        L_0x00d3:
            r0 = 4011(0xfab, float:5.62E-42)
        L_0x00d5:
            r1 = 0
        L_0x00d6:
            com.alibaba.fastjson.JSONObject r9 = new com.alibaba.fastjson.JSONObject
            r9.<init>()
            if (r1 != 0) goto L_0x0104
            int r10 = com.alibaba.griver.file.R.string.griver_file_not_support_type
            java.lang.String r10 = r8.getString(r10)
            if (r0 == r3) goto L_0x00ef
            if (r0 == r2) goto L_0x00e8
            goto L_0x00f5
        L_0x00e8:
            int r10 = com.alibaba.griver.file.R.string.griver_file_not_exist
            java.lang.String r10 = r8.getString(r10)
            goto L_0x00f5
        L_0x00ef:
            int r10 = com.alibaba.griver.file.R.string.griver_invalid_file_path
            java.lang.String r10 = r8.getString(r10)
        L_0x00f5:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r11 = "error"
            r9.put((java.lang.String) r11, (java.lang.Object) r8)
            java.lang.String r8 = "errorMessage"
            r9.put((java.lang.String) r8, (java.lang.Object) r10)
            goto L_0x010d
        L_0x0104:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            java.lang.String r10 = "success"
            r9.put((java.lang.String) r10, (java.lang.Object) r8)
        L_0x010d:
            r12.sendJSONResponse(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.file.jsapi.OpenDocumentBridgeExtension.openDocument(com.alibaba.ariver.engine.api.bridge.model.ApiContext, com.alibaba.ariver.app.api.App, java.lang.String, java.lang.String, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    private String getFilePath(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith(PhotoContext.FILE_SCHEME)) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            str = AOMPFileTinyAppUtils.getLocalPathFromId(str);
        }
        if (!TinyAppFileUtils.containsRelativeParentPath(str) && !TextUtils.isEmpty(str)) {
            return str;
        }
        return null;
    }
}
