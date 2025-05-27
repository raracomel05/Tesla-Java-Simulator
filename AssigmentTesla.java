/*
NAME: NURUL ULFAH MUZFIRAH BINTI MASRIAL 
CLASS: S2K2T4
MATRIC NUMBER : MS2323180652
ARRAY ASSIGMENT QUESTION: Write a program that accepts the number of salespersons in Tesla Automotive company, their names, and their yearly sales

1.Input the number of salespersons, their names, and yearly sales.
2.Display the highest and lowest yearly sales, along with:
    •Names of the salespersons
    •Their index locations
    •Total number of people who achieved those sales
3.Search by sales value:
    •Show matching names, index, and frequency
    •Display “Not Found” if no match
4.Search by name:
    •Show that person’s sales and index
    •Display “Not Found” if not in the list
*/

//Import Statement
import java.util.Scanner;

//Class Header
public class AssigmentTesla

{
        //Main Method Header
        public static void main(String[] args)
           { 
            //Creating input objects
            Scanner sc = new Scanner (System.in);
            Scanner name = new Scanner (System.in);
            
            
            //1st looping to read input- names[] and sales[]
            
            int numberOfSalesPersons; //Declare unknown number of salespersons
            
            //Read number of sales person 
            System.out.print("Please enter the number of salesperson (s) in your company: ");
            numberOfSalesPersons= sc.nextInt();
            
            System.out.println();
            
            String [] names = new String [numberOfSalesPersons];        //Declare and create array
            double [] sales = new double [numberOfSalesPersons];        //Declare and create array
        
                int i = 0; //I
                while (i < numberOfSalesPersons) //C
                 {
                    
                  System.out.print("\nPlease enter the salesperson's name : ");
                  names [i]= name.nextLine();
                
                  System.out.print("Please enter the sales :RM ");
                  sales [i]= sc.nextDouble();
                
                  System.out.println();
                
                  i=i +1; //U
                
                 }//end repeat 
                 
                 
                 //2nd Looping to print output- names[], sales[], index location
                 
                 System.out.println("No\tNAME\t\t\tSALES\t\tINDEX LOCATION");
                 System.out.println();
                    
                i = 0; //I
                while(i < numberOfSalesPersons) //C
                  {
                      
                  System.out.println(i+1+"\t"+names[i]+"\t\t\tRM "+sales[i]+"\t\t"+i);
                    
                  i = i+1; //U 
                 }//end repeat 
                 
                System.out.println();
                 
                
                //3rd Looping to find the highest sales and lowest sales
                  
                double highestSales= -999999;     //Assign with the lowest sales as the highest sales
                double lowestSales= 9999999;      //Assign with the highest sales as the lowest sales
                  
                i = 0; //I
                while (i< numberOfSalesPersons) //C
                  { 
                    if (sales[i] > highestSales)
                        highestSales = sales[i];
                    //end if
                    
                    if (sales[i] < lowestSales)
                        lowestSales = sales[i];
                    //end if
                    
                    i=i+1; //U
                  }//end repeat 
                  
                System.out.println();
                  
                  
                //4th looping to find the sales person names[] of salesperson (s) who got the highest sales and frequency of salesperson (s) who got the highest sales
                  
                System.out.println("\n-------THE HIGHEST SALES-------");
                System.out.println();
                System.out.println("The highest sales is RM "+highestSales);
                   
                int frequencyHighestSalesPerson = 0; //Keep track of the total salespersons who got the highest sales
                  
                i = 0; //I
                while(i < numberOfSalesPersons) //C
                  {
                     
                      if (sales[i] == highestSales)
                      {
                          
                        System.out.println("made by "+names[i]+ " at index location "+i);
                        frequencyHighestSalesPerson = frequencyHighestSalesPerson + 1 ;
                        
                      }// end if
                      
                  i = i+1; //U
                }//end repeat 
                
                System.out.println("\nThe number of salesperson (s) obtained the highest sales = "+frequencyHighestSalesPerson);
                System.out.println();
    
                
                //5th looping to find the sales person names[] of salesperson (s) who got the lowest sales and frequency of salesperson (s) who got the lowest sales
                 
                System.out.println("\n-------THE LOWEST SALES-------");
                System.out.println();
                System.out.println("The lowest sales is RM "+lowestSales);
                  
                int frequencyLowestSalesPerson = 0; //Keep track of the total salespersons who got the lowest sales
            
                i = 0;//I
                while(i < numberOfSalesPersons)//C
                  {
                      if (sales[i] == lowestSales)
                      {
                          
                        System.out.println("made by "+names[i]+ " at index location "+i);
                        frequencyLowestSalesPerson = frequencyLowestSalesPerson + 1 ;
                        
                  }// end if
                  
                  i = i+1; //U
                }// end repeat
                
                System.out.println("\nThe number of salesperson (s) obtained the lowest sales = "+ frequencyLowestSalesPerson);
                System.out.println();
                
                
                //6th looping to search sales person name
                
                System.out.println("\n-------LINEAR SEARCH: SEARCHING NAMES-------");
                System.out.println();
                
                String searchName;      //Declare search name
                
                int frequencySearchName = 0; //Name and initialize counter to keep track the frequency of found
                
                System.out.print("Please enter the name you intend to search: ");
                searchName = name.nextLine();   //Read search name
            
                i = 0; //I
                while(i < numberOfSalesPersons) //C
                  {
                      if (searchName.equals(names[i]))
                      {
                          
                       System.out.print("\nThe name you had searched for "+searchName+ " is FOUND at index "+i+ " made RM "+ sales[i] + " sales");
                       frequencySearchName = frequencySearchName + 1 ;
                       
                  }// end if
                  
                  i = i+1;//U
                }// end repeat
                
                System.out.print("\nThe name you had searched exist "+frequencySearchName+ " time(s)");
                
                
                        if(frequencySearchName == 0)
                           System.out.println("The name you had searched is NOT FOUND in the list above"); 
                        //end if 
                 System.out.println();       
                 System.out.println();        
                 
                        
                 //7th Looping is to search sales
                 
                 System.out.println("\n-------LINEAR SEARCH: SEARCHING SALES-------");
                 System.out.println();
                 
                 double searchSales;      //Declare search sales
                 int frequencySearchSales=0; //Name and initialize counter to keep track the frequency of found
                 
                 System.out.print("Please enter the sales you intend to search : RM ");
                 searchSales = sc.nextDouble();   //Read search sales
                 
                 i=0; //I
                 while(i < numberOfSalesPersons) //C
                 {
                     if (searchSales == sales[i])//U
                     {
                         
                     System.out.println("The sales you had searched RM "+searchSales+ " is FOUND at index "+i+ " made by "+names[i]);
                     frequencySearchSales = frequencySearchSales +1 ;
                     
                    } //end if 
                    
                    i = i+1; //U
                    }//end repeat
                    
                 System.out.print("\nThe sales you had searched exist "+frequencySearchSales+" time(s)");
                 System.out.println();
                
                 if(frequencySearchSales == 0)
                     System.out.println("The sales you had searched is NOT FOUND in the list above"); 
                 //end if  
                 
            }//End of Method Body
        }//End of Class Body    
            