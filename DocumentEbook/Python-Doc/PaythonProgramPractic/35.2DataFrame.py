# pandas is the open source python libary used for data analysis
# Series data Structure usign pandas
# it is the one dimentional object similar to array
# it's a sign label index u can call each object in any indexing it is similar to linkelist
# it is starting is 0

import  pandas as pd
import numpy as np
# how to add dictionary array
d = {"Seattle":100,"San Francisco":500,"San Jose":150,"London":1200,"Tokyo":1600}
s = pd.Series(d)
print(s)
# print(s["Seattle"])
#print(s[s>10000000])

# compairing function && boolean indexing
print(s<1000)

# How to update the dictionary value

s["San Francisco"] = 600
print(s)

# how to update all this cities value at one time
s[s<1000] = 750
print(s)

# How to check any value or any eleme nt of the list is there or not this is calld
# idiomatic python
print('Seattle' in s)

# we can used math operator into our series
print(s/10)

# We can do square fuction ... for that we have used numpy and square() function
print(np.square(s))

