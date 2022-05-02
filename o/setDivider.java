package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class setDivider extends uncheckItems<setTransparentTitle> {
    private final AppRestartExtension networkHomeEntityData;

    @Inject
    public setDivider(AppRestartExtension appRestartExtension) {
        this.networkHomeEntityData = appRestartExtension;
    }

    public setTransparentTitle createData(String str) {
        return this.networkHomeEntityData;
    }
}
