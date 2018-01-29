
import java.io.*;
class Date_of_birth 
{
	int age;
public void Accept()throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);

System.out.println("Enter Your Date of birth  only (yr) :: ");
age=Integer.parseInt(br.readLine());
}

public  int Calculate()throws IOException
{
Accept();	
int yr=2018-age;
return yr;
}

public  static void main(String args[])throws IOException
{
	Date_of_birth  obj=new Date_of_birth();
	int year=obj.Calculate();
	System.out.println(" Your Age Is :: "+year);
	
	
}

	
}


