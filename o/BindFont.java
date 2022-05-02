package o;

import id.dana.contract.services.ServicesModule;
import o.b;
import o.style;

public final class BindFont implements getAdapterPosition<style.getMin> {
    private final ServicesModule getMin;

    private BindFont(ServicesModule servicesModule) {
        this.getMin = servicesModule;
    }

    public static BindFont length(ServicesModule servicesModule) {
        return new BindFont(servicesModule);
    }

    public final class TypefaceStyle implements getAdapterPosition<style.length> {
        private final ServicesModule getMin;
        private final b.C0007b<BindInt> setMax;

        public static style.length getMax(ServicesModule servicesModule, BindInt bindInt) {
            style.length max = servicesModule.setMax(bindInt);
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }

        public final /* synthetic */ Object get() {
            style.length max = this.getMin.setMax(this.setMax.get());
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final /* synthetic */ Object get() {
        style.getMin length = this.getMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
