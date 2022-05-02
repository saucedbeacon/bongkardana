package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class convertPlatform extends setSpeed<List<ExecutorUtils>, List<getMatchingBeaconTypeCodeStartOffset>> {
    private final defaultPlatform currencyAmountResultMapper;

    @Inject
    public convertPlatform(defaultPlatform defaultplatform) {
        this.currencyAmountResultMapper = defaultplatform;
    }

    /* access modifiers changed from: protected */
    public List<getMatchingBeaconTypeCodeStartOffset> map(List<ExecutorUtils> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ExecutorUtils mapSingle : list) {
            arrayList.add(mapSingle(mapSingle));
        }
        return arrayList;
    }

    private getMatchingBeaconTypeCodeStartOffset mapSingle(ExecutorUtils executorUtils) {
        if (executorUtils == null) {
            return null;
        }
        getMatchingBeaconTypeCodeStartOffset getmatchingbeacontypecodestartoffset = new getMatchingBeaconTypeCodeStartOffset();
        getmatchingbeacontypecodestartoffset.setPayMethod(executorUtils.getPayMethod());
        getmatchingbeacontypecodestartoffset.setCardBin(executorUtils.getCardBin());
        getmatchingbeacontypecodestartoffset.setBindingId(executorUtils.getBindingId());
        getmatchingbeacontypecodestartoffset.setRecommended(executorUtils.isRecommended());
        getmatchingbeacontypecodestartoffset.setEligible(executorUtils.isEligible());
        getmatchingbeacontypecodestartoffset.setRecommendedAmount(this.currencyAmountResultMapper.map(executorUtils.getRecommendedAmount()));
        return getmatchingbeacontypecodestartoffset;
    }
}
