import numpy as np
import pandas as pd





studinfo={'students':['puneet','sumit','pankaj'], 'marks':[50,60,70]}

dtf1=pd.DataFrame(studinfo)

print(dtf1)

dtf1=pd.DataFrame(studinfo, index=['sem-1','sem-2','sem-3'])


print("--------------attributes-------------")

print("index=>", dtf1.index)
print("columns=>", dtf1.columns)
print("axes=>", dtf1.axes)
print("dtypes=>", dtf1.dtypes)
print("size=>", dtf1.size)
print("shape=>", dtf1.shape)
print("values=>", dtf1.values)
print("Transpose=>", dtf1.T)
print("Check for empty=>", dtf1.empty)


s2015={'q1':100, 'q2':200, 'q3':300, 'q4':400}
s2016={'q1':200, 'q2':500, 'q3':800, 'q4':150}
s2017={'q1':300, 'q2':600, 'q3':900, 'q4':430}
s2018={'q1':400, 'q2':700, 'quarter-3':450, 'q4':411}
sales={'yr-2015':s2015, 'yr-2016':s2016, 'yr-2017':s2017, 'yr-2018':s2018}

dtf1=pd.DataFrame(sales)
print(dtf1)

print("--------------length and count function-------------")
print("Number of rows=>")
print(len(dtf1))
print("count of non NA values for each column")
print(dtf1.count(0)) #by default it takes 0
print("count of non NA values for each row")
print(dtf1.count(1))



print("--------------select or access column-------------")
population=pd.Series([1000,2000,3000], ['del','bom','mad'])

income=pd.Series([500000,700000,900000], ['del','bom','mad'])

avgincome=income/population

mydic={'world-population': population, 'world-income': income, 'world-avg-income': avgincome}

dtf1=pd.DataFrame(mydic, columns=['world-avg-income','world-population','world-income'])

print(dtf1)

print("printing population column")
print(dtf1['world-population'])

print("printing population column and avg income column")
print(dtf1[ ['world-population', 'world-avg-income'] ])



print("--------------select or access rows-------------")

#syntax
'''
<dataframe>.loc[<start-row>:<end-row>, <start-col>:<end-col>]
'''

print("select one row")
print(dtf1.loc['del', :])

print("select multiple row - display all rows if specify mad")
print(dtf1.loc['del':'mad',:])


print("access selective columns")
print(dtf1.loc[: , 'world-population'  : 'world-income'])

print("access selective rows and columns")

print(dtf1.loc['del':'bom' , 'world-population'  : 'world-income'])

