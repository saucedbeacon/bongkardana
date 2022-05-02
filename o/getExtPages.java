package o;

import com.alibaba.fastjson.JSON;

public class getExtPages extends setSpeed<createOnlineResource, onBluetoothCharacteristicWrite> {
    /* access modifiers changed from: protected */
    public onBluetoothCharacteristicWrite map(createOnlineResource createonlineresource) {
        if (createonlineresource == null) {
            return null;
        }
        onBluetoothCharacteristicWrite onbluetoothcharacteristicwrite = new onBluetoothCharacteristicWrite();
        onbluetoothcharacteristicwrite.setData((onBluetoothAdapterStateChange) JSON.parseObject(createonlineresource.getData(), onBluetoothAdapterStateChange.class));
        onbluetoothcharacteristicwrite.setExpireTime(createonlineresource.getExpireTime());
        onbluetoothcharacteristicwrite.setFinish(createonlineresource.isFinish());
        onbluetoothcharacteristicwrite.setVerifySuccess(createonlineresource.isVerifySuccess());
        return onbluetoothcharacteristicwrite;
    }
}
