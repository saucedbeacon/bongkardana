package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import o.initFields;
import ru.noties.markwon.spans.LinkSpan;
import ru.noties.markwon.spans.TableRowSpan;

public interface getCurrentLogsDir {
    @Nullable
    Object getMax(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization);

    @Nullable
    Object getMin();

    @Nullable
    Object getMin(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization);

    @Nullable
    Object getMin(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, int i, boolean z);

    @Nullable
    Object length();

    @Nullable
    Object length(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization);

    @Nullable
    Object length(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, int i);

    @Nullable
    Object length(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, boolean z);

    @Nullable
    Object setMax();

    @Nullable
    Object setMax(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, int i);

    @Nullable
    Object setMax(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, @NonNull String str, @NonNull initFields.setMax setmax, @NonNull onAppendLog onappendlog, @Nullable getUploadFile getuploadfile, boolean z);

    @Nullable
    Object setMax(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, @NonNull List<TableRowSpan.getMin> list, boolean z, boolean z2);

    @Nullable
    Object setMin();

    @Nullable
    Object setMin(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization);

    @Nullable
    Object setMin(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, int i);

    @Nullable
    Object setMin(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, @NonNull String str, @NonNull LinkSpan.getMax getmax);
}
