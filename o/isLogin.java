package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lid/dana/data/senddigitalmoney/repository/mapper/CardPrefixQueryResultMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/senddigitalmoney/repository/model/result/CardPrefixQueryResult;", "Lid/dana/domain/senddigitalmoney/model/CardPrefixQueryInfo;", "()V", "map", "oldItem", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isLogin extends setSpeed<getUserId, isScannerInDifferentProcess> {
    public final /* synthetic */ Object map(Object obj) {
        getUserId getuserid = (getUserId) obj;
        if (getuserid != null) {
            return new isScannerInDifferentProcess(getuserid.getCardNoPrefix());
        }
        return null;
    }
}
