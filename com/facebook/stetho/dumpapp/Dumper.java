package com.facebook.stetho.dumpapp;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.MonitorItemConstants;
import o.appendAllTime;
import o.appendAppId;
import o.appendUpMsgLens;
import o.recordTcpTime;
import org.apache.commons.cli.ParseException;

public class Dumper {
    private final Map<String, DumperPlugin> mDumperPlugins;
    private final GlobalOptions mGlobalOptions;
    private final MonitorItemConstants mParser;

    public Dumper(Iterable<DumperPlugin> iterable) {
        this(iterable, new appendAllTime());
    }

    public Dumper(Iterable<DumperPlugin> iterable, MonitorItemConstants monitorItemConstants) {
        this.mDumperPlugins = generatePluginMap(iterable);
        this.mParser = monitorItemConstants;
        this.mGlobalOptions = new GlobalOptions();
    }

    private static Map<String, DumperPlugin> generatePluginMap(Iterable<DumperPlugin> iterable) {
        HashMap hashMap = new HashMap();
        for (DumperPlugin next : iterable) {
            hashMap.put(next.getName(), next);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public int dump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) {
        try {
            return doDump(inputStream, printStream, printStream2, strArr);
        } catch (ParseException e) {
            printStream2.println(e.getMessage());
            dumpUsage(printStream2);
            return 1;
        } catch (DumpException e2) {
            printStream2.println(e2.getMessage());
            return 1;
        } catch (DumpappOutputBrokenException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e4.printStackTrace(printStream2);
            return 1;
        }
    }

    private int doDump(InputStream inputStream, PrintStream printStream, PrintStream printStream2, String[] strArr) throws ParseException, DumpException {
        recordTcpTime length = this.mParser.length(this.mGlobalOptions.options, strArr);
        if (length.hasOption(this.mGlobalOptions.optionHelp.getOpt())) {
            dumpUsage(printStream);
            return 0;
        } else if (length.hasOption(this.mGlobalOptions.optionListPlugins.getOpt())) {
            dumpAvailablePlugins(printStream);
            return 0;
        } else if (!length.getArgList().isEmpty()) {
            dumpPluginOutput(inputStream, printStream, printStream2, length);
            return 0;
        } else {
            dumpUsage(printStream2);
            return 1;
        }
    }

    private void dumpAvailablePlugins(PrintStream printStream) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (DumperPlugin name : this.mDumperPlugins.values()) {
            arrayList.add(name.getName());
        }
        Collections.sort(arrayList);
        for (String println : arrayList) {
            printStream.println(println);
        }
    }

    private void dumpPluginOutput(InputStream inputStream, PrintStream printStream, PrintStream printStream2, recordTcpTime recordtcptime) throws DumpException {
        ArrayList arrayList = new ArrayList(recordtcptime.getArgList());
        if (arrayList.size() > 0) {
            String str = (String) arrayList.remove(0);
            DumperPlugin dumperPlugin = this.mDumperPlugins.get(str);
            if (dumperPlugin != null) {
                dumperPlugin.dump(new DumperContext(inputStream, printStream, printStream2, this.mParser, arrayList));
                return;
            }
            StringBuilder sb = new StringBuilder("No plugin named '");
            sb.append(str);
            sb.append("'");
            throw new DumpException(sb.toString());
        }
        throw new DumpException("Expected plugin argument");
    }

    private void dumpUsage(PrintStream printStream) {
        appendAppId appendappid = new appendAppId();
        printStream.println("Usage: dumpapp [options] <plugin> [plugin-options]");
        PrintWriter printWriter = new PrintWriter(printStream);
        try {
            int i = appendappid.getMax;
            appendUpMsgLens appendupmsglens = this.mGlobalOptions.options;
            int i2 = appendappid.length;
            int i3 = appendappid.setMax;
            StringBuffer stringBuffer = new StringBuffer();
            appendappid.setMax(stringBuffer, i, appendupmsglens, i2, i3);
            printWriter.println(stringBuffer.toString());
        } finally {
            printWriter.flush();
        }
    }
}
