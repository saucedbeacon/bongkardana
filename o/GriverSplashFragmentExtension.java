package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/auth/face/repository/FaceAuthenticationRepository;", "", "switch", "Lio/reactivex/Observable;", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "faceAuthNew", "", "securityId", "", "verify", "pin", "pubKey", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface GriverSplashFragmentExtension {
    @NotNull
    /* renamed from: switch  reason: not valid java name */
    TitleBarRightButtonView.AnonymousClass1<GVTitleBar> m1111switch(boolean z, @Nullable String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<GVTitleBar> verify(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3);

    public final class AbstractSplashFragment implements getAdapterPosition<GriverShareSchemeExtension> {
        private final b.C0007b<GriverSplashFragmentExtension> faceAuthenticationRepositoryProvider;

        public AbstractSplashFragment(b.C0007b<GriverSplashFragmentExtension> bVar) {
            this.faceAuthenticationRepositoryProvider = bVar;
        }

        public final GriverShareSchemeExtension get() {
            return newInstance(this.faceAuthenticationRepositoryProvider.get());
        }

        public static AbstractSplashFragment create(b.C0007b<GriverSplashFragmentExtension> bVar) {
            return new AbstractSplashFragment(bVar);
        }

        public static GriverShareSchemeExtension newInstance(GriverSplashFragmentExtension griverSplashFragmentExtension) {
            return new GriverShareSchemeExtension(griverSplashFragmentExtension);
        }
    }
}
