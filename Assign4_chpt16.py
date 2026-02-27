#start of function to find the first negative number in the given list
def firstNeg(someList):

  #The start of the loop that assigns listNum with each value in the list
  for listNum in someList:
    #checks if the current listNum value is negative and returns it if it is
    if listNum < 0:
      return listNum
  #if there is no return in the for loop, then it states there are no negative numbers in the list
  return "No negative numbers were found"


# Example usage
print(firstNeg([3, 5, -2, 1]))

"""
For this code I made simple and small changes that helped the overall flow of the code and its readability.
The first thing I changed was the name of the for loop variable that holds each value from the given list to listNum
to be more descriptive. Next, I add many comments for each crucial step so someone who is unfamiliar with 
the purpose of the code can understand it. Then, I added a more descriptive ending return statement to show 
the case in which there are no negative numbers in the list.
"""
