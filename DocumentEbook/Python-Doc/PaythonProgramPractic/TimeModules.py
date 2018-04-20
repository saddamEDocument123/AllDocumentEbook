#Time Modules
#time.time function 

import time
print time.time()

def numbers(max):
    time1 = time.time()
    for i in range(0,max):
        print i
    time2 = time.time()
    print time2-time1
numbers(10)

#Ask time function
#usign this function we can create time


print time.asctime()

#create date
#year,month,date,hours,min,sec,day of the week,day of the year,
#day ligh saving tims
tup= (2015,12,16,8,45,12,1,0,0)
print time.asctime(tup)

#localtime function
#return the current date and time as an object
#
t=time.localtime()
year = t[0]
day=t[2]
month=t[1]
print day
print time.localtime()
print month

print(str(day) + "/" + str(month) + "/" + str(year))

#sleep funtion
#out will come to slow 
for i in range(0,5):
    print i
    time.sleep(1) #it given out will be taken some time