import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
 int n=scan.nextInt();

 ArrayList a=new ArrayList();
 for(int i=0;i<n;i++) {

     int d=scan.nextInt();
     for(int j=0;j<d;j++){
     int po=scan.nextInt();
         a.add(po);
     }
a.add(-1);
 }
int q=scan.nextInt();
 for(int z=0;z<q;z++){
 int col=scan.nextInt();
int row=scan.nextInt();
int c=0;int r=0;
 Iterator l=a.iterator();
while(l.hasNext()){
    int o=(int)l.next();
if(o==-1){c++;r=0;}
  else  System.out.println(o+" "+c+"c"+r+"r");

r++;
 }

 }


    }


}