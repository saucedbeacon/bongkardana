package o;

import o.CreatePromptParam;
import o.b;

public final class getPlaceHolder implements getAdapterPosition<CreatePromptParam.PositiveListener> {
    private final b.C0007b<EngineInitFailedPoint> geocodeConfigEntityDataFactoryProvider;
    private final b.C0007b<EngineInitSuccessPoint> geocodeEntityDataFactoryProvider;

    public getPlaceHolder(b.C0007b<EngineInitSuccessPoint> bVar, b.C0007b<EngineInitFailedPoint> bVar2) {
        this.geocodeEntityDataFactoryProvider = bVar;
        this.geocodeConfigEntityDataFactoryProvider = bVar2;
    }

    public final CreatePromptParam.PositiveListener get() {
        return newInstance(this.geocodeEntityDataFactoryProvider.get(), this.geocodeConfigEntityDataFactoryProvider.get());
    }

    public static getPlaceHolder create(b.C0007b<EngineInitSuccessPoint> bVar, b.C0007b<EngineInitFailedPoint> bVar2) {
        return new getPlaceHolder(bVar, bVar2);
    }

    public static CreatePromptParam.PositiveListener newInstance(EngineInitSuccessPoint engineInitSuccessPoint, EngineInitFailedPoint engineInitFailedPoint) {
        return new CreatePromptParam.PositiveListener(engineInitSuccessPoint, engineInitFailedPoint);
    }
}
