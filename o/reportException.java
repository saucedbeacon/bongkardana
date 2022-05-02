package o;

import id.dana.data.Source;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ExtensionOpt;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/QrScanWhitelistFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/qrbarcode/repository/source/QrScanWhitelistEntityData;", "splitQrScanWhitelistConfig", "Lid/dana/data/qrbarcode/repository/source/network/SplitQrScanWhitelistConfig;", "amcsQrScanWhitelistConfig", "Lid/dana/data/qrbarcode/repository/source/network/AmcsQrScanWhitelistConfig;", "mockQrScanWhitelistEntityData", "Lid/dana/data/qrbarcode/repository/source/mock/MockQrScanWhitelistEntityData;", "(Lid/dana/data/qrbarcode/repository/source/network/SplitQrScanWhitelistConfig;Lid/dana/data/qrbarcode/repository/source/network/AmcsQrScanWhitelistConfig;Lid/dana/data/qrbarcode/repository/source/mock/MockQrScanWhitelistEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class reportException extends uncheckItems<ExtensionOpt.ExceptionHandler> {
    private final as amcsQrScanWhitelistConfig;
    private final ExtensionOpt.MismatchMethodException mockQrScanWhitelistEntityData;
    private final registerProxyGenerator splitQrScanWhitelistConfig;

    @Inject
    public reportException(@NotNull registerProxyGenerator registerproxygenerator, @NotNull as asVar, @NotNull ExtensionOpt.MismatchMethodException mismatchMethodException) {
        Intrinsics.checkNotNullParameter(registerproxygenerator, "splitQrScanWhitelistConfig");
        Intrinsics.checkNotNullParameter(asVar, "amcsQrScanWhitelistConfig");
        Intrinsics.checkNotNullParameter(mismatchMethodException, "mockQrScanWhitelistEntityData");
        this.splitQrScanWhitelistConfig = registerproxygenerator;
        this.amcsQrScanWhitelistConfig = asVar;
        this.mockQrScanWhitelistEntityData = mismatchMethodException;
    }

    @NotNull
    public final ExtensionOpt.ExceptionHandler createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        int hashCode = str.hashCode();
        if (hashCode != 2997660) {
            if (hashCode == 109648666 && str.equals(Source.SPLIT)) {
                return this.splitQrScanWhitelistConfig;
            }
        } else if (str.equals("amcs")) {
            return this.amcsQrScanWhitelistConfig;
        }
        return this.mockQrScanWhitelistEntityData;
    }
}
