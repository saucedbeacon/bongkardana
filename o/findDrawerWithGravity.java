package o;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

public abstract class findDrawerWithGravity<T extends Entry> extends dispatchOnDrawerOpened<T> implements EmojiEditText<T> {
    protected DashPathEffect extraCallback;
    protected boolean onMessageChannelReady;
    protected boolean onPostMessage;
    protected float onRelationshipValidationResult;

    public findDrawerWithGravity(List<T> list, String str) {
        super(list, str);
        this.onMessageChannelReady = true;
        this.onPostMessage = true;
        this.onRelationshipValidationResult = 0.5f;
        this.extraCallback = null;
        this.onRelationshipValidationResult = getTargetFragment.setMax(0.5f);
    }

    public final void updateVisuals() {
        this.onPostMessage = false;
    }

    public final boolean requestPostMessageChannel() {
        return this.onMessageChannelReady;
    }

    public final boolean requestPostMessageChannelWithExtras() {
        return this.onPostMessage;
    }

    public final void postMessage() {
        this.onRelationshipValidationResult = getTargetFragment.setMax(64.0f);
    }

    public final float validateRelationship() {
        return this.onRelationshipValidationResult;
    }

    public final DashPathEffect ICustomTabsService$Default() {
        return this.extraCallback;
    }
}
