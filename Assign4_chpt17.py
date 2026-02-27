#start of function to find the factorial of the provided number
def findFactorial (num):

  #sum and multNum is instantiated to be used as the calculating factor in the loop
  sum = 1
  multNum = 1

  #while loop goes as many times as the provided number until it reaches 0
  while num > 0:
     #sum is multiplied by the multNum and then multNum is increased by 1
    sum = sum * multNum

    #num and multNum are increase or decreased to account for the loop
    num = num - 1
    multNum = multNum + 1

  #final factorial value is returned
  return sum

# Example usage
print(findFactorial(5))

"""
For this code I mainly changed the code so that it implements a loop rather than recursion. The first change I made 
was to change the function name to findFactorial to make it more descriptive of what it is doing. I then changed
the variable name of the provided function value to num to represent what it is. I decided to use a while loop
because it was easy to make sure it stopped looping at the right time. From here two main variables are used.
The sum variable holds the factorial value that is added to every time and then the multNum variables holds
the value that will be multiplied to sum. The last change I made was adding comments to each important 
section of code to make sure it is easy to understand and read.
"""
