package com.alibaba.griver.h5.extension;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.annotation.RequiresApi;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.h5.file.GriverChooseFileExtension;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.core.ui.activity.GriverFileChooserActivity;
import o.restorePresenterStates;

public class GriverChooseFileExtensionImpl implements GriverChooseFileExtension {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f10440a;

    public void openFileChooser(Page page, ValueCallback<Uri> valueCallback, String str, String str2) {
        a(page, valueCallback, new String[]{str}, str2, false, false);
    }

    @RequiresApi(api = 21)
    public boolean onShowFileChooser(Page page, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return a(page, valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.isCaptureEnabled() ? "capture" : null, fileChooserParams.getMode() == 1, true);
    }

    private boolean a(Page page, ValueCallback valueCallback, String[] strArr, String str, boolean z, boolean z2) {
        if (!(page == null || page.getRender() == null || page.getRender().getView() == null || page.getPageContext() == null)) {
            try {
                Activity activity = page.getPageContext().getActivity();
                if (activity == null) {
                    return false;
                }
                restorePresenterStates length = restorePresenterStates.length(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext());
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("FILE_CHOOSER_RESULT");
                if (this.f10440a != null) {
                    length.setMax(this.f10440a);
                    this.f10440a = null;
                }
                final restorePresenterStates restorepresenterstates = length;
                final Activity activity2 = activity;
                final ValueCallback valueCallback2 = valueCallback;
                final boolean z3 = z2;
                AnonymousClass1 r1 = new BroadcastReceiver() {
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: android.net.Uri[]} */
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: android.net.Uri[]} */
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: android.net.Uri[]} */
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: android.net.Uri[]} */
                    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.BroadcastReceiver, android.database.Cursor] */
                    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
                    /* JADX WARNING: type inference failed for: r1v2 */
                    /* JADX WARNING: type inference failed for: r1v4 */
                    /* JADX WARNING: type inference failed for: r1v5 */
                    /* JADX WARNING: Multi-variable type inference failed */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onReceive(android.content.Context r14, android.content.Intent r15) {
                        /*
                            r13 = this;
                            java.lang.String r14 = ""
                            if (r15 == 0) goto L_0x00c5
                            java.lang.String r0 = r15.getAction()
                            if (r0 == 0) goto L_0x00c5
                            android.os.Bundle r0 = r15.getExtras()
                            if (r0 == 0) goto L_0x00c5
                            o.restorePresenterStates r0 = r3
                            if (r0 != 0) goto L_0x0016
                            goto L_0x00c5
                        L_0x0016:
                            r0.setMax(r13)
                            com.alibaba.griver.h5.extension.GriverChooseFileExtensionImpl r0 = com.alibaba.griver.h5.extension.GriverChooseFileExtensionImpl.this
                            r1 = 0
                            android.content.BroadcastReceiver unused = r0.f10440a = r1
                            java.lang.String r0 = r15.getAction()
                            java.lang.String r2 = java.lang.String.valueOf(r0)
                            java.lang.String r3 = "onReceive action "
                            java.lang.String r2 = r3.concat(r2)
                            java.lang.String r3 = "GriverChooseFileExtensionImpl"
                            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r2)
                            java.lang.String r2 = "FILE_CHOOSER_RESULT"
                            boolean r0 = r2.equals(r0)
                            if (r0 != 0) goto L_0x003b
                            return
                        L_0x003b:
                            r0 = 1
                            r2 = 0
                            android.os.Bundle r15 = r15.getExtras()     // Catch:{ all -> 0x009b }
                            java.lang.String r4 = "fileUri"
                            java.lang.Object r15 = r15.get(r4)     // Catch:{ all -> 0x009b }
                            android.net.Uri[] r15 = (android.net.Uri[]) r15     // Catch:{ all -> 0x009b }
                            if (r15 != 0) goto L_0x0053
                            android.net.Uri[] r15 = new android.net.Uri[r0]     // Catch:{ all -> 0x009b }
                            android.net.Uri r4 = android.net.Uri.parse(r14)     // Catch:{ all -> 0x009b }
                            r15[r2] = r4     // Catch:{ all -> 0x009b }
                        L_0x0053:
                            android.app.Activity r4 = r4     // Catch:{ all -> 0x009b }
                            if (r4 == 0) goto L_0x0086
                            android.app.Activity r4 = r4     // Catch:{ all -> 0x009b }
                            boolean r4 = r4.isFinishing()     // Catch:{ all -> 0x009b }
                            if (r4 != 0) goto L_0x0086
                            if (r15 == 0) goto L_0x0086
                            int r4 = r15.length     // Catch:{ all -> 0x009b }
                            r5 = 0
                        L_0x0063:
                            if (r5 >= r4) goto L_0x0086
                            r12 = r15[r5]     // Catch:{ all -> 0x009b }
                            android.app.Activity r6 = r4     // Catch:{ all -> 0x009b }
                            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x009b }
                            r8 = 0
                            r9 = 0
                            r10 = 0
                            r11 = 0
                            r7 = r12
                            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x009b }
                            java.lang.String r6 = "onReceive result "
                            java.lang.String r7 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x009b }
                            java.lang.String r6 = r6.concat(r7)     // Catch:{ all -> 0x009b }
                            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r6)     // Catch:{ all -> 0x009b }
                            int r5 = r5 + 1
                            goto L_0x0063
                        L_0x0086:
                            android.webkit.ValueCallback r4 = r5     // Catch:{ all -> 0x009b }
                            if (r4 == 0) goto L_0x0095
                            boolean r4 = r6     // Catch:{ all -> 0x009b }
                            if (r4 != 0) goto L_0x0090
                            r15 = r15[r2]     // Catch:{ all -> 0x009b }
                        L_0x0090:
                            android.webkit.ValueCallback r4 = r5     // Catch:{ all -> 0x009b }
                            r4.onReceiveValue(r15)     // Catch:{ all -> 0x009b }
                        L_0x0095:
                            if (r1 == 0) goto L_0x00bd
                            r1.close()
                            return
                        L_0x009b:
                            r15 = move-exception
                            java.lang.String r4 = "exception detail"
                            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r4, r15)     // Catch:{ all -> 0x00be }
                            android.net.Uri[] r15 = new android.net.Uri[r0]     // Catch:{ all -> 0x00be }
                            android.net.Uri r14 = android.net.Uri.parse(r14)     // Catch:{ all -> 0x00be }
                            r15[r2] = r14     // Catch:{ all -> 0x00be }
                            android.webkit.ValueCallback r14 = r5     // Catch:{ all -> 0x00be }
                            if (r14 == 0) goto L_0x00b8
                            boolean r14 = r6     // Catch:{ all -> 0x00be }
                            if (r14 != 0) goto L_0x00b3
                            r15 = r15[r2]     // Catch:{ all -> 0x00be }
                        L_0x00b3:
                            android.webkit.ValueCallback r14 = r5     // Catch:{ all -> 0x00be }
                            r14.onReceiveValue(r15)     // Catch:{ all -> 0x00be }
                        L_0x00b8:
                            if (r1 == 0) goto L_0x00bd
                            r1.close()
                        L_0x00bd:
                            return
                        L_0x00be:
                            r14 = move-exception
                            if (r1 == 0) goto L_0x00c4
                            r1.close()
                        L_0x00c4:
                            throw r14
                        L_0x00c5:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.h5.extension.GriverChooseFileExtensionImpl.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
                    }
                };
                this.f10440a = r1;
                length.setMax(r1, intentFilter);
                Intent intent = new Intent(activity, GriverFileChooserActivity.class);
                intent.putExtra("acceptType", strArr);
                intent.putExtra("capture", str);
                intent.putExtra("multiple", z);
                if (ProcessUtils.isTinyProcess() && !"yes".equalsIgnoreCase(GriverConfig.getConfig("h5_notSupportTinyChooseFile", ""))) {
                    String string = BundleUtils.getString(page.getStartParams(), "appId");
                    if (TextUtils.isEmpty(string)) {
                        string = BundleUtils.getString(page.getStartParams(), "MINI-PROGRAM-WEB-VIEW-TAG");
                    }
                    if (!TextUtils.isEmpty(string)) {
                        intent.putExtra("appId", string);
                    }
                }
                activity.startActivity(intent);
                return true;
            } catch (ClassCastException e) {
                RVLogger.e("GriverChooseFileExtensionImpl", "exception detail", e);
            } catch (ActivityNotFoundException e2) {
                RVLogger.e("GriverChooseFileExtensionImpl", "exception detail", e2);
                return false;
            } catch (Exception e3) {
                RVLogger.e("GriverChooseFileExtensionImpl", "exception detail", e3);
                return false;
            }
        }
        return false;
    }
}
