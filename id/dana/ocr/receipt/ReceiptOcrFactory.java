package id.dana.ocr.receipt;

import com.google.firebase.ml.vision.FirebaseVision;
import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer;
import id.dana.ocr.receipt.impl.DefaultReceiptOcr;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lid/dana/ocr/receipt/ReceiptOcrFactory;", "", "()V", "instance", "Lid/dana/ocr/receipt/ReceiptOcr;", "instance$annotations", "getInstance", "()Lid/dana/ocr/receipt/ReceiptOcr;", "instance$delegate", "Lkotlin/Lazy;", "library_release"}, k = 1, mv = {1, 1, 16})
public final class ReceiptOcrFactory {
    @NotNull
    private static final Lazy length = LazyKt.lazy(length.INSTANCE);
    static final /* synthetic */ KProperty[] setMax = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReceiptOcrFactory.class), "instance", "getInstance()Lid/dana/ocr/receipt/ReceiptOcr;"))};
    public static final ReceiptOcrFactory setMin = new ReceiptOcrFactory();

    @NotNull
    public static final ReceiptOcr setMin() {
        return (ReceiptOcr) length.getValue();
    }

    private ReceiptOcrFactory() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/ocr/receipt/impl/DefaultReceiptOcr;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class length extends Lambda implements Function0<DefaultReceiptOcr> {
        public static final length INSTANCE = new length();

        length() {
            super(0);
        }

        @NotNull
        public final DefaultReceiptOcr invoke() {
            FirebaseVision instance = FirebaseVision.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseVision.getInstance()");
            FirebaseVisionTextRecognizer onDeviceTextRecognizer = instance.getOnDeviceTextRecognizer();
            Intrinsics.checkExpressionValueIsNotNull(onDeviceTextRecognizer, "FirebaseVision.getInstan…().onDeviceTextRecognizer");
            return new DefaultReceiptOcr(onDeviceTextRecognizer);
        }
    }
}
