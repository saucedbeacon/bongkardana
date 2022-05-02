package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/data/recentrecipient/mapper/RecentRecipientEntityArrayMapper;", "", "()V", "toRecentRecipientEntity", "Lid/dana/data/recentrecipient/model/RecentRecipientEntity;", "recentRecipient", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "toRecentRecipientEntityArray", "", "recentRecipients", "", "(Ljava/util/List;)[Lid/dana/data/recentrecipient/model/RecentRecipientEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RemoteCallArgs {
    @NotNull
    public static final RemoteCallArgs INSTANCE = new RemoteCallArgs();

    private RemoteCallArgs() {
    }

    @NotNull
    public final isRemoteExtension[] toRecentRecipientEntityArray(@NotNull List<? extends getMonitorToken> list) {
        Intrinsics.checkNotNullParameter(list, "recentRecipients");
        int size = list.size();
        isRemoteExtension[] isremoteextensionArr = new isRemoteExtension[size];
        if (!(!list.isEmpty())) {
            return new isRemoteExtension[0];
        }
        for (int i = 0; i < size; i++) {
            isremoteextensionArr[i] = toRecentRecipientEntity((getMonitorToken) list.get(i));
        }
        return (isRemoteExtension[]) ArraysKt.requireNoNulls(isremoteextensionArr);
    }

    private final isRemoteExtension toRecentRecipientEntity(getMonitorToken getmonitortoken) {
        isRemoteExtension isremoteextension = new isRemoteExtension();
        isremoteextension.setId(getmonitortoken.getId());
        isremoteextension.setAlias(getmonitortoken.getAlias());
        isremoteextension.setCardIndexNo(getmonitortoken.getCardIndexNo());
        isremoteextension.setImageUrl(getmonitortoken.getImageUrl());
        isremoteextension.setInstLocalName(getmonitortoken.getInstLocalName());
        isremoteextension.setLastUpdated(getmonitortoken.getLastUpdated());
        isremoteextension.setName(getmonitortoken.getName());
        isremoteextension.setNumber(getmonitortoken.getNumber());
        isremoteextension.setPayMethod(getmonitortoken.getPayMethod());
        isremoteextension.setPayOption(getmonitortoken.getPayOption());
        isremoteextension.setRecipientName(getmonitortoken.getRecipientName());
        isremoteextension.setSenderName(getmonitortoken.getSenderName());
        isremoteextension.setType(getmonitortoken.getType());
        isremoteextension.setPrefix(getmonitortoken.getPrefix());
        isremoteextension.setTransactionCount(getmonitortoken.getTransactionCount());
        return isremoteextension;
    }
}
