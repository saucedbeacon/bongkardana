package o;

import kotlin.Metadata;
import o.BaseRenderBridgeImpl;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lid/dana/data/openbankaccount/mapper/ConfigBankAccountResultMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/openbankaccount/model/OpenBankAccountConfigData;", "Lid/dana/domain/openbankaccount/model/ConfigBankAccount;", "()V", "map", "oldItem", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class EventSendInterceptorPoint extends setSpeed<BaseRenderBridgeImpl.AnonymousClass1, fileType> {
    /* access modifiers changed from: protected */
    @Nullable
    public final fileType map(@Nullable BaseRenderBridgeImpl.AnonymousClass1 r8) {
        if (r8 != null) {
            return new fileType(r8.getEnable(), r8.getListBankUrl(), r8.getVerifyUrl(), r8.getConfirmUrl(), r8.getBannerUrl());
        }
        return null;
    }
}
