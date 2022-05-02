package o;

import android.text.TextUtils;

final class customView implements RedDotDrawable {
    private final onShow getMin;
    private final isCheckPromptChecked setMax;

    public customView(onShow onshow, isCheckPromptChecked ischeckpromptchecked) {
        this.getMin = onshow;
        this.setMax = ischeckpromptchecked;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$processDownload$0(this.setMax, (getAppenderManager) obj);
    }

    /* renamed from: o.customView$default  reason: invalid class name */
    public class Cdefault {
        private static final String DEFAULT_NAME;
        private static final long MINIMUM_STORAGE_AVAILABLE = 100;
        private String fileName;
        private String filePath;
        private String fileType;
        private long minStorageAvailable;
        private String source;

        static {
            StringBuilder sb = new StringBuilder("DANA_");
            sb.append(Math.random());
            DEFAULT_NAME = sb.toString();
        }

        public String getSource() {
            return this.source;
        }

        public void setSource(String str) {
            this.source = str;
        }

        public String getFileType() {
            return this.fileType;
        }

        public void setFileType(String str) {
            this.fileType = str;
        }

        public String getFilePath() {
            return this.filePath;
        }

        public void setFilePath(String str) {
            this.filePath = str;
        }

        public String getFileName() {
            if (TextUtils.isEmpty(this.fileName)) {
                return DEFAULT_NAME;
            }
            return setLeftSelectedIndex.setMin(this.fileName);
        }

        public void setFileName(String str) {
            this.fileName = str;
        }

        public String getExtension(String str) {
            return str.substring(str.lastIndexOf(46));
        }

        public long getMinStorageAvailable() {
            long j = this.minStorageAvailable;
            return j != 0 ? j : MINIMUM_STORAGE_AVAILABLE;
        }

        public void setMinStorageAvailable(long j) {
            this.minStorageAvailable = j;
        }
    }
}
