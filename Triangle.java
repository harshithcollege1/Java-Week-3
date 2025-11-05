public class Triangle extends Shape{
    int a,b;
    Triangle(int a ,int b){
        this.a = a;
        this.b = b;
    }
    void printArea(){
        System.out.println("Area of Rectangle :"+ 0.5*a *b );
    }
}
