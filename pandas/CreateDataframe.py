import pandas as pd

# Input 2D list
student_data = [
  [1, 15],
  [2, 11],
  [3, 11],
  [4, 20]
]

# Create DataFrame
df = pd.DataFrame(student_data, columns=['student_id', 'age'])

# Display DataFrame
print(df)
