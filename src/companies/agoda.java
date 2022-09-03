package companies;


import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
// Main class should be named 'Solution'
class agoda {
    public static void main(String[] args) {
           PriceCalculator calculator = new PriceCalculator();
            //price for hotel id = 11 for 1 guest is 200$, 2 => 300$, 3 => 300$, book 2 guests pays 200$
            calculator.setPrice("1:200,2:300,3:400");
            System.out.println("price for 2 adult should be 300 = " + calculator.getPrice(2));
          
            System.out.println("");   
            
            //price for hotel id = 22 for 4 guest not defined, use next level which us 5 guests (not price for 6 guests)
            calculator.setPrice("1:200,3:300,5:500,6:600");
            System.out.println("price for 4 adult should be 500 = " + calculator.getPrice(4));            
    }
}
class PriceCalculator
{   HashMap<Integer,Double> hm =new HashMap<>();
        //define your collections
    public void setPrice(String pricePerGuestMappingStr) {
        String[] pricePerGuestList = pricePerGuestMappingStr.split(",");
            for (String priceInfoStr : pricePerGuestList) 
            { 
                var priceInfo = priceInfoStr.split(":");
                var numberOfGuest = Integer.parseInt(priceInfo[0]);
                var price = Double.parseDouble(priceInfo[1]);
               
                //write your logic here
                hm.put(numberOfGuest,price);
                 System.out.println("adult " + numberOfGuest +  "->" + price);   
            }
        }
    
    public double getPrice(int numGuest)
    {double finalPrice = -1;
    int i=0;
    int[] valid =new int[hm.size()];
    for(int n: hm.keySet()) {
    	
    	valid[i]=n;
    	i++;
    }
    System.out.println(Arrays.toString(valid));
    Arrays.sort(valid);
    
      //write your logic here
      if(hm.containsKey(numGuest)) { //return finalprice
          finalPrice=hm.get(numGuest);
      }
      else{
       //   int k=0;
          for(int n:valid){
              System.out.println(n); 
              if(n>numGuest){
                //  k=n;
                    finalPrice=hm.get(n);
                    break;
              }
              
          }
        
      }
      
      return finalPrice;
    }
}
