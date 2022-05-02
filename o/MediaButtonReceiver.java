package o;

import android.content.Intent;
import com.google.zxing.client.android.Intents;

public final class MediaButtonReceiver implements Runnable {
    private final applyOptions setMin;

    public MediaButtonReceiver(applyOptions applyoptions) {
        this.setMin = applyoptions;
    }

    public final void run() {
        applyOptions applyoptions = this.setMin;
        Intent intent = new Intent(Intents.Scan.ACTION);
        intent.putExtra(Intents.Scan.TIMEOUT, true);
        applyoptions.length.setResult(0, intent);
        applyoptions.setMin();
    }
}
