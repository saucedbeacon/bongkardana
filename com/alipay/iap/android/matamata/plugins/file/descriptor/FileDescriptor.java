package com.alipay.iap.android.matamata.plugins.file.descriptor;

import com.facebook.flipper.core.FlipperObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class FileDescriptor extends FolderDescriptor {
    public Object[] getChildren(File file) {
        return null;
    }

    public /* bridge */ /* synthetic */ Object[] getChildren(Object obj) {
        return getChildren((File) obj);
    }

    public /* bridge */ /* synthetic */ List getData(Object obj) throws Exception {
        return getData((File) obj);
    }

    public List<Named<FlipperObject>> getData(File file) throws Exception {
        List<Named<FlipperObject>> data = super.getData(file);
        FlipperObject.setMax setmax = new FlipperObject.setMax();
        if (!shouldReadFile(file)) {
            setmax.getMax("Info", "Not a text file");
            data.add(new Named("Content", new FlipperObject(setmax.getMax)));
            return data;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append(10);
            } else {
                bufferedReader.close();
                setmax.getMax("Content", sb.toString());
                data.add(new Named("Content", new FlipperObject(setmax.getMax)));
                return data;
            }
        }
    }

    private boolean shouldReadFile(File file) {
        if (file.canRead() && !file.getName().endsWith(".so")) {
            return true;
        }
        return false;
    }
}
