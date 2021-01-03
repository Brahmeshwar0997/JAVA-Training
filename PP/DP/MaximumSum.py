input_list = "3, 2, 7, 10,32 ,42,4,566,3,4"
input_list=input_list.split(",")
input_list=[int(i) for i in input_list]

a=0
b=0
for i in input_list:
    if b>a:
        temp=b
    else:
        temp=a
    a=b+i
    b=temp
if a>b:
    print(a)
else:
    print(b)