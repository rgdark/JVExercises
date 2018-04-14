public class Addition {
int a;
int b;
int c;
void setData(int a1,int b1)
{
    a=a1;
    b=b1;
    c=a+b;
}
void showData()
{
    System.out.println("Sum of A & B is: "+c);
}
public static void main(String args[])
{
    Addition add=new Addition();
    add.setData(2,3);
    add.showData();
}
}
