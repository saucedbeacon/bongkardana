package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lid/dana/data/recentrecipient/mapper/RecentRecipientEntityMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/recentrecipient/model/RecentRecipientEntity;", "Lid/dana/domain/recentrecipient/model/RecentRecipient;", "()V", "apply", "", "recentRecipientEntities", "map", "oldItem", "toRecentRecipientEntity", "", "storedRecentRecipients", "", "([Lid/dana/data/recentrecipient/model/RecentRecipientEntity;)Ljava/util/List;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class addExtraData extends setSpeed<isRemoteExtension, getMonitorToken> {
    @NotNull
    public final List<getMonitorToken> apply(@Nullable List<? extends isRemoteExtension> list) {
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        Collection arrayList = new ArrayList();
        for (isRemoteExtension map : list) {
            getMonitorToken map2 = map(map);
            if (map2 != null) {
                arrayList.add(map2);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public final List<isRemoteExtension> toRecentRecipientEntity(@NotNull isRemoteExtension[] isremoteextensionArr) {
        Intrinsics.checkNotNullParameter(isremoteextensionArr, "storedRecentRecipients");
        return (List) ArraysKt.filterNotNullTo(isremoteextensionArr, new ArrayList());
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final getMonitorToken map(@Nullable isRemoteExtension isremoteextension) {
        if (isremoteextension != null) {
            return getPid.toRecentRecipient(isremoteextension);
        }
        return null;
    }
}
