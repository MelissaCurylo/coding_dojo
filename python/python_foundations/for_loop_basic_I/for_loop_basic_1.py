# 1 Basic - Print all integers from 0 to 150.

for x in range(151):
    print(x)


# 2 Multiples of Five - Print all the multiples of 5 from 5 to 1,000

for num in range( 5, 1001 ):
    if num % 5 == 0:
        print( num )

# OR solution

for num in range( 5, 1001, 5 ):
        print( num )



# 3 Counting, the Dojo Way - Print integers 1 to 100. If divisible by 5, print "Coding" instead. If divisible by 10, print "Coding Dojo".

divisible_by_5 = "coding"
divisible_by_10 = "coding dojo"

for num in range( 1, 101 ):
    if num % 10 == 0:
        print( divisible_by_10.title() )    #adding .title method to practice Python methods
    elif num & 5 == 0:
        print( divisible_by_5.title() )     #adding .title method to practice Python methods
    else:
        print( num )


# 4 Whoa. That Sucker's Huge - Add odd integers from 0 to 500,000, and print the final sum.

total_odd_num = 0

for odd_num in range( 0, 500000 ):
    if odd_num % 2 != 0:
        total_odd_num += odd_num
        print( total_odd_num )

# OR solution

total_odd_num = 0

for odd_num in range( 500000 ):
    if odd_num % 2 != 0:
        total_odd_num += odd_num
print( total_odd_num )              #setting print without indentation adds total sum without printing all values to terminal.


# 5 Countdown by Fours - Print positive numbers starting at 2018, counting down by fours.

for even_num in range( 2018, -1, -4 ):
    if even_num % 2 == 0:
        print(even_num )

# OR solution

for even_num in range( 2018, -1, -4 ):
        print(even_num )                  #can get away with less code and same result -- cleaner this way



# 6 Flexible Counter - Set three variables: lowNum, highNum, mult. Starting at lowNum and going through highNum, print only the integers that are a multiple of mult. For example, if lowNum=2, highNum=9, and mult=3, the loop should print 3, 6, 9 (on successive lines)

low_num = 2
high_num = 9
mult_num = 3

for lucky_num in range( low_num, high_num + 1):
    if lucky_num % mult_num == 0:
            print(lucky_num)

        # my output is missing the 9 unless adding one to stop to allow for 9 output
        # possible way with lists