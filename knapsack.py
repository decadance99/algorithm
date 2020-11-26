def knapsack(W, wt, val, n): 
  K = [[0 for x in range(W + 1)] for x in range(n + 1)] 

  for i in range(n + 1): 
    for w in range(W + 1): 
      if i == 0 or w == 0:
        K[i][w] = 0
      elif wt[i-1] <= w: 
        K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]) 
      else: 
        K[i][w] = K[i-1][w] 
    return K[n][W] 
  
# inputs
prices = []
weights = []
max_weight = int(input("Input the maximum weight of the knapsack: "))
num_items = int(input("Input the number of items: "))
for i in range(items):
  x = int(input("Input the price of item: "))
  y = int(input("Input the weight of item: "))
  prices.append(x)
  weights.append(y)
print(knapsack(max_weight, weights, prices, num_items)
