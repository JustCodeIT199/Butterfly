public class OperatorAssign {
    public static void main(String[] args) {
       int x,y,z;
       x=y=z=2;
       x+=y;
       y-=z;
       z/=(x+y);
       System.out.println(x);
       System.out.println(y);
       System.out.print(z);

       // int x=9 , y=12;
        //int a=2 , b=4 , c=6;
        //int exp= 4/3*(x+34)+9*(a+b*c)+(3+y*(2+a))/(a+b*y);
       // System.out.println(exp);
    }

}
