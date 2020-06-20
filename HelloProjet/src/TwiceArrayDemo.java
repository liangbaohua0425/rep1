import org.junit.Test;

import java.util.Arrays;

public class TwiceArrayDemo {

    @Test
    public void twiceArrDemo01(){
        //静态创建一个二维数组
        int [][] twiceArr = new int [][]{{1,1,1},{2,2,2},{3,3,3}};

        //获取的是二维数组的组数
        System.out.println(twiceArr.length);
        System.out.println(twiceArr);
        System.out.println(twiceArr[0]);
        System.out.println(twiceArr[0].length);
        System.out.println(Arrays.toString(twiceArr[0]));
        System.out.println(Arrays.toString(twiceArr));
    }

    @Test
    public void twiceArrDemo02(){
        //静态创建一个二维数组
        int [][] twiceArr = new int [][]{{1,1,1},{2,2,2},{3,3,3}};

        //遍历二维数组
        for (int i = 0; i < twiceArr.length; i++) {
            for (int j = 0; j < twiceArr[i].length; j++) {
                System.out.println(twiceArr[i][j]);
            }
        }
    }

    @Test
    public void twiceArrDemo03(){
        //静态创建一个二维数组
        int [][] twiceArr = new int [][]{{1,1,1},{2,2,2},{3,3,3}};

        //遍历二维数组
        for (int i = 0; i < twiceArr.length; i++) {
            System.out.println(twiceArr[i]);
        }

        System.out.println("---------------------------------");
        //增强for循环遍历二维数组
        for(int[] arr : twiceArr){
            for (int i : arr) {
                System.out.println(i);
            }
        }
    }
}

