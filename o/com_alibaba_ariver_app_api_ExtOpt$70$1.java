package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000¨\u0006\n"}, d2 = {"toLoyaltyReceiptEntity", "Lid/dana/data/loyalty/repository/source/local/entity/LoyaltyReceiptEntity;", "Lid/dana/domain/loyalty/model/FileOcrReceiptLoyalty;", "toOcrReceiptLoyalty", "toSubmitReceiptRequest", "Lid/dana/data/loyalty/repository/source/network/request/SubmitReceiptRequest;", "Lid/dana/domain/loyalty/model/Base64ReceiptLoyalty;", "toSubmitReceiptResult", "Lid/dana/domain/loyalty/model/SubmitReceiptResult;", "Lid/dana/data/loyalty/repository/source/network/response/SubmitReceiptResponse;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$70$1 {
    @NotNull
    public static final threshold toSubmitReceiptResult(@NotNull com_alibaba_ariver_app_api_ExtOpt$88$1 com_alibaba_ariver_app_api_extopt_88_1) {
        String str;
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_88_1, "$this$toSubmitReceiptResult");
        String id2 = com_alibaba_ariver_app_api_extopt_88_1.getId();
        String createdDate = com_alibaba_ariver_app_api_extopt_88_1.getCreatedDate();
        String modifiedDate = com_alibaba_ariver_app_api_extopt_88_1.getModifiedDate();
        String orderId = com_alibaba_ariver_app_api_extopt_88_1.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        String merchantId = com_alibaba_ariver_app_api_extopt_88_1.getMerchantId();
        if (merchantId == null) {
            merchantId = "";
        }
        String merchantName = com_alibaba_ariver_app_api_extopt_88_1.getMerchantName();
        if (merchantName == null) {
            merchantName = "";
        }
        String loyaltyMerchantName = com_alibaba_ariver_app_api_extopt_88_1.getLoyaltyMerchantName();
        if (loyaltyMerchantName == null) {
            loyaltyMerchantName = "";
        }
        String originalMerchantName = com_alibaba_ariver_app_api_extopt_88_1.getOriginalMerchantName();
        if (originalMerchantName == null) {
            originalMerchantName = "";
        }
        String orderDate = com_alibaba_ariver_app_api_extopt_88_1.getOrderDate();
        if (orderDate == null) {
            orderDate = "";
        }
        String orderAmount = com_alibaba_ariver_app_api_extopt_88_1.getOrderAmount();
        if (orderAmount == null) {
            orderAmount = "";
        }
        String imageAssetUrl = com_alibaba_ariver_app_api_extopt_88_1.getImageAssetUrl();
        if (imageAssetUrl == null) {
            imageAssetUrl = "";
        }
        String userLoyaltyId = com_alibaba_ariver_app_api_extopt_88_1.getUserLoyaltyId();
        if (userLoyaltyId == null) {
            userLoyaltyId = "";
        }
        String receiptStatus = com_alibaba_ariver_app_api_extopt_88_1.getReceiptStatus();
        if (receiptStatus == null) {
            receiptStatus = "";
        }
        String receiptResultType = com_alibaba_ariver_app_api_extopt_88_1.getReceiptResultType();
        if (receiptResultType == null) {
            receiptResultType = "";
        }
        String receiptApprovalStatus = com_alibaba_ariver_app_api_extopt_88_1.getReceiptApprovalStatus();
        if (receiptApprovalStatus == null) {
            receiptApprovalStatus = "";
        }
        String pointGenerated = com_alibaba_ariver_app_api_extopt_88_1.getPointGenerated();
        if (pointGenerated == null) {
            pointGenerated = "";
        }
        String reasonId = com_alibaba_ariver_app_api_extopt_88_1.getReasonId();
        if (reasonId == null) {
            reasonId = "";
        }
        String reasonEn = com_alibaba_ariver_app_api_extopt_88_1.getReasonEn();
        if (reasonEn == null) {
            str = "";
        } else {
            str = reasonEn;
        }
        return new threshold(id2, createdDate, modifiedDate, orderId, merchantId, merchantName, loyaltyMerchantName, originalMerchantName, orderDate, orderAmount, imageAssetUrl, userLoyaltyId, receiptStatus, receiptResultType, receiptApprovalStatus, pointGenerated, reasonId, str);
    }

    @NotNull
    public static final code toOcrReceiptLoyalty(@NotNull com_alibaba_ariver_app_api_ExtOpt$80$1 com_alibaba_ariver_app_api_extopt_80_1) {
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_80_1, "$this$toOcrReceiptLoyalty");
        return new code(com_alibaba_ariver_app_api_extopt_80_1.getOrderId(), com_alibaba_ariver_app_api_extopt_80_1.getMerchantName(), com_alibaba_ariver_app_api_extopt_80_1.getOrderAmount(), com_alibaba_ariver_app_api_extopt_80_1.getTimestamp(), com_alibaba_ariver_app_api_extopt_80_1.getRawText(), com_alibaba_ariver_app_api_extopt_80_1.getMerchantId(), com_alibaba_ariver_app_api_extopt_80_1.getUserLoyaltyId(), com_alibaba_ariver_app_api_extopt_80_1.getFilePath());
    }

    @NotNull
    public static final com_alibaba_ariver_app_api_ExtOpt$80$1 toLoyaltyReceiptEntity(@NotNull code code) {
        Intrinsics.checkNotNullParameter(code, "$this$toLoyaltyReceiptEntity");
        return new com_alibaba_ariver_app_api_ExtOpt$80$1(code.getUserLoyaltyId(), code.getMerchantId(), code.getOrderId(), code.getMerchantName(), code.getOrderAmount(), code.getTimestamp(), code.getFilePath(), code.getRawText());
    }

    @NotNull
    public static final com_alibaba_ariver_app_api_ExtOpt$81$1 toSubmitReceiptRequest(@NotNull MonitorMap monitorMap) {
        Intrinsics.checkNotNullParameter(monitorMap, "$this$toSubmitReceiptRequest");
        return new com_alibaba_ariver_app_api_ExtOpt$81$1(monitorMap.getOrderId(), monitorMap.getMerchantName(), monitorMap.getOrderAmount(), monitorMap.getTimestamp(), monitorMap.getBase64Receipt(), monitorMap.getRawText(), monitorMap.getMerchantId(), monitorMap.getUserLoyaltyId());
    }
}
