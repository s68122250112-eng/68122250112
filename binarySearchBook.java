static int binarySearchBook(int[] bookIds, int target) {
    int low = 0;
    int high = bookIds.length - 1;

    while (low <= high) {
        int mid = (low + high) / 2;

        System.out.println("low=" + low +
                           " high=" + high +
                           " mid=" + mid);

        if (bookIds[mid] == target)
            return mid;
        else if (target < bookIds[mid])
            high = mid - 1;
        else
            low = mid + 1;
    }

    return -1;
}
