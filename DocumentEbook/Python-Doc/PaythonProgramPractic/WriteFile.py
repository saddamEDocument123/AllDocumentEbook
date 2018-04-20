#write the file

#write the file usigng w commnd
# w menas completly rewrite the text
f=open("textFile.txt","w") 
#now enter some text using write function
f.write("I have entered some text into this file ")
#then u have to close the file
f.close()
#then u have to open this file in read only mode
f=open("textFile1.txt","r") 
print f.read()