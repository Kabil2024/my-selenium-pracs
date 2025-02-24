import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class DDTesting {
    public static void main(String[] args) throws IOException {
        FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"//testdata//firsttask.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
       int totarows =  sheet.getLastRowNum();
       int totalcols = sheet.getRow(2).getLastCellNum();
        System.out.println("total rows "+totarows);
        System.out.println("total cols "+totalcols);
        for (int i = 0;i<=totarows;i++){
            XSSFRow currentrow = sheet.getRow(i);
            for (int j =0;j<totalcols;j++){
               XSSFCell cell = currentrow.getCell(j);
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();


//        FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"//testdata//kaqbil.xlsx");
//        XSSFWorkbook workbook1 = new XSSFWorkbook();
//        XSSFSheet she = workbook1.createSheet("Sheet12");
//        XSSFRow row4  = she.createRow(3);
//        row4.createCell(0).setCellValue("manuaql");
//        row4.createCell(1).setCellValue("aqutomaqt");
//
//        workbook1.write(file1);
//        workbook.close();
//        file1.close();






    }
}
