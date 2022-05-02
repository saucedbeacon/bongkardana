package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public abstract class ErrorValue extends ConstantValue<Unit> {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public ErrorValue() {
        super(Unit.INSTANCE);
    }

    @NotNull
    public Unit getValue() {
        throw new UnsupportedOperationException();
    }

    public static final class ErrorValueWithMessage extends ErrorValue {
        @NotNull
        private final String message;

        public ErrorValueWithMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            this.message = str;
        }

        @NotNull
        public final SimpleType getType(@NotNull ModuleDescriptor moduleDescriptor) {
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            SimpleType createErrorType = ErrorUtils.createErrorType(this.message);
            Intrinsics.checkNotNullExpressionValue(createErrorType, "createErrorType(message)");
            return createErrorType;
        }

        @NotNull
        public final String toString() {
            return this.message;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final ErrorValue create(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            return new ErrorValueWithMessage(str);
        }
    }
}
