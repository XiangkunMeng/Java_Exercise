package test_1;

/**
 * Created by mxk94 on 2017/3/17.
 */
class super_A{
    super_A(){
        System.out.println("Inside A class");
    }
}
class super_B extends super_A{
    super_B(){
        System.out.println("Inside B class");
    }
}
class super_C extends super_B{
    super_C(){
        System.out.println("Inside C class");
    }
}
public class super_ {
    public static void main(String args[]){
        super_C sC=new super_C();
        super_A sA= new super_A();
        System.out.println(sC.toString());
        System.out.println("MAIN EXIT!");
    }
}
