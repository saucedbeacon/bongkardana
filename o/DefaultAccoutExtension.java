package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.ImageLoader;
import o.RenderLoadingStatusChangePoint;
import o.b;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DefaultAccoutExtension implements getAdapterPosition<ImageLoader.AnonymousClass2> {
    private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> globalSearchRepositoryProvider;

    public DefaultAccoutExtension(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        this.globalSearchRepositoryProvider = bVar;
    }

    public final ImageLoader.AnonymousClass2 get() {
        return newInstance(this.globalSearchRepositoryProvider.get());
    }

    public static DefaultAccoutExtension create(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        return new DefaultAccoutExtension(bVar);
    }

    public static ImageLoader.AnonymousClass2 newInstance(RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        return new buildModelMapWithLock<Unit, Boolean>(loadingStatusChangeListener) {
            private final RenderLoadingStatusChangePoint.LoadingStatusChangeListener globalSearchRepository;

            {
                Intrinsics.checkNotNullParameter(r3, "globalSearchRepository");
                this.globalSearchRepository = r3;
            }

            @Nullable
            public final Object buildUseCase(@NotNull Unit unit, @NotNull Continuation<? super forThisDevice<Boolean>> continuation) {
                return new forThisDevice.setMax(this.globalSearchRepository.isFeatureGlobalSearchEnable().blockingFirst());
            }
        };
    }
}
