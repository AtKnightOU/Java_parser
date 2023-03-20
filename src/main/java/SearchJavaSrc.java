//    package parsercontroller;

import java.io.File;
import java.util.ArrayList;

public class SearchJavaSrc {
    private ArrayList<File> result;
    
    public SearchJavaSrc() {
        result = new ArrayList();
    }

    public ArrayList<File> getJavaFiles(File dir) {
        getJavaFilesRecursive(dir);

        return result;
    }

    private void getJavaFilesRecursive(File dir) {
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                getJavaFiles(file);
            } else if (file.getName().endsWith("java")) {
                result.add(file);
            }
        }
    }

    private void showFileNames() {
        for (File file : result) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
