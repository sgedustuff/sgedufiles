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
print("---------------index=LIST-------------")
print(objser_list.index)
print("---------------value=LIST-------------")
print(objser_list.values)
print("---------------itemsize=data type size=LIST-------------")
print(objser_list.itemsize)
print("---------------data type=LIST-------------")
print(objser_list.dtype)
print("---------------shape = series's size is returned tuple format=LIST -------------")
print(objser_list.shape)
print("---------------size= number of elements=LIST-------------")
print(objser_list.size)
print("---------------space occupied(bytes)=LIST-------------")
print(objser_list.nbytes)



#--------------------test empty series's object----------------------
objser_emp = pd.Series()
print("test empty series object")
print(objser_emp.empty)


#-------------------presence of NaN----------------------------
objser_mdata = pd.Series([10,np.NaN,20,30,np.NaN,40,78,99])
print("presence of nan")
print("hasnans=>" , objser_mdata.hasnans)
print("count=>", objser_mdata.count()) #excluding Nan
print("length=>", len(objser_mdata)) #including Nan



#-------------------access series's element----------------------------
print("item at 1 index value", objser_mdata[1])
print("item at 2 index value", objser_mdata[2])


#-----------------slicing---------------------
# it works on position rather than index.
# position always starts from 0
# end position = position-1
print("show elements from 1 pos")
print(objser_mdata[1:])

print("show elements from 2 pos till 4 pos")
print(objser_mdata[2:4])

print("show elements of 0 but step by 2")
print(objser_mdata[0: :2])




