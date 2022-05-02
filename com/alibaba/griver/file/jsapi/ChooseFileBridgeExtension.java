package com.alibaba.griver.file.jsapi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.ui.loadingview.GriverLoadingViewExtension;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.proxy.LocalIdTool;
import com.alibaba.griver.base.common.utils.AOMPFileTinyAppUtils;
import com.alibaba.griver.base.common.utils.H5FileUtil;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.alibaba.griver.base.common.utils.PermissionUtils;
import com.alibaba.griver.file.R;
import com.alibaba.griver.image.photo.PhotoContext;
import com.alipay.multimedia.adjuster.utils.PathUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import o.FontRes;
import o.restorePresenterStates;

@Keep
public class ChooseFileBridgeExtension extends SimpleBridgeExtension {
    public static final String ACTION_CHOOSE_FILE = "choose_file";
    public static final String CHOOSE_FILE_RESULT_CANCELED = "cancel";
    public static final String CHOOSE_FILE_RESULT_DATA_KEY = "fileUri";
    public static final String CHOOSE_FILE_RESULT_KEY = "result";
    private static final int ERROR_CODE_COPY_FILE = 12;
    private static final int ERROR_CODE_LACK_PERMISSION = 17;
    private static final int ERROR_CODE_SIZE_LIMITATION = 18;
    private static final int ERROR_CODE_USER_CANCEL = 15;
    private static final int ERROR_CODE_USER_DENY_PERMISSION = 16;
    private static final String TAG = "ChooseFileBridgeExtension";
    /* access modifiers changed from: private */
    public BroadcastReceiver receiver;

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void chooseFileFromDisk(@BindingNode(Page.class) Page page, @BindingCallback final BridgeCallback bridgeCallback) {
        GriverLogger.d(TAG, "start choose file from disk");
        if (page.getPageContext() == null) {
            GriverLogger.w(TAG, "context is null, return unknown error");
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        final Activity activity = page.getPageContext().getActivity();
        if (activity == null) {
            GriverLogger.w(TAG, "activity is null, return unknown error");
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (PermissionUtils.hasPermission("android.permission.READ_EXTERNAL_STORAGE")) {
            startChooseFile(activity, bridgeCallback);
        } else {
            PermissionUtils.requestPermission("android.permission.READ_EXTERNAL_STORAGE", 2001, new IPermissionRequestCallback() {
                public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
                    if (PermissionUtils.positivePermissionResult(iArr)) {
                        ChooseFileBridgeExtension.this.startChooseFile(activity, bridgeCallback);
                    } else if (FontRes.getMax(activity, "android.permission.READ_EXTERNAL_STORAGE")) {
                        ChooseFileBridgeExtension.this.sendUserDenyCallback(GriverEnv.getResources(), bridgeCallback);
                    } else {
                        ChooseFileBridgeExtension.this.sendLackPermissionCallback(GriverEnv.getResources(), bridgeCallback);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void sendUserDenyCallback(Resources resources, BridgeCallback bridgeCallback) {
        String str;
        if (resources == null) {
            str = "User denied read storage permission";
        } else {
            str = resources.getString(R.string.griver_file_user_deny_permission);
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.newError(16, str));
    }

    /* access modifiers changed from: private */
    public void sendLackPermissionCallback(Resources resources, BridgeCallback bridgeCallback) {
        String str;
        if (resources == null) {
            str = "Lack read storage permission";
        } else {
            str = resources.getString(R.string.griver_file_lack_permission);
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.newError(17, str));
    }

    /* access modifiers changed from: private */
    public void sendUserCancelCallback(Resources resources, BridgeCallback bridgeCallback) {
        String str;
        if (resources == null) {
            str = "User cancels file selection";
        } else {
            str = resources.getString(R.string.griver_file_user_cancel_select);
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(15, str));
    }

    /* access modifiers changed from: private */
    public void sendCopyFileErrorCallback(Resources resources, BridgeCallback bridgeCallback) {
        String str;
        if (resources == null) {
            str = "File copy error";
        } else {
            str = resources.getString(R.string.griver_file_copy_error);
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(12, str));
    }

    /* access modifiers changed from: private */
    public void sendSizeLimitationCallback(Resources resources, BridgeCallback bridgeCallback) {
        String str;
        if (resources == null) {
            str = "Can not choose large file";
        } else {
            str = resources.getString(R.string.griver_file_file_size_error);
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(18, str));
    }

    private void startChooseFileIntent(Activity activity) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
        }
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        activity.startActivityForResult(intent, 200);
    }

    /* access modifiers changed from: private */
    public void startChooseFile(final Activity activity, final BridgeCallback bridgeCallback) {
        startChooseFileIntent(activity);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_CHOOSE_FILE);
        final restorePresenterStates length = restorePresenterStates.length(GriverEnv.getApplicationContext());
        BroadcastReceiver broadcastReceiver = this.receiver;
        if (broadcastReceiver != null) {
            length.setMax(broadcastReceiver);
            this.receiver = null;
        }
        AnonymousClass2 r2 = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                GriverLogger.d(ChooseFileBridgeExtension.TAG, "choose file receive");
                if (intent != null && TextUtils.equals(intent.getAction(), ChooseFileBridgeExtension.ACTION_CHOOSE_FILE)) {
                    length.setMax(this);
                    BroadcastReceiver unused = ChooseFileBridgeExtension.this.receiver = null;
                    if (TextUtils.equals("cancel", intent.getStringExtra("result"))) {
                        ChooseFileBridgeExtension.this.sendUserCancelCallback(GriverEnv.getResources(), bridgeCallback);
                        return;
                    }
                    final Uri uri = (Uri) intent.getParcelableExtra(ChooseFileBridgeExtension.CHOOSE_FILE_RESULT_DATA_KEY);
                    GriverLogger.d(ChooseFileBridgeExtension.TAG, "user choose: ".concat(String.valueOf(uri)));
                    if (uri == null) {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                        return;
                    }
                    ChooseFileBridgeExtension.this.showLoading(activity);
                    GriverExecutors.getExecutor(ExecutorType.IO).execute(new Runnable() {
                        public void run() {
                            final String obj = uri.toString();
                            if (TextUtils.isEmpty(obj)) {
                                ChooseFileBridgeExtension.this.hideLoading();
                                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                            } else if (ChooseFileBridgeExtension.this.exceedSizeThreshold(obj)) {
                                ChooseFileBridgeExtension.this.hideLoading();
                                ChooseFileBridgeExtension.this.sendSizeLimitationCallback(GriverEnv.getResources(), bridgeCallback);
                            } else if (!obj.startsWith(PathUtils.CONTENT_SCHEMA) || (obj = ChooseFileBridgeExtension.this.copyContentToTemp(uri)) != null) {
                                GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
                                    public void run() {
                                        ChooseFileBridgeExtension.this.hideLoading();
                                        String encodeToLocalId = LocalIdTool.get().encodeToLocalId(obj);
                                        String access$1100 = ChooseFileBridgeExtension.this.getTypeFromUri(uri);
                                        if (access$1100 == null) {
                                            access$1100 = H5ResourceHandlerUtil.OTHER;
                                        }
                                        String localIdToUrl = H5ResourceHandlerUtil.localIdToUrl(encodeToLocalId, access$1100);
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("apFilePath", (Object) localIdToUrl);
                                        jSONObject.put("success", (Object) Boolean.TRUE);
                                        bridgeCallback.sendJSONResponse(jSONObject);
                                    }
                                });
                            } else {
                                ChooseFileBridgeExtension.this.hideLoading();
                                ChooseFileBridgeExtension.this.sendCopyFileErrorCallback(GriverEnv.getResources(), bridgeCallback);
                            }
                        }
                    });
                }
            }
        };
        this.receiver = r2;
        length.setMax(r2, intentFilter);
    }

