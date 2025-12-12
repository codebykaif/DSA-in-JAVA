import java.util.*;

public class twodarrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number");

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }
    }
}

Print Row-wise
public class twodarray{
    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6}};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j] + " ");
                }
                System.out.println();
        }
    }
}

print column-wise
public class twodarray{
    public static void main(String[] args){
        int[][] a= {{1,2,3}, {4,5,6}};

        for(int col = 0; col< a[0].length; col++){
            for(int row=0; row<a.length; row++){
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}

Search an element

import java.util.*;

public class twodarrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number");

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }
    }
}

Print Row-wise
public class twodarray{
    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6}};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j] + " ");
                }
                System.out.println();
        }
    }
}

print column-wise
public class twodarray{
    public static void main(String[] args){
        int[][] a= {{1,2,3}, {4,5,6}};

        for(int col = 0; col< a[0].length; col++){
            for(int row=0; row<a.length; row++){
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}

//Search an element
public class twodarray {
    public static void main(String[] args){
        int[][] a = {{2,4,6}, {8,10,12}};
        int target = 10;
        
        boolean found = false;
        int row = -1, col = -1;

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j] == target){
                    found = true;
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        if(found){
            System.out.print("found at cell : (" + row + " ," + col + ")");
        }else{
            System.out.println("Not found");
        }
    }
    
}

 Count total element

public class twodarray {

    public static void main(String[] args){
        int[][] a = {{1,2,3,4,5,6,0},{3,4,5},{3,4,6,8,4,34}};
        System.out.println(a.length * a[0].length);
    }
}

Sum of all element
public class twodarray {

    public static void main(String[] args){
        int[][] a = {{1,2,3,8},{4,5,6,8}};

        int sum = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                sum += a[i][j];
            }
        }
        System.out.println(sum + " Total sum of  2 D Arrays");
    }
}

Maximum element
public class twodarray {

    public static void main(String[] args){
        int[][]  a = {{3,6},{1,78263535}};

        int max = Integer.MIN_VALUE;
        for(int[] row : a){
            for(int val : row){
                max = Math.max(max , val);
            }
        }
        System.out.println(max);
    }
}

public class twodarray {
    public static void main(String[] args){
        int[][] a = {{3,83,5,3},{5,6,3,5,2}};

        int min = Integer.MAX_VALUE;

        for(int[] row : a){
            for(int val : row){
                min = Math.min(min,val);
            }
        }
        System.out.println(min);
    }
}

Row wise Sum
public class twodarray {

    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6}};
            int sum = 0;
        for(int i=0; i<a.length; i++){
            
            for(int j=0; j<a[0].length; j++){
                sum += a[i][j];
            }
            System.out.println("Row" + i + "sum = " + sum);
        }
    }
}

Column wise sum
public class twodarray {

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};

        for(int col = 0; col<a[0].length; col++){
            int sum = 0;
            for(int row = 0; row< a.length; row++){
                sum += a[row][col];
            }
            System.out.println("Column " + col + "Sum = " + sum);
        }
    }
}

 Revers each row 
public class twodarray {

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};

        for(int i=0; i<a.length; i++){
            int l = 0, r = a[0].length -1;
            while(l < r){
                int temp = a[i][l];
                a[i][l] = a[i][r];
                a[i][r] = temp ;
                l++; r--;
            }
        }
        for(int[] row : a){
            for(int x : row)
                System.out.print(x + " ");
        }
    }
}

Transport of matrix

public class twodarray {

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        int  n = a.length, m = a[0].length;

        int[][] t = new int [m][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                t[j][i] = a[i][j];
            }
        }
        for(int[] row : t){
            for(int x : row)
                System.out.print(x + "");
            System.out.println();
        }
    }
}

Rotat matrix 90 (clockwise)public class twodarray {
public class twodarray {

    
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        // transpose
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a[0].length; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // reverse each row
        for(int i=0; i<a.length; i++){
            int l = 0, r = a[0].length - 1;
            while(l < r){
                int t = a[i][l];
                a[i][l] = a[i][r];
                a[i][r] = t;
                l++; r--;
            }
        }

        // print matrix
        for(int[] row : a){
            for(int x : row){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

}

print prime diagonal

public class twodarray {

    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<a.length; i++){
            System.out.println(a[i][i]);
        }
    }
}

print secondary diagonal

public class twodarray {

    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int n = a.length;
        for(int i=0; i<n; i++){
            System.out.println(a[i][n-i-1] + " ");
        }
    }
}

// check Symmetric Matrix (A == transpose(A))
public class twodarray {

    public static void main(String[] args){
        int[][] a = {
            {1,2,3},
            {2,5,6},
            {6,6,9}
        };
        boolean Symmetric = true;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j] != a[j][i]){
                    Symmetric = false;
                    break;
                }
            }
        }
        System.out.println(Symmetric ? "Symmetric" : "Not Symmetric");
        }
    }
