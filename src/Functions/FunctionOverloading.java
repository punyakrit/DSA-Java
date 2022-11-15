package Functions;
//  function overloading using parameters
public class FunctionOverloading {
    public static int sum(int a , int b){
        int sum= a+b;
        return sum;

    }

    public static int sum(int a , int b , int c){
        int sum= a+b +c;
        return sum;
}

    public static void main(String[] args) {
        int a = 1;
        int b =3;
        int c =5;
        int su=sum(a,b);
        System.out.println(su);
    }
}
