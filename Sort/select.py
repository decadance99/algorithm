def selection_sort(data):
    for i in range(len(data)):
        min_pos = i
        for j in range(i + 1, len(data)):
            if data[min_pos] > data[j]:
                min_pos = j
        temp = data[i]
        data[i] = data[min_pos]
        data[min_pos] = temp
    return data