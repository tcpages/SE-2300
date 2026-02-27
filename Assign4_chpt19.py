#start of division function
def divide(a, b):

  #starts the attempt to divide the two numbers provided
  try:
    result = a / b
  #catches any errors related to dividing by zero
  except ZeroDivisionError:
    return "Error: Division by zero"
  #catches any errors related to invalid numbers
  except ValueError:
    return "Error: Invalid number was used for division"
  #catches any errors related to invalid data types
  except TypeError:
    return "Error: Invalid data type was used for division"
  #if no exceptions are caught, the final division value is returned
  return result

# Example usage
print(divide (10, 0))
print(divide (10, "a"))

"""
For this code I added two extra error exception handlers as well as comments for readability and maintainability. 
The ValueError checks if invalid numbers were inputed. Similarly, the TypeError checks if invalid data types were inputed
and sends an error message to make sure the user know why the division function did not fully go through.
"""
