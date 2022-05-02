package o;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;

public interface parseBehavior<R> {
    boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<R> layoutchildwithanchor, boolean z);

    boolean onResourceReady(R r, Object obj, layoutChildWithAnchor<R> layoutchildwithanchor, DataSource dataSource, boolean z);
}
