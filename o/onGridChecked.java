package o;

import android.content.Context;
import id.dana.R;
import id.dana.data.base.NetworkException;
import java.util.List;
import javax.inject.Inject;
import o.y;

public final class onGridChecked implements y.setMin {
    /* access modifiers changed from: private */
    public final SaveImageToAlbumBridgeExtension getMax;
    /* access modifiers changed from: private */
    public final BucketAdapter getMin;
    /* access modifiers changed from: private */
    public final y.setMax length;
    /* access modifiers changed from: private */
    public final Context setMax;
    private final BleGattService setMin;

    @Inject
    public onGridChecked(Context context, SaveImageToAlbumBridgeExtension saveImageToAlbumBridgeExtension, BleGattService bleGattService, y.setMax setmax, BucketAdapter bucketAdapter) {
        this.setMax = context;
        this.getMax = saveImageToAlbumBridgeExtension;
        this.setMin = bleGattService;
        this.length = setmax;
        this.getMin = bucketAdapter;
    }

    public final void getMin() {
        this.setMin.execute(new GriverAppVirtualHostProxy<getDataFieldCount>() {
            public final /* synthetic */ void onNext(Object obj) {
                getDataFieldCount getdatafieldcount = (getDataFieldCount) obj;
                onGridChecked.this.length.onGetAvailableBanksSuccess((List) onGridChecked.this.getMax.apply(getdatafieldcount));
                if (onGridChecked.this.getMin.apply(getdatafieldcount) != null) {
                    onGridChecked.this.length.onGetSenderNameSuccess(((LoadInfo) onGridChecked.this.getMin.apply(getdatafieldcount)).length());
                }
            }

            public final void onError(Throwable th) {
                String str;
                super.onError(th);
                y.setMax min = onGridChecked.this.length;
                Context min2 = onGridChecked.this.setMax;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = min2.getString(R.string.general_error_msg);
                }
                min.onGetAvailableBanksFail(str);
            }
        });
    }

    public final void setMax() {
        this.setMin.dispose();
    }
}
