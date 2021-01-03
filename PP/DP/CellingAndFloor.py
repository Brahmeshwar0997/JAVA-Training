input_list = "4,1,6,8,9"
input_list=input_list.split(",")
input_list=[int(i) for i in input_list]
num=7
cell=0
floor=0
for i in range(0,max(input_list)):
    if(num+i) in input_list and cell not in input_list:
        cell=num+i
    if (num-i) in input_list and floor not in input_list:
        floor=num-i
print(cell," ", floor)