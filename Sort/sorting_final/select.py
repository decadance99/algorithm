def selection_sort(data):
    n = len(data)
    for i in range(n):#0~n-1까지
        print(i, "th")
        smallest = data[i]
        smallest_idx = i
        print("smallest is", smallest)
        for j in range(i, n): #i~n-1까지
            print(j)
            if smallest > data[j]:
                smallest = data[j]
                smallest_idx = j
                print("smallest changed to", data[j])
        if i != smallest_idx:
            data[i], data[smallest_idx] = data[smallest_idx], data[i]
            print("EXCHANGED ", data[i], " with ", data[smallest_idx])
        print(data)
    print("FINAL: ", data)
selection_sort([3,1,2])
