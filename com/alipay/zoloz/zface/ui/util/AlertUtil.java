package com.alipay.zoloz.zface.ui.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alipay.mobile.security.bio.constants.CodeConstants;
import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.zoloz.toyger.R2;
import com.alipay.zoloz.zface.services.ZFaceRecordService;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.util.HashMap;
import zoloz.ap.com.toolkit.R2;
import zoloz.ap.com.toolkit.ui.DialogCallback;
import zoloz.ap.com.toolkit.ui.DialogHelper;
import zoloz.ap.com.toolkit.ui.GenenalDialog;

public class AlertUtil {
    /* access modifiers changed from: private */
    public boolean isAlert = false;
    private Activity mActivity;
    /* access modifiers changed from: private */
    public AlertClickEvents mAlertClickEvents;
    private int mMaxRetryTimes = 2;
    /* access modifiers changed from: private */
    public int mRetryTimes = 0;

    public interface AlertClickEvents {
        void retry(int i);

        void retryUpload();

        void sendResponse(int i, String str);

        void showFrame();

        void stopProcess();
    }

    public AlertUtil(Activity activity, AlertClickEvents alertClickEvents, int i) {
        this.mActivity = activity;
        this.mAlertClickEvents = alertClickEvents;
        this.mMaxRetryTimes = i;
    }

    private String getString(int i) {
        return this.mActivity.getString(i);
    }

    private Dialog alert(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        return alert(str, str2, str3, str4, onClickListener, (String) null, (DialogInterface.OnClickListener) null);
    }

    private Dialog alert(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, String str5, DialogInterface.OnClickListener onClickListener2) {
        if (this.isAlert) {
            return null;
        }
        this.isAlert = true;
        int i = this.mRetryTimes;
        if (i >= this.mMaxRetryTimes) {
            return realAlertRetryTimeout();
        }
        this.mRetryTimes = i + 1;
        return realAlert(str, str2, str3, str4, onClickListener, str5, onClickListener2, false, (DialogCallback) null);
    }

