package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¨\u0006\b"}, d2 = {"Lid/dana/data/recentrecipient/mapper/SecureRecentRecipientEntityMapper;", "", "()V", "toRecentRecipients", "", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "oldItem", "Lid/dana/data/recentbank/repository/source/persistance/entity/RecentBankEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RemoteControlManagement {
    @NotNull
    public static final RemoteControlManagement INSTANCE = new RemoteControlManagement();

    private RemoteControlManagement() {
    }

    @JvmStatic
    @NotNull
    public static final List<getMonitorToken> toRecentRecipients(@NotNull List<? extends InvokeException> list) {
        Intrinsics.checkNotNullParameter(list, "oldItem");
        ArrayList arrayList = new ArrayList();
        for (InvokeException invokeException : list) {
            getMonitorToken getmonitortoken = new getMonitorToken();
            getmonitortoken.setAlias(invokeException.getAlias());
            getmonitortoken.setId(invokeException.getInstId());
            getmonitortoken.setImageUrl(invokeException.getBankLogo());
            getmonitortoken.setInstLocalName(invokeException.getInstLocalName());
            getmonitortoken.setLastUpdated(invokeException.getLastUpdated());
            getmonitortoken.setName(invokeException.getBankName());
            getmonitortoken.setNumber(invokeException.getBankNumber());
            getmonitortoken.setPayMethod(invokeException.getPayMethod());
            getmonitortoken.setPayOption(invokeException.getPayOption());
            getmonitortoken.setRecipientName(invokeException.getRecipientName());
            getmonitortoken.setSenderName(invokeException.getSenderName());
            getmonitortoken.setType(1);
            arrayList.add(getmonitortoken);
        }
        return arrayList;
    }
}
