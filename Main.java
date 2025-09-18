public class Main{
    /**
     * @param args
     */
    public static void main(String[]args){
        int a=5,b=20,c=15;
        int max;

    if(a>b){
        if(a>c){
            max=a;
        }else{
            max=c;
        }
        }
     else{
            if(b>c){
                max=b;
            }else{
                max=c;
            }
        }
    
    System.out.println("Maximum value is: "+max);
    }
}