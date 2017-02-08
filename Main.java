import java.util.Arrays;
import java.util.Scanner;

public class Main{

public static void main(String[] args) {
     int x;
     x = Integer.parseInt(args[0]);
   	
   		
   	Scanner input = new Scanner(System.in);
		
		
		int n = input.nextInt();

		int a[] = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = input.nextInt();
		}
       
      switch(x){

      case 1:
      CountSort c = new CountSort();
      c.Countsort(a);
        for(int k = 0;k<n;k++){
        System.out.println(a[k]);
      }
      break;

      case 2:
	  
		BucketSort b = new BucketSort();
		b.Bucketsort(a);
        for (int k = 0; k<n; k++){
           System.out.println(a[k]);
        }
        break;

       case 3:
	  
		RadixSort r = new RadixSort();
		r.Rsort(a,a.length);
        for (int k = 0; k<n; k++){
           System.out.println(a[k]);
        }
        break; 
    }

	}

}