package o;

import android.app.Application;
import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getFieldDeserializer implements getAdapterPosition<DefaultEmbedViewManager> {
    private final b.C0007b<hasInputException> getMax;
    private final b.C0007b<Application> length;
    private final b.C0007b<getEngine> setMax;
    private final ApplicationModule setMin;

    private getFieldDeserializer(ApplicationModule applicationModule, b.C0007b<Application> bVar, b.C0007b<hasInputException> bVar2, b.C0007b<getEngine> bVar3) {
        this.setMin = applicationModule;
        this.length = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
    }

    public static getFieldDeserializer getMax(ApplicationModule applicationModule, b.C0007b<Application> bVar, b.C0007b<hasInputException> bVar2, b.C0007b<getEngine> bVar3) {
        return new getFieldDeserializer(applicationModule, bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        DefaultEmbedViewManager min = this.setMin.getMin(this.length.get(), this.getMax.get(), this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
