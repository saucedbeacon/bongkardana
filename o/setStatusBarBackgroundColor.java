package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

public final class setStatusBarBackgroundColor {
    private final List<ImageHeaderParser> setMax = new ArrayList();

    @NonNull
    public final synchronized List<ImageHeaderParser> setMax() {
        return this.setMax;
    }

    public final synchronized void getMax(@NonNull ImageHeaderParser imageHeaderParser) {
        this.setMax.add(imageHeaderParser);
    }
}
