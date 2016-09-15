package Ex27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class runContact {

	/**
	 * function check do you want continue
	 * 
	 * @return string is y or n
	 * @throws IOException
	 */
	public static String checkContinue() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		String check = input.readLine().toLowerCase();
		if (!check.equals("y") && !check.equals("n"))
			throw new ArithmeticException("The choice is not valid!");
		return check;
	}

	/**
	 * function show menu to user choice
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void showMenu() {
		System.out.println("++++++++++++++++ Menu +++++++++++++++++++");
		System.out.println("Press 1: View all Contacts");
		System.out.println("Press 2: Add new Contacts");
		System.out.println("Press 3: Search Contacts");
		System.out.println("Press 4: Remove Contacts");
		System.out.println("Press 5: Update Contacts");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}

	public static void deleteContact(int choice, ArrayList<Contact> arrContact) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Contact> temp = new ArrayList<>();
		switch (choice) {
		case 1: {
			System.out.print("Input name to remove: ");
			String name = input.readLine();
			String checkRemove = "n";
			for (Contact c : arrContact) {
				if (c.getName().equals(name)) {
					temp.add(c);
				}
			}
			for(Contact c : temp){
				c.show();
			}
			System.out
			.println("Do you want remove this contact? (y/n)");
			checkRemove = checkContinue();
			if (checkRemove.equals("y")) {
				arrContact.removeAll(temp);
				System.out.println("Remove Contacts completed!");
				
			}
		}
			break;
		case 2: {
			System.out.print("Input phone to remove: ");
			String phone = input.readLine();
			String checkRemove = "n";
			for (Contact c : arrContact) {
				if (c.getPhone().equals(phone)) {
					temp.add(c);
				}
			}
			for(Contact c : temp){
				c.show();
			}
			System.out
			.println("Do you want remove this contact? (y/n)");
			checkRemove = checkContinue();
			if (checkRemove.equals("y")) {
				arrContact.removeAll(temp);
				System.out.println("Remove Contacts completed!");
				
			}
		}
		break;
		default:
			System.out.println("Choice is not valid!");
			break;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			String check = "y";
			ArrayList<Contact> arrContact = new ArrayList<>();
			arrContact.add(new Contact("An", "0909777888"));
			while (check.equals("y")) {
				showMenu();
				int choiceMenu = Integer.parseInt(input.readLine());

				switch (choiceMenu) {
				case 1: {
					System.out.println("+++++++++ Contacts detail +++++++++");
					if (!arrContact.isEmpty()) {
						for (Contact c : arrContact) {
							c.show();
						}
					} else {
						System.out.println("List Contacts is empty!");
					}
					System.out
							.println("++++++++++++++++++++++++++++++++++++++");
				}
					break;
				case 2: {
					System.out
							.println("+++++++++++ Add new Contacts ++++++++++++");
					System.out.print("Input name: ");
					String name = input.readLine();
					System.out.print("Input phone: ");
					String phone = input.readLine();
					arrContact.add(new Contact(name, phone));

					System.out.println("Add Contacts completed!");
					System.out.println("+++++++++++++++++++++++++++++++++++++");
				}
					break;
				case 3: {
					System.out
							.println("+++++++++ Search Contacts ++++++++++++++++");
					System.out.println("Press 1: Search name");
					System.out.println("Press 2: Search phone: ");
					int choice = Integer.parseInt(input.readLine());
					switch (choice) {
					case 1: {
						System.out.print("Input name to search: ");
						String name = input.readLine();
						int checkSearch = 0;
						for (Contact c : arrContact) {
							if (c.getName().equals(name)) {
								c.show();
								checkSearch = 1;
							}
						}
						if (checkSearch == 0) {
							System.out
									.println("Name is not exists in contact!");
						}
					}
						break;
					case 2: {
						System.out.print("Input phone to search: ");
						String phone = input.readLine();
						int checkSearch = 0;
						for (Contact c : arrContact) {
							if (c.getPhone().equals(phone)) {
								c.show();
								checkSearch = 1;
							}
						}
						if (checkSearch == 0) {
							System.out
									.println("Phone is not exists in contact!");
						}
					}
						break;

					default:
						System.out.println("Choice is not valid!");
						break;
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++");
				}
					break;
				case 4: {
					System.out.println("+++++++++++++ Remove Contacts +++++++++++");
					System.out.println("Press 1: Remove cause name");
					System.out.println("Press 2: Remove cause phone");
					int choice = Integer.parseInt(input.readLine());
					deleteContact(choice, arrContact);
				}
					break;
				case 5: {
					System.out.println("+++++++++++++ Update Contacts +++++++++++");
					System.out.print("Input name to update: ");
					String name = input.readLine();
					System.out.print("Input phone number update: ");
					String phone = input.readLine();
					for (Contact c : arrContact) {
						if (c.getName().equals(name)) {
							arrContact.set(arrContact.indexOf(c), new Contact(name, phone));
							
						}
					}
				}
					break;
				default:
					throw new ArithmeticException("Choice value is not valid!");
				}
				System.out.println("Do you want continue back to menu ? (y/n)");
				check = checkContinue();
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
