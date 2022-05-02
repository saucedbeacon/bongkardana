package zoloz.ap.com.toolkit.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.mobile.security.bio.utils.StressTestUtil;
import com.alipay.mobile.security.faceauth.model.DetectTimerTask;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import zoloz.ap.com.toolkit.R;
import zoloz.ap.com.toolkit.R2;

public class GenenalDialog extends AlertDialog {
    private static final int COUNT_TIME_OUT = 20;
    /* access modifiers changed from: private */
    public GenenalDialog _self = this;
    private String cacelButtonText;
    private String confirmButtonText;
    private Context context;
    private ImageView garfieldIcon;
    private boolean isGarfieldFaceless;
    /* access modifiers changed from: private */
    public DialogCallback mCallback;
    /* access modifiers changed from: private */
    public TextView mCountTv;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    /* access modifiers changed from: private */
    public DetectTimerTask mTimerTask;
    /* access modifiers changed from: private */
    public DialogInterface.OnClickListener negativeListener;
    /* access modifiers changed from: private */
    public DialogInterface.OnClickListener positiveListener;
    private boolean showCloseButton;
    private boolean showProtocol;
    private String subTitle;
    private Object tag;
    private String title;

    public GenenalDialog(Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z, boolean z2, boolean z3) {
        super(context2, R.style.dialog_style);
        this.context = context2;
        this.title = str;
        this.subTitle = str2;
        this.confirmButtonText = str3;
        this.cacelButtonText = str4;
        this.showCloseButton = z;
        this.showProtocol = z2;
        this.negativeListener = onClickListener2;
        this.positiveListener = onClickListener;
        this.isGarfieldFaceless = z3;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initViews();
    }

    private void initViews() {
        View view;
        TextView textView;
        LinearLayout linearLayout;
        ImageButton imageButton;
        setContentView(!this.isGarfieldFaceless ? LayoutInflater.from(this.context).inflate(R.layout.general_dialog, (ViewGroup) null) : null);
        TextView textView2 = (TextView) findViewById(R.id.dialog_content_title);
        textView2.setTextColor(R2.color.dialog_title());
        textView2.setText(this.title);
        TextView textView3 = (TextView) findViewById(R.id.dialog_content_sub_title);
        textView3.setTextColor(R2.color.dialog_message());
        textView3.setText(this.subTitle);
        Button button = (Button) findViewById(R.id.dialog_btn_confirm);
        button.setTextColor(R2.color.dialog_ok());
        button.setText(this.confirmButtonText);
        Button button2 = (Button) findViewById(R.id.dialog_btn_cancel);
        button2.setTextColor(R2.color.dialog_cancel());
        button2.setText(this.cacelButtonText);
        if (!this.isGarfieldFaceless) {
            imageButton = (ImageButton) findViewById(R.id.btn_x);
            linearLayout = (LinearLayout) findViewById(R.id.dialog_protocol);
            textView = (TextView) findViewById(R.id.protocol);
            view = findViewById(R.id.dialog_btn_cancel_center);
        } else {
            imageButton = null;
            linearLayout = null;
            textView = null;
            view = null;
        }
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                }
            });
        }
        if (TextUtils.isEmpty(this.confirmButtonText)) {
            button.setVisibility(8);
            hideView(view);
            hideView((View) null);
        } else {
            button.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.cacelButtonText)) {
            button2.setVisibility(8);
            hideView(view);
            hideView((View) null);
        } else {
            button2.setVisibility(0);
        }
        if (!this.showProtocol && linearLayout != null) {
            linearLayout.setVisibility(4);
        }
        if (!this.showCloseButton) {
            hideView(imageButton);
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        double d = (double) this.context.getResources().getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        attributes.width = (int) (d * 0.9d);
        window.setAttributes(attributes);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                GenenalDialog.this._self.dismiss();
                if (GenenalDialog.this.positiveListener != null) {
                    GenenalDialog.this.positiveListener.onClick(GenenalDialog.this._self, -1);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                GenenalDialog.this._self.dismiss();
                if (GenenalDialog.this.negativeListener != null) {
                    GenenalDialog.this.negativeListener.onClick(GenenalDialog.this._self, -2);
                }
            }
        });
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    GenenalDialog.this._self.dismiss();
                    if (GenenalDialog.this.negativeListener != null) {
                        GenenalDialog.this.negativeListener.onClick(GenenalDialog.this._self, -2);
                    }
                }
            });
        }
    }

    private void hideView(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void setTag(Object obj) {
        this.tag = obj;
    }

    public void setCallback(DialogCallback dialogCallback) {
        this.mCallback = dialogCallback;
    }

    private void startTimerTask() {
        if (this.mTimerTask != null) {
            stopTimerTask();
        }
        if (StressTestUtil.isStressTest()) {
            this.mTimerTask = new DetectTimerTask(3000);
        } else {
            this.mTimerTask = new DetectTimerTask(20000);
        }
        this.mTimerTask.setTimerTaskListener(new DetectTimerTask.TimerListener() {
            public void countdown(final int i) {
                GenenalDialog.this.mHandler.post(new Runnable() {
                    public void run() {
                        if (GenenalDialog.this.mTimerTask == null || !GenenalDialog.this.mTimerTask.isTimeOut()) {
                            if (GenenalDialog.this.mCountTv != null) {
                                TextView access$500 = GenenalDialog.this.mCountTv;
                                StringBuilder sb = new StringBuilder();
                                sb.append(i / 1000);
                                sb.append("S");
                                access$500.setText(sb.toString());
                            }
                        } else if (GenenalDialog.this.mCallback != null) {
                            GenenalDialog.this.mCallback.onTimeOut();
                        }
                    }
                });
            }
        });
        this.mTimerTask.start();
    }

    private void stopTimerTask() {
        DetectTimerTask detectTimerTask = this.mTimerTask;
        if (detectTimerTask != null) {
            detectTimerTask.setTimerTaskListener((DetectTimerTask.TimerListener) null);
            this.mTimerTask.stop();
            this.mTimerTask = null;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopTimerTask();
    }

    public static class Builder {
        private String _cacelButtonText;
        private String _confirmButtonText;
        private Context _context;
        private boolean _isGarfieldFaceless;
        DialogInterface.OnClickListener _negativeListener;
        DialogInterface.OnClickListener _positiveListener;
        private boolean _showCloseButton;
        private boolean _showProtocol;
        private String _subTitle;
        private String _title;

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
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(1131204451, oncanceled);
                onCancelLoad.getMin(1131204451, oncanceled);
            }
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

        public GenenalDialog show() {
            GenenalDialog genenalDialog = new GenenalDialog(this._context, this._title, this._subTitle, this._confirmButtonText, this._positiveListener, this._cacelButtonText, this._negativeListener, this._showCloseButton, this._showProtocol, this._isGarfieldFaceless);
            try {
                genenalDialog.show();
            } catch (Exception unused) {
            }
            return genenalDialog;
        }
    }
}
