package o;

import id.dana.di.modules.ApplicationModule;
import o.CreatePromptParam;
import o.b;

public final class DefaultJSONParser implements getAdapterPosition<onJsConfirm> {
    private final ApplicationModule getMax;
    private final b.C0007b<NodeInstance> setMax;

    public final class ResolveTask implements getAdapterPosition<APWebViewPerformance> {
        private final b.C0007b<CreatePromptParam.PositiveListener> getMax;
        private final ApplicationModule length;

        private ResolveTask(ApplicationModule applicationModule, b.C0007b<CreatePromptParam.PositiveListener> bVar) {
            this.length = applicationModule;
            this.getMax = bVar;
        }

        public static ResolveTask length(ApplicationModule applicationModule, b.C0007b<CreatePromptParam.PositiveListener> bVar) {
            return new ResolveTask(applicationModule, bVar);
        }

        public final /* synthetic */ Object get() {
            APWebViewPerformance length2 = this.length.length(this.getMax.get());
            if (length2 != null) {
                return length2;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    private DefaultJSONParser(ApplicationModule applicationModule, b.C0007b<NodeInstance> bVar) {
        this.getMax = applicationModule;
        this.setMax = bVar;
    }

    public static DefaultJSONParser getMax(ApplicationModule applicationModule, b.C0007b<NodeInstance> bVar) {
        return new DefaultJSONParser(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onJsConfirm max = this.getMax.setMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
