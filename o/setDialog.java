package o;

import id.dana.data.account.repository.AccountEntityRepository;

public final class setDialog implements RedDotDrawable {
    private final Long getMin;

    public setDialog(Long l) {
        this.getMin = l;
    }

    public final Object apply(Object obj) {
        return AccountEntityRepository.lambda$isOverActiveTimestamp$1(this.getMin, (Long) obj);
    }
}
