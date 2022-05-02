package zoloz.ap.com.toolkit.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import zoloz.ap.com.toolkit.R;
import zoloz.ap.com.toolkit.ui.GenenalDialog;

public class DialogHelper {
    protected static final String TAG = "DialogHelper";
    /* access modifiers changed from: private */
    public Activity mActivity;
    /* access modifiers changed from: private */
    public AlertDialog mAlertDialog;

    public DialogHelper(Activity activity) {
        this.mActivity = activity;
    }

    public void setActivity(Activity activity) {
        this.mActivity = activity;
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        alert(str, str2, str3, onClickListener, str4, onClickListener2, Boolean.FALSE);
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool) {
        Boolean bool2 = Boolean.FALSE;
        alert(str, str2, str3, onClickListener, str4, onClickListener2, bool2, bool2);
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool, Boolean bool2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1633633383, oncanceled);
            onCancelLoad.getMin(-1633633383, oncanceled);
        }
        dismissDialog();
        AlertDialog alertDialog = this.mAlertDialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            final String str5 = str;
            final String str6 = str2;
            final String str7 = str3;
            final DialogInterface.OnClickListener onClickListener3 = onClickListener;
            final String str8 = str4;
            final DialogInterface.OnClickListener onClickListener4 = onClickListener2;
            this.mActivity.runOnUiThread(new Runnable() {
                public void run() {
                    if (DialogHelper.this.mActivity != null && !DialogHelper.this.mActivity.isFinishing()) {
                        GenenalDialog.Builder builder = new GenenalDialog.Builder(DialogHelper.this.mActivity);
                        String str = str5;
                        if (str != null) {
                            builder.setTitle(str);
                        }
                        String str2 = str6;
                        if (str2 != null) {
                            builder.setMessage(str2);
                        }
                        String str3 = str7;
                        if (str3 != null) {
                            builder.setPositiveButton(str3, onClickListener3);
                        }
                        String str4 = str8;
                        if (str4 != null) {
                            builder.setNegativeButton(str4, onClickListener4);
                        }
                        builder.setToGarfieldFaceless(false);
                        builder.showCloseButton(false);
                        builder.showProtocol(false);
                        GenenalDialog show = builder.show();
                        AlertDialog unused = DialogHelper.this.mAlertDialog = show;
                        show.setCancelable(false);
                        show.setCanceledOnTouchOutside(false);
                        show.getWindow().setGravity(17);
                    }
                }
            });
        }
    }

    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        dismissDialog();
        final String str2 = str;
        final boolean z3 = z2;
        final boolean z4 = z;
        final DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
        this.mActivity.runOnUiThread(new Runnable() {
            public void run() {
                if (DialogHelper.this.mActivity != null && !DialogHelper.this.mActivity.isFinishing()) {
                    DialogHelper dialogHelper = DialogHelper.this;
                    DialogHelper dialogHelper2 = DialogHelper.this;
                    AlertDialog unused = dialogHelper.mAlertDialog = new ZolozProgressDialog(dialogHelper2.mActivity);
                    DialogHelper.this.mAlertDialog.setMessage(str2);
                    ((ZolozProgressDialog) DialogHelper.this.mAlertDialog).setProgressVisiable(z3);
                    DialogHelper.this.mAlertDialog.setCancelable(z4);
                    DialogHelper.this.mAlertDialog.setOnCancelListener(onCancelListener2);
                    DialogHelper.this.mAlertDialog.setCanceledOnTouchOutside(false);
                    DialogHelper.this.mAlertDialog.getWindow().setGravity(17);
                    DialogHelper.this.mAlertDialog.show();
                }
            }
        });
    }

    public void dismissDialog() {
        this.mActivity.runOnUiThread(new Runnable() {
            public void run() {
                if (DialogHelper.this.mAlertDialog != null && DialogHelper.this.mAlertDialog.isShowing() && !DialogHelper.this.mActivity.isFinishing()) {
                    try {
                        DialogHelper.this.mAlertDialog.dismiss();
                    } catch (Throwable unused) {
                    }
                    AlertDialog unused2 = DialogHelper.this.mAlertDialog = null;
                }
            }
        });
    }

    public void forceDismissDialog() {
        this.mActivity.runOnUiThread(new Runnable() {
            public void run() {
                if (DialogHelper.this.mAlertDialog != null && DialogHelper.this.mAlertDialog.isShowing()) {
                    try {
                        DialogHelper.this.mAlertDialog.dismiss();
                    } catch (Throwable unused) {
                    }
                    AlertDialog unused2 = DialogHelper.this.mAlertDialog = null;
                }
            }
        });
    }

    public void showSuccessDialog(final boolean z, final DialogInterface.OnCancelListener onCancelListener) {
        dismissDialog();
        this.mActivity.runOnUiThread(new Runnable() {
            public void run() {
                if (DialogHelper.this.mActivity != null && !DialogHelper.this.mActivity.isFinishing()) {
                    DialogHelper dialogHelper = DialogHelper.this;
                    DialogHelper dialogHelper2 = DialogHelper.this;
                    AlertDialog unused = dialogHelper.mAlertDialog = new ZolozSuccessDialog(dialogHelper2.mActivity);
                    DialogHelper.this.mAlertDialog.setCancelable(z);
                    DialogHelper.this.mAlertDialog.setOnCancelListener(onCancelListener);
                    DialogHelper.this.mAlertDialog.setCanceledOnTouchOutside(false);
                    DialogHelper.this.mAlertDialog.getWindow().setGravity(17);
                    DialogHelper.this.mAlertDialog.show();
                }
            }
        });
    }

    public void release() {
        this.mActivity = null;
        this.mAlertDialog = null;
    }

    public boolean isShowing() {
        AlertDialog alertDialog = this.mAlertDialog;
        return alertDialog != null && alertDialog.isShowing();
    }

    public class ZolozProgressDialog extends AlertDialog {
        private boolean mIndeterminate;
        private CharSequence mMessage;
        private TextView mMessageView;
        private ProgressBar mProgress;
        private boolean mProgressVisiable;

        public ZolozProgressDialog(Context context) {
            super(context, R.style.process_style);
        }

        public ZolozProgressDialog(Context context, int i) {
            super(context, i);
        }

        /* access modifiers changed from: protected */
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.layout_progress_dialog);
            this.mProgress = (ProgressBar) findViewById(16908301);
            this.mMessageView = (TextView) findViewById(R.id.message);
            setMessageAndView();
            setIndeterminate(this.mIndeterminate);
        }

        private void setMessageAndView() {
            this.mMessageView.setText(this.mMessage);
            CharSequence charSequence = this.mMessage;
            int i = 8;
            if (charSequence == null || "".equals(charSequence)) {
                this.mMessageView.setVisibility(8);
            }
            ProgressBar progressBar = this.mProgress;
            if (this.mProgressVisiable) {
                i = 0;
            }
            progressBar.setVisibility(i);
        }

        public void setMessage(CharSequence charSequence) {
            this.mMessage = charSequence;
        }

        public void setProgressVisiable(boolean z) {
            this.mProgressVisiable = z;
        }

        public void setIndeterminate(boolean z) {
            ProgressBar progressBar = this.mProgress;
            if (progressBar != null) {
                progressBar.setIndeterminate(z);
            } else {
                this.mIndeterminate = z;
            }
        }
    }

    public class ZolozSuccessDialog extends AlertDialog {
        public ZolozSuccessDialog(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.layout_upload_success);
        }
    }
}
