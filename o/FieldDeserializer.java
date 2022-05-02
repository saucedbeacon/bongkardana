package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class FieldDeserializer implements getAdapterPosition<onDescriptorWrite> {
    private final ApplicationModule getMax;
    private final b.C0007b<hasInputException> setMax;

    private FieldDeserializer(ApplicationModule applicationModule, b.C0007b<hasInputException> bVar) {
        this.getMax = applicationModule;
        this.setMax = bVar;
    }

    public static FieldDeserializer setMin(ApplicationModule applicationModule, b.C0007b<hasInputException> bVar) {
        return new FieldDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onDescriptorWrite min = this.getMax.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
