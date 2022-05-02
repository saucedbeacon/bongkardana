package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.b;
import o.html;

@RequiresApi(api = 28)
public final class setText implements setElevation<ByteBuffer, Bitmap> {
    private final MotionTelltales setMax = new MotionTelltales();

    public final /* bridge */ /* synthetic */ boolean length(@NonNull Object obj, @NonNull MotionHelper motionHelper) throws IOException {
        return true;
    }

    public final class core implements getAdapterPosition<html.Cdefault> {
        private final b.C0007b<Context> contextProvider;
        private final b.C0007b<PluginInstallCallback> serializerProvider;

        public core(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
            this.contextProvider = bVar;
            this.serializerProvider = bVar2;
        }

        public final html.Cdefault get() {
            return newInstance(this.contextProvider.get(), this.serializerProvider.get());
        }

        public static core create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
            return new core(bVar, bVar2);
        }

        public static html.Cdefault newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
            return new html.Cdefault(context, pluginInstallCallback);
        }
    }

    @Nullable
    public final /* synthetic */ fireTrigger getMax(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) throws IOException {
        return this.setMax.getMax(ImageDecoder.createSource((ByteBuffer) obj), i, i2, motionHelper);
    }
}
