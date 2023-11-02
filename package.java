package mypack1;
Class A
{
Void display()
{
System.out.println(“I’m class A”);
}
}

package mypack2;
import mypack1.*;
Class B
{
Public static void main(String args[])
{
A obj = new A();
A.display();
}
}
