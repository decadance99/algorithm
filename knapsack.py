def knapSack(W, wt, val, n): 
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
  
# 주어진 조건
val = [80000, 110000, 150000, 200000] #물건별 금액
wt = [5, 7, 9, 13] #물건별 무게
W = 26 #상자의 최대 용적
n = len(val) 
print(knapSack(W, wt, val, n))   