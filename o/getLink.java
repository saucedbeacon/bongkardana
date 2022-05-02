package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/social/repository/SocialPreferencesDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/social/repository/SocialPreferencesData;", "socialPreferences", "Lid/dana/data/social/repository/source/local/SocialPreferences;", "(Lid/dana/data/social/repository/source/local/SocialPreferences;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getLink extends uncheckItems<getFromSystem> {
    private getCurrentLongitudeAndLatitude socialPreferences;

    @Inject
    public getLink(@NotNull getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude) {
        Intrinsics.checkNotNullParameter(getcurrentlongitudeandlatitude, "socialPreferences");
        this.socialPreferences = getcurrentlongitudeandlatitude;
    }

    @NotNull
    public final getFromSystem createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        return new setExtInfo(this.socialPreferences);
    }
}
