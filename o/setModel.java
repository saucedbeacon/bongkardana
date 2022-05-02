package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0004H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/domain/social/ActivitySharingRepository;", "", "getFeedsSharingLastCheckedState", "Lio/reactivex/Observable;", "", "saveFeedsSharingLastCheckedState", "checked", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface setModel {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> getFeedsSharingLastCheckedState();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveFeedsSharingLastCheckedState(boolean z);
}
