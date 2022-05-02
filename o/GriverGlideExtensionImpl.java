package o;

import id.dana.sendmoney.model.RecentContactModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.GriverResourcePreset;
import o.onLoadFailed;

public final class GriverGlideExtensionImpl extends registerCallback implements onLoadFailed.setMax {
    private final GriverResourcePreset.AnonymousClass2 getMax;
    /* access modifiers changed from: private */
    public final setMinPhotoWidth length;
    /* access modifiers changed from: private */
    public final onLoadFailed.length setMin;

    @Inject
    public GriverGlideExtensionImpl(onLoadFailed.length length2, GriverResourcePreset.AnonymousClass2 r2, setMinPhotoWidth setminphotowidth) {
        this.setMin = length2;
        this.getMax = r2;
        this.length = setminphotowidth;
    }

    public final void getMax() {
        this.getMax.execute(new GriverAppVirtualHostProxy<List<getErrorStatusPageUrl>>() {
            public final /* synthetic */ void onNext(Object obj) {
                onLoadFailed.length max = GriverGlideExtensionImpl.this.setMin;
                setMinPhotoWidth unused = GriverGlideExtensionImpl.this.length;
                max.length(setMinPhotoWidth.getMin((List) obj));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                GriverGlideExtensionImpl.this.setMin.length((List<RecentContactModel>) null);
            }
        });
        this.setMin.length(new ArrayList());
    }

    public final void setMax() {
        this.getMax.dispose();
    }
}
