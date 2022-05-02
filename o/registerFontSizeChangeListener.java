package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/globalnetwork/mapper/GnConsultMapper;", "", "()V", "transform", "Lid/dana/domain/globalnetwork/model/GnConsultInfo;", "gnConsultResult", "Lid/dana/data/globalnetwork/model/GnConsultResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class registerFontSizeChangeListener {
    @NotNull
    public final ReceivedTitlePoint transform(@NotNull PageContainer pageContainer) {
        Intrinsics.checkNotNullParameter(pageContainer, "gnConsultResult");
        ReceivedTitlePoint receivedTitlePoint = new ReceivedTitlePoint((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        receivedTitlePoint.setResult(pageContainer.getResult());
        receivedTitlePoint.setSdkResponseHeader(pageContainer.getSdkResponseHeader());
        receivedTitlePoint.setSdkResponseData(pageContainer.getSdkResponseData());
        receivedTitlePoint.setSuccess(pageContainer.success);
        return receivedTitlePoint;
    }
}
