
// A 

// public class method {

//     public static void main(String[] args){
//         for(int i=0; i<6; i++){
//             for(int j=0; j<= 6; j++){
//                 if((j == 0 || j == 6) && i != 0 || (i == 0 && j > 0 && j < 6 || ( i == 3)))
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// B 

// public class method {

//     public static void main(String[] args){
//         for(int i=0; i< 7; i++){
//             for(int j=0; j<5; j++){
//                 if(j ==0 || (j == 4 && (i != 0 && i != 3 && i != 6)) || ((i == 0 || i ==  3 || i == 6) && j <4))
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {
//     public static void e_pattern(int row1, int col){
//         for(int i = 0; i < row1; i++){
//             for(int j = 0; j < col; j++){
//                 if((i == 0 || i == row1 - 1) && j > 0 || (j == 0 && i > 0 && i < row1 - 1) || (i == row1/2))
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args){
//         e_pattern(5, 5);
//     }
// }


// public class pattern{
//     public static void e_patter(int num1, int num2){
//         for(int i=0; i<num1; i++){
//             for(int j = 0; j<num2; j++){
//                 if((i == 0 || i == num1-1) && j > 0 && j < num2-1 || (j == 0 && i <num1-1))
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         e_patter(5, 5);
//     }
// // }

// B

// public class pattern {
//     public static void c_pattern(int num1, int num2) {
//         for (int i = 0; i < num1; i++) {
//             for (int j = 0; j < num2; j++) {
//                 if (((i == 0 || i == num1 - 1) && j > 0 && j < num2 - 1)   // top & bottom open from right
//                     || (j == 0 && i > 0 && i < num1 - 1))                 // left vertical line
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         c_pattern(5, 5);
//     }
// // }

// D

// public class pattern {

//     public static void D_pattern(int row, int col ){
//         for(int i=0; i<row; i++){
//             for(int j =0; j<col; j++){
//                 if(j == 0 || (j == 4 && i != 0 && i != 6 || ((i == 0 || i == 6) && j < 4)))
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         D_pattern(7, 5);
//     }
// }

// E 

// public class pattern {

//     public static void E_pattern(int row, int col){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if( j ==0 || i == 0 || i == 3 || i == 6)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         E_pattern(7, 5);
//     }
// }


// public class pattern {

//     public static void F_patter(int row, int col){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(j==0 || i == 0 || i == 3)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         F_patter(6, 5);
//     }
// }

// G 

// public class pattern {
//     public static void G_pattern(int row, int col){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if((i == 0 || i == 6) && j > 0 && j < 4 || (j == 0 && i > 0 && i < 6) || (j == 4 && i >= 3 && i < 6) || ( i == 3 && j >- 1))
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }   
//     public static void main(String[] args){
//         G_pattern(7, 5);
//     }
// }

// H 

// public class pattern {

//     public static void H_pattern(int row , int col){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(j == 0 || j == 4 || i == 3)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         H_pattern(7, 5);
//     }
// }

//I 

// public class pattern {

//     public static void J_pattern(int row, int col){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(i == 0 || i == 6 || j == 2)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         J_pattern(7, 5);
//     }
// }

// J

// public class pattern {

//     public static void J_pattern(int row , int col){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(i == 0 || j == 2 || (i == 6 &&  j <2 ) || (j == 0 && i > 4))
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         J_pattern(7, 6);
//     }
// }

// K 

// public class pattern {

//     public static void K_pattern(int row, int col){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(j==0 || j == i-1 && i >= 3 || j == 5-i && i <= 3)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         K_pattern(7, 6);
//     }
// }

// public class pattern {

//     public static void L_pattern(int row, int col ){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(j == 0 || i == 6)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         L_pattern(7, 5);
//     }
// }

// M 

// public class pattern {

//     public static void M_pattern(int row, int col){
//         for(int i=0; i<=row; i++){
//             for(int j=0; j<=col; j++){
//                 if(j == 0 || j == 7 || (i == j && i <= 3) || (i + j == 7 && i <= 3 ))
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         M_pattern(7, 7);
//     }
// }

//  N

public class pattern {

    public static void N_pattern(int row, int col){
        for(int i=0; i<7; i++){
            for(int j =0; j <7; j++){
                if(j == 0 || j == 6 || i == j)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        
    }
}