package o;

import android.content.Intent;
import androidx.annotation.NonNull;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.AutoTransition;
import o.LocationBridgeExtension;
import o.getDuration;
import o.onMessage;
import org.jetbrains.annotations.NotNull;

@PerActivity
public final class setStartDelay implements getDuration.length {
    private final LocationBridgeExtension.AnonymousClass2 getMax;
    private final onMessage getMin;
    private final GriverCreateDialogParam length;
    private final AutoTransition.setMax setMax;

    @Inject
    public setStartDelay(AutoTransition.setMax setmax, onMessage onmessage, LocationBridgeExtension.AnonymousClass2 r3, GriverCreateDialogParam griverCreateDialogParam) {
        this.setMax = setmax;
        this.getMin = onmessage;
        this.getMax = r3;
        this.length = griverCreateDialogParam;
    }

    public final void setMax(@NotNull final String str) {
        this.setMax.showProgress();
        final String length2 = this.setMax.length();
        this.length.execute(new GriverAppVirtualHostProxy<String>() {
            public final void onError(Throwable th) {
                super.onError(th);
                setStartDelay.this.getMin.execute(new PatternPathMotion(setStartDelay.this.setMax, false, length2, setStartDelay.this.getMax), onMessage.getMax.forLinkRead(str));
            }

            public final /* synthetic */ void onNext(@NotNull Object obj) {
                setStartDelay.this.getMin.execute(new PatternPathMotion(setStartDelay.this.setMax, false, length2, setStartDelay.this.getMax), onMessage.getMax.forLinkRead(str));
            }
        });
    }

    public final void setMin(@NotNull String str, Intent intent) {
        this.setMax.showProgress();
        onMessage onmessage = this.getMin;
        AutoTransition.setMax setmax = this.setMax;
        onmessage.execute(new PatternPathMotion(setmax, setmax.length(), this.getMax, intent), onMessage.getMax.forLinkRead(str));
    }

    public final void setMax() {
        this.setMax.dismissProgress();
        this.getMin.dispose();
    }

    public final void getMin(@NonNull final String str) {
        final String length2 = this.setMax.length();
        this.length.execute(new GriverAppVirtualHostProxy<String>() {
            public final void onError(Throwable th) {
                super.onError(th);
                setStartDelay.this.getMin.execute(new PatternPathMotion(setStartDelay.this.setMax, false, length2, setStartDelay.this.getMax), onMessage.getMax.forLinkRead(str));
            }

            public final /* synthetic */ void onNext(@NotNull Object obj) {
                setStartDelay.this.getMin.execute(new PatternPathMotion(setStartDelay.this.setMax, false, length2, setStartDelay.this.getMax), onMessage.getMax.forLinkRead(str));
            }
        });
    }
}
