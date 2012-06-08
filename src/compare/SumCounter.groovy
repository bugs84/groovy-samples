package compare




//File dir = new File('d:/tmp5/ComapreRuza/test14/');
File dir = new File('d:/vs_ 8.0.0.8/pa/spool/slot1/sum4/');

def okSum = 0
def notKnownSum = 0
dir.listFiles().each { sumFile ->
    def sum = new XmlParser().parse(sumFile)
    def pages = sum.Pages[0]
    def statusNotKnown = pages.depthFirst().findAll {it.text() == 'NotKnown'}
    def statusOk = pages.depthFirst().findAll {it.text() == 'Ok'}
    okSum += statusOk.size()
    notKnownSum += statusNotKnown.size()

    println sumFile.name
    println 'statusOk=' + statusOk.size()
    println 'statusNotKnown=' + statusNotKnown.size()
    println ""
}

println 'Pages sum = ' + (okSum + notKnownSum)
println 'OK sum = ' + okSum
println 'NotKnown sum = ' + notKnownSum