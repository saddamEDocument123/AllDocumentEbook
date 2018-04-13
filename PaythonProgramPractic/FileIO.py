#File I/O 
#creating file
#Reading file
#open function
# 


#open function taken two parameter
file1 = open("textFile.txt","r")  
#this is for read for file
print file1.read()
#it is showing only space or 
#cursor now is last thets why its showin 
# space
#if onece we read the file then if we want to again read that file
#that time u have to reset the coursour postition 
print file1.read()

#where are i am tell me
print file1.tell()

#now u have to set the position of cursar
file1.seek(0,0) #reset the ocursour position

print file1.read()

file1.seek(0,0) 
#read some of character
print file1.read(5)