package o;

import id.dana.di.modules.LeaderboardEntryModule;
import o.b;
import o.getDataType;

public final class SerializerFeature implements getAdapterPosition<getDataType.setMax> {
    private final b.C0007b<APTakePictureOption> setMax;
    private final LeaderboardEntryModule setMin;

    public static getDataType.setMax getMax(LeaderboardEntryModule leaderboardEntryModule, APTakePictureOption aPTakePictureOption) {
        getDataType.setMax max = leaderboardEntryModule.getMax(aPTakePictureOption);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getDataType.setMax max = this.setMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
