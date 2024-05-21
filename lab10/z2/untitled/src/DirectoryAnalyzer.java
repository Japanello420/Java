import java.io.File;

public class DirectoryAnalyzer {

    public static void main(String[] args) {
        String baseDirPath = "C:\\Users\\s31319\\Downloads\\LAB10\\basedir\\basedir"; // Zamień na właściwą ścieżkę do basedir
        File baseDir = new File(baseDirPath);

        if (baseDir.exists() && baseDir.isDirectory()) {
            File dirWithMostFiles = findDirWithMostFiles(baseDir);
            if (dirWithMostFiles != null) {
                System.out.println("Directory with the most files: " + dirWithMostFiles.getAbsolutePath());
                System.out.println("Number of files: " + dirWithMostFiles.listFiles().length);
            } else {
                System.out.println("No directories found in the specified base directory.");
            }
        } else {
            System.out.println("The specified base directory does not exist or is not a directory.");
        }
    }

    private static File findDirWithMostFiles(File baseDir) {
        File dirWithMostFiles = null;
        int maxFiles = 0;

        for (File file : baseDir.listFiles()) {
            if (file.isDirectory()) {
                int fileCount = countFiles(file);
                if (fileCount > maxFiles) {
                    maxFiles = fileCount;
                    dirWithMostFiles = file;
                }
            }
        }

        return dirWithMostFiles;
    }

    private static int countFiles(File directory) {
        if (directory.isDirectory()) {
            return directory.listFiles().length;
        }
        return 0;
    }
}