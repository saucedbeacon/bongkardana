package o;

import id.dana.data.userconfig.BiztypeEmptyException;
import id.dana.data.userconfig.BiztypeNotFoundException;
import javax.inject.Inject;
import o.CycledLeScannerForJellyBeanMr2;
import o.CycledLeScannerForLollipop;
import o.ToolUtils;

public final class getResourceId implements ToolUtils.setMin {
    private final CycledLeScannerForJellyBeanMr2.AnonymousClass1 getMax;
    private final CycledLeScannerForLollipop.AnonymousClass2 getMin;
    private final CycledLeScannerForLollipop.AnonymousClass3 length;
    /* access modifiers changed from: private */
    public final ToolUtils.length setMax;

    @Inject
    public getResourceId(ToolUtils.length length2, CycledLeScannerForLollipop.AnonymousClass3 r2, CycledLeScannerForLollipop.AnonymousClass2 r3, CycledLeScannerForJellyBeanMr2.AnonymousClass1 r4) {
        this.setMax = length2;
        this.length = r2;
        this.getMin = r3;
        this.getMax = r4;
    }

    public final void getMax() {
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                getResourceId.this.setMax.getMin(((Boolean) obj).booleanValue());
            }

            public final void onError(Throwable th) {
                getResourceId.this.setMax.getMin((th instanceof BiztypeEmptyException) || (th instanceof BiztypeNotFoundException));
            }
        });
    }

    public final void setMin() {
        this.getMin.execute(new setAutoRefreshing());
    }

    public final void setMax() {
        this.length.dispose();
        this.getMax.dispose();
    }
}
