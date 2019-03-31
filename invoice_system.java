
package consumerstore;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsumerStore {

    static    Scanner reader = new Scanner (System.in);
    static    ArrayList<String> array = new ArrayList<String>();
    static String[] StrNameProducts = new String[]{"eggs","water","bananas","apples","paper"};
    static  int[] StrQuantityProducts = {0,0,0,0,0};
    static double[] StrPriceProducts = {1,2.4,3,3.3,2.4};
    public static void main(String[] args) {
        System.out.println("Please enter what do you want to buy");
           String str = null;
           
           while(!"done".equals(str)){
               array.add(str);
               str= reader.nextLine();
               
               for(int i=0; i<=4; i++){
                
                 if(str.equals(StrNameProducts[i])){
                    System.out.println("How many " + StrNameProducts[i]+ " do you want ?");
                    int quant= reader.nextInt();
                    StrQuantityProducts[i]=quant;
                    }
                  
             }
                 System.out.println("!If you dont something else type done!");   
                 System.out.println("If you want something else just type it "); 
               
           }
           
           System.out.println("---------------");
            System.out.println("enter adress");
            String address= reader.nextLine();
            
            System.out.println("enter name");
            String name = reader.nextLine();
            
            System.out.println("enter surname");
            String surname = reader.nextLine();
            System.out.println();
            System.out.println("Name:" + name +  "   Surname: " + surname +  "   Address " + address);
            for(int i=0; i<=4; i++){
                System.out.println("Product:" + "|" + StrNameProducts[i] + "|" + "Quantity:"+  "|" +StrQuantityProducts[i]);
            }
            double total=0;
            for(int i=0; i<=4; i++){
                total=total + StrPriceProducts[i]*StrQuantityProducts[i];
                }
            System.out.println("Total price is :" + total );
            System.out.println("pay now , type the money that you are giving");
            double paynow= reader.nextDouble();
            double temp=total-paynow;
            if(temp==0){
                System.out.println("Thank you for shopping");        
            }else{
               System.out.println("you own" + temp + " !please pay this! ");
            }
            
    }
    
}
