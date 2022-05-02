package o;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.R;
import o.setH5Page;
import o.setOnMenuWindowDismissListener;

final class ITinyMenuPopupWindow implements RedDotManager {
    private final setH5Page.getMax setMax;

    public ITinyMenuPopupWindow(setH5Page.getMax getmax) {
        this.setMax = getmax;
    }

    public final void accept(Object obj) {
        this.setMax.onFinish();
    }

    public abstract class OnMenuWindowDismissListener<T> extends getDismissAnimationId {
        onDetachedFromLayoutParams getMin;
        private final parseBehavior<T> length;
        private int setMin;

        /* access modifiers changed from: package-private */
        public abstract void getMin(Context context, ImageView imageView);

        OnMenuWindowDismissListener(String str) {
            this(str, (byte) 0);
        }

        private OnMenuWindowDismissListener(String str, byte b) {
            super(str, (setOnMenuWindowDismissListener.length) null);
            this.length = new parseBehavior<T>() {
                public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<T> layoutchildwithanchor, boolean z) {
                    OnMenuWindowDismissListener onMenuWindowDismissListener = OnMenuWindowDismissListener.this;
                    if (onMenuWindowDismissListener.getMin == null) {
                        return false;
                    }
                    onMenuWindowDismissListener.getMin.length();
                    return false;
                }

                public final boolean onResourceReady(T t, Object obj, layoutChildWithAnchor<T> layoutchildwithanchor, DataSource dataSource, boolean z) {
                    if (!z || !dataSource.equals(DataSource.MEMORY_CACHE)) {
                        return false;
                    }
                    OnMenuWindowDismissListener onMenuWindowDismissListener = OnMenuWindowDismissListener.this;
                    if (onMenuWindowDismissListener.getMin == null) {
                        return false;
                    }
                    onMenuWindowDismissListener.getMin.length();
                    return false;
                }
            };
            this.setMin = 0;
        }

        OnMenuWindowDismissListener(String str, @LayoutRes int i, setOnMenuWindowDismissListener.length length2) {
            super(str, length2);
            this.length = new parseBehavior<T>() {
                public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<T> layoutchildwithanchor, boolean z) {
                    OnMenuWindowDismissListener onMenuWindowDismissListener = OnMenuWindowDismissListener.this;
                    if (onMenuWindowDismissListener.getMin == null) {
                        return false;
                    }
                    onMenuWindowDismissListener.getMin.length();
                    return false;
                }

                public final boolean onResourceReady(T t, Object obj, layoutChildWithAnchor<T> layoutchildwithanchor, DataSource dataSource, boolean z) {
                    if (!z || !dataSource.equals(DataSource.MEMORY_CACHE)) {
                        return false;
                    }
                    OnMenuWindowDismissListener onMenuWindowDismissListener = OnMenuWindowDismissListener.this;
                    if (onMenuWindowDismissListener.getMin == null) {
                        return false;
                    }
                    onMenuWindowDismissListener.getMin.length();
                    return false;
                }
            };
            this.setMin = i;
        }

        /* access modifiers changed from: package-private */
        public final parseBehavior<T> setMin() {
            return this.length;
        }

        public final void length(Context context, ImageView imageView) {
            int i = this.setMin;
            if (i <= 0) {
                i = R.layout.view_image_skeleton;
            }
            this.getMin = containsFavoriteMenuItem.getMin(imageView, i);
            getMin(context, imageView);
        }
    }
}
