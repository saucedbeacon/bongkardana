package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\n"}, d2 = {"Lid/dana/sendmoney/mapper/WithdrawSavedCardChannelModelMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/domain/withdraw/model/WithdrawSavedCardChannelView;", "Lid/dana/sendmoney/model/WithdrawSavedCardChannelModel;", "()V", "map", "oldItem", "transform", "withdrawSavedCardChannelView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onPageClicked extends setSpeed<List<? extends BluetoothState>, List<? extends setPhotoPreview>> {
    public final /* synthetic */ Object map(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BluetoothState bluetoothState = (BluetoothState) it.next();
                Iterator it2 = it;
                setPhotoPreview setphotopreview = r3;
                setPhotoPreview setphotopreview2 = new setPhotoPreview(bluetoothState.getBindingId(), bluetoothState.getCardIndexNo(), Integer.valueOf(bluetoothState.getCardNoLength()), Boolean.valueOf(bluetoothState.isDisable()), bluetoothState.getFormattedHolderName(), bluetoothState.getFormattedMaskedCardNo(), bluetoothState.getInstId(), bluetoothState.getInstLocalName(), bluetoothState.getInstName(), bluetoothState.getPayMethod(), bluetoothState.getPayOption(), Boolean.valueOf(bluetoothState.isValidData()));
                arrayList.add(setphotopreview);
                it = it2;
            }
        }
        return arrayList;
    }
}
