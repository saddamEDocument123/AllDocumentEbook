#Copy to File
#ufn = input("Enter Your File name: ")
#ufn=ufn+".txt"
file1= open("testFile.txt","r")
file2=open("copiedfile.txt","w")
#copy readable file to writeable file
file2.write(file1.read())
file1.close()
file2.close()
file2=open("copiedfile.txt","r")
print file2.read()
