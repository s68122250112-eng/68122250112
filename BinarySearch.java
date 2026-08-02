BinarySearch(bookIds, target)
    low = 0
    high = bookIds.length - 1

    while (low <= high)
        mid = (low + high) / 2

        if bookIds[mid] == target
            return mid
        else if target < bookIds[mid]
            high = mid - 1
        else
            low = mid + 1

    return -1
