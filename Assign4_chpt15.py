#function to determin the discount begins with the provided category and membership status
def determine_discount(category, membership_status):

  #dictionary is created where the given values are a concatenated key with the discount being the value
  theDictionary = {
    "electronicspremium": 0.20,
    "electronicsbasic": 0.10,
    "clothingpremium": 0.15,
    "clothingbasic": 0.05
  }

  #the key is the made with the concatenation of the given category and membership status
  key = category + membership_status

  #the associated value is returned from the dictionary
  return theDictionary[key]

# Example usage
print(determine_discount("electronics", "premium"))

"""
For this code I change mainly the entire strategy to approach obtaining the discount value.
From the instructions, I started by creating a dictionary with the associated key and value pairs that were
in each of the varying if and else statements from the original code. I then use concatenation to 
create the key which is then used in the return statement to provide its associated value.
"""
