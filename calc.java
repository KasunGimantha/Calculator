import java.util.Scanner;
public class calc{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
float sum=sc.nextFloat();
char op=sc.next().charAt(0);
float num=0;
while(op != '='){
num=sc.nextFloat();
switch(op){
case '+':sum=sum+num;break;
case '-':sum=sum-num;break;
case '*':sum=sum*num;break;
case '/':sum=sum/num;break;
default:System.out.println("invalid op");
}
op=sc.next().charAt(0);
}
System.out.println(sum);
}
}
