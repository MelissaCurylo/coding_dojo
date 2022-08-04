""""
Annotated by Melissa Curylo with predictions of code block output
"""


#1 
# My prediction = will print the number 5 because the function has a defined value being passed within the function and being called in print statment.
# def number_of_food_groups():
#     return 5
# print(number_of_food_groups())


#2
# My prediction = error message as the first function number_of_days_in_a_week_silicon_or_triangle_sides()  being called in print statement is not defined.
# def number_of_military_branches():
#     return 5
# print(number_of_days_in_a_week_silicon_or_triangle_sides() + number_of_military_branches())


#3
# My prediction = first return will print,the second return 10 will not print. Function has only one argument is being called to print.
# def number_of_books_on_hold():
#     return 5
#     return 10
# print(number_of_books_on_hold())


#4
# My prediction = return 5 will print,the print( 10 ) will not print. Function has only one argument is being called to print.Also, code is processed in order so won't skip unless it's explicitly told to skip a return. 
# def number_of_fingers():
#     return 5
#     print(10)
# print(number_of_fingers())


#5
# My prediciton = print( 5 ) will print and the renmaing x with function will print( x ) as 5. 
# Got second prediction incorrect --> print(x) will have output of "None"
# def number_of_great_lakes():
#     print(5)
# x = number_of_great_lakes()
# print(x)


#6
# My prediciton = the function will print b+c but will not concatenate the numbers as requested in final print and an error will populate.
# def add(b,c):
#     print(b+c)
# print(add(1,2) + add(2,3))


#7
# My prediciton = function is asking to return values as string. Print statement has requested ints to be casted as strings then concatenate. Output will be 25. 
def concatenate(b,c):
    return str(b)+str(c)
print(concatenate(2,5))


#8
# My prediction = output = 100 because function defines b = 100 then calls to print; Next output will be else return = 10 because b is not less than 10.
def number_of_oceans_or_fingers_or_continents():
    b = 100
    print(b)
    if b < 10:
        return 5
    else:
        return 10
    return 7
print(number_of_oceans_or_fingers_or_continents())


#9
# My predictions = first print = 7, second print = 14, third print = 7147
# last prediciton incorrect as I thought this was just concatenating but it is in fact adding the integer values. 
def number_of_days_in_a_week_silicon_or_triangle_sides(b,c):
    if b<c:
        return 7
    else:
        return 14
    return 3
print(number_of_days_in_a_week_silicon_or_triangle_sides(2,3))
print(number_of_days_in_a_week_silicon_or_triangle_sides(5,3))
print(number_of_days_in_a_week_silicon_or_triangle_sides(2,3) + number_of_days_in_a_week_silicon_or_triangle_sides(5,3))


#10
# My prediction = output will be 8.
def addition(b,c):
    return b+c
    return 10
print(addition(3,5))


#11
# My prediction = first output = 500; second output = 300; third output = 500; fourth output = 300 (foobar value); fifth output = 500.
# My second output prediction was incorrect as the function was not yet called so it would not yet print.
b = 500
print(b)
def foobar():
    b = 300
    print(b)
print(b)
foobar()
print(b)


#12
# My prediction = first output = 500; Second output = 500; Third output = 300; Fourth output = 500.
b = 500
print(b)
def foobar():
    b = 300
    print(b)
    return b
print(b)
foobar()
print(b)


#13
# My prediction = First output = 500; Second output = 500; Third output = 300; Fourth output = 300.
b = 500
print(b)
def foobar():
    b = 300
    print(b)
    return b
print(b)
b=foobar()
print(b)


#14
# My predictions = First output = 1; Second output = 3; Third output = 2.
# def foo():
#     print(1)
#     bar()
#     print(2)
# def bar():
#     print(3)
# foo()


#15
# My prediction = Firt ouput = 1; Second output = 3; Third output = 3.
# Confused bout return statements after prints. I believe these store the value for the variable and upon next print resolve output to new updated value. 
def foo():
    print(1)
    x = bar()
    print(x)
    return 10   #not sure what happens with this 10
def bar():
    print(3)
    return 5   #not sure what happens with this 5
y = foo()
print(y)