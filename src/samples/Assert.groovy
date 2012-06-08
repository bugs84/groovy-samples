package samples

assert 2 + 6 == 8
assert 2 + 6 == 8, "This error message is written when assertion fail"
assert 2 + 6 == 9: "This error message is written when assertion fail"

try {
    assert 1 + 1 == 3, "MY OWN ERROR MESSAGE!"
} catch (AssertionError e) {
    println "Failed as expected. Message is '${e.message}'";
}

