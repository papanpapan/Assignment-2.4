import java.util.Scanner;


public class TestDemo {

	
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		
		
		
		if(a==0){
			System.out.println("You Have Entered Zero" + "\n");
					
				}
		if(a>0){
			System.out.println("You Have Entered Positive Number"+ "\n");
					
				}
		if(a<0){
			System.out.println("You Have Entered Negative  Number"+"\n");
					
				}
		
		
		
		System.out.println("Enter the student age:" + "\n");
		int age=s.nextInt();
		if( age<15){
			System.out.println("Your age is:"+age+"\n");
		}
			else{
				System.out.println("you are age is not match"+"\n");
			}
		
		
		
		
		System.out.println("Enter the student marks:");
		int marks=s.nextInt();
		
		if(marks>=70 & marks<=100 & age<15){
			System.out.println("Grade A"+"\n");
		}
		if(marks>60 & marks<=70 & age<15){
			System.out.println("Grade B"+"\n");
					
		}
		
		if(marks>=45 & marks<=60 & age<15){
			System.out.println("Grade C"+"\n");
					
		} 
		if(marks<45){
			System.out.println("The student is fail"+"\n");
		}
		


	}

}
