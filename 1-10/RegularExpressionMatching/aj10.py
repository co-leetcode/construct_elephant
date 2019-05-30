import re
ret = re.match(".","p")
print(ret.group())
ret = re.match("p.s","too")
print(ret.group())
ret = re.match("p.s","two")
print(ret.group())
