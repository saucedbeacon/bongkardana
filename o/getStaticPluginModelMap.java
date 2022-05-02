package o;

import id.dana.di.modules.MerchantModule;
import id.dana.nearbyme.summary.MerchantListView;
import o.GetAboutInfoResult;
import o.PrepareException;

public final class getStaticPluginModelMap implements isEnabled {
    private final PrepareException.AnonymousClass1 setMax;
    private final MerchantModule setMin;

    public /* synthetic */ getStaticPluginModelMap(MerchantModule merchantModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(merchantModule, r2);
    }

    private getStaticPluginModelMap(MerchantModule merchantModule, PrepareException.AnonymousClass1 r2) {
        this.setMin = merchantModule;
        this.setMax = r2;
    }

    public static final class length {
        public MerchantModule length;
        public PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    public final void getMin(MerchantListView merchantListView) {
        MerchantModule merchantModule = this.setMin;
        GetAboutInfoResult.getMin min = castToShort.getMin(this.setMin);
        appxLoadFailed length2 = this.setMax.length();
        if (length2 != null) {
            appxLoadFailed appxloadfailed = length2;
            getScheme min2 = this.setMax.getMin();
            if (min2 != null) {
                getScheme getscheme = min2;
                workerType smallIconBitmap = this.setMax.getSmallIconBitmap();
                if (smallIconBitmap != null) {
                    deployVersion deployversion = new deployVersion(appxloadfailed, getscheme, smallIconBitmap);
                    appxLoadFailed length3 = this.setMax.length();
                    if (length3 != null) {
                        appxLoadFailed appxloadfailed2 = length3;
                        getScheme min3 = this.setMax.getMin();
                        if (min3 != null) {
                            getScheme getscheme2 = min3;
                            setDefaultFontSize updateVisuals = this.setMax.updateVisuals();
                            if (updateVisuals != null) {
                                env env = new env(appxloadfailed2, getscheme2, updateVisuals);
                                workerType smallIconBitmap2 = this.setMax.getSmallIconBitmap();
                                if (smallIconBitmap2 != null) {
                                    requestUrl requesturl = new requestUrl(smallIconBitmap2);
                                    l lVar = new l();
                                    workerType smallIconBitmap3 = this.setMax.getSmallIconBitmap();
                                    if (smallIconBitmap3 != null) {
                                        o.setMax(merchantListView, castToBigInteger.getMin(merchantModule, new getLastModifiedDate(min, deployversion, env, requesturl, lVar, new GriverTransport(smallIconBitmap3))));
                                        return;
                                    }
                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
