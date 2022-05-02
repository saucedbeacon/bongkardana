package o;

import java.util.ArrayList;
import java.util.List;

public class getMethodName extends setSpeed<getMonitorToken, isRemoteExtension> {
    public List<isRemoteExtension> apply(List<RemoteNormalExtensionInvoker> list, List<NodeAware> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (RemoteNormalExtensionInvoker next : list) {
                if (next != null) {
                    arrayList.add(map(next));
                }
            }
        }
        if (list2 != null) {
            for (NodeAware next2 : list2) {
                if (next2 != null) {
                    arrayList.add(map(next2));
                }
            }
        }
        return arrayList;
    }

    private isRemoteExtension map(RemoteNormalExtensionInvoker remoteNormalExtensionInvoker) {
        if (remoteNormalExtensionInvoker == null) {
            return null;
        }
        isRemoteExtension isremoteextension = new isRemoteExtension();
        isremoteextension.setType(1);
        isremoteextension.setAlias(remoteNormalExtensionInvoker.getAlias());
        isremoteextension.setId(remoteNormalExtensionInvoker.getInstId());
        isremoteextension.setImageUrl(remoteNormalExtensionInvoker.getBankLogo());
        isremoteextension.setInstLocalName(remoteNormalExtensionInvoker.getInstLocalName());
        isremoteextension.setLastUpdated(remoteNormalExtensionInvoker.getLastUpdated());
        isremoteextension.setLastUpdateTime(remoteNormalExtensionInvoker.getLastUpdated());
        isremoteextension.setName(remoteNormalExtensionInvoker.getBankName());
        isremoteextension.setNumber(remoteNormalExtensionInvoker.getBankNumber());
        isremoteextension.setPayMethod(remoteNormalExtensionInvoker.getPayMethod());
        isremoteextension.setPayOption(remoteNormalExtensionInvoker.getPayOption());
        isremoteextension.setRecipientName(remoteNormalExtensionInvoker.getRecipientName());
        isremoteextension.setSenderName(remoteNormalExtensionInvoker.getSenderName());
        isremoteextension.setTransactionCount(remoteNormalExtensionInvoker.getTransactionCount());
        isremoteextension.setVisibleInQuickSend(remoteNormalExtensionInvoker.isVisibleInQuickSend());
        return isremoteextension;
    }

    private isRemoteExtension map(NodeAware nodeAware) {
        if (nodeAware == null) {
            return null;
        }
        isRemoteExtension isremoteextension = new isRemoteExtension();
        isremoteextension.setAlias(nodeAware.getUserNickName());
        isremoteextension.setId(nodeAware.getUserId());
        isremoteextension.setImageUrl(nodeAware.getAvatar());
        isremoteextension.setLastUpdated(nodeAware.getLastUpdated());
        isremoteextension.setLastUpdateTime(nodeAware.getLastUpdated());
        isremoteextension.setName(nodeAware.getUserNickName());
        isremoteextension.setNumber(nodeAware.getUserPhoneNumber());
        isremoteextension.setRecipientName(nodeAware.getUserNickName());
        isremoteextension.setType(0);
        isremoteextension.setTransactionCount(nodeAware.getTransactionCount());
        isremoteextension.setVisibleInQuickSend(nodeAware.isVisibleInQuickSend());
        return isremoteextension;
    }

    /* access modifiers changed from: protected */
    public isRemoteExtension map(getMonitorToken getmonitortoken) {
        if (getmonitortoken == null) {
            return null;
        }
        isRemoteExtension isremoteextension = new isRemoteExtension();
        isremoteextension.setType(getmonitortoken.getType());
        isremoteextension.setAlias(getmonitortoken.getAlias());
        isremoteextension.setId(getmonitortoken.getId());
        isremoteextension.setImageUrl(getmonitortoken.getImageUrl());
        isremoteextension.setInstLocalName(getmonitortoken.getInstLocalName());
        isremoteextension.setLastUpdated(getmonitortoken.getLastUpdated());
        isremoteextension.setLastUpdateTime(getmonitortoken.getLastUpdated());
        isremoteextension.setName(getmonitortoken.getName());
        isremoteextension.setNumber(getmonitortoken.getNumber());
        isremoteextension.setPayMethod(getmonitortoken.getPayMethod());
        isremoteextension.setPayOption(getmonitortoken.getPayOption());
        isremoteextension.setRecipientName(getmonitortoken.getRecipientName());
        isremoteextension.setSenderName(getmonitortoken.getSenderName());
        isremoteextension.setCardIndexNo(getmonitortoken.getCardIndexNo());
        isremoteextension.setPrefix(getmonitortoken.getPrefix());
        isremoteextension.setTransactionCount(getmonitortoken.getTransactionCount());
        isremoteextension.setVisibleInQuickSend(getmonitortoken.isVisibleInQuickSend());
        return isremoteextension;
    }
}
