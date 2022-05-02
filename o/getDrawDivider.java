package o;

import id.dana.data.account.repository.AccountEntityRepository;

public final class getDrawDivider implements RedDotDrawable {
    private final String setMin;

    public getDrawDivider(String str) {
        this.setMin = str;
    }

    public final Object apply(Object obj) {
        return AccountEntityRepository.lambda$saveAvatarUrl$5(this.setMin, (String) obj);
    }
}
