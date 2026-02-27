#start of function to find gpa based on grade given
def grade_to_gpa(grade):

  #dictionary to represent the grades and their associated gpa
  grade_map = {
    "A": 4.0,
    "A-": 3.7,
    "B+": 3.3,
    "B": 3.0,
    "B-": 2.7,
    "C+": 2.3,
    "C": 2.0,
    "C-": 1.7,
    "D+": 1.3,
    "D" : 1.0,
    "D-": 0.7,
    "F" : 0.0
  }

  #printing the dictionary to show all the grades and then return the gpa associated with provided grade
  print(grade_map)
  return grade_map.get(grade, 0.0)

# Example usage
print (grade_to_gpa("B"))

"""
For this code I added some extra grades and their values to the dictionary. I then made sure to print the entire dictionary so
that it shows the placement on the grading scale and expands the range of grades that can be used to find the associated gpa.
Finally, I added some comments to make the code easy to read and explain what is going on.
"""
