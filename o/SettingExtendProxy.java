package o;

import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JH\u0010\u0007\u001aB\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n* \u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\u000b0\bH\u0002J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/data/social/model/ActivityMappableToContact;", "Lid/dana/data/social/repository/source/persistence/entity/PhoneNumberToContactNameMappable;", "serializer", "Lid/dana/data/storage/Serializer;", "activity", "Lid/dana/domain/social/model/ActivityResponse;", "(Lid/dana/data/storage/Serializer;Lid/dana/domain/social/model/ActivityResponse;)V", "getActorObject", "", "", "kotlin.jvm.PlatformType", "", "getActorUserId", "getActorUsername", "getContactPhoneNumber", "getHeaderName", "getNickname", "updateHeaderName", "", "headerName", "updateNickName", "deviceContactNickName", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SettingExtendProxy implements getShowType {
    private final RssiFilter activity;
    private final PluginInstallCallback serializer;

    public SettingExtendProxy(@NotNull PluginInstallCallback pluginInstallCallback, @NotNull RssiFilter rssiFilter) {
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        Intrinsics.checkNotNullParameter(rssiFilter, AkuEventParamsKey.KEY_ACTIVITY);
        this.serializer = pluginInstallCallback;
        this.activity = rssiFilter;
    }

    @NotNull
    public final String getNickname() {
        Map<String, String> actorObject = getActorObject();
        String str = actorObject.get("nickname");
        if (str == null) {
            str = actorObject.get(setBuildNumber.DISPLAY_NAME_KEY);
        }
        return str == null ? getContactPhoneNumber() : str;
    }

    @NotNull
    public final String getContactPhoneNumber() {
        String str = getActorObject().get("phoneNumber");
        return str == null ? "" : str;
    }

    public final void updateNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceContactNickName");
        Map<String, String> actorObject = getActorObject();
        Intrinsics.checkNotNullExpressionValue(actorObject, "actorMap");
        actorObject.put("nickname", str);
        actorObject.put(setBuildNumber.DISPLAY_NAME_KEY, str);
        HashMap<String, String> extendInfo = this.activity.getExtendInfo();
        if (extendInfo != null) {
            extendInfo.put(setBuildNumber.ACTOR_KEY, this.serializer.serialize(actorObject));
        }
    }

    private final Map<String, String> getActorObject() {
        PluginInstallCallback pluginInstallCallback = this.serializer;
        HashMap<String, String> extendInfo = this.activity.getExtendInfo();
        return pluginInstallCallback.deserializeMap(extendInfo != null ? extendInfo.get(setBuildNumber.ACTOR_KEY) : null);
    }

    @NotNull
    public final String getActorUsername() {
        String str = getActorObject().get(setBuildNumber.USERNAME_KEY);
        return str == null ? "" : str;
    }

    public final void updateHeaderName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.HEADER_NAME_KEY);
        Map<String, String> actorObject = getActorObject();
        Intrinsics.checkNotNullExpressionValue(actorObject, "actorMap");
        actorObject.put(setBuildNumber.HEADER_NAME_KEY, str);
        HashMap<String, String> extendInfo = this.activity.getExtendInfo();
        if (extendInfo != null) {
            extendInfo.put(setBuildNumber.ACTOR_KEY, this.serializer.serialize(actorObject));
        }
    }

    @NotNull
    public final String getHeaderName() {
        String str = getActorObject().get(setBuildNumber.HEADER_NAME_KEY);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getActorUserId() {
        String str = getActorObject().get("userId");
        return str == null ? "" : str;
    }
}
