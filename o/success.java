package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lid/dana/domain/auth/face/repository/FaceAuthPopUpConsultationRepository;", "", "shouldNeverShowFaceAuthSuggestion", "Lio/reactivex/Observable;", "", "getShouldNeverShowFaceAuthSuggestion", "()Lio/reactivex/Observable;", "shouldSuggestFaceAuth", "getShouldSuggestFaceAuth", "clearFaceAuthSuggestionState", "consultFaceAuthPopUpToBackend", "Lid/dana/domain/auth/face/result/FaceAuthPopUpConsultationResult;", "parallelMode", "withKycStatus", "saveFaceAuthSuggestionState", "hasShown", "saveNeverShowFaceAuthSuggestionState", "shouldNeverShow", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface success {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> clearFaceAuthSuggestionState();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<updateLoadingInfo> consultFaceAuthPopUpToBackend(boolean z, boolean z2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> getShouldNeverShowFaceAuthSuggestion();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> getShouldSuggestFaceAuth();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveFaceAuthSuggestionState(boolean z);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveNeverShowFaceAuthSuggestionState(boolean z);
}
