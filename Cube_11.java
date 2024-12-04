import java.util.Scanner;
public class Cube_11 {
        static int calculateArea (int s) {
            int area = 6*s*s;
            return area;
        }
        static int calculateVolume (int s) {
            int vol = s*s*s ;
            return vol;
        }
        public static void main(String[] args) {
            Scanner input11 = new Scanner (System.in);
            int s, L, vol;
            System.out.print("Input side = ");
            s = input11.nextInt();
    
            L = calculateArea(s);
            System.out.println("Area of the rectangle = " + L);
            vol = calculateVolume(s);
            System.out.println("Volume of the rectangle = " + vol);
        }
    }