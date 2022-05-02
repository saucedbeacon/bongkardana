package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.annotation.NonNull;
import ru.noties.markwon.spans.LinkSpan;

public final class cleanExpiresFile implements LinkSpan.getMax {
    public final void setMin(View view, @NonNull String str) {
        Uri parse = Uri.parse(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
