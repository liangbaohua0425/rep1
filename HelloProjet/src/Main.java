import org.junit.Test;

import java.util.ArrayList;

public class Main {

    @Test
    public void testHelloWrold() {
        ArrayList list = new ArrayList<String>();
        listAdd(list,"上");
        listAdd(list,"山");
        listAdd(list,"打");
        listAdd(list,"老");
        listAdd(list,"虎");
        listAdd(list,"吗");
        System.out.println("upload!");
    }

    public void listAdd(ArrayList<String> list,String obj){
        if(list.size() < 5){
            list.add(obj);
        }else{
            System.out.println("集合已经满了");
        }
    }

    @Test
    public void mulTest(){
        short s1 = 1;
        System.out.println(2<<3);
        System.out.println(3.4);
    }
}
