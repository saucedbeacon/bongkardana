package o;

import androidx.annotation.RestrictTo;
import io.split.android.client.dtos.Event;
import io.split.android.client.dtos.KeyImpression;
import io.split.android.client.dtos.MySegment;
import io.split.android.client.dtos.SplitChange;
import io.split.android.client.network.HttpClient;
import io.split.android.client.service.http.HttpFetcher;
import io.split.android.client.service.http.HttpRecorder;
import java.net.URISyntaxException;
import java.util.List;
import o.IInitializeComponent;
import o.b;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class registerInitFinishListener {
    public static HttpFetcher<SplitChange> getSplitsFetcher(showCenterToast showcentertoast, HttpClient httpClient, String str, b.a aVar, String str2) throws URISyntaxException {
        return new ILiteVMComponent(httpClient, getStringDDpEx.splitChanges(str, str2), aVar, new getKeepAliveDuration("splitChangeFetcher.exception", "splitChangeFetcher.time", "splitChangeFetcher.status.%d"), showcentertoast, new analyzeOpenId());
    }

    public static HttpFetcher<List<MySegment>> getMySegmentsFetcher(showCenterToast showcentertoast, HttpClient httpClient, String str, String str2, b.a aVar) throws URISyntaxException {
        return new ILiteVMComponent(httpClient, getStringDDpEx.mySegments(str, str2), aVar, new getKeepAliveDuration("mySegmentsFetcher.exception", "mySegmentsFetcher.time", "mySegmentsFetcher.status.%d"), showcentertoast, new LiteVMParameterWrapper());
    }

    public static HttpRecorder<List<Event>> getEventsRecorder(showCenterToast showcentertoast, HttpClient httpClient, String str) throws URISyntaxException {
        return new IInitializeComponent.IInitFinishListenerV2(httpClient, getStringDDpEx.events(str), showcentertoast, new initializeAsync());
    }

    public static HttpRecorder<List<KeyImpression>> getImpressionsRecorder(showCenterToast showcentertoast, HttpClient httpClient, String str) throws URISyntaxException {
        return new IInitializeComponent.IInitFinishListenerV2(httpClient, getStringDDpEx.impressions(str), showcentertoast, new IMalDetect());
    }

    public static HttpRecorder<callLiteVMStringMethod> getImpressionsCountRecorder(showCenterToast showcentertoast, HttpClient httpClient, String str) throws URISyntaxException {
        return new IInitializeComponent.IInitFinishListenerV2(httpClient, getStringDDpEx.impressionsCount(str), showcentertoast, new callLiteVMByteMethod());
    }

    public static ISecurityGuardPlugin getSseAuthenticationFetcher(showCenterToast showcentertoast, HttpClient httpClient, String str) throws URISyntaxException {
        return new ISecurityGuardPlugin(httpClient, getStringDDpEx.sseAuthentication(str), showcentertoast, new saveToken());
    }
}
