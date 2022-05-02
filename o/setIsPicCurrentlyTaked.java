package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import o.APWebSettings;
import o.PhotoResolver;
import o.PrepareContextUitls;
import o.registerStageMonitor;
import o.setMediaId;

public final class setIsPicCurrentlyTaked implements setMediaId.setMax {
    private final filterCommonResources IsOverlapping;
    private final getDefaultUserAgent getMax;
    /* access modifiers changed from: private */
    public final setMediaId.getMin getMin;
    private final registerStageMonitor isInside;
    private final PrepareContextUitls length;
    /* access modifiers changed from: private */
    public final PhotoResolver.AnonymousClass2 setMax;
    private final APWebSettings.RenderPriority setMin;
    private final transitToError toFloatRange;

    static /* synthetic */ Unit length() {
        return null;
    }

    @Inject
    public setIsPicCurrentlyTaked(setMediaId.getMin getmin, PrepareContextUitls prepareContextUitls, PhotoResolver.AnonymousClass2 r3, APWebSettings.RenderPriority renderPriority, getDefaultUserAgent getdefaultuseragent, transitToError transittoerror, filterCommonResources filtercommonresources, registerStageMonitor registerstagemonitor) {
        this.getMin = getmin;
        this.length = prepareContextUitls;
        this.setMax = r3;
        this.setMin = renderPriority;
        this.getMax = getdefaultuseragent;
        this.toFloatRange = transittoerror;
        this.IsOverlapping = filtercommonresources;
        this.isInside = registerstagemonitor;
    }

    public final void setMin(int i, final int i2) {
        this.length.execute(new GriverAppVirtualHostProxy<List<getMonitorToken>>() {
            public final /* synthetic */ void onNext(Object obj) {
                setMediaId.getMin min = setIsPicCurrentlyTaked.this.getMin;
                PhotoResolver.AnonymousClass2 unused = setIsPicCurrentlyTaked.this.setMax;
                min.getMin(PhotoResolver.AnonymousClass2.getMax((List) obj, i2));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                setIsPicCurrentlyTaked.this.getMin.getMax();
            }
        }, PrepareContextUitls.setMax.forGetRecentRecipient(10, i, i2));
    }

    public final void setMin(String str) {
        this.isInside.dispose();
        this.isInside.execute(registerStageMonitor.getMax.forSearchRecentTransaction(str), new setPhotoOrientation(this), new getPhotoOrientation(this));
    }

    public final void getMax() {
        this.setMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                setIsPicCurrentlyTaked.this.getMin.setMin();
            }
        });
    }

    public final void getMin() {
        this.getMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                setIsPicCurrentlyTaked.this.getMin.setMin(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void setMax() {
        this.length.dispose();
        this.setMin.dispose();
        this.getMax.dispose();
        this.toFloatRange.dispose();
        this.IsOverlapping.dispose();
        this.isInside.dispose();
    }
}
