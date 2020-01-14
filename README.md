# BucketSorting
it has 2 buckets.One is for zeros and another is for ones.So here we are sorting inary numbers in a string form.In order to sort the binary numbers at first we sort the numbers according to the right most digit.Then we sort the sorted list according to the second right most digit.In this way we keep on going until we sort the list according to the left most digit.
this is an example which is being solved in the code.
[ 0011 1001 1000 0111 0101 ]= given list.
[ 0011 1001 0111 0101 1000 ]=first sorted according to right most digit.
[ 0011 0111 1001 0101 1000 ]=then second right most digit
[ 0111 0101 0011 1001 1000 ]=then third right most digit
[ 1001 1000 0111 0101 0011 ]=finaly the left digit.we get it sorted in a descending order.
