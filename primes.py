from math import *

#function to test if prime
def isPrime(n):
	num = int(floor(sqrt(n)))

	if n >= 2:
		for i in range(2,num+1):
			if n % i == 0:
				return 0

	else:
		return 0

	return 1

#some tests yo
'''
assert isPrime(2) == 1
assert isPrime(3) == 1
assert isPrime(4) == 0
assert isPrime(5) == 1
assert isPrime(7) == 1
'''

def getListOfPrimes(n, limit):
	return [1, 2, [1, 2, 3]]
