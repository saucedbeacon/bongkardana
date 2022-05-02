package o;

import androidx.annotation.Px;
import com.facebook.infer.annotation.ThreadConfined;

@ThreadConfined("ANY")
public interface NotificationCompat$GroupAlertBehavior {
    @Px
    int setMax();

    @Px
    int setMin();
}
