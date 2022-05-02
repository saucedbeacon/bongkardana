package o;

import android.content.Context;
import id.dana.di.modules.SubMenuModule;
import id.dana.di.modules.TrackQuestModule;
import o.AUHorizontalListView;
import o.b;
import o.captureScreen;
import o.getWorkerFactory;

public final class GriverH5AppInfo implements getAdapterPosition<AUHorizontalListView.SelectionNotifier> {
    private final b.C0007b<Context> getMax;
    private final SubMenuModule getMin;

    public final class UpdatePolicy implements getAdapterPosition<getWorkerFactory.setMax> {
        private final b.C0007b<doWork> getMin;
        private final TrackQuestModule length;

        private UpdatePolicy(TrackQuestModule trackQuestModule, b.C0007b<doWork> bVar) {
            this.length = trackQuestModule;
            this.getMin = bVar;
        }

        public static UpdatePolicy setMax(TrackQuestModule trackQuestModule, b.C0007b<doWork> bVar) {
            return new UpdatePolicy(trackQuestModule, bVar);
        }

        public final /* synthetic */ Object get() {
            getWorkerFactory.setMax min = this.length.setMin(this.getMin.get());
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final class AppType implements getAdapterPosition<captureScreen.setMax> {
        private final SubMenuModule length;

        public static captureScreen.setMax length(SubMenuModule subMenuModule) {
            captureScreen.setMax max = subMenuModule.setMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }

        public final /* synthetic */ Object get() {
            captureScreen.setMax max = this.length.setMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static AUHorizontalListView.SelectionNotifier setMax(SubMenuModule subMenuModule, Context context) {
        AUHorizontalListView.SelectionNotifier max = subMenuModule.getMax(context);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        AUHorizontalListView.SelectionNotifier max = this.getMin.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
