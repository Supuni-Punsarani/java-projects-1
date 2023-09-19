class demo{

    public int add(int a,int b){ 
              int r=a+b;
              return r;

    }

}


public class objects{

    public static void main(String a[]){

              int num1=4;
              int num2=5;

              demo calc=new demo();  
              int result=calc.add(4,5);

              System.out.println(result);
    }
}