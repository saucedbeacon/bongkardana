package o;

public interface isSpanStillValid {
    boolean post(Runnable runnable);

    void removeCallbacks(Runnable runnable);
}
