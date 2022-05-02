package o;

import o.b;

public final class LogType implements getAdapterPosition<getTypeSting> {
    private final b.C0007b<PageLog> requestMoneyEntityDataFactoryProvider;
    private final b.C0007b<setRefer> requestMoneyPreferenceEntityDataFactoryProvider;

    public LogType(b.C0007b<PageLog> bVar, b.C0007b<setRefer> bVar2) {
        this.requestMoneyEntityDataFactoryProvider = bVar;
        this.requestMoneyPreferenceEntityDataFactoryProvider = bVar2;
    }

    public final getTypeSting get() {
        return newInstance(this.requestMoneyEntityDataFactoryProvider.get(), this.requestMoneyPreferenceEntityDataFactoryProvider.get());
    }

    public static LogType create(b.C0007b<PageLog> bVar, b.C0007b<setRefer> bVar2) {
        return new LogType(bVar, bVar2);
    }

    public static getTypeSting newInstance(PageLog pageLog, setRefer setrefer) {
        return new getTypeSting(pageLog, setrefer);
    }
}
