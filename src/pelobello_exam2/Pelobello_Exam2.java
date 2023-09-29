
package pelobello_exam2;

import java.util.Scanner;


public class Pelobello_Exam2 {

   private static  DazzleArray list = new DazzleArray();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
       
      
       
        
        boolean menu = true;
        
        while (menu) { 
            
             
            System.out.println("1. Insert Names of the first 10 classmates");
            System.out.println("2. Display Classmates Name");
            System.out.println("3. Add Ms. Inday Mapanira products");
            System.out.println("4. Search Ms. Inday Mapanira products");
            System.out.println("5. Buy Ms. Inday Mapanira products");
            
            System.out.print("Enter your choice: ");
            int input = scan.nextInt();
            
            switch (input) {
                case 1:
                    System.out.print("Add Student Name: ");
                     String string = scan.nextLine();
                        string = scan.next();
                        list.add(string);
                    
                    break;
                    
                case 2: System.out.println(list);
                    
                    
                    break;
                     case 3: 
                         list.add("Fita");
                         list.add("Pride Powder");
                         list.add("Canola_oil");
                         list.add("Nescafe_Black_Coffee");
                         list.add("Ariel_Powder");
                         list.add("Rebisco");
                         list.add("Steelwoll");
                         list.add("Head_and_Shoulder");
                         list.add("Nova");
                         list.add("Tanduay");
                         list.add("Bear_Brand");
                         list.add("Nature_Spring");
                         list.add("Nature_Spring_Mineral_Water_8oz");
                         list.add("Coke_1ltr");
                         list.add("Sprite_Kasalo");
                         list.add("Royal_1ltr");
                         list.add("Sugar");
                        
                    
                    
                    break;
                     case 4:
                         System.out.println(list);
                         System.out.print("Search Product: ");
                         String search = scan.nextLine();
                         search = scan.next();
                         
                         
                         System.out.println(list.search(search));
                         
//                         System.out.println("1 Buy");
//                         int buy = scan.nextInt();
//                         if (buy ==1) {
//                             list.delete(search);
//                         }
                        
                         break;
                     case 5 : System.out.println(list);
                            
                                System.out.print("Enter you want to buy: ");
                                String buy = scan.nextLine();
                                buy = scan.next();
                                
                                list.delete(buy);
                                System.out.println(list);
                                break;
                    
                default:
                    System.out.println("Bye!");
                    scan.close();
                    menu = false;
            }
            
            
        }
    }
    private static class DazzleArray {
    int size;
    int capacity =1;
    Object []array;
    
    public DazzleArray(){
        this.array = new Object[capacity];  
    }
     public DazzleArray(int capacity){
         this.capacity = capacity;
        this.array = new Object[capacity];   
    }
     public void add (Object data){
         if (size >=capacity) {
             grow();
         }
         array[size]=data;
         size++;
     }
     public void insert (int index, Object data){
         if (size >= capacity) {
             grow();
         }
         for (int i =size; i > index;i--){
             array[i]= array[i - 1];
         }
         array[index] = data;
         size++;
     }
      public void delete (Object data){
         for (int i = 0; i <size;i++){
             if(array[i].equals(data)){
                 for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j]=array[i+ j + 1]; 
                 }
                 array[size - 1]=null;
                 size--;
                 if(size <=(int)(capacity/3)){
                     shrink();
                 }
                 break;
             }else{
                 System.out.println("Product to Buy Not Found!");
                        
             }
         }
     }
       public int search (Object data){
           for (int i = 0; i < size; i++) {
               if (array[i] == data) {
                    System.out.println("Available");
                   return i;
                  
               }
               
               
           }
         return -1;
     }
       private void grow(){
          
           int newCapacity = (int)(capacity * 2);
           Object[]newArray= new Object[newCapacity];
           for (int i = 0; i < size; i++) {
               newArray[i]=array[i];
           }
           capacity = newCapacity;
           array=newArray;
       }
         private void shrink(){
             int newCapacity = (int)(capacity / 2);
           Object[]newArray= new Object[newCapacity];
           for (int i = 0; i < size; i++) {
               newArray[i]=array[i];
           }
           capacity = newCapacity;
           array=newArray;
       }
         public boolean isEmpty(){
             return size == 0;
         }
        public String toString(){
            
            String string = "";
            for (int i = 0; i < capacity; i++) {
                string += array[i] + ", ";
            }
            if(string != ""){
                string ="[" +string.substring(0, string.length() -2)+"]" ;
            }
            return string;
        }
    }}

