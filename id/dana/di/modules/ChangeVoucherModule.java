package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.BindAnim;
import o.BindBitmap;

@Module
public class ChangeVoucherModule {
    private final BindBitmap.setMax setMin;

    @Provides
    public BindBitmap.getMin length(BindAnim bindAnim) {
        return bindAnim;
    }

    public ChangeVoucherModule(BindBitmap.setMax setmax) {
        this.setMin = setmax;
    }

    @Provides
    public BindBitmap.setMax length() {
        return this.setMin;
    }
}
