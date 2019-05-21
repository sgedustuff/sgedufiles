import numpy as np
arr0=np.empty([3,2])
arr1=np.zeros([3,2])
arr2=np.ones([3,2])



arr3=np.ones_like(arr1)
arr4=np.zeros_like(arr2)
arr5=np.empty_like(arr1)

print ("arr0 with random values")
print(arr0)
print ("arr1 with zero values")
print(arr1)
print ("arr2 with one values")
print(arr2)
print ("arr3 with one values = assigning from arr1, holds values 0")
print(arr3)
print ("arr4 with zero values  = assigning from arr2, holds values 1")
print(arr4)
print ("arr5 with random values  = assigning from arr1, holds values 0")
print(arr5)
