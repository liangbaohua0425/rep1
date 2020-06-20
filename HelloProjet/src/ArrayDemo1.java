import com.sun.corba.se.impl.oa.poa.POAPolicyMediatorImpl_NR_UDS;
import org.junit.Test;

import java.util.Arrays;

public class ArrayDemo1 {

    @Test
    public void array01(){
        //静态创建数组
        //int [] arr = new int [] {1,2,3};
        int [] arr = {1,2,3};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("-------------------------");

        char [] chars = {'*','1','2','3','中'};
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }

    @Test
    public void array02(){

        int a = 90;

        //动态创建数组
        int [] arr = new int [3];
        for (int i = 0; i < arr.length; i++) {
            a= a+1;
            arr[i] = a;
        }

        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序
    @Test
    public void array03(){

        //静态创建数组
        int [] arr = {90,100,10,20,5};

        //冒泡排序,一次选出来一个最大的或者最小的，每次进行比较的都是相邻位置的两个数
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0;j<arr.length-1-i;j++){//每次找出来的数据都存放内循环最终的位置
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //选择排序
    @Test
    public void array04(){

        //静态创建数组
        int [] arr = {90,100,10,20,5};

        //选择排序是每次选出来一个最大的或者最小的
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //二分查找，前提是有序的数组
    @Test
    public void array05(){

        //静态创建数组，要进行二分查找的数据必须是有序的
        int [] arr = {12,43,54,65,87,88,90,343};

        //创建两个变量，用来记录索引位置
        int left = 0;
        int right = arr.length-1;

        //比较的数据
        int num = 87;
        int index = -1;

        while(left < right){
            int mid = (left + right)/2;
            if(arr[mid] > num){
                right = mid;
            }else if(arr[mid] < num){
                left = mid;
            }else {
                index = mid;
                break;
            }
        }

        System.out.println(index);
    }

}
