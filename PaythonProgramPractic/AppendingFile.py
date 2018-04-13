#Appending to file
f= open("textFile.txt","a")
f.write("\nthis is appending text into file")
f.close()

#now open the file and sec it is appending or not

f= open("textFile.txt","r")
print f.read()
f.close()

#a+ 
#using a+ apend and read both are same time

f= open("textFile.txt","a+")
f.write("\ntthis is for append pluse")
f.seek(0,0)
print f.read()
f.close()

#WB+ or wb  means read and write same time 