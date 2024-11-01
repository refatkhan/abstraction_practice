
package problem_solving;

public class Rectangle extends Shape {
    
        Rectangle(double height,double weight){
            super(height,weight);
        }
        @Override
        void area(){
            double sum = height*weight ;
            System.out.println("The area of rectangle is: "+ sum);
        }
}
