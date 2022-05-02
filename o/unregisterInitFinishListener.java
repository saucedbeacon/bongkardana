package o;

import io.split.android.client.dtos.Event;
import io.split.android.client.dtos.KeyImpression;
import io.split.android.client.dtos.MySegment;
import io.split.android.client.dtos.SplitChange;
import io.split.android.client.service.http.HttpFetcher;
import io.split.android.client.service.http.HttpRecorder;
import io.split.android.client.service.sseclient.SseAuthenticationResponse;
import java.util.List;

public class unregisterInitFinishListener {
    private final HttpRecorder<List<Event>> mEventsRecorder;
    private final HttpRecorder<callLiteVMStringMethod> mImpressionsCountRecorder;
    private final HttpRecorder<List<KeyImpression>> mImpressionsRecorder;
    private final HttpFetcher<List<MySegment>> mMySegmentsFetcher;
    private final HttpFetcher<SplitChange> mSplitFetcher;
    private final HttpFetcher<SseAuthenticationResponse> mSseAuthenticationFetcher;

    /* JADX WARNING: type inference failed for: r1v0, types: [io.split.android.client.service.http.HttpFetcher<io.split.android.client.dtos.SplitChange>, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, io.split.android.client.service.http.HttpFetcher<java.util.List<io.split.android.client.dtos.MySegment>>] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, io.split.android.client.service.http.HttpRecorder<java.util.List<io.split.android.client.dtos.Event>>] */
    /* JADX WARNING: type inference failed for: r5v0, types: [io.split.android.client.service.http.HttpRecorder<java.util.List<io.split.android.client.dtos.KeyImpression>>, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, io.split.android.client.service.http.HttpRecorder<o.callLiteVMStringMethod>] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public unregisterInitFinishListener(@androidx.annotation.NonNull io.split.android.client.service.http.HttpFetcher<io.split.android.client.dtos.SplitChange> r1, @androidx.annotation.NonNull io.split.android.client.service.http.HttpFetcher<java.util.List<io.split.android.client.dtos.MySegment>> r2, @androidx.annotation.NonNull o.ISecurityGuardPlugin r3, @androidx.annotation.NonNull io.split.android.client.service.http.HttpRecorder<java.util.List<io.split.android.client.dtos.Event>> r4, @androidx.annotation.NonNull io.split.android.client.service.http.HttpRecorder<java.util.List<io.split.android.client.dtos.KeyImpression>> r5, @androidx.annotation.NonNull io.split.android.client.service.http.HttpRecorder<o.callLiteVMStringMethod> r6) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            io.split.android.client.service.http.HttpFetcher r1 = (io.split.android.client.service.http.HttpFetcher) r1
            r0.mSplitFetcher = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            io.split.android.client.service.http.HttpFetcher r1 = (io.split.android.client.service.http.HttpFetcher) r1
            r0.mMySegmentsFetcher = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            io.split.android.client.service.http.HttpFetcher r1 = (io.split.android.client.service.http.HttpFetcher) r1
            r0.mSseAuthenticationFetcher = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r4)
            io.split.android.client.service.http.HttpRecorder r1 = (io.split.android.client.service.http.HttpRecorder) r1
            r0.mEventsRecorder = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r5)
            io.split.android.client.service.http.HttpRecorder r1 = (io.split.android.client.service.http.HttpRecorder) r1
            r0.mImpressionsRecorder = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r6)
            io.split.android.client.service.http.HttpRecorder r1 = (io.split.android.client.service.http.HttpRecorder) r1
            r0.mImpressionsCountRecorder = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unregisterInitFinishListener.<init>(io.split.android.client.service.http.HttpFetcher, io.split.android.client.service.http.HttpFetcher, o.ISecurityGuardPlugin, io.split.android.client.service.http.HttpRecorder, io.split.android.client.service.http.HttpRecorder, io.split.android.client.service.http.HttpRecorder):void");
    }

    public HttpFetcher<SplitChange> getSplitFetcher() {
        return this.mSplitFetcher;
    }

    public HttpFetcher<List<MySegment>> getMySegmentsFetcher() {
        return this.mMySegmentsFetcher;
    }

    public HttpFetcher<SseAuthenticationResponse> getSseAuthenticationFetcher() {
        return this.mSseAuthenticationFetcher;
    }

    public HttpRecorder<List<Event>> getEventsRecorder() {
        return this.mEventsRecorder;
    }

    public HttpRecorder<List<KeyImpression>> getImpressionsRecorder() {
        return this.mImpressionsRecorder;
    }

    public HttpRecorder<callLiteVMStringMethod> getImpressionsCountRecorder() {
        return this.mImpressionsCountRecorder;
    }
}
