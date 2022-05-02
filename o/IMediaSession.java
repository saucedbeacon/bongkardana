package o;

import android.app.Notification;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActionBarContainer;

public final class IMediaSession extends Drawable {
    final ActionBarContainer setMin;

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public IMediaSession(ActionBarContainer actionBarContainer) {
        this.setMin = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        if (!this.setMin.mIsSplit) {
            if (this.setMin.mBackground != null) {
                this.setMin.mBackground.draw(canvas);
            }
            if (this.setMin.mStackedBackground != null && this.setMin.mIsStacked) {
                this.setMin.mStackedBackground.draw(canvas);
            }
        } else if (this.setMin.mSplitBackground != null) {
            this.setMin.mSplitBackground.draw(canvas);
        }
    }

    @RequiresApi(21)
    public final void getOutline(@NonNull Outline outline) {
        if (this.setMin.mIsSplit) {
            if (this.setMin.mSplitBackground != null) {
                this.setMin.mSplitBackground.getOutline(outline);
            }
        } else if (this.setMin.mBackground != null) {
            this.setMin.mBackground.getOutline(outline);
        }
    }

    public final class Stub {
        @NonNull
        private final setRepeatMode setMin;

        public final boolean setMin(@NonNull String str, @NonNull PackageManager packageManager) {
            return sendCustomAction.getMax(str, packageManager, this.setMin);
        }

        public final class Proxy {

            public static class getMax {
                public final Notification getMax;
                public final String getMin;
                public final String length;
                public final int setMax;

                public getMax(String str, int i, Notification notification, String str2) {
                    this.getMin = str;
                    this.setMax = i;
                    this.getMax = notification;
                    this.length = str2;
                }
            }

            public static class length {
                public final String getMin;
                public final int length;

                public length(String str, int i) {
                    this.getMin = str;
                    this.length = i;
                }
            }

            public static class setMax {
                public final boolean setMax;

                public setMax(boolean z) {
                    this.setMax = z;
                }
            }

            public static class setMin {
                public final Parcelable[] getMax;

                public setMin(Parcelable[] parcelableArr) {
                    this.getMax = parcelableArr;
                }
            }

            public static class getMin {
                public final String getMax;

                public getMin(String str) {
                    this.getMax = str;
                }
            }
        }
    }
}
