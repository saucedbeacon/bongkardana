package id.dana.lib.gcontainer.app.bridge.downloadfile;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.Metadata;
import kotlin.text.Regex;
import o.setLeftSelectedIndex;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048F@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR \u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/downloadfile/DownloadFileEntity;", "", "()V", "businessName", "", "getBusinessName", "()Ljava/lang/String;", "setBusinessName", "(Ljava/lang/String;)V", "value", "fileName", "getFileName", "setFileName", "filePath", "getFilePath", "setFilePath", "fileType", "getFileType", "setFileType", "source", "getSource", "setSource", "url", "getUrl", "setUrl", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class DownloadFileEntity {
    @JSONField(name = "businessName")
    @Nullable
    private String businessName;
    @JSONField(name = "filename")
    @Nullable
    private String fileName;
    @JSONField(name = "filePath")
    @Nullable
    private String filePath;
    @JSONField(name = "fileType")
    @Nullable
    private String fileType;
    @JSONField(name = "source")
    @Nullable
    private String source;
    @JSONField(name = "url")
    @Nullable
    private String url;

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    @Nullable
    public final String getFileType() {
        return this.fileType;
    }

    public final void setFileType(@Nullable String str) {
        this.fileType = str;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    public final void setFileName(@Nullable String str) {
        if (str != null) {
            this.fileName = setLeftSelectedIndex.setMin(str);
        }
    }

    public final void setBusinessName(@Nullable String str) {
        this.businessName = str;
    }

    @Nullable
    public final String getBusinessName() {
        String str = this.businessName;
        if (str == null) {
            return null;
        }
        return new Regex("[^A-Za-z0-9]").replace((CharSequence) str, "");
    }
}
