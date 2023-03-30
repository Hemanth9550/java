Skip to content
Search or jump to…
Pull requests
Issues
Codespaces
Marketplace
Explore
 
@Hemanth9550 
PraneethSaiKSSE
/
JAVA192111479
Public
Fork your own copy of PraneethSaiKSSE/JAVA192111479
Code
Issues
Pull requests
Actions
Projects
Security
Insights
JAVA192111479/ArrayAverage.java /
@PraneethSaiKSSE
PraneethSaiKSSE Add files via upload
Latest commit aed93d5 7 hours ago
 History
 1 contributor
27 lines (12 sloc)  462 Bytes

public class ArrayAverage {
 
    public static void main(String[] args) {
 
        
        int[] array = { 16,18,27,16,23,21,19 };
 
        
        int length = array.length;
 
        
        int sum = 0;
 
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
 
        double average = sum / length;
         
        System.out.println("Average of array : "+average);
 
    }
 
}

Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
JAVA192111479/ArrayAverage.java at main · PraneethSaiKSSE/JAVA192111479
