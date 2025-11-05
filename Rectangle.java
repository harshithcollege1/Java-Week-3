public class Rectangle extends Shape{
    int a,b;
    Rectangle(int a ,int b){
        this.a = a;
        this.b = b;
    }
    void printArea(){
        System.out.println("Area of Rectangle :"+ a *b );
    }
}
