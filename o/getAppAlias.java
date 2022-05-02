package o;

import id.dana.nearbyme.model.ShopModel;
import kotlin.jvm.internal.Intrinsics;
import o.DeviceManifest;
import org.jetbrains.annotations.NotNull;

public final class getAppAlias implements getAdapterPosition<DeviceManifest.AnonymousClass2> {

    static final class setMin {
        /* access modifiers changed from: private */
        public static final getAppAlias getMin = new getAppAlias();
    }

    public static getAppAlias setMin() {
        return setMin.getMin;
    }

    public final /* synthetic */ Object get() {
        return new Object() {
            public double getMax;
            public double getMin;
            public double length;
            public boolean setMin;

            public final double getMax(@NotNull ShopModel shopModel) {
                double d;
                Intrinsics.checkNotNullParameter(shopModel, "shopModel");
                double d2 = this.getMax;
                double min = (double) setMin(shopModel);
                Double.isNaN(min);
                double d3 = d2 * min;
                double d4 = this.length;
                if (this.setMin) {
                    d = shopModel.create;
                } else {
                    d = Math.ceil(shopModel.create);
                }
                double d5 = d3 + (d4 * d);
                double d6 = this.getMin;
                double min2 = (double) getMin(shopModel);
                Double.isNaN(min2);
                return d5 + (d6 * min2);
            }

            private final int setMin(ShopModel shopModel) {
                if (this.setMin) {
                    double d = shopModel.toFloatRange;
                    if (d >= 0.0d && d <= 1.0d) {
                        return 5;
                    }
                    if (d >= 1.1d && d <= 2.0d) {
                        return 4;
                    }
                    if (d < 2.1d || d > 3.0d) {
                        return (d < 3.1d || d > 4.0d) ? 1 : 2;
                    }
                    return 3;
                }
                double d2 = shopModel.toFloatRange;
                if (d2 >= 0.0d && d2 <= 0.6d) {
                    return 5;
                }
                if (d2 >= 0.7d && d2 <= 1.2d) {
                    return 4;
                }
                if (d2 < 1.3d || d2 > 1.8d) {
                    return (d2 < 1.9d || d2 > 2.4d) ? 1 : 2;
                }
                return 3;
            }

            private static int getMin(ShopModel shopModel) {
                double d = shopModel.onNavigationEvent;
                if (d > 25.0d) {
                    return 5;
                }
                if (d >= 21.0d && d <= 25.0d) {
                    return 4;
                }
                if (d < 16.0d || d > 20.0d) {
                    return (d < 11.0d || d > 15.0d) ? 1 : 2;
                }
                return 3;
            }
        };
    }
}
