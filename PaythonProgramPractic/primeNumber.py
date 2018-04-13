print "prime number"
for i in range(2,30):
    counter = 0
    j=2
    while j<i:
       if(i%j == 0):
            counter=1
            j=j+1
       else:
            j=j+1
        
    if counter==0:
       # print(str(i))
       print(i)
    else:
        counter=0
