package samples
foo = "abc"
def nit = "NotInBinding"

if (true) {
    baz = "ghi"
    this.binding.variables.each {k, v -> println "$k = $v"}
}

