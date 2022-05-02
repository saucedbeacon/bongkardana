package o;

import java.util.List;
import o.Pool;
import o.TitleBarRightButtonView;

public interface readStringArray2 {
    TitleBarRightButtonView.AnonymousClass1<getLong> getMissionDetail(String str, boolean z);

    TitleBarRightButtonView.AnonymousClass1<putDouble> getMissionSummaryResult(String str);

    TitleBarRightButtonView.AnonymousClass1<freeAll> queryActiveMissions(int i, int i2);

    TitleBarRightButtonView.AnonymousClass1<freeAll> queryMissionListByStatus(int i, int i2, List<String> list);

    TitleBarRightButtonView.AnonymousClass1<onInterrupt> redeemMission(String str);

    TitleBarRightButtonView.AnonymousClass1<RVClassLoaderFactory> redeemQuest(String str, String str2);

    TitleBarRightButtonView.AnonymousClass1<Pool.Poolable> trackUserQuest(String str, String str2, boolean z);
}
