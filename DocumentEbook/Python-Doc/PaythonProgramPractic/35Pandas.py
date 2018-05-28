# pandas is the open source python libary used for data analysis
# Series data Structure usign pandas
# it is the one dimentional object similar to array
# it's a sign label index u can call each object in any indexing it is similar to linkelist
# it is starting is 0

import  pandas as pd

# seies of name
# series content any type of data
s = pd.Series([10,"Namaste",23.5,"Hello"])
print(s)

# how to chage the index type like 1, 2, 3, to a, b, c

s = pd.Series([10,"Namaste",23.5,"Hello"],index=['a','b','c','d'])
print(s)


# how to add dictionary array
d = {"Seattle":100,"San Francisco":500,"San Jose":150}
s = pd.Series(d)
print(s)
# print(s["Seattle"])
#print(s[s>10000000])