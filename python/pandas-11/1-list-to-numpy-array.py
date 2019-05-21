import numpy as np
mylist=[1,2,3,4]

#generate error, if list contains string items.
odarr=np.array(mylist)

#access array elements
print(odarr)
print(odarr[0])
print(odarr[1])
print(odarr[2])
print(odarr[3])

#access array elements through loop
for i in range(4):
    print("the value at ", i, " is=>", odarr[i])



#check the type of numpy array, dimensions, size of array, data type of array
print (type(odarr))
print (odarr.shape)




#4 elements in single row
#if 2D array of 2 rows and 3 columns, then it returns like (2,3)
print (odarr.itemsize)
print (odarr.dtype)




#unlike numpy, below things are not possible with list but possible by writing more lines of code
#mylist=mylist+2 #add 2 in each item of list.
#mylist[2:4]=100 #store 100 at 2nd till (4-1) index value.



#how above is possible with numpy array
odarr=odarr+2
print(odarr)
odarr[2:4]=100
print(odarr)



