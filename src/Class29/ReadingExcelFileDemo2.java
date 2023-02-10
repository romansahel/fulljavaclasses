package Class29;

import utils.ExcelReader;

import java.io.IOException;

public class ReadingExcelFileDemo2 {
    public static void main(String[] args) throws IOException {
        var excelData=   ExcelReader.read("C:\\Users\\roman\\IdeaProjects\\JavaBatch14\\Data\\Book2.xlsx");
        System.out.println(excelData);

    }
}
