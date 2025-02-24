import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.text.DateFormatter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtility {
    public static FileInputStream fi;
    public static FileOutputStream fo;
    public static XSSFWorkbook wb;
    public static XSSFSheet ws;
    public static XSSFRow row;
    public static XSSFCell cell;

    public static int getrowcount(String file, String sheet) throws IOException {
        fi = new FileInputStream(file);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheet);
        int rowcount = ws.getLastRowNum();
        wb.close();
        fi.close();
        return rowcount;
    }
    public static int getcellcount(String file, String sheet, int rows) throws FileNotFoundException {
        fi = new FileInputStream(file);
        wb = new XSSFWorkbook();
        ws = wb.getSheet(sheet);
        row = ws.getRow(rows);
        int cellcount = row.getLastCellNum();
        return cellcount;
    }
    public static String getcelldata(String file, String sheet, int rownum, int col) throws IOException {
        fi = new FileInputStream(file);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheet);
        row = ws.getRow(rownum);
        cell = row.getCell(col);
        String data;
        try {
            data = cell.toString();
        } catch (Exception e) {
            data = "";
        }
        wb.close();
        fi.close();
        return data;
    }
    public static void setcelldata(String file, String sheet, int rownum, int colum, String data) throws IOException {
        fi = new FileInputStream(file);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheet);
        row = ws.getRow(rownum);

        cell = row.createCell(colum);
        cell.setCellValue(data);
        fo = new FileOutputStream(file);
        wb.write(fo);
        wb.close();
        fi.close();
        fo.close();
    }

}
