package id.dana;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.CornerMarkingDataProvider;
import o.PrepareException;
import o.StackBlurManager;
import o.getFrameMarginVertical$core;
import o.isAlipayApp;
import o.setStateOn;
import o.showsIcon;

@Singleton
public class AppLifeCycleObserver implements showsIcon {
    private final getFrameMarginVertical$core getMax;
    private boolean getMin = false;
    public getMax length;
    public ArrayList<setMin> setMax = new ArrayList<>();
    private boolean setMin = true;
    private final isAlipayApp toIntRange;

    public interface getMax {
        void length(boolean z);
    }

    public interface setMin {
        void onHomeClicked();
    }

    @Inject
    public AppLifeCycleObserver(getFrameMarginVertical$core getframemarginvertical_core, isAlipayApp isalipayapp) {
        this.getMax = getframemarginvertical_core;
        this.toIntRange = isalipayapp;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void onAppCreate() {
        if (CornerMarkingDataProvider.IsOverlapping()) {
            if (PrepareException.getMin == null) {
                throw new IllegalStateException("Application components needs to be set in Application");
            } else if (!setStateOn.getMin(PrepareException.getMin.setMax.getMax(), "android.permission.ACCESS_FINE_LOCATION")) {
                return;
            }
        }
        this.toIntRange.setMin(true);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onAppStop() {
        StackBlurManager.toDoubleRange();
        StackBlurManager.toFloatRange();
        this.getMax.setLastActiveTimestamp(Long.valueOf(System.currentTimeMillis()));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onAppPause() {
        this.setMin = true;
        this.getMin = true;
        Iterator<setMin> it = this.setMax.iterator();
        while (it.hasNext()) {
            it.next().onHomeClicked();
        }
        this.getMax.setLastActiveTimestamp(Long.valueOf(System.currentTimeMillis()));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onAppResume() {
        this.setMin = false;
        getMax getmax = this.length;
        if (getmax != null) {
            getmax.length(this.getMin);
            this.getMin = false;
        }
    }

    public final boolean setMax() {
        return this.setMin;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onAppDestroyed() {
        this.getMax.setLastActiveTimestamp(Long.valueOf(System.currentTimeMillis()));
    }
}
