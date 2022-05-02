package o;

import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/danah5/interactor/OpenH5;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/danah5/model/H5UserDataEntity;", "Lid/dana/domain/danah5/interactor/OpenH5$Params;", "repository", "Lid/dana/domain/danah5/H5Repository;", "(Lid/dana/domain/danah5/H5Repository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class onShowCustomView extends APWebChromeClient<onJsPrompt, length> {
    private final onCreateWindow repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public onShowCustomView(@NotNull onCreateWindow oncreatewindow) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(oncreatewindow, "repository");
        this.repository = oncreatewindow;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onJsPrompt> buildUseCase(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        onCreateWindow oncreatewindow = this.repository;
        String urlOrAppId$domain_release = length2.getUrlOrAppId$domain_release();
        Bundle bundle$domain_release = length2.getBundle$domain_release();
        if (bundle$domain_release == null) {
            bundle$domain_release = new Bundle(2);
        }
        return oncreatewindow.fetchConfigs(urlOrAppId$domain_release, bundle$domain_release);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lid/dana/domain/danah5/interactor/OpenH5$Params;", "", "urlOrAppId", "", "bundle", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getBundle$domain_release", "()Landroid/os/Bundle;", "getUrlOrAppId$domain_release", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @Nullable
        private final Bundle bundle;
        @NotNull
        private final String urlOrAppId;

        public length(@NotNull String str, @Nullable Bundle bundle2) {
            Intrinsics.checkNotNullParameter(str, "urlOrAppId");
            this.urlOrAppId = str;
            this.bundle = bundle2;
        }

        @NotNull
        public final String getUrlOrAppId$domain_release() {
            return this.urlOrAppId;
        }

        @Nullable
        public final Bundle getBundle$domain_release() {
            return this.bundle;
        }
    }
}
