def quick_sort(data):
    quick_sort_helper(data, 0, len(data) - 1)

def quick_sort_helper(data, first, last):
    if first < last:
        pivot_split = part(data, first, last)
        quick_sort_helper(data, first, pivot_split - 1)
        quick_sort_helper(data, pivot_split + 1, last)

def part(data, first, last):
    i = first - 1
    pivot = data[last]
    print(data)
    print("first =", first, " last =", last, " pivot =", pivot)

    for j in range(first, last):
        if data[j] <= pivot:
            i = i + 1
            data[i], data[j] = data[j], data[i]
    
    data[i + 1], data[last] = data[last], data[i + 1]
    print(data)
    return i + 1


quick_sort([4, 5, 1, 3, 2])