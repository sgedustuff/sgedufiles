import sys;
import json;

print(sys.version)
print(sys.version_info)

"""mylist=[]

no=int(input("how many student information u want to enter=>"))

for i in range(no):        
	rno=int(input("enter the rno=>"))
	nm=input("enter the name=>");
	dict={'srno': rno, 'sname': nm}
	mylist.append(dict)
	
#search and modify
frno=int(input("enter rno and get the information=>"))
isexist=0
for i in range(len(mylist)):
	if mylist[i].get("srno")==frno:
		isexist=1
		break
if isexist==1:
	print(mylist[i])
	nm=input("enter the new name=>")
	mylist[i]["sname"]=nm
	print(mylist[i])
else:
	print("not matched")
	

#add marks column
for i in range(len(mylist)):
	if "marks" not in mylist[i]:
		mylist[i]["marks"]=(i+1)*100

print(json.dumps(mylist,indent=2))"""

mydict={"srno":1,"name":2, "marks":100}
mylist = list(mydict.values())
print(mylist.count(1))
if mylist.count(1) > 0:
        print (str(mylist.count(1)) + " keys have same values")
else:
        print("no keys have same value")

		
	
