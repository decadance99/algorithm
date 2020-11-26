# Given x number of squares, calculate the total area. Squares may be overlapping.

total_area = 0
# 2D array of 0's (100x100) (assume: edge coordinates under 100)
paper = [[0 for _ in range(101)] for _ in range(101)]

x = int(input("Input the number of squares: "))

for _ in range(x):
  # get upper left coordinate(x, y) and lower right coordinate(x, y) of each sqaure
  x1, y1, x2, y2 = map(int, input().split())
  
  # change the array from 0 to 1 where each square is located
  for i in range(x1, x2):
    for j in range(y1, y2):
      paper[i][j] = 1

for row in paper:
  total_area += sum(row)
    
print(total_area)
