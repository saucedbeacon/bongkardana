package o;

import o.b;

public final class ColorSchemeDecider implements getAdapterPosition<specToLayoutParam> {
    private final b.C0007b<getWidthSpec> globalNetworkPreferenceProvider;

    public final class DefaultDecider implements getAdapterPosition<ColorSchemeModelTemplate> {

        static final class setMax {
            /* access modifiers changed from: private */
            public static final DefaultDecider setMax = new DefaultDecider();
        }

        public final ColorSchemeModelTemplate get() {
            return newInstance();
        }

        public static DefaultDecider create() {
            return setMax.setMax;
        }

        public static ColorSchemeModelTemplate newInstance() {
            return new ColorSchemeModelTemplate();
        }
    }

    public ColorSchemeDecider(b.C0007b<getWidthSpec> bVar) {
        this.globalNetworkPreferenceProvider = bVar;
    }

    public final specToLayoutParam get() {
        return newInstance(this.globalNetworkPreferenceProvider.get());
    }

    public static ColorSchemeDecider create(b.C0007b<getWidthSpec> bVar) {
        return new ColorSchemeDecider(bVar);
    }

    public static specToLayoutParam newInstance(getWidthSpec getwidthspec) {
        return new specToLayoutParam(getwidthspec);
    }
}
