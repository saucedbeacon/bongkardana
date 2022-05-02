package id.dana.ocr.receipt.exception;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid/dana/ocr/receipt/exception/RuleUnspecifiedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "library_release"}, k = 1, mv = {1, 1, 16})
public final class RuleUnspecifiedException extends Exception {
    public RuleUnspecifiedException() {
        super("Rule not applied or unknown rule format");
    }
}
