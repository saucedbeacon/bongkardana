package o;

import kotlin.Metadata;
import kotlin.random.Random;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/nearbyme/util/SystemUtils;", "", "()V", "currentTimeMillis", "", "nextInt", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class node {
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public final int nextInt() {
        return Random.Default.nextInt();
    }
}