    private Dialog realAlertRetryTimeout() {
        return realAlert("retryOverMax", R2.string.zface_retry_max_title(), R2.string.zface_retry_max_msg(), R2.string.zface_retry_max_got_it(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(209, CodeConstants.OUT_TIME);
            }
        }, (String) null, (DialogInterface.OnClickListener) null, false, (DialogCallback) null);
    }

    private Dialog realAlert(final String str, String str2, String str3, final String str4, final DialogInterface.OnClickListener onClickListener, final String str5, final DialogInterface.OnClickListener onClickListener2, boolean z, DialogCallback dialogCallback) {
        this.mAlertClickEvents.showFrame();
        this.mAlertClickEvents.stopProcess();
        if (this.mActivity.isFinishing()) {
            return null;
        }
        record(ZFaceRecordService.ALERT_APPEAR, str);
        Builder builder = new Builder(this.mActivity);
        if (!TextUtils.isEmpty(str2)) {
            builder.setTitle(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            builder.setMessage(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.setPositiveButton(str4, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    onClickListener.onClick(dialogInterface, i);
                    AlertUtil.record(ZFaceRecordService.ALERT_CHOOSE, str, str4);
                }
            });
        }
        if (!TextUtils.isEmpty(str5)) {
            builder.setNegativeButton(str5, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    onClickListener2.onClick(dialogInterface, i);
                    AlertUtil.record(ZFaceRecordService.ALERT_CHOOSE, str, str5);
                }
            });
        }
        builder.showCloseButton(false);
        builder.showProtocol(false);
        AlertDialog show = builder.show();
        show.setCanceledOnTouchOutside(z);
        show.setCancelable(z);
        show.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                boolean unused = AlertUtil.this.isAlert = false;
            }
        });
        return show;
    }

    private static void record(String str, String str2) {
        record(str, str2, "");
    }

    /* access modifiers changed from: private */
    public static void record(String str, String str2, String str3) {
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        if (currentInstance != null) {
            ZFaceRecordService zFaceRecordService = (ZFaceRecordService) currentInstance.getBioService(ZFaceRecordService.class);
            HashMap hashMap = new HashMap();
            hashMap.put(ZdocRecordService.REASON, str2);
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put("choose", str3);
            }
            if (zFaceRecordService != null) {
                zFaceRecordService.write(str, hashMap);
            }
        }
    }

    public void alertRetryOutTime() {
        alert("retryOverMax", R2.string.zface_retry_max_title(), R2.string.zface_retry_max_msg(), R2.string.zface_retry_max_got_it(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(209, CodeConstants.OUT_TIME);
            }
        });
    }

    public void alertLivelessFail() {
        alert("livelessFail", R2.string.zface_retry_max_title(), R2.string.zface_retry_max_msg(), R2.string.zface_retry_max_got_it(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(3001, CodeConstants.LIVENESS_ERROR);
            }
        });
    }

    public void alertFirstLogin() {
        alert("authorization", R2.string.zface_detect_dialog_first_login(), "", R2.string.zface_detect_dialog_first_login_confirm(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.retry(AlertUtil.this.mRetryTimes);
            }
        }, R2.string.zface_detect_dialog_first_login_cancel(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(210, ZcodeConstants.ZCODE_FIRST_LOGIN);
            }
        });
    }

    public void alertFailRetry() {
        alert("livnessFail", R2.string.zface_scan_fail_title(), R2.string.zface_scan_fail_msg(), R2.string.zface_scan_fail_retry(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.retry(AlertUtil.this.mRetryTimes);
            }
        }, R2.string.zface_scan_fail_quit(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(208, CodeConstants.SERVER_FAIL);
            }
        });
    }

    public void alertInterruptResume() {
        alert("systemInterrupt", R2.string.zface_interrupt_title(), R2.string.zface_interrupt_msg(), R2.string.zface_interrupt_retry(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.retry(AlertUtil.this.mRetryTimes);
            }
        }, R2.string.zface_interrupt_close(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(301, CodeConstants.USER_BACK);
            }
        });
    }

    public void alertTimeOut() {
        alert(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, R2.string.zface_time_out_title(), R2.string.zface_time_out_msg(), R2.string.zface_time_out_retry(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.retry(AlertUtil.this.mRetryTimes);
            }
        }, R2.string.zface_time_out_quit(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(202, CodeConstants.OVER_TIME);
            }
        });
    }

    public void alertSystemNotSupport(final String str) {
        alert("errorDeviceModel", R2.string.zface_device_unsupport_msg(), "", R2.string.zface_device_unsupport_got_it(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (str == ZcodeConstants.ZCODE_UNSUPPORTED_CPU) {
                    AlertUtil.this.mAlertClickEvents.sendResponse(102, CodeConstants.USER_UNSURPPORT_CPU);
                } else if (str == ZcodeConstants.ZCODE_NO_FRANT_CAMERA) {
                    AlertUtil.this.mAlertClickEvents.sendResponse(101, CodeConstants.ERROR_CAMERA);
                } else {
                    AlertUtil.this.mAlertClickEvents.sendResponse(105, CodeConstants.ANDROID_VERSION_LOW);
                }
            }
        });
    }

    public void alertCameraOpenFailed() {
        alert("cameraInitError", R2.string.zface_camera_init_error_msg(), "", R2.string.zface_camera_init_error_got_it(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(200, CodeConstants.ERROR_CAMERA);
            }
        });
    }

    public void alertCameraPermissionFailed(DialogInterface.OnClickListener onClickListener) {
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        alert("cameraPermission", R2.string.zface_camera_without_permission_title(), R2.string.zface_camera_without_permission_msg(), R2.string.zface_camera_without_permission_go_settings(), onClickListener2, R2.string.zface_camera_without_permission_quit(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(100, CodeConstants.ERROR_CAMERA);
            }
        });
    }

    public void alertSystemError() {
        alert("loadAlgorithmErr", R2.string.system_error_title(), R2.string.system_error_msg(), R2.string.system_error_got_it(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(205, CodeConstants.SERVER_PARAM_ERROR);
            }
        });
    }

    public void alertNetworkError() {
        this.mRetryTimes--;
        alert("networkFail", R2.string.network_error_title(), R2.string.network_error_msg(), R2.string.network_error_retry(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.retryUpload();
            }
        }, R2.string.network_error_exit(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(207, CodeConstants.NETWORK_TIMEOUT);
            }
        });
    }

    public void alertBack() {
        alert("clickXback", R2.string.zface_user_cancel_title(), R2.string.zface_user_cancel_msg(), R2.string.zface_user_cancel_stay(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.retry(AlertUtil.this.mRetryTimes);
            }
        }, R2.string.zface_user_cancel_quit(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertUtil.this.mAlertClickEvents.sendResponse(202, CodeConstants.USER_QUITE);
            }
        });
    }

    public DialogHelper alertUploadSuccess(Activity activity) {
        DialogHelper dialogHelper = new DialogHelper(activity);
        dialogHelper.showSuccessDialog(false, (DialogInterface.OnCancelListener) null);
        return dialogHelper;
    }

    public int getRetryTimes() {
        return this.mRetryTimes;
    }

    public class Builder {
        /* access modifiers changed from: private */
        public String _cacelButtonText;
        /* access modifiers changed from: private */
        public String _confirmButtonText;
        /* access modifiers changed from: private */
        public Context _context;
        /* access modifiers changed from: private */
        public boolean _isGarfieldFaceless;
        DialogInterface.OnClickListener _negativeListener;
        DialogInterface.OnClickListener _positiveListener;
        /* access modifiers changed from: private */
        public boolean _showCloseButton;
        /* access modifiers changed from: private */
        public boolean _showProtocol;
        /* access modifiers changed from: private */
        public String _subTitle;
        /* access modifiers changed from: private */
        public String _title;

        public Builder(Context context) {
            this._context = context;
        }

        public Builder setTitle(String str) {
            this._title = str;
            return this;
        }

        public Builder setMessage(String str) {
            this._subTitle = str;
            return this;
        }

        public Builder setMessage2(String str) {
            this._subTitle = str;
            return this;
        }

        public Builder setPositiveButton(String str, DialogInterface.OnClickListener onClickListener) {
            this._confirmButtonText = str;
            this._positiveListener = onClickListener;
            return this;
        }

        public Builder showProtocol(boolean z) {
            this._showProtocol = z;
            return this;
        }

        public Builder showCloseButton(boolean z) {
            this._showCloseButton = z;
            return this;
        }

        public Builder setNegativeButton(String str, DialogInterface.OnClickListener onClickListener) {
            this._cacelButtonText = str;
            this._negativeListener = onClickListener;
            return this;
        }

        public Builder setToGarfieldFaceless(boolean z) {
            this._isGarfieldFaceless = z;
            return this;
        }

        public DialogInterface.OnClickListener getPositiveListener() {
            return this._positiveListener;
        }

        public DialogInterface.OnClickListener getNegativeListener() {
            return this._negativeListener;
        }

        public Context getContext() {
            return this._context;
        }

        public String getTitle() {
            return this._title;
        }

        public String getSubTitle() {
            return this._subTitle;
        }

        public String getConfirmButtonText() {
            return this._confirmButtonText;
        }

        public String getCacelButtonText() {
            return this._cacelButtonText;
        }

        public boolean isShowCloseButton() {
            return this._showCloseButton;
        }

        public boolean isShowProtocol() {
            return this._showProtocol;
        }

        public AlertDialog show() {
            AlertDialog confirmDialog = AlertUtil.this.getConfirmDialog(this);
            try {
                confirmDialog.show();
            } catch (Exception unused) {
            }
            return confirmDialog;
        }
    }

    /* access modifiers changed from: protected */
    public AlertDialog getConfirmDialog(Builder builder) {
        return new GenenalDialog(builder._context, builder._title, builder._subTitle, builder._confirmButtonText, builder._positiveListener, builder._cacelButtonText, builder._negativeListener, builder._showCloseButton, builder._showProtocol, builder._isGarfieldFaceless);
    }
}
