package mycom.collection.mytest;

import java.io.*;
import java.util.*;

public class FileUtils {
    public static List<String> naiveReadlines(String filename)
            throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        List<String> results = new ArrayList<String>();

        try {
            String line = null;
            while ((line = br.readLine()) != null)
                results.add(line);
        } finally {
            br.close();
            fr.close();
        }

        return results;
    }

    public static Iterable<String> readlines(String filename) throws IOException {
        final FileReader fr = new FileReader(filename);
        final BufferedReader br = new BufferedReader(fr);

        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    public boolean hasNext() {
                        return line != null;
                    }

                    public String next() {
                        String retval = line;
                        line = getLine();
                        return retval;
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    private String getLine() {
                        String line = null;
                        try {
                            line = br.readLine();
                        } catch (IOException ioEx) {
                            line = null;
                        }
                        return line;
                    }

                    private String line = getLine();
                };
            }
        };
    }
}