package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class createFieldDeserializer implements getAdapterPosition<AndroidModel> {
    private final b.C0007b<getPermissionModel> getMax;
    private final ApplicationModule setMin;

    private createFieldDeserializer(ApplicationModule applicationModule, b.C0007b<getPermissionModel> bVar) {
        this.setMin = applicationModule;
        this.getMax = bVar;
    }

    public static createFieldDeserializer getMax(ApplicationModule applicationModule, b.C0007b<getPermissionModel> bVar) {
        return new createFieldDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AndroidModel max = this.setMin.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
