package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.NativePermissionExtensionInvoker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Lid/dana/data/openbankaccount/mapper/BankAccountResultMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/openbankaccount/repository/source/network/result/BankAccountResult;", "Lid/dana/domain/openbankaccount/model/BankAccountList;", "()V", "emptyBankAccountList", "map", "oldItem", "transform", "", "Lid/dana/domain/openbankaccount/model/BankAccount;", "bankAccounts", "Lid/dana/data/openbankaccount/model/BankAccountInfoEntity;", "transformEntity", "entity", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ResourceLoadPoint extends setSpeed<NativePermissionExtensionInvoker.AnonymousClass1, OuterFileUtils> {
    /* access modifiers changed from: protected */
    @NotNull
    public final OuterFileUtils map(@Nullable NativePermissionExtensionInvoker.AnonymousClass1 r3) {
        OuterFileUtils outerFileUtils = r3 != null ? new OuterFileUtils(transform(r3.getBankAccountList()), true) : null;
        return outerFileUtils == null ? emptyBankAccountList() : outerFileUtils;
    }

    private final List<checkType> transform(List<warpData> list) {
        List<checkType> arrayList = new ArrayList<>();
        for (warpData transformEntity : list) {
            arrayList.add(transformEntity(transformEntity));
        }
        return arrayList;
    }

    private final checkType transformEntity(warpData warpdata) {
        return new checkType(warpdata.getInstId(), warpdata.getStatus(), warpdata.getBankName());
    }

    private final OuterFileUtils emptyBankAccountList() {
        List emptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(emptyList, "Collections.emptyList()");
        return new OuterFileUtils(emptyList, false);
    }
}
