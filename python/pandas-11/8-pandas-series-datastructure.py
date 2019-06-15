import pandas as pd
import numpy as np

#----------------apply comparison operator inisde []------------------------
# it will return elements, where outcome is TRUE

objser = pd.Series(data=[10,9,8,20,5,88])
print("getting true and false outcome")
print(objser>10)
print("getting elements where condition is true")
print(objser[objser>10])

#-------------difference between numpy or ndarray and series object

#1) in case of ndarray, vectorized opertions are only performed, if shapes of two ndarrays are matched else throw an error. But with series objects, error is not thrown
#   it shows "NAN" corresponding to that index value

#2) in case of ndarray, index values are always starts from 0, but series objects can have different types of indexes like string, numbers, letters, labels etc.


#----------------reindex = want to have similar object but sequence of elements must be different------------------------

obj1 = pd.Series(data=[1,2,3], index=['a','b','c'])
print(obj1)
print("------have another object but with different sequence of elements--------------")
obj2 = obj1.reindex(['c','b','a'])
print(obj2)


#----------------drop the element at particular index value--------------

print("------dropping element at index value 'b'--------------")
obj1=obj1.drop('b')
print(obj1)


#---------wap to have series object that represents area of some states in km and find out the biggest and smallest 2 areas


print("----------------------------1st Approach.-----------------------------------")
objarea=pd.Series([890,675,123,456,765,666,888,121,222,111])
print("highest 2 areas")
print(objarea.sort_values().tail(2))
print("lowest 2 areas")
print(objarea.sort_values().head(2))


print("----------------------------2nd Approach.-----------------------------------")
objarea1=pd.Series([890,675,123,456,765,666,888,121,222,111])
print("highest 2 areas")
print(objarea1.sort_values(ascending=False).head(2)) #False must be written in title case
print("lowest 2 areas")
print(objarea1.sort_values(ascending=False).tail(2))


#-----------------------------output-------------------------
lst=[1,2,3]
print(lst*2) #have same sequence of element two times

ser=pd.Series(data=[1,2,3])
print(ser*2) #perform vectorized operation and multiply each element by 2.


#---------wap to have series object that represents area of some states in km and list those areas where area is greater than 500
objarea3=pd.Series([890,675,123,456,765,666,888,121,222,111])
print("printing those areas where area is greater than 500")
print(objarea3[objarea3>500])


#-----calculate sales month-wise----------------------
s1mth=pd.Series(data=[100,800,300], index=['mitem1', 'mitem2', 'mitem3'], name='1-month')

s2mth=pd.Series(data=[500,600,700], index=['mitem1', 'mitem2', 'mitem3'], name='2-month')

s3mth=pd.Series(data=[750,250,300], index=['mitem1', 'mitem2', 'mitem3'], name='3-month')



s_all_mths=s1mth+s2mth+s3mth
print("total sale of all 3 months product-wise=>")
print(s_all_mths)

print("item which was sold the maximum in 3 months")
print(s_all_mths.sort_values(ascending=False).head(1))



print("item which was sold maximum but month wise")
s_till_2_mth = s2mth.combine(s1mth,max)
print(s_till_2_mth)



s_till_3_mth = s_till_2_mth.combine(s3mth,max)
print(s_till_3_mth)


