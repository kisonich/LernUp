package DZ2;

public class DZ2_2 {
    public static void main(String[] args) {
        roots(1,12,36);
        roots(1,-4,3);
    }

   static void roots(int a, int b, int c){
        double d=(b*b)-(4*a*c);
        float e=0;
        float f=0;

        if(d==0){
            e=-1*(b/(2*a));
            System.out.println("Уравнеие имеет 1 квадратный корень, который равен "+e);
        }
        else {
            if(d>0){
                e=((-1*b)+(float)Math.sqrt(d))/(2*a);
                f=((-1*b)-(float)Math.sqrt(d))/(2*a);
                System.out.println("Уравнение имеет 2 квадратных корня: "+e+" и " +f);
            }
            else {
                System.out.println("Уравнение не имеет квадратных корней");
            }
        }
    }
}
// 2) Вспомним школу - написать программу для решения квадратного уравнения)
//Коэффициенты задаются в виде переменных.