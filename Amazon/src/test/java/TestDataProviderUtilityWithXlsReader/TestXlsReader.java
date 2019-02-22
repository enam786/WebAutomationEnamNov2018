package TestDataProviderUtilityWithXlsReader;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Iterator;
public class TestXlsReader {
    public static void main(String[] args) throws Exception{
        String excelFilePath = "C:\\Users\\ENAM\\IdeaProjects\\WebAutomationFrameWorkEnam2018\\Amazon\\src\\main\\java\\dataProviderUtilityWithXlsReader\\testData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(excelFilePath);

        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet1 = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet1.rowIterator();

        while (rowIterator.hasNext()){
            Row nextRow = rowIterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();

            while (cellIterator.hasNext()){
                Cell cell = cellIterator.next();

//                switch (cell.getCellType()){
//                    case Cell.CELL_TYPE_STRING:
//                        System.out.print(cell.getStringCellValue());
//                   // case Cell.CELL_TYPE_BOOLEAN:
//                        //System.out.println(cell.getBooleanCellValue());
//                    case Cell.CELL_TYPE_NUMERIC:
//                      System.out.println(cell.getNumericCellValue());
//
//                        break;
//                }
                if (cell.getCellType() == Cell.CELL_TYPE_STRING){
                    System.out.print(cell.getStringCellValue());}
                else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                    System.out.println(cell.getNumericCellValue());
                }else if(cell.getCellType() ==Cell.CELL_TYPE_BOOLEAN ){
                    System.out.println(cell.getBooleanCellValue());
                }
                else{ System.out.println("not found"); }

                System.out.print("         ");
            }
            System.out.println("");
        }
        workbook.close();
        fileInputStream.close();
    }

}
