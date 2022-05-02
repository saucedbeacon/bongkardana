package o;

import android.content.Context;
import id.dana.R;
import id.dana.richview.boundcard.model.BoundCard;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.GriverOpenAuthExtension;
import o.ToastUtils;
import o.setColorSchemeColors;
import o.useHttpAuthUsernamePassword;

public final class setOnChildScrollUpCallback implements setColorSchemeColors.length {
    /* access modifiers changed from: private */
    public final setColorSchemeColors.getMin IsOverlapping;
    private final useHttpAuthUsernamePassword equals;
    private final getJavaScriptEnabled getMax;
    private final APJsResult getMin;
    /* access modifiers changed from: private */
    public Context isInside;
    private final GriverOpenAuthExtension.RevokeCallback length;
    private final isRegionStatePersistenceEnabled setMax;
    /* access modifiers changed from: private */
    public final CaptureServiceImpl setMin;

    @Inject
    public setOnChildScrollUpCallback(Context context, setColorSchemeColors.getMin getmin, CaptureServiceImpl captureServiceImpl, APJsResult aPJsResult, GriverOpenAuthExtension.RevokeCallback revokeCallback, isRegionStatePersistenceEnabled isregionstatepersistenceenabled, useHttpAuthUsernamePassword usehttpauthusernamepassword, getJavaScriptEnabled getjavascriptenabled) {
        this.IsOverlapping = getmin;
        this.isInside = context;
        this.setMin = captureServiceImpl;
        this.getMin = aPJsResult;
        this.length = revokeCallback;
        this.setMax = isregionstatepersistenceenabled;
        this.equals = usehttpauthusernamepassword;
        this.getMax = getjavascriptenabled;
    }

    public final void setMax() {
        this.getMin.dispose();
        this.length.dispose();
        this.setMax.dispose();
        this.equals.dispose();
        this.getMax.dispose();
    }

    public final void length() {
        this.setMax.execute(new GriverAppVirtualHostProxy<getPowerCorrection>() {
            public final /* synthetic */ void onNext(Object obj) {
                getPowerCorrection getpowercorrection = (getPowerCorrection) obj;
                setColorSchemeColors.getMin length = setOnChildScrollUpCallback.this.IsOverlapping;
                CaptureServiceImpl unused = setOnChildScrollUpCallback.this.setMin;
                ArrayList arrayList = new ArrayList();
                arrayList.add(CaptureServiceImpl.setMax(getpowercorrection));
                for (int i = 1; i < getpowercorrection.getPayOptions().size(); i++) {
                    if (getpowercorrection.getPayOptions().get(i).getPayMethodView().getPayCardOptionViews() != null) {
                        getIdentifierByteCount getidentifierbytecount = getpowercorrection.getPayOptions().get(i);
                        UCUtils payMethodView = getidentifierbytecount.getPayMethodView();
                        List<getAbsoluteUrlV2> payCardOptionViews = payMethodView.getPayCardOptionViews();
                        List<ToastUtils.TYPE> payChannelOptionViews = payMethodView.getPayChannelOptionViews();
                        for (int i2 = 0; i2 < payCardOptionViews.size(); i2++) {
                            getAbsoluteUrlV2 getabsoluteurlv2 = payCardOptionViews.get(i2);
                            BoundCard boundCard = new BoundCard();
                            boundCard.toDoubleRange = getabsoluteurlv2.getMaskedCardNo();
                            boundCard.values = CaptureServiceImpl.setMax(payChannelOptionViews);
                            boundCard.setMin = getabsoluteurlv2.getCardScheme();
                            boundCard.equals = getabsoluteurlv2.getExpiryMonth();
                            boundCard.toFloatRange = getabsoluteurlv2.getExpiryYear();
                            boundCard.toIntRange = Boolean.valueOf(getabsoluteurlv2.isEnableStatus());
                            boundCard.IsOverlapping = getabsoluteurlv2.getInstId();
                            boundCard.getMax = getabsoluteurlv2.getCardIndexNo();
                            boundCard.isInside = getabsoluteurlv2.getInstName();
                            boundCard.FastBitmap$CoordinateSystem = getidentifierbytecount.getPayMethod();
                            boundCard.hashCode = getabsoluteurlv2.isPayWithoutCVV();
                            boundCard.setMax = getabsoluteurlv2.getAssetType();
                            arrayList.add(boundCard);
                        }
                    }
                }
                length.onGetBoundCardsSuccess(arrayList);
            }

            public final void onError(Throwable th) {
                setOnChildScrollUpCallback.this.IsOverlapping.onErrorGetCard(setOnChildScrollUpCallback.this.isInside.getString(R.string.general_error_msg));
            }
        });
    }

    public final void getMin() {
        this.getMin.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(Object obj) {
                String str = (String) obj;
                super.onNext(str);
                setOnChildScrollUpCallback.this.IsOverlapping.onGetDefaultCardSuccess(str);
            }

            public final void onError(Throwable th) {
                super.onError(th);
            }
        });
    }

    public final void getMax() {
        this.length.execute(new GriverAppVirtualHostProxy<String>() {
            public final void onError(Throwable th) {
            }

            public final /* synthetic */ void onNext(Object obj) {
                setOnChildScrollUpCallback.this.IsOverlapping.onGetPhoneNumberSuccess((String) obj);
            }
        });
    }

    public final void getMax(String str) {
        this.equals.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
            }
        }, useHttpAuthUsernamePassword.getMax.forDefaultCard(str));
    }

    public final void setMin() {
        this.getMax.execute(new GriverAppVirtualHostProxy<setAPWebViewListener>() {
            public final /* synthetic */ void onNext(Object obj) {
                setOnChildScrollUpCallback.this.IsOverlapping.onCheckEnableExpressPayFeature(Boolean.valueOf(((setAPWebViewListener) obj).isEnableInP2P()));
            }
        });
    }
}
