public class Conditonal {
    public static void main(String[] args) {
        int sal=25000;
        if(sal>10000){
            sal=sal+1000;
        }
        else if(sal>20000){
            sal+=2000;
        }
        else{
            sal+=3000;
        }
        System.out.println(sal);
    }
}