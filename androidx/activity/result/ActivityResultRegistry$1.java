package androidx.activity.result;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import o.IPostMessageService;
import o.areNotificationsEnabled;
import o.setChecked;
import o.setPopupCallback;

public class ActivityResultRegistry$1 implements setPopupCallback {
    final /* synthetic */ areNotificationsEnabled getMax;
    final /* synthetic */ IPostMessageService.Default getMin;
    final /* synthetic */ IPostMessageService.Stub.Proxy length;
    final /* synthetic */ String setMax;

    public ActivityResultRegistry$1(IPostMessageService.Stub.Proxy proxy, String str, IPostMessageService.Default defaultR, areNotificationsEnabled arenotificationsenabled) {
        this.length = proxy;
        this.setMax = str;
        this.getMin = defaultR;
        this.getMax = arenotificationsenabled;
    }

    public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
        if (Lifecycle.Event.ON_START.equals(event)) {
            this.length.IsOverlapping.put(this.setMax, new IPostMessageService.Stub.Proxy.length(this.getMin, this.getMax));
            if (this.length.toIntRange.containsKey(this.setMax)) {
                Object obj = this.length.toIntRange.get(this.setMax);
                this.length.toIntRange.remove(this.setMax);
                this.getMin.onActivityResult(obj);
            }
            ActivityResult activityResult = (ActivityResult) this.length.equals.getParcelable(this.setMax);
            if (activityResult != null) {
                this.length.equals.remove(this.setMax);
                this.getMin.onActivityResult(this.getMax.setMin(activityResult.getMax, activityResult.length));
            }
        } else if (Lifecycle.Event.ON_STOP.equals(event)) {
            this.length.IsOverlapping.remove(this.setMax);
        } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
            this.length.setMax(this.setMax);
        }
    }
}
