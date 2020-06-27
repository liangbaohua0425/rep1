import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class UtilsClass {
    @Test
    public void StringToDate() throws ParseException {
        String s = "1997-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }

    @Test
    public void DateToString(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
    }

    //产生一个3-9之间的随机数
    @Test
    public void getRandom(){
        //random的产生范围是0-1，强制转换为int会去除小数点后边的值
        int randomNum = (int)(Math.random()*7+3);
        System.out.println(randomNum);
    }

    @Test
    public void arrayTest(){
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.println(arr.get(3));
    }
}
