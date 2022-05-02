package o;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, d2 = {"toEmoneyCardInfo", "Lid/dana/domain/electronicmoney/model/response/EmoneyCardInfo;", "Lid/dana/data/electronicmoney/network/response/EmoneyCardInfoResponse;", "toEmoneyGenerateTransId", "Lid/dana/domain/electronicmoney/model/response/EmoneyGenerateTransId;", "Lid/dana/data/electronicmoney/network/response/ElectronicMoneyGetBizIdResponse;", "toEmoneyReversal", "Lid/dana/domain/electronicmoney/model/response/EmoneyReversal;", "Lid/dana/data/electronicmoney/network/response/EmoneyReversalResponse;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class processTransparent {
    @NotNull
    public static final getUseWideViewPort setMin(@NotNull needWaitIpc needwaitipc) {
        Intrinsics.checkNotNullParameter(needwaitipc, "$this$toEmoneyCardInfo");
        boolean z = needwaitipc.success;
        String str = needwaitipc.errorCode;
        StartClientBundle data = needwaitipc.getData();
        String str2 = null;
        String apiVersion = data != null ? data.getApiVersion() : null;
        String str3 = "";
        String str4 = apiVersion == null ? str3 : apiVersion;
        StartClientBundle data2 = needwaitipc.getData();
        String approvalCode = data2 != null ? data2.getApprovalCode() : null;
        String str5 = approvalCode == null ? str3 : approvalCode;
        StartClientBundle data3 = needwaitipc.getData();
        String message = data3 != null ? data3.getMessage() : null;
        String str6 = message == null ? str3 : message;
        StartClientBundle data4 = needwaitipc.getData();
        String status = data4 != null ? data4.getStatus() : null;
        String str7 = status == null ? str3 : status;
        StartClientBundle data5 = needwaitipc.getData();
        String pendingTopup = data5 != null ? data5.getPendingTopup() : null;
        String str8 = pendingTopup == null ? str3 : pendingTopup;
        StartClientBundle data6 = needwaitipc.getData();
        String session = data6 != null ? data6.getSession() : null;
        String str9 = session == null ? str3 : session;
        Pair[] pairArr = new Pair[9];
        StartClientBundle data7 = needwaitipc.getData();
        String apiVersion2 = data7 != null ? data7.getApiVersion() : null;
        if (apiVersion2 == null) {
            apiVersion2 = str3;
        }
        pairArr[0] = TuplesKt.to("apiVersion", apiVersion2);
        StartClientBundle data8 = needwaitipc.getData();
        String approvalCode2 = data8 != null ? data8.getApprovalCode() : null;
        if (approvalCode2 == null) {
            approvalCode2 = str3;
        }
        pairArr[1] = TuplesKt.to("approvalCode", approvalCode2);
        StartClientBundle data9 = needwaitipc.getData();
        String message2 = data9 != null ? data9.getMessage() : null;
        if (message2 == null) {
            message2 = str3;
        }
        pairArr[2] = TuplesKt.to("message", message2);
        StartClientBundle data10 = needwaitipc.getData();
        String status2 = data10 != null ? data10.getStatus() : null;
        if (status2 == null) {
            status2 = str3;
        }
        pairArr[3] = TuplesKt.to("status", status2);
        StartClientBundle data11 = needwaitipc.getData();
        String pendingTopup2 = data11 != null ? data11.getPendingTopup() : null;
        if (pendingTopup2 == null) {
            pendingTopup2 = str3;
        }
        pairArr[4] = TuplesKt.to("pendingTopup", pendingTopup2);
        StartClientBundle data12 = needwaitipc.getData();
        String session2 = data12 != null ? data12.getSession() : null;
        if (session2 == null) {
            session2 = str3;
        }
        pairArr[5] = TuplesKt.to("session", session2);
        StartClientBundle data13 = needwaitipc.getData();
        String lastBalance = data13 != null ? data13.getLastBalance() : null;
        if (lastBalance == null) {
            lastBalance = str3;
        }
        pairArr[6] = TuplesKt.to("lastBalance", lastBalance);
        StartClientBundle data14 = needwaitipc.getData();
        String responseFromSam = data14 != null ? data14.getResponseFromSam() : null;
        if (responseFromSam == null) {
            responseFromSam = str3;
        }
        pairArr[7] = TuplesKt.to("responseFromSam", responseFromSam);
        StartClientBundle data15 = needwaitipc.getData();
        if (data15 != null) {
            str2 = data15.getCardNumber();
        }
        if (str2 != null) {
            str3 = str2;
        }
        pairArr[8] = TuplesKt.to("cardNumber", str3);
        return new getUseWideViewPort(z, str, str4, str5, str6, str7, str8, str9, MapsKt.mutableMapOf(pairArr));
    }
}
