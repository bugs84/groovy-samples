package samples



assert 'abcde'.find { it > 'b' } == 'c' //first one found
assert 'abcde'.findAll { it > 'b' } == ['c', 'd', 'e'] //all found
assert 'abcde'.findIndexOf { it > 'c' } == 3 //first one found

assert 'abcde'.every { it < 'g' } //true if every member fulfill condition
assert 'abcde'.any { it > 'c' } //true if at least one member fulfill condition
assert ['a', 'b', 'c'].grep {it >= 'b'} == ['b', 'c']
assert 'abc'.collect { it * 2 } == ['aa', 'bb', 'cc']


//OWN CLOSURE
def closureResult = methodWithClosure("Param, ") {
    it.append("Inside closure, ")
}
assert "Param, Before closure, Inside closure, After closure." == closureResult

private String methodWithClosure(String param, Closure<StringBuilder> closure) {
    def sb = new StringBuilder()
    sb.append(param)
    sb.append("Before closure, ")
    closure.call(sb)
    sb.append("After closure.")
    sb.toString()
}