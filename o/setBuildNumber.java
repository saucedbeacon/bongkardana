package o;

import com.google.gson.Gson;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\n\u001aD\u0010\f\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u00062*\u0010\u000f\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010j\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0011\u001aJ\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011\u001a*\u0010\u0013\u001a\u00020\u0001*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011\u001a*\u0010\u0014\u001a\u00020\u0001*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011\u001a*\u0010\u0015\u001a\u00020\u0001*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011\u001a*\u0010\u0016\u001a\u00020\u0001*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011\u001a*\u0010\u0017\u001a\u00020\u0001*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011\u001a*\u0010\u0018\u001a\u00020\u0001*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011\u001a*\u0010\u0019\u001a\u00020\u0001*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011\u001a*\u0010\u001a\u001a\u00020\u0001*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011\u001aR\u0010\u001b\u001a\u00020\u001c*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00112&\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0011\u001a2\u0010\u001e\u001a\u00020\u001c*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00112\u0006\u0010\u001f\u001a\u00020\u0001\u001a2\u0010 \u001a\u00020\u001c*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00112\u0006\u0010!\u001a\u00020\u0001\u001a2\u0010\"\u001a\u00020\u001c*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00112\u0006\u0010#\u001a\u00020\u0001\u001a2\u0010$\u001a\u00020\u001c*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00112\u0006\u0010%\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"ACTOR_KEY", "", "DISPLAY_NAME_KEY", "EXTEND_INFO_ACTIVITY_ID", "EXTEND_INFO_REACTION_ID", "FEED_FRIEND", "", "HEADER_NAME_KEY", "NICKNAME_KEY", "PROFILE_AVATAR_KEY", "USERNAME_KEY", "USER_ID_KEY", "getAvatar", "imageUrl", "type", "extendInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getActorMap", "getDisplayName", "getFeedNotificationRelatedActivity", "getFeedNotificationRelatedComment", "getHeaderName", "getNickName", "getProfileAvatar", "getUserId", "getUsername", "setActorMap", "", "actorMap", "setActorNickname", "nickname", "setDisplayName", "displayName", "setHeaderName", "headerName", "setUsername", "username", "domain_release"}, k = 2, mv = {1, 4, 2})
public final class setBuildNumber {
    @NotNull
    public static final String ACTOR_KEY = "actor";
    @NotNull
    public static final String DISPLAY_NAME_KEY = "displayName";
    @NotNull
    public static final String EXTEND_INFO_ACTIVITY_ID = "activityId";
    @NotNull
    public static final String EXTEND_INFO_REACTION_ID = "reactionId";
    public static final int FEED_FRIEND = 9;
    @NotNull
    public static final String HEADER_NAME_KEY = "headerName";
    @NotNull
    public static final String NICKNAME_KEY = "nickname";
    @NotNull
    public static final String PROFILE_AVATAR_KEY = "profilePictureUrl";
    @NotNull
    public static final String USERNAME_KEY = "username";
    @NotNull
    public static final String USER_ID_KEY = "id";

    public static final void setActorNickname(@NotNull HashMap<String, String> hashMap, @NotNull String str) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$setActorNickname");
        Intrinsics.checkNotNullParameter(str, "nickname");
        HashMap<String, String> actorMap = getActorMap(hashMap);
        actorMap.put("nickname", str);
        setActorMap(hashMap, actorMap);
    }

    public static final void setDisplayName(@NotNull HashMap<String, String> hashMap, @NotNull String str) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$setDisplayName");
        Intrinsics.checkNotNullParameter(str, DISPLAY_NAME_KEY);
        HashMap<String, String> actorMap = getActorMap(hashMap);
        actorMap.put(DISPLAY_NAME_KEY, str);
        setActorMap(hashMap, actorMap);
    }

    @NotNull
    public static final String getNickName(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$getNickName");
        String str = getActorMap(hashMap).get("nickname");
        return str == null ? "" : str;
    }

    @NotNull
    public static final String getDisplayName(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$getDisplayName");
        String str = getActorMap(hashMap).get(DISPLAY_NAME_KEY);
        return str == null ? "" : str;
    }

    public static final void setUsername(@NotNull HashMap<String, String> hashMap, @NotNull String str) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$setUsername");
        Intrinsics.checkNotNullParameter(str, USERNAME_KEY);
        getActorMap(hashMap).put(USERNAME_KEY, str);
    }

    @NotNull
    public static final String getUsername(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$getUsername");
        String str = getActorMap(hashMap).get(USERNAME_KEY);
        return str == null ? "" : str;
    }

    @NotNull
    public static final String getProfileAvatar(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$getProfileAvatar");
        String str = getActorMap(hashMap).get(PROFILE_AVATAR_KEY);
        return str == null ? "" : str;
    }

    @NotNull
    public static final String getUserId(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$getUserId");
        String str = getActorMap(hashMap).get("id");
        return str == null ? "" : str;
    }

    @NotNull
    public static final HashMap<String, String> getActorMap(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$getActorMap");
        HashMap<String, String> hashMap2 = (HashMap) new Gson().fromJson(hashMap.get(ACTOR_KEY), new HashMap().getClass());
        return hashMap2 == null ? new HashMap<>() : hashMap2;
    }

    public static final void setActorMap(@NotNull HashMap<String, String> hashMap, @NotNull HashMap<String, String> hashMap2) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$setActorMap");
        Intrinsics.checkNotNullParameter(hashMap2, "actorMap");
        hashMap.put(ACTOR_KEY, new Gson().toJson((Object) hashMap2));
    }

    @NotNull
    public static final String getAvatar(@Nullable String str, int i, @Nullable HashMap<String, String> hashMap) {
        if (i == 9) {
            str = hashMap != null ? getProfileAvatar(hashMap) : null;
        }
        return str == null ? "" : str;
    }

    @NotNull
    public static final String getFeedNotificationRelatedActivity(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$getFeedNotificationRelatedActivity");
        String str = hashMap.get(EXTEND_INFO_ACTIVITY_ID);
        return str == null ? "" : str;
    }

    @NotNull
    public static final String getFeedNotificationRelatedComment(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$getFeedNotificationRelatedComment");
        String str = hashMap.get(EXTEND_INFO_REACTION_ID);
        return str == null ? "" : str;
    }

    @NotNull
    public static final String getHeaderName(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$getHeaderName");
        String str = getActorMap(hashMap).get(HEADER_NAME_KEY);
        return str == null ? "" : str;
    }

    public static final void setHeaderName(@NotNull HashMap<String, String> hashMap, @NotNull String str) {
        Intrinsics.checkNotNullParameter(hashMap, "$this$setHeaderName");
        Intrinsics.checkNotNullParameter(str, HEADER_NAME_KEY);
        HashMap<String, String> actorMap = getActorMap(hashMap);
        actorMap.put(HEADER_NAME_KEY, str);
        setActorMap(hashMap, actorMap);
    }
}
