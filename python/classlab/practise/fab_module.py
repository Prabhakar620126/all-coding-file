def fab(n):
    list=[1,1]

    while(n>len(list)):
        list.append(list[-1]+list[-2])

    return list
