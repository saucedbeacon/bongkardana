package o;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;

final class debugMode implements RedDotManager {
    private final BridgeCallback getMin;
    private final maxWidth length;
    private final String setMin;

    public debugMode(maxWidth maxwidth, BridgeCallback bridgeCallback, String str) {
        this.length = maxwidth;
        this.getMin = bridgeCallback;
        this.setMin = str;
    }

    public final void accept(Object obj) {
        this.length.lambda$getForexBalance$1(this.getMin, this.setMin, (initUC7zSo) obj);
    }

    /* renamed from: o.debugMode$default  reason: invalid class name */
    public final class Cdefault {
        private String country;
        private String from;
        private String rateCurrency;
        private String symbol;
        private String to;

        public final String getSymbol() {
            return this.symbol;
        }

        public final void setSymbol(String str) {
            this.symbol = str;
        }

        public final String getCountry() {
            return this.country;
        }

        public final void setCountry(String str) {
            this.country = str;
        }

        public final String getRate() {
            return this.rateCurrency;
        }

        public final void setRate(String str) {
            this.rateCurrency = str;
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
