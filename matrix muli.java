import java.util.Scanner;
class Mmulti
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in); 
System.out.println("enter the rows:");
int r=input.nextInt(); 
System.out.println("enter the column:");
int c=input.nextInt(); 
int mat1[][]=new int[r][c]; 
 
int mat2[][]=new int[r][c]; 
System.out.println("Matrix A:");
for(int i=0;i<r;i++) 
{ 
    for(int j=0;j<c;j++) 
    { 
        mat1[i][j]=input.nextInt(); 
    } 
} 
System.out.println("Matrix B");
for(int i=0;i<r;i++) 
{ 
    for(int j=0;j<c;j++) 
    { 
        mat2[i][j]=input.nextInt(); 
    } 
} 
System.out.println("Matrix Multiplication");
int sum[][]=new int[r][c]; 
for(int i=0;i<r;i++) 
{ 
    for(int j=0;j<c;j++) 
    { 
        sum[i][j]=0; 
        for(int k=0;k<c;k++) 
        { 
            sum[i][j] = sum[i][j] +(mat1[i][k]*mat2[k][j]); 
        } 
        System.out.print(sum[i][j] + "\t"); 
    } 
    System.out.println();
}
}
}