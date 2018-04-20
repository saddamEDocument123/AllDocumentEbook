#ReModule (regular Expersion opration)
import re
dir(re)

#Search 
#search are taking two parameter 
#1st one is what are u searching for
#2nd what are u searching in(means string,int,float)
string = ("the night was cold and drak was no one there")
#store the value into m
m = re.search("night",string)
print(m)
#we used start and end function for getting the
#start and end index 
#and applied for the getting that particuler string 
#what ever we searched for value usign
start=m.start()
end=m.end()
print string[start:end]

#2nd example

string1 = "aaajfnafj a saddam ljjajja hosan"
m =re.search("saddam",string1)
#s1=m.start()
#s2=m.end()
#print string1[s1:s2]
print string1[m.start():m.end()]

