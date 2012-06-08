package samples

assert 4 == 2 + 2
assert -4 == -2 + -2

def oldPlus = Integer.metaClass.getMetaMethod("plus", [Integer] as Class[])
Integer.metaClass.plus = { Integer n ->
    return oldPlus.invoke( Math.abs(delegate), Math.abs(n) )
}

assert 4 == 2 + 2
assert 4 == -2 + -2

