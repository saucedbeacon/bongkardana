package id.dana.domain.danah5.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u001b\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lid/dana/domain/danah5/model/H5ShareData;", "", "utdId", "", "", "userId", "([Ljava/lang/String;[Ljava/lang/String;)V", "getUserId", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getUtdId", "domain_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class H5ShareData {
    @Nullable
    public String[] userId;
    @Nullable
    public String[] utdId;

    public H5ShareData() {
        this((String[]) null, (String[]) null, 3, (DefaultConstructorMarker) null);
    }

    public H5ShareData(@Nullable String[] strArr, @Nullable String[] strArr2) {
        this.utdId = strArr;
        this.userId = strArr2;
    }

    @Nullable
    public final String[] getUtdId() {
        return this.utdId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H5ShareData(String[] strArr, String[] strArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : strArr, (i & 2) != 0 ? null : strArr2);
    }

    @Nullable
    public final String[] getUserId() {
        return this.userId;
    }
}
