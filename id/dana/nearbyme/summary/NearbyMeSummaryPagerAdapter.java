package id.dana.nearbyme.summary;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import id.dana.nearbyme.model.ShopModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import o.onLevelChange;

public final class NearbyMeSummaryPagerAdapter extends onLevelChange {
    private FragmentManager getMax;
    private List<ShopModel> length;
    private String setMin;

    @Retention(RetentionPolicy.SOURCE)
    public @interface NearbyMeSummaryState {
        public static final String EMPTY = "empty";
        public static final String ERROR = "error";
        public static final String LOADING = "loading";
        public static final String NORMAL = "normal";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getCount() {
        /*
            r3 = this;
            java.lang.String r0 = r3.setMin
            int r1 = r0.hashCode()
            r2 = 1
            switch(r1) {
                case -1039745817: goto L_0x0029;
                case 96634189: goto L_0x001f;
                case 96784904: goto L_0x0015;
                case 336650556: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r1 = "loading"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0015:
            java.lang.String r1 = "error"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x001f:
            java.lang.String r1 = "empty"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x0029:
            java.lang.String r1 = "normal"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            if (r0 == 0) goto L_0x0037
            return r2
        L_0x0037:
            java.util.List<id.dana.nearbyme.model.ShopModel> r0 = r3.length
            int r0 = r0.size()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.summary.NearbyMeSummaryPagerAdapter.getCount():int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment getMax(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.setMin
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case -1039745817: goto L_0x002a;
                case 96634189: goto L_0x0020;
                case 96784904: goto L_0x0016;
                case 336650556: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r1 = "loading"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0016:
            java.lang.String r1 = "error"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r1 = "empty"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0035
        L_0x002a:
            java.lang.String r1 = "normal"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x0045
            if (r0 == r2) goto L_0x0040
            id.dana.nearbyme.summary.NearbyMeSummaryFragment r5 = id.dana.nearbyme.summary.NearbyMeSummaryFragment.getMax()
            return r5
        L_0x0040:
            id.dana.nearbyme.summary.NearbyMeSummaryFragment r5 = id.dana.nearbyme.summary.NearbyMeSummaryFragment.equals()
            return r5
        L_0x0045:
            id.dana.nearbyme.summary.NearbyMeSummaryFragment r5 = id.dana.nearbyme.summary.NearbyMeSummaryFragment.toDoubleRange()
            return r5
        L_0x004a:
            java.util.List<id.dana.nearbyme.model.ShopModel> r0 = r4.length
            java.lang.Object r0 = r0.get(r5)
            id.dana.nearbyme.model.ShopModel r0 = (id.dana.nearbyme.model.ShopModel) r0
            id.dana.nearbyme.summary.NearbyMeSummaryFragment r5 = id.dana.nearbyme.summary.NearbyMeSummaryFragment.getMax((int) r5, (id.dana.nearbyme.model.ShopModel) r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.summary.NearbyMeSummaryPagerAdapter.getMax(int):androidx.fragment.app.Fragment");
    }

    public final int getItemPosition(@NonNull Object obj) {
        if (!(obj instanceof NearbyMeSummaryFragment)) {
            return -1;
        }
        NearbyMeSummaryFragment nearbyMeSummaryFragment = (NearbyMeSummaryFragment) obj;
        FragmentManager fragmentManager = this.getMax;
        return (fragmentManager == null || fragmentManager.getMin.getMin().isEmpty() || !length(this.getMax.getMin.getMin().indexOf(nearbyMeSummaryFragment)) || nearbyMeSummaryFragment.FastBitmap$CoordinateSystem()) ? -1 : -2;
    }

    private boolean length(int i) {
        ShopModel shopModel;
        if (i == -1 || i >= this.length.size() || (shopModel = this.length.get(i)) == null || !shopModel.equals()) {
            return false;
        }
        return true;
    }
}
