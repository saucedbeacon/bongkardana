package o;

import com.bca.xco.widget.connection.httpclient.p;
import java.io.IOException;
import java.util.ArrayList;
import o.Toolbar;

final class setMaxCardElevation implements Toolbar.SavedState {
    getRadius getMax;
    final getCardElevation getMin;
    private boolean setMax;
    final ShareTarget$EncodingType setMin;

    protected setMaxCardElevation(getCardElevation getcardelevation, getRadius getradius) {
        this.getMin = getcardelevation;
        this.getMax = getradius;
        this.setMin = new ShareTarget$EncodingType(getcardelevation);
    }

    public final getPreventCornerOverlap setMax() {
        synchronized (this) {
            if (!this.setMax) {
                this.setMax = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        try {
            this.getMin.length.getMin(this);
            getPreventCornerOverlap min = getMin();
            if (min != null) {
                return min;
            }
            throw new IOException("Canceled");
        } finally {
            setRadius setradius = this.getMin.length;
            setradius.setMin(setradius.getMax, this, false);
        }
    }

    final class length extends CustomTabsIntent$ColorScheme {
        final /* synthetic */ setMaxCardElevation setMin;

        public final void getMax() {
            boolean z;
            try {
                this.setMin.getMin();
                if (this.setMin.setMin.getMax()) {
                    try {
                        new IOException("Canceled");
                    } catch (IOException e) {
                        e = e;
                        z = true;
                    }
                }
                setRadius setradius = this.setMin.getMin.length;
                setradius.setMin(setradius.setMax, this, true);
            } catch (IOException e2) {
                e = e2;
                z = false;
                if (z) {
                    try {
                        PostMessageService max = PostMessageService.getMax();
                        StringBuilder sb = new StringBuilder("Callback failure for ");
                        setMaxCardElevation setmaxcardelevation = this.setMin;
                        String str = setmaxcardelevation.setMin.getMax() ? "canceled call" : "call";
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" to ");
                        p.a min = setmaxcardelevation.getMax.length.getMin("/...");
                        min.setMin = p.getMax("", " \"':;<=>@[]^`{}|/\\?#", false, false);
                        min.getMin = p.getMax("", " \"':;<=>@[]^`{}|/\\?#", false, false);
                        sb2.append(min.getMin().toString());
                        sb.append(sb2.toString());
                        max.setMin(4, sb.toString(), e);
                    } catch (Throwable th) {
                        setRadius setradius2 = this.setMin.getMin.length;
                        setradius2.setMin(setradius2.setMax, this, true);
                        throw th;
                    }
                }
                setRadius setradius3 = this.setMin.getMin.length;
                setradius3.setMin(setradius3.setMax, this, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final getPreventCornerOverlap getMin() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.getMin.getMin);
        arrayList.add(this.setMin);
        arrayList.add(new onUnbind(this.getMin.toFloatRange));
        getCardElevation getcardelevation = this.getMin;
        arrayList.add(new getApplicationContext(getcardelevation.equals != null ? getcardelevation.equals.setMax : getcardelevation.toIntRange));
        arrayList.add(new CustomTabsClient$2(this.getMin));
        if (!this.setMin.getMin()) {
            arrayList.addAll(this.getMin.IsOverlapping);
        }
        arrayList.add(new onGetSmallIconId(this.setMin.getMin()));
        return new getTokenStore(arrayList, (onBind) null, (ScreenOrientation$LockType) null, (getInflatedId) null, 0, this.getMax).setMax(this.getMax);
    }

    public final /* synthetic */ Object clone() {
        return new setMaxCardElevation(this.getMin, this.getMax);
    }
}
