package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/foundation/toolbox/HttpTransportFactory;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "createHttpTransport", "Lid/dana/data/foundation/toolbox/AbstractHttpTransport;", "enableCache", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getList {
    private final generateKey okHttpClient;

    @NotNull
    @JvmOverloads
    public final AgreementConfirmPoint createHttpTransport() {
        return createHttpTransport$default(this, false, 1, (Object) null);
    }

    @Inject
    public getList(@NotNull generateKey generatekey) {
        Intrinsics.checkNotNullParameter(generatekey, "okHttpClient");
        this.okHttpClient = generatekey;
    }

    public static /* synthetic */ AgreementConfirmPoint createHttpTransport$default(getList getlist, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getlist.createHttpTransport(z);
    }

    @NotNull
    @JvmOverloads
    public final AgreementConfirmPoint createHttpTransport(boolean z) {
        Boolean bool = (Boolean) getPrepareData.getFeatureSwitchObject("feature_aphome_okhttp", Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bool, "enableOkHttp");
        if (bool.booleanValue()) {
            return new getMessage(this.okHttpClient);
        }
        return new CreateDialogParam(z);
    }
}
