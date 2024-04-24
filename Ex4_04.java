public class Ex4_04 {
    String title;
    String author;
}
public Ex4_04 (String t) {
    title = t; author= "작자미상";
}


public Ex4_04 (String t, String a ) {
    title = t; author= a;
}
    public static void main(String []args){
        Ex4_04 littlePrince =new Ex4_04(t:"어린왕자 ", a: "생택쥐페리 ");
        Ex4_04 loveStory =new Ex4_04(t:"춘향전");
    System.err.println(littlePrince.title +""+littlePrince.author);
    System.err.println(loveStory.title +""+loveStory.author);
    
    
    
    }