    /* access modifiers changed from: private */
    public boolean exceedSizeThreshold(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith(PhotoContext.FILE_SCHEME)) {
            File file = new File(str.replace(PhotoContext.FILE_SCHEME, ""));
            if (file.exists()) {
                try {
                    return ((double) new FileInputStream(file).available()) > getMaxSize();
                } catch (Exception e) {
                    GriverLogger.e(TAG, "compare file size exception", e);
                }
            }
            return false;
        }
        if (str.startsWith(PathUtils.CONTENT_SCHEMA)) {
            try {
                InputStream openInputStream = GriverEnv.getApplicationContext().getContentResolver().openInputStream(Uri.parse(str));
                return openInputStream != null && ((double) openInputStream.available()) > getMaxSize();
            } catch (Exception e2) {
                GriverLogger.e(TAG, "compare content file size exception", e2);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void hideLoading() {
        GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
            public void run() {
                ((GriverLoadingViewExtension) RVProxy.get(GriverLoadingViewExtension.class)).dismiss();
            }
        });
    }

    /* access modifiers changed from: private */
    public void showLoading(final Activity activity) {
        GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
            public void run() {
                ((GriverLoadingViewExtension) RVProxy.get(GriverLoadingViewExtension.class)).show(activity, "", false);
            }
        });
    }

    /* access modifiers changed from: private */
    public String getTypeFromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        String obj = uri.toString();
        GriverLogger.d(TAG, "choose file getTypeFromUri for: ".concat(String.valueOf(obj)));
        String mimeType = H5FileUtil.getMimeType(obj);
        GriverLogger.d(TAG, "choose file getTypeFromUri mimeType: ".concat(String.valueOf(mimeType)));
        if (TextUtils.isEmpty(mimeType)) {
            if (obj.startsWith(PathUtils.CONTENT_SCHEMA) && obj.contains(H5ResourceHandlerUtil.IMAGE)) {
                mimeType = H5ResourceHandlerUtil.IMAGE;
            } else if (obj.startsWith(PathUtils.CONTENT_SCHEMA) && obj.contains("video")) {
                mimeType = "video";
            } else if (obj.startsWith(PathUtils.CONTENT_SCHEMA) && obj.contains("audio")) {
                mimeType = "audio";
            }
        }
        String typeFromMimeType = AOMPFileTinyAppUtils.getTypeFromMimeType(mimeType);
        GriverLogger.d(TAG, "choose file getTypeFromUri result: ".concat(String.valueOf(typeFromMimeType)));
        return typeFromMimeType;
    }

    /* access modifiers changed from: private */
    public String copyContentToTemp(Uri uri) {
        try {
            InputStream openInputStream = GriverEnv.getApplicationContext().getContentResolver().openInputStream(uri);
            if (openInputStream == null || GriverEnv.getApplicationContext().getExternalCacheDir() == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(GriverEnv.getApplicationContext().getExternalCacheDir().getAbsolutePath());
            sb.append(File.separator);
            sb.append("griver");
            sb.append(File.separator);
            sb.append("tmp");
            sb.append(File.separator);
            String obj = sb.toString();
            File file = new File(obj);
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(System.currentTimeMillis());
            String obj2 = sb2.toString();
            File file2 = new File(obj2);
            if (!file2.createNewFile()) {
                return null;
            }
            IOUtils.copy(openInputStream, new FileOutputStream(file2));
            return PhotoContext.FILE_SCHEME.concat(String.valueOf(obj2));
        } catch (Exception e) {
            GriverLogger.e(TAG, "copy file exception", e);
            return null;
        }
    }

    private double getMaxSize() {
        double parseDouble = Double.parseDouble(GriverConfigConstants.DEFAULT_CHOOSE_FILE_SIZE_THRESHOLD);
        String config = GriverInnerConfig.getConfig(GriverConfigConstants.KEY_CHOOSE_FILE_SIZE_THRESHOLD, GriverConfigConstants.DEFAULT_CHOOSE_FILE_SIZE_THRESHOLD);
        try {
            if (!TextUtils.isEmpty(config)) {
                parseDouble = Double.parseDouble(config);
            }
        } catch (Exception e) {
            GriverLogger.e(TAG, "parse choose file threshold exception", e);
        }
        GriverLogger.d(TAG, "choose file size threshold in mb: ".concat(String.valueOf(parseDouble)));
        return parseDouble * 1024.0d * 1024.0d;
    }

    public void onFinalized() {
        super.onFinalized();
        if (this.receiver != null && GriverEnv.getApplicationContext() != null) {
            restorePresenterStates.length(GriverEnv.getApplicationContext()).setMax(this.receiver);
        }
    }
}
