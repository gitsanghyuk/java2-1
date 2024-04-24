import java.util.Scanner;

class Rectgle {
 int width;
 int height;
 public int getArea() {
    return width*height;
 }   
}

public class RectApp{
    public static void main(String[]args){
        Rectgle rect =new Rectgle ();
        Scanner Scanner= new Scanner(System.in);
        System.out.print(s:">> ");
        rect.width = Scanner.nextInt();
        rect.height = Scanner.nextInt();
        System.err.println("사각형의 면적은 "+ rect.getArea());
        Scanner. close();
    }
}