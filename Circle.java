public class Circle extends Shape{
    int a,b;
    Circle(int a){
        this.a = a;
    }
    void printArea(){
        System.out.println("Area of Circle :"+ 3.14*a *a );
    }
}
