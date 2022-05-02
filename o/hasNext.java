package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class hasNext extends setSpeed<List<RemoteNormalExtensionInvoker>, List<ErrorPageUtils>> {
    @Inject
    hasNext() {
    }

    public ErrorPageUtils apply(isRemoteExtension isremoteextension) {
        return map(isremoteextension);
    }

    public RemoteNormalExtensionInvoker apply(ErrorPageUtils errorPageUtils) {
        return map(errorPageUtils);
    }

    public List<ErrorPageUtils> apply(List<RemoteNormalExtensionInvoker> list) {
        return map(list);
    }

    /* access modifiers changed from: protected */
    public List<ErrorPageUtils> map(List<RemoteNormalExtensionInvoker> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (RemoteNormalExtensionInvoker next : list) {
            if (isValidSecureRecentBank(next.getCardIndexNo())) {
                ErrorPageUtils errorPageUtils = new ErrorPageUtils();
                errorPageUtils.setBankNumber(next.getBankNumber());
                errorPageUtils.setBankName(next.getBankName());
                errorPageUtils.setBankLogo(next.getBankLogo());
                errorPageUtils.setAlias(next.getAlias());
                errorPageUtils.setRecipientName(next.getRecipientName());
                errorPageUtils.setLastUpdated(next.getLastUpdated());
                errorPageUtils.setInstId(next.getInstId());
                errorPageUtils.setInstLocalName(next.getInstLocalName());
                errorPageUtils.setPayMethod(next.getPayMethod());
                errorPageUtils.setPayOption(next.getPayOption());
                errorPageUtils.setSenderName(next.getSenderName());
                errorPageUtils.setCardIndexNo(next.getCardIndexNo());
                errorPageUtils.setPrefix(next.getPrefix());
                errorPageUtils.setTransactionCount(next.getTransactionCount());
                errorPageUtils.setVisibleInQuickSend(next.isVisibleInQuickSend());
                arrayList.add(errorPageUtils);
            }
        }
        return arrayList;
    }

    private RemoteNormalExtensionInvoker map(ErrorPageUtils errorPageUtils) {
        if (errorPageUtils == null) {
            return null;
        }
        RemoteNormalExtensionInvoker remoteNormalExtensionInvoker = new RemoteNormalExtensionInvoker(errorPageUtils.getCardIndexNo());
        remoteNormalExtensionInvoker.setBankNumber(errorPageUtils.getBankNumber());
        remoteNormalExtensionInvoker.setBankName(errorPageUtils.getBankName());
        remoteNormalExtensionInvoker.setBankLogo(errorPageUtils.getBankLogo());
        remoteNormalExtensionInvoker.setAlias(errorPageUtils.getAlias());
        remoteNormalExtensionInvoker.setRecipientName(errorPageUtils.getRecipientName());
        remoteNormalExtensionInvoker.setLastUpdated(errorPageUtils.getLastUpdated());
        remoteNormalExtensionInvoker.setInstId(errorPageUtils.getInstId());
        remoteNormalExtensionInvoker.setInstLocalName(errorPageUtils.getInstLocalName());
        remoteNormalExtensionInvoker.setPayMethod(errorPageUtils.getPayMethod());
        remoteNormalExtensionInvoker.setPayOption(errorPageUtils.getPayOption());
        remoteNormalExtensionInvoker.setSenderName(errorPageUtils.getSenderName());
        remoteNormalExtensionInvoker.setCardIndexNo(errorPageUtils.getCardIndexNo());
        remoteNormalExtensionInvoker.setPrefix(errorPageUtils.getPrefix());
        remoteNormalExtensionInvoker.setTransactionCount(errorPageUtils.getTransactionCount());
        remoteNormalExtensionInvoker.setVisibleInQuickSend(errorPageUtils.isVisibleInQuickSend());
        return remoteNormalExtensionInvoker;
    }

    private ErrorPageUtils map(isRemoteExtension isremoteextension) {
        if (isremoteextension == null) {
            return null;
        }
        ErrorPageUtils errorPageUtils = new ErrorPageUtils();
        errorPageUtils.setInstId(isremoteextension.getId());
        errorPageUtils.setAlias(isremoteextension.getAlias());
        errorPageUtils.setBankName(isremoteextension.getRecipientName());
        errorPageUtils.setRecipientName(isremoteextension.getRecipientName());
        errorPageUtils.setBankLogo(isremoteextension.getImageUrl());
        errorPageUtils.setBankNumber(isremoteextension.getNumber());
        errorPageUtils.setLastUpdated(isremoteextension.getLastUpdated());
        errorPageUtils.setInstLocalName(isremoteextension.getInstLocalName());
        errorPageUtils.setPayMethod(isremoteextension.getPayMethod());
        errorPageUtils.setPayOption(isremoteextension.getPayOption());
        errorPageUtils.setSenderName(isremoteextension.getSenderName());
        errorPageUtils.setCardIndexNo(isremoteextension.getCardIndexNo());
        return errorPageUtils;
    }

    private boolean isValidSecureRecentBank(String str) {
        return !TextUtils.isEmpty(str) && str.length() > 16;
    }
}
