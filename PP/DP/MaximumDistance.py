 
 # This function has time complexity O(n^2)  
 
def maxmiumDis(input_list):
    max=0
    for i in input_list:
        max= max if max>((len(input_list)-1-(input_list[::-1].index(i)))-input_list.index(i))  else ((len(input_list)-1-(input_list[::-1].index(i)))-input_list.index(i))
    print(max)
    
# This function has time complexity O(n)  
def maximumDisUsingDic(input_list):
    maxi=0
    dict_new={}
    for i in range(0,len(input_list)):
        if input_list[i] in  dict_new.keys():
            maxi= max(maxi,i-dict_new[input_list[i]])
        else:
            dict_new[input_list[i]]=i
        
    print(maxi)
arr = list(map(int,"3,2,1,2,1,4,5,8,6,7,4,2".split(',')))
maximumDisUsingDic(arr)
 