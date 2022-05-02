package o;

import android.app.Notification;
import androidx.annotation.NonNull;

public interface ActivityChooserView {

    public final class InnerLayout {
        public final int getMin;
        public final Notification length;
        public final int setMax;

        public InnerLayout(int i, @NonNull Notification notification, int i2) {
            this.setMax = i;
            this.length = notification;
            this.getMin = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            InnerLayout innerLayout = (InnerLayout) obj;
            if (this.setMax == innerLayout.setMax && this.getMin == innerLayout.getMin) {
                return this.length.equals(innerLayout.length);
            }
            return false;
        }

        public final int hashCode() {
            return (((this.setMax * 31) + this.getMin) * 31) + this.length.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ForegroundInfo{");
            sb.append("mNotificationId=");
            sb.append(this.setMax);
            sb.append(", mForegroundServiceType=");
            sb.append(this.getMin);
            sb.append(", mNotification=");
            sb.append(this.length);
            sb.append('}');
            return sb.toString();
        }
    }
}
