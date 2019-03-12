/**
 * 
 */
package javaPreparations;

/**
 * @author Praveenkumar.S
 *
 */
public class HelloWorld{

    public static void main(String []args){
        
        
       int[] horses = {3,0,5,4,4,4};

       int temp = 0;
       for(int i =0; i< horses.length; i++){
           if(horses[i] > temp){
               temp = horses[i];
           }
       }
       int[] sum = new int[temp+1];
       int count = 0;
       for(int i =1; i<= temp; i++){
           for(int j =0; j< horses.length; j++){
               if(horses[j] >= i) {
                   count++;
               }
           }
           sum[i-1] = count*i;
           count = 0;
       }
       System.out.println(sum);
       int temp1 = 0;
       for(int i =0; i< temp+1; i++){
           if(sum[i] > temp1){
               temp1 = sum[i];
           }
       }
       
       System.out.println(temp1);
    }
}
