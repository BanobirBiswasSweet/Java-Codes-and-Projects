package ticketReservation;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

	public class Info {

		private  String name;
		private String phone;
		private String email;
		private String pass;
		private String con_Pass;

		private int count;
		
		public Info(){
			
		}
		
		public Info(String name, String phone, String email, String pass, String con_Pass){

			this.name=name;
			this.phone=phone;
			this.email=email;
			this.pass=pass;
			this.con_Pass=con_Pass;
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		public String getPass() {
			return pass;
		}
		public void setPassword(String pass) {
			this.pass = pass;
		}
		
		public String getConPass() {
			return con_Pass;
		}
		public void setConPass(String con_Pass) {
			this.con_Pass=con_Pass;
		}
		
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}

		
		public Info[] getFileInfo(){
			
			File file=new File("info.txt");
			Info[] IC=new Info[1000];
			int i=0;
			try{
					Scanner scan=new Scanner(file);
					while(scan.hasNextLine()==true){
						
						name=scan.nextLine();
						phone=scan.nextLine();
						email=scan.nextLine();
						pass=scan.nextLine();
						con_Pass=scan.nextLine();
						
						IC[i]= new Info(name, phone, email, pass, con_Pass);
						i++;			
					}
					count=i;
					
					scan.close();	
				
			}
			catch(Exception e){
				System.out.println("Problem while getting info from file");
			}
		
			return IC;
			
		}
		
		
		public void fileWrite(Info[] info,int count){
			File file=new File("info.txt");
			Info b=new Info();
			try{
				
				
				FileWriter fw = new FileWriter(file,false);
				
				
				for(int i=0;i<count;i++){
					if(i>0){
						
						fw.write("\n");
					}
					fw.write(info[i].getName()+"\n");
					fw.write(info[i].getPhone()+"\n");
					fw.write(info[i].getEmail()+"\n");
					fw.write(info[i].getPass()+"\n");
					fw.write(info[i].getConPass()+"\n");
					
				}
				
				fw.close();
			}
				catch(Exception x){
					System.out.println("Problem with writing into file");
				}
			
		}

}
