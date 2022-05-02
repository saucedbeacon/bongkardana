package o;

import android.content.res.Configuration;

public abstract class getTopFadingEdgeStrength {
    private static getTopFadingEdgeStrength setMax;
    private final Configuration getMax;

    static synchronized getTopFadingEdgeStrength setMax(Configuration configuration) {
        getTopFadingEdgeStrength gettopfadingedgestrength;
        synchronized (getTopFadingEdgeStrength.class) {
            if (setMax == null || !setMax.getMax.equals(configuration)) {
                setMax = new ContentInfoCompat$Flags(new Configuration(configuration));
            }
            gettopfadingedgestrength = setMax;
        }
        return gettopfadingedgestrength;
    }

    protected getTopFadingEdgeStrength(Configuration configuration) {
        this.getMax = configuration;
    }
}
