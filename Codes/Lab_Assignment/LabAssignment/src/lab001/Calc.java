package lab001;

import java.util.Scanner;

public class Calc {

	private Client_Info[] appoinments;
	private int size;


	public Calc(int size) {
		super();
		this.appoinments = new Client_Info[size];
	}

	public void AddAppointment(int index, Client_Info A){
		if(index <= appoinments.length)
			{this.appoinments[index] = A;}
	}

	public Client_Info GetAppointment(int index){
		if(index <= appoinments.length)
			return appoinments[index];
		return null;
	}

	public void JobsByProgress(String date){
		for(int i=0; i < appoinments.length ; i++){
			if(appoinments[i].getDate() == date && (appoinments[i].getJobsStatus() == "complete" || appoinments[i].getJobsStatus() == "in progress"))
					{
				System.out.print(appoinments[i].showInfo());
			}
		}
	}
	
	public void JobsbyOwedAmount()
	{for(int i=0; i < appoinments.length; i++)
		{if(appoinments[i].getOwed()!=0)
			System.out.print(appoinments[i].showInfo());
		}
	}
	
	public void JobsByDate(String date){
		for(int i=0; i < appoinments.length ; i++){
			if(appoinments[i].getDate() == date){
				System.out.print(appoinments[i].showInfo());
			}
		}
	}

	public void getPayment()
		{Scanner input = new Scanner(System.in);
		 for(int i = 0 ; i < appoinments.length; i++)
			 
		 	{while(appoinments[i].getOwed() != 0)
		 		{System.out.println("Your owed amount is : " + appoinments[i].getOwed());
		 		 double payment = input.nextDouble();
		 		 if(payment > appoinments[i].getOwed())
		 			 System.out.println("Amount exceeds owed amount");
		 		 if(payment <= appoinments[i].getOwed())
		 			 {appoinments[i].setPaid(appoinments[i].getPaid() + payment);
		 		 	  appoinments[i].setOwed(appoinments[i].getTotalCost() - appoinments[i].getPaid());
		 		 	  System.out.println("The new owed amount is : " + appoinments[i].getOwed());
		 		}
		 	}
		}
	}

	public void jobsbyUserSpecification(String name)
	{for(int i = 0 ; i < appoinments.length; i++)
		{if(appoinments[i].getName().equals(name))
			System.out.print(appoinments[i].showInfo());
		}
	}


}
