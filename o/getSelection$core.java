package o;

import id.dana.data.account.repository.AccountEntityRepository;

public final class getSelection$core implements RedDotDrawable {
    private final AccountEntityRepository getMin;

    public getSelection$core(AccountEntityRepository accountEntityRepository) {
        this.getMin = accountEntityRepository;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$updateProfile$4((getOwner) obj);
    }
}
