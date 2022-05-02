package o;

import com.bca.xco.widget.connection.httpclient.p;
import java.util.List;
import o.setLayoutResource;

public final class getTokenStore implements setLayoutResource.getMin {
    private int IsOverlapping;
    private final int equals;
    private final getInflatedId getMax;
    final ScreenOrientation$LockType getMin;
    public final onBind length;
    private final List<setLayoutResource> setMax;
    public final getRadius setMin;

    public getTokenStore(List<setLayoutResource> list, onBind onbind, ScreenOrientation$LockType screenOrientation$LockType, getInflatedId getinflatedid, int i, getRadius getradius) {
        this.setMax = list;
        this.getMax = getinflatedid;
        this.length = onbind;
        this.getMin = screenOrientation$LockType;
        this.equals = i;
        this.setMin = getradius;
    }

    public final getRadius setMax() {
        return this.setMin;
    }

    public final getPreventCornerOverlap setMax(getRadius getradius) {
        return setMax(getradius, this.length, this.getMin, this.getMax);
    }

    public final getPreventCornerOverlap setMax(getRadius getradius, onBind onbind, ScreenOrientation$LockType screenOrientation$LockType, getInflatedId getinflatedid) {
        if (this.equals < this.setMax.size()) {
            this.IsOverlapping++;
            if (this.getMin != null && !length(getradius.length)) {
                StringBuilder sb = new StringBuilder("network interceptor ");
                sb.append(this.setMax.get(this.equals - 1));
                sb.append(" must retain the same host and port");
                throw new IllegalStateException(sb.toString());
            } else if (this.getMin == null || this.IsOverlapping <= 1) {
                getTokenStore gettokenstore = new getTokenStore(this.setMax, onbind, screenOrientation$LockType, getinflatedid, this.equals + 1, getradius);
                setLayoutResource setlayoutresource = this.setMax.get(this.equals);
                getPreventCornerOverlap max = setlayoutresource.getMax(gettokenstore);
                if (screenOrientation$LockType != null && this.equals + 1 < this.setMax.size() && gettokenstore.IsOverlapping != 1) {
                    StringBuilder sb2 = new StringBuilder("network interceptor ");
                    sb2.append(setlayoutresource);
                    sb2.append(" must call proceed() exactly once");
                    throw new IllegalStateException(sb2.toString());
                } else if (max != null) {
                    return max;
                } else {
                    StringBuilder sb3 = new StringBuilder("interceptor ");
                    sb3.append(setlayoutresource);
                    sb3.append(" returned null");
                    throw new NullPointerException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder("network interceptor ");
                sb4.append(this.setMax.get(this.equals - 1));
                sb4.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb4.toString());
            }
        } else {
            throw new AssertionError();
        }
    }

    private boolean length(p pVar) {
        return pVar.setMax.equals(this.getMax.setMin().length.setMax.setMax) && pVar.getMax == this.getMax.setMin().length.setMax.getMax;
    }
}
