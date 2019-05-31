import pandas as pd
import numpy as np

#--------------create series's data by using mathematical expression----------------

ndarray = np.arange(5,15,3) #have values in the range of 5 to 15 but step by 3

print ("data is multiplies by 2")
objser_math = pd.Series(index=ndarray, data=ndarray*2)
print(objser_math)

print ("data is raised to power 2")
objser_math = pd.Series(index=ndarray, data=ndarray**2)
print(objser_math)

print("---------------index-------------")
print(objser_math.index)
print("---------------value-------------")
print(objser_math.values)
print("---------------itemsize=data type size-------------")
print(objser_math.itemsize)
print("---------------data type-------------")
print(objser_math.dtype)
print("---------------shape = series's size is returned tuple format -------------")
print(objser_math.shape)
print("---------------size= number of elements-------------")
print(objser_math.size)
print("---------------space occupied(bytes)-------------")
print(objser_math.nbytes)


#--------------get series's data from list (2 times)----------------
lst=[10,20,30,40]
print ("replicate list's data two times")
objser_list = pd.Series(data=(2*lst))
print(objser_list)
print("---------------index-------------")
print(objser_list.index)
print("---------------value-------------")
print(objser_list.values)
print("---------------itemsize=data type size-------------")
print(objser_list.itemsize)
print("---------------data type-------------")
print(objser_list.dtype)
print("---------------shape = series's size is returned tuple format -------------")
print(objser_list.shape)
print("---------------size= number of elements-------------")
print(objser_list.size)
print("---------------space occupied(bytes)-------------")
print(objser_list.nbytes)

