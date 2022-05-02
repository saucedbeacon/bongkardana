package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lid/dana/openbankaccount/mapper/ConfigBankAccountModelMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/openbankaccount/model/ConfigBankAccount;", "Lid/dana/openbankaccount/model/ConfigBankAccountModel;", "()V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FileManifest extends setSpeed<fileType, sendUserDenyCallback> {
    public final /* synthetic */ Object map(Object obj) {
        fileType filetype = (fileType) obj;
        if (filetype != null) {
            return new sendUserDenyCallback(filetype.getEnable(), filetype.getListBankUrl(), filetype.getVerifyUrl(), filetype.getConfirmUrl(), filetype.getBannerUrl());
        }
        return null;
    }
}
