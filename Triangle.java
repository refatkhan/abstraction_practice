
package problem_solving;


public class Triangle extends Shape {
    
    Triangle(double height, double weight){
        super(height,weight);
    }
    @Override
    void area(){
        double sum =0.5* height*weight;
        System.out.println("The area of Triangle is: "+ sum);
    }
    
}
