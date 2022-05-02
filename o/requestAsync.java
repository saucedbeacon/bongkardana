package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.IMtopProxy;

@Singleton
public class requestAsync extends uncheckItems<IMtopProxy.Callback> {
    private final getDataMap defaultFeatureNonAMCSData;

    @Inject
    public requestAsync(getDataMap getdatamap) {
        this.defaultFeatureNonAMCSData = getdatamap;
    }

    public IMtopProxy.Callback createData(String str) {
        return this.defaultFeatureNonAMCSData;
    }
}
