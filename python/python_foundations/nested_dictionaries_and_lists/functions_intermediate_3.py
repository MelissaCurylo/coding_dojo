# 3 Get Values From a List of Dictionaries

# Create a function iterateDictionary2(key_name, some_list) that, given a list of dictionaries and a key name, the function prints the value stored in that key for each dictionary. 

# For example, iterateDictionary2('first_name', students) should output:
# Michael
# John
# Mark
# KB

#And iterateDictionary2('last_name', students) should output:
# Jordan
# Rosales
# Guillen
# Tonel


students = [
         {'first_name':  'Michael', 'last_name' : 'Jordan'},
         {'first_name' : 'John', 'last_name' : 'Rosales'},
         {'first_name' : 'Mark', 'last_name' : 'Guillen'},
         {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]


def iterateDictionary(key_name, some_list):
    for x in range(len(some_list)):
        print(some_list[x][key_name]) 

iterateDictionary('first_name', students), iterateDictionary('last_name', students)




""" Code test parts below """

    # if key_name == students['first_name']:
            # print(students[x]['last_name'])
# some_list = iterateDictionary('first_name')

# print(iterateDictionary(['first_name'], students))