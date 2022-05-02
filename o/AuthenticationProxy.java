package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0001¨\u0006\n"}, d2 = {"removeWhitespaceAndDash", "", "replaceIndoPhonePrefixWithRegionDash", "replaceIndoRegionDashWithPhonePrefix", "replaceIndoRegionDashWithPlusSixTwo", "replaceIndoRegionDashWithPlusSixTwoEight", "replaceIndoRegionDashWithSixTwo", "replacePhonePrefixWithIndoRegionDash", "replacePlusSixTwoEightWithIndoRegionDash", "replaceSixTwoWithIndoRegionDash", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class AuthenticationProxy {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFollowingItem", "Lid/dana/domain/social/model/RelationshipItem;", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
    public final class LocalPermissionCallback {
        @NotNull
        public static final processScanResult toFollowingItem(@NotNull setShowType setshowtype) {
            Intrinsics.checkNotNullParameter(setshowtype, "$this$toFollowingItem");
            return new processScanResult(setshowtype.getLoginId(), setshowtype.getNickName(), setshowtype.getStatus(), setshowtype.getUserId(), setshowtype.getAvatar(), setshowtype.getUsername(), false, 64, (DefaultConstructorMarker) null);
        }
    }

    @NotNull
    public static final String removeWhitespaceAndDash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$removeWhitespaceAndDash");
        return new Regex("[\\s-]+").replace((CharSequence) str, "");
    }

    @NotNull
    public static final String replaceIndoPhonePrefixWithRegionDash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$replaceIndoPhonePrefixWithRegionDash");
        return new Regex("^(\\+*62)*0*8").replace((CharSequence) str, "62-8");
    }

    @NotNull
    public static final String replaceIndoRegionDashWithPhonePrefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$replaceIndoRegionDashWithPhonePrefix");
        return new Regex("^(62-8)").replace((CharSequence) str, "08");
    }

    @NotNull
    public static final String replaceIndoRegionDashWithPlusSixTwoEight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$replaceIndoRegionDashWithPlusSixTwoEight");
        return new Regex("^(62-8)").replace((CharSequence) str, "+628");
    }

    @NotNull
    public static final String replaceIndoRegionDashWithPlusSixTwo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$replaceIndoRegionDashWithPlusSixTwo");
        return new Regex("^(\\+62-)").replace((CharSequence) str, "+62");
    }

    @NotNull
    public static final String replaceIndoRegionDashWithSixTwo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$replaceIndoRegionDashWithSixTwo");
        return new Regex("^(62-8)").replace((CharSequence) str, "628");
    }

    @NotNull
    public static final String replacePhonePrefixWithIndoRegionDash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$replacePhonePrefixWithIndoRegionDash");
        return new Regex("^(08)").replace((CharSequence) str, "62-8");
    }

    @NotNull
    public static final String replacePlusSixTwoEightWithIndoRegionDash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$replacePlusSixTwoEightWithIndoRegionDash");
        return new Regex("^(\\+628)").replace((CharSequence) str, "62-8");
    }

    @NotNull
    public static final String replaceSixTwoWithIndoRegionDash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$replaceSixTwoWithIndoRegionDash");
        return new Regex("^(628)").replace((CharSequence) str, "62-8");
    }
}
