package o;

import o.b;

public final class getProcessName implements getAdapterPosition<isMainProcess> {
    private final b.C0007b<StringUtils> defaultAllBillerX2BEntityDataProvider;
    private final b.C0007b<onNodeExit> splitAllBillerX2BEntityDataProvider;

    public getProcessName(b.C0007b<StringUtils> bVar, b.C0007b<onNodeExit> bVar2) {
        this.defaultAllBillerX2BEntityDataProvider = bVar;
        this.splitAllBillerX2BEntityDataProvider = bVar2;
    }

    public final isMainProcess get() {
        return newInstance(this.defaultAllBillerX2BEntityDataProvider.get(), this.splitAllBillerX2BEntityDataProvider.get());
    }

    public static getProcessName create(b.C0007b<StringUtils> bVar, b.C0007b<onNodeExit> bVar2) {
        return new getProcessName(bVar, bVar2);
    }

    public static isMainProcess newInstance(StringUtils stringUtils, onNodeExit onnodeexit) {
        return new isMainProcess(stringUtils, onnodeexit);
    }
}
