#start of function to calculate total price of items
def calculate_total_price(quantity, price, discount, taxRate):
  
  #Calculate the initial price of items based on quantity and price
  initial_price = (quantity * price)
  #Calculate the discount price of items based on discount rate
  discount_price = (quantity * price * discount)
  #Calculate the tax rate price of items based on tax rate
  taxRate_price = ((quantity * price) - (quantity * price * discount)) * taxRate

  #Calculate the total price of items based on initial price, discount price and tax rate price
  total_price = initial_price - discount_price + taxRate_price
  return total_price


# Example usage
print(calculate_total_price(10, 5.0, 0.1, 0.08))


"""
For this code, I increase maintainability and readability by changing variable names, adding informative 
comments, and simplifing and breaking down the formula used in the function to calculate the total 
price of the products. The variable q was changed to say quantity to be more specific.
Instantiated 3 more variables that act as simplified parts to the formula for total price.
These 3 variables are then used to show the formula before the final value is returned.
"""
