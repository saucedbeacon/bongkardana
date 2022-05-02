package com.facebook.litho;

import android.graphics.Rect;
import androidx.annotation.VisibleForTesting;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Collections;
import java.util.List;
import o.NotificationCompat$Action$SemanticAction;

@DoNotStrip
public class TestItem {
    public ComponentHost getMax;
    public String getMin;
    public final Rect length = new Rect();
    public AcquireKey setMax;
    public Object setMin;

    @DoNotStrip
    public static final class AcquireKey {
    }

    @DoNotStrip
    @VisibleForTesting
    public String getTestKey() {
        return this.getMin;
    }

    @DoNotStrip
    @VisibleForTesting
    public Rect getBounds() {
        return this.length;
    }

    @DoNotStrip
    @VisibleForTesting
    public ComponentHost getHost() {
        return this.getMax;
    }

    @DoNotStrip
    public AcquireKey getAcquireKey() {
        return this.setMax;
    }

    @DoNotStrip
    public void setAcquired() {
        this.setMax = new AcquireKey();
    }

    @DoNotStrip
    @VisibleForTesting
    public String getTextContent() {
        List<CharSequence> textItems = NotificationCompat$Action$SemanticAction.setMin(Collections.singletonList(this.setMin)).getTextItems();
        StringBuilder sb = new StringBuilder();
        int size = textItems.size();
        for (int i = 0; i < size; i++) {
            sb.append(textItems.get(i));
        }
        return sb.toString();
    }
}
