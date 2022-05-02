package o;

public final class CardView {
    public static final evictAll getMax = evictAll.a(":scheme");
    public static final evictAll getMin = evictAll.a(":path");
    public static final evictAll length = evictAll.a(":authority");
    public static final evictAll setMax = evictAll.a(":method");
    public static final evictAll setMin = evictAll.a(":status");
    public final evictAll equals;
    public final evictAll toFloatRange;
    final int toIntRange;

    public CardView(String str, String str2) {
        this(evictAll.a(str), evictAll.a(str2));
    }

    public CardView(evictAll evictall, String str) {
        this(evictall, evictAll.a(str));
    }

    public CardView(evictAll evictall, evictAll evictall2) {
        this.equals = evictall;
        this.toFloatRange = evictall2;
        this.toIntRange = evictall.j() + 32 + evictall2.j();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardView) {
            CardView cardView = (CardView) obj;
            if (!this.equals.equals(cardView.equals) || !this.toFloatRange.equals(cardView.toFloatRange)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.equals.hashCode() + 527) * 31) + this.toFloatRange.hashCode();
    }

    public final String toString() {
        return CustomTabsIntent$ShareState.getMin("%s: %s", this.equals.a(), this.toFloatRange.a());
    }
}
