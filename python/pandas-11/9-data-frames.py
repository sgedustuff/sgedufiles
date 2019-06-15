import numpy as np
import pandas as pd


#--------------------create dataframe by using dic---------------------


studinfo={'students':['puneet','sumit','pankaj'], 'marks':[50,60,70]}

dtf1=pd.DataFrame(studinfo)

print(dtf1)

dtf1=pd.DataFrame(studinfo, index=['sem-1','sem-2','sem-3'])

print(dtf1)


#simple dic objects

s2015={'q1':100, 'q2':200, 'q3':300, 'q4':400}
s2016={'q1':200, 'q2':500, 'q3':800, 'q4':150}
s2017={'q1':300, 'q2':600, 'q3':900, 'q4':430}
s2018={'q1':400, 'q2':700, 'quarter-3':450, 'q4':411}

#nested dic object

sales={'yr-2015':s2015, 'yr-2016':s2016, 'yr-2017':s2017, 'yr-2018':s2018}

dtf1=pd.DataFrame(sales)

print(dtf1)


#--------------------create dataframe by using numpy array---------------------


myarr = np.array([ [100,200,300], [1,2,3] ], np.int32)

dtf1=pd.DataFrame(myarr)

dtf1=pd.DataFrame(myarr, index=["sales", "tds"], columns=[2015,2016,2017])

print(dtf1)


#--------------------create dataframe by using series objects---------------------


population=pd.Series([1000,2000,3000], ['del','bom','mad'])

income=pd.Series([500000,700000,900000], ['del','bom','mad'])

avgincome=income/population

mydic={'world-population': population, 'world-income': income, 'world-avg-income': avgincome}

dtf1=pd.DataFrame(mydic, columns=['world-avg-income','world-population','world-income'])

print(dtf1)


#--------------------create dataframe by using another dataframe---------------------


dtf2=pd.DataFrame(dtf1)

print(dtf2)













