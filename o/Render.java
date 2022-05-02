package o;

import com.alibaba.fastjson.annotation.JSONField;
import id.dana.domain.nearbyme.model.MerchantStatusEnum;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.EngineUtils;
import o.FileCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Render {
    private String branchName;
    private String brandName;
    private String certStatus;
    private List<EngineUtils.AnonymousClass2> contactAddresses;
    private Map<String, String> extInfo;
    private String externalShopId;
    private boolean fullDay;
    private boolean hasMoreShops = false;
    private double latitude;
    private String logoUrl;
    private Map<String, String> logoUrlMap;
    private double longtitude;
    private String mainName;
    private List<String> mccCodes;
    private String merchantId;
    private String merchantName;
    private String merchantSizeType;
    private List<String> officeNumbers;
    private List<setScrollChangedCallback> promoInfos;
    private double rating;
    private String registerSource;
    @JSONField(alternateNames = {"reviewNumbers"}, name = "reviewNumber")
    private double reviewNumber;
    private String shopDesc;
    private String shopId;
    private List<getInstanceId> shopOpenHours;
    private MerchantStatusEnum shopStatus;
    private String shopType;
    private Long transactionDate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lid/dana/data/nearbyme/model/TagEntity;", "", "id", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "toTag", "Lid/dana/domain/nearbyme/model/Tag;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class CaptureRange {
        @Nullable
        private final String description;
        @Nullable

        /* renamed from: id  reason: collision with root package name */
        private final String f9915id;

        public static /* synthetic */ CaptureRange copy$default(CaptureRange captureRange, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = captureRange.f9915id;
            }
            if ((i & 2) != 0) {
                str2 = captureRange.description;
            }
            return captureRange.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.f9915id;
        }

        @Nullable
        public final String component2() {
            return this.description;
        }

        @NotNull
        public final CaptureRange copy(@Nullable String str, @Nullable String str2) {
            return new CaptureRange(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CaptureRange)) {
                return false;
            }
            CaptureRange captureRange = (CaptureRange) obj;
            return Intrinsics.areEqual((Object) this.f9915id, (Object) captureRange.f9915id) && Intrinsics.areEqual((Object) this.description, (Object) captureRange.description);
        }

        public final int hashCode() {
            String str = this.f9915id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.description;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("TagEntity(id=");
            sb.append(this.f9915id);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(")");
            return sb.toString();
        }

        public CaptureRange(@Nullable String str, @Nullable String str2) {
            this.f9915id = str;
            this.description = str2;
        }

        @Nullable
        public final String getId() {
            return this.f9915id;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final getExtensionFromMimeType toTag() {
            String str = this.f9915id;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = this.description;
            if (str3 != null) {
                str2 = str3;
            }
            return new getExtensionFromMimeType(str, str2);
        }
    }

    public List<String> getOfficeNumbers() {
        return this.officeNumbers;
    }

    public void setOfficeNumbers(List<String> list) {
        this.officeNumbers = list;
    }

    public boolean getFullDay() {
        return this.fullDay;
    }

    public void setFullDay(boolean z) {
        this.fullDay = z;
    }

    public List<getInstanceId> getShopOpenHours() {
        return this.shopOpenHours;
    }

    public void setShopOpenHours(List<getInstanceId> list) {
        this.shopOpenHours = list;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double d) {
        this.rating = d;
    }

    public double getReviewNumber() {
        return this.reviewNumber;
    }

    public void setReviewNumber(double d) {
        this.reviewNumber = d;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public List<String> getMccCodes() {
        return this.mccCodes;
    }

    public void setMccCodes(List<String> list) {
        this.mccCodes = list;
    }

    public Map<String, String> getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(Map<String, String> map) {
        this.extInfo = map;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String str) {
        this.brandName = str;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public void setBranchName(String str) {
        this.branchName = str;
    }

    public String getMainName() {
        return this.mainName;
    }

    public void setMainName(String str) {
        this.mainName = str;
    }

    public String getCertStatus() {
        return this.certStatus;
    }

    public void setCertStatus(String str) {
        this.certStatus = str;
    }

    public String getShopId() {
        return this.shopId;
    }

    public void setShopId(String str) {
        this.shopId = str;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public double getLongtitude() {
        return this.longtitude;
    }

    public void setLongtitude(double d) {
        this.longtitude = d;
    }

    public String getExternalShopId() {
        return this.externalShopId;
    }

    public void setExternalShopId(String str) {
        this.externalShopId = str;
    }

    public String getShopDesc() {
        return this.shopDesc;
    }

    public void setShopDesc(String str) {
        this.shopDesc = str;
    }

    public String getShopType() {
        return this.shopType;
    }

    public void setShopType(String str) {
        this.shopType = str;
    }

    public String getRegisterSource() {
        return this.registerSource;
    }

    public void setRegisterSource(String str) {
        this.registerSource = str;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public Map<String, String> getLogoUrlMap() {
        return this.logoUrlMap;
    }

    public void setLogoUrlMap(Map<String, String> map) {
        this.logoUrlMap = map;
    }

    public List<EngineUtils.AnonymousClass2> getContactAddresses() {
        return this.contactAddresses;
    }

    public void setContactAddresses(List<EngineUtils.AnonymousClass2> list) {
        this.contactAddresses = list;
    }

    public MerchantStatusEnum getShopStatus() {
        return this.shopStatus;
    }

    public void setShopStatus(MerchantStatusEnum merchantStatusEnum) {
        this.shopStatus = merchantStatusEnum;
    }

    public List<setScrollChangedCallback> getPromoInfos() {
        return this.promoInfos;
    }

    public void setPromoInfos(List<setScrollChangedCallback> list) {
        this.promoInfos = list;
    }

    public String getMerchantSizeType() {
        return this.merchantSizeType;
    }

    public void setMerchantSizeType(String str) {
        this.merchantSizeType = str;
    }

    public GriverConfigUtils toShop() {
        GriverConfigUtils griverConfigUtils = new GriverConfigUtils();
        griverConfigUtils.setBranchName(this.branchName);
        griverConfigUtils.setBrandName(this.brandName);
        griverConfigUtils.setCertStatus(this.certStatus);
        griverConfigUtils.setContactAddresses(transformContactAddressEntityToContactAddress(this.contactAddresses));
        griverConfigUtils.setExtInfo(this.extInfo);
        griverConfigUtils.setExternalShopId(this.externalShopId);
        griverConfigUtils.setLatitude(this.latitude);
        griverConfigUtils.setLogoUrl(this.logoUrl);
        griverConfigUtils.setLogoUrlMap(this.logoUrlMap);
        griverConfigUtils.setLongtitude(this.longtitude);
        griverConfigUtils.setMainName(this.mainName);
        griverConfigUtils.setMccCodes(this.mccCodes);
        griverConfigUtils.setMerchantId(this.merchantId);
        griverConfigUtils.setRegisterSource(this.registerSource);
        griverConfigUtils.setShopDesc(this.shopDesc);
        griverConfigUtils.setShopId(this.shopId);
        griverConfigUtils.setShopStatus(this.shopStatus);
        griverConfigUtils.setShopType(this.shopType);
        griverConfigUtils.setPromoInfos(transformPromoInfoEntityToPromoInfo(this.promoInfos));
        griverConfigUtils.setRating(this.rating);
        griverConfigUtils.setReviewNumbers(this.reviewNumber);
        griverConfigUtils.setFullDay(this.fullDay);
        griverConfigUtils.setShopOpenHours(transformShopOpenHourListEntityToShopOpenHour(this.shopOpenHours));
        griverConfigUtils.setMerchantSizeType(this.merchantSizeType);
        griverConfigUtils.setMerchantName(this.merchantName);
        griverConfigUtils.setHasMoreShop(this.hasMoreShops);
        return griverConfigUtils;
    }

    private List<getMacEncrypt> transformContactAddressEntityToContactAddress(List<EngineUtils.AnonymousClass2> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EngineUtils.AnonymousClass2 contactAddress : list) {
                arrayList.add(contactAddress.toContactAddress());
            }
        }
        return arrayList;
    }

    private List<FileCache.AnonymousClass1> transformPromoInfoEntityToPromoInfo(List<setScrollChangedCallback> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (setScrollChangedCallback promoInfo : list) {
                arrayList.add(promoInfo.toPromoInfo());
            }
        }
        return arrayList;
    }

    private List<getWebSetting> transformShopOpenHourListEntityToShopOpenHour(List<getInstanceId> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (getInstanceId shopOpenHour : list) {
                arrayList.add(shopOpenHour.toShopOpenHour());
            }
        }
        return arrayList;
    }

    public boolean isHasMoreShops() {
        return this.hasMoreShops;
    }

    public void setHasMoreShops(boolean z) {
        this.hasMoreShops = z;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public Long getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(Long l) {
        this.transactionDate = l;
    }
}
