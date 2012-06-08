package samples



assert 'abcde'.find { it > 'b' } == 'c' //first one found
assert 'abcde'.findAll { it > 'b' } == ['c', 'd', 'e'] //all found
assert 'abcde'.findIndexOf { it > 'c' } == 3 //first one found

assert 'abcde'.every { it < 'g' } //true if every member fulfill condition
assert 'abcde'.any { it > 'c' } //true if at least one member fulfill condition
assert ['a', 'b', 'c'].grep {it >= 'b'} == ['b', 'c']
assert 'abc'.collect { it * 2 } == ['aa', 'bb', 'cc']

