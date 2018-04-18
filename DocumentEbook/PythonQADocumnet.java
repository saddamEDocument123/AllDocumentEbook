



/*
Crawling The Web - Stocks 
 */ 
1. How to used Crawling 
=>
   import re
   import urllib.request
   //https://www.google.co.in/search?q=fb
   url = 'https://www.google.co.in/search?q='
   stock = Input('Enter your stock')
   url = url + stock //concatenation of string 
   print(url)
   data = urllib.request.urlopen(url).read()
   //decode the data
   data1 = data.decode("utf-8") //decoding the data and its convert bit and bytes
   print(data1)
   //now we used to search function 

   m = re.search("meta itemprop='price'",data1)
   print(m) //now we know where the data is
   start = m.start()
   end = start + 50
   newString = data1[start:end]
   print(newString)
   m=re.search('content="',newString)
   start = m.end()
   newString1 = newString[start:]
   m = re.search('/',newString1)
   start =0
   end = m.end()-3 
   final = newString1[0:end]
   print(final)



   /*
    Crawling The Web - Whether program
    */

    import re
    import urllib.request
/*
Crawlling the web - Defenation
 */

 import re
 improt urllib.request

 //http://www.dictionary.com/browse/stock?s=t

 /*
  Beautiful Soup:
32. Installing Pip, BS4 and Request
  */
 * u have to install beautifulsoup 
 * and request also install

32. what is the pip ?
  =>
    its allows us to install python packges and python 
    module.

33. how to install beautiful Soup
=>
    sudo pip3.6 install beautifulsoup4

34. How to instll request ?
=>
    sudo pip3.6 install request 

/*
Beautiful Soup : Prettify! 
 */


35.  what Prettify does ?
=>
    * pass any html code of errore so it will be resove the code like :

    from bs4 import BeautifulSoup
    soup = BeautifulSoup("<html><p>adddfaf<strong>Hello <a>hello</html>") //cannto close all tage

    * now u have called the Prettify then c - 

    soup = BeautifulSoup("<html><p>adddfaf<strong>Hello <a>hello</html>","html.parser")
    soup.prettify()
        '<html>\n <p>\n  adddfaf\n  <strong>\n   Hello\n   <a>\n    hello\n   </a>\n  </strong>\n </p>\n</html>'
    print(soup.prettify())
    <html>
    <p>
    adddfaf
    <strong>
    Hello
    <a>
        hello
    </a>
    </strong>
    </p>
    </html>