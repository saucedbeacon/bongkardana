package id.dana.danah5.globalnetwork.model.request;

import androidx.annotation.Keep;
import java.util.List;

@Keep
public class InquiryForexRateEntity {
    private String lastUpdated;
    private List<getMax> queries;

    public List<getMax> getQueries() {
        return this.queries;
    }

    public void setQueries(List<getMax> list) {
        this.queries = list;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(String str) {
        this.lastUpdated = str;
    }

    public class getMax {
        private String from;
        private String to;

        public getMax() {
        }

        public final String getFrom() {
            return this.from;
        }

        public final void setFrom(String str) {
            this.from = str;
        }

        public final String getTo() {
            return this.to;
        }

        public final void setTo(String str) {
            this.to = str;
        }
    }
}
