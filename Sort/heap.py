def heap_sort(data):
    size = len(data)
    for ind in range(size, -1, -1):
        heapify(data, size, ind)
    
    for ind in range(size - 1, 0, -1):
        data[ind], data[0] = data[0], data[ind]
        heapify(data, ind, 0)

def heapify(data, size, ind):
    largest = ind
    left = 2 * ind + 1
    right = 2 * ind + 2

    if left < size and data[ind] < data[left]:
        largest = left

    if right < size and data[largest] < data[right]:
        largest = right
    
    if largest != ind:
        data[ind], data[largest] = data[largest], data[ind]
        heapify(data, size, largest)