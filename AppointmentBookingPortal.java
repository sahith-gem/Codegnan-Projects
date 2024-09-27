package medicalStore;

import java.util.Scanner;

public class AppointmentBookingPortal extends person{
	Scanner scan = new Scanner(System.in);
	boolean choice=true;
	public static void main(String[] args) {
		AppointmentBookingPortal obj =new AppointmentBookingPortal();
		obj.selectTransaction();
	}
	 void selectTransaction() {
		
		while(choice) {
		System.out.println("welcome to the Appointment Booking Portal...");
		System.out.println("1.Book Appointment");
		System.out.println("2.Update previous Appointment");
		System.out.println("3.Display Appointment Details");
		System.out.println("4.cancel Appointment");
		System.out.println("5.Exit");
		System.out.println("select any option to continue with the transaction.");
		int option =scan.nextInt();
		person person1=new person();
		switch(option) {
		
		case 1:
			
			enterDetails( person1);
			
			break;
		case 2:
			
			modifyDetails(person1);
			
			break;
		case 3:
			displayDetails(person1);
			
			break;
		case 4:
			cancelAppointment(person1);
			break;
		case 5:
			System.out.println("Thank u For Reaching us ..");
			System.out.println("==========================");
			
			return;
		
		
		}	
		System.out.print("Do you wish to continue with the Application (true/false): ");
		choice=scan.nextBoolean();
	}
		
 }
	
}
class person{
	String name;
	int age;
	String timeInput;
	private int  id;
	int modifyId;
	int option;
	Scanner scan = new Scanner(System.in);
	
	void enterDetails(person person1)  {
		
		
		System.out.print("enter your name: ");
		this.name=scan.next();
		System.out.print("Enter your age: ");
		this.age=scan.nextInt();
		System.out.print("create an id with four length in the format of P***: ");
		id=scan.nextInt();
		System.out.print("Enter time to book your Appointment: ");
		this.timeInput=scan.next();
		
		
		
		System.out.println("thank you for booking an appointment at"+timeInput+" Be 15 min early to the destination");
		System.out.println("=========================================================");
		
		}
	void modifyDetails(person person1) {
		int count=3;
		
		do {
			
		System.out.println("Enter your id which you have created at the time of booking appointment: ");
		modifyId=scan.nextInt();
		
		
		if(modifyId==id) {
			System.out.println("1.Modify name");
			System.out.println("2.Modify age");
			System.out.println("3.Modify time of appointment");
			System.out.println("4.exit");
			System.out.println("please select an option to modify your details: ");
			option=scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter a new name: ");
				this.name=scan.next();
				System.out.println("Name modified Succesfully..");
				return;
			case 2:
				System.out.print("enter new age: ");
				this.age=scan.nextInt();
				System.out.println("Age modified Succesfully..");
				return;
			case 3:
				System.out.print("Enter new time-slot for booking an appointment: ");
				this.timeInput=scan.next();
				System.out.println("Time modified succesfulyy..");
				return;
			case 4:
				return;
			default:
				System.out.println("invalid option entry please choose a correct option");
			}
		
			
		}else {
			count--;
			System.out.println("invalid id try again,Remaining attempts: "+count);
		}
		}while(count>0);
		
		
			
	}
	void displayDetails(person person1) {
		System.out.println("Name: "+this.name+", "+"Age: "+this.age+" ,"+"Time of Appointment: "+timeInput);
		
	}
	void cancelAppointment(person person1) {
		System.out.print("enter your id: ");
		int modifyId=scan.nextInt();
		if(id==modifyId) {
			name=null;
			age=0;
			timeInput=null;
			System.out.println("you will receive a mail regarding your appointment cancellation shortly..");
		}else {
			System.out.println("please enter a valid pin !");
		}
		
	}
}
