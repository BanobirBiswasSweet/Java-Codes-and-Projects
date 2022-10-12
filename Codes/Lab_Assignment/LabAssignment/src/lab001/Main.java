package lab001;

public class Main {

	public static void main(String[] args) {
		

	Client_Info A = new Client_Info("Sweet","Cantonment","01726362036","Thai Food", 5, "Cold Drinks",
			        "01/08/2015","9.00 PM","food service", 20000.0, 12000, "In Service.");

	Client_Info B = new Client_Info("Shuvro","Bosundhara","01845264121", "French", 3, "Sea Food",
			        "08/08/2015","10:00 PM","full service",30000.0, 19000, "Not in Service.");

	Calc C = new Calc(2);

	C.AddAppointment(0, A);
	C.AddAppointment(1, B);
	
	System.out.println(C.GetAppointment(0).showInfo());
	System.out.println(C.GetAppointment(1).showInfo());

	}

}
