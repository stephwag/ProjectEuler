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
	primes = []
	for i in range(n, limit + 1):
		if isPrime(i):
			primes.append(i)
	return primes


#Problem 3
def LargestPrimeFactor(n):
	num = int(floor(sqrt(n)))
	for p in xrange(num,2,-1):
		if isPrime(p):
			if n % p == 0:
				return p
	return 0
