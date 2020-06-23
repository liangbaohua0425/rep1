public class OutInClass {
    public static void main(String[] args) {
        OutClass oc = new OutClass();

        OutClass.InClass a = oc.new InClass();
        a.showSys();
    }
}

class OutClass{

    int a = 10;
    int b = new InClass().a+10;

    class InClass{
        int a = 20;

        public void showSys(){
            System.out.println(a);
            System.out.println(OutClass.this.a);
            System.out.println(b);
        }
    }
}
