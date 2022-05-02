package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Arrays;
import java.util.List;
import o.TitleBarRightButtonView;
import pl.charmas.android.reactivelocation2.observables.GoogleAPIConnectionException;
import pl.charmas.android.reactivelocation2.observables.GoogleAPIConnectionSuspendedException;

public abstract class realAppendLog<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<T> {
    private final Handler getMax;
    private final List<Api<? extends Api.ApiOptions.NotRequiredOptions>> getMin;
    private final Context setMax;

    /* access modifiers changed from: protected */
    public abstract void getMin(GoogleApiClient googleApiClient, TitleBarRightButtonView.AnonymousClass2<? super T> r2);

    /* access modifiers changed from: protected */
    public void length(GoogleApiClient googleApiClient) {
    }

    @SafeVarargs
    public realAppendLog(updateTimeZone updatetimezone, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        this.setMax = updatetimezone.getMin;
        this.getMax = updatetimezone.getMax;
        this.getMin = Arrays.asList(apiArr);
    }

    class getMax implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
        GoogleApiClient getMax;
        private final TitleBarRightButtonView.AnonymousClass2<? super T> length;

        /* synthetic */ getMax(realAppendLog realappendlog, TitleBarRightButtonView.AnonymousClass2 r2, byte b) {
            this(r2);
        }

        private getMax(TitleBarRightButtonView.AnonymousClass2<? super T> r2) {
            this.length = r2;
        }

        public final void onConnected(Bundle bundle) {
            try {
                realAppendLog.this.getMin(this.getMax, this.length);
            } catch (Throwable th) {
                if (!this.length.isDisposed()) {
                    this.length.onError(th);
                }
            }
        }

        public final void onConnectionSuspended(int i) {
            if (!this.length.isDisposed()) {
                this.length.onError(new GoogleAPIConnectionSuspendedException(i));
            }
        }

        public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            if (!this.length.isDisposed()) {
                this.length.onError(new GoogleAPIConnectionException("Error connecting to GoogleApiClient.", connectionResult));
            }
        }
    }

    public void subscribe(TitleBarRightButtonView.AnonymousClass2<T> r5) throws Exception {
        getMax getmax = new getMax(this, r5, (byte) 0);
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.setMax);
        for (Api<? extends Api.ApiOptions.NotRequiredOptions> addApi : this.getMin) {
            builder = builder.addApi(addApi);
        }
        GoogleApiClient.Builder addOnConnectionFailedListener = builder.addConnectionCallbacks(getmax).addOnConnectionFailedListener(getmax);
        Handler handler = this.getMax;
        if (handler != null) {
            addOnConnectionFailedListener = addOnConnectionFailedListener.setHandler(handler);
        }
        final GoogleApiClient build = addOnConnectionFailedListener.build();
        getmax.getMax = build;
        try {
            build.connect();
        } catch (Throwable th) {
            if (!r5.isDisposed()) {
                r5.onError(th);
            }
        }
        AnonymousClass1 r0 = new removeStateDidChangeHandler() {
            public final void getMax() throws Exception {
                realAppendLog.this.length(build);
                build.disconnect();
            }
        };
        setRefreshAnimation.getMax(r0, "run is null");
        r5.setDisposable(new setdeltaProgressValue(r0));
    }
}
