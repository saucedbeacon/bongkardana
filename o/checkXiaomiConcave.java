package o;

public final class checkXiaomiConcave implements checkOppoConcave {
    public final String getMax() {
        return "Text cannot use repeated character";
    }

    public final boolean getMax(String str) {
        return !str.matches("\\b(\\d)\\1+\\b");
    }
}
