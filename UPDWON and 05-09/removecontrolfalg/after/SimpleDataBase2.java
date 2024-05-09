package removecontrolflag.after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDataBase2 {

    private Map<String, String> map = new HashMap<String, String>();

    public SimpleDataBase2(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);

        // 리딩
        boolean reading = false;
        String line;

        while (!reading) {
            line = br.readLine();
            if(line == null) {
                reading = true;
                break;
                // 굳이 더이상 반복을 할필요가 없음
            }

            int index = line.indexOf("=");

            if(index > 0) {
                String key = line.substring(0, index);
                String value = line.substring(index+1 , line.length());
                map.put(key,value);
            }


            else {
                boolean scanningkey = true;

                StringBuffer keyBuffer = new StringBuffer();
                StringBuffer valueBuffer = new StringBuffer();

                for (int i=0; i<line.length(); i++) {
                    char c = line.charAt(i);

                    if(scanningkey) {
                        if(c == '=') {
                            scanningkey = false;
                        } else {
                            keyBuffer.append(c);
                        }
                    } else {
                        valueBuffer.append(c);
                    }
                }
                String key = keyBuffer.toString();
                String value = valueBuffer.toString();
                map.put(key, value);
            }
        }
    }

    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }

    public String getValue(String key) {
        return map.get(key);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
