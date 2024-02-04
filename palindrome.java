public class palindrome
{
public static void main(String[] args)
{
int a=10345, b=15951,c=7858;
System.out.println("A: "+a);
System.out.println("B: "+b);
System.out.println("C: "+c);

int d=a; 
int e=0;
int rev1=0;
while(d>0)
{
e = d%10;
rev1 = rev1 * 10 + e;
d = d/10;
}

if(rev1==a)
System.out.println(a+" Palindrome number");
else 
System.out.println(a+" Not a Palindrome number");

int f=b; 
int g=0;
int rev2=0;

while(f>0)
{
g = f%10;
rev2 = rev2 * 10 + g;
f = f/10;
}

if(rev2==b)
System.out.println(b+" Palindrome number");
else 
System.out.println(b+" Not a Palindrome number");


int h=c; 
int i=0;
int rev3=0;

while(h>0)
{
i = h%10;
rev3 = rev3 * 10 + i;
h = h/10;
}

if(rev3==c)
System.out.println(c+" Palindrome number");
else 
System.out.println(c+" Not a Palindrome number");


}
}