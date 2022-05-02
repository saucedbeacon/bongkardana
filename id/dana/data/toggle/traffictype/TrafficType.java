package id.dana.data.toggle.traffictype;

import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import org.jetbrains.annotations.NotNull;

@Qualifier
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lid/dana/data/toggle/traffictype/TrafficType;", "", "value", "", "()Ljava/lang/String;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Retention(AnnotationRetention.RUNTIME)
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface TrafficType {
    @NotNull
    public static final getMin Companion = getMin.setMin;
    @NotNull
    public static final String DEVICE = "Device";
    @NotNull
    public static final String USER = "User";

    String value() default "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/toggle/traffictype/TrafficType$Companion;", "", "()V", "DEVICE", "", "USER", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        static final /* synthetic */ getMin setMin = new getMin();

        private getMin() {
        }
    }
}
