package o;

import o.IpcMessage;

public class px2sp extends setSpeed<IpcMessage.AnonymousClass1, parseHex> {
    /* access modifiers changed from: protected */
    public parseHex map(IpcMessage.AnonymousClass1 r3) {
        if (r3 == null) {
            return null;
        }
        parseHex parsehex = new parseHex();
        parsehex.setCardIndexNo(r3.getCardIndexNo());
        parsehex.setFormattedHolderName(r3.getFormattedHolderName());
        parsehex.setFormattedMaskedCardNo(r3.getFormattedMaskedCardNo());
        parsehex.setHolderName(transform(r3.getHolderName()));
        return parsehex;
    }

    private longToByteArray transform(sendMsgToServer sendmsgtoserver) {
        longToByteArray longtobytearray = new longToByteArray();
        longtobytearray.setFirstName(sendmsgtoserver.getFirstName());
        longtobytearray.setLastName(sendmsgtoserver.getLastName());
        return longtobytearray;
    }
}
