package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0003H\u0002¨\u0006\u0006"}, d2 = {"fixTimeFormat", "", "mapLastUpdated", "Lid/dana/data/recentrecipient/model/RecentRecipientEntity;", "toRecentRecipient", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getPid {
    /* access modifiers changed from: private */
    public static final getMonitorToken toRecentRecipient(isRemoteExtension isremoteextension) {
        getMonitorToken getmonitortoken = new getMonitorToken();
        getmonitortoken.setAlias(isremoteextension.getAlias());
        getmonitortoken.setId(isremoteextension.getId());
        getmonitortoken.setImageUrl(isremoteextension.getImageUrl());
        getmonitortoken.setInstLocalName(isremoteextension.getInstLocalName());
        getmonitortoken.setLastUpdated(fixTimeFormat(mapLastUpdated(isremoteextension)));
        getmonitortoken.setName(isremoteextension.getName());
        getmonitortoken.setNumber(isremoteextension.getNumber());
        getmonitortoken.setPayMethod(isremoteextension.getPayMethod());
        getmonitortoken.setPayOption(isremoteextension.getPayOption());
        getmonitortoken.setRecipientName(isremoteextension.getRecipientName());
        getmonitortoken.setSenderName(isremoteextension.getSenderName());
        getmonitortoken.setType(isremoteextension.getType());
        getmonitortoken.setCardIndexNo(isremoteextension.getCardIndexNo());
        getmonitortoken.setPrefix(isremoteextension.getPrefix());
        getmonitortoken.setTransactionCount(isremoteextension.getTransactionCount());
        getmonitortoken.setVisibleInQuickSend(isremoteextension.isVisibleInQuickSend());
        return getmonitortoken;
    }

    private static final long mapLastUpdated(isRemoteExtension isremoteextension) {
        if (isremoteextension.getLastUpdated() == 0 || isremoteextension.getLastUpdateTime() > isremoteextension.getLastUpdated()) {
            return isremoteextension.getLastUpdateTime();
        }
        return isremoteextension.getLastUpdated();
    }

    private static final long fixTimeFormat(long j) {
        Long valueOf = Long.valueOf(j);
        long longValue = valueOf.longValue();
        if (1 <= longValue && 9999999999L >= longValue) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.longValue() : j * 1000;
    }
}
