public class Treugolnik {
    int a;
    int b;
    int c;
    public double area(){
        double s=(((a+b+c)/2)*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c));
        
        return Math.sqrt(s);
    }
    }


