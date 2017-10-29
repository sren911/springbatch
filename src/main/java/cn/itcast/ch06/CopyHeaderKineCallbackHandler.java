package cn.itcast.ch06;

import org.springframework.batch.item.file.FlatFileHeaderCallback;
import org.springframework.batch.item.file.LineCallbackHandler;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by sren on 2017/6/11.
 
dsdsad dfdsfd
 */
public class CopyHeaderKineCallbackHandler implements LineCallbackHandler, FlatFileHeaderCallback {
    private String header = "";
    @Override
    public void writeHeader(Writer writer) throws IOException {
        writer.write(header);
    }

    @Override
    public void handleLine(String line) {
        this.header = line;
    }
}
