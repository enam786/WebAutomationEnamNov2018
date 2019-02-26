package forTestingPurpose;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExpediaDDDummy {

    /* this is a dummy data driven
     * code sample on Expedia login
     * and create account page with excel sheet
     *
     * Created by Md K Enam
     * date : 02/19/2019
     * GOVERNMENT SITE IS THE BEST FOR DATA DRIVEN TEST
     * */


        WebDriver driver;
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFCell cell;

        @BeforeTest
        public void initialization(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\ENAM\\Desktop\\Drivers\\Chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.expedia.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @Test
        public void expediaCheckin() throws IOException {
            // Import excel sheet.
            File src=new File("C:\\Users\\ENAM\\IdeaProjects\\WebAutomationFrameWorkEnam2018\\Amazon\\src\\main\\java\\dataProviderUtilityWithXlsReader\\dummyData.xlsx");
            // Load the file.
            FileInputStream fis = new FileInputStream(src);
            // Load he workbook.
            workbook = new XSSFWorkbook(fis);
            // Load the sheet in which data is stored.
            sheet= workbook.getSheetAt(0);
            for(int i=1; i<=sheet.getLastRowNum(); i++){
 /*I have added test data in the cell A2 as "testemailone@test.com" and B2 as "password"
 Cell A2 = row 1 and column 0. It reads first row as 0, second row as 1 and so on
 and first column (A) as 0 and second column (B) as 1 and so on*/

                // Import data for Email.
                cell = sheet.getRow(i).getCell(7);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                WebElement origin = driver.findElement(By.cssSelector("#package-origin-hp-package"));
                origin.sendKeys(cell.getStringCellValue());
                origin.sendKeys(Keys.TAB);


               // cell = sheet.getRow(i).getCell(8);
                //cell.setCellType(Cell.CELL_TYPE_STRING);
                driver.findElement(By.xpath("//*[@class='datepicker-label datepicker-arrow text icon-before focused']")).click();
               // bdate.sendKeys(cell.getStringCellValue());
                List<WebElement> allDates=driver.findElements(By.xpath("//*[@class='datepicker-cal-weeks']//*[text()='Feb 2019']"));

                for(WebElement ele:allDates)
                {

                    String date=ele.getText();

                    if(date.equalsIgnoreCase("28"))
                    {
                        ele.click();
                        break;
                    }

                }



                // Import data for password.
                cell = sheet.getRow(i).getCell(1);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).clear();
                driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).sendKeys(cell.getStringCellValue());
                // To click on Login button
                driver.findElement(By.cssSelector("#loginbutton")).click();
                driver.findElement(By.xpath("//*[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']")).click();
                cell=sheet.getRow(i).getCell(2);
                driver.findElement(By.cssSelector("#u_0_k")).sendKeys(cell.getStringCellValue());

                cell=sheet.getRow(i).getCell(3);
                driver.findElement(By.cssSelector("#u_0_m")).sendKeys(cell.getStringCellValue());

                cell=sheet.getRow(i).getCell(4);
                driver.findElement(By.cssSelector("#u_0_p")).sendKeys(cell.getStringCellValue());

                cell=sheet.getRow(i).getCell(4);
                driver.findElement(By.cssSelector("#u_0_s")).sendKeys(cell.getStringCellValue());

                cell=sheet.getRow(i).getCell(5);
                driver.findElement(By.cssSelector("#u_0_w")).sendKeys(cell.getStringCellValue());

                Select se = new Select(driver.findElement(By.cssSelector("#month")));
                se.selectByVisibleText("Jun");

                Select se2 = new Select(driver.findElement(By.cssSelector("#day")));
                se2.selectByVisibleText("11");

                Select se3 = new Select(driver.findElement(By.cssSelector("#year")));
                se3.selectByVisibleText("1999");

                WebElement radio = driver.findElement(By.xpath("//input[@id='u_0_7']"));
                radio.click();

                // driver.findElement(By.cssSelector("#u_0_12")).click();
                driver.findElement(By.cssSelector("#u_0_12")).sendKeys(Keys.ENTER);


                // selectOptionByVisibleText(,"");




                // driver.findElement(By.cssSelector("#pass")).clear();
                // driver.findElement(By.xpath("//*[text()='Recover Your Account']")).click();



                // To click on Account settings dropdown
                driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
                // To click on logout button
                driver.findElement(By.xpath("//text()[.='Log Out']/ancestor::span[1]")).click();
            }
        }
    }


