#STOCK PROGRAM HOW TO GET DATA
#
#import urllib
#print(urllib.urlopen('https://tlstest.paypal.com/').read())
import re
import urllib
url = 'https://www.google.com/finance?q='
#url = 'https://www.javatpoint.com/'
#stock = input("Enter your stock : ")
stock = "FB"
#url = url + stock
print(url)
data = urllib.urlopen(url).read()
data1= data.decode("utf-8")
print(data1)
m = re.search('meta itemprop="price"',data1)
start = m.start()
end=start+50
newString = data1[start:end]
m=re.search('content=',newString)
start=m.end()
newString1=newString["/",newString1]
start=0
end=m.end()-3
print("The value of" + stock.upper() + " is " + final)
