import java.util.Scanner;

public class PattersPattens {
    public static void patterns1(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void patterns2(int n){

         for(int i = 0; i<n; i++){
             for(int j = 0; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println();
         }

    }
     public static void patterns3(int n){
         for(int i = 0; i<n; i++){
             for(int j = 0; j<=i; j++){
                 System.out.print(j+1);
             }
             System.out.println();
         }
    }
     public static void patterns4(int n){
         for(int i = 1; i<=n; i++){
             for(int j = 1; j<=i; j++){
                 System.out.print(i);
             }
             System.out.println();
         }
    }
     public static void patterns5(int n){
         for(int i = 1; i<=n; i++){
             for(int j = 0; j<n-i+1; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
     public static void patterns6(int n){
         for(int i = 1; i<=n; i++){
             for(int j = 0; j<n-i+1; j++){
                 System.out.print(j+1);
             }
             System.out.println();
         }
    }
     public static void patterns7(int n){
         for(int i = 0; i<n; i++){
             for(int j = 0; j<n-i-1; j++){
                 System.out.print(" ");
             }
             for(int k = 0; k< 2*i+1; k++){
                 System.out.print("*");
             }
             for(int j = 0; j<n-i-1; j++){
                 System.out.print(" ");
             }
             System.out.println();

         }
    }
     public static void patterns8(int n){
            for(int i = 0; i<n;i++){
                for(int j = 0; j<i; j++){
                    System.out.print(" ");
                }
                for(int k = 0; k < (2*n-(2*i+1)); k++){
                    System.out.print("*");
                    }
                for(int j = 0; j<i; j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
    }
     public static void patterns9(int n){
         patterns7(n);
         patterns8(n);


    }
     public static void patterns10(int n){

        for(int i = 1; i<=2*n-1; i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            for(int j=1;j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void patterns11(int n) {
         int start = 1;
         for (int i = 0; i < n; i++) {
             if (i % 2 == 0) {
                 start = 1;
             } else {
                 start = 0;
             }

             for (int j = 0; j <= i; j++) {
                 System.out.print(start);
                 start = 1 - start;
             }
             System.out.println();


    }
    }
     public static void patterns12(int n){
        int space = 2*(n-1);
        for(int i = 1;i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
     public static void patterns13(int n){
        int num = 1;
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
     public static void patterns14(int n){

        for(int i =0; i<n; i++){
            for(char j = 'A'; j <= 'A'+i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
     public static void patterns15(int n){

         for(int i =0; i<n; i++){
             for(char j = 'A'; j <= 'A'+(n-i-1); j++){
                 System.out.print(j+" ");
             }
             System.out.println();
         }
    }
     public static void patterns16(int n){

         for(int i =0; i<n; i++){
             int ch = ('A')+i;
             for(int j = 0; j<=i; j++){
                 System.out.print((char)ch+" ");
             }
             System.out.println();
         }
    }
     public static void patterns17(int n){

        for(int i = 0; i< n; i++){
            int stop = (2*i-1)/2;
            for(int j = 0 ; j< n-i-1; j++){
                System.out.print(" ");

            }
            char ch = 'A';
            for(int j = 0; j<(2*i+1); j++){
                System.out.print(ch);
                if(j<= stop){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j = 0 ; j< n-i-1; j++){
                System.out.print(" ");

            }
            System.out.println();


        }
    }
     public static void patterns18(int n){
            for(int i = 0; i<n; i++){
                for(char ch = (char) ('E'-i); ch<='E'; ch++){//casting to char
                    System.out.print(ch);
                }
                System.out.println();
            }
    }
     public static void patterns19(int n){
        int insp =0;
            for(int i = 0; i<n; i++){
                for(int j = 1; j <= n-i; j++){
                    System.out.print("*");
                }

                for(int j = 0; j<insp; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= n-i; j++){
                    System.out.print("*");
                }
                insp+=2;
                System.out.println();
            }
            insp = 2*n-2;
            for(int i = 1; i<=n; i++){

                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j = 0; j< insp; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                insp-=2;
                System.out.println();
            }
    }
     public static void patterns20(int n){

        int insp = 2*n-2;
        for(int i = 1; i<=2*n-1; i++){
            int stars = i;
            if(i>n){
                stars = (2*n-i);
            }
            for(int j = 1; j<=stars; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=insp; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n){
                insp -=2;
            }
            else{
                insp+=2;
            }

        }
    }
     public static void patterns21(int n){

        for(int i =0; i<n; i++ ){
            for(int j = 0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
         }
    }

    
     public static void patterns22(int n){

        for(int i=0;i<2*n-1;i++){
         
         // inner loop for no. of columns.
         for(int j=0;j<2*n-1;j++){
             
             // Initialising the top, down, left and right indices of a cell.
             int top = i;
             int bottom = j;
             int right = (2*n - 2) - j;
             int left = (2*n - 2) - i;
             
             // Min of 4 directions and then we subtract from n
             // because previously we would get a pattern whose border
             // has 0's, but we want with border N's and then decrease inside.
             System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
         }
         
         // As soon as the numbers for each iteration are printed, we move to the
         // next row and give a line break otherwise all numbers
         // would get printed in 1 line.
         System.out.println();
      }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        n = sc.nextInt();
        System.out.println("Enter pattern no. ");
        int x = sc.nextInt();
        switch (x) {

            case 1:
                patterns1(n);
                break;

            case 2:
                patterns2(n);
                break;

            case 3:
                patterns3(n);
                break;

            case 4:
                patterns4(n);
                break;

            case 5:
                patterns5(n);
                break;

            case 6:
                patterns6(n);
                break;

            case 7:
                patterns7(n);
                break;

            case 8:
                patterns8(n);
                break;

            case 9:
                patterns9(n);
                break;

            case 10:
                patterns10(n);
                break;

            case 11:
                patterns11(n);
                break;

            case 12:
                patterns12(n);
                break;

            case 13:
                patterns13(n);
                break;

            case 14:
                patterns14(n);
                break;

            case 15:
                patterns15(n);
                break;

            case 16:
                patterns16(n);
                break;

            case 17:
                patterns17(n);
                break;

            case 18:
                patterns18(n);
                break;

            case 19:
                patterns19(n);
                break;

            case 20:
                patterns20(n);
                break;

            case 21:
                patterns21(n);
                break;

            case 22:
                patterns22(n);
                break;

            default:
                System.out.println("Invalid input");
        }

    }
}
