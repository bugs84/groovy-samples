package samples

import java.util.regex.Matcher

// http://groovy.codehaus.org/Operators

/*
Table of Operators
Operator Name   	Symbol 	Description
Spaceship          	<=> 	Useful in comparisons, returns -1 if left is smaller 0 if == to right or 1 if greater than the right
Regex find 	        =~   	Find with a regular expresion? See ﻿﻿﻿Regular Expressions
Regex match     	==~ 	Get a match via a regex? See ﻿Regular Expressions
Java Field Override .@  	Can be used to override generated properties to provide access to a field
Spread 	            *. 	    Used to invoke an action on all items of an aggregate object
Spread Java Field 	*.@ 	Amalgamation of the above two
Method Reference 	.&  	Get a reference to a method, can be useful for creating closures from methods
asType Operator 	as 	    Used for groovy casting, coercing one type to another.
Membership Operator 	    in 	Can be used as replacement for collection.contains()
Identity Operator 	is  	Identity check. Since == is overridden in Groovy with the meaning of equality we need some fallback to check for object identity.
Safe Navigation 	?. 	    returns nulls instead of throwing NullPointerExceptions
Elvis Operator  	?:   	Shorter ternary operator
 */

def colours = ['red', 'orange', 'red', 'yellow', 'green', 'blue', 'green', 'indigo', 'violet'] as TreeSet
colours  << "MyFavoriteColor" << "lightgray" //add to collection

//Define comparator !!!!!
byLength = [
        compare: { a, b -> a.size() <=> b.size() } // <==> compare operator
] as Comparator //Cast to comparator

println colours.sort(byLength)





// *. Spread Operator     *.@ Spread Java Field
class Person { String name }
class Twin {
  Person one, two
  def iterator() {
    return [one, two].iterator()
  }
}

def tw = new Twin(one: new Person(name:'Tom'),
                  two: new Person(name:'Tim'))
assert tw*.name == ['Tom', 'Tim']
assert tw*.@name == ['Tom', 'Tim']
// expanded equivalent of above:
assert tw.collect{ it.name } == ['Tom', 'Tim']

assert ['cat', 'elephant']*.size() == [3, 8]
assert ['cat', 'elephant'].collect {it.size()}  == [3, 8]


// ?. operator
class User { String name; Address address }
class Address { String street }
def user = new User()
assert null == user?.address?.street
user.address = new Address()
assert null == user?.address?.street
user.address.street = "UserStreet"
assert "UserStreet"== user?.address?.street



Matcher matcher = "cheesecheese" =~ /cheese/


def cheese = ("cheesecheese" =~ /cheese/).replaceFirst("nice")
assert cheese == "nicecheese"
int i = 0;