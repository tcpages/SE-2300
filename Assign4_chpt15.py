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
