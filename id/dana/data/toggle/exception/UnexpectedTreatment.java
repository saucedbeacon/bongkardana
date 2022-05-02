package id.dana.data.toggle.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/data/toggle/exception/UnexpectedTreatment;", "Lid/dana/data/toggle/exception/SplitException;", "configName", "", "(Ljava/lang/String;)V", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class UnexpectedTreatment extends SplitException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnexpectedTreatment(@NotNull String str) {
        super("Unexpected Treatment, with config name : ".concat(String.valueOf(str)));
        Intrinsics.checkNotNullParameter(str, "configName");
    }
}
