package Ex19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Nguyen Trong Thuan 
 * date: 29/08/2016 
 * version : 1.0
 * -------------------------- 
 * create main to run application
 */

public class mainStore {
	/**
	 * function check the choice of client have continue, output: if yes return 1
	 * 
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static int checkChoice() throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out
				.print("Do you want continue buy item ?[press 1 is yes and press 2 is no]: ");
		int check = Integer.parseInt(input.readLine());
		if (check != 1 && check != 2)
			throw new ArithmeticException("The choice is not valid!");
		return check;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			ATMCard atm = new ATMCard("atm1285", 1000000000);
			CreditCard credit = new CreditCard("cre1285", "31/12/2020", 1000000000, "money");
			int check = 1;
			ArrayList<DetailOrder> arrDetailOrder = new ArrayList<>();
			while (check == 1) {
				System.out
						.println("-------------------------------------------");
				System.out.println("This is list product in my store: ");
				System.out.println("1. Iphone 6s plus - price: 20000000 vnd [press 1]");
				System.out.println("2. Samsung galaxy s7 - price: 18000000 vnd [press 2]");
				System.out.println("3. Sony Xperia Z5 - price: 18500000 vnd [press 3]");
				System.out.println("4. Lumia 950 - price: 10000000 vnd [press 4]");
				System.out.print("Please choice product do you want buy: ");
				int choice = Integer.parseInt(input.readLine());
				String nameItem = "";
				double price = 0;
				Product product = null;
				switch (choice) {
				case 1: {
					nameItem = product.IPHONE.getName();
					price = product.IPHONE.getPrice();
				}
					break;
				case 2: {
					nameItem = product.SAMSUNG.getName();
					price = product.SAMSUNG.getPrice();
				}
					break;
				case 3: {
					nameItem = product.SONY.getName();
					price = product.SONY.getPrice();
				}
					break;
				case 4: {
					nameItem = product.LUMIA.getName();
					price = product.LUMIA.getPrice();
				}
					break;
				default:
					System.out.println("The choice is not valid!");
				}
				Item item = new Item(nameItem, price);
				System.out.print("Input amount of product do you want buy: ");
				int amount = Integer.parseInt(input.readLine());
				if (amount <= 0)
					throw new ArithmeticException("The amount is not valid!");
				DetailOrder detailOrder = new DetailOrder(amount, item);
				arrDetailOrder.add(detailOrder);
				System.out.println("Add item into cart successed!");
				System.out
						.println("-------------------------------------------");
				check = checkChoice();
			}
			System.out.println("-------------------------------------------");
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String date = df.format(new Date());
			System.out.println("Choice state of order: ");
			System.out.println("1. Just Order [press 1]");
			System.out.println("2. Paid [press 2]");
			System.out.println("3. Have receive [press 3]");
			int choiceState = Integer.parseInt(input.readLine());
			String state = "";
			switch (choiceState) {
			case 1:
				state = "Just order";
				break;
			case 2:
				state = "Have paid";
				break;
			case 3:
				state = "Have receive";
				break;
			default:
				System.out.println("Choice state is not valid!");
			}
			boolean exportOrder = true;
			System.out.print("Do you want export order ?[press 1 is yes and 2 is no]: ");
			int choiceExport = Integer.parseInt(input.readLine());
			if(choiceExport == 1){
				exportOrder = true;
			}else if(choiceExport == 2){
				exportOrder = false;
			}else{
				System.out.println("Choice export value is not valid!");
			}
			Order order =  new Order(date, exportOrder, state, arrDetailOrder);
			double sumMoney = order.sumMoney();
			System.out.println("-------------------------------------------");
			System.out.println("Input information of customer: ");
			System.out.print("1. Name: ");
			String name = input.readLine();
			System.out.print("2. Identity card: ");
			String identityCard = input.readLine();
			System.out.print("3. Address: ");
			String address = input.readLine();
			System.out.print("4. Phone: ");
			String phone = input.readLine();
			System.out.print("5. Email: ");
			String email = input.readLine();
			Customer customer = new Customer(address, email, identityCard,
					name, phone);
			System.out.println("Add new customer susscessed !");
			System.out.println("-------------------------------------------");
			System.out.println("Choice payment:");
			System.out.println("1. ATM");
			System.out.println("2. Credit card");
			int choicePayment = Integer.parseInt(input.readLine());
			if(choicePayment == 1){
				if(atm.getBalance() >= sumMoney){
					atm.calcBalance(sumMoney);
					atm.getAuthentication();
					System.out.println("Payment successed!");
					System.out.println("Balance of ATM: " + atm.getBalance());
				}else{
					System.out.println("Balance in ATM is not enough!");
				}
				
			}else if(choicePayment == 2){
				if(credit.getMaxDebt() >= sumMoney){
					credit.getAuthentication();
					System.out.println("Payment successed!");
				}else{
					System.out.println("Balance in ATM is not enough!");
				}
				
			}else{
				System.out.println("Choice payment valid is not valid!");
			}
			System.out.println("-------------------------------------------");
			System.out.println("THE RECIEPT INFORMATION");
			System.out.println("**************************************");
			System.out.println("Customer information:");
			customer.showInformationOfCustomer();
			System.out.println("**************************************");
			System.out.println("Detais in order: ");
			for(DetailOrder value : arrDetailOrder){
				System.out.println("**************************************");
				value.showInforDetailOder();
				System.out.println("**************************************");
			}
			System.out.println(String.format("Sum of pay: %.2f", sumMoney));
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}

	}

}
