import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.my.pojo.MyExcelPojo;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import sun.reflect.Reflection;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcelTest {

    @Test
    public void WriteTest() throws Exception {
        List<MyExcelPojo> list = new ArrayList<MyExcelPojo>();
        MyExcelPojo myExcelPojo = new MyExcelPojo();
        myExcelPojo.setName("张三");
        myExcelPojo.setSchool("什么大学");
        myExcelPojo.setAge(18);
        list.add(myExcelPojo);

        MyExcelPojo myExcelPojo1 = new MyExcelPojo();
        myExcelPojo1.setName("李四");
        myExcelPojo1.setSchool("港区大学");
        myExcelPojo1.setAge(15);
        list.add(myExcelPojo1);

        Workbook sheets = ExcelExportUtil.exportExcel(new ExportParams("叫什么标题呢", "练习的工作簿"), MyExcelPojo.class, list);
        sheets.write(new FileOutputStream("H:\\70java\\test.xls"));
        sheets.close();
    }

    @Test
    public void BigDataTest() throws Exception {
        List<MyExcelPojo> list = new ArrayList<MyExcelPojo>();
        for (int i = 0; i < 100000; i++) {
            MyExcelPojo myExcelPojo = new MyExcelPojo();
            myExcelPojo.setName(i + "");
            list.add(myExcelPojo);
        }

        Long start = System.currentTimeMillis();
        Workbook sheets = ExcelExportUtil.exportBigExcel(new ExportParams("大数据的导入", "大数据的工作簿"), MyExcelPojo.class, list);
        sheets.write(new FileOutputStream("H:\\70java\\bigDataTest.xls"));
        sheets.close();
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void ReadTest() {
        ImportParams importParams = new ImportParams();
        importParams.setTitleRows(1);
        importParams.setHeadRows(1);

        List<MyExcelPojo> list = ExcelImportUtil.importExcel(new File("H:\\70java\\test.xls"), MyExcelPojo.class, importParams);

        System.out.println(ReflectionToStringBuilder.toString(list.toString()));
    }

    @Test
    public void ReadBigTest(){
        ImportParams importParams = new ImportParams();
        importParams.setTitleRows(1);
        importParams.setHeadRows(1);

        List<MyExcelPojo> list = ExcelImportUtil.importExcel(new File("H:\\70java\\bigDataTest.xls"), MyExcelPojo.class, importParams);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + list.get(i).toString());
        }
    }
}
