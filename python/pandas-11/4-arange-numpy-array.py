import numpy as np

arr1=np.arange(11,20,2,np.int8)

#start=11 = optional = default is 0
#stop=20 = mandatory (run from start till stop - 1)
#step=2 = optional, by default step by 1
#datatype = optional, by default float

print("11 to 19")
print(arr1)

print("0 to 19")
arr2=np.arange(20)
print(arr2)


arr3=np.linspace(11,100,5) #generate 5 values that fall in the range of 11 to 20

print("11 to 100 = generate 5 numbers")
print(arr3)
