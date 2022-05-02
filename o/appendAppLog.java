package o;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import o.TitleBarRightButtonView;
import o.syncUploadCoreByCategoryDirectly;

public final class appendAppLog extends realAppendLog<GoogleApiClient> {
    @SafeVarargs
    public static TitleBarRightButtonView.AnonymousClass1<GoogleApiClient> setMax(updateTimeZone updatetimezone, syncUploadCoreByCategoryDirectly syncuploadcorebycategorydirectly, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        return TitleBarRightButtonView.AnonymousClass1.create(new appendAppLog(updatetimezone, apiArr)).compose(new syncUploadCoreByCategoryDirectly.getMax(syncuploadcorebycategorydirectly.setMin.getMin()));
    }

    @SafeVarargs
    private appendAppLog(updateTimeZone updatetimezone, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        super(updatetimezone, apiArr);
    }

    /* access modifiers changed from: protected */
    public final void getMin(GoogleApiClient googleApiClient, TitleBarRightButtonView.AnonymousClass2<? super GoogleApiClient> r3) {
        if (!r3.isDisposed()) {
            r3.onNext(googleApiClient);
        }
    }
}
