package o;

import id.dana.di.PerActivity;
import id.dana.model.CurrencyAmountModel;
import javax.inject.Inject;
import o.PhotoContext;
import o.interceptH5OptionMenuClick;
import o.parameters;

@PerActivity
public final class getThemeRes implements parameters.setMax {
    private IRedDotManager IsOverlapping;
    private final readData getMax;
    /* access modifiers changed from: private */
    public final parameters.getMin getMin;
    private final interceptH5OptionMenuClick isInside;
    /* access modifiers changed from: private */
    public final PhotoContext.AnonymousClass2 length;
    private final getBluetoothServices setMax;
    onUpdate<stopBleScan> setMin;
    private final GVViewFactory toFloatRange;
    private boolean toIntRange;

    @Inject
    public getThemeRes(parameters.getMin getmin, getBluetoothServices getbluetoothservices, readData readdata, PhotoContext.AnonymousClass2 r4, GVViewFactory gVViewFactory, interceptH5OptionMenuClick intercepth5optionmenuclick) {
        this.getMin = getmin;
        this.setMax = getbluetoothservices;
        this.getMax = readdata;
        this.length = r4;
        this.toFloatRange = gVViewFactory;
        this.isInside = intercepth5optionmenuclick;
        IRedDotManager iRedDotManager = new IRedDotManager();
        this.IsOverlapping = iRedDotManager;
        iRedDotManager.getMin(onDeactivated.setMax().getMax.subscribe(new setWindowConstraints(this)));
    }

    public final void setMin() {
        this.toFloatRange.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                getThemeRes.setMax(getThemeRes.this, (Boolean) obj);
            }
        });
    }

    public final void getMax() {
        this.isInside.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                getThemeRes.this.getMin.onError(th.getMessage());
            }
        }, interceptH5OptionMenuClick.getMax.forBalanceVisibility(!this.toIntRange));
    }

    public final void length() {
        onUpdate<stopBleScan> onupdate = this.setMin;
        if (onupdate != null) {
            onupdate.dispose();
            this.setMin = null;
        }
    }

    public final void setMax() {
        this.setMax.dispose();
        this.getMax.dispose();
        this.IsOverlapping.dispose();
        this.toFloatRange.dispose();
        this.isInside.dispose();
    }

    public final void getMin() {
        onUpdate<stopBleScan> onupdate = this.setMin;
        if (onupdate != null) {
            onupdate.dispose();
            this.setMin = null;
        }
        this.getMin.showProgress();
        readData readdata = this.getMax;
        if (this.setMin == null) {
            this.setMin = new onUpdate<stopBleScan>(this.getMin) {
                public final /* synthetic */ void onNext(Object obj) {
                    stopBleScan stopblescan = (stopBleScan) obj;
                    getThemeRes.this.getMin.dismissProgress();
                    getThemeRes.this.getMin.setMax((CurrencyAmountModel) getThemeRes.this.length.apply(stopblescan));
                    if (!stopblescan.isPlaceholder()) {
                        getThemeRes getthemeres = getThemeRes.this;
                        if (getthemeres.setMin != null) {
                            getthemeres.setMin.dispose();
                            getthemeres.setMin = null;
                        }
                    }
                }

                public final void onError(Throwable th) {
                    getThemeRes.this.getMin.onError(th.getMessage());
                }
            };
        }
        readdata.execute(this.setMin);
    }

    static /* synthetic */ void setMax(getThemeRes getthemeres, Boolean bool) {
        getthemeres.toIntRange = bool.booleanValue();
        getthemeres.getMin.length(bool);
    }

    static /* synthetic */ void getMax(getThemeRes getthemeres, Boolean bool) {
        if (bool.booleanValue()) {
            getthemeres.getMin();
        }
    }
}
