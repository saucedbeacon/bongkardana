package o;

import id.dana.di.modules.SplitBillIntroductionModule;
import o.b;
import o.setBadgeInfo;

public final class GriverFilePathExtension implements getAdapterPosition<setBadgeInfo.getMax> {
    private final b.C0007b<setMakeTitleMax> getMax;
    private final SplitBillIntroductionModule setMin;

    private GriverFilePathExtension(SplitBillIntroductionModule splitBillIntroductionModule, b.C0007b<setMakeTitleMax> bVar) {
        this.setMin = splitBillIntroductionModule;
        this.getMax = bVar;
    }

    public static GriverFilePathExtension length(SplitBillIntroductionModule splitBillIntroductionModule, b.C0007b<setMakeTitleMax> bVar) {
        return new GriverFilePathExtension(splitBillIntroductionModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setBadgeInfo.getMax length = this.setMin.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
