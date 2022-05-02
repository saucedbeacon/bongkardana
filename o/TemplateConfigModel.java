package o;

import o.b;

public final class TemplateConfigModel implements getAdapterPosition<getExtUrl> {
    private final b.C0007b<setExtUrl> userEmailAddressApiProvider;

    public TemplateConfigModel(b.C0007b<setExtUrl> bVar) {
        this.userEmailAddressApiProvider = bVar;
    }

    public final getExtUrl get() {
        return newInstance(this.userEmailAddressApiProvider.get());
    }

    public static TemplateConfigModel create(b.C0007b<setExtUrl> bVar) {
        return new TemplateConfigModel(bVar);
    }

    public static getExtUrl newInstance(setExtUrl setexturl) {
        return new getExtUrl(setexturl);
    }
}
