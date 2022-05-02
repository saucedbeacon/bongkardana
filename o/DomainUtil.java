package o;

import java.util.ArrayList;
import java.util.List;
import o.BluetoothState;

public class DomainUtil extends setSpeed<List<getByteArrayPool>, List<BluetoothState>> {
    /* access modifiers changed from: protected */
    public List<BluetoothState> map(List<getByteArrayPool> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (getByteArrayPool next : list) {
            arrayList.add(new BluetoothState.setMax().bindingId(next.getBindingId()).cardIndexNo(next.getCardIndexNo()).cardNoLength(next.getCardNoLength()).disable(next.isDisable()).formattedHolderName(next.getFormattedHolderName()).formattedMaskedCardNo(next.getFormattedMaskedCardNo()).instId(next.getInstId()).instLocalName(next.getInstLocalName()).instName(next.getInstName()).payMethod(next.getPayMethod()).payOption(next.getPayOption()).validData(next.isValidData()).build());
        }
        return arrayList;
    }
}
