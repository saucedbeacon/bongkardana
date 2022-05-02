package o;

import com.google.android.exoplayer2.C;
import id.dana.domain.nearbyme.model.MerchantStatusEnum;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FileCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\br\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 ¡\u00012\u00020\u0001:\u0002¡\u0001B§\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0007\u0012\b\b\u0002\u0010(\u001a\u00020\u0010\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+¢\u0006\u0002\u0010,J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010{\u001a\u00020\nHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010}\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\t\u0010~\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0001\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0002\u0010vJ\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\u0018\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0010HÆ\u0003J²\u0003\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00072\b\b\u0002\u0010\u001c\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00072\b\b\u0002\u0010(\u001a\u00020\u00102\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+HÆ\u0001¢\u0006\u0003\u0010\u0001J\u0015\u0010\u0001\u001a\u00020\u00102\t\u0010\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0001\u001a\u00030\u0001HÖ\u0001J\u0007\u0010\u0001\u001a\u00020\u0010J\n\u0010 \u0001\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010(\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010D\"\u0004\bH\u0010FR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010.\"\u0004\bJ\u00100R\u001a\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010:\"\u0004\bL\u0010<R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010.\"\u0004\bN\u00100R(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010>\"\u0004\bP\u0010@R\u001a\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010:\"\u0004\bR\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00106\"\u0004\bV\u00108R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010.\"\u0004\bX\u00100R\u001c\u0010)\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010.\"\u0004\bZ\u00100R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010.\"\u0004\b\\\u00100R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u00106\"\u0004\b^\u00108R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00106\"\u0004\b`\u00108R\u001a\u0010\u001c\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010:\"\u0004\bb\u0010<R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010.\"\u0004\bd\u00100R\u001a\u0010\u001e\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010:\"\u0004\bf\u0010<R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010.\"\u0004\bh\u00100R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010.\"\u0004\bj\u00100R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u00106\"\u0004\bl\u00108R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010.\"\u0004\br\u00100R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u00106\"\u0004\bt\u00108R\u001e\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0010\n\u0002\u0010y\u001a\u0004\bu\u0010v\"\u0004\bw\u0010x¨\u0006¢\u0001"}, d2 = {"Lid/dana/domain/nearbyme/model/Shop;", "", "branchName", "", "brandName", "certStatus", "contactAddresses", "", "Lid/dana/domain/nearbyme/model/ContactAddress;", "distance", "", "extInfo", "", "externalShopId", "instId", "fullDay", "", "latitude", "logoUrl", "logoUrlMap", "longtitude", "mainName", "mccCodes", "merchantId", "merchantSizeType", "officeNumbers", "promoInfos", "Lid/dana/domain/nearbyme/model/PromoInfo;", "rating", "registerSource", "reviewNumbers", "shopDesc", "shopId", "shopOpenHours", "Lid/dana/domain/nearbyme/model/ShopOpenHour;", "shopStatus", "Lid/dana/domain/nearbyme/model/MerchantStatusEnum;", "shopType", "subcategories", "Lid/dana/domain/merchant/model/MerchantSubcategory;", "hasMoreShop", "merchantName", "transactionDate", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;DLjava/util/Map;Ljava/lang/String;Ljava/lang/String;ZDLjava/lang/String;Ljava/util/Map;DLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lid/dana/domain/nearbyme/model/MerchantStatusEnum;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;)V", "getBranchName", "()Ljava/lang/String;", "setBranchName", "(Ljava/lang/String;)V", "getBrandName", "setBrandName", "getCertStatus", "setCertStatus", "getContactAddresses", "()Ljava/util/List;", "setContactAddresses", "(Ljava/util/List;)V", "getDistance", "()D", "setDistance", "(D)V", "getExtInfo", "()Ljava/util/Map;", "setExtInfo", "(Ljava/util/Map;)V", "getExternalShopId", "setExternalShopId", "getFullDay", "()Z", "setFullDay", "(Z)V", "getHasMoreShop", "setHasMoreShop", "getInstId", "setInstId", "getLatitude", "setLatitude", "getLogoUrl", "setLogoUrl", "getLogoUrlMap", "setLogoUrlMap", "getLongtitude", "setLongtitude", "getMainName", "setMainName", "getMccCodes", "setMccCodes", "getMerchantId", "setMerchantId", "getMerchantName", "setMerchantName", "getMerchantSizeType", "setMerchantSizeType", "getOfficeNumbers", "setOfficeNumbers", "getPromoInfos", "setPromoInfos", "getRating", "setRating", "getRegisterSource", "setRegisterSource", "getReviewNumbers", "setReviewNumbers", "getShopDesc", "setShopDesc", "getShopId", "setShopId", "getShopOpenHours", "setShopOpenHours", "getShopStatus", "()Lid/dana/domain/nearbyme/model/MerchantStatusEnum;", "setShopStatus", "(Lid/dana/domain/nearbyme/model/MerchantStatusEnum;)V", "getShopType", "setShopType", "getSubcategories", "setSubcategories", "getTransactionDate", "()Ljava/lang/Long;", "setTransactionDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;DLjava/util/Map;Ljava/lang/String;Ljava/lang/String;ZDLjava/lang/String;Ljava/util/Map;DLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lid/dana/domain/nearbyme/model/MerchantStatusEnum;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;)Lid/dana/domain/nearbyme/model/Shop;", "equals", "other", "hashCode", "", "isQrisOrKybMerchantWithLessReview", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverConfigUtils {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String KYB_EXT_SHOP_ID = "KYB-";
    @NotNull
    public static final String QRIS_MERCHANT_ID = "216620000020928274717";
    @Nullable
    private String branchName;
    @Nullable
    private String brandName;
    @Nullable
    private String certStatus;
    @Nullable
    private List<getMacEncrypt> contactAddresses;
    private double distance;
    @Nullable
    private Map<String, String> extInfo;
    @Nullable
    private String externalShopId;
    private boolean fullDay;
    private boolean hasMoreShop;
    @Nullable
    private String instId;
    private double latitude;
    @Nullable
    private String logoUrl;
    @Nullable
    private Map<String, String> logoUrlMap;
    private double longtitude;
    @Nullable
    private String mainName;
    @Nullable
    private List<String> mccCodes;
    @Nullable
    private String merchantId;
    @Nullable
    private String merchantName;
    @Nullable
    private String merchantSizeType;
    @Nullable
    private List<String> officeNumbers;
    @Nullable
    private List<FileCache.AnonymousClass1> promoInfos;
    private double rating;
    @Nullable
    private String registerSource;
    private double reviewNumbers;
    @Nullable
    private String shopDesc;
    @Nullable
    private String shopId;
    @Nullable
    private List<getWebSetting> shopOpenHours;
    @Nullable
    private MerchantStatusEnum shopStatus;
    @Nullable
    private String shopType;
    @Nullable
    private List<? extends download> subcategories;
    @Nullable
    private Long transactionDate;

    public GriverConfigUtils() {
        this((String) null, (String) null, (String) null, (List) null, 0.0d, (Map) null, (String) null, (String) null, false, 0.0d, (String) null, (Map) null, 0.0d, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, 0.0d, (String) null, 0.0d, (String) null, (String) null, (List) null, (MerchantStatusEnum) null, (String) null, (List) null, false, (String) null, (Long) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GriverConfigUtils copy$default(GriverConfigUtils griverConfigUtils, String str, String str2, String str3, List list, double d, Map map, String str4, String str5, boolean z, double d2, String str6, Map map2, double d3, String str7, List list2, String str8, String str9, List list3, List list4, double d4, String str10, double d5, String str11, String str12, List list5, MerchantStatusEnum merchantStatusEnum, String str13, List list6, boolean z2, String str14, Long l, int i, Object obj) {
        GriverConfigUtils griverConfigUtils2 = griverConfigUtils;
        int i2 = i;
        String str15 = (i2 & 1) != 0 ? griverConfigUtils2.branchName : str;
        String str16 = (i2 & 2) != 0 ? griverConfigUtils2.brandName : str2;
        String str17 = (i2 & 4) != 0 ? griverConfigUtils2.certStatus : str3;
        List list7 = (i2 & 8) != 0 ? griverConfigUtils2.contactAddresses : list;
        double d6 = (i2 & 16) != 0 ? griverConfigUtils2.distance : d;
        Map map3 = (i2 & 32) != 0 ? griverConfigUtils2.extInfo : map;
        String str18 = (i2 & 64) != 0 ? griverConfigUtils2.externalShopId : str4;
        String str19 = (i2 & 128) != 0 ? griverConfigUtils2.instId : str5;
        boolean z3 = (i2 & 256) != 0 ? griverConfigUtils2.fullDay : z;
        double d7 = (i2 & 512) != 0 ? griverConfigUtils2.latitude : d2;
        String str20 = (i2 & 1024) != 0 ? griverConfigUtils2.logoUrl : str6;
        return griverConfigUtils.copy(str15, str16, str17, list7, d6, map3, str18, str19, z3, d7, str20, (i2 & 2048) != 0 ? griverConfigUtils2.logoUrlMap : map2, (i2 & 4096) != 0 ? griverConfigUtils2.longtitude : d3, (i2 & 8192) != 0 ? griverConfigUtils2.mainName : str7, (i2 & 16384) != 0 ? griverConfigUtils2.mccCodes : list2, (i2 & 32768) != 0 ? griverConfigUtils2.merchantId : str8, (i2 & 65536) != 0 ? griverConfigUtils2.merchantSizeType : str9, (i2 & 131072) != 0 ? griverConfigUtils2.officeNumbers : list3, (i2 & 262144) != 0 ? griverConfigUtils2.promoInfos : list4, (i2 & 524288) != 0 ? griverConfigUtils2.rating : d4, (i2 & 1048576) != 0 ? griverConfigUtils2.registerSource : str10, (2097152 & i2) != 0 ? griverConfigUtils2.reviewNumbers : d5, (i2 & 4194304) != 0 ? griverConfigUtils2.shopDesc : str11, (8388608 & i2) != 0 ? griverConfigUtils2.shopId : str12, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? griverConfigUtils2.shopOpenHours : list5, (i2 & 33554432) != 0 ? griverConfigUtils2.shopStatus : merchantStatusEnum, (i2 & 67108864) != 0 ? griverConfigUtils2.shopType : str13, (i2 & 134217728) != 0 ? griverConfigUtils2.subcategories : list6, (i2 & 268435456) != 0 ? griverConfigUtils2.hasMoreShop : z2, (i2 & C.ENCODING_PCM_A_LAW) != 0 ? griverConfigUtils2.merchantName : str14, (i2 & 1073741824) != 0 ? griverConfigUtils2.transactionDate : l);
    }

    @Nullable
    public final String component1() {
        return this.branchName;
    }

    public final double component10() {
        return this.latitude;
    }

    @Nullable
    public final String component11() {
        return this.logoUrl;
    }

    @Nullable
    public final Map<String, String> component12() {
        return this.logoUrlMap;
    }

    public final double component13() {
        return this.longtitude;
    }

    @Nullable
    public final String component14() {
        return this.mainName;
    }

    @Nullable
    public final List<String> component15() {
        return this.mccCodes;
    }

    @Nullable
    public final String component16() {
        return this.merchantId;
    }

    @Nullable
    public final String component17() {
        return this.merchantSizeType;
    }

    @Nullable
    public final List<String> component18() {
        return this.officeNumbers;
    }

    @Nullable
    public final List<FileCache.AnonymousClass1> component19() {
        return this.promoInfos;
    }

    @Nullable
    public final String component2() {
        return this.brandName;
    }

    public final double component20() {
        return this.rating;
    }

    @Nullable
    public final String component21() {
        return this.registerSource;
    }

    public final double component22() {
        return this.reviewNumbers;
    }

    @Nullable
    public final String component23() {
        return this.shopDesc;
    }

    @Nullable
    public final String component24() {
        return this.shopId;
    }

    @Nullable
    public final List<getWebSetting> component25() {
        return this.shopOpenHours;
    }

    @Nullable
    public final MerchantStatusEnum component26() {
        return this.shopStatus;
    }

    @Nullable
    public final String component27() {
        return this.shopType;
    }

    @Nullable
    public final List<download> component28() {
        return this.subcategories;
    }

    public final boolean component29() {
        return this.hasMoreShop;
    }

    @Nullable
    public final String component3() {
        return this.certStatus;
    }

    @Nullable
    public final String component30() {
        return this.merchantName;
    }

    @Nullable
    public final Long component31() {
        return this.transactionDate;
    }

    @Nullable
    public final List<getMacEncrypt> component4() {
        return this.contactAddresses;
    }

    public final double component5() {
        return this.distance;
    }

    @Nullable
    public final Map<String, String> component6() {
        return this.extInfo;
    }

    @Nullable
    public final String component7() {
        return this.externalShopId;
    }

    @Nullable
    public final String component8() {
        return this.instId;
    }

    public final boolean component9() {
        return this.fullDay;
    }

    @NotNull
    public final GriverConfigUtils copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<getMacEncrypt> list, double d, @Nullable Map<String, String> map, @Nullable String str4, @Nullable String str5, boolean z, double d2, @Nullable String str6, @Nullable Map<String, String> map2, double d3, @Nullable String str7, @Nullable List<String> list2, @Nullable String str8, @Nullable String str9, @Nullable List<String> list3, @Nullable List<FileCache.AnonymousClass1> list4, double d4, @Nullable String str10, double d5, @Nullable String str11, @Nullable String str12, @Nullable List<getWebSetting> list5, @Nullable MerchantStatusEnum merchantStatusEnum, @Nullable String str13, @Nullable List<? extends download> list6, boolean z2, @Nullable String str14, @Nullable Long l) {
        return new GriverConfigUtils(str, str2, str3, list, d, map, str4, str5, z, d2, str6, map2, d3, str7, list2, str8, str9, list3, list4, d4, str10, d5, str11, str12, list5, merchantStatusEnum, str13, list6, z2, str14, l);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverConfigUtils)) {
            return false;
        }
        GriverConfigUtils griverConfigUtils = (GriverConfigUtils) obj;
        return Intrinsics.areEqual((Object) this.branchName, (Object) griverConfigUtils.branchName) && Intrinsics.areEqual((Object) this.brandName, (Object) griverConfigUtils.brandName) && Intrinsics.areEqual((Object) this.certStatus, (Object) griverConfigUtils.certStatus) && Intrinsics.areEqual((Object) this.contactAddresses, (Object) griverConfigUtils.contactAddresses) && Double.compare(this.distance, griverConfigUtils.distance) == 0 && Intrinsics.areEqual((Object) this.extInfo, (Object) griverConfigUtils.extInfo) && Intrinsics.areEqual((Object) this.externalShopId, (Object) griverConfigUtils.externalShopId) && Intrinsics.areEqual((Object) this.instId, (Object) griverConfigUtils.instId) && this.fullDay == griverConfigUtils.fullDay && Double.compare(this.latitude, griverConfigUtils.latitude) == 0 && Intrinsics.areEqual((Object) this.logoUrl, (Object) griverConfigUtils.logoUrl) && Intrinsics.areEqual((Object) this.logoUrlMap, (Object) griverConfigUtils.logoUrlMap) && Double.compare(this.longtitude, griverConfigUtils.longtitude) == 0 && Intrinsics.areEqual((Object) this.mainName, (Object) griverConfigUtils.mainName) && Intrinsics.areEqual((Object) this.mccCodes, (Object) griverConfigUtils.mccCodes) && Intrinsics.areEqual((Object) this.merchantId, (Object) griverConfigUtils.merchantId) && Intrinsics.areEqual((Object) this.merchantSizeType, (Object) griverConfigUtils.merchantSizeType) && Intrinsics.areEqual((Object) this.officeNumbers, (Object) griverConfigUtils.officeNumbers) && Intrinsics.areEqual((Object) this.promoInfos, (Object) griverConfigUtils.promoInfos) && Double.compare(this.rating, griverConfigUtils.rating) == 0 && Intrinsics.areEqual((Object) this.registerSource, (Object) griverConfigUtils.registerSource) && Double.compare(this.reviewNumbers, griverConfigUtils.reviewNumbers) == 0 && Intrinsics.areEqual((Object) this.shopDesc, (Object) griverConfigUtils.shopDesc) && Intrinsics.areEqual((Object) this.shopId, (Object) griverConfigUtils.shopId) && Intrinsics.areEqual((Object) this.shopOpenHours, (Object) griverConfigUtils.shopOpenHours) && Intrinsics.areEqual((Object) this.shopStatus, (Object) griverConfigUtils.shopStatus) && Intrinsics.areEqual((Object) this.shopType, (Object) griverConfigUtils.shopType) && Intrinsics.areEqual((Object) this.subcategories, (Object) griverConfigUtils.subcategories) && this.hasMoreShop == griverConfigUtils.hasMoreShop && Intrinsics.areEqual((Object) this.merchantName, (Object) griverConfigUtils.merchantName) && Intrinsics.areEqual((Object) this.transactionDate, (Object) griverConfigUtils.transactionDate);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Shop(branchName=");
        sb.append(this.branchName);
        sb.append(", brandName=");
        sb.append(this.brandName);
        sb.append(", certStatus=");
        sb.append(this.certStatus);
        sb.append(", contactAddresses=");
        sb.append(this.contactAddresses);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", extInfo=");
        sb.append(this.extInfo);
        sb.append(", externalShopId=");
        sb.append(this.externalShopId);
        sb.append(", instId=");
        sb.append(this.instId);
        sb.append(", fullDay=");
        sb.append(this.fullDay);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", logoUrl=");
        sb.append(this.logoUrl);
        sb.append(", logoUrlMap=");
        sb.append(this.logoUrlMap);
        sb.append(", longtitude=");
        sb.append(this.longtitude);
        sb.append(", mainName=");
        sb.append(this.mainName);
        sb.append(", mccCodes=");
        sb.append(this.mccCodes);
        sb.append(", merchantId=");
        sb.append(this.merchantId);
        sb.append(", merchantSizeType=");
        sb.append(this.merchantSizeType);
        sb.append(", officeNumbers=");
        sb.append(this.officeNumbers);
        sb.append(", promoInfos=");
        sb.append(this.promoInfos);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", registerSource=");
        sb.append(this.registerSource);
        sb.append(", reviewNumbers=");
        sb.append(this.reviewNumbers);
        sb.append(", shopDesc=");
        sb.append(this.shopDesc);
        sb.append(", shopId=");
        sb.append(this.shopId);
        sb.append(", shopOpenHours=");
        sb.append(this.shopOpenHours);
        sb.append(", shopStatus=");
        sb.append(this.shopStatus);
        sb.append(", shopType=");
        sb.append(this.shopType);
        sb.append(", subcategories=");
        sb.append(this.subcategories);
        sb.append(", hasMoreShop=");
        sb.append(this.hasMoreShop);
        sb.append(", merchantName=");
        sb.append(this.merchantName);
        sb.append(", transactionDate=");
        sb.append(this.transactionDate);
        sb.append(")");
        return sb.toString();
    }

    public GriverConfigUtils(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<getMacEncrypt> list, double d, @Nullable Map<String, String> map, @Nullable String str4, @Nullable String str5, boolean z, double d2, @Nullable String str6, @Nullable Map<String, String> map2, double d3, @Nullable String str7, @Nullable List<String> list2, @Nullable String str8, @Nullable String str9, @Nullable List<String> list3, @Nullable List<FileCache.AnonymousClass1> list4, double d4, @Nullable String str10, double d5, @Nullable String str11, @Nullable String str12, @Nullable List<getWebSetting> list5, @Nullable MerchantStatusEnum merchantStatusEnum, @Nullable String str13, @Nullable List<? extends download> list6, boolean z2, @Nullable String str14, @Nullable Long l) {
        this.branchName = str;
        this.brandName = str2;
        this.certStatus = str3;
        this.contactAddresses = list;
        this.distance = d;
        this.extInfo = map;
        this.externalShopId = str4;
        this.instId = str5;
        this.fullDay = z;
        this.latitude = d2;
        this.logoUrl = str6;
        this.logoUrlMap = map2;
        this.longtitude = d3;
        this.mainName = str7;
        this.mccCodes = list2;
        this.merchantId = str8;
        this.merchantSizeType = str9;
        this.officeNumbers = list3;
        this.promoInfos = list4;
        this.rating = d4;
        this.registerSource = str10;
        this.reviewNumbers = d5;
        this.shopDesc = str11;
        this.shopId = str12;
        this.shopOpenHours = list5;
        this.shopStatus = merchantStatusEnum;
        this.shopType = str13;
        this.subcategories = list6;
        this.hasMoreShop = z2;
        this.merchantName = str14;
        this.transactionDate = l;
    }

    @Nullable
    public final String getBranchName() {
        return this.branchName;
    }

    public final void setBranchName(@Nullable String str) {
        this.branchName = str;
    }

    @Nullable
    public final String getBrandName() {
        return this.brandName;
    }

    public final void setBrandName(@Nullable String str) {
        this.brandName = str;
    }

    @Nullable
    public final String getCertStatus() {
        return this.certStatus;
    }

    public final void setCertStatus(@Nullable String str) {
        this.certStatus = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GriverConfigUtils(java.lang.String r39, java.lang.String r40, java.lang.String r41, java.util.List r42, double r43, java.util.Map r45, java.lang.String r46, java.lang.String r47, boolean r48, double r49, java.lang.String r51, java.util.Map r52, double r53, java.lang.String r55, java.util.List r56, java.lang.String r57, java.lang.String r58, java.util.List r59, java.util.List r60, double r61, java.lang.String r63, double r64, java.lang.String r66, java.lang.String r67, java.util.List r68, id.dana.domain.nearbyme.model.MerchantStatusEnum r69, java.lang.String r70, java.util.List r71, boolean r72, java.lang.String r73, java.lang.Long r74, int r75, kotlin.jvm.internal.DefaultConstructorMarker r76) {
        /*
            r38 = this;
            r0 = r75
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r39
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r40
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r41
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0025
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0027
        L_0x0025:
            r5 = r42
        L_0x0027:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002e
            r9 = 0
            goto L_0x0030
        L_0x002e:
            r9 = r43
        L_0x0030:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0039
            java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()
            goto L_0x003b
        L_0x0039:
            r6 = r45
        L_0x003b:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r46
        L_0x0043:
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0049
            r12 = r2
            goto L_0x004b
        L_0x0049:
            r12 = r47
        L_0x004b:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0051
            r13 = 0
            goto L_0x0053
        L_0x0051:
            r13 = r48
        L_0x0053:
            r15 = r0 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x005a
            r15 = 0
            goto L_0x005c
        L_0x005a:
            r15 = r49
        L_0x005c:
            r7 = r0 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0062
            r7 = r2
            goto L_0x0064
        L_0x0062:
            r7 = r51
        L_0x0064:
            r8 = r0 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x006d
            java.util.Map r8 = kotlin.collections.MapsKt.emptyMap()
            goto L_0x006f
        L_0x006d:
            r8 = r52
        L_0x006f:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0076
            r17 = 0
            goto L_0x0078
        L_0x0076:
            r17 = r53
        L_0x0078:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x007e
            r14 = r2
            goto L_0x0080
        L_0x007e:
            r14 = r55
        L_0x0080:
            r76 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x008b
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x008d
        L_0x008b:
            r2 = r56
        L_0x008d:
            r19 = 32768(0x8000, float:4.5918E-41)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x0097
            r19 = r76
            goto L_0x0099
        L_0x0097:
            r19 = r57
        L_0x0099:
            r20 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00a2
            r20 = r76
            goto L_0x00a4
        L_0x00a2:
            r20 = r58
        L_0x00a4:
            r21 = 131072(0x20000, float:1.83671E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00af
            java.util.List r21 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x00b1
        L_0x00af:
            r21 = r59
        L_0x00b1:
            r22 = 262144(0x40000, float:3.67342E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00bc
            java.util.List r22 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x00be
        L_0x00bc:
            r22 = r60
        L_0x00be:
            r23 = 524288(0x80000, float:7.34684E-40)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00c7
            r23 = 0
            goto L_0x00c9
        L_0x00c7:
            r23 = r61
        L_0x00c9:
            r25 = 1048576(0x100000, float:1.469368E-39)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00d2
            r25 = r76
            goto L_0x00d4
        L_0x00d2:
            r25 = r63
        L_0x00d4:
            r26 = 2097152(0x200000, float:2.938736E-39)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00dd
            r26 = 0
            goto L_0x00df
        L_0x00dd:
            r26 = r64
        L_0x00df:
            r28 = 4194304(0x400000, float:5.877472E-39)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00e8
            r28 = r76
            goto L_0x00ea
        L_0x00e8:
            r28 = r66
        L_0x00ea:
            r29 = 8388608(0x800000, float:1.17549435E-38)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x00f3
            r29 = r76
            goto L_0x00f5
        L_0x00f3:
            r29 = r67
        L_0x00f5:
            r30 = 16777216(0x1000000, float:2.3509887E-38)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x0100
            java.util.List r30 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0102
        L_0x0100:
            r30 = r68
        L_0x0102:
            r31 = 33554432(0x2000000, float:9.403955E-38)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x010b
            id.dana.domain.nearbyme.model.MerchantStatusEnum r31 = id.dana.domain.nearbyme.model.MerchantStatusEnum.FROZEN
            goto L_0x010d
        L_0x010b:
            r31 = r69
        L_0x010d:
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x0116
            r32 = r76
            goto L_0x0118
        L_0x0116:
            r32 = r70
        L_0x0118:
            r33 = 134217728(0x8000000, float:3.85186E-34)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x0123
            java.util.List r33 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0125
        L_0x0123:
            r33 = r71
        L_0x0125:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x012e
            r34 = 0
            goto L_0x0130
        L_0x012e:
            r34 = r72
        L_0x0130:
            r35 = 536870912(0x20000000, float:1.0842022E-19)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x0139
            r35 = r76
            goto L_0x013b
        L_0x0139:
            r35 = r73
        L_0x013b:
            r36 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r36
            if (r0 == 0) goto L_0x0148
            r36 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r36)
            goto L_0x014a
        L_0x0148:
            r0 = r74
        L_0x014a:
            r39 = r38
            r40 = r1
            r41 = r3
            r42 = r4
            r43 = r5
            r44 = r9
            r46 = r6
            r47 = r11
            r48 = r12
            r49 = r13
            r50 = r15
            r52 = r7
            r53 = r8
            r54 = r17
            r56 = r14
            r57 = r2
            r58 = r19
            r59 = r20
            r60 = r21
            r61 = r22
            r62 = r23
            r64 = r25
            r65 = r26
            r67 = r28
            r68 = r29
            r69 = r30
            r70 = r31
            r71 = r32
            r72 = r33
            r73 = r34
            r74 = r35
            r75 = r0
            r39.<init>(r40, r41, r42, r43, r44, r46, r47, r48, r49, r50, r52, r53, r54, r56, r57, r58, r59, r60, r61, r62, r64, r65, r67, r68, r69, r70, r71, r72, r73, r74, r75)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverConfigUtils.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, double, java.util.Map, java.lang.String, java.lang.String, boolean, double, java.lang.String, java.util.Map, double, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.List, java.util.List, double, java.lang.String, double, java.lang.String, java.lang.String, java.util.List, id.dana.domain.nearbyme.model.MerchantStatusEnum, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final List<getMacEncrypt> getContactAddresses() {
        return this.contactAddresses;
    }

    public final void setContactAddresses(@Nullable List<getMacEncrypt> list) {
        this.contactAddresses = list;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final void setDistance(double d) {
        this.distance = d;
    }

    @Nullable
    public final Map<String, String> getExtInfo() {
        return this.extInfo;
    }

    public final void setExtInfo(@Nullable Map<String, String> map) {
        this.extInfo = map;
    }

    @Nullable
    public final String getExternalShopId() {
        return this.externalShopId;
    }

    public final void setExternalShopId(@Nullable String str) {
        this.externalShopId = str;
    }

    @Nullable
    public final String getInstId() {
        return this.instId;
    }

    public final void setInstId(@Nullable String str) {
        this.instId = str;
    }

    public final boolean getFullDay() {
        return this.fullDay;
    }

    public final void setFullDay(boolean z) {
        this.fullDay = z;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    @Nullable
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final void setLogoUrl(@Nullable String str) {
        this.logoUrl = str;
    }

    @Nullable
    public final Map<String, String> getLogoUrlMap() {
        return this.logoUrlMap;
    }

    public final void setLogoUrlMap(@Nullable Map<String, String> map) {
        this.logoUrlMap = map;
    }

    public final double getLongtitude() {
        return this.longtitude;
    }

    public final void setLongtitude(double d) {
        this.longtitude = d;
    }

    @Nullable
    public final String getMainName() {
        return this.mainName;
    }

    public final void setMainName(@Nullable String str) {
        this.mainName = str;
    }

    @Nullable
    public final List<String> getMccCodes() {
        return this.mccCodes;
    }

    public final void setMccCodes(@Nullable List<String> list) {
        this.mccCodes = list;
    }

    @Nullable
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(@Nullable String str) {
        this.merchantId = str;
    }

    @Nullable
    public final String getMerchantSizeType() {
        return this.merchantSizeType;
    }

    public final void setMerchantSizeType(@Nullable String str) {
        this.merchantSizeType = str;
    }

    @Nullable
    public final List<String> getOfficeNumbers() {
        return this.officeNumbers;
    }

    public final void setOfficeNumbers(@Nullable List<String> list) {
        this.officeNumbers = list;
    }

    @Nullable
    public final List<FileCache.AnonymousClass1> getPromoInfos() {
        return this.promoInfos;
    }

    public final void setPromoInfos(@Nullable List<FileCache.AnonymousClass1> list) {
        this.promoInfos = list;
    }

    public final double getRating() {
        return this.rating;
    }

    public final void setRating(double d) {
        this.rating = d;
    }

    @Nullable
    public final String getRegisterSource() {
        return this.registerSource;
    }

    public final void setRegisterSource(@Nullable String str) {
        this.registerSource = str;
    }

    public final double getReviewNumbers() {
        return this.reviewNumbers;
    }

    public final void setReviewNumbers(double d) {
        this.reviewNumbers = d;
    }

    @Nullable
    public final String getShopDesc() {
        return this.shopDesc;
    }

    public final void setShopDesc(@Nullable String str) {
        this.shopDesc = str;
    }

    @Nullable
    public final String getShopId() {
        return this.shopId;
    }

    public final void setShopId(@Nullable String str) {
        this.shopId = str;
    }

    @Nullable
    public final List<getWebSetting> getShopOpenHours() {
        return this.shopOpenHours;
    }

    public final void setShopOpenHours(@Nullable List<getWebSetting> list) {
        this.shopOpenHours = list;
    }

    @Nullable
    public final MerchantStatusEnum getShopStatus() {
        return this.shopStatus;
    }

    public final void setShopStatus(@Nullable MerchantStatusEnum merchantStatusEnum) {
        this.shopStatus = merchantStatusEnum;
    }

    @Nullable
    public final String getShopType() {
        return this.shopType;
    }

    public final void setShopType(@Nullable String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1698588706, oncanceled);
            onCancelLoad.getMin(-1698588706, oncanceled);
        }
        this.shopType = str;
    }

    @Nullable
    public final List<download> getSubcategories() {
        return this.subcategories;
    }

    public final void setSubcategories(@Nullable List<? extends download> list) {
        this.subcategories = list;
    }

    public final boolean getHasMoreShop() {
        return this.hasMoreShop;
    }

    public final void setHasMoreShop(boolean z) {
        this.hasMoreShop = z;
    }

    @Nullable
    public final String getMerchantName() {
        return this.merchantName;
    }

    public final void setMerchantName(@Nullable String str) {
        this.merchantName = str;
    }

    @Nullable
    public final Long getTransactionDate() {
        return this.transactionDate;
    }

    public final void setTransactionDate(@Nullable Long l) {
        this.transactionDate = l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r7.externalShopId;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isQrisOrKybMerchantWithLessReview() {
        /*
            r7 = this;
            java.lang.String r0 = r7.merchantId
            java.lang.String r1 = "216620000020928274717"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r7.externalShopId
            if (r0 == 0) goto L_0x0027
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r3 = "KYB-"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 2
            r5 = 0
            boolean r0 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r3, (boolean) r2, (int) r4, (java.lang.Object) r5)
            if (r0 != r1) goto L_0x0027
        L_0x001e:
            double r3 = r7.reviewNumbers
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0027
            return r1
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverConfigUtils.isQrisOrKybMerchantWithLessReview():boolean");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/domain/nearbyme/model/Shop$Companion;", "", "()V", "KYB_EXT_SHOP_ID", "", "QRIS_MERCHANT_ID", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int hashCode() {
        String str = this.branchName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.brandName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.certStatus;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<getMacEncrypt> list = this.contactAddresses;
        int hashCode4 = (((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + Double.valueOf(this.distance).hashCode()) * 31;
        Map<String, String> map = this.extInfo;
        int hashCode5 = (hashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.externalShopId;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.instId;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.fullDay;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode8 = (((hashCode7 + (z ? 1 : 0)) * 31) + Double.valueOf(this.latitude).hashCode()) * 31;
        String str6 = this.logoUrl;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.logoUrlMap;
        int hashCode10 = (((hashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31) + Double.valueOf(this.longtitude).hashCode()) * 31;
        String str7 = this.mainName;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<String> list2 = this.mccCodes;
        int hashCode12 = (hashCode11 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str8 = this.merchantId;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.merchantSizeType;
        int hashCode14 = (hashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31;
        List<String> list3 = this.officeNumbers;
        int hashCode15 = (hashCode14 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<FileCache.AnonymousClass1> list4 = this.promoInfos;
        int hashCode16 = (((hashCode15 + (list4 != null ? list4.hashCode() : 0)) * 31) + Double.valueOf(this.rating).hashCode()) * 31;
        String str10 = this.registerSource;
        int hashCode17 = (((hashCode16 + (str10 != null ? str10.hashCode() : 0)) * 31) + Double.valueOf(this.reviewNumbers).hashCode()) * 31;
        String str11 = this.shopDesc;
        int hashCode18 = (hashCode17 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.shopId;
        int hashCode19 = (hashCode18 + (str12 != null ? str12.hashCode() : 0)) * 31;
        List<getWebSetting> list5 = this.shopOpenHours;
        int hashCode20 = (hashCode19 + (list5 != null ? list5.hashCode() : 0)) * 31;
        MerchantStatusEnum merchantStatusEnum = this.shopStatus;
        int hashCode21 = (hashCode20 + (merchantStatusEnum != null ? merchantStatusEnum.hashCode() : 0)) * 31;
        String str13 = this.shopType;
        int hashCode22 = (hashCode21 + (str13 != null ? str13.hashCode() : 0)) * 31;
        List<? extends download> list6 = this.subcategories;
        int hashCode23 = (hashCode22 + (list6 != null ? list6.hashCode() : 0)) * 31;
        boolean z3 = this.hasMoreShop;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (hashCode23 + (z2 ? 1 : 0)) * 31;
        String str14 = this.merchantName;
        int hashCode24 = (i2 + (str14 != null ? str14.hashCode() : 0)) * 31;
        Long l = this.transactionDate;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode24 + i;
    }
}
