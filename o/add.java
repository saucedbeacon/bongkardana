package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import o.addSubMenu;

public class add {

    public static class getMin extends NotificationCompat.getMax {
        PendingIntent IsOverlapping;
        MediaSessionCompat.Token isInside;
        int[] setMax = null;
        boolean toFloatRange;

        public getMin getMin(int... iArr) {
            this.setMax = iArr;
            return this;
        }

        public getMin setMin(MediaSessionCompat.Token token) {
            this.isInside = token;
            return this;
        }

        public getMin getMin(boolean z) {
            if (Build.VERSION.SDK_INT < 21) {
                this.toFloatRange = z;
            }
            return this;
        }

        public getMin length(PendingIntent pendingIntent) {
            this.IsOverlapping = pendingIntent;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void length(enumMapping enummapping) {
            if (Build.VERSION.SDK_INT >= 21) {
                enummapping.setMax().setStyle(length(new Notification.MediaStyle()));
            } else if (this.toFloatRange) {
                enummapping.setMax().setOngoing(true);
            }
        }

        /* access modifiers changed from: package-private */
        @RequiresApi(21)
        public Notification.MediaStyle length(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.setMax;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.isInside;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.setMin());
            }
            return mediaStyle;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews getMax(enumMapping enummapping) {
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            return length();
        }

        /* access modifiers changed from: package-private */
        public RemoteViews length() {
            int i;
            RemoteViews max = getMax(false, getMax(), true);
            int size = this.length.setMax.size();
            int[] iArr = this.setMax;
            if (iArr == null) {
                i = 0;
            } else {
                i = Math.min(iArr.length, 3);
            }
            max.removeAllViews(addSubMenu.setMin.getMax);
            if (i > 0) {
                int i2 = 0;
                while (i2 < i) {
                    if (i2 < size) {
                        max.addView(addSubMenu.setMin.getMax, length(this.length.setMax.get(this.setMax[i2])));
                        i2++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                    }
                }
            }
            if (this.toFloatRange) {
                max.setViewVisibility(addSubMenu.setMin.length, 8);
                max.setViewVisibility(addSubMenu.setMin.setMax, 0);
                max.setOnClickPendingIntent(addSubMenu.setMin.setMax, this.IsOverlapping);
                max.setInt(addSubMenu.setMin.setMax, "setAlpha", this.length.getMax.getResources().getInteger(addSubMenu.length.length));
            } else {
                max.setViewVisibility(addSubMenu.setMin.length, 0);
                max.setViewVisibility(addSubMenu.setMin.setMax, 8);
            }
            return max;
        }

        private RemoteViews length(NotificationCompat.Action action) {
            boolean z = action.setMax() == null;
            RemoteViews remoteViews = new RemoteViews(this.length.getMax.getPackageName(), addSubMenu.getMin.getMax);
            remoteViews.setImageViewResource(addSubMenu.setMin.setMin, action.getMin());
            if (!z) {
                remoteViews.setOnClickPendingIntent(addSubMenu.setMin.setMin, action.setMax());
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(addSubMenu.setMin.setMin, action.setMin());
            }
            return remoteViews;
        }

        /* access modifiers changed from: package-private */
        public int getMax() {
            return addSubMenu.getMin.setMin;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteViews setMin(enumMapping enummapping) {
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            return setMin();
        }

        /* access modifiers changed from: package-private */
        public RemoteViews setMin() {
            int min = Math.min(this.length.setMax.size(), 5);
            RemoteViews max = getMax(false, setMax(min), false);
            max.removeAllViews(addSubMenu.setMin.getMax);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    max.addView(addSubMenu.setMin.getMax, length(this.length.setMax.get(i)));
                }
            }
            if (this.toFloatRange) {
                max.setViewVisibility(addSubMenu.setMin.setMax, 0);
                max.setInt(addSubMenu.setMin.setMax, "setAlpha", this.length.getMax.getResources().getInteger(addSubMenu.length.length));
                max.setOnClickPendingIntent(addSubMenu.setMin.setMax, this.IsOverlapping);
            } else {
                max.setViewVisibility(addSubMenu.setMin.setMax, 8);
            }
            return max;
        }

        /* access modifiers changed from: package-private */
        public int setMax(int i) {
            return i <= 3 ? addSubMenu.getMin.setMax : addSubMenu.getMin.length;
        }
    }
}
