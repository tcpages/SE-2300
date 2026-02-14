package lists;

//import statements for things used later
import java.util.Scanner; 
import java.util.ArrayList;

//Data type to be used to hold item values
class Item
{
	//Initialization of Item variables
	String name;
	int quantity;
	String expDate;
	
	//Instantiation of a new Item
	Item(String name, int quantity, String expDate)
	{
		this.name = name;
		this.quantity = quantity;
		this.expDate = expDate;
	}
	
	//toString for Item when print
	@Override
	public String toString()
	{
		return name + " - " + quantity + " - " + expDate;
	}
	
	//method to set the new quantity for action 7 and 8
	public void setQuantity(int newQuantity)
	{
		quantity = newQuantity;
	} 
	
	//method to set the new expiration date for action 9 and 10
	public void setExpDate(String newExpDate)
	{
		expDate = newExpDate;
	}
}




//Main program with program manipulations
public class fullList 
{

	public static void main(String[] args) 
	{
		//Create input line and initialized arrayList for both lists
		Scanner input = new Scanner(System.in);
		ArrayList<Item> toGetList = new ArrayList<Item>();
		ArrayList<Item> atHomeList = new ArrayList<Item>();
		
		//Welcome to cue start of program with instructions for user
		System.out.println("-------Welcome to Full List!--------");
		
		System.out.println("To make changes and use your list, enter the number based on what you would like to do");
		
		
		//start of loop of actions
		while(true)
		{
			try 
			{
				//to space out the CLI output
				System.out.println("");
				
				//List of options for the user
				System.out.println("1 - View list of items at home");
				System.out.println("2 - View grocery list");
				System.out.println("3 - Add item to the at home list");
				System.out.println("4 - Add item to grocery list");
				System.out.println("5 - Delete item from the at home list");
				System.out.println("6 - Delete item from grocery list");
				System.out.println("7 - Edit quantity of an item at home");
				System.out.println("8 - Edit quantity of an item on grocery list");
				System.out.println("9 - Edit expiration date of an item at home");
				System.out.println("10 - Edit expiration date of an item on grocery list");
				System.out.println("0 - Quit");
				
				//Ask user for what action to perform and store in choice variable
				System.out.println("Enter your choice: ");
				int choice = input.nextInt();
				
				
				//methods that are called on based off of users choice
				if(choice == 0)
				{
					break;
				}
				else if(choice == 1)
				{
					
					if(atHomeList.isEmpty())
					{
						System.out.println("Nothing in list to print!");
					}
					else
					{
						int listNumber = 1;
						for(int i = 0; i < atHomeList.size(); i++)
						{
							System.out.println(listNumber + ": " + " " + atHomeList.get(i));
							listNumber++;
						}
					}
					
					//to space out the CLI output
					System.out.println("");
				}
				else if(choice == 2)
				{
					if(toGetList.isEmpty())
					{
						System.out.println("Nothing in list to print!");
					}
					else
					{
						int listNumber = 1;
						for(int i = 0; i < toGetList.size(); i++)
						{
							System.out.println(listNumber + ": " + " " +toGetList.get(i));
							listNumber++;
						}
					}
					
					//to space out the CLI output
					System.out.println("");
				}
				else if(choice == 3)
				{
					//clear the input space
					input.nextLine();
					
					//get the new items name
					System.out.println("Enter the name of the item: ");
					String itemName = input.nextLine();
					
					//get the new items quantity
					System.out.println("Enter the quantity of the item: ");
					int itemQuantity = input.nextInt();
					if (itemQuantity <= 0)
					{
						System.out.println("Invalid quantity value, please try again");
						continue;
					}
					
					//clear the input space
					input.nextLine();
					
					//get the new items expiration date
					System.out.println("Enter the expiration date of the item: ");
					String itemExpDate = input.nextLine();
					
					//create the new item type
					Item newItem = new Item(itemName, itemQuantity, itemExpDate);
					
					//add the new item to the at home list
					atHomeList.add(newItem);
					
				}
				else if(choice == 4)
				{
					//clear the input space
					input.nextLine();
					
					//get the new items name
					System.out.println("Enter the name of the item: ");
					String itemName = input.nextLine();
					
					//get the new items quantity
					System.out.println("Enter the quantity of the item: ");
					int itemQuantity = input.nextInt();
					if (itemQuantity <= 0)
					{
						System.out.println("Invalid quantity value, please try again");
						continue;
					}
					
					//clear the input space
					input.nextLine();
					
					//get the new items expiration date
					System.out.println("Enter the expiration date of the item: ");
					String itemExpDate = input.nextLine();
					
					//create the new item type
					Item newItem = new Item(itemName, itemQuantity, itemExpDate);
					
					//add the new item to the grocery list
					toGetList.add(newItem);
				}
				else if(choice == 5)
				{
					//checks if list is empty so deletion is not on empty list
					if(atHomeList.isEmpty())
					{
						System.out.println("Sorry no items to delete from this list");
					}
					else
					{
						//Has the user enter the index of item to delete
						System.out.println("Enter the number on the list the item is: ");
						int index = input.nextInt();
						
						//clear the input space
						input.nextLine();
						
						//checks if index is valid and removes the item or lets user know
						if(((index > 0) && (index < atHomeList.size())) || index == 1)
						{
							if(atHomeList.remove(index - 1) != null)
							{
								System.out.println("Item removed!");
							}
						}
						else
						{
							System.out.println("Sorry this item is not in the list or it is an invalid number");
						}
					}
				}
				else if(choice == 6)
				{
					//checks if list is empty so deletion is not on empty list
					if(toGetList.isEmpty())
					{
						System.out.println("Sorry no items to delete from this list");
					}
					else
					{
						//Has the user enter the index of item to delete
						System.out.println("Enter the number on the list the item is: ");
						int index = input.nextInt();
						
						//clear the input space
						input.nextLine();
						
						//checks if index is valid and removes the item or lets user know
						if(((index > 0) && (index < toGetList.size())) || index == 1)
						{
							if(toGetList.remove(index - 1) != null)
							{
								System.out.println("Item removed!");
							}
						}
						else
						{
							System.out.println("Sorry this item is not in the list or it is an invalid number");
						}
					}
				}
				else if(choice == 7)
				{
					//check if there are any items to edit
					if(atHomeList.isEmpty())
					{
						System.out.println("Sorry no items to edit the quantity");
					}
					else
					{
						//Has the user enter the index of item to edit
						System.out.println("Enter the number on the list the item is: ");
						int index = input.nextInt();
						
						
						//clear the input space
						input.nextLine();
						
						//check if index is valid
						if(((index > 0) && (index < atHomeList.size())) || index == 1)
						{
							
							//store the item that is to be edited
							Item toEdit = atHomeList.get(index - 1);
							
							//get the new quantity to be set
							System.out.println("Enter the new quantity you would like to set for this item: ");
							int newQuantity = input.nextInt();
							if (newQuantity <= 0)
							{
								System.out.println("Invalid quantity value, please try again");
								continue;
							}
							
							//clear the input space
							input.nextLine();
							
							//call on set method to change quantity
							toEdit.setQuantity(newQuantity);
						}
						else
						{
							System.out.println("Sorry this is an invalid number");
						}
					}
				}
				else if(choice == 8)
				{
					//check if there are any items to edit
					if(toGetList.isEmpty())
					{
						System.out.println("Sorry no items to edit the quantity");
					}
					else
					{
						//Has the user enter the index of item to edit
						System.out.println("Enter the number on the list the item is: ");
						int index = input.nextInt();
						
						//clear the input space
						input.nextLine();
						
						//check if index is valid
						if(((index > 0) && (index < toGetList.size())) || index == 1)
						{
							
							//store the item that is to be edited
							Item toEdit = toGetList.get(index - 1);
							
							//get the new quantity to be set
							System.out.println("Enter the new quantity you would like to set for this item: ");
							int newQuantity = input.nextInt();
							if (newQuantity <= 0)
							{
								System.out.println("Invalid quantity value, please try again");
								continue;
							}
							
							//clear the input space
							input.nextLine();
							
							//call on set method to change quantity
							toEdit.setQuantity(newQuantity);
						}
						else
						{
							System.out.println("Sorry this is an invalid number");
						}
					}
				}
				else if(choice == 9)
				{
					//check if there are any items to edit
					if(atHomeList.isEmpty())
					{
						System.out.println("Sorry no items to edit the expiration date");
					}
					else
					{
						//Has the user enter the index of item to edit
						System.out.println("Enter the number on the list the item is: ");
						int index = input.nextInt();
						
						//clear the input space
						input.nextLine();
						
						//check if index is valid
						if(((index > 0) && (index < atHomeList.size())) || index == 1)
						{
							
							//store the item that is to be edited
							Item toEdit = atHomeList.get(index - 1);
							
							//get the new quantity to be set
							System.out.println("Enter the new expiration date you would like to set for this item: ");
							String newExpDate = input.nextLine();
							
							//call on set method to change expiration date
							toEdit.setExpDate(newExpDate);
						}
						else
						{
							System.out.println("Sorry this is an invalid number");
						}
					}
				}
				else if(choice == 10)
				{
					//check if there are any items to edit
					if(toGetList.isEmpty())
					{
						System.out.println("Sorry no items to edit the expiration date");
					}
					else
					{
						//Has the user enter the index of item to edit
						System.out.println("Enter the number on the list the item is: ");
						int index = input.nextInt();
						
						//clear the input space
						input.nextLine();
						
						//check if index is valid
						if(((index > 0) && (index < toGetList.size())) || index == 1)
						{
							
							//store the item that is to be edited
							Item toEdit = toGetList.get(index - 1);
							
							//get the new quantity to be set
							System.out.println("Enter the new expiration date you would like to set for this item: ");
							String newExpDate = input.nextLine();
							
							//call on set method to change expiration date
							toEdit.setExpDate(newExpDate);
						}
						else
						{
							System.out.println("Sorry this is an invalid number");
						}
					}
				}
				else
				{
					System.out.println("Not a valid choice, please try again");
					continue;
				}
			}
			catch(Exception error)
			{
				System.out.println("Please enter valid input values");
				input.nextLine();
				continue;
			}
		}
		
		
		
		
		//signal end of program and close input
		System.out.println("-------Thanks for using FullList!--------");
		input.close();

	}

}
