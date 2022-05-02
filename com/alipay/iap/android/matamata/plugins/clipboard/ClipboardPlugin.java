package com.alipay.iap.android.matamata.plugins.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperReceiver;
import o.dispatchKeyShortcutEvent;
import o.getExtraData;

public class ClipboardPlugin implements FlipperPlugin {
    public static final String ID = "Clipboard";
    @Nullable
    private dispatchKeyShortcutEvent mConnection;
    /* access modifiers changed from: private */
    @NonNull
    public final Context mContext;

    public String getId() {
        return ID;
    }

    public boolean runInBackground() {
        return true;
    }

    public ClipboardPlugin(@NonNull Context context) {
        this.mContext = context;
    }

    public void onConnect(dispatchKeyShortcutEvent dispatchkeyshortcutevent) throws Exception {
        this.mConnection = dispatchkeyshortcutevent;
        dispatchkeyshortcutevent.receive("clipboard", new FlipperReceiver() {
            public void onReceive(FlipperObject flipperObject, getExtraData getextradata) {
                final String str;
                if (flipperObject.setMax.isNull("text")) {
                    str = null;
                } else {
                    str = flipperObject.setMax.optString("text");
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        ClipboardManager clipboardManager = (ClipboardManager) ClipboardPlugin.this.mContext.getSystemService("clipboard");
                        if (clipboardManager != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("from_mata_mata", str));
                            Context access$000 = ClipboardPlugin.this.mContext;
                            StringBuilder sb = new StringBuilder("Text ");
                            sb.append(str);
                            sb.append(" is copied to clipboard");
                            Toast.makeText(access$000, sb.toString(), 0).show();
                        }
                    }
                });
            }
        });
    }

    public void onDisconnect() throws Exception {
        this.mConnection = null;
    }
}
