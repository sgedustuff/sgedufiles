#create empty numpy array
#use empty function with 3 parameters
    # shape = specify dimennsions
    # order = C or F = default is C = optional paramater
    # dtype = default value is float = optional paramater

import numpy as np
arr1=np.empty([3,2]) # no order and dtype specified. 3,2 = three rows and 2 columns
arr2=np.empty([3,4], dtype=np.int8) #no order specified. 3,4 = three rows and 4 columns

print (arr1.dtype) #shows float because if it is not specified then it takes float by default.
print (arr2.dtype)


print (arr1)
print (arr2)

print (arr1[1][1])

print (arr1.shape)
print (arr2.shape)
