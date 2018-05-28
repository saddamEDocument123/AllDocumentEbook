# Adding label in graph
# title , alert for x , y
import  matplotlib
import  matplotlib.pyplot as pt

x=[]
y=[]
# read the file
readFile = open("Coordinates.txt","r")
data=readFile.read().split("\n")
print(data)
for i in data:
    val = i.split(",")
    x.append(int(val[0]))
    y.append(int(val[1]))
print(x)
print(y)

pt.plot(x,y)
pt.title("Rain in December")
pt.xlabel("Days in December")
pt.ylabel("Inches of Rain")
pt.show()
#pt.plot([1,2,3,4],[3,8,19,29])
#pt.title("Rain in December")
#pt.xlabel("Days in December")
#pt.ylabel("Inches of Rain")
#pt.show( )

# Creating a grap  h from data in a file