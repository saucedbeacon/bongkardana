package o;

import id.dana.data.account.repository.AccountEntityRepository;

public final class getDividerHeight implements RedDotDrawable {
    private final AccountEntityRepository getMin;

    public getDividerHeight(AccountEntityRepository accountEntityRepository) {
        this.getMin = accountEntityRepository;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$isOverActiveTimestamp$2((Long) obj);
    }
}
