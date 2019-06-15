import pandas as pd
import numpy as np

#----------------modify data by index value------------------------
lst=[10,20,30,40]
objser = pd.Series(data=(2*lst))
print(objser)
objser[1]=200
print(objser)

#----------------modify data that fall in given slice------------------------
objser[2:5]=-90
print(objser)


#----------------change series's index information------------------------
#new index array must be matched with existing index array else "Value Error" will be thrown.
objser.index=['a','b','c','d','e','f','g', 'h']
print(objser)

#-----------------head and tail functions-----------------------
#by default head and tail func reterive 5 rows
print("----------------head function-----------------")
print(objser.head(2))
print("----------------tail function-----------------")
print(objser.tail(3))


#--------------vector operations--------------------
lst1=[1,2,3,4]
objvec = pd.Series(data=(lst1))
print("---display by adding 2")
print(objvec+2)
print("---display by multiply with 2")
print(objvec*2)
print("---create another panda's series object by manipulating each series's element with raise to power 2")
objpow = objvec**2
print(objpow)
print("---check is series's element greater than 3")
print(objvec > 3)


#--------------arithmetic operations on two series object------------
# both series object must have same index value else will display NAN
# it clubs index value of both objects, where index values are matched, the arithmetic operation is performed otherwise display NAN = change index value and see the result

mydata=[10,20,30]
myidx=["delhi","madras","goa"]
obj1 = pd.Series(data=mydata, index=myidx, dtype=np.int32)

mydata1=[11,21,31]
myidx1=["delhi","madras","goa"]
obj2 = pd.Series(data=mydata1, index=myidx1, dtype=np.int32)

print(obj1+obj2)
print(obj1*obj2)
print(obj1/obj2)



#--------------------------------calculate per-capita-income---------------------------------

pop=pd.Series(data=[10,20,30,40], index=['de','mad','mum','cal'])
print(pop)
income=pd.Series(data=[110,210,310,410], index=['de','mad','mum','cal'])
print(income)
per_capita=income/pop
print(per_capita)




