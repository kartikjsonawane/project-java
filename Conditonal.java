public class Conditonal {
    public static void main(String[] args) {
        /*int sal=25000;
        if(sal>10000){
            sal=sal+1000;
        }
        else if(sal>20000){
            sal+=2000;
        }
        else{
            sal+=3000;
        }
        System.out.println(sal);*/
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" "+"*"+" ");
            }
            System.out.println(" ");
        }
        int i=5;
        while(i>=1){
            int j=1;
            while(j<=i){
                j++;
                System.out.print("*");
            }
            i--;
            System.out.println(" ");
        }
        int k=5;
        do{
            System.out.println(k);
            k--;
        }while(k>1);
    }
}