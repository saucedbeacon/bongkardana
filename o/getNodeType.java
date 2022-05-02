package o;

import com.google.android.exoplayer2.C;
import com.google.gson.annotations.SerializedName;
import id.dana.data.merchant.repository.source.network.response.InquiryStatus;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\b¢\u0006\u0002\u0010)J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00108J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\bHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\bHÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0003\u0010o\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010pJ\u0013\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010tHÖ\u0003J\t\u0010u\u001a\u00020\u0011HÖ\u0001J\t\u0010v\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010-R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\bB\u00108R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010+R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010+R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010+R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010+R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010+R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010-R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010+R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010+R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010+¨\u0006w"}, d2 = {"Lid/dana/data/merchant/repository/source/network/response/BizDestinationInquiryInfo;", "Ljava/io/Serializable;", "inquiryId", "", "inquiryStatus", "Lid/dana/data/merchant/repository/source/network/response/InquiryStatus;", "customerName", "period", "", "totalAmount", "Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;", "baseAmount", "adminFee", "providerName", "fineAmount", "dueDate", "paymentCount", "", "familyNumber", "familyCount", "detailAmount", "Lid/dana/data/merchant/repository/source/network/response/BillAmountDetail;", "policeNumber", "address", "standMeter", "usage", "tagNonAir", "Lid/dana/domain/nearbyme/model/MoneyView;", "load", "amount", "meterNumber", "fare", "totalEnergy", "refNumber", "type", "certificateNumber", "phoneNumber", "startDate", "endDate", "billDetail", "Lid/dana/data/merchant/repository/source/network/response/BillDetail;", "(Ljava/lang/String;Lid/dana/data/merchant/repository/source/network/response/InquiryStatus;Ljava/lang/String;Ljava/util/List;Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;Ljava/lang/String;Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/nearbyme/model/MoneyView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "getAdminFee", "()Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;", "getAmount", "getBaseAmount", "getBillDetail", "()Ljava/util/List;", "getCertificateNumber", "getCustomerName", "getDetailAmount", "getDueDate", "getEndDate", "getFamilyCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFamilyNumber", "getFare", "getFineAmount", "getInquiryId", "getInquiryStatus", "()Lid/dana/data/merchant/repository/source/network/response/InquiryStatus;", "getLoad", "getMeterNumber", "getPaymentCount", "getPeriod", "getPhoneNumber", "getPoliceNumber", "getProviderName", "getRefNumber", "getStandMeter", "getStartDate", "getTagNonAir", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getTotalAmount", "getTotalEnergy", "getType", "getUsage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lid/dana/data/merchant/repository/source/network/response/InquiryStatus;Ljava/lang/String;Ljava/util/List;Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;Ljava/lang/String;Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/nearbyme/model/MoneyView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lid/dana/data/merchant/repository/source/network/response/BizDestinationInquiryInfo;", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getNodeType implements Serializable {
    @SerializedName("address")
    @Nullable
    private final String address;
    @SerializedName("adminFee")
    @Nullable
    private final toggleConsole adminFee;
    @SerializedName("amount")
    @Nullable
    private final String amount;
    @SerializedName("baseAmount")
    @Nullable
    private final toggleConsole baseAmount;
    @SerializedName("billDetail")
    @Nullable
    private final List<Object> billDetail;
    @SerializedName("certificateNumber")
    @Nullable
    private final String certificateNumber;
    @SerializedName("customerName")
    @Nullable
    private final String customerName;
    @SerializedName("detailAmount")
    @Nullable
    private final List<Object> detailAmount;
    @SerializedName("dueDate")
    @Nullable
    private final String dueDate;
    @SerializedName("endDate")
    @Nullable
    private final String endDate;
    @SerializedName("familyCount")
    @Nullable
    private final Integer familyCount;
    @SerializedName("familyNumber")
    @Nullable
    private final String familyNumber;
    @SerializedName("fare")
    @Nullable
    private final String fare;
    @SerializedName("fineAmount")
    @Nullable
    private final toggleConsole fineAmount;
    @SerializedName("inquiryId")
    @Nullable
    private final String inquiryId;
    @SerializedName("inquiryStatus")
    @Nullable
    private final InquiryStatus inquiryStatus;
    @SerializedName("load")
    @Nullable
    private final String load;
    @SerializedName("meterNumber")
    @Nullable
    private final String meterNumber;
    @SerializedName("paymentCount")
    @Nullable
    private final Integer paymentCount;
    @SerializedName("period")
    @Nullable
    private final List<String> period;
    @SerializedName("phoneNumber")
    @Nullable
    private final String phoneNumber;
    @SerializedName("policeNumber")
    @Nullable
    private final String policeNumber;
    @SerializedName("providerName")
    @Nullable
    private final String providerName;
    @SerializedName("refNumber")
    @Nullable
    private final String refNumber;
    @SerializedName("standMeter")
    @Nullable
    private final String standMeter;
    @SerializedName("startDate")
    @Nullable
    private final String startDate;
    @SerializedName("tagNonAir")
    @Nullable
    private final getAppDir tagNonAir;
    @SerializedName("totalAmount")
    @Nullable
    private final toggleConsole totalAmount;
    @SerializedName("totalEnergy")
    @Nullable
    private final String totalEnergy;
    @SerializedName("type")
    @Nullable
    private final String type;
    @SerializedName("usage")
    @Nullable
    private final String usage;

    public static /* synthetic */ getNodeType copy$default(getNodeType getnodetype, String str, InquiryStatus inquiryStatus2, String str2, List list, toggleConsole toggleconsole, toggleConsole toggleconsole2, toggleConsole toggleconsole3, String str3, toggleConsole toggleconsole4, String str4, Integer num, String str5, Integer num2, List list2, String str6, String str7, String str8, String str9, getAppDir getappdir, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List list3, int i, Object obj) {
        getNodeType getnodetype2 = getnodetype;
        int i2 = i;
        return getnodetype.copy((i2 & 1) != 0 ? getnodetype2.inquiryId : str, (i2 & 2) != 0 ? getnodetype2.inquiryStatus : inquiryStatus2, (i2 & 4) != 0 ? getnodetype2.customerName : str2, (i2 & 8) != 0 ? getnodetype2.period : list, (i2 & 16) != 0 ? getnodetype2.totalAmount : toggleconsole, (i2 & 32) != 0 ? getnodetype2.baseAmount : toggleconsole2, (i2 & 64) != 0 ? getnodetype2.adminFee : toggleconsole3, (i2 & 128) != 0 ? getnodetype2.providerName : str3, (i2 & 256) != 0 ? getnodetype2.fineAmount : toggleconsole4, (i2 & 512) != 0 ? getnodetype2.dueDate : str4, (i2 & 1024) != 0 ? getnodetype2.paymentCount : num, (i2 & 2048) != 0 ? getnodetype2.familyNumber : str5, (i2 & 4096) != 0 ? getnodetype2.familyCount : num2, (i2 & 8192) != 0 ? getnodetype2.detailAmount : list2, (i2 & 16384) != 0 ? getnodetype2.policeNumber : str6, (i2 & 32768) != 0 ? getnodetype2.address : str7, (i2 & 65536) != 0 ? getnodetype2.standMeter : str8, (i2 & 131072) != 0 ? getnodetype2.usage : str9, (i2 & 262144) != 0 ? getnodetype2.tagNonAir : getappdir, (i2 & 524288) != 0 ? getnodetype2.load : str10, (i2 & 1048576) != 0 ? getnodetype2.amount : str11, (i2 & 2097152) != 0 ? getnodetype2.meterNumber : str12, (i2 & 4194304) != 0 ? getnodetype2.fare : str13, (i2 & 8388608) != 0 ? getnodetype2.totalEnergy : str14, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? getnodetype2.refNumber : str15, (i2 & 33554432) != 0 ? getnodetype2.type : str16, (i2 & 67108864) != 0 ? getnodetype2.certificateNumber : str17, (i2 & 134217728) != 0 ? getnodetype2.phoneNumber : str18, (i2 & 268435456) != 0 ? getnodetype2.startDate : str19, (i2 & C.ENCODING_PCM_A_LAW) != 0 ? getnodetype2.endDate : str20, (i2 & 1073741824) != 0 ? getnodetype2.billDetail : list3);
    }

    @Nullable
    public final String component1() {
        return this.inquiryId;
    }

    @Nullable
    public final String component10() {
        return this.dueDate;
    }

    @Nullable
    public final Integer component11() {
        return this.paymentCount;
    }

    @Nullable
    public final String component12() {
        return this.familyNumber;
    }

    @Nullable
    public final Integer component13() {
        return this.familyCount;
    }

    @Nullable
    public final List<Object> component14() {
        return this.detailAmount;
    }

    @Nullable
    public final String component15() {
        return this.policeNumber;
    }

    @Nullable
    public final String component16() {
        return this.address;
    }

    @Nullable
    public final String component17() {
        return this.standMeter;
    }

    @Nullable
    public final String component18() {
        return this.usage;
    }

    @Nullable
    public final getAppDir component19() {
        return this.tagNonAir;
    }

    @Nullable
    public final InquiryStatus component2() {
        return this.inquiryStatus;
    }

    @Nullable
    public final String component20() {
        return this.load;
    }

    @Nullable
    public final String component21() {
        return this.amount;
    }

    @Nullable
    public final String component22() {
        return this.meterNumber;
    }

    @Nullable
    public final String component23() {
        return this.fare;
    }

    @Nullable
    public final String component24() {
        return this.totalEnergy;
    }

    @Nullable
    public final String component25() {
        return this.refNumber;
    }

    @Nullable
    public final String component26() {
        return this.type;
    }

    @Nullable
    public final String component27() {
        return this.certificateNumber;
    }

    @Nullable
    public final String component28() {
        return this.phoneNumber;
    }

    @Nullable
    public final String component29() {
        return this.startDate;
    }

    @Nullable
    public final String component3() {
        return this.customerName;
    }

    @Nullable
    public final String component30() {
        return this.endDate;
    }

    @Nullable
    public final List<Object> component31() {
        return this.billDetail;
    }

    @Nullable
    public final List<String> component4() {
        return this.period;
    }

    @Nullable
    public final toggleConsole component5() {
        return this.totalAmount;
    }

    @Nullable
    public final toggleConsole component6() {
        return this.baseAmount;
    }

    @Nullable
    public final toggleConsole component7() {
        return this.adminFee;
    }

    @Nullable
    public final String component8() {
        return this.providerName;
    }

    @Nullable
    public final toggleConsole component9() {
        return this.fineAmount;
    }

    @NotNull
    public final getNodeType copy(@Nullable String str, @Nullable InquiryStatus inquiryStatus2, @Nullable String str2, @Nullable List<String> list, @Nullable toggleConsole toggleconsole, @Nullable toggleConsole toggleconsole2, @Nullable toggleConsole toggleconsole3, @Nullable String str3, @Nullable toggleConsole toggleconsole4, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable Integer num2, @Nullable List<Object> list2, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable getAppDir getappdir, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable List<Object> list3) {
        return new getNodeType(str, inquiryStatus2, str2, list, toggleconsole, toggleconsole2, toggleconsole3, str3, toggleconsole4, str4, num, str5, num2, list2, str6, str7, str8, str9, getappdir, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, list3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNodeType)) {
            return false;
        }
        getNodeType getnodetype = (getNodeType) obj;
        return Intrinsics.areEqual((Object) this.inquiryId, (Object) getnodetype.inquiryId) && Intrinsics.areEqual((Object) this.inquiryStatus, (Object) getnodetype.inquiryStatus) && Intrinsics.areEqual((Object) this.customerName, (Object) getnodetype.customerName) && Intrinsics.areEqual((Object) this.period, (Object) getnodetype.period) && Intrinsics.areEqual((Object) this.totalAmount, (Object) getnodetype.totalAmount) && Intrinsics.areEqual((Object) this.baseAmount, (Object) getnodetype.baseAmount) && Intrinsics.areEqual((Object) this.adminFee, (Object) getnodetype.adminFee) && Intrinsics.areEqual((Object) this.providerName, (Object) getnodetype.providerName) && Intrinsics.areEqual((Object) this.fineAmount, (Object) getnodetype.fineAmount) && Intrinsics.areEqual((Object) this.dueDate, (Object) getnodetype.dueDate) && Intrinsics.areEqual((Object) this.paymentCount, (Object) getnodetype.paymentCount) && Intrinsics.areEqual((Object) this.familyNumber, (Object) getnodetype.familyNumber) && Intrinsics.areEqual((Object) this.familyCount, (Object) getnodetype.familyCount) && Intrinsics.areEqual((Object) this.detailAmount, (Object) getnodetype.detailAmount) && Intrinsics.areEqual((Object) this.policeNumber, (Object) getnodetype.policeNumber) && Intrinsics.areEqual((Object) this.address, (Object) getnodetype.address) && Intrinsics.areEqual((Object) this.standMeter, (Object) getnodetype.standMeter) && Intrinsics.areEqual((Object) this.usage, (Object) getnodetype.usage) && Intrinsics.areEqual((Object) this.tagNonAir, (Object) getnodetype.tagNonAir) && Intrinsics.areEqual((Object) this.load, (Object) getnodetype.load) && Intrinsics.areEqual((Object) this.amount, (Object) getnodetype.amount) && Intrinsics.areEqual((Object) this.meterNumber, (Object) getnodetype.meterNumber) && Intrinsics.areEqual((Object) this.fare, (Object) getnodetype.fare) && Intrinsics.areEqual((Object) this.totalEnergy, (Object) getnodetype.totalEnergy) && Intrinsics.areEqual((Object) this.refNumber, (Object) getnodetype.refNumber) && Intrinsics.areEqual((Object) this.type, (Object) getnodetype.type) && Intrinsics.areEqual((Object) this.certificateNumber, (Object) getnodetype.certificateNumber) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) getnodetype.phoneNumber) && Intrinsics.areEqual((Object) this.startDate, (Object) getnodetype.startDate) && Intrinsics.areEqual((Object) this.endDate, (Object) getnodetype.endDate) && Intrinsics.areEqual((Object) this.billDetail, (Object) getnodetype.billDetail);
    }

    public final int hashCode() {
        String str = this.inquiryId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InquiryStatus inquiryStatus2 = this.inquiryStatus;
        int hashCode2 = (hashCode + (inquiryStatus2 != null ? inquiryStatus2.hashCode() : 0)) * 31;
        String str2 = this.customerName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.period;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        toggleConsole toggleconsole = this.totalAmount;
        int hashCode5 = (hashCode4 + (toggleconsole != null ? toggleconsole.hashCode() : 0)) * 31;
        toggleConsole toggleconsole2 = this.baseAmount;
        int hashCode6 = (hashCode5 + (toggleconsole2 != null ? toggleconsole2.hashCode() : 0)) * 31;
        toggleConsole toggleconsole3 = this.adminFee;
        int hashCode7 = (hashCode6 + (toggleconsole3 != null ? toggleconsole3.hashCode() : 0)) * 31;
        String str3 = this.providerName;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        toggleConsole toggleconsole4 = this.fineAmount;
        int hashCode9 = (hashCode8 + (toggleconsole4 != null ? toggleconsole4.hashCode() : 0)) * 31;
        String str4 = this.dueDate;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.paymentCount;
        int hashCode11 = (hashCode10 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.familyNumber;
        int hashCode12 = (hashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num2 = this.familyCount;
        int hashCode13 = (hashCode12 + (num2 != null ? num2.hashCode() : 0)) * 31;
        List<Object> list2 = this.detailAmount;
        int hashCode14 = (hashCode13 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str6 = this.policeNumber;
        int hashCode15 = (hashCode14 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.address;
        int hashCode16 = (hashCode15 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.standMeter;
        int hashCode17 = (hashCode16 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.usage;
        int hashCode18 = (hashCode17 + (str9 != null ? str9.hashCode() : 0)) * 31;
        getAppDir getappdir = this.tagNonAir;
        int hashCode19 = (hashCode18 + (getappdir != null ? getappdir.hashCode() : 0)) * 31;
        String str10 = this.load;
        int hashCode20 = (hashCode19 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.amount;
        int hashCode21 = (hashCode20 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.meterNumber;
        int hashCode22 = (hashCode21 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.fare;
        int hashCode23 = (hashCode22 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.totalEnergy;
        int hashCode24 = (hashCode23 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.refNumber;
        int hashCode25 = (hashCode24 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.type;
        int hashCode26 = (hashCode25 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.certificateNumber;
        int hashCode27 = (hashCode26 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.phoneNumber;
        int hashCode28 = (hashCode27 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.startDate;
        int hashCode29 = (hashCode28 + (str19 != null ? str19.hashCode() : 0)) * 31;
        String str20 = this.endDate;
        int hashCode30 = (hashCode29 + (str20 != null ? str20.hashCode() : 0)) * 31;
        List<Object> list3 = this.billDetail;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode30 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BizDestinationInquiryInfo(inquiryId=");
        sb.append(this.inquiryId);
        sb.append(", inquiryStatus=");
        sb.append(this.inquiryStatus);
        sb.append(", customerName=");
        sb.append(this.customerName);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", totalAmount=");
        sb.append(this.totalAmount);
        sb.append(", baseAmount=");
        sb.append(this.baseAmount);
        sb.append(", adminFee=");
        sb.append(this.adminFee);
        sb.append(", providerName=");
        sb.append(this.providerName);
        sb.append(", fineAmount=");
        sb.append(this.fineAmount);
        sb.append(", dueDate=");
        sb.append(this.dueDate);
        sb.append(", paymentCount=");
        sb.append(this.paymentCount);
        sb.append(", familyNumber=");
        sb.append(this.familyNumber);
        sb.append(", familyCount=");
        sb.append(this.familyCount);
        sb.append(", detailAmount=");
        sb.append(this.detailAmount);
        sb.append(", policeNumber=");
        sb.append(this.policeNumber);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", standMeter=");
        sb.append(this.standMeter);
        sb.append(", usage=");
        sb.append(this.usage);
        sb.append(", tagNonAir=");
        sb.append(this.tagNonAir);
        sb.append(", load=");
        sb.append(this.load);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", meterNumber=");
        sb.append(this.meterNumber);
        sb.append(", fare=");
        sb.append(this.fare);
        sb.append(", totalEnergy=");
        sb.append(this.totalEnergy);
        sb.append(", refNumber=");
        sb.append(this.refNumber);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", certificateNumber=");
        sb.append(this.certificateNumber);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", startDate=");
        sb.append(this.startDate);
        sb.append(", endDate=");
        sb.append(this.endDate);
        sb.append(", billDetail=");
        sb.append(this.billDetail);
        sb.append(")");
        return sb.toString();
    }

    public getNodeType(@Nullable String str, @Nullable InquiryStatus inquiryStatus2, @Nullable String str2, @Nullable List<String> list, @Nullable toggleConsole toggleconsole, @Nullable toggleConsole toggleconsole2, @Nullable toggleConsole toggleconsole3, @Nullable String str3, @Nullable toggleConsole toggleconsole4, @Nullable String str4, @Nullable Integer num, @Nullable String str5, @Nullable Integer num2, @Nullable List<Object> list2, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable getAppDir getappdir, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable List<Object> list3) {
        this.inquiryId = str;
        this.inquiryStatus = inquiryStatus2;
        this.customerName = str2;
        this.period = list;
        this.totalAmount = toggleconsole;
        this.baseAmount = toggleconsole2;
        this.adminFee = toggleconsole3;
        this.providerName = str3;
        this.fineAmount = toggleconsole4;
        this.dueDate = str4;
        this.paymentCount = num;
        this.familyNumber = str5;
        this.familyCount = num2;
        this.detailAmount = list2;
        this.policeNumber = str6;
        this.address = str7;
        this.standMeter = str8;
        this.usage = str9;
        this.tagNonAir = getappdir;
        this.load = str10;
        this.amount = str11;
        this.meterNumber = str12;
        this.fare = str13;
        this.totalEnergy = str14;
        this.refNumber = str15;
        this.type = str16;
        this.certificateNumber = str17;
        this.phoneNumber = str18;
        this.startDate = str19;
        this.endDate = str20;
        this.billDetail = list3;
    }

    @Nullable
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @Nullable
    public final InquiryStatus getInquiryStatus() {
        return this.inquiryStatus;
    }

    @Nullable
    public final String getCustomerName() {
        return this.customerName;
    }

    @Nullable
    public final List<String> getPeriod() {
        return this.period;
    }

    @Nullable
    public final toggleConsole getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    public final toggleConsole getBaseAmount() {
        return this.baseAmount;
    }

    @Nullable
    public final toggleConsole getAdminFee() {
        return this.adminFee;
    }

    @Nullable
    public final String getProviderName() {
        return this.providerName;
    }

    @Nullable
    public final toggleConsole getFineAmount() {
        return this.fineAmount;
    }

    @Nullable
    public final String getDueDate() {
        return this.dueDate;
    }

    @Nullable
    public final Integer getPaymentCount() {
        return this.paymentCount;
    }

    @Nullable
    public final String getFamilyNumber() {
        return this.familyNumber;
    }

    @Nullable
    public final Integer getFamilyCount() {
        return this.familyCount;
    }

    @Nullable
    public final List<Object> getDetailAmount() {
        return this.detailAmount;
    }

    @Nullable
    public final String getPoliceNumber() {
        return this.policeNumber;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getStandMeter() {
        return this.standMeter;
    }

    @Nullable
    public final String getUsage() {
        return this.usage;
    }

    @Nullable
    public final getAppDir getTagNonAir() {
        return this.tagNonAir;
    }

    @Nullable
    public final String getLoad() {
        return this.load;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getMeterNumber() {
        return this.meterNumber;
    }

    @Nullable
    public final String getFare() {
        return this.fare;
    }

    @Nullable
    public final String getTotalEnergy() {
        return this.totalEnergy;
    }

    @Nullable
    public final String getRefNumber() {
        return this.refNumber;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getCertificateNumber() {
        return this.certificateNumber;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    public final String getStartDate() {
        return this.startDate;
    }

    @Nullable
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getNodeType(java.lang.String r36, id.dana.data.merchant.repository.source.network.response.InquiryStatus r37, java.lang.String r38, java.util.List r39, o.toggleConsole r40, o.toggleConsole r41, o.toggleConsole r42, java.lang.String r43, o.toggleConsole r44, java.lang.String r45, java.lang.Integer r46, java.lang.String r47, java.lang.Integer r48, java.util.List r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, o.getAppDir r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.util.List r66, int r67, kotlin.jvm.internal.DefaultConstructorMarker r68) {
        /*
            r35 = this;
            r0 = r67
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r36
        L_0x000c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0012
            r6 = r2
            goto L_0x0014
        L_0x0012:
            r6 = r38
        L_0x0014:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r7 = r3
            goto L_0x001d
        L_0x001b:
            r7 = r39
        L_0x001d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0023
            r10 = r3
            goto L_0x0025
        L_0x0023:
            r10 = r42
        L_0x0025:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002b
            r11 = r2
            goto L_0x002d
        L_0x002b:
            r11 = r43
        L_0x002d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0033
            r12 = r3
            goto L_0x0035
        L_0x0033:
            r12 = r44
        L_0x0035:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x003b
            r13 = r2
            goto L_0x003d
        L_0x003b:
            r13 = r45
        L_0x003d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0043
            r14 = r3
            goto L_0x0045
        L_0x0043:
            r14 = r46
        L_0x0045:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x004b
            r15 = r2
            goto L_0x004d
        L_0x004b:
            r15 = r47
        L_0x004d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0054
            r16 = r3
            goto L_0x0056
        L_0x0054:
            r16 = r48
        L_0x0056:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x005d
            r17 = r3
            goto L_0x005f
        L_0x005d:
            r17 = r49
        L_0x005f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0066
            r18 = r2
            goto L_0x0068
        L_0x0066:
            r18 = r50
        L_0x0068:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0071
            r19 = r2
            goto L_0x0073
        L_0x0071:
            r19 = r51
        L_0x0073:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007b
            r20 = r2
            goto L_0x007d
        L_0x007b:
            r20 = r52
        L_0x007d:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0085
            r21 = r2
            goto L_0x0087
        L_0x0085:
            r21 = r53
        L_0x0087:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008f
            r22 = r3
            goto L_0x0091
        L_0x008f:
            r22 = r54
        L_0x0091:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0099
            r23 = r2
            goto L_0x009b
        L_0x0099:
            r23 = r55
        L_0x009b:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a3
            r24 = r2
            goto L_0x00a5
        L_0x00a3:
            r24 = r56
        L_0x00a5:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00ad
            r25 = r2
            goto L_0x00af
        L_0x00ad:
            r25 = r57
        L_0x00af:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b7
            r26 = r2
            goto L_0x00b9
        L_0x00b7:
            r26 = r58
        L_0x00b9:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c1
            r27 = r2
            goto L_0x00c3
        L_0x00c1:
            r27 = r59
        L_0x00c3:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00cb
            r28 = r2
            goto L_0x00cd
        L_0x00cb:
            r28 = r60
        L_0x00cd:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00d5
            r29 = r2
            goto L_0x00d7
        L_0x00d5:
            r29 = r61
        L_0x00d7:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00df
            r30 = r2
            goto L_0x00e1
        L_0x00df:
            r30 = r62
        L_0x00e1:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00e9
            r31 = r2
            goto L_0x00eb
        L_0x00e9:
            r31 = r63
        L_0x00eb:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00f3
            r32 = r2
            goto L_0x00f5
        L_0x00f3:
            r32 = r64
        L_0x00f5:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00fd
            r33 = r2
            goto L_0x00ff
        L_0x00fd:
            r33 = r65
        L_0x00ff:
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0107
            r34 = r3
            goto L_0x0109
        L_0x0107:
            r34 = r66
        L_0x0109:
            r3 = r35
            r5 = r37
            r8 = r40
            r9 = r41
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNodeType.<init>(java.lang.String, id.dana.data.merchant.repository.source.network.response.InquiryStatus, java.lang.String, java.util.List, o.toggleConsole, o.toggleConsole, o.toggleConsole, java.lang.String, o.toggleConsole, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.getAppDir, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final List<Object> getBillDetail() {
        return this.billDetail;
    }
}
