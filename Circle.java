
package problem_solving;


public class Circle extends Shape{
    
//    double r;
    Circle(double r){
        super(r,r);
    }
  
    @Override
    void area(){
    double sum = Math.PI*height*weight;
        System.out.println("The area of circle: "+sum);
    
    }
}
