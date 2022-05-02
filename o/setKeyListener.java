package o;

import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;

public interface setKeyListener<T extends Entry> extends EmojiEditText<T> {
    Drawable extraCommand();

    float mayLaunchUrl();

    int newSession();

    boolean newSessionWithExtras();

    int warmup();
}
