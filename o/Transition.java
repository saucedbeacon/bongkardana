package o;

import o.AutoTransition;
import o.GriverOpenAuthExtension;
import o.LocationBridgeExtension;
import o.Slide;
import o.b;

public final class Transition implements getAdapterPosition<Slide.GravityFlag> {
    private final b.C0007b<APWebResourceRequest> getMax;
    private final b.C0007b<GriverOpenAuthExtension.RevokeCallback> getMin;
    private final b.C0007b<AutoTransition.setMax> length;
    private final b.C0007b<APWebHistoryItem> setMax;
    private final b.C0007b<LocationBridgeExtension.AnonymousClass2> setMin;

    public final class MatchOrder implements getAdapterPosition<setSceneRoot> {
        private final b.C0007b<applySettingsToScheduledJob> getMax;
        private final b.C0007b<updateFootState> length;

        private MatchOrder(b.C0007b<applySettingsToScheduledJob> bVar, b.C0007b<updateFootState> bVar2) {
            this.getMax = bVar;
            this.length = bVar2;
        }

        public static MatchOrder length(b.C0007b<applySettingsToScheduledJob> bVar, b.C0007b<updateFootState> bVar2) {
            return new MatchOrder(bVar, bVar2);
        }

        public final /* synthetic */ Object get() {
            return new setSceneRoot(this.getMax.get(), this.length.get());
        }
    }

    private Transition(b.C0007b<AutoTransition.setMax> bVar, b.C0007b<APWebResourceRequest> bVar2, b.C0007b<APWebHistoryItem> bVar3, b.C0007b<GriverOpenAuthExtension.RevokeCallback> bVar4, b.C0007b<LocationBridgeExtension.AnonymousClass2> bVar5) {
        this.length = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
        this.getMin = bVar4;
        this.setMin = bVar5;
    }

    public static Transition getMax(b.C0007b<AutoTransition.setMax> bVar, b.C0007b<APWebResourceRequest> bVar2, b.C0007b<APWebHistoryItem> bVar3, b.C0007b<GriverOpenAuthExtension.RevokeCallback> bVar4, b.C0007b<LocationBridgeExtension.AnonymousClass2> bVar5) {
        return new Transition(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new Slide.GravityFlag(this.length.get(), this.getMax.get(), this.setMax.get(), this.getMin.get(), this.setMin.get());
    }
}
