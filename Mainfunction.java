import java.util.*;
class complex
{
  int real,imaginary;
  complex()
  {
    }
  complex(int realtemp,int imaginarytemp) 
  {
    real=realtemp;
    imaginary=imaginarytemp;
  }
  complex addcomplex(complex ip1,complex ip2)
  {
    complex temp=new complex();
    temp.real=ip1.real+ip2.real;
    temp.imaginary=ip1.imaginary+ip2.imaginary;
    return temp;
  }
}
class Mainfunction
{
 public static void main(String args[])
 {
   complex ip1=new complex(15,24);
   System.out.println("The Ist complex no. is defined as:"+ip1.real+"+i"+ip1.imaginary);
   complex ip2=new complex(3,7);
   System.out.println("The 2nd complex no. is defined as:"+ip2.real+"+i"+ip2.imaginary);
   complex result=new complex();
   result=result.addcomplex(ip1,ip2);
   System.out.println("The sum of complex no. is:"+result.real+"+i"+result.imaginary);
}
}



