package o;

import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperStateUpdateListener;
import com.facebook.flipper.core.StateSummary;

public interface putExtraData {
    void getMax(FlipperPlugin flipperPlugin);

    String getState();

    StateSummary getStateSummary();

    void setMin(FlipperPlugin flipperPlugin);

    void start();

    void stop();

    void subscribeForUpdates(FlipperStateUpdateListener flipperStateUpdateListener);

    void unsubscribe();
}
