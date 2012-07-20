package samples

//Jde pouzit .with
new File("c:/").with {
    println getAbsolutePath() + " exist = " + exists()
    if (exists()) {
        list().each {println it}
    }
}
