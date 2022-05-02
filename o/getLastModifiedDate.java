package o;

import androidx.annotation.VisibleForTesting;
import id.dana.domain.merchant.MerchantCategoryType;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Unit;
import o.GetAboutInfoResult;
import o.GriverRVTransortServiceImpl;
import o.TitleBarRightButtonView;
import o.g;
import o.requestUrl;
import org.jetbrains.annotations.NotNull;

public final class getLastModifiedDate implements GetAboutInfoResult.getMax {
    private IRedDotManager IsOverlapping = new IRedDotManager();
    /* access modifiers changed from: private */
    public final l equals;
    private final deployVersion getMax;
    /* access modifiers changed from: private */
    public final GetAboutInfoResult.getMin getMin;
    private IComponent<List<ShopModel>> isInside = IComponent.setMax();
    private final env length;
    private final requestUrl setMax;
    final GriverTransport setMin;
    private List<ShopModel> toFloatRange = new ArrayList();
    private IComponent<List<g.AnonymousClass1>> toIntRange = IComponent.setMax();

    static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 getMin(TitleBarRightButtonView.AnonymousClass1 r0) {
        return r0;
    }

    @Inject
    public getLastModifiedDate(GetAboutInfoResult.getMin getmin, deployVersion deployversion, env env, requestUrl requesturl, l lVar, GriverTransport griverTransport) {
        this.getMin = getmin;
        this.getMax = deployversion;
        this.setMax = requesturl;
        this.equals = lVar;
        this.length = env;
        this.setMin = griverTransport;
    }

    public final void setMin() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = TitleBarRightButtonView.AnonymousClass1.combineLatest(this.toIntRange, this.isInside, new AMCSConfigByKeysRpcRequest(this)).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).flatMap(setLastModifiedDate.setMin);
        GetAboutInfoResult.getMin getmin = this.getMin;
        Objects.requireNonNull(getmin);
        this.IsOverlapping.getMin(flatMap.subscribe((RedDotManager<? super R>) new GetAboutInfoRequest(getmin)));
    }

    /* access modifiers changed from: private */
    @VisibleForTesting
    public static boolean setMax(g.AnonymousClass1 r1, List<ShopModel> list) {
        for (ShopModel length2 : list) {
            if (length2.length(r1)) {
                return true;
            }
        }
        return false;
    }

    public final void getMax() {
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                Boolean bool = (Boolean) obj;
                getLastModifiedDate.this.getMin.onCheckMerchantFilterFeatureEnableSuccess(bool.booleanValue());
                if (bool.booleanValue()) {
                    getLastModifiedDate getlastmodifieddate = getLastModifiedDate.this;
                    getlastmodifieddate.setMin.execute(Unit.INSTANCE, new addParameter(getlastmodifieddate), addParameters.getMin);
                }
            }
        });
    }

    public final void getMin() {
        this.getMin.showProgress();
        this.getMax.execute(new GriverAppVirtualHostProxy<List<GriverRVTransortServiceImpl.AnonymousClass1>>() {
            public final /* synthetic */ void onNext(Object obj) {
                getLastModifiedDate.this.getMin.dismissProgress();
                getLastModifiedDate.this.getMin.onGetMerchantCategories((List) getLastModifiedDate.this.equals.apply((List) obj));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                getLastModifiedDate.this.getMin.dismissProgress();
                getLastModifiedDate.this.getMin.onError(th.getMessage());
            }
        });
    }

    private void setMax(@NotNull MerchantCategoryType merchantCategoryType) {
        this.getMin.showProgress();
        this.setMax.execute(new requestUrl.setMin(merchantCategoryType), new AMCSConfigRpcResult(this, merchantCategoryType), new AMCSConfigKeyDetails(this, merchantCategoryType));
    }

    public final void getMax(@NotNull List<ShopModel> list, int i) {
        if (i == 1) {
            this.toFloatRange.clear();
        }
        this.toFloatRange.addAll(list);
        this.isInside.onNext(this.toFloatRange);
    }

    public final void setMax() {
        this.getMax.dispose();
        this.setMax.dispose();
        this.setMin.dispose();
        this.length.dispose();
        this.IsOverlapping.dispose();
    }

    static /* synthetic */ Unit setMax(getLastModifiedDate getlastmodifieddate) {
        getlastmodifieddate.setMax(MerchantCategoryType.LIST);
        getlastmodifieddate.setMax(MerchantCategoryType.MAPS);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit getMax(getLastModifiedDate getlastmodifieddate, MerchantCategoryType merchantCategoryType, List list) {
        ArrayList arrayList = new ArrayList(list);
        if (merchantCategoryType == MerchantCategoryType.LIST) {
            getlastmodifieddate.getMin.getMin((List) getlastmodifieddate.equals.apply(arrayList));
        } else {
            getlastmodifieddate.toIntRange.onNext((List) getlastmodifieddate.equals.apply(arrayList));
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ TitleBarRightButtonView.AnonymousClass1 length(getLastModifiedDate getlastmodifieddate, List list, List list2) {
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list3 = TitleBarRightButtonView.AnonymousClass1.fromIterable(list).filter(new AMCSConfigRpcRequest(getlastmodifieddate, list2)).toList();
        if (list3 instanceof getSecondFloorView) {
            return ((getSecondFloorView) list3).setMax();
        }
        setTitleLoading settitleloading = new setTitleLoading(list3);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
    }

    static /* synthetic */ Unit setMax(Throwable th) {
        StringBuilder sb = new StringBuilder("initNewMerchantCategories: ");
        sb.append(th.getMessage());
        updateActionSheetContent.e("Nearby", sb.toString());
        return Unit.INSTANCE;
    }
}
