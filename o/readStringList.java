package o;

final class readStringList implements RedDotDrawable {
    private final queryAppAppInfos setMin;

    public readStringList(queryAppAppInfos queryappappinfos) {
        this.setMin = queryappappinfos;
    }

    public final Object apply(Object obj) {
        return this.setMin.setQuestList(((queryAppAppInfos) obj).getQuestList());
    }
}
