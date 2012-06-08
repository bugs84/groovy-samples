package samples
//  http://groovy.codehaus.org/JN1525-Strings


println "String1"
println 'String2'

//Multiline
assert '''hello,
world''' == 'hello,\nworld' //triple-quotes for multi-line strings, adds '\n' regardless of host system
assert 'hello, \
world' == 'hello, world' //backslash joins lines within string
println """\
This is my text
On Two lines."""

def var = "VAR"
println "Content:'$var' length = ${var.size()}"

def i= 1, list= []
3.times{ list<< "${i++}" }
assert list.join(", ") == "1, 2, 3"

assert "abc"
assert "abcdefg".substring(2,5) == "cde"
assert "abcdefg"[2..4] == "cde"
assert "abcdefg"[2..-1] == "cdefg"
assert 'abcdefg'[ 1, 3..5 ] == "bdef"

assert 'a'.padLeft(3,'+').padRight(8,"*-") == "++a*-*-*"
assert 'c'.center(5,'+') == "++c++"

assert ('a'<<'b').toString() == "ab" //adding to StringBuffer / StringBuilder

int id = 0

