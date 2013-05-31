#Problem 8
#n is an array of 100 digit numbers, read from a file
def LargestProductInSeries(n):
	num = 0
	largest = 0
	for i in range(0, len(n)):
		item = n[i]
		for k in range(0,len(item)-5):
			testnum = item[k:k+5]
			num = int(testnum[0:1]) * int(testnum[1:2]) * int(testnum[2:3]) * int(testnum[3:4]) * int(testnum[4:5])
			if num > largest:
				largest = num
	return largest

f = open("p8.txt")
x = f.readlines()

print(LargestProductInSeries(x))
