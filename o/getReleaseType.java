package o;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.DumperOptions;

class getReleaseType extends setUploader {
    private static final Pattern isInside = Pattern.compile("\n|| | ");
    protected Map<Class<? extends Object>, getLastPage> equals;
    protected TimeZone toIntRange;
    protected DumperOptions.NonPrintableStyle toString;

    public getReleaseType() {
        this(new DumperOptions());
    }

    private getReleaseType(DumperOptions dumperOptions) {
        this.toIntRange = null;
        this.getMax = new toFloatRange();
        this.setMax.put(String.class, new getReleaseType$FastBitmap$CoordinateSystem(this));
        this.setMax.put(Boolean.class, new setMax());
        this.setMax.put(Character.class, new getReleaseType$FastBitmap$CoordinateSystem(this));
        this.setMax.put(UUID.class, new toDoubleRange());
        this.setMax.put(byte[].class, new getMin());
        values values2 = new values();
        this.setMax.put(short[].class, values2);
        this.setMax.put(int[].class, values2);
        this.setMax.put(long[].class, values2);
        this.setMax.put(float[].class, values2);
        this.setMax.put(double[].class, values2);
        this.setMax.put(char[].class, values2);
        this.setMax.put(boolean[].class, values2);
        this.length.put(Number.class, new equals());
        this.length.put(List.class, new IsOverlapping());
        this.length.put(Map.class, new toIntRange());
        this.length.put(Set.class, new toString());
        this.length.put(Iterator.class, new isInside());
        this.length.put(new Object[0].getClass(), new length());
        this.length.put(Date.class, new getMax());
        this.length.put(Enum.class, new setMin());
        this.length.put(Calendar.class, new getMax());
        this.equals = new HashMap();
        this.toString = dumperOptions.toFloatRange;
    }

    protected class toFloatRange implements setLogAliveInterval {
        protected toFloatRange() {
        }
    }

    protected class setMax implements setLogAliveInterval {
        protected setMax() {
        }
    }

    protected class equals implements setLogAliveInterval {
        protected equals() {
        }
    }

    protected class IsOverlapping implements setLogAliveInterval {
        protected IsOverlapping() {
        }
    }

    protected class isInside implements setLogAliveInterval {
        protected isInside() {
        }
    }

    protected class length implements setLogAliveInterval {
        protected length() {
        }
    }

    protected class values implements setLogAliveInterval {
        protected values() {
        }
    }

    protected class toIntRange implements setLogAliveInterval {
        protected toIntRange() {
        }
    }

    protected class toString implements setLogAliveInterval {
        protected toString() {
        }
    }

    protected class getMax implements setLogAliveInterval {
        protected getMax() {
        }
    }

    protected class setMin implements setLogAliveInterval {
        protected setMin() {
        }
    }

    protected class getMin implements setLogAliveInterval {
        protected getMin() {
        }
    }

    public void length(TimeZone timeZone) {
        this.toIntRange = timeZone;
    }

    protected class toDoubleRange implements setLogAliveInterval {
        protected toDoubleRange() {
        }
    }
}
