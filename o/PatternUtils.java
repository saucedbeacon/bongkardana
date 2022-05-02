package o;

import id.dana.data.content.mapper.ContentMapper;
import id.dana.data.content.mapper.ContentsMapper;
import o.b;

public final class PatternUtils implements getBindingAdapter<isNIOEnabled> {
    private final b.C0007b<getConfigWithProcessCache> bizTransferInitMapperProvider;
    private final b.C0007b<getFontBar> contentDeliveryEntityDataFactoryProvider;
    private final b.C0007b<ContentsMapper> contentsMapperProvider;
    private final b.C0007b<ContentMapper> mapperProvider;
    private final b.C0007b<getScheduledExecutor> sendMoneyHomeMenuMapperProvider;
    private final b.C0007b<ExecutorType> sendMoneyMapperProvider;
    private final b.C0007b<KVStorageProxy> transferInitParamRequestMapperProvider;
    private final b.C0007b<RVScheduleType> transferPrePayMapperProvider;
    private final b.C0007b<getByteArray> transferSubmitParamMapperProvider;
    private final b.C0007b<px2sp> withdrawNameCheckMapperProvider;

    public PatternUtils(b.C0007b<ExecutorType> bVar, b.C0007b<getConfigWithProcessCache> bVar2, b.C0007b<px2sp> bVar3, b.C0007b<getByteArray> bVar4, b.C0007b<RVScheduleType> bVar5, b.C0007b<ContentsMapper> bVar6, b.C0007b<KVStorageProxy> bVar7, b.C0007b<getScheduledExecutor> bVar8, b.C0007b<getFontBar> bVar9, b.C0007b<ContentMapper> bVar10) {
        this.sendMoneyMapperProvider = bVar;
        this.bizTransferInitMapperProvider = bVar2;
        this.withdrawNameCheckMapperProvider = bVar3;
        this.transferSubmitParamMapperProvider = bVar4;
        this.transferPrePayMapperProvider = bVar5;
        this.contentsMapperProvider = bVar6;
        this.transferInitParamRequestMapperProvider = bVar7;
        this.sendMoneyHomeMenuMapperProvider = bVar8;
        this.contentDeliveryEntityDataFactoryProvider = bVar9;
        this.mapperProvider = bVar10;
    }

    public static getBindingAdapter<isNIOEnabled> create(b.C0007b<ExecutorType> bVar, b.C0007b<getConfigWithProcessCache> bVar2, b.C0007b<px2sp> bVar3, b.C0007b<getByteArray> bVar4, b.C0007b<RVScheduleType> bVar5, b.C0007b<ContentsMapper> bVar6, b.C0007b<KVStorageProxy> bVar7, b.C0007b<getScheduledExecutor> bVar8, b.C0007b<getFontBar> bVar9, b.C0007b<ContentMapper> bVar10) {
        return new PatternUtils(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10);
    }

    public final void injectMembers(isNIOEnabled isnioenabled) {
        injectInjectMapperDependencies(isnioenabled, this.sendMoneyMapperProvider.get(), this.bizTransferInitMapperProvider.get(), this.withdrawNameCheckMapperProvider.get(), this.transferSubmitParamMapperProvider.get(), this.transferPrePayMapperProvider.get(), this.contentsMapperProvider.get(), this.transferInitParamRequestMapperProvider.get(), this.sendMoneyHomeMenuMapperProvider.get());
        injectInjectCdpDependencies(isnioenabled, this.contentDeliveryEntityDataFactoryProvider.get(), this.mapperProvider.get());
    }

    public static void injectInjectMapperDependencies(isNIOEnabled isnioenabled, ExecutorType executorType, getConfigWithProcessCache getconfigwithprocesscache, px2sp px2sp, getByteArray getbytearray, RVScheduleType rVScheduleType, ContentsMapper contentsMapper, KVStorageProxy kVStorageProxy, getScheduledExecutor getscheduledexecutor) {
        isnioenabled.injectMapperDependencies(executorType, getconfigwithprocesscache, px2sp, getbytearray, rVScheduleType, contentsMapper, kVStorageProxy, getscheduledexecutor);
    }

    public static void injectInjectCdpDependencies(isNIOEnabled isnioenabled, getFontBar getfontbar, ContentMapper contentMapper) {
        isnioenabled.injectCdpDependencies(getfontbar, contentMapper);
    }
}
