package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class getBundleName extends uncheckItems<getExtensionMetaInfos> {
    private final Plugin remoteQrPayEntityData;

    @Inject
    public getBundleName(Plugin plugin) {
        this.remoteQrPayEntityData = plugin;
    }

    public getExtensionMetaInfos createData(String str) {
        return this.remoteQrPayEntityData;
    }
}
