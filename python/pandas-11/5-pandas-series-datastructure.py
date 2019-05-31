import pandas as pd
import numpy as np



#pandas data structure
    # enchanced version of numpy data structure
    # stack, queue, series, dataframes are the pandas data structure
    # array's elements can be identified and accessed through labels rathen than index values    


#series
    # it is the panda's data structure
    # it is represented in the form of one-dimensional array
    # it has two components
        # one is known as data = array of actual data
        # other is the index value, where the data is exist = array of indexes or data labels
    # it takes data type based on value.
    # if series is empty than its data type is float.


#create empty series object

objser = pd.Series()
print("Series object=>", objser)

#create non-empty series object

    # series's data can be in the form of
        # sequence
        # ndarray = numpy.arange
        # python dic
        # scaler value = single value or same data against all index values

# python sequence

objser_seq_1 = pd.Series(range(5))
objser_seq_2 = pd.Series([6.7, 8, 9, 10.77, 88])


print("Series object(sequence-1)=>\n", objser_seq_1)
print("Series object(sequence-2=>\n", objser_seq_2)

# ndarray
ndarray = np.arange(5,15,3) #have values in the range of 5 to 15 but step by 3
print("---------------------")
print(ndarray)
print("---------------------")
objser_ndarray = pd.Series(ndarray)
print(objser_ndarray)

# python dic

objser_dic = pd.Series({"jan":31, "feb":28, "mar":31})
print("---------------------")
print(objser_dic) #sequence of displaying elements are not fixed


#scaler value
objser_scval_1 = pd.Series(10,index=range(1,10,2))
objser_scval_2 = pd.Series("nobody has won the game",index=["delhi","madras","pune"])
print("---------------------")
print(objser_scval_1)
print("---------------------")
print(objser_scval_2)




#-------------------------------------------------------------------Functionality-----------------------------------------------------------

#-------how to specify missing data-----------

objser_mdata = pd.Series([10,np.NaN,20,30,np.NaN,40]) #NaN = can write as nan or NAN = Not a number
print("---------------------")
print(objser_mdata)


#-------we hava data array and we have index array = club both of them to make series object-----------
mydata=["win 10 games","win 20 games", "win 30 games"]

myarridx=["delhi","madras","goa"]

#objser_data_array = pd.Series(data=mydata, index=myarridx) 
objser_data_array = pd.Series(mydata, myarridx) #can skip data and index keyword
print("---------------------")
print(objser_data_array)



#--------------using loop to define the index--------------------------

#make sure the number of data must equal to number of index, else it will throw an error ValueError
objser_di = pd.Series(range(10,50,10), index = [x for x in 'abcd'])
print(objser_di)


#-----------how to specify the data type--------------

mydata1=[10,20,30]
myarridx1=["delhi","madras","goa"]
objser_datatype = pd.Series(data=mydata1, index=myarridx1, dtype=np.int32)
print(objser_datatype)
