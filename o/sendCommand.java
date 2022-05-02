package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import o.onCreateSupportNavigateUpTaskStack;

public final class sendCommand {
    public static boolean setMin(@NonNull TextView textView, int i) {
        ClipData clipData;
        int i2 = 0;
        if ((i != 16908322 && i != 16908337) || ViewCompat.onPostMessage(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            ContentInfoCompat.setMin setmin = new ContentInfoCompat.setMin(clipData, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            ViewCompat.setMin((View) textView, setmin.setMax(i2).length());
        }
        return true;
    }

    public static boolean getMin(@NonNull View view, @NonNull DragEvent dragEvent) {
        Activity max;
        if (Build.VERSION.SDK_INT < 24 || dragEvent.getLocalState() != null || ViewCompat.onPostMessage(view) == null || (max = getMax(view)) == null) {
            return false;
        }
        if (dragEvent.getAction() != 1) {
            if (dragEvent.getAction() == 3) {
                if (view instanceof TextView) {
                    return setMax.length(dragEvent, (TextView) view, max);
                }
                return setMax.getMax(dragEvent, view, max);
            }
            return false;
        } else if (!(view instanceof TextView)) {
            return true;
        } else {
            return false;
        }
    }

    @RequiresApi(24)
    static final class setMax {
        /* JADX INFO: finally extract failed */
        static boolean length(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ViewCompat.setMin((View) textView, new ContentInfoCompat.setMin(dragEvent.getClipData(), 3).length());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean getMax(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            ViewCompat.setMin(view, new ContentInfoCompat.setMin(dragEvent.getClipData(), 3).length());
            return true;
        }
    }

    @Nullable
    static Activity getMax(@NonNull View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @NonNull
    public static onCreateSupportNavigateUpTaskStack.setMin length(@NonNull final View view) {
        return new onCreateSupportNavigateUpTaskStack.setMin() {
            public boolean length(onContentChanged oncontentchanged, int i, Bundle bundle) {
                if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
                    try {
                        oncontentchanged.getMax();
                        InputContentInfo inputContentInfo = (InputContentInfo) oncontentchanged.setMin();
                        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                    } catch (Exception unused) {
                        return false;
                    }
                }
                return ViewCompat.setMin(view, new ContentInfoCompat.setMin(new ClipData(oncontentchanged.setMax(), new ClipData.Item(oncontentchanged.getMin())), 2).length(oncontentchanged.length()).length(bundle).length()) == null;
            }
        };
    }
}
