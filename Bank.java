package firstProgram;

import java.util.Scanner;

class Account{
	
	protected String accName;
	protected String accNo;
	protected String bankName;
	
	
	public Account() {
		
	}


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public String getAccNo() {
		return accNo;
	}


	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public Account(String accName, String accNo, String bankName) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}
	protected void display() {
		System.out.println("Account Name: "+accName);
		System.out.println("Account Number: "+accNo);
		System.out.println("Bank Name: "+bankName);
	}
}
class CurrentAccount extends Account{
	
	private String tinNumber;
	
	public CurrentAccount() {
		
	}
	public CurrentAccount(String accName, String accNo, String bankName,String tinNumber) {
		super(accName,accNo,bankName);
		this.tinNumber = tinNumber;
		}
	public String getTinNumber() {
		return tinNumber;
	}
	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	public void display() {
		super.display();
		System.out.println("TIN Number: "+tinNumber);
	}
	
} 

class SavingAccount extends Account{
	private String orgName;
	public SavingAccount() {
	
	}
	public SavingAccount(String accName, String accNo, String bankName,String orgName) {
		super(accName,accNo,bankName);
		this.orgName = orgName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public void display() {
		super.display();
	System.out.println("Organization Name: "+orgName);
	}
	
}


public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account account  = null;
		System.out.println("Choose Account Type\r\n"+"1.Saving Account\r\n" + "2.Current Account\r\n");
		int choice = scan.nextInt();
		scan.nextLine();
		
		if(choice==1) {
			System.out.println("Enter the Account details in comma separated(Account Name,Account Number,Bank Name,Oganization Name");
			String s = scan.nextLine();
			String[] details = s.split(",");
		    account = new SavingAccount(details[0],details[1],details[2],details[3]);
			}
		else if(choice==2){
			System.out.println("Enter the Account details in comma separated(Account Name,Account Number,Bank Name,Tin Number");
			String s = scan.nextLine();
			String[] details = s.split(",");
			account = new CurrentAccount(details[0],details[1],details[2],details[3]);
		}
		account.display();


	}
	
}
