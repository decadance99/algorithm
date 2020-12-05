def insertion_sort(data):
    n = len(data)
    for i in range(1, n):
        val = data[i]
        j = i
        while j > 0 and data[j - 1] > val:
            data[j] = data[j - 1]
            j -= 1
        data[j] = val

def selection_sort(data):
    n = len(data)
    for i in range(n):
        smallest = data[i]
        smallest_idx = i
        for j in range(i, n):
            if smallest > data[j]:
                smallest = data[j]
                smallest_idx = j
        if i != smallest_idx:
            data[i], data[smallest_idx] = data[smallest_idx], data[i]

def bubble_sort(data):
    n = len(data)
    for i in range(n - 1, 0, -1):
        for j in range(0, i):
            if data[j] > data[j + 1]:
                data[j], data[j + 1] = data[j + 1], data[j]

def __heapify(data, n, i):
    while True:
        left, right = 2 * i + 1, 2 * i + 2
        if right >= n or data[left] > data[right]:
            child = left
        else:
            child = right
        if child >= n or data[i] > data[child]:
            return
        data[child], data[i] = data[i], data[child]
        i = child

def heap_sort(data):
    n = len(data)
    for i in range(n, -1, -1):
        __heapify(data, n, i)
    
    for i in range(n-1, 0, -1):
        data[i], data[0] = data[0], data[i]
        __heapify(data, i, 0)

def __merge(data, left, middle, right):
    a = data[left:middle +  1]
    b = data[middle + 1: right + 1]
    i = 0
    j = 0
    k = left
    while i < len(a) and j < len(b):
        if a[i] <= b[j]:
            data[k] = a[i]
            i += 1
        else:
            data[k] = b[j]
            j += 1
        k += 1
    while i < len(a):
        data[k] = a[i]
        i += 1
        k += 1
    while j < len(b):
        data[k] = b[j]
        j += 1
        k += 1
    print(data)
    print('merge\n')
        

def __merge_sort(data, left, right):
    if left >= right:
        return
    m = int((left + right) / 2)
    __merge_sort(data, left, m)
    __merge_sort(data, m + 1, right)
    __merge(data, left, m, right)


def merge_sort(data):
    __merge_sort(data, 0, len(data) - 1)

import random

def __partition(data, left, right):
    r = random.randint(left, right)
    data[left], data[r] = data[r], data[left]
    pivot = left
    store = left + 1
    for i in range(left + 1, right + 1):
        if data[i] < data[pivot]:
            data[i], data[store] = data[store], data[i]
            store += 1
    data[pivot], data[store - 1] = data[store - 1], data[pivot]
    return store - 1

def __quick_sort(data, left, right):
    if left >= right:
        return
    pivot = __partition(data, left, right)
    __quick_sort(data, left, pivot - 1)
    __quick_sort(data, pivot + 1, right)

def quick_sort(data):
    __quick_sort(data, 0, len(data) - 1)