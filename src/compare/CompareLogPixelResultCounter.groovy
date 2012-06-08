//def dir = new File("u:/j.jezek/ImageComparator Test/DATA/AFP_BW300/")
//def dir = new File("u:/j.jezek/ImageComparator Test/XML_Out/basic_1/")
def dir = new File('d:/vs_ 8.0.0.8/pa/spool/slot1/sum4/')


//def file = new File("u:/j.jezek/ImageComparator Test/DATA/AFP_BW300/broom0_tolerance0.log")
dir.eachFileMatch(~/.*.log/) { file ->






    def rootNode = new XmlParser().parse(file)

    int differences = 0;
    def differencesNodes = rootNode.depthFirst().grep {it.name() == 'Differences'}
    differencesNodes.each {
        differences += it.text().toInteger()
    }
    int pixelsInTolerance = 0;
    def inToleranceNodes = rootNode.depthFirst().grep {it.name() == 'PixelsInTolerance'}
    inToleranceNodes.each {
        pixelsInTolerance += it.text().toInteger()
    }

    int pageCount = differencesNodes.size()

    println file
    println "pageCount = " + pageCount
    println "Differences = " + differences
    println "pixelsInTolerance = " + pixelsInTolerance
    println()

}

