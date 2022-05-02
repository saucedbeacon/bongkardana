package o;

import id.dana.nearbyme.model.ContactAddressModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import o.GriverBaseActivity;
import o.a;

public final class fetchAppList extends setSpeed<H5FileUtil, a.C0056a> {
    private final GriverBaseActivity.Main getMax;
    private final MiniProgramFacade getMin;
    public boolean setMin;

    public final /* synthetic */ Object map(Object obj) {
        List<GriverConfigUtils> shops;
        H5FileUtil h5FileUtil = (H5FileUtil) obj;
        a.C0056a aVar = new a.C0056a();
        if (!(h5FileUtil == null || (shops = h5FileUtil.getShops()) == null)) {
            ArrayList arrayList = new ArrayList();
            if (shops != null) {
                for (GriverConfigUtils next : shops) {
                    if (!this.setMin || !next.isQrisOrKybMerchantWithLessReview()) {
                        arrayList.add(setMax(next));
                    }
                }
            }
            aVar.getMax = arrayList;
            aVar.length = h5FileUtil.getHasMore();
        }
        return aVar;
    }

    @Inject
    public fetchAppList(MiniProgramFacade miniProgramFacade, GriverBaseActivity.Main main) {
        this.getMin = miniProgramFacade;
        this.getMax = main;
    }

    public final ShopModel setMax(GriverConfigUtils griverConfigUtils) {
        ShopModel shopModel = new ShopModel();
        if (griverConfigUtils != null) {
            shopModel.getMin = griverConfigUtils.getBranchName();
            shopModel.setMax = griverConfigUtils.getBrandName();
            shopModel.getMax = griverConfigUtils.getCertStatus();
            shopModel.setMin = setMax(griverConfigUtils.getContactAddresses());
            shopModel.toIntRange = griverConfigUtils.getExternalShopId();
            shopModel.equals = griverConfigUtils.getExtInfo();
            shopModel.values = griverConfigUtils.getLatitude();
            shopModel.toString = griverConfigUtils.getLongtitude();
            shopModel.hashCode = griverConfigUtils.getLogoUrl();
            shopModel.FastBitmap$CoordinateSystem = griverConfigUtils.getLogoUrlMap();
            shopModel.invoke = griverConfigUtils.getMainName();
            shopModel.valueOf = griverConfigUtils.getMccCodes();
            shopModel.Grayscale$Algorithm = griverConfigUtils.getMerchantId();
            shopModel.extraCallbackWithResult = (List) this.getMin.apply(griverConfigUtils.getSubcategories());
            shopModel.getCause = griverConfigUtils.getRegisterSource();
            shopModel.ICustomTabsCallback = griverConfigUtils.getShopDesc();
            shopModel.b = griverConfigUtils.getShopId();
            shopModel.onPostMessage = griverConfigUtils.getShopType();
            shopModel.toFloatRange = griverConfigUtils.getDistance();
            shopModel.onRelationshipValidationResult = griverConfigUtils.getShopStatus();
            shopModel.IsOverlapping = griverConfigUtils.getOfficeNumbers();
            shopModel.toDoubleRange = griverConfigUtils.getInstId();
            double round = (double) Math.round(griverConfigUtils.getRating() * 10.0d);
            Double.isNaN(round);
            shopModel.create = round / 10.0d;
            shopModel.onNavigationEvent = griverConfigUtils.getReviewNumbers();
            shopModel.isInside = griverConfigUtils.getFullDay();
            shopModel.getMax(new ArrayList((Collection) this.getMax.apply(griverConfigUtils.getShopOpenHours())));
            shopModel.invokeSuspend = griverConfigUtils.getMerchantSizeType();
            shopModel.extraCallback = griverConfigUtils.getHasMoreShop();
            shopModel.length(griverConfigUtils.getMerchantName());
            shopModel.onTransact = griverConfigUtils.getTransactionDate();
            shopModel.toFloatRange();
        }
        return shopModel;
    }

    private static List<ContactAddressModel> setMax(List<getMacEncrypt> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (getMacEncrypt length : list) {
                arrayList.add(length(length));
            }
        }
        return arrayList;
    }

    private static ContactAddressModel length(getMacEncrypt getmacencrypt) {
        ContactAddressModel contactAddressModel = new ContactAddressModel();
        if (getmacencrypt != null) {
            contactAddressModel.setMin = getmacencrypt.getAddress1();
            contactAddressModel.length = getmacencrypt.getAddress2();
            contactAddressModel.setMin(getmacencrypt.getArea());
            contactAddressModel.getMin = getmacencrypt.getCity();
            contactAddressModel.getMax = getmacencrypt.getContactAddressId();
            contactAddressModel.setMax = getmacencrypt.getContactAddressType();
            contactAddressModel.isInside = getmacencrypt.getCountry();
            contactAddressModel.IsOverlapping = getmacencrypt.isDefaultAddress();
            contactAddressModel.equals = getmacencrypt.getExtendInfo();
            contactAddressModel.toFloatRange = getmacencrypt.getProvince();
            contactAddressModel.toIntRange = getmacencrypt.isVerified();
            contactAddressModel.FastBitmap$CoordinateSystem = getmacencrypt.getZipcode();
        }
        return contactAddressModel;
    }
}
