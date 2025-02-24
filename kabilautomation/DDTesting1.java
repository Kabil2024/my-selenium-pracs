import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DDTesting1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "//testdata//kabil.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet kab");
        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("name");
        row.createCell(1).setCellValue("Kabil");
        XSSFRow row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("age");
        row1.createCell(1).setCellValue("26");
        workbook.write(file);
        workbook.close();
        file.close();
    }
}
