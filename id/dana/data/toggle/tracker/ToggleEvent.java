package id.dana.data.toggle.tracker;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lid/dana/data/toggle/tracker/ToggleEvent;", "", "()V", "EventName", "Property", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ToggleEvent {
    @NotNull
    public static final ToggleEvent setMin = new ToggleEvent();

    private ToggleEvent() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/data/toggle/tracker/ToggleEvent$EventName;", "", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface EventName {
        @NotNull
        public static final length Companion = length.getMin;
        @NotNull
        public static final String GET_TOGGLE_CONFIG = "$experiment_started";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/toggle/tracker/ToggleEvent$EventName$Companion;", "", "()V", "GET_TOGGLE_CONFIG", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            static final /* synthetic */ length getMin = new length();

            private length() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/data/toggle/tracker/ToggleEvent$Property;", "", "Key", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Property {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/data/toggle/tracker/ToggleEvent$Property$Key;", "", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        @Retention(RetentionPolicy.RUNTIME)
        public @interface Key {
            @NotNull
            public static final setMax Companion = setMax.setMax;
            @NotNull
            public static final String EXPERIMENT_NAME = "Experiment name";
            @NotNull
            public static final String VARIANT_NAME = "Variant name";

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/toggle/tracker/ToggleEvent$Property$Key$Companion;", "", "()V", "EXPERIMENT_NAME", "", "VARIANT_NAME", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
            public static final class setMax {
                static final /* synthetic */ setMax setMax = new setMax();

                private setMax() {
                }
            }
        }
    }
}
